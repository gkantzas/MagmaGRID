package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xtable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xtable", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xtable.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _b4xtablecolumn{
public boolean IsInitialized;
public String Title;
public String Id;
public int ColumnType;
public boolean Sortable;
public boolean Searchable;
public b4j.example.b4xformatter Formatter;
public String SQLID;
public int Width;
public int ComputedWidth;
public anywheresoftware.b4a.objects.collections.List CellsLayouts;
public anywheresoftware.b4a.objects.B4XViewWrapper Panel;
public int LabelIndex;
public boolean DisableAutoResizeLayout;
public String InternalSortMode;
public void Initialize() {
IsInitialized = true;
Title = "";
Id = "";
ColumnType = 0;
Sortable = false;
Searchable = false;
Formatter = new b4j.example.b4xformatter();
SQLID = "";
Width = 0;
ComputedWidth = 0;
CellsLayouts = new anywheresoftware.b4a.objects.collections.List();
Panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
LabelIndex = 0;
DisableAutoResizeLayout = false;
InternalSortMode = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public int _column_type_text = 0;
public int _column_type_numbers = 0;
public int _column_type_date = 0;
public int _column_type_void = 0;
public anywheresoftware.b4a.objects.collections.List _columns = null;
public anywheresoftware.b4a.objects.collections.List _visiblecolumns = null;
public int _mfirstrowindex = 0;
public int _mlastrowindex = 0;
public b4j.example.b4xformatter _defaultformatter = null;
public b4j.example.b4xformatter _defaultdataformatter = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlheader = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnltitles = null;
public b4j.example.customlistview _clvdata = null;
public int _rowheight = 0;
public int _headersheight = 0;
public boolean _allowsmallrowheightmodifications = false;
public int _mrowsperpage = 0;
public boolean _layoutloaded = false;
public int _minimumwidth = 0;
public int _sqlindex = 0;
public int _evenrowcolor = 0;
public int _oddrowcolor = 0;
public int _headertextcolor = 0;
public int _textcolor = 0;
public int _highlighttextcolor = 0;
public int _headercolor = 0;
public int _gridcolor = 0;
public boolean _highlightsearchresults = false;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _headerfont = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _labelsfont = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblfirst = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblnumber = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblnext = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbllast = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblfromto = null;
public int _countall = 0;
public int _mcurrentpage = 0;
public int _mcurrentcount = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblsort = null;
public b4j.example.b4xfloattextfield _searchfield = null;
public String _filtertext = "";
public int _sleepbeforesearch = 0;
public int _searchindex = 0;
public int _arrowsenabledcolor = 0;
public int _arrowsdisabledcolor = 0;
public anywheresoftware.b4a.objects.collections.List _visiblerowids = null;
public int _selectioncolor = 0;
public String _sqltablename = "";
public String _stringmoreavailable = "";
public String _stringnomatches = "";
public String _stringoutof = "";
public String _stringto = "";
public int _maximumrowsperpage = 0;
public boolean _prefixsearch = false;
public b4j.example.b4jtextflow _textflow = null;
public String _textpanetag = "";
public int _lastbaseheight = 0;
public int _numberoffrozencolumns = 0;
public long _lastcellclickevent = 0L;
public boolean _searchvisible = false;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public b4j.example.b4xtable._b4xtablecolumn  _addcolumn(b4j.example.b4xtable __ref,String _title,int _columntype) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "addcolumn", true))
	 {return ((b4j.example.b4xtable._b4xtablecolumn) Debug.delegate(ba, "addcolumn", new Object[] {_title,_columntype}));}
b4j.example.b4xtable._b4xtablecolumn _c = null;
anywheresoftware.b4a.objects.B4XViewWrapper _header = null;
RDebugUtils.currentLine=45809664;
 //BA.debugLineNum = 45809664;BA.debugLine="Public Sub AddColumn (Title As String, ColumnType";
RDebugUtils.currentLine=45809665;
 //BA.debugLineNum = 45809665;BA.debugLine="Dim c As B4XTableColumn";
_c = new b4j.example.b4xtable._b4xtablecolumn();
RDebugUtils.currentLine=45809666;
 //BA.debugLineNum = 45809666;BA.debugLine="c.Initialize";
_c.Initialize();
RDebugUtils.currentLine=45809667;
 //BA.debugLineNum = 45809667;BA.debugLine="c.Title = Title";
_c.Title /*String*/  = _title;
RDebugUtils.currentLine=45809668;
 //BA.debugLineNum = 45809668;BA.debugLine="c.ColumnType = ColumnType";
_c.ColumnType /*int*/  = _columntype;
RDebugUtils.currentLine=45809669;
 //BA.debugLineNum = 45809669;BA.debugLine="c.Sortable = ColumnType <> COLUMN_TYPE_VOID";
_c.Sortable /*boolean*/  = _columntype!=__ref._column_type_void /*int*/ ;
RDebugUtils.currentLine=45809670;
 //BA.debugLineNum = 45809670;BA.debugLine="c.Searchable = ColumnType = COLUMN_TYPE_TEXT";
_c.Searchable /*boolean*/  = _columntype==__ref._column_type_text /*int*/ ;
RDebugUtils.currentLine=45809671;
 //BA.debugLineNum = 45809671;BA.debugLine="c.CellsLayouts.Initialize";
_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=45809672;
 //BA.debugLineNum = 45809672;BA.debugLine="c.Formatter = DefaultDataFormatter";
_c.Formatter /*b4j.example.b4xformatter*/  = __ref._defaultdataformatter /*b4j.example.b4xformatter*/ ;
RDebugUtils.currentLine=45809673;
 //BA.debugLineNum = 45809673;BA.debugLine="c.Panel = xui.CreatePanel(\"ColumnPanel\")";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"ColumnPanel");
RDebugUtils.currentLine=45809674;
 //BA.debugLineNum = 45809674;BA.debugLine="c.Panel.Tag = c";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)(_c));
RDebugUtils.currentLine=45809675;
 //BA.debugLineNum = 45809675;BA.debugLine="c.Id = Title";
_c.Id /*String*/  = _title;
RDebugUtils.currentLine=45809676;
 //BA.debugLineNum = 45809676;BA.debugLine="Columns.Add(c)";
__ref._columns /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_c));
RDebugUtils.currentLine=45809677;
 //BA.debugLineNum = 45809677;BA.debugLine="VisibleColumns.Add(c)";
__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_c));
RDebugUtils.currentLine=45809678;
 //BA.debugLineNum = 45809678;BA.debugLine="CreateColumnLayouts(c, mRowsPerPage + 1)";
__ref._createcolumnlayouts /*String*/ (null,_c,(int) (__ref._mrowsperpage /*int*/ +1));
RDebugUtils.currentLine=45809679;
 //BA.debugLineNum = 45809679;BA.debugLine="Dim header As B4XView = GetLabelFromColumn(c, 0)";
_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_header = __ref._getlabelfromcolumn /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_c,(int) (0));
RDebugUtils.currentLine=45809680;
 //BA.debugLineNum = 45809680;BA.debugLine="SetTextOrCSBuilderToLabel (header, Title)";
__ref._settextorcsbuildertolabel /*String*/ (null,_header,(Object)(_title));
RDebugUtils.currentLine=45809681;
 //BA.debugLineNum = 45809681;BA.debugLine="If LayoutLoaded Then";
if (__ref._layoutloaded /*boolean*/ ) { 
RDebugUtils.currentLine=45809682;
 //BA.debugLineNum = 45809682;BA.debugLine="AddColumnToCLV(c)";
__ref._addcolumntoclv /*String*/ (null,_c);
 };
RDebugUtils.currentLine=45809684;
 //BA.debugLineNum = 45809684;BA.debugLine="Return c";
if (true) return _c;
RDebugUtils.currentLine=45809685;
 //BA.debugLineNum = 45809685;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xtable._b4xtablecolumn  _getcolumn(b4j.example.b4xtable __ref,String _columnid) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getcolumn", true))
	 {return ((b4j.example.b4xtable._b4xtablecolumn) Debug.delegate(ba, "getcolumn", new Object[] {_columnid}));}
b4j.example.b4xtable._b4xtablecolumn _c = null;
RDebugUtils.currentLine=45481984;
 //BA.debugLineNum = 45481984;BA.debugLine="Public Sub GetColumn (ColumnId As String) As B4XTa";
RDebugUtils.currentLine=45481985;
 //BA.debugLineNum = 45481985;BA.debugLine="For Each c As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_c = (b4j.example.b4xtable._b4xtablecolumn)(group1.Get(index1));
RDebugUtils.currentLine=45481986;
 //BA.debugLineNum = 45481986;BA.debugLine="If c.Id = ColumnId Then Return c";
if ((_c.Id /*String*/ ).equals(_columnid)) { 
if (true) return _c;};
 }
};
RDebugUtils.currentLine=45481988;
 //BA.debugLineNum = 45481988;BA.debugLine="Return c";
if (true) return _c;
RDebugUtils.currentLine=45481989;
 //BA.debugLineNum = 45481989;BA.debugLine="End Sub";
return null;
}
public String  _buildlayoutscache(b4j.example.b4xtable __ref,int _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "buildlayoutscache", true))
	 {return ((String) Debug.delegate(ba, "buildlayoutscache", new Object[] {_size}));}
b4j.example.b4xtable._b4xtablecolumn _c = null;
RDebugUtils.currentLine=45875200;
 //BA.debugLineNum = 45875200;BA.debugLine="Public Sub BuildLayoutsCache (Size As Int)";
RDebugUtils.currentLine=45875201;
 //BA.debugLineNum = 45875201;BA.debugLine="For Each c As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_c = (b4j.example.b4xtable._b4xtablecolumn)(group1.Get(index1));
RDebugUtils.currentLine=45875202;
 //BA.debugLineNum = 45875202;BA.debugLine="CreateColumnLayouts(c, Size + 1)";
__ref._createcolumnlayouts /*String*/ (null,_c,(int) (_size+1));
 }
};
RDebugUtils.currentLine=45875204;
 //BA.debugLineNum = 45875204;BA.debugLine="End Sub";
return "";
}
public String  _refresh(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "refresh", true))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
RDebugUtils.currentLine=44498944;
 //BA.debugLineNum = 44498944;BA.debugLine="Public Sub Refresh";
RDebugUtils.currentLine=44498945;
 //BA.debugLineNum = 44498945;BA.debugLine="Refresh2(True, False)";
__ref._refresh2 /*String*/ (null,__c.True,__c.False);
RDebugUtils.currentLine=44498946;
 //BA.debugLineNum = 44498946;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getrow(b4j.example.b4xtable __ref,long _rowid) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getrow", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getrow", new Object[] {_rowid}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
b4j.example.b4xtable._b4xtablecolumn _c = null;
RDebugUtils.currentLine=46661632;
 //BA.debugLineNum = 46661632;BA.debugLine="Public Sub GetRow(RowId As Long) As Map";
RDebugUtils.currentLine=46661633;
 //BA.debugLineNum = 46661633;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46661634;
 //BA.debugLineNum = 46661634;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=46661635;
 //BA.debugLineNum = 46661635;BA.debugLine="Dim rs As ResultSet = sql1.ExecQuery2(\"SELECT * F";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2("SELECT * FROM data WHERE rowid = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_rowid)}));
RDebugUtils.currentLine=46661636;
 //BA.debugLineNum = 46661636;BA.debugLine="If rs.NextRow Then";
if (_rs.NextRow()) { 
RDebugUtils.currentLine=46661637;
 //BA.debugLineNum = 46661637;BA.debugLine="For Each c As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_c = (b4j.example.b4xtable._b4xtablecolumn)(group5.Get(index5));
RDebugUtils.currentLine=46661638;
 //BA.debugLineNum = 46661638;BA.debugLine="Select c.ColumnType";
switch (BA.switchObjectToInt(_c.ColumnType /*int*/ ,__ref._column_type_text /*int*/ ,__ref._column_type_numbers /*int*/ ,__ref._column_type_date /*int*/ )) {
case 0: {
RDebugUtils.currentLine=46661640;
 //BA.debugLineNum = 46661640;BA.debugLine="m.Put(c.Id, rs.GetString(c.SQLID))";
_m.Put((Object)(_c.Id /*String*/ ),(Object)(_rs.GetString(_c.SQLID /*String*/ )));
 break; }
case 1: {
RDebugUtils.currentLine=46661642;
 //BA.debugLineNum = 46661642;BA.debugLine="m.Put(c.Id, rs.GetDouble(c.SQLID))";
_m.Put((Object)(_c.Id /*String*/ ),(Object)(_rs.GetDouble(_c.SQLID /*String*/ )));
 break; }
case 2: {
RDebugUtils.currentLine=46661644;
 //BA.debugLineNum = 46661644;BA.debugLine="m.Put(c.Id, rs.GetLong(c.SQLID))";
_m.Put((Object)(_c.Id /*String*/ ),(Object)(_rs.GetLong(_c.SQLID /*String*/ )));
 break; }
}
;
 }
};
 };
RDebugUtils.currentLine=46661648;
 //BA.debugLineNum = 46661648;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=46661649;
 //BA.debugLineNum = 46661649;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=46661650;
 //BA.debugLineNum = 46661650;BA.debugLine="End Sub";
return null;
}
public String  _setcurrentpage(b4j.example.b4xtable __ref,int _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "setcurrentpage", true))
	 {return ((String) Debug.delegate(ba, "setcurrentpage", new Object[] {_p}));}
RDebugUtils.currentLine=46989312;
 //BA.debugLineNum = 46989312;BA.debugLine="Public Sub setCurrentPage(p As Int)";
RDebugUtils.currentLine=46989313;
 //BA.debugLineNum = 46989313;BA.debugLine="setFirstRowIndex((p - 1) * mRowsPerPage)";
__ref._setfirstrowindex /*String*/ (null,(int) ((_p-1)*__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=46989314;
 //BA.debugLineNum = 46989314;BA.debugLine="End Sub";
return "";
}
public String  _updatetablecounters(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "updatetablecounters", true))
	 {return ((String) Debug.delegate(ba, "updatetablecounters", null));}
RDebugUtils.currentLine=45285376;
 //BA.debugLineNum = 45285376;BA.debugLine="Public Sub UpdateTableCounters";
RDebugUtils.currentLine=45285377;
 //BA.debugLineNum = 45285377;BA.debugLine="CountAll = sql1.ExecQuerySingleResult(\"SELECT cou";
__ref._countall /*int*/  = (int)(Double.parseDouble(__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult("SELECT count(*) FROM data")));
RDebugUtils.currentLine=45285378;
 //BA.debugLineNum = 45285378;BA.debugLine="UpdateData (True)";
__ref._updatedata /*String*/ (null,__c.True);
RDebugUtils.currentLine=45285379;
 //BA.debugLineNum = 45285379;BA.debugLine="End Sub";
