package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class inlineediting extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.inlineediting", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.inlineediting.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _focusedcell{
public boolean IsInitialized;
public String ColumnId;
public long RowId;
public anywheresoftware.b4a.objects.B4XViewWrapper View;
public int VisibleIndex;
public Object PrevValue;
public Object Tag;
public void Initialize() {
IsInitialized = true;
ColumnId = "";
RowId = 0L;
View = new anywheresoftware.b4a.objects.B4XViewWrapper();
VisibleIndex = 0;
PrevValue = new Object();
Tag = new Object();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.inlineediting._focusedcell _currentlyfocusedcell = null;
public b4j.example.b4xtable _mtable = null;
public Object _mcallback = null;
public String _meventname = "";
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _exiteditmode(b4j.example.inlineediting __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inlineediting";
if (Debug.shouldDelegate(ba, "exiteditmode", false))
	 {return ((String) Debug.delegate(ba, "exiteditmode", null));}
b4j.example.b4xtable._b4xtablecolumn _c = null;
Object _value = null;
anywheresoftware.b4a.objects.B4XViewWrapper _parent = null;
RDebugUtils.currentLine=47316992;
 //BA.debugLineNum = 47316992;BA.debugLine="Public Sub ExitEditMode";
RDebugUtils.currentLine=47316993;
 //BA.debugLineNum = 47316993;BA.debugLine="If getIsInEditingState = False Then Return";
if (__ref._getisineditingstate /*boolean*/ (null)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=47316994;
 //BA.debugLineNum = 47316994;BA.debugLine="Dim c As B4XTableColumn = mTable.GetColumn(Curren";
_c = __ref._mtable /*b4j.example.b4xtable*/ ._getcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,__ref._currentlyfocusedcell /*b4j.example.inlineediting._focusedcell*/ .ColumnId /*String*/ );
RDebugUtils.currentLine=47316995;
 //BA.debugLineNum = 47316995;BA.debugLine="Dim Value As Object = CallSub2(mCallback, mEventN";
_value = __c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_GetUpdatedValue",(Object)(__ref._currentlyfocusedcell /*b4j.example.inlineediting._focusedcell*/ ));
RDebugUtils.currentLine=47316996;
 //BA.debugLineNum = 47316996;BA.debugLine="Dim parent As B4XView = CurrentlyFocusedCell.View";
_parent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_parent = __ref._currentlyfocusedcell /*b4j.example.inlineediting._focusedcell*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent();
RDebugUtils.currentLine=47316997;
 //BA.debugLineNum = 47316997;BA.debugLine="mTable.sql1.ExecNonQuery2($\"UPDATE data SET ${c.S";
__ref._mtable /*b4j.example.b4xtable*/ ._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("UPDATE data SET "+__c.SmartStringFormatter("",(Object)(_c.SQLID /*String*/ ))+" = ? WHERE rowid = ?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_value,(Object)(__ref._currentlyfocusedcell /*b4j.example.inlineediting._focusedcell*/ .RowId /*long*/ )}));
RDebugUtils.currentLine=47316998;
 //BA.debugLineNum = 47316998;BA.debugLine="CurrentlyFocusedCell.RowId = 0";
__ref._currentlyfocusedcell /*b4j.example.inlineediting._focusedcell*/ .RowId /*long*/  = (long) (0);
RDebugUtils.currentLine=47316999;
 //BA.debugLineNum = 47316999;BA.debugLine="mTable.RefreshNow";
__ref._mtable /*b4j.example.b4xtable*/ ._refreshnow /*String*/ (null);
RDebugUtils.currentLine=47317000;
 //BA.debugLineNum = 47317000;BA.debugLine="parent.GetView(c.LabelIndex).Visible = True";
_parent.GetView(_c.LabelIndex /*int*/ ).setVisible(__c.True);
RDebugUtils.currentLine=47317001;
 //BA.debugLineNum = 47317001;BA.debugLine="CurrentlyFocusedCell.View.RemoveViewFromParent";
__ref._currentlyfocusedcell /*b4j.example.inlineediting._focusedcell*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=47317002;
 //BA.debugLineNum = 47317002;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.inlineediting __ref,anywheresoftware.b4a.BA _ba,b4j.example.b4xtable _table,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="inlineediting";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_table,_callback,_eventname}));}
RDebugUtils.currentLine=46792704;
 //BA.debugLineNum = 46792704;BA.debugLine="Public Sub Initialize (Table As B4XTable, Callback";
RDebugUtils.currentLine=46792705;
 //BA.debugLineNum = 46792705;BA.debugLine="mTable = Table";
__ref._mtable /*b4j.example.b4xtable*/  = _table;
RDebugUtils.currentLine=46792706;
 //BA.debugLineNum = 46792706;BA.debugLine="mCallback = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=46792707;
 //BA.debugLineNum = 46792707;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=46792708;
 //BA.debugLineNum = 46792708;BA.debugLine="End Sub";
return "";
}
public String  _tableresized(b4j.example.inlineediting __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inlineediting";
if (Debug.shouldDelegate(ba, "tableresized", false))
	 {return ((String) Debug.delegate(ba, "tableresized", null));}
RDebugUtils.currentLine=47054848;
 //BA.debugLineNum = 47054848;BA.debugLine="Public Sub TableResized";
RDebugUtils.currentLine=47054849;
 //BA.debugLineNum = 47054849;BA.debugLine="If getIsInEditingState Then SetEditableControlLay";
if (__ref._getisineditingstate /*boolean*/ (null)) { 
__ref._seteditablecontrollayout /*String*/ (null,__ref._currentlyfocusedcell /*b4j.example.inlineediting._focusedcell*/ );};
RDebugUtils.currentLine=47054850;
 //BA.debugLineNum = 47054850;BA.debugLine="End Sub";
return "";
}
public String  _cellclicked(b4j.example.inlineediting __ref,String _columnid,long _rowid) throws Exception{
__ref = this;
RDebugUtils.currentModule="inlineediting";
if (Debug.shouldDelegate(ba, "cellclicked", false))
	 {return ((String) Debug.delegate(ba, "cellclicked", new Object[] {_columnid,_rowid}));}
RDebugUtils.currentLine=47120384;
 //BA.debugLineNum = 47120384;BA.debugLine="Public Sub CellClicked (ColumnId As String, RowId";
RDebugUtils.currentLine=47120385;
 //BA.debugLineNum = 47120385;BA.debugLine="MakeCellEditable(ColumnId, RowId)";
__ref._makecelleditable /*String*/ (null,_columnid,_rowid);
RDebugUtils.currentLine=47120386;
 //BA.debugLineNum = 47120386;BA.debugLine="End Sub";
return "";
}
public String  _dataupdated(b4j.example.inlineediting __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inlineediting";
if (Debug.shouldDelegate(ba, "dataupdated", false))
	 {return ((String) Debug.delegate(ba, "dataupdated", null));}
RDebugUtils.currentLine=46989312;
 //BA.debugLineNum = 46989312;BA.debugLine="Public Sub DataUpdated";
RDebugUtils.currentLine=46989313;
 //BA.debugLineNum = 46989313;BA.debugLine="If getIsInEditingState And IsEditingViewInCorrect";
if (__ref._getisineditingstate /*boolean*/ (null) && __ref._iseditingviewincorrectposition /*boolean*/ (null)==__c.False) { 
RDebugUtils.currentLine=46989314;
 //BA.debugLineNum = 46989314;BA.debugLine="ExitEditMode";
__ref._exiteditmode /*String*/ (null);
 };
RDebugUtils.currentLine=46989316;
 //BA.debugLineNum = 46989316;BA.debugLine="End Sub";
return "";
}
public String  _makecelleditable(b4j.example.inlineediting __ref,String _columnid,long _rowid) throws Exception{
__ref = this;
RDebugUtils.currentModule="inlineediting";
if (Debug.shouldDelegate(ba, "makecelleditable", false))
	 {return ((String) Debug.delegate(ba, "makecelleditable", new Object[] {_columnid,_rowid}));}
RDebugUtils.currentLine=47185920;
 //BA.debugLineNum = 47185920;BA.debugLine="Private Sub MakeCellEditable (ColumnId As String,";
RDebugUtils.currentLine=47185921;
 //BA.debugLineNum = 47185921;BA.debugLine="If getIsInEditingState And CurrentlyFocusedCell.C";
if (__ref._getisineditingstate /*boolean*/ (null) && (__ref._currentlyfocusedcell /*b4j.example.inlineediting._focusedcell*/ .ColumnId /*String*/ ).equals(_columnid) && __ref._currentlyfocusedcell /*b4j.example.inlineediting._focusedcell*/ .RowId /*long*/ ==_rowid) { 
if (true) return "";};
RDebugUtils.currentLine=47185922;
 //BA.debugLineNum = 47185922;BA.debugLine="If getIsInEditingState Then";
if (__ref._getisineditingstate /*boolean*/ (null)) { 
RDebugUtils.currentLine=47185923;
 //BA.debugLineNum = 47185923;BA.debugLine="ExitEditMode";
__ref._exiteditmode /*String*/ (null);
 };
RDebugUtils.currentLine=47185925;
 //BA.debugLineNum = 47185925;BA.debugLine="CurrentlyFocusedCell = CreateFocusedCell(ColumnId";
__ref._currentlyfocusedcell /*b4j.example.inlineediting._focusedcell*/  = __ref._createfocusedcell /*b4j.example.inlineediting._focusedcell*/ (null,_columnid,_rowid,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Null)));
RDebugUtils.currentLine=47185926;
 //BA.debugLineNum = 47185926;BA.debugLine="CurrentlyFocusedCell.PrevValue = mTable.GetRow(Ro";
__ref._currentlyfocusedcell /*b4j.example.inlineediting._focusedcell*/ .PrevValue /*Object*/  = __ref._mtable /*b4j.example.b4xtable*/ ._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rowid).Get((Object)(_columnid));
RDebugUtils.currentLine=47185927;
 //BA.debugLineNum = 47185927;BA.debugLine="CallSub2(mCallback, mEventName & \"_EnterEditMode\"";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_EnterEditMode",(Object)(__ref._currentlyfocusedcell /*b4j.example.inlineediting._focusedcell*/ ));
