B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.3
@EndOfDesignText@
'MagmaGrid v.0.0.1
'The next Generation B4XTable
'Features:
'Column Resizing, Hiding, Showing
'Easy Add Column at Creation
'Easy Inline Editing
'Easy Moving
'Easy Column Calculation and Sum of Rows
'Easy Extract Data to list
'Even if at runtime resize window - an b4xtable has other visible rows/cols - will work fine when moving at lines - fields

'#RaisesSynchronousEvents: guidelinepanel_mouseexited

Sub Class_Globals
	Private fx As JFX
	Private xui As XUI
	Public useB4XTable As B4XTable
	
	Type mycol(Name As String, Hidden As Boolean, Locked As Boolean, Sortable As Boolean, Width1 As Int, Controltype As String, Defaultvalue As String, UseList As List, MaxLength As Int, MinValue As Double, MaxValue As Double, Alignment As String, MinIntegers As Int, MinFractions As Int, MaxFractions As Int, Grouping As Boolean)


	Public MyList As List
	Public MyColumns As List
	Public HorizontalPraxisList As List
	Private Lists As List
	
	Private ie As InlineEditing
	Private thistable As B4XTableSelections
	
	Private TheIndexCol As Int = 0	'Where is the valuable ID ? - the UNIQUE key for record...
	Private ID As String

	Private DecimalSeparator As String = "."

	Private PrevColumn As mycol
	Public SelectedColumn As mycol
	Public SelectedRow As Long

	Private myroot As B4XView

	'controls
	Private MyTextField As TextField
	Private MyNumField As TextField
	Private MyComboField As ComboBox
	Private MyPrevComboIndex As Int = -1
	Private noEdit As Boolean = False
	
	Private xtra As B4XMagmaFuncs
	
	
	'Those need for resizing Guidelines-Columns
	Private guidelinePanel As B4XView           ' Temporary panel for guidelines
	Private isResizing As Boolean = False       ' Track resize state
	Private removableGuidelines As List         ' List of panels to be removed
	Private resizeTimer As Timer                ' Timer for resize refresh
	Private previousColumnWidths() As Int       ' Column widths before collapse/expand
	Public allowColumnResize As Boolean=True
	Private cumulativeDelta As Int
	Private startColumnWidth As Int
	Private currentColumn As B4XTableColumn
	Private currentPanel As B4XView
	'-----------------------
	

End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(parent As B4XView)
	
	' Greek dates support
	DateTime.DateFormat = "dd/MM/yyyy"
	

	parent.LoadLayout("magmagrid")

	xtra.Initialize
	MyList.Initialize
	MyColumns.Initialize
	HorizontalPraxisList.Initialize
	SelectedColumn.Initialize
	PrevColumn.Initialize
	Lists.Initialize
	
		
	ie.Initialize(useB4XTable, Me, "ie")
	thistable.Initialize(useB4XTable)
	thistable.Mode = thistable.MODE_SINGLE_LINE_PERMANENT
	thistable.SelectedTextColor = xui.Color_White
	thistable.SelectionColor = xui.Color_ARGB(255, 0, 148, 255)
	thistable.AutoRemoveInvisibleSelections = True
	
	myroot=parent.Parent
	MyTextField.Initialize("myTextField")
	MyNumField.Initialize("MyNumField")
	MyComboField.Initialize("MyComboField")
	myroot.AddView(MyTextField,0,0,100,10)
	myroot.AddView(MyNumField,0,0,100,10)
	myroot.AddView(MyComboField,0,0,100,10)
	MyComboField.RemoveNodeFromParent
	MyTextField.RemoveNodeFromParent
	MyNumField.RemoveNodeFromParent
	
	useB4XTable.RowHeight=50dip
	
	ie.TableResized
	
	AddKeyPressedListener

#if B4J AND DEBUG							'Erel's Fix
	Dim jo As JavaObject = Me
	jo.RunMethod("RemoveWarning", Null)
#end if

End Sub

public Sub GetValue(rowid As Long, columnid As String) As String
	Private MapValues As Map = useB4XTable.GetRow(rowid)
	For k=0 To MyColumns.Size-1
		Dim myc As mycol=MyColumns.Get(k)
		If myc.Name=columnid Then
			Dim value As String = MapValues.Getvalueat(k)
			Exit
		End If
	Next
	Return value
End Sub

public Sub SetValue(rowid As Long, columnid As String, newvalue As Object)

	Private MapValues As Map = useB4XTable.GetRow(rowid)
	
	Dim Query As StringBuilder
	Dim params As List
	params.Initialize
	Query.Initialize
	Query.Append ("UPDATE data SET ")
	For k=0 To MyColumns.Size-1
		Private myc As mycol = MyColumns.Get(k)
		If myc.Controltype.Contains("EDITCONTROLS") Then
			Else
			If columnid=myc.Name Then
				If myc.Controltype.Contains("NUMERIC") Then
					Dim newvalue1 As Double=newvalue
					params.Add(NumberFormat2(newvalue1,myc.MinIntegers,myc.MinFractions,myc.MaxFractions,myc.Grouping))
					Else
					params.Add(newvalue)
				End If
				Else
				params.Add(MapValues.GetValueAt(k))
			End If
			Dim c As B4XTableColumn = useB4XTable.GetColumn(myc.Name)
			Query.Append (c.SQLID.Trim & " = ?")
			If k<MyColumns.Size-1 Then
				Query.Append (",")
			End If
		End If
	Next
	Query.Append ("WHERE rowid = ?")
	params.Add(rowid)
	useB4XTable.sql1.ExecNonQuery2(Query, params)
	useB4XTable.Refresh
	
