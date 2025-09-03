package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xradiobutton_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width1,RemoteObject _height1) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (b4xradiobutton) ","b4xradiobutton",36,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "b4xradiobutton","base_resize", __ref, _width1, _height1);}
RemoteObject _newsize = RemoteObject.createImmutable(0);
RemoteObject _gap = RemoteObject.createImmutable(0);
Debug.locals.put("Width1", _width1);
Debug.locals.put("Height1", _height1);
 BA.debugLineNum = 59;BA.debugLine="Private Sub Base_Resize (Width1 As Double, Height1";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="Dim NewSize As Int = Max(5dip, Height1)";
Debug.JustUpdateDeviceLine();
_newsize = BA.numberCast(int.class, b4xradiobutton.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, b4xradiobutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(_height1)));Debug.locals.put("NewSize", _newsize);Debug.locals.put("NewSize", _newsize);
 BA.debugLineNum = 61;BA.debugLine="If NewSize = Size Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_newsize,BA.numberCast(double.class, __ref.getField(true,"_size" /*RemoteObject*/ )))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 62;BA.debugLine="Size = NewSize";
Debug.JustUpdateDeviceLine();
__ref.setField ("_size" /*RemoteObject*/ ,_newsize);
 BA.debugLineNum = 63;BA.debugLine="Dim gap As Int = 3dip";
Debug.JustUpdateDeviceLine();
_gap = b4xradiobutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("gap", _gap);Debug.locals.put("gap", _gap);
 BA.debugLineNum = 65;BA.debugLine="bc.Initialize(NewSize - 2 * gap, NewSize - 2 * ga";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {_newsize,RemoteObject.createImmutable(2),_gap}, "-*",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_newsize,RemoteObject.createImmutable(2),_gap}, "-*",1, 1)));
 BA.debugLineNum = 66;BA.debugLine="Scale = xui.Scale";
Debug.JustUpdateDeviceLine();
__ref.setField ("_scale" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getScale"));
 BA.debugLineNum = 71;BA.debugLine="iv.SetLayoutAnimated(0, gap, gap, Size - 2 * gap,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_iv" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, _gap)),(Object)(BA.numberCast(double.class, _gap)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_size" /*RemoteObject*/ ),RemoteObject.createImmutable(2),_gap}, "-*",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_size" /*RemoteObject*/ ),RemoteObject.createImmutable(2),_gap}, "-*",1, 1))));
 BA.debugLineNum = 72;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width1, Height1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnl" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_width1),(Object)(_height1));
 BA.debugLineNum = 73;BA.debugLine="mLabel.SetLayoutAnimated(0, Size + gap, 0, Width1";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_size" /*RemoteObject*/ ),_gap}, "+",1, 1))),(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_width1,__ref.getField(true,"_size" /*RemoteObject*/ ),_gap}, "--",2, 0)),(Object)(_height1));
 BA.debugLineNum = 74;BA.debugLine="OnBrush = bc.CreateBrushFromColor(OnColor)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_onbrush" /*RemoteObject*/ ,__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_createbrushfromcolor",(Object)(__ref.getField(true,"_oncolor" /*RemoteObject*/ ))));
 BA.debugLineNum = 75;BA.debugLine="OffBrush = bc.CreateBrushFromColor(OffColor)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_offbrush" /*RemoteObject*/ ,__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_createbrushfromcolor",(Object)(__ref.getField(true,"_offcolor" /*RemoteObject*/ ))));
 BA.debugLineNum = 76;BA.debugLine="transparent = bc.CreateBrushFromColor(xui.Color_T";
Debug.JustUpdateDeviceLine();
__ref.setField ("_transparent" /*RemoteObject*/ ,__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_createbrushfromcolor",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"))));
 BA.debugLineNum = 77;BA.debugLine="SetValueImpl(mValue, True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xradiobutton.class, "_setvalueimpl" /*void*/ ,(Object)(__ref.getField(true,"_mvalue" /*RemoteObject*/ )),(Object)(b4xradiobutton.__c.getField(true,"True")));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private mEventName As String 'ignore";
b4xradiobutton._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4xradiobutton._meventname);
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object 'ignore";
b4xradiobutton._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",b4xradiobutton._mcallback);
 //BA.debugLineNum = 9;BA.debugLine="Public mBase As B4XView 'ignore";
