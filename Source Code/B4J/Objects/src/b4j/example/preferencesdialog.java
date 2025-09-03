package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class preferencesdialog extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.preferencesdialog", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.preferencesdialog.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _b4xprefitem{
public boolean IsInitialized;
public Object Title;
public int ItemType;
public anywheresoftware.b4a.objects.collections.Map Extra;
public String Key;
public boolean Required;
public void Initialize() {
IsInitialized = true;
Title = new Object();
ItemType = 0;
Extra = new anywheresoftware.b4a.objects.collections.Map();
Key = "";
Required = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public b4j.example.customlistview _customlistview1 = null;
public anywheresoftware.b4a.objects.collections.List _prefitems = null;
public int _type_boolean = 0;
public int _type_text = 0;
public int _type_date = 0;
public int _type_options = 0;
public int _type_color = 0;
public int _type_separator = 0;
public int _type_number = 0;
public int _type_password = 0;
public int _type_shortoptions = 0;
public int _type_decimalnumber = 0;
public int _type_multilinetext = 0;
public int _type_time = 0;
public int _type_numericrange = 0;
public int _type_explanation = 0;
public b4j.example.b4xdatetemplate _datetemplate = null;
public b4j.example.b4xlongtexttemplate _longtexttemplate = null;
public b4j.example.b4xdialog _dialog = null;
public int _result_showing_nested_dialog = 0;
public int _nesteddialogitemindex = 0;
public Object _mtitle = null;
public b4j.example.b4xsearchtemplate _searchtemplate = null;
public Object _template = null;
public b4j.example.b4xcolortemplate _colortemplate = null;
public b4j.example.b4xcombobox _b4xcombobox1 = null;
public int _theme_dark = 0;
public int _theme_light = 0;
public int _mtheme = 0;
public int _itemsbackgroundcolor = 0;
public int _textcolor = 0;
public int _separatorbackgroundcolor = 0;
public int _separatortextcolor = 0;
public Object _mcallback = null;
public String _meventname = "";
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _defaulthintfont = null;
public int _defaulthintlargesize = 0;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _addbooleanitem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addbooleanitem", true))
	 {return ((String) Debug.delegate(ba, "addbooleanitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Public Sub AddBooleanItem (Key As String, Title As";
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_BOOLEAN,";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_boolean /*int*/ ,_key)));
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="End Sub";
return "";
}
public b4j.example.preferencesdialog._b4xprefitem  _createprefitem(b4j.example.preferencesdialog __ref,Object _title,int _itemtype,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "createprefitem", true))
	 {return ((b4j.example.preferencesdialog._b4xprefitem) Debug.delegate(ba, "createprefitem", new Object[] {_title,_itemtype,_key}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Private Sub CreatePrefItem(Title As Object, ItemTy";
RDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="Dim pi As B4XPrefItem";
_pi = new b4j.example.preferencesdialog._b4xprefitem();
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="pi.Initialize";
_pi.Initialize();
RDebugUtils.currentLine=18612227;
 //BA.debugLineNum = 18612227;BA.debugLine="pi.Title = Title";
_pi.Title /*Object*/  = _title;
RDebugUtils.currentLine=18612228;
 //BA.debugLineNum = 18612228;BA.debugLine="pi.ItemType = ItemType";
_pi.ItemType /*int*/  = _itemtype;
RDebugUtils.currentLine=18612229;
 //BA.debugLineNum = 18612229;BA.debugLine="pi.Key = Key";
_pi.Key /*String*/  = _key;
RDebugUtils.currentLine=18612230;
 //BA.debugLineNum = 18612230;BA.debugLine="Return pi";
if (true) return _pi;
RDebugUtils.currentLine=18612231;
 //BA.debugLineNum = 18612231;BA.debugLine="End Sub";
return null;
}
public String  _addcoloritem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addcoloritem", true))
	 {return ((String) Debug.delegate(ba, "addcoloritem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Public Sub AddColorItem(Key As String, Title As Ob";
RDebugUtils.currentLine=18415617;
 //BA.debugLineNum = 18415617;BA.debugLine="If ColorTemplate.IsInitialized = False Then";
if (__ref._colortemplate /*b4j.example.b4xcolortemplate*/ .IsInitialized /*boolean*/ ()==__c.False) { 
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="ColorTemplate.Initialize";
__ref._colortemplate /*b4j.example.b4xcolortemplate*/ ._initialize /*String*/ (null,ba);
 };
RDebugUtils.currentLine=18415620;
 //BA.debugLineNum = 18415620;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_COLOR, K";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_color /*int*/ ,_key)));
RDebugUtils.currentLine=18415621;
 //BA.debugLineNum = 18415621;BA.debugLine="End Sub";
return "";
}
public String  _adddateitem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "adddateitem", true))
	 {return ((String) Debug.delegate(ba, "adddateitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Public Sub AddDateItem (Key As String, Title As Ob";
RDebugUtils.currentLine=18350081;
 //BA.debugLineNum = 18350081;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_DATE, Ke";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_date /*int*/ ,_key)));
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="End Sub";
return "";
}
public String  _adddecimalnumberitem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "adddecimalnumberitem", true))
	 {return ((String) Debug.delegate(ba, "adddecimalnumberitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Public Sub AddDecimalNumberItem (Key As String, Ti";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_DECIMALN";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_decimalnumber /*int*/ ,_key)));
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="End Sub";
return "";
}
public String  _addexplanationitem(b4j.example.preferencesdialog __ref,String _key,Object _title,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addexplanationitem", true))
	 {return ((String) Debug.delegate(ba, "addexplanationitem", new Object[] {_key,_title,_text}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Public Sub AddExplanationItem (Key As String, Titl";
RDebugUtils.currentLine=18481153;
 //BA.debugLineNum = 18481153;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_explanation /*int*/ ,_key);
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="pi.Extra = CreateMap(\"text\": Text)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("text"),_text});
RDebugUtils.currentLine=18481155;
 //BA.debugLineNum = 18481155;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=18481156;
 //BA.debugLineNum = 18481156;BA.debugLine="End Sub";
return "";
}
public String  _addmultilinetextitem(b4j.example.preferencesdialog __ref,String _key,Object _title,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addmultilinetextitem", true))
	 {return ((String) Debug.delegate(ba, "addmultilinetextitem", new Object[] {_key,_title,_height}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Public Sub AddMultilineTextItem (Key As String, Ti";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_multilinetext /*int*/ ,_key);
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="pi.Extra = CreateMap(\"height\": Height)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("height"),(Object)(_height)});
RDebugUtils.currentLine=18087939;
 //BA.debugLineNum = 18087939;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=18087940;
 //BA.debugLineNum = 18087940;BA.debugLine="End Sub";
return "";
}
public String  _addnumberitem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addnumberitem", true))
	 {return ((String) Debug.delegate(ba, "addnumberitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Public Sub AddNumberItem (Key As String, Title As";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_NUMBER,";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_number /*int*/ ,_key)));
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="End Sub";
return "";
}
public String  _addnumericrangeitem(b4j.example.preferencesdialog __ref,String _key,Object _title,double _rangestart,double _rangeend,double _interval) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addnumericrangeitem", true))
	 {return ((String) Debug.delegate(ba, "addnumericrangeitem", new Object[] {_key,_title,_rangestart,_rangeend,_interval}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Public Sub AddNumericRangeItem (Key As String, Tit";
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_numericrange /*int*/ ,_key);
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="pi.Extra = CreateMap(\"start\": RangeStart, \"end\":";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("start"),(Object)(_rangestart),(Object)("end"),(Object)(_rangeend),(Object)("interval"),(Object)(_interval)});
RDebugUtils.currentLine=18153475;
 //BA.debugLineNum = 18153475;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=18153476;
 //BA.debugLineNum = 18153476;BA.debugLine="End Sub";
return "";
}
public String  _addoptionsitem(b4j.example.preferencesdialog __ref,String _key,Object _title,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addoptionsitem", true))
	 {return ((String) Debug.delegate(ba, "addoptionsitem", new Object[] {_key,_title,_options}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Public Sub AddOptionsItem (Key As String, Title As";
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_options /*int*/ ,_key);
RDebugUtils.currentLine=17694723;
 //BA.debugLineNum = 17694723;BA.debugLine="If Options.IsInitialized Then";
if (_options.IsInitialized()) { 
RDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="pi.Extra = CreateMap(\"options\": Options)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("options"),(Object)(_options.getObject())});
 };
RDebugUtils.currentLine=17694726;
 //BA.debugLineNum = 17694726;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=17694727;
 //BA.debugLineNum = 17694727;BA.debugLine="End Sub";
return "";
}
public String  _addpassworditem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addpassworditem", true))
	 {return ((String) Debug.delegate(ba, "addpassworditem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Public Sub AddPasswordItem (Key As String, Title A";
RDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_PASSWORD";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_password /*int*/ ,_key)));
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="End Sub";
return "";
}
public String  _addseparator(b4j.example.preferencesdialog __ref,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addseparator", true))
	 {return ((String) Debug.delegate(ba, "addseparator", new Object[] {_title}));}
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Public Sub AddSeparator (Title As Object)";
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_SEPARATO";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_separator /*int*/ ,"")));
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="End Sub";
return "";
}
public String  _addshortoptionsitem(b4j.example.preferencesdialog __ref,String _key,Object _title,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addshortoptionsitem", true))
	 {return ((String) Debug.delegate(ba, "addshortoptionsitem", new Object[] {_key,_title,_options}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Public Sub AddShortOptionsItem (Key As String, Tit";
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_shortoptions /*int*/ ,_key);
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="If Options.IsInitialized Then";
if (_options.IsInitialized()) { 
RDebugUtils.currentLine=17760259;
 //BA.debugLineNum = 17760259;BA.debugLine="pi.Extra = CreateMap(\"options\": Options)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("options"),(Object)(_options.getObject())});
 };
RDebugUtils.currentLine=17760261;
 //BA.debugLineNum = 17760261;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=17760262;
 //BA.debugLineNum = 17760262;BA.debugLine="End Sub";
return "";
}
public String  _addtextitem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addtextitem", true))
	 {return ((String) Debug.delegate(ba, "addtextitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Public Sub AddTextItem (Key As String, Title As Ob";
RDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_TEXT, Ke";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_text /*int*/ ,_key)));
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="End Sub";
return "";
}
public String  _addtimeitem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addtimeitem", true))
	 {return ((String) Debug.delegate(ba, "addtimeitem", new Object[] {_key,_title}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Public Sub AddTimeItem (Key As String, Title As Ob";
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_time /*int*/ ,_key);
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="pi.Extra = CreateMap(\"24\": False)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("24"),(Object)(__c.False)});
RDebugUtils.currentLine=18219011;
 //BA.debugLineNum = 18219011;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=18219012;
 //BA.debugLineNum = 18219012;BA.debugLine="End Sub";
return "";
}
public String  _b4xcombobox1_selectedindexchanged(b4j.example.preferencesdialog __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "b4xcombobox1_selectedindexchanged", true))
	 {return ((String) Debug.delegate(ba, "b4xcombobox1_selectedindexchanged", new Object[] {_index}));}
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Private Sub B4XComboBox1_SelectedIndexChanged (Ind";
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="End Sub";
return "";
}
public String  _b4xswitch1_valuechanged(b4j.example.preferencesdialog __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "b4xswitch1_valuechanged", true))
	 {return ((String) Debug.delegate(ba, "b4xswitch1_valuechanged", new Object[] {_value}));}
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Private Sub B4XSwitch1_ValueChanged (Value As Bool";
RDebugUtils.currentLine=20381698;
 //BA.debugLineNum = 20381698;BA.debugLine="End Sub";
return "";
}
public boolean  _backkeypressed(b4j.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "backkeypressed", true))
	 {return ((Boolean) Debug.delegate(ba, "backkeypressed", null));}
RDebugUtils.currentLine=17563648;
 //BA.debugLineNum = 17563648;BA.debugLine="Public Sub BackKeyPressed As Boolean";
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="If Dialog.Visible Then";
if (__ref._dialog /*b4j.example.b4xdialog*/ ._getvisible /*boolean*/ (null)) { 
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="Dialog.Close(xui.DialogResponse_Cancel)";
__ref._dialog /*b4j.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=17563651;
 //BA.debugLineNum = 17563651;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=17563653;
 //BA.debugLineNum = 17563653;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=17563654;
 //BA.debugLineNum = 17563654;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
RDebugUtils.currentLine=17170432;
 //BA.debugLineNum = 17170432;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=17170433;
 //BA.debugLineNum = 17170433;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=17170435;
 //BA.debugLineNum = 17170435;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4j.example.customlistview();
RDebugUtils.currentLine=17170436;
 //BA.debugLineNum = 17170436;BA.debugLine="Type B4XPrefItem (Title As Object, ItemType As In";
;
RDebugUtils.currentLine=17170437;
 //BA.debugLineNum = 17170437;BA.debugLine="Public PrefItems As List";
_prefitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17170438;
 //BA.debugLineNum = 17170438;BA.debugLine="Public TYPE_BOOLEAN = 1, TYPE_TEXT = 2, TYPE_DATE";
_type_boolean = (int) (1);
_type_text = (int) (2);
_type_date = (int) (3);
_type_options = (int) (4);
_type_color = (int) (5);
_type_separator = (int) (6);
_type_number = (int) (7);
_type_password = (int) (8);
_type_shortoptions = (int) (9);
_type_decimalnumber = (int) (10);
_type_multilinetext = (int) (11);
_type_time = (int) (12);
_type_numericrange = (int) (13);
_type_explanation = (int) (14);
RDebugUtils.currentLine=17170441;
 //BA.debugLineNum = 17170441;BA.debugLine="Public DateTemplate As B4XDateTemplate";
_datetemplate = new b4j.example.b4xdatetemplate();
RDebugUtils.currentLine=17170442;
 //BA.debugLineNum = 17170442;BA.debugLine="Public LongTextTemplate As B4XLongTextTemplate";
_longtexttemplate = new b4j.example.b4xlongtexttemplate();
RDebugUtils.currentLine=17170443;
 //BA.debugLineNum = 17170443;BA.debugLine="Public Dialog As B4XDialog";
_dialog = new b4j.example.b4xdialog();
RDebugUtils.currentLine=17170444;
 //BA.debugLineNum = 17170444;BA.debugLine="Private RESULT_SHOWING_NESTED_DIALOG As Int = 100";
_result_showing_nested_dialog = (int) (100);
RDebugUtils.currentLine=17170445;
 //BA.debugLineNum = 17170445;BA.debugLine="Private NestedDialogItemIndex As Int";
_nesteddialogitemindex = 0;
RDebugUtils.currentLine=17170446;
 //BA.debugLineNum = 17170446;BA.debugLine="Private mTitle As Object";
_mtitle = new Object();
RDebugUtils.currentLine=17170447;
 //BA.debugLineNum = 17170447;BA.debugLine="Public SearchTemplate As B4XSearchTemplate";
_searchtemplate = new b4j.example.b4xsearchtemplate();
RDebugUtils.currentLine=17170448;
 //BA.debugLineNum = 17170448;BA.debugLine="Private Template As Object";
_template = new Object();
RDebugUtils.currentLine=17170449;
 //BA.debugLineNum = 17170449;BA.debugLine="Public ColorTemplate As B4XColorTemplate";
_colortemplate = new b4j.example.b4xcolortemplate();
RDebugUtils.currentLine=17170450;
 //BA.debugLineNum = 17170450;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
_b4xcombobox1 = new b4j.example.b4xcombobox();
RDebugUtils.currentLine=17170451;
 //BA.debugLineNum = 17170451;BA.debugLine="Public const THEME_DARK = 1, THEME_LIGHT = 2 As I";
_theme_dark = (int) (1);
_theme_light = (int) (2);
RDebugUtils.currentLine=17170452;
 //BA.debugLineNum = 17170452;BA.debugLine="Private mTheme As Int";
_mtheme = 0;
RDebugUtils.currentLine=17170453;
 //BA.debugLineNum = 17170453;BA.debugLine="Public ItemsBackgroundColor As Int";
_itemsbackgroundcolor = 0;
RDebugUtils.currentLine=17170454;
 //BA.debugLineNum = 17170454;BA.debugLine="Public TextColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=17170455;
 //BA.debugLineNum = 17170455;BA.debugLine="Public SeparatorBackgroundColor, SeparatorTextCol";
_separatorbackgroundcolor = 0;
_separatortextcolor = 0;
RDebugUtils.currentLine=17170456;
 //BA.debugLineNum = 17170456;BA.debugLine="Private mCallback As Object";
_mcallback = new Object();
RDebugUtils.currentLine=17170457;
 //BA.debugLineNum = 17170457;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=17170458;
 //BA.debugLineNum = 17170458;BA.debugLine="Public DefaultHintFont As B4XFont";
_defaulthintfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=17170459;
 //BA.debugLineNum = 17170459;BA.debugLine="Public DefaultHintLargeSize As Int";
_defaulthintlargesize = 0;
RDebugUtils.currentLine=17170460;
 //BA.debugLineNum = 17170460;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=18939905;
 //BA.debugLineNum = 18939905;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="PrefItems.Clear";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=18939907;
 //BA.debugLineNum = 18939907;BA.debugLine="End Sub";
return "";
}
public String  _colortohex(b4j.example.preferencesdialog __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "colortohex", true))
	 {return ((String) Debug.delegate(ba, "colortohex", new Object[] {_clr}));}
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Private Sub ColorToHex(clr As Int) As String";
RDebugUtils.currentLine=20578305;
 //BA.debugLineNum = 20578305;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="Return bc.HexFromBytes(bc.IntsToBytes(Array As In";
if (true) return _bc.HexFromBytes(_bc.IntsToBytes(new int[]{_clr}));
RDebugUtils.currentLine=20578307;
 //BA.debugLineNum = 20578307;BA.debugLine="End Sub";
return "";
}
public boolean  _commitchanges(b4j.example.preferencesdialog __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "commitchanges", true))
	 {return ((Boolean) Debug.delegate(ba, "commitchanges", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.Map _temp = null;
int _i = 0;
b4j.example.customlistview._clvitem _item = null;
b4j.example.preferencesdialog._b4xprefitem _prefitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _itempanel = null;
boolean _required = false;
Object _value = null;
b4j.example.b4xswitch _switch = null;
b4j.example.b4xfloattextfield _ft = null;
double _n = 0;
int _n2 = 0;
b4j.example.b4xplusminus _pmhours = null;
b4j.example.b4xplusminus _pmminutes = null;
b4j.example.b4xplusminus _pmampm = null;
b4j.example.dateutils._period _p = null;
b4j.example.b4xplusminus _pm = null;
b4j.example.b4xcombobox _cmb = null;
boolean _valid = false;
String _key = "";
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Private Sub CommitChanges (Data As Map) As Boolean";
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="Dim Temp As Map";
_temp = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="Temp.Initialize";
_temp.Initialize();
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=19529732;
 //BA.debugLineNum = 19529732;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = __ref._customlistview1 /*b4j.example.customlistview*/ ._getrawlistitem(_i);
RDebugUtils.currentLine=19529733;
 //BA.debugLineNum = 19529733;BA.debugLine="If (Item.Value Is B4XPrefItem) = False Then Exit";
if ((_item.Value instanceof b4j.example.preferencesdialog._b4xprefitem)==__c.False) { 
if (true) break;};
RDebugUtils.currentLine=19529734;
 //BA.debugLineNum = 19529734;BA.debugLine="Dim PrefItem As B4XPrefItem = Item.Value";
_prefitem = (b4j.example.preferencesdialog._b4xprefitem)(_item.Value);
RDebugUtils.currentLine=19529735;
 //BA.debugLineNum = 19529735;BA.debugLine="Dim ItemPanel As B4XView = Item.Panel.GetView(0)";
_itempanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_itempanel = _item.Panel.GetView((int) (0));
RDebugUtils.currentLine=19529736;
 //BA.debugLineNum = 19529736;BA.debugLine="Dim Required As Boolean = PrefItem.Required";
_required = _prefitem.Required /*boolean*/ ;
RDebugUtils.currentLine=19529737;
 //BA.debugLineNum = 19529737;BA.debugLine="Dim Value As Object";
_value = new Object();
RDebugUtils.currentLine=19529738;
 //BA.debugLineNum = 19529738;BA.debugLine="Select PrefItem.ItemType";
switch (BA.switchObjectToInt(_prefitem.ItemType /*int*/ ,__ref._type_boolean /*int*/ ,__ref._type_text /*int*/ ,__ref._type_password /*int*/ ,__ref._type_multilinetext /*int*/ ,__ref._type_number /*int*/ ,__ref._type_decimalnumber /*int*/ ,__ref._type_date /*int*/ ,__ref._type_time /*int*/ ,__ref._type_numericrange /*int*/ ,__ref._type_options /*int*/ ,__ref._type_shortoptions /*int*/ ,__ref._type_color /*int*/ ,__ref._type_separator /*int*/ ,__ref._type_explanation /*int*/ )) {
case 0: {
RDebugUtils.currentLine=19529740;
 //BA.debugLineNum = 19529740;BA.debugLine="Dim switch As B4XSwitch = ItemPanel.GetView(1)";
_switch = (b4j.example.b4xswitch)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=19529741;
 //BA.debugLineNum = 19529741;BA.debugLine="Value = switch.Value";
_value = (Object)(_switch._getvalue /*boolean*/ (null));
 break; }
case 1: 
case 2: 
case 3: {
RDebugUtils.currentLine=19529743;
 //BA.debugLineNum = 19529743;BA.debugLine="Dim ft As B4XFloatTextField = ItemPanel.GetVie";
_ft = (b4j.example.b4xfloattextfield)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=19529744;
 //BA.debugLineNum = 19529744;BA.debugLine="Value = ft.Text";
_value = (Object)(_ft._gettext /*String*/ (null));
 break; }
case 4: 
case 5: {
RDebugUtils.currentLine=19529747;
 //BA.debugLineNum = 19529747;BA.debugLine="Dim ft As B4XFloatTextField = ItemPanel.GetVie";
_ft = (b4j.example.b4xfloattextfield)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=19529748;
 //BA.debugLineNum = 19529748;BA.debugLine="Dim n As Double";
_n = 0;
RDebugUtils.currentLine=19529749;
 //BA.debugLineNum = 19529749;BA.debugLine="If ft.Text <> \"\" Then";
if ((_ft._gettext /*String*/ (null)).equals("") == false) { 
RDebugUtils.currentLine=19529750;
 //BA.debugLineNum = 19529750;BA.debugLine="If IsNumber(ft.Text) Then";
if (__c.IsNumber(_ft._gettext /*String*/ (null))) { 
RDebugUtils.currentLine=19529751;
 //BA.debugLineNum = 19529751;BA.debugLine="n = ft.Text";
_n = (double)(Double.parseDouble(_ft._gettext /*String*/ (null)));
RDebugUtils.currentLine=19529752;
 //BA.debugLineNum = 19529752;BA.debugLine="If PrefItem.ItemType = TYPE_NUMBER Then";
if (_prefitem.ItemType /*int*/ ==__ref._type_number /*int*/ ) { 
RDebugUtils.currentLine=19529753;
 //BA.debugLineNum = 19529753;BA.debugLine="Dim n2 As Int = n";
_n2 = (int) (_n);
RDebugUtils.currentLine=19529754;
 //BA.debugLineNum = 19529754;BA.debugLine="Value = n2";
_value = (Object)(_n2);
 }else {
RDebugUtils.currentLine=19529756;
 //BA.debugLineNum = 19529756;BA.debugLine="Value = n";
_value = (Object)(_n);
 };
 }else {
RDebugUtils.currentLine=19529759;
 //BA.debugLineNum = 19529759;BA.debugLine="GoToItem(i)";
__ref._gotoitem /*void*/ (null,_i);
RDebugUtils.currentLine=19529760;
 //BA.debugLineNum = 19529760;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }else {
RDebugUtils.currentLine=19529763;
 //BA.debugLineNum = 19529763;BA.debugLine="Value = \"\"";
_value = (Object)("");
 };
 break; }
case 6: {
RDebugUtils.currentLine=19529766;
 //BA.debugLineNum = 19529766;BA.debugLine="Value = DateTime.DateParse(ItemPanel.GetView(1";
_value = (Object)(__c.DateTime.DateParse(_itempanel.GetView((int) (1)).getText()));
 break; }
case 7: {
RDebugUtils.currentLine=19529768;
 //BA.debugLineNum = 19529768;BA.debugLine="Dim pmHours As B4XPlusMinus = ItemPanel.GetVie";
_pmhours = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=19529769;
 //BA.debugLineNum = 19529769;BA.debugLine="Dim pmMinutes As B4XPlusMinus = ItemPanel.GetV";
_pmminutes = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=19529770;
 //BA.debugLineNum = 19529770;BA.debugLine="Dim pmAMPM As B4XPlusMinus = ItemPanel.GetView";
_pmampm = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (2)).getTag());
RDebugUtils.currentLine=19529771;
 //BA.debugLineNum = 19529771;BA.debugLine="Dim p As Period";
_p = new b4j.example.dateutils._period();
RDebugUtils.currentLine=19529772;
 //BA.debugLineNum = 19529772;BA.debugLine="p.Initialize";
_p.Initialize();
RDebugUtils.currentLine=19529773;
 //BA.debugLineNum = 19529773;BA.debugLine="p.Hours = pmHours.SelectedValue";
_p.Hours = (int)(BA.ObjectToNumber(_pmhours._getselectedvalue /*Object*/ (null)));
RDebugUtils.currentLine=19529774;
 //BA.debugLineNum = 19529774;BA.debugLine="If PrefItem.Extra.GetDefault(\"24\", False) = Fa";
if ((_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("24"),(Object)(__c.False))).equals((Object)(__c.False))) { 
RDebugUtils.currentLine=19529775;
 //BA.debugLineNum = 19529775;BA.debugLine="If p.Hours = 12 Then p.Hours = 0";
if (_p.Hours==12) { 
_p.Hours = (int) (0);};
RDebugUtils.currentLine=19529776;
 //BA.debugLineNum = 19529776;BA.debugLine="If pmAMPM.SelectedValue = \"pm\" Then p.Hours =";
if ((_pmampm._getselectedvalue /*Object*/ (null)).equals((Object)("pm"))) { 
_p.Hours = (int) (_p.Hours+12);};
 };
RDebugUtils.currentLine=19529778;
 //BA.debugLineNum = 19529778;BA.debugLine="p.Minutes = pmMinutes.SelectedValue";
_p.Minutes = (int)(BA.ObjectToNumber(_pmminutes._getselectedvalue /*Object*/ (null)));
RDebugUtils.currentLine=19529779;
 //BA.debugLineNum = 19529779;BA.debugLine="Value = p";
_value = (Object)(_p);
 break; }
case 8: {
RDebugUtils.currentLine=19529781;
 //BA.debugLineNum = 19529781;BA.debugLine="Dim pm As B4XPlusMinus = ItemPanel.GetView(0).";
_pm = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=19529782;
 //BA.debugLineNum = 19529782;BA.debugLine="Value = pm.SelectedValue";
_value = _pm._getselectedvalue /*Object*/ (null);
 break; }
case 9: {
RDebugUtils.currentLine=19529784;
 //BA.debugLineNum = 19529784;BA.debugLine="Value = ItemPanel.GetView(1).Text";
_value = (Object)(_itempanel.GetView((int) (1)).getText());
 break; }
case 10: {
RDebugUtils.currentLine=19529786;
 //BA.debugLineNum = 19529786;BA.debugLine="Dim cmb As B4XComboBox = ItemPanel.GetView(1).";
_cmb = (b4j.example.b4xcombobox)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=19529787;
 //BA.debugLineNum = 19529787;BA.debugLine="If cmb.SelectedIndex > -1 Then Value = cmb.Get";
if (_cmb._getselectedindex /*int*/ (null)>-1) { 
_value = (Object)(_cmb._getitem /*String*/ (null,_cmb._getselectedindex /*int*/ (null)));}
else {
_value = (Object)("");};
 break; }
case 11: {
RDebugUtils.currentLine=19529789;
 //BA.debugLineNum = 19529789;BA.debugLine="Value = ItemPanel.GetView(1).Color";
_value = (Object)(_itempanel.GetView((int) (1)).getColor());
 break; }
case 12: 
case 13: {
RDebugUtils.currentLine=19529791;
 //BA.debugLineNum = 19529791;BA.debugLine="Continue";
if (true) continue;
 break; }
}
;
RDebugUtils.currentLine=19529793;
 //BA.debugLineNum = 19529793;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
RDebugUtils.currentLine=19529794;
 //BA.debugLineNum = 19529794;BA.debugLine="If Required Then";
if (_required) { 
RDebugUtils.currentLine=19529795;
 //BA.debugLineNum = 19529795;BA.debugLine="GoToItem(i)";
__ref._gotoitem /*void*/ (null,_i);
RDebugUtils.currentLine=19529796;
 //BA.debugLineNum = 19529796;BA.debugLine="Return False";
if (true) return __c.False;
 }else {
RDebugUtils.currentLine=19529798;
 //BA.debugLineNum = 19529798;BA.debugLine="Continue";
if (true) continue;
 };
 };
RDebugUtils.currentLine=19529801;
 //BA.debugLineNum = 19529801;BA.debugLine="Temp.Put(PrefItem.Key, Value)";
_temp.Put((Object)(_prefitem.Key /*String*/ ),_value);
 }
};
RDebugUtils.currentLine=19529803;
 //BA.debugLineNum = 19529803;BA.debugLine="If mEventName <> \"\" And xui.SubExists(mCallback,";
if ((__ref._meventname /*String*/ ).equals("") == false && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_IsValid",(int) (1))) { 
RDebugUtils.currentLine=19529804;
 //BA.debugLineNum = 19529804;BA.debugLine="Dim Valid As Boolean = CallSub2(mCallback, mEven";
_valid = BA.ObjectToBoolean(__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_IsValid",(Object)(_temp)));
RDebugUtils.currentLine=19529805;
 //BA.debugLineNum = 19529805;BA.debugLine="If Valid = False Then Return False";
if (_valid==__c.False) { 
if (true) return __c.False;};
 };
RDebugUtils.currentLine=19529807;
 //BA.debugLineNum = 19529807;BA.debugLine="For Each key As String In Temp.Keys";
{
final anywheresoftware.b4a.BA.IterableList group78 = _temp.Keys();
final int groupLen78 = group78.getSize()
;int index78 = 0;
;
for (; index78 < groupLen78;index78++){
_key = BA.ObjectToString(group78.Get(index78));
RDebugUtils.currentLine=19529808;
 //BA.debugLineNum = 19529808;BA.debugLine="Data.Put(key, Temp.Get(key))";
_data.Put((Object)(_key),_temp.Get((Object)(_key)));
 }
};
RDebugUtils.currentLine=19529810;
 //BA.debugLineNum = 19529810;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=19529811;
 //BA.debugLineNum = 19529811;BA.debugLine="End Sub";
return false;
}
public void  _gotoitem(b4j.example.preferencesdialog __ref,int _i) throws Exception{
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "gotoitem", true))
	 {Debug.delegate(ba, "gotoitem", new Object[] {_i}); return;}
ResumableSub_GoToItem rsub = new ResumableSub_GoToItem(this,__ref,_i);
rsub.resume(ba, null);
}
public static class ResumableSub_GoToItem extends BA.ResumableSub {
public ResumableSub_GoToItem(b4j.example.preferencesdialog parent,b4j.example.preferencesdialog __ref,int _i) {
this.parent = parent;
this.__ref = __ref;
this._i = _i;
this.__ref = parent;
}
b4j.example.preferencesdialog __ref;
b4j.example.preferencesdialog parent;
int _i;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _duration = 0;
int step3;
int limit3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="preferencesdialog";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="CustomListView1.JumpToItem(i)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._jumptoitem(_i);
RDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="Dim p As B4XView = CustomListView1.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=19660803;
 //BA.debugLineNum = 19660803;BA.debugLine="For i = 0 To 3";
if (true) break;

case 1:
//for
this.state = 4;
step3 = 1;
limit3 = (int) (3);
_i = (int) (0) ;
this.state = 5;
if (true) break;

case 5:
//C
this.state = 4;
if ((step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3)) this.state = 3;
if (true) break;

case 6:
//C
this.state = 5;
_i = ((int)(0 + _i + step3)) ;
if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=19660804;
 //BA.debugLineNum = 19660804;BA.debugLine="Dim duration As Int = 100 - i * 20";
_duration = (int) (100-_i*20);
RDebugUtils.currentLine=19660805;
 //BA.debugLineNum = 19660805;BA.debugLine="p.SetLayoutAnimated(duration, -10dip, 0, p.Width";
_p.SetLayoutAnimated(_duration,-parent.__c.DipToCurrent((int) (10)),0,_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=19660806;
 //BA.debugLineNum = 19660806;BA.debugLine="Sleep(duration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preferencesdialog", "gotoitem"),_duration);
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
RDebugUtils.currentLine=19660807;
 //BA.debugLineNum = 19660807;BA.debugLine="p.SetLayoutAnimated(duration, 10dip, 0, p.Width,";
_p.SetLayoutAnimated(_duration,parent.__c.DipToCurrent((int) (10)),0,_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=19660808;
 //BA.debugLineNum = 19660808;BA.debugLine="Sleep(duration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preferencesdialog", "gotoitem"),_duration);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=19660810;
 //BA.debugLineNum = 19660810;BA.debugLine="p.SetLayoutAnimated(50, 0, 0, p.Width, p.Height)";
_p.SetLayoutAnimated((int) (50),0,0,_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=19660811;
 //BA.debugLineNum = 19660811;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4j.example.preferencesdialog __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_eventname}));}
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="lbl.Initialize(EventName)";
_lbl.Initialize(ba,_eventname);
RDebugUtils.currentLine=20054019;
 //BA.debugLineNum = 20054019;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=20054020;
 //BA.debugLineNum = 20054020;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlayouts(b4j.example.preferencesdialog __ref,b4j.example.preferencesdialog._b4xprefitem _prefitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "createlayouts", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlayouts", new Object[] {_prefitem}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
b4j.example.b4xfloattextfield _ft = null;
anywheresoftware.b4a.objects.collections.List _original = null;
b4j.example.b4xfloattextfield _tf = null;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
anywheresoftware.b4j.objects.LabelWrapper _rlbl = null;
RDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Private Sub CreateLayouts (PrefItem As B4XPrefItem";
RDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="p.Width = CustomListView1.sv.ScrollViewContentWid";
_p.setWidth(__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewContentWidth());
RDebugUtils.currentLine=19333123;
 //BA.debugLineNum = 19333123;BA.debugLine="p.Height = 50dip";
_p.setHeight(__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=19333124;
 //BA.debugLineNum = 19333124;BA.debugLine="Select PrefItem.ItemType";
switch (BA.switchObjectToInt(_prefitem.ItemType /*int*/ ,__ref._type_boolean /*int*/ ,__ref._type_multilinetext /*int*/ ,__ref._type_time /*int*/ ,__ref._type_numericrange /*int*/ ,__ref._type_text /*int*/ ,__ref._type_password /*int*/ ,__ref._type_number /*int*/ ,__ref._type_decimalnumber /*int*/ ,__ref._type_date /*int*/ ,__ref._type_options /*int*/ ,__ref._type_shortoptions /*int*/ ,__ref._type_color /*int*/ ,__ref._type_explanation /*int*/ ,__ref._type_separator /*int*/ )) {
case 0: {
RDebugUtils.currentLine=19333126;
 //BA.debugLineNum = 19333126;BA.debugLine="p.LoadLayout(\"booleanitem\")";
_p.LoadLayout("booleanitem",ba);
RDebugUtils.currentLine=19333127;
 //BA.debugLineNum = 19333127;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetV";
__ref._dialog /*b4j.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_p.GetView((int) (0)),_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=19333128;
 //BA.debugLineNum = 19333128;BA.debugLine="p.GetView(0).TextColor = TextColor";
_p.GetView((int) (0)).setTextColor(__ref._textcolor /*int*/ );
 break; }
case 1: {
RDebugUtils.currentLine=19333130;
 //BA.debugLineNum = 19333130;BA.debugLine="p.Height = PrefItem.Extra.Get(\"height\")";
_p.setHeight((double)(BA.ObjectToNumber(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("height")))));
RDebugUtils.currentLine=19333131;
 //BA.debugLineNum = 19333131;BA.debugLine="p.LoadLayout(\"textitemmulti\")";
_p.LoadLayout("textitemmulti",ba);
RDebugUtils.currentLine=19333132;
 //BA.debugLineNum = 19333132;BA.debugLine="Dim ft As B4XFloatTextField = p.GetView(0).Tag";
_ft = (b4j.example.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=19333133;
 //BA.debugLineNum = 19333133;BA.debugLine="ft.HintText = PrefItem.Title";
_ft._hinttext /*String*/  = BA.ObjectToString(_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=19333134;
 //BA.debugLineNum = 19333134;BA.debugLine="ft.HintFont = DefaultHintFont";
_ft._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._defaulthintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=19333135;
 //BA.debugLineNum = 19333135;BA.debugLine="ft.LargeLabelTextSize = DefaultHintLargeSize";
_ft._largelabeltextsize /*float*/  = (float) (__ref._defaulthintlargesize /*int*/ );
RDebugUtils.currentLine=19333136;
 //BA.debugLineNum = 19333136;BA.debugLine="ft.Update";
_ft._update /*String*/ (null);
 break; }
case 2: {
RDebugUtils.currentLine=19333138;
 //BA.debugLineNum = 19333138;BA.debugLine="CreateTimeItem(PrefItem, p)";
__ref._createtimeitem /*String*/ (null,_prefitem,_p);
 break; }
case 3: {
RDebugUtils.currentLine=19333140;
 //BA.debugLineNum = 19333140;BA.debugLine="CreateNumericRangeItem(PrefItem, p)";
__ref._createnumericrangeitem /*String*/ (null,_prefitem,_p);
 break; }
case 4: 
case 5: 
case 6: 
case 7: {
RDebugUtils.currentLine=19333142;
 //BA.debugLineNum = 19333142;BA.debugLine="p.Height = 60dip";
_p.setHeight(__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=19333143;
 //BA.debugLineNum = 19333143;BA.debugLine="If PrefItem.ItemType = TYPE_PASSWORD Then";
if (_prefitem.ItemType /*int*/ ==__ref._type_password /*int*/ ) { 
RDebugUtils.currentLine=19333144;
 //BA.debugLineNum = 19333144;BA.debugLine="p.LoadLayout(\"passworditem\")";
_p.LoadLayout("passworditem",ba);
 }else {
RDebugUtils.currentLine=19333146;
 //BA.debugLineNum = 19333146;BA.debugLine="p.LoadLayout(\"textitem\")";
_p.LoadLayout("textitem",ba);
RDebugUtils.currentLine=19333147;
 //BA.debugLineNum = 19333147;BA.debugLine="Dim ft As B4XFloatTextField = p.GetView(0).Tag";
_ft = (b4j.example.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=19333148;
 //BA.debugLineNum = 19333148;BA.debugLine="If PrefItem.ItemType = TYPE_NUMBER Then";
if (_prefitem.ItemType /*int*/ ==__ref._type_number /*int*/ ) { 
 }else 
{RDebugUtils.currentLine=19333156;
 //BA.debugLineNum = 19333156;BA.debugLine="Else If PrefItem.ItemType = TYPE_DECIMALNUMBER";
if (_prefitem.ItemType /*int*/ ==__ref._type_decimalnumber /*int*/ ) { 
 }}
;
 };
RDebugUtils.currentLine=19333167;
 //BA.debugLineNum = 19333167;BA.debugLine="Dim ft As B4XFloatTextField = p.GetView(0).Tag";
_ft = (b4j.example.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=19333168;
 //BA.debugLineNum = 19333168;BA.debugLine="ft.HintText = PrefItem.Title";
_ft._hinttext /*String*/  = BA.ObjectToString(_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=19333169;
 //BA.debugLineNum = 19333169;BA.debugLine="ft.HintFont = DefaultHintFont";
_ft._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._defaulthintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=19333170;
 //BA.debugLineNum = 19333170;BA.debugLine="ft.LargeLabelTextSize = DefaultHintLargeSize";
_ft._largelabeltextsize /*float*/  = (float) (__ref._defaulthintlargesize /*int*/ );
RDebugUtils.currentLine=19333171;
 //BA.debugLineNum = 19333171;BA.debugLine="ft.Update";
_ft._update /*String*/ (null);
 break; }
case 8: {
RDebugUtils.currentLine=19333173;
 //BA.debugLineNum = 19333173;BA.debugLine="TwoLabelsLayout(\"lblDate\", p, PrefItem)";
__ref._twolabelslayout /*String*/ (null,"lblDate",_p,_prefitem);
 break; }
case 9: {
RDebugUtils.currentLine=19333175;
 //BA.debugLineNum = 19333175;BA.debugLine="TwoLabelsLayout(\"lblOptions\", p, PrefItem)";
__ref._twolabelslayout /*String*/ (null,"lblOptions",_p,_prefitem);
 break; }
case 10: {
RDebugUtils.currentLine=19333177;
 //BA.debugLineNum = 19333177;BA.debugLine="p.LoadLayout(\"shortoptions\")";
_p.LoadLayout("shortoptions",ba);
RDebugUtils.currentLine=19333178;
 //BA.debugLineNum = 19333178;BA.debugLine="p.GetView(0).TextColor = TextColor";
_p.GetView((int) (0)).setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=19333179;
 //BA.debugLineNum = 19333179;BA.debugLine="Dim original As List = PrefItem.Extra.Get(\"opti";
_original = new anywheresoftware.b4a.objects.collections.List();
_original = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("options"))));
RDebugUtils.currentLine=19333199;
 //BA.debugLineNum = 19333199;BA.debugLine="B4XComboBox1.SetItems(original)";
__ref._b4xcombobox1 /*b4j.example.b4xcombobox*/ ._setitems /*String*/ (null,_original);
RDebugUtils.currentLine=19333201;
 //BA.debugLineNum = 19333201;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetV";
__ref._dialog /*b4j.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_p.GetView((int) (0)),_prefitem.Title /*Object*/ );
 break; }
case 11: {
RDebugUtils.currentLine=19333203;
 //BA.debugLineNum = 19333203;BA.debugLine="p.Height = 60dip";
_p.setHeight(__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=19333204;
 //BA.debugLineNum = 19333204;BA.debugLine="p.LoadLayout(\"coloritem\")";
_p.LoadLayout("coloritem",ba);
RDebugUtils.currentLine=19333205;
 //BA.debugLineNum = 19333205;BA.debugLine="Dim tf As B4XFloatTextField = p.GetView(0).Tag";
_tf = (b4j.example.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=19333206;
 //BA.debugLineNum = 19333206;BA.debugLine="tf.HintFont = DefaultHintFont";
_tf._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._defaulthintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=19333207;
 //BA.debugLineNum = 19333207;BA.debugLine="tf.LargeLabelTextSize = DefaultHintLargeSize";
_tf._largelabeltextsize /*float*/  = (float) (__ref._defaulthintlargesize /*int*/ );
RDebugUtils.currentLine=19333208;
 //BA.debugLineNum = 19333208;BA.debugLine="tf.HintText = PrefItem.Title";
_tf._hinttext /*String*/  = BA.ObjectToString(_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=19333209;
 //BA.debugLineNum = 19333209;BA.debugLine="tf.Update";
_tf._update /*String*/ (null);
 break; }
case 12: {
RDebugUtils.currentLine=19333215;
 //BA.debugLineNum = 19333215;BA.debugLine="TwoLabelsLayout(\"lblExplanation\", p, PrefItem)";
__ref._twolabelslayout /*String*/ (null,"lblExplanation",_p,_prefitem);
 break; }
case 13: {
RDebugUtils.currentLine=19333217;
 //BA.debugLineNum = 19333217;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=19333218;
 //BA.debugLineNum = 19333218;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=19333219;
 //BA.debugLineNum = 19333219;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=19333220;
 //BA.debugLineNum = 19333220;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=19333221;
 //BA.debugLineNum = 19333221;BA.debugLine="xlbl.TextColor = SeparatorTextColor";
_xlbl.setTextColor(__ref._separatortextcolor /*int*/ );
RDebugUtils.currentLine=19333222;
 //BA.debugLineNum = 19333222;BA.debugLine="xlbl.Font = xui.CreateDefaultBoldFont(14)";
_xlbl.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (14)));
RDebugUtils.currentLine=19333223;
 //BA.debugLineNum = 19333223;BA.debugLine="xlbl.Color = SeparatorBackgroundColor";
_xlbl.setColor(__ref._separatorbackgroundcolor /*int*/ );
RDebugUtils.currentLine=19333224;
 //BA.debugLineNum = 19333224;BA.debugLine="p.Height = 30dip";
_p.setHeight(__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=19333225;
 //BA.debugLineNum = 19333225;BA.debugLine="p.AddView(xlbl, 0, 0, p.Width, p.Height)";
_p.AddView((javafx.scene.Node)(_xlbl.getObject()),0,0,_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=19333226;
 //BA.debugLineNum = 19333226;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(xlbl,";
__ref._dialog /*b4j.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_xlbl,_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=19333227;
 //BA.debugLineNum = 19333227;BA.debugLine="PrefItem.Required = False";
_prefitem.Required /*boolean*/  = __c.False;
 break; }
}
;
RDebugUtils.currentLine=19333229;
 //BA.debugLineNum = 19333229;BA.debugLine="If PrefItem.Required Then";
if (_prefitem.Required /*boolean*/ ) { 
RDebugUtils.currentLine=19333230;
 //BA.debugLineNum = 19333230;BA.debugLine="Dim rlbl As Label";
_rlbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=19333231;
 //BA.debugLineNum = 19333231;BA.debugLine="rlbl.Initialize(\"\")";
_rlbl.Initialize(ba,"");
RDebugUtils.currentLine=19333232;
 //BA.debugLineNum = 19333232;BA.debugLine="Dim xlbl As B4XView = rlbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_rlbl.getObject()));
RDebugUtils.currentLine=19333233;
 //BA.debugLineNum = 19333233;BA.debugLine="xlbl.Text = \"*\"";
_xlbl.setText("*");
RDebugUtils.currentLine=19333234;
 //BA.debugLineNum = 19333234;BA.debugLine="xlbl.TextColor = xui.Color_Red";
_xlbl.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=19333235;
 //BA.debugLineNum = 19333235;BA.debugLine="xlbl.TextSize = 11";
_xlbl.setTextSize(11);
RDebugUtils.currentLine=19333236;
 //BA.debugLineNum = 19333236;BA.debugLine="xlbl.SetTextAlignment(\"TOP\", \"LEFT\")";
_xlbl.SetTextAlignment("TOP","LEFT");
RDebugUtils.currentLine=19333237;
 //BA.debugLineNum = 19333237;BA.debugLine="p.AddView(xlbl, 01dip, 0dip, 10dip, 10dip)";
_p.AddView((javafx.scene.Node)(_xlbl.getObject()),__c.DipToCurrent((int) (01)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)));
 };
RDebugUtils.currentLine=19333239;
 //BA.debugLineNum = 19333239;BA.debugLine="p.Color = ItemsBackgroundColor";
_p.setColor(__ref._itemsbackgroundcolor /*int*/ );
RDebugUtils.currentLine=19333240;
 //BA.debugLineNum = 19333240;BA.debugLine="If mTheme <> THEME_DARK Then";
if (__ref._mtheme /*int*/ !=__ref._theme_dark /*int*/ ) { 
RDebugUtils.currentLine=19333241;
 //BA.debugLineNum = 19333241;BA.debugLine="If p.GetView(0).Tag Is B4XFloatTextField Then";
if (_p.GetView((int) (0)).getTag() instanceof b4j.example.b4xfloattextfield) { 
RDebugUtils.currentLine=19333242;
 //BA.debugLineNum = 19333242;BA.debugLine="Dim tf As B4XFloatTextField = p.GetView(0).Tag";
_tf = (b4j.example.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=19333243;
 //BA.debugLineNum = 19333243;BA.debugLine="tf.TextField.TextColor = TextColor";
_tf._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=19333244;
 //BA.debugLineNum = 19333244;BA.debugLine="tf.NonFocusedHintColor = TextColor";
_tf._nonfocusedhintcolor /*int*/  = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=19333245;
 //BA.debugLineNum = 19333245;BA.debugLine="tf.Update";
_tf._update /*String*/ (null);
RDebugUtils.currentLine=19333246;
 //BA.debugLineNum = 19333246;BA.debugLine="If tf.lblClear.IsInitialized Then tf.lblClear.T";
if (_tf._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
_tf._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._textcolor /*int*/ );};
RDebugUtils.currentLine=19333247;
 //BA.debugLineNum = 19333247;BA.debugLine="If tf.lblV.IsInitialized Then tf.lblV.TextColor";
if (_tf._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
_tf._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._textcolor /*int*/ );};
 };
 };
RDebugUtils.currentLine=19333250;
 //BA.debugLineNum = 19333250;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=19333251;
 //BA.debugLineNum = 19333251;BA.debugLine="End Sub";
return null;
}
public String  _createtimeitem(b4j.example.preferencesdialog __ref,b4j.example.preferencesdialog._b4xprefitem _prefitem,anywheresoftware.b4a.objects.B4XViewWrapper _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "createtimeitem", true))
	 {return ((String) Debug.delegate(ba, "createtimeitem", new Object[] {_prefitem,_p}));}
boolean _is24 = false;
b4j.example.b4xplusminus _pmhours = null;
b4j.example.b4xplusminus _pmminutes = null;
b4j.example.b4xplusminus _pmampm = null;
int _clr = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Private Sub CreateTimeItem (PrefItem As B4XPrefIte";
RDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="p.Height = 60dip";
_p.setHeight(__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="Dim is24 As Boolean = PrefItem.Extra.GetDefault(\"";
_is24 = BA.ObjectToBoolean(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("24"),(Object)(__c.False)));
RDebugUtils.currentLine=19464195;
 //BA.debugLineNum = 19464195;BA.debugLine="If is24 Then";
if (_is24) { 
RDebugUtils.currentLine=19464196;
 //BA.debugLineNum = 19464196;BA.debugLine="p.LoadLayout(\"timeitem24\")";
_p.LoadLayout("timeitem24",ba);
 }else {
RDebugUtils.currentLine=19464198;
 //BA.debugLineNum = 19464198;BA.debugLine="p.LoadLayout(\"timeitem\")";
_p.LoadLayout("timeitem",ba);
 };
RDebugUtils.currentLine=19464200;
 //BA.debugLineNum = 19464200;BA.debugLine="Dim pmHours As B4XPlusMinus = p.GetView(0).Tag";
_pmhours = (b4j.example.b4xplusminus)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=19464201;
 //BA.debugLineNum = 19464201;BA.debugLine="pmHours.RapidPeriod2 = 100";
_pmhours._rapidperiod2 /*int*/  = (int) (100);
RDebugUtils.currentLine=19464202;
 //BA.debugLineNum = 19464202;BA.debugLine="Dim pmMinutes As B4XPlusMinus = p.GetView(1).Tag";
_pmminutes = (b4j.example.b4xplusminus)(_p.GetView((int) (1)).getTag());
RDebugUtils.currentLine=19464203;
 //BA.debugLineNum = 19464203;BA.debugLine="Dim pmAMPM As B4XPlusMinus = p.GetView(2).Tag";
_pmampm = (b4j.example.b4xplusminus)(_p.GetView((int) (2)).getTag());
RDebugUtils.currentLine=19464204;
 //BA.debugLineNum = 19464204;BA.debugLine="If xui.IsB4J = False Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()==__c.False) { 
RDebugUtils.currentLine=19464205;
 //BA.debugLineNum = 19464205;BA.debugLine="Dim clr As Int = CustomListView1.sv.ScrollViewIn";
_clr = __ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewInnerPanel().getColor();
RDebugUtils.currentLine=19464206;
 //BA.debugLineNum = 19464206;BA.debugLine="pmHours.mBase.SetColorAndBorder(xui.Color_Transp";
_pmhours._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (1)),_clr,0);
RDebugUtils.currentLine=19464207;
 //BA.debugLineNum = 19464207;BA.debugLine="pmMinutes.mBase.SetColorAndBorder(xui.Color_Tran";
_pmminutes._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (1)),_clr,0);
RDebugUtils.currentLine=19464208;
 //BA.debugLineNum = 19464208;BA.debugLine="pmAMPM.mBase.SetColorAndBorder(xui.Color_Transpa";
_pmampm._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (1)),_clr,0);
 };
RDebugUtils.currentLine=19464211;
 //BA.debugLineNum = 19464211;BA.debugLine="If is24 Then";
if (_is24) { 
RDebugUtils.currentLine=19464212;
 //BA.debugLineNum = 19464212;BA.debugLine="pmHours.SetNumericRange(0, 23, 1)";
_pmhours._setnumericrange /*String*/ (null,0,23,1);
 }else {
RDebugUtils.currentLine=19464214;
 //BA.debugLineNum = 19464214;BA.debugLine="pmHours.SetNumericRange(1, 12, 1)";
_pmhours._setnumericrange /*String*/ (null,1,12,1);
 };
RDebugUtils.currentLine=19464216;
 //BA.debugLineNum = 19464216;BA.debugLine="pmMinutes.SetNumericRange(0, 59, 1)";
_pmminutes._setnumericrange /*String*/ (null,0,59,1);
RDebugUtils.currentLine=19464217;
 //BA.debugLineNum = 19464217;BA.debugLine="pmMinutes.Formatter.GetDefaultFormat.MinimumInteg";
_pmminutes._formatter /*b4j.example.b4xformatter*/ ._getdefaultformat /*b4j.example.b4xformatter._b4xformatdata*/ (null).MinimumIntegers /*int*/  = (int) (2);
RDebugUtils.currentLine=19464219;
 //BA.debugLineNum = 19464219;BA.debugLine="pmAMPM.SetStringItems(Array(\"am\", \"pm\"))";
_pmampm._setstringitems /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("am"),(Object)("pm")}));
RDebugUtils.currentLine=19464220;
 //BA.debugLineNum = 19464220;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetVie";
__ref._dialog /*b4j.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_p.GetView((int) (3)),_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=19464221;
 //BA.debugLineNum = 19464221;BA.debugLine="For Each v As B4XView In p.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group27 = _p.GetAllViewsRecursive();
final int groupLen27 = group27.getSize()
;int index27 = 0;
;
for (; index27 < groupLen27;index27++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group27.Get(index27)));
RDebugUtils.currentLine=19464222;
 //BA.debugLineNum = 19464222;BA.debugLine="If v Is Label Then v.TextColor = TextColor";
if (_v.getObjectOrNull() instanceof javafx.scene.control.Label) { 
_v.setTextColor(__ref._textcolor /*int*/ );};
 }
};
RDebugUtils.currentLine=19464224;
 //BA.debugLineNum = 19464224;BA.debugLine="End Sub";
return "";
}
public String  _createnumericrangeitem(b4j.example.preferencesdialog __ref,b4j.example.preferencesdialog._b4xprefitem _prefitem,anywheresoftware.b4a.objects.B4XViewWrapper _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "createnumericrangeitem", true))
	 {return ((String) Debug.delegate(ba, "createnumericrangeitem", new Object[] {_prefitem,_p}));}
b4j.example.b4xplusminus _pm = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Private Sub CreateNumericRangeItem (PrefItem As B4";
RDebugUtils.currentLine=19398657;
 //BA.debugLineNum = 19398657;BA.debugLine="p.LoadLayout(\"numericrange\")";
_p.LoadLayout("numericrange",ba);
RDebugUtils.currentLine=19398658;
 //BA.debugLineNum = 19398658;BA.debugLine="Dim pm As B4XPlusMinus = p.GetView(0).Tag";
_pm = (b4j.example.b4xplusminus)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=19398659;
 //BA.debugLineNum = 19398659;BA.debugLine="pm.SetNumericRange(PrefItem.Extra.Get(\"start\"), P";
_pm._setnumericrange /*String*/ (null,(double)(BA.ObjectToNumber(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("start")))),(double)(BA.ObjectToNumber(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("end")))),(double)(BA.ObjectToNumber(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("interval")))));
RDebugUtils.currentLine=19398660;
 //BA.debugLineNum = 19398660;BA.debugLine="pm.Formatter.GetDefaultFormat.MaximumFractions =";
_pm._formatter /*b4j.example.b4xformatter*/ ._getdefaultformat /*b4j.example.b4xformatter._b4xformatdata*/ (null).MaximumFractions /*int*/  = (int) (2);
RDebugUtils.currentLine=19398661;
 //BA.debugLineNum = 19398661;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetVie";
__ref._dialog /*b4j.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_p.GetView((int) (1)),_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=19398662;
 //BA.debugLineNum = 19398662;BA.debugLine="For Each v As B4XView In p.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group6 = _p.GetAllViewsRecursive();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group6.Get(index6)));
RDebugUtils.currentLine=19398663;
 //BA.debugLineNum = 19398663;BA.debugLine="If v Is Label Then v.TextColor = TextColor";
if (_v.getObjectOrNull() instanceof javafx.scene.control.Label) { 
_v.setTextColor(__ref._textcolor /*int*/ );};
 }
};
RDebugUtils.currentLine=19398665;
 //BA.debugLineNum = 19398665;BA.debugLine="End Sub";
return "";
}
public String  _twolabelslayout(b4j.example.preferencesdialog __ref,String _eventname,anywheresoftware.b4a.objects.B4XViewWrapper _p,b4j.example.preferencesdialog._b4xprefitem _prefitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "twolabelslayout", true))
	 {return ((String) Debug.delegate(ba, "twolabelslayout", new Object[] {_eventname,_p,_prefitem}));}
anywheresoftware.b4a.objects.B4XViewWrapper _lbltitle = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbldate = null;
RDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Private Sub TwoLabelsLayout (EventName As String,";
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="Dim lblTitle As B4XView = CreateLabel(EventName)";
_lbltitle = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbltitle = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_eventname);
RDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="lblTitle.SetTextAlignment(\"CENTER\", \"LEFT\")";
_lbltitle.SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=19726339;
 //BA.debugLineNum = 19726339;BA.debugLine="lblTitle.TextColor = TextColor";
_lbltitle.setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=19726340;
 //BA.debugLineNum = 19726340;BA.debugLine="Dim fnt As B4XFont = xui.CreateDefaultBoldFont(16";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_fnt = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (16));
RDebugUtils.currentLine=19726341;
 //BA.debugLineNum = 19726341;BA.debugLine="lblTitle.Font = fnt";
_lbltitle.setFont(_fnt);
RDebugUtils.currentLine=19726342;
 //BA.debugLineNum = 19726342;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(lblTitle";
__ref._dialog /*b4j.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_lbltitle,_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=19726343;
 //BA.debugLineNum = 19726343;BA.debugLine="p.AddView(lblTitle, 10dip, 10dip, p.Width - 110di";
_p.AddView((javafx.scene.Node)(_lbltitle.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)),_p.getWidth()-__c.DipToCurrent((int) (110)),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=19726344;
 //BA.debugLineNum = 19726344;BA.debugLine="Dim lblDate As B4XView = CreateLabel(EventName)";
_lbldate = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbldate = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_eventname);
RDebugUtils.currentLine=19726345;
 //BA.debugLineNum = 19726345;BA.debugLine="lblDate.TextColor = TextColor";
_lbldate.setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=19726346;
 //BA.debugLineNum = 19726346;BA.debugLine="lblDate.SetTextAlignment(\"CENTER\", \"RIGHT\")";
_lbldate.SetTextAlignment("CENTER","RIGHT");
RDebugUtils.currentLine=19726347;
 //BA.debugLineNum = 19726347;BA.debugLine="lblDate.Font = fnt";
_lbldate.setFont(_fnt);
RDebugUtils.currentLine=19726348;
 //BA.debugLineNum = 19726348;BA.debugLine="p.AddView(lblDate, p.Width - 108dip, 10dip, 98dip";
_p.AddView((javafx.scene.Node)(_lbldate.getObject()),_p.getWidth()-__c.DipToCurrent((int) (108)),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (98)),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=19726349;
 //BA.debugLineNum = 19726349;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(b4j.example.preferencesdialog __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="End Sub";
return "";
}
public String  _filldata(b4j.example.preferencesdialog __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "filldata", true))
	 {return ((String) Debug.delegate(ba, "filldata", new Object[] {_data}));}
int _i = 0;
b4j.example.customlistview._clvitem _item = null;
b4j.example.preferencesdialog._b4xprefitem _prefitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _itempanel = null;
b4j.example.b4xswitch _switch = null;
b4j.example.b4xfloattextfield _ft = null;
b4j.example.b4xcombobox _cmb = null;
anywheresoftware.b4a.objects.collections.List _options = null;
b4j.example.b4xplusminus _pmhours = null;
b4j.example.b4xplusminus _pmminutes = null;
b4j.example.b4xplusminus _pmampm = null;
b4j.example.dateutils._period _p = null;
int _hour = 0;
String _m = "";
b4j.example.b4xplusminus _pm = null;
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Private Sub FillData (Data As Map)";
RDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = __ref._customlistview1 /*b4j.example.customlistview*/ ._getrawlistitem(_i);
RDebugUtils.currentLine=19005443;
 //BA.debugLineNum = 19005443;BA.debugLine="If (Item.Value Is B4XPrefItem) = False Then Exit";
if ((_item.Value instanceof b4j.example.preferencesdialog._b4xprefitem)==__c.False) { 
if (true) break;};
RDebugUtils.currentLine=19005444;
 //BA.debugLineNum = 19005444;BA.debugLine="Dim PrefItem As B4XPrefItem = Item.Value";
_prefitem = (b4j.example.preferencesdialog._b4xprefitem)(_item.Value);
RDebugUtils.currentLine=19005445;
 //BA.debugLineNum = 19005445;BA.debugLine="Dim ItemPanel As B4XView = Item.Panel.GetView(0)";
_itempanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_itempanel = _item.Panel.GetView((int) (0));
RDebugUtils.currentLine=19005446;
 //BA.debugLineNum = 19005446;BA.debugLine="Select PrefItem.ItemType";
switch (BA.switchObjectToInt(_prefitem.ItemType /*int*/ ,__ref._type_boolean /*int*/ ,__ref._type_text /*int*/ ,__ref._type_password /*int*/ ,__ref._type_number /*int*/ ,__ref._type_decimalnumber /*int*/ ,__ref._type_multilinetext /*int*/ ,__ref._type_date /*int*/ ,__ref._type_options /*int*/ ,__ref._type_shortoptions /*int*/ ,__ref._type_color /*int*/ ,__ref._type_time /*int*/ ,__ref._type_separator /*int*/ ,__ref._type_explanation /*int*/ ,__ref._type_numericrange /*int*/ )) {
case 0: {
RDebugUtils.currentLine=19005448;
 //BA.debugLineNum = 19005448;BA.debugLine="Dim switch As B4XSwitch = ItemPanel.GetView(1)";
_switch = (b4j.example.b4xswitch)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=19005449;
 //BA.debugLineNum = 19005449;BA.debugLine="switch.Value = GetPrefItemValue(PrefItem, Fals";
_switch._setvalue /*boolean*/ (null,BA.ObjectToBoolean(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(__c.False),_data)));
 break; }
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
RDebugUtils.currentLine=19005451;
 //BA.debugLineNum = 19005451;BA.debugLine="Dim ft As B4XFloatTextField = ItemPanel.GetVie";
_ft = (b4j.example.b4xfloattextfield)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=19005452;
 //BA.debugLineNum = 19005452;BA.debugLine="ft.Text = GetPrefItemValue(PrefItem, \"\", Data)";
_ft._settext /*String*/ (null,BA.ObjectToString(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(""),_data)));
 break; }