return "";
}
public int  _getcurrentpage(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getcurrentpage", true))
	 {return ((Integer) Debug.delegate(ba, "getcurrentpage", null));}
RDebugUtils.currentLine=46923776;
 //BA.debugLineNum = 46923776;BA.debugLine="Public Sub getCurrentPage As Int";
RDebugUtils.currentLine=46923777;
 //BA.debugLineNum = 46923777;BA.debugLine="Return mCurrentPage";
if (true) return __ref._mcurrentpage /*int*/ ;
RDebugUtils.currentLine=46923778;
 //BA.debugLineNum = 46923778;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _setdata(b4j.example.b4xtable __ref,anywheresoftware.b4a.objects.collections.List _data) throws Exception{
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "setdata", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "setdata", new Object[] {_data}));}
ResumableSub_SetData rsub = new ResumableSub_SetData(this,__ref,_data);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SetData extends BA.ResumableSub {
public ResumableSub_SetData(b4j.example.b4xtable parent,b4j.example.b4xtable __ref,anywheresoftware.b4a.objects.collections.List _data) {
this.parent = parent;
this.__ref = __ref;
this._data = _data;
this.__ref = parent;
}
b4j.example.b4xtable __ref;
b4j.example.b4xtable parent;
anywheresoftware.b4a.objects.collections.List _data;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
b4j.example.b4xtable._b4xtablecolumn _column = null;
Object _lrow = null;
Object[] _row = null;
Object _senderfilter = null;
boolean _success = false;
anywheresoftware.b4a.BA.IterableList group7;
int index7;
int groupLen7;
anywheresoftware.b4a.BA.IterableList group15;
int index15;
int groupLen15;
anywheresoftware.b4a.BA.IterableList group19;
int index19;
int groupLen19;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtable";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=46006273;
 //BA.debugLineNum = 46006273;BA.debugLine="If sql1.IsInitialized Then sql1.Close";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=46006275;
 //BA.debugLineNum = 46006275;BA.debugLine="sql1.InitializeSQLite(\"\", \":memory:\", True)";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite("",":memory:",parent.__c.True);
RDebugUtils.currentLine=46006279;
 //BA.debugLineNum = 46006279;BA.debugLine="CreateTable";
__ref._createtable /*String*/ (null);
RDebugUtils.currentLine=46006280;
 //BA.debugLineNum = 46006280;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=46006281;
 //BA.debugLineNum = 46006281;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=46006282;
 //BA.debugLineNum = 46006282;BA.debugLine="sb.Append(\"INSERT INTO data VALUES (\")";
_sb.Append("INSERT INTO data VALUES (");
RDebugUtils.currentLine=46006283;
 //BA.debugLineNum = 46006283;BA.debugLine="For Each Column As B4XTableColumn In Columns";
if (true) break;

case 7:
//for
this.state = 16;
group7 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
index7 = 0;
groupLen7 = group7.getSize();
this.state = 35;
if (true) break;

case 35:
//C
this.state = 16;
if (index7 < groupLen7) {
this.state = 9;
_column = (b4j.example.b4xtable._b4xtablecolumn)(group7.Get(index7));}
if (true) break;

case 36:
//C
this.state = 35;
index7++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=46006284;
 //BA.debugLineNum = 46006284;BA.debugLine="If Column.ColumnType = COLUMN_TYPE_VOID Then Con";
if (true) break;

case 10:
//if
this.state = 15;
if (_column.ColumnType /*int*/ ==__ref._column_type_void /*int*/ ) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
this.state = 36;
if (true) break;;
if (true) break;

case 15:
//C
this.state = 36;
;
RDebugUtils.currentLine=46006285;
 //BA.debugLineNum = 46006285;BA.debugLine="sb.Append(\"?,\")";
_sb.Append("?,");
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=46006287;
 //BA.debugLineNum = 46006287;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=46006288;
 //BA.debugLineNum = 46006288;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=46006289;
 //BA.debugLineNum = 46006289;BA.debugLine="If Data.Size > 0 Then";
if (true) break;

case 17:
//if
this.state = 34;
if (_data.getSize()>0) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=46006290;
 //BA.debugLineNum = 46006290;BA.debugLine="If Data.Get(0) Is List Then";
if (true) break;

case 20:
//if
this.state = 33;
if (_data.Get((int) (0)) instanceof java.util.List) { 
this.state = 22;
}else {
this.state = 28;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=46006291;
 //BA.debugLineNum = 46006291;BA.debugLine="For Each lrow As Object In Data";
if (true) break;

case 23:
//for
this.state = 26;
group15 = _data;
index15 = 0;
groupLen15 = group15.getSize();
this.state = 37;
if (true) break;

case 37:
//C
this.state = 26;
if (index15 < groupLen15) {
this.state = 25;
_lrow = group15.Get(index15);}
if (true) break;

case 38:
//C
this.state = 37;
index15++;
if (true) break;

case 25:
//C
this.state = 38;
RDebugUtils.currentLine=46006292;
 //BA.debugLineNum = 46006292;BA.debugLine="sql1.AddNonQueryToBatch(sb.ToString, lrow)";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_lrow)));
 if (true) break;
if (true) break;

case 26:
//C
this.state = 33;
;
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=46006295;
 //BA.debugLineNum = 46006295;BA.debugLine="For Each row() As Object In Data";
if (true) break;

case 29:
//for
this.state = 32;
group19 = _data;
index19 = 0;
groupLen19 = group19.getSize();
this.state = 39;
if (true) break;

case 39:
//C
this.state = 32;
if (index19 < groupLen19) {
this.state = 31;
_row = (Object[])(group19.Get(index19));}
if (true) break;

case 40:
//C
this.state = 39;
index19++;
if (true) break;

case 31:
//C
this.state = 40;
RDebugUtils.currentLine=46006296;
 //BA.debugLineNum = 46006296;BA.debugLine="sql1.AddNonQueryToBatch(sb.ToString, row)";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(_row));
 if (true) break;
if (true) break;

case 32:
//C
this.state = 33;
;
 if (true) break;

case 33:
//C
this.state = 34;
;
 if (true) break;

case 34:
//C
this.state = -1;
;
RDebugUtils.currentLine=46006301;
 //BA.debugLineNum = 46006301;BA.debugLine="Dim SenderFilter As Object = sql1.ExecNonQueryBat";
_senderfilter = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL1");
RDebugUtils.currentLine=46006303;
 //BA.debugLineNum = 46006303;BA.debugLine="Wait For (SenderFilter) SQL1_NonQueryComplete (Su";
parent.__c.WaitFor("sql1_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "setdata"), _senderfilter);
this.state = 41;
return;
case 41:
//C
this.state = -1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=46006305;
 //BA.debugLineNum = 46006305;BA.debugLine="CountAll = Data.Size";
__ref._countall /*int*/  = _data.getSize();
RDebugUtils.currentLine=46006306;
 //BA.debugLineNum = 46006306;BA.debugLine="RefreshNow";
__ref._refreshnow /*String*/ (null);
RDebugUtils.currentLine=46006307;
 //BA.debugLineNum = 46006307;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=46006308;
 //BA.debugLineNum = 46006308;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _refreshnow(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "refreshnow", true))
	 {return ((String) Debug.delegate(ba, "refreshnow", null));}
RDebugUtils.currentLine=44564480;
 //BA.debugLineNum = 44564480;BA.debugLine="Public Sub RefreshNow";
RDebugUtils.currentLine=44564481;
 //BA.debugLineNum = 44564481;BA.debugLine="Refresh2(True, True)";
__ref._refresh2 /*String*/ (null,__c.True,__c.True);
RDebugUtils.currentLine=44564482;
 //BA.debugLineNum = 44564482;BA.debugLine="End Sub";
return "";
}
public String  _createcolumnlayouts(b4j.example.b4xtable __ref,b4j.example.b4xtable._b4xtablecolumn _c,int _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "createcolumnlayouts", true))
	 {return ((String) Debug.delegate(ba, "createcolumnlayouts", new Object[] {_c,_size}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
int _clr = 0;
int _tclr = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
RDebugUtils.currentLine=45940736;
 //BA.debugLineNum = 45940736;BA.debugLine="Private Sub CreateColumnLayouts (c As B4XTableColu";
RDebugUtils.currentLine=45940737;
 //BA.debugLineNum = 45940737;BA.debugLine="For i = c.CellsLayouts.Size To Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_size-1);
_i = _c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .getSize() ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=45940738;
 //BA.debugLineNum = 45940738;BA.debugLine="Dim p As B4XView = CreateCellViews";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._createcellviews /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null);
RDebugUtils.currentLine=45940739;
 //BA.debugLineNum = 45940739;BA.debugLine="Dim lbl As B4XView = p.GetView(c.LabelIndex)";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = _p.GetView(_c.LabelIndex /*int*/ );
RDebugUtils.currentLine=45940740;
 //BA.debugLineNum = 45940740;BA.debugLine="c.CellsLayouts.Add(p)";
_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_p.getObject()));
RDebugUtils.currentLine=45940741;
 //BA.debugLineNum = 45940741;BA.debugLine="Dim clr, tclr As Int";
_clr = 0;
_tclr = 0;
RDebugUtils.currentLine=45940742;
 //BA.debugLineNum = 45940742;BA.debugLine="Dim fnt As B4XFont";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=45940743;
 //BA.debugLineNum = 45940743;BA.debugLine="If i = 0 Then";
if (_i==0) { 
RDebugUtils.currentLine=45940744;
 //BA.debugLineNum = 45940744;BA.debugLine="clr = HeaderColor";
_clr = __ref._headercolor /*int*/ ;
RDebugUtils.currentLine=45940745;
 //BA.debugLineNum = 45940745;BA.debugLine="tclr = HeaderTextColor";
_tclr = __ref._headertextcolor /*int*/ ;
RDebugUtils.currentLine=45940746;
 //BA.debugLineNum = 45940746;BA.debugLine="fnt = HeaderFont";
_fnt = __ref._headerfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
 }else {
RDebugUtils.currentLine=45940748;
 //BA.debugLineNum = 45940748;BA.debugLine="fnt = LabelsFont";
_fnt = __ref._labelsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=45940749;
 //BA.debugLineNum = 45940749;BA.debugLine="tclr = TextColor";
_tclr = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=45940750;
 //BA.debugLineNum = 45940750;BA.debugLine="If i Mod 2 = 1 Then";
if (_i%2==1) { 
RDebugUtils.currentLine=45940751;
 //BA.debugLineNum = 45940751;BA.debugLine="clr = EvenRowColor";
_clr = __ref._evenrowcolor /*int*/ ;
 }else {
RDebugUtils.currentLine=45940753;
 //BA.debugLineNum = 45940753;BA.debugLine="clr = OddRowColor";
_clr = __ref._oddrowcolor /*int*/ ;
 };
 };
RDebugUtils.currentLine=45940756;
 //BA.debugLineNum = 45940756;BA.debugLine="lbl.Font = fnt";
_lbl.setFont(_fnt);
RDebugUtils.currentLine=45940757;
 //BA.debugLineNum = 45940757;BA.debugLine="p.SetColorAndBorder(clr, 1dip, GridColor, 0)";
_p.SetColorAndBorder(_clr,__c.DipToCurrent((int) (1)),__ref._gridcolor /*int*/ ,0);
RDebugUtils.currentLine=45940758;
 //BA.debugLineNum = 45940758;BA.debugLine="lbl.TextColor = tclr";
_lbl.setTextColor(_tclr);
RDebugUtils.currentLine=45940759;
 //BA.debugLineNum = 45940759;BA.debugLine="lbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_lbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=45940760;
 //BA.debugLineNum = 45940760;BA.debugLine="p.Tag = i";
_p.setTag((Object)(_i));
RDebugUtils.currentLine=45940761;
 //BA.debugLineNum = 45940761;BA.debugLine="c.Panel.AddView(p, 0, 0, 0, 0)";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_p.getObject()),0,0,0,0);
 }
};
RDebugUtils.currentLine=45940763;
 //BA.debugLineNum = 45940763;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getlabelfromcolumn(b4j.example.b4xtable __ref,b4j.example.b4xtable._b4xtablecolumn _c,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getlabelfromcolumn", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getlabelfromcolumn", new Object[] {_c,_index}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=45613056;
 //BA.debugLineNum = 45613056;BA.debugLine="Private Sub GetLabelFromColumn (c As B4XTableColum";
RDebugUtils.currentLine=45613057;
 //BA.debugLineNum = 45613057;BA.debugLine="Dim p As B4XView = c.CellsLayouts.Get(Index)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index)));
RDebugUtils.currentLine=45613058;
 //BA.debugLineNum = 45613058;BA.debugLine="Return p.GetView(c.LabelIndex)";
if (true) return _p.GetView(_c.LabelIndex /*int*/ );
RDebugUtils.currentLine=45613059;
 //BA.debugLineNum = 45613059;BA.debugLine="End Sub";
return null;
}
public String  _settextorcsbuildertolabel(b4j.example.b4xtable __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "settextorcsbuildertolabel", true))
	 {return ((String) Debug.delegate(ba, "settextorcsbuildertolabel", new Object[] {_xlbl,_text}));}
RDebugUtils.currentLine=46399488;
 //BA.debugLineNum = 46399488;BA.debugLine="Private Sub SetTextOrCSBuilderToLabel(xlbl As B4XV";
RDebugUtils.currentLine=46399490;
 //BA.debugLineNum = 46399490;BA.debugLine="xlbl.Text = Text";
_xlbl.setText(BA.ObjectToString(_text));
RDebugUtils.currentLine=46399500;
 //BA.debugLineNum = 46399500;BA.debugLine="End Sub";
return "";
}
public String  _addcolumntoclv(b4j.example.b4xtable __ref,b4j.example.b4xtable._b4xtablecolumn _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "addcolumntoclv", true))
	 {return ((String) Debug.delegate(ba, "addcolumntoclv", new Object[] {_c}));}
RDebugUtils.currentLine=45744128;
 //BA.debugLineNum = 45744128;BA.debugLine="Private Sub AddColumnToCLV (c As B4XTableColumn)";
RDebugUtils.currentLine=45744129;
 //BA.debugLineNum = 45744129;BA.debugLine="clvData.Add(c.Panel, c)";
__ref._clvdata /*b4j.example.customlistview*/ ._add(_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(Object)(_c));
RDebugUtils.currentLine=45744130;
 //BA.debugLineNum = 45744130;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4j.example.b4xtable __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=44302336;
 //BA.debugLineNum = 44302336;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=44302337;
 //BA.debugLineNum = 44302337;BA.debugLine="Refresh2 (False, False)";
__ref._refresh2 /*String*/ (null,__c.False,__c.False);
RDebugUtils.currentLine=44302338;
 //BA.debugLineNum = 44302338;BA.debugLine="End Sub";
return "";
}
public String  _refresh2(b4j.example.b4xtable __ref,boolean _refreshdata,boolean _dontsleep) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "refresh2", true))
	 {return ((String) Debug.delegate(ba, "refresh2", new Object[] {_refreshdata,_dontsleep}));}
int _prevrowsperpage = 0;
int _totalheight = 0;
int _columnindex = 0;
b4j.example.b4xtable._b4xtablecolumn _c = null;
boolean _isfrozen = false;
int _freezedwidth = 0;
int _i = 0;
float _offset = 0f;
RDebugUtils.currentLine=44630016;
 //BA.debugLineNum = 44630016;BA.debugLine="Private Sub Refresh2 (RefreshData As Boolean, Dont";
RDebugUtils.currentLine=44630017;
 //BA.debugLineNum = 44630017;BA.debugLine="If LayoutLoaded = False Or VisibleColumns.Size =";
if (__ref._layoutloaded /*boolean*/ ==__c.False || __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=44630018;
 //BA.debugLineNum = 44630018;BA.debugLine="Dim PrevRowsPerPage As Int = mRowsPerPage";
_prevrowsperpage = __ref._mrowsperpage /*int*/ ;
RDebugUtils.currentLine=44630019;
 //BA.debugLineNum = 44630019;BA.debugLine="If xui.IsB4A And LastBaseHeight <> mBase.Height T";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() && __ref._lastbaseheight /*int*/ !=__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=44630020;
 //BA.debugLineNum = 44630020;BA.debugLine="clvData.AsView.Height = clvData.AsView.Height -";
__ref._clvdata /*b4j.example.customlistview*/ ._asview().setHeight(__ref._clvdata /*b4j.example.customlistview*/ ._asview().getHeight()-(__ref._lastbaseheight /*int*/ -__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=44630021;
 //BA.debugLineNum = 44630021;BA.debugLine="clvData.Base_Resize(clvData.AsView.Width, clvDat";
__ref._clvdata /*b4j.example.customlistview*/ ._base_resize(__ref._clvdata /*b4j.example.customlistview*/ ._asview().getWidth(),__ref._clvdata /*b4j.example.customlistview*/ ._asview().getHeight());
RDebugUtils.currentLine=44630022;
 //BA.debugLineNum = 44630022;BA.debugLine="LastBaseHeight = mBase.Height";
__ref._lastbaseheight /*int*/  = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=44630024;
 //BA.debugLineNum = 44630024;BA.debugLine="Dim TotalHeight As Int = clvData.AsView.Height -";
_totalheight = (int) (__ref._clvdata /*b4j.example.customlistview*/ ._asview().getHeight()-__ref._headersheight /*int*/ );
RDebugUtils.currentLine=44630025;
 //BA.debugLineNum = 44630025;BA.debugLine="If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=44630026;
 //BA.debugLineNum = 44630026;BA.debugLine="TotalHeight = TotalHeight - 20";
_totalheight = (int) (_totalheight-20);
 };
RDebugUtils.currentLine=44630028;
 //BA.debugLineNum = 44630028;BA.debugLine="If AllowSmallRowHeightModifications Then";
if (__ref._allowsmallrowheightmodifications /*boolean*/ ) { 
RDebugUtils.currentLine=44630029;
 //BA.debugLineNum = 44630029;BA.debugLine="mRowsPerPage = Max(0, Round(TotalHeight/ RowHeig";
__ref._mrowsperpage /*int*/  = (int) (__c.Max(0,__c.Round(_totalheight/(double)__ref._rowheight /*int*/ )));
 }else {
RDebugUtils.currentLine=44630031;
 //BA.debugLineNum = 44630031;BA.debugLine="mRowsPerPage = Max(0, Floor(TotalHeight / RowHei";
__ref._mrowsperpage /*int*/  = (int) (__c.Max(0,__c.Floor(_totalheight/(double)__ref._rowheight /*int*/ )));
 };
RDebugUtils.currentLine=44630033;
 //BA.debugLineNum = 44630033;BA.debugLine="If MaximumRowsPerPage > 0 Then";
if (__ref._maximumrowsperpage /*int*/ >0) { 
RDebugUtils.currentLine=44630034;
 //BA.debugLineNum = 44630034;BA.debugLine="mRowsPerPage = Min(MaximumRowsPerPage, mRowsPerP";
__ref._mrowsperpage /*int*/  = (int) (__c.Min(__ref._maximumrowsperpage /*int*/ ,__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=44630035;
 //BA.debugLineNum = 44630035;BA.debugLine="TotalHeight = Min(TotalHeight, MaximumRowsPerPag";
_totalheight = (int) (__c.Min(_totalheight,__ref._maximumrowsperpage /*int*/ *__ref._rowheight /*int*/ ));
 };
RDebugUtils.currentLine=44630037;
 //BA.debugLineNum = 44630037;BA.debugLine="If PrevRowsPerPage <> mRowsPerPage Then RefreshDa";
if (_prevrowsperpage!=__ref._mrowsperpage /*int*/ ) { 
_refreshdata = __c.True;};
RDebugUtils.currentLine=44630038;
 //BA.debugLineNum = 44630038;BA.debugLine="CalculateWidths";
__ref._calculatewidths /*String*/ (null);
RDebugUtils.currentLine=44630039;
 //BA.debugLineNum = 44630039;BA.debugLine="Dim ColumnIndex As Int";
_columnindex = 0;
RDebugUtils.currentLine=44630041;
 //BA.debugLineNum = 44630041;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group24 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen24 = group24.getSize()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_c = (b4j.example.b4xtable._b4xtablecolumn)(group24.Get(index24));
RDebugUtils.currentLine=44630042;
 //BA.debugLineNum = 44630042;BA.debugLine="Dim IsFrozen As Boolean = ColumnIndex < NumberOf";
_isfrozen = _columnindex<__ref._numberoffrozencolumns /*int*/ ;
RDebugUtils.currentLine=44630043;
 //BA.debugLineNum = 44630043;BA.debugLine="If c.Panel.Parent.IsInitialized Then";
if (_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
RDebugUtils.currentLine=44630044;
 //BA.debugLineNum = 44630044;BA.debugLine="CheckAndRemoveColumnThatWasAddedToIncorrectPare";
__ref._checkandremovecolumnthatwasaddedtoincorrectparent /*String*/ (null,_c,_isfrozen);
 };
RDebugUtils.currentLine=44630046;
 //BA.debugLineNum = 44630046;BA.debugLine="If c.Panel.Parent.IsInitialized = False Then";
if (_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()==__c.False) { 
RDebugUtils.currentLine=44630047;
 //BA.debugLineNum = 44630047;BA.debugLine="c.Panel.Width = c.ComputedWidth";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(_c.ComputedWidth /*int*/ );
RDebugUtils.currentLine=44630048;
 //BA.debugLineNum = 44630048;BA.debugLine="If IsFrozen Then";
if (_isfrozen) { 
RDebugUtils.currentLine=44630049;
 //BA.debugLineNum = 44630049;BA.debugLine="mBase.AddView(c.Panel, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
 }else {
RDebugUtils.currentLine=44630051;
 //BA.debugLineNum = 44630051;BA.debugLine="AddColumnToCLV (c)";
__ref._addcolumntoclv /*String*/ (null,_c);
 };
 };
RDebugUtils.currentLine=44630055;
 //BA.debugLineNum = 44630055;BA.debugLine="CreateColumnLayouts(c, mRowsPerPage + 1)";
__ref._createcolumnlayouts /*String*/ (null,_c,(int) (__ref._mrowsperpage /*int*/ +1));
RDebugUtils.currentLine=44630056;
 //BA.debugLineNum = 44630056;BA.debugLine="ResizeColumnImpl(c, TotalHeight)";
__ref._resizecolumnimpl /*String*/ (null,_c,_totalheight);
RDebugUtils.currentLine=44630057;
 //BA.debugLineNum = 44630057;BA.debugLine="ColumnIndex = ColumnIndex + 1";
_columnindex = (int) (_columnindex+1);
 }
};
RDebugUtils.currentLine=44630059;
 //BA.debugLineNum = 44630059;BA.debugLine="If RefreshData Then UpdateData (DontSleep)";
if (_refreshdata) { 
__ref._updatedata /*String*/ (null,_dontsleep);};
RDebugUtils.currentLine=44630060;
 //BA.debugLineNum = 44630060;BA.debugLine="Dim FreezedWidth As Int";
_freezedwidth = 0;
RDebugUtils.currentLine=44630061;
 //BA.debugLineNum = 44630061;BA.debugLine="For i = 0 To NumberOfFrozenColumns - 1";
{
final int step43 = 1;
final int limit43 = (int) (__ref._numberoffrozencolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit43 ;_i = _i + step43 ) {
RDebugUtils.currentLine=44630062;
 //BA.debugLineNum = 44630062;BA.debugLine="Dim c As B4XTableColumn = VisibleColumns.Get(i)";
_c = (b4j.example.b4xtable._b4xtablecolumn)(__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=44630064;
 //BA.debugLineNum = 44630064;BA.debugLine="Dim offset As Float = 1";
_offset = (float) (1);
RDebugUtils.currentLine=44630068;
 //BA.debugLineNum = 44630068;BA.debugLine="c.Panel.SetLayoutAnimated(0, offset + FreezedWid";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_offset+_freezedwidth,__ref._clvdata /*b4j.example.customlistview*/ ._asview().getTop()+_offset,_c.ComputedWidth /*int*/ ,__ref._clvdata /*b4j.example.customlistview*/ ._asview().getHeight());
RDebugUtils.currentLine=44630070;
 //BA.debugLineNum = 44630070;BA.debugLine="FreezedWidth = FreezedWidth + c.ComputedWidth";
_freezedwidth = (int) (_freezedwidth+_c.ComputedWidth /*int*/ );
 }
};
RDebugUtils.currentLine=44630072;
 //BA.debugLineNum = 44630072;BA.debugLine="clvData.AsView.Left = FreezedWidth";
__ref._clvdata /*b4j.example.customlistview*/ ._asview().setLeft(_freezedwidth);
RDebugUtils.currentLine=44630073;
 //BA.debugLineNum = 44630073;BA.debugLine="If Round(clvData.AsView.Width) <> Round(mBase.Wid";
if (__c.Round(__ref._clvdata /*b4j.example.customlistview*/ ._asview().getWidth())!=__c.Round(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_freezedwidth)) { 
RDebugUtils.currentLine=44630074;
 //BA.debugLineNum = 44630074;BA.debugLine="clvData.AsView.Width = mBase.Width - FreezedWidt";
__ref._clvdata /*b4j.example.customlistview*/ ._asview().setWidth(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_freezedwidth);
RDebugUtils.currentLine=44630075;
 //BA.debugLineNum = 44630075;BA.debugLine="If xui.IsB4A Then clvData.Base_Resize(clvData.As";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
__ref._clvdata /*b4j.example.customlistview*/ ._base_resize(__ref._clvdata /*b4j.example.customlistview*/ ._asview().getWidth(),__ref._clvdata /*b4j.example.customlistview*/ ._asview().getHeight());};
 };
RDebugUtils.currentLine=44630077;
 //BA.debugLineNum = 44630077;BA.debugLine="ResizeAndReorderCLVItems";
__ref._resizeandreorderclvitems /*String*/ (null);
RDebugUtils.currentLine=44630078;
 //BA.debugLineNum = 44630078;BA.debugLine="UpdateSearchFieldVisibility";
__ref._updatesearchfieldvisibility /*void*/ (null);
RDebugUtils.currentLine=44630079;
 //BA.debugLineNum = 44630079;BA.debugLine="UpdateSortIcon";
__ref._updatesorticon /*String*/ (null);
RDebugUtils.currentLine=44630080;
 //BA.debugLineNum = 44630080;BA.debugLine="End Sub";
return "";
}
public Object[]  _buildquery(b4j.example.b4xtable __ref,boolean _withpagelimit) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "buildquery", true))
	 {return ((Object[]) Debug.delegate(ba, "buildquery", new Object[] {_withpagelimit}));}
