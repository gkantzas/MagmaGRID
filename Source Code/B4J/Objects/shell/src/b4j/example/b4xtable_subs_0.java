package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xtable_subs_0 {


public static RemoteObject  _addcolumn(RemoteObject __ref,RemoteObject _title,RemoteObject _columntype) throws Exception{
try {
		Debug.PushSubsStack("AddColumn (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,595);
if (RapidSub.canDelegate("addcolumn")) { return __ref.runUserSub(false, "b4xtable","addcolumn", __ref, _title, _columntype);}
RemoteObject _c = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
RemoteObject _header = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Title", _title);
Debug.locals.put("ColumnType", _columntype);
 BA.debugLineNum = 595;BA.debugLine="Public Sub AddColumn (Title As String, ColumnType";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 596;BA.debugLine="Dim c As B4XTableColumn";
Debug.JustUpdateDeviceLine();
_c = RemoteObject.createNew ("b4j.example.b4xtable._b4xtablecolumn");Debug.locals.put("c", _c);
 BA.debugLineNum = 597;BA.debugLine="c.Initialize";
Debug.JustUpdateDeviceLine();
_c.runVoidMethod ("Initialize");
 BA.debugLineNum = 598;BA.debugLine="c.Title = Title";
Debug.JustUpdateDeviceLine();
_c.setField ("Title" /*RemoteObject*/ ,_title);
 BA.debugLineNum = 599;BA.debugLine="c.ColumnType = ColumnType";
Debug.JustUpdateDeviceLine();
_c.setField ("ColumnType" /*RemoteObject*/ ,_columntype);
 BA.debugLineNum = 600;BA.debugLine="c.Sortable = ColumnType <> COLUMN_TYPE_VOID";
Debug.JustUpdateDeviceLine();
_c.setField ("Sortable" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("!",_columntype,BA.numberCast(double.class, __ref.getField(true,"_column_type_void" /*RemoteObject*/ )))));
 BA.debugLineNum = 601;BA.debugLine="c.Searchable = ColumnType = COLUMN_TYPE_TEXT";
Debug.JustUpdateDeviceLine();
_c.setField ("Searchable" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_columntype,BA.numberCast(double.class, __ref.getField(true,"_column_type_text" /*RemoteObject*/ )))));
 BA.debugLineNum = 602;BA.debugLine="c.CellsLayouts.Initialize";
Debug.JustUpdateDeviceLine();
_c.getField(false,"CellsLayouts" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 603;BA.debugLine="c.Formatter = DefaultDataFormatter";
Debug.JustUpdateDeviceLine();
_c.setField ("Formatter" /*RemoteObject*/ ,__ref.getField(false,"_defaultdataformatter" /*RemoteObject*/ ));
 BA.debugLineNum = 604;BA.debugLine="c.Panel = xui.CreatePanel(\"ColumnPanel\")";
Debug.JustUpdateDeviceLine();
_c.setField ("Panel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ColumnPanel"))));
 BA.debugLineNum = 605;BA.debugLine="c.Panel.Tag = c";
Debug.JustUpdateDeviceLine();
_c.getField(false,"Panel" /*RemoteObject*/ ).runMethod(false,"setTag",(_c));
 BA.debugLineNum = 606;BA.debugLine="c.Id = Title";
Debug.JustUpdateDeviceLine();
_c.setField ("Id" /*RemoteObject*/ ,_title);
 BA.debugLineNum = 607;BA.debugLine="Columns.Add(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columns" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_c)));
 BA.debugLineNum = 608;BA.debugLine="VisibleColumns.Add(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_visiblecolumns" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_c)));
 BA.debugLineNum = 609;BA.debugLine="CreateColumnLayouts(c, mRowsPerPage + 1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_createcolumnlayouts" /*RemoteObject*/ ,(Object)(_c),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mrowsperpage" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 610;BA.debugLine="Dim header As B4XView = GetLabelFromColumn(c, 0)";
Debug.JustUpdateDeviceLine();
_header = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_header = __ref.runClassMethod (b4j.example.b4xtable.class, "_getlabelfromcolumn" /*RemoteObject*/ ,(Object)(_c),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("header", _header);Debug.locals.put("header", _header);
 BA.debugLineNum = 611;BA.debugLine="SetTextOrCSBuilderToLabel (header, Title)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_settextorcsbuildertolabel" /*RemoteObject*/ ,(Object)(_header),(Object)((_title)));
 BA.debugLineNum = 612;BA.debugLine="If LayoutLoaded Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_layoutloaded" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 613;BA.debugLine="AddColumnToCLV(c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_addcolumntoclv" /*RemoteObject*/ ,(Object)(_c));
 };
 BA.debugLineNum = 615;BA.debugLine="Return c";
Debug.JustUpdateDeviceLine();
if (true) return _c;
 BA.debugLineNum = 616;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcolumntoclv(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddColumnToCLV (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,587);
if (RapidSub.canDelegate("addcolumntoclv")) { return __ref.runUserSub(false, "b4xtable","addcolumntoclv", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 587;BA.debugLine="Private Sub AddColumnToCLV (c As B4XTableColumn)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 588;BA.debugLine="clvData.Add(c.Panel, c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(_c.getField(false,"Panel" /*RemoteObject*/ )),(Object)((_c)));
 BA.debugLineNum = 589;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "b4xtable","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 141;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 142;BA.debugLine="Refresh2 (False, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_refresh2" /*RemoteObject*/ ,(Object)(b4xtable.__c.getField(true,"False")),(Object)(b4xtable.__c.getField(true,"False")));
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildlayoutscache(RemoteObject __ref,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("BuildLayoutsCache (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,619);
if (RapidSub.canDelegate("buildlayoutscache")) { return __ref.runUserSub(false, "b4xtable","buildlayoutscache", __ref, _size);}
RemoteObject _c = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
Debug.locals.put("Size", _size);
 BA.debugLineNum = 619;BA.debugLine="Public Sub BuildLayoutsCache (Size As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 620;BA.debugLine="For Each c As B4XTableColumn In Columns";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_columns" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_c = (group1.runMethod(false,"Get",index1));Debug.locals.put("c", _c);
Debug.locals.put("c", _c);
 BA.debugLineNum = 621;BA.debugLine="CreateColumnLayouts(c, Size + 1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_createcolumnlayouts" /*RemoteObject*/ ,(Object)(_c),(Object)(RemoteObject.solve(new RemoteObject[] {_size,RemoteObject.createImmutable(1)}, "+",1, 1)));
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 623;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildquery(RemoteObject __ref,RemoteObject _withpagelimit) throws Exception{
try {
		Debug.PushSubsStack("BuildQuery (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,337);
if (RapidSub.canDelegate("buildquery")) { return __ref.runUserSub(false, "b4xtable","buildquery", __ref, _withpagelimit);}
RemoteObject _sortcolumn = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _c = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _totalcount = RemoteObject.createImmutable(0);
RemoteObject _limit = RemoteObject.createImmutable(0);
RemoteObject _aargs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("WithPageLimit", _withpagelimit);
 BA.debugLineNum = 337;BA.debugLine="Public Sub BuildQuery (WithPageLimit As Boolean) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 338;BA.debugLine="Dim SortColumn As String";
Debug.JustUpdateDeviceLine();
_sortcolumn = RemoteObject.createImmutable("");Debug.locals.put("SortColumn", _sortcolumn);
 BA.debugLineNum = 339;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 340;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 341;BA.debugLine="sb.Append(\"SELECT rowid\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("SELECT rowid")));
 BA.debugLineNum = 342;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group5 = __ref.getField(false,"_visiblecolumns" /*RemoteObject*/ );
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_c = (group5.runMethod(false,"Get",index5));Debug.locals.put("c", _c);
Debug.locals.put("c", _c);
 BA.debugLineNum = 343;BA.debugLine="If c.ColumnType = COLUMN_TYPE_VOID Then Continue";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_c.getField(true,"ColumnType" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_column_type_void" /*RemoteObject*/ )))) { 
if (true) continue;};
 BA.debugLineNum = 344;BA.debugLine="sb.Append(\",\").Append(c.SQLID)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(","))).runVoidMethod ("Append",(Object)(_c.getField(true,"SQLID" /*RemoteObject*/ )));
 BA.debugLineNum = 345;BA.debugLine="If c.InternalSortMode <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_c.getField(true,"InternalSortMode" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 346;BA.debugLine="SortColumn = \" ORDER BY \" & c.SQLID & \" \" & c.I";
Debug.JustUpdateDeviceLine();
_sortcolumn = RemoteObject.concat(RemoteObject.createImmutable(" ORDER BY "),_c.getField(true,"SQLID" /*RemoteObject*/ ),RemoteObject.createImmutable(" "),_c.getField(true,"InternalSortMode" /*RemoteObject*/ ));Debug.locals.put("SortColumn", _sortcolumn);
 };
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 349;BA.debugLine="sb.Append(\" FROM \").Append(SQLTableName).Append(\"";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" FROM "))).runMethod(false,"Append",(Object)(__ref.getField(true,"_sqltablename" /*RemoteObject*/ ))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" ")));
 BA.debugLineNum = 350;BA.debugLine="Dim args As List";
Debug.JustUpdateDeviceLine();
_args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("args", _args);
 BA.debugLineNum = 351;BA.debugLine="args.Initialize";
Debug.JustUpdateDeviceLine();
_args.runVoidMethod ("Initialize");
 BA.debugLineNum = 352;BA.debugLine="Dim TotalCount As Int";
Debug.JustUpdateDeviceLine();
_totalcount = RemoteObject.createImmutable(0);Debug.locals.put("TotalCount", _totalcount);
 BA.debugLineNum = 353;BA.debugLine="If FilterText = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_filtertext" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 354;BA.debugLine="TotalCount = CountAll";
Debug.JustUpdateDeviceLine();
_totalcount = __ref.getField(true,"_countall" /*RemoteObject*/ );Debug.locals.put("TotalCount", _totalcount);
 }else {
 BA.debugLineNum = 356;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group19 = __ref.getField(false,"_visiblecolumns" /*RemoteObject*/ );
final int groupLen19 = group19.runMethod(true,"getSize").<Integer>get()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_c = (group19.runMethod(false,"Get",index19));Debug.locals.put("c", _c);
Debug.locals.put("c", _c);
 BA.debugLineNum = 357;BA.debugLine="If c.Searchable Then";
Debug.JustUpdateDeviceLine();
if (_c.getField(true,"Searchable" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 358;BA.debugLine="If args.Size = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_args.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 359;BA.debugLine="sb.Append(\" WHERE \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" WHERE ")));
 }else {
 BA.debugLineNum = 361;BA.debugLine="sb.Append(\" OR \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" OR ")));
 };
 BA.debugLineNum = 363;BA.debugLine="sb.Append(c.SQLID).Append(\" LIKE ? \")";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(_c.getField(true,"SQLID" /*RemoteObject*/ ))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" LIKE ? ")));
 BA.debugLineNum = 364;BA.debugLine="If PrefixSearch Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_prefixsearch" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 365;BA.debugLine="args.Add(FilterText & \"%\")";
Debug.JustUpdateDeviceLine();
_args.runVoidMethod ("Add",(Object)((RemoteObject.concat(__ref.getField(true,"_filtertext" /*RemoteObject*/ ),RemoteObject.createImmutable("%")))));
 }else {
 BA.debugLineNum = 367;BA.debugLine="args.Add(\"%\" & FilterText & \"%\")";
Debug.JustUpdateDeviceLine();
_args.runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("%"),__ref.getField(true,"_filtertext" /*RemoteObject*/ ),RemoteObject.createImmutable("%")))));
 };
 };
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 371;BA.debugLine="TotalCount = -1";
Debug.JustUpdateDeviceLine();
_totalcount = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("TotalCount", _totalcount);
 };
 BA.debugLineNum = 373;BA.debugLine="If SortColumn <> \"\" Then sb.Append(SortColumn)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_sortcolumn,BA.ObjectToString(""))) { 
_sb.runVoidMethod ("Append",(Object)(_sortcolumn));};
 BA.debugLineNum = 374;BA.debugLine="If WithPageLimit Then";
Debug.JustUpdateDeviceLine();
if (_withpagelimit.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 375;BA.debugLine="Dim limit As Int = mRowsPerPage";
Debug.JustUpdateDeviceLine();
_limit = __ref.getField(true,"_mrowsperpage" /*RemoteObject*/ );Debug.locals.put("limit", _limit);Debug.locals.put("limit", _limit);
 BA.debugLineNum = 376;BA.debugLine="If TotalCount < 0 Then limit = limit + 1";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_totalcount,BA.numberCast(double.class, 0))) { 
_limit = RemoteObject.solve(new RemoteObject[] {_limit,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("limit", _limit);};
 BA.debugLineNum = 377;BA.debugLine="sb.Append($\" LIMIT ${mFirstRowIndex}, ${limit}\"$";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" LIMIT "),b4xtable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_mfirstrowindex" /*RemoteObject*/ )))),RemoteObject.createImmutable(", "),b4xtable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_limit))),RemoteObject.createImmutable("")))));
 };
 BA.debugLineNum = 385;BA.debugLine="Dim aargs As List = args";
Debug.JustUpdateDeviceLine();
_aargs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_aargs = _args;Debug.locals.put("aargs", _aargs);Debug.locals.put("aargs", _aargs);
 BA.debugLineNum = 387;BA.debugLine="Return Array(sb.ToString, aargs, TotalCount)";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_sb.runMethod(true,"ToString")),(_aargs.getObject()),(_totalcount)});
 BA.debugLineNum = 388;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calculatewidths(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CalculateWidths (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,565);
if (RapidSub.canDelegate("calculatewidths")) { return __ref.runUserSub(false, "b4xtable","calculatewidths", __ref);}
RemoteObject _wildcardcount = RemoteObject.createImmutable(0);
RemoteObject _totalexplicitwidth = RemoteObject.createImmutable(0);
RemoteObject _c = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
RemoteObject _wildcardwidth = RemoteObject.createImmutable(0);
RemoteObject _width = RemoteObject.createImmutable(0);
RemoteObject _remainder = RemoteObject.createImmutable(0);
 BA.debugLineNum = 565;BA.debugLine="Private Sub CalculateWidths";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 566;BA.debugLine="Dim wildcardcount As Int";
Debug.JustUpdateDeviceLine();
_wildcardcount = RemoteObject.createImmutable(0);Debug.locals.put("wildcardcount", _wildcardcount);
 BA.debugLineNum = 567;BA.debugLine="Dim TotalExplicitWidth As Int";
Debug.JustUpdateDeviceLine();
_totalexplicitwidth = RemoteObject.createImmutable(0);Debug.locals.put("TotalExplicitWidth", _totalexplicitwidth);
 BA.debugLineNum = 568;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = __ref.getField(false,"_visiblecolumns" /*RemoteObject*/ );
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_c = (group3.runMethod(false,"Get",index3));Debug.locals.put("c", _c);
Debug.locals.put("c", _c);
 BA.debugLineNum = 569;BA.debugLine="If c.Width = 0 Then wildcardcount = wildcardcoun";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_c.getField(true,"Width" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
_wildcardcount = RemoteObject.solve(new RemoteObject[] {_wildcardcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("wildcardcount", _wildcardcount);}
else {
_c.setField ("ComputedWidth" /*RemoteObject*/ ,_c.getField(true,"Width" /*RemoteObject*/ ));};
 BA.debugLineNum = 570;BA.debugLine="TotalExplicitWidth = TotalExplicitWidth + c.Widt";
Debug.JustUpdateDeviceLine();
_totalexplicitwidth = RemoteObject.solve(new RemoteObject[] {_totalexplicitwidth,_c.getField(true,"Width" /*RemoteObject*/ )}, "+",1, 1);Debug.locals.put("TotalExplicitWidth", _totalexplicitwidth);
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 572;BA.debugLine="If wildcardcount = 0 Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_wildcardcount,BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 573;BA.debugLine="Dim WildcardWidth As Int = Max(wildcardcount * Mi";
Debug.JustUpdateDeviceLine();
_wildcardwidth = BA.numberCast(int.class, b4xtable.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_wildcardcount,__ref.getField(true,"_minimumwidth" /*RemoteObject*/ )}, "*",0, 1))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),b4xtable.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))),_totalexplicitwidth}, "--",2, 0))));Debug.locals.put("WildcardWidth", _wildcardwidth);Debug.locals.put("WildcardWidth", _wildcardwidth);
 BA.debugLineNum = 574;BA.debugLine="Dim Width As Int = WildcardWidth / wildcardcount";
Debug.JustUpdateDeviceLine();
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_wildcardwidth,_wildcardcount}, "/",0, 0));Debug.locals.put("Width", _width);Debug.locals.put("Width", _width);
 BA.debugLineNum = 575;BA.debugLine="Dim Remainder As Int = WildcardWidth Mod wildcard";
Debug.JustUpdateDeviceLine();
_remainder = RemoteObject.solve(new RemoteObject[] {_wildcardwidth,_wildcardcount}, "%",0, 1);Debug.locals.put("Remainder", _remainder);Debug.locals.put("Remainder", _remainder);
 BA.debugLineNum = 576;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group11 = __ref.getField(false,"_visiblecolumns" /*RemoteObject*/ );
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_c = (group11.runMethod(false,"Get",index11));Debug.locals.put("c", _c);
Debug.locals.put("c", _c);
 BA.debugLineNum = 577;BA.debugLine="If c.Width = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_c.getField(true,"Width" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 578;BA.debugLine="c.ComputedWidth = Width";
