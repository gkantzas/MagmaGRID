package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class madewithlove extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.madewithlove", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.madewithlove.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4j.example.madewithlove __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="madewithlove";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=38010880;
 //BA.debugLineNum = 38010880;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=38010881;
 //BA.debugLineNum = 38010881;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Wid";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=38010882;
 //BA.debugLineNum = 38010882;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.madewithlove __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="madewithlove";
RDebugUtils.currentLine=37814272;
 //BA.debugLineNum = 37814272;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=37814273;
 //BA.debugLineNum = 37814273;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=37814274;
 //BA.debugLineNum = 37814274;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=37814275;
 //BA.debugLineNum = 37814275;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=37814276;
 //BA.debugLineNum = 37814276;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=37814277;
 //BA.debugLineNum = 37814277;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=37814278;
 //BA.debugLineNum = 37814278;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4j.example.madewithlove __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="madewithlove";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
b4j.example.b4jtextflow _tf = null;
RDebugUtils.currentLine=37945344;
 //BA.debugLineNum = 37945344;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=37945345;
 //BA.debugLineNum = 37945345;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=37945346;
 //BA.debugLineNum = 37945346;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=37945346;
 //BA.debugLineNum = 37945346;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=37945347;
 //BA.debugLineNum = 37945347;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=37945349;
 //BA.debugLineNum = 37945349;BA.debugLine="Dim tf As B4JTextFlow";
_tf = new b4j.example.b4jtextflow();
RDebugUtils.currentLine=37945350;
 //BA.debugLineNum = 37945350;BA.debugLine="tf.Initialize";
_tf._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=37945351;
 //BA.debugLineNum = 37945351;BA.debugLine="tf.Append(\"Made with \")";
_tf._append /*b4j.example.b4jtextflow*/ (null,"Made with ");
RDebugUtils.currentLine=37945352;
 //BA.debugLineNum = 37945352;BA.debugLine="tf.SetFont(xlbl.Font)";
_tf._setfont /*b4j.example.b4jtextflow*/ (null,(anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(_xlbl.getFont().getObject())));
RDebugUtils.currentLine=37945353;
 //BA.debugLineNum = 37945353;BA.debugLine="tf.SetColor(xlbl.TextColor)";
_tf._setcolor /*b4j.example.b4jtextflow*/ (null,_xlbl.getTextColor());
RDebugUtils.currentLine=37945354;
 //BA.debugLineNum = 37945354;BA.debugLine="tf.Append(Chr(0xF004))";
_tf._append /*b4j.example.b4jtextflow*/ (null,BA.ObjectToString(__c.Chr(((int)0xf004))));
RDebugUtils.currentLine=37945355;
 //BA.debugLineNum = 37945355;BA.debugLine="tf.SetFont(xui.CreateFontAwesome(xlbl.TextSize))";
_tf._setfont /*b4j.example.b4jtextflow*/ (null,(anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFontAwesome((float) (_xlbl.getTextSize())).getObject())));
RDebugUtils.currentLine=37945356;
 //BA.debugLineNum = 37945356;BA.debugLine="tf.SetColor(xui.Color_Red)";
_tf._setcolor /*b4j.example.b4jtextflow*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=37945357;
 //BA.debugLineNum = 37945357;BA.debugLine="tf.Append(\" in B4X\")";
_tf._append /*b4j.example.b4jtextflow*/ (null," in B4X");
RDebugUtils.currentLine=37945358;
 //BA.debugLineNum = 37945358;BA.debugLine="tf.SetFont(xlbl.Font)";
_tf._setfont /*b4j.example.b4jtextflow*/ (null,(anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(_xlbl.getFont().getObject())));
RDebugUtils.currentLine=37945359;
 //BA.debugLineNum = 37945359;BA.debugLine="tf.SetColor(xlbl.TextColor)";
_tf._setcolor /*b4j.example.b4jtextflow*/ (null,_xlbl.getTextColor());
RDebugUtils.currentLine=37945360;
 //BA.debugLineNum = 37945360;BA.debugLine="mBase.AddView(tf.CreateTextFlow, 0, 0, mBase.Widt";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_tf._createtextflow /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ (null).getObject()),0,0,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=37945374;
 //BA.debugLineNum = 37945374;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.madewithlove __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="madewithlove";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=37879808;
 //BA.debugLineNum = 37879808;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=37879809;
 //BA.debugLineNum = 37879809;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=37879810;
 //BA.debugLineNum = 37879810;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=37879811;
 //BA.debugLineNum = 37879811;BA.debugLine="End Sub";
return "";
}
}