String _sortcolumn = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
b4j.example.b4xtable._b4xtablecolumn _c = null;
anywheresoftware.b4a.objects.collections.List _args = null;
int _totalcount = 0;
int _limit = 0;
anywheresoftware.b4a.objects.collections.List _aargs = null;
RDebugUtils.currentLine=45088768;
 //BA.debugLineNum = 45088768;BA.debugLine="Public Sub BuildQuery (WithPageLimit As Boolean) A";
RDebugUtils.currentLine=45088769;
 //BA.debugLineNum = 45088769;BA.debugLine="Dim SortColumn As String";
_sortcolumn = "";
RDebugUtils.currentLine=45088770;
 //BA.debugLineNum = 45088770;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=45088771;
 //BA.debugLineNum = 45088771;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=45088772;
 //BA.debugLineNum = 45088772;BA.debugLine="sb.Append(\"SELECT rowid\")";
_sb.Append("SELECT rowid");
RDebugUtils.currentLine=45088773;
 //BA.debugLineNum = 45088773;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_c = (b4j.example.b4xtable._b4xtablecolumn)(group5.Get(index5));
RDebugUtils.currentLine=45088774;
 //BA.debugLineNum = 45088774;BA.debugLine="If c.ColumnType = COLUMN_TYPE_VOID Then Continue";
if (_c.ColumnType /*int*/ ==__ref._column_type_void /*int*/ ) { 
if (true) continue;};
RDebugUtils.currentLine=45088775;
 //BA.debugLineNum = 45088775;BA.debugLine="sb.Append(\",\").Append(c.SQLID)";
_sb.Append(",").Append(_c.SQLID /*String*/ );
RDebugUtils.currentLine=45088776;
 //BA.debugLineNum = 45088776;BA.debugLine="If c.InternalSortMode <> \"\" Then";
if ((_c.InternalSortMode /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=45088777;
 //BA.debugLineNum = 45088777;BA.debugLine="SortColumn = \" ORDER BY \" & c.SQLID & \" \" & c.I";
_sortcolumn = " ORDER BY "+_c.SQLID /*String*/ +" "+_c.InternalSortMode /*String*/ ;
 };
 }
};
RDebugUtils.currentLine=45088780;
 //BA.debugLineNum = 45088780;BA.debugLine="sb.Append(\" FROM \").Append(SQLTableName).Append(\"";
_sb.Append(" FROM ").Append(__ref._sqltablename /*String*/ ).Append(" ");
RDebugUtils.currentLine=45088781;
 //BA.debugLineNum = 45088781;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=45088782;
 //BA.debugLineNum = 45088782;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=45088783;
 //BA.debugLineNum = 45088783;BA.debugLine="Dim TotalCount As Int";
_totalcount = 0;
RDebugUtils.currentLine=45088784;
 //BA.debugLineNum = 45088784;BA.debugLine="If FilterText = \"\" Then";
if ((__ref._filtertext /*String*/ ).equals("")) { 
RDebugUtils.currentLine=45088785;
 //BA.debugLineNum = 45088785;BA.debugLine="TotalCount = CountAll";
_totalcount = __ref._countall /*int*/ ;
 }else {
RDebugUtils.currentLine=45088787;
 //BA.debugLineNum = 45088787;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group19 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_c = (b4j.example.b4xtable._b4xtablecolumn)(group19.Get(index19));
RDebugUtils.currentLine=45088788;
 //BA.debugLineNum = 45088788;BA.debugLine="If c.Searchable Then";
if (_c.Searchable /*boolean*/ ) { 
RDebugUtils.currentLine=45088789;
 //BA.debugLineNum = 45088789;BA.debugLine="If args.Size = 0 Then";
if (_args.getSize()==0) { 
RDebugUtils.currentLine=45088790;
 //BA.debugLineNum = 45088790;BA.debugLine="sb.Append(\" WHERE \")";
_sb.Append(" WHERE ");
 }else {
RDebugUtils.currentLine=45088792;
 //BA.debugLineNum = 45088792;BA.debugLine="sb.Append(\" OR \")";
_sb.Append(" OR ");
 };
RDebugUtils.currentLine=45088794;
 //BA.debugLineNum = 45088794;BA.debugLine="sb.Append(c.SQLID).Append(\" LIKE ? \")";
_sb.Append(_c.SQLID /*String*/ ).Append(" LIKE ? ");
RDebugUtils.currentLine=45088795;
 //BA.debugLineNum = 45088795;BA.debugLine="If PrefixSearch Then";
if (__ref._prefixsearch /*boolean*/ ) { 
RDebugUtils.currentLine=45088796;
 //BA.debugLineNum = 45088796;BA.debugLine="args.Add(FilterText & \"%\")";
_args.Add((Object)(__ref._filtertext /*String*/ +"%"));
 }else {
RDebugUtils.currentLine=45088798;
 //BA.debugLineNum = 45088798;BA.debugLine="args.Add(\"%\" & FilterText & \"%\")";
_args.Add((Object)("%"+__ref._filtertext /*String*/ +"%"));
 };
 };
 }
};
RDebugUtils.currentLine=45088802;
 //BA.debugLineNum = 45088802;BA.debugLine="TotalCount = -1";
_totalcount = (int) (-1);
 };
RDebugUtils.currentLine=45088804;
 //BA.debugLineNum = 45088804;BA.debugLine="If SortColumn <> \"\" Then sb.Append(SortColumn)";
if ((_sortcolumn).equals("") == false) { 
_sb.Append(_sortcolumn);};
RDebugUtils.currentLine=45088805;
 //BA.debugLineNum = 45088805;BA.debugLine="If WithPageLimit Then";
if (_withpagelimit) { 
RDebugUtils.currentLine=45088806;
 //BA.debugLineNum = 45088806;BA.debugLine="Dim limit As Int = mRowsPerPage";
_limit = __ref._mrowsperpage /*int*/ ;
RDebugUtils.currentLine=45088807;
 //BA.debugLineNum = 45088807;BA.debugLine="If TotalCount < 0 Then limit = limit + 1";
if (_totalcount<0) { 
_limit = (int) (_limit+1);};
RDebugUtils.currentLine=45088808;
 //BA.debugLineNum = 45088808;BA.debugLine="sb.Append($\" LIMIT ${mFirstRowIndex}, ${limit}\"$";
_sb.Append((" LIMIT "+__c.SmartStringFormatter("",(Object)(__ref._mfirstrowindex /*int*/ ))+", "+__c.SmartStringFormatter("",(Object)(_limit))+""));
 };
RDebugUtils.currentLine=45088816;
 //BA.debugLineNum = 45088816;BA.debugLine="Dim aargs As List = args";
_aargs = new anywheresoftware.b4a.objects.collections.List();
_aargs = _args;
RDebugUtils.currentLine=45088818;
 //BA.debugLineNum = 45088818;BA.debugLine="Return Array(sb.ToString, aargs, TotalCount)";
if (true) return new Object[]{(Object)(_sb.ToString()),(Object)(_aargs.getObject()),(Object)(_totalcount)};
RDebugUtils.currentLine=45088819;
 //BA.debugLineNum = 45088819;BA.debugLine="End Sub";
return null;
}
public String  _calculatewidths(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "calculatewidths", true))
	 {return ((String) Debug.delegate(ba, "calculatewidths", null));}
int _wildcardcount = 0;
int _totalexplicitwidth = 0;
b4j.example.b4xtable._b4xtablecolumn _c = null;
int _wildcardwidth = 0;
int _width = 0;
int _remainder = 0;
RDebugUtils.currentLine=45678592;
 //BA.debugLineNum = 45678592;BA.debugLine="Private Sub CalculateWidths";
RDebugUtils.currentLine=45678593;
 //BA.debugLineNum = 45678593;BA.debugLine="Dim wildcardcount As Int";
_wildcardcount = 0;
RDebugUtils.currentLine=45678594;
 //BA.debugLineNum = 45678594;BA.debugLine="Dim TotalExplicitWidth As Int";
_totalexplicitwidth = 0;
RDebugUtils.currentLine=45678595;
 //BA.debugLineNum = 45678595;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_c = (b4j.example.b4xtable._b4xtablecolumn)(group3.Get(index3));
RDebugUtils.currentLine=45678596;
 //BA.debugLineNum = 45678596;BA.debugLine="If c.Width = 0 Then wildcardcount = wildcardcoun";
if (_c.Width /*int*/ ==0) { 
_wildcardcount = (int) (_wildcardcount+1);}
else {
_c.ComputedWidth /*int*/  = _c.Width /*int*/ ;};
RDebugUtils.currentLine=45678597;
 //BA.debugLineNum = 45678597;BA.debugLine="TotalExplicitWidth = TotalExplicitWidth + c.Widt";
_totalexplicitwidth = (int) (_totalexplicitwidth+_c.Width /*int*/ );
 }
};
RDebugUtils.currentLine=45678599;
 //BA.debugLineNum = 45678599;BA.debugLine="If wildcardcount = 0 Then Return";
if (_wildcardcount==0) { 
if (true) return "";};
RDebugUtils.currentLine=45678600;
 //BA.debugLineNum = 45678600;BA.debugLine="Dim WildcardWidth As Int = Max(wildcardcount * Mi";
_wildcardwidth = (int) (__c.Max(_wildcardcount*__ref._minimumwidth /*int*/ ,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (2))-_totalexplicitwidth));
RDebugUtils.currentLine=45678601;
 //BA.debugLineNum = 45678601;BA.debugLine="Dim Width As Int = WildcardWidth / wildcardcount";
_width = (int) (_wildcardwidth/(double)_wildcardcount);
RDebugUtils.currentLine=45678602;
 //BA.debugLineNum = 45678602;BA.debugLine="Dim Remainder As Int = WildcardWidth Mod wildcard";
_remainder = (int) (_wildcardwidth%_wildcardcount);
RDebugUtils.currentLine=45678603;
 //BA.debugLineNum = 45678603;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group11 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_c = (b4j.example.b4xtable._b4xtablecolumn)(group11.Get(index11));
RDebugUtils.currentLine=45678604;
 //BA.debugLineNum = 45678604;BA.debugLine="If c.Width = 0 Then";
if (_c.Width /*int*/ ==0) { 
RDebugUtils.currentLine=45678605;
 //BA.debugLineNum = 45678605;BA.debugLine="c.ComputedWidth = Width";
_c.ComputedWidth /*int*/  = _width;
RDebugUtils.currentLine=45678606;
 //BA.debugLineNum = 45678606;BA.debugLine="If Remainder > 0 Then";
if (_remainder>0) { 
RDebugUtils.currentLine=45678607;
 //BA.debugLineNum = 45678607;BA.debugLine="Remainder = Remainder - 1";
_remainder = (int) (_remainder-1);
RDebugUtils.currentLine=45678608;
 //BA.debugLineNum = 45678608;BA.debugLine="c.ComputedWidth = c.ComputedWidth + 1";
_c.ComputedWidth /*int*/  = (int) (_c.ComputedWidth /*int*/ +1);
 };
 };
 }
};
RDebugUtils.currentLine=45678612;
 //BA.debugLineNum = 45678612;BA.debugLine="End Sub";
return "";
}
public String  _cell_mouseclicked(b4j.example.b4xtable __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "cell_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "cell_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=46268416;
 //BA.debugLineNum = 46268416;BA.debugLine="Private Sub Cell_MouseClicked (EventData As MouseE";
RDebugUtils.currentLine=46268417;
 //BA.debugLineNum = 46268417;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=46268418;
 //BA.debugLineNum = 46268418;BA.debugLine="CellClicked(Sender, EventData.SecondaryButtonPres";
__ref._cellclicked /*void*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))),_eventdata.getSecondaryButtonPressed());
RDebugUtils.currentLine=46268419;
 //BA.debugLineNum = 46268419;BA.debugLine="End Sub";
return "";
}
public void  _cellclicked(b4j.example.b4xtable __ref,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,boolean _longclicked) throws Exception{
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "cellclicked", true))
	 {Debug.delegate(ba, "cellclicked", new Object[] {_pnl,_longclicked}); return;}
ResumableSub_CellClicked rsub = new ResumableSub_CellClicked(this,__ref,_pnl,_longclicked);
rsub.resume(ba, null);
}
public static class ResumableSub_CellClicked extends BA.ResumableSub {
public ResumableSub_CellClicked(b4j.example.b4xtable parent,b4j.example.b4xtable __ref,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,boolean _longclicked) {
this.parent = parent;
this.__ref = __ref;
this._pnl = _pnl;
this._longclicked = _longclicked;
this.__ref = parent;
}
b4j.example.b4xtable __ref;
b4j.example.b4xtable parent;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl;
boolean _longclicked;
b4j.example.b4xtable._b4xtablecolumn _column = null;
int _row = 0;
String _e = "";
long _rowid = 0L;
int _clr = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtable";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=46465025;
 //BA.debugLineNum = 46465025;BA.debugLine="If DateTime.Now < LastCellClickEvent + 20 Then Re";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.DateTime.getNow()<__ref._lastcellclickevent /*long*/ +20) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=46465026;
 //BA.debugLineNum = 46465026;BA.debugLine="LastCellClickEvent = DateTime.Now";
__ref._lastcellclickevent /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=46465027;
 //BA.debugLineNum = 46465027;BA.debugLine="Dim column As B4XTableColumn = pnl.Parent.Tag";