Debug.JustUpdateDeviceLine();
_c.setField ("ComputedWidth" /*RemoteObject*/ ,_width);
 BA.debugLineNum = 579;BA.debugLine="If Remainder > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_remainder,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 580;BA.debugLine="Remainder = Remainder - 1";
Debug.JustUpdateDeviceLine();
_remainder = RemoteObject.solve(new RemoteObject[] {_remainder,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("Remainder", _remainder);
 BA.debugLineNum = 581;BA.debugLine="c.ComputedWidth = c.ComputedWidth + 1";
Debug.JustUpdateDeviceLine();
_c.setField ("ComputedWidth" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_c.getField(true,"ComputedWidth" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 };
 };
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 585;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cell_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("Cell_MouseClicked (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,747);
if (RapidSub.canDelegate("cell_mouseclicked")) { return __ref.runUserSub(false, "b4xtable","cell_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 747;BA.debugLine="Private Sub Cell_MouseClicked (EventData As MouseE";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 748;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 749;BA.debugLine="CellClicked(Sender, EventData.SecondaryButtonPres";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_cellclicked" /*void*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), b4xtable.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))),(Object)(_eventdata.runMethod(true,"getSecondaryButtonPressed")));
 BA.debugLineNum = 750;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _cellclicked(RemoteObject __ref,RemoteObject _pnl,RemoteObject _longclicked) throws Exception{
try {
		Debug.PushSubsStack("CellClicked (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,776);
if (RapidSub.canDelegate("cellclicked")) { __ref.runUserSub(false, "b4xtable","cellclicked", __ref, _pnl, _longclicked); return;}
ResumableSub_CellClicked rsub = new ResumableSub_CellClicked(null,__ref,_pnl,_longclicked);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CellClicked extends BA.ResumableSub {
public ResumableSub_CellClicked(b4j.example.b4xtable parent,RemoteObject __ref,RemoteObject _pnl,RemoteObject _longclicked) {
this.parent = parent;
this.__ref = __ref;
this._pnl = _pnl;
this._longclicked = _longclicked;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xtable parent;
RemoteObject _pnl;
RemoteObject _longclicked;
RemoteObject _column = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _e = RemoteObject.createImmutable("");
RemoteObject _rowid = RemoteObject.createImmutable(0L);
RemoteObject _clr = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CellClicked (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,776);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("pnl", _pnl);
Debug.locals.put("LongClicked", _longclicked);
 BA.debugLineNum = 777;BA.debugLine="If DateTime.Now < LastCellClickEvent + 20 Then Re";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("<",parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_lastcellclickevent" /*RemoteObject*/ ),RemoteObject.createImmutable(20)}, "+",1, 2))) { 
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
 BA.debugLineNum = 778;BA.debugLine="LastCellClickEvent = DateTime.Now";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastcellclickevent" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 779;BA.debugLine="Dim column As B4XTableColumn = pnl.Parent.Tag";
Debug.JustUpdateDeviceLine();
_column = (_pnl.runMethod(false,"getParent").runMethod(false,"getTag"));Debug.locals.put("column", _column);Debug.locals.put("column", _column);
 BA.debugLineNum = 780;BA.debugLine="Dim Row As Int = pnl.Tag - 1";
Debug.JustUpdateDeviceLine();
_row = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _pnl.runMethod(false,"getTag")),RemoteObject.createImmutable(1)}, "-",1, 0));Debug.locals.put("Row", _row);Debug.locals.put("Row", _row);
 BA.debugLineNum = 781;BA.debugLine="Dim e As String";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createImmutable("");Debug.locals.put("e", _e);
 BA.debugLineNum = 782;BA.debugLine="If Row = -1 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 61;
if (RemoteObject.solveBoolean("=",_row,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 9;
}else 
{ BA.debugLineNum = 795;BA.debugLine="Else If VisibleRowIds.Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 20;
}}
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 783;BA.debugLine="If LongClicked Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 15;
if (_longclicked.<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 784;BA.debugLine="e = \"_headerlongclicked\"";
Debug.JustUpdateDeviceLine();
_e = BA.ObjectToString("_headerlongclicked");Debug.locals.put("e", _e);
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 786;BA.debugLine="e = \"_headerclicked\"";
Debug.JustUpdateDeviceLine();
_e = BA.ObjectToString("_headerclicked");Debug.locals.put("e", _e);
 BA.debugLineNum = 787;BA.debugLine="HeaderClicked(column)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_headerclicked" /*RemoteObject*/ ,(Object)(_column));
 if (true) break;
;
 BA.debugLineNum = 789;BA.debugLine="If xui.SubExists(mCallBack, mEventName & e, 1) T";
Debug.JustUpdateDeviceLine();

case 15:
//if
this.state = 18;
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),_e)),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 793;BA.debugLine="CallSub2(mCallBack, mEventName & e, column.Id)";
Debug.JustUpdateDeviceLine();
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),_e)),(Object)((_column.getField(true,"Id" /*RemoteObject*/ ))));
 if (true) break;

case 18:
//C
this.state = 61;
;
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 796;BA.debugLine="Dim RowId As Long = VisibleRowIds.Get(Row)";
Debug.JustUpdateDeviceLine();
_rowid = BA.numberCast(long.class, __ref.getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_row)));Debug.locals.put("RowId", _rowid);Debug.locals.put("RowId", _rowid);
 BA.debugLineNum = 797;BA.debugLine="If RowId > 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 21:
//if
this.state = 60;
if (RemoteObject.solveBoolean(">",_rowid,BA.numberCast(long.class, 0))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 798;BA.debugLine="Dim clr As Int";
Debug.JustUpdateDeviceLine();
_clr = RemoteObject.createImmutable(0);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 799;BA.debugLine="If Row Mod 2 = 0 Then clr = EvenRowColor Else c";
Debug.JustUpdateDeviceLine();
if (true) break;

case 24:
//if
this.state = 31;
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
this.state = 26;
;}
else {
this.state = 28;
;}if (true) break;

case 26:
//C
this.state = 31;
_clr = __ref.getField(true,"_evenrowcolor" /*RemoteObject*/ );Debug.locals.put("clr", _clr);
if (true) break;

case 28:
//C
this.state = 31;
_clr = __ref.getField(true,"_oddrowcolor" /*RemoteObject*/ );Debug.locals.put("clr", _clr);
if (true) break;

case 31:
//C
this.state = 32;
;
 BA.debugLineNum = 801;BA.debugLine="If LongClicked Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 32:
//if
this.state = 43;
if (_longclicked.<Boolean>get().booleanValue()) { 
this.state = 34;
}else {
this.state = 36;
}if (true) break;

case 34:
//C
this.state = 43;
 BA.debugLineNum = 802;BA.debugLine="e = \"_CellLongClicked\"";
Debug.JustUpdateDeviceLine();
_e = BA.ObjectToString("_CellLongClicked");Debug.locals.put("e", _e);
 if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 804;BA.debugLine="e = \"_cellclicked\"";
Debug.JustUpdateDeviceLine();
_e = BA.ObjectToString("_cellclicked");Debug.locals.put("e", _e);
 BA.debugLineNum = 805;BA.debugLine="If SelectionColor <> 0 Then pnl.SetColorAnimat";
Debug.JustUpdateDeviceLine();
if (true) break;

case 37:
//if
this.state = 42;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_selectioncolor" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 39;
;}if (true) break;

case 39:
//C
this.state = 42;
_pnl.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 50)),(Object)(_clr),(Object)(__ref.getField(true,"_selectioncolor" /*RemoteObject*/ )));
if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;
;
 BA.debugLineNum = 808;BA.debugLine="If xui.SubExists(mCallBack, mEventName & e, 2)";
Debug.JustUpdateDeviceLine();

case 43:
//if
this.state = 46;
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),_e)),(Object)(BA.numberCast(int.class, 2))).<Boolean>get().booleanValue()) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 812;BA.debugLine="CallSub3(mCallBack, mEventName & e, column.Id,";
Debug.JustUpdateDeviceLine();
parent.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),_e)),(Object)((_column.getField(true,"Id" /*RemoteObject*/ ))),(Object)(__ref.getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_row))));
 if (true) break;
;
 BA.debugLineNum = 814;BA.debugLine="If LongClicked = False Then";
Debug.JustUpdateDeviceLine();

case 46:
//if
this.state = 59;
if (RemoteObject.solveBoolean("=",_longclicked,parent.__c.getField(true,"False"))) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 815;BA.debugLine="Sleep(200)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xtable", "cellclicked"),BA.numberCast(int.class, 200));
this.state = 62;
return;
case 62:
//C
this.state = 49;
;
 BA.debugLineNum = 816;BA.debugLine="If pnl.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 49:
//if
this.state = 58;
if (_pnl.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 817;BA.debugLine="If SelectionColor <> 0 Then pnl.SetColorAnima";
Debug.JustUpdateDeviceLine();
if (true) break;

case 52:
//if
this.state = 57;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_selectioncolor" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 54;
;}if (true) break;

case 54:
//C
this.state = 57;
_pnl.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(__ref.getField(true,"_selectioncolor" /*RemoteObject*/ )),(Object)(_clr));
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
 BA.debugLineNum = 822;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _checkandremovecolumnthatwasaddedtoincorrectparent(RemoteObject __ref,RemoteObject _c,RemoteObject _isfrozen) throws Exception{
try {
		Debug.PushSubsStack("CheckAndRemoveColumnThatWasAddedToIncorrectParent (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,279);
if (RapidSub.canDelegate("checkandremovecolumnthatwasaddedtoincorrectparent")) { return __ref.runUserSub(false, "b4xtable","checkandremovecolumnthatwasaddedtoincorrectparent", __ref, _c, _isfrozen);}
Debug.locals.put("c", _c);
Debug.locals.put("IsFrozen", _isfrozen);
 BA.debugLineNum = 279;BA.debugLine="Private Sub CheckAndRemoveColumnThatWasAddedToInco";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 280;BA.debugLine="If (c.Panel.Parent = mBase) <> IsFrozen Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable((RemoteObject.solveBoolean("=",_c.getField(false,"Panel" /*RemoteObject*/ ).runMethod(false,"getParent"),__ref.getField(false,"_mbase" /*RemoteObject*/ )))),_isfrozen)) { 
 BA.debugLineNum = 281;BA.debugLine="If IsFrozen Then";
Debug.JustUpdateDeviceLine();
if (_isfrozen.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 282;BA.debugLine="RemoveColumnFromCLV(c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_removecolumnfromclv" /*RemoteObject*/ ,(Object)(_c));
 }else {
 BA.debugLineNum = 284;BA.debugLine="c.Panel.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_c.getField(false,"Panel" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 };
 };
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private mEventName As String 'ignore";
b4xtable._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4xtable._meventname);
 //BA.debugLineNum = 18;BA.debugLine="Private mCallBack As Object 'ignore";
b4xtable._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",b4xtable._mcallback);
 //BA.debugLineNum = 19;BA.debugLine="Public mBase As B4XView 'ignore";
b4xtable._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xtable._mbase);
 //BA.debugLineNum = 20;BA.debugLine="Private xui As XUI 'ignore";
b4xtable._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xtable._xui);
 //BA.debugLineNum = 21;BA.debugLine="Public Tag As Object";
b4xtable._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",b4xtable._tag);
 //BA.debugLineNum = 22;BA.debugLine="Public sql1 As SQL";
b4xtable._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",b4xtable._sql1);
 //BA.debugLineNum = 23;BA.debugLine="Type B4XTableColumn (Title As String, Id As Strin";
;
 //BA.debugLineNum = 26;BA.debugLine="Public COLUMN_TYPE_TEXT = 1, COLUMN_TYPE_NUMBERS";
b4xtable._column_type_text = BA.numberCast(int.class, 1);__ref.setField("_column_type_text",b4xtable._column_type_text);
b4xtable._column_type_numbers = BA.numberCast(int.class, 2);__ref.setField("_column_type_numbers",b4xtable._column_type_numbers);
b4xtable._column_type_date = BA.numberCast(int.class, 3);__ref.setField("_column_type_date",b4xtable._column_type_date);
b4xtable._column_type_void = BA.numberCast(int.class, 4);__ref.setField("_column_type_void",b4xtable._column_type_void);
 //BA.debugLineNum = 27;BA.debugLine="Public Columns As List";
b4xtable._columns = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_columns",b4xtable._columns);
 //BA.debugLineNum = 28;BA.debugLine="Public VisibleColumns As List";
b4xtable._visiblecolumns = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_visiblecolumns",b4xtable._visiblecolumns);
 //BA.debugLineNum = 29;BA.debugLine="Private mFirstRowIndex, mLastRowIndex As Int";
b4xtable._mfirstrowindex = RemoteObject.createImmutable(0);__ref.setField("_mfirstrowindex",b4xtable._mfirstrowindex);
b4xtable._mlastrowindex = RemoteObject.createImmutable(0);__ref.setField("_mlastrowindex",b4xtable._mlastrowindex);
 //BA.debugLineNum = 30;BA.debugLine="Public DefaultFormatter, DefaultDataFormatter As";
b4xtable._defaultformatter = RemoteObject.createNew ("b4j.example.b4xformatter");__ref.setField("_defaultformatter",b4xtable._defaultformatter);
b4xtable._defaultdataformatter = RemoteObject.createNew ("b4j.example.b4xformatter");__ref.setField("_defaultdataformatter",b4xtable._defaultdataformatter);
 //BA.debugLineNum = 31;BA.debugLine="Public pnlHeader As B4XView";
b4xtable._pnlheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlheader",b4xtable._pnlheader);
 //BA.debugLineNum = 32;BA.debugLine="Public pnlTitles As B4XView";
b4xtable._pnltitles = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnltitles",b4xtable._pnltitles);
 //BA.debugLineNum = 33;BA.debugLine="Public clvData As CustomListView";
b4xtable._clvdata = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_clvdata",b4xtable._clvdata);
 //BA.debugLineNum = 34;BA.debugLine="Public RowHeight, HeadersHeight As Int";
b4xtable._rowheight = RemoteObject.createImmutable(0);__ref.setField("_rowheight",b4xtable._rowheight);
b4xtable._headersheight = RemoteObject.createImmutable(0);__ref.setField("_headersheight",b4xtable._headersheight);
 //BA.debugLineNum = 35;BA.debugLine="Public AllowSmallRowHeightModifications As Boolea";
b4xtable._allowsmallrowheightmodifications = b4xtable.__c.getField(true,"True");__ref.setField("_allowsmallrowheightmodifications",b4xtable._allowsmallrowheightmodifications);
 //BA.debugLineNum = 36;BA.debugLine="Private mRowsPerPage As Int = 0";
b4xtable._mrowsperpage = BA.numberCast(int.class, 0);__ref.setField("_mrowsperpage",b4xtable._mrowsperpage);
 //BA.debugLineNum = 37;BA.debugLine="Private LayoutLoaded As Boolean";
b4xtable._layoutloaded = RemoteObject.createImmutable(false);__ref.setField("_layoutloaded",b4xtable._layoutloaded);
 //BA.debugLineNum = 38;BA.debugLine="Public MinimumWidth As Int";
b4xtable._minimumwidth = RemoteObject.createImmutable(0);__ref.setField("_minimumwidth",b4xtable._minimumwidth);
 //BA.debugLineNum = 39;BA.debugLine="Private SQLIndex As Int";
b4xtable._sqlindex = RemoteObject.createImmutable(0);__ref.setField("_sqlindex",b4xtable._sqlindex);
 //BA.debugLineNum = 40;BA.debugLine="Public EvenRowColor, OddRowColor, HeaderTextColor";
b4xtable._evenrowcolor = RemoteObject.createImmutable(0);__ref.setField("_evenrowcolor",b4xtable._evenrowcolor);
b4xtable._oddrowcolor = RemoteObject.createImmutable(0);__ref.setField("_oddrowcolor",b4xtable._oddrowcolor);
b4xtable._headertextcolor = RemoteObject.createImmutable(0);__ref.setField("_headertextcolor",b4xtable._headertextcolor);
b4xtable._textcolor = RemoteObject.createImmutable(0);__ref.setField("_textcolor",b4xtable._textcolor);
b4xtable._highlighttextcolor = RemoteObject.createImmutable(0);__ref.setField("_highlighttextcolor",b4xtable._highlighttextcolor);
b4xtable._headercolor = RemoteObject.createImmutable(0);__ref.setField("_headercolor",b4xtable._headercolor);
b4xtable._gridcolor = RemoteObject.createImmutable(0);__ref.setField("_gridcolor",b4xtable._gridcolor);
 //BA.debugLineNum = 41;BA.debugLine="Public HighlightSearchResults As Boolean = True";
b4xtable._highlightsearchresults = b4xtable.__c.getField(true,"True");__ref.setField("_highlightsearchresults",b4xtable._highlightsearchresults);
 //BA.debugLineNum = 42;BA.debugLine="Public HeaderFont, LabelsFont As B4XFont";