case 6: {
RDebugUtils.currentLine=19005454;
 //BA.debugLineNum = 19005454;BA.debugLine="ItemPanel.GetView(1).Text = DateTime.Date(GetP";
_itempanel.GetView((int) (1)).setText(__c.DateTime.Date(BA.ObjectToLongNumber(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(__c.DateTime.getNow()),_data))));
 break; }
case 7: {
RDebugUtils.currentLine=19005456;
 //BA.debugLineNum = 19005456;BA.debugLine="ItemPanel.GetView(1).Text = GetPrefItemValue(P";
_itempanel.GetView((int) (1)).setText(BA.ObjectToString(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(""),_data)));
 break; }
case 8: {
RDebugUtils.currentLine=19005458;
 //BA.debugLineNum = 19005458;BA.debugLine="Dim cmb As B4XComboBox = ItemPanel.GetView(1).";
_cmb = (b4j.example.b4xcombobox)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=19005459;
 //BA.debugLineNum = 19005459;BA.debugLine="Dim options As List = PrefItem.Extra.Get(\"opti";
_options = new anywheresoftware.b4a.objects.collections.List();
_options = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("options"))));
RDebugUtils.currentLine=19005460;
 //BA.debugLineNum = 19005460;BA.debugLine="cmb.SelectedIndex = Max(0, options.IndexOf(Get";