End Sub

public Sub SetData(mylist1 As List)
	
	wait for (useB4XTable.SetData(mylist1)) complete (unused As Boolean)
	MyList=mylist1
	CalcAll
	
	
#IF B4J
	Sleep(0)
	Dim previousColumnWidths(useB4XTable.Columns.Size) As Int
	removableGuidelines.Initialize
	For colIndex = 0 To useB4XTable.visibleColumns.Size - 1
		Dim tableCol As B4XTableColumn = useB4XTable.visibleColumns.Get(colIndex)
		previousColumnWidths(colIndex) = tableCol.Width
	Next
	If allowColumnResize = True Then
		resizeTimer.Initialize("ResizeTimer", 100)
		resizeTimer.Enabled = True
	End If
	If guidelinePanel.IsInitialized Then
		EnableResizeGuidelines
	End If
#END IF
	
End Sub

Public Sub CalcAll
	Dim prevsel As Long=SelectedRow
	For k=1 To MyList.Size
		SelectedRow=k
		RowCalcPraxis
	Next
	SelectedRow=prevsel
End Sub

public Sub AddHorizontalPraxis(apraxis As String)
	HorizontalPraxisList.Add(apraxis)
End Sub

public Sub RowCalcPraxis
	
	Private HeaderValues(MyColumns.Size) As String
	For k=0 To MyColumns.Size-1
		Private myc As mycol=MyColumns.Get(k)
		HeaderValues(k)= myc.Name
	Next
	
	For k=0 To HorizontalPraxisList.Size-1
		Private MapValues As Map = useB4XTable.GetRow(SelectedRow)
		Dim myinput As String=HorizontalPraxisList.Get(k)
		Dim parts() As String = Regex.Split("=", myinput)
		Dim tocolumn As String=parts(0).Replace("[","").Replace("]","")
		Dim apraxis As String=parts(1)
		For c=0 To HeaderValues.Length-1
			apraxis = apraxis.Replace("[" & HeaderValues(c) & "]",MapValues.GetValueAt(c))
		Next
		Dim eeval As B4XEval
		eeval.Initialize(Me, "Eval")
		Dim DDtotal As Double=eeval.Eval(apraxis)
		SetValue(SelectedRow, tocolumn, DDtotal)
	Next
	
End Sub

'---
Public Sub AddColumn(Name As String, Hidden As Boolean, Locked As Boolean, Sortable As Boolean, _
 Width1 As Int, Controltype As String, Defaultvalue As String, UseList As List, MaxLength As Int, _
 MinValue As Double, MaxValue As Double, Alignment As String, _
 MinIntegers As Int, MinFractions As Int, MaxFractions As Int, Grouping As Boolean)
'---	
	Dim MyColumn As mycol
	MyColumn.Initialize
	MyColumn.Name=Name
	MyColumn.Hidden=Hidden
	MyColumn.Locked=Locked
	MyColumn.Sortable=Sortable
	MyColumn.Width1=Width1
	MyColumn.Controltype=Controltype
	MyColumn.Defaultvalue=Defaultvalue
	MyColumn.UseList=UseList
	If Controltype.Trim.ToUpperCase.Contains("NUMERIC") And MaxLength=0 Then
		MaxLength=15
		MyColumn.MaxLength=MaxLength
	End If
	MyColumn.MaxLength=MaxLength
	
	MyColumn.MinValue=MinValue
	MyColumn.MaxValue=MaxValue

	If MinIntegers=0 And MinFractions=0 And MaxFractions=0 Then
		MinIntegers=1
		MinFractions=0
		MaxFractions=5
	End If
	MyColumn.MinIntegers=MinIntegers
	MyColumn.MinFractions=MinFractions
	MyColumn.MaxFractions=MaxFractions

	MyColumn.Grouping=Grouping
	

	Dim myb4xformat As B4XFormatter
	myb4xformat.Initialize
	If Grouping=False Then 
		myb4xformat.GetDefaultFormat.GroupingCharacter=""
		Else
		If DecimalSeparator="." Then 
			myb4xformat.GetDefaultFormat.GroupingCharacter=","
			Else
			myb4xformat.GetDefaultFormat.GroupingCharacter="."
		End If
	End If
	myb4xformat.GetDefaultFormat.MinimumIntegers=MinIntegers
	myb4xformat.GetDefaultFormat.minimumFractions=MinFractions
	myb4xformat.GetDefaultFormat.MaximumFractions=MaxFractions

	
	MyColumn.Alignment=Alignment
	
	MyColumns.Add(MyColumn)
	
	Select Case Controltype
		Case "TEXTFIELD","TEXTAREA", "COMBO", "COMBO", "COMBOEDIT", "COMBOFIELD","COMBOEDITFIELD", "PICTURE", "CHECKBOX", "CHECK"  ', "BLOB"
			useB4XTable.AddColumn(Name,useB4XTable.COLUMN_TYPE_TEXT)
		
		Case "TEXTFIELD_NUMERIC"
			useB4XTable.AddColumn(Name,useB4XTable.COLUMN_TYPE_NUMBERS)
			
		Case "DATE"
			useB4XTable.AddColumn(Name,useB4XTable.COLUMN_TYPE_DATE)

		Case "EDITCONTROLS"
			useB4XTable.AddColumn(Name,useB4XTable.COLUMN_TYPE_VOID)

		End Select
	
		
		Dim thisColumn As B4XTableColumn=useB4XTable.GetColumn(Name)
		thisColumn.Sortable=Sortable
		
		
		If Controltype.Contains("NUMERIC") Then thisColumn.Formatter=myb4xformat
		If Hidden=False Then 
			thisColumn.Width=Width1
			Else
			thisColumn.Width=1
		End If
		
		
	If Alignment.trim="" Then
		Select Case Controltype
			Case "TEXTFIELD","TEXTAREA", "COMBO", "COMBO", "COMBOEDIT", "COMBOFIELD","COMBOEDITFIELD", "PICTURE", "CHECKBOX", "CHECK"', "PICTURE", "BLOB"
			
				If Controltype="TEXTFIELD_NUMERIC" Then
					SetColumnAlignment(useB4XTable,Name,"LEFT")
				Else
					SetColumnAlignment(useB4XTable,Name,"RIGHT")
				End If
				
			Case "EDITCONTROLS"
				SetColumnAlignment(useB4XTable,Name,"CENTER")

			Case "DATE"
				SetColumnAlignment(useB4XTable,Name,"CENTER")
		End Select
	Else
		SetColumnAlignment(useB4XTable,Name,Alignment)
	End If
	
	' Ensure UseList is non-null and initialized
	If UseList = Null Or UseList.IsInitialized = False Then
		Dim tmp As List
		tmp.Initialize
		UseList = tmp
	End If
	Lists.add(UseList)

		