b4xradiobutton._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xradiobutton._mbase);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI 'ignore";
b4xradiobutton._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xradiobutton._xui);
 //BA.debugLineNum = 11;BA.debugLine="Public OnColor, OffColor As Int";
b4xradiobutton._oncolor = RemoteObject.createImmutable(0);__ref.setField("_oncolor",b4xradiobutton._oncolor);
b4xradiobutton._offcolor = RemoteObject.createImmutable(0);__ref.setField("_offcolor",b4xradiobutton._offcolor);
 //BA.debugLineNum = 12;BA.debugLine="Private bc As BitmapCreator";
b4xradiobutton._bc = RemoteObject.createNew ("b4j.example.bitmapcreator");__ref.setField("_bc",b4xradiobutton._bc);
 //BA.debugLineNum = 13;BA.debugLine="Private iv As B4XView";
b4xradiobutton._iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_iv",b4xradiobutton._iv);
 //BA.debugLineNum = 14;BA.debugLine="Private mValue As Boolean";
b4xradiobutton._mvalue = RemoteObject.createImmutable(false);__ref.setField("_mvalue",b4xradiobutton._mvalue);
 //BA.debugLineNum = 15;BA.debugLine="Private transparent As BCBrush";
b4xradiobutton._transparent = RemoteObject.createNew ("b4j.example.bcpath._bcbrush");__ref.setField("_transparent",b4xradiobutton._transparent);
 //BA.debugLineNum = 16;BA.debugLine="Private LoopIndex As Int";
b4xradiobutton._loopindex = RemoteObject.createImmutable(0);__ref.setField("_loopindex",b4xradiobutton._loopindex);
 //BA.debugLineNum = 17;BA.debugLine="Public Tag As Object";
b4xradiobutton._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",b4xradiobutton._tag);
 //BA.debugLineNum = 18;BA.debugLine="Private OnBrush, OffBrush As BCBrush";
b4xradiobutton._onbrush = RemoteObject.createNew ("b4j.example.bcpath._bcbrush");__ref.setField("_onbrush",b4xradiobutton._onbrush);
b4xradiobutton._offbrush = RemoteObject.createNew ("b4j.example.bcpath._bcbrush");__ref.setField("_offbrush",b4xradiobutton._offbrush);
 //BA.debugLineNum = 19;BA.debugLine="Private mEnabled As Boolean = True";
b4xradiobutton._menabled = b4xradiobutton.__c.getField(true,"True");__ref.setField("_menabled",b4xradiobutton._menabled);
 //BA.debugLineNum = 20;BA.debugLine="Public mHaptic As Boolean";
b4xradiobutton._mhaptic = RemoteObject.createImmutable(false);__ref.setField("_mhaptic",b4xradiobutton._mhaptic);
 //BA.debugLineNum = 21;BA.debugLine="Private Size As Int";
b4xradiobutton._size = RemoteObject.createImmutable(0);__ref.setField("_size",b4xradiobutton._size);
 //BA.debugLineNum = 22;BA.debugLine="Public mLabel As B4XView";
b4xradiobutton._mlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mlabel",b4xradiobutton._mlabel);
 //BA.debugLineNum = 23;BA.debugLine="Private pnl As B4XView";
b4xradiobutton._pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnl",b4xradiobutton._pnl);
 //BA.debugLineNum = 24;BA.debugLine="Private Scale As Float 'ignore";
b4xradiobutton._scale = RemoteObject.createImmutable(0f);__ref.setField("_scale",b4xradiobutton._scale);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (b4xradiobutton) ","b4xradiobutton",36,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "b4xradiobutton","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _iiv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 33;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 35;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 35;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 36;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 37;BA.debugLine="pnl = xui.CreatePanel(\"pnl\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pnl" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnl"))));
 BA.debugLineNum = 38;BA.debugLine="pnl.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnl" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 39;BA.debugLine="Dim iiv As ImageView";
