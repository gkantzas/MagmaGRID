B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.3
@EndOfDesignText@
' B4XTableDoubleClickEvents Class v2
' Προσθέτει double click event σε B4XTable
Sub Class_Globals
	Private fx As JFX
	Private mModule As Object
	Private mEventName As String
	Private mTable As B4XTable
	Private attachedHandlers As List
End Sub

' Initialize: Module, EventName prefix, B4XTable object
Public Sub Initialize(Module As Object, EventName As String, Table As B4XTable)
	mModule = Module
	mEventName = EventName
	mTable = Table
	attachedHandlers.Initialize
End Sub

' Επισύναψη double click handlers σε όλα τα cells του table
Public Sub AttachDoubleClickHandlers
	Try
		' Καθαρισμός προηγούμενων handlers
		ClearHandlers
		
		' Επισύναψη σε όλες τις στήλες
		For colIndex = 0 To mTable.VisibleColumns.Size - 1
			Dim column As B4XTableColumn = mTable.VisibleColumns.Get(colIndex)
			
			' Επισύναψη σε όλα τα cells της στήλης (εκτός από header - index 0)
			For cellIndex = 1 To column.CellsLayouts.Size - 1
				Dim cellPanel As B4XView = column.CellsLayouts.Get(cellIndex)
				
				' Βρίσκουμε το Label μέσα στο panel (συνήθως στο index 0)
				If cellPanel.NumberOfViews > 0 Then
					Dim cellLabel As B4XView = cellPanel.GetView(0)
					AttachHandlerToCell(cellLabel, column.Id, cellIndex)
				End If
				
				' Επίσης επισυνάπτουμε και στο panel για σιγουριά
				AttachHandlerToCell(cellPanel, column.Id, cellIndex)
			Next
		Next
		
		'Log("Double click handlers attached to " & attachedHandlers.Size & " cells")
	Catch
		Log("Error attaching double click handlers: " & LastException.Message)
	End Try
End Sub

' Επισύναψη handler σε συγκεκριμένο cell
Private Sub AttachHandlerToCell(cellView As B4XView, columnId As String, cellIndex As Int)
	Try
		Dim jo As JavaObject = cellView
		
		' Δημιουργία mouse event handler - χρησιμοποιούμε CreateEventFromUI για καλύτερη διαχείριση
		Dim MouseHandler As Object = jo.CreateEventFromUI("javafx.event.EventHandler", "CellMouseEvent", Null)
		
		' Αποθήκευση πληροφοριών για το cell
		Dim cellInfo As Map
		cellInfo.Initialize
		cellInfo.Put("ColumnId", columnId)
		cellInfo.Put("CellIndex", cellIndex)
		cellInfo.Put("Handler", MouseHandler)
		cellInfo.Put("View", cellView)
		attachedHandlers.Add(cellInfo)
		
		' Επισύναψη του handler
		Dim MouseEventType As JavaObject
		MouseEventType.InitializeStatic("javafx.scene.input.MouseEvent")
		jo.RunMethod("addEventFilter", Array(MouseEventType.GetField("MOUSE_CLICKED"), MouseHandler))
		
	Catch
		Log("Error attaching handler to cell: " & LastException.Message)
	End Try
End Sub

' Mouse event callback - ΔΙΟΡΘΩΜΕΝΗ ΕΚΔΟΣΗ
Private Sub CellMouseEvent_Event(MethodName As String, Args() As Object) As Object
	Try
		Dim mouseEvent As JavaObject = Args(0)
		Dim clickCount As Int = mouseEvent.RunMethod("getClickCount", Null)
		
		' Παίρνουμε το source από το mouseEvent
		Dim sourceJO As JavaObject = mouseEvent.RunMethod("getSource", Null)
		Dim sourceView As B4XView = sourceJO
		
		'Log($"Mouse event: ClickCount=${clickCount}, Source=${sourceView}"$)
		
		Dim cellInfo As Map = FindCellInfo(sourceView)
		If cellInfo.IsInitialized And cellInfo.Size > 0 Then
			Dim columnId As String = cellInfo.Get("ColumnId")
			Dim cellIndex As Int = cellInfo.Get("CellIndex")
			
			' Υπολογισμός του row ID από το cell index
			Dim rowId As Long = GetRowIdFromCellIndex(cellIndex)
			
			'Log($"Found cell: Column=${columnId}, CellIndex=${cellIndex}, RowId=${rowId}"$)
			
			If clickCount = 1 Then
				' Single click - προαιρετικό
'				If SubExists(mModule, mEventName & "_CellClicked") Then
'					Dim params As Map
'					params.Initialize
'					params.Put("ColumnId", columnId)
'					params.Put("RowId", rowId)
'					CallSub2(mModule, mEventName & "_CellClicked", params)
'				End If
			Else If clickCount = 2 Then
				' Double click - κύριο event
				'Log($"Double click detected! Column=${columnId}, Row=${rowId}"$)
				If SubExists(mModule, mEventName & "_CellDoubleClicked") Then
					Dim params As Map
					params.Initialize
					params.Put("ColumnId", columnId)
					params.Put("RowId", rowId)
					CallSub2(mModule, mEventName & "_CellDoubleClicked", params)
				End If
			End If
		Else
			'Log("Cell info not found for source view")
		End If
		
	Catch
		'Log("CellMouseEvent error: " & LastException.Message)
	End Try
	Return Null
End Sub

' Βρίσκει τις πληροφορίες του cell από το view
Private Sub FindCellInfo(targetView As B4XView) As Map
	Try
		For Each cellInfo As Map In attachedHandlers
			Dim cellView As B4XView = cellInfo.Get("View")
			If cellView.IsInitialized And targetView.IsInitialized Then
				' Σύγκριση με JavaObject για καλύτερη ακρίβεια
				Dim jo1 As JavaObject = cellView
				Dim jo2 As JavaObject = targetView
				If jo1 = jo2 Then
					Return cellInfo
				End If
			End If
		Next
	Catch
		Log("Error in FindCellInfo: " & LastException.Message)
	End Try
	
	Dim emptyMap As Map
	emptyMap.Initialize
	Return emptyMap
End Sub

' Υπολογισμός row ID από cell index
Private Sub GetRowIdFromCellIndex(cellIndex As Int) As Long
	Try
		' Το cell index αρχίζει από 1 (0 είναι το header)
		' Πρέπει να υπολογίσουμε το πραγματικό row ID
		If cellIndex > 0 And cellIndex <= mTable.VisibleRowIds.Size Then
			Return mTable.VisibleRowIds.Get(cellIndex - 1)
		End If
	Catch
		Log("Error calculating row ID: " & LastException.Message)
	End Try
	Return 0
End Sub

' Καθαρισμός όλων των handlers
Public Sub ClearHandlers
	If attachedHandlers.IsInitialized Then
		For Each cellInfo As Map In attachedHandlers
			Try
				Dim cellView As B4XView = cellInfo.Get("View")
				Dim handler As Object = cellInfo.Get("Handler")
				
				' Αφαίρεση του handler
				Dim jo As JavaObject = cellView
				Dim MouseEventType As JavaObject
				MouseEventType.InitializeStatic("javafx.scene.input.MouseEvent")
				jo.RunMethod("removeEventFilter", Array(MouseEventType.GetField("MOUSE_CLICKED"), handler))
			Catch
				Log("Error removing handler: " & LastException.Message)
			End Try
		Next
		attachedHandlers.Clear
	End If
End Sub

' Cleanup - καλείται όταν δεν χρειάζεται πια το object
Public Sub Cleanup
	ClearHandlers
End Sub
