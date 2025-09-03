package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xmagmafuncs extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xmagmafuncs", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xmagmafuncs.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.Map _translated = null;
public String _selectedlang = "";
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public boolean  _isvaliddate(b4j.example.b4xmagmafuncs __ref,String _datestr) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmagmafuncs";
if (Debug.shouldDelegate(ba, "isvaliddate", false))
	 {return ((Boolean) Debug.delegate(ba, "isvaliddate", new Object[] {_datestr}));}
long _dtticks = 0L;
String _reconstructed = "";
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub IsValidDate(DateStr As String) As Boole";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Try";
try {RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="Dim dtTicks As Long = DateTime.DateParse(DateStr";
_dtticks = __c.DateTime.DateParse(_datestr);
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="Dim reconstructed As String = DateTime.Date(dtTi";
_reconstructed = __c.DateTime.Date(_dtticks);
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="Return reconstructed = DateStr";
if (true) return (_reconstructed).equals(_datestr);
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=5111818;
 //BA.debugLineNum = 5111818;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.example.b4xmagmafuncs __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmagmafuncs";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="translated.Initialize";
__ref._translated /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="End Sub";
return "";
}
public boolean  _iscomboboxfocused(b4j.example.b4xmagmafuncs __ref,anywheresoftware.b4j.objects.ComboBoxWrapper _cb) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmagmafuncs";
if (Debug.shouldDelegate(ba, "iscomboboxfocused", false))
	 {return ((Boolean) Debug.delegate(ba, "iscomboboxfocused", new Object[] {_cb}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub IsComboBoxFocused(cb As ComboBox) As Boolean";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Dim jo As JavaObject = cb";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_cb.getObject()));
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="Return jo.RunMethod(\"isFocused\", Null)";
if (true) return BA.ObjectToBoolean(_jo.RunMethod("isFocused",(Object[])(__c.Null)));
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.b4xmagmafuncs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmagmafuncs";
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="Dim translated As Map";
_translated = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="Public SelectedLang As String=\"EN\" 'EN,GR..";
_selectedlang = "EN";
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="End Sub";
return "";
}
public String  _l(b4j.example.b4xmagmafuncs __ref,String _std) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmagmafuncs";
if (Debug.shouldDelegate(ba, "l", false))
	 {return ((String) Debug.delegate(ba, "l", new Object[] {_std}));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="public Sub L(std As String) As String";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="If SelectedLang=\"EN\" Then";
if ((__ref._selectedlang /*String*/ ).equals("EN")) { 
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="Return std";
if (true) return _std;
 }else {
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="If translated.ContainsKey(std) Then";
if (__ref._translated /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_std))) { 
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="Return translated.Get(std)";
if (true) return BA.ObjectToString(__ref._translated /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_std)));
 }else {
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="Return std";
if (true) return _std;
 };
 };
RDebugUtils.currentLine=5046282;
 //BA.debugLineNum = 5046282;BA.debugLine="End Sub";
return "";
}
public String  _setlanguage(b4j.example.b4xmagmafuncs __ref,String _lang) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmagmafuncs";
if (Debug.shouldDelegate(ba, "setlanguage", false))
	 {return ((String) Debug.delegate(ba, "setlanguage", new Object[] {_lang}));}
anywheresoftware.b4a.objects.collections.List _a = null;
int _k = 0;
String[] _aa = null;
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="public Sub SetLanguage(lang As String)";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="translated.Clear";
__ref._translated /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="SelectedLang=lang";
__ref._selectedlang /*String*/  = _lang;
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="If SelectedLang<>\"EN\" Then";
if ((__ref._selectedlang /*String*/ ).equals("EN") == false) { 
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="Try";
try {RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="Dim a As List=File.ReadList(Main.mydir,lang & \".";
_a = new anywheresoftware.b4a.objects.collections.List();
_a = __c.File.ReadList(_main._mydir /*String*/ ,_lang+".lang");
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="For k=0 To a.Size-1";
{
final int step6 = 1;
final int limit6 = (int) (_a.getSize()-1);
_k = (int) (0) ;
for (;_k <= limit6 ;_k = _k + step6 ) {
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="Dim aa() As String=Regex.split(\",\",a.Get(k).As(";
_aa = __c.Regex.Split(",",(BA.ObjectToString(_a.Get(_k))));
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="translated.Put(aa(0),aa(1))";
__ref._translated /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_aa[(int) (0)]),(Object)(_aa[(int) (1)]));
 }
};
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=4980747;
 //BA.debugLineNum = 4980747;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("74980747",__c.LastException(ba).getMessage(),0);
 };
 };
RDebugUtils.currentLine=4980751;
 //BA.debugLineNum = 4980751;BA.debugLine="End Sub";
return "";
}
}