package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 1200, 600);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4j.example.dateutils._process_globals();
b4j.example.cssutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static String _mydir = "";
public static anywheresoftware.b4j.object.JavaObject _scene = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
b4j.example.b4xpagesmanager _pagesmanager = null;
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="mydir=File.DirApp";
_mydir = anywheresoftware.b4a.keywords.Common.File.getDirApp();
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="Dim PagesManager As B4XPagesManager";
_pagesmanager = new b4j.example.b4xpagesmanager();
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="PagesManager.Initialize(MainForm)";
_pagesmanager._initialize /*String*/ (null,ba,_mainform);
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_closed() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mainform_closed", false))
	 {return ((String) Debug.delegate(ba, "mainform_closed", null));}
RDebugUtils.currentLine=46137344;
 //BA.debugLineNum = 46137344;BA.debugLine="Sub MainForm_Closed";
RDebugUtils.currentLine=46137345;
 //BA.debugLineNum = 46137345;BA.debugLine="B4XPages.Delegate.MainForm_Closed";
_b4xpages._delegate /*b4j.example.b4xpagesdelegator*/ ._mainform_closed /*String*/ (null);
RDebugUtils.currentLine=46137346;
 //BA.debugLineNum = 46137346;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mainform_closerequest", false))
	 {return ((String) Debug.delegate(ba, "mainform_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=46202880;
 //BA.debugLineNum = 46202880;BA.debugLine="Sub MainForm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=46202881;
 //BA.debugLineNum = 46202881;BA.debugLine="B4XPages.Delegate.MainForm_CloseRequest(EventData";
_b4xpages._delegate /*b4j.example.b4xpagesdelegator*/ ._mainform_closerequest /*String*/ (null,_eventdata);
RDebugUtils.currentLine=46202882;
 //BA.debugLineNum = 46202882;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mainform_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "mainform_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=46006272;
 //BA.debugLineNum = 46006272;BA.debugLine="Sub MainForm_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=46006273;
 //BA.debugLineNum = 46006273;BA.debugLine="B4XPages.Delegate.MainForm_FocusChanged(HasFocus)";
_b4xpages._delegate /*b4j.example.b4xpagesdelegator*/ ._mainform_focuschanged /*String*/ (null,_hasfocus);
RDebugUtils.currentLine=46006274;
 //BA.debugLineNum = 46006274;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_iconifiedchanged(boolean _iconified) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mainform_iconifiedchanged", false))
	 {return ((String) Debug.delegate(ba, "mainform_iconifiedchanged", new Object[] {_iconified}));}
RDebugUtils.currentLine=46268416;
 //BA.debugLineNum = 46268416;BA.debugLine="Public Sub MainForm_IconifiedChanged (Iconified As";
RDebugUtils.currentLine=46268417;
 //BA.debugLineNum = 46268417;BA.debugLine="B4XPages.Delegate.MainForm_IconifiedChanged(Iconi";
_b4xpages._delegate /*b4j.example.b4xpagesdelegator*/ ._mainform_iconifiedchanged /*String*/ (null,_iconified);
RDebugUtils.currentLine=46268418;
 //BA.debugLineNum = 46268418;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_resize(double _width,double _height) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mainform_resize", false))
	 {return ((String) Debug.delegate(ba, "mainform_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=46071808;
 //BA.debugLineNum = 46071808;BA.debugLine="Sub MainForm_Resize (Width As Double, Height As Do";
RDebugUtils.currentLine=46071809;
 //BA.debugLineNum = 46071809;BA.debugLine="B4XPages.Delegate.MainForm_Resize(Width, Height)";
_b4xpages._delegate /*b4j.example.b4xpagesdelegator*/ ._mainform_resize /*String*/ (null,_width,_height);
RDebugUtils.currentLine=46071810;
 //BA.debugLineNum = 46071810;BA.debugLine="End Sub";
return "";
}
}