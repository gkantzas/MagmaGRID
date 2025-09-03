package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class xuiviewsutils extends Object{
public static xuiviewsutils mostCurrent = new xuiviewsutils();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.xuiviewsutils", null);
		ba.loadHtSubs(xuiviewsutils.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.xuiviewsutils", ba);
		}
	}
    public static Class<?> getObject() {
		return xuiviewsutils.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static boolean _utilsinitialized = false;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static String  _performhapticfeedback(anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(ba, "performhapticfeedback", true))
	 {return ((String) Debug.delegate(ba, "performhapticfeedback", new Object[] {_view}));}
RDebugUtils.currentLine=43057152;
 //BA.debugLineNum = 43057152;BA.debugLine="Public Sub PerformHapticFeedback (View As B4XView)";
RDebugUtils.currentLine=43057153;
 //BA.debugLineNum = 43057153;BA.debugLine="Initialize";
_initialize();
RDebugUtils.currentLine=43057162;
 //BA.debugLineNum = 43057162;BA.debugLine="End Sub";
return "";
}
public static String  _settextorcsbuildertolabel(anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(ba, "settextorcsbuildertolabel", true))
	 {return ((String) Debug.delegate(ba, "settextorcsbuildertolabel", new Object[] {_xlbl,_text}));}
RDebugUtils.currentLine=43188224;
 //BA.debugLineNum = 43188224;BA.debugLine="Public Sub SetTextOrCSBuilderToLabel(xlbl As B4XVi";
RDebugUtils.currentLine=43188226;
 //BA.debugLineNum = 43188226;BA.debugLine="xlbl.Text = Text";
_xlbl.setText(BA.ObjectToString(_text));
RDebugUtils.currentLine=43188236;
 //BA.debugLineNum = 43188236;BA.debugLine="End Sub";
return "";
}
public static String  _addstubtoclvifneeded(b4j.example.customlistview _customlistview1,int _color) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(ba, "addstubtoclvifneeded", true))
	 {return ((String) Debug.delegate(ba, "addstubtoclvifneeded", new Object[] {_customlistview1,_color}));}
b4j.example.customlistview._clvitem _lastitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _height = 0;
RDebugUtils.currentLine=43122688;
 //BA.debugLineNum = 43122688;BA.debugLine="Public Sub AddStubToCLVIfNeeded(CustomListView1 As";
RDebugUtils.currentLine=43122689;
 //BA.debugLineNum = 43122689;BA.debugLine="If CustomListView1.Size = 0 Then Return";
if (_customlistview1._getsize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=43122690;
 //BA.debugLineNum = 43122690;BA.debugLine="Dim LastItem As CLVItem = CustomListView1.GetRawL";
_lastitem = _customlistview1._getrawlistitem((int) (_customlistview1._getsize()-1));
RDebugUtils.currentLine=43122691;
 //BA.debugLineNum = 43122691;BA.debugLine="If LastItem.Offset + LastItem.Panel.Height < Cust";
if (_lastitem.Offset+_lastitem.Panel.getHeight()<_customlistview1._asview().getHeight()) { 
RDebugUtils.currentLine=43122693;
 //BA.debugLineNum = 43122693;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"stub\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"stub");
RDebugUtils.currentLine=43122694;
 //BA.debugLineNum = 43122694;BA.debugLine="p.Color = Color";
_p.setColor(_color);
RDebugUtils.currentLine=43122695;
 //BA.debugLineNum = 43122695;BA.debugLine="Dim Height As Int = CustomListView1.AsView.Heigh";
_height = (int) (_customlistview1._asview().getHeight()-_lastitem.Offset-_lastitem.Panel.getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=43122696;
 //BA.debugLineNum = 43122696;BA.debugLine="If xui.IsB4J Then Height = Height + 5";
if (_xui.getIsB4J()) { 
_height = (int) (_height+5);};
RDebugUtils.currentLine=43122697;
 //BA.debugLineNum = 43122697;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, CustomListView1.AsV";
_p.SetLayoutAnimated((int) (0),0,0,_customlistview1._asview().getWidth(),_height);
RDebugUtils.currentLine=43122698;
 //BA.debugLineNum = 43122698;BA.debugLine="CustomListView1.Add(p, \"\")";
_customlistview1._add(_p,(Object)(""));
RDebugUtils.currentLine=43122699;
 //BA.debugLineNum = 43122699;BA.debugLine="CustomListView1.sv.ScrollViewContentHeight = Cus";
_customlistview1._sv.setScrollViewContentHeight(_customlistview1._sv.getScrollViewContentHeight()-_customlistview1._getdividersize());
 };
RDebugUtils.currentLine=43122701;
 //BA.debugLineNum = 43122701;BA.debugLine="End Sub";
return "";
}
public static String  _setbitmapandfill(anywheresoftware.b4a.objects.B4XViewWrapper _imageview,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(ba, "setbitmapandfill", true))
	 {return ((String) Debug.delegate(ba, "setbitmapandfill", new Object[] {_imageview,_bmp}));}
anywheresoftware.b4j.objects.ImageViewWrapper _iiv = null;
RDebugUtils.currentLine=43253760;
 //BA.debugLineNum = 43253760;BA.debugLine="Public Sub SetBitmapAndFill (ImageView As B4XView,";
RDebugUtils.currentLine=43253761;
 //BA.debugLineNum = 43253761;BA.debugLine="ImageView.SetBitmap(Bmp)";
_imageview.SetBitmap((javafx.scene.image.Image)(_bmp.getObject()));
RDebugUtils.currentLine=43253762;
 //BA.debugLineNum = 43253762;BA.debugLine="Dim iiv As ImageView = ImageView";
_iiv = new anywheresoftware.b4j.objects.ImageViewWrapper();
_iiv = (anywheresoftware.b4j.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper(), (javafx.scene.image.ImageView)(_imageview.getObject()));
RDebugUtils.currentLine=43253766;
 //BA.debugLineNum = 43253766;BA.debugLine="iiv.PreserveRatio = False";
_iiv.setPreserveRatio(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=43253770;
 //BA.debugLineNum = 43253770;BA.debugLine="End Sub";
return "";
}
public static String  _setalpha(anywheresoftware.b4a.objects.B4XViewWrapper _view,float _level) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(ba, "setalpha", true))
	 {return ((String) Debug.delegate(ba, "setalpha", new Object[] {_view,_level}));}
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
RDebugUtils.currentLine=43450368;
 //BA.debugLineNum = 43450368;BA.debugLine="Public Sub SetAlpha (View As B4XView, Level As Flo";