b4xtable._headerfont = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");__ref.setField("_headerfont",b4xtable._headerfont);
b4xtable._labelsfont = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");__ref.setField("_labelsfont",b4xtable._labelsfont);
 //BA.debugLineNum = 43;BA.debugLine="Public lblFirst As B4XView";
b4xtable._lblfirst = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblfirst",b4xtable._lblfirst);
 //BA.debugLineNum = 44;BA.debugLine="Public lblBack As B4XView";
b4xtable._lblback = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblback",b4xtable._lblback);
 //BA.debugLineNum = 45;BA.debugLine="Public lblNumber As B4XView";
b4xtable._lblnumber = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblnumber",b4xtable._lblnumber);
 //BA.debugLineNum = 46;BA.debugLine="Public lblNext As B4XView";
b4xtable._lblnext = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblnext",b4xtable._lblnext);
 //BA.debugLineNum = 47;BA.debugLine="Public lblLast As B4XView";
b4xtable._lbllast = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbllast",b4xtable._lbllast);
 //BA.debugLineNum = 48;BA.debugLine="Public lblFromTo As B4XView";
b4xtable._lblfromto = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblfromto",b4xtable._lblfromto);
 //BA.debugLineNum = 49;BA.debugLine="Private CountAll As Int";
b4xtable._countall = RemoteObject.createImmutable(0);__ref.setField("_countall",b4xtable._countall);
 //BA.debugLineNum = 50;BA.debugLine="Private mCurrentPage As Int";
b4xtable._mcurrentpage = RemoteObject.createImmutable(0);__ref.setField("_mcurrentpage",b4xtable._mcurrentpage);
 //BA.debugLineNum = 51;BA.debugLine="Public mCurrentCount As Int";
b4xtable._mcurrentcount = RemoteObject.createImmutable(0);__ref.setField("_mcurrentcount",b4xtable._mcurrentcount);
 //BA.debugLineNum = 52;BA.debugLine="Public lblSort As B4XView";
b4xtable._lblsort = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblsort",b4xtable._lblsort);
 //BA.debugLineNum = 53;BA.debugLine="Public SearchField As B4XFloatTextField";
b4xtable._searchfield = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_searchfield",b4xtable._searchfield);
 //BA.debugLineNum = 54;BA.debugLine="Private FilterText As String";
b4xtable._filtertext = RemoteObject.createImmutable("");__ref.setField("_filtertext",b4xtable._filtertext);
 //BA.debugLineNum = 55;BA.debugLine="Public SleepBeforeSearch As Int = 300";
b4xtable._sleepbeforesearch = BA.numberCast(int.class, 300);__ref.setField("_sleepbeforesearch",b4xtable._sleepbeforesearch);
 //BA.debugLineNum = 56;BA.debugLine="Private SearchIndex As Int";
b4xtable._searchindex = RemoteObject.createImmutable(0);__ref.setField("_searchindex",b4xtable._searchindex);
 //BA.debugLineNum = 57;BA.debugLine="Public ArrowsEnabledColor, ArrowsDisabledColor As";
b4xtable._arrowsenabledcolor = RemoteObject.createImmutable(0);__ref.setField("_arrowsenabledcolor",b4xtable._arrowsenabledcolor);
b4xtable._arrowsdisabledcolor = RemoteObject.createImmutable(0);__ref.setField("_arrowsdisabledcolor",b4xtable._arrowsdisabledcolor);
 //BA.debugLineNum = 58;BA.debugLine="Public VisibleRowIds As List";
b4xtable._visiblerowids = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_visiblerowids",b4xtable._visiblerowids);
 //BA.debugLineNum = 59;BA.debugLine="Public SelectionColor As Int";
b4xtable._selectioncolor = RemoteObject.createImmutable(0);__ref.setField("_selectioncolor",b4xtable._selectioncolor);
 //BA.debugLineNum = 60;BA.debugLine="Private SQLTableName As String = \"data\"";
b4xtable._sqltablename = BA.ObjectToString("data");__ref.setField("_sqltablename",b4xtable._sqltablename);
 //BA.debugLineNum = 61;BA.debugLine="Public StringMoreAvailable As String = \"(more ava";
b4xtable._stringmoreavailable = BA.ObjectToString("(more available)");__ref.setField("_stringmoreavailable",b4xtable._stringmoreavailable);
 //BA.debugLineNum = 62;BA.debugLine="Public StringNoMatches As String = \"No matches\"";
b4xtable._stringnomatches = BA.ObjectToString("No matches");__ref.setField("_stringnomatches",b4xtable._stringnomatches);
 //BA.debugLineNum = 63;BA.debugLine="Public StringOutOf As String = \"out of\"";
b4xtable._stringoutof = BA.ObjectToString("out of");__ref.setField("_stringoutof",b4xtable._stringoutof);
 //BA.debugLineNum = 64;BA.debugLine="Public StringTo As String = \"to\"";
b4xtable._stringto = BA.ObjectToString("to");__ref.setField("_stringto",b4xtable._stringto);
 //BA.debugLineNum = 65;BA.debugLine="Public MaximumRowsPerPage As Int";
b4xtable._maximumrowsperpage = RemoteObject.createImmutable(0);__ref.setField("_maximumrowsperpage",b4xtable._maximumrowsperpage);
 //BA.debugLineNum = 66;BA.debugLine="Public PrefixSearch As Boolean";
b4xtable._prefixsearch = RemoteObject.createImmutable(false);__ref.setField("_prefixsearch",b4xtable._prefixsearch);
 //BA.debugLineNum = 68;BA.debugLine="Private TextFlow As B4JTextFlow";
b4xtable._textflow = RemoteObject.createNew ("b4j.example.b4jtextflow");__ref.setField("_textflow",b4xtable._textflow);
 //BA.debugLineNum = 69;BA.debugLine="Private const TextPaneTag As String = \"TextFlow\"";
b4xtable._textpanetag = BA.ObjectToString("TextFlow");__ref.setField("_textpanetag",b4xtable._textpanetag);
 //BA.debugLineNum = 71;BA.debugLine="Private LastBaseHeight As Int";
b4xtable._lastbaseheight = RemoteObject.createImmutable(0);__ref.setField("_lastbaseheight",b4xtable._lastbaseheight);
 //BA.debugLineNum = 72;BA.debugLine="Public NumberOfFrozenColumns As Int";
b4xtable._numberoffrozencolumns = RemoteObject.createImmutable(0);__ref.setField("_numberoffrozencolumns",b4xtable._numberoffrozencolumns);
 //BA.debugLineNum = 73;BA.debugLine="Private LastCellClickEvent As Long";
b4xtable._lastcellclickevent = RemoteObject.createImmutable(0L);__ref.setField("_lastcellclickevent",b4xtable._lastcellclickevent);
 //BA.debugLineNum = 77;BA.debugLine="Public SearchVisible As Boolean";
b4xtable._searchvisible = RemoteObject.createImmutable(false);__ref.setField("_searchvisible",b4xtable._searchvisible);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("clear")) { __ref.runUserSub(false, "b4xtable","clear", __ref); return;}
ResumableSub_Clear rsub = new ResumableSub_Clear(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Clear extends BA.ResumableSub {
public ResumableSub_Clear(b4j.example.b4xtable parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xtable parent;
RemoteObject _oldsql = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
RemoteObject _c = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
RemoteObject group4;
int index4;
int groupLen4;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Clear (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,146);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 147;BA.debugLine="SQLIndex = SQLIndex + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sqlindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_sqlindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 148;BA.debugLine="Dim OldSQL As SQL = sql1";
Debug.JustUpdateDeviceLine();
_oldsql = __ref.getField(false,"_sql1" /*RemoteObject*/ );Debug.locals.put("OldSQL", _oldsql);Debug.locals.put("OldSQL", _oldsql);
 BA.debugLineNum = 149;BA.debugLine="Dim sql1 As SQL";
Debug.JustUpdateDeviceLine();
parent._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",parent._sql1);
 BA.debugLineNum = 150;BA.debugLine="For Each c As B4XTableColumn In Columns";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//for
this.state = 8;
group4 = __ref.getField(false,"_columns" /*RemoteObject*/ );
index4 = 0;
groupLen4 = group4.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("c", _c);
this.state = 21;
if (true) break;

case 21:
//C
this.state = 8;
if (index4 < groupLen4) {
this.state = 3;
_c = (group4.runMethod(false,"Get",index4));Debug.locals.put("c", _c);}
if (true) break;

case 22:
//C
this.state = 21;
index4++;
Debug.locals.put("c", _c);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 151;BA.debugLine="If c.Panel.IsInitialized And c.Panel.Parent.IsIn";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean(".",_c.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",_c.getField(false,"Panel" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(true,"IsInitialized"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 152;BA.debugLine="c.Panel.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_c.getField(false,"Panel" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
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
Debug.locals.put("c", _c);
;
 BA.debugLineNum = 155;BA.debugLine="VisibleColumns.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_visiblecolumns" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 156;BA.debugLine="Columns.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columns" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 157;BA.debugLine="SQLTableName = \"data\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sqltablename" /*RemoteObject*/ ,BA.ObjectToString("data"));
 BA.debugLineNum = 158;BA.debugLine="If clvData.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 9:
//if
this.state = 12;
if (__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 159;BA.debugLine="clvData.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runVoidMethod ("_clear");
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 161;BA.debugLine="mFirstRowIndex = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mfirstrowindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 162;BA.debugLine="ClearNavigationState";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_clearnavigationstate" /*RemoteObject*/ );
 BA.debugLineNum = 163;BA.debugLine="If OldSQL.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 13:
//if
this.state = 20;
if (_oldsql.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 164;BA.debugLine="Sleep(1000)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xtable", "clear"),BA.numberCast(int.class, 1000));
this.state = 23;
return;
case 23:
//C
this.state = 16;
;
 BA.debugLineNum = 165;BA.debugLine="If OldSQL.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 16:
//if
this.state = 19;
if (_oldsql.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 166;BA.debugLine="OldSQL.Close";
Debug.JustUpdateDeviceLine();
_oldsql.runVoidMethod ("Close");
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
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _cleardataview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearDataView (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,400);
if (RapidSub.canDelegate("cleardataview")) { return __ref.runUserSub(false, "b4xtable","cleardataview", __ref);}
 BA.debugLineNum = 400;BA.debugLine="Public Sub ClearDataView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 401;BA.debugLine="SQLTableName = \"data\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sqltablename" /*RemoteObject*/ ,BA.ObjectToString("data"));
 BA.debugLineNum = 402;BA.debugLine="mFirstRowIndex = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mfirstrowindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 403;BA.debugLine="CountAll = sql1.ExecQuerySingleResult(\"SELECT cou";
Debug.JustUpdateDeviceLine();
__ref.setField ("_countall" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("SELECT count(*) FROM data")))));
 BA.debugLineNum = 404;BA.debugLine="UpdateData (True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_updatedata" /*RemoteObject*/ ,(Object)(b4xtable.__c.getField(true,"True")));
 BA.debugLineNum = 405;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearnavigationstate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearNavigationState (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("clearnavigationstate")) { return __ref.runUserSub(false, "b4xtable","clearnavigationstate", __ref);}
 BA.debugLineNum = 171;BA.debugLine="Private Sub ClearNavigationState";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 172;BA.debugLine="If lblNext.IsInitialized = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_lblnext" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),b4xtable.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 173;BA.debugLine="SetPageLabelState(lblNext, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_setpagelabelstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblnext" /*RemoteObject*/ )),(Object)(b4xtable.__c.getField(true,"False")));
 BA.debugLineNum = 174;BA.debugLine="SetPageLabelState(lblLast, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_setpagelabelstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lbllast" /*RemoteObject*/ )),(Object)(b4xtable.__c.getField(true,"False")));
 BA.debugLineNum = 175;BA.debugLine="SetPageLabelState(lblBack, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_setpagelabelstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblback" /*RemoteObject*/ )),(Object)(b4xtable.__c.getField(true,"False")));
 BA.debugLineNum = 176;BA.debugLine="SetPageLabelState(lblFirst, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_setpagelabelstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblfirst" /*RemoteObject*/ )),(Object)(b4xtable.__c.getField(true,"False")));
 BA.debugLineNum = 177;BA.debugLine="lblFromTo.Text = \"\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblfromto" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 178;BA.debugLine="lblNumber.Text = \"\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblnumber" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _columntosqltype(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("ColumnToSQLType (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,711);
if (RapidSub.canDelegate("columntosqltype")) { return __ref.runUserSub(false, "b4xtable","columntosqltype", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 711;BA.debugLine="Private Sub ColumnToSQLType (c As B4XTableColumn)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 712;BA.debugLine="If c.ColumnType = COLUMN_TYPE_TEXT Then Return \"T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_c.getField(true,"ColumnType" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_column_type_text" /*RemoteObject*/ )))) { 
if (true) return BA.ObjectToString("TEXT");}
else {
if (true) return BA.ObjectToString("INTEGER");};
 BA.debugLineNum = 713;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcellviews(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateCellViews (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,716);
if (RapidSub.canDelegate("createcellviews")) { return __ref.runUserSub(false, "b4xtable","createcellviews", __ref);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 716;BA.debugLine="Private Sub CreateCellViews As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 717;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"cell\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("cell")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 718;BA.debugLine="Dim lbl As Label";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 719;BA.debugLine="lbl.Initialize(\"lbl\")";
Debug.JustUpdateDeviceLine();
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl")));
 BA.debugLineNum = 720;BA.debugLine="SetMouseTransparent(lbl)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_setmousetransparent" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject()));
 BA.debugLineNum = 721;BA.debugLine="Dim xlbl As B4XView = lbl";
