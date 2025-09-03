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
RDebugUtils.currentLine=17301504;
 //BA.debugLineNum = 17301504;BA.debugLine="Public Sub AddBooleanItem (Key As String, Title As";
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_BOOLEAN,";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_boolean /*int*/ ,_key)));
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="End Sub";
return "";
}
public b4j.example.preferencesdialog._b4xprefitem  _createprefitem(b4j.example.preferencesdialog __ref,Object _title,int _itemtype,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "createprefitem", true))
	 {return ((b4j.example.preferencesdialog._b4xprefitem) Debug.delegate(ba, "createprefitem", new Object[] {_title,_itemtype,_key}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Private Sub CreatePrefItem(Title As Object, ItemTy";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="Dim pi As B4XPrefItem";
_pi = new b4j.example.preferencesdialog._b4xprefitem();
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="pi.Initialize";
_pi.Initialize();
RDebugUtils.currentLine=18087939;
 //BA.debugLineNum = 18087939;BA.debugLine="pi.Title = Title";
_pi.Title /*Object*/  = _title;
RDebugUtils.currentLine=18087940;
 //BA.debugLineNum = 18087940;BA.debugLine="pi.ItemType = ItemType";
_pi.ItemType /*int*/  = _itemtype;
RDebugUtils.currentLine=18087941;
 //BA.debugLineNum = 18087941;BA.debugLine="pi.Key = Key";
_pi.Key /*String*/  = _key;
RDebugUtils.currentLine=18087942;
 //BA.debugLineNum = 18087942;BA.debugLine="Return pi";
if (true) return _pi;
RDebugUtils.currentLine=18087943;
 //BA.debugLineNum = 18087943;BA.debugLine="End Sub";
return null;
}
public String  _addcoloritem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addcoloritem", true))
	 {return ((String) Debug.delegate(ba, "addcoloritem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Public Sub AddColorItem(Key As String, Title As Ob";
RDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="If ColorTemplate.IsInitialized = False Then";
if (__ref._colortemplate /*b4j.example.b4xcolortemplate*/ .IsInitialized /*boolean*/ ()==__c.False) { 
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="ColorTemplate.Initialize";
__ref._colortemplate /*b4j.example.b4xcolortemplate*/ ._initialize /*String*/ (null,ba);
 };
RDebugUtils.currentLine=17891332;
 //BA.debugLineNum = 17891332;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_COLOR, K";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_color /*int*/ ,_key)));
RDebugUtils.currentLine=17891333;
 //BA.debugLineNum = 17891333;BA.debugLine="End Sub";
return "";
}
public String  _adddateitem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "adddateitem", true))
	 {return ((String) Debug.delegate(ba, "adddateitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Public Sub AddDateItem (Key As String, Title As Ob";
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_DATE, Ke";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_date /*int*/ ,_key)));
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="End Sub";
return "";
}
public String  _adddecimalnumberitem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "adddecimalnumberitem", true))
	 {return ((String) Debug.delegate(ba, "adddecimalnumberitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Public Sub AddDecimalNumberItem (Key As String, Ti";
RDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_DECIMALN";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_decimalnumber /*int*/ ,_key)));
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="End Sub";
return "";
}
public String  _addexplanationitem(b4j.example.preferencesdialog __ref,String _key,Object _title,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addexplanationitem", true))
	 {return ((String) Debug.delegate(ba, "addexplanationitem", new Object[] {_key,_title,_text}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Public Sub AddExplanationItem (Key As String, Titl";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_explanation /*int*/ ,_key);
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="pi.Extra = CreateMap(\"text\": Text)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("text"),_text});
RDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=17956868;
 //BA.debugLineNum = 17956868;BA.debugLine="End Sub";
return "";
}
public String  _addmultilinetextitem(b4j.example.preferencesdialog __ref,String _key,Object _title,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addmultilinetextitem", true))
	 {return ((String) Debug.delegate(ba, "addmultilinetextitem", new Object[] {_key,_title,_height}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=17563648;
 //BA.debugLineNum = 17563648;BA.debugLine="Public Sub AddMultilineTextItem (Key As String, Ti";
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_multilinetext /*int*/ ,_key);
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="pi.Extra = CreateMap(\"height\": Height)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("height"),(Object)(_height)});
RDebugUtils.currentLine=17563651;
 //BA.debugLineNum = 17563651;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=17563652;
 //BA.debugLineNum = 17563652;BA.debugLine="End Sub";
return "";
}
public String  _addnumberitem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addnumberitem", true))
	 {return ((String) Debug.delegate(ba, "addnumberitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Public Sub AddNumberItem (Key As String, Title As";
RDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_NUMBER,";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_number /*int*/ ,_key)));
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="End Sub";
return "";
}
public String  _addnumericrangeitem(b4j.example.preferencesdialog __ref,String _key,Object _title,double _rangestart,double _rangeend,double _interval) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addnumericrangeitem", true))
	 {return ((String) Debug.delegate(ba, "addnumericrangeitem", new Object[] {_key,_title,_rangestart,_rangeend,_interval}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Public Sub AddNumericRangeItem (Key As String, Tit";
RDebugUtils.currentLine=17629185;
 //BA.debugLineNum = 17629185;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_numericrange /*int*/ ,_key);
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="pi.Extra = CreateMap(\"start\": RangeStart, \"end\":";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("start"),(Object)(_rangestart),(Object)("end"),(Object)(_rangeend),(Object)("interval"),(Object)(_interval)});
RDebugUtils.currentLine=17629187;
 //BA.debugLineNum = 17629187;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=17629188;
 //BA.debugLineNum = 17629188;BA.debugLine="End Sub";
return "";
}
public String  _addoptionsitem(b4j.example.preferencesdialog __ref,String _key,Object _title,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addoptionsitem", true))
	 {return ((String) Debug.delegate(ba, "addoptionsitem", new Object[] {_key,_title,_options}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=17170432;
 //BA.debugLineNum = 17170432;BA.debugLine="Public Sub AddOptionsItem (Key As String, Title As";
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_options /*int*/ ,_key);
RDebugUtils.currentLine=17170435;
 //BA.debugLineNum = 17170435;BA.debugLine="If Options.IsInitialized Then";
if (_options.IsInitialized()) { 
RDebugUtils.currentLine=17170436;
 //BA.debugLineNum = 17170436;BA.debugLine="pi.Extra = CreateMap(\"options\": Options)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("options"),(Object)(_options.getObject())});
 };
RDebugUtils.currentLine=17170438;
 //BA.debugLineNum = 17170438;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=17170439;
 //BA.debugLineNum = 17170439;BA.debugLine="End Sub";
return "";
}
public String  _addpassworditem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addpassworditem", true))
	 {return ((String) Debug.delegate(ba, "addpassworditem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Public Sub AddPasswordItem (Key As String, Title A";
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_PASSWORD";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_password /*int*/ ,_key)));
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="End Sub";
return "";
}
public String  _addseparator(b4j.example.preferencesdialog __ref,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addseparator", true))
	 {return ((String) Debug.delegate(ba, "addseparator", new Object[] {_title}));}
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Public Sub AddSeparator (Title As Object)";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_SEPARATO";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_separator /*int*/ ,"")));
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="End Sub";
return "";
}
public String  _addshortoptionsitem(b4j.example.preferencesdialog __ref,String _key,Object _title,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addshortoptionsitem", true))
	 {return ((String) Debug.delegate(ba, "addshortoptionsitem", new Object[] {_key,_title,_options}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=17235968;
 //BA.debugLineNum = 17235968;BA.debugLine="Public Sub AddShortOptionsItem (Key As String, Tit";
RDebugUtils.currentLine=17235969;
 //BA.debugLineNum = 17235969;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_shortoptions /*int*/ ,_key);
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="If Options.IsInitialized Then";
if (_options.IsInitialized()) { 
RDebugUtils.currentLine=17235971;
 //BA.debugLineNum = 17235971;BA.debugLine="pi.Extra = CreateMap(\"options\": Options)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("options"),(Object)(_options.getObject())});
 };
RDebugUtils.currentLine=17235973;
 //BA.debugLineNum = 17235973;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=17235974;
 //BA.debugLineNum = 17235974;BA.debugLine="End Sub";
return "";
}
public String  _addtextitem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addtextitem", true))
	 {return ((String) Debug.delegate(ba, "addtextitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Public Sub AddTextItem (Key As String, Title As Ob";
RDebugUtils.currentLine=17367041;
 //BA.debugLineNum = 17367041;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_TEXT, Ke";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_text /*int*/ ,_key)));
RDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="End Sub";
return "";
}
public String  _addtimeitem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addtimeitem", true))
	 {return ((String) Debug.delegate(ba, "addtimeitem", new Object[] {_key,_title}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Public Sub AddTimeItem (Key As String, Title As Ob";
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_time /*int*/ ,_key);
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="pi.Extra = CreateMap(\"24\": False)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("24"),(Object)(__c.False)});
RDebugUtils.currentLine=17694723;
 //BA.debugLineNum = 17694723;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="End Sub";
return "";
}
public String  _b4xcombobox1_selectedindexchanged(b4j.example.preferencesdialog __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "b4xcombobox1_selectedindexchanged", true))
	 {return ((String) Debug.delegate(ba, "b4xcombobox1_selectedindexchanged", new Object[] {_index}));}
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Private Sub B4XComboBox1_SelectedIndexChanged (Ind";
RDebugUtils.currentLine=19922946;
 //BA.debugLineNum = 19922946;BA.debugLine="End Sub";
return "";
}
public String  _b4xswitch1_valuechanged(b4j.example.preferencesdialog __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "b4xswitch1_valuechanged", true))
	 {return ((String) Debug.delegate(ba, "b4xswitch1_valuechanged", new Object[] {_value}));}
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Private Sub B4XSwitch1_ValueChanged (Value As Bool";
RDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="End Sub";
return "";
}
public boolean  _backkeypressed(b4j.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "backkeypressed", true))
	 {return ((Boolean) Debug.delegate(ba, "backkeypressed", null));}
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Public Sub BackKeyPressed As Boolean";
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="If Dialog.Visible Then";
if (__ref._dialog /*b4j.example.b4xdialog*/ ._getvisible /*boolean*/ (null)) { 
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="Dialog.Close(xui.DialogResponse_Cancel)";
__ref._dialog /*b4j.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=17039363;
 //BA.debugLineNum = 17039363;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=17039365;
 //BA.debugLineNum = 17039365;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=17039366;
 //BA.debugLineNum = 17039366;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=16646147;
 //BA.debugLineNum = 16646147;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4j.example.customlistview();
RDebugUtils.currentLine=16646148;
 //BA.debugLineNum = 16646148;BA.debugLine="Type B4XPrefItem (Title As Object, ItemType As In";
;
RDebugUtils.currentLine=16646149;
 //BA.debugLineNum = 16646149;BA.debugLine="Public PrefItems As List";
_prefitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=16646150;
 //BA.debugLineNum = 16646150;BA.debugLine="Public TYPE_BOOLEAN = 1, TYPE_TEXT = 2, TYPE_DATE";
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
RDebugUtils.currentLine=16646153;
 //BA.debugLineNum = 16646153;BA.debugLine="Public DateTemplate As B4XDateTemplate";
_datetemplate = new b4j.example.b4xdatetemplate();
RDebugUtils.currentLine=16646154;
 //BA.debugLineNum = 16646154;BA.debugLine="Public LongTextTemplate As B4XLongTextTemplate";
_longtexttemplate = new b4j.example.b4xlongtexttemplate();
RDebugUtils.currentLine=16646155;
 //BA.debugLineNum = 16646155;BA.debugLine="Public Dialog As B4XDialog";
_dialog = new b4j.example.b4xdialog();
RDebugUtils.currentLine=16646156;
 //BA.debugLineNum = 16646156;BA.debugLine="Private RESULT_SHOWING_NESTED_DIALOG As Int = 100";
_result_showing_nested_dialog = (int) (100);
RDebugUtils.currentLine=16646157;
 //BA.debugLineNum = 16646157;BA.debugLine="Private NestedDialogItemIndex As Int";
_nesteddialogitemindex = 0;
RDebugUtils.currentLine=16646158;
 //BA.debugLineNum = 16646158;BA.debugLine="Private mTitle As Object";
_mtitle = new Object();
RDebugUtils.currentLine=16646159;
 //BA.debugLineNum = 16646159;BA.debugLine="Public SearchTemplate As B4XSearchTemplate";
_searchtemplate = new b4j.example.b4xsearchtemplate();
RDebugUtils.currentLine=16646160;
 //BA.debugLineNum = 16646160;BA.debugLine="Private Template As Object";
_template = new Object();
RDebugUtils.currentLine=16646161;
 //BA.debugLineNum = 16646161;BA.debugLine="Public ColorTemplate As B4XColorTemplate";
_colortemplate = new b4j.example.b4xcolortemplate();
RDebugUtils.currentLine=16646162;
 //BA.debugLineNum = 16646162;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
_b4xcombobox1 = new b4j.example.b4xcombobox();
RDebugUtils.currentLine=16646163;
 //BA.debugLineNum = 16646163;BA.debugLine="Public const THEME_DARK = 1, THEME_LIGHT = 2 As I";
_theme_dark = (int) (1);
_theme_light = (int) (2);
RDebugUtils.currentLine=16646164;
 //BA.debugLineNum = 16646164;BA.debugLine="Private mTheme As Int";
_mtheme = 0;
RDebugUtils.currentLine=16646165;
 //BA.debugLineNum = 16646165;BA.debugLine="Public ItemsBackgroundColor As Int";
_itemsbackgroundcolor = 0;
RDebugUtils.currentLine=16646166;
 //BA.debugLineNum = 16646166;BA.debugLine="Public TextColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=16646167;
 //BA.debugLineNum = 16646167;BA.debugLine="Public SeparatorBackgroundColor, SeparatorTextCol";
_separatorbackgroundcolor = 0;
_separatortextcolor = 0;
RDebugUtils.currentLine=16646168;
 //BA.debugLineNum = 16646168;BA.debugLine="Private mCallback As Object";
_mcallback = new Object();
RDebugUtils.currentLine=16646169;
 //BA.debugLineNum = 16646169;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=16646170;
 //BA.debugLineNum = 16646170;BA.debugLine="Public DefaultHintFont As B4XFont";
_defaulthintfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=16646171;
 //BA.debugLineNum = 16646171;BA.debugLine="Public DefaultHintLargeSize As Int";
_defaulthintlargesize = 0;
RDebugUtils.currentLine=16646172;
 //BA.debugLineNum = 16646172;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=18415617;
 //BA.debugLineNum = 18415617;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="PrefItems.Clear";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=18415619;
 //BA.debugLineNum = 18415619;BA.debugLine="End Sub";
return "";
}
public String  _colortohex(b4j.example.preferencesdialog __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "colortohex", true))
	 {return ((String) Debug.delegate(ba, "colortohex", new Object[] {_clr}));}
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Private Sub ColorToHex(clr As Int) As String";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="Return bc.HexFromBytes(bc.IntsToBytes(Array As In";
if (true) return _bc.HexFromBytes(_bc.IntsToBytes(new int[]{_clr}));
RDebugUtils.currentLine=20054019;
 //BA.debugLineNum = 20054019;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Private Sub CommitChanges (Data As Map) As Boolean";
RDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="Dim Temp As Map";
_temp = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="Temp.Initialize";
_temp.Initialize();
RDebugUtils.currentLine=19005443;
 //BA.debugLineNum = 19005443;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=19005444;
 //BA.debugLineNum = 19005444;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = __ref._customlistview1 /*b4j.example.customlistview*/ ._getrawlistitem(_i);
RDebugUtils.currentLine=19005445;
 //BA.debugLineNum = 19005445;BA.debugLine="If (Item.Value Is B4XPrefItem) = False Then Exit";
if ((_item.Value instanceof b4j.example.preferencesdialog._b4xprefitem)==__c.False) { 
if (true) break;};
RDebugUtils.currentLine=19005446;
 //BA.debugLineNum = 19005446;BA.debugLine="Dim PrefItem As B4XPrefItem = Item.Value";
_prefitem = (b4j.example.preferencesdialog._b4xprefitem)(_item.Value);
RDebugUtils.currentLine=19005447;
 //BA.debugLineNum = 19005447;BA.debugLine="Dim ItemPanel As B4XView = Item.Panel.GetView(0)";
_itempanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_itempanel = _item.Panel.GetView((int) (0));
RDebugUtils.currentLine=19005448;
 //BA.debugLineNum = 19005448;BA.debugLine="Dim Required As Boolean = PrefItem.Required";
_required = _prefitem.Required /*boolean*/ ;
RDebugUtils.currentLine=19005449;
 //BA.debugLineNum = 19005449;BA.debugLine="Dim Value As Object";
_value = new Object();
RDebugUtils.currentLine=19005450;
 //BA.debugLineNum = 19005450;BA.debugLine="Select PrefItem.ItemType";
switch (BA.switchObjectToInt(_prefitem.ItemType /*int*/ ,__ref._type_boolean /*int*/ ,__ref._type_text /*int*/ ,__ref._type_password /*int*/ ,__ref._type_multilinetext /*int*/ ,__ref._type_number /*int*/ ,__ref._type_decimalnumber /*int*/ ,__ref._type_date /*int*/ ,__ref._type_time /*int*/ ,__ref._type_numericrange /*int*/ ,__ref._type_options /*int*/ ,__ref._type_shortoptions /*int*/ ,__ref._type_color /*int*/ ,__ref._type_separator /*int*/ ,__ref._type_explanation /*int*/ )) {
case 0: {
RDebugUtils.currentLine=19005452;
 //BA.debugLineNum = 19005452;BA.debugLine="Dim switch As B4XSwitch = ItemPanel.GetView(1)";
_switch = (b4j.example.b4xswitch)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=19005453;
 //BA.debugLineNum = 19005453;BA.debugLine="Value = switch.Value";
_value = (Object)(_switch._getvalue /*boolean*/ (null));
 break; }
case 1: 
case 2: 
case 3: {
RDebugUtils.currentLine=19005455;
 //BA.debugLineNum = 19005455;BA.debugLine="Dim ft As B4XFloatTextField = ItemPanel.GetVie";
_ft = (b4j.example.b4xfloattextfield)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=19005456;
 //BA.debugLineNum = 19005456;BA.debugLine="Value = ft.Text";
_value = (Object)(_ft._gettext /*String*/ (null));
 break; }
case 4: 
case 5: {
RDebugUtils.currentLine=19005459;
 //BA.debugLineNum = 19005459;BA.debugLine="Dim ft As B4XFloatTextField = ItemPanel.GetVie";
_ft = (b4j.example.b4xfloattextfield)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=19005460;
 //BA.debugLineNum = 19005460;BA.debugLine="Dim n As Double";
_n = 0;
RDebugUtils.currentLine=19005461;
 //BA.debugLineNum = 19005461;BA.debugLine="If ft.Text <> \"\" Then";
if ((_ft._gettext /*String*/ (null)).equals("") == false) { 
RDebugUtils.currentLine=19005462;
 //BA.debugLineNum = 19005462;BA.debugLine="If IsNumber(ft.Text) Then";
if (__c.IsNumber(_ft._gettext /*String*/ (null))) { 
RDebugUtils.currentLine=19005463;
 //BA.debugLineNum = 19005463;BA.debugLine="n = ft.Text";
_n = (double)(Double.parseDouble(_ft._gettext /*String*/ (null)));
RDebugUtils.currentLine=19005464;
 //BA.debugLineNum = 19005464;BA.debugLine="If PrefItem.ItemType = TYPE_NUMBER Then";
if (_prefitem.ItemType /*int*/ ==__ref._type_number /*int*/ ) { 
RDebugUtils.currentLine=19005465;
 //BA.debugLineNum = 19005465;BA.debugLine="Dim n2 As Int = n";
_n2 = (int) (_n);
RDebugUtils.currentLine=19005466;
 //BA.debugLineNum = 19005466;BA.debugLine="Value = n2";
_value = (Object)(_n2);
 }else {
RDebugUtils.currentLine=19005468;
 //BA.debugLineNum = 19005468;BA.debugLine="Value = n";
_value = (Object)(_n);
 };
 }else {
RDebugUtils.currentLine=19005471;
 //BA.debugLineNum = 19005471;BA.debugLine="GoToItem(i)";
__ref._gotoitem /*void*/ (null,_i);
RDebugUtils.currentLine=19005472;
 //BA.debugLineNum = 19005472;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }else {
RDebugUtils.currentLine=19005475;
 //BA.debugLineNum = 19005475;BA.debugLine="Value = \"\"";
_value = (Object)("");
 };
 break; }
case 6: {
RDebugUtils.currentLine=19005478;
 //BA.debugLineNum = 19005478;BA.debugLine="Value = DateTime.DateParse(ItemPanel.GetView(1";
_value = (Object)(__c.DateTime.DateParse(_itempanel.GetView((int) (1)).getText()));
 break; }
case 7: {
RDebugUtils.currentLine=19005480;
 //BA.debugLineNum = 19005480;BA.debugLine="Dim pmHours As B4XPlusMinus = ItemPanel.GetVie";
_pmhours = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=19005481;
 //BA.debugLineNum = 19005481;BA.debugLine="Dim pmMinutes As B4XPlusMinus = ItemPanel.GetV";
_pmminutes = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=19005482;
 //BA.debugLineNum = 19005482;BA.debugLine="Dim pmAMPM As B4XPlusMinus = ItemPanel.GetView";
_pmampm = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (2)).getTag());
RDebugUtils.currentLine=19005483;
 //BA.debugLineNum = 19005483;BA.debugLine="Dim p As Period";
_p = new b4j.example.dateutils._period();
RDebugUtils.currentLine=19005484;
 //BA.debugLineNum = 19005484;BA.debugLine="p.Initialize";
_p.Initialize();
RDebugUtils.currentLine=19005485;
 //BA.debugLineNum = 19005485;BA.debugLine="p.Hours = pmHours.SelectedValue";
_p.Hours = (int)(BA.ObjectToNumber(_pmhours._getselectedvalue /*Object*/ (null)));
RDebugUtils.currentLine=19005486;
 //BA.debugLineNum = 19005486;BA.debugLine="If PrefItem.Extra.GetDefault(\"24\", False) = Fa";
if ((_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("24"),(Object)(__c.False))).equals((Object)(__c.False))) { 
RDebugUtils.currentLine=19005487;
 //BA.debugLineNum = 19005487;BA.debugLine="If p.Hours = 12 Then p.Hours = 0";
if (_p.Hours==12) { 
_p.Hours = (int) (0);};
RDebugUtils.currentLine=19005488;
 //BA.debugLineNum = 19005488;BA.debugLine="If pmAMPM.SelectedValue = \"pm\" Then p.Hours =";
if ((_pmampm._getselectedvalue /*Object*/ (null)).equals((Object)("pm"))) { 
_p.Hours = (int) (_p.Hours+12);};
 };
RDebugUtils.currentLine=19005490;
 //BA.debugLineNum = 19005490;BA.debugLine="p.Minutes = pmMinutes.SelectedValue";
_p.Minutes = (int)(BA.ObjectToNumber(_pmminutes._getselectedvalue /*Object*/ (null)));
RDebugUtils.currentLine=19005491;
 //BA.debugLineNum = 19005491;BA.debugLine="Value = p";
_value = (Object)(_p);
 break; }
case 8: {
RDebugUtils.currentLine=19005493;
 //BA.debugLineNum = 19005493;BA.debugLine="Dim pm As B4XPlusMinus = ItemPanel.GetView(0).";
_pm = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=19005494;
 //BA.debugLineNum = 19005494;BA.debugLine="Value = pm.SelectedValue";
_value = _pm._getselectedvalue /*Object*/ (null);
 break; }
case 9: {
RDebugUtils.currentLine=19005496;
 //BA.debugLineNum = 19005496;BA.debugLine="Value = ItemPanel.GetView(1).Text";
_value = (Object)(_itempanel.GetView((int) (1)).getText());
 break; }
case 10: {
RDebugUtils.currentLine=19005498;
 //BA.debugLineNum = 19005498;BA.debugLine="Dim cmb As B4XComboBox = ItemPanel.GetView(1).";
_cmb = (b4j.example.b4xcombobox)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=19005499;
 //BA.debugLineNum = 19005499;BA.debugLine="If cmb.SelectedIndex > -1 Then Value = cmb.Get";
if (_cmb._getselectedindex /*int*/ (null)>-1) { 
_value = (Object)(_cmb._getitem /*String*/ (null,_cmb._getselectedindex /*int*/ (null)));}
else {
_value = (Object)("");};
 break; }
case 11: {
RDebugUtils.currentLine=19005501;
 //BA.debugLineNum = 19005501;BA.debugLine="Value = ItemPanel.GetView(1).Color";
_value = (Object)(_itempanel.GetView((int) (1)).getColor());
 break; }
case 12: 
case 13: {
RDebugUtils.currentLine=19005503;
 //BA.debugLineNum = 19005503;BA.debugLine="Continue";
if (true) continue;
 break; }
}
;
RDebugUtils.currentLine=19005505;
 //BA.debugLineNum = 19005505;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
RDebugUtils.currentLine=19005506;
 //BA.debugLineNum = 19005506;BA.debugLine="If Required Then";
if (_required) { 
RDebugUtils.currentLine=19005507;
 //BA.debugLineNum = 19005507;BA.debugLine="GoToItem(i)";
__ref._gotoitem /*void*/ (null,_i);
RDebugUtils.currentLine=19005508;
 //BA.debugLineNum = 19005508;BA.debugLine="Return False";
if (true) return __c.False;
 }else {
RDebugUtils.currentLine=19005510;
 //BA.debugLineNum = 19005510;BA.debugLine="Continue";
if (true) continue;
 };
 };
RDebugUtils.currentLine=19005513;
 //BA.debugLineNum = 19005513;BA.debugLine="Temp.Put(PrefItem.Key, Value)";
_temp.Put((Object)(_prefitem.Key /*String*/ ),_value);
 }
};
RDebugUtils.currentLine=19005515;
 //BA.debugLineNum = 19005515;BA.debugLine="If mEventName <> \"\" And xui.SubExists(mCallback,";
if ((__ref._meventname /*String*/ ).equals("") == false && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_IsValid",(int) (1))) { 
RDebugUtils.currentLine=19005516;
 //BA.debugLineNum = 19005516;BA.debugLine="Dim Valid As Boolean = CallSub2(mCallback, mEven";
_valid = BA.ObjectToBoolean(__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_IsValid",(Object)(_temp)));
RDebugUtils.currentLine=19005517;
 //BA.debugLineNum = 19005517;BA.debugLine="If Valid = False Then Return False";
if (_valid==__c.False) { 
if (true) return __c.False;};
 };
RDebugUtils.currentLine=19005519;
 //BA.debugLineNum = 19005519;BA.debugLine="For Each key As String In Temp.Keys";
{
final anywheresoftware.b4a.BA.IterableList group78 = _temp.Keys();
final int groupLen78 = group78.getSize()
;int index78 = 0;
;
for (; index78 < groupLen78;index78++){
_key = BA.ObjectToString(group78.Get(index78));
RDebugUtils.currentLine=19005520;
 //BA.debugLineNum = 19005520;BA.debugLine="Data.Put(key, Temp.Get(key))";
_data.Put((Object)(_key),_temp.Get((Object)(_key)));
 }
};
RDebugUtils.currentLine=19005522;
 //BA.debugLineNum = 19005522;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=19005523;
 //BA.debugLineNum = 19005523;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19136513;
 //BA.debugLineNum = 19136513;BA.debugLine="CustomListView1.JumpToItem(i)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._jumptoitem(_i);
RDebugUtils.currentLine=19136514;
 //BA.debugLineNum = 19136514;BA.debugLine="Dim p As B4XView = CustomListView1.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=19136515;
 //BA.debugLineNum = 19136515;BA.debugLine="For i = 0 To 3";
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
RDebugUtils.currentLine=19136516;
 //BA.debugLineNum = 19136516;BA.debugLine="Dim duration As Int = 100 - i * 20";
_duration = (int) (100-_i*20);
RDebugUtils.currentLine=19136517;
 //BA.debugLineNum = 19136517;BA.debugLine="p.SetLayoutAnimated(duration, -10dip, 0, p.Width";
_p.SetLayoutAnimated(_duration,-parent.__c.DipToCurrent((int) (10)),0,_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=19136518;
 //BA.debugLineNum = 19136518;BA.debugLine="Sleep(duration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preferencesdialog", "gotoitem"),_duration);
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
RDebugUtils.currentLine=19136519;
 //BA.debugLineNum = 19136519;BA.debugLine="p.SetLayoutAnimated(duration, 10dip, 0, p.Width,";
_p.SetLayoutAnimated(_duration,parent.__c.DipToCurrent((int) (10)),0,_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=19136520;
 //BA.debugLineNum = 19136520;BA.debugLine="Sleep(duration)";
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
RDebugUtils.currentLine=19136522;
 //BA.debugLineNum = 19136522;BA.debugLine="p.SetLayoutAnimated(50, 0, 0, p.Width, p.Height)";
_p.SetLayoutAnimated((int) (50),0,0,_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=19136523;
 //BA.debugLineNum = 19136523;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="lbl.Initialize(EventName)";
_lbl.Initialize(ba,_eventname);
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=19529732;
 //BA.debugLineNum = 19529732;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Private Sub CreateLayouts (PrefItem As B4XPrefItem";
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="p.Width = CustomListView1.sv.ScrollViewContentWid";
_p.setWidth(__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewContentWidth());
RDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="p.Height = 50dip";
_p.setHeight(__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=18808836;
 //BA.debugLineNum = 18808836;BA.debugLine="Select PrefItem.ItemType";
switch (BA.switchObjectToInt(_prefitem.ItemType /*int*/ ,__ref._type_boolean /*int*/ ,__ref._type_multilinetext /*int*/ ,__ref._type_time /*int*/ ,__ref._type_numericrange /*int*/ ,__ref._type_text /*int*/ ,__ref._type_password /*int*/ ,__ref._type_number /*int*/ ,__ref._type_decimalnumber /*int*/ ,__ref._type_date /*int*/ ,__ref._type_options /*int*/ ,__ref._type_shortoptions /*int*/ ,__ref._type_color /*int*/ ,__ref._type_explanation /*int*/ ,__ref._type_separator /*int*/ )) {
case 0: {
RDebugUtils.currentLine=18808838;
 //BA.debugLineNum = 18808838;BA.debugLine="p.LoadLayout(\"booleanitem\")";
_p.LoadLayout("booleanitem",ba);
RDebugUtils.currentLine=18808839;
 //BA.debugLineNum = 18808839;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetV";
__ref._dialog /*b4j.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_p.GetView((int) (0)),_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=18808840;
 //BA.debugLineNum = 18808840;BA.debugLine="p.GetView(0).TextColor = TextColor";
_p.GetView((int) (0)).setTextColor(__ref._textcolor /*int*/ );
 break; }
case 1: {
RDebugUtils.currentLine=18808842;
 //BA.debugLineNum = 18808842;BA.debugLine="p.Height = PrefItem.Extra.Get(\"height\")";
_p.setHeight((double)(BA.ObjectToNumber(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("height")))));
RDebugUtils.currentLine=18808843;
 //BA.debugLineNum = 18808843;BA.debugLine="p.LoadLayout(\"textitemmulti\")";
_p.LoadLayout("textitemmulti",ba);
RDebugUtils.currentLine=18808844;
 //BA.debugLineNum = 18808844;BA.debugLine="Dim ft As B4XFloatTextField = p.GetView(0).Tag";
_ft = (b4j.example.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=18808845;
 //BA.debugLineNum = 18808845;BA.debugLine="ft.HintText = PrefItem.Title";
_ft._hinttext /*String*/  = BA.ObjectToString(_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=18808846;
 //BA.debugLineNum = 18808846;BA.debugLine="ft.HintFont = DefaultHintFont";
_ft._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._defaulthintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=18808847;
 //BA.debugLineNum = 18808847;BA.debugLine="ft.LargeLabelTextSize = DefaultHintLargeSize";
_ft._largelabeltextsize /*float*/  = (float) (__ref._defaulthintlargesize /*int*/ );
RDebugUtils.currentLine=18808848;
 //BA.debugLineNum = 18808848;BA.debugLine="ft.Update";
_ft._update /*String*/ (null);
 break; }
case 2: {
RDebugUtils.currentLine=18808850;
 //BA.debugLineNum = 18808850;BA.debugLine="CreateTimeItem(PrefItem, p)";
__ref._createtimeitem /*String*/ (null,_prefitem,_p);
 break; }
case 3: {
RDebugUtils.currentLine=18808852;
 //BA.debugLineNum = 18808852;BA.debugLine="CreateNumericRangeItem(PrefItem, p)";
__ref._createnumericrangeitem /*String*/ (null,_prefitem,_p);
 break; }
case 4: 
case 5: 
case 6: 
case 7: {
RDebugUtils.currentLine=18808854;
 //BA.debugLineNum = 18808854;BA.debugLine="p.Height = 60dip";
_p.setHeight(__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=18808855;
 //BA.debugLineNum = 18808855;BA.debugLine="If PrefItem.ItemType = TYPE_PASSWORD Then";
if (_prefitem.ItemType /*int*/ ==__ref._type_password /*int*/ ) { 
RDebugUtils.currentLine=18808856;
 //BA.debugLineNum = 18808856;BA.debugLine="p.LoadLayout(\"passworditem\")";
_p.LoadLayout("passworditem",ba);
 }else {
RDebugUtils.currentLine=18808858;
 //BA.debugLineNum = 18808858;BA.debugLine="p.LoadLayout(\"textitem\")";
_p.LoadLayout("textitem",ba);
RDebugUtils.currentLine=18808859;
 //BA.debugLineNum = 18808859;BA.debugLine="Dim ft As B4XFloatTextField = p.GetView(0).Tag";
_ft = (b4j.example.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=18808860;
 //BA.debugLineNum = 18808860;BA.debugLine="If PrefItem.ItemType = TYPE_NUMBER Then";
if (_prefitem.ItemType /*int*/ ==__ref._type_number /*int*/ ) { 
 }else 
{RDebugUtils.currentLine=18808868;
 //BA.debugLineNum = 18808868;BA.debugLine="Else If PrefItem.ItemType = TYPE_DECIMALNUMBER";
if (_prefitem.ItemType /*int*/ ==__ref._type_decimalnumber /*int*/ ) { 
 }}
;
 };
RDebugUtils.currentLine=18808879;
 //BA.debugLineNum = 18808879;BA.debugLine="Dim ft As B4XFloatTextField = p.GetView(0).Tag";
_ft = (b4j.example.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=18808880;
 //BA.debugLineNum = 18808880;BA.debugLine="ft.HintText = PrefItem.Title";
_ft._hinttext /*String*/  = BA.ObjectToString(_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=18808881;
 //BA.debugLineNum = 18808881;BA.debugLine="ft.HintFont = DefaultHintFont";
_ft._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._defaulthintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=18808882;
 //BA.debugLineNum = 18808882;BA.debugLine="ft.LargeLabelTextSize = DefaultHintLargeSize";
_ft._largelabeltextsize /*float*/  = (float) (__ref._defaulthintlargesize /*int*/ );
RDebugUtils.currentLine=18808883;
 //BA.debugLineNum = 18808883;BA.debugLine="ft.Update";
_ft._update /*String*/ (null);
 break; }
case 8: {
RDebugUtils.currentLine=18808885;
 //BA.debugLineNum = 18808885;BA.debugLine="TwoLabelsLayout(\"lblDate\", p, PrefItem)";
__ref._twolabelslayout /*String*/ (null,"lblDate",_p,_prefitem);
 break; }
case 9: {
RDebugUtils.currentLine=18808887;
 //BA.debugLineNum = 18808887;BA.debugLine="TwoLabelsLayout(\"lblOptions\", p, PrefItem)";
__ref._twolabelslayout /*String*/ (null,"lblOptions",_p,_prefitem);
 break; }
case 10: {
RDebugUtils.currentLine=18808889;
 //BA.debugLineNum = 18808889;BA.debugLine="p.LoadLayout(\"shortoptions\")";
_p.LoadLayout("shortoptions",ba);
RDebugUtils.currentLine=18808890;
 //BA.debugLineNum = 18808890;BA.debugLine="p.GetView(0).TextColor = TextColor";
_p.GetView((int) (0)).setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=18808891;
 //BA.debugLineNum = 18808891;BA.debugLine="Dim original As List = PrefItem.Extra.Get(\"opti";
_original = new anywheresoftware.b4a.objects.collections.List();
_original = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("options"))));
RDebugUtils.currentLine=18808911;
 //BA.debugLineNum = 18808911;BA.debugLine="B4XComboBox1.SetItems(original)";
__ref._b4xcombobox1 /*b4j.example.b4xcombobox*/ ._setitems /*String*/ (null,_original);
RDebugUtils.currentLine=18808913;
 //BA.debugLineNum = 18808913;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetV";
__ref._dialog /*b4j.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_p.GetView((int) (0)),_prefitem.Title /*Object*/ );
 break; }
case 11: {
RDebugUtils.currentLine=18808915;
 //BA.debugLineNum = 18808915;BA.debugLine="p.Height = 60dip";
_p.setHeight(__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=18808916;
 //BA.debugLineNum = 18808916;BA.debugLine="p.LoadLayout(\"coloritem\")";
_p.LoadLayout("coloritem",ba);
RDebugUtils.currentLine=18808917;
 //BA.debugLineNum = 18808917;BA.debugLine="Dim tf As B4XFloatTextField = p.GetView(0).Tag";
_tf = (b4j.example.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=18808918;
 //BA.debugLineNum = 18808918;BA.debugLine="tf.HintFont = DefaultHintFont";
_tf._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._defaulthintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=18808919;
 //BA.debugLineNum = 18808919;BA.debugLine="tf.LargeLabelTextSize = DefaultHintLargeSize";
_tf._largelabeltextsize /*float*/  = (float) (__ref._defaulthintlargesize /*int*/ );
RDebugUtils.currentLine=18808920;
 //BA.debugLineNum = 18808920;BA.debugLine="tf.HintText = PrefItem.Title";
_tf._hinttext /*String*/  = BA.ObjectToString(_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=18808921;
 //BA.debugLineNum = 18808921;BA.debugLine="tf.Update";
_tf._update /*String*/ (null);
 break; }
case 12: {
RDebugUtils.currentLine=18808927;
 //BA.debugLineNum = 18808927;BA.debugLine="TwoLabelsLayout(\"lblExplanation\", p, PrefItem)";
__ref._twolabelslayout /*String*/ (null,"lblExplanation",_p,_prefitem);
 break; }
case 13: {
RDebugUtils.currentLine=18808929;
 //BA.debugLineNum = 18808929;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=18808930;
 //BA.debugLineNum = 18808930;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=18808931;
 //BA.debugLineNum = 18808931;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=18808932;
 //BA.debugLineNum = 18808932;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=18808933;
 //BA.debugLineNum = 18808933;BA.debugLine="xlbl.TextColor = SeparatorTextColor";
_xlbl.setTextColor(__ref._separatortextcolor /*int*/ );
RDebugUtils.currentLine=18808934;
 //BA.debugLineNum = 18808934;BA.debugLine="xlbl.Font = xui.CreateDefaultBoldFont(14)";
_xlbl.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (14)));
RDebugUtils.currentLine=18808935;
 //BA.debugLineNum = 18808935;BA.debugLine="xlbl.Color = SeparatorBackgroundColor";
_xlbl.setColor(__ref._separatorbackgroundcolor /*int*/ );
RDebugUtils.currentLine=18808936;
 //BA.debugLineNum = 18808936;BA.debugLine="p.Height = 30dip";
_p.setHeight(__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=18808937;
 //BA.debugLineNum = 18808937;BA.debugLine="p.AddView(xlbl, 0, 0, p.Width, p.Height)";
_p.AddView((javafx.scene.Node)(_xlbl.getObject()),0,0,_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=18808938;
 //BA.debugLineNum = 18808938;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(xlbl,";
__ref._dialog /*b4j.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_xlbl,_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=18808939;
 //BA.debugLineNum = 18808939;BA.debugLine="PrefItem.Required = False";
_prefitem.Required /*boolean*/  = __c.False;
 break; }
}
;
RDebugUtils.currentLine=18808941;
 //BA.debugLineNum = 18808941;BA.debugLine="If PrefItem.Required Then";
if (_prefitem.Required /*boolean*/ ) { 
RDebugUtils.currentLine=18808942;
 //BA.debugLineNum = 18808942;BA.debugLine="Dim rlbl As Label";
_rlbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=18808943;
 //BA.debugLineNum = 18808943;BA.debugLine="rlbl.Initialize(\"\")";
_rlbl.Initialize(ba,"");
RDebugUtils.currentLine=18808944;
 //BA.debugLineNum = 18808944;BA.debugLine="Dim xlbl As B4XView = rlbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_rlbl.getObject()));
RDebugUtils.currentLine=18808945;
 //BA.debugLineNum = 18808945;BA.debugLine="xlbl.Text = \"*\"";
_xlbl.setText("*");
RDebugUtils.currentLine=18808946;
 //BA.debugLineNum = 18808946;BA.debugLine="xlbl.TextColor = xui.Color_Red";
_xlbl.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=18808947;
 //BA.debugLineNum = 18808947;BA.debugLine="xlbl.TextSize = 11";
_xlbl.setTextSize(11);
RDebugUtils.currentLine=18808948;
 //BA.debugLineNum = 18808948;BA.debugLine="xlbl.SetTextAlignment(\"TOP\", \"LEFT\")";
_xlbl.SetTextAlignment("TOP","LEFT");
RDebugUtils.currentLine=18808949;
 //BA.debugLineNum = 18808949;BA.debugLine="p.AddView(xlbl, 01dip, 0dip, 10dip, 10dip)";
_p.AddView((javafx.scene.Node)(_xlbl.getObject()),__c.DipToCurrent((int) (01)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)));
 };
RDebugUtils.currentLine=18808951;
 //BA.debugLineNum = 18808951;BA.debugLine="p.Color = ItemsBackgroundColor";
_p.setColor(__ref._itemsbackgroundcolor /*int*/ );
RDebugUtils.currentLine=18808952;
 //BA.debugLineNum = 18808952;BA.debugLine="If mTheme <> THEME_DARK Then";
if (__ref._mtheme /*int*/ !=__ref._theme_dark /*int*/ ) { 
RDebugUtils.currentLine=18808953;
 //BA.debugLineNum = 18808953;BA.debugLine="If p.GetView(0).Tag Is B4XFloatTextField Then";
if (_p.GetView((int) (0)).getTag() instanceof b4j.example.b4xfloattextfield) { 
RDebugUtils.currentLine=18808954;
 //BA.debugLineNum = 18808954;BA.debugLine="Dim tf As B4XFloatTextField = p.GetView(0).Tag";
_tf = (b4j.example.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=18808955;
 //BA.debugLineNum = 18808955;BA.debugLine="tf.TextField.TextColor = TextColor";
_tf._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=18808956;
 //BA.debugLineNum = 18808956;BA.debugLine="tf.NonFocusedHintColor = TextColor";
_tf._nonfocusedhintcolor /*int*/  = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=18808957;
 //BA.debugLineNum = 18808957;BA.debugLine="tf.Update";
_tf._update /*String*/ (null);
RDebugUtils.currentLine=18808958;
 //BA.debugLineNum = 18808958;BA.debugLine="If tf.lblClear.IsInitialized Then tf.lblClear.T";
if (_tf._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
_tf._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._textcolor /*int*/ );};
RDebugUtils.currentLine=18808959;
 //BA.debugLineNum = 18808959;BA.debugLine="If tf.lblV.IsInitialized Then tf.lblV.TextColor";
if (_tf._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
_tf._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._textcolor /*int*/ );};
 };
 };
RDebugUtils.currentLine=18808962;
 //BA.debugLineNum = 18808962;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=18808963;
 //BA.debugLineNum = 18808963;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Private Sub CreateTimeItem (PrefItem As B4XPrefIte";
RDebugUtils.currentLine=18939905;
 //BA.debugLineNum = 18939905;BA.debugLine="p.Height = 60dip";
_p.setHeight(__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="Dim is24 As Boolean = PrefItem.Extra.GetDefault(\"";
_is24 = BA.ObjectToBoolean(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("24"),(Object)(__c.False)));
RDebugUtils.currentLine=18939907;
 //BA.debugLineNum = 18939907;BA.debugLine="If is24 Then";
if (_is24) { 
RDebugUtils.currentLine=18939908;
 //BA.debugLineNum = 18939908;BA.debugLine="p.LoadLayout(\"timeitem24\")";
_p.LoadLayout("timeitem24",ba);
 }else {
RDebugUtils.currentLine=18939910;
 //BA.debugLineNum = 18939910;BA.debugLine="p.LoadLayout(\"timeitem\")";
_p.LoadLayout("timeitem",ba);
 };
RDebugUtils.currentLine=18939912;
 //BA.debugLineNum = 18939912;BA.debugLine="Dim pmHours As B4XPlusMinus = p.GetView(0).Tag";
_pmhours = (b4j.example.b4xplusminus)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=18939913;
 //BA.debugLineNum = 18939913;BA.debugLine="pmHours.RapidPeriod2 = 100";
_pmhours._rapidperiod2 /*int*/  = (int) (100);
RDebugUtils.currentLine=18939914;
 //BA.debugLineNum = 18939914;BA.debugLine="Dim pmMinutes As B4XPlusMinus = p.GetView(1).Tag";
_pmminutes = (b4j.example.b4xplusminus)(_p.GetView((int) (1)).getTag());
RDebugUtils.currentLine=18939915;
 //BA.debugLineNum = 18939915;BA.debugLine="Dim pmAMPM As B4XPlusMinus = p.GetView(2).Tag";
_pmampm = (b4j.example.b4xplusminus)(_p.GetView((int) (2)).getTag());
RDebugUtils.currentLine=18939916;
 //BA.debugLineNum = 18939916;BA.debugLine="If xui.IsB4J = False Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()==__c.False) { 
RDebugUtils.currentLine=18939917;
 //BA.debugLineNum = 18939917;BA.debugLine="Dim clr As Int = CustomListView1.sv.ScrollViewIn";
_clr = __ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewInnerPanel().getColor();
RDebugUtils.currentLine=18939918;
 //BA.debugLineNum = 18939918;BA.debugLine="pmHours.mBase.SetColorAndBorder(xui.Color_Transp";
_pmhours._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (1)),_clr,0);
RDebugUtils.currentLine=18939919;
 //BA.debugLineNum = 18939919;BA.debugLine="pmMinutes.mBase.SetColorAndBorder(xui.Color_Tran";
_pmminutes._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (1)),_clr,0);
RDebugUtils.currentLine=18939920;
 //BA.debugLineNum = 18939920;BA.debugLine="pmAMPM.mBase.SetColorAndBorder(xui.Color_Transpa";
_pmampm._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (1)),_clr,0);
 };
RDebugUtils.currentLine=18939923;
 //BA.debugLineNum = 18939923;BA.debugLine="If is24 Then";
if (_is24) { 
RDebugUtils.currentLine=18939924;
 //BA.debugLineNum = 18939924;BA.debugLine="pmHours.SetNumericRange(0, 23, 1)";
_pmhours._setnumericrange /*String*/ (null,0,23,1);
 }else {
RDebugUtils.currentLine=18939926;
 //BA.debugLineNum = 18939926;BA.debugLine="pmHours.SetNumericRange(1, 12, 1)";
_pmhours._setnumericrange /*String*/ (null,1,12,1);
 };
RDebugUtils.currentLine=18939928;
 //BA.debugLineNum = 18939928;BA.debugLine="pmMinutes.SetNumericRange(0, 59, 1)";
_pmminutes._setnumericrange /*String*/ (null,0,59,1);
RDebugUtils.currentLine=18939929;
 //BA.debugLineNum = 18939929;BA.debugLine="pmMinutes.Formatter.GetDefaultFormat.MinimumInteg";
_pmminutes._formatter /*b4j.example.b4xformatter*/ ._getdefaultformat /*b4j.example.b4xformatter._b4xformatdata*/ (null).MinimumIntegers /*int*/  = (int) (2);
RDebugUtils.currentLine=18939931;
 //BA.debugLineNum = 18939931;BA.debugLine="pmAMPM.SetStringItems(Array(\"am\", \"pm\"))";
_pmampm._setstringitems /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("am"),(Object)("pm")}));
RDebugUtils.currentLine=18939932;
 //BA.debugLineNum = 18939932;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetVie";
__ref._dialog /*b4j.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_p.GetView((int) (3)),_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=18939933;
 //BA.debugLineNum = 18939933;BA.debugLine="For Each v As B4XView In p.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group27 = _p.GetAllViewsRecursive();
final int groupLen27 = group27.getSize()
;int index27 = 0;
;
for (; index27 < groupLen27;index27++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group27.Get(index27)));
RDebugUtils.currentLine=18939934;
 //BA.debugLineNum = 18939934;BA.debugLine="If v Is Label Then v.TextColor = TextColor";
if (_v.getObjectOrNull() instanceof javafx.scene.control.Label) { 
_v.setTextColor(__ref._textcolor /*int*/ );};
 }
};
RDebugUtils.currentLine=18939936;
 //BA.debugLineNum = 18939936;BA.debugLine="End Sub";
return "";
}
public String  _createnumericrangeitem(b4j.example.preferencesdialog __ref,b4j.example.preferencesdialog._b4xprefitem _prefitem,anywheresoftware.b4a.objects.B4XViewWrapper _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "createnumericrangeitem", true))
	 {return ((String) Debug.delegate(ba, "createnumericrangeitem", new Object[] {_prefitem,_p}));}
b4j.example.b4xplusminus _pm = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Private Sub CreateNumericRangeItem (PrefItem As B4";
RDebugUtils.currentLine=18874369;
 //BA.debugLineNum = 18874369;BA.debugLine="p.LoadLayout(\"numericrange\")";
_p.LoadLayout("numericrange",ba);
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="Dim pm As B4XPlusMinus = p.GetView(0).Tag";
_pm = (b4j.example.b4xplusminus)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=18874371;
 //BA.debugLineNum = 18874371;BA.debugLine="pm.SetNumericRange(PrefItem.Extra.Get(\"start\"), P";
_pm._setnumericrange /*String*/ (null,(double)(BA.ObjectToNumber(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("start")))),(double)(BA.ObjectToNumber(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("end")))),(double)(BA.ObjectToNumber(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("interval")))));
RDebugUtils.currentLine=18874372;
 //BA.debugLineNum = 18874372;BA.debugLine="pm.Formatter.GetDefaultFormat.MaximumFractions =";
_pm._formatter /*b4j.example.b4xformatter*/ ._getdefaultformat /*b4j.example.b4xformatter._b4xformatdata*/ (null).MaximumFractions /*int*/  = (int) (2);
RDebugUtils.currentLine=18874373;
 //BA.debugLineNum = 18874373;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetVie";
__ref._dialog /*b4j.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_p.GetView((int) (1)),_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=18874374;
 //BA.debugLineNum = 18874374;BA.debugLine="For Each v As B4XView In p.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group6 = _p.GetAllViewsRecursive();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group6.Get(index6)));
RDebugUtils.currentLine=18874375;
 //BA.debugLineNum = 18874375;BA.debugLine="If v Is Label Then v.TextColor = TextColor";
if (_v.getObjectOrNull() instanceof javafx.scene.control.Label) { 
_v.setTextColor(__ref._textcolor /*int*/ );};
 }
};
RDebugUtils.currentLine=18874377;
 //BA.debugLineNum = 18874377;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19202048;
 //BA.debugLineNum = 19202048;BA.debugLine="Private Sub TwoLabelsLayout (EventName As String,";
