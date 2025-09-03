package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xtableselections extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xtableselections", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xtableselections.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public int _mode_single_cell_temp = 0;
public int _mode_single_cell_permanent = 0;
public int _mode_single_line_permanent = 0;
public int _mode_multiple_cells = 0;
public int _mode_multiple_lines = 0;
public boolean _linemode = false;
public boolean _singlemode = false;
public int _mcurrentmode = 0;
public b4j.example.b4xorderedmap _selectedlines = null;
public int _selectioncolor = 0;
public b4j.example.b4xtable _mtable = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public boolean _autoremoveinvisibleselections = false;
public int _selectedtextcolor = 0;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4j.example.b4xtableselections __ref,anywheresoftware.b4a.BA _ba,b4j.example.b4xtable _table) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xtableselections";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_table}));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub Initialize (Table As B4XTable)";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="mTable = Table";
__ref._mtable /*b4j.example.b4xtable*/  = _table;
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="SelectionColor = mTable.SelectionColor";
__ref._selectioncolor /*int*/  = __ref._mtable /*b4j.example.b4xtable*/ ._selectioncolor /*int*/ ;
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="SelectedLines.Initialize";
__ref._selectedlines /*b4j.example.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="mCurrentMode = MODE_SINGLE_CELL_TEMP";
__ref._mcurrentmode /*int*/  = __ref._mode_single_cell_temp /*int*/ ;
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="End Sub";
return "";
}
public String  _setmode(b4j.example.b4xtableselections __ref,int _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtableselections";
if (Debug.shouldDelegate(ba, "setmode", false))
	 {return ((String) Debug.delegate(ba, "setmode", new Object[] {_m}));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub setMode (m As Int)";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="mCurrentMode = m";
__ref._mcurrentmode /*int*/  = _m;
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="SelectedLines.Clear";
__ref._selectedlines /*b4j.example.b4xorderedmap*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="If mCurrentMode = MODE_SINGLE_CELL_TEMP Then";
if (__ref._mcurrentmode /*int*/ ==__ref._mode_single_cell_temp /*int*/ ) { 
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="mTable.SelectionColor = SelectionColor";
__ref._mtable /*b4j.example.b4xtable*/ ._selectioncolor /*int*/  = __ref._selectioncolor /*int*/ ;
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="mTable.HighlightSearchResults = True";
__ref._mtable /*b4j.example.b4xtable*/ ._highlightsearchresults /*boolean*/  = __c.True;
 }else {
RDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="mTable.SelectionColor = xui.Color_Transparent";
__ref._mtable /*b4j.example.b4xtable*/ ._selectioncolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=4259848;
 //BA.debugLineNum = 4259848;BA.debugLine="mTable.HighlightSearchResults = False";
__ref._mtable /*b4j.example.b4xtable*/ ._highlightsearchresults /*boolean*/  = __c.False;
 };
RDebugUtils.currentLine=4259850;
 //BA.debugLineNum = 4259850;BA.debugLine="Select mCurrentMode";
switch (BA.switchObjectToInt(__ref._mcurrentmode /*int*/ ,__ref._mode_single_cell_permanent /*int*/ ,__ref._mode_single_line_permanent /*int*/ ,__ref._mode_multiple_cells /*int*/ ,__ref._mode_multiple_lines /*int*/ )) {
case 0: {
RDebugUtils.currentLine=4259852;
 //BA.debugLineNum = 4259852;BA.debugLine="SingleMode = True";
__ref._singlemode /*boolean*/  = __c.True;
RDebugUtils.currentLine=4259853;
 //BA.debugLineNum = 4259853;BA.debugLine="LineMode = False";
__ref._linemode /*boolean*/  = __c.False;
 break; }
case 1: {
RDebugUtils.currentLine=4259855;
 //BA.debugLineNum = 4259855;BA.debugLine="SingleMode = True";
__ref._singlemode /*boolean*/  = __c.True;
RDebugUtils.currentLine=4259856;
 //BA.debugLineNum = 4259856;BA.debugLine="LineMode = True";
__ref._linemode /*boolean*/  = __c.True;
 break; }
case 2: {
RDebugUtils.currentLine=4259858;
 //BA.debugLineNum = 4259858;BA.debugLine="SingleMode = False";
__ref._singlemode /*boolean*/  = __c.False;
RDebugUtils.currentLine=4259859;
 //BA.debugLineNum = 4259859;BA.debugLine="LineMode = False";
__ref._linemode /*boolean*/  = __c.False;
 break; }
case 3: {
RDebugUtils.currentLine=4259861;
 //BA.debugLineNum = 4259861;BA.debugLine="SingleMode = False";
__ref._singlemode /*boolean*/  = __c.False;
RDebugUtils.currentLine=4259862;
 //BA.debugLineNum = 4259862;BA.debugLine="LineMode = True";
__ref._linemode /*boolean*/  = __c.True;
 break; }
}
;
RDebugUtils.currentLine=4259864;
 //BA.debugLineNum = 4259864;BA.debugLine="Refresh";
__ref._refresh /*String*/ (null);
RDebugUtils.currentLine=4259865;
 //BA.debugLineNum = 4259865;BA.debugLine="End Sub";
return "";
}
public long  _firstselectedrowid(b4j.example.b4xtableselections __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtableselections";
if (Debug.shouldDelegate(ba, "firstselectedrowid", false))
	 {return ((Long) Debug.delegate(ba, "firstselectedrowid", null));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub FirstSelectedRowId As Long";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="If SelectedLines.Size > 0 Then";
if (__ref._selectedlines /*b4j.example.b4xorderedmap*/ ._getsize /*int*/ (null)>0) { 
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="Return SelectedLines.Keys.Get(0)";
if (true) return BA.ObjectToLongNumber(__ref._selectedlines /*b4j.example.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (0)));
 }else {
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="End Sub";
return 0L;
}
public String  _cellclicked(b4j.example.b4xtableselections __ref,String _columnid,long _rowid) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtableselections";
if (Debug.shouldDelegate(ba, "cellclicked", false))
	 {return ((String) Debug.delegate(ba, "cellclicked", new Object[] {_columnid,_rowid}));}
anywheresoftware.b4a.objects.collections.List _selectedcells = null;
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub CellClicked (ColumnId As String, RowId";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="If mCurrentMode = MODE_SINGLE_CELL_TEMP Then Retu";
if (__ref._mcurrentmode /*int*/ ==__ref._mode_single_cell_temp /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=4063252;
 //BA.debugLineNum = 4063252;BA.debugLine="If SingleMode Then SelectedLines.Clear";
if (__ref._singlemode /*boolean*/ ) { 
__ref._selectedlines /*b4j.example.b4xorderedmap*/ ._clear /*String*/ (null);};
RDebugUtils.currentLine=4063253;
 //BA.debugLineNum = 4063253;BA.debugLine="If LineMode Then";
if (__ref._linemode /*boolean*/ ) { 
RDebugUtils.currentLine=4063254;
 //BA.debugLineNum = 4063254;BA.debugLine="SelectedLines.Put(RowId, \"\")";
__ref._selectedlines /*b4j.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_rowid),(Object)(""));
 }else {
RDebugUtils.currentLine=4063256;
 //BA.debugLineNum = 4063256;BA.debugLine="Dim SelectedCells As List";
_selectedcells = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4063257;
 //BA.debugLineNum = 4063257;BA.debugLine="If SelectedLines.ContainsKey(RowId) Then";
if (__ref._selectedlines /*b4j.example.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_rowid))) { 
RDebugUtils.currentLine=4063258;
 //BA.debugLineNum = 4063258;BA.debugLine="SelectedCells = SelectedLines.Get(RowId)";
_selectedcells = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._selectedlines /*b4j.example.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_rowid))));
 }else {
RDebugUtils.currentLine=4063260;
 //BA.debugLineNum = 4063260;BA.debugLine="Dim SelectedCells As List";
_selectedcells = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4063261;
 //BA.debugLineNum = 4063261;BA.debugLine="SelectedCells.Initialize";
_selectedcells.Initialize();
RDebugUtils.currentLine=4063262;
 //BA.debugLineNum = 4063262;BA.debugLine="SelectedLines.Put(RowId, SelectedCells)";
__ref._selectedlines /*b4j.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_rowid),(Object)(_selectedcells.getObject()));
 };
RDebugUtils.currentLine=4063264;
 //BA.debugLineNum = 4063264;BA.debugLine="SelectedCells.Add(ColumnId)";
_selectedcells.Add((Object)(_columnid));
 };
RDebugUtils.currentLine=4063267;
 //BA.debugLineNum = 4063267;BA.debugLine="Refresh";
__ref._refresh /*String*/ (null);
RDebugUtils.currentLine=4063268;
 //BA.debugLineNum = 4063268;BA.debugLine="End Sub";
return "";
}
public String  _refresh(b4j.example.b4xtableselections __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtableselections";
if (Debug.shouldDelegate(ba, "refresh", false))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
int _i = 0;
int _clr = 0;
long _rowid = 0L;
boolean _rowselected = false;
anywheresoftware.b4a.objects.collections.List _selectedcells = null;
b4j.example.b4xtable._b4xtablecolumn _col = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
anywheresoftware.b4a.objects.collections.List _rowstoremove = null;
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub Refresh";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="For i = 0 To mTable.VisibleRowIds.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._mtable /*b4j.example.b4xtable*/ ._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="Dim clr As Int";
_clr = 0;
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="If i Mod 2 = 0 Then clr = mTable.EvenRowColor El";
if (_i%2==0) { 
_clr = __ref._mtable /*b4j.example.b4xtable*/ ._evenrowcolor /*int*/ ;}
else {
_clr = __ref._mtable /*b4j.example.b4xtable*/ ._oddrowcolor /*int*/ ;};
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="Dim RowId As Long = mTable.VisibleRowIds.Get(i)";
_rowid = BA.ObjectToLongNumber(__ref._mtable /*b4j.example.b4xtable*/ ._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="Dim RowSelected As Boolean = SelectedLines.Conta";
_rowselected = __ref._selectedlines /*b4j.example.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_rowid));
RDebugUtils.currentLine=4128774;
 //BA.debugLineNum = 4128774;BA.debugLine="If RowSelected And LineMode = False Then";
if (_rowselected && __ref._linemode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="Dim SelectedCells As List = SelectedLines.Get(R";
_selectedcells = new anywheresoftware.b4a.objects.collections.List();
_selectedcells = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._selectedlines /*b4j.example.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_rowid))));
 };
RDebugUtils.currentLine=4128777;
 //BA.debugLineNum = 4128777;BA.debugLine="For Each col As B4XTableColumn In mTable.Visible";
{
final anywheresoftware.b4a.BA.IterableList group9 = __ref._mtable /*b4j.example.b4xtable*/ ._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_col = (b4j.example.b4xtable._b4xtablecolumn)(group9.Get(index9));
RDebugUtils.currentLine=4128778;
 //BA.debugLineNum = 4128778;BA.debugLine="Dim p As B4XView = col.CellsLayouts.Get(i + 1)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_col.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_i+1))));
RDebugUtils.currentLine=4128779;
 //BA.debugLineNum = 4128779;BA.debugLine="Dim lbl As B4XView = p.GetView(col.LabelIndex)";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = _p.GetView(_col.LabelIndex /*int*/ );
RDebugUtils.currentLine=4128780;
 //BA.debugLineNum = 4128780;BA.debugLine="If RowSelected And (LineMode Or SelectedCells.I";
if (_rowselected && (__ref._linemode /*boolean*/  || _selectedcells.IndexOf((Object)(_col.Id /*String*/ ))>-1)) { 
RDebugUtils.currentLine=4128781;
 //BA.debugLineNum = 4128781;BA.debugLine="p.Color = SelectionColor";
_p.setColor(__ref._selectioncolor /*int*/ );
RDebugUtils.currentLine=4128782;
 //BA.debugLineNum = 4128782;BA.debugLine="lbl.TextColor = SelectedTextColor";
_lbl.setTextColor(__ref._selectedtextcolor /*int*/ );
 }else {
RDebugUtils.currentLine=4128784;
 //BA.debugLineNum = 4128784;BA.debugLine="p.Color = clr";
_p.setColor(_clr);
RDebugUtils.currentLine=4128785;
 //BA.debugLineNum = 4128785;BA.debugLine="lbl.TextColor = mTable.TextColor";
_lbl.setTextColor(__ref._mtable /*b4j.example.b4xtable*/ ._textcolor /*int*/ );
 };
 }
};
 }
};
RDebugUtils.currentLine=4128789;
 //BA.debugLineNum = 4128789;BA.debugLine="If AutoRemoveInvisibleSelections Then";
if (__ref._autoremoveinvisibleselections /*boolean*/ ) { 
RDebugUtils.currentLine=4128790;
 //BA.debugLineNum = 4128790;BA.debugLine="Dim RowsToRemove As List";
_rowstoremove = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4128791;
 //BA.debugLineNum = 4128791;BA.debugLine="RowsToRemove.Initialize";
_rowstoremove.Initialize();
RDebugUtils.currentLine=4128792;
 //BA.debugLineNum = 4128792;BA.debugLine="For Each RowId As Long In SelectedLines.Keys";
{
final anywheresoftware.b4a.BA.IterableList group24 = __ref._selectedlines /*b4j.example.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen24 = group24.getSize()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_rowid = BA.ObjectToLongNumber(group24.Get(index24));
RDebugUtils.currentLine=4128793;
 //BA.debugLineNum = 4128793;BA.debugLine="If mTable.VisibleRowIds.IndexOf(RowId) = -1 The";
if (__ref._mtable /*b4j.example.b4xtable*/ ._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_rowid))==-1) { 
RDebugUtils.currentLine=4128794;
 //BA.debugLineNum = 4128794;BA.debugLine="RowsToRemove.Add(RowId)";
_rowstoremove.Add((Object)(_rowid));
 };
 }
};
RDebugUtils.currentLine=4128797;
 //BA.debugLineNum = 4128797;BA.debugLine="For Each RowId As Long In RowsToRemove";
{
final anywheresoftware.b4a.BA.IterableList group29 = _rowstoremove;
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_rowid = BA.ObjectToLongNumber(group29.Get(index29));
RDebugUtils.currentLine=4128798;
 //BA.debugLineNum = 4128798;BA.debugLine="SelectedLines.Remove(RowId)";
__ref._selectedlines /*b4j.example.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_rowid));
 }
};
 };
RDebugUtils.currentLine=4128801;
 //BA.debugLineNum = 4128801;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xtableselections __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtableselections";
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Public MODE_SINGLE_CELL_TEMP = 1, MODE_SINGLE_CEL";
_mode_single_cell_temp = (int) (1);
_mode_single_cell_permanent = (int) (2);
_mode_single_line_permanent = (int) (3);
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Public MODE_MULTIPLE_CELLS = 4, MODE_MULTIPLE_LIN";
_mode_multiple_cells = (int) (4);
_mode_multiple_lines = (int) (5);
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="Private LineMode, SingleMode As Boolean";
_linemode = false;
_singlemode = false;
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="Private mCurrentMode As Int";
_mcurrentmode = 0;
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="Public SelectedLines As B4XOrderedMap";
_selectedlines = new b4j.example.b4xorderedmap();
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="Public SelectionColor As Int";
_selectioncolor = 0;
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="Private mTable As B4XTable";
_mtable = new b4j.example.b4xtable();
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="Public AutoRemoveInvisibleSelections As Boolean";
_autoremoveinvisibleselections = false;
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="Public SelectedTextColor As Int = xui.Color_White";
_selectedtextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=3932171;
 //BA.debugLineNum = 3932171;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.example.b4xtableselections __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtableselections";
if (Debug.shouldDelegate(ba, "clear", false))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="SelectedLines.Clear";
__ref._selectedlines /*b4j.example.b4xorderedmap*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="Refresh";
__ref._refresh /*String*/ (null);
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="End Sub";
return "";
}
public String  _firstselectedcolumnid(b4j.example.b4xtableselections __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtableselections";
if (Debug.shouldDelegate(ba, "firstselectedcolumnid", false))
	 {return ((String) Debug.delegate(ba, "firstselectedcolumnid", null));}
anywheresoftware.b4a.objects.collections.List _l = null;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub FirstSelectedColumnId As String";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="If SelectedLines.Size > 0 Then";
if (__ref._selectedlines /*b4j.example.b4xorderedmap*/ ._getsize /*int*/ (null)>0) { 
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Dim l As List = SelectedLines.Values.Get(0)";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._selectedlines /*b4j.example.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (0))));
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="Return l.Get(0)";
if (true) return BA.ObjectToString(_l.Get((int) (0)));
 }else {
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="End Sub";
return "";
}
public boolean  _getisselected(b4j.example.b4xtableselections __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtableselections";
if (Debug.shouldDelegate(ba, "getisselected", false))
	 {return ((Boolean) Debug.delegate(ba, "getisselected", null));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub getIsSelected As Boolean";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Return SelectedLines.Size > 0";
if (true) return __ref._selectedlines /*b4j.example.b4xorderedmap*/ ._getsize /*int*/ (null)>0;
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="End Sub";
return false;
}
public int  _getmode(b4j.example.b4xtableselections __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtableselections";
if (Debug.shouldDelegate(ba, "getmode", false))
	 {return ((Integer) Debug.delegate(ba, "getmode", null));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub getMode As Int";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Return mCurrentMode";
if (true) return __ref._mcurrentmode /*int*/ ;
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="End Sub";
return 0;
}
}