_column = (b4j.example.b4xtable._b4xtablecolumn)(_pnl.getParent().getTag());
RDebugUtils.currentLine=46465028;
 //BA.debugLineNum = 46465028;BA.debugLine="Dim Row As Int = pnl.Tag - 1";
_row = (int) ((double)(BA.ObjectToNumber(_pnl.getTag()))-1);
RDebugUtils.currentLine=46465029;
 //BA.debugLineNum = 46465029;BA.debugLine="Dim e As String";
_e = "";
RDebugUtils.currentLine=46465030;
 //BA.debugLineNum = 46465030;BA.debugLine="If Row = -1 Then";
if (true) break;

case 7:
//if
this.state = 61;
if (_row==-1) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=46465043;
 //BA.debugLineNum = 46465043;BA.debugLine="Else If VisibleRowIds.Size > 0 Then";
if (__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 20;
}}
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=46465031;
 //BA.debugLineNum = 46465031;BA.debugLine="If LongClicked Then";
if (true) break;

case 10:
//if
this.state = 15;
if (_longclicked) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=46465032;
 //BA.debugLineNum = 46465032;BA.debugLine="e = \"_headerlongclicked\"";
_e = "_headerlongclicked";
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=46465034;
 //BA.debugLineNum = 46465034;BA.debugLine="e = \"_headerclicked\"";
_e = "_headerclicked";
RDebugUtils.currentLine=46465035;
 //BA.debugLineNum = 46465035;BA.debugLine="HeaderClicked(column)";
__ref._headerclicked /*String*/ (null,_column);
 if (true) break;
;
RDebugUtils.currentLine=46465037;
 //BA.debugLineNum = 46465037;BA.debugLine="If xui.SubExists(mCallBack, mEventName & e, 1) T";

case 15:
//if
this.state = 18;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +_e,(int) (1))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=46465041;
 //BA.debugLineNum = 46465041;BA.debugLine="CallSub2(mCallBack, mEventName & e, column.Id)";
parent.__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +_e,(Object)(_column.Id /*String*/ ));
 if (true) break;

case 18:
//C
this.state = 61;
;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=46465044;
 //BA.debugLineNum = 46465044;BA.debugLine="Dim RowId As Long = VisibleRowIds.Get(Row)";
_rowid = BA.ObjectToLongNumber(__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=46465045;
 //BA.debugLineNum = 46465045;BA.debugLine="If RowId > 0 Then";
if (true) break;

case 21:
//if
this.state = 60;
if (_rowid>0) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=46465046;
 //BA.debugLineNum = 46465046;BA.debugLine="Dim clr As Int";
_clr = 0;
RDebugUtils.currentLine=46465047;
 //BA.debugLineNum = 46465047;BA.debugLine="If Row Mod 2 = 0 Then clr = EvenRowColor Else c";
if (true) break;

case 24:
//if
this.state = 31;
if (_row%2==0) { 
this.state = 26;
;}
else {
this.state = 28;
;}if (true) break;

case 26:
//C
this.state = 31;
_clr = __ref._evenrowcolor /*int*/ ;
if (true) break;

case 28:
//C
this.state = 31;
_clr = __ref._oddrowcolor /*int*/ ;
if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=46465049;
 //BA.debugLineNum = 46465049;BA.debugLine="If LongClicked Then";
if (true) break;

case 32:
//if
this.state = 43;
if (_longclicked) { 
this.state = 34;
}else {
this.state = 36;
}if (true) break;

case 34:
//C
this.state = 43;
RDebugUtils.currentLine=46465050;
 //BA.debugLineNum = 46465050;BA.debugLine="e = \"_CellLongClicked\"";
_e = "_CellLongClicked";
 if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=46465052;
 //BA.debugLineNum = 46465052;BA.debugLine="e = \"_cellclicked\"";
_e = "_cellclicked";
RDebugUtils.currentLine=46465053;
 //BA.debugLineNum = 46465053;BA.debugLine="If SelectionColor <> 0 Then pnl.SetColorAnimat";
if (true) break;

case 37:
//if
this.state = 42;
if (__ref._selectioncolor /*int*/ !=0) { 
this.state = 39;
;}if (true) break;

case 39:
//C
this.state = 42;
_pnl.SetColorAnimated((int) (50),_clr,__ref._selectioncolor /*int*/ );
if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;
;
RDebugUtils.currentLine=46465056;
 //BA.debugLineNum = 46465056;BA.debugLine="If xui.SubExists(mCallBack, mEventName & e, 2)";

case 43:
//if
this.state = 46;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +_e,(int) (2))) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=46465060;
 //BA.debugLineNum = 46465060;BA.debugLine="CallSub3(mCallBack, mEventName & e, column.Id,";
parent.__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +_e,(Object)(_column.Id /*String*/ ),__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
 if (true) break;
;
RDebugUtils.currentLine=46465062;
 //BA.debugLineNum = 46465062;BA.debugLine="If LongClicked = False Then";

case 46:
//if
this.state = 59;
if (_longclicked==parent.__c.False) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=46465063;
 //BA.debugLineNum = 46465063;BA.debugLine="Sleep(200)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "cellclicked"),(int) (200));
this.state = 62;
return;
case 62:
//C
this.state = 49;
;
RDebugUtils.currentLine=46465064;
 //BA.debugLineNum = 46465064;BA.debugLine="If pnl.IsInitialized Then";
if (true) break;

case 49:
//if
this.state = 58;
if (_pnl.IsInitialized()) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=46465065;
 //BA.debugLineNum = 46465065;BA.debugLine="If SelectionColor <> 0 Then pnl.SetColorAnima";
if (true) break;

case 52:
//if
this.state = 57;
if (__ref._selectioncolor /*int*/ !=0) { 
this.state = 54;
;}if (true) break;

case 54:
//C
this.state = 57;
_pnl.SetColorAnimated((int) (200),__ref._selectioncolor /*int*/ ,_clr);
if (true) break;

case 57:
//C
this.state = 58;
;
 if (true) break;

case 58:
//C
this.state = 59;
;
 if (true) break;

case 59:
//C
this.state = 60;
;
 if (true) break;

case 60:
//C
this.state = 61;
;
 if (true) break;

case 61:
//C
this.state = -1;
;
RDebugUtils.currentLine=46465070;
 //BA.debugLineNum = 46465070;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _headerclicked(b4j.example.b4xtable __ref,b4j.example.b4xtable._b4xtablecolumn _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "headerclicked", true))
	 {return ((String) Debug.delegate(ba, "headerclicked", new Object[] {_col}));}
b4j.example.b4xtable._b4xtablecolumn _c = null;
RDebugUtils.currentLine=46530560;
 //BA.debugLineNum = 46530560;BA.debugLine="Private Sub HeaderClicked (col As B4XTableColumn)";
RDebugUtils.currentLine=46530561;
 //BA.debugLineNum = 46530561;BA.debugLine="If col.Sortable Then";
if (_col.Sortable /*boolean*/ ) { 
RDebugUtils.currentLine=46530562;
 //BA.debugLineNum = 46530562;BA.debugLine="For Each c As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_c = (b4j.example.b4xtable._b4xtablecolumn)(group2.Get(index2));
RDebugUtils.currentLine=46530563;
 //BA.debugLineNum = 46530563;BA.debugLine="If c = col Then";
if ((_c).equals(_col)) { 
RDebugUtils.currentLine=46530564;
 //BA.debugLineNum = 46530564;BA.debugLine="If c.InternalSortMode = \"ASC\" Then c.InternalS";
if ((_c.InternalSortMode /*String*/ ).equals("ASC")) { 
_c.InternalSortMode /*String*/  = "DESC";}
else {
_c.InternalSortMode /*String*/  = "ASC";};
 }else {
RDebugUtils.currentLine=46530566;
 //BA.debugLineNum = 46530566;BA.debugLine="c.InternalSortMode = \"\"";
_c.InternalSortMode /*String*/  = "";
 };
 }
};
RDebugUtils.currentLine=46530569;
 //BA.debugLineNum = 46530569;BA.debugLine="mFirstRowIndex = 0";
__ref._mfirstrowindex /*int*/  = (int) (0);
RDebugUtils.currentLine=46530570;
 //BA.debugLineNum = 46530570;BA.debugLine="UpdateSortIcon";
__ref._updatesorticon /*String*/ (null);
RDebugUtils.currentLine=46530571;
 //BA.debugLineNum = 46530571;BA.debugLine="UpdateData (False)";
__ref._updatedata /*String*/ (null,__c.False);
 };
RDebugUtils.currentLine=46530573;
 //BA.debugLineNum = 46530573;BA.debugLine="End Sub";
return "";
}
public String  _checkandremovecolumnthatwasaddedtoincorrectparent(b4j.example.b4xtable __ref,b4j.example.b4xtable._b4xtablecolumn _c,boolean _isfrozen) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "checkandremovecolumnthatwasaddedtoincorrectparent", true))
	 {return ((String) Debug.delegate(ba, "checkandremovecolumnthatwasaddedtoincorrectparent", new Object[] {_c,_isfrozen}));}
RDebugUtils.currentLine=44826624;
 //BA.debugLineNum = 44826624;BA.debugLine="Private Sub CheckAndRemoveColumnThatWasAddedToInco";
RDebugUtils.currentLine=44826625;
 //BA.debugLineNum = 44826625;BA.debugLine="If (c.Panel.Parent = mBase) <> IsFrozen Then";
if (((_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent()).equals(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ))!=_isfrozen) { 
RDebugUtils.currentLine=44826626;
 //BA.debugLineNum = 44826626;BA.debugLine="If IsFrozen Then";
if (_isfrozen) { 
RDebugUtils.currentLine=44826627;
 //BA.debugLineNum = 44826627;BA.debugLine="RemoveColumnFromCLV(c)";
__ref._removecolumnfromclv /*String*/ (null,_c);
 }else {
RDebugUtils.currentLine=44826629;
 //BA.debugLineNum = 44826629;BA.debugLine="c.Panel.RemoveViewFromParent";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
 };
RDebugUtils.currentLine=44826632;
 //BA.debugLineNum = 44826632;BA.debugLine="End Sub";
return "";
}
public String  _removecolumnfromclv(b4j.example.b4xtable __ref,b4j.example.b4xtable._b4xtablecolumn _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "removecolumnfromclv", true))
	 {return ((String) Debug.delegate(ba, "removecolumnfromclv", new Object[] {_c}));}
int _i = 0;
RDebugUtils.currentLine=44892160;
 //BA.debugLineNum = 44892160;BA.debugLine="Private Sub RemoveColumnFromCLV (c As B4XTableColu";
RDebugUtils.currentLine=44892161;
 //BA.debugLineNum = 44892161;BA.debugLine="For i = 0 To clvData.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._clvdata /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=44892162;
 //BA.debugLineNum = 44892162;BA.debugLine="If clvData.GetValue(i) = c Then";
if ((__ref._clvdata /*b4j.example.customlistview*/ ._getvalue(_i)).equals((Object)(_c))) { 
RDebugUtils.currentLine=44892163;
 //BA.debugLineNum = 44892163;BA.debugLine="clvData.RemoveAt(i)";
__ref._clvdata /*b4j.example.customlistview*/ ._removeat(_i);
RDebugUtils.currentLine=44892164;
 //BA.debugLineNum = 44892164;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=44892167;
 //BA.debugLineNum = 44892167;BA.debugLine="c.Panel.RemoveViewFromParent";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=44892168;
 //BA.debugLineNum = 44892168;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
RDebugUtils.currentLine=44105728;
 //BA.debugLineNum = 44105728;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=44105729;
 //BA.debugLineNum = 44105729;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=44105730;
 //BA.debugLineNum = 44105730;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=44105731;
 //BA.debugLineNum = 44105731;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44105732;
 //BA.debugLineNum = 44105732;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=44105733;
 //BA.debugLineNum = 44105733;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=44105734;
 //BA.debugLineNum = 44105734;BA.debugLine="Public sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=44105735;
 //BA.debugLineNum = 44105735;BA.debugLine="Type B4XTableColumn (Title As String, Id As Strin";
;
RDebugUtils.currentLine=44105738;
 //BA.debugLineNum = 44105738;BA.debugLine="Public COLUMN_TYPE_TEXT = 1, COLUMN_TYPE_NUMBERS";
_column_type_text = (int) (1);
_column_type_numbers = (int) (2);
_column_type_date = (int) (3);
_column_type_void = (int) (4);
RDebugUtils.currentLine=44105739;
 //BA.debugLineNum = 44105739;BA.debugLine="Public Columns As List";
_columns = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=44105740;
 //BA.debugLineNum = 44105740;BA.debugLine="Public VisibleColumns As List";
_visiblecolumns = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=44105741;
 //BA.debugLineNum = 44105741;BA.debugLine="Private mFirstRowIndex, mLastRowIndex As Int";
_mfirstrowindex = 0;
_mlastrowindex = 0;
RDebugUtils.currentLine=44105742;
 //BA.debugLineNum = 44105742;BA.debugLine="Public DefaultFormatter, DefaultDataFormatter As";
_defaultformatter = new b4j.example.b4xformatter();
_defaultdataformatter = new b4j.example.b4xformatter();
RDebugUtils.currentLine=44105743;
 //BA.debugLineNum = 44105743;BA.debugLine="Public pnlHeader As B4XView";
_pnlheader = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44105744;
 //BA.debugLineNum = 44105744;BA.debugLine="Public pnlTitles As B4XView";
_pnltitles = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44105745;
 //BA.debugLineNum = 44105745;BA.debugLine="Public clvData As CustomListView";
_clvdata = new b4j.example.customlistview();
RDebugUtils.currentLine=44105746;
 //BA.debugLineNum = 44105746;BA.debugLine="Public RowHeight, HeadersHeight As Int";
_rowheight = 0;
_headersheight = 0;
RDebugUtils.currentLine=44105747;
 //BA.debugLineNum = 44105747;BA.debugLine="Public AllowSmallRowHeightModifications As Boolea";
_allowsmallrowheightmodifications = __c.True;
RDebugUtils.currentLine=44105748;
 //BA.debugLineNum = 44105748;BA.debugLine="Private mRowsPerPage As Int = 0";
_mrowsperpage = (int) (0);
RDebugUtils.currentLine=44105749;
 //BA.debugLineNum = 44105749;BA.debugLine="Private LayoutLoaded As Boolean";
_layoutloaded = false;
RDebugUtils.currentLine=44105750;
 //BA.debugLineNum = 44105750;BA.debugLine="Public MinimumWidth As Int";
_minimumwidth = 0;
RDebugUtils.currentLine=44105751;
 //BA.debugLineNum = 44105751;BA.debugLine="Private SQLIndex As Int";
_sqlindex = 0;
RDebugUtils.currentLine=44105752;
 //BA.debugLineNum = 44105752;BA.debugLine="Public EvenRowColor, OddRowColor, HeaderTextColor";
_evenrowcolor = 0;
_oddrowcolor = 0;
_headertextcolor = 0;
_textcolor = 0;
_highlighttextcolor = 0;
_headercolor = 0;
_gridcolor = 0;
RDebugUtils.currentLine=44105753;
 //BA.debugLineNum = 44105753;BA.debugLine="Public HighlightSearchResults As Boolean = True";
_highlightsearchresults = __c.True;
RDebugUtils.currentLine=44105754;
 //BA.debugLineNum = 44105754;BA.debugLine="Public HeaderFont, LabelsFont As B4XFont";
_headerfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_labelsfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=44105755;
 //BA.debugLineNum = 44105755;BA.debugLine="Public lblFirst As B4XView";
_lblfirst = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44105756;
 //BA.debugLineNum = 44105756;BA.debugLine="Public lblBack As B4XView";
_lblback = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44105757;
 //BA.debugLineNum = 44105757;BA.debugLine="Public lblNumber As B4XView";
_lblnumber = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44105758;
 //BA.debugLineNum = 44105758;BA.debugLine="Public lblNext As B4XView";
_lblnext = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44105759;
 //BA.debugLineNum = 44105759;BA.debugLine="Public lblLast As B4XView";
_lbllast = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44105760;
 //BA.debugLineNum = 44105760;BA.debugLine="Public lblFromTo As B4XView";
_lblfromto = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44105761;
 //BA.debugLineNum = 44105761;BA.debugLine="Private CountAll As Int";
_countall = 0;
RDebugUtils.currentLine=44105762;
 //BA.debugLineNum = 44105762;BA.debugLine="Private mCurrentPage As Int";
_mcurrentpage = 0;
RDebugUtils.currentLine=44105763;
 //BA.debugLineNum = 44105763;BA.debugLine="Public mCurrentCount As Int";
_mcurrentcount = 0;
RDebugUtils.currentLine=44105764;
 //BA.debugLineNum = 44105764;BA.debugLine="Public lblSort As B4XView";
_lblsort = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44105765;
 //BA.debugLineNum = 44105765;BA.debugLine="Public SearchField As B4XFloatTextField";
_searchfield = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=44105766;
 //BA.debugLineNum = 44105766;BA.debugLine="Private FilterText As String";
_filtertext = "";
RDebugUtils.currentLine=44105767;
 //BA.debugLineNum = 44105767;BA.debugLine="Public SleepBeforeSearch As Int = 300";
_sleepbeforesearch = (int) (300);
RDebugUtils.currentLine=44105768;
 //BA.debugLineNum = 44105768;BA.debugLine="Private SearchIndex As Int";
_searchindex = 0;
RDebugUtils.currentLine=44105769;
 //BA.debugLineNum = 44105769;BA.debugLine="Public ArrowsEnabledColor, ArrowsDisabledColor As";
_arrowsenabledcolor = 0;
_arrowsdisabledcolor = 0;
RDebugUtils.currentLine=44105770;
 //BA.debugLineNum = 44105770;BA.debugLine="Public VisibleRowIds As List";
_visiblerowids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=44105771;
 //BA.debugLineNum = 44105771;BA.debugLine="Public SelectionColor As Int";
_selectioncolor = 0;
RDebugUtils.currentLine=44105772;
 //BA.debugLineNum = 44105772;BA.debugLine="Private SQLTableName As String = \"data\"";
_sqltablename = "data";
RDebugUtils.currentLine=44105773;
 //BA.debugLineNum = 44105773;BA.debugLine="Public StringMoreAvailable As String = \"(more ava";
_stringmoreavailable = "(more available)";
RDebugUtils.currentLine=44105774;
 //BA.debugLineNum = 44105774;BA.debugLine="Public StringNoMatches As String = \"No matches\"";
_stringnomatches = "No matches";
RDebugUtils.currentLine=44105775;
 //BA.debugLineNum = 44105775;BA.debugLine="Public StringOutOf As String = \"out of\"";
_stringoutof = "out of";
RDebugUtils.currentLine=44105776;
 //BA.debugLineNum = 44105776;BA.debugLine="Public StringTo As String = \"to\"";
_stringto = "to";
RDebugUtils.currentLine=44105777;
 //BA.debugLineNum = 44105777;BA.debugLine="Public MaximumRowsPerPage As Int";
_maximumrowsperpage = 0;
RDebugUtils.currentLine=44105778;
 //BA.debugLineNum = 44105778;BA.debugLine="Public PrefixSearch As Boolean";
_prefixsearch = false;
RDebugUtils.currentLine=44105780;
 //BA.debugLineNum = 44105780;BA.debugLine="Private TextFlow As B4JTextFlow";
_textflow = new b4j.example.b4jtextflow();
RDebugUtils.currentLine=44105781;
 //BA.debugLineNum = 44105781;BA.debugLine="Private const TextPaneTag As String = \"TextFlow\"";
_textpanetag = "TextFlow";
RDebugUtils.currentLine=44105783;
 //BA.debugLineNum = 44105783;BA.debugLine="Private LastBaseHeight As Int";
_lastbaseheight = 0;
RDebugUtils.currentLine=44105784;
 //BA.debugLineNum = 44105784;BA.debugLine="Public NumberOfFrozenColumns As Int";
_numberoffrozencolumns = 0;
RDebugUtils.currentLine=44105785;
 //BA.debugLineNum = 44105785;BA.debugLine="Private LastCellClickEvent As Long";
_lastcellclickevent = 0L;
RDebugUtils.currentLine=44105789;
 //BA.debugLineNum = 44105789;BA.debugLine="Public SearchVisible As Boolean";
_searchvisible = false;
RDebugUtils.currentLine=44105791;
 //BA.debugLineNum = 44105791;BA.debugLine="End Sub";
return "";
}
public void  _clear(b4j.example.b4xtable __ref) throws Exception{
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "clear", true))
	 {Debug.delegate(ba, "clear", null); return;}
