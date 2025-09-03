package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xtableselections_subs_0 {


public static RemoteObject  _cellclicked(RemoteObject __ref,RemoteObject _columnid,RemoteObject _rowid) throws Exception{
try {
		Debug.PushSubsStack("CellClicked (b4xtableselections) ","b4xtableselections",4,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("cellclicked")) { return __ref.runUserSub(false, "b4xtableselections","cellclicked", __ref, _columnid, _rowid);}
RemoteObject _selectedcells = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("ColumnId", _columnid);
Debug.locals.put("RowId", _rowid);
 BA.debugLineNum = 22;BA.debugLine="Public Sub CellClicked (ColumnId As String, RowId";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="If mCurrentMode = MODE_SINGLE_CELL_TEMP Then Retu";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mcurrentmode" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_mode_single_cell_temp" /*RemoteObject*/ )))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 42;BA.debugLine="If SingleMode Then SelectedLines.Clear";
Debug.ShouldStop(512);
if (__ref.getField(true,"_singlemode" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_selectedlines" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xorderedmap.class, "_clear" /*RemoteObject*/ );};
 BA.debugLineNum = 43;BA.debugLine="If LineMode Then";
Debug.ShouldStop(1024);
if (__ref.getField(true,"_linemode" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 44;BA.debugLine="SelectedLines.Put(RowId, \"\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_selectedlines" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_rowid)),(Object)((RemoteObject.createImmutable(""))));
 }else {
 BA.debugLineNum = 46;BA.debugLine="Dim SelectedCells As List";
Debug.ShouldStop(8192);
_selectedcells = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("SelectedCells", _selectedcells);
 BA.debugLineNum = 47;BA.debugLine="If SelectedLines.ContainsKey(RowId) Then";
Debug.ShouldStop(16384);
if (__ref.getField(false,"_selectedlines" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xorderedmap.class, "_containskey" /*RemoteObject*/ ,(Object)((_rowid))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 48;BA.debugLine="SelectedCells = SelectedLines.Get(RowId)";
Debug.ShouldStop(32768);
_selectedcells = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_selectedlines" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_rowid))));Debug.locals.put("SelectedCells", _selectedcells);
 }else {
 BA.debugLineNum = 50;BA.debugLine="Dim SelectedCells As List";
Debug.ShouldStop(131072);
_selectedcells = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("SelectedCells", _selectedcells);
 BA.debugLineNum = 51;BA.debugLine="SelectedCells.Initialize";
Debug.ShouldStop(262144);
_selectedcells.runVoidMethod ("Initialize");
 BA.debugLineNum = 52;BA.debugLine="SelectedLines.Put(RowId, SelectedCells)";
Debug.ShouldStop(524288);
__ref.getField(false,"_selectedlines" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_rowid)),(Object)((_selectedcells.getObject())));
 };
 BA.debugLineNum = 54;BA.debugLine="SelectedCells.Add(ColumnId)";
Debug.ShouldStop(2097152);
_selectedcells.runVoidMethod ("Add",(Object)((_columnid)));
 };
 BA.debugLineNum = 57;BA.debugLine="Refresh";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.b4xtableselections.class, "_refresh" /*RemoteObject*/ );
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public MODE_SINGLE_CELL_TEMP = 1, MODE_SINGLE_CEL";
b4xtableselections._mode_single_cell_temp = BA.numberCast(int.class, 1);__ref.setField("_mode_single_cell_temp",b4xtableselections._mode_single_cell_temp);
b4xtableselections._mode_single_cell_permanent = BA.numberCast(int.class, 2);__ref.setField("_mode_single_cell_permanent",b4xtableselections._mode_single_cell_permanent);
b4xtableselections._mode_single_line_permanent = BA.numberCast(int.class, 3);__ref.setField("_mode_single_line_permanent",b4xtableselections._mode_single_line_permanent);
 //BA.debugLineNum = 4;BA.debugLine="Public MODE_MULTIPLE_CELLS = 4, MODE_MULTIPLE_LIN";
b4xtableselections._mode_multiple_cells = BA.numberCast(int.class, 4);__ref.setField("_mode_multiple_cells",b4xtableselections._mode_multiple_cells);
b4xtableselections._mode_multiple_lines = BA.numberCast(int.class, 5);__ref.setField("_mode_multiple_lines",b4xtableselections._mode_multiple_lines);
 //BA.debugLineNum = 5;BA.debugLine="Private LineMode, SingleMode As Boolean";