End Sub

Private Sub NextEditableColumn
	
	useB4XTable.clvData.sv.RequestFocus
	useB4XTable.UpdateTableCounters
	
	For k=TheIndexCol+1 To MyColumns.Size-1
		Dim myc As mycol=MyColumns.Get(k)
		If myc.Locked=False And myc.Hidden=False And Not (myc.Controltype="CHECKBOX" Or  myc.Controltype="CHECK") Then 
			useB4XTable_CellClicked(myc.Name,SelectedRow)

			Return
		End If
	Next

		If SelectedRow < MyList.Size Then
			
			SelectedRow=SelectedRow+1
			Sleep(0)
			wait for (GoAtRowAndClick(SelectedRow)) complete (unused As Boolean)
			
			Else
				
			SelectedRow=1
			Sleep(0)
			wait for (GoAtRowAndClick(SelectedRow)) complete (unused As Boolean)
			
		End If

End Sub

Private Sub GoAtRowAndClick(rowindex As Long) As ResumableSub
	
	If rowindex > 0 Then
		ie.ExitEditMode
		'Dim howpages As Int = Ceil(useB4XTable.mCurrentCount / useB4XTable.VisibleRowIds.Size)
		Dim pageNum As Int = Ceil(rowindex  / useB4XTable.VisibleRowIds.Size) '+ 1
		useB4XTable.CurrentPage = pageNum
		Sleep(0)
		useB4XTable.UpdateTableCounters
		useB4XTable.clvData.sv.RequestFocus
		Sleep(0)
		useB4XTable_CellClicked(FirstColforEdit,rowindex)
	End If
	
	Return True
	
End Sub


Public Sub AlignAllCols
	useB4XTable.MaximumRowsPerPage = 20
	useB4XTable.BuildLayoutsCache(useB4XTable.MaximumRowsPerPage)
	If xui.IsB4J Then useB4XTable.HighlightSearchResults = False
	
	For k=0 To MyColumns.Size-1
		Dim myc As mycol=MyColumns.Get(k)
		
		Dim alignment As String=myc.Alignment
		
		If alignment.trim="" Then
			Select Case myc.Controltype
				Case "TEXTFIELD","TEXTAREA", "COMBO", "COMBO", "COMBOEDIT", "COMBOFIELD","COMBOEDITFIELD", "PICTURE"
			
					If myc.Controltype="TEXTFIELD_NUMERIC" Then
						SetColumnAlignment(useB4XTable,myc.Name,"LEFT")
					Else
						SetColumnAlignment(useB4XTable,myc.Name,"RIGHT")
					End If
				
				Case "EDITCONTROLS"
					SetColumnAlignment(useB4XTable,myc.Name,"CENTER")

				Case "DATE"
					SetColumnAlignment(useB4XTable,myc.Name,"CENTER")
			End Select
		Else
			SetColumnAlignment(useB4XTable,myc.Name,alignment)
		End If
	Next
	
	
	useB4XTable.Refresh
	
		
End Sub


Private Sub B4XTable1_DataUpdated
	
End Sub


'align column
private Sub SetColumnAlignment(tableName As B4XTable, ColumnId As String, alignment As String)
 
	Dim column As B4XTableColumn = tableName.GetColumn(ColumnId)
	For i = 1 To column.CellsLayouts.Size - 1        'starts at 1 due to header
		Dim pnl As B4XView = column.CellsLayouts.Get(i)
		pnl.GetView(0).SetTextAlignment("CENTER", alignment.ToUpperCase)
		Dim lbl As Label = pnl.GetView(0)
		#if B4J
		lbl.Style="-fx-padding: 5;"
		#End If
		#if B4A
		lbl.Padding = Array As Int (5dip, 5dip, 5dip, 5dip)
		#End If
	Next
    