_cmb._setselectedindex /*int*/ (null,(int) (__c.Max(0,_options.IndexOf(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(""),_data)))));
 break; }
case 9: {
RDebugUtils.currentLine=19005462;
 //BA.debugLineNum = 19005462;BA.debugLine="SetLabelColor(ItemPanel.GetView(1), GetPrefIte";
__ref._setlabelcolor /*String*/ (null,_itempanel.GetView((int) (1)),(int)(BA.ObjectToNumber(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red),_data))));
RDebugUtils.currentLine=19005463;
 //BA.debugLineNum = 19005463;BA.debugLine="ItemPanel.GetView(2).Text = \"Pick\"";
_itempanel.GetView((int) (2)).setText("Pick");
 break; }
case 10: {
RDebugUtils.currentLine=19005465;
 //BA.debugLineNum = 19005465;BA.debugLine="Dim pmHours As B4XPlusMinus = ItemPanel.GetVie";
_pmhours = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=19005466;
 //BA.debugLineNum = 19005466;BA.debugLine="Dim pmMinutes As B4XPlusMinus = ItemPanel.GetV";
_pmminutes = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=19005467;
 //BA.debugLineNum = 19005467;BA.debugLine="Dim pmAMPM As B4XPlusMinus = ItemPanel.GetView";
_pmampm = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (2)).getTag());
RDebugUtils.currentLine=19005468;
 //BA.debugLineNum = 19005468;BA.debugLine="Dim p As Period";