Debug.JustUpdateDeviceLine();
_iiv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("iiv", _iiv);
 BA.debugLineNum = 40;BA.debugLine="iiv.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_iiv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 41;BA.debugLine="iv = iiv";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_iv" /*RemoteObject*/ ).setObject (_iiv.getObject());
 BA.debugLineNum = 42;BA.debugLine="mBase.AddView(iv, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_iv" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 43;BA.debugLine="mLabel = Lbl";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabel" /*RemoteObject*/ ).setObject (_lbl.getObject());
 BA.debugLineNum = 44;BA.debugLine="mLabel.SetTextAlignment(\"CENTER\", \"LEFT\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabel" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("LEFT")));
 BA.debugLineNum = 45;BA.debugLine="mBase.AddView(mLabel, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mlabel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 46;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnl" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 48;BA.debugLine="OnColor = xui.PaintOrColorToColor(Props.Get(\"OnCo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_oncolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OnColor")))))));
 BA.debugLineNum = 49;BA.debugLine="OffColor = xui.PaintOrColorToColor(Props.Get(\"Off";
Debug.JustUpdateDeviceLine();
__ref.setField ("_offcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OffColor")))))));
 BA.debugLineNum = 50;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mhaptic" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("HapticFeedback"))),(Object)((b4xradiobutton.__c.getField(true,"False"))))));
 BA.debugLineNum = 52;BA.debugLine="mEnabled = mBase.Enabled";
Debug.JustUpdateDeviceLine();
__ref.setField ("_menabled" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getEnabled"));
 BA.debugLineNum = 53;BA.debugLine="mBase.Enabled = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setEnabled",b4xradiobutton.__c.getField(true,"True"));
 BA.debugLineNum = 54;BA.debugLine="mValue = Props.Get(\"Value\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mvalue" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value"))))));
 BA.debugLineNum = 55;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xradiobutton.class, "_base_resize" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw(RemoteObject __ref,RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("Draw (b4xradiobutton) ","b4xradiobutton",36,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("draw")) { return __ref.runUserSub(false, "b4xradiobutton","draw", __ref, _state);}
RemoteObject _r = RemoteObject.createImmutable(0f);
Debug.locals.put("State", _state);
 BA.debugLineNum = 153;BA.debugLine="Private Sub Draw (State As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 154;BA.debugLine="bc.DrawRect2(bc.TargetRect, transparent, True, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawrect2",(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(false,"_targetrect")),(Object)(__ref.getField(false,"_transparent" /*RemoteObject*/ )),(Object)(b4xradiobutton.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 155;BA.debugLine="Dim r As Float = Floor(bc.mHeight / 2)";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, b4xradiobutton.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_bc" /*RemoteObject*/ ).getField(true,"_mheight"),RemoteObject.createImmutable(2)}, "/",0, 0))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 156;BA.debugLine="If State < 1 Then bc.DrawCircle2(r, r, r, OffBrus";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_state,BA.numberCast(double.class, 1))) { 
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawcircle2",(Object)(_r),(Object)(_r),(Object)(_r),(Object)(__ref.getField(false,"_offbrush" /*RemoteObject*/ )),(Object)(b4xradiobutton.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)));};
 BA.debugLineNum = 157;BA.debugLine="If State > 0 Then bc.DrawCircle2(r, r, r * State,";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_state,BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_drawcircle2",(Object)(_r),(Object)(_r),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r,_state}, "*",0, 0))),(Object)(__ref.getField(false,"_onbrush" /*RemoteObject*/ )),(Object)(b4xradiobutton.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)));};
 BA.debugLineNum = 158;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, iv)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bc" /*RemoteObject*/ ).runVoidMethod ("_setbitmaptoimageview",(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"_getbitmap")),(Object)(__ref.getField(false,"_iv" /*RemoteObject*/ )));
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getchecked(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getChecked (b4xradiobutton) ","b4xradiobutton",36,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("getchecked")) { return __ref.runUserSub(false, "b4xradiobutton","getchecked", __ref);}
 BA.debugLineNum = 140;BA.debugLine="Public Sub getChecked As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 141;BA.debugLine="Return mValue";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mvalue" /*RemoteObject*/ );
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getenabled(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getEnabled (b4xradiobutton) ","b4xradiobutton",36,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("getenabled")) { return __ref.runUserSub(false, "b4xradiobutton","getenabled", __ref);}
 BA.debugLineNum = 149;BA.debugLine="Public Sub getEnabled As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 150;BA.debugLine="Return mEnabled";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_menabled" /*RemoteObject*/ );
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getText (b4xradiobutton) ","b4xradiobutton",36,__ref.getField(false, "ba"),__ref,165);
if (RapidSub.canDelegate("gettext")) { return __ref.runUserSub(false, "b4xradiobutton","gettext", __ref);}
 BA.debugLineNum = 165;BA.debugLine="Public Sub getText As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 166;BA.debugLine="Return mLabel.Text";
