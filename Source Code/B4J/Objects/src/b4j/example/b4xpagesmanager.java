package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpagesmanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xpagesmanager", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpagesmanager.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _b4xpageparent{
public boolean IsInitialized;
public anywheresoftware.b4j.objects.Form NativeType;
public void Initialize() {
IsInitialized = true;
NativeType = new anywheresoftware.b4j.objects.Form();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _b4xpageinfo{
public boolean IsInitialized;
public Object B4XPage;
public String Id;
public boolean Created;
public Object Title;
public anywheresoftware.b4a.objects.B4XViewWrapper Root;
public boolean IsFirst;
public b4j.example.b4xpagesmanager._b4xpageparent Parent;
public void Initialize() {
IsInitialized = true;
B4XPage = new Object();
Id = "";
Created = false;
Title = new Object();
Root = new anywheresoftware.b4a.objects.B4XViewWrapper();
IsFirst = false;
Parent = new b4j.example.b4xpagesmanager._b4xpageparent();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.b4xorderedmap _idtob4xpage = null;
public b4j.example.b4xorderedmap _rootb4xtopage = null;
public b4j.example.b4xset _mstackofpageids = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.Form _mmainform = null;
public boolean _isforeground = false;
public int _transitionanimationduration = 0;
public b4j.example.b4xmainpage _mainpage = null;
public String _stackstring = "";
public boolean _logevents = false;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4j.example.b4xpagesmanager __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _mainform) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_mainform}));}
boolean _nonmainpagewasadded = false;
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Public Sub Initialize (MainForm As Form)";
RDebugUtils.currentLine=14876678;
 //BA.debugLineNum = 14876678;BA.debugLine="IdToB4XPage.Initialize";
__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14876679;
 //BA.debugLineNum = 14876679;BA.debugLine="RootB4XToPage.Initialize";
__ref._rootb4xtopage /*b4j.example.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14876680;
 //BA.debugLineNum = 14876680;BA.debugLine="mStackOfPageIds.Initialize";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14876682;
 //BA.debugLineNum = 14876682;BA.debugLine="mMainForm = MainForm";
__ref._mmainform /*anywheresoftware.b4j.objects.Form*/  = _mainform;
RDebugUtils.currentLine=14876693;
 //BA.debugLineNum = 14876693;BA.debugLine="B4XPages.InternalSetPagesManager(Me)";
_b4xpages._internalsetpagesmanager /*String*/ (this);
RDebugUtils.currentLine=14876694;
 //BA.debugLineNum = 14876694;BA.debugLine="MainPage.Initialize";
__ref._mainpage /*b4j.example.b4xmainpage*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14876695;
 //BA.debugLineNum = 14876695;BA.debugLine="Dim NonMainPageWasAdded As Boolean = IdToB4XPage.";
_nonmainpagewasadded = __ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._getsize /*int*/ (null)>0;
RDebugUtils.currentLine=14876696;
 //BA.debugLineNum = 14876696;BA.debugLine="IdToB4XPage.Put(\"~~~~~temp~~~~\", CreateB4XPageInf";
__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)("~~~~~temp~~~~"),(Object)(__ref._createb4xpageinfo /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,(Object)(__ref._mainpage /*b4j.example.b4xmainpage*/ ),"",__c.False,(Object)(""))));
RDebugUtils.currentLine=14876697;
 //BA.debugLineNum = 14876697;BA.debugLine="BackgroundStateChanged(True)";
__ref._backgroundstatechanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=14876698;
 //BA.debugLineNum = 14876698;BA.debugLine="IdToB4XPage.Remove(\"~~~~~temp~~~~\")";
__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._remove /*String*/ (null,(Object)("~~~~~temp~~~~"));
RDebugUtils.currentLine=14876699;
 //BA.debugLineNum = 14876699;BA.debugLine="AddPageAndCreate(\"MainPage\", MainPage)";
__ref._addpageandcreate /*String*/ (null,"MainPage",(Object)(__ref._mainpage /*b4j.example.b4xmainpage*/ ));
RDebugUtils.currentLine=14876700;
 //BA.debugLineNum = 14876700;BA.debugLine="If LogEvents = False Then";
if (__ref._logevents /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=14876701;
 //BA.debugLineNum = 14876701;BA.debugLine="Log(\"Call B4XPages.GetManager.LogEvents = True t";
__c.LogImpl("914876701","Call B4XPages.GetManager.LogEvents = True to enable logging B4XPages events.",0);
 };
RDebugUtils.currentLine=14876703;
 //BA.debugLineNum = 14876703;BA.debugLine="If NonMainPageWasAdded Then";
if (_nonmainpagewasadded) { 
RDebugUtils.currentLine=14876704;
 //BA.debugLineNum = 14876704;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=14876705;
 //BA.debugLineNum = 14876705;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Appear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=14876708;
 //BA.debugLineNum = 14876708;BA.debugLine="End Sub";
return "";
}
public String  _addpage(b4j.example.b4xpagesmanager __ref,String _id,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "addpage", true))
	 {return ((String) Debug.delegate(ba, "addpage", new Object[] {_id,_b4xpage}));}
String _idtolower = "";
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="Dim IdToLower As String = Id.ToLowerCase";
_idtolower = _id.toLowerCase();
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="If IdToB4XPage.ContainsKey(IdToLower) Then";
if (__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_idtolower))) { 
RDebugUtils.currentLine=14942211;
 //BA.debugLineNum = 14942211;BA.debugLine="Log($\"Page with this id already exists: ${IdToLo";
__c.LogImpl("914942211",("Page with this id already exists: "+__c.SmartStringFormatter("",(Object)(_idtolower))+"!"),0);
RDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=14942214;
 //BA.debugLineNum = 14942214;BA.debugLine="IdToB4XPage.Put(IdToLower, CreateB4XPageInfo(B4XP";
__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_idtolower),(Object)(__ref._createb4xpageinfo /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage,_idtolower,__c.False,(Object)(_id))));
RDebugUtils.currentLine=14942215;
 //BA.debugLineNum = 14942215;BA.debugLine="If IdToB4XPage.Size = 1 Then ShowPage(IdToLower)";
if (__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._getsize /*int*/ (null)==1) { 
__ref._showpage /*String*/ (null,_idtolower);};
RDebugUtils.currentLine=14942216;
 //BA.debugLineNum = 14942216;BA.debugLine="End Sub";
