package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class magmagrid_subs_0 {


public static RemoteObject  _addcolumn(RemoteObject __ref,RemoteObject _name,RemoteObject _hidden,RemoteObject _locked,RemoteObject _sortable,RemoteObject _width1,RemoteObject _controltype,RemoteObject _defaultvalue,RemoteObject _uselist,RemoteObject _maxlength,RemoteObject _minvalue,RemoteObject _maxvalue,RemoteObject _alignment,RemoteObject _minintegers,RemoteObject _minfractions,RemoteObject _maxfractions,RemoteObject _grouping) throws Exception{
try {
		Debug.PushSubsStack("AddColumn (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,239);
if (RapidSub.canDelegate("addcolumn")) { return __ref.runUserSub(false, "magmagrid","addcolumn", __ref, _name, _hidden, _locked, _sortable, _width1, _controltype, _defaultvalue, _uselist, _maxlength, _minvalue, _maxvalue, _alignment, _minintegers, _minfractions, _maxfractions, _grouping);}
RemoteObject _mycolumn = RemoteObject.declareNull("b4j.example.magmagrid._mycol");
RemoteObject _myb4xformat = RemoteObject.declareNull("b4j.example.b4xformatter");
RemoteObject _thiscolumn = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
RemoteObject _tmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Name", _name);
Debug.locals.put("Hidden", _hidden);
Debug.locals.put("Locked", _locked);
Debug.locals.put("Sortable", _sortable);
Debug.locals.put("Width1", _width1);
Debug.locals.put("Controltype", _controltype);
Debug.locals.put("Defaultvalue", _defaultvalue);
Debug.locals.put("UseList", _uselist);
Debug.locals.put("MaxLength", _maxlength);
Debug.locals.put("MinValue", _minvalue);
Debug.locals.put("MaxValue", _maxvalue);
Debug.locals.put("Alignment", _alignment);
Debug.locals.put("MinIntegers", _minintegers);
Debug.locals.put("MinFractions", _minfractions);
Debug.locals.put("MaxFractions", _maxfractions);
Debug.locals.put("Grouping", _grouping);
 BA.debugLineNum = 239;BA.debugLine="Public Sub AddColumn(Name As String, Hidden As Boo";
Debug.ShouldStop(16384);
 BA.debugLineNum = 244;BA.debugLine="Dim MyColumn As mycol";
Debug.ShouldStop(524288);
_mycolumn = RemoteObject.createNew ("b4j.example.magmagrid._mycol");Debug.locals.put("MyColumn", _mycolumn);
 BA.debugLineNum = 245;BA.debugLine="MyColumn.Initialize";
Debug.ShouldStop(1048576);
_mycolumn.runVoidMethod ("Initialize");
 BA.debugLineNum = 246;BA.debugLine="MyColumn.Name=Name";
Debug.ShouldStop(2097152);
_mycolumn.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 247;BA.debugLine="MyColumn.Hidden=Hidden";
Debug.ShouldStop(4194304);
_mycolumn.setField ("Hidden" /*RemoteObject*/ ,_hidden);
 BA.debugLineNum = 248;BA.debugLine="MyColumn.Locked=Locked";
Debug.ShouldStop(8388608);
_mycolumn.setField ("Locked" /*RemoteObject*/ ,_locked);
 BA.debugLineNum = 249;BA.debugLine="MyColumn.Sortable=Sortable";
Debug.ShouldStop(16777216);
_mycolumn.setField ("Sortable" /*RemoteObject*/ ,_sortable);
 BA.debugLineNum = 250;BA.debugLine="MyColumn.Width1=Width1";
Debug.ShouldStop(33554432);
_mycolumn.setField ("Width1" /*RemoteObject*/ ,_width1);
 BA.debugLineNum = 251;BA.debugLine="MyColumn.Controltype=Controltype";
Debug.ShouldStop(67108864);
_mycolumn.setField ("Controltype" /*RemoteObject*/ ,_controltype);
 BA.debugLineNum = 252;BA.debugLine="MyColumn.Defaultvalue=Defaultvalue";
Debug.ShouldStop(134217728);
_mycolumn.setField ("Defaultvalue" /*RemoteObject*/ ,_defaultvalue);
 BA.debugLineNum = 253;BA.debugLine="MyColumn.UseList=UseList";
Debug.ShouldStop(268435456);
_mycolumn.setField ("UseList" /*RemoteObject*/ ,_uselist);
 BA.debugLineNum = 254;BA.debugLine="If Controltype.Trim.ToUpperCase.Contains(\"NUMERIC";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(".",_controltype.runMethod(true,"trim").runMethod(true,"toUpperCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("NUMERIC")))) && RemoteObject.solveBoolean("=",_maxlength,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 255;BA.debugLine="MaxLength=15";
Debug.ShouldStop(1073741824);
_maxlength = BA.numberCast(int.class, 15);Debug.locals.put("MaxLength", _maxlength);
 BA.debugLineNum = 256;BA.debugLine="MyColumn.MaxLength=MaxLength";
Debug.ShouldStop(-2147483648);
_mycolumn.setField ("MaxLength" /*RemoteObject*/ ,_maxlength);
 };
 BA.debugLineNum = 258;BA.debugLine="MyColumn.MaxLength=MaxLength";
Debug.ShouldStop(2);
_mycolumn.setField ("MaxLength" /*RemoteObject*/ ,_maxlength);
 BA.debugLineNum = 260;BA.debugLine="MyColumn.MinValue=MinValue";
Debug.ShouldStop(8);
_mycolumn.setField ("MinValue" /*RemoteObject*/ ,_minvalue);
 BA.debugLineNum = 261;BA.debugLine="MyColumn.MaxValue=MaxValue";
Debug.ShouldStop(16);
_mycolumn.setField ("MaxValue" /*RemoteObject*/ ,_maxvalue);
 BA.debugLineNum = 263;BA.debugLine="If MinIntegers=0 And MinFractions=0 And MaxFracti";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_minintegers,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",_minfractions,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",_maxfractions,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 264;BA.debugLine="MinIntegers=1";
Debug.ShouldStop(128);
_minintegers = BA.numberCast(int.class, 1);Debug.locals.put("MinIntegers", _minintegers);
 BA.debugLineNum = 265;BA.debugLine="MinFractions=0";
Debug.ShouldStop(256);
_minfractions = BA.numberCast(int.class, 0);Debug.locals.put("MinFractions", _minfractions);
 BA.debugLineNum = 266;BA.debugLine="MaxFractions=5";
Debug.ShouldStop(512);
_maxfractions = BA.numberCast(int.class, 5);Debug.locals.put("MaxFractions", _maxfractions);
 };
 BA.debugLineNum = 268;BA.debugLine="MyColumn.MinIntegers=MinIntegers";
Debug.ShouldStop(2048);
_mycolumn.setField ("MinIntegers" /*RemoteObject*/ ,_minintegers);
 BA.debugLineNum = 269;BA.debugLine="MyColumn.MinFractions=MinFractions";
Debug.ShouldStop(4096);
_mycolumn.setField ("MinFractions" /*RemoteObject*/ ,_minfractions);
 BA.debugLineNum = 270;BA.debugLine="MyColumn.MaxFractions=MaxFractions";
Debug.ShouldStop(8192);
_mycolumn.setField ("MaxFractions" /*RemoteObject*/ ,_maxfractions);
 BA.debugLineNum = 272;BA.debugLine="MyColumn.Grouping=Grouping";
Debug.ShouldStop(32768);
_mycolumn.setField ("Grouping" /*RemoteObject*/ ,_grouping);
 BA.debugLineNum = 275;BA.debugLine="Dim myb4xformat As B4XFormatter";
Debug.ShouldStop(262144);
_myb4xformat = RemoteObject.createNew ("b4j.example.b4xformatter");Debug.locals.put("myb4xformat", _myb4xformat);
 BA.debugLineNum = 276;BA.debugLine="myb4xformat.Initialize";
Debug.ShouldStop(524288);
_myb4xformat.runClassMethod (b4j.example.b4xformatter.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 277;BA.debugLine="If Grouping=False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_grouping,magmagrid.__c.getField(true,"False"))) { 
 BA.debugLineNum = 278;BA.debugLine="myb4xformat.GetDefaultFormat.GroupingCharacter=\"";
Debug.ShouldStop(2097152);
_myb4xformat.runClassMethod (b4j.example.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("GroupingCharacter" /*RemoteObject*/ ,BA.ObjectToString(""));
 }else {
 BA.debugLineNum = 280;BA.debugLine="If DecimalSeparator=\".\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_decimalseparator" /*RemoteObject*/ ),BA.ObjectToString("."))) { 
 BA.debugLineNum = 281;BA.debugLine="myb4xformat.GetDefaultFormat.GroupingCharacter=";
Debug.ShouldStop(16777216);
_myb4xformat.runClassMethod (b4j.example.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("GroupingCharacter" /*RemoteObject*/ ,BA.ObjectToString(","));
 }else {
 BA.debugLineNum = 283;BA.debugLine="myb4xformat.GetDefaultFormat.GroupingCharacter=";
Debug.ShouldStop(67108864);
_myb4xformat.runClassMethod (b4j.example.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("GroupingCharacter" /*RemoteObject*/ ,BA.ObjectToString("."));
 };
 };
 BA.debugLineNum = 286;BA.debugLine="myb4xformat.GetDefaultFormat.MinimumIntegers=MinI";
Debug.ShouldStop(536870912);
_myb4xformat.runClassMethod (b4j.example.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("MinimumIntegers" /*RemoteObject*/ ,_minintegers);
 BA.debugLineNum = 287;BA.debugLine="myb4xformat.GetDefaultFormat.minimumFractions=Min";
Debug.ShouldStop(1073741824);
_myb4xformat.runClassMethod (b4j.example.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("MinimumFractions" /*RemoteObject*/ ,_minfractions);
 BA.debugLineNum = 288;BA.debugLine="myb4xformat.GetDefaultFormat.MaximumFractions=Max";
Debug.ShouldStop(-2147483648);
_myb4xformat.runClassMethod (b4j.example.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("MaximumFractions" /*RemoteObject*/ ,_maxfractions);
 BA.debugLineNum = 291;BA.debugLine="MyColumn.Alignment=Alignment";
Debug.ShouldStop(4);
_mycolumn.setField ("Alignment" /*RemoteObject*/ ,_alignment);
 BA.debugLineNum = 293;BA.debugLine="MyColumns.Add(MyColumn)";
Debug.ShouldStop(16);
__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_mycolumn)));
 BA.debugLineNum = 295;BA.debugLine="Select Case Controltype";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(_controltype,BA.ObjectToString("TEXTFIELD"),BA.ObjectToString("TEXTAREA"),BA.ObjectToString("COMBO"),BA.ObjectToString("COMBO"),BA.ObjectToString("COMBOEDIT"),BA.ObjectToString("COMBOFIELD"),BA.ObjectToString("COMBOEDITFIELD"),BA.ObjectToString("PICTURE"),BA.ObjectToString("CHECKBOX"),BA.ObjectToString("CHECK"),BA.ObjectToString("TEXTFIELD_NUMERIC"),BA.ObjectToString("DATE"),BA.ObjectToString("EDITCONTROLS"))) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: 
case 7: 
case 8: 
case 9: {
 BA.debugLineNum = 297;BA.debugLine="useB4XTable.AddColumn(Name,useB4XTable.COLUMN_T";
Debug.ShouldStop(256);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(_name),(Object)(__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(true,"_column_type_text" /*RemoteObject*/ )));
 break; }
case 10: {
 BA.debugLineNum = 300;BA.debugLine="useB4XTable.AddColumn(Name,useB4XTable.COLUMN_T";
Debug.ShouldStop(2048);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(_name),(Object)(__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(true,"_column_type_numbers" /*RemoteObject*/ )));
 break; }
case 11: {
 BA.debugLineNum = 303;BA.debugLine="useB4XTable.AddColumn(Name,useB4XTable.COLUMN_T";
Debug.ShouldStop(16384);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(_name),(Object)(__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(true,"_column_type_date" /*RemoteObject*/ )));
 break; }
case 12: {
 BA.debugLineNum = 306;BA.debugLine="useB4XTable.AddColumn(Name,useB4XTable.COLUMN_T";
Debug.ShouldStop(131072);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(_name),(Object)(__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(true,"_column_type_void" /*RemoteObject*/ )));
 break; }
}
;
 BA.debugLineNum = 311;BA.debugLine="Dim thisColumn As B4XTableColumn=useB4XTable.Get";
Debug.ShouldStop(4194304);
_thiscolumn = __ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_getcolumn" /*RemoteObject*/ ,(Object)(_name));Debug.locals.put("thisColumn", _thiscolumn);Debug.locals.put("thisColumn", _thiscolumn);
 BA.debugLineNum = 312;BA.debugLine="thisColumn.Sortable=Sortable";
Debug.ShouldStop(8388608);
_thiscolumn.setField ("Sortable" /*RemoteObject*/ ,_sortable);
 BA.debugLineNum = 315;BA.debugLine="If Controltype.Contains(\"NUMERIC\") Then thisColu";
Debug.ShouldStop(67108864);
if (_controltype.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("NUMERIC"))).<Boolean>get().booleanValue()) { 
_thiscolumn.setField ("Formatter" /*RemoteObject*/ ,_myb4xformat);};
 BA.debugLineNum = 316;BA.debugLine="If Hidden=False Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_hidden,magmagrid.__c.getField(true,"False"))) { 
 BA.debugLineNum = 317;BA.debugLine="thisColumn.Width=Width1";
Debug.ShouldStop(268435456);
_thiscolumn.setField ("Width" /*RemoteObject*/ ,_width1);
 }else {
 BA.debugLineNum = 319;BA.debugLine="thisColumn.Width=1";
Debug.ShouldStop(1073741824);
_thiscolumn.setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 };
 BA.debugLineNum = 323;BA.debugLine="If Alignment.trim=\"\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_alignment.runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 324;BA.debugLine="Select Case Controltype";
Debug.ShouldStop(8);
switch (BA.switchObjectToInt(_controltype,BA.ObjectToString("TEXTFIELD"),BA.ObjectToString("TEXTAREA"),BA.ObjectToString("COMBO"),BA.ObjectToString("COMBO"),BA.ObjectToString("COMBOEDIT"),BA.ObjectToString("COMBOFIELD"),BA.ObjectToString("COMBOEDITFIELD"),BA.ObjectToString("PICTURE"),BA.ObjectToString("CHECKBOX"),BA.ObjectToString("CHECK"),BA.ObjectToString("EDITCONTROLS"),BA.ObjectToString("DATE"))) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: 
case 7: 
case 8: 
case 9: {
 BA.debugLineNum = 327;BA.debugLine="If Controltype=\"TEXTFIELD_NUMERIC\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_controltype,BA.ObjectToString("TEXTFIELD_NUMERIC"))) { 
 BA.debugLineNum = 328;BA.debugLine="SetColumnAlignment(useB4XTable,Name,\"LEFT\")";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.magmagrid.class, "_setcolumnalignment" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_useb4xtable" /*RemoteObject*/ )),(Object)(_name),(Object)(RemoteObject.createImmutable("LEFT")));
 }else {
 BA.debugLineNum = 330;BA.debugLine="SetColumnAlignment(useB4XTable,Name,\"RIGHT\")";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.magmagrid.class, "_setcolumnalignment" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_useb4xtable" /*RemoteObject*/ )),(Object)(_name),(Object)(RemoteObject.createImmutable("RIGHT")));
 };
 break; }
case 10: {
 BA.debugLineNum = 334;BA.debugLine="SetColumnAlignment(useB4XTable,Name,\"CENTER\")";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.magmagrid.class, "_setcolumnalignment" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_useb4xtable" /*RemoteObject*/ )),(Object)(_name),(Object)(RemoteObject.createImmutable("CENTER")));
 break; }
