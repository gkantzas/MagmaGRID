package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class classkeyborad extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.classkeyborad", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.classkeyborad.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.JFX _fx = null;
public Object _mparent = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals(b4j.example.classkeyborad __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="classkeyborad";
RDebugUtils.currentLine=47448064;
 //BA.debugLineNum = 47448064;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=47448065;
 //BA.debugLineNum = 47448065;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=47448066;
 //BA.debugLineNum = 47448066;BA.debugLine="Private mParent As Object";
_mparent = new Object();
RDebugUtils.currentLine=47448068;
 //BA.debugLineNum = 47448068;BA.debugLine="End Sub";
return "";
}
public String  _enter2tab(b4j.example.classkeyborad __ref,Object _ctl) throws Exception{
__ref = this;
RDebugUtils.currentModule="classkeyborad";
if (Debug.shouldDelegate(ba, "enter2tab", false))
	 {return ((String) Debug.delegate(ba, "enter2tab", new Object[] {_ctl}));}
anywheresoftware.b4j.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=47579136;
 //BA.debugLineNum = 47579136;BA.debugLine="Public Sub Enter2TAB(ctl As Object)";
RDebugUtils.currentLine=47579138;
 //BA.debugLineNum = 47579138;BA.debugLine="Log(ctl)";
__c.LogImpl("247579138",BA.ObjectToString(_ctl),0);
RDebugUtils.currentLine=47579139;
 //BA.debugLineNum = 47579139;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=47579140;
 //BA.debugLineNum = 47579140;BA.debugLine="r.Target = ctl";
_r.Target = _ctl;
RDebugUtils.currentLine=47579141;
 //BA.debugLineNum = 47579141;BA.debugLine="r.AddEventFilter(\"keypressed\",\"javafx.scene.input";
_r.AddEventFilter(ba,"keypressed","javafx.scene.input.KeyEvent.KEY_PRESSED");
RDebugUtils.currentLine=47579142;
 //BA.debugLineNum = 47579142;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.classkeyborad __ref,anywheresoftware.b4a.BA _ba,Object _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="classkeyborad";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
RDebugUtils.currentLine=47513600;
 //BA.debugLineNum = 47513600;BA.debugLine="Public Sub Initialize ( Parent As Object )";
RDebugUtils.currentLine=47513601;
 //BA.debugLineNum = 47513601;BA.debugLine="mParent = Parent";
__ref._mparent /*Object*/  = _parent;
RDebugUtils.currentLine=47513602;
 //BA.debugLineNum = 47513602;BA.debugLine="End Sub";
return "";
}
public String  _keypressed_filter(b4j.example.classkeyborad __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="classkeyborad";
if (Debug.shouldDelegate(ba, "keypressed_filter", false))
	 {return ((String) Debug.delegate(ba, "keypressed_filter", new Object[] {_e}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
String _keycode = "";
RDebugUtils.currentLine=47644672;
 //BA.debugLineNum = 47644672;BA.debugLine="Private Sub KeyPressed_Filter (e As Event)";
RDebugUtils.currentLine=47644673;
 //BA.debugLineNum = 47644673;BA.debugLine="Dim jo As JavaObject = e";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_e.getObject()));
RDebugUtils.currentLine=47644674;
 //BA.debugLineNum = 47644674;BA.debugLine="Dim keycode As String = jo.RunMethod(\"getCode\", N";
_keycode = BA.ObjectToString(_jo.RunMethod("getCode",(Object[])(__c.Null)));
RDebugUtils.currentLine=47644676;
 //BA.debugLineNum = 47644676;BA.debugLine="If keycode = \"ENTER\" Then";
if ((_keycode).equals("ENTER")) { 
 };
RDebugUtils.currentLine=47644680;
 //BA.debugLineNum = 47644680;BA.debugLine="End Sub";
return "";
}
public String  _stop(b4j.example.classkeyborad __ref,Object _parent) throws Exception{
__ref = this;
RDebugUtils.currentModule="classkeyborad";
if (Debug.shouldDelegate(ba, "stop", false))
	 {return ((String) Debug.delegate(ba, "stop", new Object[] {_parent}));}
RDebugUtils.currentLine=47710208;
 //BA.debugLineNum = 47710208;BA.debugLine="public Sub stop(Parent As Object)";
RDebugUtils.currentLine=47710213;
 //BA.debugLineNum = 47710213;BA.debugLine="End Sub";
return "";
}
}