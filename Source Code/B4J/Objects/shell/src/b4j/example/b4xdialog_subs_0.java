package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xdialog_subs_0 {


public static RemoteObject  _background_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Background_Click (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,261);
if (RapidSub.canDelegate("background_click")) { return __ref.runUserSub(false, "b4xdialog","background_click", __ref);}
 BA.debugLineNum = 261;BA.debugLine="Private Sub Background_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _background_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("Background_MouseClicked (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,251);
if (RapidSub.canDelegate("background_mouseclicked")) { return __ref.runUserSub(false, "b4xdialog","background_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 251;BA.debugLine="Private Sub Background_MouseClicked (EventData As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 252;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _background_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("Background_Touch (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("background_touch")) { return __ref.runUserSub(false, "b4xdialog","background_touch", __ref, _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 256;BA.debugLine="Private Sub Background_Touch (Action As Int, X As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _blur(RemoteObject __ref,RemoteObject _bmp) throws Exception{
try {
		Debug.PushSubsStack("Blur (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,290);
if (RapidSub.canDelegate("blur")) { return __ref.runUserSub(false, "b4xdialog","blur", __ref, _bmp);}
RemoteObject _bc = RemoteObject.declareNull("b4j.example.bitmapcreator");
RemoteObject _reducescale = RemoteObject.createImmutable(0);
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _clrs = null;
RemoteObject _temp = RemoteObject.declareNull("b4j.example.bitmapcreator._argbcolor");
RemoteObject _m = RemoteObject.createImmutable(0);
int _steps = 0;
int _y = 0;
int _x = 0;
Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 290;BA.debugLine="Private Sub Blur (bmp As B4XBitmap) As BitmapCreat";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 291;BA.debugLine="Dim bc As BitmapCreator";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("b4j.example.bitmapcreator");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 292;BA.debugLine="Dim ReduceScale As Int = BlurReduceScale";
Debug.JustUpdateDeviceLine();
_reducescale = __ref.getField(true,"_blurreducescale" /*RemoteObject*/ );Debug.locals.put("ReduceScale", _reducescale);Debug.locals.put("ReduceScale", _reducescale);
 BA.debugLineNum = 293;BA.debugLine="bc.Initialize(bmp.Width / ReduceScale / bmp.Scale";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_reducescale,_bmp.runMethod(true,"getScale")}, "//",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),_reducescale,_bmp.runMethod(true,"getScale")}, "//",0, 0))));
 BA.debugLineNum = 294;BA.debugLine="bc.CopyPixelsFromBitmap(bmp)";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_copypixelsfrombitmap",(Object)(_bmp));
 BA.debugLineNum = 295;BA.debugLine="Dim count As Int = 2";
Debug.JustUpdateDeviceLine();
_count = BA.numberCast(int.class, 2);Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 296;BA.debugLine="Dim clrs(3) As ARGBColor";
Debug.JustUpdateDeviceLine();
_clrs = RemoteObject.createNewArray ("b4j.example.bitmapcreator._argbcolor", new int[] {3}, new Object[]{});Debug.locals.put("clrs", _clrs);
 BA.debugLineNum = 297;BA.debugLine="Dim temp As ARGBColor";
Debug.JustUpdateDeviceLine();
_temp = RemoteObject.createNew ("b4j.example.bitmapcreator._argbcolor");Debug.locals.put("temp", _temp);
 BA.debugLineNum = 298;BA.debugLine="Dim m As Int";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createImmutable(0);Debug.locals.put("m", _m);
 BA.debugLineNum = 299;BA.debugLine="For steps = 1 To count";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = _count.<Integer>get().intValue();
_steps = 1 ;
for (;(step9 > 0 && _steps <= limit9) || (step9 < 0 && _steps >= limit9) ;_steps = ((int)(0 + _steps + step9))  ) {
Debug.locals.put("steps", _steps);
 BA.debugLineNum = 300;BA.debugLine="For y = 0 To bc.mHeight - 1";
Debug.JustUpdateDeviceLine();
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mheight"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_y = 0 ;
for (;(step10 > 0 && _y <= limit10) || (step10 < 0 && _y >= limit10) ;_y = ((int)(0 + _y + step10))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 301;BA.debugLine="For x = 0 To 2";
Debug.JustUpdateDeviceLine();
{
final int step11 = 1;
final int limit11 = 2;
_x = 0 ;
for (;(step11 > 0 && _x <= limit11) || (step11 < 0 && _x >= limit11) ;_x = ((int)(0 + _x + step11))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 302;BA.debugLine="bc.GetARGB(x, y, clrs(x))";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_getargb",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_clrs.getArrayElement(false,BA.numberCast(int.class, _x))));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 304;BA.debugLine="SetAvg(bc, 1, y, clrs, temp)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdialog.class, "_setavg" /*RemoteObject*/ ,(Object)(_bc),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, _y)),(Object)(_clrs),(Object)(_temp));
 BA.debugLineNum = 305;BA.debugLine="m = 0";
Debug.JustUpdateDeviceLine();
_m = BA.numberCast(int.class, 0);Debug.locals.put("m", _m);
 BA.debugLineNum = 306;BA.debugLine="For x = 2 To bc.mWidth - 2";
Debug.JustUpdateDeviceLine();
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mwidth"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue();
_x = 2 ;
for (;(step16 > 0 && _x <= limit16) || (step16 < 0 && _x >= limit16) ;_x = ((int)(0 + _x + step16))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 307;BA.debugLine="bc.GetARGB(x + 1, y, clrs(m))";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_getargb",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.numberCast(int.class, _y)),(Object)(_clrs.getArrayElement(false,_m)));
 BA.debugLineNum = 308;BA.debugLine="m = (m + 1) Mod 3";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable(3)}, "%",0, 1);Debug.locals.put("m", _m);
 BA.debugLineNum = 309;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdialog.class, "_setavg" /*RemoteObject*/ ,(Object)(_bc),(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_clrs),(Object)(_temp));
 }
}Debug.locals.put("x", _x);
;
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 312;BA.debugLine="For x = 0 To bc.mWidth - 1";
Debug.JustUpdateDeviceLine();
{
final int step22 = 1;
final int limit22 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mwidth"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = 0 ;
for (;(step22 > 0 && _x <= limit22) || (step22 < 0 && _x >= limit22) ;_x = ((int)(0 + _x + step22))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 313;BA.debugLine="For y = 0 To 2";
Debug.JustUpdateDeviceLine();
{
final int step23 = 1;
final int limit23 = 2;
_y = 0 ;
for (;(step23 > 0 && _y <= limit23) || (step23 < 0 && _y >= limit23) ;_y = ((int)(0 + _y + step23))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 314;BA.debugLine="bc.GetARGB(x, y, clrs(y))";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_getargb",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_clrs.getArrayElement(false,BA.numberCast(int.class, _y))));
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 316;BA.debugLine="SetAvg(bc, x, 1, clrs, temp)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdialog.class, "_setavg" /*RemoteObject*/ ,(Object)(_bc),(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, 1)),(Object)(_clrs),(Object)(_temp));
 BA.debugLineNum = 317;BA.debugLine="m = 0";
Debug.JustUpdateDeviceLine();
_m = BA.numberCast(int.class, 0);Debug.locals.put("m", _m);
 BA.debugLineNum = 318;BA.debugLine="For y = 2 To bc.mHeight - 2";
Debug.JustUpdateDeviceLine();
{
final int step28 = 1;
final int limit28 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mheight"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue();
_y = 2 ;
for (;(step28 > 0 && _y <= limit28) || (step28 < 0 && _y >= limit28) ;_y = ((int)(0 + _y + step28))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 319;BA.debugLine="bc.GetARGB(x, y + 1, clrs(m))";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_getargb",(Object)(BA.numberCast(int.class, _x)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_y),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_clrs.getArrayElement(false,_m)));
 BA.debugLineNum = 320;BA.debugLine="m = (m + 1) Mod 3";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable(3)}, "%",0, 1);Debug.locals.put("m", _m);
 BA.debugLineNum = 321;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdialog.class, "_setavg" /*RemoteObject*/ ,(Object)(_bc),(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_clrs),(Object)(_temp));
 }
}Debug.locals.put("y", _y);
;
 }
}Debug.locals.put("x", _x);
;
 }
}Debug.locals.put("steps", _steps);
;
 BA.debugLineNum = 325;BA.debugLine="Return bc";