Debug.JustUpdateDeviceLine();
if (true) return (__ref.getField(false,"_mlabel" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xradiobutton) ","b4xradiobutton",36,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xradiobutton","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 28;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 29;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("Pnl_MouseClicked (b4xradiobutton) ","b4xradiobutton",36,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("pnl_mouseclicked")) { return __ref.runUserSub(false, "b4xradiobutton","pnl_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 83;BA.debugLine="Private Sub Pnl_MouseClicked (EventData As MouseEv";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 84;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 88;BA.debugLine="If mValue Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_mvalue" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 89;BA.debugLine="If mEnabled Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_menabled" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 90;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFeedb";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_mhaptic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
b4xradiobutton._xuiviewsutils.runVoidMethod ("_performhapticfeedback" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )));};
 BA.debugLineNum = 91;BA.debugLine="SetValueImpl(Not(mValue), False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xradiobutton.class, "_setvalueimpl" /*void*/ ,(Object)(b4xradiobutton.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_mvalue" /*RemoteObject*/ )))),(Object)(b4xradiobutton.__c.getField(true,"False")));
 BA.debugLineNum = 92;BA.debugLine="If mValue And xui.SubExists(mCallBack, mEventNam";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_mvalue" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Checked"))),(Object)(BA.numberCast(int.class, 0))))) { 
 BA.debugLineNum = 93;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Checke";
Debug.JustUpdateDeviceLine();
b4xradiobutton.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Checked"))));
 };
 };
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setchecked(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setChecked (b4xradiobutton) ","b4xradiobutton",36,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("setchecked")) { return __ref.runUserSub(false, "b4xradiobutton","setchecked", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 135;BA.debugLine="Public Sub setChecked(b As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 136;BA.debugLine="If b = mValue Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,__ref.getField(true,"_mvalue" /*RemoteObject*/ ))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 137;BA.debugLine="SetValueImpl(b, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xradiobutton.class, "_setvalueimpl" /*void*/ ,(Object)(_b),(Object)(b4xradiobutton.__c.getField(true,"False")));
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setenabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setEnabled (b4xradiobutton) ","b4xradiobutton",36,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("setenabled")) { return __ref.runUserSub(false, "b4xradiobutton","setenabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 144;BA.debugLine="Public Sub setEnabled (b As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 145;BA.debugLine="mEnabled = b";
Debug.JustUpdateDeviceLine();
__ref.setField ("_menabled" /*RemoteObject*/ ,_b);
 BA.debugLineNum = 146;BA.debugLine="SetValueImpl(mValue, True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xradiobutton.class, "_setvalueimpl" /*void*/ ,(Object)(__ref.getField(true,"_mvalue" /*RemoteObject*/ )),(Object)(b4xradiobutton.__c.getField(true,"True")));
 BA.debugLineNum = 147;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setText (b4xradiobutton) ","b4xradiobutton",36,__ref.getField(false, "ba"),__ref,161);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "b4xradiobutton","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 161;BA.debugLine="Public Sub setText (t As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 162;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(mLabel, t";
Debug.JustUpdateDeviceLine();
b4xradiobutton._xuiviewsutils.runVoidMethod ("_settextorcsbuildertolabel" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mlabel" /*RemoteObject*/ )),(Object)(_t));
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _setvalueimpl(RemoteObject __ref,RemoteObject _b,RemoteObject _immediate) throws Exception{
try {
		Debug.PushSubsStack("SetValueImpl (b4xradiobutton) ","b4xradiobutton",36,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("setvalueimpl")) { __ref.runUserSub(false, "b4xradiobutton","setvalueimpl", __ref, _b, _immediate); return;}
ResumableSub_SetValueImpl rsub = new ResumableSub_SetValueImpl(null,__ref,_b,_immediate);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SetValueImpl extends BA.ResumableSub {
public ResumableSub_SetValueImpl(b4j.example.b4xradiobutton parent,RemoteObject __ref,RemoteObject _b,RemoteObject _immediate) {
this.parent = parent;
this.__ref = __ref;
this._b = _b;
this._immediate = _immediate;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xradiobutton parent;
RemoteObject _b;
RemoteObject _immediate;
int _i = 0;
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rb = RemoteObject.declareNull("b4j.example.b4xradiobutton");
RemoteObject _myindex = RemoteObject.createImmutable(0);
RemoteObject _start = RemoteObject.createImmutable(0L);
RemoteObject _duration = RemoteObject.createImmutable(0);
RemoteObject _state1 = RemoteObject.createImmutable(0f);
int step3;
int limit3;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SetValueImpl (b4xradiobutton) ","b4xradiobutton",36,__ref.getField(false, "ba"),__ref,98);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("b", _b);
Debug.locals.put("Immediate", _immediate);
 BA.debugLineNum = 99;BA.debugLine="mValue = b";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mvalue" /*RemoteObject*/ ,_b);
 BA.debugLineNum = 100;BA.debugLine="If b = True Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_b,parent.__c.getField(true,"True"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 101;BA.debugLine="For i = 0 To mBase.Parent.NumberOfViews - 1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//for
this.state = 11;
step3 = 1;
limit3 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 59;
if (true) break;

case 59:
//C
this.state = 11;
if ((step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3)) this.state = 6;
if (true) break;

case 60:
//C
this.state = 59;
_i = ((int)(0 + _i + step3)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 102;BA.debugLine="Dim v As B4XView = mBase.Parent.GetView(i)";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_v = __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 103;BA.debugLine="If v <> mBase And v.Tag Is B4XRadioButton Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",_v,__ref.getField(false,"_mbase" /*RemoteObject*/ )) && RemoteObject.solveBoolean("i",_v.runMethod(false,"getTag"), RemoteObject.createImmutable("b4j.example.b4xradiobutton"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 104;BA.debugLine="Dim rb As B4XRadioButton = v.Tag";
Debug.JustUpdateDeviceLine();
_rb = (_v.runMethod(false,"getTag"));Debug.locals.put("rb", _rb);Debug.locals.put("rb", _rb);
 BA.debugLineNum = 105;BA.debugLine="rb.Checked = False";
Debug.JustUpdateDeviceLine();
_rb.runClassMethod (b4j.example.b4xradiobutton.class, "_setchecked" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 if (true) break;

case 10:
//C
this.state = 60;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
Debug.locals.put("i", _i);
;
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 109;BA.debugLine="LoopIndex = LoopIndex + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_loopindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_loopindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 110;BA.debugLine="If Immediate Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 13:
//if
this.state = 53;
if (_immediate.<Boolean>get().booleanValue()) { 
this.state = 15;
}else {
this.state = 25;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 111;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
Debug.JustUpdateDeviceLine();
if (true) break;

case 16:
//if
this.state = 23;
if (__ref.getField(true,"_mvalue" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 18;
;}
else {
this.state = 20;
;}if (true) break;

case 18:
//C
this.state = 23;
__ref.runClassMethod (b4j.example.b4xradiobutton.class, "_draw" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 1)));
if (true) break;

case 20:
//C
this.state = 23;
__ref.runClassMethod (b4j.example.b4xradiobutton.class, "_draw" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 0)));
if (true) break;

case 23:
//C
this.state = 53;
;
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 113;BA.debugLine="Dim MyIndex As Int = LoopIndex";
Debug.JustUpdateDeviceLine();
_myindex = __ref.getField(true,"_loopindex" /*RemoteObject*/ );Debug.locals.put("MyIndex", _myindex);Debug.locals.put("MyIndex", _myindex);
 BA.debugLineNum = 114;BA.debugLine="Dim start As Long = DateTime.Now";
Debug.JustUpdateDeviceLine();
_start = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("start", _start);Debug.locals.put("start", _start);
 BA.debugLineNum = 115;BA.debugLine="Dim duration As Int = 200";
Debug.JustUpdateDeviceLine();
_duration = BA.numberCast(int.class, 200);Debug.locals.put("duration", _duration);Debug.locals.put("duration", _duration);
 BA.debugLineNum = 116;BA.debugLine="Do While DateTime.Now < start + duration";
Debug.JustUpdateDeviceLine();
if (true) break;

case 26:
//do while
this.state = 41;
while (RemoteObject.solveBoolean("<",parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.solve(new RemoteObject[] {_start,_duration}, "+",1, 2))) {
this.state = 28;
if (true) break;
}
if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 117;BA.debugLine="Dim state1 As Float = (DateTime.Now - start) /";
Debug.JustUpdateDeviceLine();
_state1 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),_start}, "-",1, 2)),_duration}, "/",0, 0));Debug.locals.put("state1", _state1);Debug.locals.put("state1", _state1);
 BA.debugLineNum = 118;BA.debugLine="If mValue = False Then state1 = 1 - state1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 29:
//if
this.state = 34;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mvalue" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 31;
;}if (true) break;