case 11: {
 BA.debugLineNum = 337;BA.debugLine="SetColumnAlignment(useB4XTable,Name,\"CENTER\")";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.magmagrid.class, "_setcolumnalignment" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_useb4xtable" /*RemoteObject*/ )),(Object)(_name),(Object)(RemoteObject.createImmutable("CENTER")));
 break; }
}
;
 }else {
 BA.debugLineNum = 340;BA.debugLine="SetColumnAlignment(useB4XTable,Name,Alignment)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.magmagrid.class, "_setcolumnalignment" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_useb4xtable" /*RemoteObject*/ )),(Object)(_name),(Object)(_alignment));
 };
 BA.debugLineNum = 344;BA.debugLine="If UseList = Null Or UseList.IsInitialized = Fals";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("n",_uselist) || RemoteObject.solveBoolean("=",_uselist.runMethod(true,"IsInitialized"),magmagrid.__c.getField(true,"False"))) { 
 BA.debugLineNum = 345;BA.debugLine="Dim tmp As List";
Debug.ShouldStop(16777216);
_tmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("tmp", _tmp);
 BA.debugLineNum = 346;BA.debugLine="tmp.Initialize";
Debug.ShouldStop(33554432);
_tmp.runVoidMethod ("Initialize");
 BA.debugLineNum = 347;BA.debugLine="UseList = tmp";
Debug.ShouldStop(67108864);
_uselist = _tmp;Debug.locals.put("UseList", _uselist);
 };
 BA.debugLineNum = 349;BA.debugLine="Lists.add(UseList)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lists" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_uselist.getObject())));
 BA.debugLineNum = 352;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addhorizontalpraxis(RemoteObject __ref,RemoteObject _apraxis) throws Exception{
try {
		Debug.PushSubsStack("AddHorizontalPraxis (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,209);
if (RapidSub.canDelegate("addhorizontalpraxis")) { return __ref.runUserSub(false, "magmagrid","addhorizontalpraxis", __ref, _apraxis);}
Debug.locals.put("apraxis", _apraxis);
 BA.debugLineNum = 209;BA.debugLine="public Sub AddHorizontalPraxis(apraxis As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="HorizontalPraxisList.Add(apraxis)";
Debug.ShouldStop(131072);
__ref.getField(false,"_horizontalpraxislist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_apraxis)));
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addkeypressedlistener(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddKeyPressedListener (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,833);
if (RapidSub.canDelegate("addkeypressedlistener")) { return __ref.runUserSub(false, "magmagrid","addkeypressedlistener", __ref);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
 BA.debugLineNum = 833;BA.debugLine="Sub AddKeyPressedListener";
Debug.ShouldStop(1);
 BA.debugLineNum = 834;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(2);
_r = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 835;BA.debugLine="r.Target = myroot'B4XPages.GetNativeParent(Root)";
Debug.ShouldStop(4);
_r.setField ("Target",(__ref.getField(false,"_myroot" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 837;BA.debugLine="r.AddEventFilter(\"keypressed\", \"javafx.scene.inpu";
Debug.ShouldStop(16);
_r.runVoidMethod ("AddEventFilter",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("keypressed")),(Object)(RemoteObject.createImmutable("javafx.scene.input.KeyEvent.ANY")));
 BA.debugLineNum = 839;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _alignallcols(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AlignAllCols (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,403);
if (RapidSub.canDelegate("alignallcols")) { return __ref.runUserSub(false, "magmagrid","alignallcols", __ref);}
int _k = 0;
RemoteObject _myc = RemoteObject.declareNull("b4j.example.magmagrid._mycol");
RemoteObject _alignment = RemoteObject.createImmutable("");
 BA.debugLineNum = 403;BA.debugLine="Public Sub AlignAllCols";
Debug.ShouldStop(262144);
 BA.debugLineNum = 404;BA.debugLine="useB4XTable.MaximumRowsPerPage = 20";
Debug.ShouldStop(524288);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).setField ("_maximumrowsperpage" /*RemoteObject*/ ,BA.numberCast(int.class, 20));
 BA.debugLineNum = 405;BA.debugLine="useB4XTable.BuildLayoutsCache(useB4XTable.Maximum";
Debug.ShouldStop(1048576);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_buildlayoutscache" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(true,"_maximumrowsperpage" /*RemoteObject*/ )));
 BA.debugLineNum = 406;BA.debugLine="If xui.IsB4J Then useB4XTable.HighlightSearchResu";
Debug.ShouldStop(2097152);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J").<Boolean>get().booleanValue()) { 
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).setField ("_highlightsearchresults" /*RemoteObject*/ ,magmagrid.__c.getField(true,"False"));};
 BA.debugLineNum = 408;BA.debugLine="For k=0 To MyColumns.Size-1";
Debug.ShouldStop(8388608);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_k = 0 ;
for (;(step4 > 0 && _k <= limit4) || (step4 < 0 && _k >= limit4) ;_k = ((int)(0 + _k + step4))  ) {
Debug.locals.put("k", _k);
 BA.debugLineNum = 409;BA.debugLine="Dim myc As mycol=MyColumns.Get(k)";
Debug.ShouldStop(16777216);
_myc = (__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _k))));Debug.locals.put("myc", _myc);Debug.locals.put("myc", _myc);
 BA.debugLineNum = 411;BA.debugLine="Dim alignment As String=myc.Alignment";
Debug.ShouldStop(67108864);
_alignment = _myc.getField(true,"Alignment" /*RemoteObject*/ );Debug.locals.put("alignment", _alignment);Debug.locals.put("alignment", _alignment);
 BA.debugLineNum = 413;BA.debugLine="If alignment.trim=\"\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_alignment.runMethod(true,"trim"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 414;BA.debugLine="Select Case myc.Controltype";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(_myc.getField(true,"Controltype" /*RemoteObject*/ ),BA.ObjectToString("TEXTFIELD"),BA.ObjectToString("TEXTAREA"),BA.ObjectToString("COMBO"),BA.ObjectToString("COMBO"),BA.ObjectToString("COMBOEDIT"),BA.ObjectToString("COMBOFIELD"),BA.ObjectToString("COMBOEDITFIELD"),BA.ObjectToString("PICTURE"),BA.ObjectToString("EDITCONTROLS"),BA.ObjectToString("DATE"))) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: 
case 7: {
 BA.debugLineNum = 417;BA.debugLine="If myc.Controltype=\"TEXTFIELD_NUMERIC\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_myc.getField(true,"Controltype" /*RemoteObject*/ ),BA.ObjectToString("TEXTFIELD_NUMERIC"))) { 
 BA.debugLineNum = 418;BA.debugLine="SetColumnAlignment(useB4XTable,myc.Name,\"LEF";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.magmagrid.class, "_setcolumnalignment" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_useb4xtable" /*RemoteObject*/ )),(Object)(_myc.getField(true,"Name" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("LEFT")));
 }else {
 BA.debugLineNum = 420;BA.debugLine="SetColumnAlignment(useB4XTable,myc.Name,\"RIG";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.magmagrid.class, "_setcolumnalignment" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_useb4xtable" /*RemoteObject*/ )),(Object)(_myc.getField(true,"Name" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("RIGHT")));
 };
 break; }
case 8: {
 BA.debugLineNum = 424;BA.debugLine="SetColumnAlignment(useB4XTable,myc.Name,\"CENT";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.magmagrid.class, "_setcolumnalignment" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_useb4xtable" /*RemoteObject*/ )),(Object)(_myc.getField(true,"Name" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("CENTER")));
 break; }
case 9: {
 BA.debugLineNum = 427;BA.debugLine="SetColumnAlignment(useB4XTable,myc.Name,\"CENT";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.magmagrid.class, "_setcolumnalignment" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_useb4xtable" /*RemoteObject*/ )),(Object)(_myc.getField(true,"Name" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("CENTER")));
 break; }
}
;
 }else {
 BA.debugLineNum = 430;BA.debugLine="SetColumnAlignment(useB4XTable,myc.Name,alignme";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.magmagrid.class, "_setcolumnalignment" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_useb4xtable" /*RemoteObject*/ )),(Object)(_myc.getField(true,"Name" /*RemoteObject*/ )),(Object)(_alignment));
 };
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 435;BA.debugLine="useB4XTable.Refresh";
Debug.ShouldStop(262144);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_refresh" /*RemoteObject*/ );
 BA.debugLineNum = 438;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xtable1_dataupdated(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XTable1_DataUpdated (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,441);
if (RapidSub.canDelegate("b4xtable1_dataupdated")) { return __ref.runUserSub(false, "magmagrid","b4xtable1_dataupdated", __ref);}
 BA.debugLineNum = 441;BA.debugLine="Private Sub B4XTable1_DataUpdated";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 443;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calcall(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CalcAll (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("calcall")) { return __ref.runUserSub(false, "magmagrid","calcall", __ref);}
RemoteObject _prevsel = RemoteObject.createImmutable(0L);
int _k = 0;
 BA.debugLineNum = 200;BA.debugLine="Public Sub CalcAll";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="Dim prevsel As Long=SelectedRow";
Debug.ShouldStop(256);
_prevsel = __ref.getField(true,"_selectedrow" /*RemoteObject*/ );Debug.locals.put("prevsel", _prevsel);Debug.locals.put("prevsel", _prevsel);
 BA.debugLineNum = 202;BA.debugLine="For k=1 To MyList.Size";
Debug.ShouldStop(512);
{
final int step2 = 1;
final int limit2 = __ref.getField(false,"_mylist" /*RemoteObject*/ ).runMethod(true,"getSize").<Integer>get().intValue();
_k = 1 ;
for (;(step2 > 0 && _k <= limit2) || (step2 < 0 && _k >= limit2) ;_k = ((int)(0 + _k + step2))  ) {
Debug.locals.put("k", _k);
 BA.debugLineNum = 203;BA.debugLine="SelectedRow=k";
Debug.ShouldStop(1024);
__ref.setField ("_selectedrow" /*RemoteObject*/ ,BA.numberCast(long.class, _k));
 BA.debugLineNum = 204;BA.debugLine="RowCalcPraxis";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.magmagrid.class, "_rowcalcpraxis" /*RemoteObject*/ );
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 206;BA.debugLine="SelectedRow=prevsel";
Debug.ShouldStop(8192);
__ref.setField ("_selectedrow" /*RemoteObject*/ ,_prevsel);
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private fx As JFX";
magmagrid._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",magmagrid._fx);
 //BA.debugLineNum = 16;BA.debugLine="Private xui As XUI";
magmagrid._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",magmagrid._xui);
 //BA.debugLineNum = 17;BA.debugLine="Public useB4XTable As B4XTable";
magmagrid._useb4xtable = RemoteObject.createNew ("b4j.example.b4xtable");__ref.setField("_useb4xtable",magmagrid._useb4xtable);
 //BA.debugLineNum = 19;BA.debugLine="Type mycol(Name As String, Hidden As Boolean, Loc";
;
 //BA.debugLineNum = 22;BA.debugLine="Public MyList As List";
magmagrid._mylist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_mylist",magmagrid._mylist);
 //BA.debugLineNum = 23;BA.debugLine="Public MyColumns As List";
magmagrid._mycolumns = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_mycolumns",magmagrid._mycolumns);
 //BA.debugLineNum = 24;BA.debugLine="Public HorizontalPraxisList As List";
magmagrid._horizontalpraxislist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_horizontalpraxislist",magmagrid._horizontalpraxislist);
 //BA.debugLineNum = 25;BA.debugLine="Private Lists As List";
magmagrid._lists = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lists",magmagrid._lists);
 //BA.debugLineNum = 27;BA.debugLine="Private ie As InlineEditing";
magmagrid._ie = RemoteObject.createNew ("b4j.example.inlineediting");__ref.setField("_ie",magmagrid._ie);
 //BA.debugLineNum = 28;BA.debugLine="Private thistable As B4XTableSelections";
magmagrid._thistable = RemoteObject.createNew ("b4j.example.b4xtableselections");__ref.setField("_thistable",magmagrid._thistable);
 //BA.debugLineNum = 30;BA.debugLine="Private TheIndexCol As Int = 0	'Where is the valu";
magmagrid._theindexcol = BA.numberCast(int.class, 0);__ref.setField("_theindexcol",magmagrid._theindexcol);
 //BA.debugLineNum = 31;BA.debugLine="Private ID As String";
magmagrid._id = RemoteObject.createImmutable("");__ref.setField("_id",magmagrid._id);
 //BA.debugLineNum = 33;BA.debugLine="Private DecimalSeparator As String = \".\"";
magmagrid._decimalseparator = BA.ObjectToString(".");__ref.setField("_decimalseparator",magmagrid._decimalseparator);
 //BA.debugLineNum = 35;BA.debugLine="Private PrevColumn As mycol";
magmagrid._prevcolumn = RemoteObject.createNew ("b4j.example.magmagrid._mycol");__ref.setField("_prevcolumn",magmagrid._prevcolumn);
 //BA.debugLineNum = 36;BA.debugLine="Public SelectedColumn As mycol";
magmagrid._selectedcolumn = RemoteObject.createNew ("b4j.example.magmagrid._mycol");__ref.setField("_selectedcolumn",magmagrid._selectedcolumn);
 //BA.debugLineNum = 37;BA.debugLine="Public SelectedRow As Long";
magmagrid._selectedrow = RemoteObject.createImmutable(0L);__ref.setField("_selectedrow",magmagrid._selectedrow);
 //BA.debugLineNum = 39;BA.debugLine="Private myroot As B4XView";
magmagrid._myroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_myroot",magmagrid._myroot);
 //BA.debugLineNum = 42;BA.debugLine="Private MyTextField As TextField";
magmagrid._mytextfield = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_mytextfield",magmagrid._mytextfield);
 //BA.debugLineNum = 43;BA.debugLine="Private MyNumField As TextField";
magmagrid._mynumfield = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_mynumfield",magmagrid._mynumfield);
 //BA.debugLineNum = 44;BA.debugLine="Private MyComboField As ComboBox";
magmagrid._mycombofield = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");__ref.setField("_mycombofield",magmagrid._mycombofield);
 //BA.debugLineNum = 45;BA.debugLine="Private MyPrevComboIndex As Int = -1";
magmagrid._myprevcomboindex = BA.numberCast(int.class, -(double) (0 + 1));__ref.setField("_myprevcomboindex",magmagrid._myprevcomboindex);
 //BA.debugLineNum = 46;BA.debugLine="Private noEdit As Boolean = False";
magmagrid._noedit = magmagrid.__c.getField(true,"False");__ref.setField("_noedit",magmagrid._noedit);
 //BA.debugLineNum = 48;BA.debugLine="Private xtra As B4XMagmaFuncs";
magmagrid._xtra = RemoteObject.createNew ("b4j.example.b4xmagmafuncs");__ref.setField("_xtra",magmagrid._xtra);
 //BA.debugLineNum = 52;BA.debugLine="Private guidelinePanel As B4XView           ' Tem";
magmagrid._guidelinepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_guidelinepanel",magmagrid._guidelinepanel);
 //BA.debugLineNum = 53;BA.debugLine="Private isResizing As Boolean = False       ' Tra";
magmagrid._isresizing = magmagrid.__c.getField(true,"False");__ref.setField("_isresizing",magmagrid._isresizing);
 //BA.debugLineNum = 54;BA.debugLine="Private removableGuidelines As List         ' Lis";
magmagrid._removableguidelines = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_removableguidelines",magmagrid._removableguidelines);
 //BA.debugLineNum = 55;BA.debugLine="Private resizeTimer As Timer                ' Tim";
magmagrid._resizetimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_resizetimer",magmagrid._resizetimer);
 //BA.debugLineNum = 56;BA.debugLine="Private previousColumnWidths() As Int       ' Col";
magmagrid._previouscolumnwidths = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setField("_previouscolumnwidths",magmagrid._previouscolumnwidths);
 //BA.debugLineNum = 57;BA.debugLine="Public allowColumnResize As Boolean=True";
magmagrid._allowcolumnresize = magmagrid.__c.getField(true,"True");__ref.setField("_allowcolumnresize",magmagrid._allowcolumnresize);
 //BA.debugLineNum = 58;BA.debugLine="Private cumulativeDelta As Int";
magmagrid._cumulativedelta = RemoteObject.createImmutable(0);__ref.setField("_cumulativedelta",magmagrid._cumulativedelta);
 //BA.debugLineNum = 59;BA.debugLine="Private startColumnWidth As Int";
magmagrid._startcolumnwidth = RemoteObject.createImmutable(0);__ref.setField("_startcolumnwidth",magmagrid._startcolumnwidth);
 //BA.debugLineNum = 60;BA.debugLine="Private currentColumn As B4XTableColumn";
magmagrid._currentcolumn = RemoteObject.createNew ("b4j.example.b4xtable._b4xtablecolumn");__ref.setField("_currentcolumn",magmagrid._currentcolumn);
 //BA.debugLineNum = 61;BA.debugLine="Private currentPanel As B4XView";
magmagrid._currentpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_currentpanel",magmagrid._currentpanel);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _deleterow(RemoteObject __ref,RemoteObject _rowid) throws Exception{
try {
		Debug.PushSubsStack("DeleteRow (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,1046);
if (RapidSub.canDelegate("deleterow")) { return __ref.runUserSub(false, "magmagrid","deleterow", __ref, _rowid);}
Debug.locals.put("rowid", _rowid);
 BA.debugLineNum = 1046;BA.debugLine="Public Sub DeleteRow(rowid As Long)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1048;BA.debugLine="useB4XTable.sql1.ExecnonQuery(\"DELETE FROM data W";
Debug.ShouldStop(8388608);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM data WHERE rowid="),_rowid,RemoteObject.createImmutable(";"))));
 BA.debugLineNum = 1049;BA.debugLine="useB4XTable.Refresh";
Debug.ShouldStop(16777216);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_refresh" /*RemoteObject*/ );
 BA.debugLineNum = 1051;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enableresizeguidelines(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EnableResizeGuidelines (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,1061);
if (RapidSub.canDelegate("enableresizeguidelines")) { return __ref.runUserSub(false, "magmagrid","enableresizeguidelines", __ref);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _clv = RemoteObject.declareNull("b4j.example.customlistview");
RemoteObject _scrollx = RemoteObject.createImmutable(0);
RemoteObject _basex = RemoteObject.createImmutable(0);
RemoteObject _colx = RemoteObject.createImmutable(0);
int _col = 0;
RemoteObject _tablecol = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
 BA.debugLineNum = 1061;BA.debugLine="Sub EnableResizeGuidelines";
Debug.ShouldStop(16);
 BA.debugLineNum = 1062;BA.debugLine="If isResizing = False Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isresizing" /*RemoteObject*/ ),magmagrid.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1063;BA.debugLine="resizeTimer.Enabled = False";
Debug.ShouldStop(64);
__ref.getField(false,"_resizetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",magmagrid.__c.getField(true,"False"));
 BA.debugLineNum = 1064;BA.debugLine="isResizing = True";
Debug.ShouldStop(128);
__ref.setField ("_isresizing" /*RemoteObject*/ ,magmagrid.__c.getField(true,"True"));
 BA.debugLineNum = 1066;BA.debugLine="If removableGuidelines.IsInitialized Then";
Debug.ShouldStop(512);
if (__ref.getField(false,"_removableguidelines" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1067;BA.debugLine="For Each pnl As B4XView In removableGuidelines";
Debug.ShouldStop(1024);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group5 = __ref.getField(false,"_removableguidelines" /*RemoteObject*/ );
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group5.runMethod(false,"Get",index5));Debug.locals.put("pnl", _pnl);
Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1068;BA.debugLine="pnl.RemoveViewFromParent";
Debug.ShouldStop(2048);
_pnl.runVoidMethod ("RemoveViewFromParent");
 }
}Debug.locals.put("pnl", _pnl);
;
 };
 BA.debugLineNum = 1072;BA.debugLine="Dim clv As CustomListView = useB4XTable.clvData";
Debug.ShouldStop(32768);
_clv = __ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_clvdata" /*RemoteObject*/ );Debug.locals.put("clv", _clv);Debug.locals.put("clv", _clv);
 BA.debugLineNum = 1073;BA.debugLine="Dim scrollX As Int = clv.sv.ScrollViewOffsetX";
Debug.ShouldStop(65536);
_scrollx = BA.numberCast(int.class, _clv.getField(false,"_sv").runMethod(true,"getScrollViewOffsetX"));Debug.locals.put("scrollX", _scrollx);Debug.locals.put("scrollX", _scrollx);
 BA.debugLineNum = 1074;BA.debugLine="Dim baseX As Int = useB4XTable.mBase.Left + clv.";
Debug.ShouldStop(131072);
_basex = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft"),_clv.runMethod(false,"_getbase").runMethod(true,"getLeft"),_scrollx,__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(true,"getLeft")}, "+-+",3, 0));Debug.locals.put("baseX", _basex);Debug.locals.put("baseX", _basex);
 BA.debugLineNum = 1076;BA.debugLine="removableGuidelines.Clear";
Debug.ShouldStop(524288);
__ref.getField(false,"_removableguidelines" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 1077;BA.debugLine="Dim colX As Int = baseX";
Debug.ShouldStop(1048576);
_colx = _basex;Debug.locals.put("colX", _colx);Debug.locals.put("colX", _colx);
 BA.debugLineNum = 1078;BA.debugLine="For col = 0 To useB4XTable.visibleColumns.Size -";
Debug.ShouldStop(2097152);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_visiblecolumns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = 0 ;
for (;(step14 > 0 && _col <= limit14) || (step14 < 0 && _col >= limit14) ;_col = ((int)(0 + _col + step14))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 1079;BA.debugLine="Dim tableCol As B4XTableColumn = useB4XTable.vi";
Debug.ShouldStop(4194304);
_tablecol = (__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_visiblecolumns" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _col))));Debug.locals.put("tableCol", _tablecol);Debug.locals.put("tableCol", _tablecol);
 BA.debugLineNum = 1080;BA.debugLine="colX = colX + tableCol.Width";
Debug.ShouldStop(8388608);
_colx = RemoteObject.solve(new RemoteObject[] {_colx,_tablecol.getField(true,"Width" /*RemoteObject*/ )}, "+",1, 1);Debug.locals.put("colX", _colx);
 BA.debugLineNum = 1082;BA.debugLine="Dim guidelinePanel As B4XView = xui.CreatePanel";
Debug.ShouldStop(33554432);
magmagrid._guidelinepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
magmagrid._guidelinepanel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("GuidelinePanel")));__ref.setField("_guidelinepanel",magmagrid._guidelinepanel);
 BA.debugLineNum = 1083;BA.debugLine="guidelinePanel.Tag = col";
Debug.ShouldStop(67108864);
__ref.getField(false,"_guidelinepanel" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable((_col)));
 BA.debugLineNum = 1084;BA.debugLine="guidelinePanel.SetColorAndBorder(xui.Color_Tran";
Debug.ShouldStop(134217728);
__ref.getField(false,"_guidelinepanel" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 2)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 1086;BA.debugLine="myroot.AddView(guidelinePanel, colX - 1, useB4";
Debug.ShouldStop(536870912);
__ref.getField(false,"_myroot" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_guidelinepanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_colx,RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop"),_clv.runMethod(false,"_getbase").runMethod(true,"getTop"),__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(true,"getTop"),RemoteObject.createImmutable(1)}, "+++",3, 0)),(Object)(BA.numberCast(double.class, 2)),(Object)(_clv.getField(false,"_sv").runMethod(true,"getScrollViewContentHeight")));
 BA.debugLineNum = 1088;BA.debugLine="removableGuidelines.Add(guidelinePanel)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_removableguidelines" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.getField(false,"_guidelinepanel" /*RemoteObject*/ ).getObject())));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 1091;BA.debugLine="isResizing = False";
Debug.ShouldStop(4);
__ref.setField ("_isresizing" /*RemoteObject*/ ,magmagrid.__c.getField(true,"False"));
 BA.debugLineNum = 1092;BA.debugLine="resizeTimer.Enabled = True";
Debug.ShouldStop(8);
__ref.getField(false,"_resizetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",magmagrid.__c.getField(true,"True"));
 };
 BA.debugLineNum = 1094;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _firstcolforedit(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FirstColforEdit (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,987);
if (RapidSub.canDelegate("firstcolforedit")) { return __ref.runUserSub(false, "magmagrid","firstcolforedit", __ref);}
RemoteObject _foredit = RemoteObject.createImmutable("");
int _k = 0;
RemoteObject _myc = RemoteObject.declareNull("b4j.example.magmagrid._mycol");
 BA.debugLineNum = 987;BA.debugLine="Private Sub FirstColforEdit As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 988;BA.debugLine="Dim foredit As String";
Debug.ShouldStop(134217728);
_foredit = RemoteObject.createImmutable("");Debug.locals.put("foredit", _foredit);
 BA.debugLineNum = 989;BA.debugLine="For k=0 To MyColumns.Size-1";
Debug.ShouldStop(268435456);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_k = 0 ;
for (;(step2 > 0 && _k <= limit2) || (step2 < 0 && _k >= limit2) ;_k = ((int)(0 + _k + step2))  ) {
Debug.locals.put("k", _k);
 BA.debugLineNum = 990;BA.debugLine="Dim myc As mycol=MyColumns.Get(k)";
Debug.ShouldStop(536870912);
_myc = (__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _k))));Debug.locals.put("myc", _myc);Debug.locals.put("myc", _myc);
 BA.debugLineNum = 991;BA.debugLine="foredit=myc.name";
Debug.ShouldStop(1073741824);
_foredit = _myc.getField(true,"Name" /*RemoteObject*/ );Debug.locals.put("foredit", _foredit);
 BA.debugLineNum = 992;BA.debugLine="If myc.Locked=False And myc.Hidden=False Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_myc.getField(true,"Locked" /*RemoteObject*/ ),magmagrid.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_myc.getField(true,"Hidden" /*RemoteObject*/ ),magmagrid.__c.getField(true,"False"))) { 
 BA.debugLineNum = 993;BA.debugLine="Return foredit";
Debug.ShouldStop(1);
if (true) return _foredit;
 };
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 996;BA.debugLine="Return foredit";
Debug.ShouldStop(8);
if (true) return _foredit;
 BA.debugLineNum = 997;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdata(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetData (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,1022);
if (RapidSub.canDelegate("getdata")) { return __ref.runUserSub(false, "magmagrid","getdata", __ref);}
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _colcount = RemoteObject.createImmutable(0);
RemoteObject _rowarray = null;
int _i = 0;
 BA.debugLineNum = 1022;BA.debugLine="public Sub GetData As List";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1024;BA.debugLine="Dim list1 As List";
Debug.ShouldStop(-2147483648);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("list1", _list1);
 BA.debugLineNum = 1025;BA.debugLine="list1.Initialize";
Debug.ShouldStop(1);
_list1.runVoidMethod ("Initialize");
 BA.debugLineNum = 1027;BA.debugLine="Dim rs As ResultSet = useB4XTable.SQL1.ExecQuery(";
Debug.ShouldStop(4);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM data")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1029;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(16);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1030;BA.debugLine="Dim colCount As Int = rs.ColumnCount";
Debug.ShouldStop(32);
_colcount = _rs.runMethod(true,"getColumnCount");Debug.locals.put("colCount", _colcount);Debug.locals.put("colCount", _colcount);
 BA.debugLineNum = 1031;BA.debugLine="Dim rowArray(colCount) As Object";
Debug.ShouldStop(64);
_rowarray = RemoteObject.createNewArray ("Object", new int[] {_colcount.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("rowArray", _rowarray);
 BA.debugLineNum = 1033;BA.debugLine="For i = 0 To colCount - 1";
Debug.ShouldStop(256);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_colcount,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1034;BA.debugLine="rowArray(i) = rs.GetString2(i)";
Debug.ShouldStop(512);
_rowarray.setArrayElement ((_rs.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i)))),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1037;BA.debugLine="list1.Add(rowArray)";
Debug.ShouldStop(4096);
_list1.runVoidMethod ("Add",(Object)((_rowarray)));
 }
;
 BA.debugLineNum = 1040;BA.debugLine="rs.Close";
Debug.ShouldStop(32768);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 1042;BA.debugLine="Return list1";
Debug.ShouldStop(131072);
if (true) return _list1;
 BA.debugLineNum = 1044;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalue(RemoteObject __ref,RemoteObject _rowid,RemoteObject _columnid) throws Exception{
try {
		Debug.PushSubsStack("GetValue (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("getvalue")) { return __ref.runUserSub(false, "magmagrid","getvalue", __ref, _rowid, _columnid);}
RemoteObject _mapvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _k = 0;
RemoteObject _myc = RemoteObject.declareNull("b4j.example.magmagrid._mycol");
RemoteObject _value = RemoteObject.createImmutable("");
Debug.locals.put("rowid", _rowid);
Debug.locals.put("columnid", _columnid);
 BA.debugLineNum = 125;BA.debugLine="public Sub GetValue(rowid As Long, columnid As Str";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="Private MapValues As Map = useB4XTable.GetRow(row";
Debug.ShouldStop(536870912);
_mapvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapvalues = __ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_getrow" /*RemoteObject*/ ,(Object)(_rowid));Debug.locals.put("MapValues", _mapvalues);Debug.locals.put("MapValues", _mapvalues);
 BA.debugLineNum = 127;BA.debugLine="For k=0 To MyColumns.Size-1";
Debug.ShouldStop(1073741824);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_k = 0 ;
for (;(step2 > 0 && _k <= limit2) || (step2 < 0 && _k >= limit2) ;_k = ((int)(0 + _k + step2))  ) {
Debug.locals.put("k", _k);
 BA.debugLineNum = 128;BA.debugLine="Dim myc As mycol=MyColumns.Get(k)";
Debug.ShouldStop(-2147483648);
_myc = (__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _k))));Debug.locals.put("myc", _myc);Debug.locals.put("myc", _myc);
 BA.debugLineNum = 129;BA.debugLine="If myc.Name=columnid Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_myc.getField(true,"Name" /*RemoteObject*/ ),_columnid)) { 
 BA.debugLineNum = 130;BA.debugLine="Dim value As String = MapValues.Getvalueat(k)";
Debug.ShouldStop(2);
_value = BA.ObjectToString(_mapvalues.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _k))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 131;BA.debugLine="Exit";
Debug.ShouldStop(4);
if (true) break;
 };
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 134;BA.debugLine="Return value";
Debug.ShouldStop(32);
if (true) return _value;
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalues(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetValues (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("getvalues")) { return __ref.runUserSub(false, "magmagrid","getvalues", __ref);}
RemoteObject _mapvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 116;BA.debugLine="Public Sub GetValues As Map";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="If SelectedRow>0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_selectedrow" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
 BA.debugLineNum = 118;BA.debugLine="Log(SelectedRow)";
Debug.ShouldStop(2097152);
magmagrid.__c.runVoidMethod ("LogImpl","048300034",BA.NumberToString(__ref.getField(true,"_selectedrow" /*RemoteObject*/ )),0);
 BA.debugLineNum = 119;BA.debugLine="Private MapValues As Map = useB4XTable.GetRow(Sel";
Debug.ShouldStop(4194304);
_mapvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapvalues = __ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_getrow" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selectedrow" /*RemoteObject*/ )));Debug.locals.put("MapValues", _mapvalues);Debug.locals.put("MapValues", _mapvalues);
 BA.debugLineNum = 120;BA.debugLine="Return MapValues";