End Sub

Private Sub IE_EnterEditMode (FC As FocusedCell)


			If SelectedColumn.Controltype.Trim.ToUpperCase.Contains("NUMERIC") Then
					MyNumField.Text=FC.PrevValue
					FC.View=MyNumField
				Else
					
					Select Case SelectedColumn.Controltype
						

						Case "TEXTFIELD","TEXTAREA"
							MyTextField.Text=FC.PrevValue
							FC.View=MyTextField
						Case "COMBO","COMBOFIELD","COMBOEDIT","COMBOEDITFIELD"
							If SelectedColumn.Controltype.Contains("EDIT") Then
								MyComboField.Editable=True
								Else
								MyComboField.Editable=False
							End If
							noEdit=True
							MyComboField.Items.Clear
							For k=0 To SelectedColumn.UseList.Size-1
								Private map1 As Map=SelectedColumn.UseList.Get(k)
								MyComboField.Items.Add(map1.Get(SelectedColumn.Name))
								If FC.PrevValue=map1.Get(SelectedColumn.Name) Then
									MyComboField.SelectedIndex=k
									MyPrevComboIndex=k
									For Each afield As String In map1.Keys
										SetValue(SelectedRow,afield,map1.Get(afield))
									Next
								End If
							Next

							If MyComboField.Editable=True And k=SelectedColumn.UseList.Size Then
								MyComboField.Value=FC.PrevValue
								Else
								MyComboField.SelectedIndex=MyPrevComboIndex
							End If

							FC.View=MyComboField

						Case "DATE"
							MyTextField.Text=DateTime.Date(FC.PrevValue)
							FC.View=MyTextField
					End Select

			End If


End Sub

Private Sub IE_GetUpdatedValue (FC As FocusedCell) As Object
			
	If SelectedColumn.Controltype.Trim.ToUpperCase.Contains("NUMERIC") Then
		RowCalcPraxis
		If SelectedColumn.MaxValue>0 Then 
			If MyNumField.Text.As(Double)>SelectedColumn.MaxValue Then MyNumField.Text=SelectedColumn.MaxValue
		End If
		If SelectedColumn.MinValue>0 Then
			If MyNumField.Text.As(Double)<SelectedColumn.MinValue Then MyNumField.Text=SelectedColumn.Minvalue
		End If
		If MyNumField.Text.Trim.Length=0 Then MyNumField.Text=SelectedColumn.Defaultvalue
		Return MyNumField.Text
	Else


		Select Case SelectedColumn.Controltype
			Case "TEXTFIELD","TEXTAREA"
				If MyTextField.Text.Trim.Length=0 Then MyTextField.Text=SelectedColumn.Defaultvalue
				Return MyTextField.Text
			
	
			Case "COMBO","COMBOFIELD","COMBOEDIT","COMBOEDITFIELD"

					If MyComboField.SelectedIndex>-1 Then 
						Private map1 As Map=SelectedColumn.UseList.Get(MyComboField.SelectedIndex)
						'Log(map1.Get(SelectedColumn.Name))
						For Each afield As String In map1.Keys
							SetValue(SelectedRow,afield,map1.Get(afield))
						Next
						
						Return map1.Get(SelectedColumn.Name)
					Else
						If MyComboField.Editable=True Then
							Return MyComboField.Value
						Else
						
						If SelectedColumn.Defaultvalue.Trim.Length>0 Then
							Return SelectedColumn.Defaultvalue
						End If
								
						End If
						
					End If
					
			Case "DATE"

				If xtra.IsValidDate(MyTextField.Text)=False Then
					If SelectedColumn.Defaultvalue>0 Then
						MyTextField.Text=DateTime.Date(SelectedColumn.Defaultvalue)
						Else
						MyTextField.Text=DateTime.Date(DateTime.Now)
					End If
				End If
				If SelectedColumn.MaxValue>0 Then
					If DateTime.DateParse(MyTextField.Text)>SelectedColumn.MaxValue Then MyTextField.Text=DateTime.Date(SelectedColumn.MaxValue)
				End If
				If SelectedColumn.MinValue>0 Then
					If DateTime.DateParse(MyTextField.Text)<SelectedColumn.MinValue Then MyTextField.Text=DateTime.Date(SelectedColumn.MinValue)
				End If
				Return DateTime.DateParse(MyTextField.Text)
		End Select
		
	End If

	Return Null
End Sub


Sub useB4XTable_CellClicked (ColumnId As String, RowId As Long)
	'avoid calling ie.CellClicked if the column is not editable.
	'Sleep(0)

	If noEdit=True Then
		noEdit=False
		ie.ExitEditMode
		RowCalcPraxis
	End If


	thistable.CellClicked(ColumnId, RowId)

	SelectedRow=RowId
	
	
	
	wait for (SelColumn(ColumnId)) complete (unused As Boolean)
	If SelectedColumn.Locked=True Then Return
	
	If SelectedColumn.Controltype.Contains("CHECK") Then
		
		If GetValue(RowId,ColumnId)=Chr(9746) Then
			SetValue(RowId,ColumnId,Chr(9744))
			Else
			SetValue(RowId,ColumnId,Chr(9746))
		End If
	
	Else
		ie.CellClicked(ColumnId, RowId)
	End If

	