RDebugUtils.currentLine=19202049;
 //BA.debugLineNum = 19202049;BA.debugLine="Dim lblTitle As B4XView = CreateLabel(EventName)";
_lbltitle = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbltitle = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_eventname);
RDebugUtils.currentLine=19202050;
 //BA.debugLineNum = 19202050;BA.debugLine="lblTitle.SetTextAlignment(\"CENTER\", \"LEFT\")";
_lbltitle.SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=19202051;
 //BA.debugLineNum = 19202051;BA.debugLine="lblTitle.TextColor = TextColor";
_lbltitle.setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=19202052;
 //BA.debugLineNum = 19202052;BA.debugLine="Dim fnt As B4XFont = xui.CreateDefaultBoldFont(16";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_fnt = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (16));
RDebugUtils.currentLine=19202053;
 //BA.debugLineNum = 19202053;BA.debugLine="lblTitle.Font = fnt";
_lbltitle.setFont(_fnt);
RDebugUtils.currentLine=19202054;
 //BA.debugLineNum = 19202054;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(lblTitle";
__ref._dialog /*b4j.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_lbltitle,_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=19202055;
 //BA.debugLineNum = 19202055;BA.debugLine="p.AddView(lblTitle, 10dip, 10dip, p.Width - 110di";
_p.AddView((javafx.scene.Node)(_lbltitle.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)),_p.getWidth()-__c.DipToCurrent((int) (110)),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=19202056;
 //BA.debugLineNum = 19202056;BA.debugLine="Dim lblDate As B4XView = CreateLabel(EventName)";
_lbldate = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbldate = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_eventname);
RDebugUtils.currentLine=19202057;
 //BA.debugLineNum = 19202057;BA.debugLine="lblDate.TextColor = TextColor";
_lbldate.setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=19202058;
 //BA.debugLineNum = 19202058;BA.debugLine="lblDate.SetTextAlignment(\"CENTER\", \"RIGHT\")";
_lbldate.SetTextAlignment("CENTER","RIGHT");
RDebugUtils.currentLine=19202059;
 //BA.debugLineNum = 19202059;BA.debugLine="lblDate.Font = fnt";
_lbldate.setFont(_fnt);
RDebugUtils.currentLine=19202060;
 //BA.debugLineNum = 19202060;BA.debugLine="p.AddView(lblDate, p.Width - 108dip, 10dip, 98dip";
_p.AddView((javafx.scene.Node)(_lbldate.getObject()),_p.getWidth()-__c.DipToCurrent((int) (108)),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (98)),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=19202061;
 //BA.debugLineNum = 19202061;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(b4j.example.preferencesdialog __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Private Sub FillData (Data As Map)";
RDebugUtils.currentLine=18481153;
 //BA.debugLineNum = 18481153;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = __ref._customlistview1 /*b4j.example.customlistview*/ ._getrawlistitem(_i);
