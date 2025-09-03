package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xprogressdialog_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
b4xprogressdialog._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xprogressdialog._xui);
 //BA.debugLineNum = 3;BA.debugLine="Public mBase As B4XView";
b4xprogressdialog._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xprogressdialog._mbase);
 //BA.debugLineNum = 4;BA.debugLine="Private mText As Object";
b4xprogressdialog._mtext = RemoteObject.createNew ("Object");__ref.setField("_mtext",b4xprogressdialog._mtext);
 //BA.debugLineNum = 5;BA.debugLine="Public LoadingIndicator As B4XLoadingIndicator";
b4xprogressdialog._loadingindicator = RemoteObject.createNew ("b4j.example.b4xloadingindicator");__ref.setField("_loadingindicator",b4xprogressdialog._loadingindicator);
 //BA.debugLineNum = 6;BA.debugLine="Public Label1 As B4XView";
b4xprogressdialog._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_label1",b4xprogressdialog._label1);
 //BA.debugLineNum = 7;BA.debugLine="Public mDialog As B4XDialog";
b4xprogressdialog._mdialog = RemoteObject.createNew ("b4j.example.b4xdialog");__ref.setField("_mdialog",b4xprogressdialog._mdialog);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dialogclosed(RemoteObject __ref,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("DialogClosed (b4xprogressdialog) ","b4xprogressdialog",35,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("dialogclosed")) { return __ref.runUserSub(false, "b4xprogressdialog","dialogclosed", __ref, _result);}
Debug.locals.put("Result", _result);
 BA.debugLineNum = 55;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 56;BA.debugLine="LoadingIndicator.Hide";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_loadingindicator" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xloadingindicator.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref,RemoteObject _dialog) throws Exception{
try {
		Debug.PushSubsStack("GetPanel (b4xprogressdialog) ","b4xprogressdialog",35,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "b4xprogressdialog","getpanel", __ref, _dialog);}
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 33;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="Return mBase";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getText (b4xprogressdialog) ","b4xprogressdialog",35,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("gettext")) { return __ref.runUserSub(false, "b4xprogressdialog","gettext", __ref);}
 BA.debugLineNum = 28;BA.debugLine="Public Sub getText As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 29;BA.debugLine="Return mText";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mtext" /*RemoteObject*/ );
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hide (b4xprogressdialog) ","b4xprogressdialog",35,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("hide")) { return __ref.runUserSub(false, "b4xprogressdialog","hide", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Public Sub Hide";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 48;BA.debugLine="mDialog.Close(0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_close" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
		Debug.PushSubsStack("Initialize (b4xprogressdialog) ","b4xprogressdialog",35,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xprogressdialog","initialize", __ref, _ba, _parent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 12;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mbase" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mBase"))));
 BA.debugLineNum = 13;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 60dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, b4xprogressdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))),(Object)(BA.numberCast(double.class, b4xprogressdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))))));
 BA.debugLineNum = 14;BA.debugLine="mBase.LoadLayout(\"XV_ProgressTemplate\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("XV_ProgressTemplate")),__ref.getField(false, "ba"));
 BA.debugLineNum = 15;BA.debugLine="mBase.SetColorAndBorder(xui.Color_White, 0, 0, 5d";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White")),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, b4xprogressdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))));
 BA.debugLineNum = 16;BA.debugLine="LoadingIndicator.Hide";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_loadingindicator" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xloadingindicator.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 17;BA.debugLine="mDialog.Initialize(Parent)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_parent));
 BA.debugLineNum = 18;BA.debugLine="mDialog.ButtonsHeight = -2dip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdialog" /*RemoteObject*/ ).setField ("_buttonsheight" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + b4xprogressdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))).<Integer>get().intValue())));
 BA.debugLineNum = 19;BA.debugLine="mDialog.BorderWidth = 0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdialog" /*RemoteObject*/ ).setField ("_borderwidth" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 20;BA.debugLine="mDialog.BorderCornersRadius = 5dip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdialog" /*RemoteObject*/ ).setField ("_bordercornersradius" /*RemoteObject*/ ,b4xprogressdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("setText (b4xprogressdialog) ","b4xprogressdialog",35,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "b4xprogressdialog","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 24;BA.debugLine="Public Sub setText(t As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 25;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(Label1, t";
Debug.JustUpdateDeviceLine();
b4xprogressdialog._xuiviewsutils.runVoidMethod ("_settextorcsbuildertolabel" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_label1" /*RemoteObject*/ )),(Object)(_t));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _dialog) throws Exception{
try {
		Debug.PushSubsStack("Show (b4xprogressdialog) ","b4xprogressdialog",35,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "b4xprogressdialog","show", __ref, _dialog);}
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 51;BA.debugLine="Private Sub Show (Dialog As B4XDialog) 'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="LoadingIndicator.Show";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_loadingindicator" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showdialog(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("ShowDialog (b4xprogressdialog) ","b4xprogressdialog",35,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("showdialog")) { return __ref.runUserSub(false, "b4xprogressdialog","showdialog", __ref, _text);}
Debug.locals.put("Text", _text);
 BA.debugLineNum = 39;BA.debugLine="Public Sub ShowDialog (Text As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 40;BA.debugLine="setText(Text)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xprogressdialog.class, "_settext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 41;BA.debugLine="If mDialog.Visible = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mdialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_getvisible" /*RemoteObject*/ ),b4xprogressdialog.__c.getField(true,"False"))) { 
 BA.debugLineNum = 42;BA.debugLine="mDialog.ShowTemplate(Me, \"\", \"\", \"\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)(__ref),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable(""))));
 };
 BA.debugLineNum = 44;BA.debugLine="End Sub";
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