Debug.JustUpdateDeviceLine();
if (true) return _bc;
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button_Click (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,236);
if (RapidSub.canDelegate("button_click")) { return __ref.runUserSub(false, "b4xdialog","button_click", __ref);}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 236;BA.debugLine="Private Sub Button_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 237;BA.debugLine="Dim b As B4XView = Sender";
Debug.JustUpdateDeviceLine();
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), b4xdialog.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 238;BA.debugLine="If ButtonsState.GetDefault(b.Tag, True) = False T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_buttonsstate" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(_b.runMethod(false,"getTag")),(Object)((b4xdialog.__c.getField(true,"True")))),(b4xdialog.__c.getField(true,"False")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 239;BA.debugLine="Close(b.Tag)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdialog.class, "_close" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _b.runMethod(false,"getTag"))));
 BA.debugLineNum = 240;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
b4xdialog._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xdialog._xui);
 //BA.debugLineNum = 6;BA.debugLine="Public ButtonsHeight As Int = 40dip";
b4xdialog._buttonsheight = b4xdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)));__ref.setField("_buttonsheight",b4xdialog._buttonsheight);
 //BA.debugLineNum = 7;BA.debugLine="Public TitleBarHeight As Int = 30dip";
b4xdialog._titlebarheight = b4xdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)));__ref.setField("_titlebarheight",b4xdialog._titlebarheight);
 //BA.debugLineNum = 8;BA.debugLine="Private ButtonWidth As Int = 80dip";
b4xdialog._buttonwidth = b4xdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)));__ref.setField("_buttonwidth",b4xdialog._buttonwidth);
 //BA.debugLineNum = 9;BA.debugLine="Public Base As B4XView";
b4xdialog._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_base",b4xdialog._base);
 //BA.debugLineNum = 10;BA.debugLine="Public BackgroundColor As Int = 0xFF555555 'base";
b4xdialog._backgroundcolor = BA.numberCast(int.class, ((int)0xff555555));__ref.setField("_backgroundcolor",b4xdialog._backgroundcolor);
 //BA.debugLineNum = 11;BA.debugLine="Public OverlayColor As Int = 0xaa000000";
b4xdialog._overlaycolor = BA.numberCast(int.class, ((int)0xaa000000));__ref.setField("_overlaycolor",b4xdialog._overlaycolor);
 //BA.debugLineNum = 12;BA.debugLine="Public BorderColor As Int = 0xff000000";
b4xdialog._bordercolor = BA.numberCast(int.class, ((int)0xff000000));__ref.setField("_bordercolor",b4xdialog._bordercolor);
 //BA.debugLineNum = 13;BA.debugLine="Public BorderCornersRadius As Int = 2dip";
b4xdialog._bordercornersradius = b4xdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)));__ref.setField("_bordercornersradius",b4xdialog._bordercornersradius);
 //BA.debugLineNum = 14;BA.debugLine="Public BorderWidth As Int = 2dip";
b4xdialog._borderwidth = b4xdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)));__ref.setField("_borderwidth",b4xdialog._borderwidth);
 //BA.debugLineNum = 15;BA.debugLine="Public ButtonsColor As Int = 0xFF555555";
b4xdialog._buttonscolor = BA.numberCast(int.class, ((int)0xff555555));__ref.setField("_buttonscolor",b4xdialog._buttonscolor);
 //BA.debugLineNum = 16;BA.debugLine="Public ButtonsTextColor As Int = 0xFF89D5FF";
b4xdialog._buttonstextcolor = BA.numberCast(int.class, ((int)0xff89d5ff));__ref.setField("_buttonstextcolor",b4xdialog._buttonstextcolor);
 //BA.debugLineNum = 17;BA.debugLine="Private Background As B4XView";
b4xdialog._background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_background",b4xdialog._background);
 //BA.debugLineNum = 18;BA.debugLine="Private BlurImageView As B4XView";
b4xdialog._blurimageview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_blurimageview",b4xdialog._blurimageview);
 //BA.debugLineNum = 19;BA.debugLine="Public BlurBackground As Boolean";
b4xdialog._blurbackground = RemoteObject.createImmutable(false);__ref.setField("_blurbackground",b4xdialog._blurbackground);
 //BA.debugLineNum = 20;BA.debugLine="Private BlurReduceScale As Int";
b4xdialog._blurreducescale = RemoteObject.createImmutable(0);__ref.setField("_blurreducescale",b4xdialog._blurreducescale);
 //BA.debugLineNum = 21;BA.debugLine="Public mParent As B4XView";
b4xdialog._mparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mparent",b4xdialog._mparent);
 //BA.debugLineNum = 22;BA.debugLine="Public Title As Object = \"\"";
b4xdialog._title = RemoteObject.createImmutable((""));__ref.setField("_title",b4xdialog._title);
 //BA.debugLineNum = 23;BA.debugLine="Public TitleBarColor As Int = 0xFF0083B8";
b4xdialog._titlebarcolor = BA.numberCast(int.class, ((int)0xff0083b8));__ref.setField("_titlebarcolor",b4xdialog._titlebarcolor);
 //BA.debugLineNum = 24;BA.debugLine="Public TitleBarTextColor As Int";
b4xdialog._titlebartextcolor = RemoteObject.createImmutable(0);__ref.setField("_titlebartextcolor",b4xdialog._titlebartextcolor);
 //BA.debugLineNum = 25;BA.debugLine="Public BodyTextColor As Int = xui.Color_White";
b4xdialog._bodytextcolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White");__ref.setField("_bodytextcolor",b4xdialog._bodytextcolor);
 //BA.debugLineNum = 26;BA.debugLine="Public TitleBar As B4XView";
b4xdialog._titlebar = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_titlebar",b4xdialog._titlebar);
 //BA.debugLineNum = 27;BA.debugLine="Public PutAtTop As Boolean";
b4xdialog._putattop = RemoteObject.createImmutable(false);__ref.setField("_putattop",b4xdialog._putattop);
 //BA.debugLineNum = 28;BA.debugLine="Public TitleBarFont As B4XFont";
b4xdialog._titlebarfont = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");__ref.setField("_titlebarfont",b4xdialog._titlebarfont);
 //BA.debugLineNum = 29;BA.debugLine="Public ButtonsFont As B4XFont";