return "";
}
public String  _addpageandcreate(b4j.example.b4xpagesmanager __ref,String _id,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "addpageandcreate", true))
	 {return ((String) Debug.delegate(ba, "addpageandcreate", new Object[] {_id,_b4xpage}));}
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="AddPage (Id, B4XPage)";
__ref._addpage /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="CreatePageIfNeeded(GetPageFromId(Id))";
__ref._createpageifneeded /*String*/ (null,__ref._getpagefromid /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_id));
RDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="End Sub";
return "";
}
public String  _closepage(b4j.example.b4xpagesmanager __ref,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closepage", true))
	 {return ((String) Debug.delegate(ba, "closepage", new Object[] {_b4xpage}));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
boolean _isclosingtoppage = false;
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = __ref._findpifromb4xpage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage);
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="If mStackOfPageIds.Contains(pi.Id) = False Then R";
if (__ref._mstackofpageids /*b4j.example.b4xset*/ ._contains /*boolean*/ (null,(Object)(_pi.Id /*String*/ ))==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="If xui.IsB4i And GetTopPage <> pi Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i() && (__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null)).equals(_pi) == false) { 
RDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="Log(\"Only top page can be closed\")";
__c.LogImpl("915204356","Only top page can be closed",0);
RDebugUtils.currentLine=15204357;
 //BA.debugLineNum = 15204357;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=15204358;
 //BA.debugLineNum = 15204358;BA.debugLine="Else If xui.IsB4i And mStackOfPageIds.Size = 1 Th";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i() && __ref._mstackofpageids /*b4j.example.b4xset*/ ._getsize /*int*/ (null)==1) { 
RDebugUtils.currentLine=15204359;
 //BA.debugLineNum = 15204359;BA.debugLine="Log(\"First page cannot be closed\")";
__c.LogImpl("915204359","First page cannot be closed",0);
RDebugUtils.currentLine=15204360;
 //BA.debugLineNum = 15204360;BA.debugLine="Return";
if (true) return "";
 }}
;
RDebugUtils.currentLine=15204362;
 //BA.debugLineNum = 15204362;BA.debugLine="Dim IsClosingTopPage As Boolean = GetTopPage = pi";
_isclosingtoppage = (__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null)).equals(_pi);
RDebugUtils.currentLine=15204363;
 //BA.debugLineNum = 15204363;BA.debugLine="ClosePageImpl(pi)";
__ref._closepageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=15204364;
 //BA.debugLineNum = 15204364;BA.debugLine="If IsClosingTopPage Then";
if (_isclosingtoppage) { 
RDebugUtils.currentLine=15204365;
 //BA.debugLineNum = 15204365;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
 };
RDebugUtils.currentLine=15204367;
 //BA.debugLineNum = 15204367;BA.debugLine="If xui.IsB4A And mStackOfPageIds.Size = 1 Then Re";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() && __ref._mstackofpageids /*b4j.example.b4xset*/ ._getsize /*int*/ (null)==1) { 
if (true) return "";};
RDebugUtils.currentLine=15204368;
 //BA.debugLineNum = 15204368;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._remove /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=15204369;
 //BA.debugLineNum = 15204369;BA.debugLine="If IsClosingTopPage Then";
if (_isclosingtoppage) { 
RDebugUtils.currentLine=15204370;
 //BA.debugLineNum = 15204370;BA.debugLine="If xui.IsB4A Then ShowPageImpl(GetTopPage)";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
__ref._showpageimpl /*String*/ (null,__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null));};
RDebugUtils.currentLine=15204371;
 //BA.debugLineNum = 15204371;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
 };
RDebugUtils.currentLine=15204373;
 //BA.debugLineNum = 15204373;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xpagesmanager._b4xpageinfo  _findpifromb4xpage(b4j.example.b4xpagesmanager __ref,Object _page) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "findpifromb4xpage", true))
	 {return ((b4j.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "findpifromb4xpage", new Object[] {_page}));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Public Sub FindPIFromB4XPage (Page As Object) As B";
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_pi = (b4j.example.b4xpagesmanager._b4xpageinfo)(group1.Get(index1));
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="If pi.B4XPage = Page Then";
if ((_pi.B4XPage /*Object*/ ).equals(_page)) { 
RDebugUtils.currentLine=15400963;
 //BA.debugLineNum = 15400963;BA.debugLine="Return pi";
if (true) return _pi;
 };
 }
};
RDebugUtils.currentLine=15400966;
 //BA.debugLineNum = 15400966;BA.debugLine="Return Null";
if (true) return (b4j.example.b4xpagesmanager._b4xpageinfo)(__c.Null);
RDebugUtils.currentLine=15400967;
 //BA.debugLineNum = 15400967;BA.debugLine="End Sub";
return null;
}
public Object  _getpage(b4j.example.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpage", true))
	 {return ((Object) Debug.delegate(ba, "getpage", new Object[] {_id}));}
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Public Sub GetPage (Id As String) As Object";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="Return GetPageFromId(Id).B4XPage";
if (true) return __ref._getpagefromid /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_id).B4XPage /*Object*/ ;
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="End Sub";
return null;
}
public String  _settitle(b4j.example.b4xpagesmanager __ref,Object _b4xpage,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((String) Debug.delegate(ba, "settitle", new Object[] {_b4xpage,_title}));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = __ref._findpifromb4xpage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage);
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="pi.Title = Title";
_pi.Title /*Object*/  = _title;
RDebugUtils.currentLine=15663107;
 //BA.debugLineNum = 15663107;BA.debugLine="pi.Parent.NativeType.Title = Title";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .setTitle(BA.ObjectToString(_title));
RDebugUtils.currentLine=15663108;
 //BA.debugLineNum = 15663108;BA.debugLine="End Sub";