Debug.JustUpdateDeviceLine();
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("xlbl", _xlbl);Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 722;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.JustUpdateDeviceLine();
_xlbl.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 723;BA.debugLine="p.AddView(xlbl, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("AddView",(Object)((_xlbl.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 724;BA.debugLine="Return p";
Debug.JustUpdateDeviceLine();
if (true) return _p;
 BA.debugLineNum = 725;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcolumnlayouts(RemoteObject __ref,RemoteObject _c,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("CreateColumnLayouts (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,625);
if (RapidSub.canDelegate("createcolumnlayouts")) { return __ref.runUserSub(false, "b4xtable","createcolumnlayouts", __ref, _c, _size);}
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _clr = RemoteObject.createImmutable(0);
RemoteObject _tclr = RemoteObject.createImmutable(0);
RemoteObject _fnt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
Debug.locals.put("c", _c);
Debug.locals.put("Size", _size);
 BA.debugLineNum = 625;BA.debugLine="Private Sub CreateColumnLayouts (c As B4XTableColu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 626;BA.debugLine="For i = c.CellsLayouts.Size To Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {_size,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = _c.getField(false,"CellsLayouts" /*RemoteObject*/ ).runMethod(true,"getSize").<Integer>get().intValue() ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 627;BA.debugLine="Dim p As B4XView = CreateCellViews";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.runClassMethod (b4j.example.b4xtable.class, "_createcellviews" /*RemoteObject*/ );Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 628;BA.debugLine="Dim lbl As B4XView = p.GetView(c.LabelIndex)";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = _p.runMethod(false,"GetView",(Object)(_c.getField(true,"LabelIndex" /*RemoteObject*/ )));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 629;BA.debugLine="c.CellsLayouts.Add(p)";
Debug.JustUpdateDeviceLine();
_c.getField(false,"CellsLayouts" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_p.getObject())));
 BA.debugLineNum = 630;BA.debugLine="Dim clr, tclr As Int";
Debug.JustUpdateDeviceLine();
_clr = RemoteObject.createImmutable(0);Debug.locals.put("clr", _clr);
_tclr = RemoteObject.createImmutable(0);Debug.locals.put("tclr", _tclr);
 BA.debugLineNum = 631;BA.debugLine="Dim fnt As B4XFont";
Debug.JustUpdateDeviceLine();
_fnt = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");Debug.locals.put("fnt", _fnt);
 BA.debugLineNum = 632;BA.debugLine="If i = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 633;BA.debugLine="clr = HeaderColor";
Debug.JustUpdateDeviceLine();
_clr = __ref.getField(true,"_headercolor" /*RemoteObject*/ );Debug.locals.put("clr", _clr);
 BA.debugLineNum = 634;BA.debugLine="tclr = HeaderTextColor";
Debug.JustUpdateDeviceLine();
_tclr = __ref.getField(true,"_headertextcolor" /*RemoteObject*/ );Debug.locals.put("tclr", _tclr);
 BA.debugLineNum = 635;BA.debugLine="fnt = HeaderFont";
Debug.JustUpdateDeviceLine();
_fnt = __ref.getField(false,"_headerfont" /*RemoteObject*/ );Debug.locals.put("fnt", _fnt);
 }else {
 BA.debugLineNum = 637;BA.debugLine="fnt = LabelsFont";
Debug.JustUpdateDeviceLine();
_fnt = __ref.getField(false,"_labelsfont" /*RemoteObject*/ );Debug.locals.put("fnt", _fnt);
 BA.debugLineNum = 638;BA.debugLine="tclr = TextColor";
Debug.JustUpdateDeviceLine();
_tclr = __ref.getField(true,"_textcolor" /*RemoteObject*/ );Debug.locals.put("tclr", _tclr);
 BA.debugLineNum = 639;BA.debugLine="If i Mod 2 = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 640;BA.debugLine="clr = EvenRowColor";
Debug.JustUpdateDeviceLine();
_clr = __ref.getField(true,"_evenrowcolor" /*RemoteObject*/ );Debug.locals.put("clr", _clr);
 }else {
 BA.debugLineNum = 642;BA.debugLine="clr = OddRowColor";
Debug.JustUpdateDeviceLine();
_clr = __ref.getField(true,"_oddrowcolor" /*RemoteObject*/ );Debug.locals.put("clr", _clr);
 };
 };
 BA.debugLineNum = 645;BA.debugLine="lbl.Font = fnt";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(false,"setFont",_fnt);
 BA.debugLineNum = 646;BA.debugLine="p.SetColorAndBorder(clr, 1dip, GridColor, 0)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetColorAndBorder",(Object)(_clr),(Object)(BA.numberCast(double.class, b4xtable.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(__ref.getField(true,"_gridcolor" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 647;BA.debugLine="lbl.TextColor = tclr";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(true,"setTextColor",_tclr);
 BA.debugLineNum = 648;BA.debugLine="lbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.JustUpdateDeviceLine();
_lbl.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 649;BA.debugLine="p.Tag = i";
Debug.JustUpdateDeviceLine();
_p.runMethod(false,"setTag",RemoteObject.createImmutable((_i)));
 BA.debugLineNum = 650;BA.debugLine="c.Panel.AddView(p, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
_c.getField(false,"Panel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 652;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createdataview(RemoteObject __ref,RemoteObject _whereclause) throws Exception{
try {
		Debug.PushSubsStack("CreateDataView (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,391);
if (RapidSub.canDelegate("createdataview")) { return __ref.runUserSub(false, "b4xtable","createdataview", __ref, _whereclause);}
Debug.locals.put("WhereClause", _whereclause);
 BA.debugLineNum = 391;BA.debugLine="Public Sub CreateDataView (WhereClause As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 392;BA.debugLine="sql1.ExecNonQuery(\"DROP VIEW IF EXISTS TempView\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP VIEW IF EXISTS TempView")));
 BA.debugLineNum = 393;BA.debugLine="sql1.ExecNonQuery(\"CREATE VIEW TempView AS SELECT";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("CREATE VIEW TempView AS SELECT *, rowid FROM data WHERE "),_whereclause)));
 BA.debugLineNum = 394;BA.debugLine="CountAll = sql1.ExecQuerySingleResult(\"SELECT cou";
Debug.JustUpdateDeviceLine();
__ref.setField ("_countall" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("SELECT count(*) FROM TempView")))));
 BA.debugLineNum = 395;BA.debugLine="mFirstRowIndex = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mfirstrowindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 396;BA.debugLine="SQLTableName = \"TempView\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sqltablename" /*RemoteObject*/ ,BA.ObjectToString("TempView"));
 BA.debugLineNum = 397;BA.debugLine="UpdateData (False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_updatedata" /*RemoteObject*/ ,(Object)(b4xtable.__c.getField(true,"False")));
 BA.debugLineNum = 398;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtable(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateTable (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,695);
if (RapidSub.canDelegate("createtable")) { return __ref.runUserSub(false, "b4xtable","createtable", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _column = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
 BA.debugLineNum = 695;BA.debugLine="Private Sub CreateTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 696;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 697;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 698;BA.debugLine="sb.Append(\"CREATE TABLE data (\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE data (")));
 BA.debugLineNum = 699;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 700;BA.debugLine="For Each Column As B4XTableColumn In Columns";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group5 = __ref.getField(false,"_columns" /*RemoteObject*/ );
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_column = (group5.runMethod(false,"Get",index5));Debug.locals.put("Column", _column);
Debug.locals.put("Column", _column);
 BA.debugLineNum = 701;BA.debugLine="If Column.ColumnType = COLUMN_TYPE_VOID Then Con";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_column.getField(true,"ColumnType" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_column_type_void" /*RemoteObject*/ )))) { 
if (true) continue;};
 BA.debugLineNum = 702;BA.debugLine="Column.SQLID = \"c\" & i";
Debug.JustUpdateDeviceLine();
_column.setField ("SQLID" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("c"),_i));
 BA.debugLineNum = 703;BA.debugLine="sb.Append(Column.SQLID & \" \" & ColumnToSQLType(C";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(_column.getField(true,"SQLID" /*RemoteObject*/ ),RemoteObject.createImmutable(" "),__ref.runClassMethod (b4j.example.b4xtable.class, "_columntosqltype" /*RemoteObject*/ ,(Object)(_column)),RemoteObject.createImmutable(","))));
 BA.debugLineNum = 704;BA.debugLine="i = i + 1";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("Column", _column);
;
 BA.debugLineNum = 706;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 707;BA.debugLine="sb.Append(\")\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 708;BA.debugLine="sql1.ExecNonQuery(sb.ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 709;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("designercreateview")) { __ref.runUserSub(false, "b4xtable","designercreateview", __ref, _base, _lbl, _props); return;}
ResumableSub_DesignerCreateView rsub = new ResumableSub_DesignerCreateView(null,__ref,_base,_lbl,_props);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DesignerCreateView extends BA.ResumableSub {
public ResumableSub_DesignerCreateView(b4j.example.b4xtable parent,RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) {
this.parent = parent;
this.__ref = __ref;
this._base = _base;
this._lbl = _lbl;
this._props = _props;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xtable parent;
RemoteObject _base;
RemoteObject _lbl;
RemoteObject _props;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,104);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 105;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 106;BA.debugLine="LastBaseHeight = mBase.Height";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastbaseheight" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 107;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 107;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 108;BA.debugLine="LayoutLoaded = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_layoutloaded" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 109;BA.debugLine="EvenRowColor = xui.PaintOrColorToColor(Props.Get(";
Debug.JustUpdateDeviceLine();
__ref.setField ("_evenrowcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EvenRowColor")))))));
 BA.debugLineNum = 110;BA.debugLine="OddRowColor = xui.PaintOrColorToColor(Props.Get(\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_oddrowcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OddRowColor")))))));
 BA.debugLineNum = 111;BA.debugLine="HeaderTextColor = xui.PaintOrColorToColor(Props.G";
Debug.JustUpdateDeviceLine();
__ref.setField ("_headertextcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("HeaderTextColor")))))));
 BA.debugLineNum = 112;BA.debugLine="TextColor = xui.PaintOrColorToColor(Props.Get(\"Te";
Debug.JustUpdateDeviceLine();
__ref.setField ("_textcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextColor")))))));
 BA.debugLineNum = 113;BA.debugLine="HeaderColor = xui.PaintOrColorToColor(Props.Get(\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_headercolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("HeaderColor")))))));
 BA.debugLineNum = 114;BA.debugLine="GridColor = xui.PaintOrColorToColor(Props.Get(\"Gr";
Debug.JustUpdateDeviceLine();
__ref.setField ("_gridcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("GridColor")))))));
 BA.debugLineNum = 115;BA.debugLine="SelectionColor = xui.PaintOrColorToColor(Props.Ge";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selectioncolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SelectionColor")))))));
 BA.debugLineNum = 116;BA.debugLine="HighlightTextColor = xui.PaintOrColorToColor(Prop";
Debug.JustUpdateDeviceLine();
__ref.setField ("_highlighttextcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("HighlightTextColor"))),(Object)(RemoteObject.createImmutable((((int)0xffff0000))))))));
 BA.debugLineNum = 117;BA.debugLine="SearchVisible = Props.GetDefault(\"SearchVisible\",";
Debug.JustUpdateDeviceLine();
__ref.setField ("_searchvisible" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("SearchVisible"))),(Object)((parent.__c.getField(true,"True"))))));
 BA.debugLineNum = 118;BA.debugLine="If Bit.And(SelectionColor, 0xff000000) = 0 Then S";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"Bit").runMethod(true,"And",(Object)(__ref.getField(true,"_selectioncolor" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, ((int)0xff000000)))),BA.numberCast(double.class, 0))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref.setField ("_selectioncolor" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 119;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xtable", "designercreateview"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
 BA.debugLineNum = 120;BA.debugLine="mBase.LoadLayout(\"B4XTable\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("B4XTable")),__ref.getField(false, "ba"));
 BA.debugLineNum = 121;BA.debugLine="SearchField.mBase.Visible = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 122;BA.debugLine="SearchField.LargeLabelTextSize = 14";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_searchfield" /*RemoteObject*/ ).setField ("_largelabeltextsize" /*RemoteObject*/ ,BA.numberCast(float.class, 14));
 BA.debugLineNum = 123;BA.debugLine="SearchField.SmallLabelTextSize = 8";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_searchfield" /*RemoteObject*/ ).setField ("_smalllabeltextsize" /*RemoteObject*/ ,BA.numberCast(float.class, 8));
 BA.debugLineNum = 124;BA.debugLine="SearchField.Update";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_searchfield" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 132;BA.debugLine="SetMouseTransparent(lblSort)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_setmousetransparent" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblsort" /*RemoteObject*/ )));
 BA.debugLineNum = 133;BA.debugLine="clvData.AsView.SetColorAndBorder(0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runMethod(false,"_asview").runVoidMethod ("SetColorAndBorder",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 134;BA.debugLine="clvData.sv.SetColorAndBorder(0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvdata" /*RemoteObject*/ ).getField(false,"_sv").runVoidMethod ("SetColorAndBorder",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 135;BA.debugLine="lblNumber.TextColor = ArrowsEnabledColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblnumber" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_arrowsenabledcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 136;BA.debugLine="LayoutLoaded = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_layoutloaded" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 137;BA.debugLine="ClearNavigationState";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_clearnavigationstate" /*RemoteObject*/ );
 BA.debugLineNum = 138;BA.debugLine="Refresh2 (True, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_refresh2" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _getcolumn(RemoteObject __ref,RemoteObject _columnid) throws Exception{
try {
		Debug.PushSubsStack("GetColumn (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,543);
if (RapidSub.canDelegate("getcolumn")) { return __ref.runUserSub(false, "b4xtable","getcolumn", __ref, _columnid);}
RemoteObject _c = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
Debug.locals.put("ColumnId", _columnid);
 BA.debugLineNum = 543;BA.debugLine="Public Sub GetColumn (ColumnId As String) As B4XTa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 544;BA.debugLine="For Each c As B4XTableColumn In Columns";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_columns" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_c = (group1.runMethod(false,"Get",index1));Debug.locals.put("c", _c);
Debug.locals.put("c", _c);
 BA.debugLineNum = 545;BA.debugLine="If c.Id = ColumnId Then Return c";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_c.getField(true,"Id" /*RemoteObject*/ ),_columnid)) { 
if (true) return _c;};
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 547;BA.debugLine="Return c";
Debug.JustUpdateDeviceLine();
if (true) return _c;
 BA.debugLineNum = 548;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentpage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCurrentPage (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,895);
if (RapidSub.canDelegate("getcurrentpage")) { return __ref.runUserSub(false, "b4xtable","getcurrentpage", __ref);}
 BA.debugLineNum = 895;BA.debugLine="Public Sub getCurrentPage As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 896;BA.debugLine="Return mCurrentPage";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mcurrentpage" /*RemoteObject*/ );
 BA.debugLineNum = 897;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfirstrowindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getFirstRowIndex (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,885);
if (RapidSub.canDelegate("getfirstrowindex")) { return __ref.runUserSub(false, "b4xtable","getfirstrowindex", __ref);}
 BA.debugLineNum = 885;BA.debugLine="Public Sub getFirstRowIndex As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 886;BA.debugLine="Return mFirstRowIndex";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mfirstrowindex" /*RemoteObject*/ );
 BA.debugLineNum = 887;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlabelfromcolumn(RemoteObject __ref,RemoteObject _c,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetLabelFromColumn (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,560);
if (RapidSub.canDelegate("getlabelfromcolumn")) { return __ref.runUserSub(false, "b4xtable","getlabelfromcolumn", __ref, _c, _index);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("c", _c);
Debug.locals.put("Index", _index);
 BA.debugLineNum = 560;BA.debugLine="Private Sub GetLabelFromColumn (c As B4XTableColum";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 561;BA.debugLine="Dim p As B4XView = c.CellsLayouts.Get(Index)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _c.getField(false,"CellsLayouts" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 562;BA.debugLine="Return p.GetView(c.LabelIndex)";
Debug.JustUpdateDeviceLine();
if (true) return _p.runMethod(false,"GetView",(Object)(_c.getField(true,"LabelIndex" /*RemoteObject*/ )));
 BA.debugLineNum = 563;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrow(RemoteObject __ref,RemoteObject _rowid) throws Exception{
try {
		Debug.PushSubsStack("GetRow (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,858);
if (RapidSub.canDelegate("getrow")) { return __ref.runUserSub(false, "b4xtable","getrow", __ref, _rowid);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _c = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
Debug.locals.put("RowId", _rowid);
 BA.debugLineNum = 858;BA.debugLine="Public Sub GetRow(RowId As Long) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 859;BA.debugLine="Dim m As Map";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 860;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 861;BA.debugLine="Dim rs As ResultSet = sql1.ExecQuery2(\"SELECT * F";
Debug.JustUpdateDeviceLine();
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("SELECT * FROM data WHERE rowid = ?")),(Object)(b4xtable.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_rowid)})))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 862;BA.debugLine="If rs.NextRow Then";
Debug.JustUpdateDeviceLine();
if (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 863;BA.debugLine="For Each c As B4XTableColumn In Columns";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group5 = __ref.getField(false,"_columns" /*RemoteObject*/ );
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_c = (group5.runMethod(false,"Get",index5));Debug.locals.put("c", _c);
Debug.locals.put("c", _c);
 BA.debugLineNum = 864;BA.debugLine="Select c.ColumnType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_c.getField(true,"ColumnType" /*RemoteObject*/ ),__ref.getField(true,"_column_type_text" /*RemoteObject*/ ),__ref.getField(true,"_column_type_numbers" /*RemoteObject*/ ),__ref.getField(true,"_column_type_date" /*RemoteObject*/ ))) {
case 0: {
 BA.debugLineNum = 866;BA.debugLine="m.Put(c.Id, rs.GetString(c.SQLID))";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)((_c.getField(true,"Id" /*RemoteObject*/ ))),(Object)((_rs.runMethod(true,"GetString",(Object)(_c.getField(true,"SQLID" /*RemoteObject*/ ))))));
 break; }
case 1: {
 BA.debugLineNum = 868;BA.debugLine="m.Put(c.Id, rs.GetDouble(c.SQLID))";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)((_c.getField(true,"Id" /*RemoteObject*/ ))),(Object)((_rs.runMethod(true,"GetDouble",(Object)(_c.getField(true,"SQLID" /*RemoteObject*/ ))))));
 break; }
case 2: {
 BA.debugLineNum = 870;BA.debugLine="m.Put(c.Id, rs.GetLong(c.SQLID))";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)((_c.getField(true,"Id" /*RemoteObject*/ ))),(Object)((_rs.runMethod(true,"GetLong",(Object)(_c.getField(true,"SQLID" /*RemoteObject*/ ))))));
 break; }
}
;
 }
}Debug.locals.put("c", _c);
;
 };
 BA.debugLineNum = 874;BA.debugLine="rs.Close";
Debug.JustUpdateDeviceLine();
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 875;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
 BA.debugLineNum = 876;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrowsperpage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getRowsPerPage (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,890);
if (RapidSub.canDelegate("getrowsperpage")) { return __ref.runUserSub(false, "b4xtable","getrowsperpage", __ref);}
 BA.debugLineNum = 890;BA.debugLine="Public Sub getRowsPerPage As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 891;BA.debugLine="Return mRowsPerPage";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mrowsperpage" /*RemoteObject*/ );
 BA.debugLineNum = 892;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSize (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,958);