RDebugUtils.currentLine=18481155;
 //BA.debugLineNum = 18481155;BA.debugLine="If (Item.Value Is B4XPrefItem) = False Then Exit";
if ((_item.Value instanceof b4j.example.preferencesdialog._b4xprefitem)==__c.False) { 
if (true) break;};
RDebugUtils.currentLine=18481156;
 //BA.debugLineNum = 18481156;BA.debugLine="Dim PrefItem As B4XPrefItem = Item.Value";
_prefitem = (b4j.example.preferencesdialog._b4xprefitem)(_item.Value);
RDebugUtils.currentLine=18481157;
 //BA.debugLineNum = 18481157;BA.debugLine="Dim ItemPanel As B4XView = Item.Panel.GetView(0)";
_itempanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_itempanel = _item.Panel.GetView((int) (0));
RDebugUtils.currentLine=18481158;
 //BA.debugLineNum = 18481158;BA.debugLine="Select PrefItem.ItemType";
switch (BA.switchObjectToInt(_prefitem.ItemType /*int*/ ,__ref._type_boolean /*int*/ ,__ref._type_text /*int*/ ,__ref._type_password /*int*/ ,__ref._type_number /*int*/ ,__ref._type_decimalnumber /*int*/ ,__ref._type_multilinetext /*int*/ ,__ref._type_date /*int*/ ,__ref._type_options /*int*/ ,__ref._type_shortoptions /*int*/ ,__ref._type_color /*int*/ ,__ref._type_time /*int*/ ,__ref._type_separator /*int*/ ,__ref._type_explanation /*int*/ ,__ref._type_numericrange /*int*/ )) {
case 0: {
RDebugUtils.currentLine=18481160;
 //BA.debugLineNum = 18481160;BA.debugLine="Dim switch As B4XSwitch = ItemPanel.GetView(1)";
_switch = (b4j.example.b4xswitch)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=18481161;
 //BA.debugLineNum = 18481161;BA.debugLine="switch.Value = GetPrefItemValue(PrefItem, Fals";
_switch._setvalue /*boolean*/ (null,BA.ObjectToBoolean(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(__c.False),_data)));
 break; }
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
RDebugUtils.currentLine=18481163;
 //BA.debugLineNum = 18481163;BA.debugLine="Dim ft As B4XFloatTextField = ItemPanel.GetVie";