case 31:
//C
this.state = 34;
_state1 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),_state1}, "-",1, 0));Debug.locals.put("state1", _state1);
if (true) break;

case 34:
//C
this.state = 35;
;
 BA.debugLineNum = 119;BA.debugLine="Draw(state1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xradiobutton.class, "_draw" /*RemoteObject*/ ,(Object)(_state1));
 BA.debugLineNum = 120;BA.debugLine="Sleep(16)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xradiobutton", "setvalueimpl"),BA.numberCast(int.class, 16));
this.state = 61;
return;
case 61:
//C
this.state = 35;
;
 BA.debugLineNum = 121;BA.debugLine="If MyIndex <> LoopIndex Then Exit";
Debug.JustUpdateDeviceLine();
if (true) break;

case 35:
//if
this.state = 40;
if (RemoteObject.solveBoolean("!",_myindex,BA.numberCast(double.class, __ref.getField(true,"_loopindex" /*RemoteObject*/ )))) { 
this.state = 37;
;}if (true) break;

case 37:
//C
this.state = 40;
this.state = 41;
if (true) break;
if (true) break;

case 40:
//C
this.state = 26;
;
 if (true) break;
;
 BA.debugLineNum = 123;BA.debugLine="If MyIndex = LoopIndex Then";
Debug.JustUpdateDeviceLine();