RDebugUtils.currentLine=47185928;
 //BA.debugLineNum = 47185928;BA.debugLine="SetEditableControlLayout(CurrentlyFocusedCell)";
__ref._seteditablecontrollayout /*String*/ (null,__ref._currentlyfocusedcell /*b4j.example.inlineediting._focusedcell*/ );
RDebugUtils.currentLine=47185929;
 //BA.debugLineNum = 47185929;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.inlineediting __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inlineediting";
RDebugUtils.currentLine=46727168;
 //BA.debugLineNum = 46727168;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=46727169;
 //BA.debugLineNum = 46727169;BA.debugLine="Type FocusedCell (ColumnId As String, RowId As Lo";
;
RDebugUtils.currentLine=46727170;
 //BA.debugLineNum = 46727170;BA.debugLine="Public CurrentlyFocusedCell As FocusedCell";
_currentlyfocusedcell = new b4j.example.inlineediting._focusedcell();
RDebugUtils.currentLine=46727171;
 //BA.debugLineNum = 46727171;BA.debugLine="Private mTable As B4XTable";
_mtable = new b4j.example.b4xtable();
RDebugUtils.currentLine=46727172;
 //BA.debugLineNum = 46727172;BA.debugLine="Private mCallback As Object";
_mcallback = new Object();
RDebugUtils.currentLine=46727173;
 //BA.debugLineNum = 46727173;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=46727174;
 //BA.debugLineNum = 46727174;BA.debugLine="End Sub";