_ft = (b4j.example.b4xfloattextfield)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=18481164;
 //BA.debugLineNum = 18481164;BA.debugLine="ft.Text = GetPrefItemValue(PrefItem, \"\", Data)";
_ft._settext /*String*/ (null,BA.ObjectToString(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(""),_data)));
 break; }
case 6: {
RDebugUtils.currentLine=18481166;
 //BA.debugLineNum = 18481166;BA.debugLine="ItemPanel.GetView(1).Text = DateTime.Date(GetP";
_itempanel.GetView((int) (1)).setText(__c.DateTime.Date(BA.ObjectToLongNumber(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(__c.DateTime.getNow()),_data))));
 break; }
case 7: {
RDebugUtils.currentLine=18481168;
 //BA.debugLineNum = 18481168;BA.debugLine="ItemPanel.GetView(1).Text = GetPrefItemValue(P";
_itempanel.GetView((int) (1)).setText(BA.ObjectToString(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(""),_data)));
 break; }
case 8: {
RDebugUtils.currentLine=18481170;
 //BA.debugLineNum = 18481170;BA.debugLine="Dim cmb As B4XComboBox = ItemPanel.GetView(1).";
_cmb = (b4j.example.b4xcombobox)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=18481171;
 //BA.debugLineNum = 18481171;BA.debugLine="Dim options As List = PrefItem.Extra.Get(\"opti";
_options = new anywheresoftware.b4a.objects.collections.List();
_options = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("options"))));
RDebugUtils.currentLine=18481172;
 //BA.debugLineNum = 18481172;BA.debugLine="cmb.SelectedIndex = Max(0, options.IndexOf(Get";
_cmb._setselectedindex /*int*/ (null,(int) (__c.Max(0,_options.IndexOf(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(""),_data)))));
 break; }
case 9: {
RDebugUtils.currentLine=18481174;
 //BA.debugLineNum = 18481174;BA.debugLine="SetLabelColor(ItemPanel.GetView(1), GetPrefIte";
__ref._setlabelcolor /*String*/ (null,_itempanel.GetView((int) (1)),(int)(BA.ObjectToNumber(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red),_data))));
RDebugUtils.currentLine=18481175;
 //BA.debugLineNum = 18481175;BA.debugLine="ItemPanel.GetView(2).Text = \"Pick\"";
_itempanel.GetView((int) (2)).setText("Pick");
 break; }
case 10: {
RDebugUtils.currentLine=18481177;
 //BA.debugLineNum = 18481177;BA.debugLine="Dim pmHours As B4XPlusMinus = ItemPanel.GetVie";
_pmhours = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=18481178;
 //BA.debugLineNum = 18481178;BA.debugLine="Dim pmMinutes As B4XPlusMinus = ItemPanel.GetV";
_pmminutes = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=18481179;
 //BA.debugLineNum = 18481179;BA.debugLine="Dim pmAMPM As B4XPlusMinus = ItemPanel.GetView";
_pmampm = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (2)).getTag());
RDebugUtils.currentLine=18481180;
 //BA.debugLineNum = 18481180;BA.debugLine="Dim p As Period";