if (RapidSub.canDelegate("getsize")) { return __ref.runUserSub(false, "b4xtable","getsize", __ref);}
 BA.debugLineNum = 958;BA.debugLine="Public Sub getSize As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 959;BA.debugLine="Return CountAll";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_countall" /*RemoteObject*/ );
 BA.debugLineNum = 960;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _headerclicked(RemoteObject __ref,RemoteObject _col) throws Exception{
try {
		Debug.PushSubsStack("HeaderClicked (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,824);
if (RapidSub.canDelegate("headerclicked")) { return __ref.runUserSub(false, "b4xtable","headerclicked", __ref, _col);}
RemoteObject _c = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
Debug.locals.put("col", _col);
 BA.debugLineNum = 824;BA.debugLine="Private Sub HeaderClicked (col As B4XTableColumn)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 825;BA.debugLine="If col.Sortable Then";
Debug.JustUpdateDeviceLine();
if (_col.getField(true,"Sortable" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 826;BA.debugLine="For Each c As B4XTableColumn In Columns";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = __ref.getField(false,"_columns" /*RemoteObject*/ );
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_c = (group2.runMethod(false,"Get",index2));Debug.locals.put("c", _c);
Debug.locals.put("c", _c);
 BA.debugLineNum = 827;BA.debugLine="If c = col Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_c,_col)) { 
 BA.debugLineNum = 828;BA.debugLine="If c.InternalSortMode = \"ASC\" Then c.InternalS";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_c.getField(true,"InternalSortMode" /*RemoteObject*/ ),BA.ObjectToString("ASC"))) { 
_c.setField ("InternalSortMode" /*RemoteObject*/ ,BA.ObjectToString("DESC"));}
else {
_c.setField ("InternalSortMode" /*RemoteObject*/ ,BA.ObjectToString("ASC"));};
 }else {
 BA.debugLineNum = 830;BA.debugLine="c.InternalSortMode = \"\"";
Debug.JustUpdateDeviceLine();
_c.setField ("InternalSortMode" /*RemoteObject*/ ,BA.ObjectToString(""));
 };
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 833;BA.debugLine="mFirstRowIndex = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mfirstrowindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 834;BA.debugLine="UpdateSortIcon";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_updatesorticon" /*RemoteObject*/ );
 BA.debugLineNum = 835;BA.debugLine="UpdateData (False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_updatedata" /*RemoteObject*/ ,(Object)(b4xtable.__c.getField(true,"False")));
 };
 BA.debugLineNum = 837;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _implupdatedatafromquery(RemoteObject __ref,RemoteObject _query,RemoteObject _args,RemoteObject _totalcount,RemoteObject _dontsleep) throws Exception{
try {
		Debug.PushSubsStack("ImplUpdateDataFromQuery (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,413);
if (RapidSub.canDelegate("implupdatedatafromquery")) { __ref.runUserSub(false, "b4xtable","implupdatedatafromquery", __ref, _query, _args, _totalcount, _dontsleep); return;}
ResumableSub_ImplUpdateDataFromQuery rsub = new ResumableSub_ImplUpdateDataFromQuery(null,__ref,_query,_args,_totalcount,_dontsleep);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ImplUpdateDataFromQuery extends BA.ResumableSub {
public ResumableSub_ImplUpdateDataFromQuery(b4j.example.b4xtable parent,RemoteObject __ref,RemoteObject _query,RemoteObject _args,RemoteObject _totalcount,RemoteObject _dontsleep) {
this.parent = parent;
this.__ref = __ref;
this._query = _query;
this._args = _args;
this._totalcount = _totalcount;
this._dontsleep = _dontsleep;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xtable parent;
RemoteObject _query;
RemoteObject _args;
RemoteObject _totalcount;
RemoteObject _dontsleep;
RemoteObject _myindex = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _rownumber = RemoteObject.createImmutable(0);
RemoteObject _c = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _aretheremoreresults = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject group17;
int index17;
int groupLen17;
int step32;
int limit32;
RemoteObject group33;
int index33;
int groupLen33;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ImplUpdateDataFromQuery (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,413);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Query", _query);
Debug.locals.put("Args", _args);
Debug.locals.put("TotalCount", _totalcount);
Debug.locals.put("DontSleep", _dontsleep);
 BA.debugLineNum = 414;BA.debugLine="SQLIndex = SQLIndex + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sqlindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_sqlindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 415;BA.debugLine="If mRowsPerPage = 0 Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mrowsperpage" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
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
 BA.debugLineNum = 417;BA.debugLine="Dim MyIndex As Int = SQLIndex";
Debug.JustUpdateDeviceLine();
_myindex = __ref.getField(true,"_sqlindex" /*RemoteObject*/ );Debug.locals.put("MyIndex", _myindex);Debug.locals.put("MyIndex", _myindex);
 BA.debugLineNum = 418;BA.debugLine="If DontSleep = False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_dontsleep,parent.__c.getField(true,"False"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 419;BA.debugLine="Sleep(40)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xtable", "implupdatedatafromquery"),BA.numberCast(int.class, 40));
this.state = 71;
return;
case 71:
//C
this.state = 10;
;
 if (true) break;
;
 BA.debugLineNum = 421;BA.debugLine="If MyIndex <> SQLIndex Then";
Debug.JustUpdateDeviceLine();

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("!",_myindex,BA.numberCast(double.class, __ref.getField(true,"_sqlindex" /*RemoteObject*/ )))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 422;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 424;BA.debugLine="VisibleRowIds.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_visiblerowids" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 426;BA.debugLine="Dim rs As ResultSet = sql1.ExecQuery2(Query, Args";
Debug.JustUpdateDeviceLine();
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(_query),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _args));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 427;BA.debugLine="Dim success As Boolean = True";
Debug.JustUpdateDeviceLine();
_success = parent.__c.getField(true,"True");Debug.locals.put("success", _success);Debug.locals.put("success", _success);
 BA.debugLineNum = 431;BA.debugLine="If success Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 14:
//if
this.state = 67;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 16;
}else {
this.state = 66;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 432;BA.debugLine="Dim RowNumber As Int = 1";
Debug.JustUpdateDeviceLine();
_rownumber = BA.numberCast(int.class, 1);Debug.locals.put("RowNumber", _rownumber);Debug.locals.put("RowNumber", _rownumber);
 BA.debugLineNum = 433;BA.debugLine="Do While RowNumber <= mRowsPerPage And rs.NextRo";
Debug.JustUpdateDeviceLine();
if (true) break;

case 17:
//do while
this.state = 32;
while (RemoteObject.solveBoolean("k",_rownumber,BA.numberCast(double.class, __ref.getField(true,"_mrowsperpage" /*RemoteObject*/ ))) && RemoteObject.solveBoolean(".",_rs.runMethod(true,"NextRow"))) {
this.state = 19;
if (true) break;
}
if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 434;BA.debugLine="VisibleRowIds.Add(rs.GetLong(\"rowid\"))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_visiblerowids" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_rs.runMethod(true,"GetLong",(Object)(RemoteObject.createImmutable("rowid"))))));
 BA.debugLineNum = 435;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
Debug.JustUpdateDeviceLine();
if (true) break;

case 20:
//for
this.state = 31;
group17 = __ref.getField(false,"_visiblecolumns" /*RemoteObject*/ );
index17 = 0;
groupLen17 = group17.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("c", _c);
this.state = 72;
if (true) break;

case 72:
//C
this.state = 31;
if (index17 < groupLen17) {
this.state = 22;
_c = (group17.runMethod(false,"Get",index17));Debug.locals.put("c", _c);}
if (true) break;

case 73:
//C
this.state = 72;
index17++;
Debug.locals.put("c", _c);
if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 436;BA.debugLine="Dim lbl As B4XView = GetLabelFromColumn(c, Row";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = __ref.runClassMethod (b4j.example.b4xtable.class, "_getlabelfromcolumn" /*RemoteObject*/ ,(Object)(_c),(Object)(_rownumber));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 437;BA.debugLine="Select c.ColumnType";
Debug.JustUpdateDeviceLine();
if (true) break;

case 23:
//select
this.state = 30;
switch (BA.switchObjectToInt(_c.getField(true,"ColumnType" /*RemoteObject*/ ),__ref.getField(true,"_column_type_text" /*RemoteObject*/ ),__ref.getField(true,"_column_type_numbers" /*RemoteObject*/ ),__ref.getField(true,"_column_type_date" /*RemoteObject*/ ))) {
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
 BA.debugLineNum = 439;BA.debugLine="SetTextToCell(rs.GetString(c.SQLID), lbl, c.";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_settexttocell" /*RemoteObject*/ ,(Object)(_rs.runMethod(true,"GetString",(Object)(_c.getField(true,"SQLID" /*RemoteObject*/ )))),(Object)(_lbl),(Object)(_c.getField(true,"Searchable" /*RemoteObject*/ )));
 if (true) break;

case 27:
//C
this.state = 30;
 BA.debugLineNum = 441;BA.debugLine="c.Formatter.FormatLabel(rs.GetDouble(c.SQLID";
Debug.JustUpdateDeviceLine();
_c.getField(false,"Formatter" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xformatter.class, "_formatlabel" /*RemoteObject*/ ,(Object)(_rs.runMethod(true,"GetDouble",(Object)(_c.getField(true,"SQLID" /*RemoteObject*/ )))),(Object)(_lbl));
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 443;BA.debugLine="lbl.Text = DateTime.Date(rs.GetLong(c.SQLID)";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(true,"setText",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_rs.runMethod(true,"GetLong",(Object)(_c.getField(true,"SQLID" /*RemoteObject*/ ))))));
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
Debug.locals.put("c", _c);
;
 BA.debugLineNum = 446;BA.debugLine="RowNumber = RowNumber + 1";
Debug.JustUpdateDeviceLine();
_rownumber = RemoteObject.solve(new RemoteObject[] {_rownumber,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("RowNumber", _rownumber);
 if (true) break;

case 32:
//C
this.state = 33;
;
 BA.debugLineNum = 448;BA.debugLine="Dim AreThereMoreResults As Boolean = RowNumber =";
Debug.JustUpdateDeviceLine();
_aretheremoreresults = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_rownumber,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mrowsperpage" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1))) && RemoteObject.solveBoolean(".",_rs.runMethod(true,"NextRow")));Debug.locals.put("AreThereMoreResults", _aretheremoreresults);Debug.locals.put("AreThereMoreResults", _aretheremoreresults);
 BA.debugLineNum = 449;BA.debugLine="rs.Close";
Debug.JustUpdateDeviceLine();
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 450;BA.debugLine="For i = RowNumber To mRowsPerPage";
Debug.JustUpdateDeviceLine();
if (true) break;

case 33:
//for
this.state = 40;
step32 = 1;
limit32 = __ref.getField(true,"_mrowsperpage" /*RemoteObject*/ ).<Integer>get().intValue();
_i = _rownumber.<Integer>get().intValue() ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 451;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
Debug.JustUpdateDeviceLine();
if (true) break;

case 36:
//for
this.state = 39;
group33 = __ref.getField(false,"_visiblecolumns" /*RemoteObject*/ );
index33 = 0;
groupLen33 = group33.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("c", _c);
this.state = 76;
if (true) break;

case 76:
//C
this.state = 39;
if (index33 < groupLen33) {
this.state = 38;
_c = (group33.runMethod(false,"Get",index33));Debug.locals.put("c", _c);}
if (true) break;

case 77:
//C
this.state = 76;
index33++;
Debug.locals.put("c", _c);
if (true) break;

case 38:
//C
this.state = 77;
 BA.debugLineNum = 453;BA.debugLine="SetTextToCell(\"\", GetLabelFromColumn(c, i), c.";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_settexttocell" /*RemoteObject*/ ,(Object)(BA.ObjectToString("")),(Object)(__ref.runClassMethod (b4j.example.b4xtable.class, "_getlabelfromcolumn" /*RemoteObject*/ ,(Object)(_c),(Object)(BA.numberCast(int.class, _i)))),(Object)(_c.getField(true,"Searchable" /*RemoteObject*/ )));
 if (true) break;
if (true) break;

case 39:
//C
this.state = 75;
Debug.locals.put("c", _c);
;
 BA.debugLineNum = 458;BA.debugLine="VisibleRowIds.Add(0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_visiblerowids" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable((0))));
 if (true) break;
if (true) break;

case 40:
//C
this.state = 41;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 460;BA.debugLine="mLastRowIndex = mFirstRowIndex - 2 + RowNumber";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mlastrowindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mfirstrowindex" /*RemoteObject*/ ),RemoteObject.createImmutable(2),_rownumber}, "-+",2, 1));
 BA.debugLineNum = 461;BA.debugLine="SetPageLabelState(lblLast, TotalCount >= 0)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_setpagelabelstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lbllast" /*RemoteObject*/ )),(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("g",_totalcount,BA.numberCast(double.class, 0)))));
 BA.debugLineNum = 462;BA.debugLine="If TotalCount >= 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 41:
//if
this.state = 64;
if (RemoteObject.solveBoolean("g",_totalcount,BA.numberCast(double.class, 0))) { 
this.state = 43;
}else {
this.state = 51;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 463;BA.debugLine="If TotalCount = 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 44:
//if
this.state = 49;
if (RemoteObject.solveBoolean("=",_totalcount,BA.numberCast(double.class, 0))) { 
this.state = 46;
}else {
this.state = 48;
}if (true) break;

case 46:
//C
this.state = 49;
 BA.debugLineNum = 464;BA.debugLine="lblFromTo.Text = \"\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblfromto" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 466;BA.debugLine="lblFromTo.Text = $\"${DefaultFormatter.Format(m";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblfromto" /*RemoteObject*/ ).runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_defaultformatter" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xformatter.class, "_format" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mfirstrowindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1))))))),RemoteObject.createImmutable(" "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_stringto" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_defaultformatter" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xformatter.class, "_format" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mlastrowindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1))))))),RemoteObject.createImmutable(" "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_stringoutof" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_defaultformatter" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xformatter.class, "_format" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, _totalcount)))))),RemoteObject.createImmutable(""))));
 if (true) break;

case 49:
//C
this.state = 64;
;
 BA.debugLineNum = 468;BA.debugLine="SetPageLabelState(lblNext, mLastRowIndex < Tota";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_setpagelabelstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblnext" /*RemoteObject*/ )),(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("<",__ref.getField(true,"_mlastrowindex" /*RemoteObject*/ ),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_totalcount,RemoteObject.createImmutable(1)}, "-",1, 1))))));
 BA.debugLineNum = 469;BA.debugLine="SetPageLabelState(lblLast, lblNext.Tag)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_setpagelabelstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lbllast" /*RemoteObject*/ )),(Object)(BA.ObjectToBoolean(__ref.getField(false,"_lblnext" /*RemoteObject*/ ).runMethod(false,"getTag"))));
 if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 471;BA.debugLine="If mLastRowIndex = -1 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 52:
//if
this.state = 63;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mlastrowindex" /*RemoteObject*/ ),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 54;
}else {
this.state = 56;
}if (true) break;

case 54:
//C
this.state = 63;
 BA.debugLineNum = 472;BA.debugLine="lblFromTo.Text = StringNoMatches";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblfromto" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_stringnomatches" /*RemoteObject*/ ));
 if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 474;BA.debugLine="lblFromTo.Text = $\"${DefaultFormatter.Format(m";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblfromto" /*RemoteObject*/ ).runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_defaultformatter" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xformatter.class, "_format" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mfirstrowindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1))))))),RemoteObject.createImmutable(" "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_stringto" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_defaultformatter" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xformatter.class, "_format" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mlastrowindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1))))))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 475;BA.debugLine="If AreThereMoreResults Then lblFromTo.Text = l";
Debug.JustUpdateDeviceLine();
if (true) break;

case 57:
//if
this.state = 62;
if (_aretheremoreresults.<Boolean>get().booleanValue()) { 
this.state = 59;
;}if (true) break;

case 59:
//C
this.state = 62;
__ref.getField(false,"_lblfromto" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(__ref.getField(false,"_lblfromto" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" "),__ref.getField(true,"_stringmoreavailable" /*RemoteObject*/ )));
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
 BA.debugLineNum = 477;BA.debugLine="SetPageLabelState(lblNext, AreThereMoreResults)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_setpagelabelstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblnext" /*RemoteObject*/ )),(Object)(_aretheremoreresults));
 BA.debugLineNum = 478;BA.debugLine="SetPageLabelState(lblLast, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_setpagelabelstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lbllast" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 if (true) break;

case 64:
//C
this.state = 67;
;
 BA.debugLineNum = 480;BA.debugLine="SetPageLabelState(lblBack, mFirstRowIndex > 0)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_setpagelabelstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblback" /*RemoteObject*/ )),(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(true,"_mfirstrowindex" /*RemoteObject*/ ),BA.numberCast(double.class, 0)))));
 BA.debugLineNum = 481;BA.debugLine="SetPageLabelState(lblFirst, lblBack.Tag)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_setpagelabelstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblfirst" /*RemoteObject*/ )),(Object)(BA.ObjectToBoolean(__ref.getField(false,"_lblback" /*RemoteObject*/ ).runMethod(false,"getTag"))));
 BA.debugLineNum = 482;BA.debugLine="mCurrentPage = Ceil(mFirstRowIndex / mRowsPerPag";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcurrentpage" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.__c.runMethod(true,"Ceil",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mfirstrowindex" /*RemoteObject*/ ),__ref.getField(true,"_mrowsperpage" /*RemoteObject*/ )}, "/",0, 0))),RemoteObject.createImmutable(1)}, "+",1, 0)));
 BA.debugLineNum = 483;BA.debugLine="lblNumber.Text = NumberFormat(mCurrentPage, 0, 0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblnumber" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(true,"_mcurrentpage" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 484;BA.debugLine="rs.Close";
Debug.JustUpdateDeviceLine();
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 485;BA.debugLine="mCurrentCount = TotalCount";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcurrentcount" /*RemoteObject*/ ,_totalcount);
 if (true) break;

case 66:
//C
this.state = 67;
 BA.debugLineNum = 487;BA.debugLine="Log(LastException)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","944826698",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
;
 BA.debugLineNum = 489;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_DataUp";
Debug.JustUpdateDeviceLine();

case 67:
//if
this.state = 70;
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_DataUpdated"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
this.state = 69;
}if (true) break;

case 69:
//C
this.state = 70;
 BA.debugLineNum = 490;BA.debugLine="CallSub(mCallBack, mEventName & \"_DataUpdated\")";
Debug.JustUpdateDeviceLine();
parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_DataUpdated"))));
 if (true) break;

