package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xprogressdialog extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xprogressdialog", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xprogressdialog.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public Object _mtext = null;
public b4j.example.b4xloadingindicator _loadingindicator = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _label1 = null;
public b4j.example.b4xdialog _mdialog = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.example.b4xprogressdialog __ref,b4j.example.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressdialog";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=35258368;
 //BA.debugLineNum = 35258368;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=35258369;
 //BA.debugLineNum = 35258369;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=35258370;
 //BA.debugLineNum = 35258370;BA.debugLine="End Sub";
return null;
}
public String  _show(b4j.example.b4xprogressdialog __ref,b4j.example.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressdialog";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_dialog}));}
RDebugUtils.currentLine=35454976;
 //BA.debugLineNum = 35454976;BA.debugLine="Private Sub Show (Dialog As B4XDialog) 'ignore";
RDebugUtils.currentLine=35454977;
 //BA.debugLineNum = 35454977;BA.debugLine="LoadingIndicator.Show";
__ref._loadingindicator /*b4j.example.b4xloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=35454978;
 //BA.debugLineNum = 35454978;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(b4j.example.b4xprogressdialog __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressdialog";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=35520512;
 //BA.debugLineNum = 35520512;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=35520513;
 //BA.debugLineNum = 35520513;BA.debugLine="LoadingIndicator.Hide";
__ref._loadingindicator /*b4j.example.b4xloadingindicator*/ ._hide /*String*/ (null);
RDebugUtils.currentLine=35520514;
 //BA.debugLineNum = 35520514;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xprogressdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressdialog";
RDebugUtils.currentLine=34996224;
 //BA.debugLineNum = 34996224;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=34996225;
 //BA.debugLineNum = 34996225;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=34996226;
 //BA.debugLineNum = 34996226;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=34996227;
 //BA.debugLineNum = 34996227;BA.debugLine="Private mText As Object";
_mtext = new Object();
RDebugUtils.currentLine=34996228;
 //BA.debugLineNum = 34996228;BA.debugLine="Public LoadingIndicator As B4XLoadingIndicator";
_loadingindicator = new b4j.example.b4xloadingindicator();
RDebugUtils.currentLine=34996229;
 //BA.debugLineNum = 34996229;BA.debugLine="Public Label1 As B4XView";
_label1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=34996230;
 //BA.debugLineNum = 34996230;BA.debugLine="Public mDialog As B4XDialog";
_mdialog = new b4j.example.b4xdialog();
RDebugUtils.currentLine=34996231;
 //BA.debugLineNum = 34996231;BA.debugLine="End Sub";
return "";
}
public Object  _gettext(b4j.example.b4xprogressdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressdialog";
if (Debug.shouldDelegate(ba, "gettext", true))
	 {return ((Object) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=35192832;
 //BA.debugLineNum = 35192832;BA.debugLine="Public Sub getText As Object";
RDebugUtils.currentLine=35192833;
 //BA.debugLineNum = 35192833;BA.debugLine="Return mText";
if (true) return __ref._mtext /*Object*/ ;
RDebugUtils.currentLine=35192834;
 //BA.debugLineNum = 35192834;BA.debugLine="End Sub";
return null;
}
public String  _hide(b4j.example.b4xprogressdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressdialog";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=35389440;
 //BA.debugLineNum = 35389440;BA.debugLine="Public Sub Hide";
RDebugUtils.currentLine=35389441;
 //BA.debugLineNum = 35389441;BA.debugLine="mDialog.Close(0)";
__ref._mdialog /*b4j.example.b4xdialog*/ ._close /*boolean*/ (null,(int) (0));
RDebugUtils.currentLine=35389442;
 //BA.debugLineNum = 35389442;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.b4xprogressdialog __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xprogressdialog";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
RDebugUtils.currentLine=35061760;
 //BA.debugLineNum = 35061760;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
RDebugUtils.currentLine=35061761;
 //BA.debugLineNum = 35061761;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=35061762;
 //BA.debugLineNum = 35061762;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 60dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=35061763;
 //BA.debugLineNum = 35061763;BA.debugLine="mBase.LoadLayout(\"XV_ProgressTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("XV_ProgressTemplate",ba);
RDebugUtils.currentLine=35061764;
 //BA.debugLineNum = 35061764;BA.debugLine="mBase.SetColorAndBorder(xui.Color_White, 0, 0, 5d";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,0,(int) (0),__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=35061765;
 //BA.debugLineNum = 35061765;BA.debugLine="LoadingIndicator.Hide";
__ref._loadingindicator /*b4j.example.b4xloadingindicator*/ ._hide /*String*/ (null);
RDebugUtils.currentLine=35061766;
 //BA.debugLineNum = 35061766;BA.debugLine="mDialog.Initialize(Parent)";
__ref._mdialog /*b4j.example.b4xdialog*/ ._initialize /*String*/ (null,ba,_parent);
RDebugUtils.currentLine=35061767;
 //BA.debugLineNum = 35061767;BA.debugLine="mDialog.ButtonsHeight = -2dip";
__ref._mdialog /*b4j.example.b4xdialog*/ ._buttonsheight /*int*/  = (int) (-__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=35061768;
 //BA.debugLineNum = 35061768;BA.debugLine="mDialog.BorderWidth = 0";
__ref._mdialog /*b4j.example.b4xdialog*/ ._borderwidth /*int*/  = (int) (0);
RDebugUtils.currentLine=35061769;
 //BA.debugLineNum = 35061769;BA.debugLine="mDialog.BorderCornersRadius = 5dip";
__ref._mdialog /*b4j.example.b4xdialog*/ ._bordercornersradius /*int*/  = __c.DipToCurrent((int) (5));
RDebugUtils.currentLine=35061770;
 //BA.debugLineNum = 35061770;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4j.example.b4xprogressdialog __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressdialog";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=35127296;
 //BA.debugLineNum = 35127296;BA.debugLine="Public Sub setText(t As Object)";
RDebugUtils.currentLine=35127297;
 //BA.debugLineNum = 35127297;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(Label1, t";
_xuiviewsutils._settextorcsbuildertolabel /*String*/ (__ref._label1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_t);
RDebugUtils.currentLine=35127298;
 //BA.debugLineNum = 35127298;BA.debugLine="End Sub";
return "";
}
public String  _showdialog(b4j.example.b4xprogressdialog __ref,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressdialog";
if (Debug.shouldDelegate(ba, "showdialog", true))
	 {return ((String) Debug.delegate(ba, "showdialog", new Object[] {_text}));}
RDebugUtils.currentLine=35323904;
 //BA.debugLineNum = 35323904;BA.debugLine="Public Sub ShowDialog (Text As Object)";
RDebugUtils.currentLine=35323905;
 //BA.debugLineNum = 35323905;BA.debugLine="setText(Text)";
__ref._settext /*String*/ (null,_text);
RDebugUtils.currentLine=35323906;
 //BA.debugLineNum = 35323906;BA.debugLine="If mDialog.Visible = False Then";
if (__ref._mdialog /*b4j.example.b4xdialog*/ ._getvisible /*boolean*/ (null)==__c.False) { 
RDebugUtils.currentLine=35323907;
 //BA.debugLineNum = 35323907;BA.debugLine="mDialog.ShowTemplate(Me, \"\", \"\", \"\")";
__ref._mdialog /*b4j.example.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,this,(Object)(""),(Object)(""),(Object)(""));
 };
RDebugUtils.currentLine=35323909;
 //BA.debugLineNum = 35323909;BA.debugLine="End Sub";
return "";
}
}