_p = new b4j.example.dateutils._period();
RDebugUtils.currentLine=18481181;
 //BA.debugLineNum = 18481181;BA.debugLine="p = GetPrefItemValue(PrefItem, p, Data)";
_p = (b4j.example.dateutils._period)(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(_p),_data));
RDebugUtils.currentLine=18481182;
 //BA.debugLineNum = 18481182;BA.debugLine="Dim hour As Int = p.Hours";
_hour = _p.Hours;
RDebugUtils.currentLine=18481183;
 //BA.debugLineNum = 18481183;BA.debugLine="Dim m As String";
_m = "";
RDebugUtils.currentLine=18481184;
 //BA.debugLineNum = 18481184;BA.debugLine="If PrefItem.Extra.GetDefault(\"24\", False) = Fa";
if ((_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("24"),(Object)(__c.False))).equals((Object)(__c.False))) { 
RDebugUtils.currentLine=18481185;
 //BA.debugLineNum = 18481185;BA.debugLine="If hour <= 11 Then";
if (_hour<=11) { 
RDebugUtils.currentLine=18481186;
 //BA.debugLineNum = 18481186;BA.debugLine="m = \"am\"";
_m = "am";
 }else {
RDebugUtils.currentLine=18481188;
 //BA.debugLineNum = 18481188;BA.debugLine="m = \"pm\"";
_m = "pm";
RDebugUtils.currentLine=18481189;
 //BA.debugLineNum = 18481189;BA.debugLine="hour = hour - 12";
_hour = (int) (_hour-12);
 };
RDebugUtils.currentLine=18481191;
 //BA.debugLineNum = 18481191;BA.debugLine="If hour = 0 Then hour = 12";
if (_hour==0) { 
_hour = (int) (12);};
 };
RDebugUtils.currentLine=18481193;
 //BA.debugLineNum = 18481193;BA.debugLine="pmHours.SelectedValue = hour";
_pmhours._setselectedvalue /*Object*/ (null,(Object)(_hour));
RDebugUtils.currentLine=18481194;
 //BA.debugLineNum = 18481194;BA.debugLine="pmMinutes.SelectedValue = p.Minutes";
_pmminutes._setselectedvalue /*Object*/ (null,(Object)(_p.Minutes));
RDebugUtils.currentLine=18481195;
 //BA.debugLineNum = 18481195;BA.debugLine="pmAMPM.SelectedValue = m";
_pmampm._setselectedvalue /*Object*/ (null,(Object)(_m));
 break; }
case 11: 
case 12: {
 break; }
case 13: {
RDebugUtils.currentLine=18481198;
 //BA.debugLineNum = 18481198;BA.debugLine="Dim pm As B4XPlusMinus = ItemPanel.GetView(0).";
_pm = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=18481199;
 //BA.debugLineNum = 18481199;BA.debugLine="pm.SelectedValue = GetPrefItemValue(PrefItem,";
_pm._setselectedvalue /*Object*/ (null,__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(0),_data));
 break; }
default: {
RDebugUtils.currentLine=18481201;
 //BA.debugLineNum = 18481201;BA.debugLine="Log(\"Unknown type: \" & PrefItem.ItemType)";
__c.LogImpl("918481201","Unknown type: "+BA.NumberToString(_prefitem.ItemType /*int*/ ),0);
 break; }
}
;
 }
};
RDebugUtils.currentLine=18481204;
 //BA.debugLineNum = 18481204;BA.debugLine="End Sub";
return "";
}
public Object  _getprefitemvalue(b4j.example.preferencesdialog __ref,b4j.example.preferencesdialog._b4xprefitem _prefitem,Object _defaultvalue,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "getprefitemvalue", true))
	 {return ((Object) Debug.delegate(ba, "getprefitemvalue", new Object[] {_prefitem,_defaultvalue,_data}));}
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Private Sub GetPrefItemValue (PrefItem As B4XPrefI";
RDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="Return Data.GetDefault(PrefItem.Key, DefaultValue";
if (true) return _data.GetDefault((Object)(_prefitem.Key /*String*/ ),_defaultvalue);
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="End Sub";
return null;
}
public String  _setlabelcolor(b4j.example.preferencesdialog __ref,anywheresoftware.b4a.objects.B4XViewWrapper _lbl,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "setlabelcolor", true))
	 {return ((String) Debug.delegate(ba, "setlabelcolor", new Object[] {_lbl,_clr}));}
b4j.example.b4xfloattextfield _ft = null;
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Private Sub SetLabelColor(lbl As B4XView, clr As I";
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="Dim ft As B4XFloatTextField = lbl.Parent.GetView(";
_ft = (b4j.example.b4xfloattextfield)(_lbl.getParent().GetView((int) (0)).getTag());
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="ft.Text = ColorToHex(clr)";
_ft._settext /*String*/ (null,__ref._colortohex /*String*/ (null,_clr));
RDebugUtils.currentLine=18546691;
 //BA.debugLineNum = 18546691;BA.debugLine="lbl.SetColorAndBorder(clr, 1dip, Dialog.BorderCol";
_lbl.SetColorAndBorder(_clr,__c.DipToCurrent((int) (1)),__ref._dialog /*b4j.example.b4xdialog*/ ._bordercolor /*int*/ ,__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=18546692;
 //BA.debugLineNum = 18546692;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.example.preferencesdialog __ref,b4j.example.b4xdialog _dialog1) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog1}));}
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Public Sub GetPanel (Dialog1 As B4XDialog) As B4XV";
RDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="End Sub";
return null;
}
public b4j.example.preferencesdialog._b4xprefitem  _getprefitem(b4j.example.preferencesdialog __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "getprefitem", true))
	 {return ((b4j.example.preferencesdialog._b4xprefitem) Debug.delegate(ba, "getprefitem", new Object[] {_key}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Public Sub GetPrefItem (Key As String) As B4XPrefI";
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="For Each pi As B4XPrefItem In PrefItems";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_pi = (b4j.example.preferencesdialog._b4xprefitem)(group1.Get(index1));
RDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="If pi.Key = Key Then Return pi";
if ((_pi.Key /*String*/ ).equals(_key)) { 
if (true) return _pi;};
 }
};
RDebugUtils.currentLine=19726340;
 //BA.debugLineNum = 19726340;BA.debugLine="Return Null";
if (true) return (b4j.example.preferencesdialog._b4xprefitem)(__c.Null);
RDebugUtils.currentLine=19726341;
 //BA.debugLineNum = 19726341;BA.debugLine="End Sub";
return null;
}
public int  _gettheme(b4j.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "gettheme", true))
	 {return ((Integer) Debug.delegate(ba, "gettheme", null));}
RDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Public Sub getTheme As Int";
RDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="Return mTheme";
if (true) return __ref._mtheme /*int*/ ;
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="End Sub";
return 0;
}
public Object  _gettitle(b4j.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "gettitle", true))
	 {return ((Object) Debug.delegate(ba, "gettitle", null));}
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Public Sub getTitle As Object";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="Return mTitle";
if (true) return __ref._mtitle /*Object*/ ;
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Private Sub HexToColor(Hex As String) As Int()";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="Hex = Hex.ToLowerCase";
_hex = _hex.toLowerCase();
RDebugUtils.currentLine=20119555;
 //BA.debugLineNum = 20119555;BA.debugLine="If Hex.StartsWith(\"#\") Then";
if (_hex.startsWith("#")) { 
RDebugUtils.currentLine=20119556;
 //BA.debugLineNum = 20119556;BA.debugLine="Hex = Hex.SubString(1)";
_hex = _hex.substring((int) (1));
 }else 
{RDebugUtils.currentLine=20119557;
 //BA.debugLineNum = 20119557;BA.debugLine="Else If Hex.StartsWith(\"0x\") Then";
if (_hex.startsWith("0x")) { 
RDebugUtils.currentLine=20119558;
 //BA.debugLineNum = 20119558;BA.debugLine="Hex = Hex.SubString(2)";
_hex = _hex.substring((int) (2));
 }}
;
RDebugUtils.currentLine=20119560;
 //BA.debugLineNum = 20119560;BA.debugLine="If Hex.Length = 6 Then Hex = \"ff\" & Hex";
if (_hex.length()==6) { 
_hex = "ff"+_hex;};
RDebugUtils.currentLine=20119562;
 //BA.debugLineNum = 20119562;BA.debugLine="Dim res() As Int";
_res = new int[(int) (0)];
;
RDebugUtils.currentLine=20119563;
 //BA.debugLineNum = 20119563;BA.debugLine="If Regex.IsMatch(\"[0-9a-f]{8}\", Hex) = False Then";
if (__c.Regex.IsMatch("[0-9a-f]{8}",_hex)==__c.False) { 
if (true) return _res;};
RDebugUtils.currentLine=20119564;
 //BA.debugLineNum = 20119564;BA.debugLine="Dim ints() As Int = bc.IntsFromBytes(bc.HexToByte";
_ints = _bc.IntsFromBytes(_bc.HexToBytes(_hex));
RDebugUtils.currentLine=20119565;
 //BA.debugLineNum = 20119565;BA.debugLine="Return ints";
if (true) return _ints;
RDebugUtils.currentLine=20119566;
 //BA.debugLineNum = 20119566;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.preferencesdialog __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent,Object _title,int _width,int _height) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent,_title,_width,_height}));}
anywheresoftware.b4j.objects.ScrollPaneWrapper _sv = null;
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Public Sub Initialize (Parent As B4XView, Title As";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="Dialog.Initialize(Parent)";
__ref._dialog /*b4j.example.b4xdialog*/ ._initialize /*String*/ (null,ba,_parent);
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="Dialog.VisibleAnimationDuration = 0";
__ref._dialog /*b4j.example.b4xdialog*/ ._visibleanimationduration /*int*/  = (int) (0);
RDebugUtils.currentLine=16711683;
 //BA.debugLineNum = 16711683;BA.debugLine="mTitle = Title";
__ref._mtitle /*Object*/  = _title;
RDebugUtils.currentLine=16711684;
 //BA.debugLineNum = 16711684;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=16711685;
 //BA.debugLineNum = 16711685;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=16711686;
 //BA.debugLineNum = 16711686;BA.debugLine="mBase.LoadLayout(\"ListTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("ListTemplate",ba);
RDebugUtils.currentLine=16711687;
 //BA.debugLineNum = 16711687;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=16711688;
 //BA.debugLineNum = 16711688;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=16711689;
 //BA.debugLineNum = 16711689;BA.debugLine="CustomListView1.PressedColor = xui.Color_Transpar";
__ref._customlistview1 /*b4j.example.customlistview*/ ._pressedcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=16711690;
 //BA.debugLineNum = 16711690;BA.debugLine="PrefItems.Initialize";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=16711691;
 //BA.debugLineNum = 16711691;BA.debugLine="SearchTemplate.Initialize";
__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=16711692;
 //BA.debugLineNum = 16711692;BA.debugLine="DateTemplate.Initialize";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=16711693;
 //BA.debugLineNum = 16711693;BA.debugLine="LongTextTemplate.Initialize";
__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=16711694;
 //BA.debugLineNum = 16711694;BA.debugLine="LongTextTemplate.CustomListView1.PressedColor = 0";
__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ ._customlistview1 /*b4j.example.customlistview*/ ._pressedcolor = (int) (0);
RDebugUtils.currentLine=16711695;
 //BA.debugLineNum = 16711695;BA.debugLine="Dialog.OverlayColor = xui.Color_Transparent";
__ref._dialog /*b4j.example.b4xdialog*/ ._overlaycolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=16711697;
 //BA.debugLineNum = 16711697;BA.debugLine="Dim sv As ScrollPane = CustomListView1.sv";
_sv = new anywheresoftware.b4j.objects.ScrollPaneWrapper();
_sv = (anywheresoftware.b4j.objects.ScrollPaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ScrollPaneWrapper(), (javafx.scene.control.ScrollPane)(__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getObject()));
RDebugUtils.currentLine=16711698;
 //BA.debugLineNum = 16711698;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
_sv.getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=16711699;
 //BA.debugLineNum = 16711699;BA.debugLine="sv.InnerNode.StyleClasses.Add(\"b4xdialog\")";
_sv.getInnerNode().getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=16711704;
 //BA.debugLineNum = 16711704;BA.debugLine="DefaultHintFont = xui.CreateDefaultBoldFont(16)";
__ref._defaulthintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (16));
RDebugUtils.currentLine=16711706;
 //BA.debugLineNum = 16711706;BA.debugLine="DefaultHintLargeSize = 16";
__ref._defaulthintlargesize /*int*/  = (int) (16);
RDebugUtils.currentLine=16711707;
 //BA.debugLineNum = 16711707;BA.debugLine="setTheme(THEME_DARK)";
__ref._settheme /*String*/ (null,__ref._theme_dark /*int*/ );
RDebugUtils.currentLine=16711709;
 //BA.debugLineNum = 16711709;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Public Sub setTheme (t As Int)";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="If t <> mTheme Then";