RDebugUtils.currentLine=43450374;
 //BA.debugLineNum = 43450374;BA.debugLine="Dim n As Node = View";
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
_n = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_view.getObject()));
RDebugUtils.currentLine=43450375;
 //BA.debugLineNum = 43450375;BA.debugLine="n.Alpha = Level";
_n.setAlpha(_level);
RDebugUtils.currentLine=43450380;
 //BA.debugLineNum = 43450380;BA.debugLine="End Sub";
return "";
}
public static b4j.example.b4ximageview  _createb4ximageview() throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(ba, "createb4ximageview", true))
	 {return ((b4j.example.b4ximageview) Debug.delegate(ba, "createb4ximageview", null));}
b4j.example.b4ximageview _iv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
RDebugUtils.currentLine=43384832;
 //BA.debugLineNum = 43384832;BA.debugLine="Public Sub CreateB4XImageView As B4XImageView";
RDebugUtils.currentLine=43384833;
 //BA.debugLineNum = 43384833;BA.debugLine="Dim iv As B4XImageView";
_iv = new b4j.example.b4ximageview();
RDebugUtils.currentLine=43384834;
 //BA.debugLineNum = 43384834;BA.debugLine="iv.Initialize(Null, \"\")";
_iv._initialize /*String*/ (null,ba,anywheresoftware.b4a.keywords.Common.Null,"");
RDebugUtils.currentLine=43384835;
 //BA.debugLineNum = 43384835;BA.debugLine="Dim base As B4XView = xui.CreatePanel(\"\")";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
_base = _xui.CreatePanel(ba,"");
RDebugUtils.currentLine=43384836;
 //BA.debugLineNum = 43384836;BA.debugLine="base.SetLayoutAnimated(0, 0, 0, 100dip, 100dip)";
_base.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
RDebugUtils.currentLine=43384837;
 //BA.debugLineNum = 43384837;BA.debugLine="iv.DesignerCreateView(base, Null, CreateMap(\"Roun";
_iv._designercreateview /*String*/ (null,(Object)(_base.getObject()),(anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(anywheresoftware.b4a.keywords.Common.Null)),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Round"),(Object)(anywheresoftware.b4a.keywords.Common.False),(Object)("ResizeMode"),(Object)("FIT"),(Object)("BackgroundColor"),(Object)(((int)0xffaaaaaa)),(Object)("CornersRadius"),(Object)(0)}));
RDebugUtils.currentLine=43384838;
 //BA.debugLineNum = 43384838;BA.debugLine="Return iv";
if (true) return _iv;
RDebugUtils.currentLine=43384839;
 //BA.debugLineNum = 43384839;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel() throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", null));}
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=43319296;
 //BA.debugLineNum = 43319296;BA.debugLine="Public Sub CreateLabel As B4XView";
RDebugUtils.currentLine=43319297;
 //BA.debugLineNum = 43319297;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=43319298;
 //BA.debugLineNum = 43319298;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=43319299;
 //BA.debugLineNum = 43319299;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=43319300;
 //BA.debugLineNum = 43319300;BA.debugLine="End Sub";
return null;
}
public static String  _initialize() throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", null));}
RDebugUtils.currentLine=42991616;
 //BA.debugLineNum = 42991616;BA.debugLine="Private Sub Initialize";
RDebugUtils.currentLine=42991617;
 //BA.debugLineNum = 42991617;BA.debugLine="If UtilsInitialized Then Return";
if (_utilsinitialized) { 
if (true) return "";};
RDebugUtils.currentLine=42991618;
 //BA.debugLineNum = 42991618;BA.debugLine="UtilsInitialized = True";
_utilsinitialized = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=42991625;
 //BA.debugLineNum = 42991625;BA.debugLine="End Sub";
return "";
}
}