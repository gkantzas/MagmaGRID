B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
'MagmaGRID or whateverGRID
'Created by MAGMA (Georgios Kantzas)
'My Scope is to be used for Business Projects... because B4X must be used for Business Projects too
'Also this is shared - to make it better from all members

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	
	Private Pane1 As B4XView
	Dim mg As MagmaGrid
	Private Button1 As Button
	Private Button2 As Button
	
	Dim list1 As List
	Private Button3 As Button
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	DateTime.DateFormat = "dd/MM/yyyy"
	
	'caution needed:
	Main.scene =B4XPages.GetNativeParent(Me).As(JavaObject).GetField("scene") 'error
	
	
	Wait For(ShowMyGRID) complete (map1 As Map)  'if list list or map map ?
	
	'Log(map1.Size)
	'B4XPages.ClosePage(Me)
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Button1_Click
	
	'getvalues - get row values
'	Dim m As Map=mg.GetValues
'	If m.IsInitialized Then Log(m.GetValueAt(0))
	
	'You can auto calc perhaps using a timer (every some ms)
	
	
	'simple sum
	Log("Total without VAT: " & mg.SumRows("Tot.Price wo VAT",""))
	
	'simple sum
	Log("Total with VAT: " & mg.SumRows("Tot.Price w VAT",""))
	
	'more complicated
	Log("only VAT 13%: " & mg.SumRows("VAT","SELECT  SUM([VAT]) as myvalue FROM data WHERE [Vat%]='13.00';"))
	
	'Get Data... that was missing..
	Dim newlist As List=mg.GetData
	
	'Check here if will be the same Data...
	mg.SetData(newlist)
	

End Sub

Private Sub Button2_Click
	' I prefer VAT 24%
	Dim newlist As List = mg.GetData
	If newlist.Size>0 Then
		Dim maxRow() As Object = newlist.Get(newlist.Size-1) 'aeric's fix
		Dim newID As Int = maxRow(0) + 1 'aeric's fix
	Else
		Dim newID As Int = 1
	End If
	newlist.Add(Array As String(newID,"","",DateTime.now, "0.00","0.00","1.00","24.00"))
	mg.SetData(newlist)
	Sleep(1000)
	mg.CalcAll
	

End Sub