if (_t!=__ref._mtheme /*int*/ ) { 
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="mTheme = t";
__ref._mtheme /*int*/  = _t;
RDebugUtils.currentLine=18743299;
 //BA.debugLineNum = 18743299;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=18743300;
 //BA.debugLineNum = 18743300;BA.debugLine="Dim DividerColor As Int";
_dividercolor = 0;
RDebugUtils.currentLine=18743301;
 //BA.debugLineNum = 18743301;BA.debugLine="Select mTheme";
switch (BA.switchObjectToInt(__ref._mtheme /*int*/ ,__ref._theme_dark /*int*/ ,__ref._theme_light /*int*/ )) {
case 0: {
RDebugUtils.currentLine=18743303;
 //BA.debugLineNum = 18743303;BA.debugLine="ItemsBackgroundColor = 0xFF626262";
__ref._itemsbackgroundcolor /*int*/  = ((int)0xff626262);
RDebugUtils.currentLine=18743304;
 //BA.debugLineNum = 18743304;BA.debugLine="SeparatorBackgroundColor = 0xFFC0C0C0";
__ref._separatorbackgroundcolor /*int*/  = ((int)0xffc0c0c0);
RDebugUtils.currentLine=18743305;
 //BA.debugLineNum = 18743305;BA.debugLine="SeparatorTextColor = xui.Color_Black";
__ref._separatortextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=18743306;
 //BA.debugLineNum = 18743306;BA.debugLine="TextColor = xui.Color_White";
__ref._textcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=18743307;
 //BA.debugLineNum = 18743307;BA.debugLine="DividerColor = 0xFF464646";
_dividercolor = ((int)0xff464646);
RDebugUtils.currentLine=18743308;
 //BA.debugLineNum = 18743308;BA.debugLine="Dialog.BackgroundColor = 0xFF555555";
__ref._dialog /*b4j.example.b4xdialog*/ ._backgroundcolor /*int*/  = ((int)0xff555555);
RDebugUtils.currentLine=18743309;
 //BA.debugLineNum = 18743309;BA.debugLine="Dialog.ButtonsColor = 0xFF555555";
__ref._dialog /*b4j.example.b4xdialog*/ ._buttonscolor /*int*/  = ((int)0xff555555);
RDebugUtils.currentLine=18743310;
 //BA.debugLineNum = 18743310;BA.debugLine="Dialog.BorderColor = 0xff000000";
__ref._dialog /*b4j.example.b4xdialog*/ ._bordercolor /*int*/  = ((int)0xff000000);
RDebugUtils.currentLine=18743311;
 //BA.debugLineNum = 18743311;BA.debugLine="Dialog.ButtonsTextColor = 0xFF89D5FF";
__ref._dialog /*b4j.example.b4xdialog*/ ._buttonstextcolor /*int*/  = ((int)0xff89d5ff);
RDebugUtils.currentLine=18743312;
 //BA.debugLineNum = 18743312;BA.debugLine="DateTemplate.DaysInWeekColor = xui.Color_Gray";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._daysinweekcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray;
RDebugUtils.currentLine=18743313;
 //BA.debugLineNum = 18743313;BA.debugLine="DateTemplate.SelectedColor = 0xFF0BA29B";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._selectedcolor /*int*/  = ((int)0xff0ba29b);
 break; }
case 1: {
RDebugUtils.currentLine=18743315;
 //BA.debugLineNum = 18743315;BA.debugLine="ItemsBackgroundColor = xui.Color_White";
__ref._itemsbackgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=18743316;
 //BA.debugLineNum = 18743316;BA.debugLine="SeparatorBackgroundColor = 0xFFD0D0D0";
__ref._separatorbackgroundcolor /*int*/  = ((int)0xffd0d0d0);
RDebugUtils.currentLine=18743317;
 //BA.debugLineNum = 18743317;BA.debugLine="SeparatorTextColor = 0xFF4E4F50";
__ref._separatortextcolor /*int*/  = ((int)0xff4e4f50);
RDebugUtils.currentLine=18743318;
 //BA.debugLineNum = 18743318;BA.debugLine="TextColor = 0xFF5B5B5B";
__ref._textcolor /*int*/  = ((int)0xff5b5b5b);
RDebugUtils.currentLine=18743319;
 //BA.debugLineNum = 18743319;BA.debugLine="DividerColor = 0xFFDFDFDF";
_dividercolor = ((int)0xffdfdfdf);
RDebugUtils.currentLine=18743320;
 //BA.debugLineNum = 18743320;BA.debugLine="Dialog.BackgroundColor = xui.Color_White";
__ref._dialog /*b4j.example.b4xdialog*/ ._backgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=18743321;
 //BA.debugLineNum = 18743321;BA.debugLine="Dialog.ButtonsColor = xui.Color_White";
__ref._dialog /*b4j.example.b4xdialog*/ ._buttonscolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=18743322;
 //BA.debugLineNum = 18743322;BA.debugLine="Dialog.BorderColor = xui.Color_Gray";
__ref._dialog /*b4j.example.b4xdialog*/ ._bordercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray;
RDebugUtils.currentLine=18743323;
 //BA.debugLineNum = 18743323;BA.debugLine="Dialog.ButtonsTextColor = 0xFF007DC3";
__ref._dialog /*b4j.example.b4xdialog*/ ._buttonstextcolor /*int*/  = ((int)0xff007dc3);
RDebugUtils.currentLine=18743324;
 //BA.debugLineNum = 18743324;BA.debugLine="DateTemplate.DaysInWeekColor = xui.Color_Black";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._daysinweekcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=18743325;
 //BA.debugLineNum = 18743325;BA.debugLine="DateTemplate.SelectedColor = 0xFF39D7CE";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._selectedcolor /*int*/  = ((int)0xff39d7ce);
 break; }
}
;
RDebugUtils.currentLine=18743328;
 //BA.debugLineNum = 18743328;BA.debugLine="SearchTemplate.SearchField.TextField.TextColor =";
__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._searchfield /*b4j.example.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=18743329;
 //BA.debugLineNum = 18743329;BA.debugLine="SearchTemplate.SearchField.NonFocusedHintColor =";
__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._searchfield /*b4j.example.b4xfloattextfield*/ ._nonfocusedhintcolor /*int*/  = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=18743330;
 //BA.debugLineNum = 18743330;BA.debugLine="Dialog.BorderCornersRadius = 0";
__ref._dialog /*b4j.example.b4xdialog*/ ._bordercornersradius /*int*/  = (int) (0);
RDebugUtils.currentLine=18743331;
 //BA.debugLineNum = 18743331;BA.debugLine="Dialog.BorderWidth = 1dip";
__ref._dialog /*b4j.example.b4xdialog*/ ._borderwidth /*int*/  = __c.DipToCurrent((int) (1));
RDebugUtils.currentLine=18743332;
 //BA.debugLineNum = 18743332;BA.debugLine="DateTemplate.HighlightedColor = 0xFF00CEFF";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._highlightedcolor /*int*/  = ((int)0xff00ceff);
RDebugUtils.currentLine=18743333;
 //BA.debugLineNum = 18743333;BA.debugLine="DateTemplate.DaysInMonthColor = TextColor";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._daysinmonthcolor /*int*/  = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=18743334;
 //BA.debugLineNum = 18743334;BA.debugLine="DateTemplate.lblMonth.TextColor = TextColor";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._lblmonth /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=18743335;
 //BA.debugLineNum = 18743335;BA.debugLine="DateTemplate.lblYear.TextColor = TextColor";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=18743336;
 //BA.debugLineNum = 18743336;BA.debugLine="For Each clv As CustomListView In Array(CustomLi";
{
final Object[] group39 = new Object[]{(Object)(__ref._customlistview1 /*b4j.example.customlistview*/ ),(Object)(__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._customlistview1 /*b4j.example.customlistview*/ ),(Object)(__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ ._customlistview1 /*b4j.example.customlistview*/ )};
final int groupLen39 = group39.length
;int index39 = 0;
;
for (; index39 < groupLen39;index39++){
_clv = (b4j.example.customlistview)(group39[index39]);
RDebugUtils.currentLine=18743337;
 //BA.debugLineNum = 18743337;BA.debugLine="clv.sv.ScrollViewInnerPanel.Color = DividerColo";
_clv._sv.getScrollViewInnerPanel().setColor(_dividercolor);
RDebugUtils.currentLine=18743338;
 //BA.debugLineNum = 18743338;BA.debugLine="clv.sv.Color = Dialog.BackgroundColor";
_clv._sv.setColor(__ref._dialog /*b4j.example.b4xdialog*/ ._backgroundcolor /*int*/ );
RDebugUtils.currentLine=18743339;
 //BA.debugLineNum = 18743339;BA.debugLine="clv.DefaultTextBackgroundColor = ItemsBackgroun";
_clv._defaulttextbackgroundcolor = __ref._itemsbackgroundcolor /*int*/ ;
RDebugUtils.currentLine=18743340;
 //BA.debugLineNum = 18743340;BA.debugLine="clv.DefaultTextColor = TextColor";
_clv._defaulttextcolor = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=18743342;
 //BA.debugLineNum = 18743342;BA.debugLine="Dim sv As Node = clv.sv";
_sv = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
_sv = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_clv._sv.getObject()));
RDebugUtils.currentLine=18743343;
 //BA.debugLineNum = 18743343;BA.debugLine="sv.StyleClasses.Clear";
_sv.getStyleClasses().Clear();
RDebugUtils.currentLine=18743344;
 //BA.debugLineNum = 18743344;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
_sv.getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=18743345;
 //BA.debugLineNum = 18743345;BA.debugLine="If mTheme = THEME_LIGHT Then sv.StyleClasses.Ad";
if (__ref._mtheme /*int*/ ==__ref._theme_light /*int*/ ) { 
_sv.getStyleClasses().Add((Object)("b4xdialoglight"));};
 }
};
RDebugUtils.currentLine=18743348;
 //BA.debugLineNum = 18743348;BA.debugLine="For Each b As B4XView In Array(DateTemplate.btnM";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final Object[] group49 = new Object[]{(Object)(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._btnmonthleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._btnmonthright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._btnyearleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._btnyearright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject())};
final int groupLen49 = group49.length
;int index49 = 0;
;
for (; index49 < groupLen49;index49++){
_b = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group49[index49]));
RDebugUtils.currentLine=18743349;
 //BA.debugLineNum = 18743349;BA.debugLine="b.Color = xui.Color_Transparent";
_b.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=18743350;
 //BA.debugLineNum = 18743350;BA.debugLine="b.TextColor = TextColor";
_b.setTextColor(__ref._textcolor /*int*/ );
 }
};
 };
RDebugUtils.currentLine=18743357;
 //BA.debugLineNum = 18743357;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Public Sub KeyboardHeightChanged (Height As Int)";
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="If Dialog.Visible Then";
if (__ref._dialog /*b4j.example.b4xdialog*/ ._getvisible /*boolean*/ (null)) { 
RDebugUtils.currentLine=16973833;
 //BA.debugLineNum = 16973833;BA.debugLine="CustomListView1.sv.Height = Min(CustomListView1.A";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.setHeight(__c.Min(__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().getHeight(),_height-__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().getParent().getTop()-__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().getParent().getParent().getTop()));
RDebugUtils.currentLine=16973836;
 //BA.debugLineNum = 16973836;BA.debugLine="For Each v As B4XView In CustomListView1.AsView.";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._customlistview1 /*b4j.example.customlistview*/ ._asview().GetAllViewsRecursive();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group3.Get(index3)));
RDebugUtils.currentLine=16973837;
 //BA.debugLineNum = 16973837;BA.debugLine="If v.Tag Is B4XFloatTextField Then";
if (_v.getTag() instanceof b4j.example.b4xfloattextfield) { 
RDebugUtils.currentLine=16973838;
 //BA.debugLineNum = 16973838;BA.debugLine="Dim f As B4XFloatTextField = v.Tag";
_f = (b4j.example.b4xfloattextfield)(_v.getTag());
RDebugUtils.currentLine=16973839;
 //BA.debugLineNum = 16973839;BA.debugLine="If f.Focused Then";
if (_f._focused /*boolean*/ ) { 
RDebugUtils.currentLine=16973840;
 //BA.debugLineNum = 16973840;BA.debugLine="Dim index As Int = CustomListView1.GetItemFro";
_index = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview(_f._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=16973841;
 //BA.debugLineNum = 16973841;BA.debugLine="CustomListView1.ScrollToItem(index)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._scrolltoitem(_index);
 };
 };
 }
};
 };
RDebugUtils.currentLine=16973846;
 //BA.debugLineNum = 16973846;BA.debugLine="End Sub";
return "";
}
public String  _lblcolors_mouseclicked(b4j.example.preferencesdialog __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "lblcolors_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lblcolors_mouseclicked", new Object[] {_eventdata}));}
b4j.example.preferencesdialog._b4xprefitem _pref = null;
RDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Private Sub lblColors_MouseClicked (EventData As M";
RDebugUtils.currentLine=19398657;
 //BA.debugLineNum = 19398657;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=19398661;
 //BA.debugLineNum = 19398661;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
__ref._nesteddialogitemindex /*int*/  = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=19398662;
 //BA.debugLineNum = 19398662;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
_pref = (b4j.example.preferencesdialog._b4xprefitem)(__ref._customlistview1 /*b4j.example.customlistview*/ ._getvalue(__ref._nesteddialogitemindex /*int*/ ));
RDebugUtils.currentLine=19398663;
 //BA.debugLineNum = 19398663;BA.debugLine="Dialog.Title = pref.Title";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = _pref.Title /*Object*/ ;
RDebugUtils.currentLine=19398664;
 //BA.debugLineNum = 19398664;BA.debugLine="ColorTemplate.SelectedColor = CustomListView1.Get";
__ref._colortemplate /*b4j.example.b4xcolortemplate*/ ._setselectedcolor /*int*/ (null,__ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(__ref._nesteddialogitemindex /*int*/ ).GetView((int) (1)).getColor());
RDebugUtils.currentLine=19398665;
 //BA.debugLineNum = 19398665;BA.debugLine="Template = ColorTemplate";
__ref._template /*Object*/  = (Object)(__ref._colortemplate /*b4j.example.b4xcolortemplate*/ );
RDebugUtils.currentLine=19398666;
 //BA.debugLineNum = 19398666;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
__ref._dialog /*b4j.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._result_showing_nested_dialog /*int*/ );
RDebugUtils.currentLine=19398667;
 //BA.debugLineNum = 19398667;BA.debugLine="End Sub";
return "";
}
public String  _lbldate_mouseclicked(b4j.example.preferencesdialog __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "lbldate_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lbldate_mouseclicked", new Object[] {_eventdata}));}
b4j.example.preferencesdialog._b4xprefitem _pref = null;
RDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Private Sub lblDate_MouseClicked (EventData As Mou";
RDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=19333125;
 //BA.debugLineNum = 19333125;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
__ref._nesteddialogitemindex /*int*/  = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=19333126;
 //BA.debugLineNum = 19333126;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
_pref = (b4j.example.preferencesdialog._b4xprefitem)(__ref._customlistview1 /*b4j.example.customlistview*/ ._getvalue(__ref._nesteddialogitemindex /*int*/ ));
RDebugUtils.currentLine=19333127;
 //BA.debugLineNum = 19333127;BA.debugLine="Dialog.Title = pref.Title";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = _pref.Title /*Object*/ ;
RDebugUtils.currentLine=19333128;
 //BA.debugLineNum = 19333128;BA.debugLine="DateTemplate.Date = DateTime.DateParse(CustomList";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._setdate /*long*/ (null,__c.DateTime.DateParse(__ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(__ref._nesteddialogitemindex /*int*/ ).GetView((int) (1)).getText()));
RDebugUtils.currentLine=19333129;
 //BA.debugLineNum = 19333129;BA.debugLine="Template = DateTemplate";
__ref._template /*Object*/  = (Object)(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ );
RDebugUtils.currentLine=19333130;
 //BA.debugLineNum = 19333130;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
__ref._dialog /*b4j.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._result_showing_nested_dialog /*int*/ );
RDebugUtils.currentLine=19333131;
 //BA.debugLineNum = 19333131;BA.debugLine="End Sub";
return "";
}
public String  _lblexplanation_mouseclicked(b4j.example.preferencesdialog __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "lblexplanation_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lblexplanation_mouseclicked", new Object[] {_eventdata}));}
b4j.example.preferencesdialog._b4xprefitem _pref = null;
RDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Private Sub lblExplanation_MouseClicked (EventData";
RDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=19464197;
 //BA.debugLineNum = 19464197;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
__ref._nesteddialogitemindex /*int*/  = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=19464198;
 //BA.debugLineNum = 19464198;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
_pref = (b4j.example.preferencesdialog._b4xprefitem)(__ref._customlistview1 /*b4j.example.customlistview*/ ._getvalue(__ref._nesteddialogitemindex /*int*/ ));
RDebugUtils.currentLine=19464199;
 //BA.debugLineNum = 19464199;BA.debugLine="Dialog.Title = pref.Title";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = _pref.Title /*Object*/ ;
RDebugUtils.currentLine=19464200;
 //BA.debugLineNum = 19464200;BA.debugLine="LongTextTemplate.Text = pref.Extra.Get(\"text\")";
__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ ._text /*Object*/  = _pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("text"));
RDebugUtils.currentLine=19464201;
 //BA.debugLineNum = 19464201;BA.debugLine="Template = LongTextTemplate";