return "";
}
public String  _showpage(b4j.example.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpage", true))
	 {return ((String) Debug.delegate(ba, "showpage", new Object[] {_id}));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Public Sub ShowPage (Id As String)";
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = __ref._getpagefromid /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="If pi = GetTopPage Then Return";
if ((_pi).equals(__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null))) { 
if (true) return "";};
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="CreatePageIfNeeded(pi)";
__ref._createpageifneeded /*String*/ (null,_pi);
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
RDebugUtils.currentLine=15073298;
 //BA.debugLineNum = 15073298;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._remove /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=15073299;
 //BA.debugLineNum = 15073299;BA.debugLine="ShowPageImpl(pi)";
__ref._showpageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=15073300;
 //BA.debugLineNum = 15073300;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._add /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=15073301;
 //BA.debugLineNum = 15073301;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
RDebugUtils.currentLine=15073302;
 //BA.debugLineNum = 15073302;BA.debugLine="End Sub";
return "";
}
public String  _showpageandremovepreviouspages(b4j.example.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpageandremovepreviouspages", true))
	 {return ((String) Debug.delegate(ba, "showpageandremovepreviouspages", new Object[] {_id}));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
b4j.example.b4xpagesmanager._b4xpageinfo _pagetoremove = null;
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="If GetTopPage = Null Then";
if (__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null)== null) { 
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="ShowPage(Id)";
__ref._showpage /*String*/ (null,_id);
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15138821;
 //BA.debugLineNum = 15138821;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = __ref._getpagefromid /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="CreatePageIfNeeded(pi)";
__ref._createpageifneeded /*String*/ (null,_pi);
RDebugUtils.currentLine=15138823;
 //BA.debugLineNum = 15138823;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
RDebugUtils.currentLine=15138827;
 //BA.debugLineNum = 15138827;BA.debugLine="For Each Id As String In mStackOfPageIds.AsList";
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._mstackofpageids /*b4j.example.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_id = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=15138828;
 //BA.debugLineNum = 15138828;BA.debugLine="Dim PageToRemove As B4XPageInfo = GetPageFromId(";
_pagetoremove = __ref._getpagefromid /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=15138832;
 //BA.debugLineNum = 15138832;BA.debugLine="If PageToRemove.Id = pi.Id Then Continue";
if ((_pagetoremove.Id /*String*/ ).equals(_pi.Id /*String*/ )) { 
if (true) continue;};
RDebugUtils.currentLine=15138833;
 //BA.debugLineNum = 15138833;BA.debugLine="PageToRemove.Parent.NativeType.Close";
_pagetoremove.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .Close();
 }
};
RDebugUtils.currentLine=15138837;
 //BA.debugLineNum = 15138837;BA.debugLine="mStackOfPageIds.Clear";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=15138838;
 //BA.debugLineNum = 15138838;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._add /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=15138839;
 //BA.debugLineNum = 15138839;BA.debugLine="If xui.IsB4A Or xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=15138840;
 //BA.debugLineNum = 15138840;BA.debugLine="ShowPageImpl(pi)";
__ref._showpageimpl /*String*/ (null,_pi);
 };
RDebugUtils.currentLine=15138842;
 //BA.debugLineNum = 15138842;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
RDebugUtils.currentLine=15138843;
 //BA.debugLineNum = 15138843;BA.debugLine="End Sub";
return "";
}
public String  _activity_pause(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Public Sub Activity_Pause";
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="RaiseEventWithResult(GetTopPage, \"B4XPage_Disappe";
__ref._raiseeventwithresult /*Object*/ (null,__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Disappear",(Object[])(__c.Null));
RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="BackgroundStateChanged(False)";
__ref._backgroundstatechanged /*String*/ (null,__c.False);
RDebugUtils.currentLine=16973827;
 //BA.debugLineNum = 16973827;BA.debugLine="End Sub";
return "";
}
public String  _activity_resume(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "activity_resume", true))
	 {return ((String) Debug.delegate(ba, "activity_resume", null));}
boolean _shouldraise = false;
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Public Sub Activity_Resume";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="Dim ShouldRaise As Boolean = IsForeground = False";
_shouldraise = __ref._isforeground /*boolean*/ ==__c.False;
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="BackgroundStateChanged(True)";
__ref._backgroundstatechanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=16842755;
 //BA.debugLineNum = 16842755;BA.debugLine="If ShouldRaise Then";
if (_shouldraise) { 
RDebugUtils.currentLine=16842756;
 //BA.debugLineNum = 16842756;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,__ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Appear",(Object[])(__c.Null));
 };
RDebugUtils.currentLine=16842758;
 //BA.debugLineNum = 16842758;BA.debugLine="End Sub";
return "";
}
public String  _mainform_closed(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "mainform_closed", true))
	 {return ((String) Debug.delegate(ba, "mainform_closed", null));}
anywheresoftware.b4j.objects.Form _frm = null;
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Public Sub MainForm_Closed";
RDebugUtils.currentLine=16187393;
 //BA.debugLineNum = 16187393;BA.debugLine="Dim frm As Form = Sender";
_frm = (anywheresoftware.b4j.objects.Form)(__c.Sender(ba));
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="Dim pi As B4XPageInfo = GetPageInfoFromRoot(frm.R";
_pi = __ref._getpageinfofromroot /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_frm.getRootPane().getObject())));
RDebugUtils.currentLine=16187395;
 //BA.debugLineNum = 16187395;BA.debugLine="RaiseEventWithResult(pi, \"B4XPage_Disappear\", Nul";
__ref._raiseeventwithresult /*Object*/ (null,_pi,"B4XPage_Disappear",(Object[])(__c.Null));
RDebugUtils.currentLine=16187396;
 //BA.debugLineNum = 16187396;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._remove /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=16187397;
 //BA.debugLineNum = 16187397;BA.debugLine="If mStackOfPageIds.Size = 0 Then";
if (__ref._mstackofpageids /*b4j.example.b4xset*/ ._getsize /*int*/ (null)==0) { 
RDebugUtils.currentLine=16187398;
 //BA.debugLineNum = 16187398;BA.debugLine="BackgroundStateChanged(False)";
__ref._backgroundstatechanged /*String*/ (null,__c.False);
 };
RDebugUtils.currentLine=16187400;
 //BA.debugLineNum = 16187400;BA.debugLine="UpdateStackString";
__ref._updatestackstring /*String*/ (null);
RDebugUtils.currentLine=16187401;
 //BA.debugLineNum = 16187401;BA.debugLine="End Sub";
return "";
}
public String  _mainform_closerequest(b4j.example.b4xpagesmanager __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "mainform_closerequest", true))
	 {return ((String) Debug.delegate(ba, "mainform_closerequest", new Object[] {_eventdata}));}