return "";
}
public b4j.example.inlineediting._focusedcell  _createfocusedcell(b4j.example.inlineediting __ref,String _columnid,long _rowid,anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
__ref = this;
RDebugUtils.currentModule="inlineediting";
if (Debug.shouldDelegate(ba, "createfocusedcell", false))
	 {return ((b4j.example.inlineediting._focusedcell) Debug.delegate(ba, "createfocusedcell", new Object[] {_columnid,_rowid,_view}));}
b4j.example.inlineediting._focusedcell _t1 = null;
RDebugUtils.currentLine=47382528;
 //BA.debugLineNum = 47382528;BA.debugLine="Private Sub CreateFocusedCell (ColumnId As String,";
RDebugUtils.currentLine=47382529;
 //BA.debugLineNum = 47382529;BA.debugLine="Dim t1 As FocusedCell";
_t1 = new b4j.example.inlineediting._focusedcell();
RDebugUtils.currentLine=47382530;
 //BA.debugLineNum = 47382530;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=47382531;
 //BA.debugLineNum = 47382531;BA.debugLine="t1.ColumnId = ColumnId";
_t1.ColumnId /*String*/  = _columnid;
RDebugUtils.currentLine=47382532;
 //BA.debugLineNum = 47382532;BA.debugLine="t1.RowId = RowId";
_t1.RowId /*long*/  = _rowid;
RDebugUtils.currentLine=47382533;
 //BA.debugLineNum = 47382533;BA.debugLine="t1.View = View";
_t1.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _view;
RDebugUtils.currentLine=47382534;
 //BA.debugLineNum = 47382534;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=47382535;
 //BA.debugLineNum = 47382535;BA.debugLine="End Sub";
return null;
}
public boolean  _getisineditingstate(b4j.example.inlineediting __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inlineediting";
if (Debug.shouldDelegate(ba, "getisineditingstate", false))
	 {return ((Boolean) Debug.delegate(ba, "getisineditingstate", null));}
RDebugUtils.currentLine=46858240;
 //BA.debugLineNum = 46858240;BA.debugLine="Public Sub getIsInEditingState As Boolean";
RDebugUtils.currentLine=46858241;
 //BA.debugLineNum = 46858241;BA.debugLine="Return CurrentlyFocusedCell.RowId > 0";
if (true) return __ref._currentlyfocusedcell /*b4j.example.inlineediting._focusedcell*/ .RowId /*long*/ >0;
RDebugUtils.currentLine=46858242;
 //BA.debugLineNum = 46858242;BA.debugLine="End Sub";
return false;
}
public boolean  _iseditingviewincorrectposition(b4j.example.inlineediting __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inlineediting";
if (Debug.shouldDelegate(ba, "iseditingviewincorrectposition", false))
	 {return ((Boolean) Debug.delegate(ba, "iseditingviewincorrectposition", null));}
RDebugUtils.currentLine=46923776;
 //BA.debugLineNum = 46923776;BA.debugLine="Private Sub IsEditingViewInCorrectPosition As Bool";
RDebugUtils.currentLine=46923777;
 //BA.debugLineNum = 46923777;BA.debugLine="Return CurrentlyFocusedCell.VisibleIndex = mTable";
if (true) return __ref._currentlyfocusedcell /*b4j.example.inlineediting._focusedcell*/ .VisibleIndex /*int*/ ==__ref._mtable /*b4j.example.b4xtable*/ ._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(__ref._currentlyfocusedcell /*b4j.example.inlineediting._focusedcell*/ .RowId /*long*/ ));
RDebugUtils.currentLine=46923778;
 //BA.debugLineNum = 46923778;BA.debugLine="End Sub";