_p = new b4j.example.dateutils._period();
RDebugUtils.currentLine=19005469;
 //BA.debugLineNum = 19005469;BA.debugLine="p = GetPrefItemValue(PrefItem, p, Data)";
_p = (b4j.example.dateutils._period)(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(_p),_data));
RDebugUtils.currentLine=19005470;
 //BA.debugLineNum = 19005470;BA.debugLine="Dim hour As Int = p.Hours";
_hour = _p.Hours;
RDebugUtils.currentLine=19005471;
 //BA.debugLineNum = 19005471;BA.debugLine="Dim m As String";
_m = "";
RDebugUtils.currentLine=19005472;
 //BA.debugLineNum = 19005472;BA.debugLine="If PrefItem.Extra.GetDefault(\"24\", False) = Fa";
if ((_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("24"),(Object)(__c.False))).equals((Object)(__c.False))) { 
RDebugUtils.currentLine=19005473;
 //BA.debugLineNum = 19005473;BA.debugLine="If hour <= 11 Then";
if (_hour<=11) { 
RDebugUtils.currentLine=19005474;
 //BA.debugLineNum = 19005474;BA.debugLine="m = \"am\"";
_m = "am";
 }else {
RDebugUtils.currentLine=19005476;
 //BA.debugLineNum = 19005476;BA.debugLine="m = \"pm\"";
_m = "pm";
RDebugUtils.currentLine=19005477;
 //BA.debugLineNum = 19005477;BA.debugLine="hour = hour - 12";
_hour = (int) (_hour-12);
 };
RDebugUtils.currentLine=19005479;
 //BA.debugLineNum = 19005479;BA.debugLine="If hour = 0 Then hour = 12";
if (_hour==0) { 
_hour = (int) (12);};
 };
