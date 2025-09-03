package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xmainpage", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xmainpage.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pane1 = null;
public b4j.example.magmagrid _mg = null;
public anywheresoftware.b4j.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4j.objects.ButtonWrapper _button2 = null;
public anywheresoftware.b4a.objects.collections.List _list1 = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
anywheresoftware.b4a.objects.collections.List _vatlist = null;
anywheresoftware.b4a.objects.collections.Map _mapitem = null;
anywheresoftware.b4a.objects.collections.List _envfees = null;
anywheresoftware.b4a.objects.collections.Map _mapitems = null;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Main.scene =B4XPages.GetNativeParent(Me).As(JavaO";
_main._scene /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_b4xpages._getnativeparent /*anywheresoftware.b4j.objects.Form*/ (this)))).GetField("scene")));
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="Dim vatlist As List";
_vatlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="vatlist.Initialize";
_vatlist.Initialize();
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="Dim mapitem As Map";
_mapitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="mapitem.Initialize";
_mapitem.Initialize();
RDebugUtils.currentLine=589839;
 //BA.debugLineNum = 589839;BA.debugLine="mapitem.Put(\"Vat%\",\"0.00\")";
_mapitem.Put((Object)("Vat%"),(Object)("0.00"));
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="vatlist.Add(mapitem)";
_vatlist.Add((Object)(_mapitem.getObject()));
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="Dim mapitem As Map";
_mapitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=589843;
 //BA.debugLineNum = 589843;BA.debugLine="mapitem.Initialize";
_mapitem.Initialize();
RDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="mapitem.Put(\"Vat%\",\"6.00\")";
_mapitem.Put((Object)("Vat%"),(Object)("6.00"));
RDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="vatlist.Add(mapitem)";
_vatlist.Add((Object)(_mapitem.getObject()));
RDebugUtils.currentLine=589847;
 //BA.debugLineNum = 589847;BA.debugLine="Dim mapitem As Map";
_mapitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=589848;
 //BA.debugLineNum = 589848;BA.debugLine="mapitem.Initialize";
_mapitem.Initialize();
RDebugUtils.currentLine=589849;
 //BA.debugLineNum = 589849;BA.debugLine="mapitem.Put(\"Vat%\",\"13.00\")";
_mapitem.Put((Object)("Vat%"),(Object)("13.00"));
RDebugUtils.currentLine=589850;
 //BA.debugLineNum = 589850;BA.debugLine="vatlist.Add(mapitem)";
_vatlist.Add((Object)(_mapitem.getObject()));
RDebugUtils.currentLine=589852;
 //BA.debugLineNum = 589852;BA.debugLine="Dim mapitem As Map";
_mapitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=589853;
 //BA.debugLineNum = 589853;BA.debugLine="mapitem.Initialize";
_mapitem.Initialize();
RDebugUtils.currentLine=589854;
 //BA.debugLineNum = 589854;BA.debugLine="mapitem.Put(\"Vat%\",\"24.00\")";
_mapitem.Put((Object)("Vat%"),(Object)("24.00"));
RDebugUtils.currentLine=589855;
 //BA.debugLineNum = 589855;BA.debugLine="vatlist.Add(mapitem)";
_vatlist.Add((Object)(_mapitem.getObject()));
RDebugUtils.currentLine=589858;
 //BA.debugLineNum = 589858;BA.debugLine="Dim envfees As List";
_envfees = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=589859;
 //BA.debugLineNum = 589859;BA.debugLine="envfees.Initialize";
_envfees.Initialize();
RDebugUtils.currentLine=589860;
 //BA.debugLineNum = 589860;BA.debugLine="Dim mapitems As Map";
_mapitems = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=589861;
 //BA.debugLineNum = 589861;BA.debugLine="mapitems.Initialize";
_mapitems.Initialize();
RDebugUtils.currentLine=589862;
 //BA.debugLineNum = 589862;BA.debugLine="mapitems.put(\"Enviromental Fee\",\"\")";
_mapitems.Put((Object)("Enviromental Fee"),(Object)(""));
RDebugUtils.currentLine=589863;
 //BA.debugLineNum = 589863;BA.debugLine="mapitems.put(\"Env.Fee\",\"0.00\")";
_mapitems.Put((Object)("Env.Fee"),(Object)("0.00"));
RDebugUtils.currentLine=589864;
 //BA.debugLineNum = 589864;BA.debugLine="envfees.Add(mapitems)";
_envfees.Add((Object)(_mapitems.getObject()));
RDebugUtils.currentLine=589866;
 //BA.debugLineNum = 589866;BA.debugLine="mapitems.Initialize";
_mapitems.Initialize();
RDebugUtils.currentLine=589867;
 //BA.debugLineNum = 589867;BA.debugLine="mapitems.put(\"Enviromental Fee\",\"Plastic\")";