Debug.ShouldStop(8388608);
if (true) return _mapvalues;
 };
 BA.debugLineNum = 122;BA.debugLine="Return Null";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), magmagrid.__c.getField(false,"Null"));
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _goatrowandclick(RemoteObject __ref,RemoteObject _rowindex) throws Exception{
try {
		Debug.PushSubsStack("GoAtRowAndClick (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,384);
if (RapidSub.canDelegate("goatrowandclick")) { return __ref.runUserSub(false, "magmagrid","goatrowandclick", __ref, _rowindex);}
ResumableSub_GoAtRowAndClick rsub = new ResumableSub_GoAtRowAndClick(null,__ref,_rowindex);
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
public static class ResumableSub_GoAtRowAndClick extends BA.ResumableSub {
public ResumableSub_GoAtRowAndClick(b4j.example.magmagrid parent,RemoteObject __ref,RemoteObject _rowindex) {
this.parent = parent;
this.__ref = __ref;
this._rowindex = _rowindex;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.magmagrid parent;
RemoteObject _rowindex;
RemoteObject _pagenum = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GoAtRowAndClick (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,384);
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
Debug.locals.put("rowindex", _rowindex);
 BA.debugLineNum = 386;BA.debugLine="If rowindex > 0 Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean(">",_rowindex,BA.numberCast(long.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 387;BA.debugLine="ie.ExitEditMode";
Debug.ShouldStop(4);
__ref.getField(false,"_ie" /*RemoteObject*/ ).runClassMethod (b4j.example.inlineediting.class, "_exiteditmode" /*RemoteObject*/ );
 BA.debugLineNum = 389;BA.debugLine="Dim pageNum As Int = Ceil(rowindex  / useB4XTabl";
Debug.ShouldStop(16);
_pagenum = BA.numberCast(int.class, parent.__c.runMethod(true,"Ceil",(Object)(RemoteObject.solve(new RemoteObject[] {_rowindex,__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(true,"getSize")}, "/",0, 0))));Debug.locals.put("pageNum", _pagenum);Debug.locals.put("pageNum", _pagenum);
 BA.debugLineNum = 390;BA.debugLine="useB4XTable.CurrentPage = pageNum";
Debug.ShouldStop(32);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_setcurrentpage" /*RemoteObject*/ ,_pagenum);
 BA.debugLineNum = 391;BA.debugLine="Sleep(0)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "magmagrid", "goatrowandclick"),BA.numberCast(int.class, 0));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
 BA.debugLineNum = 392;BA.debugLine="useB4XTable.UpdateTableCounters";
Debug.ShouldStop(128);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_updatetablecounters" /*RemoteObject*/ );
 BA.debugLineNum = 393;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
Debug.ShouldStop(256);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_clvdata" /*RemoteObject*/ ).getField(false,"_sv").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 394;BA.debugLine="Sleep(0)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "magmagrid", "goatrowandclick"),BA.numberCast(int.class, 0));
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
 BA.debugLineNum = 395;BA.debugLine="useB4XTable_CellClicked(FirstColforEdit,rowindex";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.magmagrid.class, "_useb4xtable_cellclicked" /*void*/ ,(Object)(__ref.runClassMethod (b4j.example.magmagrid.class, "_firstcolforedit" /*RemoteObject*/ )),(Object)(_rowindex));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 398;BA.debugLine="Return True";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 400;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
public static RemoteObject  _guidelinepanel_mousedragged(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("GuidelinePanel_MouseDragged (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,1179);
if (RapidSub.canDelegate("guidelinepanel_mousedragged")) { return __ref.runUserSub(false, "magmagrid","guidelinepanel_mousedragged", __ref, _eventdata);}
RemoteObject _tableleft = RemoteObject.createImmutable(0);
RemoteObject _visibleright = RemoteObject.createImmutable(0);
RemoteObject _tentativeleft = RemoteObject.createImmutable(0);
RemoteObject _newsize = RemoteObject.createImmutable(0);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1179;BA.debugLine="Private Sub GuidelinePanel_MouseDragged (EventData";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1180;BA.debugLine="If isResizing Then";
Debug.ShouldStop(134217728);
if (__ref.getField(true,"_isresizing" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1182;BA.debugLine="If currentPanel.IsInitialized Then";
Debug.ShouldStop(536870912);
if (__ref.getField(false,"_currentpanel" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1184;BA.debugLine="cumulativeDelta = cumulativeDelta + EventData.X";
Debug.ShouldStop(-2147483648);
__ref.setField ("_cumulativedelta" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cumulativedelta" /*RemoteObject*/ ),_eventdata.runMethod(true,"getX")}, "+",1, 0)));
 BA.debugLineNum = 1187;BA.debugLine="Dim tableLeft As Int = useB4XTable.mBase.Left";
Debug.ShouldStop(4);
_tableleft = BA.numberCast(int.class, __ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft"));Debug.locals.put("tableLeft", _tableleft);Debug.locals.put("tableLeft", _tableleft);
 BA.debugLineNum = 1188;BA.debugLine="tableLeft = tableLeft + useB4XTable.mBase.Parent";
Debug.ShouldStop(8);
_tableleft = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_tableleft,__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(true,"getLeft")}, "+",1, 0));Debug.locals.put("tableLeft", _tableleft);
 BA.debugLineNum = 1189;BA.debugLine="tableLeft = tableLeft + useB4XTable.clvData.GetB";
Debug.ShouldStop(16);
_tableleft = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_tableleft,__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_clvdata" /*RemoteObject*/ ).runMethod(false,"_getbase").runMethod(true,"getLeft")}, "+",1, 0));Debug.locals.put("tableLeft", _tableleft);
 BA.debugLineNum = 1192;BA.debugLine="Dim visibleRight As Int = tableLeft + useB4XTabl";
Debug.ShouldStop(128);
_visibleright = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_tableleft,__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_clvdata" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getWidth")}, "+",1, 0));Debug.locals.put("visibleRight", _visibleright);Debug.locals.put("visibleRight", _visibleright);
 BA.debugLineNum = 1195;BA.debugLine="Dim tentativeLeft As Int = currentPanel.Left + E";
Debug.ShouldStop(1024);
_tentativeleft = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_currentpanel" /*RemoteObject*/ ).runMethod(true,"getLeft"),_eventdata.runMethod(true,"getX")}, "+",1, 0));Debug.locals.put("tentativeLeft", _tentativeleft);Debug.locals.put("tentativeLeft", _tentativeleft);
 BA.debugLineNum = 1198;BA.debugLine="If tentativeLeft < tableLeft Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("<",_tentativeleft,BA.numberCast(double.class, _tableleft))) { 
 BA.debugLineNum = 1199;BA.debugLine="cumulativeDelta = cumulativeDelta - (tableLeft";
Debug.ShouldStop(16384);
__ref.setField ("_cumulativedelta" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cumulativedelta" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {_tableleft,__ref.getField(false,"_currentpanel" /*RemoteObject*/ ).runMethod(true,"getLeft")}, "-",1, 0))}, "-",1, 0)));
 BA.debugLineNum = 1200;BA.debugLine="tentativeLeft = tableLeft";
Debug.ShouldStop(32768);
_tentativeleft = _tableleft;Debug.locals.put("tentativeLeft", _tentativeleft);
 };
 BA.debugLineNum = 1203;BA.debugLine="If tentativeLeft > visibleRight Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_tentativeleft,BA.numberCast(double.class, _visibleright))) { 
 BA.debugLineNum = 1204;BA.debugLine="cumulativeDelta = cumulativeDelta - (tentativeL";
Debug.ShouldStop(524288);
__ref.setField ("_cumulativedelta" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cumulativedelta" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {_tentativeleft,_visibleright}, "-",1, 1))}, "-",1, 1));
 BA.debugLineNum = 1205;BA.debugLine="tentativeLeft = visibleRight";
Debug.ShouldStop(1048576);
_tentativeleft = _visibleright;Debug.locals.put("tentativeLeft", _tentativeleft);
 };
 BA.debugLineNum = 1209;BA.debugLine="currentPanel.Left = tentativeLeft";
Debug.ShouldStop(16777216);
__ref.getField(false,"_currentpanel" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(double.class, _tentativeleft));
 BA.debugLineNum = 1212;BA.debugLine="Dim newSize As Int = startColumnWidth + cumulati";
Debug.ShouldStop(134217728);
_newsize = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_startcolumnwidth" /*RemoteObject*/ ),__ref.getField(true,"_cumulativedelta" /*RemoteObject*/ )}, "+",1, 1);Debug.locals.put("newSize", _newsize);Debug.locals.put("newSize", _newsize);
 BA.debugLineNum = 1213;BA.debugLine="If newSize < 20 Then newSize = 20";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("<",_newsize,BA.numberCast(double.class, 20))) { 
_newsize = BA.numberCast(int.class, 20);Debug.locals.put("newSize", _newsize);};
 BA.debugLineNum = 1214;BA.debugLine="currentColumn.Width = newSize";
Debug.ShouldStop(536870912);
__ref.getField(false,"_currentcolumn" /*RemoteObject*/ ).setField ("Width" /*RemoteObject*/ ,_newsize);
 };
 };
 BA.debugLineNum = 1222;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _guidelinepanel_mouseentered(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("GuidelinePanel_MouseEntered (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,1096);
if (RapidSub.canDelegate("guidelinepanel_mouseentered")) { return __ref.runUserSub(false, "magmagrid","guidelinepanel_mouseentered", __ref, _eventdata);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _tableleft = RemoteObject.createImmutable(0);
RemoteObject _visibleright = RemoteObject.createImmutable(0);
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jopnl = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1096;BA.debugLine="Private Sub GuidelinePanel_MouseEntered (EventData";
Debug.ShouldStop(128);
 BA.debugLineNum = 1098;BA.debugLine="If noEdit Then Return";
Debug.ShouldStop(512);
if (__ref.getField(true,"_noedit" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1100;BA.debugLine="Dim pnl As B4XView = Sender";
Debug.ShouldStop(2048);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), magmagrid.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1102;BA.debugLine="If pnl.IsInitialized Then";
Debug.ShouldStop(8192);
if (_pnl.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1105;BA.debugLine="Dim tableLeft As Int = useB4XTable.mBase.Left + u";
Debug.ShouldStop(65536);
_tableleft = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft"),__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_clvdata" /*RemoteObject*/ ).runMethod(false,"_getbase").runMethod(true,"getLeft"),__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(true,"getLeft")}, "++",2, 0));Debug.locals.put("tableLeft", _tableleft);Debug.locals.put("tableLeft", _tableleft);
 BA.debugLineNum = 1106;BA.debugLine="Dim visibleRight As Int = tableLeft + useB4XTable";
Debug.ShouldStop(131072);
_visibleright = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_tableleft,__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_clvdata" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getWidth")}, "+",1, 0));Debug.locals.put("visibleRight", _visibleright);Debug.locals.put("visibleRight", _visibleright);
 BA.debugLineNum = 1109;BA.debugLine="If pnl.Left >= tableLeft And pnl.Left <= visibleR";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("g",_pnl.runMethod(true,"getLeft"),BA.numberCast(double.class, _tableleft)) && RemoteObject.solveBoolean("k",_pnl.runMethod(true,"getLeft"),BA.numberCast(double.class, _visibleright))) { 
 BA.debugLineNum = 1110;BA.debugLine="pnl.SetColorAndBorder(xui.Color_Transparent, 2,";
Debug.ShouldStop(2097152);
_pnl.runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 2)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Green")),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 1112;BA.debugLine="Dim cursor As JavaObject";
Debug.ShouldStop(8388608);
_cursor = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 1113;BA.debugLine="cursor.InitializeStatic(\"javafx.scene.Cursor\")";
Debug.ShouldStop(16777216);
_cursor.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("javafx.scene.Cursor")));
 BA.debugLineNum = 1114;BA.debugLine="Dim joPnl As JavaObject = pnl";
Debug.ShouldStop(33554432);
_jopnl = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jopnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _pnl.getObject());Debug.locals.put("joPnl", _jopnl);Debug.locals.put("joPnl", _jopnl);
 BA.debugLineNum = 1115;BA.debugLine="joPnl.RunMethod(\"setCursor\", Array(cursor.GetFie";
Debug.ShouldStop(67108864);
_jopnl.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setCursor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_cursor.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("E_RESIZE")))})));
 };
 };
 BA.debugLineNum = 1119;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _guidelinepanel_mouseexited(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("GuidelinePanel_MouseExited (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,1121);
if (RapidSub.canDelegate("guidelinepanel_mouseexited")) { return __ref.runUserSub(false, "magmagrid","guidelinepanel_mouseexited", __ref, _eventdata);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jopnl = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1121;BA.debugLine="Private Sub GuidelinePanel_MouseExited (EventData";
Debug.ShouldStop(1);
 BA.debugLineNum = 1123;BA.debugLine="Dim pnl As B4XView = Sender";
Debug.ShouldStop(4);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), magmagrid.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1124;BA.debugLine="If pnl.IsInitialized Then";
Debug.ShouldStop(8);
if (_pnl.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1126;BA.debugLine="pnl.SetColorAndBorder(xui.Color_Transparent, 2, x";
Debug.ShouldStop(32);
_pnl.runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 2)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 1128;BA.debugLine="Dim cursor As JavaObject";
Debug.ShouldStop(128);
_cursor = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 1129;BA.debugLine="cursor.InitializeStatic(\"javafx.scene.Cursor\")";
Debug.ShouldStop(256);
_cursor.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("javafx.scene.Cursor")));
 BA.debugLineNum = 1130;BA.debugLine="Dim joPnl As JavaObject = pnl";
Debug.ShouldStop(512);
_jopnl = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jopnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _pnl.getObject());Debug.locals.put("joPnl", _jopnl);Debug.locals.put("joPnl", _jopnl);
 BA.debugLineNum = 1131;BA.debugLine="joPnl.RunMethod(\"setCursor\", Array(cursor.GetFiel";