RDebugUtils.currentLine=19005481;
 //BA.debugLineNum = 19005481;BA.debugLine="pmHours.SelectedValue = hour";
_pmhours._setselectedvalue /*Object*/ (null,(Object)(_hour));
RDebugUtils.currentLine=19005482;
 //BA.debugLineNum = 19005482;BA.debugLine="pmMinutes.SelectedValue = p.Minutes";
_pmminutes._setselectedvalue /*Object*/ (null,(Object)(_p.Minutes));
RDebugUtils.currentLine=19005483;
 //BA.debugLineNum = 19005483;BA.debugLine="pmAMPM.SelectedValue = m";
_pmampm._setselectedvalue /*Object*/ (null,(Object)(_m));
 break; }
case 11: 
case 12: {
 break; }
case 13: {
RDebugUtils.currentLine=19005486;
 //BA.debugLineNum = 19005486;BA.debugLine="Dim pm As B4XPlusMinus = ItemPanel.GetView(0).";
_pm = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=19005487;
 //BA.debugLineNum = 19005487;BA.debugLine="pm.SelectedValue = GetPrefItemValue(PrefItem,";
_pm._setselectedvalue /*Object*/ (null,__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(0),_data));
 break; }
default: {
RDebugUtils.currentLine=19005489;
 //BA.debugLineNum = 19005489;BA.debugLine="Log(\"Unknown type: \" & PrefItem.ItemType)";
__c.LogImpl("919005489","Unknown type: "+BA.NumberToString(_prefitem.ItemType /*int*/ ),0);
 break; }
}
;
 }
};
RDebugUtils.currentLine=19005492;
 //BA.debugLineNum = 19005492;BA.debugLine="End Sub";
return "";
}
public Object  _getprefitemvalue(b4j.example.preferencesdialog __ref,b4j.example.preferencesdialog._b4xprefitem _prefitem,Object _defaultvalue,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "getprefitemvalue", true))
	 {return ((Object) Debug.delegate(ba, "getprefitemvalue", new Object[] {_prefitem,_defaultvalue,_data}));}
RDebugUtils.currentLine=19136512;
 //BA.debugLineNum = 19136512;BA.debugLine="Private Sub GetPrefItemValue (PrefItem As B4XPrefI";
RDebugUtils.currentLine=19136513;
 //BA.debugLineNum = 19136513;BA.debugLine="Return Data.GetDefault(PrefItem.Key, DefaultValue";
if (true) return _data.GetDefault((Object)(_prefitem.Key /*String*/ ),_defaultvalue);
RDebugUtils.currentLine=19136514;
 //BA.debugLineNum = 19136514;BA.debugLine="End Sub";
return null;
}
public String  _setlabelcolor(b4j.example.preferencesdialog __ref,anywheresoftware.b4a.objects.B4XViewWrapper _lbl,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "setlabelcolor", true))
	 {return ((String) Debug.delegate(ba, "setlabelcolor", new Object[] {_lbl,_clr}));}
b4j.example.b4xfloattextfield _ft = null;
RDebugUtils.currentLine=19070976;
 //BA.debugLineNum = 19070976;BA.debugLine="Private Sub SetLabelColor(lbl As B4XView, clr As I";
RDebugUtils.currentLine=19070977;
 //BA.debugLineNum = 19070977;BA.debugLine="Dim ft As B4XFloatTextField = lbl.Parent.GetView(";
_ft = (b4j.example.b4xfloattextfield)(_lbl.getParent().GetView((int) (0)).getTag());
RDebugUtils.currentLine=19070978;
 //BA.debugLineNum = 19070978;BA.debugLine="ft.Text = ColorToHex(clr)";
_ft._settext /*String*/ (null,__ref._colortohex /*String*/ (null,_clr));
RDebugUtils.currentLine=19070979;
 //BA.debugLineNum = 19070979;BA.debugLine="lbl.SetColorAndBorder(clr, 1dip, Dialog.BorderCol";
_lbl.SetColorAndBorder(_clr,__c.DipToCurrent((int) (1)),__ref._dialog /*b4j.example.b4xdialog*/ ._bordercolor /*int*/ ,__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=19070980;
 //BA.debugLineNum = 19070980;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.example.preferencesdialog __ref,b4j.example.b4xdialog _dialog1) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog1}));}
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Public Sub GetPanel (Dialog1 As B4XDialog) As B4XV";
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="End Sub";
return null;
}
public b4j.example.preferencesdialog._b4xprefitem  _getprefitem(b4j.example.preferencesdialog __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "getprefitem", true))
	 {return ((b4j.example.preferencesdialog._b4xprefitem) Debug.delegate(ba, "getprefitem", new Object[] {_key}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Public Sub GetPrefItem (Key As String) As B4XPrefI";
RDebugUtils.currentLine=20250625;
 //BA.debugLineNum = 20250625;BA.debugLine="For Each pi As B4XPrefItem In PrefItems";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_pi = (b4j.example.preferencesdialog._b4xprefitem)(group1.Get(index1));
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="If pi.Key = Key Then Return pi";
if ((_pi.Key /*String*/ ).equals(_key)) { 
if (true) return _pi;};
 }
};
RDebugUtils.currentLine=20250628;
 //BA.debugLineNum = 20250628;BA.debugLine="Return Null";
if (true) return (b4j.example.preferencesdialog._b4xprefitem)(__c.Null);
RDebugUtils.currentLine=20250629;
 //BA.debugLineNum = 20250629;BA.debugLine="End Sub";
return null;
}
public int  _gettheme(b4j.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "gettheme", true))
	 {return ((Integer) Debug.delegate(ba, "gettheme", null));}
RDebugUtils.currentLine=19202048;
 //BA.debugLineNum = 19202048;BA.debugLine="Public Sub getTheme As Int";
RDebugUtils.currentLine=19202049;
 //BA.debugLineNum = 19202049;BA.debugLine="Return mTheme";
if (true) return __ref._mtheme /*int*/ ;
RDebugUtils.currentLine=19202050;
 //BA.debugLineNum = 19202050;BA.debugLine="End Sub";
return 0;
}
public Object  _gettitle(b4j.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "gettitle", true))
	 {return ((Object) Debug.delegate(ba, "gettitle", null));}
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Public Sub getTitle As Object";
RDebugUtils.currentLine=17367041;
 //BA.debugLineNum = 17367041;BA.debugLine="Return mTitle";
if (true) return __ref._mtitle /*Object*/ ;
RDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="End Sub";
return null;
}
public int[]  _hextocolor(b4j.example.preferencesdialog __ref,String _hex) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "hextocolor", true))
	 {return ((int[]) Debug.delegate(ba, "hextocolor", new Object[] {_hex}));}
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
int[] _res = null;
int[] _ints = null;
RDebugUtils.currentLine=20643840;
 //BA.debugLineNum = 20643840;BA.debugLine="Private Sub HexToColor(Hex As String) As Int()";
RDebugUtils.currentLine=20643841;
 //BA.debugLineNum = 20643841;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=20643842;
 //BA.debugLineNum = 20643842;BA.debugLine="Hex = Hex.ToLowerCase";
_hex = _hex.toLowerCase();
RDebugUtils.currentLine=20643843;
 //BA.debugLineNum = 20643843;BA.debugLine="If Hex.StartsWith(\"#\") Then";
if (_hex.startsWith("#")) { 
RDebugUtils.currentLine=20643844;
 //BA.debugLineNum = 20643844;BA.debugLine="Hex = Hex.SubString(1)";
_hex = _hex.substring((int) (1));
 }else 
{RDebugUtils.currentLine=20643845;
 //BA.debugLineNum = 20643845;BA.debugLine="Else If Hex.StartsWith(\"0x\") Then";
if (_hex.startsWith("0x")) { 
RDebugUtils.currentLine=20643846;
 //BA.debugLineNum = 20643846;BA.debugLine="Hex = Hex.SubString(2)";
_hex = _hex.substring((int) (2));
 }}
;
RDebugUtils.currentLine=20643848;
 //BA.debugLineNum = 20643848;BA.debugLine="If Hex.Length = 6 Then Hex = \"ff\" & Hex";
if (_hex.length()==6) { 
_hex = "ff"+_hex;};
RDebugUtils.currentLine=20643850;
 //BA.debugLineNum = 20643850;BA.debugLine="Dim res() As Int";
_res = new int[(int) (0)];
;
RDebugUtils.currentLine=20643851;
 //BA.debugLineNum = 20643851;BA.debugLine="If Regex.IsMatch(\"[0-9a-f]{8}\", Hex) = False Then";
if (__c.Regex.IsMatch("[0-9a-f]{8}",_hex)==__c.False) { 
if (true) return _res;};
RDebugUtils.currentLine=20643852;
 //BA.debugLineNum = 20643852;BA.debugLine="Dim ints() As Int = bc.IntsFromBytes(bc.HexToByte";
_ints = _bc.IntsFromBytes(_bc.HexToBytes(_hex));
RDebugUtils.currentLine=20643853;
 //BA.debugLineNum = 20643853;BA.debugLine="Return ints";
if (true) return _ints;
RDebugUtils.currentLine=20643854;
 //BA.debugLineNum = 20643854;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.preferencesdialog __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent,Object _title,int _width,int _height) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent,_title,_width,_height}));}
anywheresoftware.b4j.objects.ScrollPaneWrapper _sv = null;
RDebugUtils.currentLine=17235968;
 //BA.debugLineNum = 17235968;BA.debugLine="Public Sub Initialize (Parent As B4XView, Title As";
RDebugUtils.currentLine=17235969;
 //BA.debugLineNum = 17235969;BA.debugLine="Dialog.Initialize(Parent)";
__ref._dialog /*b4j.example.b4xdialog*/ ._initialize /*String*/ (null,ba,_parent);
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="Dialog.VisibleAnimationDuration = 0";
__ref._dialog /*b4j.example.b4xdialog*/ ._visibleanimationduration /*int*/  = (int) (0);
RDebugUtils.currentLine=17235971;
 //BA.debugLineNum = 17235971;BA.debugLine="mTitle = Title";
__ref._mtitle /*Object*/  = _title;
RDebugUtils.currentLine=17235972;
 //BA.debugLineNum = 17235972;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=17235973;
 //BA.debugLineNum = 17235973;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=17235974;
 //BA.debugLineNum = 17235974;BA.debugLine="mBase.LoadLayout(\"ListTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("ListTemplate",ba);
RDebugUtils.currentLine=17235975;
 //BA.debugLineNum = 17235975;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=17235976;
 //BA.debugLineNum = 17235976;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=17235977;
 //BA.debugLineNum = 17235977;BA.debugLine="CustomListView1.PressedColor = xui.Color_Transpar";
__ref._customlistview1 /*b4j.example.customlistview*/ ._pressedcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=17235978;
 //BA.debugLineNum = 17235978;BA.debugLine="PrefItems.Initialize";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=17235979;
 //BA.debugLineNum = 17235979;BA.debugLine="SearchTemplate.Initialize";
__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=17235980;
 //BA.debugLineNum = 17235980;BA.debugLine="DateTemplate.Initialize";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=17235981;
 //BA.debugLineNum = 17235981;BA.debugLine="LongTextTemplate.Initialize";
__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=17235982;
 //BA.debugLineNum = 17235982;BA.debugLine="LongTextTemplate.CustomListView1.PressedColor = 0";
__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ ._customlistview1 /*b4j.example.customlistview*/ ._pressedcolor = (int) (0);
RDebugUtils.currentLine=17235983;
 //BA.debugLineNum = 17235983;BA.debugLine="Dialog.OverlayColor = xui.Color_Transparent";
__ref._dialog /*b4j.example.b4xdialog*/ ._overlaycolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=17235985;
 //BA.debugLineNum = 17235985;BA.debugLine="Dim sv As ScrollPane = CustomListView1.sv";
_sv = new anywheresoftware.b4j.objects.ScrollPaneWrapper();
_sv = (anywheresoftware.b4j.objects.ScrollPaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ScrollPaneWrapper(), (javafx.scene.control.ScrollPane)(__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getObject()));
RDebugUtils.currentLine=17235986;
 //BA.debugLineNum = 17235986;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
_sv.getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=17235987;
 //BA.debugLineNum = 17235987;BA.debugLine="sv.InnerNode.StyleClasses.Add(\"b4xdialog\")";
_sv.getInnerNode().getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=17235992;
 //BA.debugLineNum = 17235992;BA.debugLine="DefaultHintFont = xui.CreateDefaultBoldFont(16)";
__ref._defaulthintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (16));
RDebugUtils.currentLine=17235994;
 //BA.debugLineNum = 17235994;BA.debugLine="DefaultHintLargeSize = 16";
__ref._defaulthintlargesize /*int*/  = (int) (16);
RDebugUtils.currentLine=17235995;
 //BA.debugLineNum = 17235995;BA.debugLine="setTheme(THEME_DARK)";
__ref._settheme /*String*/ (null,__ref._theme_dark /*int*/ );
RDebugUtils.currentLine=17235997;
 //BA.debugLineNum = 17235997;BA.debugLine="End Sub";
return "";
}
public String  _settheme(b4j.example.preferencesdialog __ref,int _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "settheme", true))
	 {return ((String) Debug.delegate(ba, "settheme", new Object[] {_t}));}
int _dividercolor = 0;
b4j.example.customlistview _clv = null;
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _sv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _b = null;
RDebugUtils.currentLine=19267584;
 //BA.debugLineNum = 19267584;BA.debugLine="Public Sub setTheme (t As Int)";
RDebugUtils.currentLine=19267585;
 //BA.debugLineNum = 19267585;BA.debugLine="If t <> mTheme Then";