ResumableSub_Clear rsub = new ResumableSub_Clear(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Clear extends BA.ResumableSub {
public ResumableSub_Clear(b4j.example.b4xtable parent,b4j.example.b4xtable __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xtable __ref;
b4j.example.b4xtable parent;
anywheresoftware.b4j.objects.SQL _oldsql = null;
b4j.example.b4xtable._b4xtablecolumn _c = null;
anywheresoftware.b4a.BA.IterableList group4;
int index4;
int groupLen4;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtable";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=44367873;
 //BA.debugLineNum = 44367873;BA.debugLine="SQLIndex = SQLIndex + 1";
__ref._sqlindex /*int*/  = (int) (__ref._sqlindex /*int*/ +1);
RDebugUtils.currentLine=44367874;
 //BA.debugLineNum = 44367874;BA.debugLine="Dim OldSQL As SQL = sql1";
_oldsql = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ ;
RDebugUtils.currentLine=44367875;
 //BA.debugLineNum = 44367875;BA.debugLine="Dim sql1 As SQL";
parent._sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=44367876;
 //BA.debugLineNum = 44367876;BA.debugLine="For Each c As B4XTableColumn In Columns";
if (true) break;

case 1:
//for
this.state = 8;
group4 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
index4 = 0;
groupLen4 = group4.getSize();
this.state = 21;
if (true) break;

case 21:
//C
this.state = 8;
if (index4 < groupLen4) {
this.state = 3;
_c = (b4j.example.b4xtable._b4xtablecolumn)(group4.Get(index4));}
if (true) break;

case 22:
//C
this.state = 21;
index4++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=44367877;
 //BA.debugLineNum = 44367877;BA.debugLine="If c.Panel.IsInitialized And c.Panel.Parent.IsIn";
if (true) break;

case 4:
//if
this.state = 7;
if (_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && _c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=44367878;
 //BA.debugLineNum = 44367878;BA.debugLine="c.Panel.RemoveViewFromParent";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 if (true) break;

case 7:
//C
this.state = 22;
;
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=44367881;
 //BA.debugLineNum = 44367881;BA.debugLine="VisibleColumns.Clear";
__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=44367882;
 //BA.debugLineNum = 44367882;BA.debugLine="Columns.Clear";
__ref._columns /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=44367883;
 //BA.debugLineNum = 44367883;BA.debugLine="SQLTableName = \"data\"";
__ref._sqltablename /*String*/  = "data";
RDebugUtils.currentLine=44367884;
 //BA.debugLineNum = 44367884;BA.debugLine="If clvData.IsInitialized Then";
if (true) break;

case 9:
//if
this.state = 12;
if (__ref._clvdata /*b4j.example.customlistview*/ .IsInitialized()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=44367885;
 //BA.debugLineNum = 44367885;BA.debugLine="clvData.Clear";
__ref._clvdata /*b4j.example.customlistview*/ ._clear();
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=44367887;
 //BA.debugLineNum = 44367887;BA.debugLine="mFirstRowIndex = 0";
__ref._mfirstrowindex /*int*/  = (int) (0);
RDebugUtils.currentLine=44367888;
 //BA.debugLineNum = 44367888;BA.debugLine="ClearNavigationState";
__ref._clearnavigationstate /*String*/ (null);
RDebugUtils.currentLine=44367889;
 //BA.debugLineNum = 44367889;BA.debugLine="If OldSQL.IsInitialized Then";
if (true) break;

case 13:
//if
this.state = 20;
if (_oldsql.IsInitialized()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=44367890;
 //BA.debugLineNum = 44367890;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "clear"),(int) (1000));
this.state = 23;
return;
case 23:
//C
this.state = 16;
;
RDebugUtils.currentLine=44367891;
 //BA.debugLineNum = 44367891;BA.debugLine="If OldSQL.IsInitialized Then";
if (true) break;

case 16:
//if
this.state = 19;
if (_oldsql.IsInitialized()) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=44367892;
 //BA.debugLineNum = 44367892;BA.debugLine="OldSQL.Close";
_oldsql.Close();
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=44367895;
 //BA.debugLineNum = 44367895;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _clearnavigationstate(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "clearnavigationstate", true))
	 {return ((String) Debug.delegate(ba, "clearnavigationstate", null));}
RDebugUtils.currentLine=44433408;
 //BA.debugLineNum = 44433408;BA.debugLine="Private Sub ClearNavigationState";
RDebugUtils.currentLine=44433409;
 //BA.debugLineNum = 44433409;BA.debugLine="If lblNext.IsInitialized = False Then Return";
if (__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=44433410;
 //BA.debugLineNum = 44433410;BA.debugLine="SetPageLabelState(lblNext, False)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=44433411;
 //BA.debugLineNum = 44433411;BA.debugLine="SetPageLabelState(lblLast, False)";
__ref._setpagelabelstate /*String*/ (null,__ref._lbllast /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=44433412;
 //BA.debugLineNum = 44433412;BA.debugLine="SetPageLabelState(lblBack, False)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblback /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=44433413;
 //BA.debugLineNum = 44433413;BA.debugLine="SetPageLabelState(lblFirst, False)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblfirst /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=44433414;
 //BA.debugLineNum = 44433414;BA.debugLine="lblFromTo.Text = \"\"";
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=44433415;
 //BA.debugLineNum = 44433415;BA.debugLine="lblNumber.Text = \"\"";
__ref._lblnumber /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=44433416;
 //BA.debugLineNum = 44433416;BA.debugLine="End Sub";
return "";
}
public String  _cleardataview(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "cleardataview", true))
	 {return ((String) Debug.delegate(ba, "cleardataview", null));}
RDebugUtils.currentLine=45219840;
 //BA.debugLineNum = 45219840;BA.debugLine="Public Sub ClearDataView";
RDebugUtils.currentLine=45219841;
 //BA.debugLineNum = 45219841;BA.debugLine="SQLTableName = \"data\"";
__ref._sqltablename /*String*/  = "data";
RDebugUtils.currentLine=45219842;
 //BA.debugLineNum = 45219842;BA.debugLine="mFirstRowIndex = 0";
__ref._mfirstrowindex /*int*/  = (int) (0);
RDebugUtils.currentLine=45219843;
 //BA.debugLineNum = 45219843;BA.debugLine="CountAll = sql1.ExecQuerySingleResult(\"SELECT cou";
__ref._countall /*int*/  = (int)(Double.parseDouble(__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult("SELECT count(*) FROM data")));
RDebugUtils.currentLine=45219844;
 //BA.debugLineNum = 45219844;BA.debugLine="UpdateData (True)";
__ref._updatedata /*String*/ (null,__c.True);
RDebugUtils.currentLine=45219845;
 //BA.debugLineNum = 45219845;BA.debugLine="End Sub";
return "";
}
public String  _updatedata(b4j.example.b4xtable __ref,boolean _dontsleep) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "updatedata", true))
	 {return ((String) Debug.delegate(ba, "updatedata", new Object[] {_dontsleep}));}
Object[] _o = null;
RDebugUtils.currentLine=45023232;
 //BA.debugLineNum = 45023232;BA.debugLine="Private Sub UpdateData (DontSleep As Boolean)";
RDebugUtils.currentLine=45023233;
 //BA.debugLineNum = 45023233;BA.debugLine="If sql1.IsInitialized = False Then Return";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=45023234;
 //BA.debugLineNum = 45023234;BA.debugLine="Dim o() As Object = BuildQuery(True)";
_o = __ref._buildquery /*Object[]*/ (null,__c.True);
RDebugUtils.currentLine=45023236;
 //BA.debugLineNum = 45023236;BA.debugLine="ImplUpdateDataFromQuery (o(0), o(1), o(2), DontSl";
__ref._implupdatedatafromquery /*void*/ (null,BA.ObjectToString(_o[(int) (0)]),_o[(int) (1)],(int)(BA.ObjectToNumber(_o[(int) (2)])),_dontsleep);
RDebugUtils.currentLine=45023237;
 //BA.debugLineNum = 45023237;BA.debugLine="End Sub";
return "";
}
public String  _setpagelabelstate(b4j.example.b4xtable __ref,anywheresoftware.b4a.objects.B4XViewWrapper _lbl,boolean _enabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "setpagelabelstate", true))
	 {return ((String) Debug.delegate(ba, "setpagelabelstate", new Object[] {_lbl,_enabled}));}
RDebugUtils.currentLine=45547520;
 //BA.debugLineNum = 45547520;BA.debugLine="Private Sub SetPageLabelState (lbl As B4XView, ena";
RDebugUtils.currentLine=45547521;
 //BA.debugLineNum = 45547521;BA.debugLine="If lbl.Tag = enabled Then Return";
if ((_lbl.getTag()).equals((Object)(_enabled))) { 
if (true) return "";};
RDebugUtils.currentLine=45547522;
 //BA.debugLineNum = 45547522;BA.debugLine="lbl.Tag = enabled";
_lbl.setTag((Object)(_enabled));
RDebugUtils.currentLine=45547523;
 //BA.debugLineNum = 45547523;BA.debugLine="If enabled Then";
if (_enabled) { 
RDebugUtils.currentLine=45547524;
 //BA.debugLineNum = 45547524;BA.debugLine="lbl.TextColor = ArrowsEnabledColor";
_lbl.setTextColor(__ref._arrowsenabledcolor /*int*/ );
 }else {
RDebugUtils.currentLine=45547526;
 //BA.debugLineNum = 45547526;BA.debugLine="lbl.TextColor = ArrowsDisabledColor";
_lbl.setTextColor(__ref._arrowsdisabledcolor /*int*/ );
 };
RDebugUtils.currentLine=45547528;
 //BA.debugLineNum = 45547528;BA.debugLine="End Sub";
return "";
}
public String  _columntosqltype(b4j.example.b4xtable __ref,b4j.example.b4xtable._b4xtablecolumn _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "columntosqltype", true))
	 {return ((String) Debug.delegate(ba, "columntosqltype", new Object[] {_c}));}
RDebugUtils.currentLine=46137344;
 //BA.debugLineNum = 46137344;BA.debugLine="Private Sub ColumnToSQLType (c As B4XTableColumn)";
RDebugUtils.currentLine=46137345;
 //BA.debugLineNum = 46137345;BA.debugLine="If c.ColumnType = COLUMN_TYPE_TEXT Then Return \"T";
if (_c.ColumnType /*int*/ ==__ref._column_type_text /*int*/ ) { 
if (true) return "TEXT";}
else {
if (true) return "INTEGER";};
RDebugUtils.currentLine=46137346;
 //BA.debugLineNum = 46137346;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createcellviews(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "createcellviews", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createcellviews", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
RDebugUtils.currentLine=46202880;
 //BA.debugLineNum = 46202880;BA.debugLine="Private Sub CreateCellViews As B4XView";
RDebugUtils.currentLine=46202881;
 //BA.debugLineNum = 46202881;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"cell\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"cell");
RDebugUtils.currentLine=46202882;
 //BA.debugLineNum = 46202882;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=46202883;
 //BA.debugLineNum = 46202883;BA.debugLine="lbl.Initialize(\"lbl\")";
_lbl.Initialize(ba,"lbl");
RDebugUtils.currentLine=46202884;
 //BA.debugLineNum = 46202884;BA.debugLine="SetMouseTransparent(lbl)";
__ref._setmousetransparent /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject())));
RDebugUtils.currentLine=46202885;
 //BA.debugLineNum = 46202885;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=46202886;
 //BA.debugLineNum = 46202886;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=46202887;
 //BA.debugLineNum = 46202887;BA.debugLine="p.AddView(xlbl, 0, 0, 0, 0)";
_p.AddView((javafx.scene.Node)(_xlbl.getObject()),0,0,0,0);
RDebugUtils.currentLine=46202888;
 //BA.debugLineNum = 46202888;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=46202889;
 //BA.debugLineNum = 46202889;BA.debugLine="End Sub";
return null;
}
public String  _setmousetransparent(b4j.example.b4xtable __ref,anywheresoftware.b4a.objects.B4XViewWrapper _lbl) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "setmousetransparent", true))
	 {return ((String) Debug.delegate(ba, "setmousetransparent", new Object[] {_lbl}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=46333952;
 //BA.debugLineNum = 46333952;BA.debugLine="Private Sub SetMouseTransparent (lbl As B4XView) '";
RDebugUtils.currentLine=46333954;
 //BA.debugLineNum = 46333954;BA.debugLine="Dim jo = lbl As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=46333955;
 //BA.debugLineNum = 46333955;BA.debugLine="jo.RunMethod(\"setMouseTransparent\", Array(True))";
_jo.RunMethod("setMouseTransparent",new Object[]{(Object)(__c.True)});
RDebugUtils.currentLine=46333957;
 //BA.debugLineNum = 46333957;BA.debugLine="End Sub";
return "";
}
public String  _createdataview(b4j.example.b4xtable __ref,String _whereclause) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "createdataview", true))
	 {return ((String) Debug.delegate(ba, "createdataview", new Object[] {_whereclause}));}
RDebugUtils.currentLine=45154304;
 //BA.debugLineNum = 45154304;BA.debugLine="Public Sub CreateDataView (WhereClause As String)";
RDebugUtils.currentLine=45154305;
 //BA.debugLineNum = 45154305;BA.debugLine="sql1.ExecNonQuery(\"DROP VIEW IF EXISTS TempView\")";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("DROP VIEW IF EXISTS TempView");
RDebugUtils.currentLine=45154306;
 //BA.debugLineNum = 45154306;BA.debugLine="sql1.ExecNonQuery(\"CREATE VIEW TempView AS SELECT";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("CREATE VIEW TempView AS SELECT *, rowid FROM data WHERE "+_whereclause);
RDebugUtils.currentLine=45154307;
 //BA.debugLineNum = 45154307;BA.debugLine="CountAll = sql1.ExecQuerySingleResult(\"SELECT cou";
__ref._countall /*int*/  = (int)(Double.parseDouble(__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult("SELECT count(*) FROM TempView")));
RDebugUtils.currentLine=45154308;
 //BA.debugLineNum = 45154308;BA.debugLine="mFirstRowIndex = 0";
__ref._mfirstrowindex /*int*/  = (int) (0);
RDebugUtils.currentLine=45154309;
 //BA.debugLineNum = 45154309;BA.debugLine="SQLTableName = \"TempView\"";
__ref._sqltablename /*String*/  = "TempView";
RDebugUtils.currentLine=45154310;
 //BA.debugLineNum = 45154310;BA.debugLine="UpdateData (False)";
__ref._updatedata /*String*/ (null,__c.False);
RDebugUtils.currentLine=45154311;
 //BA.debugLineNum = 45154311;BA.debugLine="End Sub";