End Sub


private Sub SelColumn(ID1 As String) As ResumableSub
	For k=0 To MyColumns.size-1
					
		Dim MyColumn As mycol=MyColumns.Get(k)
		If MyColumn.Name.Trim=ID1 Then Exit
								
	Next
	
	TheIndexCol=k
	SelectedColumn=MyColumn

	Return True
End Sub

Sub useB4XTable_DataUpdated
	ie.DataUpdated
End Sub


Sub mynumfield_TextChanged (Old As String, New As String)
   
	Dim update As Boolean
   
	Try
		' ✅ Allow digits and at most one decimal point
		Dim text As String= Regex.Replace("[^0-9.]", New, "") ' remove everything except digits and "."
        
		' If more than one ".", keep only the first one
		Dim firstDot As Int = text.IndexOf(".")
		If firstDot > -1 Then
			Dim before As String = text.SubString2(0, firstDot + 1)
			Dim after As String = Regex.Replace("[.]", text.SubString(firstDot + 1), "") ' strip extra dots
			text = before & after
		End If
        
		If New <> text Then update = True
	Catch
		Log(LastException.Message)
	End Try
   
	' ✅ Limit length
	
	If text.Length > SelectedColumn.MaxLength  Then
		text = text.SubString2(0, SelectedColumn.MaxLength)
		update = True
	End If

	If text.Trim.Length=0 Then 
		update=True
	End If
	

	' ✅ Apply update
	If update Then
		MyNumField.Text = text
		MyNumField.SetSelection(text.Length, text.Length)
	End If


End Sub


Private Sub mynumfield_Action
	If MyNumField.Text.Trim.Length=0 Then
		MyNumField.Text=SelectedColumn.Defaultvalue
		ie.ExitEditMode
		RowCalcPraxis
		NextEditableColumn
		Return
	End If

	If MyNumField.Text <> "" And IsNumber(MyNumField.Text) Then
		MyNumField.Text = NumberFormat2(MyNumField.Text,SelectedColumn.MinIntegers,SelectedColumn.MinFractions,SelectedColumn.MaxFractions,SelectedColumn.Grouping)
	End If
	ie.ExitEditMode	
	RowCalcPraxis
	NextEditableColumn
	useB4XTable.clvData.sv.RequestFocus
End Sub

Private Sub mynumfield_FocusChanged (HasFocus As Boolean)
	noEdit=HasFocus
	
	If HasFocus=True Then
		PrevColumn=SelectedColumn
		RowCalcPraxis
		Return		
	End If
	If HasFocus = False And MyNumField.Text <> "" And IsNumber(MyNumField.Text) Then
		MyNumField.Text = NumberFormat2(MyNumField.Text,PrevColumn.MinIntegers,PrevColumn.MinFractions,PrevColumn.MaxFractions,PrevColumn.Grouping)
		ie.ExitEditMode
		RowCalcPraxis
		useB4XTable.clvData.sv.RequestFocus
		Return
	End If
	If HasFocus=False And MyNumField.Text.Trim.Length=0 Then
		MyNumField.Text=SelectedColumn.Defaultvalue
		ie.ExitEditMode
		RowCalcPraxis
		useB4XTable.clvData.sv.RequestFocus
		Return
	End If
End Sub



Sub mytextfield_TextChanged (Old As String, New As String)

	Dim update As Boolean
   	Dim text As String=New


	If SelectedColumn.MaxLength>0 Then

	' ✅ Limit length
	If text.Length > SelectedColumn.MaxLength Then
		text = text.SubString2(0, SelectedColumn.MaxLength)
		update = True
	End If
	
	End If

	If text.Trim.Length=0 Then 
		update=True
	End If

	' ✅ Apply update
	If update Then
		MyTextField.Text = text
		MyTextField.SetSelection(text.Length, text.Length)
	End If


End Sub


Private Sub mytextfield_Action
	
	If MyTextField.Text.Trim.Length=0 Then
		MyTextField.Text=SelectedColumn.Defaultvalue
		ie.ExitEditMode
		NextEditableColumn
		'useB4XTable.clvData.sv.RequestFocus
		Return
	End If
	
	ie.ExitEditMode
	useB4XTable.clvData.sv.RequestFocus
	NextEditableColumn
	
End Sub

Private Sub mytextfield_FocusChanged (HasFocus As Boolean)
	noEdit=HasFocus
	
	If HasFocus=False And MyTextField.Text.Trim.Length=0 Then
		MyTextField.Text=SelectedColumn.Defaultvalue
		ie.ExitEditMode
		useB4XTable.clvData.sv.RequestFocus
		Return
	End If


	If HasFocus=False Then
		ie.ExitEditMode
		useB4XTable.clvData.sv.RequestFocus
	End If
End Sub


Private Sub MyComboField_ValueChanged (Value As Object)
	
End Sub

Private Sub MyComboField_SelectedIndexChanged(Index As Int, Value As Object)
	If Index>-1 Then
		If Index<>MyPrevComboIndex Then
			Private map1 As Map=SelectedColumn.UseList.Get(Index)
			For Each afield As String In map1.Keys
				If SelectedColumn.Name<>afield Then
					SetValue(SelectedRow,afield,map1.Get(afield))				
					Else
					SetValue(SelectedRow,afield,Value)
				End If
			Next
			MyPrevComboIndex=Index
			RowCalcPraxis
		End If
	End If