case 70:
//C
this.state = -1;
;
 BA.debugLineNum = 492;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xtable","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 81;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 83;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 84;BA.debugLine="Columns.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columns" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 85;BA.debugLine="DefaultFormatter.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaultformatter" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xformatter.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 86;BA.debugLine="DefaultDataFormatter.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaultdataformatter" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xformatter.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 87;BA.debugLine="VisibleColumns.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_visiblecolumns" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 88;BA.debugLine="HeaderFont = xui.CreateDefaultBoldFont(15)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_headerfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, 15))));
 BA.debugLineNum = 89;BA.debugLine="LabelsFont = xui.CreateDefaultFont(15)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_labelsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 15))));
 BA.debugLineNum = 90;BA.debugLine="ArrowsDisabledColor = 0xFFBBBBBB";
Debug.JustUpdateDeviceLine();
__ref.setField ("_arrowsdisabledcolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xffbbbbbb)));
 BA.debugLineNum = 91;BA.debugLine="ArrowsEnabledColor = xui.Color_Black";
Debug.JustUpdateDeviceLine();
__ref.setField ("_arrowsenabledcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 92;BA.debugLine="VisibleRowIds.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_visiblerowids" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 93;BA.debugLine="MinimumWidth = 140dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_minimumwidth" /*RemoteObject*/ ,b4xtable.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140))));
 BA.debugLineNum = 94;BA.debugLine="RowHeight = 40dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_rowheight" /*RemoteObject*/ ,b4xtable.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))));
 BA.debugLineNum = 95;BA.debugLine="HeadersHeight = 40dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_headersheight" /*RemoteObject*/ ,b4xtable.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))));
 BA.debugLineNum = 97;BA.debugLine="TextFlow.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textflow" /*RemoteObject*/ ).runClassMethod (b4j.example.b4jtextflow.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblback_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblBack_Click (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,908);
if (RapidSub.canDelegate("lblback_click")) { return __ref.runUserSub(false, "b4xtable","lblback_click", __ref);}
 BA.debugLineNum = 908;BA.debugLine="Private Sub lblBack_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 909;BA.debugLine="If lblBack.Tag = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_lblback" /*RemoteObject*/ ).runMethod(false,"getTag"),(b4xtable.__c.getField(true,"False")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 910;BA.debugLine="setFirstRowIndex (mFirstRowIndex - mRowsPerPage)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_setfirstrowindex" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mfirstrowindex" /*RemoteObject*/ ),__ref.getField(true,"_mrowsperpage" /*RemoteObject*/ )}, "-",1, 1)));
 BA.debugLineNum = 911;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblback_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblBack_MouseClicked (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,929);
if (RapidSub.canDelegate("lblback_mouseclicked")) { return __ref.runUserSub(false, "b4xtable","lblback_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 929;BA.debugLine="Private Sub lblBack_MouseClicked (EventData As Mou";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 930;BA.debugLine="lblBack_Click";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_lblback_click" /*RemoteObject*/ );
 BA.debugLineNum = 931;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblfirst_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblFirst_Click (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,903);
if (RapidSub.canDelegate("lblfirst_click")) { return __ref.runUserSub(false, "b4xtable","lblfirst_click", __ref);}
 BA.debugLineNum = 903;BA.debugLine="Private Sub lblFirst_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 904;BA.debugLine="If lblFirst.Tag = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_lblfirst" /*RemoteObject*/ ).runMethod(false,"getTag"),(b4xtable.__c.getField(true,"False")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 905;BA.debugLine="setFirstRowIndex (0)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_setfirstrowindex" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 906;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblfirst_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblFirst_MouseClicked (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,925);
if (RapidSub.canDelegate("lblfirst_mouseclicked")) { return __ref.runUserSub(false, "b4xtable","lblfirst_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 925;BA.debugLine="Private Sub lblFirst_MouseClicked (EventData As Mo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 926;BA.debugLine="lblFirst_Click";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_lblfirst_click" /*RemoteObject*/ );
 BA.debugLineNum = 927;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbllast_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblLast_Click (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,913);
if (RapidSub.canDelegate("lbllast_click")) { return __ref.runUserSub(false, "b4xtable","lbllast_click", __ref);}
RemoteObject _numberofpages = RemoteObject.createImmutable(0);
 BA.debugLineNum = 913;BA.debugLine="Private Sub lblLast_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 914;BA.debugLine="If lblLast.Tag = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_lbllast" /*RemoteObject*/ ).runMethod(false,"getTag"),(b4xtable.__c.getField(true,"False")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 915;BA.debugLine="Dim NumberOfPages As Int = Ceil(mCurrentCount / m";
Debug.JustUpdateDeviceLine();
_numberofpages = BA.numberCast(int.class, b4xtable.__c.runMethod(true,"Ceil",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mcurrentcount" /*RemoteObject*/ ),__ref.getField(true,"_mrowsperpage" /*RemoteObject*/ )}, "/",0, 0))));Debug.locals.put("NumberOfPages", _numberofpages);Debug.locals.put("NumberOfPages", _numberofpages);
 BA.debugLineNum = 916;BA.debugLine="setFirstRowIndex ((NumberOfPages - 1) * mRowsPerP";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_setfirstrowindex" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_numberofpages,RemoteObject.createImmutable(1)}, "-",1, 1)),__ref.getField(true,"_mrowsperpage" /*RemoteObject*/ )}, "*",0, 1)));
 BA.debugLineNum = 917;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbllast_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblLast_MouseClicked (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,938);
if (RapidSub.canDelegate("lbllast_mouseclicked")) { return __ref.runUserSub(false, "b4xtable","lbllast_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 938;BA.debugLine="Private Sub lblLast_MouseClicked (EventData As Mou";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 939;BA.debugLine="lblLast_Click";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_lbllast_click" /*RemoteObject*/ );
 BA.debugLineNum = 940;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblnext_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblNext_Click (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,919);
if (RapidSub.canDelegate("lblnext_click")) { return __ref.runUserSub(false, "b4xtable","lblnext_click", __ref);}
 BA.debugLineNum = 919;BA.debugLine="Private Sub lblNext_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 920;BA.debugLine="If lblNext.Tag = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_lblnext" /*RemoteObject*/ ).runMethod(false,"getTag"),(b4xtable.__c.getField(true,"False")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 921;BA.debugLine="setFirstRowIndex (mFirstRowIndex + mRowsPerPage)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_setfirstrowindex" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mfirstrowindex" /*RemoteObject*/ ),__ref.getField(true,"_mrowsperpage" /*RemoteObject*/ )}, "+",1, 1)));
 BA.debugLineNum = 922;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblnext_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblNext_MouseClicked (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,934);
if (RapidSub.canDelegate("lblnext_mouseclicked")) { return __ref.runUserSub(false, "b4xtable","lblnext_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 934;BA.debugLine="Private Sub lblNext_MouseClicked (EventData As Mou";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 935;BA.debugLine="lblNext_Click";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_lblnext_click" /*RemoteObject*/ );
 BA.debugLineNum = 936;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
		Debug.PushSubsStack("Refresh (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("refresh")) { return __ref.runUserSub(false, "b4xtable","refresh", __ref);}
 BA.debugLineNum = 182;BA.debugLine="Public Sub Refresh";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 183;BA.debugLine="Refresh2(True, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_refresh2" /*RemoteObject*/ ,(Object)(b4xtable.__c.getField(true,"True")),(Object)(b4xtable.__c.getField(true,"False")));
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refresh2(RemoteObject __ref,RemoteObject _refreshdata,RemoteObject _dontsleep) throws Exception{
try {
		Debug.PushSubsStack("Refresh2 (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("refresh2")) { return __ref.runUserSub(false, "b4xtable","refresh2", __ref, _refreshdata, _dontsleep);}
RemoteObject _prevrowsperpage = RemoteObject.createImmutable(0);
RemoteObject _totalheight = RemoteObject.createImmutable(0);
RemoteObject _columnindex = RemoteObject.createImmutable(0);
RemoteObject _c = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
RemoteObject _isfrozen = RemoteObject.createImmutable(false);
RemoteObject _freezedwidth = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _offset = RemoteObject.createImmutable(0f);
Debug.locals.put("RefreshData", _refreshdata);
Debug.locals.put("DontSleep", _dontsleep);
 BA.debugLineNum = 191;BA.debugLine="Private Sub Refresh2 (RefreshData As Boolean, Dont";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 192;BA.debugLine="If LayoutLoaded = False Or VisibleColumns.Size =";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_layoutloaded" /*RemoteObject*/ ),b4xtable.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_visiblecolumns" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 193;BA.debugLine="Dim PrevRowsPerPage As Int = mRowsPerPage";
Debug.JustUpdateDeviceLine();
_prevrowsperpage = __ref.getField(true,"_mrowsperpage" /*RemoteObject*/ );Debug.locals.put("PrevRowsPerPage", _prevrowsperpage);Debug.locals.put("PrevRowsPerPage", _prevrowsperpage);
 BA.debugLineNum = 194;BA.debugLine="If xui.IsB4A And LastBaseHeight <> mBase.Height T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A")) && RemoteObject.solveBoolean("!",__ref.getField(true,"_lastbaseheight" /*RemoteObject*/ ),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))) { 
 BA.debugLineNum = 195;BA.debugLine="clvData.AsView.Height = clvData.AsView.Height -";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_lastbaseheight" /*RemoteObject*/ ),__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 0))}, "-",1, 0));
 BA.debugLineNum = 196;BA.debugLine="clvData.Base_Resize(clvData.AsView.Width, clvDat";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runVoidMethod ("_base_resize",(Object)(__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getHeight")));
 BA.debugLineNum = 197;BA.debugLine="LastBaseHeight = mBase.Height";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastbaseheight" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 };
 BA.debugLineNum = 199;BA.debugLine="Dim TotalHeight As Int = clvData.AsView.Height -";
Debug.JustUpdateDeviceLine();
_totalheight = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getHeight"),__ref.getField(true,"_headersheight" /*RemoteObject*/ )}, "-",1, 0));Debug.locals.put("TotalHeight", _totalheight);Debug.locals.put("TotalHeight", _totalheight);
 BA.debugLineNum = 200;BA.debugLine="If xui.IsB4J Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 201;BA.debugLine="TotalHeight = TotalHeight - 20";
Debug.JustUpdateDeviceLine();
_totalheight = RemoteObject.solve(new RemoteObject[] {_totalheight,RemoteObject.createImmutable(20)}, "-",1, 1);Debug.locals.put("TotalHeight", _totalheight);
 };
 BA.debugLineNum = 203;BA.debugLine="If AllowSmallRowHeightModifications Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_allowsmallrowheightmodifications" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 204;BA.debugLine="mRowsPerPage = Max(0, Round(TotalHeight/ RowHeig";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mrowsperpage" /*RemoteObject*/ ,BA.numberCast(int.class, b4xtable.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, b4xtable.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_totalheight,__ref.getField(true,"_rowheight" /*RemoteObject*/ )}, "/",0, 0))))))));
 }else {
 BA.debugLineNum = 206;BA.debugLine="mRowsPerPage = Max(0, Floor(TotalHeight / RowHei";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mrowsperpage" /*RemoteObject*/ ,BA.numberCast(int.class, b4xtable.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(b4xtable.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {_totalheight,__ref.getField(true,"_rowheight" /*RemoteObject*/ )}, "/",0, 0)))))));
 };
 BA.debugLineNum = 208;BA.debugLine="If MaximumRowsPerPage > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_maximumrowsperpage" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 209;BA.debugLine="mRowsPerPage = Min(MaximumRowsPerPage, mRowsPerP";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mrowsperpage" /*RemoteObject*/ ,BA.numberCast(int.class, b4xtable.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(true,"_maximumrowsperpage" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_mrowsperpage" /*RemoteObject*/ ))))));
 BA.debugLineNum = 210;BA.debugLine="TotalHeight = Min(TotalHeight, MaximumRowsPerPag";
Debug.JustUpdateDeviceLine();
_totalheight = BA.numberCast(int.class, b4xtable.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _totalheight)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maximumrowsperpage" /*RemoteObject*/ ),__ref.getField(true,"_rowheight" /*RemoteObject*/ )}, "*",0, 1)))));Debug.locals.put("TotalHeight", _totalheight);
 };
 BA.debugLineNum = 212;BA.debugLine="If PrevRowsPerPage <> mRowsPerPage Then RefreshDa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_prevrowsperpage,BA.numberCast(double.class, __ref.getField(true,"_mrowsperpage" /*RemoteObject*/ )))) { 
_refreshdata = b4xtable.__c.getField(true,"True");Debug.locals.put("RefreshData", _refreshdata);};
 BA.debugLineNum = 213;BA.debugLine="CalculateWidths";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_calculatewidths" /*RemoteObject*/ );
 BA.debugLineNum = 214;BA.debugLine="Dim ColumnIndex As Int";
Debug.JustUpdateDeviceLine();
_columnindex = RemoteObject.createImmutable(0);Debug.locals.put("ColumnIndex", _columnindex);
 BA.debugLineNum = 216;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group24 = __ref.getField(false,"_visiblecolumns" /*RemoteObject*/ );
final int groupLen24 = group24.runMethod(true,"getSize").<Integer>get()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_c = (group24.runMethod(false,"Get",index24));Debug.locals.put("c", _c);
Debug.locals.put("c", _c);
 BA.debugLineNum = 217;BA.debugLine="Dim IsFrozen As Boolean = ColumnIndex < NumberOf";
Debug.JustUpdateDeviceLine();
_isfrozen = BA.ObjectToBoolean(RemoteObject.solveBoolean("<",_columnindex,BA.numberCast(double.class, __ref.getField(true,"_numberoffrozencolumns" /*RemoteObject*/ ))));Debug.locals.put("IsFrozen", _isfrozen);Debug.locals.put("IsFrozen", _isfrozen);
 BA.debugLineNum = 218;BA.debugLine="If c.Panel.Parent.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_c.getField(false,"Panel" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 219;BA.debugLine="CheckAndRemoveColumnThatWasAddedToIncorrectPare";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_checkandremovecolumnthatwasaddedtoincorrectparent" /*RemoteObject*/ ,(Object)(_c),(Object)(_isfrozen));
 };
 BA.debugLineNum = 221;BA.debugLine="If c.Panel.Parent.IsInitialized = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_c.getField(false,"Panel" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(true,"IsInitialized"),b4xtable.__c.getField(true,"False"))) { 
 BA.debugLineNum = 222;BA.debugLine="c.Panel.Width = c.ComputedWidth";
Debug.JustUpdateDeviceLine();
_c.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(double.class, _c.getField(true,"ComputedWidth" /*RemoteObject*/ )));
 BA.debugLineNum = 223;BA.debugLine="If IsFrozen Then";
Debug.JustUpdateDeviceLine();
if (_isfrozen.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 224;BA.debugLine="mBase.AddView(c.Panel, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_c.getField(false,"Panel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 }else {
 BA.debugLineNum = 226;BA.debugLine="AddColumnToCLV (c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_addcolumntoclv" /*RemoteObject*/ ,(Object)(_c));
 };
 };
 BA.debugLineNum = 230;BA.debugLine="CreateColumnLayouts(c, mRowsPerPage + 1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_createcolumnlayouts" /*RemoteObject*/ ,(Object)(_c),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mrowsperpage" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 231;BA.debugLine="ResizeColumnImpl(c, TotalHeight)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_resizecolumnimpl" /*RemoteObject*/ ,(Object)(_c),(Object)(_totalheight));
 BA.debugLineNum = 232;BA.debugLine="ColumnIndex = ColumnIndex + 1";
Debug.JustUpdateDeviceLine();
_columnindex = RemoteObject.solve(new RemoteObject[] {_columnindex,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ColumnIndex", _columnindex);
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 234;BA.debugLine="If RefreshData Then UpdateData (DontSleep)";
Debug.JustUpdateDeviceLine();
if (_refreshdata.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.b4xtable.class, "_updatedata" /*RemoteObject*/ ,(Object)(_dontsleep));};
 BA.debugLineNum = 235;BA.debugLine="Dim FreezedWidth As Int";
Debug.JustUpdateDeviceLine();
_freezedwidth = RemoteObject.createImmutable(0);Debug.locals.put("FreezedWidth", _freezedwidth);
 BA.debugLineNum = 236;BA.debugLine="For i = 0 To NumberOfFrozenColumns - 1";
Debug.JustUpdateDeviceLine();
{
final int step43 = 1;
final int limit43 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_numberoffrozencolumns" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step43 > 0 && _i <= limit43) || (step43 < 0 && _i >= limit43) ;_i = ((int)(0 + _i + step43))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 237;BA.debugLine="Dim c As B4XTableColumn = VisibleColumns.Get(i)";
Debug.JustUpdateDeviceLine();
_c = (__ref.getField(false,"_visiblecolumns" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 239;BA.debugLine="Dim offset As Float = 1";
Debug.JustUpdateDeviceLine();
_offset = BA.numberCast(float.class, 1);Debug.locals.put("offset", _offset);Debug.locals.put("offset", _offset);
 BA.debugLineNum = 243;BA.debugLine="c.Panel.SetLayoutAnimated(0, offset + FreezedWid";
Debug.JustUpdateDeviceLine();
_c.getField(false,"Panel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_offset,_freezedwidth}, "+",1, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getTop"),_offset}, "+",1, 0)),(Object)(BA.numberCast(double.class, _c.getField(true,"ComputedWidth" /*RemoteObject*/ ))),(Object)(__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getHeight")));
 BA.debugLineNum = 245;BA.debugLine="FreezedWidth = FreezedWidth + c.ComputedWidth";
Debug.JustUpdateDeviceLine();
_freezedwidth = RemoteObject.solve(new RemoteObject[] {_freezedwidth,_c.getField(true,"ComputedWidth" /*RemoteObject*/ )}, "+",1, 1);Debug.locals.put("FreezedWidth", _freezedwidth);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 247;BA.debugLine="clvData.AsView.Left = FreezedWidth";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"setLeft",BA.numberCast(double.class, _freezedwidth));
 BA.debugLineNum = 248;BA.debugLine="If Round(clvData.AsView.Width) <> Round(mBase.Wid";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",b4xtable.__c.runMethod(true,"Round",(Object)(__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth"))),b4xtable.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),_freezedwidth}, "-",1, 0))))) { 
 BA.debugLineNum = 249;BA.debugLine="clvData.AsView.Width = mBase.Width - FreezedWidt";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),_freezedwidth}, "-",1, 0));
 BA.debugLineNum = 250;BA.debugLine="If xui.IsB4A Then clvData.Base_Resize(clvData.As";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A").<Boolean>get().booleanValue()) { 