b4xdialog._buttonsfont = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");__ref.setField("_buttonsfont",b4xdialog._buttonsfont);
 //BA.debugLineNum = 30;BA.debugLine="Public ButtonsTextColorDisabled As Int = 0xFF8080";
b4xdialog._buttonstextcolordisabled = BA.numberCast(int.class, ((int)0xff808080));__ref.setField("_buttonstextcolordisabled",b4xdialog._buttonstextcolordisabled);
 //BA.debugLineNum = 31;BA.debugLine="Public VisibleAnimationDuration As Int = 100";
b4xdialog._visibleanimationduration = BA.numberCast(int.class, 100);__ref.setField("_visibleanimationduration",b4xdialog._visibleanimationduration);
 //BA.debugLineNum = 32;BA.debugLine="Public ButtonsOrder() As Int = Array As Int(xui.D";
b4xdialog._buttonsorder = RemoteObject.createNewArray("int",new int[] {3},new Object[] {__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive"),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Negative"),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")});__ref.setField("_buttonsorder",b4xdialog._buttonsorder);
 //BA.debugLineNum = 33;BA.debugLine="Public ButtonsState As Map";
b4xdialog._buttonsstate = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_buttonsstate",b4xdialog._buttonsstate);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _close(RemoteObject __ref,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("Close (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,242);
if (RapidSub.canDelegate("close")) { return __ref.runUserSub(false, "b4xdialog","close", __ref, _result);}
Debug.locals.put("Result", _result);
 BA.debugLineNum = 242;BA.debugLine="Public Sub Close (Result As Int) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 243;BA.debugLine="If getVisible Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (b4j.example.b4xdialog.class, "_getvisible" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 244;BA.debugLine="CallSubDelayed2(Me, \"CloseMessage\", Result)";
Debug.JustUpdateDeviceLine();
b4xdialog.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("CloseMessage")),(Object)((_result)));
 BA.debugLineNum = 245;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return b4xdialog.__c.getField(true,"True");
 };
 BA.debugLineNum = 247;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return b4xdialog.__c.getField(true,"False");
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createbutton(RemoteObject __ref,RemoteObject _text,RemoteObject _code) throws Exception{
try {
		Debug.PushSubsStack("CreateButton (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("createbutton")) { return __ref.runUserSub(false, "b4xdialog","createbutton", __ref, _text, _code);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
RemoteObject _xbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _numberofbuttons = RemoteObject.createImmutable(0);
Debug.locals.put("Text", _text);
Debug.locals.put("Code", _code);
 BA.debugLineNum = 196;BA.debugLine="Private Sub CreateButton (Text As Object, Code As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 197;BA.debugLine="If Text = \"\" Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_text,RemoteObject.createImmutable(("")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 199;BA.debugLine="Dim btn As Button";
Debug.JustUpdateDeviceLine();
_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 203;BA.debugLine="btn.Initialize(\"Button\")";
Debug.JustUpdateDeviceLine();
_btn.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Button")));
 BA.debugLineNum = 204;BA.debugLine="Dim xbtn As B4XView = btn";
Debug.JustUpdateDeviceLine();
_xbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xbtn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _btn.getObject());Debug.locals.put("xbtn", _xbtn);Debug.locals.put("xbtn", _xbtn);
 BA.debugLineNum = 205;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(xbtn, Tex";
Debug.JustUpdateDeviceLine();
b4xdialog._xuiviewsutils.runVoidMethod ("_settextorcsbuildertolabel" /*RemoteObject*/ ,(Object)(_xbtn),(Object)(_text));
 BA.debugLineNum = 206;BA.debugLine="xbtn.Tag = Code";
Debug.JustUpdateDeviceLine();
_xbtn.runMethod(false,"setTag",(_code));
 BA.debugLineNum = 207;BA.debugLine="xbtn.SetColorAndBorder(ButtonsColor, 0dip, Border";
Debug.JustUpdateDeviceLine();
_xbtn.runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_buttonscolor" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, b4xdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))))),(Object)(__ref.getField(true,"_bordercolor" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, b4xdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))));
 BA.debugLineNum = 208;BA.debugLine="xbtn.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.JustUpdateDeviceLine();
_xbtn.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 209;BA.debugLine="xbtn.TextColor = ButtonsTextColor";
Debug.JustUpdateDeviceLine();
_xbtn.runMethod(true,"setTextColor",__ref.getField(true,"_buttonstextcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 210;BA.debugLine="xbtn.Font = ButtonsFont";
Debug.JustUpdateDeviceLine();
_xbtn.runMethod(false,"setFont",__ref.getField(false,"_buttonsfont" /*RemoteObject*/ ));
 BA.debugLineNum = 211;BA.debugLine="Dim numberOfButtons As Int = Base.NumberOfViews '";
Debug.JustUpdateDeviceLine();
_numberofbuttons = __ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews");Debug.locals.put("numberOfButtons", _numberofbuttons);Debug.locals.put("numberOfButtons", _numberofbuttons);
 BA.debugLineNum = 212;BA.debugLine="Base.AddView(xbtn, Base.Width - 4dip - numberOfBu";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_base" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_xbtn.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),b4xdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4))),_numberofbuttons,(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_buttonwidth" /*RemoteObject*/ ),b4xdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "+",1, 1)),__ref.getField(true,"_buttonwidth" /*RemoteObject*/ )}, "--*-",3, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_buttonsheight" /*RemoteObject*/ ),b4xdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "--",2, 0)),(Object)(BA.numberCast(double.class, __ref.getField(true,"_buttonwidth" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_buttonsheight" /*RemoteObject*/ ))));
 BA.debugLineNum = 214;BA.debugLine="If Code = xui.DialogResponse_Cancel Then xbtn.Req";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_code,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")))) { 
_xbtn.runVoidMethod ("RequestFocus");};
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbutton(RemoteObject __ref,RemoteObject _resultcode) throws Exception{
try {
		Debug.PushSubsStack("GetButton (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,218);
if (RapidSub.canDelegate("getbutton")) { return __ref.runUserSub(false, "b4xdialog","getbutton", __ref, _resultcode);}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("ResultCode", _resultcode);
 BA.debugLineNum = 218;BA.debugLine="Public Sub GetButton (ResultCode As Int) As B4XVie";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 219;BA.debugLine="For Each b As B4XView In Base.GetAllViewsRecursiv";
Debug.JustUpdateDeviceLine();
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group1 = __ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(false,"GetAllViewsRecursive");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group1.runMethod(false,"Get",index1));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 220;BA.debugLine="If b.Tag = ResultCode Then Return b 'ignore";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b.runMethod(false,"getTag"),(_resultcode))) { 
if (true) return _b;};
 }
}Debug.locals.put("b", _b);
;
 BA.debugLineNum = 222;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), b4xdialog.__c.getField(false,"Null"));
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvisible(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getVisible (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,192);
if (RapidSub.canDelegate("getvisible")) { return __ref.runUserSub(false, "b4xdialog","getvisible", __ref);}
 BA.debugLineNum = 192;BA.debugLine="Public Sub getVisible As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 193;BA.debugLine="Return Background.IsInitialized And Background.Pa";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(true,"IsInitialized")));
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xdialog","initialize", __ref, _ba, _parent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _node = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _stylesheets = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("ba", _ba);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 36;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 37;BA.debugLine="BlurBackground = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_blurbackground" /*RemoteObject*/ ,b4xdialog.__c.getField(true,"False"));
 BA.debugLineNum = 38;BA.debugLine="If xui.IsB4i Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 39;BA.debugLine="BlurReduceScale = 3";
Debug.JustUpdateDeviceLine();
__ref.setField ("_blurreducescale" /*RemoteObject*/ ,BA.numberCast(int.class, 3));
 }else 
{ BA.debugLineNum = 40;BA.debugLine="Else If xui.IsB4J Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 41;BA.debugLine="BlurReduceScale = 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_blurreducescale" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 }else 
{ BA.debugLineNum = 42;BA.debugLine="Else if xui.IsB4A Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 43;BA.debugLine="BlurReduceScale = 3";
Debug.JustUpdateDeviceLine();
__ref.setField ("_blurreducescale" /*RemoteObject*/ ,BA.numberCast(int.class, 3));
 }}}
