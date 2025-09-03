package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class inlineediting_subs_0 {


public static RemoteObject  _cellclicked(RemoteObject __ref,RemoteObject _columnid,RemoteObject _rowid) throws Exception{
try {
		Debug.PushSubsStack("CellClicked (inlineediting) ","inlineediting",6,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("cellclicked")) { return __ref.runUserSub(false, "inlineediting","cellclicked", __ref, _columnid, _rowid);}
Debug.locals.put("ColumnId", _columnid);
Debug.locals.put("RowId", _rowid);
 BA.debugLineNum = 40;BA.debugLine="Public Sub CellClicked (ColumnId As String, RowId";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="MakeCellEditable(ColumnId, RowId)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.inlineediting.class, "_makecelleditable" /*RemoteObject*/ ,(Object)(_columnid),(Object)(_rowid));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Type FocusedCell (ColumnId As String, RowId As Lo";
;
 //BA.debugLineNum = 6;BA.debugLine="Public CurrentlyFocusedCell As FocusedCell";
inlineediting._currentlyfocusedcell = RemoteObject.createNew ("b4j.example.inlineediting._focusedcell");__ref.setField("_currentlyfocusedcell",inlineediting._currentlyfocusedcell);
 //BA.debugLineNum = 7;BA.debugLine="Private mTable As B4XTable";
inlineediting._mtable = RemoteObject.createNew ("b4j.example.b4xtable");__ref.setField("_mtable",inlineediting._mtable);
 //BA.debugLineNum = 8;BA.debugLine="Private mCallback As Object";
inlineediting._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",inlineediting._mcallback);
 //BA.debugLineNum = 9;BA.debugLine="Private mEventName As String";
inlineediting._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",inlineediting._meventname);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createfocusedcell(RemoteObject __ref,RemoteObject _columnid,RemoteObject _rowid,RemoteObject _view) throws Exception{
try {
		Debug.PushSubsStack("CreateFocusedCell (inlineediting) ","inlineediting",6,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("createfocusedcell")) { return __ref.runUserSub(false, "inlineediting","createfocusedcell", __ref, _columnid, _rowid, _view);}
RemoteObject _t1 = RemoteObject.declareNull("b4j.example.inlineediting._focusedcell");
Debug.locals.put("ColumnId", _columnid);
Debug.locals.put("RowId", _rowid);
Debug.locals.put("View", _view);
 BA.debugLineNum = 85;BA.debugLine="Private Sub CreateFocusedCell (ColumnId As String,";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="Dim t1 As FocusedCell";
Debug.ShouldStop(2097152);
_t1 = RemoteObject.createNew ("b4j.example.inlineediting._focusedcell");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 87;BA.debugLine="t1.Initialize";
Debug.ShouldStop(4194304);
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 88;BA.debugLine="t1.ColumnId = ColumnId";
Debug.ShouldStop(8388608);
_t1.setField ("ColumnId" /*RemoteObject*/ ,_columnid);
 BA.debugLineNum = 89;BA.debugLine="t1.RowId = RowId";
Debug.ShouldStop(16777216);
_t1.setField ("RowId" /*RemoteObject*/ ,_rowid);
 BA.debugLineNum = 90;BA.debugLine="t1.View = View";
Debug.ShouldStop(33554432);
_t1.setField ("View" /*RemoteObject*/ ,_view);
 BA.debugLineNum = 91;BA.debugLine="Return t1";
Debug.ShouldStop(67108864);
if (true) return _t1;
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dataupdated(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DataUpdated (inlineediting) ","inlineediting",6,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("dataupdated")) { return __ref.runUserSub(false, "inlineediting","dataupdated", __ref);}
 BA.debugLineNum = 28;BA.debugLine="Public Sub DataUpdated";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="If getIsInEditingState And IsEditingViewInCorrect";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(".",__ref.runClassMethod (b4j.example.inlineediting.class, "_getisineditingstate" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.inlineediting.class, "_iseditingviewincorrectposition" /*RemoteObject*/ ),inlineediting.__c.getField(true,"False"))) { 
 BA.debugLineNum = 30;BA.debugLine="ExitEditMode";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.inlineediting.class, "_exiteditmode" /*RemoteObject*/ );
 };
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _exiteditmode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ExitEditMode (inlineediting) ","inlineediting",6,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("exiteditmode")) { return __ref.runUserSub(false, "inlineediting","exiteditmode", __ref);}
RemoteObject _c = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
RemoteObject _value = RemoteObject.declareNull("Object");
RemoteObject _parent = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 73;BA.debugLine="Public Sub ExitEditMode";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="If getIsInEditingState = False Then Return";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.inlineediting.class, "_getisineditingstate" /*RemoteObject*/ ),inlineediting.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 75;BA.debugLine="Dim c As B4XTableColumn = mTable.GetColumn(Curren";
Debug.ShouldStop(1024);
_c = __ref.getField(false,"_mtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_getcolumn" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_currentlyfocusedcell" /*RemoteObject*/ ).getField(true,"ColumnId" /*RemoteObject*/ )));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 76;BA.debugLine="Dim Value As Object = CallSub2(mCallback, mEventN";
Debug.ShouldStop(2048);
_value = inlineediting.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_GetUpdatedValue"))),(Object)((__ref.getField(false,"_currentlyfocusedcell" /*RemoteObject*/ ))));Debug.locals.put("Value", _value);Debug.locals.put("Value", _value);
 BA.debugLineNum = 77;BA.debugLine="Dim parent As B4XView = CurrentlyFocusedCell.View";
Debug.ShouldStop(4096);
_parent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_parent = __ref.getField(false,"_currentlyfocusedcell" /*RemoteObject*/ ).getField(false,"View" /*RemoteObject*/ ).runMethod(false,"getParent");Debug.locals.put("parent", _parent);Debug.locals.put("parent", _parent);
 BA.debugLineNum = 78;BA.debugLine="mTable.sql1.ExecNonQuery2($\"UPDATE data SET ${c.S";
Debug.ShouldStop(8192);
__ref.getField(false,"_mtable" /*RemoteObject*/ ).getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("UPDATE data SET "),inlineediting.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_c.getField(true,"SQLID" /*RemoteObject*/ )))),RemoteObject.createImmutable(" = ? WHERE rowid = ?")))),(Object)(inlineediting.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_value,(__ref.getField(false,"_currentlyfocusedcell" /*RemoteObject*/ ).getField(true,"RowId" /*RemoteObject*/ ))})))));
 BA.debugLineNum = 79;BA.debugLine="CurrentlyFocusedCell.RowId = 0";