_mapitems.Put((Object)("Enviromental Fee"),(Object)("Plastic"));
RDebugUtils.currentLine=589868;
 //BA.debugLineNum = 589868;BA.debugLine="mapitems.put(\"Env.Fee\",\"0.08\")";
_mapitems.Put((Object)("Env.Fee"),(Object)("0.08"));
RDebugUtils.currentLine=589869;
 //BA.debugLineNum = 589869;BA.debugLine="envfees.Add(mapitems)";
_envfees.Add((Object)(_mapitems.getObject()));
RDebugUtils.currentLine=589871;
 //BA.debugLineNum = 589871;BA.debugLine="mapitems.Initialize";
_mapitems.Initialize();
RDebugUtils.currentLine=589872;
 //BA.debugLineNum = 589872;BA.debugLine="mapitems.put(\"Enviromental Fee\",\"Glass\")";
_mapitems.Put((Object)("Enviromental Fee"),(Object)("Glass"));
RDebugUtils.currentLine=589873;
 //BA.debugLineNum = 589873;BA.debugLine="mapitems.put(\"Env.Fee\",\"0.11\")";
_mapitems.Put((Object)("Env.Fee"),(Object)("0.11"));
RDebugUtils.currentLine=589874;
 //BA.debugLineNum = 589874;BA.debugLine="envfees.Add(mapitems)";
_envfees.Add((Object)(_mapitems.getObject()));
RDebugUtils.currentLine=589877;
 //BA.debugLineNum = 589877;BA.debugLine="mg.Initialize(Pane1)";
__ref._mg /*b4j.example.magmagrid*/ ._initialize /*String*/ (null,ba,__ref._pane1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=589879;
 //BA.debugLineNum = 589879;BA.debugLine="mg.AddColumn(\"ID\",False,True,True,70,\"TEXTFIELD_N";
__ref._mg /*b4j.example.magmagrid*/ ._addcolumn /*String*/ (null,"ID",__c.False,__c.True,__c.True,(int) (70),"TEXTFIELD_NUMERIC","",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),(int) (0),0,0,"CENTER",(int) (5),(int) (0),(int) (0),__c.False);
RDebugUtils.currentLine=589880;
 //BA.debugLineNum = 589880;BA.debugLine="mg.AddColumn(\"Item Desc\", False,False,True,215,\"T";
__ref._mg /*b4j.example.magmagrid*/ ._addcolumn /*String*/ (null,"Item Desc",__c.False,__c.False,__c.True,(int) (215),"TEXTFIELD","",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),(int) (40),0,0,"LEFT",(int) (0),(int) (0),(int) (0),__c.False);
RDebugUtils.currentLine=589881;
 //BA.debugLineNum = 589881;BA.debugLine="mg.AddColumn(\"Enviromental Fee\", False,False,True";
__ref._mg /*b4j.example.magmagrid*/ ._addcolumn /*String*/ (null,"Enviromental Fee",__c.False,__c.False,__c.True,(int) (180),"COMBOEDIT","",_envfees,(int) (0),0,0,"LEFT",(int) (0),(int) (0),(int) (0),__c.False);
RDebugUtils.currentLine=589882;
 //BA.debugLineNum = 589882;BA.debugLine="mg.AddColumn(\"Prod.Date\", False,False,True,115,\"D";
__ref._mg /*b4j.example.magmagrid*/ ._addcolumn /*String*/ (null,"Prod.Date",__c.False,__c.False,__c.True,(int) (115),"DATE",BA.NumberToString(__c.DateTime.getNow()),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),(int) (0),0,0,"CENTER",(int) (0),(int) (0),(int) (0),__c.False);
RDebugUtils.currentLine=589883;
 //BA.debugLineNum = 589883;BA.debugLine="mg.AddColumn(\"Price\", False,False,True,80,\"TEXTFI";
__ref._mg /*b4j.example.magmagrid*/ ._addcolumn /*String*/ (null,"Price",__c.False,__c.False,__c.True,(int) (80),"TEXTFIELD_NUMERIC","0",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),(int) (0),0,0,"RIGHT",(int) (1),(int) (2),(int) (2),__c.False);
RDebugUtils.currentLine=589884;
 //BA.debugLineNum = 589884;BA.debugLine="mg.AddColumn(\"Env.Fee\", True, False,True,50,\"TEXT";
__ref._mg /*b4j.example.magmagrid*/ ._addcolumn /*String*/ (null,"Env.Fee",__c.True,__c.False,__c.True,(int) (50),"TEXTFIELD_NUMERIC","0.00",_envfees,(int) (0),0,0,"RIGHT",(int) (1),(int) (2),(int) (2),__c.False);
RDebugUtils.currentLine=589885;
 //BA.debugLineNum = 589885;BA.debugLine="mg.AddColumn(\"Qty\", False,False,True,50,\"TEXTFIEL";