__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runVoidMethod ("_base_resize",(Object)(__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getHeight")));};
 };
 BA.debugLineNum = 252;BA.debugLine="ResizeAndReorderCLVItems";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_resizeandreorderclvitems" /*RemoteObject*/ );
 BA.debugLineNum = 253;BA.debugLine="UpdateSearchFieldVisibility";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_updatesearchfieldvisibility" /*void*/ );
 BA.debugLineNum = 254;BA.debugLine="UpdateSortIcon";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_updatesorticon" /*RemoteObject*/ );
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refreshnow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RefreshNow (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,187);
if (RapidSub.canDelegate("refreshnow")) { return __ref.runUserSub(false, "b4xtable","refreshnow", __ref);}
 BA.debugLineNum = 187;BA.debugLine="Public Sub RefreshNow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 188;BA.debugLine="Refresh2(True, True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_refresh2" /*RemoteObject*/ ,(Object)(b4xtable.__c.getField(true,"True")),(Object)(b4xtable.__c.getField(true,"True")));
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removecolumnfromclv(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("RemoveColumnFromCLV (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,289);
if (RapidSub.canDelegate("removecolumnfromclv")) { return __ref.runUserSub(false, "b4xtable","removecolumnfromclv", __ref, _c);}
int _i = 0;
Debug.locals.put("c", _c);
 BA.debugLineNum = 289;BA.debugLine="Private Sub RemoveColumnFromCLV (c As B4XTableColu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 290;BA.debugLine="For i = 0 To clvData.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 291;BA.debugLine="If clvData.GetValue(i) = c Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))),(_c))) { 
 BA.debugLineNum = 292;BA.debugLine="clvData.RemoveAt(i)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 293;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 296;BA.debugLine="c.Panel.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_c.getField(false,"Panel" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 297;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resizeandreorderclvitems(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResizeAndReorderCLVItems (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,257);
if (RapidSub.canDelegate("resizeandreorderclvitems")) { return __ref.runUserSub(false, "b4xtable","resizeandreorderclvitems", __ref);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _c = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
RemoteObject _clvindex = RemoteObject.createImmutable(0);
 BA.debugLineNum = 257;BA.debugLine="Private Sub ResizeAndReorderCLVItems";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 258;BA.debugLine="Dim i As Int = NumberOfFrozenColumns";
Debug.JustUpdateDeviceLine();
_i = __ref.getField(true,"_numberoffrozencolumns" /*RemoteObject*/ );Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 259;BA.debugLine="Do While i < VisibleColumns.Size";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean("<",_i,BA.numberCast(double.class, __ref.getField(false,"_visiblecolumns" /*RemoteObject*/ ).runMethod(true,"getSize")))) {
 BA.debugLineNum = 260;BA.debugLine="Dim c As B4XTableColumn = VisibleColumns.Get(i)";
Debug.JustUpdateDeviceLine();
_c = (__ref.getField(false,"_visiblecolumns" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_i)));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 261;BA.debugLine="Dim CLVIndex As Int = i - NumberOfFrozenColumns";
Debug.JustUpdateDeviceLine();
_clvindex = RemoteObject.solve(new RemoteObject[] {_i,__ref.getField(true,"_numberoffrozencolumns" /*RemoteObject*/ )}, "-",1, 1);Debug.locals.put("CLVIndex", _clvindex);Debug.locals.put("CLVIndex", _clvindex);
 BA.debugLineNum = 262;BA.debugLine="If c <> clvData.GetValue(CLVIndex) Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_c,(__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_clvindex))))) { 
 BA.debugLineNum = 263;BA.debugLine="RemoveColumnFromCLV(c)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_removecolumnfromclv" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 264;BA.debugLine="clvData.InsertAt(CLVIndex, c.Panel, c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runVoidMethod ("_insertat",(Object)(_clvindex),(Object)(_c.getField(false,"Panel" /*RemoteObject*/ )),(Object)((_c)));
 }else {
 BA.debugLineNum = 266;BA.debugLine="clvData.ResizeItem(CLVIndex, c.ComputedWidth)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_clvdata" /*RemoteObject*/ ).runVoidMethod ("_resizeitem",(Object)(_clvindex),(Object)(_c.getField(true,"ComputedWidth" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 268;BA.debugLine="i = i + 1";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
;
 BA.debugLineNum = 270;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resizecolumnimpl(RemoteObject __ref,RemoteObject _c,RemoteObject _totalheight) throws Exception{
try {
		Debug.PushSubsStack("ResizeColumnImpl (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,299);
if (RapidSub.canDelegate("resizecolumnimpl")) { return __ref.runUserSub(false, "b4xtable","resizecolumnimpl", __ref, _c, _totalheight);}
RemoteObject _height = RemoteObject.createImmutable(0f);
RemoteObject _topint = RemoteObject.createImmutable(0);
RemoteObject _heightint = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("c", _c);
Debug.locals.put("TotalHeight", _totalheight);
 BA.debugLineNum = 299;BA.debugLine="Private Sub ResizeColumnImpl (c As B4XTableColumn,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 300;BA.debugLine="c.Panel.Width = c.ComputedWidth";
Debug.JustUpdateDeviceLine();
_c.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(double.class, _c.getField(true,"ComputedWidth" /*RemoteObject*/ )));
 BA.debugLineNum = 302;BA.debugLine="Dim Height As Float = TotalHeight / mRowsPerPage";
Debug.JustUpdateDeviceLine();
_height = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_totalheight,__ref.getField(true,"_mrowsperpage" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("Height", _height);Debug.locals.put("Height", _height);
 BA.debugLineNum = 303;BA.debugLine="If AllowSmallRowHeightModifications = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_allowsmallrowheightmodifications" /*RemoteObject*/ ),b4xtable.__c.getField(true,"False"))) { 
_height = BA.numberCast(float.class, __ref.getField(true,"_rowheight" /*RemoteObject*/ ));Debug.locals.put("Height", _height);};
 BA.debugLineNum = 304;BA.debugLine="Dim TopInt, HeightInt As Int";
Debug.JustUpdateDeviceLine();
_topint = RemoteObject.createImmutable(0);Debug.locals.put("TopInt", _topint);
_heightint = RemoteObject.createImmutable(0);Debug.locals.put("HeightInt", _heightint);
 BA.debugLineNum = 305;BA.debugLine="For i = 0 To c.CellsLayouts.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_c.getField(false,"CellsLayouts" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 306;BA.debugLine="Dim p As B4XView = c.CellsLayouts.Get(i)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _c.getField(false,"CellsLayouts" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 307;BA.debugLine="If i < mRowsPerPage + 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mrowsperpage" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)))) { 
 BA.debugLineNum = 308;BA.debugLine="Dim HeightInt As Int = Round(Height * i + Heade";
Debug.JustUpdateDeviceLine();
_heightint = BA.numberCast(int.class, b4xtable.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(_i),__ref.getField(true,"_headersheight" /*RemoteObject*/ ),_topint}, "*+-",2, 0))));Debug.locals.put("HeightInt", _heightint);Debug.locals.put("HeightInt", _heightint);
 BA.debugLineNum = 309;BA.debugLine="If i = 0 Then HeightInt = HeadersHeight";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_heightint = __ref.getField(true,"_headersheight" /*RemoteObject*/ );Debug.locals.put("HeightInt", _heightint);};
 BA.debugLineNum = 310;BA.debugLine="p.SetLayoutAnimated(0, 0, TopInt, c.ComputedWid";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _topint)),(Object)(BA.numberCast(double.class, _c.getField(true,"ComputedWidth" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _heightint)));
 BA.debugLineNum = 311;BA.debugLine="p.Visible = True";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setVisible",b4xtable.__c.getField(true,"True"));
 BA.debugLineNum = 312;BA.debugLine="If c.DisableAutoResizeLayout = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_c.getField(true,"DisableAutoResizeLayout" /*RemoteObject*/ ),b4xtable.__c.getField(true,"False"))) { 
 BA.debugLineNum = 313;BA.debugLine="Dim lbl As B4XView = p.GetView(0)";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 314;BA.debugLine="lbl.SetLayoutAnimated(0, 0, 0, p.Width, p.Heig";
Debug.JustUpdateDeviceLine();
_lbl.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_p.runMethod(true,"getWidth")),(Object)(_p.runMethod(true,"getHeight")));
 BA.debugLineNum = 316;BA.debugLine="If c.Searchable And p.NumberOfViews > 1 And p.";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_c.getField(true,"Searchable" /*RemoteObject*/ )) && RemoteObject.solveBoolean(">",_p.runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("=",_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(false,"getTag"),(__ref.getField(true,"_textpanetag" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 317;BA.debugLine="p.GetView(1).Width = p.Width";
Debug.JustUpdateDeviceLine();
_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"setWidth",_p.runMethod(true,"getWidth"));
 };
 };
 BA.debugLineNum = 321;BA.debugLine="TopInt = TopInt + HeightInt";
Debug.JustUpdateDeviceLine();
_topint = RemoteObject.solve(new RemoteObject[] {_topint,_heightint}, "+",1, 1);Debug.locals.put("TopInt", _topint);
 }else {
 BA.debugLineNum = 323;BA.debugLine="p.Visible = False";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setVisible",b4xtable.__c.getField(true,"False"));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _searchfield_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("SearchField_TextChanged (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,943);
if (RapidSub.canDelegate("searchfield_textchanged")) { __ref.runUserSub(false, "b4xtable","searchfield_textchanged", __ref, _old, _new); return;}
ResumableSub_SearchField_TextChanged rsub = new ResumableSub_SearchField_TextChanged(null,__ref,_old,_new);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SearchField_TextChanged extends BA.ResumableSub {
public ResumableSub_SearchField_TextChanged(b4j.example.b4xtable parent,RemoteObject __ref,RemoteObject _old,RemoteObject _new) {
this.parent = parent;
this.__ref = __ref;
this._old = _old;
this._new = _new;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xtable parent;
RemoteObject _old;
RemoteObject _new;
RemoteObject _myindex = RemoteObject.createImmutable(0);
RemoteObject _term = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SearchField_TextChanged (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,943);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 944;BA.debugLine="SearchIndex = SearchIndex + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_searchindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_searchindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 945;BA.debugLine="Dim MyIndex As Int = SearchIndex";
Debug.JustUpdateDeviceLine();
_myindex = __ref.getField(true,"_searchindex" /*RemoteObject*/ );Debug.locals.put("MyIndex", _myindex);Debug.locals.put("MyIndex", _myindex);
 BA.debugLineNum = 946;BA.debugLine="Sleep(SleepBeforeSearch)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xtable", "searchfield_textchanged"),__ref.getField(true,"_sleepbeforesearch" /*RemoteObject*/ ));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
 BA.debugLineNum = 947;BA.debugLine="If MyIndex <> SearchIndex Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",_myindex,BA.numberCast(double.class, __ref.getField(true,"_searchindex" /*RemoteObject*/ )))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 948;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 950;BA.debugLine="Dim term As String = New.ToLowerCase";
Debug.JustUpdateDeviceLine();
_term = _new.runMethod(true,"toLowerCase");Debug.locals.put("term", _term);Debug.locals.put("term", _term);
 BA.debugLineNum = 951;BA.debugLine="If term = FilterText Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_term,__ref.getField(true,"_filtertext" /*RemoteObject*/ ))) { 
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
 BA.debugLineNum = 952;BA.debugLine="FilterText = term";