if (_t!=__ref._mtheme /*int*/ ) { 
RDebugUtils.currentLine=19267586;
 //BA.debugLineNum = 19267586;BA.debugLine="mTheme = t";
__ref._mtheme /*int*/  = _t;
RDebugUtils.currentLine=19267587;
 //BA.debugLineNum = 19267587;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=19267588;
 //BA.debugLineNum = 19267588;BA.debugLine="Dim DividerColor As Int";
_dividercolor = 0;
RDebugUtils.currentLine=19267589;
 //BA.debugLineNum = 19267589;BA.debugLine="Select mTheme";
switch (BA.switchObjectToInt(__ref._mtheme /*int*/ ,__ref._theme_dark /*int*/ ,__ref._theme_light /*int*/ )) {
case 0: {
RDebugUtils.currentLine=19267591;
 //BA.debugLineNum = 19267591;BA.debugLine="ItemsBackgroundColor = 0xFF626262";
__ref._itemsbackgroundcolor /*int*/  = ((int)0xff626262);
RDebugUtils.currentLine=19267592;
 //BA.debugLineNum = 19267592;BA.debugLine="SeparatorBackgroundColor = 0xFFC0C0C0";
__ref._separatorbackgroundcolor /*int*/  = ((int)0xffc0c0c0);
RDebugUtils.currentLine=19267593;
 //BA.debugLineNum = 19267593;BA.debugLine="SeparatorTextColor = xui.Color_Black";
__ref._separatortextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=19267594;
 //BA.debugLineNum = 19267594;BA.debugLine="TextColor = xui.Color_White";
__ref._textcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=19267595;
 //BA.debugLineNum = 19267595;BA.debugLine="DividerColor = 0xFF464646";
_dividercolor = ((int)0xff464646);
RDebugUtils.currentLine=19267596;
 //BA.debugLineNum = 19267596;BA.debugLine="Dialog.BackgroundColor = 0xFF555555";
__ref._dialog /*b4j.example.b4xdialog*/ ._backgroundcolor /*int*/  = ((int)0xff555555);
RDebugUtils.currentLine=19267597;
 //BA.debugLineNum = 19267597;BA.debugLine="Dialog.ButtonsColor = 0xFF555555";
__ref._dialog /*b4j.example.b4xdialog*/ ._buttonscolor /*int*/  = ((int)0xff555555);
RDebugUtils.currentLine=19267598;
 //BA.debugLineNum = 19267598;BA.debugLine="Dialog.BorderColor = 0xff000000";
__ref._dialog /*b4j.example.b4xdialog*/ ._bordercolor /*int*/  = ((int)0xff000000);
RDebugUtils.currentLine=19267599;
 //BA.debugLineNum = 19267599;BA.debugLine="Dialog.ButtonsTextColor = 0xFF89D5FF";
__ref._dialog /*b4j.example.b4xdialog*/ ._buttonstextcolor /*int*/  = ((int)0xff89d5ff);
RDebugUtils.currentLine=19267600;
 //BA.debugLineNum = 19267600;BA.debugLine="DateTemplate.DaysInWeekColor = xui.Color_Gray";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._daysinweekcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray;
RDebugUtils.currentLine=19267601;
 //BA.debugLineNum = 19267601;BA.debugLine="DateTemplate.SelectedColor = 0xFF0BA29B";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._selectedcolor /*int*/  = ((int)0xff0ba29b);
 break; }
case 1: {
RDebugUtils.currentLine=19267603;
 //BA.debugLineNum = 19267603;BA.debugLine="ItemsBackgroundColor = xui.Color_White";
__ref._itemsbackgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=19267604;
 //BA.debugLineNum = 19267604;BA.debugLine="SeparatorBackgroundColor = 0xFFD0D0D0";
__ref._separatorbackgroundcolor /*int*/  = ((int)0xffd0d0d0);
RDebugUtils.currentLine=19267605;
 //BA.debugLineNum = 19267605;BA.debugLine="SeparatorTextColor = 0xFF4E4F50";
__ref._separatortextcolor /*int*/  = ((int)0xff4e4f50);
RDebugUtils.currentLine=19267606;
 //BA.debugLineNum = 19267606;BA.debugLine="TextColor = 0xFF5B5B5B";
__ref._textcolor /*int*/  = ((int)0xff5b5b5b);
RDebugUtils.currentLine=19267607;
 //BA.debugLineNum = 19267607;BA.debugLine="DividerColor = 0xFFDFDFDF";
_dividercolor = ((int)0xffdfdfdf);
RDebugUtils.currentLine=19267608;
 //BA.debugLineNum = 19267608;BA.debugLine="Dialog.BackgroundColor = xui.Color_White";
__ref._dialog /*b4j.example.b4xdialog*/ ._backgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=19267609;
 //BA.debugLineNum = 19267609;BA.debugLine="Dialog.ButtonsColor = xui.Color_White";
__ref._dialog /*b4j.example.b4xdialog*/ ._buttonscolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=19267610;
 //BA.debugLineNum = 19267610;BA.debugLine="Dialog.BorderColor = xui.Color_Gray";
__ref._dialog /*b4j.example.b4xdialog*/ ._bordercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray;
RDebugUtils.currentLine=19267611;
 //BA.debugLineNum = 19267611;BA.debugLine="Dialog.ButtonsTextColor = 0xFF007DC3";
__ref._dialog /*b4j.example.b4xdialog*/ ._buttonstextcolor /*int*/  = ((int)0xff007dc3);
RDebugUtils.currentLine=19267612;
 //BA.debugLineNum = 19267612;BA.debugLine="DateTemplate.DaysInWeekColor = xui.Color_Black";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._daysinweekcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=19267613;
 //BA.debugLineNum = 19267613;BA.debugLine="DateTemplate.SelectedColor = 0xFF39D7CE";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._selectedcolor /*int*/  = ((int)0xff39d7ce);
 break; }
}
;
RDebugUtils.currentLine=19267616;
 //BA.debugLineNum = 19267616;BA.debugLine="SearchTemplate.SearchField.TextField.TextColor =";
__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._searchfield /*b4j.example.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=19267617;
 //BA.debugLineNum = 19267617;BA.debugLine="SearchTemplate.SearchField.NonFocusedHintColor =";
__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._searchfield /*b4j.example.b4xfloattextfield*/ ._nonfocusedhintcolor /*int*/  = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=19267618;
 //BA.debugLineNum = 19267618;BA.debugLine="Dialog.BorderCornersRadius = 0";
__ref._dialog /*b4j.example.b4xdialog*/ ._bordercornersradius /*int*/  = (int) (0);
RDebugUtils.currentLine=19267619;
 //BA.debugLineNum = 19267619;BA.debugLine="Dialog.BorderWidth = 1dip";
__ref._dialog /*b4j.example.b4xdialog*/ ._borderwidth /*int*/  = __c.DipToCurrent((int) (1));
RDebugUtils.currentLine=19267620;
 //BA.debugLineNum = 19267620;BA.debugLine="DateTemplate.HighlightedColor = 0xFF00CEFF";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._highlightedcolor /*int*/  = ((int)0xff00ceff);
RDebugUtils.currentLine=19267621;
 //BA.debugLineNum = 19267621;BA.debugLine="DateTemplate.DaysInMonthColor = TextColor";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._daysinmonthcolor /*int*/  = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=19267622;
 //BA.debugLineNum = 19267622;BA.debugLine="DateTemplate.lblMonth.TextColor = TextColor";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._lblmonth /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=19267623;
 //BA.debugLineNum = 19267623;BA.debugLine="DateTemplate.lblYear.TextColor = TextColor";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=19267624;
 //BA.debugLineNum = 19267624;BA.debugLine="For Each clv As CustomListView In Array(CustomLi";
{
final Object[] group39 = new Object[]{(Object)(__ref._customlistview1 /*b4j.example.customlistview*/ ),(Object)(__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._customlistview1 /*b4j.example.customlistview*/ ),(Object)(__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ ._customlistview1 /*b4j.example.customlistview*/ )};
final int groupLen39 = group39.length
;int index39 = 0;
;
for (; index39 < groupLen39;index39++){
_clv = (b4j.example.customlistview)(group39[index39]);
RDebugUtils.currentLine=19267625;
 //BA.debugLineNum = 19267625;BA.debugLine="clv.sv.ScrollViewInnerPanel.Color = DividerColo";
_clv._sv.getScrollViewInnerPanel().setColor(_dividercolor);
RDebugUtils.currentLine=19267626;
 //BA.debugLineNum = 19267626;BA.debugLine="clv.sv.Color = Dialog.BackgroundColor";
_clv._sv.setColor(__ref._dialog /*b4j.example.b4xdialog*/ ._backgroundcolor /*int*/ );
RDebugUtils.currentLine=19267627;
 //BA.debugLineNum = 19267627;BA.debugLine="clv.DefaultTextBackgroundColor = ItemsBackgroun";
_clv._defaulttextbackgroundcolor = __ref._itemsbackgroundcolor /*int*/ ;
RDebugUtils.currentLine=19267628;
 //BA.debugLineNum = 19267628;BA.debugLine="clv.DefaultTextColor = TextColor";
_clv._defaulttextcolor = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=19267630;
 //BA.debugLineNum = 19267630;BA.debugLine="Dim sv As Node = clv.sv";
_sv = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
_sv = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_clv._sv.getObject()));
RDebugUtils.currentLine=19267631;
 //BA.debugLineNum = 19267631;BA.debugLine="sv.StyleClasses.Clear";
_sv.getStyleClasses().Clear();
RDebugUtils.currentLine=19267632;
 //BA.debugLineNum = 19267632;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
_sv.getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=19267633;
 //BA.debugLineNum = 19267633;BA.debugLine="If mTheme = THEME_LIGHT Then sv.StyleClasses.Ad";
if (__ref._mtheme /*int*/ ==__ref._theme_light /*int*/ ) { 
_sv.getStyleClasses().Add((Object)("b4xdialoglight"));};
 }
};
RDebugUtils.currentLine=19267636;
 //BA.debugLineNum = 19267636;BA.debugLine="For Each b As B4XView In Array(DateTemplate.btnM";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final Object[] group49 = new Object[]{(Object)(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._btnmonthleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._btnmonthright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._btnyearleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._btnyearright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject())};
final int groupLen49 = group49.length
;int index49 = 0;
;
for (; index49 < groupLen49;index49++){
_b = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group49[index49]));
RDebugUtils.currentLine=19267637;
 //BA.debugLineNum = 19267637;BA.debugLine="b.Color = xui.Color_Transparent";
_b.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=19267638;
 //BA.debugLineNum = 19267638;BA.debugLine="b.TextColor = TextColor";
_b.setTextColor(__ref._textcolor /*int*/ );
 }
};
 };
RDebugUtils.currentLine=19267645;
 //BA.debugLineNum = 19267645;BA.debugLine="End Sub";
return "";
}
public String  _keyboardheightchanged(b4j.example.preferencesdialog __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "keyboardheightchanged", true))
	 {return ((String) Debug.delegate(ba, "keyboardheightchanged", new Object[] {_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
b4j.example.b4xfloattextfield _f = null;
int _index = 0;
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Public Sub KeyboardHeightChanged (Height As Int)";
RDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="If Dialog.Visible Then";
if (__ref._dialog /*b4j.example.b4xdialog*/ ._getvisible /*boolean*/ (null)) { 
RDebugUtils.currentLine=17498121;
 //BA.debugLineNum = 17498121;BA.debugLine="CustomListView1.sv.Height = Min(CustomListView1.A";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.setHeight(__c.Min(__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().getHeight(),_height-__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().getParent().getTop()-__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().getParent().getParent().getTop()));
RDebugUtils.currentLine=17498124;
 //BA.debugLineNum = 17498124;BA.debugLine="For Each v As B4XView In CustomListView1.AsView.";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._customlistview1 /*b4j.example.customlistview*/ ._asview().GetAllViewsRecursive();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group3.Get(index3)));
RDebugUtils.currentLine=17498125;
 //BA.debugLineNum = 17498125;BA.debugLine="If v.Tag Is B4XFloatTextField Then";
if (_v.getTag() instanceof b4j.example.b4xfloattextfield) { 
RDebugUtils.currentLine=17498126;
 //BA.debugLineNum = 17498126;BA.debugLine="Dim f As B4XFloatTextField = v.Tag";
_f = (b4j.example.b4xfloattextfield)(_v.getTag());
RDebugUtils.currentLine=17498127;
 //BA.debugLineNum = 17498127;BA.debugLine="If f.Focused Then";
if (_f._focused /*boolean*/ ) { 
RDebugUtils.currentLine=17498128;
 //BA.debugLineNum = 17498128;BA.debugLine="Dim index As Int = CustomListView1.GetItemFro";
_index = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview(_f._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=17498129;
 //BA.debugLineNum = 17498129;BA.debugLine="CustomListView1.ScrollToItem(index)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._scrolltoitem(_index);
 };
 };
 }
};
 };
RDebugUtils.currentLine=17498134;
 //BA.debugLineNum = 17498134;BA.debugLine="End Sub";
return "";
}
public String  _lblcolors_mouseclicked(b4j.example.preferencesdialog __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "lblcolors_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lblcolors_mouseclicked", new Object[] {_eventdata}));}
b4j.example.preferencesdialog._b4xprefitem _pref = null;
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Private Sub lblColors_MouseClicked (EventData As M";
RDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=19922949;
 //BA.debugLineNum = 19922949;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
__ref._nesteddialogitemindex /*int*/  = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=19922950;
 //BA.debugLineNum = 19922950;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
_pref = (b4j.example.preferencesdialog._b4xprefitem)(__ref._customlistview1 /*b4j.example.customlistview*/ ._getvalue(__ref._nesteddialogitemindex /*int*/ ));
RDebugUtils.currentLine=19922951;
 //BA.debugLineNum = 19922951;BA.debugLine="Dialog.Title = pref.Title";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = _pref.Title /*Object*/ ;
RDebugUtils.currentLine=19922952;
 //BA.debugLineNum = 19922952;BA.debugLine="ColorTemplate.SelectedColor = CustomListView1.Get";
__ref._colortemplate /*b4j.example.b4xcolortemplate*/ ._setselectedcolor /*int*/ (null,__ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(__ref._nesteddialogitemindex /*int*/ ).GetView((int) (1)).getColor());
RDebugUtils.currentLine=19922953;
 //BA.debugLineNum = 19922953;BA.debugLine="Template = ColorTemplate";
__ref._template /*Object*/  = (Object)(__ref._colortemplate /*b4j.example.b4xcolortemplate*/ );
RDebugUtils.currentLine=19922954;
 //BA.debugLineNum = 19922954;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
__ref._dialog /*b4j.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._result_showing_nested_dialog /*int*/ );
RDebugUtils.currentLine=19922955;
 //BA.debugLineNum = 19922955;BA.debugLine="End Sub";
return "";
}
public String  _lbldate_mouseclicked(b4j.example.preferencesdialog __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "lbldate_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lbldate_mouseclicked", new Object[] {_eventdata}));}
b4j.example.preferencesdialog._b4xprefitem _pref = null;
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Private Sub lblDate_MouseClicked (EventData As Mou";
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=19857413;
 //BA.debugLineNum = 19857413;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
__ref._nesteddialogitemindex /*int*/  = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=19857414;
 //BA.debugLineNum = 19857414;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
_pref = (b4j.example.preferencesdialog._b4xprefitem)(__ref._customlistview1 /*b4j.example.customlistview*/ ._getvalue(__ref._nesteddialogitemindex /*int*/ ));
RDebugUtils.currentLine=19857415;
 //BA.debugLineNum = 19857415;BA.debugLine="Dialog.Title = pref.Title";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = _pref.Title /*Object*/ ;
RDebugUtils.currentLine=19857416;
 //BA.debugLineNum = 19857416;BA.debugLine="DateTemplate.Date = DateTime.DateParse(CustomList";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._setdate /*long*/ (null,__c.DateTime.DateParse(__ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(__ref._nesteddialogitemindex /*int*/ ).GetView((int) (1)).getText()));
RDebugUtils.currentLine=19857417;
 //BA.debugLineNum = 19857417;BA.debugLine="Template = DateTemplate";
__ref._template /*Object*/  = (Object)(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ );
RDebugUtils.currentLine=19857418;
 //BA.debugLineNum = 19857418;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
__ref._dialog /*b4j.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._result_showing_nested_dialog /*int*/ );
RDebugUtils.currentLine=19857419;
 //BA.debugLineNum = 19857419;BA.debugLine="End Sub";
return "";
}
public String  _lblexplanation_mouseclicked(b4j.example.preferencesdialog __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "lblexplanation_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lblexplanation_mouseclicked", new Object[] {_eventdata}));}
b4j.example.preferencesdialog._b4xprefitem _pref = null;
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Private Sub lblExplanation_MouseClicked (EventData";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=19988485;
 //BA.debugLineNum = 19988485;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
__ref._nesteddialogitemindex /*int*/  = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=19988486;
 //BA.debugLineNum = 19988486;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
_pref = (b4j.example.preferencesdialog._b4xprefitem)(__ref._customlistview1 /*b4j.example.customlistview*/ ._getvalue(__ref._nesteddialogitemindex /*int*/ ));
RDebugUtils.currentLine=19988487;
 //BA.debugLineNum = 19988487;BA.debugLine="Dialog.Title = pref.Title";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = _pref.Title /*Object*/ ;
RDebugUtils.currentLine=19988488;
 //BA.debugLineNum = 19988488;BA.debugLine="LongTextTemplate.Text = pref.Extra.Get(\"text\")";
__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ ._text /*Object*/  = _pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("text"));
RDebugUtils.currentLine=19988489;
 //BA.debugLineNum = 19988489;BA.debugLine="Template = LongTextTemplate";