__ref._mg /*b4j.example.magmagrid*/ ._addcolumn /*String*/ (null,"Qty",__c.False,__c.False,__c.True,(int) (50),"TEXTFIELD_NUMERIC","1.00",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),(int) (0),0,0,"CENTER",(int) (1),(int) (2),(int) (2),__c.False);
RDebugUtils.currentLine=589886;
 //BA.debugLineNum = 589886;BA.debugLine="mg.AddColumn(\"Vat%\", False,False,False,90,\"COMBO\"";
__ref._mg /*b4j.example.magmagrid*/ ._addcolumn /*String*/ (null,"Vat%",__c.False,__c.False,__c.False,(int) (90),"COMBO","",_vatlist,(int) (0),0,99.99,"RIGHT",(int) (2),(int) (2),(int) (2),__c.False);
RDebugUtils.currentLine=589887;
 //BA.debugLineNum = 589887;BA.debugLine="mg.AddColumn(\"Tot.Price wo VAT\", False,True,False";
__ref._mg /*b4j.example.magmagrid*/ ._addcolumn /*String*/ (null,"Tot.Price wo VAT",__c.False,__c.True,__c.False,(int) (90),"TEXTFIELD_NUMERIC","",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),(int) (0),0,0,"RIGHT",(int) (1),(int) (2),(int) (2),__c.False);
RDebugUtils.currentLine=589888;
 //BA.debugLineNum = 589888;BA.debugLine="mg.AddColumn(\"VAT\", False,True,False,90,\"TEXTFIEL";
__ref._mg /*b4j.example.magmagrid*/ ._addcolumn /*String*/ (null,"VAT",__c.False,__c.True,__c.False,(int) (90),"TEXTFIELD_NUMERIC","",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),(int) (0),0,0,"RIGHT",(int) (1),(int) (2),(int) (2),__c.False);
RDebugUtils.currentLine=589889;
 //BA.debugLineNum = 589889;BA.debugLine="mg.AddColumn(\"Tot.Price w VAT\", False,True,False,";
__ref._mg /*b4j.example.magmagrid*/ ._addcolumn /*String*/ (null,"Tot.Price w VAT",__c.False,__c.True,__c.False,(int) (90),"TEXTFIELD_NUMERIC","",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),(int) (0),0,0,"RIGHT",(int) (1),(int) (2),(int) (2),__c.False);
RDebugUtils.currentLine=589890;
 //BA.debugLineNum = 589890;BA.debugLine="mg.AddColumn(\"Check\", False,False,False,50,\"CHECK";
__ref._mg /*b4j.example.magmagrid*/ ._addcolumn /*String*/ (null,"Check",__c.False,__c.False,__c.False,(int) (50),"CHECKBOX",BA.ObjectToString(__c.Chr((int) (9744))),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),(int) (0),0,0,"CENTER",(int) (0),(int) (0),(int) (0),__c.False);
RDebugUtils.currentLine=589893;
 //BA.debugLineNum = 589893;BA.debugLine="mg.AddHorizontalPraxis(\"[Tot.Price wo VAT]=(([Pri";
__ref._mg /*b4j.example.magmagrid*/ ._addhorizontalpraxis /*String*/ (null,"[Tot.Price wo VAT]=(([Price]+[Env.Fee])*[Qty])");
RDebugUtils.currentLine=589894;
 //BA.debugLineNum = 589894;BA.debugLine="mg.AddHorizontalPraxis(\"[VAT]=[Tot.Price wo VAT]*";
__ref._mg /*b4j.example.magmagrid*/ ._addhorizontalpraxis /*String*/ (null,"[VAT]=[Tot.Price wo VAT]*([Vat%]/100)");
RDebugUtils.currentLine=589895;
 //BA.debugLineNum = 589895;BA.debugLine="mg.AddHorizontalPraxis(\"[Tot.Price w VAT]=[Tot.Pr";
__ref._mg /*b4j.example.magmagrid*/ ._addhorizontalpraxis /*String*/ (null,"[Tot.Price w VAT]=[Tot.Price wo VAT]+[VAT]");
RDebugUtils.currentLine=589901;
 //BA.debugLineNum = 589901;BA.debugLine="list1.Initialize";
__ref._list1 /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=589902;
 //BA.debugLineNum = 589902;BA.debugLine="list1.Add(Array As String(\"1\",\"Tzatziki 200gr\",\"P";
__ref._list1 /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{"1","Tzatziki 200gr","Plastic",BA.NumberToString(__c.DateTime.getNow()),"3.30","0.08","3.00","13.00","","","",BA.ObjectToString(__c.Chr((int) (9744)))}));
RDebugUtils.currentLine=589903;
 //BA.debugLineNum = 589903;BA.debugLine="list1.Add(Array As String(\"2\",\"Taramosalata 100gr";