End Sub



Private Sub MyCheckBox_CheckedChange(Checked As Boolean)

End Sub



Private Sub IsTableFocused (Table As B4XTable) As Boolean

	Dim FocusedNode As B4XView = Main.scene.RunMethodJO("focusOwnerProperty", Null).RunMethod("get", Null)

	Do While FocusedNode.IsInitialized
		If FocusedNode = Table.clvData.AsView Then Return True
		FocusedNode = FocusedNode.Parent
	Loop
	Return False
End Sub

Sub AddKeyPressedListener
	Dim r As Reflector
	r.Target = myroot'B4XPages.GetNativeParent(Root) 'error
	#IF B4J
	r.AddEventFilter("keypressed", "javafx.scene.input.KeyEvent.ANY")
	#END IF
End Sub

#if B4J
Sub KeyPressed_Filter (e As Event)
	Dim table As B4XTable = useB4XTable
	If noEdit=False And IsTableFocused(table) And table.VisibleRowIds.Get(0)>0 Then  'And thistable.FirstSelectedColumnId <> "" 'And thistable.FirstSelectedRowId > 0

		Dim jo As JavaObject = e
		Dim EventType As String = jo.RunMethodJO("getEventType", Null).RunMethod("getName", Null)
		'Log(EventType)
		

		If EventType = "KEY_PRESSED" Then

			Dim keycode As String = jo.RunMethod("getCode", Null)
			Dim col As String = 1'thistable.FirstSelectedColumnId
			Dim row As Long = thistable.FirstSelectedRowId
			
			'Dim ColSize As Int = table.VisibleColumns.Size
			Dim RowSize As Int = table.VisibleRowIds.Size
			Select keycode
'				Case "RIGHT"
'					If noEdit=False Then thistable.CellClicked(col, row)
'					'	col = table.VisibleColumns.Get((table.VisibleColumns.IndexOf(table.GetColumn(col)) + 1) Mod ColSize).As(B4XTableColumn).Id
'				Case "LEFT"
'					If noEdit=False Then thistable.CellClicked(col, row)
'					'	col = table.VisibleColumns.Get((table.VisibleColumns.IndexOf(table.GetColumn(col)) - 1 + ColSize) Mod ColSize).As(B4XTableColumn).Id
				Case "UP"
					row = table.VisibleRowIds.Get((table.VisibleRowIds.IndexOf(row) - 1 + RowSize) Mod RowSize)
					If row = 0 Then
						For i = table.VisibleRowIds.Size - 1 To 0 Step -1
							row = table.VisibleRowIds.Get(i)
							If row <> 0 Then Exit
						Next
					End If
					SelectedRow=row
				Case "DOWN"
					row = table.VisibleRowIds.Get((table.VisibleRowIds.IndexOf(row) + 1 + RowSize) Mod RowSize)
					If row = 0 Then row = table.VisibleRowIds.Get(0)
					SelectedRow=row
				Case "PAGE_UP"
					row=1
					table.CurrentPage=table.CurrentPage-1
				Case "PAGE_DOWN"
					row=1
					table.CurrentPage=table.CurrentPage+1
				Case "SPACE"
					For k=0 To MyColumns.Size-1
						Dim myc As mycol=MyColumns.Get(k)
						If myc.Controltype.Contains("CHECK") Then
		
						If GetValue(SelectedRow,myc.Name)=Chr(9746) Then
								SetValue(SelectedRow,myc.Name,Chr(9744))
						Else
								SetValue(SelectedRow,myc.Name,Chr(9746))
						End If
						End If
					Next
				Case "DELETE"
					SelectedRow=row
					DeleteRow(SelectedRow)	
					row = table.VisibleRowIds.Get(0)
					SelectedRow=row
				Case "ENTER"
					If noEdit=False Then
						SelectedRow=row
						Dim myc As mycol=MyColumns.Get(0)
						SelColumn(myc.Name)
						NextEditableColumn
						Return
					End If
				Case Else
					
			End Select
			
			If row<1 Then row=1
			'Sleep(0)
			useB4XTable.clvData.sv.RequestFocus
			Sleep(0)
			thistable.CellClicked(col, row)
			'GoAtRowAndClick(row)
		End If
		
	End If

	If noEdit=True Then
		Dim jo As JavaObject = e
		Dim EventType As String = jo.RunMethodJO("getEventType", Null).RunMethod("getName", Null)
		If EventType = "KEY_PRESSED" Then
			Dim keycode As String = jo.RunMethod("getCode", Null)
			If keycode = "ESCAPE" Then
				ie.ExitEditMode
				useB4XTable.clvData.sv.RequestFocus
			End If
			If keycode="TAB" And xtra.IsComboBoxFocused(MyComboField)=False Then
				If SelectedColumn.Controltype.Contains("NUMERIC") Then
					mynumfield_Action
					Else
					mytextfield_Action
				End If
			End If
			If xtra.IsComboBoxFocused(MyComboField) And (keycode="ENTER" Or keycode="TAB") Then

		
					If MyComboField.Editable=True Then
						Dim tmp As String=MyComboField.Value  'here
						Sleep(0)
						SetValue(SelectedRow,SelectedColumn.Name,tmp)
						Else
						ie.ExitEditMode
					End If
					NextEditableColumn
					
				noEdit=False

			End If

		End If
		
	End If