Debug.JustUpdateDeviceLine();
__ref.setField ("_filtertext" /*RemoteObject*/ ,_term);
 BA.debugLineNum = 953;BA.debugLine="mFirstRowIndex = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mfirstrowindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 954;BA.debugLine="UpdateData (False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_updatedata" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 955;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _setcurrentpage(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("setCurrentPage (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,899);
if (RapidSub.canDelegate("setcurrentpage")) { return __ref.runUserSub(false, "b4xtable","setcurrentpage", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 899;BA.debugLine="Public Sub setCurrentPage(p As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 900;BA.debugLine="setFirstRowIndex((p - 1) * mRowsPerPage)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_setfirstrowindex" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_p,RemoteObject.createImmutable(1)}, "-",1, 1)),__ref.getField(true,"_mrowsperpage" /*RemoteObject*/ )}, "*",0, 1)));
 BA.debugLineNum = 901;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdata(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("SetData (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,657);
if (RapidSub.canDelegate("setdata")) { return __ref.runUserSub(false, "b4xtable","setdata", __ref, _data);}
ResumableSub_SetData rsub = new ResumableSub_SetData(null,__ref,_data);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SetData extends BA.ResumableSub {
public ResumableSub_SetData(b4j.example.b4xtable parent,RemoteObject __ref,RemoteObject _data) {
this.parent = parent;
this.__ref = __ref;
this._data = _data;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xtable parent;
RemoteObject _data;
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _column = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
RemoteObject _lrow = RemoteObject.declareNull("Object");
RemoteObject _row = null;
RemoteObject _senderfilter = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject group7;
int index7;
int groupLen7;
RemoteObject group15;
int index15;
int groupLen15;
RemoteObject group19;
int index19;
int groupLen19;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SetData (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,657);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 658;BA.debugLine="If sql1.IsInitialized Then sql1.Close";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 660;BA.debugLine="sql1.InitializeSQLite(\"\", \":memory:\", True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString(":memory:")),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 664;BA.debugLine="CreateTable";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_createtable" /*RemoteObject*/ );
 BA.debugLineNum = 665;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 666;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 667;BA.debugLine="sb.Append(\"INSERT INTO data VALUES (\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("INSERT INTO data VALUES (")));
 BA.debugLineNum = 668;BA.debugLine="For Each Column As B4XTableColumn In Columns";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//for
this.state = 16;
group7 = __ref.getField(false,"_columns" /*RemoteObject*/ );
index7 = 0;
groupLen7 = group7.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("Column", _column);
this.state = 35;
if (true) break;

case 35:
//C
this.state = 16;
if (index7 < groupLen7) {
this.state = 9;
_column = (group7.runMethod(false,"Get",index7));Debug.locals.put("Column", _column);}
if (true) break;

case 36:
//C
this.state = 35;
index7++;
Debug.locals.put("Column", _column);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 669;BA.debugLine="If Column.ColumnType = COLUMN_TYPE_VOID Then Con";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",_column.getField(true,"ColumnType" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_column_type_void" /*RemoteObject*/ )))) { 
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
 BA.debugLineNum = 670;BA.debugLine="sb.Append(\"?,\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("?,")));
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
Debug.locals.put("Column", _column);
;
 BA.debugLineNum = 672;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 673;BA.debugLine="sb.Append(\")\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 674;BA.debugLine="If Data.Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 17:
//if
this.state = 34;
if (RemoteObject.solveBoolean(">",_data.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 675;BA.debugLine="If Data.Get(0) Is List Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 20:
//if
this.state = 33;
if (RemoteObject.solveBoolean("i",_data.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))), RemoteObject.createImmutable("java.util.List"))) { 
this.state = 22;
}else {
this.state = 28;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 676;BA.debugLine="For Each lrow As Object In Data";
Debug.JustUpdateDeviceLine();
if (true) break;

case 23:
//for
this.state = 26;
group15 = _data;
index15 = 0;
groupLen15 = group15.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("lrow", _lrow);
this.state = 37;
if (true) break;

case 37:
//C
this.state = 26;
if (index15 < groupLen15) {
this.state = 25;
_lrow = group15.runMethod(false,"Get",index15);Debug.locals.put("lrow", _lrow);}
if (true) break;

case 38:
//C
this.state = 37;
index15++;
Debug.locals.put("lrow", _lrow);
if (true) break;

case 25:
//C
this.state = 38;
 BA.debugLineNum = 677;BA.debugLine="sql1.AddNonQueryToBatch(sb.ToString, lrow)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _lrow));
 if (true) break;
if (true) break;

case 26:
//C
this.state = 33;
Debug.locals.put("lrow", _lrow);
;
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 680;BA.debugLine="For Each row() As Object In Data";
Debug.JustUpdateDeviceLine();
if (true) break;

case 29:
//for
this.state = 32;
group19 = _data;
index19 = 0;
groupLen19 = group19.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 39;
if (true) break;

case 39:
//C
this.state = 32;
if (index19 < groupLen19) {
this.state = 31;
_row = (group19.runMethod(false,"Get",index19));Debug.locals.put("row", _row);}
if (true) break;

case 40:
//C
this.state = 39;
index19++;
Debug.locals.put("row", _row);
if (true) break;

case 31:
//C
this.state = 40;
 BA.debugLineNum = 681;BA.debugLine="sql1.AddNonQueryToBatch(sb.ToString, row)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(_row))));
 if (true) break;
if (true) break;

case 32:
//C
this.state = 33;
Debug.locals.put("row", _row);
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
 BA.debugLineNum = 686;BA.debugLine="Dim SenderFilter As Object = sql1.ExecNonQueryBat";
Debug.JustUpdateDeviceLine();
_senderfilter = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL1")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 688;BA.debugLine="Wait For (SenderFilter) SQL1_NonQueryComplete (Su";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","sql1_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xtable", "setdata"), _senderfilter);
this.state = 41;
return;
case 41:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 690;BA.debugLine="CountAll = Data.Size";
Debug.JustUpdateDeviceLine();
__ref.setField ("_countall" /*RemoteObject*/ ,_data.runMethod(true,"getSize"));
 BA.debugLineNum = 691;BA.debugLine="RefreshNow";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_refreshnow" /*RemoteObject*/ );
 BA.debugLineNum = 692;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 693;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _sql1_nonquerycomplete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static RemoteObject  _setfirstrowindex(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("setFirstRowIndex (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,879);
if (RapidSub.canDelegate("setfirstrowindex")) { return __ref.runUserSub(false, "b4xtable","setfirstrowindex", __ref, _row);}
Debug.locals.put("row", _row);
 BA.debugLineNum = 879;BA.debugLine="Public Sub setFirstRowIndex (row As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 880;BA.debugLine="row = Max(0, Min(CountAll - 1, row))";
Debug.JustUpdateDeviceLine();
_row = BA.numberCast(int.class, b4xtable.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(b4xtable.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_countall" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, _row))))));Debug.locals.put("row", _row);
 BA.debugLineNum = 881;BA.debugLine="mFirstRowIndex = row";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mfirstrowindex" /*RemoteObject*/ ,_row);
 BA.debugLineNum = 882;BA.debugLine="UpdateData (False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_updatedata" /*RemoteObject*/ ,(Object)(b4xtable.__c.getField(true,"False")));
 BA.debugLineNum = 883;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmousetransparent(RemoteObject __ref,RemoteObject _lbl) throws Exception{
try {
		Debug.PushSubsStack("SetMouseTransparent (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,753);
if (RapidSub.canDelegate("setmousetransparent")) { return __ref.runUserSub(false, "b4xtable","setmousetransparent", __ref, _lbl);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 753;BA.debugLine="Private Sub SetMouseTransparent (lbl As B4XView) '";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 755;BA.debugLine="Dim jo = lbl As JavaObject";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _lbl.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 756;BA.debugLine="jo.RunMethod(\"setMouseTransparent\", Array(True))";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMouseTransparent")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(b4xtable.__c.getField(true,"True"))})));
 BA.debugLineNum = 758;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpagelabelstate(RemoteObject __ref,RemoteObject _lbl,RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("SetPageLabelState (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,550);
if (RapidSub.canDelegate("setpagelabelstate")) { return __ref.runUserSub(false, "b4xtable","setpagelabelstate", __ref, _lbl, _enabled);}
Debug.locals.put("lbl", _lbl);
Debug.locals.put("enabled", _enabled);
 BA.debugLineNum = 550;BA.debugLine="Private Sub SetPageLabelState (lbl As B4XView, ena";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 551;BA.debugLine="If lbl.Tag = enabled Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_lbl.runMethod(false,"getTag"),(_enabled))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 552;BA.debugLine="lbl.Tag = enabled";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(false,"setTag",(_enabled));
 BA.debugLineNum = 553;BA.debugLine="If enabled Then";
Debug.JustUpdateDeviceLine();
if (_enabled.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 554;BA.debugLine="lbl.TextColor = ArrowsEnabledColor";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(true,"setTextColor",__ref.getField(true,"_arrowsenabledcolor" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 556;BA.debugLine="lbl.TextColor = ArrowsDisabledColor";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(true,"setTextColor",__ref.getField(true,"_arrowsdisabledcolor" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 558;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextorcsbuildertolabel(RemoteObject __ref,RemoteObject _xlbl,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("SetTextOrCSBuilderToLabel (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,760);
if (RapidSub.canDelegate("settextorcsbuildertolabel")) { return __ref.runUserSub(false, "b4xtable","settextorcsbuildertolabel", __ref, _xlbl, _text);}
Debug.locals.put("xlbl", _xlbl);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 760;BA.debugLine="Private Sub SetTextOrCSBuilderToLabel(xlbl As B4XV";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 762;BA.debugLine="xlbl.Text = Text";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setText",BA.ObjectToString(_text));
 BA.debugLineNum = 772;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settexttocell(RemoteObject __ref,RemoteObject _text,RemoteObject _lbl,RemoteObject _searchable) throws Exception{
try {
		Debug.PushSubsStack("SetTextToCell (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,494);
if (RapidSub.canDelegate("settexttocell")) { return __ref.runUserSub(false, "b4xtable","settexttocell", __ref, _text, _lbl, _searchable);}
RemoteObject _parent = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _textpane = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Text", _text);
Debug.locals.put("lbl", _lbl);
Debug.locals.put("Searchable", _searchable);
 BA.debugLineNum = 494;BA.debugLine="Private Sub SetTextToCell (Text As String, lbl As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 495;BA.debugLine="If Searchable = False Or HighlightSearchResults =";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_searchable,b4xtable.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_highlightsearchresults" /*RemoteObject*/ ),b4xtable.__c.getField(true,"False"))) { 
 BA.debugLineNum = 496;BA.debugLine="lbl.Text = Text";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(true,"setText",_text);
 }else {
 BA.debugLineNum = 499;BA.debugLine="Dim parent As B4XView = lbl.Parent";
Debug.JustUpdateDeviceLine();
_parent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_parent = _lbl.runMethod(false,"getParent");Debug.locals.put("parent", _parent);Debug.locals.put("parent", _parent);
 BA.debugLineNum = 500;BA.debugLine="If parent.GetView(parent.NumberOfViews - 1).Tag";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_parent.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1))).runMethod(false,"getTag"),(__ref.getField(true,"_textpanetag" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 501;BA.debugLine="parent.GetView(parent.NumberOfViews - 1).Remove";
Debug.JustUpdateDeviceLine();
_parent.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1))).runVoidMethod ("RemoveViewFromParent");
 };
 BA.debugLineNum = 504;BA.debugLine="If FilterText = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_filtertext" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 505;BA.debugLine="lbl.Text = Text";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(true,"setText",_text);
 }else {
 BA.debugLineNum = 507;BA.debugLine="Dim x As Int = Text.ToLowerCase.IndexOf(FilterT";
Debug.JustUpdateDeviceLine();
_x = _text.runMethod(true,"toLowerCase").runMethod(true,"indexOf",(Object)(__ref.getField(true,"_filtertext" /*RemoteObject*/ )));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 508;BA.debugLine="If x = -1 Or (PrefixSearch And x > 0) Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_x,BA.numberCast(double.class, -(double) (0 + 1))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",__ref.getField(true,"_prefixsearch" /*RemoteObject*/ )) && RemoteObject.solveBoolean(">",_x,BA.numberCast(double.class, 0)))))) { 
 BA.debugLineNum = 509;BA.debugLine="lbl.Text = Text";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(true,"setText",_text);
 BA.debugLineNum = 510;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 525;BA.debugLine="TextFlow.Reset";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textflow" /*RemoteObject*/ ).runClassMethod (b4j.example.b4jtextflow.class, "_reset" /*RemoteObject*/ );
 BA.debugLineNum = 526;BA.debugLine="If x > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_x,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 527;BA.debugLine="TextFlow.Append(Text.SubString2(0, x)).SetColo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textflow" /*RemoteObject*/ ).runClassMethod (b4j.example.b4jtextflow.class, "_append" /*RemoteObject*/ ,(Object)(_text.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_x)))).runClassMethod (b4j.example.b4jtextflow.class, "_setcolor" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_textcolor" /*RemoteObject*/ ))).runClassMethod (b4j.example.b4jtextflow.class, "_setfont" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.FontWrapper"), __ref.getField(false,"_labelsfont" /*RemoteObject*/ ).getObject()));
 };
 BA.debugLineNum = 529;BA.debugLine="TextFlow.Append(Text.SubString2(x, x + FilterTe";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textflow" /*RemoteObject*/ ).runClassMethod (b4j.example.b4jtextflow.class, "_append" /*RemoteObject*/ ,(Object)(_text.runMethod(true,"substring",(Object)(_x),(Object)(RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_filtertext" /*RemoteObject*/ ).runMethod(true,"length")}, "+",1, 1))))).runClassMethod (b4j.example.b4jtextflow.class, "_setcolor" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_highlighttextcolor" /*RemoteObject*/ ))).runClassMethod (b4j.example.b4jtextflow.class, "_setfont" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.FontWrapper"), __ref.getField(false,"_labelsfont" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 530;BA.debugLine="If x + FilterText.Length < Text.Length Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_filtertext" /*RemoteObject*/ ).runMethod(true,"length")}, "+",1, 1),BA.numberCast(double.class, _text.runMethod(true,"length")))) { 
 BA.debugLineNum = 531;BA.debugLine="TextFlow.Append(Text.SubString(x + FilterText.";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textflow" /*RemoteObject*/ ).runClassMethod (b4j.example.b4jtextflow.class, "_append" /*RemoteObject*/ ,(Object)(_text.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_filtertext" /*RemoteObject*/ ).runMethod(true,"length")}, "+",1, 1))))).runClassMethod (b4j.example.b4jtextflow.class, "_setcolor" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_textcolor" /*RemoteObject*/ ))).runClassMethod (b4j.example.b4jtextflow.class, "_setfont" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.FontWrapper"), __ref.getField(false,"_labelsfont" /*RemoteObject*/ ).getObject()));
 };
 BA.debugLineNum = 533;BA.debugLine="Dim TextPane As B4XView = TextFlow.CreateTextFl";
Debug.JustUpdateDeviceLine();
_textpane = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_textpane = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_textflow" /*RemoteObject*/ ).runClassMethod (b4j.example.b4jtextflow.class, "_createtextflow" /*RemoteObject*/ ).getObject());Debug.locals.put("TextPane", _textpane);Debug.locals.put("TextPane", _textpane);
 BA.debugLineNum = 534;BA.debugLine="TextPane.Tag = TextPaneTag";
Debug.JustUpdateDeviceLine();
_textpane.runMethod(false,"setTag",(__ref.getField(true,"_textpanetag" /*RemoteObject*/ )));
 BA.debugLineNum = 535;BA.debugLine="lbl.Text = \"\"";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 536;BA.debugLine="parent.AddView(TextPane, 0, parent.Height / 2 -";
Debug.JustUpdateDeviceLine();
_parent.runVoidMethod ("AddView",(Object)((_textpane.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),RemoteObject.createImmutable(12)}, "/-",1, 0)),(Object)(_parent.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)));
 };
 };
 BA.debugLineNum = 540;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatedata(RemoteObject __ref,RemoteObject _dontsleep) throws Exception{
try {
		Debug.PushSubsStack("UpdateData (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,328);
if (RapidSub.canDelegate("updatedata")) { return __ref.runUserSub(false, "b4xtable","updatedata", __ref, _dontsleep);}
RemoteObject _o = null;
Debug.locals.put("DontSleep", _dontsleep);
 BA.debugLineNum = 328;BA.debugLine="Private Sub UpdateData (DontSleep As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 329;BA.debugLine="If sql1.IsInitialized = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),b4xtable.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 330;BA.debugLine="Dim o() As Object = BuildQuery(True)";
Debug.JustUpdateDeviceLine();
_o = __ref.runClassMethod (b4j.example.b4xtable.class, "_buildquery" /*RemoteObject*/ ,(Object)(b4xtable.__c.getField(true,"True")));Debug.locals.put("o", _o);Debug.locals.put("o", _o);
 BA.debugLineNum = 332;BA.debugLine="ImplUpdateDataFromQuery (o(0), o(1), o(2), DontSl";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_implupdatedatafromquery" /*void*/ ,(Object)(BA.ObjectToString(_o.getArrayElement(false,BA.numberCast(int.class, 0)))),(Object)(_o.getArrayElement(false,BA.numberCast(int.class, 1))),(Object)(BA.numberCast(int.class, _o.getArrayElement(false,BA.numberCast(int.class, 2)))),(Object)(_dontsleep));
 BA.debugLineNum = 333;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _updatesearchfieldvisibility(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateSearchFieldVisibility (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,272);
if (RapidSub.canDelegate("updatesearchfieldvisibility")) { __ref.runUserSub(false, "b4xtable","updatesearchfieldvisibility", __ref); return;}
ResumableSub_UpdateSearchFieldVisibility rsub = new ResumableSub_UpdateSearchFieldVisibility(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_UpdateSearchFieldVisibility extends BA.ResumableSub {
public ResumableSub_UpdateSearchFieldVisibility(b4j.example.b4xtable parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xtable parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UpdateSearchFieldVisibility (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,272);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 274;BA.debugLine="Sleep(100) 'workaround for a JavaFX drawing bug";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xtable", "updatesearchfieldvisibility"),BA.numberCast(int.class, 100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 276;BA.debugLine="SearchField.mBase.Visible = SearchVisible And Cou";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean(".",__ref.getField(true,"_searchvisible" /*RemoteObject*/ )) && RemoteObject.solveBoolean(">",__ref.getField(true,"_countall" /*RemoteObject*/ ),BA.numberCast(double.class, 0))));
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _updatesorticon(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateSortIcon (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,839);
if (RapidSub.canDelegate("updatesorticon")) { return __ref.runUserSub(false, "b4xtable","updatesorticon", __ref);}
RemoteObject _col = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
 BA.debugLineNum = 839;BA.debugLine="Private Sub UpdateSortIcon";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 840;BA.debugLine="For Each col As B4XTableColumn In Columns";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_columns" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_col = (group1.runMethod(false,"Get",index1));Debug.locals.put("col", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 841;BA.debugLine="If col.InternalSortMode <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_col.getField(true,"InternalSortMode" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 842;BA.debugLine="If lblSort.Parent <> col.Panel Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_lblsort" /*RemoteObject*/ ).runMethod(false,"getParent"),_col.getField(false,"Panel" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 843;BA.debugLine="lblSort.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblsort" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 844;BA.debugLine="col.Panel.AddView(lblSort, 0, 0, lblSort.Width";
Debug.JustUpdateDeviceLine();
_col.getField(false,"Panel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblsort" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_lblsort" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(BA.numberCast(double.class, 0)));
 };
 BA.debugLineNum = 846;BA.debugLine="lblSort.Top = 0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblsort" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(double.class, 0));
 BA.debugLineNum = 847;BA.debugLine="lblSort.Height = HeadersHeight";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblsort" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(double.class, __ref.getField(true,"_headersheight" /*RemoteObject*/ )));
 BA.debugLineNum = 848;BA.debugLine="lblSort.Left = col.Panel.Width - lblSort.Width";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblsort" /*RemoteObject*/ ).runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_col.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_lblsort" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 0));
 BA.debugLineNum = 849;BA.debugLine="lblSort.Visible = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblsort" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xtable.__c.getField(true,"True"));
 BA.debugLineNum = 850;BA.debugLine="If col.InternalSortMode = \"ASC\" Then lblSort.Te";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_col.getField(true,"InternalSortMode" /*RemoteObject*/ ),BA.ObjectToString("ASC"))) { 
__ref.getField(false,"_lblsort" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(b4xtable.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf0de))))));}
else {
__ref.getField(false,"_lblsort" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(b4xtable.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf0dd))))));};
 BA.debugLineNum = 851;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 854;BA.debugLine="lblSort.Visible = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblsort" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xtable.__c.getField(true,"False"));
 BA.debugLineNum = 855;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatetablecounters(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateTableCounters (b4xtable) ","b4xtable",49,__ref.getField(false, "ba"),__ref,408);
if (RapidSub.canDelegate("updatetablecounters")) { return __ref.runUserSub(false, "b4xtable","updatetablecounters", __ref);}
 BA.debugLineNum = 408;BA.debugLine="Public Sub UpdateTableCounters";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 409;BA.debugLine="CountAll = sql1.ExecQuerySingleResult(\"SELECT cou";
Debug.JustUpdateDeviceLine();
__ref.setField ("_countall" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("SELECT count(*) FROM data")))));
 BA.debugLineNum = 410;BA.debugLine="UpdateData (True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xtable.class, "_updatedata" /*RemoteObject*/ ,(Object)(b4xtable.__c.getField(true,"True")));
 BA.debugLineNum = 411;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}