__ref._template /*Object*/  = (Object)(__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ );
RDebugUtils.currentLine=19988490;
 //BA.debugLineNum = 19988490;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
__ref._dialog /*b4j.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._result_showing_nested_dialog /*int*/ );
RDebugUtils.currentLine=19988491;
 //BA.debugLineNum = 19988491;BA.debugLine="End Sub";
return "";
}
public String  _lbloptions_mouseclicked(b4j.example.preferencesdialog __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "lbloptions_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lbloptions_mouseclicked", new Object[] {_eventdata}));}
b4j.example.preferencesdialog._b4xprefitem _pref = null;
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Private Sub lblOptions_MouseClicked (EventData As";
RDebugUtils.currentLine=19791873;
 //BA.debugLineNum = 19791873;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=19791877;
 //BA.debugLineNum = 19791877;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
__ref._nesteddialogitemindex /*int*/  = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=19791878;
 //BA.debugLineNum = 19791878;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
_pref = (b4j.example.preferencesdialog._b4xprefitem)(__ref._customlistview1 /*b4j.example.customlistview*/ ._getvalue(__ref._nesteddialogitemindex /*int*/ ));
RDebugUtils.currentLine=19791879;
 //BA.debugLineNum = 19791879;BA.debugLine="Dialog.Title = pref.Title";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = _pref.Title /*Object*/ ;
RDebugUtils.currentLine=19791880;
 //BA.debugLineNum = 19791880;BA.debugLine="If pref.Extra.ContainsKey(\"index\") Then";
if (_pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("index"))) { 
RDebugUtils.currentLine=19791881;
 //BA.debugLineNum = 19791881;BA.debugLine="SearchTemplate.SetIndex(pref.Extra.Get(\"index\"))";
__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._setindex /*String*/ (null,_pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("index")));
 }else {
RDebugUtils.currentLine=19791883;
 //BA.debugLineNum = 19791883;BA.debugLine="pref.Extra.Put(\"index\", SearchTemplate.SetItems(";
_pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("index"),__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._setitems /*Object*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("options"))))));
 };
RDebugUtils.currentLine=19791885;
 //BA.debugLineNum = 19791885;BA.debugLine="SearchTemplate.SelectedItem = CustomListView1.Get";
__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._selecteditem /*String*/  = __ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(__ref._nesteddialogitemindex /*int*/ ).GetView((int) (1)).getText();
RDebugUtils.currentLine=19791886;
 //BA.debugLineNum = 19791886;BA.debugLine="Template = SearchTemplate";
__ref._template /*Object*/  = (Object)(__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ );
RDebugUtils.currentLine=19791887;
 //BA.debugLineNum = 19791887;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
__ref._dialog /*b4j.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._result_showing_nested_dialog /*int*/ );
RDebugUtils.currentLine=19791888;
 //BA.debugLineNum = 19791888;BA.debugLine="End Sub";
return "";
}
public String  _loadfromjson(b4j.example.preferencesdialog __ref,String _json) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "loadfromjson", true))
	 {return ((String) Debug.delegate(ba, "loadfromjson", new Object[] {_json}));}
anywheresoftware.b4j.objects.collections.JSONParser _p = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _theme = "";
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
String _key = "";
String _title = "";
boolean _required = false;
String _itemtype = "";
anywheresoftware.b4a.objects.collections.List _l = null;
b4j.example.preferencesdialog._b4xprefitem _pi = null;
String _text = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Public Sub LoadFromJson (Json As String)";
RDebugUtils.currentLine=17629185;
 //BA.debugLineNum = 17629185;BA.debugLine="Dim p As JSONParser";
_p = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="p.Initialize(Json)";
_p.Initialize(_json);
RDebugUtils.currentLine=17629187;
 //BA.debugLineNum = 17629187;BA.debugLine="Dim m As Map = p.NextObject";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _p.NextObject();
RDebugUtils.currentLine=17629188;
 //BA.debugLineNum = 17629188;BA.debugLine="Dim theme As String = m.GetDefault(\"Theme\", \"Dark";
_theme = BA.ObjectToString(_m.GetDefault((Object)("Theme"),(Object)("Dark Theme")));
RDebugUtils.currentLine=17629189;
 //BA.debugLineNum = 17629189;BA.debugLine="Select theme";
switch (BA.switchObjectToInt(_theme,"Dark Theme","Light Theme")) {
case 0: {
RDebugUtils.currentLine=17629191;
 //BA.debugLineNum = 17629191;BA.debugLine="setTheme(THEME_DARK)";
__ref._settheme /*String*/ (null,__ref._theme_dark /*int*/ );
 break; }
case 1: {
RDebugUtils.currentLine=17629193;
 //BA.debugLineNum = 17629193;BA.debugLine="setTheme(THEME_LIGHT)";
__ref._settheme /*String*/ (null,__ref._theme_light /*int*/ );
 break; }
}
;
RDebugUtils.currentLine=17629195;
 //BA.debugLineNum = 17629195;BA.debugLine="Dim items As List = m.Get(\"Items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.Get((Object)("Items"))));
RDebugUtils.currentLine=17629196;
 //BA.debugLineNum = 17629196;BA.debugLine="For Each item As Map In items";
_item = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group12 = _items;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group12.Get(index12)));
RDebugUtils.currentLine=17629197;
 //BA.debugLineNum = 17629197;BA.debugLine="Dim key As String = item.Get(\"key\")";
_key = BA.ObjectToString(_item.Get((Object)("key")));
RDebugUtils.currentLine=17629198;
 //BA.debugLineNum = 17629198;BA.debugLine="Dim title As String = item.Get(\"title\")";
_title = BA.ObjectToString(_item.Get((Object)("title")));
RDebugUtils.currentLine=17629199;
 //BA.debugLineNum = 17629199;BA.debugLine="Dim required As Boolean = item.Get(\"required\")";
_required = BA.ObjectToBoolean(_item.Get((Object)("required")));
RDebugUtils.currentLine=17629200;
 //BA.debugLineNum = 17629200;BA.debugLine="Dim itemType As String = item.Get(\"type\")";
_itemtype = BA.ObjectToString(_item.Get((Object)("type")));
RDebugUtils.currentLine=17629201;
 //BA.debugLineNum = 17629201;BA.debugLine="Select itemType";
switch (BA.switchObjectToInt(_itemtype,"Separator","Boolean","Text","Date","Short Options","Color","Number","Password","Options","Decimal Number","Multiline Text","Time","Numeric Range","Explanation")) {
case 0: {
RDebugUtils.currentLine=17629203;
 //BA.debugLineNum = 17629203;BA.debugLine="AddSeparator(title)";
__ref._addseparator /*String*/ (null,(Object)(_title));
 break; }
case 1: {
RDebugUtils.currentLine=17629205;
 //BA.debugLineNum = 17629205;BA.debugLine="AddBooleanItem(key, title)";
__ref._addbooleanitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 2: {
RDebugUtils.currentLine=17629207;
 //BA.debugLineNum = 17629207;BA.debugLine="AddTextItem(key, title)";
__ref._addtextitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 3: {
RDebugUtils.currentLine=17629209;
 //BA.debugLineNum = 17629209;BA.debugLine="AddDateItem(key, title)";
__ref._adddateitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 4: {
RDebugUtils.currentLine=17629211;
 //BA.debugLineNum = 17629211;BA.debugLine="AddShortOptionsItem(key, title, item.Get(\"opti";
__ref._addshortoptionsitem /*String*/ (null,_key,(Object)(_title),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options")))));
 break; }
case 5: {
RDebugUtils.currentLine=17629213;
 //BA.debugLineNum = 17629213;BA.debugLine="AddColorItem(key, title)";
__ref._addcoloritem /*String*/ (null,_key,(Object)(_title));
 break; }
case 6: {
RDebugUtils.currentLine=17629215;
 //BA.debugLineNum = 17629215;BA.debugLine="AddNumberItem(key, title)";
__ref._addnumberitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 7: {
RDebugUtils.currentLine=17629217;
 //BA.debugLineNum = 17629217;BA.debugLine="AddPasswordItem(key, title)";
__ref._addpassworditem /*String*/ (null,_key,(Object)(_title));
 break; }
case 8: {
RDebugUtils.currentLine=17629219;
 //BA.debugLineNum = 17629219;BA.debugLine="AddOptionsItem(key, title, item.Get(\"options\")";
__ref._addoptionsitem /*String*/ (null,_key,(Object)(_title),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options")))));
 break; }
case 9: {
RDebugUtils.currentLine=17629221;
 //BA.debugLineNum = 17629221;BA.debugLine="AddDecimalNumberItem(key, title)";
__ref._adddecimalnumberitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 10: {
RDebugUtils.currentLine=17629223;
 //BA.debugLineNum = 17629223;BA.debugLine="Dim l As List = item.Get(\"options\")";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options"))));
RDebugUtils.currentLine=17629224;
 //BA.debugLineNum = 17629224;BA.debugLine="If l.IsInitialized = False Or l.Size = 0 Or Is";
if (_l.IsInitialized()==__c.False || _l.getSize()==0 || __c.IsNumber(BA.ObjectToString(_l.Get((int) (0))))==__c.False) { 
RDebugUtils.currentLine=17629225;
 //BA.debugLineNum = 17629225;BA.debugLine="AddMultilineTextItem(key, title, 100dip)";
__ref._addmultilinetextitem /*String*/ (null,_key,(Object)(_title),__c.DipToCurrent((int) (100)));
 }else {
RDebugUtils.currentLine=17629227;
 //BA.debugLineNum = 17629227;BA.debugLine="AddMultilineTextItem(key, title, DipToCurrent";
__ref._addmultilinetextitem /*String*/ (null,_key,(Object)(_title),__c.DipToCurrent((int)(BA.ObjectToNumber(_l.Get((int) (0))))));
 };
 break; }
case 11: {
RDebugUtils.currentLine=17629230;
 //BA.debugLineNum = 17629230;BA.debugLine="AddTimeItem(key, title)";
__ref._addtimeitem /*String*/ (null,_key,(Object)(_title));
RDebugUtils.currentLine=17629231;
 //BA.debugLineNum = 17629231;BA.debugLine="Dim l As List = item.Get(\"options\")";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options"))));
RDebugUtils.currentLine=17629232;
 //BA.debugLineNum = 17629232;BA.debugLine="If l.IsInitialized And l.Size > 0 Then";
if (_l.IsInitialized() && _l.getSize()>0) { 
RDebugUtils.currentLine=17629233;
 //BA.debugLineNum = 17629233;BA.debugLine="Dim pi As B4XPrefItem = PrefItems.Get(PrefIte";
_pi = (b4j.example.preferencesdialog._b4xprefitem)(__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=17629234;
 //BA.debugLineNum = 17629234;BA.debugLine="pi.Extra.Put(\"24\", l.Get(0) = \"24\")";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("24"),(Object)((_l.Get((int) (0))).equals((Object)("24"))));
 };
 break; }
case 12: {
RDebugUtils.currentLine=17629238;
 //BA.debugLineNum = 17629238;BA.debugLine="Dim l As List = item.Get(\"options\")";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options"))));
RDebugUtils.currentLine=17629239;
 //BA.debugLineNum = 17629239;BA.debugLine="If l.IsInitialized = False Or l.Size < 3 Or Is";
if (_l.IsInitialized()==__c.False || _l.getSize()<3 || __c.IsNumber(BA.ObjectToString(_l.Get((int) (0))))==__c.False || __c.IsNumber(BA.ObjectToString(_l.Get((int) (1))))==__c.False || __c.IsNumber(BA.ObjectToString(_l.Get((int) (2))))==__c.False) { 
RDebugUtils.currentLine=17629240;
 //BA.debugLineNum = 17629240;BA.debugLine="AddNumericRangeItem(key, title, 0, 100, 1)";
__ref._addnumericrangeitem /*String*/ (null,_key,(Object)(_title),0,100,1);
 }else {
RDebugUtils.currentLine=17629242;
 //BA.debugLineNum = 17629242;BA.debugLine="AddNumericRangeItem(key, title, l.Get(0), l.G";
__ref._addnumericrangeitem /*String*/ (null,_key,(Object)(_title),(double)(BA.ObjectToNumber(_l.Get((int) (0)))),(double)(BA.ObjectToNumber(_l.Get((int) (1)))),(double)(BA.ObjectToNumber(_l.Get((int) (2)))));
 };
 break; }
case 13: {
RDebugUtils.currentLine=17629245;
 //BA.debugLineNum = 17629245;BA.debugLine="Dim l As List = item.Get(\"options\")";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options"))));
RDebugUtils.currentLine=17629246;
 //BA.debugLineNum = 17629246;BA.debugLine="Dim text As String";
_text = "";
RDebugUtils.currentLine=17629247;
 //BA.debugLineNum = 17629247;BA.debugLine="If l.IsInitialized Then";
if (_l.IsInitialized()) { 
RDebugUtils.currentLine=17629248;
 //BA.debugLineNum = 17629248;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=17629249;
 //BA.debugLineNum = 17629249;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=17629250;
 //BA.debugLineNum = 17629250;BA.debugLine="For i = 0 To l.Size - 1";
{
final int step65 = 1;
final int limit65 = (int) (_l.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit65 ;_i = _i + step65 ) {
RDebugUtils.currentLine=17629251;
 //BA.debugLineNum = 17629251;BA.debugLine="If i > 0 Then sb.Append(CRLF)";
if (_i>0) { 
_sb.Append(__c.CRLF);};
RDebugUtils.currentLine=17629252;
 //BA.debugLineNum = 17629252;BA.debugLine="sb.Append(l.Get(i))";
_sb.Append(BA.ObjectToString(_l.Get(_i)));
 }
};
RDebugUtils.currentLine=17629254;
 //BA.debugLineNum = 17629254;BA.debugLine="text = sb.ToString";
_text = _sb.ToString();
 };
RDebugUtils.currentLine=17629256;
 //BA.debugLineNum = 17629256;BA.debugLine="AddExplanationItem(key, title, text)";
__ref._addexplanationitem /*String*/ (null,_key,(Object)(_title),(Object)(_text));
 break; }
}
;
RDebugUtils.currentLine=17629258;
 //BA.debugLineNum = 17629258;BA.debugLine="Dim pi As B4XPrefItem = PrefItems.Get(PrefItems.";
_pi = (b4j.example.preferencesdialog._b4xprefitem)(__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=17629259;
 //BA.debugLineNum = 17629259;BA.debugLine="pi.Required = required";
_pi.Required /*boolean*/  = _required;
 }
};
RDebugUtils.currentLine=17629261;
 //BA.debugLineNum = 17629261;BA.debugLine="End Sub";
return "";
}
public String  _raisebeforedialogdisplayed(b4j.example.preferencesdialog __ref,Object _temp) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "raisebeforedialogdisplayed", true))
	 {return ((String) Debug.delegate(ba, "raisebeforedialogdisplayed", new Object[] {_temp}));}
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Private Sub RaiseBeforeDialogDisplayed (Temp As Ob";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="If mEventName <> \"\" And  xui.SubExists(mCallback,";
if ((__ref._meventname /*String*/ ).equals("") == false && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_BeforeDialogDisplayed",(int) (1))) { 
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="CallSub2(mCallback, mEventName & \"_BeforeDialogD";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_BeforeDialogDisplayed",_temp);
 };
RDebugUtils.currentLine=18743300;
 //BA.debugLineNum = 18743300;BA.debugLine="End Sub";
return "";
}
public String  _scrolltoitemwitherror(b4j.example.preferencesdialog __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "scrolltoitemwitherror", true))
	 {return ((String) Debug.delegate(ba, "scrolltoitemwitherror", new Object[] {_key}));}
int _i = 0;
b4j.example.customlistview._clvitem _item = null;
b4j.example.preferencesdialog._b4xprefitem _prefitem = null;
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Public Sub ScrollToItemWithError (key As String)";
RDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=19595266;
 //BA.debugLineNum = 19595266;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = __ref._customlistview1 /*b4j.example.customlistview*/ ._getrawlistitem(_i);
RDebugUtils.currentLine=19595267;
 //BA.debugLineNum = 19595267;BA.debugLine="Dim PrefItem As B4XPrefItem = Item.Value";
_prefitem = (b4j.example.preferencesdialog._b4xprefitem)(_item.Value);
RDebugUtils.currentLine=19595268;
 //BA.debugLineNum = 19595268;BA.debugLine="If PrefItem.Key = key Then";
if ((_prefitem.Key /*String*/ ).equals(_key)) { 
RDebugUtils.currentLine=19595269;
 //BA.debugLineNum = 19595269;BA.debugLine="GoToItem(i)";
__ref._gotoitem /*void*/ (null,_i);
RDebugUtils.currentLine=19595270;
 //BA.debugLineNum = 19595270;BA.debugLine="Return";
if (true) return "";
 };
 }
};
RDebugUtils.currentLine=19595273;
 //BA.debugLineNum = 19595273;BA.debugLine="End Sub";
return "";
}
public String  _seteventslistener(b4j.example.preferencesdialog __ref,Object _callback,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "seteventslistener", true))
	 {return ((String) Debug.delegate(ba, "seteventslistener", new Object[] {_callback,_eventname}));}