;
 BA.debugLineNum = 45;BA.debugLine="mParent = Parent";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mparent" /*RemoteObject*/ ,_parent);
 BA.debugLineNum = 47;BA.debugLine="Dim node As JavaObject = mParent";
Debug.JustUpdateDeviceLine();
_node = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_node = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_mparent" /*RemoteObject*/ ).getObject());Debug.locals.put("node", _node);Debug.locals.put("node", _node);
 BA.debugLineNum = 48;BA.debugLine="Dim stylesheets As List = node.RunMethodJO(\"getSc";
Debug.JustUpdateDeviceLine();
_stylesheets = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_stylesheets = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _node.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getScene")),(Object)((b4xdialog.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getStylesheets")),(Object)((b4xdialog.__c.getField(false,"Null")))));Debug.locals.put("stylesheets", _stylesheets);Debug.locals.put("stylesheets", _stylesheets);
 BA.debugLineNum = 49;BA.debugLine="stylesheets.Add(File.GetUri(File.DirAssets, \"Dial";
Debug.JustUpdateDeviceLine();
_stylesheets.runVoidMethod ("Add",(Object)((b4xdialog.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(b4xdialog.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("Dialog.css"))))));
 BA.debugLineNum = 51;BA.debugLine="TitleBarFont = xui.CreateDefaultBoldFont(16)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, 16))));
 BA.debugLineNum = 52;BA.debugLine="ButtonsFont = xui.CreateDefaultBoldFont(15)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, 15))));
 BA.debugLineNum = 53;BA.debugLine="TitleBarTextColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
__ref.setField ("_titlebartextcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 54;BA.debugLine="ButtonsState.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_buttonsstate" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _internaladdstubtoclvifneeded(RemoteObject __ref,RemoteObject _customlistview1,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("InternalAddStubToCLVIfNeeded (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,346);
if (RapidSub.canDelegate("internaladdstubtoclvifneeded")) { return __ref.runUserSub(false, "b4xdialog","internaladdstubtoclvifneeded", __ref, _customlistview1, _color);}
Debug.locals.put("CustomListView1", _customlistview1);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 346;BA.debugLine="Public Sub InternalAddStubToCLVIfNeeded(CustomList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 347;BA.debugLine="XUIViewsUtils.AddStubToCLVIfNeeded(CustomListView";
Debug.JustUpdateDeviceLine();
b4xdialog._xuiviewsutils.runVoidMethod ("_addstubtoclvifneeded" /*RemoteObject*/ ,(Object)(_customlistview1),(Object)(_color));
 BA.debugLineNum = 348;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _internalsettextorcsbuildertolabel(RemoteObject __ref,RemoteObject _xlbl,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("InternalSetTextOrCSBuilderToLabel (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,342);
if (RapidSub.canDelegate("internalsettextorcsbuildertolabel")) { return __ref.runUserSub(false, "b4xdialog","internalsettextorcsbuildertolabel", __ref, _xlbl, _text);}
Debug.locals.put("xlbl", _xlbl);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 342;BA.debugLine="Public Sub InternalSetTextOrCSBuilderToLabel(xlbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 343;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(xlbl, Tex";
Debug.JustUpdateDeviceLine();
b4xdialog._xuiviewsutils.runVoidMethod ("_settextorcsbuildertolabel" /*RemoteObject*/ ,(Object)(_xlbl),(Object)(_text));
 BA.debugLineNum = 344;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Resize (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,266);
if (RapidSub.canDelegate("resize")) { return __ref.runUserSub(false, "b4xdialog","resize", __ref, _width, _height);}
RemoteObject _top = RemoteObject.createImmutable(0);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 266;BA.debugLine="Public Sub Resize (Width As Int, Height As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 268;BA.debugLine="Dim Top As Int = Round(Background.Height / 2 - Ba";
Debug.JustUpdateDeviceLine();
_top = BA.numberCast(int.class, b4xdialog.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/-/",1, 0))));Debug.locals.put("Top", _top);Debug.locals.put("Top", _top);
 BA.debugLineNum = 269;BA.debugLine="If PutAtTop Then Top = 20dip";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_putattop" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_top = b4xdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)));Debug.locals.put("Top", _top);};
 BA.debugLineNum = 270;BA.debugLine="Background.SetLayoutAnimated(0, 0, 0, Width, Heig";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, _height)));
 BA.debugLineNum = 271;BA.debugLine="Base.SetLayoutAnimated(200, Round(Background.Widt";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_base" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(double.class, b4xdialog.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/-/",1, 0))))),(Object)(BA.numberCast(double.class, _top)),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 272;BA.debugLine="If xui.IsB4J Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 273;BA.debugLine="UpdateBlur";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdialog.class, "_updateblur" /*RemoteObject*/ );
 };
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setavg(RemoteObject __ref,RemoteObject _bc,RemoteObject _x,RemoteObject _y,RemoteObject _clrs,RemoteObject _temp) throws Exception{
try {
		Debug.PushSubsStack("SetAvg (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,328);
if (RapidSub.canDelegate("setavg")) { return __ref.runUserSub(false, "b4xdialog","setavg", __ref, _bc, _x, _y, _clrs, _temp);}
RemoteObject _c = RemoteObject.declareNull("b4j.example.bitmapcreator._argbcolor");
Debug.locals.put("bc", _bc);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("clrs", _clrs);
Debug.locals.put("temp", _temp);
 BA.debugLineNum = 328;BA.debugLine="Private Sub SetAvg(bc As BitmapCreator, x As Int,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 329;BA.debugLine="temp.Initialize";
Debug.JustUpdateDeviceLine();
_temp.runVoidMethod ("Initialize");
 BA.debugLineNum = 330;BA.debugLine="For Each c As ARGBColor In clrs";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _clrs;
final int groupLen2 = group2.getField(true,"length").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_c = group2.getArrayElement(false,RemoteObject.createImmutable(index2));Debug.locals.put("c", _c);
Debug.locals.put("c", _c);
 BA.debugLineNum = 331;BA.debugLine="temp.r = temp.r + c.r";
Debug.JustUpdateDeviceLine();
_temp.setField ("r",RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"r"),_c.getField(true,"r")}, "+",1, 1));
 BA.debugLineNum = 332;BA.debugLine="temp.g = temp.g + c.g";
