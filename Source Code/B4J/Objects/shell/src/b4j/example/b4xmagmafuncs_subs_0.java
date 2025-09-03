package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmagmafuncs_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
b4xmagmafuncs._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",b4xmagmafuncs._fx);
 //BA.debugLineNum = 3;BA.debugLine="Dim translated As Map";
b4xmagmafuncs._translated = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_translated",b4xmagmafuncs._translated);
 //BA.debugLineNum = 4;BA.debugLine="Public SelectedLang As String=\"EN\" 'EN,GR..";
b4xmagmafuncs._selectedlang = BA.ObjectToString("EN");__ref.setField("_selectedlang",b4xmagmafuncs._selectedlang);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmagmafuncs) ","b4xmagmafuncs",5,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmagmafuncs","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="translated.Initialize";
Debug.ShouldStop(256);
__ref.getField(false,"_translated" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _iscomboboxfocused(RemoteObject __ref,RemoteObject _cb) throws Exception{
try {
		Debug.PushSubsStack("IsComboBoxFocused (b4xmagmafuncs) ","b4xmagmafuncs",5,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("iscomboboxfocused")) { return __ref.runUserSub(false, "b4xmagmafuncs","iscomboboxfocused", __ref, _cb);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("cb", _cb);
 BA.debugLineNum = 54;BA.debugLine="Sub IsComboBoxFocused(cb As ComboBox) As Boolean";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Dim jo As JavaObject = cb";
Debug.ShouldStop(4194304);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _cb.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 56;BA.debugLine="Return jo.RunMethod(\"isFocused\", Null)";
Debug.ShouldStop(8388608);
if (true) return BA.ObjectToBoolean(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("isFocused")),(Object)((b4xmagmafuncs.__c.getField(false,"Null")))));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isvaliddate(RemoteObject __ref,RemoteObject _datestr) throws Exception{
try {
		Debug.PushSubsStack("IsValidDate (b4xmagmafuncs) ","b4xmagmafuncs",5,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("isvaliddate")) { return __ref.runUserSub(false, "b4xmagmafuncs","isvaliddate", __ref, _datestr);}
RemoteObject _dtticks = RemoteObject.createImmutable(0L);
RemoteObject _reconstructed = RemoteObject.createImmutable("");
Debug.locals.put("DateStr", _datestr);
 BA.debugLineNum = 42;BA.debugLine="Public Sub IsValidDate(DateStr As String) As Boole";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 44;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
Debug.ShouldStop(2048);
b4xmagmafuncs.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 45;BA.debugLine="Dim dtTicks As Long = DateTime.DateParse(DateStr";
Debug.ShouldStop(4096);
_dtticks = b4xmagmafuncs.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_datestr));Debug.locals.put("dtTicks", _dtticks);Debug.locals.put("dtTicks", _dtticks);
 BA.debugLineNum = 46;BA.debugLine="Dim reconstructed As String = DateTime.Date(dtTi";
Debug.ShouldStop(8192);
_reconstructed = b4xmagmafuncs.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_dtticks));Debug.locals.put("reconstructed", _reconstructed);Debug.locals.put("reconstructed", _reconstructed);
 BA.debugLineNum = 48;BA.debugLine="Return reconstructed = DateStr";
Debug.ShouldStop(32768);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_reconstructed,_datestr));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e7.toString()); BA.debugLineNum = 50;BA.debugLine="Return False";
Debug.ShouldStop(131072);
if (true) return b4xmagmafuncs.__c.getField(true,"False");
 };
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _l(RemoteObject __ref,RemoteObject _std) throws Exception{
try {
		Debug.PushSubsStack("L (b4xmagmafuncs) ","b4xmagmafuncs",5,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("l")) { return __ref.runUserSub(false, "b4xmagmafuncs","l", __ref, _std);}
Debug.locals.put("std", _std);
 BA.debugLineNum = 29;BA.debugLine="public Sub L(std As String) As String";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="If SelectedLang=\"EN\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_selectedlang" /*RemoteObject*/ ),BA.ObjectToString("EN"))) { 
 BA.debugLineNum = 31;BA.debugLine="Return std";
Debug.ShouldStop(1073741824);
if (true) return _std;
 }else {
 BA.debugLineNum = 33;BA.debugLine="If translated.ContainsKey(std) Then";
Debug.ShouldStop(1);
if (__ref.getField(false,"_translated" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_std))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 34;BA.debugLine="Return translated.Get(std)";
Debug.ShouldStop(2);
if (true) return BA.ObjectToString(__ref.getField(false,"_translated" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_std))));
 }else {
 BA.debugLineNum = 36;BA.debugLine="Return std";
Debug.ShouldStop(8);
if (true) return _std;
 };
 };
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlanguage(RemoteObject __ref,RemoteObject _lang) throws Exception{
try {
		Debug.PushSubsStack("SetLanguage (b4xmagmafuncs) ","b4xmagmafuncs",5,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("setlanguage")) { return __ref.runUserSub(false, "b4xmagmafuncs","setlanguage", __ref, _lang);}
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _k = 0;
RemoteObject _aa = null;
Debug.locals.put("lang", _lang);
 BA.debugLineNum = 12;BA.debugLine="public Sub SetLanguage(lang As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="translated.Clear";
Debug.ShouldStop(4096);
__ref.getField(false,"_translated" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 14;BA.debugLine="SelectedLang=lang";
Debug.ShouldStop(8192);
__ref.setField ("_selectedlang" /*RemoteObject*/ ,_lang);
 BA.debugLineNum = 15;BA.debugLine="If SelectedLang<>\"EN\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_selectedlang" /*RemoteObject*/ ),BA.ObjectToString("EN"))) { 
 BA.debugLineNum = 16;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 17;BA.debugLine="Dim a As List=File.ReadList(Main.mydir,lang & \".";
Debug.ShouldStop(65536);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_a = b4xmagmafuncs.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(b4xmagmafuncs._main._mydir /*RemoteObject*/ ),(Object)(RemoteObject.concat(_lang,RemoteObject.createImmutable(".lang"))));Debug.locals.put("a", _a);Debug.locals.put("a", _a);
 BA.debugLineNum = 18;BA.debugLine="For k=0 To a.Size-1";
Debug.ShouldStop(131072);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_a.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_k = 0 ;
for (;(step6 > 0 && _k <= limit6) || (step6 < 0 && _k >= limit6) ;_k = ((int)(0 + _k + step6))  ) {
Debug.locals.put("k", _k);
 BA.debugLineNum = 19;BA.debugLine="Dim aa() As String=Regex.split(\",\",a.Get(k).As(";
Debug.ShouldStop(262144);
_aa = b4xmagmafuncs.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(",")),(Object)((BA.ObjectToString(_a.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _k)))))));Debug.locals.put("aa", _aa);Debug.locals.put("aa", _aa);
 BA.debugLineNum = 20;BA.debugLine="translated.Put(aa(0),aa(1))";
Debug.ShouldStop(524288);
__ref.getField(false,"_translated" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_aa.getArrayElement(true,BA.numberCast(int.class, 0)))),(Object)((_aa.getArrayElement(true,BA.numberCast(int.class, 1)))));
 }
}Debug.locals.put("k", _k);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 23;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(4194304);
b4xmagmafuncs.__c.runVoidMethod ("LogImpl","246465035",b4xmagmafuncs.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);
 };
 };
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}