__ref._list1 /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{"2","Taramosalata 100gr","Plastic",BA.NumberToString(__c.DateTime.getNow()),"3.90","0.08","1.00","13.00","","","",BA.ObjectToString(__c.Chr((int) (9746)))}));
RDebugUtils.currentLine=589904;
 //BA.debugLineNum = 589904;BA.debugLine="list1.Add(Array As String(\"3\",\"Red Wine 750ml\",\"G";
__ref._list1 /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{"3","Red Wine 750ml","Glass",BA.NumberToString(__c.DateTime.getNow()),"9.90","0.11","1.00","24.00","","","",BA.ObjectToString(__c.Chr((int) (9744)))}));
RDebugUtils.currentLine=589907;
 //BA.debugLineNum = 589907;BA.debugLine="mg.AlignAllCols";
__ref._mg /*b4j.example.magmagrid*/ ._alignallcols /*String*/ (null);
RDebugUtils.currentLine=589909;
 //BA.debugLineNum = 589909;BA.debugLine="mg.SetData(list1)";
__ref._mg /*b4j.example.magmagrid*/ ._setdata /*void*/ (null,__ref._list1 /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=589914;
 //BA.debugLineNum = 589914;BA.debugLine="End Sub";
return "";
}
public String  _button1_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
anywheresoftware.b4a.objects.collections.List _newlist = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub Button1_Click";
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="Log(\"Total without VAT: \" & mg.SumRows(\"Tot.Price";
__c.LogImpl("7655366","Total without VAT: "+BA.NumberToString(__ref._mg /*b4j.example.magmagrid*/ ._sumrows /*double*/ (null,"Tot.Price wo VAT","")),0);
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="Log(\"Total with VAT: \" & mg.SumRows(\"Tot.Price w";
__c.LogImpl("7655369","Total with VAT: "+BA.NumberToString(__ref._mg /*b4j.example.magmagrid*/ ._sumrows /*double*/ (null,"Tot.Price w VAT","")),0);
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="Log(\"only VAT 13%: \" & mg.SumRows(\"VAT\",\"SELECT";
__c.LogImpl("7655372","only VAT 13%: "+BA.NumberToString(__ref._mg /*b4j.example.magmagrid*/ ._sumrows /*double*/ (null,"VAT","SELECT  SUM([VAT]) as myvalue FROM data WHERE [Vat%]='13.00';")),0);
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="Dim newlist As List=mg.GetData";
_newlist = new anywheresoftware.b4a.objects.collections.List();
_newlist = __ref._mg /*b4j.example.magmagrid*/ ._getdata /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=655378;
 //BA.debugLineNum = 655378;BA.debugLine="mg.SetData(newlist)";
__ref._mg /*b4j.example.magmagrid*/ ._setdata /*void*/ (null,_newlist);
RDebugUtils.currentLine=655379;
 //BA.debugLineNum = 655379;BA.debugLine="End Sub";
return "";
}
public void  _button2_click(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button2_click", false))
	 {Debug.delegate(ba, "button2_click", null); return;}
ResumableSub_Button2_Click rsub = new ResumableSub_Button2_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Button2_Click extends BA.ResumableSub {
public ResumableSub_Button2_Click(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
anywheresoftware.b4a.objects.collections.List _newlist = null;
Object[] _maxrow = null;
int _newid = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Dim newlist As List = mg.GetData";
_newlist = new anywheresoftware.b4a.objects.collections.List();
_newlist = __ref._mg /*b4j.example.magmagrid*/ ._getdata /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Dim maxRow() As Object = newlist.Get(newlist.Size";
_maxrow = (Object[])(_newlist.Get((int) (_newlist.getSize()-1)));
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Dim newID As Int = maxRow(0) + 1";
_newid = (int) ((double)(BA.ObjectToNumber(_maxrow[(int) (0)]))+1);
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="newlist.Add(Array As String(newID,\"\",\"\",DateTime.";
_newlist.Add((Object)(new String[]{BA.NumberToString(_newid),"","",BA.NumberToString(parent.__c.DateTime.getNow()),"0.00","0.00","1.00","24.00"}));
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="mg.SetData(newlist)";
__ref._mg /*b4j.example.magmagrid*/ ._setdata /*void*/ (null,_newlist);
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "button2_click"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="mg.CalcAll";
__ref._mg /*b4j.example.magmagrid*/ ._calcall /*String*/ (null);
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private Pane1 As B4XView";
_pane1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Dim mg As MagmaGrid";
_mg = new b4j.example.magmagrid();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Private Button2 As Button";
_button2 = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="Dim list1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
}