Debug.JustUpdateDeviceLine();
_temp.setField ("g",RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"g"),_c.getField(true,"g")}, "+",1, 1));
 BA.debugLineNum = 333;BA.debugLine="temp.b = temp.b + c.b";
Debug.JustUpdateDeviceLine();
_temp.setField ("b",RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"b"),_c.getField(true,"b")}, "+",1, 1));
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 335;BA.debugLine="temp.a = 255";
Debug.JustUpdateDeviceLine();
_temp.setField ("a",BA.numberCast(int.class, 255));
 BA.debugLineNum = 336;BA.debugLine="temp.r = temp.r / 3";
Debug.JustUpdateDeviceLine();
_temp.setField ("r",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"r"),RemoteObject.createImmutable(3)}, "/",0, 0)));
 BA.debugLineNum = 337;BA.debugLine="temp.g = temp.g / 3";
Debug.JustUpdateDeviceLine();
_temp.setField ("g",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"g"),RemoteObject.createImmutable(3)}, "/",0, 0)));
 BA.debugLineNum = 338;BA.debugLine="temp.b = temp.b / 3";
Debug.JustUpdateDeviceLine();
_temp.setField ("b",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"b"),RemoteObject.createImmutable(3)}, "/",0, 0)));
 BA.debugLineNum = 339;BA.debugLine="bc.SetARGB(x, y, temp)";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_setargb",(Object)(_x),(Object)(_y),(Object)(_temp));
 BA.debugLineNum = 340;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbuttonstate(RemoteObject __ref,RemoteObject _resultcode,RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("SetButtonState (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("setbuttonstate")) { return __ref.runUserSub(false, "b4xdialog","setbuttonstate", __ref, _resultcode, _enabled);}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("ResultCode", _resultcode);
Debug.locals.put("Enabled", _enabled);
 BA.debugLineNum = 226;BA.debugLine="Public Sub SetButtonState (ResultCode As Int, Enab";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 227;BA.debugLine="Dim b As B4XView = GetButton(ResultCode)";
Debug.JustUpdateDeviceLine();
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_b = __ref.runClassMethod (b4j.example.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(_resultcode));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 228;BA.debugLine="If b.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_b.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 229;BA.debugLine="b.Enabled = Enabled";
Debug.JustUpdateDeviceLine();
_b.runMethod(true,"setEnabled",_enabled);
 BA.debugLineNum = 230;BA.debugLine="If Enabled Then b.TextColor = ButtonsTextColor E";
Debug.JustUpdateDeviceLine();
if (_enabled.<Boolean>get().booleanValue()) { 
_b.runMethod(true,"setTextColor",__ref.getField(true,"_buttonstextcolor" /*RemoteObject*/ ));}
else {
_b.runMethod(true,"setTextColor",__ref.getField(true,"_buttonstextcolordisabled" /*RemoteObject*/ ));};
 BA.debugLineNum = 231;BA.debugLine="ButtonsState.Put(ResultCode, Enabled)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_buttonsstate" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_resultcode)),(Object)((_enabled)));
 };
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _text,RemoteObject _yes,RemoteObject _no,RemoteObject _cancel) throws Exception{
try {
		Debug.PushSubsStack("Show (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "b4xdialog","show", __ref, _text, _yes, _no, _cancel);}
ResumableSub_Show rsub = new ResumableSub_Show(null,__ref,_text,_yes,_no,_cancel);
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
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.example.b4xdialog parent,RemoteObject __ref,RemoteObject _text,RemoteObject _yes,RemoteObject _no,RemoteObject _cancel) {
this.parent = parent;
this.__ref = __ref;
this._text = _text;
this._yes = _yes;
this._no = _no;
this._cancel = _cancel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xdialog parent;
RemoteObject _text;
RemoteObject _yes;
RemoteObject _no;
RemoteObject _cancel;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,74);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Text", _text);
Debug.locals.put("Yes", _yes);
Debug.locals.put("No", _no);
Debug.locals.put("Cancel", _cancel);
 BA.debugLineNum = 75;BA.debugLine="Dim p As B4XView";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 76;BA.debugLine="p = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);
 BA.debugLineNum = 77;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 300dip, 100dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))))));
 BA.debugLineNum = 78;BA.debugLine="Dim lbl As Label";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 79;BA.debugLine="lbl.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 81;BA.debugLine="lbl.WrapText = True";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(true,"setWrapText",parent.__c.getField(true,"True"));
 BA.debugLineNum = 87;BA.debugLine="Dim xlbl As B4XView = lbl";