Debug.ShouldStop(16384);
__ref.getField(false,"_currentlyfocusedcell" /*RemoteObject*/ ).setField ("RowId" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 80;BA.debugLine="mTable.RefreshNow";
Debug.ShouldStop(32768);
__ref.getField(false,"_mtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_refreshnow" /*RemoteObject*/ );
 BA.debugLineNum = 81;BA.debugLine="parent.GetView(c.LabelIndex).Visible = True";
Debug.ShouldStop(65536);
_parent.runMethod(false,"GetView",(Object)(_c.getField(true,"LabelIndex" /*RemoteObject*/ ))).runMethod(true,"setVisible",inlineediting.__c.getField(true,"True"));
 BA.debugLineNum = 82;BA.debugLine="CurrentlyFocusedCell.View.RemoveViewFromParent";
Debug.ShouldStop(131072);
__ref.getField(false,"_currentlyfocusedcell" /*RemoteObject*/ ).getField(false,"View" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getisineditingstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getIsInEditingState (inlineediting) ","inlineediting",6,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("getisineditingstate")) { return __ref.runUserSub(false, "inlineediting","getisineditingstate", __ref);}
 BA.debugLineNum = 19;BA.debugLine="Public Sub getIsInEditingState As Boolean";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Return CurrentlyFocusedCell.RowId > 0";
Debug.ShouldStop(524288);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(false,"_currentlyfocusedcell" /*RemoteObject*/ ).getField(true,"RowId" /*RemoteObject*/ ),BA.numberCast(long.class, 0)));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _table,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (inlineediting) ","inlineediting",6,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "inlineediting","initialize", __ref, _ba, _table, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Table", _table);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize (Table As B4XTable, Callback";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="mTable = Table";
Debug.ShouldStop(4096);
__ref.setField ("_mtable" /*RemoteObject*/ ,_table);
 BA.debugLineNum = 14;BA.debugLine="mCallback = Callback";
Debug.ShouldStop(8192);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 15;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(16384);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _iseditingviewincorrectposition(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsEditingViewInCorrectPosition (inlineediting) ","inlineediting",6,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("iseditingviewincorrectposition")) { return __ref.runUserSub(false, "inlineediting","iseditingviewincorrectposition", __ref);}
 BA.debugLineNum = 23;BA.debugLine="Private Sub IsEditingViewInCorrectPosition As Bool";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Return CurrentlyFocusedCell.VisibleIndex = mTable";
Debug.ShouldStop(8388608);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(false,"_currentlyfocusedcell" /*RemoteObject*/ ).getField(true,"VisibleIndex" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_mtable" /*RemoteObject*/ ).getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((__ref.getField(false,"_currentlyfocusedcell" /*RemoteObject*/ ).getField(true,"RowId" /*RemoteObject*/ )))))));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makecelleditable(RemoteObject __ref,RemoteObject _columnid,RemoteObject _rowid) throws Exception{
try {
		Debug.PushSubsStack("MakeCellEditable (inlineediting) ","inlineediting",6,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("makecelleditable")) { return __ref.runUserSub(false, "inlineediting","makecelleditable", __ref, _columnid, _rowid);}
Debug.locals.put("ColumnId", _columnid);
Debug.locals.put("RowId", _rowid);
 BA.debugLineNum = 44;BA.debugLine="Private Sub MakeCellEditable (ColumnId As String,";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="If getIsInEditingState And CurrentlyFocusedCell.C";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(".",__ref.runClassMethod (b4j.example.inlineediting.class, "_getisineditingstate" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",__ref.getField(false,"_currentlyfocusedcell" /*RemoteObject*/ ).getField(true,"ColumnId" /*RemoteObject*/ ),_columnid) && RemoteObject.solveBoolean("=",__ref.getField(false,"_currentlyfocusedcell" /*RemoteObject*/ ).getField(true,"RowId" /*RemoteObject*/ ),_rowid)) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 46;BA.debugLine="If getIsInEditingState Then";
Debug.ShouldStop(8192);
if (__ref.runClassMethod (b4j.example.inlineediting.class, "_getisineditingstate" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 47;BA.debugLine="ExitEditMode";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.inlineediting.class, "_exiteditmode" /*RemoteObject*/ );
 };
 BA.debugLineNum = 49;BA.debugLine="CurrentlyFocusedCell = CreateFocusedCell(ColumnId";
Debug.ShouldStop(65536);
__ref.setField ("_currentlyfocusedcell" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.inlineediting.class, "_createfocusedcell" /*RemoteObject*/ ,(Object)(_columnid),(Object)(_rowid),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), inlineediting.__c.getField(false,"Null"))));
 BA.debugLineNum = 50;BA.debugLine="CurrentlyFocusedCell.PrevValue = mTable.GetRow(Ro";
Debug.ShouldStop(131072);
__ref.getField(false,"_currentlyfocusedcell" /*RemoteObject*/ ).setField ("PrevValue" /*RemoteObject*/ ,__ref.getField(false,"_mtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_getrow" /*RemoteObject*/ ,(Object)(_rowid)).runMethod(false,"Get",(Object)((_columnid))));
 BA.debugLineNum = 51;BA.debugLine="CallSub2(mCallback, mEventName & \"_EnterEditMode\"";
Debug.ShouldStop(262144);
inlineediting.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_EnterEditMode"))),(Object)((__ref.getField(false,"_currentlyfocusedcell" /*RemoteObject*/ ))));
 BA.debugLineNum = 52;BA.debugLine="SetEditableControlLayout(CurrentlyFocusedCell)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.inlineediting.class, "_seteditablecontrollayout" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_currentlyfocusedcell" /*RemoteObject*/ )));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seteditablecontrollayout(RemoteObject __ref,RemoteObject _selectedcontrol) throws Exception{
try {
		Debug.PushSubsStack("SetEditableControlLayout (inlineediting) ","inlineediting",6,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("seteditablecontrollayout")) { return __ref.runUserSub(false, "inlineediting","seteditablecontrollayout", __ref, _selectedcontrol);}
RemoteObject _c = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("SelectedControl", _selectedcontrol);
 BA.debugLineNum = 55;BA.debugLine="Private Sub SetEditableControlLayout (SelectedCont";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Dim c As B4XTableColumn = mTable.GetColumn(Select";
Debug.ShouldStop(8388608);
_c = __ref.getField(false,"_mtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_getcolumn" /*RemoteObject*/ ,(Object)(_selectedcontrol.getField(true,"ColumnId" /*RemoteObject*/ )));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 57;BA.debugLine="CurrentlyFocusedCell.VisibleIndex = mTable.Visibl";
Debug.ShouldStop(16777216);
__ref.getField(false,"_currentlyfocusedcell" /*RemoteObject*/ ).setField ("VisibleIndex" /*RemoteObject*/ ,__ref.getField(false,"_mtable" /*RemoteObject*/ ).getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_selectedcontrol.getField(true,"RowId" /*RemoteObject*/ )))));
 BA.debugLineNum = 58;BA.debugLine="Dim p As B4XView = c.CellsLayouts.Get(CurrentlyFo";