Debug.ShouldStop(1024);
_jopnl.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setCursor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_cursor.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("DEFAULT")))})));
 };
 BA.debugLineNum = 1133;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _guidelinepanel_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("GuidelinePanel_MousePressed (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,1135);
if (RapidSub.canDelegate("guidelinepanel_mousepressed")) { __ref.runUserSub(false, "magmagrid","guidelinepanel_mousepressed", __ref, _eventdata); return;}
ResumableSub_GuidelinePanel_MousePressed rsub = new ResumableSub_GuidelinePanel_MousePressed(null,__ref,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GuidelinePanel_MousePressed extends BA.ResumableSub {
public ResumableSub_GuidelinePanel_MousePressed(b4j.example.magmagrid parent,RemoteObject __ref,RemoteObject _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.magmagrid parent;
RemoteObject _eventdata;
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _colindex = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
RemoteObject _restoredwidth = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GuidelinePanel_MousePressed (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,1135);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1136;BA.debugLine="If noEdit Then Return";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 6;
if (__ref.getField(true,"_noedit" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 1139;BA.debugLine="If EventData.ClickCount = 2 Then";
Debug.ShouldStop(262144);
if (true) break;

case 7:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_eventdata.runMethod(true,"getClickCount"),BA.numberCast(double.class, 2))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1140;BA.debugLine="Dim panel As B4XView = Sender";
Debug.ShouldStop(524288);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 1141;BA.debugLine="If panel.IsInitialized Then";
Debug.ShouldStop(1048576);
if (true) break;

case 10:
//if
this.state = 23;
if (_panel.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1142;BA.debugLine="Dim colIndex As Int = panel.Tag";
Debug.ShouldStop(2097152);
_colindex = BA.numberCast(int.class, _panel.runMethod(false,"getTag"));Debug.locals.put("colIndex", _colindex);Debug.locals.put("colIndex", _colindex);
 BA.debugLineNum = 1143;BA.debugLine="Dim col As B4XTableColumn = useB4XTable.visible";
Debug.ShouldStop(4194304);
_col = (__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_visiblecolumns" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_colindex)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 1147;BA.debugLine="If col.Width > 1 Then";
Debug.ShouldStop(67108864);
if (true) break;

case 13:
//if
this.state = 22;
if (RemoteObject.solveBoolean(">",_col.getField(true,"Width" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 22;
 BA.debugLineNum = 1149;BA.debugLine="previousColumnWidths(colIndex) = col.Width";
Debug.ShouldStop(268435456);
__ref.getField(false,"_previouscolumnwidths" /*RemoteObject*/ ).setArrayElement (_col.getField(true,"Width" /*RemoteObject*/ ),_colindex);
 BA.debugLineNum = 1150;BA.debugLine="col.Width = 1";
Debug.ShouldStop(536870912);
_col.setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1153;BA.debugLine="Dim restoredWidth As Int = previousColumnWidth";
Debug.ShouldStop(1);
_restoredwidth = __ref.getField(false,"_previouscolumnwidths" /*RemoteObject*/ ).getArrayElement(true,_colindex);Debug.locals.put("restoredWidth", _restoredwidth);Debug.locals.put("restoredWidth", _restoredwidth);
 BA.debugLineNum = 1154;BA.debugLine="If restoredWidth <= 1 Then";
Debug.ShouldStop(2);
if (true) break;

case 18:
//if
this.state = 21;
if (RemoteObject.solveBoolean("k",_restoredwidth,BA.numberCast(double.class, 1))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 1155;BA.debugLine="restoredWidth = 100dip";
Debug.ShouldStop(4);
_restoredwidth = parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)));Debug.locals.put("restoredWidth", _restoredwidth);
 if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 1157;BA.debugLine="col.Width = restoredWidth";
Debug.ShouldStop(16);
_col.setField ("Width" /*RemoteObject*/ ,_restoredwidth);
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 1160;BA.debugLine="useB4XTable.Refresh";
Debug.ShouldStop(128);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_refresh" /*RemoteObject*/ );
 BA.debugLineNum = 1161;BA.debugLine="Sleep(0)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "magmagrid", "guidelinepanel_mousepressed"),BA.numberCast(int.class, 0));
this.state = 29;
return;
case 29:
//C
this.state = 23;
;
 BA.debugLineNum = 1162;BA.debugLine="EnableResizeGuidelines";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.magmagrid.class, "_enableresizeguidelines" /*RemoteObject*/ );
 BA.debugLineNum = 1163;BA.debugLine="resizeTimer.Enabled = True";
Debug.ShouldStop(1024);
__ref.getField(false,"_resizetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 if (true) break;

case 23:
//C
this.state = 24;
;
 BA.debugLineNum = 1165;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return ;
 if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 1168;BA.debugLine="currentPanel = Sender";
Debug.ShouldStop(32768);
__ref.getField(false,"_currentpanel" /*RemoteObject*/ ).setObject (parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 1169;BA.debugLine="If currentPanel.IsInitialized Then";
Debug.ShouldStop(65536);
if (true) break;

case 25:
//if
this.state = 28;
if (__ref.getField(false,"_currentpanel" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 1170;BA.debugLine="currentColumn = useB4XTable.visibleColumns.Get(cu";
Debug.ShouldStop(131072);
__ref.setField ("_currentcolumn" /*RemoteObject*/ ,(__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_visiblecolumns" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, __ref.getField(false,"_currentpanel" /*RemoteObject*/ ).runMethod(false,"getTag"))))));
 BA.debugLineNum = 1171;BA.debugLine="startColumnWidth = currentColumn.Width";
Debug.ShouldStop(262144);
__ref.setField ("_startcolumnwidth" /*RemoteObject*/ ,__ref.getField(false,"_currentcolumn" /*RemoteObject*/ ).getField(true,"Width" /*RemoteObject*/ ));
 BA.debugLineNum = 1172;BA.debugLine="cumulativeDelta = 0";
Debug.ShouldStop(524288);
__ref.setField ("_cumulativedelta" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1173;BA.debugLine="isResizing = True";
Debug.ShouldStop(1048576);
__ref.setField ("_isresizing" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1174;BA.debugLine="resizeTimer.Enabled = False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_resizetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1175;BA.debugLine="currentPanel.SetColorAndBorder(xui.Color_Transpar";
Debug.ShouldStop(4194304);
__ref.getField(false,"_currentpanel" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 2)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Green")),(Object)(BA.numberCast(double.class, 0)));
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 1177;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _guidelinepanel_mousereleased(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("GuidelinePanel_MouseReleased (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,1224);
if (RapidSub.canDelegate("guidelinepanel_mousereleased")) { return __ref.runUserSub(false, "magmagrid","guidelinepanel_mousereleased", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1224;BA.debugLine="Private Sub GuidelinePanel_MouseReleased (EventDat";
Debug.ShouldStop(128);
 BA.debugLineNum = 1225;BA.debugLine="If isResizing Then";
Debug.ShouldStop(256);
if (__ref.getField(true,"_isresizing" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1226;BA.debugLine="isResizing = False";
Debug.ShouldStop(512);
__ref.setField ("_isresizing" /*RemoteObject*/ ,magmagrid.__c.getField(true,"False"));
 BA.debugLineNum = 1230;BA.debugLine="currentPanel.SetColorAndBorder(xui.Color_Transpa";
Debug.ShouldStop(8192);
__ref.getField(false,"_currentpanel" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 2)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 1234;BA.debugLine="useB4XTable.Refresh 'Refresh here is safer than";
Debug.ShouldStop(131072);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_refresh" /*RemoteObject*/ );
 BA.debugLineNum = 1236;BA.debugLine="EnableResizeGuidelines";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.magmagrid.class, "_enableresizeguidelines" /*RemoteObject*/ );
 BA.debugLineNum = 1237;BA.debugLine="resizeTimer.Enabled = True";
Debug.ShouldStop(1048576);
__ref.getField(false,"_resizetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",magmagrid.__c.getField(true,"True"));
 };
 BA.debugLineNum = 1239;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ie_entereditmode(RemoteObject __ref,RemoteObject _fc) throws Exception{
try {
		Debug.PushSubsStack("IE_EnterEditMode (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,464);
if (RapidSub.canDelegate("ie_entereditmode")) { return __ref.runUserSub(false, "magmagrid","ie_entereditmode", __ref, _fc);}
int _k = 0;
RemoteObject _map1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _afield = RemoteObject.createImmutable("");
Debug.locals.put("FC", _fc);
 BA.debugLineNum = 464;BA.debugLine="Private Sub IE_EnterEditMode (FC As FocusedCell)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 467;BA.debugLine="If SelectedColumn.Controltype.Trim.ToUpperCase.";
Debug.ShouldStop(262144);
if (__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Controltype" /*RemoteObject*/ ).runMethod(true,"trim").runMethod(true,"toUpperCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("NUMERIC"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 468;BA.debugLine="MyNumField.Text=FC.PrevValue";
Debug.ShouldStop(524288);
__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_fc.getField(false,"PrevValue" /*RemoteObject*/ )));
 BA.debugLineNum = 469;BA.debugLine="FC.View=MyNumField";
Debug.ShouldStop(1048576);
_fc.getField(false,"View" /*RemoteObject*/ ).setObject (__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).getObject());
 }else {
 BA.debugLineNum = 472;BA.debugLine="Select Case SelectedColumn.Controltype";
Debug.ShouldStop(8388608);
switch (BA.switchObjectToInt(__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Controltype" /*RemoteObject*/ ),BA.ObjectToString("TEXTFIELD"),BA.ObjectToString("TEXTAREA"),BA.ObjectToString("COMBO"),BA.ObjectToString("COMBOFIELD"),BA.ObjectToString("COMBOEDIT"),BA.ObjectToString("COMBOEDITFIELD"),BA.ObjectToString("DATE"))) {
case 0: 
case 1: {
 BA.debugLineNum = 476;BA.debugLine="MyTextField.Text=FC.PrevValue";
Debug.ShouldStop(134217728);
__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_fc.getField(false,"PrevValue" /*RemoteObject*/ )));
 BA.debugLineNum = 477;BA.debugLine="FC.View=MyTextField";
Debug.ShouldStop(268435456);
_fc.getField(false,"View" /*RemoteObject*/ ).setObject (__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).getObject());
 break; }
case 2: 
case 3: 
case 4: 
case 5: {
 BA.debugLineNum = 479;BA.debugLine="If SelectedColumn.Controltype.Contains(\"EDI";
Debug.ShouldStop(1073741824);
if (__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Controltype" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("EDIT"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 480;BA.debugLine="MyComboField.Editable=True";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mycombofield" /*RemoteObject*/ ).runMethod(true,"setEditable",magmagrid.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 482;BA.debugLine="MyComboField.Editable=False";
Debug.ShouldStop(2);
__ref.getField(false,"_mycombofield" /*RemoteObject*/ ).runMethod(true,"setEditable",magmagrid.__c.getField(true,"False"));
 };
 BA.debugLineNum = 484;BA.debugLine="noEdit=True";
Debug.ShouldStop(8);
__ref.setField ("_noedit" /*RemoteObject*/ ,magmagrid.__c.getField(true,"True"));
 BA.debugLineNum = 485;BA.debugLine="MyComboField.Items.Clear";
Debug.ShouldStop(16);
__ref.getField(false,"_mycombofield" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("Clear");
 BA.debugLineNum = 486;BA.debugLine="For k=0 To SelectedColumn.UseList.Size-1";
Debug.ShouldStop(32);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(false,"UseList" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_k = 0 ;
for (;(step17 > 0 && _k <= limit17) || (step17 < 0 && _k >= limit17) ;_k = ((int)(0 + _k + step17))  ) {
Debug.locals.put("k", _k);
 BA.debugLineNum = 487;BA.debugLine="Private map1 As Map=SelectedColumn.UseList";
Debug.ShouldStop(64);
_map1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(false,"UseList" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _k))));Debug.locals.put("map1", _map1);Debug.locals.put("map1", _map1);
 BA.debugLineNum = 488;BA.debugLine="MyComboField.Items.Add(map1.Get(SelectedCo";
Debug.ShouldStop(128);
__ref.getField(false,"_mycombofield" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("Add",(Object)(_map1.runMethod(false,"Get",(Object)((__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Name" /*RemoteObject*/ ))))));
 BA.debugLineNum = 489;BA.debugLine="If FC.PrevValue=map1.Get(SelectedColumn.Na";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_fc.getField(false,"PrevValue" /*RemoteObject*/ ),_map1.runMethod(false,"Get",(Object)((__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Name" /*RemoteObject*/ )))))) { 
 BA.debugLineNum = 490;BA.debugLine="MyComboField.SelectedIndex=k";
Debug.ShouldStop(512);
__ref.getField(false,"_mycombofield" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",BA.numberCast(int.class, _k));
 BA.debugLineNum = 491;BA.debugLine="MyPrevComboIndex=k";
Debug.ShouldStop(1024);
__ref.setField ("_myprevcomboindex" /*RemoteObject*/ ,BA.numberCast(int.class, _k));
 BA.debugLineNum = 492;BA.debugLine="For Each afield As String In map1.Keys";
Debug.ShouldStop(2048);
{
final RemoteObject group23 = _map1.runMethod(false,"Keys");
final int groupLen23 = group23.runMethod(true,"getSize").<Integer>get()
;int index23 = 0;
;
for (; index23 < groupLen23;index23++){
_afield = BA.ObjectToString(group23.runMethod(false,"Get",index23));Debug.locals.put("afield", _afield);
Debug.locals.put("afield", _afield);
 BA.debugLineNum = 493;BA.debugLine="SetValue(SelectedRow,afield,map1.Get(afi";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.example.magmagrid.class, "_setvalue" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selectedrow" /*RemoteObject*/ )),(Object)(_afield),(Object)(_map1.runMethod(false,"Get",(Object)((_afield)))));
 }
}Debug.locals.put("afield", _afield);
;
 };
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 498;BA.debugLine="If MyComboField.Editable=True And k=Selecte";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mycombofield" /*RemoteObject*/ ).runMethod(true,"getEditable"),magmagrid.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_k),BA.numberCast(double.class, __ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(false,"UseList" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
 BA.debugLineNum = 499;BA.debugLine="MyComboField.Value=FC.PrevValue";
Debug.ShouldStop(262144);
__ref.getField(false,"_mycombofield" /*RemoteObject*/ ).runMethod(false,"setValue",_fc.getField(false,"PrevValue" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 501;BA.debugLine="MyComboField.SelectedIndex=MyPrevComboInde";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mycombofield" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",__ref.getField(true,"_myprevcomboindex" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 504;BA.debugLine="FC.View=MyComboField";
Debug.ShouldStop(8388608);
_fc.getField(false,"View" /*RemoteObject*/ ).setObject (__ref.getField(false,"_mycombofield" /*RemoteObject*/ ).getObject());
 break; }
case 6: {
 BA.debugLineNum = 507;BA.debugLine="MyTextField.Text=DateTime.Date(FC.PrevValue";
Debug.ShouldStop(67108864);
__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runMethod(true,"setText",magmagrid.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _fc.getField(false,"PrevValue" /*RemoteObject*/ )))));
 BA.debugLineNum = 508;BA.debugLine="FC.View=MyTextField";
Debug.ShouldStop(134217728);
_fc.getField(false,"View" /*RemoteObject*/ ).setObject (__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).getObject());
 break; }
}
;
 };
 BA.debugLineNum = 514;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ie_getupdatedvalue(RemoteObject __ref,RemoteObject _fc) throws Exception{
try {
		Debug.PushSubsStack("IE_GetUpdatedValue (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,516);
if (RapidSub.canDelegate("ie_getupdatedvalue")) { return __ref.runUserSub(false, "magmagrid","ie_getupdatedvalue", __ref, _fc);}
RemoteObject _map1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _afield = RemoteObject.createImmutable("");
Debug.locals.put("FC", _fc);
 BA.debugLineNum = 516;BA.debugLine="Private Sub IE_GetUpdatedValue (FC As FocusedCell)";
Debug.ShouldStop(8);
 BA.debugLineNum = 518;BA.debugLine="If SelectedColumn.Controltype.Trim.ToUpperCase.Co";
Debug.ShouldStop(32);
if (__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Controltype" /*RemoteObject*/ ).runMethod(true,"trim").runMethod(true,"toUpperCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("NUMERIC"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 519;BA.debugLine="RowCalcPraxis";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.magmagrid.class, "_rowcalcpraxis" /*RemoteObject*/ );
 BA.debugLineNum = 520;BA.debugLine="If SelectedColumn.MaxValue>0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"MaxValue" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 521;BA.debugLine="If MyNumField.Text.As(Double)>SelectedColumn.Ma";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",(BA.numberCast(double.class, __ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"getText"))),__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"MaxValue" /*RemoteObject*/ ))) { 
__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"MaxValue" /*RemoteObject*/ )));};
 };
 BA.debugLineNum = 523;BA.debugLine="If SelectedColumn.MinValue>0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"MinValue" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 524;BA.debugLine="If MyNumField.Text.As(Double)<SelectedColumn.Mi";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("<",(BA.numberCast(double.class, __ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"getText"))),__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"MinValue" /*RemoteObject*/ ))) { 
__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"MinValue" /*RemoteObject*/ )));};
 };
 BA.debugLineNum = 526;BA.debugLine="If MyNumField.Text.Trim.Length=0 Then MyNumField";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Defaultvalue" /*RemoteObject*/ ));};
 BA.debugLineNum = 527;BA.debugLine="Return MyNumField.Text";
Debug.ShouldStop(16384);
if (true) return (__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"getText"));
 }else {
 BA.debugLineNum = 531;BA.debugLine="Select Case SelectedColumn.Controltype";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Controltype" /*RemoteObject*/ ),BA.ObjectToString("TEXTFIELD"),BA.ObjectToString("TEXTAREA"),BA.ObjectToString("COMBO"),BA.ObjectToString("COMBOFIELD"),BA.ObjectToString("COMBOEDIT"),BA.ObjectToString("COMBOEDITFIELD"),BA.ObjectToString("DATE"))) {
case 0: 
case 1: {
 BA.debugLineNum = 533;BA.debugLine="If MyTextField.Text.Trim.Length=0 Then MyTextF";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Defaultvalue" /*RemoteObject*/ ));};
 BA.debugLineNum = 534;BA.debugLine="Return MyTextField.Text";
Debug.ShouldStop(2097152);
if (true) return (__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runMethod(true,"getText"));
 break; }
case 2: 
case 3: 
case 4: 
case 5: {
 BA.debugLineNum = 539;BA.debugLine="If MyComboField.SelectedIndex>-1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_mycombofield" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 540;BA.debugLine="Private map1 As Map=SelectedColumn.UseList.G";
Debug.ShouldStop(134217728);
_map1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(false,"UseList" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(false,"_mycombofield" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"))));Debug.locals.put("map1", _map1);Debug.locals.put("map1", _map1);
 BA.debugLineNum = 542;BA.debugLine="For Each afield As String In map1.Keys";
Debug.ShouldStop(536870912);
{
final RemoteObject group19 = _map1.runMethod(false,"Keys");
final int groupLen19 = group19.runMethod(true,"getSize").<Integer>get()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_afield = BA.ObjectToString(group19.runMethod(false,"Get",index19));Debug.locals.put("afield", _afield);
Debug.locals.put("afield", _afield);
 BA.debugLineNum = 543;BA.debugLine="SetValue(SelectedRow,afield,map1.Get(afield";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.magmagrid.class, "_setvalue" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selectedrow" /*RemoteObject*/ )),(Object)(_afield),(Object)(_map1.runMethod(false,"Get",(Object)((_afield)))));
 }
}Debug.locals.put("afield", _afield);
;
 BA.debugLineNum = 546;BA.debugLine="Return map1.Get(SelectedColumn.Name)";
Debug.ShouldStop(2);
if (true) return _map1.runMethod(false,"Get",(Object)((__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Name" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 548;BA.debugLine="If MyComboField.Editable=True Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mycombofield" /*RemoteObject*/ ).runMethod(true,"getEditable"),magmagrid.__c.getField(true,"True"))) { 
 BA.debugLineNum = 549;BA.debugLine="Return MyComboField.Value";
Debug.ShouldStop(16);
if (true) return __ref.getField(false,"_mycombofield" /*RemoteObject*/ ).runMethod(false,"getValue");
 }else {
 BA.debugLineNum = 552;BA.debugLine="If SelectedColumn.Defaultvalue.Trim.Length>0";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Defaultvalue" /*RemoteObject*/ ).runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 553;BA.debugLine="Return SelectedColumn.Defaultvalue";
Debug.ShouldStop(256);
if (true) return (__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Defaultvalue" /*RemoteObject*/ ));
 };
 };
 };
 break; }
case 6: {
 BA.debugLineNum = 562;BA.debugLine="If xtra.IsValidDate(MyTextField.Text)=False Th";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_xtra" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmagmafuncs.class, "_isvaliddate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runMethod(true,"getText"))),magmagrid.__c.getField(true,"False"))) { 
 BA.debugLineNum = 563;BA.debugLine="If SelectedColumn.Defaultvalue>0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Defaultvalue" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 564;BA.debugLine="MyTextField.Text=DateTime.Date(SelectedColum";
Debug.ShouldStop(524288);
__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runMethod(true,"setText",magmagrid.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, __ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Defaultvalue" /*RemoteObject*/ )))));
 }else {
 BA.debugLineNum = 566;BA.debugLine="MyTextField.Text=DateTime.Date(DateTime.Now)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runMethod(true,"setText",magmagrid.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(magmagrid.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 };
 };
 BA.debugLineNum = 569;BA.debugLine="If SelectedColumn.MaxValue>0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"MaxValue" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 570;BA.debugLine="If DateTime.DateParse(MyTextField.Text)>Selec";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",magmagrid.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runMethod(true,"getText"))),BA.numberCast(long.class, __ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"MaxValue" /*RemoteObject*/ )))) { 
__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runMethod(true,"setText",magmagrid.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, __ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"MaxValue" /*RemoteObject*/ )))));};
 };
 BA.debugLineNum = 572;BA.debugLine="If SelectedColumn.MinValue>0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"MinValue" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 573;BA.debugLine="If DateTime.DateParse(MyTextField.Text)<Selec";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("<",magmagrid.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runMethod(true,"getText"))),BA.numberCast(long.class, __ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"MinValue" /*RemoteObject*/ )))) { 
__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runMethod(true,"setText",magmagrid.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, __ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"MinValue" /*RemoteObject*/ )))));};
 };
 BA.debugLineNum = 575;BA.debugLine="Return DateTime.DateParse(MyTextField.Text)";
Debug.ShouldStop(1073741824);
if (true) return (magmagrid.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runMethod(true,"getText"))));
 break; }
}
;
 };
 BA.debugLineNum = 580;BA.debugLine="Return Null";