b4xtableselections._linemode = RemoteObject.createImmutable(false);__ref.setField("_linemode",b4xtableselections._linemode);
b4xtableselections._singlemode = RemoteObject.createImmutable(false);__ref.setField("_singlemode",b4xtableselections._singlemode);
 //BA.debugLineNum = 6;BA.debugLine="Private mCurrentMode As Int";
b4xtableselections._mcurrentmode = RemoteObject.createImmutable(0);__ref.setField("_mcurrentmode",b4xtableselections._mcurrentmode);
 //BA.debugLineNum = 7;BA.debugLine="Public SelectedLines As B4XOrderedMap";
b4xtableselections._selectedlines = RemoteObject.createNew ("b4j.example.b4xorderedmap");__ref.setField("_selectedlines",b4xtableselections._selectedlines);
 //BA.debugLineNum = 8;BA.debugLine="Public SelectionColor As Int";
b4xtableselections._selectioncolor = RemoteObject.createImmutable(0);__ref.setField("_selectioncolor",b4xtableselections._selectioncolor);
 //BA.debugLineNum = 9;BA.debugLine="Private mTable As B4XTable";
b4xtableselections._mtable = RemoteObject.createNew ("b4j.example.b4xtable");__ref.setField("_mtable",b4xtableselections._mtable);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xtableselections._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xtableselections._xui);
 //BA.debugLineNum = 11;BA.debugLine="Public AutoRemoveInvisibleSelections As Boolean";
b4xtableselections._autoremoveinvisibleselections = RemoteObject.createImmutable(false);__ref.setField("_autoremoveinvisibleselections",b4xtableselections._autoremoveinvisibleselections);
 //BA.debugLineNum = 12;BA.debugLine="Public SelectedTextColor As Int = xui.Color_White";
b4xtableselections._selectedtextcolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White");__ref.setField("_selectedtextcolor",b4xtableselections._selectedtextcolor);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (b4xtableselections) ","b4xtableselections",4,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "b4xtableselections","clear", __ref);}
 BA.debugLineNum = 126;BA.debugLine="Public Sub Clear";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="SelectedLines.Clear";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_selectedlines" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xorderedmap.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 128;BA.debugLine="Refresh";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.b4xtableselections.class, "_refresh" /*RemoteObject*/ );
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _firstselectedcolumnid(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FirstSelectedColumnId (b4xtableselections) ","b4xtableselections",4,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("firstselectedcolumnid")) { return __ref.runUserSub(false, "b4xtableselections","firstselectedcolumnid", __ref);}
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 146;BA.debugLine="Public Sub FirstSelectedColumnId As String";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="If SelectedLines.Size > 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_selectedlines" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 148;BA.debugLine="Dim l As List = SelectedLines.Values.Get(0)";
Debug.ShouldStop(524288);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_selectedlines" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xorderedmap.class, "_getvalues" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("l", _l);Debug.locals.put("l", _l);
 BA.debugLineNum = 149;BA.debugLine="Return l.Get(0)";
Debug.ShouldStop(1048576);
if (true) return BA.ObjectToString(_l.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 }else {
 BA.debugLineNum = 151;BA.debugLine="Return \"\"";
Debug.ShouldStop(4194304);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _firstselectedrowid(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FirstSelectedRowId (b4xtableselections) ","b4xtableselections",4,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("firstselectedrowid")) { return __ref.runUserSub(false, "b4xtableselections","firstselectedrowid", __ref);}
 BA.debugLineNum = 137;BA.debugLine="Public Sub FirstSelectedRowId As Long";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="If SelectedLines.Size > 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_selectedlines" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 139;BA.debugLine="Return SelectedLines.Keys.Get(0)";
Debug.ShouldStop(1024);
if (true) return BA.numberCast(long.class, __ref.getField(false,"_selectedlines" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 }else {
 BA.debugLineNum = 141;BA.debugLine="Return 0";
Debug.ShouldStop(4096);
if (true) return BA.numberCast(long.class, 0);
 };
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getisselected(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getIsSelected (b4xtableselections) ","b4xtableselections",4,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("getisselected")) { return __ref.runUserSub(false, "b4xtableselections","getisselected", __ref);}
 BA.debugLineNum = 132;BA.debugLine="Public Sub getIsSelected As Boolean";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="Return SelectedLines.Size > 0";
Debug.ShouldStop(16);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(false,"_selectedlines" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0)));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getMode (b4xtableselections) ","b4xtableselections",4,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("getmode")) { return __ref.runUserSub(false, "b4xtableselections","getmode", __ref);}
 BA.debugLineNum = 95;BA.debugLine="Public Sub getMode As Int";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="Return mCurrentMode";
Debug.ShouldStop(-2147483648);
if (true) return __ref.getField(true,"_mcurrentmode" /*RemoteObject*/ );
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _table) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xtableselections) ","b4xtableselections",4,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xtableselections","initialize", __ref, _ba, _table);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Table", _table);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize (Table As B4XTable)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="mTable = Table";
Debug.ShouldStop(32768);
__ref.setField ("_mtable" /*RemoteObject*/ ,_table);
 BA.debugLineNum = 17;BA.debugLine="SelectionColor = mTable.SelectionColor";