case 41:
//if
this.state = 52;
if (RemoteObject.solveBoolean("=",_myindex,BA.numberCast(double.class, __ref.getField(true,"_loopindex" /*RemoteObject*/ )))) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 124;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
Debug.JustUpdateDeviceLine();
if (true) break;

case 44:
//if
this.state = 51;
if (__ref.getField(true,"_mvalue" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 46;
;}
else {
this.state = 48;
;}if (true) break;

case 46:
//C
this.state = 51;
__ref.runClassMethod (b4j.example.b4xradiobutton.class, "_draw" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 1)));
if (true) break;

case 48:
//C
this.state = 51;
__ref.runClassMethod (b4j.example.b4xradiobutton.class, "_draw" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 0)));
if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;

case 52:
//C
this.state = 53;
;
 if (true) break;
;
 BA.debugLineNum = 127;BA.debugLine="If mEnabled Then";
Debug.JustUpdateDeviceLine();

case 53:
//if
this.state = 58;
if (__ref.getField(true,"_menabled" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 55;
}else {
this.state = 57;
}if (true) break;

case 55:
//C
this.state = 58;
 BA.debugLineNum = 128;BA.debugLine="XUIViewsUtils.SetAlpha(mBase, 1)";
Debug.JustUpdateDeviceLine();
parent._xuiviewsutils.runVoidMethod ("_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, 1)));
 if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 130;BA.debugLine="XUIViewsUtils.SetAlpha(mBase, 0.4)";
Debug.JustUpdateDeviceLine();
parent._xuiviewsutils.runVoidMethod ("_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, 0.4)));
 if (true) break;

case 58:
//C
this.state = -1;
;
 BA.debugLineNum = 133;BA.debugLine="End Sub";
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
}