Debug.ShouldStop(8);
if (true) return magmagrid.__c.getField(false,"Null");
 BA.debugLineNum = 581;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("Initialize (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "magmagrid","initialize", __ref, _ba, _parent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ba", _ba);
Debug.locals.put("parent", _parent);
 BA.debugLineNum = 68;BA.debugLine="Public Sub Initialize(parent As B4XView)";
Debug.ShouldStop(8);
 BA.debugLineNum = 71;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
Debug.ShouldStop(64);
magmagrid.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 74;BA.debugLine="parent.LoadLayout(\"magmagrid\")";
Debug.ShouldStop(512);
_parent.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("magmagrid")),__ref.getField(false, "ba"));
 BA.debugLineNum = 76;BA.debugLine="xtra.Initialize";
Debug.ShouldStop(2048);
__ref.getField(false,"_xtra" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmagmafuncs.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 77;BA.debugLine="MyList.Initialize";
Debug.ShouldStop(4096);
__ref.getField(false,"_mylist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 78;BA.debugLine="MyColumns.Initialize";
Debug.ShouldStop(8192);
__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 79;BA.debugLine="HorizontalPraxisList.Initialize";
Debug.ShouldStop(16384);
__ref.getField(false,"_horizontalpraxislist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 80;BA.debugLine="SelectedColumn.Initialize";
Debug.ShouldStop(32768);
__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 81;BA.debugLine="PrevColumn.Initialize";
Debug.ShouldStop(65536);
__ref.getField(false,"_prevcolumn" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 82;BA.debugLine="Lists.Initialize";
Debug.ShouldStop(131072);
__ref.getField(false,"_lists" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 85;BA.debugLine="ie.Initialize(useB4XTable, Me, \"ie\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_ie" /*RemoteObject*/ ).runClassMethod (b4j.example.inlineediting.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_useb4xtable" /*RemoteObject*/ )),(Object)(__ref),(Object)(RemoteObject.createImmutable("ie")));
 BA.debugLineNum = 86;BA.debugLine="thistable.Initialize(useB4XTable)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_thistable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtableselections.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_useb4xtable" /*RemoteObject*/ )));
 BA.debugLineNum = 87;BA.debugLine="thistable.Mode = thistable.MODE_SINGLE_LINE_PERMA";
Debug.ShouldStop(4194304);
__ref.getField(false,"_thistable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtableselections.class, "_setmode" /*RemoteObject*/ ,__ref.getField(false,"_thistable" /*RemoteObject*/ ).getField(true,"_mode_single_line_permanent" /*RemoteObject*/ ));
 BA.debugLineNum = 88;BA.debugLine="thistable.SelectedTextColor = xui.Color_White";
Debug.ShouldStop(8388608);
__ref.getField(false,"_thistable" /*RemoteObject*/ ).setField ("_selectedtextcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 89;BA.debugLine="thistable.SelectionColor = xui.Color_ARGB(255, 0,";
Debug.ShouldStop(16777216);
__ref.getField(false,"_thistable" /*RemoteObject*/ ).setField ("_selectioncolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 148)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 90;BA.debugLine="thistable.AutoRemoveInvisibleSelections = True";
Debug.ShouldStop(33554432);
__ref.getField(false,"_thistable" /*RemoteObject*/ ).setField ("_autoremoveinvisibleselections" /*RemoteObject*/ ,magmagrid.__c.getField(true,"True"));
 BA.debugLineNum = 92;BA.debugLine="myroot=parent.Parent";
Debug.ShouldStop(134217728);
__ref.setField ("_myroot" /*RemoteObject*/ ,_parent.runMethod(false,"getParent"));
 BA.debugLineNum = 93;BA.debugLine="MyTextField.Initialize(\"myTextField\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("myTextField")));
 BA.debugLineNum = 94;BA.debugLine="MyNumField.Initialize(\"MyNumField\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MyNumField")));
 BA.debugLineNum = 95;BA.debugLine="MyComboField.Initialize(\"MyComboField\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mycombofield" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MyComboField")));
 BA.debugLineNum = 96;BA.debugLine="myroot.AddView(MyTextField,0,0,100,10)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_myroot" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 100)),(Object)(BA.numberCast(double.class, 10)));
 BA.debugLineNum = 97;BA.debugLine="myroot.AddView(MyNumField,0,0,100,10)";
Debug.ShouldStop(1);
__ref.getField(false,"_myroot" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 100)),(Object)(BA.numberCast(double.class, 10)));
 BA.debugLineNum = 98;BA.debugLine="myroot.AddView(MyComboField,0,0,100,10)";
Debug.ShouldStop(2);
__ref.getField(false,"_myroot" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mycombofield" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 100)),(Object)(BA.numberCast(double.class, 10)));
 BA.debugLineNum = 99;BA.debugLine="MyComboField.RemoveNodeFromParent";
Debug.ShouldStop(4);
__ref.getField(false,"_mycombofield" /*RemoteObject*/ ).runVoidMethod ("RemoveNodeFromParent");
 BA.debugLineNum = 100;BA.debugLine="MyTextField.RemoveNodeFromParent";
Debug.ShouldStop(8);
__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runVoidMethod ("RemoveNodeFromParent");
 BA.debugLineNum = 101;BA.debugLine="MyNumField.RemoveNodeFromParent";
Debug.ShouldStop(16);
__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runVoidMethod ("RemoveNodeFromParent");
 BA.debugLineNum = 103;BA.debugLine="useB4XTable.RowHeight=50dip";
Debug.ShouldStop(64);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).setField ("_rowheight" /*RemoteObject*/ ,magmagrid.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 105;BA.debugLine="ie.TableResized";
Debug.ShouldStop(256);
__ref.getField(false,"_ie" /*RemoteObject*/ ).runClassMethod (b4j.example.inlineediting.class, "_tableresized" /*RemoteObject*/ );
 BA.debugLineNum = 107;BA.debugLine="AddKeyPressedListener";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.magmagrid.class, "_addkeypressedlistener" /*RemoteObject*/ );
 BA.debugLineNum = 110;BA.debugLine="Dim jo As JavaObject = Me";
Debug.ShouldStop(8192);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref);Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 111;BA.debugLine="jo.RunMethod(\"RemoveWarning\", Null)";
Debug.ShouldStop(16384);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("RemoveWarning")),(Object)((magmagrid.__c.getField(false,"Null"))));
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _istablefocused(RemoteObject __ref,RemoteObject _table) throws Exception{
try {
		Debug.PushSubsStack("IsTableFocused (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,822);
if (RapidSub.canDelegate("istablefocused")) { return __ref.runUserSub(false, "magmagrid","istablefocused", __ref, _table);}
RemoteObject _focusednode = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Table", _table);
 BA.debugLineNum = 822;BA.debugLine="Private Sub IsTableFocused (Table As B4XTable) As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 824;BA.debugLine="Dim FocusedNode As B4XView = Main.scene.RunMethod";
Debug.ShouldStop(8388608);
_focusednode = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_focusednode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), magmagrid._main._scene /*RemoteObject*/ .runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("focusOwnerProperty")),(Object)((magmagrid.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("get")),(Object)((magmagrid.__c.getField(false,"Null")))));Debug.locals.put("FocusedNode", _focusednode);Debug.locals.put("FocusedNode", _focusednode);
 BA.debugLineNum = 826;BA.debugLine="Do While FocusedNode.IsInitialized";
Debug.ShouldStop(33554432);
while (_focusednode.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 827;BA.debugLine="If FocusedNode = Table.clvData.AsView Then Retur";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_focusednode,_table.getField(false,"_clvdata" /*RemoteObject*/ ).runMethod(false,"_asview"))) { 
if (true) return magmagrid.__c.getField(true,"True");};
 BA.debugLineNum = 828;BA.debugLine="FocusedNode = FocusedNode.Parent";
Debug.ShouldStop(134217728);
_focusednode = _focusednode.runMethod(false,"getParent");Debug.locals.put("FocusedNode", _focusednode);
 }
;
 BA.debugLineNum = 830;BA.debugLine="Return False";
Debug.ShouldStop(536870912);
if (true) return magmagrid.__c.getField(true,"False");
 BA.debugLineNum = 831;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _keypressed_filter(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("KeyPressed_Filter (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,842);
if (RapidSub.canDelegate("keypressed_filter")) { __ref.runUserSub(false, "magmagrid","keypressed_filter", __ref, _e); return;}
ResumableSub_KeyPressed_Filter rsub = new ResumableSub_KeyPressed_Filter(null,__ref,_e);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_KeyPressed_Filter extends BA.ResumableSub {
public ResumableSub_KeyPressed_Filter(b4j.example.magmagrid parent,RemoteObject __ref,RemoteObject _e) {
this.parent = parent;
this.__ref = __ref;
this._e = _e;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.magmagrid parent;
RemoteObject _e;
RemoteObject _table = RemoteObject.declareNull("b4j.example.b4xtable");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _eventtype = RemoteObject.createImmutable("");
RemoteObject _keycode = RemoteObject.createImmutable("");
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _row = RemoteObject.createImmutable(0L);
RemoteObject _rowsize = RemoteObject.createImmutable(0);
int _i = 0;
int _k = 0;
RemoteObject _myc = RemoteObject.declareNull("b4j.example.magmagrid._mycol");
RemoteObject _tmp = RemoteObject.createImmutable("");
int step14;
int limit14;
int step31;
int limit31;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("KeyPressed_Filter (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,842);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("e", _e);
 BA.debugLineNum = 843;BA.debugLine="Dim table As B4XTable = useB4XTable";
Debug.ShouldStop(1024);
_table = __ref.getField(false,"_useb4xtable" /*RemoteObject*/ );Debug.locals.put("table", _table);Debug.locals.put("table", _table);
 BA.debugLineNum = 844;BA.debugLine="If noEdit=False And IsTableFocused(table) And tab";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 69;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_noedit" /*RemoteObject*/ ),parent.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",__ref.runClassMethod (b4j.example.magmagrid.class, "_istablefocused" /*RemoteObject*/ ,(Object)(_table))) && RemoteObject.solveBoolean(">",BA.numberCast(double.class, _table.getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 846;BA.debugLine="Dim jo As JavaObject = e";
Debug.ShouldStop(8192);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _e.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 847;BA.debugLine="Dim EventType As String = jo.RunMethodJO(\"getEve";
Debug.ShouldStop(16384);
_eventtype = BA.ObjectToString(_jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getEventType")),(Object)((parent.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getName")),(Object)((parent.__c.getField(false,"Null")))));Debug.locals.put("EventType", _eventtype);Debug.locals.put("EventType", _eventtype);
 BA.debugLineNum = 851;BA.debugLine="If EventType = \"KEY_PRESSED\" Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 68;
if (RemoteObject.solveBoolean("=",_eventtype,BA.ObjectToString("KEY_PRESSED"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 853;BA.debugLine="Dim keycode As String = jo.RunMethod(\"getCode\",";
Debug.ShouldStop(1048576);
_keycode = BA.ObjectToString(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getCode")),(Object)((parent.__c.getField(false,"Null")))));Debug.locals.put("keycode", _keycode);Debug.locals.put("keycode", _keycode);
 BA.debugLineNum = 854;BA.debugLine="Dim col As String = 1'thistable.FirstSelectedCo";
Debug.ShouldStop(2097152);
_col = BA.NumberToString(1);Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 855;BA.debugLine="Dim row As Long = thistable.FirstSelectedRowId";
Debug.ShouldStop(4194304);
_row = __ref.getField(false,"_thistable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtableselections.class, "_firstselectedrowid" /*RemoteObject*/ );Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 858;BA.debugLine="Dim RowSize As Int = table.VisibleRowIds.Size";
Debug.ShouldStop(33554432);
_rowsize = _table.getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(true,"getSize");Debug.locals.put("RowSize", _rowsize);Debug.locals.put("RowSize", _rowsize);
 BA.debugLineNum = 859;BA.debugLine="Select keycode";
Debug.ShouldStop(67108864);
if (true) break;

case 7:
//select
this.state = 62;
switch (BA.switchObjectToInt(_keycode,BA.ObjectToString("UP"),BA.ObjectToString("DOWN"),BA.ObjectToString("PAGE_UP"),BA.ObjectToString("PAGE_DOWN"),BA.ObjectToString("SPACE"),BA.ObjectToString("DELETE"),BA.ObjectToString("ENTER"))) {
case 0: {
this.state = 9;
if (true) break;
}
case 1: {
this.state = 25;
if (true) break;
}
case 2: {
this.state = 33;
if (true) break;
}
case 3: {
this.state = 35;
if (true) break;
}
case 4: {
this.state = 37;
if (true) break;
}
case 5: {
this.state = 53;
if (true) break;
}
case 6: {
this.state = 55;
if (true) break;
}
default: {
this.state = 61;
if (true) break;
}
}
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 867;BA.debugLine="row = table.VisibleRowIds.Get((table.VisibleR";
Debug.ShouldStop(4);
_row = BA.numberCast(long.class, _table.getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_table.getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_row))),RemoteObject.createImmutable(1),_rowsize}, "-+",2, 1)),_rowsize}, "%",0, 1))));Debug.locals.put("row", _row);
 BA.debugLineNum = 868;BA.debugLine="If row = 0 Then";
Debug.ShouldStop(8);
if (true) break;

case 10:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_row,BA.numberCast(long.class, 0))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 869;BA.debugLine="For i = table.VisibleRowIds.Size - 1 To 0 St";
Debug.ShouldStop(16);
if (true) break;

case 13:
//for
this.state = 22;
step14 = -1;
limit14 = 0;
_i = RemoteObject.solve(new RemoteObject[] {_table.getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
Debug.locals.put("i", _i);
this.state = 99;
if (true) break;

case 99:
//C
this.state = 22;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 15;
if (true) break;

case 100:
//C
this.state = 99;
_i = ((int)(0 + _i + step14)) ;
Debug.locals.put("i", _i);
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 870;BA.debugLine="row = table.VisibleRowIds.Get(i)";
Debug.ShouldStop(32);
_row = BA.numberCast(long.class, _table.getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("row", _row);
 BA.debugLineNum = 871;BA.debugLine="If row <> 0 Then Exit";
Debug.ShouldStop(64);
if (true) break;

case 16:
//if
this.state = 21;
if (RemoteObject.solveBoolean("!",_row,BA.numberCast(long.class, 0))) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
this.state = 22;
if (true) break;
if (true) break;

case 21:
//C
this.state = 100;
;
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
Debug.locals.put("i", _i);
;
 if (true) break;

case 23:
//C
this.state = 62;
;
 BA.debugLineNum = 874;BA.debugLine="SelectedRow=row";
Debug.ShouldStop(512);
__ref.setField ("_selectedrow" /*RemoteObject*/ ,_row);
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 876;BA.debugLine="row = table.VisibleRowIds.Get((table.VisibleR";
Debug.ShouldStop(2048);
_row = BA.numberCast(long.class, _table.getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_table.getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_row))),RemoteObject.createImmutable(1),_rowsize}, "++",2, 1)),_rowsize}, "%",0, 1))));Debug.locals.put("row", _row);
 BA.debugLineNum = 877;BA.debugLine="If row = 0 Then row = table.VisibleRowIds.Get";
Debug.ShouldStop(4096);
if (true) break;

case 26:
//if
this.state = 31;
if (RemoteObject.solveBoolean("=",_row,BA.numberCast(long.class, 0))) { 
this.state = 28;
;}if (true) break;

case 28:
//C
this.state = 31;
_row = BA.numberCast(long.class, _table.getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("row", _row);
if (true) break;

case 31:
//C
this.state = 62;
;
 BA.debugLineNum = 878;BA.debugLine="SelectedRow=row";
Debug.ShouldStop(8192);
__ref.setField ("_selectedrow" /*RemoteObject*/ ,_row);
 if (true) break;

case 33:
//C
this.state = 62;
 BA.debugLineNum = 880;BA.debugLine="row=1";
Debug.ShouldStop(32768);
_row = BA.numberCast(long.class, 1);Debug.locals.put("row", _row);
 BA.debugLineNum = 881;BA.debugLine="table.CurrentPage=table.CurrentPage-1";
Debug.ShouldStop(65536);
_table.runClassMethod (b4j.example.b4xtable.class, "_setcurrentpage" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_table.runClassMethod (b4j.example.b4xtable.class, "_getcurrentpage" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 if (true) break;

case 35:
//C
this.state = 62;
 BA.debugLineNum = 883;BA.debugLine="row=1";
Debug.ShouldStop(262144);
_row = BA.numberCast(long.class, 1);Debug.locals.put("row", _row);
 BA.debugLineNum = 884;BA.debugLine="table.CurrentPage=table.CurrentPage+1";
Debug.ShouldStop(524288);
_table.runClassMethod (b4j.example.b4xtable.class, "_setcurrentpage" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_table.runClassMethod (b4j.example.b4xtable.class, "_getcurrentpage" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 886;BA.debugLine="For k=0 To MyColumns.Size-1";
Debug.ShouldStop(2097152);
if (true) break;

case 38:
//for
this.state = 51;
step31 = 1;
limit31 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_k = 0 ;
Debug.locals.put("k", _k);
this.state = 101;
if (true) break;

case 101:
//C
this.state = 51;
if ((step31 > 0 && _k <= limit31) || (step31 < 0 && _k >= limit31)) this.state = 40;
if (true) break;

case 102:
//C
this.state = 101;
_k = ((int)(0 + _k + step31)) ;
Debug.locals.put("k", _k);
if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 887;BA.debugLine="Dim myc As mycol=MyColumns.Get(k)";
Debug.ShouldStop(4194304);
_myc = (__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _k))));Debug.locals.put("myc", _myc);Debug.locals.put("myc", _myc);
 BA.debugLineNum = 888;BA.debugLine="If myc.Controltype.Contains(\"CHECK\") Then";
Debug.ShouldStop(8388608);
if (true) break;

case 41:
//if
this.state = 50;
if (_myc.getField(true,"Controltype" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("CHECK"))).<Boolean>get().booleanValue()) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 890;BA.debugLine="If GetValue(SelectedRow,myc.Name)=Chr(9746)";
Debug.ShouldStop(33554432);
if (true) break;

case 44:
//if
this.state = 49;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.magmagrid.class, "_getvalue" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selectedrow" /*RemoteObject*/ )),(Object)(_myc.getField(true,"Name" /*RemoteObject*/ ))),BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 9746)))))) { 
this.state = 46;
}else {
this.state = 48;
}if (true) break;

case 46:
//C
this.state = 49;
 BA.debugLineNum = 891;BA.debugLine="SetValue(SelectedRow,myc.Name,Chr(9744))";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.magmagrid.class, "_setvalue" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selectedrow" /*RemoteObject*/ )),(Object)(_myc.getField(true,"Name" /*RemoteObject*/ )),(Object)((parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 9744))))));
 if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 893;BA.debugLine="SetValue(SelectedRow,myc.Name,Chr(9746))";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.magmagrid.class, "_setvalue" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selectedrow" /*RemoteObject*/ )),(Object)(_myc.getField(true,"Name" /*RemoteObject*/ )),(Object)((parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 9746))))));
 if (true) break;

case 49:
//C
this.state = 50;
;
 if (true) break;

case 50:
//C
this.state = 102;
;
 if (true) break;
if (true) break;

case 51:
//C
this.state = 62;
Debug.locals.put("k", _k);
;
 if (true) break;

case 53:
//C
this.state = 62;
 BA.debugLineNum = 898;BA.debugLine="SelectedRow=row";
Debug.ShouldStop(2);
__ref.setField ("_selectedrow" /*RemoteObject*/ ,_row);
 BA.debugLineNum = 899;BA.debugLine="DeleteRow(SelectedRow)";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.magmagrid.class, "_deleterow" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selectedrow" /*RemoteObject*/ )));
 BA.debugLineNum = 900;BA.debugLine="row = table.VisibleRowIds.Get(0)";
Debug.ShouldStop(8);
_row = BA.numberCast(long.class, _table.getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("row", _row);
 BA.debugLineNum = 901;BA.debugLine="SelectedRow=row";
Debug.ShouldStop(16);
__ref.setField ("_selectedrow" /*RemoteObject*/ ,_row);
 if (true) break;

case 55:
//C
this.state = 56;
 BA.debugLineNum = 903;BA.debugLine="If noEdit=False Then";
Debug.ShouldStop(64);
if (true) break;

case 56:
//if
this.state = 59;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_noedit" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 58;
}if (true) break;

case 58:
//C
this.state = 59;
 BA.debugLineNum = 904;BA.debugLine="SelectedRow=row";
Debug.ShouldStop(128);
__ref.setField ("_selectedrow" /*RemoteObject*/ ,_row);
 BA.debugLineNum = 905;BA.debugLine="Dim myc As mycol=MyColumns.Get(0)";