Private Sub ShowMyGRID As ResumableSub
	
	'Create some lists to use them at Grid...
	#Region Vat List	
	Dim vatlist As List
	vatlist.Initialize
	Dim mapitem As Map
	mapitem.Initialize
	mapitem.Put("Vat%","0.00")
	vatlist.Add(mapitem)
	
	Dim mapitem As Map
	mapitem.Initialize
	mapitem.Put("Vat%","6.00")
	vatlist.Add(mapitem)
	
	Dim mapitem As Map
	mapitem.Initialize
	mapitem.Put("Vat%","13.00")
	vatlist.Add(mapitem)
	
	Dim mapitem As Map
	mapitem.Initialize
	mapitem.Put("Vat%","24.00")
	vatlist.Add(mapitem)
	#End Region
	#Region Enviromental Fees	
	Dim envfees As List
	envfees.Initialize
	Dim mapitems As Map
	mapitems.Initialize
	mapitems.put("Enviromental Fee","")
	mapitems.put("Env.Fee","0.00")
	envfees.Add(mapitems)

	mapitems.Initialize
	mapitems.put("Enviromental Fee","Plastic")
	mapitems.put("Env.Fee","0.08")
	envfees.Add(mapitems)

	mapitems.Initialize
	mapitems.put("Enviromental Fee","Glass")
	mapitems.put("Env.Fee","0.11")
	envfees.Add(mapitems)
	#End region
	
	mg.Initialize(Pane1)
	
	mg.AddColumn("ID",False,True,True,70,"TEXTFIELD_NUMERIC","",Null, 0,0,0,"CENTER", 5, 0, 0, False)
	mg.AddColumn("Item Desc", False,False,True,215,"TEXTFIELD","",Null,  40, 0,0,"LEFT",  0, 0, 0, False)
	mg.AddColumn("Enviromental Fee", False,False,True,180,"COMBOEDIT","",envfees,  0, 0,0,"LEFT",  0, 0, 0, False)
	mg.AddColumn("Prod.Date", False,False,True,115,"DATE", DateTime.now, Null, 0, 0,0,"CENTER", 0, 0, 0, False)
	mg.AddColumn("Price", False,False,True,80,"TEXTFIELD_NUMERIC","0",Null,0,0,0,"RIGHT", 1, 2, 2,  False)
	mg.AddColumn("Env.Fee", True, False,True,50,"TEXTFIELD_NUMERIC","0.00",envfees,  0, 0, 0,"RIGHT",  1, 2, 2, False)'let's hide one column / WITH DOUBLE CLICK WILL SHOW IT
	mg.AddColumn("Qty", False,False,True,50,"TEXTFIELD_NUMERIC","1.00",Null,0,0,0,"CENTER", 1, 2, 2, False)
	mg.AddColumn("Vat%", False,False,False,90,"COMBO","",vatlist,0,0,99.99,"RIGHT", 2, 2, 2, False)
	mg.AddColumn("Tot.Price wo VAT", False,True,False,90,"TEXTFIELD_NUMERIC","",Null,0,0,0,"RIGHT", 1, 2, 2, False)
	mg.AddColumn("VAT", False,True,False,90,"TEXTFIELD_NUMERIC","",Null,0,0,0,"RIGHT", 1, 2, 2, False)
	mg.AddColumn("Tot.Price w VAT", False,True,False,90,"TEXTFIELD_NUMERIC","",Null,0,0,0,"RIGHT", 1, 2, 2, False)
	mg.AddColumn("Check", False,False,False,50,"CHECKBOX",Chr(9744),Null,0,0,0,"CENTER", 0, 0, 0, False)  '9744 unchecked / 9746 checked  -can be used True/False but must change in dataupdated
	mg.AddColumn("ShowMoves",  False, True , False,80,"BUTTON","Show Moves...", Array As Object(Me,"showmoves","rowid"),0,0,0,"CENTER",  0, 0, 0, False) 'Asked by Guenter Becker (Anything is different from changing values - must be added as VOID and in DataUpdated) / same for images too

	#Region Add Some Formulas / Calculations
	mg.AddHorizontalPraxis("[Tot.Price wo VAT]=(([Price]+[Env.Fee])*[Qty])")  'caution here, have them in right position !
	mg.AddHorizontalPraxis("[VAT]=[Tot.Price wo VAT]*([Vat%]/100)")
	mg.AddHorizontalPraxis("[Tot.Price w VAT]=[Tot.Price wo VAT]+[VAT]")
	#End Region
	

	'the data
	#Region Add Some Data, Items
	list1.Initialize
	list1.Add(Array As String("1","Tzatziki 200gr","Plastic", DateTime.now,"3.30","0.08","3.00","13.00","","","",Chr(9744)))
	list1.Add(Array As String("2","Taramosalata 100gr","Plastic",DateTime.now,"3.90","0.08","1.00","13.00","","","",Chr(9746)))
	list1.Add(Array As String("3","Red Wine 750ml","Glass",DateTime.now, "9.90","0.11","1.00","24.00","","","",Chr(9744)))
	#End Region
	
	mg.AlignAllCols
	mg.allowColumnResize=True
	mg.OnlySelectRow=False
	
	mg.SetData(list1)
	
	'Wait For Button3_Click  ' You can an OK button

	'Return mg.GetData 'This will return all data of GRID
	'Return mg.GetValues 'This will return only selected row
	
	'Async and return with just selecting row
	wait for (mg.GetValuesAsync) complete (selectedmap As Map)
	Return selectedmap
	
End Sub


Private Sub Button3_Click
	
	' OK to return...
		
End Sub

public Sub showmoves(a As String)
	Log("TEST: " & a)
	Log("Price: " & mg.GetValue(a.As(String), "Price"))
End Sub