return false;
}
public String  _seteditablecontrollayout(b4j.example.inlineediting __ref,b4j.example.inlineediting._focusedcell _selectedcontrol) throws Exception{
__ref = this;
RDebugUtils.currentModule="inlineediting";
if (Debug.shouldDelegate(ba, "seteditablecontrollayout", false))
	 {return ((String) Debug.delegate(ba, "seteditablecontrollayout", new Object[] {_selectedcontrol}));}
b4j.example.b4xtable._b4xtablecolumn _c = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=47251456;
 //BA.debugLineNum = 47251456;BA.debugLine="Private Sub SetEditableControlLayout (SelectedCont";
RDebugUtils.currentLine=47251457;
 //BA.debugLineNum = 47251457;BA.debugLine="Dim c As B4XTableColumn = mTable.GetColumn(Select";
_c = __ref._mtable /*b4j.example.b4xtable*/ ._getcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,_selectedcontrol.ColumnId /*String*/ );
RDebugUtils.currentLine=47251458;
 //BA.debugLineNum = 47251458;BA.debugLine="CurrentlyFocusedCell.VisibleIndex = mTable.Visibl";
__ref._currentlyfocusedcell /*b4j.example.inlineediting._focusedcell*/ .VisibleIndex /*int*/  = __ref._mtable /*b4j.example.b4xtable*/ ._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_selectedcontrol.RowId /*long*/ ));
RDebugUtils.currentLine=47251459;
 //BA.debugLineNum = 47251459;BA.debugLine="Dim p As B4XView = c.CellsLayouts.Get(CurrentlyFo";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._currentlyfocusedcell /*b4j.example.inlineediting._focusedcell*/ .VisibleIndex /*int*/ +1))));