anywheresoftware.b4j.objects.Form _frm = null;
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Public Sub MainForm_CloseRequest (EventData As Eve";
RDebugUtils.currentLine=16318465;
 //BA.debugLineNum = 16318465;BA.debugLine="Dim frm As Form = Sender";
_frm = (anywheresoftware.b4j.objects.Form)(__c.Sender(ba));
RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="Dim pi As B4XPageInfo = GetPageInfoFromRoot(frm.R";
_pi = __ref._getpageinfofromroot /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_frm.getRootPane().getObject())));
RDebugUtils.currentLine=16318467;
 //BA.debugLineNum = 16318467;BA.debugLine="If pi <> Null And CloseRequestExists (pi) Then";
if (_pi!= null && __ref._closerequestexists /*boolean*/ (null,_pi)) { 
RDebugUtils.currentLine=16318468;
 //BA.debugLineNum = 16318468;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=16318469;
 //BA.debugLineNum = 16318469;BA.debugLine="HandleCloseRequest (pi)";
__ref._handlecloserequest /*void*/ (null,_pi);
 };
RDebugUtils.currentLine=16318471;
 //BA.debugLineNum = 16318471;BA.debugLine="End Sub";
return "";
}
public String  _mainform_focuschanged(b4j.example.b4xpagesmanager __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "mainform_focuschanged", true))
	 {return ((String) Debug.delegate(ba, "mainform_focuschanged", new Object[] {_hasfocus}));}
anywheresoftware.b4j.objects.Form _frm = null;
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Public Sub MainForm_FocusChanged (HasFocus As Bool";
RDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="Dim frm As Form = Sender";
_frm = (anywheresoftware.b4j.objects.Form)(__c.Sender(ba));
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="Dim pi As B4XPageInfo = GetPageInfoFromRoot(frm.R";
_pi = __ref._getpageinfofromroot /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_frm.getRootPane().getObject())));
RDebugUtils.currentLine=16121859;
 //BA.debugLineNum = 16121859;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=16121860;
 //BA.debugLineNum = 16121860;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=16121861;
 //BA.debugLineNum = 16121861;BA.debugLine="MovePageToTop(pi)";
__ref._movepagetotop /*String*/ (null,_pi);
 };
RDebugUtils.currentLine=16121863;
 //BA.debugLineNum = 16121863;BA.debugLine="End Sub";
return "";
}
public String  _mainform_iconifiedchanged(b4j.example.b4xpagesmanager __ref,boolean _iconified) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "mainform_iconifiedchanged", true))
	 {return ((String) Debug.delegate(ba, "mainform_iconifiedchanged", new Object[] {_iconified}));}
anywheresoftware.b4j.objects.Form _frm = null;
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Public Sub MainForm_IconifiedChanged (Iconified As";
RDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="Dim frm As Form = Sender";
_frm = (anywheresoftware.b4j.objects.Form)(__c.Sender(ba));
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="Dim pi As B4XPageInfo = GetPageInfoFromRoot(frm.R";
_pi = __ref._getpageinfofromroot /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_frm.getRootPane().getObject())));
RDebugUtils.currentLine=16252931;
 //BA.debugLineNum = 16252931;BA.debugLine="RaiseEvent(pi, \"B4XPage_IconifiedChanged\", Array(";
__ref._raiseevent /*String*/ (null,_pi,"B4XPage_IconifiedChanged",new Object[]{(Object)(_iconified)});
RDebugUtils.currentLine=16252932;
 //BA.debugLineNum = 16252932;BA.debugLine="End Sub";
return "";
}
public String  _mainform_resize(b4j.example.b4xpagesmanager __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "mainform_resize", true))
	 {return ((String) Debug.delegate(ba, "mainform_resize", new Object[] {_width,_height}));}
int _w = 0;
int _h = 0;
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Public Sub MainForm_Resize(Width As Double, Height";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="Dim w As Int = Width";
_w = (int) (_width);
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="Dim h As Int = Height";
_h = (int) (_height);
RDebugUtils.currentLine=16646147;
 //BA.debugLineNum = 16646147;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(Sender), \"B4XPage_";
__ref._raiseevent /*String*/ (null,__ref._getpageinfofromroot /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)))),"B4XPage_Resize",new Object[]{(Object)(_w),(Object)(_h)});
RDebugUtils.currentLine=16646148;
 //BA.debugLineNum = 16646148;BA.debugLine="End Sub";
return "";
}
public Object  _raiseeventwithresult(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _targetpage,String _subname,Object[] _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "raiseeventwithresult", true))
	 {return ((Object) Debug.delegate(ba, "raiseeventwithresult", new Object[] {_targetpage,_subname,_params}));}
int _length = 0;
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Public Sub RaiseEventWithResult (TargetPage As B4X";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="If TargetPage = Null Then Return Null";
if (_targetpage== null) { 
if (true) return __c.Null;};
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== null) { 
_length = (int) (0);}
else {
_length = _params.length;};
RDebugUtils.currentLine=16580612;
 //BA.debugLineNum = 16580612;BA.debugLine="LogEvent(TargetPage, SubName)";
__ref._logevent /*String*/ (null,_targetpage,_subname);
RDebugUtils.currentLine=16580613;
 //BA.debugLineNum = 16580613;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_targetpage.B4XPage /*Object*/ ,_subname,_length)==__c.False) { 
if (true) return __c.Null;};
RDebugUtils.currentLine=16580614;
 //BA.debugLineNum = 16580614;BA.debugLine="Select length";
switch (_length) {
case 0: {
RDebugUtils.currentLine=16580616;
 //BA.debugLineNum = 16580616;BA.debugLine="Return CallSub(TargetPage.B4XPage, SubName)";
if (true) return __c.CallSubNew(ba,_targetpage.B4XPage /*Object*/ ,_subname);
 break; }
case 1: {
RDebugUtils.currentLine=16580618;
 //BA.debugLineNum = 16580618;BA.debugLine="Return CallSub2(TargetPage.B4XPage, SubName, Pa";
if (true) return __c.CallSubNew2(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)]);
 break; }
case 2: {
RDebugUtils.currentLine=16580620;
 //BA.debugLineNum = 16580620;BA.debugLine="Return CallSub3(TargetPage.B4XPage, SubName, Pa";
if (true) return __c.CallSubNew3(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)],_params[(int) (1)]);
 break; }