return "";
}
public String  _createtable(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "createtable", true))
	 {return ((String) Debug.delegate(ba, "createtable", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
b4j.example.b4xtable._b4xtablecolumn _column = null;
RDebugUtils.currentLine=46071808;
 //BA.debugLineNum = 46071808;BA.debugLine="Private Sub CreateTable";
RDebugUtils.currentLine=46071809;
 //BA.debugLineNum = 46071809;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=46071810;
 //BA.debugLineNum = 46071810;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=46071811;
 //BA.debugLineNum = 46071811;BA.debugLine="sb.Append(\"CREATE TABLE data (\")";
_sb.Append("CREATE TABLE data (");
RDebugUtils.currentLine=46071812;
 //BA.debugLineNum = 46071812;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=46071813;
 //BA.debugLineNum = 46071813;BA.debugLine="For Each Column As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_column = (b4j.example.b4xtable._b4xtablecolumn)(group5.Get(index5));
RDebugUtils.currentLine=46071814;
 //BA.debugLineNum = 46071814;BA.debugLine="If Column.ColumnType = COLUMN_TYPE_VOID Then Con";
if (_column.ColumnType /*int*/ ==__ref._column_type_void /*int*/ ) { 
if (true) continue;};
RDebugUtils.currentLine=46071815;
 //BA.debugLineNum = 46071815;BA.debugLine="Column.SQLID = \"c\" & i";
_column.SQLID /*String*/  = "c"+BA.NumberToString(_i);
RDebugUtils.currentLine=46071816;
 //BA.debugLineNum = 46071816;BA.debugLine="sb.Append(Column.SQLID & \" \" & ColumnToSQLType(C";
_sb.Append(_column.SQLID /*String*/ +" "+__ref._columntosqltype /*String*/ (null,_column)+",");
RDebugUtils.currentLine=46071817;
 //BA.debugLineNum = 46071817;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=46071819;
 //BA.debugLineNum = 46071819;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=46071820;
 //BA.debugLineNum = 46071820;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=46071821;
 //BA.debugLineNum = 46071821;BA.debugLine="sql1.ExecNonQuery(sb.ToString)";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sb.ToString());
RDebugUtils.currentLine=46071822;
 //BA.debugLineNum = 46071822;BA.debugLine="End Sub";
return "";
}
public void  _designercreateview(b4j.example.b4xtable __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}); return;}
ResumableSub_DesignerCreateView rsub = new ResumableSub_DesignerCreateView(this,__ref,_base,_lbl,_props);
rsub.resume(ba, null);
}
public static class ResumableSub_DesignerCreateView extends BA.ResumableSub {
public ResumableSub_DesignerCreateView(b4j.example.b4xtable parent,b4j.example.b4xtable __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) {
this.parent = parent;
this.__ref = __ref;
this._base = _base;
this._lbl = _lbl;
this._props = _props;
this.__ref = parent;
}
b4j.example.b4xtable __ref;
b4j.example.b4xtable parent;
Object _base;
anywheresoftware.b4j.objects.LabelWrapper _lbl;
anywheresoftware.b4a.objects.collections.Map _props;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtable";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=44236801;
 //BA.debugLineNum = 44236801;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=44236802;
 //BA.debugLineNum = 44236802;BA.debugLine="LastBaseHeight = mBase.Height";
__ref._lastbaseheight /*int*/  = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=44236803;
 //BA.debugLineNum = 44236803;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=44236803;
 //BA.debugLineNum = 44236803;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(parent);
RDebugUtils.currentLine=44236804;
 //BA.debugLineNum = 44236804;BA.debugLine="LayoutLoaded = False";
__ref._layoutloaded /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=44236805;
 //BA.debugLineNum = 44236805;BA.debugLine="EvenRowColor = xui.PaintOrColorToColor(Props.Get(";
__ref._evenrowcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("EvenRowColor")));
RDebugUtils.currentLine=44236806;
 //BA.debugLineNum = 44236806;BA.debugLine="OddRowColor = xui.PaintOrColorToColor(Props.Get(\"";
__ref._oddrowcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("OddRowColor")));
RDebugUtils.currentLine=44236807;
 //BA.debugLineNum = 44236807;BA.debugLine="HeaderTextColor = xui.PaintOrColorToColor(Props.G";
__ref._headertextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("HeaderTextColor")));
RDebugUtils.currentLine=44236808;
 //BA.debugLineNum = 44236808;BA.debugLine="TextColor = xui.PaintOrColorToColor(Props.Get(\"Te";
__ref._textcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("TextColor")));
RDebugUtils.currentLine=44236809;
 //BA.debugLineNum = 44236809;BA.debugLine="HeaderColor = xui.PaintOrColorToColor(Props.Get(\"";
__ref._headercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("HeaderColor")));
RDebugUtils.currentLine=44236810;
 //BA.debugLineNum = 44236810;BA.debugLine="GridColor = xui.PaintOrColorToColor(Props.Get(\"Gr";
__ref._gridcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("GridColor")));
RDebugUtils.currentLine=44236811;
 //BA.debugLineNum = 44236811;BA.debugLine="SelectionColor = xui.PaintOrColorToColor(Props.Ge";
__ref._selectioncolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("SelectionColor")));
RDebugUtils.currentLine=44236812;
 //BA.debugLineNum = 44236812;BA.debugLine="HighlightTextColor = xui.PaintOrColorToColor(Prop";
__ref._highlighttextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("HighlightTextColor"),(Object)(((int)0xffff0000))));
RDebugUtils.currentLine=44236813;
 //BA.debugLineNum = 44236813;BA.debugLine="SearchVisible = Props.GetDefault(\"SearchVisible\",";
__ref._searchvisible /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("SearchVisible"),(Object)(parent.__c.True)));
RDebugUtils.currentLine=44236814;
 //BA.debugLineNum = 44236814;BA.debugLine="If Bit.And(SelectionColor, 0xff000000) = 0 Then S";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.Bit.And(__ref._selectioncolor /*int*/ ,((int)0xff000000))==0) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref._selectioncolor /*int*/  = (int) (0);
if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=44236815;
 //BA.debugLineNum = 44236815;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "designercreateview"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=44236816;
 //BA.debugLineNum = 44236816;BA.debugLine="mBase.LoadLayout(\"B4XTable\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("B4XTable",ba);
RDebugUtils.currentLine=44236817;
 //BA.debugLineNum = 44236817;BA.debugLine="SearchField.mBase.Visible = False";
__ref._searchfield /*b4j.example.b4xfloattextfield*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=44236818;
 //BA.debugLineNum = 44236818;BA.debugLine="SearchField.LargeLabelTextSize = 14";
__ref._searchfield /*b4j.example.b4xfloattextfield*/ ._largelabeltextsize /*float*/  = (float) (14);
RDebugUtils.currentLine=44236819;
 //BA.debugLineNum = 44236819;BA.debugLine="SearchField.SmallLabelTextSize = 8";
__ref._searchfield /*b4j.example.b4xfloattextfield*/ ._smalllabeltextsize /*float*/  = (float) (8);
RDebugUtils.currentLine=44236820;
 //BA.debugLineNum = 44236820;BA.debugLine="SearchField.Update";
__ref._searchfield /*b4j.example.b4xfloattextfield*/ ._update /*String*/ (null);
RDebugUtils.currentLine=44236828;
 //BA.debugLineNum = 44236828;BA.debugLine="SetMouseTransparent(lblSort)";
__ref._setmousetransparent /*String*/ (null,__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=44236829;
 //BA.debugLineNum = 44236829;BA.debugLine="clvData.AsView.SetColorAndBorder(0, 0, 0, 0)";
__ref._clvdata /*b4j.example.customlistview*/ ._asview().SetColorAndBorder((int) (0),0,(int) (0),0);
RDebugUtils.currentLine=44236830;
 //BA.debugLineNum = 44236830;BA.debugLine="clvData.sv.SetColorAndBorder(0, 0, 0, 0)";
__ref._clvdata /*b4j.example.customlistview*/ ._sv.SetColorAndBorder((int) (0),0,(int) (0),0);
RDebugUtils.currentLine=44236831;
 //BA.debugLineNum = 44236831;BA.debugLine="lblNumber.TextColor = ArrowsEnabledColor";
__ref._lblnumber /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._arrowsenabledcolor /*int*/ );
RDebugUtils.currentLine=44236832;
 //BA.debugLineNum = 44236832;BA.debugLine="LayoutLoaded = True";
__ref._layoutloaded /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=44236833;
 //BA.debugLineNum = 44236833;BA.debugLine="ClearNavigationState";
__ref._clearnavigationstate /*String*/ (null);
RDebugUtils.currentLine=44236834;
 //BA.debugLineNum = 44236834;BA.debugLine="Refresh2 (True, False)";
__ref._refresh2 /*String*/ (null,parent.__c.True,parent.__c.False);
RDebugUtils.currentLine=44236835;
 //BA.debugLineNum = 44236835;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public int  _getfirstrowindex(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getfirstrowindex", true))
	 {return ((Integer) Debug.delegate(ba, "getfirstrowindex", null));}
RDebugUtils.currentLine=46792704;
 //BA.debugLineNum = 46792704;BA.debugLine="Public Sub getFirstRowIndex As Int";
RDebugUtils.currentLine=46792705;
 //BA.debugLineNum = 46792705;BA.debugLine="Return mFirstRowIndex";
if (true) return __ref._mfirstrowindex /*int*/ ;
RDebugUtils.currentLine=46792706;
 //BA.debugLineNum = 46792706;BA.debugLine="End Sub";
return 0;
}
public int  _getrowsperpage(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getrowsperpage", true))
	 {return ((Integer) Debug.delegate(ba, "getrowsperpage", null));}
RDebugUtils.currentLine=46858240;
 //BA.debugLineNum = 46858240;BA.debugLine="Public Sub getRowsPerPage As Int";
RDebugUtils.currentLine=46858241;
 //BA.debugLineNum = 46858241;BA.debugLine="Return mRowsPerPage";
if (true) return __ref._mrowsperpage /*int*/ ;
RDebugUtils.currentLine=46858242;
 //BA.debugLineNum = 46858242;BA.debugLine="End Sub";
return 0;
}
public int  _getsize(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=47644672;
 //BA.debugLineNum = 47644672;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=47644673;
 //BA.debugLineNum = 47644673;BA.debugLine="Return CountAll";
if (true) return __ref._countall /*int*/ ;
RDebugUtils.currentLine=47644674;
 //BA.debugLineNum = 47644674;BA.debugLine="End Sub";
return 0;
}
public String  _updatesorticon(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "updatesorticon", true))
	 {return ((String) Debug.delegate(ba, "updatesorticon", null));}
b4j.example.b4xtable._b4xtablecolumn _col = null;
RDebugUtils.currentLine=46596096;
 //BA.debugLineNum = 46596096;BA.debugLine="Private Sub UpdateSortIcon";
RDebugUtils.currentLine=46596097;
 //BA.debugLineNum = 46596097;BA.debugLine="For Each col As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_col = (b4j.example.b4xtable._b4xtablecolumn)(group1.Get(index1));
RDebugUtils.currentLine=46596098;
 //BA.debugLineNum = 46596098;BA.debugLine="If col.InternalSortMode <> \"\" Then";
if ((_col.InternalSortMode /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=46596099;
 //BA.debugLineNum = 46596099;BA.debugLine="If lblSort.Parent <> col.Panel Then";
if ((__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent()).equals(_col.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ) == false) { 
RDebugUtils.currentLine=46596100;
 //BA.debugLineNum = 46596100;BA.debugLine="lblSort.RemoveViewFromParent";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=46596101;
 //BA.debugLineNum = 46596101;BA.debugLine="col.Panel.AddView(lblSort, 0, 0, lblSort.Width";
_col.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),0);
 };
RDebugUtils.currentLine=46596103;
 //BA.debugLineNum = 46596103;BA.debugLine="lblSort.Top = 0";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop(0);
RDebugUtils.currentLine=46596104;
 //BA.debugLineNum = 46596104;BA.debugLine="lblSort.Height = HeadersHeight";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._headersheight /*int*/ );
RDebugUtils.currentLine=46596105;
 //BA.debugLineNum = 46596105;BA.debugLine="lblSort.Left = col.Panel.Width - lblSort.Width";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(_col.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=46596106;
 //BA.debugLineNum = 46596106;BA.debugLine="lblSort.Visible = True";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=46596107;
 //BA.debugLineNum = 46596107;BA.debugLine="If col.InternalSortMode = \"ASC\" Then lblSort.Te";
if ((_col.InternalSortMode /*String*/ ).equals("ASC")) { 
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(__c.Chr(((int)0xf0de))));}
else {
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(__c.Chr(((int)0xf0dd))));};
RDebugUtils.currentLine=46596108;
 //BA.debugLineNum = 46596108;BA.debugLine="Return";
if (true) return "";
 };
 }
};
RDebugUtils.currentLine=46596111;
 //BA.debugLineNum = 46596111;BA.debugLine="lblSort.Visible = False";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=46596112;
 //BA.debugLineNum = 46596112;BA.debugLine="End Sub";
return "";
}
public void  _implupdatedatafromquery(b4j.example.b4xtable __ref,String _query,Object _args,int _totalcount,boolean _dontsleep) throws Exception{
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "implupdatedatafromquery", true))
	 {Debug.delegate(ba, "implupdatedatafromquery", new Object[] {_query,_args,_totalcount,_dontsleep}); return;}
ResumableSub_ImplUpdateDataFromQuery rsub = new ResumableSub_ImplUpdateDataFromQuery(this,__ref,_query,_args,_totalcount,_dontsleep);
rsub.resume(ba, null);
}
public static class ResumableSub_ImplUpdateDataFromQuery extends BA.ResumableSub {
public ResumableSub_ImplUpdateDataFromQuery(b4j.example.b4xtable parent,b4j.example.b4xtable __ref,String _query,Object _args,int _totalcount,boolean _dontsleep) {
this.parent = parent;
this.__ref = __ref;
this._query = _query;
this._args = _args;
this._totalcount = _totalcount;
this._dontsleep = _dontsleep;
this.__ref = parent;
}
b4j.example.b4xtable __ref;
b4j.example.b4xtable parent;
String _query;
Object _args;
int _totalcount;
boolean _dontsleep;
int _myindex = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
boolean _success = false;
int _rownumber = 0;
b4j.example.b4xtable._b4xtablecolumn _c = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
boolean _aretheremoreresults = false;
int _i = 0;
anywheresoftware.b4a.BA.IterableList group17;
int index17;
int groupLen17;
int step32;
int limit32;
anywheresoftware.b4a.BA.IterableList group33;
int index33;
int groupLen33;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtable";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=45350913;
 //BA.debugLineNum = 45350913;BA.debugLine="SQLIndex = SQLIndex + 1";
__ref._sqlindex /*int*/  = (int) (__ref._sqlindex /*int*/ +1);
RDebugUtils.currentLine=45350914;
 //BA.debugLineNum = 45350914;BA.debugLine="If mRowsPerPage = 0 Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._mrowsperpage /*int*/ ==0) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=45350916;
 //BA.debugLineNum = 45350916;BA.debugLine="Dim MyIndex As Int = SQLIndex";
_myindex = __ref._sqlindex /*int*/ ;
RDebugUtils.currentLine=45350917;
 //BA.debugLineNum = 45350917;BA.debugLine="If DontSleep = False Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_dontsleep==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=45350918;
 //BA.debugLineNum = 45350918;BA.debugLine="Sleep(40)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "implupdatedatafromquery"),(int) (40));
this.state = 71;
return;
case 71:
//C
this.state = 10;
;
 if (true) break;
;
RDebugUtils.currentLine=45350920;
 //BA.debugLineNum = 45350920;BA.debugLine="If MyIndex <> SQLIndex Then";

case 10:
//if
this.state = 13;
if (_myindex!=__ref._sqlindex /*int*/ ) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=45350921;
 //BA.debugLineNum = 45350921;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=45350923;
 //BA.debugLineNum = 45350923;BA.debugLine="VisibleRowIds.Clear";
__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=45350925;
 //BA.debugLineNum = 45350925;BA.debugLine="Dim rs As ResultSet = sql1.ExecQuery2(Query, Args";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2(_query,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_args)));
RDebugUtils.currentLine=45350926;
 //BA.debugLineNum = 45350926;BA.debugLine="Dim success As Boolean = True";
_success = parent.__c.True;
RDebugUtils.currentLine=45350930;
 //BA.debugLineNum = 45350930;BA.debugLine="If success Then";
if (true) break;

case 14:
//if
this.state = 67;
if (_success) { 
this.state = 16;
}else {
this.state = 66;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=45350931;
 //BA.debugLineNum = 45350931;BA.debugLine="Dim RowNumber As Int = 1";
_rownumber = (int) (1);
RDebugUtils.currentLine=45350932;
 //BA.debugLineNum = 45350932;BA.debugLine="Do While RowNumber <= mRowsPerPage And rs.NextRo";
if (true) break;

case 17:
//do while
this.state = 32;
while (_rownumber<=__ref._mrowsperpage /*int*/  && _rs.NextRow()) {
this.state = 19;
if (true) break;
}
if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=45350933;
 //BA.debugLineNum = 45350933;BA.debugLine="VisibleRowIds.Add(rs.GetLong(\"rowid\"))";
__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rs.GetLong("rowid")));
RDebugUtils.currentLine=45350934;
 //BA.debugLineNum = 45350934;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
if (true) break;

case 20:
//for
this.state = 31;
group17 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
index17 = 0;
groupLen17 = group17.getSize();
this.state = 72;
if (true) break;

case 72:
//C
this.state = 31;
if (index17 < groupLen17) {
this.state = 22;
_c = (b4j.example.b4xtable._b4xtablecolumn)(group17.Get(index17));}
if (true) break;

case 73:
//C
this.state = 72;
index17++;
if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=45350935;
 //BA.debugLineNum = 45350935;BA.debugLine="Dim lbl As B4XView = GetLabelFromColumn(c, Row";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._getlabelfromcolumn /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_c,_rownumber);
RDebugUtils.currentLine=45350936;
 //BA.debugLineNum = 45350936;BA.debugLine="Select c.ColumnType";
if (true) break;

case 23:
//select
this.state = 30;
switch (BA.switchObjectToInt(_c.ColumnType /*int*/ ,__ref._column_type_text /*int*/ ,__ref._column_type_numbers /*int*/ ,__ref._column_type_date /*int*/ )) {
case 0: {
this.state = 25;
if (true) break;
}
case 1: {
this.state = 27;
if (true) break;
}
case 2: {
this.state = 29;
if (true) break;
}
}
if (true) break;

case 25:
//C
this.state = 30;
RDebugUtils.currentLine=45350938;
 //BA.debugLineNum = 45350938;BA.debugLine="SetTextToCell(rs.GetString(c.SQLID), lbl, c.";
__ref._settexttocell /*String*/ (null,_rs.GetString(_c.SQLID /*String*/ ),_lbl,_c.Searchable /*boolean*/ );
 if (true) break;

case 27:
//C
this.state = 30;
RDebugUtils.currentLine=45350940;
 //BA.debugLineNum = 45350940;BA.debugLine="c.Formatter.FormatLabel(rs.GetDouble(c.SQLID";
_c.Formatter /*b4j.example.b4xformatter*/ ._formatlabel /*String*/ (null,_rs.GetDouble(_c.SQLID /*String*/ ),_lbl);
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=45350942;
 //BA.debugLineNum = 45350942;BA.debugLine="lbl.Text = DateTime.Date(rs.GetLong(c.SQLID)";