RDebugUtils.currentLine=47251460;
 //BA.debugLineNum = 47251460;BA.debugLine="If SelectedControl.View.Parent <> p Then";
if ((_selectedcontrol.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent()).equals(_p) == false) { 
RDebugUtils.currentLine=47251461;
 //BA.debugLineNum = 47251461;BA.debugLine="If p.GetView(p.NumberOfViews - 1).Tag = \"TextFlo";
if ((_p.GetView((int) (_p.getNumberOfViews()-1)).getTag()).equals((Object)("TextFlow"))) { 
RDebugUtils.currentLine=47251462;
 //BA.debugLineNum = 47251462;BA.debugLine="p.GetView(p.NumberOfViews - 1).RemoveViewFromPa";
_p.GetView((int) (_p.getNumberOfViews()-1)).RemoveViewFromParent();
 };
RDebugUtils.currentLine=47251464;
 //BA.debugLineNum = 47251464;BA.debugLine="p.AddView(SelectedControl.View, 0, 0, p.Width, p";
_p.AddView((javafx.scene.Node)(_selectedcontrol.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=47251465;
 //BA.debugLineNum = 47251465;BA.debugLine="p.GetView(c.LabelIndex).Visible = False";
_p.GetView(_c.LabelIndex /*int*/ ).setVisible(__c.False);
RDebugUtils.currentLine=47251466;
 //BA.debugLineNum = 47251466;BA.debugLine="SelectedControl.View.BringToFront";
_selectedcontrol.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=47251467;
 //BA.debugLineNum = 47251467;BA.debugLine="CurrentlyFocusedCell.View.RequestFocus";
__ref._currentlyfocusedcell /*b4j.example.inlineediting._focusedcell*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
 }else {
RDebugUtils.currentLine=47251469;
 //BA.debugLineNum = 47251469;BA.debugLine="SelectedControl.View.SetLayoutAnimated(0, 0, 0,";
_selectedcontrol.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_p.getWidth(),_p.getHeight());
 };
RDebugUtils.currentLine=47251471;
 //BA.debugLineNum = 47251471;BA.debugLine="End Sub";
return "";
}
}