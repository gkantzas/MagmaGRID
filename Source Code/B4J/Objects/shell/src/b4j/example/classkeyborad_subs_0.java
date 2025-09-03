package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class classkeyborad_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
classkeyborad._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",classkeyborad._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private mParent As Object";
classkeyborad._mparent = RemoteObject.createNew ("Object");__ref.setField("_mparent",classkeyborad._mparent);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _enter2tab(RemoteObject __ref,RemoteObject _ctl) throws Exception{
try {
		Debug.PushSubsStack("Enter2TAB (classkeyborad) ","classkeyborad",7,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("enter2tab")) { return __ref.runUserSub(false, "classkeyborad","enter2tab", __ref, _ctl);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
Debug.locals.put("ctl", _ctl);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Enter2TAB(ctl As Object)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 14;BA.debugLine="Log(ctl)";
Debug.ShouldStop(8192);
classkeyborad.__c.runVoidMethod ("LogImpl","247579138",BA.ObjectToString(_ctl),0);
 BA.debugLineNum = 15;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(16384);
_r = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 16;BA.debugLine="r.Target = ctl";
Debug.ShouldStop(32768);
_r.setField ("Target",_ctl);
 BA.debugLineNum = 17;BA.debugLine="r.AddEventFilter(\"keypressed\",\"javafx.scene.input";
Debug.ShouldStop(65536);
_r.runVoidMethod ("AddEventFilter",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("keypressed")),(Object)(RemoteObject.createImmutable("javafx.scene.input.KeyEvent.KEY_PRESSED")));
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("Initialize (classkeyborad) ","classkeyborad",7,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "classkeyborad","initialize", __ref, _ba, _parent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize ( Parent As Object )";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="mParent = Parent";
Debug.ShouldStop(256);
__ref.setField ("_mparent" /*RemoteObject*/ ,_parent);
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
public static RemoteObject  _keypressed_filter(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("KeyPressed_Filter (classkeyborad) ","classkeyborad",7,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("keypressed_filter")) { return __ref.runUserSub(false, "classkeyborad","keypressed_filter", __ref, _e);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _keycode = RemoteObject.createImmutable("");
Debug.locals.put("e", _e);
 BA.debugLineNum = 20;BA.debugLine="Private Sub KeyPressed_Filter (e As Event)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Dim jo As JavaObject = e";
Debug.ShouldStop(1048576);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _e.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 22;BA.debugLine="Dim keycode As String = jo.RunMethod(\"getCode\", N";
Debug.ShouldStop(2097152);
_keycode = BA.ObjectToString(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getCode")),(Object)((classkeyborad.__c.getField(false,"Null")))));Debug.locals.put("keycode", _keycode);Debug.locals.put("keycode", _keycode);
 BA.debugLineNum = 24;BA.debugLine="If keycode = \"ENTER\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_keycode,BA.ObjectToString("ENTER"))) { 
 };
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stop(RemoteObject __ref,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("stop (classkeyborad) ","classkeyborad",7,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("stop")) { return __ref.runUserSub(false, "classkeyborad","stop", __ref, _parent);}
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 30;BA.debugLine="public Sub stop(Parent As Object)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}