'	If Dialog.Visible Then
'		Dim jo As JavaObject = e
'		Dim EventType As String = jo.RunMethodJO("getEventType", Null).RunMethod("getName", Null)
'		If EventType = "KEY_PRESSED" Then
'			Dim keycode As String = jo.RunMethod("getCode", Null)
'			If keycode = "ESCAPE" Then
'				Dialog.Close(xui.DialogResponse_Cancel)
'			End If
'		End If
'	End If
'	If nowinpref=True Then
'		Dim jo As JavaObject = e
'		Dim EventType As String = jo.RunMethodJO("getEventType", Null).RunMethod("getName", Null)
'		If EventType = "KEY_PRESSED" Then
'			Dim keycode As String = jo.RunMethod("getCode", Null)
'			If keycode = "ESCAPE" Then
'				prefdialog.Dialog.Close(xui.DialogResponse_Cancel)
'			End If
'			If keycode = "ENTER" Then
'				prefdialog.Count
'				'sendk.RobotSpecialKeyPress("TAB")
'			End If
'		End If
'	End If

End Sub
#end if

Private Sub FirstColforEdit As String
	Dim foredit As String
	For k=0 To MyColumns.Size-1
		Dim myc As mycol=MyColumns.Get(k)
		foredit=myc.name
		If myc.Locked=False And myc.Hidden=False Then
			Return foredit
		End If
	Next
	Return foredit
End Sub


public Sub SumRows(ColumnID As String, sqlstring As String) As Double
'SQLString
	useB4XTable.clvData.sv.RequestFocus
	ie.ExitEditMode

	If sqlstring.Trim.Length=0 Then
		Dim c As B4XTableColumn = useB4XTable.GetColumn(ColumnID)
		'c.SQLID	
		Dim rs As ResultSet=useB4XTable.sql1.ExecQuery("SELECT SUM("& c.sqlid.trim & ") AS Total_sum FROM data;")
		Return rs.GetDouble2(0)
	Else
		For k=0 To MyColumns.Size-1
			Private myc As mycol=MyColumns.Get(k)
			Dim c As B4XTableColumn = useB4XTable.GetColumn(myc.Name)
			sqlstring=sqlstring.Replace("[" & myc.Name & "]",c.SQLID)
		Next
		Dim rs As ResultSet=useB4XTable.sql1.ExecQuery(sqlstring)
		Return rs.GetDouble2(0)
	End If
	
End Sub

public Sub GetData As List
	
	Dim list1 As List
	list1.Initialize

	Dim rs As ResultSet = useB4XTable.SQL1.ExecQuery("SELECT * FROM data")

	Do While rs.NextRow
		Dim colCount As Int = rs.ColumnCount
		Dim rowArray(colCount) As Object
    
		For i = 0 To colCount - 1
			rowArray(i) = rs.GetString2(i)
		Next
    
		list1.Add(rowArray)
	Loop

	rs.Close
	
	Return list1
	
End Sub

Public Sub DeleteRow(rowid As Long)
	
	useB4XTable.sql1.ExecnonQuery("DELETE FROM data WHERE rowid=" & rowid & ";")
	useB4XTable.Refresh
	
End Sub



'Resizing Guidelines - Subs... here
Sub ResizeTimer_Tick
	resizeTimer.Enabled = False
	EnableResizeGuidelines
End Sub

Sub EnableResizeGuidelines
	If isResizing = False Then
		resizeTimer.Enabled = False
		isResizing = True

		If removableGuidelines.IsInitialized Then
			For Each pnl As B4XView In removableGuidelines
				pnl.RemoveViewFromParent
			Next
		End If

		Dim clv As CustomListView = useB4XTable.clvData
		Dim scrollX As Int = clv.sv.ScrollViewOffsetX
		Dim baseX As Int = useB4XTable.mBase.Left + clv.GetBase.Left - scrollX + useB4XTable.mBase.Parent.Left

		removableGuidelines.Clear
		Dim colX As Int = baseX
		For col = 0 To useB4XTable.visibleColumns.Size - 1
			Dim tableCol As B4XTableColumn = useB4XTable.visibleColumns.Get(col)
			colX = colX + tableCol.Width

			Dim guidelinePanel As B4XView = xui.CreatePanel("GuidelinePanel")
			guidelinePanel.Tag = col
			guidelinePanel.SetColorAndBorder(xui.Color_Transparent, 2, xui.Color_Transparent, 0)
			'If tableCol.Width>1 Then
				myroot.AddView(guidelinePanel, colX - 1, useB4XTable.mBase.Top + clv.GetBase.Top + useB4XTable.mBase.Parent.Top + 1, 2, clv.sv.ScrollViewContentHeight)
			'End If
			removableGuidelines.Add(guidelinePanel)
		Next

		isResizing = False
		resizeTimer.Enabled = True
	End If
End Sub