Debug.ShouldStop(33554432);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _c.getField(false,"CellsLayouts" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_currentlyfocusedcell" /*RemoteObject*/ ).getField(true,"VisibleIndex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1))));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 59;BA.debugLine="If SelectedControl.View.Parent <> p Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("!",_selectedcontrol.getField(false,"View" /*RemoteObject*/ ).runMethod(false,"getParent"),_p)) { 
 BA.debugLineNum = 60;BA.debugLine="If p.GetView(p.NumberOfViews - 1).Tag = \"TextFlo";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_p.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1))).runMethod(false,"getTag"),RemoteObject.createImmutable(("TextFlow")))) { 
 BA.debugLineNum = 61;BA.debugLine="p.GetView(p.NumberOfViews - 1).RemoveViewFromPa";
Debug.ShouldStop(268435456);
_p.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1))).runVoidMethod ("RemoveViewFromParent");
 };
 BA.debugLineNum = 63;BA.debugLine="p.AddView(SelectedControl.View, 0, 0, p.Width, p";
Debug.ShouldStop(1073741824);
_p.runVoidMethod ("AddView",(Object)((_selectedcontrol.getField(false,"View" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_p.runMethod(true,"getWidth")),(Object)(_p.runMethod(true,"getHeight")));
 BA.debugLineNum = 64;BA.debugLine="p.GetView(c.LabelIndex).Visible = False";
Debug.ShouldStop(-2147483648);
_p.runMethod(false,"GetView",(Object)(_c.getField(true,"LabelIndex" /*RemoteObject*/ ))).runMethod(true,"setVisible",inlineediting.__c.getField(true,"False"));
 BA.debugLineNum = 65;BA.debugLine="SelectedControl.View.BringToFront";
Debug.ShouldStop(1);
_selectedcontrol.getField(false,"View" /*RemoteObject*/ ).runVoidMethod ("BringToFront");
 BA.debugLineNum = 66;BA.debugLine="CurrentlyFocusedCell.View.RequestFocus";
Debug.ShouldStop(2);
__ref.getField(false,"_currentlyfocusedcell" /*RemoteObject*/ ).getField(false,"View" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 }else {
 BA.debugLineNum = 68;BA.debugLine="SelectedControl.View.SetLayoutAnimated(0, 0, 0,";
Debug.ShouldStop(8);
_selectedcontrol.getField(false,"View" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_p.runMethod(true,"getWidth")),(Object)(_p.runMethod(true,"getHeight")));
 };
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tableresized(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TableResized (inlineediting) ","inlineediting",6,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("tableresized")) { return __ref.runUserSub(false, "inlineediting","tableresized", __ref);}
 BA.debugLineNum = 35;BA.debugLine="Public Sub TableResized";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="If getIsInEditingState Then SetEditableControlLay";
Debug.ShouldStop(8);
if (__ref.runClassMethod (b4j.example.inlineediting.class, "_getisineditingstate" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.inlineediting.class, "_seteditablecontrollayout" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_currentlyfocusedcell" /*RemoteObject*/ )));};
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}