_lbl.setText(parent.__c.DateTime.Date(_rs.GetLong(_c.SQLID /*String*/ )));
 if (true) break;

case 30:
//C
this.state = 73;
;
 if (true) break;
if (true) break;

case 31:
//C
this.state = 17;
;
RDebugUtils.currentLine=45350945;
 //BA.debugLineNum = 45350945;BA.debugLine="RowNumber = RowNumber + 1";
_rownumber = (int) (_rownumber+1);
 if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=45350947;
 //BA.debugLineNum = 45350947;BA.debugLine="Dim AreThereMoreResults As Boolean = RowNumber =";
_aretheremoreresults = _rownumber==__ref._mrowsperpage /*int*/ +1 && _rs.NextRow();
RDebugUtils.currentLine=45350948;
 //BA.debugLineNum = 45350948;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=45350949;
 //BA.debugLineNum = 45350949;BA.debugLine="For i = RowNumber To mRowsPerPage";
if (true) break;

case 33:
//for
this.state = 40;
step32 = 1;
limit32 = __ref._mrowsperpage /*int*/ ;
_i = _rownumber ;
this.state = 74;
if (true) break;

case 74:
//C
this.state = 40;
if ((step32 > 0 && _i <= limit32) || (step32 < 0 && _i >= limit32)) this.state = 35;
if (true) break;

case 75:
//C
this.state = 74;
_i = ((int)(0 + _i + step32)) ;
if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=45350950;
 //BA.debugLineNum = 45350950;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
if (true) break;

case 36:
//for
this.state = 39;
group33 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
index33 = 0;
groupLen33 = group33.getSize();
this.state = 76;
if (true) break;

case 76:
//C
this.state = 39;
if (index33 < groupLen33) {
this.state = 38;
_c = (b4j.example.b4xtable._b4xtablecolumn)(group33.Get(index33));}
if (true) break;

case 77:
//C
this.state = 76;
index33++;
if (true) break;

case 38:
//C
this.state = 77;
RDebugUtils.currentLine=45350952;
 //BA.debugLineNum = 45350952;BA.debugLine="SetTextToCell(\"\", GetLabelFromColumn(c, i), c.";
__ref._settexttocell /*String*/ (null,"",__ref._getlabelfromcolumn /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_c,_i),_c.Searchable /*boolean*/ );
 if (true) break;
if (true) break;

case 39:
//C
this.state = 75;
;
RDebugUtils.currentLine=45350957;
 //BA.debugLineNum = 45350957;BA.debugLine="VisibleRowIds.Add(0)";
__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(0));
 if (true) break;
if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=45350959;
 //BA.debugLineNum = 45350959;BA.debugLine="mLastRowIndex = mFirstRowIndex - 2 + RowNumber";
__ref._mlastrowindex /*int*/  = (int) (__ref._mfirstrowindex /*int*/ -2+_rownumber);
RDebugUtils.currentLine=45350960;
 //BA.debugLineNum = 45350960;BA.debugLine="SetPageLabelState(lblLast, TotalCount >= 0)";
__ref._setpagelabelstate /*String*/ (null,__ref._lbllast /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_totalcount>=0);
RDebugUtils.currentLine=45350961;
 //BA.debugLineNum = 45350961;BA.debugLine="If TotalCount >= 0 Then";
if (true) break;

case 41:
//if
this.state = 64;
if (_totalcount>=0) { 
this.state = 43;
}else {
this.state = 51;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=45350962;
 //BA.debugLineNum = 45350962;BA.debugLine="If TotalCount = 0 Then";
if (true) break;

case 44:
//if
this.state = 49;
if (_totalcount==0) { 
this.state = 46;
}else {
this.state = 48;
}if (true) break;

case 46:
//C
this.state = 49;
RDebugUtils.currentLine=45350963;
 //BA.debugLineNum = 45350963;BA.debugLine="lblFromTo.Text = \"\"";
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
 if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=45350965;
 //BA.debugLineNum = 45350965;BA.debugLine="lblFromTo.Text = $\"${DefaultFormatter.Format(m";
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText((""+parent.__c.SmartStringFormatter("",(Object)(__ref._defaultformatter /*b4j.example.b4xformatter*/ ._format /*String*/ (null,__ref._mfirstrowindex /*int*/ +1)))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._stringto /*String*/ ))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._defaultformatter /*b4j.example.b4xformatter*/ ._format /*String*/ (null,__ref._mlastrowindex /*int*/ +1)))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._stringoutof /*String*/ ))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._defaultformatter /*b4j.example.b4xformatter*/ ._format /*String*/ (null,_totalcount)))+""));
 if (true) break;

case 49:
//C
this.state = 64;
;
RDebugUtils.currentLine=45350967;
 //BA.debugLineNum = 45350967;BA.debugLine="SetPageLabelState(lblNext, mLastRowIndex < Tota";
__ref._setpagelabelstate /*String*/ (null,__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._mlastrowindex /*int*/ <_totalcount-1);
RDebugUtils.currentLine=45350968;
 //BA.debugLineNum = 45350968;BA.debugLine="SetPageLabelState(lblLast, lblNext.Tag)";
__ref._setpagelabelstate /*String*/ (null,__ref._lbllast /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,BA.ObjectToBoolean(__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()));
 if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=45350970;
 //BA.debugLineNum = 45350970;BA.debugLine="If mLastRowIndex = -1 Then";
if (true) break;

case 52:
//if
this.state = 63;
if (__ref._mlastrowindex /*int*/ ==-1) { 
this.state = 54;
}else {
this.state = 56;
}if (true) break;

case 54:
//C
this.state = 63;
RDebugUtils.currentLine=45350971;
 //BA.debugLineNum = 45350971;BA.debugLine="lblFromTo.Text = StringNoMatches";
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._stringnomatches /*String*/ );
 if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=45350973;
 //BA.debugLineNum = 45350973;BA.debugLine="lblFromTo.Text = $\"${DefaultFormatter.Format(m";
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText((""+parent.__c.SmartStringFormatter("",(Object)(__ref._defaultformatter /*b4j.example.b4xformatter*/ ._format /*String*/ (null,__ref._mfirstrowindex /*int*/ +1)))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._stringto /*String*/ ))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._defaultformatter /*b4j.example.b4xformatter*/ ._format /*String*/ (null,__ref._mlastrowindex /*int*/ +1)))+""));
RDebugUtils.currentLine=45350974;
 //BA.debugLineNum = 45350974;BA.debugLine="If AreThereMoreResults Then lblFromTo.Text = l";
if (true) break;

case 57:
//if
this.state = 62;
if (_aretheremoreresults) { 
this.state = 59;
;}if (true) break;

case 59:
//C
this.state = 62;
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()+" "+__ref._stringmoreavailable /*String*/ );
if (true) break;

case 62:
//C
this.state = 63;
;
 if (true) break;

case 63:
//C
this.state = 64;
;
RDebugUtils.currentLine=45350976;
 //BA.debugLineNum = 45350976;BA.debugLine="SetPageLabelState(lblNext, AreThereMoreResults)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_aretheremoreresults);
RDebugUtils.currentLine=45350977;
 //BA.debugLineNum = 45350977;BA.debugLine="SetPageLabelState(lblLast, False)";
__ref._setpagelabelstate /*String*/ (null,__ref._lbllast /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,parent.__c.False);
 if (true) break;

case 64:
//C
this.state = 67;
;
RDebugUtils.currentLine=45350979;
 //BA.debugLineNum = 45350979;BA.debugLine="SetPageLabelState(lblBack, mFirstRowIndex > 0)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblback /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._mfirstrowindex /*int*/ >0);
RDebugUtils.currentLine=45350980;
 //BA.debugLineNum = 45350980;BA.debugLine="SetPageLabelState(lblFirst, lblBack.Tag)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblfirst /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,BA.ObjectToBoolean(__ref._lblback /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()));
RDebugUtils.currentLine=45350981;
 //BA.debugLineNum = 45350981;BA.debugLine="mCurrentPage = Ceil(mFirstRowIndex / mRowsPerPag";
__ref._mcurrentpage /*int*/  = (int) (parent.__c.Ceil(__ref._mfirstrowindex /*int*/ /(double)__ref._mrowsperpage /*int*/ )+1);
RDebugUtils.currentLine=45350982;
 //BA.debugLineNum = 45350982;BA.debugLine="lblNumber.Text = NumberFormat(mCurrentPage, 0, 0";
__ref._lblnumber /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(parent.__c.NumberFormat(__ref._mcurrentpage /*int*/ ,(int) (0),(int) (0)));
RDebugUtils.currentLine=45350983;
 //BA.debugLineNum = 45350983;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=45350984;
 //BA.debugLineNum = 45350984;BA.debugLine="mCurrentCount = TotalCount";
__ref._mcurrentcount /*int*/  = _totalcount;
 if (true) break;

case 66:
//C
this.state = 67;
RDebugUtils.currentLine=45350986;
 //BA.debugLineNum = 45350986;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("945350986",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
;
RDebugUtils.currentLine=45350988;
 //BA.debugLineNum = 45350988;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_DataUp";

case 67:
//if
this.state = 70;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_DataUpdated",(int) (0))) { 
this.state = 69;
}if (true) break;

case 69:
//C
this.state = 70;
RDebugUtils.currentLine=45350989;
 //BA.debugLineNum = 45350989;BA.debugLine="CallSub(mCallBack, mEventName & \"_DataUpdated\")";
parent.__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_DataUpdated");
 if (true) break;

case 70:
//C
this.state = -1;
;
RDebugUtils.currentLine=45350991;
 //BA.debugLineNum = 45350991;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _settexttocell(b4j.example.b4xtable __ref,String _text,anywheresoftware.b4a.objects.B4XViewWrapper _lbl,boolean _searchable) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "settexttocell", true))
	 {return ((String) Debug.delegate(ba, "settexttocell", new Object[] {_text,_lbl,_searchable}));}
anywheresoftware.b4a.objects.B4XViewWrapper _parent = null;
int _x = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _textpane = null;
RDebugUtils.currentLine=45416448;
 //BA.debugLineNum = 45416448;BA.debugLine="Private Sub SetTextToCell (Text As String, lbl As";
RDebugUtils.currentLine=45416449;
 //BA.debugLineNum = 45416449;BA.debugLine="If Searchable = False Or HighlightSearchResults =";
if (_searchable==__c.False || __ref._highlightsearchresults /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=45416450;
 //BA.debugLineNum = 45416450;BA.debugLine="lbl.Text = Text";
_lbl.setText(_text);
 }else {
RDebugUtils.currentLine=45416453;
 //BA.debugLineNum = 45416453;BA.debugLine="Dim parent As B4XView = lbl.Parent";
_parent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_parent = _lbl.getParent();
RDebugUtils.currentLine=45416454;
 //BA.debugLineNum = 45416454;BA.debugLine="If parent.GetView(parent.NumberOfViews - 1).Tag";
if ((_parent.GetView((int) (_parent.getNumberOfViews()-1)).getTag()).equals((Object)(__ref._textpanetag /*String*/ ))) { 
RDebugUtils.currentLine=45416455;
 //BA.debugLineNum = 45416455;BA.debugLine="parent.GetView(parent.NumberOfViews - 1).Remove";
_parent.GetView((int) (_parent.getNumberOfViews()-1)).RemoveViewFromParent();
 };
RDebugUtils.currentLine=45416458;
 //BA.debugLineNum = 45416458;BA.debugLine="If FilterText = \"\" Then";
if ((__ref._filtertext /*String*/ ).equals("")) { 
RDebugUtils.currentLine=45416459;
 //BA.debugLineNum = 45416459;BA.debugLine="lbl.Text = Text";
_lbl.setText(_text);
 }else {
RDebugUtils.currentLine=45416461;
 //BA.debugLineNum = 45416461;BA.debugLine="Dim x As Int = Text.ToLowerCase.IndexOf(FilterT";
_x = _text.toLowerCase().indexOf(__ref._filtertext /*String*/ );
RDebugUtils.currentLine=45416462;
 //BA.debugLineNum = 45416462;BA.debugLine="If x = -1 Or (PrefixSearch And x > 0) Then";
if (_x==-1 || (__ref._prefixsearch /*boolean*/  && _x>0)) { 
RDebugUtils.currentLine=45416463;
 //BA.debugLineNum = 45416463;BA.debugLine="lbl.Text = Text";
_lbl.setText(_text);
RDebugUtils.currentLine=45416464;
 //BA.debugLineNum = 45416464;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=45416479;
 //BA.debugLineNum = 45416479;BA.debugLine="TextFlow.Reset";
__ref._textflow /*b4j.example.b4jtextflow*/ ._reset /*b4j.example.b4jtextflow*/ (null);
RDebugUtils.currentLine=45416480;
 //BA.debugLineNum = 45416480;BA.debugLine="If x > 0 Then";
if (_x>0) { 
RDebugUtils.currentLine=45416481;
 //BA.debugLineNum = 45416481;BA.debugLine="TextFlow.Append(Text.SubString2(0, x)).SetColo";
__ref._textflow /*b4j.example.b4jtextflow*/ ._append /*b4j.example.b4jtextflow*/ (null,_text.substring((int) (0),_x))._setcolor /*b4j.example.b4jtextflow*/ (null,__ref._textcolor /*int*/ )._setfont /*b4j.example.b4jtextflow*/ (null,(anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(__ref._labelsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getObject())));
 };
RDebugUtils.currentLine=45416483;
 //BA.debugLineNum = 45416483;BA.debugLine="TextFlow.Append(Text.SubString2(x, x + FilterTe";
__ref._textflow /*b4j.example.b4jtextflow*/ ._append /*b4j.example.b4jtextflow*/ (null,_text.substring(_x,(int) (_x+__ref._filtertext /*String*/ .length())))._setcolor /*b4j.example.b4jtextflow*/ (null,__ref._highlighttextcolor /*int*/ )._setfont /*b4j.example.b4jtextflow*/ (null,(anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(__ref._labelsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getObject())));
RDebugUtils.currentLine=45416484;
 //BA.debugLineNum = 45416484;BA.debugLine="If x + FilterText.Length < Text.Length Then";
if (_x+__ref._filtertext /*String*/ .length()<_text.length()) { 
RDebugUtils.currentLine=45416485;
 //BA.debugLineNum = 45416485;BA.debugLine="TextFlow.Append(Text.SubString(x + FilterText.";
__ref._textflow /*b4j.example.b4jtextflow*/ ._append /*b4j.example.b4jtextflow*/ (null,_text.substring((int) (_x+__ref._filtertext /*String*/ .length())))._setcolor /*b4j.example.b4jtextflow*/ (null,__ref._textcolor /*int*/ )._setfont /*b4j.example.b4jtextflow*/ (null,(anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(__ref._labelsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getObject())));
 };
RDebugUtils.currentLine=45416487;
 //BA.debugLineNum = 45416487;BA.debugLine="Dim TextPane As B4XView = TextFlow.CreateTextFl";
_textpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
_textpane = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._textflow /*b4j.example.b4jtextflow*/ ._createtextflow /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ (null).getObject()));
RDebugUtils.currentLine=45416488;
 //BA.debugLineNum = 45416488;BA.debugLine="TextPane.Tag = TextPaneTag";
_textpane.setTag((Object)(__ref._textpanetag /*String*/ ));
RDebugUtils.currentLine=45416489;
 //BA.debugLineNum = 45416489;BA.debugLine="lbl.Text = \"\"";
_lbl.setText("");
RDebugUtils.currentLine=45416490;
 //BA.debugLineNum = 45416490;BA.debugLine="parent.AddView(TextPane, 0, parent.Height / 2 -";
_parent.AddView((javafx.scene.Node)(_textpane.getObject()),0,_parent.getHeight()/(double)2-12,_parent.getWidth(),_parent.getHeight()/(double)2);
 };
 };
RDebugUtils.currentLine=45416494;
 //BA.debugLineNum = 45416494;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.b4xtable __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=44171264;
 //BA.debugLineNum = 44171264;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=44171265;
 //BA.debugLineNum = 44171265;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=44171266;
 //BA.debugLineNum = 44171266;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=44171267;
 //BA.debugLineNum = 44171267;BA.debugLine="Columns.Initialize";
__ref._columns /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=44171268;
 //BA.debugLineNum = 44171268;BA.debugLine="DefaultFormatter.Initialize";
__ref._defaultformatter /*b4j.example.b4xformatter*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=44171269;
 //BA.debugLineNum = 44171269;BA.debugLine="DefaultDataFormatter.Initialize";
__ref._defaultdataformatter /*b4j.example.b4xformatter*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=44171270;
 //BA.debugLineNum = 44171270;BA.debugLine="VisibleColumns.Initialize";
__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=44171271;
 //BA.debugLineNum = 44171271;BA.debugLine="HeaderFont = xui.CreateDefaultBoldFont(15)";
__ref._headerfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (15));
RDebugUtils.currentLine=44171272;
 //BA.debugLineNum = 44171272;BA.debugLine="LabelsFont = xui.CreateDefaultFont(15)";
__ref._labelsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (15));
RDebugUtils.currentLine=44171273;
 //BA.debugLineNum = 44171273;BA.debugLine="ArrowsDisabledColor = 0xFFBBBBBB";
__ref._arrowsdisabledcolor /*int*/  = ((int)0xffbbbbbb);
RDebugUtils.currentLine=44171274;
 //BA.debugLineNum = 44171274;BA.debugLine="ArrowsEnabledColor = xui.Color_Black";
__ref._arrowsenabledcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=44171275;
 //BA.debugLineNum = 44171275;BA.debugLine="VisibleRowIds.Initialize";
__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=44171276;
 //BA.debugLineNum = 44171276;BA.debugLine="MinimumWidth = 140dip";
__ref._minimumwidth /*int*/  = __c.DipToCurrent((int) (140));
RDebugUtils.currentLine=44171277;
 //BA.debugLineNum = 44171277;BA.debugLine="RowHeight = 40dip";
__ref._rowheight /*int*/  = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=44171278;
 //BA.debugLineNum = 44171278;BA.debugLine="HeadersHeight = 40dip";
__ref._headersheight /*int*/  = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=44171280;
 //BA.debugLineNum = 44171280;BA.debugLine="TextFlow.Initialize";