Debug.ShouldStop(65536);
__ref.setField ("_selectioncolor" /*RemoteObject*/ ,__ref.getField(false,"_mtable" /*RemoteObject*/ ).getField(true,"_selectioncolor" /*RemoteObject*/ ));
 BA.debugLineNum = 18;BA.debugLine="SelectedLines.Initialize";
Debug.ShouldStop(131072);
__ref.getField(false,"_selectedlines" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xorderedmap.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 19;BA.debugLine="mCurrentMode = MODE_SINGLE_CELL_TEMP";
Debug.ShouldStop(262144);
__ref.setField ("_mcurrentmode" /*RemoteObject*/ ,__ref.getField(true,"_mode_single_cell_temp" /*RemoteObject*/ ));
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Refresh (b4xtableselections) ","b4xtableselections",4,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("refresh")) { return __ref.runUserSub(false, "b4xtableselections","refresh", __ref);}
int _i = 0;
RemoteObject _clr = RemoteObject.createImmutable(0);
RemoteObject _rowid = RemoteObject.createImmutable(0L);
RemoteObject _rowselected = RemoteObject.createImmutable(false);
RemoteObject _selectedcells = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _col = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rowstoremove = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 60;BA.debugLine="Public Sub Refresh";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="For i = 0 To mTable.VisibleRowIds.Size - 1";
Debug.ShouldStop(268435456);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mtable" /*RemoteObject*/ ).getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 62;BA.debugLine="Dim clr As Int";
Debug.ShouldStop(536870912);
_clr = RemoteObject.createImmutable(0);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 63;BA.debugLine="If i Mod 2 = 0 Then clr = mTable.EvenRowColor El";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
_clr = __ref.getField(false,"_mtable" /*RemoteObject*/ ).getField(true,"_evenrowcolor" /*RemoteObject*/ );Debug.locals.put("clr", _clr);}
else {
_clr = __ref.getField(false,"_mtable" /*RemoteObject*/ ).getField(true,"_oddrowcolor" /*RemoteObject*/ );Debug.locals.put("clr", _clr);};
 BA.debugLineNum = 64;BA.debugLine="Dim RowId As Long = mTable.VisibleRowIds.Get(i)";
Debug.ShouldStop(-2147483648);
_rowid = BA.numberCast(long.class, __ref.getField(false,"_mtable" /*RemoteObject*/ ).getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("RowId", _rowid);Debug.locals.put("RowId", _rowid);
 BA.debugLineNum = 65;BA.debugLine="Dim RowSelected As Boolean = SelectedLines.Conta";
Debug.ShouldStop(1);
_rowselected = __ref.getField(false,"_selectedlines" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xorderedmap.class, "_containskey" /*RemoteObject*/ ,(Object)((_rowid)));Debug.locals.put("RowSelected", _rowselected);Debug.locals.put("RowSelected", _rowselected);
 BA.debugLineNum = 66;BA.debugLine="If RowSelected And LineMode = False Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(".",_rowselected) && RemoteObject.solveBoolean("=",__ref.getField(true,"_linemode" /*RemoteObject*/ ),b4xtableselections.__c.getField(true,"False"))) { 
 BA.debugLineNum = 67;BA.debugLine="Dim SelectedCells As List = SelectedLines.Get(R";
Debug.ShouldStop(4);
_selectedcells = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_selectedcells = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_selectedlines" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_rowid))));Debug.locals.put("SelectedCells", _selectedcells);Debug.locals.put("SelectedCells", _selectedcells);
 };
 BA.debugLineNum = 69;BA.debugLine="For Each col As B4XTableColumn In mTable.Visible";