Debug.JustUpdateDeviceLine();
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("xlbl", _xlbl);Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 88;BA.debugLine="p.AddView(xlbl, 5dip, 0, p.Width - 10dip, p.Heigh";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("AddView",(Object)((_xlbl.getObject())),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 0)),(Object)(_p.runMethod(true,"getHeight")));
 BA.debugLineNum = 89;BA.debugLine="xlbl.TextColor = BodyTextColor";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setTextColor",__ref.getField(true,"_bodytextcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 90;BA.debugLine="xlbl.Font = TitleBarFont";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(false,"setFont",__ref.getField(false,"_titlebarfont" /*RemoteObject*/ ));
 BA.debugLineNum = 91;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(xlbl, Tex";
Debug.JustUpdateDeviceLine();
parent._xuiviewsutils.runVoidMethod ("_settextorcsbuildertolabel" /*RemoteObject*/ ,(Object)(_xlbl),(Object)(_text));
 BA.debugLineNum = 92;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"LEFT\")";
Debug.JustUpdateDeviceLine();
_xlbl.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("LEFT")));
 BA.debugLineNum = 93;BA.debugLine="Wait For (ShowCustom(p, Yes, No, Cancel)) Complet";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xdialog", "show"), __ref.runClassMethod (b4j.example.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(_yes),(Object)(_no),(Object)(_cancel)));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 94;BA.debugLine="Return Result";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_result));return;};
 BA.debugLineNum = 95;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _showcustom(RemoteObject __ref,RemoteObject _content,RemoteObject _yes,RemoteObject _no,RemoteObject _cancel) throws Exception{
try {
		Debug.PushSubsStack("ShowCustom (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("showcustom")) { return __ref.runUserSub(false, "b4xdialog","showcustom", __ref, _content, _yes, _no, _cancel);}
ResumableSub_ShowCustom rsub = new ResumableSub_ShowCustom(null,__ref,_content,_yes,_no,_cancel);
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
public static class ResumableSub_ShowCustom extends BA.ResumableSub {
public ResumableSub_ShowCustom(b4j.example.b4xdialog parent,RemoteObject __ref,RemoteObject _content,RemoteObject _yes,RemoteObject _no,RemoteObject _cancel) {
this.parent = parent;
this.__ref = __ref;
this._content = _content;
this._yes = _yes;
this._no = _no;
this._cancel = _cancel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xdialog parent;
RemoteObject _content;
RemoteObject _yes;
RemoteObject _no;
RemoteObject _cancel;
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
RemoteObject _includetitle = RemoteObject.createImmutable(false);
RemoteObject _temptitlebarheight = RemoteObject.createImmutable(0);
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _width = RemoteObject.createImmutable(0);
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _removetitle = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject _btype = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject group1;
int index1;
int groupLen1;
int step47;
int limit47;
RemoteObject group75;
int index75;
int groupLen75;
RemoteObject group79;
int index79;
int groupLen79;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ShowCustom (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,97);
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
Debug.locals.put("Content", _content);
Debug.locals.put("Yes", _yes);
Debug.locals.put("No", _no);
Debug.locals.put("Cancel", _cancel);
 BA.debugLineNum = 98;BA.debugLine="For Each v As B4XView In mParent.GetAllViewsRecur";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//for
this.state = 8;
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
group1 = __ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(false,"GetAllViewsRecursive");
index1 = 0;
groupLen1 = group1.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("v", _v);
this.state = 63;
if (true) break;

case 63:
//C
this.state = 8;
if (index1 < groupLen1) {
this.state = 3;
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group1.runMethod(false,"Get",index1));Debug.locals.put("v", _v);}
if (true) break;

case 64:
//C
this.state = 63;
index1++;
Debug.locals.put("v", _v);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 99;BA.debugLine="If v.Tag <> Null And v.Tag = \"b4xdialog_backgrou";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("N",_v.runMethod(false,"getTag")) && RemoteObject.solveBoolean("=",_v.runMethod(false,"getTag"),RemoteObject.createImmutable(("b4xdialog_background")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 100;BA.debugLine="v.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_v.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 101;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
this.state = 8;
if (true) break;
 if (true) break;

case 7:
//C
this.state = 64;
;
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
Debug.locals.put("v", _v);
;
 BA.debugLineNum = 104;BA.debugLine="ButtonsState.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_buttonsstate" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 105;BA.debugLine="Dim Background As B4XView = xui.CreatePanel(\"back";
Debug.JustUpdateDeviceLine();
parent._background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
parent._background = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("background")));__ref.setField("_background",parent._background);
 BA.debugLineNum = 106;BA.debugLine="Background.Tag = \"b4xdialog_background\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("b4xdialog_background")));
 BA.debugLineNum = 107;BA.debugLine="If BlurBackground Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 9:
//if
this.state = 14;
if (__ref.getField(true,"_blurbackground" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 108;BA.debugLine="Dim iv As ImageView";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 109;BA.debugLine="iv.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_iv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 110;BA.debugLine="BlurImageView = iv";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_blurimageview" /*RemoteObject*/ ).setObject (_iv.getObject());
 BA.debugLineNum = 111;BA.debugLine="Background.AddView(BlurImageView, 0, 0, Backgrou";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_blurimageview" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 112;BA.debugLine="Background.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 114;BA.debugLine="Background.Color = OverlayColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_overlaycolor" /*RemoteObject*/ ));
 if (true) break;
;
 BA.debugLineNum = 120;BA.debugLine="If mParent.Width = 0 Or mParent.Height = 0 Then";
Debug.JustUpdateDeviceLine();

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight"),BA.numberCast(double.class, 0))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 121;BA.debugLine="Log(\"Warning: dialog shown with zero sized paren";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","926017816",RemoteObject.createImmutable("Warning: dialog shown with zero sized parent."),0);
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 123;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mparent" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_background" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 124;BA.debugLine="UpdateBlur";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdialog.class, "_updateblur" /*RemoteObject*/ );
 BA.debugLineNum = 125;BA.debugLine="Base = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_base" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 126;BA.debugLine="Base.SetColorAndBorder(BackgroundColor, BorderWid";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_base" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_backgroundcolor" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, __ref.getField(true,"_borderwidth" /*RemoteObject*/ ))),(Object)(__ref.getField(true,"_bordercolor" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, __ref.getField(true,"_bordercornersradius" /*RemoteObject*/ ))));
 BA.debugLineNum = 127;BA.debugLine="Base.RequestFocus";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_base" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 BA.debugLineNum = 128;BA.debugLine="Dim IncludeTitle As Boolean = Title <> \"\"";
Debug.JustUpdateDeviceLine();
_includetitle = BA.ObjectToBoolean(RemoteObject.solveBoolean("!",__ref.getField(false,"_title" /*RemoteObject*/ ),RemoteObject.createImmutable((""))));Debug.locals.put("IncludeTitle", _includetitle);Debug.locals.put("IncludeTitle", _includetitle);
 BA.debugLineNum = 129;BA.debugLine="Dim TempTitleBarHeight As Int = 0";
Debug.JustUpdateDeviceLine();
_temptitlebarheight = BA.numberCast(int.class, 0);Debug.locals.put("TempTitleBarHeight", _temptitlebarheight);Debug.locals.put("TempTitleBarHeight", _temptitlebarheight);
 BA.debugLineNum = 130;BA.debugLine="If IncludeTitle Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 18:
//if
this.state = 21;
if (_includetitle.<Boolean>get().booleanValue()) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 131;BA.debugLine="TempTitleBarHeight = TitleBarHeight";
Debug.JustUpdateDeviceLine();
_temptitlebarheight = __ref.getField(true,"_titlebarheight" /*RemoteObject*/ );Debug.locals.put("TempTitleBarHeight", _temptitlebarheight);
 if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 133;BA.debugLine="Dim height As Int = Content.Height + ButtonsHeigh";
Debug.JustUpdateDeviceLine();
_height = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_content.runMethod(true,"getHeight"),__ref.getField(true,"_buttonsheight" /*RemoteObject*/ ),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))),_temptitlebarheight}, "++++",4, 0));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 134;BA.debugLine="Dim width As Int = Content.Width + 4dip";
Debug.JustUpdateDeviceLine();
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_content.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 0));Debug.locals.put("width", _width);Debug.locals.put("width", _width);
 BA.debugLineNum = 135;BA.debugLine="Dim Top As Int = Round(Background.Height / 2 - he";
Debug.JustUpdateDeviceLine();
_top = BA.numberCast(int.class, parent.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_height,RemoteObject.createImmutable(2)}, "/-/",1, 0))));Debug.locals.put("Top", _top);Debug.locals.put("Top", _top);
 BA.debugLineNum = 136;BA.debugLine="Dim RemoveTitle As Boolean";
Debug.JustUpdateDeviceLine();
_removetitle = RemoteObject.createImmutable(false);Debug.locals.put("RemoveTitle", _removetitle);
 BA.debugLineNum = 137;BA.debugLine="If PutAtTop Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 22:
//if
this.state = 31;
if (__ref.getField(true,"_putattop" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 138;BA.debugLine="Top = 20dip";
Debug.JustUpdateDeviceLine();
_top = parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)));Debug.locals.put("Top", _top);
 BA.debugLineNum = 139;BA.debugLine="If Background.Height - Top - height < 200dip The";
Debug.JustUpdateDeviceLine();
if (true) break;

case 25:
//if
this.state = 30;
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),_top,_height}, "--",2, 0),BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))))) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
_removetitle = parent.__c.getField(true,"True");Debug.locals.put("RemoveTitle", _removetitle);
if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;
;
 BA.debugLineNum = 141;BA.debugLine="If RemoveTitle Or Background.Height < height Then";
Debug.JustUpdateDeviceLine();

case 31:
//if
this.state = 34;
if (RemoteObject.solveBoolean(".",_removetitle) || RemoteObject.solveBoolean("<",__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),BA.numberCast(double.class, _height))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 142;BA.debugLine="Top = 1dip";
Debug.JustUpdateDeviceLine();
_top = parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Top", _top);
 BA.debugLineNum = 143;BA.debugLine="IncludeTitle = False";