Debug.ShouldStop(256);
_myc = (__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("myc", _myc);Debug.locals.put("myc", _myc);
 BA.debugLineNum = 906;BA.debugLine="SelColumn(myc.Name)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.magmagrid.class, "_selcolumn" /*RemoteObject*/ ,(Object)(_myc.getField(true,"Name" /*RemoteObject*/ )));
 BA.debugLineNum = 907;BA.debugLine="NextEditableColumn";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.magmagrid.class, "_nexteditablecolumn" /*void*/ );
 BA.debugLineNum = 908;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return ;
 if (true) break;

case 59:
//C
this.state = 62;
;
 if (true) break;

case 61:
//C
this.state = 62;
 if (true) break;
;
 BA.debugLineNum = 914;BA.debugLine="If row<1 Then row=1";
Debug.ShouldStop(131072);

case 62:
//if
this.state = 67;
if (RemoteObject.solveBoolean("<",_row,BA.numberCast(long.class, 1))) { 
this.state = 64;
;}if (true) break;

case 64:
//C
this.state = 67;
_row = BA.numberCast(long.class, 1);Debug.locals.put("row", _row);
if (true) break;

case 67:
//C
this.state = 68;
;
 BA.debugLineNum = 916;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
Debug.ShouldStop(524288);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_clvdata" /*RemoteObject*/ ).getField(false,"_sv").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 917;BA.debugLine="Sleep(0)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "magmagrid", "keypressed_filter"),BA.numberCast(int.class, 0));
this.state = 103;
return;
case 103:
//C
this.state = 68;
;
 BA.debugLineNum = 918;BA.debugLine="thistable.CellClicked(col, row)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_thistable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtableselections.class, "_cellclicked" /*RemoteObject*/ ,(Object)(_col),(Object)(_row));
 if (true) break;

case 68:
//C
this.state = 69;
;
 if (true) break;
;
 BA.debugLineNum = 924;BA.debugLine="If noEdit=True Then";
Debug.ShouldStop(134217728);

case 69:
//if
this.state = 98;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_noedit" /*RemoteObject*/ ),parent.__c.getField(true,"True"))) { 
this.state = 71;
}if (true) break;

case 71:
//C
this.state = 72;
 BA.debugLineNum = 925;BA.debugLine="Dim jo As JavaObject = e";
Debug.ShouldStop(268435456);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _e.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 926;BA.debugLine="Dim EventType As String = jo.RunMethodJO(\"getEve";
Debug.ShouldStop(536870912);
_eventtype = BA.ObjectToString(_jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getEventType")),(Object)((parent.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getName")),(Object)((parent.__c.getField(false,"Null")))));Debug.locals.put("EventType", _eventtype);Debug.locals.put("EventType", _eventtype);
 BA.debugLineNum = 927;BA.debugLine="If EventType = \"KEY_PRESSED\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 72:
//if
this.state = 97;
if (RemoteObject.solveBoolean("=",_eventtype,BA.ObjectToString("KEY_PRESSED"))) { 
this.state = 74;
}if (true) break;

case 74:
//C
this.state = 75;
 BA.debugLineNum = 928;BA.debugLine="Dim keycode As String = jo.RunMethod(\"getCode\",";
Debug.ShouldStop(-2147483648);
_keycode = BA.ObjectToString(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getCode")),(Object)((parent.__c.getField(false,"Null")))));Debug.locals.put("keycode", _keycode);Debug.locals.put("keycode", _keycode);
 BA.debugLineNum = 929;BA.debugLine="If keycode = \"ESCAPE\" Then";
Debug.ShouldStop(1);
if (true) break;

case 75:
//if
this.state = 78;
if (RemoteObject.solveBoolean("=",_keycode,BA.ObjectToString("ESCAPE"))) { 
this.state = 77;
}if (true) break;

case 77:
//C
this.state = 78;
 BA.debugLineNum = 930;BA.debugLine="ie.ExitEditMode";
Debug.ShouldStop(2);
__ref.getField(false,"_ie" /*RemoteObject*/ ).runClassMethod (b4j.example.inlineediting.class, "_exiteditmode" /*RemoteObject*/ );
 BA.debugLineNum = 931;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
Debug.ShouldStop(4);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_clvdata" /*RemoteObject*/ ).getField(false,"_sv").runVoidMethod ("RequestFocus");
 if (true) break;
;
 BA.debugLineNum = 933;BA.debugLine="If keycode=\"TAB\" And xtra.IsComboBoxFocused(MyC";
Debug.ShouldStop(16);

case 78:
//if
this.state = 87;
if (RemoteObject.solveBoolean("=",_keycode,BA.ObjectToString("TAB")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_xtra" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmagmafuncs.class, "_iscomboboxfocused" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mycombofield" /*RemoteObject*/ ))),parent.__c.getField(true,"False"))) { 
this.state = 80;
}if (true) break;

case 80:
//C
this.state = 81;
 BA.debugLineNum = 934;BA.debugLine="If SelectedColumn.Controltype.Contains(\"NUMERI";
Debug.ShouldStop(32);
if (true) break;

case 81:
//if
this.state = 86;
if (__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Controltype" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("NUMERIC"))).<Boolean>get().booleanValue()) { 
this.state = 83;
}else {
this.state = 85;
}if (true) break;

case 83:
//C
this.state = 86;
 BA.debugLineNum = 935;BA.debugLine="mynumfield_Action";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.magmagrid.class, "_mynumfield_action" /*RemoteObject*/ );
 if (true) break;

case 85:
//C
this.state = 86;
 BA.debugLineNum = 937;BA.debugLine="mytextfield_Action";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.magmagrid.class, "_mytextfield_action" /*RemoteObject*/ );
 if (true) break;

case 86:
//C
this.state = 87;
;
 if (true) break;
;
 BA.debugLineNum = 940;BA.debugLine="If xtra.IsComboBoxFocused(MyComboField) And (ke";
Debug.ShouldStop(2048);

case 87:
//if
this.state = 96;
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_xtra" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xmagmafuncs.class, "_iscomboboxfocused" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mycombofield" /*RemoteObject*/ )))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_keycode,BA.ObjectToString("ENTER")) || RemoteObject.solveBoolean("=",_keycode,RemoteObject.createImmutable("TAB")))))) { 
this.state = 89;
}if (true) break;

case 89:
//C
this.state = 90;
 BA.debugLineNum = 943;BA.debugLine="If MyComboField.Editable=True Then";
Debug.ShouldStop(16384);
if (true) break;

case 90:
//if
this.state = 95;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mycombofield" /*RemoteObject*/ ).runMethod(true,"getEditable"),parent.__c.getField(true,"True"))) { 
this.state = 92;
}else {
this.state = 94;
}if (true) break;

case 92:
//C
this.state = 95;
 BA.debugLineNum = 944;BA.debugLine="Dim tmp As String=MyComboField.Value  'here";
Debug.ShouldStop(32768);
_tmp = BA.ObjectToString(__ref.getField(false,"_mycombofield" /*RemoteObject*/ ).runMethod(false,"getValue"));Debug.locals.put("tmp", _tmp);Debug.locals.put("tmp", _tmp);
 BA.debugLineNum = 945;BA.debugLine="Sleep(0)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "magmagrid", "keypressed_filter"),BA.numberCast(int.class, 0));
this.state = 104;
return;
case 104:
//C
this.state = 95;
;
 BA.debugLineNum = 946;BA.debugLine="SetValue(SelectedRow,SelectedColumn.Name,tmp";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.magmagrid.class, "_setvalue" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selectedrow" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Name" /*RemoteObject*/ )),(Object)((_tmp)));
 if (true) break;

case 94:
//C
this.state = 95;
 BA.debugLineNum = 948;BA.debugLine="ie.ExitEditMode";
Debug.ShouldStop(524288);
__ref.getField(false,"_ie" /*RemoteObject*/ ).runClassMethod (b4j.example.inlineediting.class, "_exiteditmode" /*RemoteObject*/ );
 if (true) break;

case 95:
//C
this.state = 96;
;
 BA.debugLineNum = 950;BA.debugLine="NextEditableColumn";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.magmagrid.class, "_nexteditablecolumn" /*void*/ );
 BA.debugLineNum = 952;BA.debugLine="noEdit=False";
Debug.ShouldStop(8388608);
__ref.setField ("_noedit" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 if (true) break;

case 96:
//C
this.state = 97;
;
 if (true) break;

case 97:
//C
this.state = 98;
;
 if (true) break;

case 98:
//C
this.state = -1;
;
 BA.debugLineNum = 984;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
public static RemoteObject  _mycheckbox_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("MyCheckBox_CheckedChange (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,816);
if (RapidSub.canDelegate("mycheckbox_checkedchange")) { return __ref.runUserSub(false, "magmagrid","mycheckbox_checkedchange", __ref, _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 816;BA.debugLine="Private Sub MyCheckBox_CheckedChange(Checked As Bo";
Debug.ShouldStop(32768);
 BA.debugLineNum = 818;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mycombofield_selectedindexchanged(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("MyComboField_SelectedIndexChanged (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,797);
if (RapidSub.canDelegate("mycombofield_selectedindexchanged")) { return __ref.runUserSub(false, "magmagrid","mycombofield_selectedindexchanged", __ref, _index, _value);}
RemoteObject _map1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _afield = RemoteObject.createImmutable("");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 797;BA.debugLine="Private Sub MyComboField_SelectedIndexChanged(Inde";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 798;BA.debugLine="If Index>-1 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_index,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 799;BA.debugLine="If Index<>MyPrevComboIndex Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",_index,BA.numberCast(double.class, __ref.getField(true,"_myprevcomboindex" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 800;BA.debugLine="Private map1 As Map=SelectedColumn.UseList.Get(";
Debug.ShouldStop(-2147483648);
_map1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(false,"UseList" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)));Debug.locals.put("map1", _map1);Debug.locals.put("map1", _map1);
 BA.debugLineNum = 801;BA.debugLine="For Each afield As String In map1.Keys";
Debug.ShouldStop(1);
{
final RemoteObject group4 = _map1.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_afield = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("afield", _afield);
Debug.locals.put("afield", _afield);
 BA.debugLineNum = 802;BA.debugLine="If SelectedColumn.Name<>afield Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Name" /*RemoteObject*/ ),_afield)) { 
 BA.debugLineNum = 803;BA.debugLine="SetValue(SelectedRow,afield,map1.Get(afield))";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.magmagrid.class, "_setvalue" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selectedrow" /*RemoteObject*/ )),(Object)(_afield),(Object)(_map1.runMethod(false,"Get",(Object)((_afield)))));
 }else {
 BA.debugLineNum = 805;BA.debugLine="SetValue(SelectedRow,afield,Value)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.magmagrid.class, "_setvalue" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selectedrow" /*RemoteObject*/ )),(Object)(_afield),(Object)(_value));
 };
 }
}Debug.locals.put("afield", _afield);
;
 BA.debugLineNum = 808;BA.debugLine="MyPrevComboIndex=Index";
Debug.ShouldStop(128);
__ref.setField ("_myprevcomboindex" /*RemoteObject*/ ,_index);
 BA.debugLineNum = 809;BA.debugLine="RowCalcPraxis";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.magmagrid.class, "_rowcalcpraxis" /*RemoteObject*/ );
 };
 };
 BA.debugLineNum = 812;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mycombofield_valuechanged(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("MyComboField_ValueChanged (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,793);
if (RapidSub.canDelegate("mycombofield_valuechanged")) { return __ref.runUserSub(false, "magmagrid","mycombofield_valuechanged", __ref, _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 793;BA.debugLine="Private Sub MyComboField_ValueChanged (Value As Ob";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 795;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mynumfield_action(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mynumfield_Action (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,685);
if (RapidSub.canDelegate("mynumfield_action")) { return __ref.runUserSub(false, "magmagrid","mynumfield_action", __ref);}
 BA.debugLineNum = 685;BA.debugLine="Private Sub mynumfield_Action";
Debug.ShouldStop(4096);
 BA.debugLineNum = 686;BA.debugLine="If MyNumField.Text.Trim.Length=0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 687;BA.debugLine="MyNumField.Text=SelectedColumn.Defaultvalue";
Debug.ShouldStop(16384);
__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Defaultvalue" /*RemoteObject*/ ));
 BA.debugLineNum = 688;BA.debugLine="ie.ExitEditMode";
Debug.ShouldStop(32768);
__ref.getField(false,"_ie" /*RemoteObject*/ ).runClassMethod (b4j.example.inlineediting.class, "_exiteditmode" /*RemoteObject*/ );
 BA.debugLineNum = 689;BA.debugLine="RowCalcPraxis";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.magmagrid.class, "_rowcalcpraxis" /*RemoteObject*/ );
 BA.debugLineNum = 690;BA.debugLine="NextEditableColumn";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.magmagrid.class, "_nexteditablecolumn" /*void*/ );
 BA.debugLineNum = 691;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 694;BA.debugLine="If MyNumField.Text <> \"\" And IsNumber(MyNumField.";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean(".",magmagrid.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"getText"))))) { 
 BA.debugLineNum = 695;BA.debugLine="MyNumField.Text = NumberFormat2(MyNumField.Text,";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"setText",magmagrid.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, __ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"MinIntegers" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"MinFractions" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"MaxFractions" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Grouping" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 697;BA.debugLine="ie.ExitEditMode";
Debug.ShouldStop(16777216);
__ref.getField(false,"_ie" /*RemoteObject*/ ).runClassMethod (b4j.example.inlineediting.class, "_exiteditmode" /*RemoteObject*/ );
 BA.debugLineNum = 698;BA.debugLine="RowCalcPraxis";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.magmagrid.class, "_rowcalcpraxis" /*RemoteObject*/ );
 BA.debugLineNum = 699;BA.debugLine="NextEditableColumn";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.magmagrid.class, "_nexteditablecolumn" /*void*/ );
 BA.debugLineNum = 700;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
Debug.ShouldStop(134217728);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_clvdata" /*RemoteObject*/ ).getField(false,"_sv").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 701;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mynumfield_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("mynumfield_FocusChanged (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,703);
if (RapidSub.canDelegate("mynumfield_focuschanged")) { return __ref.runUserSub(false, "magmagrid","mynumfield_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 703;BA.debugLine="Private Sub mynumfield_FocusChanged (HasFocus As B";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 704;BA.debugLine="noEdit=HasFocus";
Debug.ShouldStop(-2147483648);
__ref.setField ("_noedit" /*RemoteObject*/ ,_hasfocus);
 BA.debugLineNum = 706;BA.debugLine="If HasFocus=True Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_hasfocus,magmagrid.__c.getField(true,"True"))) { 
 BA.debugLineNum = 707;BA.debugLine="PrevColumn=SelectedColumn";
Debug.ShouldStop(4);
__ref.setField ("_prevcolumn" /*RemoteObject*/ ,__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ));
 BA.debugLineNum = 708;BA.debugLine="RowCalcPraxis";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.magmagrid.class, "_rowcalcpraxis" /*RemoteObject*/ );
 BA.debugLineNum = 709;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 711;BA.debugLine="If HasFocus = False And MyNumField.Text <> \"\" And";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_hasfocus,magmagrid.__c.getField(true,"False")) && RemoteObject.solveBoolean("!",__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean(".",magmagrid.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"getText"))))) { 
 BA.debugLineNum = 712;BA.debugLine="MyNumField.Text = NumberFormat2(MyNumField.Text,";
Debug.ShouldStop(128);
__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"setText",magmagrid.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, __ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_prevcolumn" /*RemoteObject*/ ).getField(true,"MinIntegers" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_prevcolumn" /*RemoteObject*/ ).getField(true,"MinFractions" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_prevcolumn" /*RemoteObject*/ ).getField(true,"MaxFractions" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_prevcolumn" /*RemoteObject*/ ).getField(true,"Grouping" /*RemoteObject*/ ))));
 BA.debugLineNum = 713;BA.debugLine="ie.ExitEditMode";
Debug.ShouldStop(256);
__ref.getField(false,"_ie" /*RemoteObject*/ ).runClassMethod (b4j.example.inlineediting.class, "_exiteditmode" /*RemoteObject*/ );
 BA.debugLineNum = 714;BA.debugLine="RowCalcPraxis";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.magmagrid.class, "_rowcalcpraxis" /*RemoteObject*/ );
 BA.debugLineNum = 715;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
Debug.ShouldStop(1024);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_clvdata" /*RemoteObject*/ ).getField(false,"_sv").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 716;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 718;BA.debugLine="If HasFocus=False And MyNumField.Text.Trim.Length";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_hasfocus,magmagrid.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 719;BA.debugLine="MyNumField.Text=SelectedColumn.Defaultvalue";
Debug.ShouldStop(16384);
__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Defaultvalue" /*RemoteObject*/ ));
 BA.debugLineNum = 720;BA.debugLine="ie.ExitEditMode";
Debug.ShouldStop(32768);
__ref.getField(false,"_ie" /*RemoteObject*/ ).runClassMethod (b4j.example.inlineediting.class, "_exiteditmode" /*RemoteObject*/ );
 BA.debugLineNum = 721;BA.debugLine="RowCalcPraxis";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.example.magmagrid.class, "_rowcalcpraxis" /*RemoteObject*/ );
 BA.debugLineNum = 722;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
Debug.ShouldStop(131072);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_clvdata" /*RemoteObject*/ ).getField(false,"_sv").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 723;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 725;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mynumfield_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("mynumfield_TextChanged (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,642);
if (RapidSub.canDelegate("mynumfield_textchanged")) { return __ref.runUserSub(false, "magmagrid","mynumfield_textchanged", __ref, _old, _new);}
RemoteObject _update = RemoteObject.createImmutable(false);
RemoteObject _text = RemoteObject.createImmutable("");
RemoteObject _firstdot = RemoteObject.createImmutable(0);
RemoteObject _before = RemoteObject.createImmutable("");
RemoteObject _after = RemoteObject.createImmutable("");
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 642;BA.debugLine="Sub mynumfield_TextChanged (Old As String, New As";
Debug.ShouldStop(2);
 BA.debugLineNum = 644;BA.debugLine="Dim update As Boolean";
Debug.ShouldStop(8);
_update = RemoteObject.createImmutable(false);Debug.locals.put("update", _update);
 BA.debugLineNum = 646;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 648;BA.debugLine="Dim text As String= Regex.Replace(\"[^0-9.]\", New";
Debug.ShouldStop(128);
_text = magmagrid.__c.getField(false,"Regex").runMethod(true,"Replace",(Object)(BA.ObjectToString("[^0-9.]")),(Object)(_new),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("text", _text);Debug.locals.put("text", _text);
 BA.debugLineNum = 651;BA.debugLine="Dim firstDot As Int = text.IndexOf(\".\")";
Debug.ShouldStop(1024);
_firstdot = _text.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable(".")));Debug.locals.put("firstDot", _firstdot);Debug.locals.put("firstDot", _firstdot);
 BA.debugLineNum = 652;BA.debugLine="If firstDot > -1 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",_firstdot,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 653;BA.debugLine="Dim before As String = text.SubString2(0, first";
Debug.ShouldStop(4096);
_before = _text.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_firstdot,RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("before", _before);Debug.locals.put("before", _before);
 BA.debugLineNum = 654;BA.debugLine="Dim after As String = Regex.Replace(\"[.]\", text";
Debug.ShouldStop(8192);
_after = magmagrid.__c.getField(false,"Regex").runMethod(true,"Replace",(Object)(BA.ObjectToString("[.]")),(Object)(_text.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_firstdot,RemoteObject.createImmutable(1)}, "+",1, 1)))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("after", _after);Debug.locals.put("after", _after);
 BA.debugLineNum = 655;BA.debugLine="text = before & after";
Debug.ShouldStop(16384);
_text = RemoteObject.concat(_before,_after);Debug.locals.put("text", _text);
 };
 BA.debugLineNum = 658;BA.debugLine="If New <> text Then update = True";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("!",_new,_text)) { 
_update = magmagrid.__c.getField(true,"True");Debug.locals.put("update", _update);};
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 660;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(524288);
magmagrid.__c.runVoidMethod ("LogImpl","01769490",magmagrid.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);
 };
 BA.debugLineNum = 665;BA.debugLine="If text.Length > SelectedColumn.MaxLength  Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",_text.runMethod(true,"length"),BA.numberCast(double.class, __ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"MaxLength" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 666;BA.debugLine="text = text.SubString2(0, SelectedColumn.MaxLeng";
Debug.ShouldStop(33554432);
_text = _text.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"MaxLength" /*RemoteObject*/ )));Debug.locals.put("text", _text);
 BA.debugLineNum = 667;BA.debugLine="update = True";
Debug.ShouldStop(67108864);
_update = magmagrid.__c.getField(true,"True");Debug.locals.put("update", _update);
 };
 BA.debugLineNum = 670;BA.debugLine="If text.Trim.Length=0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_text.runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 671;BA.debugLine="update=True";
Debug.ShouldStop(1073741824);
_update = magmagrid.__c.getField(true,"True");Debug.locals.put("update", _update);
 };
 BA.debugLineNum = 676;BA.debugLine="If update Then";