Debug.ShouldStop(16);
{
final RemoteObject group9 = __ref.getField(false,"_mtable" /*RemoteObject*/ ).getField(false,"_visiblecolumns" /*RemoteObject*/ );
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_col = (group9.runMethod(false,"Get",index9));Debug.locals.put("col", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 70;BA.debugLine="Dim p As B4XView = col.CellsLayouts.Get(i + 1)";
Debug.ShouldStop(32);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _col.getField(false,"CellsLayouts" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 71;BA.debugLine="Dim lbl As B4XView = p.GetView(col.LabelIndex)";
Debug.ShouldStop(64);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = _p.runMethod(false,"GetView",(Object)(_col.getField(true,"LabelIndex" /*RemoteObject*/ )));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 72;BA.debugLine="If RowSelected And (LineMode Or SelectedCells.I";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(".",_rowselected) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",__ref.getField(true,"_linemode" /*RemoteObject*/ )) || RemoteObject.solveBoolean(">",_selectedcells.runMethod(true,"IndexOf",(Object)((_col.getField(true,"Id" /*RemoteObject*/ )))),BA.numberCast(double.class, -(double) (0 + 1))))))) { 
 BA.debugLineNum = 73;BA.debugLine="p.Color = SelectionColor";
Debug.ShouldStop(256);
_p.runMethod(true,"setColor",__ref.getField(true,"_selectioncolor" /*RemoteObject*/ ));
 BA.debugLineNum = 74;BA.debugLine="lbl.TextColor = SelectedTextColor";
Debug.ShouldStop(512);
_lbl.runMethod(true,"setTextColor",__ref.getField(true,"_selectedtextcolor" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 76;BA.debugLine="p.Color = clr";
Debug.ShouldStop(2048);
_p.runMethod(true,"setColor",_clr);
 BA.debugLineNum = 77;BA.debugLine="lbl.TextColor = mTable.TextColor";
Debug.ShouldStop(4096);
_lbl.runMethod(true,"setTextColor",__ref.getField(false,"_mtable" /*RemoteObject*/ ).getField(true,"_textcolor" /*RemoteObject*/ ));
 };
 }
}Debug.locals.put("col", _col);
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 81;BA.debugLine="If AutoRemoveInvisibleSelections Then";
Debug.ShouldStop(65536);
if (__ref.getField(true,"_autoremoveinvisibleselections" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 82;BA.debugLine="Dim RowsToRemove As List";
Debug.ShouldStop(131072);
_rowstoremove = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("RowsToRemove", _rowstoremove);
 BA.debugLineNum = 83;BA.debugLine="RowsToRemove.Initialize";
Debug.ShouldStop(262144);
_rowstoremove.runVoidMethod ("Initialize");
 BA.debugLineNum = 84;BA.debugLine="For Each RowId As Long In SelectedLines.Keys";
Debug.ShouldStop(524288);
{
final RemoteObject group24 = __ref.getField(false,"_selectedlines" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ );
final int groupLen24 = group24.runMethod(true,"getSize").<Integer>get()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_rowid = BA.numberCast(long.class, group24.runMethod(false,"Get",index24));Debug.locals.put("RowId", _rowid);
Debug.locals.put("RowId", _rowid);
 BA.debugLineNum = 85;BA.debugLine="If mTable.VisibleRowIds.IndexOf(RowId) = -1 The";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mtable" /*RemoteObject*/ ).getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_rowid))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 86;BA.debugLine="RowsToRemove.Add(RowId)";
Debug.ShouldStop(2097152);
_rowstoremove.runVoidMethod ("Add",(Object)((_rowid)));
 };
 }
}Debug.locals.put("RowId", _rowid);
;
 BA.debugLineNum = 89;BA.debugLine="For Each RowId As Long In RowsToRemove";
Debug.ShouldStop(16777216);
{
final RemoteObject group29 = _rowstoremove;
final int groupLen29 = group29.runMethod(true,"getSize").<Integer>get()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_rowid = BA.numberCast(long.class, group29.runMethod(false,"Get",index29));Debug.locals.put("RowId", _rowid);
Debug.locals.put("RowId", _rowid);
 BA.debugLineNum = 90;BA.debugLine="SelectedLines.Remove(RowId)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_selectedlines" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xorderedmap.class, "_remove" /*RemoteObject*/ ,(Object)((_rowid)));
 }
}Debug.locals.put("RowId", _rowid);
;
 };
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmode(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("setMode (b4xtableselections) ","b4xtableselections",4,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("setmode")) { return __ref.runUserSub(false, "b4xtableselections","setmode", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 99;BA.debugLine="Public Sub setMode (m As Int)";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="mCurrentMode = m";
Debug.ShouldStop(8);
__ref.setField ("_mcurrentmode" /*RemoteObject*/ ,_m);
 BA.debugLineNum = 101;BA.debugLine="SelectedLines.Clear";
Debug.ShouldStop(16);
__ref.getField(false,"_selectedlines" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xorderedmap.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 102;BA.debugLine="If mCurrentMode = MODE_SINGLE_CELL_TEMP Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mcurrentmode" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_mode_single_cell_temp" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 103;BA.debugLine="mTable.SelectionColor = SelectionColor";
Debug.ShouldStop(64);
__ref.getField(false,"_mtable" /*RemoteObject*/ ).setField ("_selectioncolor" /*RemoteObject*/ ,__ref.getField(true,"_selectioncolor" /*RemoteObject*/ ));
 BA.debugLineNum = 104;BA.debugLine="mTable.HighlightSearchResults = True";
Debug.ShouldStop(128);
__ref.getField(false,"_mtable" /*RemoteObject*/ ).setField ("_highlightsearchresults" /*RemoteObject*/ ,b4xtableselections.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 106;BA.debugLine="mTable.SelectionColor = xui.Color_Transparent";
Debug.ShouldStop(512);
__ref.getField(false,"_mtable" /*RemoteObject*/ ).setField ("_selectioncolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 107;BA.debugLine="mTable.HighlightSearchResults = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_mtable" /*RemoteObject*/ ).setField ("_highlightsearchresults" /*RemoteObject*/ ,b4xtableselections.__c.getField(true,"False"));
 };
 BA.debugLineNum = 109;BA.debugLine="Select mCurrentMode";
Debug.ShouldStop(4096);
switch (BA.switchObjectToInt(__ref.getField(true,"_mcurrentmode" /*RemoteObject*/ ),__ref.getField(true,"_mode_single_cell_permanent" /*RemoteObject*/ ),__ref.getField(true,"_mode_single_line_permanent" /*RemoteObject*/ ),__ref.getField(true,"_mode_multiple_cells" /*RemoteObject*/ ),__ref.getField(true,"_mode_multiple_lines" /*RemoteObject*/ ))) {
case 0: {
 BA.debugLineNum = 111;BA.debugLine="SingleMode = True";
Debug.ShouldStop(16384);
__ref.setField ("_singlemode" /*RemoteObject*/ ,b4xtableselections.__c.getField(true,"True"));
 BA.debugLineNum = 112;BA.debugLine="LineMode = False";
Debug.ShouldStop(32768);
__ref.setField ("_linemode" /*RemoteObject*/ ,b4xtableselections.__c.getField(true,"False"));
 break; }
case 1: {
 BA.debugLineNum = 114;BA.debugLine="SingleMode = True";
Debug.ShouldStop(131072);
__ref.setField ("_singlemode" /*RemoteObject*/ ,b4xtableselections.__c.getField(true,"True"));
 BA.debugLineNum = 115;BA.debugLine="LineMode = True";
Debug.ShouldStop(262144);
__ref.setField ("_linemode" /*RemoteObject*/ ,b4xtableselections.__c.getField(true,"True"));
 break; }
case 2: {
 BA.debugLineNum = 117;BA.debugLine="SingleMode = False";
Debug.ShouldStop(1048576);
__ref.setField ("_singlemode" /*RemoteObject*/ ,b4xtableselections.__c.getField(true,"False"));
 BA.debugLineNum = 118;BA.debugLine="LineMode = False";
Debug.ShouldStop(2097152);
__ref.setField ("_linemode" /*RemoteObject*/ ,b4xtableselections.__c.getField(true,"False"));
 break; }
case 3: {
 BA.debugLineNum = 120;BA.debugLine="SingleMode = False";
Debug.ShouldStop(8388608);
__ref.setField ("_singlemode" /*RemoteObject*/ ,b4xtableselections.__c.getField(true,"False"));
 BA.debugLineNum = 121;BA.debugLine="LineMode = True";
Debug.ShouldStop(16777216);
__ref.setField ("_linemode" /*RemoteObject*/ ,b4xtableselections.__c.getField(true,"True"));
 break; }
}
;
 BA.debugLineNum = 123;BA.debugLine="Refresh";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.b4xtableselections.class, "_refresh" /*RemoteObject*/ );
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}