__ref._textflow /*b4j.example.b4jtextflow*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=44171284;
 //BA.debugLineNum = 44171284;BA.debugLine="End Sub";
return "";
}
public String  _lblback_click(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lblback_click", true))
	 {return ((String) Debug.delegate(ba, "lblback_click", null));}
RDebugUtils.currentLine=47120384;
 //BA.debugLineNum = 47120384;BA.debugLine="Private Sub lblBack_Click";
RDebugUtils.currentLine=47120385;
 //BA.debugLineNum = 47120385;BA.debugLine="If lblBack.Tag = False Then Return";
if ((__ref._lblback /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=47120386;
 //BA.debugLineNum = 47120386;BA.debugLine="setFirstRowIndex (mFirstRowIndex - mRowsPerPage)";
__ref._setfirstrowindex /*String*/ (null,(int) (__ref._mfirstrowindex /*int*/ -__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=47120387;
 //BA.debugLineNum = 47120387;BA.debugLine="End Sub";
return "";
}
public String  _setfirstrowindex(b4j.example.b4xtable __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "setfirstrowindex", true))
	 {return ((String) Debug.delegate(ba, "setfirstrowindex", new Object[] {_row}));}
RDebugUtils.currentLine=46727168;
 //BA.debugLineNum = 46727168;BA.debugLine="Public Sub setFirstRowIndex (row As Int)";
RDebugUtils.currentLine=46727169;
 //BA.debugLineNum = 46727169;BA.debugLine="row = Max(0, Min(CountAll - 1, row))";
_row = (int) (__c.Max(0,__c.Min(__ref._countall /*int*/ -1,_row)));
RDebugUtils.currentLine=46727170;
 //BA.debugLineNum = 46727170;BA.debugLine="mFirstRowIndex = row";
__ref._mfirstrowindex /*int*/  = _row;
RDebugUtils.currentLine=46727171;
 //BA.debugLineNum = 46727171;BA.debugLine="UpdateData (False)";
__ref._updatedata /*String*/ (null,__c.False);
RDebugUtils.currentLine=46727172;
 //BA.debugLineNum = 46727172;BA.debugLine="End Sub";
return "";
}
public String  _lblback_mouseclicked(b4j.example.b4xtable __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lblback_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lblback_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=47382528;
 //BA.debugLineNum = 47382528;BA.debugLine="Private Sub lblBack_MouseClicked (EventData As Mou";
RDebugUtils.currentLine=47382529;
 //BA.debugLineNum = 47382529;BA.debugLine="lblBack_Click";
__ref._lblback_click /*String*/ (null);
RDebugUtils.currentLine=47382530;
 //BA.debugLineNum = 47382530;BA.debugLine="End Sub";
return "";
}
public String  _lblfirst_click(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lblfirst_click", true))
	 {return ((String) Debug.delegate(ba, "lblfirst_click", null));}
RDebugUtils.currentLine=47054848;
 //BA.debugLineNum = 47054848;BA.debugLine="Private Sub lblFirst_Click";
RDebugUtils.currentLine=47054849;
 //BA.debugLineNum = 47054849;BA.debugLine="If lblFirst.Tag = False Then Return";
if ((__ref._lblfirst /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=47054850;
 //BA.debugLineNum = 47054850;BA.debugLine="setFirstRowIndex (0)";
__ref._setfirstrowindex /*String*/ (null,(int) (0));
RDebugUtils.currentLine=47054851;
 //BA.debugLineNum = 47054851;BA.debugLine="End Sub";
return "";
}
public String  _lblfirst_mouseclicked(b4j.example.b4xtable __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lblfirst_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lblfirst_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=47316992;
 //BA.debugLineNum = 47316992;BA.debugLine="Private Sub lblFirst_MouseClicked (EventData As Mo";
RDebugUtils.currentLine=47316993;
 //BA.debugLineNum = 47316993;BA.debugLine="lblFirst_Click";
__ref._lblfirst_click /*String*/ (null);
RDebugUtils.currentLine=47316994;
 //BA.debugLineNum = 47316994;BA.debugLine="End Sub";
return "";
}
public String  _lbllast_click(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lbllast_click", true))
	 {return ((String) Debug.delegate(ba, "lbllast_click", null));}
int _numberofpages = 0;
RDebugUtils.currentLine=47185920;
 //BA.debugLineNum = 47185920;BA.debugLine="Private Sub lblLast_Click";
RDebugUtils.currentLine=47185921;
 //BA.debugLineNum = 47185921;BA.debugLine="If lblLast.Tag = False Then Return";
if ((__ref._lbllast /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=47185922;
 //BA.debugLineNum = 47185922;BA.debugLine="Dim NumberOfPages As Int = Ceil(mCurrentCount / m";
_numberofpages = (int) (__c.Ceil(__ref._mcurrentcount /*int*/ /(double)__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=47185923;
 //BA.debugLineNum = 47185923;BA.debugLine="setFirstRowIndex ((NumberOfPages - 1) * mRowsPerP";
__ref._setfirstrowindex /*String*/ (null,(int) ((_numberofpages-1)*__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=47185924;
 //BA.debugLineNum = 47185924;BA.debugLine="End Sub";
return "";
}
public String  _lbllast_mouseclicked(b4j.example.b4xtable __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lbllast_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lbllast_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=47513600;
 //BA.debugLineNum = 47513600;BA.debugLine="Private Sub lblLast_MouseClicked (EventData As Mou";
RDebugUtils.currentLine=47513601;
 //BA.debugLineNum = 47513601;BA.debugLine="lblLast_Click";
__ref._lbllast_click /*String*/ (null);
RDebugUtils.currentLine=47513602;
 //BA.debugLineNum = 47513602;BA.debugLine="End Sub";
return "";
}
public String  _lblnext_click(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lblnext_click", true))
	 {return ((String) Debug.delegate(ba, "lblnext_click", null));}
RDebugUtils.currentLine=47251456;
 //BA.debugLineNum = 47251456;BA.debugLine="Private Sub lblNext_Click";
RDebugUtils.currentLine=47251457;
 //BA.debugLineNum = 47251457;BA.debugLine="If lblNext.Tag = False Then Return";
if ((__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=47251458;
 //BA.debugLineNum = 47251458;BA.debugLine="setFirstRowIndex (mFirstRowIndex + mRowsPerPage)";
__ref._setfirstrowindex /*String*/ (null,(int) (__ref._mfirstrowindex /*int*/ +__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=47251459;
 //BA.debugLineNum = 47251459;BA.debugLine="End Sub";
return "";
}
public String  _lblnext_mouseclicked(b4j.example.b4xtable __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lblnext_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lblnext_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=47448064;
 //BA.debugLineNum = 47448064;BA.debugLine="Private Sub lblNext_MouseClicked (EventData As Mou";
RDebugUtils.currentLine=47448065;
 //BA.debugLineNum = 47448065;BA.debugLine="lblNext_Click";
__ref._lblnext_click /*String*/ (null);
RDebugUtils.currentLine=47448066;
 //BA.debugLineNum = 47448066;BA.debugLine="End Sub";
return "";
}
public String  _resizecolumnimpl(b4j.example.b4xtable __ref,b4j.example.b4xtable._b4xtablecolumn _c,int _totalheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "resizecolumnimpl", true))
	 {return ((String) Debug.delegate(ba, "resizecolumnimpl", new Object[] {_c,_totalheight}));}
float _height = 0f;
int _topint = 0;
int _heightint = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
RDebugUtils.currentLine=44957696;
 //BA.debugLineNum = 44957696;BA.debugLine="Private Sub ResizeColumnImpl (c As B4XTableColumn,";
RDebugUtils.currentLine=44957697;
 //BA.debugLineNum = 44957697;BA.debugLine="c.Panel.Width = c.ComputedWidth";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(_c.ComputedWidth /*int*/ );
RDebugUtils.currentLine=44957699;
 //BA.debugLineNum = 44957699;BA.debugLine="Dim Height As Float = TotalHeight / mRowsPerPage";
_height = (float) (_totalheight/(double)__ref._mrowsperpage /*int*/ );
RDebugUtils.currentLine=44957700;
 //BA.debugLineNum = 44957700;BA.debugLine="If AllowSmallRowHeightModifications = False Then";
if (__ref._allowsmallrowheightmodifications /*boolean*/ ==__c.False) { 
_height = (float) (__ref._rowheight /*int*/ );};
RDebugUtils.currentLine=44957701;
 //BA.debugLineNum = 44957701;BA.debugLine="Dim TopInt, HeightInt As Int";
_topint = 0;
_heightint = 0;
RDebugUtils.currentLine=44957702;
 //BA.debugLineNum = 44957702;BA.debugLine="For i = 0 To c.CellsLayouts.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=44957703;
 //BA.debugLineNum = 44957703;BA.debugLine="Dim p As B4XView = c.CellsLayouts.Get(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=44957704;
 //BA.debugLineNum = 44957704;BA.debugLine="If i < mRowsPerPage + 1 Then";
if (_i<__ref._mrowsperpage /*int*/ +1) { 
RDebugUtils.currentLine=44957705;
 //BA.debugLineNum = 44957705;BA.debugLine="Dim HeightInt As Int = Round(Height * i + Heade";
_heightint = (int) (__c.Round(_height*_i+__ref._headersheight /*int*/ -_topint));
RDebugUtils.currentLine=44957706;
 //BA.debugLineNum = 44957706;BA.debugLine="If i = 0 Then HeightInt = HeadersHeight";
if (_i==0) { 
_heightint = __ref._headersheight /*int*/ ;};
RDebugUtils.currentLine=44957707;
 //BA.debugLineNum = 44957707;BA.debugLine="p.SetLayoutAnimated(0, 0, TopInt, c.ComputedWid";
_p.SetLayoutAnimated((int) (0),0,_topint,_c.ComputedWidth /*int*/ ,_heightint);
RDebugUtils.currentLine=44957708;
 //BA.debugLineNum = 44957708;BA.debugLine="p.Visible = True";
_p.setVisible(__c.True);
RDebugUtils.currentLine=44957709;
 //BA.debugLineNum = 44957709;BA.debugLine="If c.DisableAutoResizeLayout = False Then";
if (_c.DisableAutoResizeLayout /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=44957710;
 //BA.debugLineNum = 44957710;BA.debugLine="Dim lbl As B4XView = p.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = _p.GetView((int) (0));
RDebugUtils.currentLine=44957711;
 //BA.debugLineNum = 44957711;BA.debugLine="lbl.SetLayoutAnimated(0, 0, 0, p.Width, p.Heig";
_lbl.SetLayoutAnimated((int) (0),0,0,_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=44957713;
 //BA.debugLineNum = 44957713;BA.debugLine="If c.Searchable And p.NumberOfViews > 1 And p.";
if (_c.Searchable /*boolean*/  && _p.getNumberOfViews()>1 && (_p.GetView((int) (1)).getTag()).equals((Object)(__ref._textpanetag /*String*/ ))) { 
RDebugUtils.currentLine=44957714;
 //BA.debugLineNum = 44957714;BA.debugLine="p.GetView(1).Width = p.Width";
_p.GetView((int) (1)).setWidth(_p.getWidth());
 };
 };
RDebugUtils.currentLine=44957718;
 //BA.debugLineNum = 44957718;BA.debugLine="TopInt = TopInt + HeightInt";
_topint = (int) (_topint+_heightint);
 }else {
RDebugUtils.currentLine=44957720;
 //BA.debugLineNum = 44957720;BA.debugLine="p.Visible = False";
_p.setVisible(__c.False);
 };
 }
};
RDebugUtils.currentLine=44957723;
 //BA.debugLineNum = 44957723;BA.debugLine="End Sub";
return "";
}
public String  _resizeandreorderclvitems(b4j.example.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "resizeandreorderclvitems", true))
	 {return ((String) Debug.delegate(ba, "resizeandreorderclvitems", null));}
int _i = 0;
b4j.example.b4xtable._b4xtablecolumn _c = null;
int _clvindex = 0;
RDebugUtils.currentLine=44695552;
 //BA.debugLineNum = 44695552;BA.debugLine="Private Sub ResizeAndReorderCLVItems";
RDebugUtils.currentLine=44695553;
 //BA.debugLineNum = 44695553;BA.debugLine="Dim i As Int = NumberOfFrozenColumns";
_i = __ref._numberoffrozencolumns /*int*/ ;
RDebugUtils.currentLine=44695554;
 //BA.debugLineNum = 44695554;BA.debugLine="Do While i < VisibleColumns.Size";
while (_i<__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) {
RDebugUtils.currentLine=44695555;
 //BA.debugLineNum = 44695555;BA.debugLine="Dim c As B4XTableColumn = VisibleColumns.Get(i)";
_c = (b4j.example.b4xtable._b4xtablecolumn)(__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=44695556;
 //BA.debugLineNum = 44695556;BA.debugLine="Dim CLVIndex As Int = i - NumberOfFrozenColumns";
_clvindex = (int) (_i-__ref._numberoffrozencolumns /*int*/ );
RDebugUtils.currentLine=44695557;
 //BA.debugLineNum = 44695557;BA.debugLine="If c <> clvData.GetValue(CLVIndex) Then";
if ((_c).equals((b4j.example.b4xtable._b4xtablecolumn)(__ref._clvdata /*b4j.example.customlistview*/ ._getvalue(_clvindex))) == false) { 
RDebugUtils.currentLine=44695558;
 //BA.debugLineNum = 44695558;BA.debugLine="RemoveColumnFromCLV(c)";
__ref._removecolumnfromclv /*String*/ (null,_c);
RDebugUtils.currentLine=44695559;
 //BA.debugLineNum = 44695559;BA.debugLine="clvData.InsertAt(CLVIndex, c.Panel, c)";
__ref._clvdata /*b4j.example.customlistview*/ ._insertat(_clvindex,_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(Object)(_c));
 }else {
RDebugUtils.currentLine=44695561;
 //BA.debugLineNum = 44695561;BA.debugLine="clvData.ResizeItem(CLVIndex, c.ComputedWidth)";
__ref._clvdata /*b4j.example.customlistview*/ ._resizeitem(_clvindex,_c.ComputedWidth /*int*/ );
 };
RDebugUtils.currentLine=44695563;
 //BA.debugLineNum = 44695563;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=44695565;
 //BA.debugLineNum = 44695565;BA.debugLine="End Sub";
return "";
}
public void  _updatesearchfieldvisibility(b4j.example.b4xtable __ref) throws Exception{
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "updatesearchfieldvisibility", true))
	 {Debug.delegate(ba, "updatesearchfieldvisibility", null); return;}
ResumableSub_UpdateSearchFieldVisibility rsub = new ResumableSub_UpdateSearchFieldVisibility(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_UpdateSearchFieldVisibility extends BA.ResumableSub {
public ResumableSub_UpdateSearchFieldVisibility(b4j.example.b4xtable parent,b4j.example.b4xtable __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xtable __ref;
b4j.example.b4xtable parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtable";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=44761090;
 //BA.debugLineNum = 44761090;BA.debugLine="Sleep(100) 'workaround for a JavaFX drawing bug";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "updatesearchfieldvisibility"),(int) (100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=44761092;
 //BA.debugLineNum = 44761092;BA.debugLine="SearchField.mBase.Visible = SearchVisible And Cou";
__ref._searchfield /*b4j.example.b4xfloattextfield*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__ref._searchvisible /*boolean*/  && __ref._countall /*int*/ >0);
RDebugUtils.currentLine=44761093;
 //BA.debugLineNum = 44761093;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _searchfield_textchanged(b4j.example.b4xtable __ref,String _old,String _new) throws Exception{
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "searchfield_textchanged", true))
	 {Debug.delegate(ba, "searchfield_textchanged", new Object[] {_old,_new}); return;}
ResumableSub_SearchField_TextChanged rsub = new ResumableSub_SearchField_TextChanged(this,__ref,_old,_new);
rsub.resume(ba, null);
}
public static class ResumableSub_SearchField_TextChanged extends BA.ResumableSub {
public ResumableSub_SearchField_TextChanged(b4j.example.b4xtable parent,b4j.example.b4xtable __ref,String _old,String _new) {
this.parent = parent;
this.__ref = __ref;
this._old = _old;
this._new = _new;
this.__ref = parent;
}
b4j.example.b4xtable __ref;
b4j.example.b4xtable parent;
String _old;
String _new;
int _myindex = 0;
String _term = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtable";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=47579137;
 //BA.debugLineNum = 47579137;BA.debugLine="SearchIndex = SearchIndex + 1";
__ref._searchindex /*int*/  = (int) (__ref._searchindex /*int*/ +1);
RDebugUtils.currentLine=47579138;
 //BA.debugLineNum = 47579138;BA.debugLine="Dim MyIndex As Int = SearchIndex";
_myindex = __ref._searchindex /*int*/ ;
RDebugUtils.currentLine=47579139;
 //BA.debugLineNum = 47579139;BA.debugLine="Sleep(SleepBeforeSearch)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "searchfield_textchanged"),__ref._sleepbeforesearch /*int*/ );
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
RDebugUtils.currentLine=47579140;
 //BA.debugLineNum = 47579140;BA.debugLine="If MyIndex <> SearchIndex Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_myindex!=__ref._searchindex /*int*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=47579141;
 //BA.debugLineNum = 47579141;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=47579143;
 //BA.debugLineNum = 47579143;BA.debugLine="Dim term As String = New.ToLowerCase";
_term = _new.toLowerCase();
RDebugUtils.currentLine=47579144;
 //BA.debugLineNum = 47579144;BA.debugLine="If term = FilterText Then Return";
if (true) break;

case 5:
//if
this.state = 10;
if ((_term).equals(__ref._filtertext /*String*/ )) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
if (true) return ;
if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=47579145;
 //BA.debugLineNum = 47579145;BA.debugLine="FilterText = term";
__ref._filtertext /*String*/  = _term;
RDebugUtils.currentLine=47579146;
 //BA.debugLineNum = 47579146;BA.debugLine="mFirstRowIndex = 0";
__ref._mfirstrowindex /*int*/  = (int) (0);
RDebugUtils.currentLine=47579147;
 //BA.debugLineNum = 47579147;BA.debugLine="UpdateData (False)";
__ref._updatedata /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=47579148;
 //BA.debugLineNum = 47579148;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}