default: {
RDebugUtils.currentLine=16580622;
 //BA.debugLineNum = 16580622;BA.debugLine="Log(\"Too many parameters\")";
__c.LogImpl("916580622","Too many parameters",0);
 break; }
}
;
RDebugUtils.currentLine=16580624;
 //BA.debugLineNum = 16580624;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=16580625;
 //BA.debugLineNum = 16580625;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xpagesmanager._b4xpageinfo  _gettoppage(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "gettoppage", true))
	 {return ((b4j.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "gettoppage", null));}
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Public Sub GetTopPage As B4XPageInfo";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="If mStackOfPageIds.Size = 0 Then Return Null";
if (__ref._mstackofpageids /*b4j.example.b4xset*/ ._getsize /*int*/ (null)==0) { 
if (true) return (b4j.example.b4xpagesmanager._b4xpageinfo)(__c.Null);};
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="Return IdToB4XPage.Get(mStackOfPageIds.AsList.Get";
if (true) return (b4j.example.b4xpagesmanager._b4xpageinfo)(__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._get /*Object*/ (null,__ref._mstackofpageids /*b4j.example.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (__ref._mstackofpageids /*b4j.example.b4xset*/ ._getsize /*int*/ (null)-1))));
RDebugUtils.currentLine=16711683;
 //BA.debugLineNum = 16711683;BA.debugLine="End Sub";
return null;
}
public String  _backgroundstatechanged(b4j.example.b4xpagesmanager __ref,boolean _newstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "backgroundstatechanged", true))
	 {return ((String) Debug.delegate(ba, "backgroundstatechanged", new Object[] {_newstate}));}
String _ev = "";
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Private Sub BackgroundStateChanged (NewState As Bo";
RDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="If IsForeground = NewState Then Return";
if (__ref._isforeground /*boolean*/ ==_newstate) { 
if (true) return "";};
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="IsForeground = NewState";
__ref._isforeground /*boolean*/  = _newstate;
RDebugUtils.currentLine=16908291;
 //BA.debugLineNum = 16908291;BA.debugLine="Dim ev As String";
_ev = "";
RDebugUtils.currentLine=16908292;
 //BA.debugLineNum = 16908292;BA.debugLine="If IsForeground Then ev = \"B4XPage_Foreground\" El";
if (__ref._isforeground /*boolean*/ ) { 
_ev = "B4XPage_Foreground";}
else {
_ev = "B4XPage_Background";};
RDebugUtils.currentLine=16908293;
 //BA.debugLineNum = 16908293;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_pi = (b4j.example.b4xpagesmanager._b4xpageinfo)(group5.Get(index5));
RDebugUtils.currentLine=16908294;
 //BA.debugLineNum = 16908294;BA.debugLine="If xui.SubExists(pi.B4XPage, ev, 0) Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_pi.B4XPage /*Object*/ ,_ev,(int) (0))) { 
RDebugUtils.currentLine=16908295;
 //BA.debugLineNum = 16908295;BA.debugLine="LogEvent(pi, ev)";
__ref._logevent /*String*/ (null,_pi,_ev);
RDebugUtils.currentLine=16908296;
 //BA.debugLineNum = 16908296;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=16908297;
 //BA.debugLineNum = 16908297;BA.debugLine="CallSubDelayed(pi.B4XPage, ev)";
__c.CallSubDelayed(ba,_pi.B4XPage /*Object*/ ,_ev);
 }else {
RDebugUtils.currentLine=16908299;
 //BA.debugLineNum = 16908299;BA.debugLine="CallSub(pi.B4XPage, ev)";
__c.CallSubNew(ba,_pi.B4XPage /*Object*/ ,_ev);
 };
 };
 }
};
RDebugUtils.currentLine=16908303;
 //BA.debugLineNum = 16908303;BA.debugLine="End Sub";
return "";
}
public String  _raiseevent(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _targetpage,String _subname,Object[] _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "raiseevent", true))
	 {return ((String) Debug.delegate(ba, "raiseevent", new Object[] {_targetpage,_subname,_params}));}
int _length = 0;
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Public Sub RaiseEvent (TargetPage As B4XPageInfo,";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="If TargetPage = Null Then Return";
if (_targetpage== null) { 
if (true) return "";};
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=16515075;
 //BA.debugLineNum = 16515075;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== null) { 
_length = (int) (0);}
else {
_length = _params.length;};
RDebugUtils.currentLine=16515076;
 //BA.debugLineNum = 16515076;BA.debugLine="LogEvent(TargetPage, SubName)";
__ref._logevent /*String*/ (null,_targetpage,_subname);
RDebugUtils.currentLine=16515077;
 //BA.debugLineNum = 16515077;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_targetpage.B4XPage /*Object*/ ,_subname,_length)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=16515078;
 //BA.debugLineNum = 16515078;BA.debugLine="Select length";
switch (_length) {
case 0: {
RDebugUtils.currentLine=16515080;
 //BA.debugLineNum = 16515080;BA.debugLine="CallSubDelayed(TargetPage.B4XPage, SubName)";
__c.CallSubDelayed(ba,_targetpage.B4XPage /*Object*/ ,_subname);
 break; }
case 1: {
RDebugUtils.currentLine=16515082;
 //BA.debugLineNum = 16515082;BA.debugLine="CallSubDelayed2(TargetPage.B4XPage, SubName, Pa";
__c.CallSubDelayed2(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)]);
 break; }
case 2: {
RDebugUtils.currentLine=16515084;
 //BA.debugLineNum = 16515084;BA.debugLine="CallSubDelayed3(TargetPage.B4XPage, SubName, Pa";
__c.CallSubDelayed3(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)],_params[(int) (1)]);
 break; }
default: {
RDebugUtils.currentLine=16515086;
 //BA.debugLineNum = 16515086;BA.debugLine="Log(\"Too many parameters\")";
__c.LogImpl("916515086","Too many parameters",0);
 break; }
}
;
RDebugUtils.currentLine=16515088;
 //BA.debugLineNum = 16515088;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xpagesmanager._b4xpageinfo  _createb4xpageinfo(b4j.example.b4xpagesmanager __ref,Object _b4xpage,String _id,boolean _created,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createb4xpageinfo", true))
	 {return ((b4j.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "createb4xpageinfo", new Object[] {_b4xpage,_id,_created,_title}));}