Debug.JustUpdateDeviceLine();
_includetitle = parent.__c.getField(true,"False");Debug.locals.put("IncludeTitle", _includetitle);
 BA.debugLineNum = 144;BA.debugLine="height = height - TempTitleBarHeight - 3dip";
Debug.JustUpdateDeviceLine();
_height = RemoteObject.solve(new RemoteObject[] {_height,_temptitlebarheight,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "--",2, 1);Debug.locals.put("height", _height);
 BA.debugLineNum = 145;BA.debugLine="TempTitleBarHeight = 0";
Debug.JustUpdateDeviceLine();
_temptitlebarheight = BA.numberCast(int.class, 0);Debug.locals.put("TempTitleBarHeight", _temptitlebarheight);
 if (true) break;

case 34:
//C
this.state = 35;
;
 BA.debugLineNum = 147;BA.debugLine="Background.AddView(Base, Round(Background.Width /";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_base" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2),_width,RemoteObject.createImmutable(2)}, "/-/",1, 0))))),(Object)(BA.numberCast(double.class, _top)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"Round",(Object)(BA.numberCast(double.class, _width))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"Round",(Object)(BA.numberCast(double.class, _height))))));
 BA.debugLineNum = 149;BA.debugLine="For i = ButtonsOrder.Length - 1 To 0 Step - 1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 35:
//for
this.state = 46;
step47 = -1;
limit47 = 0;
_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_buttonsorder" /*RemoteObject*/ ).getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
Debug.locals.put("i", _i);
this.state = 65;
if (true) break;

case 65:
//C
this.state = 46;
if ((step47 > 0 && _i <= limit47) || (step47 < 0 && _i >= limit47)) this.state = 37;
if (true) break;

case 66:
//C
this.state = 65;
_i = ((int)(0 + _i + step47)) ;
Debug.locals.put("i", _i);
if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 150;BA.debugLine="Dim btype As Int = ButtonsOrder(i)";
Debug.JustUpdateDeviceLine();
_btype = __ref.getField(false,"_buttonsorder" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i));Debug.locals.put("btype", _btype);Debug.locals.put("btype", _btype);
 BA.debugLineNum = 151;BA.debugLine="Select btype";
Debug.JustUpdateDeviceLine();
if (true) break;

case 38:
//select
this.state = 45;
switch (BA.switchObjectToInt(_btype,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel"),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Negative"),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive"))) {
case 0: {
this.state = 40;
if (true) break;
}
case 1: {
this.state = 42;
if (true) break;
}
case 2: {
this.state = 44;
if (true) break;
}
}
if (true) break;

case 40:
//C
this.state = 45;
 BA.debugLineNum = 153;BA.debugLine="CreateButton(Cancel, btype)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdialog.class, "_createbutton" /*RemoteObject*/ ,(Object)(_cancel),(Object)(_btype));
 if (true) break;

case 42:
//C
this.state = 45;
 BA.debugLineNum = 155;BA.debugLine="CreateButton(No, btype)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdialog.class, "_createbutton" /*RemoteObject*/ ,(Object)(_no),(Object)(_btype));
 if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 157;BA.debugLine="CreateButton(Yes, btype)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.b4xdialog.class, "_createbutton" /*RemoteObject*/ ,(Object)(_yes),(Object)(_btype));
 if (true) break;

case 45:
//C
this.state = 66;
;
 if (true) break;
if (true) break;

case 46:
//C
this.state = 47;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 160;BA.debugLine="Base.Visible = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 161;BA.debugLine="If IncludeTitle Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 47:
//if
this.state = 50;
if (_includetitle.<Boolean>get().booleanValue()) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 162;BA.debugLine="TitleBar = xui.CreatePanel(\"TitleBar\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_titlebar" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("TitleBar"))));
 BA.debugLineNum = 163;BA.debugLine="TitleBar.Color = TitleBarColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_titlebarcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 164;BA.debugLine="Base.AddView(TitleBar, 2dip, 2dip, Content.Width";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_base" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_titlebar" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(_content.runMethod(true,"getWidth")),(Object)(BA.numberCast(double.class, _temptitlebarheight)));
 BA.debugLineNum = 165;BA.debugLine="Dim lbl As Label";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 166;BA.debugLine="lbl.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 167;BA.debugLine="Dim xlbl As B4XView = lbl";
Debug.JustUpdateDeviceLine();
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("xlbl", _xlbl);Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 168;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(xlbl, Ti";
Debug.JustUpdateDeviceLine();
parent._xuiviewsutils.runVoidMethod ("_settextorcsbuildertolabel" /*RemoteObject*/ ,(Object)(_xlbl),(Object)(__ref.getField(false,"_title" /*RemoteObject*/ )));
 BA.debugLineNum = 169;BA.debugLine="xlbl.TextColor = TitleBarTextColor";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setTextColor",__ref.getField(true,"_titlebartextcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 170;BA.debugLine="xlbl.Font = TitleBarFont";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(false,"setFont",__ref.getField(false,"_titlebarfont" /*RemoteObject*/ ));
 BA.debugLineNum = 171;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.JustUpdateDeviceLine();
_xlbl.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 172;BA.debugLine="TitleBar.AddView(xlbl, 0, 0, TitleBar.Width, Tit";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_titlebar" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_xlbl.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 if (true) break;

case 50:
//C
this.state = 51;
;
 BA.debugLineNum = 174;BA.debugLine="Content.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_content.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 175;BA.debugLine="Base.AddView(Content, 2dip, 2dip + TempTitleBarHe";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_base" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_content.getObject())),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))),_temptitlebarheight}, "+",1, 1))),(Object)(_content.runMethod(true,"getWidth")),(Object)(_content.runMethod(true,"getHeight")));
 BA.debugLineNum = 176;BA.debugLine="Base.SetVisibleAnimated(VisibleAnimationDuration,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_base" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_visibleanimationduration" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 177;BA.debugLine="For Each v As B4XView In Background.GetAllViewsRe";
Debug.JustUpdateDeviceLine();
if (true) break;

case 51:
//for
this.state = 54;
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
group75 = __ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(false,"GetAllViewsRecursive");
index75 = 0;
groupLen75 = group75.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("v", _v);
this.state = 67;
if (true) break;

case 67:
//C
this.state = 54;
if (index75 < groupLen75) {
this.state = 53;
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group75.runMethod(false,"Get",index75));Debug.locals.put("v", _v);}
if (true) break;

case 68:
//C
this.state = 67;
index75++;
Debug.locals.put("v", _v);
if (true) break;

case 53:
//C
this.state = 68;
 BA.debugLineNum = 178;BA.debugLine="v.Enabled = True";
Debug.JustUpdateDeviceLine();
_v.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 if (true) break;
if (true) break;

case 54:
//C
this.state = 55;
Debug.locals.put("v", _v);
;
 BA.debugLineNum = 180;BA.debugLine="Wait For CloseMessage (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","closemessage", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xdialog", "showcustom"), null);
this.state = 69;
return;
case 69:
//C
this.state = 55;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 181;BA.debugLine="For Each v As B4XView In Background.GetAllViewsRe";
Debug.JustUpdateDeviceLine();
if (true) break;