__ref._template /*Object*/  = (Object)(__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ );
RDebugUtils.currentLine=19464202;
 //BA.debugLineNum = 19464202;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
__ref._dialog /*b4j.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._result_showing_nested_dialog /*int*/ );
RDebugUtils.currentLine=19464203;
 //BA.debugLineNum = 19464203;BA.debugLine="End Sub";
return "";
}
public String  _lbloptions_mouseclicked(b4j.example.preferencesdialog __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "lbloptions_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lbloptions_mouseclicked", new Object[] {_eventdata}));}
b4j.example.preferencesdialog._b4xprefitem _pref = null;
RDebugUtils.currentLine=19267584;
 //BA.debugLineNum = 19267584;BA.debugLine="Private Sub lblOptions_MouseClicked (EventData As";
RDebugUtils.currentLine=19267585;
 //BA.debugLineNum = 19267585;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=19267589;
 //BA.debugLineNum = 19267589;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
__ref._nesteddialogitemindex /*int*/  = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=19267590;
 //BA.debugLineNum = 19267590;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
_pref = (b4j.example.preferencesdialog._b4xprefitem)(__ref._customlistview1 /*b4j.example.customlistview*/ ._getvalue(__ref._nesteddialogitemindex /*int*/ ));
RDebugUtils.currentLine=19267591;
 //BA.debugLineNum = 19267591;BA.debugLine="Dialog.Title = pref.Title";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = _pref.Title /*Object*/ ;
RDebugUtils.currentLine=19267592;
 //BA.debugLineNum = 19267592;BA.debugLine="If pref.Extra.ContainsKey(\"index\") Then";
if (_pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("index"))) { 
RDebugUtils.currentLine=19267593;
 //BA.debugLineNum = 19267593;BA.debugLine="SearchTemplate.SetIndex(pref.Extra.Get(\"index\"))";
__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._setindex /*String*/ (null,_pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("index")));
 }else {
RDebugUtils.currentLine=19267595;
 //BA.debugLineNum = 19267595;BA.debugLine="pref.Extra.Put(\"index\", SearchTemplate.SetItems(";
_pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("index"),__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._setitems /*Object*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("options"))))));
 };
RDebugUtils.currentLine=19267597;
 //BA.debugLineNum = 19267597;BA.debugLine="SearchTemplate.SelectedItem = CustomListView1.Get";
__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._selecteditem /*String*/  = __ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(__ref._nesteddialogitemindex /*int*/ ).GetView((int) (1)).getText();
RDebugUtils.currentLine=19267598;
 //BA.debugLineNum = 19267598;BA.debugLine="Template = SearchTemplate";
__ref._template /*Object*/  = (Object)(__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ );
RDebugUtils.currentLine=19267599;
 //BA.debugLineNum = 19267599;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
__ref._dialog /*b4j.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._result_showing_nested_dialog /*int*/ );
RDebugUtils.currentLine=19267600;
 //BA.debugLineNum = 19267600;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Public Sub LoadFromJson (Json As String)";
RDebugUtils.currentLine=17104897;
 //BA.debugLineNum = 17104897;BA.debugLine="Dim p As JSONParser";
_p = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="p.Initialize(Json)";
_p.Initialize(_json);
RDebugUtils.currentLine=17104899;
 //BA.debugLineNum = 17104899;BA.debugLine="Dim m As Map = p.NextObject";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _p.NextObject();
RDebugUtils.currentLine=17104900;
 //BA.debugLineNum = 17104900;BA.debugLine="Dim theme As String = m.GetDefault(\"Theme\", \"Dark";
_theme = BA.ObjectToString(_m.GetDefault((Object)("Theme"),(Object)("Dark Theme")));
RDebugUtils.currentLine=17104901;
 //BA.debugLineNum = 17104901;BA.debugLine="Select theme";
switch (BA.switchObjectToInt(_theme,"Dark Theme","Light Theme")) {
case 0: {
RDebugUtils.currentLine=17104903;
 //BA.debugLineNum = 17104903;BA.debugLine="setTheme(THEME_DARK)";
__ref._settheme /*String*/ (null,__ref._theme_dark /*int*/ );
 break; }
case 1: {
RDebugUtils.currentLine=17104905;
 //BA.debugLineNum = 17104905;BA.debugLine="setTheme(THEME_LIGHT)";
__ref._settheme /*String*/ (null,__ref._theme_light /*int*/ );
 break; }
}
;
RDebugUtils.currentLine=17104907;
 //BA.debugLineNum = 17104907;BA.debugLine="Dim items As List = m.Get(\"Items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.Get((Object)("Items"))));
RDebugUtils.currentLine=17104908;
 //BA.debugLineNum = 17104908;BA.debugLine="For Each item As Map In items";
_item = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group12 = _items;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group12.Get(index12)));
RDebugUtils.currentLine=17104909;
 //BA.debugLineNum = 17104909;BA.debugLine="Dim key As String = item.Get(\"key\")";
_key = BA.ObjectToString(_item.Get((Object)("key")));
RDebugUtils.currentLine=17104910;
 //BA.debugLineNum = 17104910;BA.debugLine="Dim title As String = item.Get(\"title\")";
_title = BA.ObjectToString(_item.Get((Object)("title")));
RDebugUtils.currentLine=17104911;
 //BA.debugLineNum = 17104911;BA.debugLine="Dim required As Boolean = item.Get(\"required\")";
_required = BA.ObjectToBoolean(_item.Get((Object)("required")));
RDebugUtils.currentLine=17104912;
 //BA.debugLineNum = 17104912;BA.debugLine="Dim itemType As String = item.Get(\"type\")";
_itemtype = BA.ObjectToString(_item.Get((Object)("type")));
RDebugUtils.currentLine=17104913;
 //BA.debugLineNum = 17104913;BA.debugLine="Select itemType";
switch (BA.switchObjectToInt(_itemtype,"Separator","Boolean","Text","Date","Short Options","Color","Number","Password","Options","Decimal Number","Multiline Text","Time","Numeric Range","Explanation")) {
case 0: {
RDebugUtils.currentLine=17104915;
 //BA.debugLineNum = 17104915;BA.debugLine="AddSeparator(title)";
__ref._addseparator /*String*/ (null,(Object)(_title));
 break; }
case 1: {
RDebugUtils.currentLine=17104917;
 //BA.debugLineNum = 17104917;BA.debugLine="AddBooleanItem(key, title)";
__ref._addbooleanitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 2: {
RDebugUtils.currentLine=17104919;
 //BA.debugLineNum = 17104919;BA.debugLine="AddTextItem(key, title)";
__ref._addtextitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 3: {
RDebugUtils.currentLine=17104921;
 //BA.debugLineNum = 17104921;BA.debugLine="AddDateItem(key, title)";
__ref._adddateitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 4: {
RDebugUtils.currentLine=17104923;
 //BA.debugLineNum = 17104923;BA.debugLine="AddShortOptionsItem(key, title, item.Get(\"opti";
__ref._addshortoptionsitem /*String*/ (null,_key,(Object)(_title),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options")))));
 break; }
case 5: {
RDebugUtils.currentLine=17104925;
 //BA.debugLineNum = 17104925;BA.debugLine="AddColorItem(key, title)";
__ref._addcoloritem /*String*/ (null,_key,(Object)(_title));
 break; }
case 6: {
RDebugUtils.currentLine=17104927;
 //BA.debugLineNum = 17104927;BA.debugLine="AddNumberItem(key, title)";
__ref._addnumberitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 7: {
RDebugUtils.currentLine=17104929;
 //BA.debugLineNum = 17104929;BA.debugLine="AddPasswordItem(key, title)";
__ref._addpassworditem /*String*/ (null,_key,(Object)(_title));
 break; }
case 8: {
RDebugUtils.currentLine=17104931;
 //BA.debugLineNum = 17104931;BA.debugLine="AddOptionsItem(key, title, item.Get(\"options\")";
__ref._addoptionsitem /*String*/ (null,_key,(Object)(_title),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options")))));
 break; }
case 9: {
RDebugUtils.currentLine=17104933;
 //BA.debugLineNum = 17104933;BA.debugLine="AddDecimalNumberItem(key, title)";
__ref._adddecimalnumberitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 10: {
RDebugUtils.currentLine=17104935;
 //BA.debugLineNum = 17104935;BA.debugLine="Dim l As List = item.Get(\"options\")";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options"))));
RDebugUtils.currentLine=17104936;
 //BA.debugLineNum = 17104936;BA.debugLine="If l.IsInitialized = False Or l.Size = 0 Or Is";
if (_l.IsInitialized()==__c.False || _l.getSize()==0 || __c.IsNumber(BA.ObjectToString(_l.Get((int) (0))))==__c.False) { 
RDebugUtils.currentLine=17104937;
 //BA.debugLineNum = 17104937;BA.debugLine="AddMultilineTextItem(key, title, 100dip)";
__ref._addmultilinetextitem /*String*/ (null,_key,(Object)(_title),__c.DipToCurrent((int) (100)));
 }else {
RDebugUtils.currentLine=17104939;
 //BA.debugLineNum = 17104939;BA.debugLine="AddMultilineTextItem(key, title, DipToCurrent";
__ref._addmultilinetextitem /*String*/ (null,_key,(Object)(_title),__c.DipToCurrent((int)(BA.ObjectToNumber(_l.Get((int) (0))))));
 };
 break; }
case 11: {
RDebugUtils.currentLine=17104942;
 //BA.debugLineNum = 17104942;BA.debugLine="AddTimeItem(key, title)";
__ref._addtimeitem /*String*/ (null,_key,(Object)(_title));
RDebugUtils.currentLine=17104943;
 //BA.debugLineNum = 17104943;BA.debugLine="Dim l As List = item.Get(\"options\")";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options"))));
RDebugUtils.currentLine=17104944;
 //BA.debugLineNum = 17104944;BA.debugLine="If l.IsInitialized And l.Size > 0 Then";
if (_l.IsInitialized() && _l.getSize()>0) { 
RDebugUtils.currentLine=17104945;
 //BA.debugLineNum = 17104945;BA.debugLine="Dim pi As B4XPrefItem = PrefItems.Get(PrefIte";
_pi = (b4j.example.preferencesdialog._b4xprefitem)(__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=17104946;
 //BA.debugLineNum = 17104946;BA.debugLine="pi.Extra.Put(\"24\", l.Get(0) = \"24\")";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("24"),(Object)((_l.Get((int) (0))).equals((Object)("24"))));
 };
 break; }
case 12: {
RDebugUtils.currentLine=17104950;
 //BA.debugLineNum = 17104950;BA.debugLine="Dim l As List = item.Get(\"options\")";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options"))));
RDebugUtils.currentLine=17104951;
 //BA.debugLineNum = 17104951;BA.debugLine="If l.IsInitialized = False Or l.Size < 3 Or Is";
if (_l.IsInitialized()==__c.False || _l.getSize()<3 || __c.IsNumber(BA.ObjectToString(_l.Get((int) (0))))==__c.False || __c.IsNumber(BA.ObjectToString(_l.Get((int) (1))))==__c.False || __c.IsNumber(BA.ObjectToString(_l.Get((int) (2))))==__c.False) { 
RDebugUtils.currentLine=17104952;
 //BA.debugLineNum = 17104952;BA.debugLine="AddNumericRangeItem(key, title, 0, 100, 1)";
__ref._addnumericrangeitem /*String*/ (null,_key,(Object)(_title),0,100,1);
 }else {
RDebugUtils.currentLine=17104954;
 //BA.debugLineNum = 17104954;BA.debugLine="AddNumericRangeItem(key, title, l.Get(0), l.G";
__ref._addnumericrangeitem /*String*/ (null,_key,(Object)(_title),(double)(BA.ObjectToNumber(_l.Get((int) (0)))),(double)(BA.ObjectToNumber(_l.Get((int) (1)))),(double)(BA.ObjectToNumber(_l.Get((int) (2)))));
 };
 break; }
case 13: {
RDebugUtils.currentLine=17104957;
 //BA.debugLineNum = 17104957;BA.debugLine="Dim l As List = item.Get(\"options\")";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options"))));
RDebugUtils.currentLine=17104958;
 //BA.debugLineNum = 17104958;BA.debugLine="Dim text As String";
_text = "";
RDebugUtils.currentLine=17104959;
 //BA.debugLineNum = 17104959;BA.debugLine="If l.IsInitialized Then";
if (_l.IsInitialized()) { 
RDebugUtils.currentLine=17104960;
 //BA.debugLineNum = 17104960;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=17104961;
 //BA.debugLineNum = 17104961;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=17104962;
 //BA.debugLineNum = 17104962;BA.debugLine="For i = 0 To l.Size - 1";
{
final int step65 = 1;
final int limit65 = (int) (_l.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit65 ;_i = _i + step65 ) {
RDebugUtils.currentLine=17104963;
 //BA.debugLineNum = 17104963;BA.debugLine="If i > 0 Then sb.Append(CRLF)";
if (_i>0) { 
_sb.Append(__c.CRLF);};
RDebugUtils.currentLine=17104964;
 //BA.debugLineNum = 17104964;BA.debugLine="sb.Append(l.Get(i))";
_sb.Append(BA.ObjectToString(_l.Get(_i)));
 }
};
RDebugUtils.currentLine=17104966;
 //BA.debugLineNum = 17104966;BA.debugLine="text = sb.ToString";
_text = _sb.ToString();
 };
RDebugUtils.currentLine=17104968;
 //BA.debugLineNum = 17104968;BA.debugLine="AddExplanationItem(key, title, text)";
__ref._addexplanationitem /*String*/ (null,_key,(Object)(_title),(Object)(_text));
 break; }
}
;
RDebugUtils.currentLine=17104970;
 //BA.debugLineNum = 17104970;BA.debugLine="Dim pi As B4XPrefItem = PrefItems.Get(PrefItems.";
_pi = (b4j.example.preferencesdialog._b4xprefitem)(__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=17104971;
 //BA.debugLineNum = 17104971;BA.debugLine="pi.Required = required";
_pi.Required /*boolean*/  = _required;
 }
};
RDebugUtils.currentLine=17104973;
 //BA.debugLineNum = 17104973;BA.debugLine="End Sub";
return "";
}
public String  _raisebeforedialogdisplayed(b4j.example.preferencesdialog __ref,Object _temp) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "raisebeforedialogdisplayed", true))
	 {return ((String) Debug.delegate(ba, "raisebeforedialogdisplayed", new Object[] {_temp}));}
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Private Sub RaiseBeforeDialogDisplayed (Temp As Ob";
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="If mEventName <> \"\" And  xui.SubExists(mCallback,";
if ((__ref._meventname /*String*/ ).equals("") == false && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_BeforeDialogDisplayed",(int) (1))) { 
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="CallSub2(mCallback, mEventName & \"_BeforeDialogD";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_BeforeDialogDisplayed",_temp);
 };
RDebugUtils.currentLine=18219012;
 //BA.debugLineNum = 18219012;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19070976;
 //BA.debugLineNum = 19070976;BA.debugLine="Public Sub ScrollToItemWithError (key As String)";
RDebugUtils.currentLine=19070977;
 //BA.debugLineNum = 19070977;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=19070978;
 //BA.debugLineNum = 19070978;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = __ref._customlistview1 /*b4j.example.customlistview*/ ._getrawlistitem(_i);
RDebugUtils.currentLine=19070979;
 //BA.debugLineNum = 19070979;BA.debugLine="Dim PrefItem As B4XPrefItem = Item.Value";
_prefitem = (b4j.example.preferencesdialog._b4xprefitem)(_item.Value);
RDebugUtils.currentLine=19070980;
 //BA.debugLineNum = 19070980;BA.debugLine="If PrefItem.Key = key Then";
if ((_prefitem.Key /*String*/ ).equals(_key)) { 
RDebugUtils.currentLine=19070981;
 //BA.debugLineNum = 19070981;BA.debugLine="GoToItem(i)";
__ref._gotoitem /*void*/ (null,_i);
RDebugUtils.currentLine=19070982;
 //BA.debugLineNum = 19070982;BA.debugLine="Return";
if (true) return "";
 };
 }
};
RDebugUtils.currentLine=19070985;
 //BA.debugLineNum = 19070985;BA.debugLine="End Sub";
return "";
}
public String  _seteventslistener(b4j.example.preferencesdialog __ref,Object _callback,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "seteventslistener", true))
	 {return ((String) Debug.delegate(ba, "seteventslistener", new Object[] {_callback,_eventname}));}
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Public Sub SetEventsListener(Callback As Object, E";
RDebugUtils.currentLine=16777217;
 //BA.debugLineNum = 16777217;BA.debugLine="mCallback = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=16777219;
 //BA.debugLineNum = 16777219;BA.debugLine="End Sub";
return "";
}
public String  _setexplanation(b4j.example.preferencesdialog __ref,String _key,Object _explanation) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "setexplanation", true))
	 {return ((String) Debug.delegate(ba, "setexplanation", new Object[] {_key,_explanation}));}
RDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Public Sub SetExplanation (Key As String, Explanat";
RDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="GetPrefItem(Key).Extra.Put(\"text\", Explanation)";
__ref._getprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_key).Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("text"),_explanation);
RDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="End Sub";
return "";
}
public String  _setoptions(b4j.example.preferencesdialog __ref,String _key,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "setoptions", true))
	 {return ((String) Debug.delegate(ba, "setoptions", new Object[] {_key,_options}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Public Sub SetOptions (Key As String, Options As L";
RDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="Dim pi As B4XPrefItem = GetPrefItem(Key)";
_pi = __ref._getprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_key);
RDebugUtils.currentLine=19595266;
 //BA.debugLineNum = 19595266;BA.debugLine="If pi.Extra.IsInitialized = False Then";
if (_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=19595267;
 //BA.debugLineNum = 19595267;BA.debugLine="pi.Extra.Initialize";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=19595269;
 //BA.debugLineNum = 19595269;BA.debugLine="pi.Extra.Put(\"options\", Options)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("options"),(Object)(_options.getObject()));
RDebugUtils.currentLine=19595270;
 //BA.debugLineNum = 19595270;BA.debugLine="End Sub";
return "";
}
public String  _settitle(b4j.example.preferencesdialog __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((String) Debug.delegate(ba, "settitle", new Object[] {_o}));}
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Public Sub setTitle(o As Object)";
RDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="mTitle = o";
__ref._mtitle /*Object*/  = _o;
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="End Sub";
return "";
}
public String  _show(b4j.example.preferencesdialog __ref,b4j.example.b4xdialog _dialog1) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_dialog1}));}
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Private Sub Show (Dialog1 As B4XDialog) 'ignore";
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="If CustomListView1.Size = 0 Then";
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
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="Dim LastTextField As B4XFloatTextField";
_lasttextfield = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=18153475;
 //BA.debugLineNum = 18153475;BA.debugLine="For Each pi As B4XPrefItem In PrefItems";
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
RDebugUtils.currentLine=18153476;
 //BA.debugLineNum = 18153476;BA.debugLine="Dim pnl As B4XView = CreateLayouts(pi)";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._createlayouts /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_pi);
RDebugUtils.currentLine=18153477;
 //BA.debugLineNum = 18153477;BA.debugLine="CustomListView1.Add (pnl, pi)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._add(_pnl,(Object)(_pi));
RDebugUtils.currentLine=18153478;
 //BA.debugLineNum = 18153478;BA.debugLine="If pnl.GetView(0).Tag Is B4XFloatTextField Then";
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
RDebugUtils.currentLine=18153479;
 //BA.debugLineNum = 18153479;BA.debugLine="Dim tf As B4XFloatTextField = pnl.GetView(0).T";
_tf = (b4j.example.b4xfloattextfield)(_pnl.GetView((int) (0)).getTag());
RDebugUtils.currentLine=18153480;
 //BA.debugLineNum = 18153480;BA.debugLine="If LastTextField.IsInitialized Then";
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
RDebugUtils.currentLine=18153481;
 //BA.debugLineNum = 18153481;BA.debugLine="LastTextField.NextField = tf";
_lasttextfield._setnextfield /*b4j.example.b4xfloattextfield*/ (null,_tf);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=18153483;
 //BA.debugLineNum = 18153483;BA.debugLine="LastTextField = tf";
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
RDebugUtils.currentLine=18153491;
 //BA.debugLineNum = 18153491;BA.debugLine="Dialog.InternalAddStubToCLVIfNeeded(CustomListVi";
__ref._dialog /*b4j.example.b4xdialog*/ ._internaladdstubtoclvifneeded /*String*/ (null,__ref._customlistview1 /*b4j.example.customlistview*/ ,__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor);
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=18153493;
 //BA.debugLineNum = 18153493;BA.debugLine="FillData (Data)";
__ref._filldata /*String*/ (null,_data);
RDebugUtils.currentLine=18153494;
 //BA.debugLineNum = 18153494;BA.debugLine="Dim ScrollViewOffset As Int 'ignore";
_scrollviewoffset = 0;
RDebugUtils.currentLine=18153495;
 //BA.debugLineNum = 18153495;BA.debugLine="Do While True";
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
RDebugUtils.currentLine=18153496;
 //BA.debugLineNum = 18153496;BA.debugLine="Dialog.Title = mTitle";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = __ref._mtitle /*Object*/ ;
RDebugUtils.currentLine=18153497;
 //BA.debugLineNum = 18153497;BA.debugLine="Dialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._dialog /*b4j.example.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=18153498;
 //BA.debugLineNum = 18153498;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(Me, Yes,";
_rs = __ref._dialog /*b4j.example.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent,_yes,(Object)(""),_cancel);
RDebugUtils.currentLine=18153506;
 //BA.debugLineNum = 18153506;BA.debugLine="RaiseBeforeDialogDisplayed(Me)";
__ref._raisebeforedialogdisplayed /*String*/ (null,parent);
RDebugUtils.currentLine=18153507;
 //BA.debugLineNum = 18153507;BA.debugLine="Wait For (rs) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preferencesdialog", "showdialog"), _rs);
this.state = 57;
return;
case 57:
//C
this.state = 20;
_result = (int) result[1];
;
RDebugUtils.currentLine=18153508;
 //BA.debugLineNum = 18153508;BA.debugLine="ScrollViewOffset = CustomListView1.sv.ScrollView";
_scrollviewoffset = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewOffsetY());
RDebugUtils.currentLine=18153509;
 //BA.debugLineNum = 18153509;BA.debugLine="If Result <> RESULT_SHOWING_NESTED_DIALOG Then";
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
RDebugUtils.currentLine=18153510;
 //BA.debugLineNum = 18153510;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=18153511;
 //BA.debugLineNum = 18153511;BA.debugLine="If CommitChanges(Data) = False Then";
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
RDebugUtils.currentLine=18153512;
 //BA.debugLineNum = 18153512;BA.debugLine="ScrollViewOffset = 0";
_scrollviewoffset = (int) (0);
RDebugUtils.currentLine=18153513;
 //BA.debugLineNum = 18153513;BA.debugLine="Continue";
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
RDebugUtils.currentLine=18153516;
 //BA.debugLineNum = 18153516;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=18153518;
 //BA.debugLineNum = 18153518;BA.debugLine="Dim y As Object";
_y = new Object();
RDebugUtils.currentLine=18153519;
 //BA.debugLineNum = 18153519;BA.debugLine="Dim c As Object = Cancel";
_c = _cancel;
RDebugUtils.currentLine=18153520;
 //BA.debugLineNum = 18153520;BA.debugLine="If Template = ColorTemplate Then";
if (true) break;

case 33:
//if
this.state = 40;
if ((__ref._template /*Object*/ ).equals((Object)(__ref._colortemplate /*b4j.example.b4xcolortemplate*/ ))) { 
this.state = 35;
}else 
{RDebugUtils.currentLine=18153522;
 //BA.debugLineNum = 18153522;BA.debugLine="Else If Template = LongTextTemplate Then";
if ((__ref._template /*Object*/ ).equals((Object)(__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ ))) { 
this.state = 37;
}else {
this.state = 39;
}}
if (true) break;

case 35:
//C
this.state = 40;
RDebugUtils.currentLine=18153521;
 //BA.debugLineNum = 18153521;BA.debugLine="y = Yes";
_y = _yes;
 if (true) break;

case 37:
//C
this.state = 40;
RDebugUtils.currentLine=18153523;
 //BA.debugLineNum = 18153523;BA.debugLine="y = Yes";
_y = _yes;
RDebugUtils.currentLine=18153524;
 //BA.debugLineNum = 18153524;BA.debugLine="c = \"\"";
_c = (Object)("");
 if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=18153526;
 //BA.debugLineNum = 18153526;BA.debugLine="y = \"\"";
_y = (Object)("");
 if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=18153528;
 //BA.debugLineNum = 18153528;BA.debugLine="Dialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._dialog /*b4j.example.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=18153529;
 //BA.debugLineNum = 18153529;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(Template";
_rs = __ref._dialog /*b4j.example.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._template /*Object*/ ,_y,(Object)(""),_c);
RDebugUtils.currentLine=18153530;
 //BA.debugLineNum = 18153530;BA.debugLine="RaiseBeforeDialogDisplayed(Template)";
__ref._raisebeforedialogdisplayed /*String*/ (null,__ref._template /*Object*/ );
RDebugUtils.currentLine=18153531;
 //BA.debugLineNum = 18153531;BA.debugLine="Wait For (rs) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preferencesdialog", "showdialog"), _rs);
this.state = 58;
return;
case 58:
//C
this.state = 41;
_result = (int) result[1];
;
RDebugUtils.currentLine=18153532;
 //BA.debugLineNum = 18153532;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=18153533;
 //BA.debugLineNum = 18153533;BA.debugLine="Dim lbl As B4XView = CustomListView1.GetPanel(";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(__ref._nesteddialogitemindex /*int*/ ).GetView((int) (1));
RDebugUtils.currentLine=18153534;
 //BA.debugLineNum = 18153534;BA.debugLine="Dim value As String";
_value = "";
RDebugUtils.currentLine=18153535;
 //BA.debugLineNum = 18153535;BA.debugLine="If Template = DateTemplate Then";
if (true) break;

case 44:
//if
this.state = 51;
if ((__ref._template /*Object*/ ).equals((Object)(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ))) { 
this.state = 46;
}else 
{RDebugUtils.currentLine=18153538;
 //BA.debugLineNum = 18153538;BA.debugLine="Else if Template = SearchTemplate Then";
if ((__ref._template /*Object*/ ).equals((Object)(__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ))) { 
this.state = 48;
}else 
{RDebugUtils.currentLine=18153541;
 //BA.debugLineNum = 18153541;BA.debugLine="Else If Template = ColorTemplate Then";
if ((__ref._template /*Object*/ ).equals((Object)(__ref._colortemplate /*b4j.example.b4xcolortemplate*/ ))) { 
this.state = 50;
}}}
if (true) break;

case 46:
//C
this.state = 51;
RDebugUtils.currentLine=18153536;
 //BA.debugLineNum = 18153536;BA.debugLine="value = DateTime.Date(DateTemplate.Date)";
_value = parent.__c.DateTime.Date(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._getdate /*long*/ (null));
RDebugUtils.currentLine=18153537;
 //BA.debugLineNum = 18153537;BA.debugLine="lbl.Text = value";
_lbl.setText(_value);
 if (true) break;

case 48:
//C
this.state = 51;
RDebugUtils.currentLine=18153539;
 //BA.debugLineNum = 18153539;BA.debugLine="value = SearchTemplate.SelectedItem";
_value = __ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=18153540;
 //BA.debugLineNum = 18153540;BA.debugLine="lbl.Text = value";
_lbl.setText(_value);
 if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=18153542;
 //BA.debugLineNum = 18153542;BA.debugLine="value = ColorTemplate.SelectedColor";
_value = BA.NumberToString(__ref._colortemplate /*b4j.example.b4xcolortemplate*/ ._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=18153543;
 //BA.debugLineNum = 18153543;BA.debugLine="SetLabelColor(lbl, value)";
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
RDebugUtils.currentLine=18153548;
 //BA.debugLineNum = 18153548;BA.debugLine="Return -1 'never happens";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(-1));return;};
RDebugUtils.currentLine=18153549;
 //BA.debugLineNum = 18153549;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Private Sub tfColorCode_EnterPressed";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="Dim ft As B4XFloatTextField = Sender";
_ft = (b4j.example.b4xfloattextfield)(__c.Sender(ba));
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="Dim clr() As Int = HexToColor(ft.Text)";
_clr = __ref._hextocolor /*int[]*/ (null,_ft._gettext /*String*/ (null));
RDebugUtils.currentLine=19988483;
 //BA.debugLineNum = 19988483;BA.debugLine="Dim index As Int = CustomListView1.GetItemFromVie";
_index = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview(_ft._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=19988484;
 //BA.debugLineNum = 19988484;BA.debugLine="Dim lbl As B4XView = CustomListView1.GetPanel(ind";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(_index).GetView((int) (1));
RDebugUtils.currentLine=19988485;
 //BA.debugLineNum = 19988485;BA.debugLine="If clr.Length = 1 Then";
if (_clr.length==1) { 
RDebugUtils.currentLine=19988486;
 //BA.debugLineNum = 19988486;BA.debugLine="SetLabelColor(lbl, clr(0))";
__ref._setlabelcolor /*String*/ (null,_lbl,_clr[(int) (0)]);
 }else {
RDebugUtils.currentLine=19988488;
 //BA.debugLineNum = 19988488;BA.debugLine="ft.Text = ColorToHex(lbl.Color)";
_ft._settext /*String*/ (null,__ref._colortohex /*String*/ (null,_lbl.getColor()));
 };
RDebugUtils.currentLine=19988490;
 //BA.debugLineNum = 19988490;BA.debugLine="End Sub";
return "";
}
}