b4j.example.b4xpagesmanager._b4xpageinfo _t1 = null;
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Private Sub CreateB4XPageInfo (B4XPage As Object,";
RDebugUtils.currentLine=16056321;
 //BA.debugLineNum = 16056321;BA.debugLine="Dim t1 As B4XPageInfo";
_t1 = new b4j.example.b4xpagesmanager._b4xpageinfo();
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=16056323;
 //BA.debugLineNum = 16056323;BA.debugLine="t1.B4XPage = B4XPage";
_t1.B4XPage /*Object*/  = _b4xpage;
RDebugUtils.currentLine=16056324;
 //BA.debugLineNum = 16056324;BA.debugLine="t1.Id = Id";
_t1.Id /*String*/  = _id;
RDebugUtils.currentLine=16056325;
 //BA.debugLineNum = 16056325;BA.debugLine="t1.Created = Created";
_t1.Created /*boolean*/  = _created;
RDebugUtils.currentLine=16056326;
 //BA.debugLineNum = 16056326;BA.debugLine="t1.Title = Title";
_t1.Title /*Object*/  = _title;
RDebugUtils.currentLine=16056327;
 //BA.debugLineNum = 16056327;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=16056328;
 //BA.debugLineNum = 16056328;BA.debugLine="End Sub";
return null;
}
public String  _createpageifneeded(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createpageifneeded", true))
	 {return ((String) Debug.delegate(ba, "createpageifneeded", new Object[] {_pi}));}
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Private Sub CreatePageIfNeeded(pi As B4XPageInfo)";
RDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="If pi.Created Then Return";
if (_pi.Created /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="pi.IsFirst = IdToB4XPage.Size = 1";
_pi.IsFirst /*boolean*/  = __ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._getsize /*int*/ (null)==1;
RDebugUtils.currentLine=15597571;
 //BA.debugLineNum = 15597571;BA.debugLine="CreatePageImpl (pi)";
__ref._createpageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=15597572;
 //BA.debugLineNum = 15597572;BA.debugLine="pi.Created = True";
_pi.Created /*boolean*/  = __c.True;
RDebugUtils.currentLine=15597573;
 //BA.debugLineNum = 15597573;BA.debugLine="RootB4XToPage.Put(pi.Root, pi)";
__ref._rootb4xtopage /*b4j.example.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_pi));
RDebugUtils.currentLine=15597574;
 //BA.debugLineNum = 15597574;BA.debugLine="LogEvent(pi, \"B4XPage_Created\")";
__ref._logevent /*String*/ (null,_pi,"B4XPage_Created");
RDebugUtils.currentLine=15597575;
 //BA.debugLineNum = 15597575;BA.debugLine="CallSub2(pi.B4XPage, \"B4XPage_Created\", pi.root)";
__c.CallSubDebug2(ba,_pi.B4XPage /*Object*/ ,"B4XPage_Created",(Object)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ));
RDebugUtils.currentLine=15597577;
 //BA.debugLineNum = 15597577;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xpagesmanager._b4xpageinfo  _getpagefromid(b4j.example.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpagefromid", true))
	 {return ((b4j.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "getpagefromid", new Object[] {_id}));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Private Sub GetPageFromId (id As String) As B4XPag";
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="Dim pi As B4XPageInfo = IdToB4XPage.Get(id.ToLowe";
_pi = (b4j.example.b4xpagesmanager._b4xpageinfo)(__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_id.toLowerCase())));
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="If pi = Null Then";
if (_pi== null) { 
RDebugUtils.currentLine=15859715;
 //BA.debugLineNum = 15859715;BA.debugLine="Log(\"Error: page id not found: \" & id)";
__c.LogImpl("915859715","Error: page id not found: "+_id,0);
RDebugUtils.currentLine=15859716;
 //BA.debugLineNum = 15859716;BA.debugLine="Log(\"Ids: \" & IdToB4XPage.Keys) 'ignore";
__c.LogImpl("915859716","Ids: "+BA.ObjectToString(__ref._idtob4xpage /*b4j.example.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null)),0);
 };
RDebugUtils.currentLine=15859718;
 //BA.debugLineNum = 15859718;BA.debugLine="Return pi";
if (true) return _pi;
RDebugUtils.currentLine=15859719;
 //BA.debugLineNum = 15859719;BA.debugLine="End Sub";
return null;
}
public String  _logevent(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi,String _ev) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "logevent", true))
	 {return ((String) Debug.delegate(ba, "logevent", new Object[] {_pi,_ev}));}
String _msg = "";
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Private Sub LogEvent (pi As B4XPageInfo, ev As Str";
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="If LogEvents Then";
if (__ref._logevents /*boolean*/ ) { 
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="Dim msg As String = $\"*** ${pi.Id}: ${ev} ${Stac";
_msg = ("*** "+__c.SmartStringFormatter("",(Object)(_pi.Id /*String*/ ))+": "+__c.SmartStringFormatter("",(Object)(_ev))+" "+__c.SmartStringFormatter("",(Object)(__ref._stackstring /*String*/ ))+"");
RDebugUtils.currentLine=17039363;
 //BA.debugLineNum = 17039363;BA.debugLine="Log(msg)";
__c.LogImpl("917039363",_msg,0);
 };
RDebugUtils.currentLine=17039365;
 //BA.debugLineNum = 17039365;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="Private IdToB4XPage As B4XOrderedMap";
_idtob4xpage = new b4j.example.b4xorderedmap();
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="Private RootB4XToPage As B4XOrderedMap";
_rootb4xtopage = new b4j.example.b4xorderedmap();
RDebugUtils.currentLine=14811144;
 //BA.debugLineNum = 14811144;BA.debugLine="Type B4XPageParent (NativeType As Form)";
;
RDebugUtils.currentLine=14811148;
 //BA.debugLineNum = 14811148;BA.debugLine="Type B4XPageInfo (B4XPage As Object, Id As String";
;
RDebugUtils.currentLine=14811152;
 //BA.debugLineNum = 14811152;BA.debugLine="Public mStackOfPageIds As B4XSet";
_mstackofpageids = new b4j.example.b4xset();
RDebugUtils.currentLine=14811153;
 //BA.debugLineNum = 14811153;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=14811155;
 //BA.debugLineNum = 14811155;BA.debugLine="Private mMainForm As Form";
_mmainform = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=14811163;
 //BA.debugLineNum = 14811163;BA.debugLine="Public IsForeground As Boolean";
_isforeground = false;
RDebugUtils.currentLine=14811164;
 //BA.debugLineNum = 14811164;BA.debugLine="Public TransitionAnimationDuration As Int = 100";
_transitionanimationduration = (int) (100);
RDebugUtils.currentLine=14811165;
 //BA.debugLineNum = 14811165;BA.debugLine="Public MainPage As B4XMainPage";
_mainpage = new b4j.example.b4xmainpage();
RDebugUtils.currentLine=14811166;
 //BA.debugLineNum = 14811166;BA.debugLine="Private StackString As String";
_stackstring = "";
RDebugUtils.currentLine=14811167;
 //BA.debugLineNum = 14811167;BA.debugLine="Public LogEvents As Boolean = False";
_logevents = __c.False;
RDebugUtils.currentLine=14811168;
 //BA.debugLineNum = 14811168;BA.debugLine="End Sub";
return "";
}
public String  _closepageimpl(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closepageimpl", true))
	 {return ((String) Debug.delegate(ba, "closepageimpl", new Object[] {_pi}));}
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Private Sub ClosePageImpl (pi As B4XPageInfo) 'ign";
RDebugUtils.currentLine=15466508;
 //BA.debugLineNum = 15466508;BA.debugLine="pi.Parent.NativeType.Close";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=15466512;
 //BA.debugLineNum = 15466512;BA.debugLine="End Sub";
return "";
}
public String  _toppagedisappear(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "toppagedisappear", true))
	 {return ((String) Debug.delegate(ba, "toppagedisappear", null));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Private Sub TopPageDisappear";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="If xui.IsB4J Then Return";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
if (true) return "";};
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=15269893;
 //BA.debugLineNum = 15269893;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=15269894;
 //BA.debugLineNum = 15269894;BA.debugLine="RaiseEventWithResult(pi, \"B4XPage_Disappear\", N";