Debug.ShouldStop(8);
if (_update.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 677;BA.debugLine="MyNumField.Text = text";
Debug.ShouldStop(16);
__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runMethod(true,"setText",_text);
 BA.debugLineNum = 678;BA.debugLine="MyNumField.SetSelection(text.Length, text.Length";
Debug.ShouldStop(32);
__ref.getField(false,"_mynumfield" /*RemoteObject*/ ).runVoidMethod ("SetSelection",(Object)(_text.runMethod(true,"length")),(Object)(_text.runMethod(true,"length")));
 };
 BA.debugLineNum = 682;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mytextfield_action(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mytextfield_Action (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,759);
if (RapidSub.canDelegate("mytextfield_action")) { return __ref.runUserSub(false, "magmagrid","mytextfield_action", __ref);}
 BA.debugLineNum = 759;BA.debugLine="Private Sub mytextfield_Action";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 761;BA.debugLine="If MyTextField.Text.Trim.Length=0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 762;BA.debugLine="MyTextField.Text=SelectedColumn.Defaultvalue";
Debug.ShouldStop(33554432);
__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Defaultvalue" /*RemoteObject*/ ));
 BA.debugLineNum = 763;BA.debugLine="ie.ExitEditMode";
Debug.ShouldStop(67108864);
__ref.getField(false,"_ie" /*RemoteObject*/ ).runClassMethod (b4j.example.inlineediting.class, "_exiteditmode" /*RemoteObject*/ );
 BA.debugLineNum = 764;BA.debugLine="NextEditableColumn";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.magmagrid.class, "_nexteditablecolumn" /*void*/ );
 BA.debugLineNum = 766;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 769;BA.debugLine="ie.ExitEditMode";
Debug.ShouldStop(1);
__ref.getField(false,"_ie" /*RemoteObject*/ ).runClassMethod (b4j.example.inlineediting.class, "_exiteditmode" /*RemoteObject*/ );
 BA.debugLineNum = 770;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
Debug.ShouldStop(2);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_clvdata" /*RemoteObject*/ ).getField(false,"_sv").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 771;BA.debugLine="NextEditableColumn";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.example.magmagrid.class, "_nexteditablecolumn" /*void*/ );
 BA.debugLineNum = 773;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mytextfield_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("mytextfield_FocusChanged (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,775);
if (RapidSub.canDelegate("mytextfield_focuschanged")) { return __ref.runUserSub(false, "magmagrid","mytextfield_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 775;BA.debugLine="Private Sub mytextfield_FocusChanged (HasFocus As";
Debug.ShouldStop(64);
 BA.debugLineNum = 776;BA.debugLine="noEdit=HasFocus";
Debug.ShouldStop(128);
__ref.setField ("_noedit" /*RemoteObject*/ ,_hasfocus);
 BA.debugLineNum = 778;BA.debugLine="If HasFocus=False And MyTextField.Text.Trim.Lengt";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_hasfocus,magmagrid.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 779;BA.debugLine="MyTextField.Text=SelectedColumn.Defaultvalue";
Debug.ShouldStop(1024);
__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Defaultvalue" /*RemoteObject*/ ));
 BA.debugLineNum = 780;BA.debugLine="ie.ExitEditMode";
Debug.ShouldStop(2048);
__ref.getField(false,"_ie" /*RemoteObject*/ ).runClassMethod (b4j.example.inlineediting.class, "_exiteditmode" /*RemoteObject*/ );
 BA.debugLineNum = 781;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
Debug.ShouldStop(4096);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_clvdata" /*RemoteObject*/ ).getField(false,"_sv").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 782;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 786;BA.debugLine="If HasFocus=False Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_hasfocus,magmagrid.__c.getField(true,"False"))) { 
 BA.debugLineNum = 787;BA.debugLine="ie.ExitEditMode";
Debug.ShouldStop(262144);
__ref.getField(false,"_ie" /*RemoteObject*/ ).runClassMethod (b4j.example.inlineediting.class, "_exiteditmode" /*RemoteObject*/ );
 BA.debugLineNum = 788;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
Debug.ShouldStop(524288);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_clvdata" /*RemoteObject*/ ).getField(false,"_sv").runVoidMethod ("RequestFocus");
 };
 BA.debugLineNum = 790;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mytextfield_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("mytextfield_TextChanged (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,729);
if (RapidSub.canDelegate("mytextfield_textchanged")) { return __ref.runUserSub(false, "magmagrid","mytextfield_textchanged", __ref, _old, _new);}
RemoteObject _update = RemoteObject.createImmutable(false);
RemoteObject _text = RemoteObject.createImmutable("");
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 729;BA.debugLine="Sub mytextfield_TextChanged (Old As String, New As";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 731;BA.debugLine="Dim update As Boolean";
Debug.ShouldStop(67108864);
_update = RemoteObject.createImmutable(false);Debug.locals.put("update", _update);
 BA.debugLineNum = 732;BA.debugLine="Dim text As String=New";
Debug.ShouldStop(134217728);
_text = _new;Debug.locals.put("text", _text);Debug.locals.put("text", _text);
 BA.debugLineNum = 735;BA.debugLine="If SelectedColumn.MaxLength>0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"MaxLength" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 738;BA.debugLine="If text.Length > SelectedColumn.MaxLength Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_text.runMethod(true,"length"),BA.numberCast(double.class, __ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"MaxLength" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 739;BA.debugLine="text = text.SubString2(0, SelectedColumn.MaxLeng";
Debug.ShouldStop(4);
_text = _text.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"MaxLength" /*RemoteObject*/ )));Debug.locals.put("text", _text);
 BA.debugLineNum = 740;BA.debugLine="update = True";
Debug.ShouldStop(8);
_update = magmagrid.__c.getField(true,"True");Debug.locals.put("update", _update);
 };
 };
 BA.debugLineNum = 745;BA.debugLine="If text.Trim.Length=0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_text.runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 746;BA.debugLine="update=True";
Debug.ShouldStop(512);
_update = magmagrid.__c.getField(true,"True");Debug.locals.put("update", _update);
 };
 BA.debugLineNum = 750;BA.debugLine="If update Then";
Debug.ShouldStop(8192);
if (_update.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 751;BA.debugLine="MyTextField.Text = text";
Debug.ShouldStop(16384);
__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runMethod(true,"setText",_text);
 BA.debugLineNum = 752;BA.debugLine="MyTextField.SetSelection(text.Length, text.Lengt";
Debug.ShouldStop(32768);
__ref.getField(false,"_mytextfield" /*RemoteObject*/ ).runVoidMethod ("SetSelection",(Object)(_text.runMethod(true,"length")),(Object)(_text.runMethod(true,"length")));
 };
 BA.debugLineNum = 756;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _nexteditablecolumn(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NextEditableColumn (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,354);
if (RapidSub.canDelegate("nexteditablecolumn")) { __ref.runUserSub(false, "magmagrid","nexteditablecolumn", __ref); return;}
ResumableSub_NextEditableColumn rsub = new ResumableSub_NextEditableColumn(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_NextEditableColumn extends BA.ResumableSub {
public ResumableSub_NextEditableColumn(b4j.example.magmagrid parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.magmagrid parent;
int _k = 0;
RemoteObject _myc = RemoteObject.declareNull("b4j.example.magmagrid._mycol");
RemoteObject _unused = RemoteObject.createImmutable(false);
int step3;
int limit3;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("NextEditableColumn (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,354);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 356;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
Debug.ShouldStop(8);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_clvdata" /*RemoteObject*/ ).getField(false,"_sv").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 357;BA.debugLine="useB4XTable.UpdateTableCounters";
Debug.ShouldStop(16);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_updatetablecounters" /*RemoteObject*/ );
 BA.debugLineNum = 359;BA.debugLine="For k=TheIndexCol+1 To MyColumns.Size-1";
Debug.ShouldStop(64);
if (true) break;

case 1:
//for
this.state = 8;
step3 = 1;
limit3 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_k = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_theindexcol" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue() ;
Debug.locals.put("k", _k);
this.state = 14;
if (true) break;

case 14:
//C
this.state = 8;
if ((step3 > 0 && _k <= limit3) || (step3 < 0 && _k >= limit3)) this.state = 3;
if (true) break;

case 15:
//C
this.state = 14;
_k = ((int)(0 + _k + step3)) ;
Debug.locals.put("k", _k);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 360;BA.debugLine="Dim myc As mycol=MyColumns.Get(k)";
Debug.ShouldStop(128);
_myc = (__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _k))));Debug.locals.put("myc", _myc);Debug.locals.put("myc", _myc);
 BA.debugLineNum = 361;BA.debugLine="If myc.Locked=False And myc.Hidden=False And Not";
Debug.ShouldStop(256);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_myc.getField(true,"Locked" /*RemoteObject*/ ),parent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_myc.getField(true,"Hidden" /*RemoteObject*/ ),parent.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_myc.getField(true,"Controltype" /*RemoteObject*/ ),BA.ObjectToString("CHECKBOX")) || RemoteObject.solveBoolean("=",_myc.getField(true,"Controltype" /*RemoteObject*/ ),RemoteObject.createImmutable("CHECK"))))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 362;BA.debugLine="useB4XTable_CellClicked(myc.Name,SelectedRow)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.magmagrid.class, "_useb4xtable_cellclicked" /*void*/ ,(Object)(_myc.getField(true,"Name" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_selectedrow" /*RemoteObject*/ )));
 BA.debugLineNum = 364;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 15;
;
 if (true) break;
if (true) break;
Debug.locals.put("k", _k);
;
 BA.debugLineNum = 368;BA.debugLine="If SelectedRow < MyList.Size Then";
Debug.ShouldStop(32768);

case 8:
//if
this.state = 13;
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_selectedrow" /*RemoteObject*/ ),BA.numberCast(long.class, __ref.getField(false,"_mylist" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
 BA.debugLineNum = 370;BA.debugLine="SelectedRow=SelectedRow+1";
Debug.ShouldStop(131072);
__ref.setField ("_selectedrow" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedrow" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 2));
 BA.debugLineNum = 371;BA.debugLine="Sleep(0)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "magmagrid", "nexteditablecolumn"),BA.numberCast(int.class, 0));
this.state = 16;
return;
case 16:
//C
this.state = 13;
;
 BA.debugLineNum = 372;BA.debugLine="wait for (GoAtRowAndClick(SelectedRow)) complet";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "magmagrid", "nexteditablecolumn"), __ref.runClassMethod (b4j.example.magmagrid.class, "_goatrowandclick" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selectedrow" /*RemoteObject*/ ))));
this.state = 17;
return;
case 17:
//C
this.state = 13;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 376;BA.debugLine="SelectedRow=1";
Debug.ShouldStop(8388608);
__ref.setField ("_selectedrow" /*RemoteObject*/ ,BA.numberCast(long.class, 1));
 BA.debugLineNum = 377;BA.debugLine="Sleep(0)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "magmagrid", "nexteditablecolumn"),BA.numberCast(int.class, 0));
this.state = 18;
return;
case 18:
//C
this.state = 13;
;
 BA.debugLineNum = 378;BA.debugLine="wait for (GoAtRowAndClick(SelectedRow)) complet";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "magmagrid", "nexteditablecolumn"), __ref.runClassMethod (b4j.example.magmagrid.class, "_goatrowandclick" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selectedrow" /*RemoteObject*/ ))));
this.state = 19;
return;
case 19:
//C
this.state = 13;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 if (true) break;

case 13:
//C
this.state = -1;
;
 BA.debugLineNum = 382;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
public static void  _complete(RemoteObject __ref,RemoteObject _unused) throws Exception{
}
public static RemoteObject  _resizetimer_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResizeTimer_Tick (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,1056);
if (RapidSub.canDelegate("resizetimer_tick")) { return __ref.runUserSub(false, "magmagrid","resizetimer_tick", __ref);}
 BA.debugLineNum = 1056;BA.debugLine="Sub ResizeTimer_Tick";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1057;BA.debugLine="resizeTimer.Enabled = False";
Debug.ShouldStop(1);
__ref.getField(false,"_resizetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",magmagrid.__c.getField(true,"False"));
 BA.debugLineNum = 1058;BA.debugLine="EnableResizeGuidelines";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.magmagrid.class, "_enableresizeguidelines" /*RemoteObject*/ );
 BA.debugLineNum = 1059;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rowcalcpraxis(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RowCalcPraxis (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,213);
if (RapidSub.canDelegate("rowcalcpraxis")) { return __ref.runUserSub(false, "magmagrid","rowcalcpraxis", __ref);}
RemoteObject _headervalues = null;
int _k = 0;
RemoteObject _myc = RemoteObject.declareNull("b4j.example.magmagrid._mycol");
RemoteObject _mapvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _myinput = RemoteObject.createImmutable("");
RemoteObject _parts = null;
RemoteObject _tocolumn = RemoteObject.createImmutable("");
RemoteObject _apraxis = RemoteObject.createImmutable("");
int _c = 0;
RemoteObject _eeval = RemoteObject.declareNull("b4j.example.b4xeval");
RemoteObject _ddtotal = RemoteObject.createImmutable(0);
 BA.debugLineNum = 213;BA.debugLine="public Sub RowCalcPraxis";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 215;BA.debugLine="Private HeaderValues(MyColumns.Size) As String";
Debug.ShouldStop(4194304);
_headervalues = RemoteObject.createNewArray ("String", new int[] {__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("HeaderValues", _headervalues);
 BA.debugLineNum = 216;BA.debugLine="For k=0 To MyColumns.Size-1";
Debug.ShouldStop(8388608);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_k = 0 ;
for (;(step2 > 0 && _k <= limit2) || (step2 < 0 && _k >= limit2) ;_k = ((int)(0 + _k + step2))  ) {
Debug.locals.put("k", _k);
 BA.debugLineNum = 217;BA.debugLine="Private myc As mycol=MyColumns.Get(k)";
Debug.ShouldStop(16777216);
_myc = (__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _k))));Debug.locals.put("myc", _myc);Debug.locals.put("myc", _myc);
 BA.debugLineNum = 218;BA.debugLine="HeaderValues(k)= myc.Name";
Debug.ShouldStop(33554432);
_headervalues.setArrayElement (_myc.getField(true,"Name" /*RemoteObject*/ ),BA.numberCast(int.class, _k));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 221;BA.debugLine="For k=0 To HorizontalPraxisList.Size-1";
Debug.ShouldStop(268435456);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_horizontalpraxislist" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_k = 0 ;
for (;(step6 > 0 && _k <= limit6) || (step6 < 0 && _k >= limit6) ;_k = ((int)(0 + _k + step6))  ) {
Debug.locals.put("k", _k);
 BA.debugLineNum = 222;BA.debugLine="Private MapValues As Map = useB4XTable.GetRow(Se";
Debug.ShouldStop(536870912);
_mapvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapvalues = __ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_getrow" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selectedrow" /*RemoteObject*/ )));Debug.locals.put("MapValues", _mapvalues);Debug.locals.put("MapValues", _mapvalues);
 BA.debugLineNum = 223;BA.debugLine="Dim myinput As String=HorizontalPraxisList.Get(k";
Debug.ShouldStop(1073741824);
_myinput = BA.ObjectToString(__ref.getField(false,"_horizontalpraxislist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _k))));Debug.locals.put("myinput", _myinput);Debug.locals.put("myinput", _myinput);
 BA.debugLineNum = 224;BA.debugLine="Dim parts() As String = Regex.Split(\"=\", myinput";
Debug.ShouldStop(-2147483648);
_parts = magmagrid.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("=")),(Object)(_myinput));Debug.locals.put("parts", _parts);Debug.locals.put("parts", _parts);
 BA.debugLineNum = 225;BA.debugLine="Dim tocolumn As String=parts(0).Replace(\"[\",\"\").";
Debug.ShouldStop(1);
_tocolumn = _parts.getArrayElement(true,BA.numberCast(int.class, 0)).runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("tocolumn", _tocolumn);Debug.locals.put("tocolumn", _tocolumn);
 BA.debugLineNum = 226;BA.debugLine="Dim apraxis As String=parts(1)";
Debug.ShouldStop(2);
_apraxis = _parts.getArrayElement(true,BA.numberCast(int.class, 1));Debug.locals.put("apraxis", _apraxis);Debug.locals.put("apraxis", _apraxis);
 BA.debugLineNum = 227;BA.debugLine="For c=0 To HeaderValues.Length-1";
Debug.ShouldStop(4);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_headervalues.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_c = 0 ;
for (;(step12 > 0 && _c <= limit12) || (step12 < 0 && _c >= limit12) ;_c = ((int)(0 + _c + step12))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 228;BA.debugLine="apraxis = apraxis.Replace(\"[\" & HeaderValues(c)";
Debug.ShouldStop(8);
_apraxis = _apraxis.runMethod(true,"replace",(Object)(RemoteObject.concat(RemoteObject.createImmutable("["),_headervalues.getArrayElement(true,BA.numberCast(int.class, _c)),RemoteObject.createImmutable("]"))),(Object)(BA.ObjectToString(_mapvalues.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _c))))));Debug.locals.put("apraxis", _apraxis);
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 230;BA.debugLine="Dim eeval As B4XEval";
Debug.ShouldStop(32);
_eeval = RemoteObject.createNew ("b4j.example.b4xeval");Debug.locals.put("eeval", _eeval);
 BA.debugLineNum = 231;BA.debugLine="eeval.Initialize(Me, \"Eval\")";
Debug.ShouldStop(64);
_eeval.runClassMethod (b4j.example.b4xeval.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("Eval")));
 BA.debugLineNum = 232;BA.debugLine="Dim DDtotal As Double=eeval.Eval(apraxis)";
Debug.ShouldStop(128);
_ddtotal = _eeval.runClassMethod (b4j.example.b4xeval.class, "_eval" /*RemoteObject*/ ,(Object)(_apraxis));Debug.locals.put("DDtotal", _ddtotal);Debug.locals.put("DDtotal", _ddtotal);
 BA.debugLineNum = 233;BA.debugLine="SetValue(SelectedRow, tocolumn, DDtotal)";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.magmagrid.class, "_setvalue" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selectedrow" /*RemoteObject*/ )),(Object)(_tocolumn),(Object)((_ddtotal)));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selcolumn(RemoteObject __ref,RemoteObject _id1) throws Exception{
try {
		Debug.PushSubsStack("SelColumn (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,623);
if (RapidSub.canDelegate("selcolumn")) { return __ref.runUserSub(false, "magmagrid","selcolumn", __ref, _id1);}
ResumableSub_SelColumn rsub = new ResumableSub_SelColumn(null,__ref,_id1);
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
public static class ResumableSub_SelColumn extends BA.ResumableSub {
public ResumableSub_SelColumn(b4j.example.magmagrid parent,RemoteObject __ref,RemoteObject _id1) {
this.parent = parent;
this.__ref = __ref;
this._id1 = _id1;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.magmagrid parent;
RemoteObject _id1;
int _k = 0;
RemoteObject _mycolumn = RemoteObject.declareNull("b4j.example.magmagrid._mycol");
int step1;
int limit1;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SelColumn (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,623);
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
Debug.locals.put("ID1", _id1);
 BA.debugLineNum = 624;BA.debugLine="For k=0 To MyColumns.size-1";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//for
this.state = 10;
step1 = 1;
limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_k = 0 ;
Debug.locals.put("k", _k);
this.state = 11;
if (true) break;

case 11:
//C
this.state = 10;
if ((step1 > 0 && _k <= limit1) || (step1 < 0 && _k >= limit1)) this.state = 3;
if (true) break;

case 12:
//C
this.state = 11;
_k = ((int)(0 + _k + step1)) ;
Debug.locals.put("k", _k);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 626;BA.debugLine="Dim MyColumn As mycol=MyColumns.Get(k)";
Debug.ShouldStop(131072);
_mycolumn = (__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _k))));Debug.locals.put("MyColumn", _mycolumn);Debug.locals.put("MyColumn", _mycolumn);
 BA.debugLineNum = 627;BA.debugLine="If MyColumn.Name.Trim=ID1 Then Exit";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_mycolumn.getField(true,"Name" /*RemoteObject*/ ).runMethod(true,"trim"),_id1)) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
this.state = 10;
if (true) break;
if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
Debug.locals.put("k", _k);
;
 BA.debugLineNum = 631;BA.debugLine="TheIndexCol=k";
Debug.ShouldStop(4194304);
__ref.setField ("_theindexcol" /*RemoteObject*/ ,BA.numberCast(int.class, _k));
 BA.debugLineNum = 632;BA.debugLine="SelectedColumn=MyColumn";
Debug.ShouldStop(8388608);
__ref.setField ("_selectedcolumn" /*RemoteObject*/ ,_mycolumn);
 BA.debugLineNum = 634;BA.debugLine="Return True";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 635;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