case 55:
//for
this.state = 58;
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
group79 = __ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(false,"GetAllViewsRecursive");
index79 = 0;
groupLen79 = group79.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("v", _v);
this.state = 70;
if (true) break;

case 70:
//C
this.state = 58;
if (index79 < groupLen79) {
this.state = 57;
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group79.runMethod(false,"Get",index79));Debug.locals.put("v", _v);}
if (true) break;

case 71:
//C
this.state = 70;
index79++;
Debug.locals.put("v", _v);
if (true) break;

case 57:
//C
this.state = 71;
 BA.debugLineNum = 182;BA.debugLine="v.Enabled = False";
Debug.JustUpdateDeviceLine();
_v.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 if (true) break;
if (true) break;

case 58:
//C
this.state = 59;
Debug.locals.put("v", _v);
;
 BA.debugLineNum = 184;BA.debugLine="Base.SetVisibleAnimated(VisibleAnimationDuration,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_base" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_visibleanimationduration" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 185;BA.debugLine="If VisibleAnimationDuration > 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 59:
//if
this.state = 62;
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_visibleanimationduration" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 186;BA.debugLine="Sleep(VisibleAnimationDuration)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xdialog", "showcustom"),__ref.getField(true,"_visibleanimationduration" /*RemoteObject*/ ));
this.state = 72;
return;
case 72:
//C
this.state = 62;
;
 if (true) break;

case 62:
//C
this.state = -1;
;
 BA.debugLineNum = 188;BA.debugLine="Background.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 189;BA.debugLine="Return Result";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_result));return;};
 BA.debugLineNum = 190;BA.debugLine="End Sub";
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
public static void  _closemessage(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _showtemplate(RemoteObject __ref,RemoteObject _dialogtemplate,RemoteObject _yes,RemoteObject _no,RemoteObject _cancel) throws Exception{
try {
		Debug.PushSubsStack("ShowTemplate (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("showtemplate")) { return __ref.runUserSub(false, "b4xdialog","showtemplate", __ref, _dialogtemplate, _yes, _no, _cancel);}
ResumableSub_ShowTemplate rsub = new ResumableSub_ShowTemplate(null,__ref,_dialogtemplate,_yes,_no,_cancel);
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
public static class ResumableSub_ShowTemplate extends BA.ResumableSub {
public ResumableSub_ShowTemplate(b4j.example.b4xdialog parent,RemoteObject __ref,RemoteObject _dialogtemplate,RemoteObject _yes,RemoteObject _no,RemoteObject _cancel) {
this.parent = parent;
this.__ref = __ref;
this._dialogtemplate = _dialogtemplate;
this._yes = _yes;
this._no = _no;
this._cancel = _cancel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xdialog parent;
RemoteObject _dialogtemplate;
RemoteObject _yes;
RemoteObject _no;
RemoteObject _cancel;
RemoteObject _content = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ShowTemplate (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,65);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("DialogTemplate", _dialogtemplate);
Debug.locals.put("Yes", _yes);
Debug.locals.put("No", _no);
Debug.locals.put("Cancel", _cancel);
 BA.debugLineNum = 66;BA.debugLine="Dim content As B4XView = CallSub2(DialogTemplate,";
Debug.JustUpdateDeviceLine();
_content = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_content = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_dialogtemplate),(Object)(BA.ObjectToString("GetPanel")),(Object)(__ref)));Debug.locals.put("content", _content);Debug.locals.put("content", _content);
 BA.debugLineNum = 67;BA.debugLine="CallSub2(DialogTemplate, \"Show\", Me)";
Debug.JustUpdateDeviceLine();
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_dialogtemplate),(Object)(BA.ObjectToString("Show")),(Object)(__ref));
 BA.debugLineNum = 68;BA.debugLine="Wait For (ShowCustom(content , Yes, No, Cancel))";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xdialog", "showtemplate"), __ref.runClassMethod (b4j.example.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_content),(Object)(_yes),(Object)(_no),(Object)(_cancel)));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 69;BA.debugLine="CallSub2(DialogTemplate, \"DialogClosed\", Result)";
Debug.JustUpdateDeviceLine();
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_dialogtemplate),(Object)(BA.ObjectToString("DialogClosed")),(Object)((_result)));
 BA.debugLineNum = 70;BA.debugLine="PutAtTop = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 71;BA.debugLine="Return Result";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_result));return;};
 BA.debugLineNum = 72;BA.debugLine="End Sub";
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
public static RemoteObject  _stub_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Stub_Click (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,352);
if (RapidSub.canDelegate("stub_click")) { return __ref.runUserSub(false, "b4xdialog","stub_click", __ref);}
 BA.debugLineNum = 352;BA.debugLine="Private Sub Stub_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 354;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateblur(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateBlur (b4xdialog) ","b4xdialog",27,__ref.getField(false, "ba"),__ref,277);
if (RapidSub.canDelegate("updateblur")) { return __ref.runUserSub(false, "b4xdialog","updateblur", __ref);}
RemoteObject _source = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _blurred = RemoteObject.declareNull("b4j.example.bitmapcreator");
 BA.debugLineNum = 277;BA.debugLine="Private Sub UpdateBlur";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 278;BA.debugLine="If BlurBackground = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_blurbackground" /*RemoteObject*/ ),b4xdialog.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 279;BA.debugLine="Background.Visible = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xdialog.__c.getField(true,"False"));
 BA.debugLineNum = 280;BA.debugLine="Dim source As B4XBitmap = Background.Parent.Snaps";
Debug.JustUpdateDeviceLine();
_source = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_source = __ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(false,"Snapshot");Debug.locals.put("source", _source);Debug.locals.put("source", _source);
 BA.debugLineNum = 281;BA.debugLine="If source.Width > Background.Width Or source.Heig";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_source.runMethod(true,"getWidth"),__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getWidth")) || RemoteObject.solveBoolean(">",_source.runMethod(true,"getHeight"),__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getHeight"))) { 
 BA.debugLineNum = 282;BA.debugLine="source = source.Crop(0, 0, Background.Width, Bac";
Debug.JustUpdateDeviceLine();
_source = _source.runMethod(false,"Crop",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, __ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getHeight"))));Debug.locals.put("source", _source);
 };
 BA.debugLineNum = 284;BA.debugLine="Background.Visible = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xdialog.__c.getField(true,"True"));
 BA.debugLineNum = 285;BA.debugLine="BlurImageView.SetLayoutAnimated(0, 0, 0, Backgrou";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_blurimageview" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 286;BA.debugLine="Dim blurred As BitmapCreator = Blur(source)";
Debug.JustUpdateDeviceLine();
_blurred = __ref.runClassMethod (b4j.example.b4xdialog.class, "_blur" /*RemoteObject*/ ,(Object)(_source));Debug.locals.put("blurred", _blurred);Debug.locals.put("blurred", _blurred);
 BA.debugLineNum = 287;BA.debugLine="blurred.SetBitmapToImageView(blurred.Bitmap, Blur";
Debug.JustUpdateDeviceLine();
_blurred.runVoidMethod ("_setbitmaptoimageview",(Object)(_blurred.runMethod(false,"_getbitmap")),(Object)(__ref.getField(false,"_blurimageview" /*RemoteObject*/ )));
 BA.debugLineNum = 288;BA.debugLine="End Sub";
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