__ref._raiseeventwithresult /*Object*/ (null,_pi,"B4XPage_Disappear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=15269897;
 //BA.debugLineNum = 15269897;BA.debugLine="End Sub";
return "";
}
public String  _showpageimpl(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpageimpl", true))
	 {return ((String) Debug.delegate(ba, "showpageimpl", new Object[] {_pi}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Private Sub ShowPageImpl (pi As B4XPageInfo)";
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="pi.Parent.NativeType.Show";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=15532035;
 //BA.debugLineNum = 15532035;BA.debugLine="Dim jo As JavaObject = pi.Parent.NativeType";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=15532036;
 //BA.debugLineNum = 15532036;BA.debugLine="jo.GetFieldJO(\"stage\").RunMethod(\"requestFocus\",";
_jo.GetFieldJO("stage").RunMethod("requestFocus",(Object[])(__c.Null));
RDebugUtils.currentLine=15532049;
 //BA.debugLineNum = 15532049;BA.debugLine="End Sub";
return "";
}
public String  _toppageappear(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "toppageappear", true))
	 {return ((String) Debug.delegate(ba, "toppageappear", null));}
b4j.example.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Private Sub TopPageAppear";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4j.example.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=15335427;
 //BA.debugLineNum = 15335427;BA.debugLine="pi.Parent.NativeType.Title = pi.Title";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .setTitle(BA.ObjectToString(_pi.Title /*Object*/ ));
RDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=15335429;
 //BA.debugLineNum = 15335429;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=15335430;
 //BA.debugLineNum = 15335430;BA.debugLine="RaiseEvent(pi, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,_pi,"B4XPage_Appear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=15335439;
 //BA.debugLineNum = 15335439;BA.debugLine="UpdateStackString";
__ref._updatestackstring /*String*/ (null);
RDebugUtils.currentLine=15335440;
 //BA.debugLineNum = 15335440;BA.debugLine="End Sub";
return "";
}
public boolean  _closerequestexists(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closerequestexists", true))
	 {return ((Boolean) Debug.delegate(ba, "closerequestexists", new Object[] {_pi}));}
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Private Sub CloseRequestExists (pi As B4XPageInfo)";
RDebugUtils.currentLine=16384001;
 //BA.debugLineNum = 16384001;BA.debugLine="Return xui.SubExists(pi.B4XPage, \"B4XPage_CloseRe";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_pi.B4XPage /*Object*/ ,"B4XPage_CloseRequest",(int) (0));
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="End Sub";
return false;
}
public b4j.example.b4xpagesmanager._b4xpageparent  _createb4xpageparent(b4j.example.b4xpagesmanager __ref,anywheresoftware.b4j.objects.Form _nativetype) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createb4xpageparent", true))
	 {return ((b4j.example.b4xpagesmanager._b4xpageparent) Debug.delegate(ba, "createb4xpageparent", new Object[] {_nativetype}));}
b4j.example.b4xpagesmanager._b4xpageparent _t1 = null;
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Private Sub CreateB4XPageParent (NativeType As For";
RDebugUtils.currentLine=16777220;
 //BA.debugLineNum = 16777220;BA.debugLine="Dim t1 As B4XPageParent";
_t1 = new b4j.example.b4xpagesmanager._b4xpageparent();
RDebugUtils.currentLine=16777221;
 //BA.debugLineNum = 16777221;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=16777222;
 //BA.debugLineNum = 16777222;BA.debugLine="t1.NativeType = NativeType";
_t1.NativeType /*anywheresoftware.b4j.objects.Form*/  = _nativetype;
RDebugUtils.currentLine=16777223;
 //BA.debugLineNum = 16777223;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=16777224;
 //BA.debugLineNum = 16777224;BA.debugLine="End Sub";
return null;
}
public String  _createpageimpl(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createpageimpl", true))
	 {return ((String) Debug.delegate(ba, "createpageimpl", new Object[] {_pi}));}
anywheresoftware.b4j.objects.Form _f = null;
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Private Sub CreatePageImpl (pi As B4XPageInfo)";
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="If pi.IsFirst Then";
if (_pi.IsFirst /*boolean*/ ) { 
RDebugUtils.currentLine=15728643;
 //BA.debugLineNum = 15728643;BA.debugLine="pi.Parent = CreateB4XPageParent(mMainForm)";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/  = __ref._createb4xpageparent /*b4j.example.b4xpagesmanager._b4xpageparent*/ (null,__ref._mmainform /*anywheresoftware.b4j.objects.Form*/ );
 }else {
RDebugUtils.currentLine=15728645;
 //BA.debugLineNum = 15728645;BA.debugLine="Dim f As Form";
_f = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=15728646;
 //BA.debugLineNum = 15728646;BA.debugLine="f.Initialize(\"MainForm\", mMainForm.RootPane.Widt";
_f.Initialize(ba,"MainForm",__ref._mmainform /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getWidth(),__ref._mmainform /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getHeight());
RDebugUtils.currentLine=15728647;
 //BA.debugLineNum = 15728647;BA.debugLine="pi.Parent = CreateB4XPageParent(f)";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/  = __ref._createb4xpageparent /*b4j.example.b4xpagesmanager._b4xpageparent*/ (null,_f);
 };
RDebugUtils.currentLine=15728649;
 //BA.debugLineNum = 15728649;BA.debugLine="pi.Root = pi.Parent.NativeType.RootPane";
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject()));
RDebugUtils.currentLine=15728650;
 //BA.debugLineNum = 15728650;BA.debugLine="pi.Parent.NativeType.Title = pi.Title";