Private Sub GuidelinePanel_MouseEntered (EventData As MouseEvent)

	If noEdit Then Return

	Dim pnl As B4XView = Sender

	If pnl.IsInitialized Then
	
	' Compute the visible scroll viewport bounds
	Dim tableLeft As Int = useB4XTable.mBase.Left + useB4XTable.clvData.GetBase.Left + useB4XTable.mBase.Parent.Left
	Dim visibleRight As Int = tableLeft + useB4XTable.clvData.sv.Width
    
	' Only highlight and change cursor if the guideline is within the visible area
	If pnl.Left >= tableLeft And pnl.Left <= visibleRight Then
		pnl.SetColorAndBorder(xui.Color_Transparent, 2, xui.Color_Green, 0)
		' Set resize cursor
		Dim cursor As JavaObject
		cursor.InitializeStatic("javafx.scene.Cursor")
		Dim joPnl As JavaObject = pnl
		joPnl.RunMethod("setCursor", Array(cursor.GetField("E_RESIZE")))
	End If
	
	End If
End Sub

Private Sub GuidelinePanel_MouseExited (EventData As MouseEvent)
	
	Dim pnl As B4XView = Sender
	If pnl.IsInitialized Then
	' Clear highlight
	pnl.SetColorAndBorder(xui.Color_Transparent, 2, xui.Color_Transparent, 0)
	' Restore default cursor
	Dim cursor As JavaObject
	cursor.InitializeStatic("javafx.scene.Cursor")
	Dim joPnl As JavaObject = pnl
	joPnl.RunMethod("setCursor", Array(cursor.GetField("DEFAULT")))
	End If
End Sub

Private Sub GuidelinePanel_MousePressed (EventData As MouseEvent)
	If noEdit Then Return
	
	
	If EventData.ClickCount = 2 Then
		Dim panel As B4XView = Sender
		If panel.IsInitialized Then
			Dim colIndex As Int = panel.Tag
			Dim col As B4XTableColumn = useB4XTable.visibleColumns.Get(colIndex)
	        
			'Log(colIndex)
			' Toggle between minimized width and original (or auto) width
			If col.Width > 1 Then
				' Store current width and minimize
				previousColumnWidths(colIndex) = col.Width
				col.Width = 1
			Else
				' Restore previous width or auto-size
				Dim restoredWidth As Int = previousColumnWidths(colIndex)
				If restoredWidth <= 1 Then
					restoredWidth = 100dip
				End If
				col.Width = restoredWidth
			End If
	        
			useB4XTable.Refresh
			Sleep(0)
			EnableResizeGuidelines
			resizeTimer.Enabled = True
		End If
		Return
	End If
	
	currentPanel = Sender
	If currentPanel.IsInitialized Then
	currentColumn = useB4XTable.visibleColumns.Get(currentPanel.Tag)
	startColumnWidth = currentColumn.Width
	cumulativeDelta = 0
	isResizing = True
	resizeTimer.Enabled = False
	currentPanel.SetColorAndBorder(xui.Color_Transparent, 2, xui.Color_Green, 0)
	End If
End Sub

Private Sub GuidelinePanel_MouseDragged (EventData As MouseEvent)
	If isResizing Then
		
	If currentPanel.IsInitialized Then
		' Accumulate the small movement deltas
		cumulativeDelta = cumulativeDelta + EventData.X

		' Calculate the absolute X where columns begin
		Dim tableLeft As Int = useB4XTable.mBase.Left
		tableLeft = tableLeft + useB4XTable.mBase.Parent.Left
		tableLeft = tableLeft + useB4XTable.clvData.GetBase.Left

		' Calculate the rightmost X of the *visible* scroll area
		Dim visibleRight As Int = tableLeft + useB4XTable.clvData.sv.Width

		' Tentative new X for the guideline panel
		Dim tentativeLeft As Int = currentPanel.Left + EventData.X

		' Clamp so it never goes beyond the left edge
		If tentativeLeft < tableLeft Then
			cumulativeDelta = cumulativeDelta - (tableLeft - currentPanel.Left)
			tentativeLeft = tableLeft
		End If
		' Clamp so it never goes beyond the right edge of the viewport
		If tentativeLeft > visibleRight Then
			cumulativeDelta = cumulativeDelta - (tentativeLeft - visibleRight)
			tentativeLeft = visibleRight
		End If

		' Apply the clamped position
		currentPanel.Left = tentativeLeft

		' Update the column width based on the clamped movement
		Dim newSize As Int = startColumnWidth + cumulativeDelta
		If newSize < 20 Then newSize = 20
		currentColumn.Width = newSize

		' Refresh here will make it heavier - but will automatically show it right
		'useB4XTable.Refresh
		
	End If
	
	End If
End Sub

Private Sub GuidelinePanel_MouseReleased (EventData As MouseEvent)
	If isResizing Then
		isResizing = False
        
		' Final width adjustment already handled by MouseDragged
		' Hide guideline
		currentPanel.SetColorAndBorder(xui.Color_Transparent, 2, xui.Color_Transparent, 0)
        
		' Rebuild guidelines
		
		useB4XTable.Refresh 'Refresh here is safer than when dragging...
		
		EnableResizeGuidelines
		resizeTimer.Enabled = True
	End If
End Sub




#if DEBUG
#if JAVA
public void RemoveWarning() throws Exception{
    anywheresoftware.b4a.shell.Shell s = anywheresoftware.b4a.shell.Shell.INSTANCE;
    java.lang.reflect.Field f = s.getClass().getDeclaredField("errorMessagesForSyncEvents");
    f.setAccessible(true);
    java.util.HashSet<String> h = (java.util.HashSet<String>)f.get(s);
    if (h == null) {
        h = new java.util.HashSet<String>();
        f.set(s, h);
    }
    h.add("guidelinepanel_mouseexited");
}
#End If
#End If