RDebugUtils.currentLine=17301504;
 //BA.debugLineNum = 17301504;BA.debugLine="Public Sub SetEventsListener(Callback As Object, E";
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="mCallback = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=17301507;
 //BA.debugLineNum = 17301507;BA.debugLine="End Sub";
return "";
}
public String  _setexplanation(b4j.example.preferencesdialog __ref,String _key,Object _explanation) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "setexplanation", true))
	 {return ((String) Debug.delegate(ba, "setexplanation", new Object[] {_key,_explanation}));}
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Public Sub SetExplanation (Key As String, Explanat";
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="GetPrefItem(Key).Extra.Put(\"text\", Explanation)";
__ref._getprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_key).Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("text"),_explanation);
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="End Sub";
return "";
}
public String  _setoptions(b4j.example.preferencesdialog __ref,String _key,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "setoptions", true))
	 {return ((String) Debug.delegate(ba, "setoptions", new Object[] {_key,_options}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Public Sub SetOptions (Key As String, Options As L";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="Dim pi As B4XPrefItem = GetPrefItem(Key)";
_pi = __ref._getprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_key);
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="If pi.Extra.IsInitialized = False Then";
if (_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=20119555;
 //BA.debugLineNum = 20119555;BA.debugLine="pi.Extra.Initialize";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=20119557;
 //BA.debugLineNum = 20119557;BA.debugLine="pi.Extra.Put(\"options\", Options)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("options"),(Object)(_options.getObject()));
RDebugUtils.currentLine=20119558;
 //BA.debugLineNum = 20119558;BA.debugLine="End Sub";
return "";
}
public String  _settitle(b4j.example.preferencesdialog __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((String) Debug.delegate(ba, "settitle", new Object[] {_o}));}
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Public Sub setTitle(o As Object)";
RDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="mTitle = o";
__ref._mtitle /*Object*/  = _o;
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="End Sub";
return "";
}
public String  _show(b4j.example.preferencesdialog __ref,b4j.example.b4xdialog _dialog1) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_dialog1}));}
RDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Private Sub Show (Dialog1 As B4XDialog) 'ignore";
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _showdialog(b4j.example.preferencesdialog __ref,anywheresoftware.b4a.objects.collections.Map _data,Object _yes,Object _cancel) throws Exception{
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "showdialog", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "showdialog", new Object[] {_data,_yes,_cancel}));}
ResumableSub_ShowDialog rsub = new ResumableSub_ShowDialog(this,__ref,_data,_yes,_cancel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ShowDialog extends BA.ResumableSub {
public ResumableSub_ShowDialog(b4j.example.preferencesdialog parent,b4j.example.preferencesdialog __ref,anywheresoftware.b4a.objects.collections.Map _data,Object _yes,Object _cancel) {
this.parent = parent;
this.__ref = __ref;
this._data = _data;
this._yes = _yes;
this._cancel = _cancel;
this.__ref = parent;
}
b4j.example.preferencesdialog __ref;
b4j.example.preferencesdialog parent;
anywheresoftware.b4a.objects.collections.Map _data;
Object _yes;
Object _cancel;
b4j.example.b4xfloattextfield _lasttextfield = null;
b4j.example.preferencesdialog._b4xprefitem _pi = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
b4j.example.b4xfloattextfield _tf = null;
int _scrollviewoffset = 0;
Object _rs = null;
int _result = 0;
Object _y = null;
Object _c = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
String _value = "";
anywheresoftware.b4a.BA.IterableList group3;
int index3;
int groupLen3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="preferencesdialog";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="If CustomListView1.Size = 0 Then";
if (true) break;

case 1:
//if
this.state = 16;
if (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="Dim LastTextField As B4XFloatTextField";
_lasttextfield = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=18677763;
 //BA.debugLineNum = 18677763;BA.debugLine="For Each pi As B4XPrefItem In PrefItems";
if (true) break;

case 4:
//for
this.state = 15;
group3 = __ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ ;
index3 = 0;
groupLen3 = group3.getSize();
this.state = 55;
if (true) break;

case 55:
//C
this.state = 15;
if (index3 < groupLen3) {
this.state = 6;
_pi = (b4j.example.preferencesdialog._b4xprefitem)(group3.Get(index3));}
if (true) break;

case 56:
//C
this.state = 55;
index3++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=18677764;
 //BA.debugLineNum = 18677764;BA.debugLine="Dim pnl As B4XView = CreateLayouts(pi)";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._createlayouts /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_pi);
RDebugUtils.currentLine=18677765;
 //BA.debugLineNum = 18677765;BA.debugLine="CustomListView1.Add (pnl, pi)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._add(_pnl,(Object)(_pi));
RDebugUtils.currentLine=18677766;
 //BA.debugLineNum = 18677766;BA.debugLine="If pnl.GetView(0).Tag Is B4XFloatTextField Then";
if (true) break;

case 7:
//if
this.state = 14;
if (_pnl.GetView((int) (0)).getTag() instanceof b4j.example.b4xfloattextfield) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=18677767;
 //BA.debugLineNum = 18677767;BA.debugLine="Dim tf As B4XFloatTextField = pnl.GetView(0).T";
_tf = (b4j.example.b4xfloattextfield)(_pnl.GetView((int) (0)).getTag());
RDebugUtils.currentLine=18677768;
 //BA.debugLineNum = 18677768;BA.debugLine="If LastTextField.IsInitialized Then";
if (true) break;

case 10:
//if
this.state = 13;
if (_lasttextfield.IsInitialized /*boolean*/ ()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=18677769;
 //BA.debugLineNum = 18677769;BA.debugLine="LastTextField.NextField = tf";
_lasttextfield._setnextfield /*b4j.example.b4xfloattextfield*/ (null,_tf);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=18677771;
 //BA.debugLineNum = 18677771;BA.debugLine="LastTextField = tf";
_lasttextfield = _tf;
 if (true) break;

case 14:
//C
this.state = 56;
;
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=18677779;
 //BA.debugLineNum = 18677779;BA.debugLine="Dialog.InternalAddStubToCLVIfNeeded(CustomListVi";
__ref._dialog /*b4j.example.b4xdialog*/ ._internaladdstubtoclvifneeded /*String*/ (null,__ref._customlistview1 /*b4j.example.customlistview*/ ,__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor);
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=18677781;
 //BA.debugLineNum = 18677781;BA.debugLine="FillData (Data)";
__ref._filldata /*String*/ (null,_data);
RDebugUtils.currentLine=18677782;
 //BA.debugLineNum = 18677782;BA.debugLine="Dim ScrollViewOffset As Int 'ignore";
_scrollviewoffset = 0;
RDebugUtils.currentLine=18677783;
 //BA.debugLineNum = 18677783;BA.debugLine="Do While True";
if (true) break;

case 17:
//do while
this.state = 54;
while (parent.__c.True) {
this.state = 19;
if (true) break;
}
if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=18677784;
 //BA.debugLineNum = 18677784;BA.debugLine="Dialog.Title = mTitle";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = __ref._mtitle /*Object*/ ;
RDebugUtils.currentLine=18677785;
 //BA.debugLineNum = 18677785;BA.debugLine="Dialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._dialog /*b4j.example.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=18677786;
 //BA.debugLineNum = 18677786;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(Me, Yes,";
_rs = __ref._dialog /*b4j.example.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent,_yes,(Object)(""),_cancel);
RDebugUtils.currentLine=18677794;
 //BA.debugLineNum = 18677794;BA.debugLine="RaiseBeforeDialogDisplayed(Me)";
__ref._raisebeforedialogdisplayed /*String*/ (null,parent);
RDebugUtils.currentLine=18677795;
 //BA.debugLineNum = 18677795;BA.debugLine="Wait For (rs) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preferencesdialog", "showdialog"), _rs);
this.state = 57;
return;
case 57:
//C
this.state = 20;
_result = (int) result[1];
;
RDebugUtils.currentLine=18677796;
 //BA.debugLineNum = 18677796;BA.debugLine="ScrollViewOffset = CustomListView1.sv.ScrollView";
_scrollviewoffset = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewOffsetY());
RDebugUtils.currentLine=18677797;
 //BA.debugLineNum = 18677797;BA.debugLine="If Result <> RESULT_SHOWING_NESTED_DIALOG Then";
if (true) break;

case 20:
//if
this.state = 53;
if (_result!=__ref._result_showing_nested_dialog /*int*/ ) { 
this.state = 22;
}else {
this.state = 32;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=18677798;
 //BA.debugLineNum = 18677798;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 23:
//if
this.state = 30;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=18677799;
 //BA.debugLineNum = 18677799;BA.debugLine="If CommitChanges(Data) = False Then";
if (true) break;

case 26:
//if
this.state = 29;
if (__ref._commitchanges /*boolean*/ (null,_data)==parent.__c.False) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=18677800;
 //BA.debugLineNum = 18677800;BA.debugLine="ScrollViewOffset = 0";
_scrollviewoffset = (int) (0);
RDebugUtils.currentLine=18677801;
 //BA.debugLineNum = 18677801;BA.debugLine="Continue";
this.state = 17;
if (true) break;;
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 53;
;
RDebugUtils.currentLine=18677804;
 //BA.debugLineNum = 18677804;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=18677806;
 //BA.debugLineNum = 18677806;BA.debugLine="Dim y As Object";
_y = new Object();
RDebugUtils.currentLine=18677807;
 //BA.debugLineNum = 18677807;BA.debugLine="Dim c As Object = Cancel";
_c = _cancel;
RDebugUtils.currentLine=18677808;
 //BA.debugLineNum = 18677808;BA.debugLine="If Template = ColorTemplate Then";
if (true) break;

case 33:
//if
this.state = 40;
if ((__ref._template /*Object*/ ).equals((Object)(__ref._colortemplate /*b4j.example.b4xcolortemplate*/ ))) { 
this.state = 35;
}else 
{RDebugUtils.currentLine=18677810;
 //BA.debugLineNum = 18677810;BA.debugLine="Else If Template = LongTextTemplate Then";
if ((__ref._template /*Object*/ ).equals((Object)(__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ ))) { 
this.state = 37;
}else {
this.state = 39;
}}
if (true) break;

case 35:
//C
this.state = 40;
RDebugUtils.currentLine=18677809;
 //BA.debugLineNum = 18677809;BA.debugLine="y = Yes";
_y = _yes;
 if (true) break;

case 37:
//C
this.state = 40;
RDebugUtils.currentLine=18677811;
 //BA.debugLineNum = 18677811;BA.debugLine="y = Yes";
_y = _yes;
RDebugUtils.currentLine=18677812;
 //BA.debugLineNum = 18677812;BA.debugLine="c = \"\"";
_c = (Object)("");
 if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=18677814;
 //BA.debugLineNum = 18677814;BA.debugLine="y = \"\"";
_y = (Object)("");
 if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=18677816;
 //BA.debugLineNum = 18677816;BA.debugLine="Dialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._dialog /*b4j.example.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=18677817;
 //BA.debugLineNum = 18677817;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(Template";
_rs = __ref._dialog /*b4j.example.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._template /*Object*/ ,_y,(Object)(""),_c);
RDebugUtils.currentLine=18677818;
 //BA.debugLineNum = 18677818;BA.debugLine="RaiseBeforeDialogDisplayed(Template)";
__ref._raisebeforedialogdisplayed /*String*/ (null,__ref._template /*Object*/ );
RDebugUtils.currentLine=18677819;
 //BA.debugLineNum = 18677819;BA.debugLine="Wait For (rs) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preferencesdialog", "showdialog"), _rs);
this.state = 58;
return;
case 58:
//C
this.state = 41;
_result = (int) result[1];
;
RDebugUtils.currentLine=18677820;
 //BA.debugLineNum = 18677820;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 41:
//if
this.state = 52;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=18677821;
 //BA.debugLineNum = 18677821;BA.debugLine="Dim lbl As B4XView = CustomListView1.GetPanel(";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(__ref._nesteddialogitemindex /*int*/ ).GetView((int) (1));
RDebugUtils.currentLine=18677822;
 //BA.debugLineNum = 18677822;BA.debugLine="Dim value As String";
_value = "";
RDebugUtils.currentLine=18677823;
 //BA.debugLineNum = 18677823;BA.debugLine="If Template = DateTemplate Then";
if (true) break;

case 44:
//if
this.state = 51;
if ((__ref._template /*Object*/ ).equals((Object)(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ))) { 
this.state = 46;
}else 
{RDebugUtils.currentLine=18677826;
 //BA.debugLineNum = 18677826;BA.debugLine="Else if Template = SearchTemplate Then";
if ((__ref._template /*Object*/ ).equals((Object)(__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ))) { 
this.state = 48;
}else 
{RDebugUtils.currentLine=18677829;
 //BA.debugLineNum = 18677829;BA.debugLine="Else If Template = ColorTemplate Then";
if ((__ref._template /*Object*/ ).equals((Object)(__ref._colortemplate /*b4j.example.b4xcolortemplate*/ ))) { 
this.state = 50;
}}}
if (true) break;

case 46:
//C
this.state = 51;
RDebugUtils.currentLine=18677824;
 //BA.debugLineNum = 18677824;BA.debugLine="value = DateTime.Date(DateTemplate.Date)";
_value = parent.__c.DateTime.Date(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._getdate /*long*/ (null));
RDebugUtils.currentLine=18677825;
 //BA.debugLineNum = 18677825;BA.debugLine="lbl.Text = value";
_lbl.setText(_value);
 if (true) break;

case 48:
//C
this.state = 51;
RDebugUtils.currentLine=18677827;
 //BA.debugLineNum = 18677827;BA.debugLine="value = SearchTemplate.SelectedItem";
_value = __ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=18677828;
 //BA.debugLineNum = 18677828;BA.debugLine="lbl.Text = value";
_lbl.setText(_value);
 if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=18677830;
 //BA.debugLineNum = 18677830;BA.debugLine="value = ColorTemplate.SelectedColor";
_value = BA.NumberToString(__ref._colortemplate /*b4j.example.b4xcolortemplate*/ ._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=18677831;
 //BA.debugLineNum = 18677831;BA.debugLine="SetLabelColor(lbl, value)";
__ref._setlabelcolor /*String*/ (null,_lbl,(int)(Double.parseDouble(_value)));
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

case 53:
//C
this.state = 17;
;
 if (true) break;

case 54:
//C
this.state = -1;
;
RDebugUtils.currentLine=18677836;
 //BA.debugLineNum = 18677836;BA.debugLine="Return -1 'never happens";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(-1));return;};
RDebugUtils.currentLine=18677837;
 //BA.debugLineNum = 18677837;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _tfcolorcode_enterpressed(b4j.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "tfcolorcode_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "tfcolorcode_enterpressed", null));}
b4j.example.b4xfloattextfield _ft = null;
int[] _clr = null;
int _index = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Private Sub tfColorCode_EnterPressed";
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="Dim ft As B4XFloatTextField = Sender";
_ft = (b4j.example.b4xfloattextfield)(__c.Sender(ba));
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="Dim clr() As Int = HexToColor(ft.Text)";
_clr = __ref._hextocolor /*int[]*/ (null,_ft._gettext /*String*/ (null));
RDebugUtils.currentLine=20512771;
 //BA.debugLineNum = 20512771;BA.debugLine="Dim index As Int = CustomListView1.GetItemFromVie";
_index = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview(_ft._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=20512772;
 //BA.debugLineNum = 20512772;BA.debugLine="Dim lbl As B4XView = CustomListView1.GetPanel(ind";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(_index).GetView((int) (1));
RDebugUtils.currentLine=20512773;
 //BA.debugLineNum = 20512773;BA.debugLine="If clr.Length = 1 Then";
if (_clr.length==1) { 
RDebugUtils.currentLine=20512774;
 //BA.debugLineNum = 20512774;BA.debugLine="SetLabelColor(lbl, clr(0))";
__ref._setlabelcolor /*String*/ (null,_lbl,_clr[(int) (0)]);
 }else {
RDebugUtils.currentLine=20512776;
 //BA.debugLineNum = 20512776;BA.debugLine="ft.Text = ColorToHex(lbl.Color)";
_ft._settext /*String*/ (null,__ref._colortohex /*String*/ (null,_lbl.getColor()));
 };
RDebugUtils.currentLine=20512778;
 //BA.debugLineNum = 20512778;BA.debugLine="End Sub";
return "";
}
}