_pi.Parent /*b4j.example.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .setTitle(BA.ObjectToString(_pi.Title /*Object*/ ));
RDebugUtils.currentLine=15728663;
 //BA.debugLineNum = 15728663;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xpagesmanager._b4xpageinfo  _getpageinfofromroot(b4j.example.b4xpagesmanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpageinfofromroot", true))
	 {return ((b4j.example.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "getpageinfofromroot", new Object[] {_root}));}
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Public Sub GetPageInfoFromRoot (Root As B4XView) A";
RDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="Return RootB4XToPage.Get(Root)";
if (true) return (b4j.example.b4xpagesmanager._b4xpageinfo)(__ref._rootb4xtopage /*b4j.example.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_root.getObject())));
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="End Sub";
return null;
}
public void  _handlecloserequest(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "handlecloserequest", true))
	 {Debug.delegate(ba, "handlecloserequest", new Object[] {_pi}); return;}
ResumableSub_HandleCloseRequest rsub = new ResumableSub_HandleCloseRequest(this,__ref,_pi);
rsub.resume(ba, null);
}
public static class ResumableSub_HandleCloseRequest extends BA.ResumableSub {
public ResumableSub_HandleCloseRequest(b4j.example.b4xpagesmanager parent,b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) {
this.parent = parent;
this.__ref = __ref;
this._pi = _pi;
this.__ref = parent;
}
b4j.example.b4xpagesmanager __ref;
b4j.example.b4xpagesmanager parent;
b4j.example.b4xpagesmanager._b4xpageinfo _pi;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
boolean _shouldclose = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xpagesmanager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="LogEvent(pi, \"B4XPage_CloseRequest\")";
__ref._logevent /*String*/ (null,_pi,"B4XPage_CloseRequest");
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="Dim rs As ResumableSub = CallSub(pi.B4XPage, \"B4X";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), (anywheresoftware.b4a.BA.ResumableSub)(parent.__c.CallSubDebug(ba,_pi.B4XPage /*Object*/ ,"B4XPage_CloseRequest")));
RDebugUtils.currentLine=16449539;
 //BA.debugLineNum = 16449539;BA.debugLine="Wait For (rs) Complete (ShouldClose As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xpagesmanager", "handlecloserequest"), _rs);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_shouldclose = (boolean) result[1];
;
RDebugUtils.currentLine=16449540;
 //BA.debugLineNum = 16449540;BA.debugLine="If ShouldClose Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_shouldclose) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=16449541;
 //BA.debugLineNum = 16449541;BA.debugLine="ClosePage(pi.B4XPage)";
__ref._closepage /*String*/ (null,_pi.B4XPage /*Object*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=16449543;
 //BA.debugLineNum = 16449543;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _updatestackstring(b4j.example.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "updatestackstring", true))
	 {return ((String) Debug.delegate(ba, "updatestackstring", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _id = "";
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Public Sub UpdateStackString";
RDebugUtils.currentLine=17104897;
 //BA.debugLineNum = 17104897;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=17104899;
 //BA.debugLineNum = 17104899;BA.debugLine="sb.Append(\"[\")";
_sb.Append("[");
RDebugUtils.currentLine=17104900;
 //BA.debugLineNum = 17104900;BA.debugLine="If mStackOfPageIds.Size > 0 Then";
if (__ref._mstackofpageids /*b4j.example.b4xset*/ ._getsize /*int*/ (null)>0) { 
RDebugUtils.currentLine=17104901;
 //BA.debugLineNum = 17104901;BA.debugLine="For Each id As String In mStackOfPageIds.AsList";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._mstackofpageids /*b4j.example.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_id = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=17104902;
 //BA.debugLineNum = 17104902;BA.debugLine="sb.Append(id).Append(\", \")";
_sb.Append(_id).Append(", ");
 }
};
RDebugUtils.currentLine=17104904;
 //BA.debugLineNum = 17104904;BA.debugLine="sb.Remove(sb.Length - 2, sb.Length)";
_sb.Remove((int) (_sb.getLength()-2),_sb.getLength());
 };
RDebugUtils.currentLine=17104906;
 //BA.debugLineNum = 17104906;BA.debugLine="sb.Append(\"]\")";
_sb.Append("]");
RDebugUtils.currentLine=17104907;
 //BA.debugLineNum = 17104907;BA.debugLine="StackString = sb.ToString";
__ref._stackstring /*String*/  = _sb.ToString();
RDebugUtils.currentLine=17104908;
 //BA.debugLineNum = 17104908;BA.debugLine="End Sub";
return "";
}
public String  _movepagetotop(b4j.example.b4xpagesmanager __ref,b4j.example.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "movepagetotop", true))
	 {return ((String) Debug.delegate(ba, "movepagetotop", new Object[] {_pi}));}
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Private Sub MovePageToTop (pi As B4XPageInfo)";
RDebugUtils.currentLine=15990785;
 //BA.debugLineNum = 15990785;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._remove /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
__ref._mstackofpageids /*b4j.example.b4xset*/ ._add /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=15990787;
 //BA.debugLineNum = 15990787;BA.debugLine="UpdateStackString";
__ref._updatestackstring /*String*/ (null);
RDebugUtils.currentLine=15990788;
 //BA.debugLineNum = 15990788;BA.debugLine="End Sub";
return "";
}
}