public static RemoteObject  _setcolumnalignment(RemoteObject __ref,RemoteObject _tablename,RemoteObject _columnid,RemoteObject _alignment) throws Exception{
try {
		Debug.PushSubsStack("SetColumnAlignment (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,447);
if (RapidSub.canDelegate("setcolumnalignment")) { return __ref.runUserSub(false, "magmagrid","setcolumnalignment", __ref, _tablename, _columnid, _alignment);}
RemoteObject _column = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
int _i = 0;
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
Debug.locals.put("tableName", _tablename);
Debug.locals.put("ColumnId", _columnid);
Debug.locals.put("alignment", _alignment);
 BA.debugLineNum = 447;BA.debugLine="private Sub SetColumnAlignment(tableName As B4XTab";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 449;BA.debugLine="Dim column As B4XTableColumn = tableName.GetColum";
Debug.ShouldStop(1);
_column = _tablename.runClassMethod (b4j.example.b4xtable.class, "_getcolumn" /*RemoteObject*/ ,(Object)(_columnid));Debug.locals.put("column", _column);Debug.locals.put("column", _column);
 BA.debugLineNum = 450;BA.debugLine="For i = 1 To column.CellsLayouts.Size - 1";
Debug.ShouldStop(2);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_column.getField(false,"CellsLayouts" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 1 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 451;BA.debugLine="Dim pnl As B4XView = column.CellsLayouts.Get(i)";
Debug.ShouldStop(4);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _column.getField(false,"CellsLayouts" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 452;BA.debugLine="pnl.GetView(0).SetTextAlignment(\"CENTER\", alignm";
Debug.ShouldStop(8);
_pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(_alignment.runMethod(true,"toUpperCase")));
 BA.debugLineNum = 453;BA.debugLine="Dim lbl As Label = pnl.GetView(0)";
Debug.ShouldStop(16);
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 455;BA.debugLine="lbl.Style=\"-fx-padding: 5;\"";
Debug.ShouldStop(64);
_lbl.runMethod(true,"setStyle",BA.ObjectToString("-fx-padding: 5;"));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 462;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _setdata(RemoteObject __ref,RemoteObject _mylist1) throws Exception{
try {
		Debug.PushSubsStack("SetData (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,174);
if (RapidSub.canDelegate("setdata")) { __ref.runUserSub(false, "magmagrid","setdata", __ref, _mylist1); return;}
ResumableSub_SetData rsub = new ResumableSub_SetData(null,__ref,_mylist1);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SetData extends BA.ResumableSub {
public ResumableSub_SetData(b4j.example.magmagrid parent,RemoteObject __ref,RemoteObject _mylist1) {
this.parent = parent;
this.__ref = __ref;
this._mylist1 = _mylist1;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.magmagrid parent;
RemoteObject _mylist1;
RemoteObject _unused = RemoteObject.createImmutable(false);
int _colindex = 0;
RemoteObject _tablecol = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
int step7;
int limit7;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SetData (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,174);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("mylist1", _mylist1);
 BA.debugLineNum = 176;BA.debugLine="wait for (useB4XTable.SetData(mylist1)) complete";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "magmagrid", "setdata"), __ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_setdata" /*RemoteObject*/ ,(Object)(_mylist1)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 BA.debugLineNum = 177;BA.debugLine="MyList=mylist1";
Debug.ShouldStop(65536);
__ref.setField ("_mylist" /*RemoteObject*/ ,_mylist1);
 BA.debugLineNum = 178;BA.debugLine="CalcAll";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.magmagrid.class, "_calcall" /*RemoteObject*/ );
 BA.debugLineNum = 182;BA.debugLine="Sleep(0)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "magmagrid", "setdata"),BA.numberCast(int.class, 0));
this.state = 12;
return;
case 12:
//C
this.state = 1;
;
 BA.debugLineNum = 183;BA.debugLine="Dim previousColumnWidths(useB4XTable.Columns.Size";
Debug.ShouldStop(4194304);
parent._previouscolumnwidths = RemoteObject.createNewArray ("int", new int[] {__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_columns" /*RemoteObject*/ ).runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});__ref.setField("_previouscolumnwidths",parent._previouscolumnwidths);
 BA.debugLineNum = 184;BA.debugLine="removableGuidelines.Initialize";
Debug.ShouldStop(8388608);
__ref.getField(false,"_removableguidelines" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 185;BA.debugLine="For colIndex = 0 To useB4XTable.visibleColumns.Si";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//for
this.state = 4;
step7 = 1;
limit7 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_visiblecolumns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_colindex = 0 ;
Debug.locals.put("colIndex", _colindex);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 4;
if ((step7 > 0 && _colindex <= limit7) || (step7 < 0 && _colindex >= limit7)) this.state = 3;
if (true) break;

case 14:
//C
this.state = 13;
_colindex = ((int)(0 + _colindex + step7)) ;
Debug.locals.put("colIndex", _colindex);
if (true) break;

case 3:
//C
this.state = 14;
 BA.debugLineNum = 186;BA.debugLine="Dim tableCol As B4XTableColumn = useB4XTable.vis";
Debug.ShouldStop(33554432);
_tablecol = (__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_visiblecolumns" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _colindex))));Debug.locals.put("tableCol", _tablecol);Debug.locals.put("tableCol", _tablecol);
 BA.debugLineNum = 187;BA.debugLine="previousColumnWidths(colIndex) = tableCol.Width";
Debug.ShouldStop(67108864);
__ref.getField(false,"_previouscolumnwidths" /*RemoteObject*/ ).setArrayElement (_tablecol.getField(true,"Width" /*RemoteObject*/ ),BA.numberCast(int.class, _colindex));
 if (true) break;
if (true) break;
Debug.locals.put("colIndex", _colindex);
;
 BA.debugLineNum = 189;BA.debugLine="If allowColumnResize = True Then";
Debug.ShouldStop(268435456);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_allowcolumnresize" /*RemoteObject*/ ),parent.__c.getField(true,"True"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 190;BA.debugLine="resizeTimer.Initialize(\"ResizeTimer\", 100)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_resizetimer" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("ResizeTimer")),(Object)(BA.numberCast(long.class, 100)));
 BA.debugLineNum = 191;BA.debugLine="resizeTimer.Enabled = True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_resizetimer" /*RemoteObject*/ ).runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 if (true) break;
;
 BA.debugLineNum = 193;BA.debugLine="If guidelinePanel.IsInitialized Then";
Debug.ShouldStop(1);

case 7:
//if
this.state = 10;
if (__ref.getField(false,"_guidelinepanel" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 194;BA.debugLine="EnableResizeGuidelines";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.magmagrid.class, "_enableresizeguidelines" /*RemoteObject*/ );
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _rowid,RemoteObject _columnid,RemoteObject _newvalue) throws Exception{
try {
		Debug.PushSubsStack("SetValue (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "magmagrid","setvalue", __ref, _rowid, _columnid, _newvalue);}
RemoteObject _mapvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _query = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _k = 0;
RemoteObject _myc = RemoteObject.declareNull("b4j.example.magmagrid._mycol");
RemoteObject _newvalue1 = RemoteObject.createImmutable(0);
RemoteObject _c = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
Debug.locals.put("rowid", _rowid);
Debug.locals.put("columnid", _columnid);
Debug.locals.put("newvalue", _newvalue);
 BA.debugLineNum = 137;BA.debugLine="public Sub SetValue(rowid As Long, columnid As Str";
Debug.ShouldStop(256);
 BA.debugLineNum = 139;BA.debugLine="Private MapValues As Map = useB4XTable.GetRow(row";
Debug.ShouldStop(1024);
_mapvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapvalues = __ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_getrow" /*RemoteObject*/ ,(Object)(_rowid));Debug.locals.put("MapValues", _mapvalues);Debug.locals.put("MapValues", _mapvalues);
 BA.debugLineNum = 141;BA.debugLine="Dim Query As StringBuilder";
Debug.ShouldStop(4096);
_query = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("Query", _query);
 BA.debugLineNum = 142;BA.debugLine="Dim params As List";
Debug.ShouldStop(8192);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("params", _params);
 BA.debugLineNum = 143;BA.debugLine="params.Initialize";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 144;BA.debugLine="Query.Initialize";
Debug.ShouldStop(32768);
_query.runVoidMethod ("Initialize");
 BA.debugLineNum = 145;BA.debugLine="Query.Append (\"UPDATE data SET \")";
Debug.ShouldStop(65536);
_query.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("UPDATE data SET ")));
 BA.debugLineNum = 146;BA.debugLine="For k=0 To MyColumns.Size-1";
Debug.ShouldStop(131072);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_k = 0 ;
for (;(step7 > 0 && _k <= limit7) || (step7 < 0 && _k >= limit7) ;_k = ((int)(0 + _k + step7))  ) {
Debug.locals.put("k", _k);
 BA.debugLineNum = 147;BA.debugLine="Private myc As mycol = MyColumns.Get(k)";
Debug.ShouldStop(262144);
_myc = (__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _k))));Debug.locals.put("myc", _myc);Debug.locals.put("myc", _myc);
 BA.debugLineNum = 148;BA.debugLine="If myc.Controltype.Contains(\"EDITCONTROLS\") Then";
Debug.ShouldStop(524288);
if (_myc.getField(true,"Controltype" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("EDITCONTROLS"))).<Boolean>get().booleanValue()) { 
 }else {
 BA.debugLineNum = 150;BA.debugLine="If columnid=myc.Name Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_columnid,_myc.getField(true,"Name" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 151;BA.debugLine="If myc.Controltype.Contains(\"NUMERIC\") Then";
Debug.ShouldStop(4194304);
if (_myc.getField(true,"Controltype" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("NUMERIC"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 152;BA.debugLine="Dim newvalue1 As Double=newvalue";
Debug.ShouldStop(8388608);
_newvalue1 = BA.numberCast(double.class, _newvalue);Debug.locals.put("newvalue1", _newvalue1);Debug.locals.put("newvalue1", _newvalue1);
 BA.debugLineNum = 153;BA.debugLine="params.Add(NumberFormat2(newvalue1,myc.MinInt";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Add",(Object)((magmagrid.__c.runMethod(true,"NumberFormat2",(Object)(_newvalue1),(Object)(_myc.getField(true,"MinIntegers" /*RemoteObject*/ )),(Object)(_myc.getField(true,"MinFractions" /*RemoteObject*/ )),(Object)(_myc.getField(true,"MaxFractions" /*RemoteObject*/ )),(Object)(_myc.getField(true,"Grouping" /*RemoteObject*/ ))))));
 }else {
 BA.debugLineNum = 155;BA.debugLine="params.Add(newvalue)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Add",(Object)(_newvalue));
 };
 }else {
 BA.debugLineNum = 158;BA.debugLine="params.Add(MapValues.GetValueAt(k))";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Add",(Object)(_mapvalues.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _k)))));
 };
 BA.debugLineNum = 160;BA.debugLine="Dim c As B4XTableColumn = useB4XTable.GetColumn";
Debug.ShouldStop(-2147483648);
_c = __ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_getcolumn" /*RemoteObject*/ ,(Object)(_myc.getField(true,"Name" /*RemoteObject*/ )));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 161;BA.debugLine="Query.Append (c.SQLID.Trim & \" = ?\")";
Debug.ShouldStop(1);
_query.runVoidMethod ("Append",(Object)(RemoteObject.concat(_c.getField(true,"SQLID" /*RemoteObject*/ ).runMethod(true,"trim"),RemoteObject.createImmutable(" = ?"))));
 BA.debugLineNum = 162;BA.debugLine="If k<MyColumns.Size-1 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_k),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 163;BA.debugLine="Query.Append (\",\")";
Debug.ShouldStop(4);
_query.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(",")));
 };
 };
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 167;BA.debugLine="Query.Append (\"WHERE rowid = ?\")";
Debug.ShouldStop(64);
_query.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("WHERE rowid = ?")));
 BA.debugLineNum = 168;BA.debugLine="params.Add(rowid)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Add",(Object)((_rowid)));
 BA.debugLineNum = 169;BA.debugLine="useB4XTable.sql1.ExecNonQuery2(Query, params)";
Debug.ShouldStop(256);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString(_query)),(Object)(_params));
 BA.debugLineNum = 170;BA.debugLine="useB4XTable.Refresh";
Debug.ShouldStop(512);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_refresh" /*RemoteObject*/ );
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sumrows(RemoteObject __ref,RemoteObject _columnid,RemoteObject _sqlstring) throws Exception{
try {
		Debug.PushSubsStack("SumRows (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,1000);
if (RapidSub.canDelegate("sumrows")) { return __ref.runUserSub(false, "magmagrid","sumrows", __ref, _columnid, _sqlstring);}
RemoteObject _c = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
int _k = 0;
RemoteObject _myc = RemoteObject.declareNull("b4j.example.magmagrid._mycol");
Debug.locals.put("ColumnID", _columnid);
Debug.locals.put("sqlstring", _sqlstring);
 BA.debugLineNum = 1000;BA.debugLine="public Sub SumRows(ColumnID As String, sqlstring A";
Debug.ShouldStop(128);
 BA.debugLineNum = 1002;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
Debug.ShouldStop(512);
__ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_clvdata" /*RemoteObject*/ ).getField(false,"_sv").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 1003;BA.debugLine="ie.ExitEditMode";
Debug.ShouldStop(1024);
__ref.getField(false,"_ie" /*RemoteObject*/ ).runClassMethod (b4j.example.inlineediting.class, "_exiteditmode" /*RemoteObject*/ );
 BA.debugLineNum = 1005;BA.debugLine="If sqlstring.Trim.Length=0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_sqlstring.runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1006;BA.debugLine="Dim c As B4XTableColumn = useB4XTable.GetColumn(";
Debug.ShouldStop(8192);
_c = __ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_getcolumn" /*RemoteObject*/ ,(Object)(_columnid));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 1008;BA.debugLine="Dim rs As ResultSet=useB4XTable.sql1.ExecQuery(\"";
Debug.ShouldStop(32768);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT SUM("),_c.getField(true,"SQLID" /*RemoteObject*/ ).runMethod(true,"trim"),RemoteObject.createImmutable(") AS Total_sum FROM data;"))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1009;BA.debugLine="Return rs.GetDouble2(0)";
Debug.ShouldStop(65536);
if (true) return _rs.runMethod(true,"GetDouble2",(Object)(BA.numberCast(int.class, 0)));
 }else {
 BA.debugLineNum = 1011;BA.debugLine="For k=0 To MyColumns.Size-1";
Debug.ShouldStop(262144);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_k = 0 ;
for (;(step8 > 0 && _k <= limit8) || (step8 < 0 && _k >= limit8) ;_k = ((int)(0 + _k + step8))  ) {
Debug.locals.put("k", _k);
 BA.debugLineNum = 1012;BA.debugLine="Private myc As mycol=MyColumns.Get(k)";
Debug.ShouldStop(524288);
_myc = (__ref.getField(false,"_mycolumns" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _k))));Debug.locals.put("myc", _myc);Debug.locals.put("myc", _myc);
 BA.debugLineNum = 1013;BA.debugLine="Dim c As B4XTableColumn = useB4XTable.GetColumn";
Debug.ShouldStop(1048576);
_c = __ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtable.class, "_getcolumn" /*RemoteObject*/ ,(Object)(_myc.getField(true,"Name" /*RemoteObject*/ )));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 1014;BA.debugLine="sqlstring=sqlstring.Replace(\"[\" & myc.Name & \"]";
Debug.ShouldStop(2097152);
_sqlstring = _sqlstring.runMethod(true,"replace",(Object)(RemoteObject.concat(RemoteObject.createImmutable("["),_myc.getField(true,"Name" /*RemoteObject*/ ),RemoteObject.createImmutable("]"))),(Object)(_c.getField(true,"SQLID" /*RemoteObject*/ )));Debug.locals.put("sqlstring", _sqlstring);
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1016;BA.debugLine="Dim rs As ResultSet=useB4XTable.sql1.ExecQuery(s";
Debug.ShouldStop(8388608);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_useb4xtable" /*RemoteObject*/ ).getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(_sqlstring));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1017;BA.debugLine="Return rs.GetDouble2(0)";
Debug.ShouldStop(16777216);
if (true) return _rs.runMethod(true,"GetDouble2",(Object)(BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 1020;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _useb4xtable_cellclicked(RemoteObject __ref,RemoteObject _columnid,RemoteObject _rowid) throws Exception{
try {
		Debug.PushSubsStack("useB4XTable_CellClicked (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,584);
if (RapidSub.canDelegate("useb4xtable_cellclicked")) { __ref.runUserSub(false, "magmagrid","useb4xtable_cellclicked", __ref, _columnid, _rowid); return;}
ResumableSub_useB4XTable_CellClicked rsub = new ResumableSub_useB4XTable_CellClicked(null,__ref,_columnid,_rowid);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_useB4XTable_CellClicked extends BA.ResumableSub {
public ResumableSub_useB4XTable_CellClicked(b4j.example.magmagrid parent,RemoteObject __ref,RemoteObject _columnid,RemoteObject _rowid) {
this.parent = parent;
this.__ref = __ref;
this._columnid = _columnid;
this._rowid = _rowid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.magmagrid parent;
RemoteObject _columnid;
RemoteObject _rowid;
RemoteObject _unused = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("useB4XTable_CellClicked (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,584);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("ColumnId", _columnid);
Debug.locals.put("RowId", _rowid);
 BA.debugLineNum = 588;BA.debugLine="If noEdit=True Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_noedit" /*RemoteObject*/ ),parent.__c.getField(true,"True"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 589;BA.debugLine="noEdit=False";
Debug.ShouldStop(4096);
__ref.setField ("_noedit" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 590;BA.debugLine="ie.ExitEditMode";
Debug.ShouldStop(8192);
__ref.getField(false,"_ie" /*RemoteObject*/ ).runClassMethod (b4j.example.inlineediting.class, "_exiteditmode" /*RemoteObject*/ );
 BA.debugLineNum = 591;BA.debugLine="RowCalcPraxis";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.example.magmagrid.class, "_rowcalcpraxis" /*RemoteObject*/ );
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 595;BA.debugLine="thistable.CellClicked(ColumnId, RowId)";
Debug.ShouldStop(262144);
__ref.getField(false,"_thistable" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xtableselections.class, "_cellclicked" /*RemoteObject*/ ,(Object)(_columnid),(Object)(_rowid));
 BA.debugLineNum = 597;BA.debugLine="SelectedRow=RowId";
Debug.ShouldStop(1048576);
__ref.setField ("_selectedrow" /*RemoteObject*/ ,_rowid);
 BA.debugLineNum = 601;BA.debugLine="wait for (SelColumn(ColumnId)) complete (unused A";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "magmagrid", "useb4xtable_cellclicked"), __ref.runClassMethod (b4j.example.magmagrid.class, "_selcolumn" /*RemoteObject*/ ,(Object)(_columnid)));
this.state = 23;
return;
case 23:
//C
this.state = 5;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unused", _unused);
;
 BA.debugLineNum = 602;BA.debugLine="If SelectedColumn.Locked=True Then Return";
Debug.ShouldStop(33554432);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Locked" /*RemoteObject*/ ),parent.__c.getField(true,"True"))) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
if (true) return ;
if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 604;BA.debugLine="If SelectedColumn.Controltype.Contains(\"CHECK\") T";
Debug.ShouldStop(134217728);
if (true) break;

case 11:
//if
this.state = 22;
if (__ref.getField(false,"_selectedcolumn" /*RemoteObject*/ ).getField(true,"Controltype" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("CHECK"))).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 21;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 606;BA.debugLine="If GetValue(RowId,ColumnId)=Chr(9746) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.magmagrid.class, "_getvalue" /*RemoteObject*/ ,(Object)(_rowid),(Object)(_columnid)),BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 9746)))))) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 607;BA.debugLine="SetValue(RowId,ColumnId,Chr(9744))";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.example.magmagrid.class, "_setvalue" /*RemoteObject*/ ,(Object)(_rowid),(Object)(_columnid),(Object)((parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 9744))))));
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 609;BA.debugLine="SetValue(RowId,ColumnId,Chr(9746))";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.magmagrid.class, "_setvalue" /*RemoteObject*/ ,(Object)(_rowid),(Object)(_columnid),(Object)((parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 9746))))));
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 613;BA.debugLine="ie.CellClicked(ColumnId, RowId)";
Debug.ShouldStop(16);
__ref.getField(false,"_ie" /*RemoteObject*/ ).runClassMethod (b4j.example.inlineediting.class, "_cellclicked" /*RemoteObject*/ ,(Object)(_columnid),(Object)(_rowid));
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 618;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
public static RemoteObject  _useb4xtable_dataupdated(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("useB4XTable_DataUpdated (magmagrid) ","magmagrid",2,__ref.getField(false, "ba"),__ref,637);
if (RapidSub.canDelegate("useb4xtable_dataupdated")) { return __ref.runUserSub(false, "magmagrid","useb4xtable_dataupdated", __ref);}
 BA.debugLineNum = 637;BA.debugLine="Sub useB4XTable_DataUpdated";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 638;BA.debugLine="ie.DataUpdated";
Debug.ShouldStop(536870912);
__ref.getField(false,"_ie" /*RemoteObject*/ ).runClassMethod (b4j.example.inlineediting.class, "_dataupdated" /*RemoteObject*/ );
 BA.debugLineNum = 639;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}