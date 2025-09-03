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
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Public Sub AddBooleanItem (Key As String, Title As";
RDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_BOOLEAN,";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_boolean /*int*/ ,_key)));
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="End Sub";
return "";
}
public b4j.example.preferencesdialog._b4xprefitem  _createprefitem(b4j.example.preferencesdialog __ref,Object _title,int _itemtype,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "createprefitem", true))
	 {return ((b4j.example.preferencesdialog._b4xprefitem) Debug.delegate(ba, "createprefitem", new Object[] {_title,_itemtype,_key}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Private Sub CreatePrefItem(Title As Object, ItemTy";
RDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="Dim pi As B4XPrefItem";
_pi = new b4j.example.preferencesdialog._b4xprefitem();
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="pi.Initialize";
_pi.Initialize();
RDebugUtils.currentLine=16908291;
 //BA.debugLineNum = 16908291;BA.debugLine="pi.Title = Title";
_pi.Title /*Object*/  = _title;
RDebugUtils.currentLine=16908292;
 //BA.debugLineNum = 16908292;BA.debugLine="pi.ItemType = ItemType";
_pi.ItemType /*int*/  = _itemtype;
RDebugUtils.currentLine=16908293;
 //BA.debugLineNum = 16908293;BA.debugLine="pi.Key = Key";
_pi.Key /*String*/  = _key;
RDebugUtils.currentLine=16908294;
 //BA.debugLineNum = 16908294;BA.debugLine="Return pi";
if (true) return _pi;
RDebugUtils.currentLine=16908295;
 //BA.debugLineNum = 16908295;BA.debugLine="End Sub";
return null;
}
public String  _addcoloritem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addcoloritem", true))
	 {return ((String) Debug.delegate(ba, "addcoloritem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Public Sub AddColorItem(Key As String, Title As Ob";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="If ColorTemplate.IsInitialized = False Then";
if (__ref._colortemplate /*b4j.example.b4xcolortemplate*/ .IsInitialized /*boolean*/ ()==__c.False) { 
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="ColorTemplate.Initialize";
__ref._colortemplate /*b4j.example.b4xcolortemplate*/ ._initialize /*String*/ (null,ba);
 };
RDebugUtils.currentLine=16711684;
 //BA.debugLineNum = 16711684;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_COLOR, K";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_color /*int*/ ,_key)));
RDebugUtils.currentLine=16711685;
 //BA.debugLineNum = 16711685;BA.debugLine="End Sub";
return "";
}
public String  _adddateitem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "adddateitem", true))
	 {return ((String) Debug.delegate(ba, "adddateitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Public Sub AddDateItem (Key As String, Title As Ob";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_DATE, Ke";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_date /*int*/ ,_key)));
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="End Sub";
return "";
}
public String  _adddecimalnumberitem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "adddecimalnumberitem", true))
	 {return ((String) Debug.delegate(ba, "adddecimalnumberitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Public Sub AddDecimalNumberItem (Key As String, Ti";
RDebugUtils.currentLine=16318465;
 //BA.debugLineNum = 16318465;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_DECIMALN";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_decimalnumber /*int*/ ,_key)));
RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="End Sub";
return "";
}
public String  _addexplanationitem(b4j.example.preferencesdialog __ref,String _key,Object _title,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addexplanationitem", true))
	 {return ((String) Debug.delegate(ba, "addexplanationitem", new Object[] {_key,_title,_text}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Public Sub AddExplanationItem (Key As String, Titl";
RDebugUtils.currentLine=16777217;
 //BA.debugLineNum = 16777217;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_explanation /*int*/ ,_key);
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="pi.Extra = CreateMap(\"text\": Text)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("text"),_text});
RDebugUtils.currentLine=16777219;
 //BA.debugLineNum = 16777219;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=16777220;
 //BA.debugLineNum = 16777220;BA.debugLine="End Sub";
return "";
}
public String  _addmultilinetextitem(b4j.example.preferencesdialog __ref,String _key,Object _title,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addmultilinetextitem", true))
	 {return ((String) Debug.delegate(ba, "addmultilinetextitem", new Object[] {_key,_title,_height}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Public Sub AddMultilineTextItem (Key As String, Ti";
RDebugUtils.currentLine=16384001;
 //BA.debugLineNum = 16384001;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_multilinetext /*int*/ ,_key);
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="pi.Extra = CreateMap(\"height\": Height)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("height"),(Object)(_height)});
RDebugUtils.currentLine=16384003;
 //BA.debugLineNum = 16384003;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="End Sub";
return "";
}
public String  _addnumberitem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addnumberitem", true))
	 {return ((String) Debug.delegate(ba, "addnumberitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Public Sub AddNumberItem (Key As String, Title As";
RDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_NUMBER,";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_number /*int*/ ,_key)));
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="End Sub";
return "";
}
public String  _addnumericrangeitem(b4j.example.preferencesdialog __ref,String _key,Object _title,double _rangestart,double _rangeend,double _interval) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addnumericrangeitem", true))
	 {return ((String) Debug.delegate(ba, "addnumericrangeitem", new Object[] {_key,_title,_rangestart,_rangeend,_interval}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Public Sub AddNumericRangeItem (Key As String, Tit";
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_numericrange /*int*/ ,_key);
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="pi.Extra = CreateMap(\"start\": RangeStart, \"end\":";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("start"),(Object)(_rangestart),(Object)("end"),(Object)(_rangeend),(Object)("interval"),(Object)(_interval)});
RDebugUtils.currentLine=16449539;
 //BA.debugLineNum = 16449539;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=16449540;
 //BA.debugLineNum = 16449540;BA.debugLine="End Sub";
return "";
}
public String  _addoptionsitem(b4j.example.preferencesdialog __ref,String _key,Object _title,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addoptionsitem", true))
	 {return ((String) Debug.delegate(ba, "addoptionsitem", new Object[] {_key,_title,_options}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Public Sub AddOptionsItem (Key As String, Title As";
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_options /*int*/ ,_key);
RDebugUtils.currentLine=15990787;
 //BA.debugLineNum = 15990787;BA.debugLine="If Options.IsInitialized Then";
if (_options.IsInitialized()) { 
RDebugUtils.currentLine=15990788;
 //BA.debugLineNum = 15990788;BA.debugLine="pi.Extra = CreateMap(\"options\": Options)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("options"),(Object)(_options.getObject())});
 };
RDebugUtils.currentLine=15990790;
 //BA.debugLineNum = 15990790;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=15990791;
 //BA.debugLineNum = 15990791;BA.debugLine="End Sub";
return "";
}
public String  _addpassworditem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addpassworditem", true))
	 {return ((String) Debug.delegate(ba, "addpassworditem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Public Sub AddPasswordItem (Key As String, Title A";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_PASSWORD";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_password /*int*/ ,_key)));
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="End Sub";
return "";
}
public String  _addseparator(b4j.example.preferencesdialog __ref,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addseparator", true))
	 {return ((String) Debug.delegate(ba, "addseparator", new Object[] {_title}));}
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Public Sub AddSeparator (Title As Object)";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_SEPARATO";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_separator /*int*/ ,"")));
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="End Sub";
return "";
}
public String  _addshortoptionsitem(b4j.example.preferencesdialog __ref,String _key,Object _title,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addshortoptionsitem", true))
	 {return ((String) Debug.delegate(ba, "addshortoptionsitem", new Object[] {_key,_title,_options}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Public Sub AddShortOptionsItem (Key As String, Tit";
RDebugUtils.currentLine=16056321;
 //BA.debugLineNum = 16056321;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_shortoptions /*int*/ ,_key);
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="If Options.IsInitialized Then";
if (_options.IsInitialized()) { 
RDebugUtils.currentLine=16056323;
 //BA.debugLineNum = 16056323;BA.debugLine="pi.Extra = CreateMap(\"options\": Options)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("options"),(Object)(_options.getObject())});
 };
RDebugUtils.currentLine=16056325;
 //BA.debugLineNum = 16056325;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=16056326;
 //BA.debugLineNum = 16056326;BA.debugLine="End Sub";
return "";
}
public String  _addtextitem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addtextitem", true))
	 {return ((String) Debug.delegate(ba, "addtextitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Public Sub AddTextItem (Key As String, Title As Ob";
RDebugUtils.currentLine=16187393;
 //BA.debugLineNum = 16187393;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_TEXT, Ke";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_text /*int*/ ,_key)));
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="End Sub";
return "";
}
public String  _addtimeitem(b4j.example.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addtimeitem", true))
	 {return ((String) Debug.delegate(ba, "addtimeitem", new Object[] {_key,_title}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Public Sub AddTimeItem (Key As String, Title As Ob";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_time /*int*/ ,_key);
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="pi.Extra = CreateMap(\"24\": False)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("24"),(Object)(__c.False)});
RDebugUtils.currentLine=16515075;
 //BA.debugLineNum = 16515075;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=16515076;
 //BA.debugLineNum = 16515076;BA.debugLine="End Sub";
return "";
}
public String  _b4xcombobox1_selectedindexchanged(b4j.example.preferencesdialog __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "b4xcombobox1_selectedindexchanged", true))
	 {return ((String) Debug.delegate(ba, "b4xcombobox1_selectedindexchanged", new Object[] {_index}));}
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Private Sub B4XComboBox1_SelectedIndexChanged (Ind";
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="End Sub";
return "";
}
public String  _b4xswitch1_valuechanged(b4j.example.preferencesdialog __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "b4xswitch1_valuechanged", true))
	 {return ((String) Debug.delegate(ba, "b4xswitch1_valuechanged", new Object[] {_value}));}
RDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Private Sub B4XSwitch1_ValueChanged (Value As Bool";
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="End Sub";
return "";
}
public boolean  _backkeypressed(b4j.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "backkeypressed", true))
	 {return ((Boolean) Debug.delegate(ba, "backkeypressed", null));}
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Public Sub BackKeyPressed As Boolean";
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="If Dialog.Visible Then";
if (__ref._dialog /*b4j.example.b4xdialog*/ ._getvisible /*boolean*/ (null)) { 
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="Dialog.Close(xui.DialogResponse_Cancel)";
__ref._dialog /*b4j.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=15859715;
 //BA.debugLineNum = 15859715;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=15859717;
 //BA.debugLineNum = 15859717;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=15859718;
 //BA.debugLineNum = 15859718;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=15466499;
 //BA.debugLineNum = 15466499;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4j.example.customlistview();
RDebugUtils.currentLine=15466500;
 //BA.debugLineNum = 15466500;BA.debugLine="Type B4XPrefItem (Title As Object, ItemType As In";
;
RDebugUtils.currentLine=15466501;
 //BA.debugLineNum = 15466501;BA.debugLine="Public PrefItems As List";
_prefitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15466502;
 //BA.debugLineNum = 15466502;BA.debugLine="Public TYPE_BOOLEAN = 1, TYPE_TEXT = 2, TYPE_DATE";
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
RDebugUtils.currentLine=15466505;
 //BA.debugLineNum = 15466505;BA.debugLine="Public DateTemplate As B4XDateTemplate";
_datetemplate = new b4j.example.b4xdatetemplate();
RDebugUtils.currentLine=15466506;
 //BA.debugLineNum = 15466506;BA.debugLine="Public LongTextTemplate As B4XLongTextTemplate";
_longtexttemplate = new b4j.example.b4xlongtexttemplate();
RDebugUtils.currentLine=15466507;
 //BA.debugLineNum = 15466507;BA.debugLine="Public Dialog As B4XDialog";
_dialog = new b4j.example.b4xdialog();
RDebugUtils.currentLine=15466508;
 //BA.debugLineNum = 15466508;BA.debugLine="Private RESULT_SHOWING_NESTED_DIALOG As Int = 100";
_result_showing_nested_dialog = (int) (100);
RDebugUtils.currentLine=15466509;
 //BA.debugLineNum = 15466509;BA.debugLine="Private NestedDialogItemIndex As Int";
_nesteddialogitemindex = 0;
RDebugUtils.currentLine=15466510;
 //BA.debugLineNum = 15466510;BA.debugLine="Private mTitle As Object";
_mtitle = new Object();
RDebugUtils.currentLine=15466511;
 //BA.debugLineNum = 15466511;BA.debugLine="Public SearchTemplate As B4XSearchTemplate";
_searchtemplate = new b4j.example.b4xsearchtemplate();
RDebugUtils.currentLine=15466512;
 //BA.debugLineNum = 15466512;BA.debugLine="Private Template As Object";
_template = new Object();
RDebugUtils.currentLine=15466513;
 //BA.debugLineNum = 15466513;BA.debugLine="Public ColorTemplate As B4XColorTemplate";
_colortemplate = new b4j.example.b4xcolortemplate();
RDebugUtils.currentLine=15466514;
 //BA.debugLineNum = 15466514;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
_b4xcombobox1 = new b4j.example.b4xcombobox();
RDebugUtils.currentLine=15466515;
 //BA.debugLineNum = 15466515;BA.debugLine="Public const THEME_DARK = 1, THEME_LIGHT = 2 As I";
_theme_dark = (int) (1);
_theme_light = (int) (2);
RDebugUtils.currentLine=15466516;
 //BA.debugLineNum = 15466516;BA.debugLine="Private mTheme As Int";
_mtheme = 0;
RDebugUtils.currentLine=15466517;
 //BA.debugLineNum = 15466517;BA.debugLine="Public ItemsBackgroundColor As Int";
_itemsbackgroundcolor = 0;
RDebugUtils.currentLine=15466518;
 //BA.debugLineNum = 15466518;BA.debugLine="Public TextColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=15466519;
 //BA.debugLineNum = 15466519;BA.debugLine="Public SeparatorBackgroundColor, SeparatorTextCol";
_separatorbackgroundcolor = 0;
_separatortextcolor = 0;
RDebugUtils.currentLine=15466520;
 //BA.debugLineNum = 15466520;BA.debugLine="Private mCallback As Object";
_mcallback = new Object();
RDebugUtils.currentLine=15466521;
 //BA.debugLineNum = 15466521;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=15466522;
 //BA.debugLineNum = 15466522;BA.debugLine="Public DefaultHintFont As B4XFont";
_defaulthintfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=15466523;
 //BA.debugLineNum = 15466523;BA.debugLine="Public DefaultHintLargeSize As Int";
_defaulthintlargesize = 0;
RDebugUtils.currentLine=15466524;
 //BA.debugLineNum = 15466524;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=17235968;
 //BA.debugLineNum = 17235968;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=17235969;
 //BA.debugLineNum = 17235969;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="PrefItems.Clear";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=17235971;
 //BA.debugLineNum = 17235971;BA.debugLine="End Sub";
return "";
}
public String  _colortohex(b4j.example.preferencesdialog __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "colortohex", true))
	 {return ((String) Debug.delegate(ba, "colortohex", new Object[] {_clr}));}
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
RDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Private Sub ColorToHex(clr As Int) As String";
RDebugUtils.currentLine=18874369;
 //BA.debugLineNum = 18874369;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="Return bc.HexFromBytes(bc.IntsToBytes(Array As In";
if (true) return _bc.HexFromBytes(_bc.IntsToBytes(new int[]{_clr}));
RDebugUtils.currentLine=18874371;
 //BA.debugLineNum = 18874371;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Private Sub CommitChanges (Data As Map) As Boolean";
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="Dim Temp As Map";
_temp = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="Temp.Initialize";
_temp.Initialize();
RDebugUtils.currentLine=17825795;
 //BA.debugLineNum = 17825795;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=17825796;
 //BA.debugLineNum = 17825796;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = __ref._customlistview1 /*b4j.example.customlistview*/ ._getrawlistitem(_i);
RDebugUtils.currentLine=17825797;
 //BA.debugLineNum = 17825797;BA.debugLine="If (Item.Value Is B4XPrefItem) = False Then Exit";
if ((_item.Value instanceof b4j.example.preferencesdialog._b4xprefitem)==__c.False) { 
if (true) break;};
RDebugUtils.currentLine=17825798;
 //BA.debugLineNum = 17825798;BA.debugLine="Dim PrefItem As B4XPrefItem = Item.Value";
_prefitem = (b4j.example.preferencesdialog._b4xprefitem)(_item.Value);
RDebugUtils.currentLine=17825799;
 //BA.debugLineNum = 17825799;BA.debugLine="Dim ItemPanel As B4XView = Item.Panel.GetView(0)";
_itempanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_itempanel = _item.Panel.GetView((int) (0));
RDebugUtils.currentLine=17825800;
 //BA.debugLineNum = 17825800;BA.debugLine="Dim Required As Boolean = PrefItem.Required";
_required = _prefitem.Required /*boolean*/ ;
RDebugUtils.currentLine=17825801;
 //BA.debugLineNum = 17825801;BA.debugLine="Dim Value As Object";
_value = new Object();
RDebugUtils.currentLine=17825802;
 //BA.debugLineNum = 17825802;BA.debugLine="Select PrefItem.ItemType";
switch (BA.switchObjectToInt(_prefitem.ItemType /*int*/ ,__ref._type_boolean /*int*/ ,__ref._type_text /*int*/ ,__ref._type_password /*int*/ ,__ref._type_multilinetext /*int*/ ,__ref._type_number /*int*/ ,__ref._type_decimalnumber /*int*/ ,__ref._type_date /*int*/ ,__ref._type_time /*int*/ ,__ref._type_numericrange /*int*/ ,__ref._type_options /*int*/ ,__ref._type_shortoptions /*int*/ ,__ref._type_color /*int*/ ,__ref._type_separator /*int*/ ,__ref._type_explanation /*int*/ )) {
case 0: {
RDebugUtils.currentLine=17825804;
 //BA.debugLineNum = 17825804;BA.debugLine="Dim switch As B4XSwitch = ItemPanel.GetView(1)";
_switch = (b4j.example.b4xswitch)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=17825805;
 //BA.debugLineNum = 17825805;BA.debugLine="Value = switch.Value";
_value = (Object)(_switch._getvalue /*boolean*/ (null));
 break; }
case 1: 
case 2: 
case 3: {
RDebugUtils.currentLine=17825807;
 //BA.debugLineNum = 17825807;BA.debugLine="Dim ft As B4XFloatTextField = ItemPanel.GetVie";
_ft = (b4j.example.b4xfloattextfield)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=17825808;
 //BA.debugLineNum = 17825808;BA.debugLine="Value = ft.Text";
_value = (Object)(_ft._gettext /*String*/ (null));
 break; }
case 4: 
case 5: {
RDebugUtils.currentLine=17825811;
 //BA.debugLineNum = 17825811;BA.debugLine="Dim ft As B4XFloatTextField = ItemPanel.GetVie";
_ft = (b4j.example.b4xfloattextfield)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=17825812;
 //BA.debugLineNum = 17825812;BA.debugLine="Dim n As Double";
_n = 0;
RDebugUtils.currentLine=17825813;
 //BA.debugLineNum = 17825813;BA.debugLine="If ft.Text <> \"\" Then";
if ((_ft._gettext /*String*/ (null)).equals("") == false) { 
RDebugUtils.currentLine=17825814;
 //BA.debugLineNum = 17825814;BA.debugLine="If IsNumber(ft.Text) Then";
if (__c.IsNumber(_ft._gettext /*String*/ (null))) { 
RDebugUtils.currentLine=17825815;
 //BA.debugLineNum = 17825815;BA.debugLine="n = ft.Text";
_n = (double)(Double.parseDouble(_ft._gettext /*String*/ (null)));
RDebugUtils.currentLine=17825816;
 //BA.debugLineNum = 17825816;BA.debugLine="If PrefItem.ItemType = TYPE_NUMBER Then";
if (_prefitem.ItemType /*int*/ ==__ref._type_number /*int*/ ) { 
RDebugUtils.currentLine=17825817;
 //BA.debugLineNum = 17825817;BA.debugLine="Dim n2 As Int = n";
_n2 = (int) (_n);
RDebugUtils.currentLine=17825818;
 //BA.debugLineNum = 17825818;BA.debugLine="Value = n2";
_value = (Object)(_n2);
 }else {
RDebugUtils.currentLine=17825820;
 //BA.debugLineNum = 17825820;BA.debugLine="Value = n";
_value = (Object)(_n);
 };
 }else {
RDebugUtils.currentLine=17825823;
 //BA.debugLineNum = 17825823;BA.debugLine="GoToItem(i)";
__ref._gotoitem /*void*/ (null,_i);
RDebugUtils.currentLine=17825824;
 //BA.debugLineNum = 17825824;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }else {
RDebugUtils.currentLine=17825827;
 //BA.debugLineNum = 17825827;BA.debugLine="Value = \"\"";
_value = (Object)("");
 };
 break; }
case 6: {
RDebugUtils.currentLine=17825830;
 //BA.debugLineNum = 17825830;BA.debugLine="Value = DateTime.DateParse(ItemPanel.GetView(1";
_value = (Object)(__c.DateTime.DateParse(_itempanel.GetView((int) (1)).getText()));
 break; }
case 7: {
RDebugUtils.currentLine=17825832;
 //BA.debugLineNum = 17825832;BA.debugLine="Dim pmHours As B4XPlusMinus = ItemPanel.GetVie";
_pmhours = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=17825833;
 //BA.debugLineNum = 17825833;BA.debugLine="Dim pmMinutes As B4XPlusMinus = ItemPanel.GetV";
_pmminutes = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=17825834;
 //BA.debugLineNum = 17825834;BA.debugLine="Dim pmAMPM As B4XPlusMinus = ItemPanel.GetView";
_pmampm = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (2)).getTag());
RDebugUtils.currentLine=17825835;
 //BA.debugLineNum = 17825835;BA.debugLine="Dim p As Period";
_p = new b4j.example.dateutils._period();
RDebugUtils.currentLine=17825836;
 //BA.debugLineNum = 17825836;BA.debugLine="p.Initialize";
_p.Initialize();
RDebugUtils.currentLine=17825837;
 //BA.debugLineNum = 17825837;BA.debugLine="p.Hours = pmHours.SelectedValue";
_p.Hours = (int)(BA.ObjectToNumber(_pmhours._getselectedvalue /*Object*/ (null)));
RDebugUtils.currentLine=17825838;
 //BA.debugLineNum = 17825838;BA.debugLine="If PrefItem.Extra.GetDefault(\"24\", False) = Fa";
if ((_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("24"),(Object)(__c.False))).equals((Object)(__c.False))) { 
RDebugUtils.currentLine=17825839;
 //BA.debugLineNum = 17825839;BA.debugLine="If p.Hours = 12 Then p.Hours = 0";
if (_p.Hours==12) { 
_p.Hours = (int) (0);};
RDebugUtils.currentLine=17825840;
 //BA.debugLineNum = 17825840;BA.debugLine="If pmAMPM.SelectedValue = \"pm\" Then p.Hours =";
if ((_pmampm._getselectedvalue /*Object*/ (null)).equals((Object)("pm"))) { 
_p.Hours = (int) (_p.Hours+12);};
 };
RDebugUtils.currentLine=17825842;
 //BA.debugLineNum = 17825842;BA.debugLine="p.Minutes = pmMinutes.SelectedValue";
_p.Minutes = (int)(BA.ObjectToNumber(_pmminutes._getselectedvalue /*Object*/ (null)));
RDebugUtils.currentLine=17825843;
 //BA.debugLineNum = 17825843;BA.debugLine="Value = p";
_value = (Object)(_p);
 break; }
case 8: {
RDebugUtils.currentLine=17825845;
 //BA.debugLineNum = 17825845;BA.debugLine="Dim pm As B4XPlusMinus = ItemPanel.GetView(0).";
_pm = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=17825846;
 //BA.debugLineNum = 17825846;BA.debugLine="Value = pm.SelectedValue";
_value = _pm._getselectedvalue /*Object*/ (null);
 break; }
case 9: {
RDebugUtils.currentLine=17825848;
 //BA.debugLineNum = 17825848;BA.debugLine="Value = ItemPanel.GetView(1).Text";
_value = (Object)(_itempanel.GetView((int) (1)).getText());
 break; }
case 10: {
RDebugUtils.currentLine=17825850;
 //BA.debugLineNum = 17825850;BA.debugLine="Dim cmb As B4XComboBox = ItemPanel.GetView(1).";
_cmb = (b4j.example.b4xcombobox)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=17825851;
 //BA.debugLineNum = 17825851;BA.debugLine="If cmb.SelectedIndex > -1 Then Value = cmb.Get";
if (_cmb._getselectedindex /*int*/ (null)>-1) { 
_value = (Object)(_cmb._getitem /*String*/ (null,_cmb._getselectedindex /*int*/ (null)));}
else {
_value = (Object)("");};
 break; }
case 11: {
RDebugUtils.currentLine=17825853;
 //BA.debugLineNum = 17825853;BA.debugLine="Value = ItemPanel.GetView(1).Color";
_value = (Object)(_itempanel.GetView((int) (1)).getColor());
 break; }
case 12: 
case 13: {
RDebugUtils.currentLine=17825855;
 //BA.debugLineNum = 17825855;BA.debugLine="Continue";
if (true) continue;
 break; }
}
;
RDebugUtils.currentLine=17825857;
 //BA.debugLineNum = 17825857;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
RDebugUtils.currentLine=17825858;
 //BA.debugLineNum = 17825858;BA.debugLine="If Required Then";
if (_required) { 
RDebugUtils.currentLine=17825859;
 //BA.debugLineNum = 17825859;BA.debugLine="GoToItem(i)";
__ref._gotoitem /*void*/ (null,_i);
RDebugUtils.currentLine=17825860;
 //BA.debugLineNum = 17825860;BA.debugLine="Return False";
if (true) return __c.False;
 }else {
RDebugUtils.currentLine=17825862;
 //BA.debugLineNum = 17825862;BA.debugLine="Continue";
if (true) continue;
 };
 };
RDebugUtils.currentLine=17825865;
 //BA.debugLineNum = 17825865;BA.debugLine="Temp.Put(PrefItem.Key, Value)";
_temp.Put((Object)(_prefitem.Key /*String*/ ),_value);
 }
};
RDebugUtils.currentLine=17825867;
 //BA.debugLineNum = 17825867;BA.debugLine="If mEventName <> \"\" And xui.SubExists(mCallback,";
if ((__ref._meventname /*String*/ ).equals("") == false && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_IsValid",(int) (1))) { 
RDebugUtils.currentLine=17825868;
 //BA.debugLineNum = 17825868;BA.debugLine="Dim Valid As Boolean = CallSub2(mCallback, mEven";
_valid = BA.ObjectToBoolean(__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_IsValid",(Object)(_temp)));
RDebugUtils.currentLine=17825869;
 //BA.debugLineNum = 17825869;BA.debugLine="If Valid = False Then Return False";
if (_valid==__c.False) { 
if (true) return __c.False;};
 };
RDebugUtils.currentLine=17825871;
 //BA.debugLineNum = 17825871;BA.debugLine="For Each key As String In Temp.Keys";
{
final anywheresoftware.b4a.BA.IterableList group78 = _temp.Keys();
final int groupLen78 = group78.getSize()
;int index78 = 0;
;
for (; index78 < groupLen78;index78++){
_key = BA.ObjectToString(group78.Get(index78));
RDebugUtils.currentLine=17825872;
 //BA.debugLineNum = 17825872;BA.debugLine="Data.Put(key, Temp.Get(key))";
_data.Put((Object)(_key),_temp.Get((Object)(_key)));
 }
};
RDebugUtils.currentLine=17825874;
 //BA.debugLineNum = 17825874;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=17825875;
 //BA.debugLineNum = 17825875;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="CustomListView1.JumpToItem(i)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._jumptoitem(_i);
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="Dim p As B4XView = CustomListView1.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="For i = 0 To 3";
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
RDebugUtils.currentLine=17956868;
 //BA.debugLineNum = 17956868;BA.debugLine="Dim duration As Int = 100 - i * 20";
_duration = (int) (100-_i*20);
RDebugUtils.currentLine=17956869;
 //BA.debugLineNum = 17956869;BA.debugLine="p.SetLayoutAnimated(duration, -10dip, 0, p.Width";
_p.SetLayoutAnimated(_duration,-parent.__c.DipToCurrent((int) (10)),0,_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=17956870;
 //BA.debugLineNum = 17956870;BA.debugLine="Sleep(duration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preferencesdialog", "gotoitem"),_duration);
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
RDebugUtils.currentLine=17956871;
 //BA.debugLineNum = 17956871;BA.debugLine="p.SetLayoutAnimated(duration, 10dip, 0, p.Width,";
_p.SetLayoutAnimated(_duration,parent.__c.DipToCurrent((int) (10)),0,_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=17956872;
 //BA.debugLineNum = 17956872;BA.debugLine="Sleep(duration)";
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
RDebugUtils.currentLine=17956874;
 //BA.debugLineNum = 17956874;BA.debugLine="p.SetLayoutAnimated(50, 0, 0, p.Width, p.Height)";
_p.SetLayoutAnimated((int) (50),0,0,_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=17956875;
 //BA.debugLineNum = 17956875;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
RDebugUtils.currentLine=18350081;
 //BA.debugLineNum = 18350081;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="lbl.Initialize(EventName)";
_lbl.Initialize(ba,_eventname);
RDebugUtils.currentLine=18350083;
 //BA.debugLineNum = 18350083;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=18350084;
 //BA.debugLineNum = 18350084;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Private Sub CreateLayouts (PrefItem As B4XPrefItem";
RDebugUtils.currentLine=17629185;
 //BA.debugLineNum = 17629185;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="p.Width = CustomListView1.sv.ScrollViewContentWid";
_p.setWidth(__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewContentWidth());
RDebugUtils.currentLine=17629187;
 //BA.debugLineNum = 17629187;BA.debugLine="p.Height = 50dip";
_p.setHeight(__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=17629188;
 //BA.debugLineNum = 17629188;BA.debugLine="Select PrefItem.ItemType";
switch (BA.switchObjectToInt(_prefitem.ItemType /*int*/ ,__ref._type_boolean /*int*/ ,__ref._type_multilinetext /*int*/ ,__ref._type_time /*int*/ ,__ref._type_numericrange /*int*/ ,__ref._type_text /*int*/ ,__ref._type_password /*int*/ ,__ref._type_number /*int*/ ,__ref._type_decimalnumber /*int*/ ,__ref._type_date /*int*/ ,__ref._type_options /*int*/ ,__ref._type_shortoptions /*int*/ ,__ref._type_color /*int*/ ,__ref._type_explanation /*int*/ ,__ref._type_separator /*int*/ )) {
case 0: {
RDebugUtils.currentLine=17629190;
 //BA.debugLineNum = 17629190;BA.debugLine="p.LoadLayout(\"booleanitem\")";
_p.LoadLayout("booleanitem",ba);
RDebugUtils.currentLine=17629191;
 //BA.debugLineNum = 17629191;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetV";
__ref._dialog /*b4j.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_p.GetView((int) (0)),_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=17629192;
 //BA.debugLineNum = 17629192;BA.debugLine="p.GetView(0).TextColor = TextColor";
_p.GetView((int) (0)).setTextColor(__ref._textcolor /*int*/ );
 break; }
case 1: {
RDebugUtils.currentLine=17629194;
 //BA.debugLineNum = 17629194;BA.debugLine="p.Height = PrefItem.Extra.Get(\"height\")";
_p.setHeight((double)(BA.ObjectToNumber(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("height")))));
RDebugUtils.currentLine=17629195;
 //BA.debugLineNum = 17629195;BA.debugLine="p.LoadLayout(\"textitemmulti\")";
_p.LoadLayout("textitemmulti",ba);
RDebugUtils.currentLine=17629196;
 //BA.debugLineNum = 17629196;BA.debugLine="Dim ft As B4XFloatTextField = p.GetView(0).Tag";
_ft = (b4j.example.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=17629197;
 //BA.debugLineNum = 17629197;BA.debugLine="ft.HintText = PrefItem.Title";
_ft._hinttext /*String*/  = BA.ObjectToString(_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=17629198;
 //BA.debugLineNum = 17629198;BA.debugLine="ft.HintFont = DefaultHintFont";
_ft._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._defaulthintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=17629199;
 //BA.debugLineNum = 17629199;BA.debugLine="ft.LargeLabelTextSize = DefaultHintLargeSize";
_ft._largelabeltextsize /*float*/  = (float) (__ref._defaulthintlargesize /*int*/ );
RDebugUtils.currentLine=17629200;
 //BA.debugLineNum = 17629200;BA.debugLine="ft.Update";
_ft._update /*String*/ (null);
 break; }
case 2: {
RDebugUtils.currentLine=17629202;
 //BA.debugLineNum = 17629202;BA.debugLine="CreateTimeItem(PrefItem, p)";
__ref._createtimeitem /*String*/ (null,_prefitem,_p);
 break; }
case 3: {
RDebugUtils.currentLine=17629204;
 //BA.debugLineNum = 17629204;BA.debugLine="CreateNumericRangeItem(PrefItem, p)";
__ref._createnumericrangeitem /*String*/ (null,_prefitem,_p);
 break; }
case 4: 
case 5: 
case 6: 
case 7: {
RDebugUtils.currentLine=17629206;
 //BA.debugLineNum = 17629206;BA.debugLine="p.Height = 60dip";
_p.setHeight(__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=17629207;
 //BA.debugLineNum = 17629207;BA.debugLine="If PrefItem.ItemType = TYPE_PASSWORD Then";
if (_prefitem.ItemType /*int*/ ==__ref._type_password /*int*/ ) { 
RDebugUtils.currentLine=17629208;
 //BA.debugLineNum = 17629208;BA.debugLine="p.LoadLayout(\"passworditem\")";
_p.LoadLayout("passworditem",ba);
 }else {
RDebugUtils.currentLine=17629210;
 //BA.debugLineNum = 17629210;BA.debugLine="p.LoadLayout(\"textitem\")";
_p.LoadLayout("textitem",ba);
RDebugUtils.currentLine=17629211;
 //BA.debugLineNum = 17629211;BA.debugLine="Dim ft As B4XFloatTextField = p.GetView(0).Tag";
_ft = (b4j.example.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=17629212;
 //BA.debugLineNum = 17629212;BA.debugLine="If PrefItem.ItemType = TYPE_NUMBER Then";
if (_prefitem.ItemType /*int*/ ==__ref._type_number /*int*/ ) { 
 }else 
{RDebugUtils.currentLine=17629220;
 //BA.debugLineNum = 17629220;BA.debugLine="Else If PrefItem.ItemType = TYPE_DECIMALNUMBER";
if (_prefitem.ItemType /*int*/ ==__ref._type_decimalnumber /*int*/ ) { 
 }}
;
 };
RDebugUtils.currentLine=17629231;
 //BA.debugLineNum = 17629231;BA.debugLine="Dim ft As B4XFloatTextField = p.GetView(0).Tag";
_ft = (b4j.example.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=17629232;
 //BA.debugLineNum = 17629232;BA.debugLine="ft.HintText = PrefItem.Title";
_ft._hinttext /*String*/  = BA.ObjectToString(_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=17629233;
 //BA.debugLineNum = 17629233;BA.debugLine="ft.HintFont = DefaultHintFont";
_ft._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._defaulthintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=17629234;
 //BA.debugLineNum = 17629234;BA.debugLine="ft.LargeLabelTextSize = DefaultHintLargeSize";
_ft._largelabeltextsize /*float*/  = (float) (__ref._defaulthintlargesize /*int*/ );
RDebugUtils.currentLine=17629235;
 //BA.debugLineNum = 17629235;BA.debugLine="ft.Update";
_ft._update /*String*/ (null);
 break; }
case 8: {
RDebugUtils.currentLine=17629237;
 //BA.debugLineNum = 17629237;BA.debugLine="TwoLabelsLayout(\"lblDate\", p, PrefItem)";
__ref._twolabelslayout /*String*/ (null,"lblDate",_p,_prefitem);
 break; }
case 9: {
RDebugUtils.currentLine=17629239;
 //BA.debugLineNum = 17629239;BA.debugLine="TwoLabelsLayout(\"lblOptions\", p, PrefItem)";
__ref._twolabelslayout /*String*/ (null,"lblOptions",_p,_prefitem);
 break; }
case 10: {
RDebugUtils.currentLine=17629241;
 //BA.debugLineNum = 17629241;BA.debugLine="p.LoadLayout(\"shortoptions\")";
_p.LoadLayout("shortoptions",ba);
RDebugUtils.currentLine=17629242;
 //BA.debugLineNum = 17629242;BA.debugLine="p.GetView(0).TextColor = TextColor";
_p.GetView((int) (0)).setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=17629243;
 //BA.debugLineNum = 17629243;BA.debugLine="Dim original As List = PrefItem.Extra.Get(\"opti";
_original = new anywheresoftware.b4a.objects.collections.List();
_original = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("options"))));
RDebugUtils.currentLine=17629263;
 //BA.debugLineNum = 17629263;BA.debugLine="B4XComboBox1.SetItems(original)";
__ref._b4xcombobox1 /*b4j.example.b4xcombobox*/ ._setitems /*String*/ (null,_original);
RDebugUtils.currentLine=17629265;
 //BA.debugLineNum = 17629265;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetV";
__ref._dialog /*b4j.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_p.GetView((int) (0)),_prefitem.Title /*Object*/ );
 break; }
case 11: {
RDebugUtils.currentLine=17629267;
 //BA.debugLineNum = 17629267;BA.debugLine="p.Height = 60dip";
_p.setHeight(__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=17629268;
 //BA.debugLineNum = 17629268;BA.debugLine="p.LoadLayout(\"coloritem\")";
_p.LoadLayout("coloritem",ba);
RDebugUtils.currentLine=17629269;
 //BA.debugLineNum = 17629269;BA.debugLine="Dim tf As B4XFloatTextField = p.GetView(0).Tag";
_tf = (b4j.example.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=17629270;
 //BA.debugLineNum = 17629270;BA.debugLine="tf.HintFont = DefaultHintFont";
_tf._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._defaulthintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=17629271;
 //BA.debugLineNum = 17629271;BA.debugLine="tf.LargeLabelTextSize = DefaultHintLargeSize";
_tf._largelabeltextsize /*float*/  = (float) (__ref._defaulthintlargesize /*int*/ );
RDebugUtils.currentLine=17629272;
 //BA.debugLineNum = 17629272;BA.debugLine="tf.HintText = PrefItem.Title";
_tf._hinttext /*String*/  = BA.ObjectToString(_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=17629273;
 //BA.debugLineNum = 17629273;BA.debugLine="tf.Update";
_tf._update /*String*/ (null);
 break; }
case 12: {
RDebugUtils.currentLine=17629279;
 //BA.debugLineNum = 17629279;BA.debugLine="TwoLabelsLayout(\"lblExplanation\", p, PrefItem)";
__ref._twolabelslayout /*String*/ (null,"lblExplanation",_p,_prefitem);
 break; }
case 13: {
RDebugUtils.currentLine=17629281;
 //BA.debugLineNum = 17629281;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=17629282;
 //BA.debugLineNum = 17629282;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=17629283;
 //BA.debugLineNum = 17629283;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=17629284;
 //BA.debugLineNum = 17629284;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=17629285;
 //BA.debugLineNum = 17629285;BA.debugLine="xlbl.TextColor = SeparatorTextColor";
_xlbl.setTextColor(__ref._separatortextcolor /*int*/ );
RDebugUtils.currentLine=17629286;
 //BA.debugLineNum = 17629286;BA.debugLine="xlbl.Font = xui.CreateDefaultBoldFont(14)";
_xlbl.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (14)));
RDebugUtils.currentLine=17629287;
 //BA.debugLineNum = 17629287;BA.debugLine="xlbl.Color = SeparatorBackgroundColor";
_xlbl.setColor(__ref._separatorbackgroundcolor /*int*/ );
RDebugUtils.currentLine=17629288;
 //BA.debugLineNum = 17629288;BA.debugLine="p.Height = 30dip";
_p.setHeight(__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=17629289;
 //BA.debugLineNum = 17629289;BA.debugLine="p.AddView(xlbl, 0, 0, p.Width, p.Height)";
_p.AddView((javafx.scene.Node)(_xlbl.getObject()),0,0,_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=17629290;
 //BA.debugLineNum = 17629290;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(xlbl,";
__ref._dialog /*b4j.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_xlbl,_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=17629291;
 //BA.debugLineNum = 17629291;BA.debugLine="PrefItem.Required = False";
_prefitem.Required /*boolean*/  = __c.False;
 break; }
}
;
RDebugUtils.currentLine=17629293;
 //BA.debugLineNum = 17629293;BA.debugLine="If PrefItem.Required Then";
if (_prefitem.Required /*boolean*/ ) { 
RDebugUtils.currentLine=17629294;
 //BA.debugLineNum = 17629294;BA.debugLine="Dim rlbl As Label";
_rlbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=17629295;
 //BA.debugLineNum = 17629295;BA.debugLine="rlbl.Initialize(\"\")";
_rlbl.Initialize(ba,"");
RDebugUtils.currentLine=17629296;
 //BA.debugLineNum = 17629296;BA.debugLine="Dim xlbl As B4XView = rlbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_rlbl.getObject()));
RDebugUtils.currentLine=17629297;
 //BA.debugLineNum = 17629297;BA.debugLine="xlbl.Text = \"*\"";
_xlbl.setText("*");
RDebugUtils.currentLine=17629298;
 //BA.debugLineNum = 17629298;BA.debugLine="xlbl.TextColor = xui.Color_Red";
_xlbl.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=17629299;
 //BA.debugLineNum = 17629299;BA.debugLine="xlbl.TextSize = 11";
_xlbl.setTextSize(11);
RDebugUtils.currentLine=17629300;
 //BA.debugLineNum = 17629300;BA.debugLine="xlbl.SetTextAlignment(\"TOP\", \"LEFT\")";
_xlbl.SetTextAlignment("TOP","LEFT");
RDebugUtils.currentLine=17629301;
 //BA.debugLineNum = 17629301;BA.debugLine="p.AddView(xlbl, 01dip, 0dip, 10dip, 10dip)";
_p.AddView((javafx.scene.Node)(_xlbl.getObject()),__c.DipToCurrent((int) (01)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)));
 };
RDebugUtils.currentLine=17629303;
 //BA.debugLineNum = 17629303;BA.debugLine="p.Color = ItemsBackgroundColor";
_p.setColor(__ref._itemsbackgroundcolor /*int*/ );
RDebugUtils.currentLine=17629304;
 //BA.debugLineNum = 17629304;BA.debugLine="If mTheme <> THEME_DARK Then";
if (__ref._mtheme /*int*/ !=__ref._theme_dark /*int*/ ) { 
RDebugUtils.currentLine=17629305;
 //BA.debugLineNum = 17629305;BA.debugLine="If p.GetView(0).Tag Is B4XFloatTextField Then";
if (_p.GetView((int) (0)).getTag() instanceof b4j.example.b4xfloattextfield) { 
RDebugUtils.currentLine=17629306;
 //BA.debugLineNum = 17629306;BA.debugLine="Dim tf As B4XFloatTextField = p.GetView(0).Tag";
_tf = (b4j.example.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=17629307;
 //BA.debugLineNum = 17629307;BA.debugLine="tf.TextField.TextColor = TextColor";
_tf._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=17629308;
 //BA.debugLineNum = 17629308;BA.debugLine="tf.NonFocusedHintColor = TextColor";
_tf._nonfocusedhintcolor /*int*/  = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=17629309;
 //BA.debugLineNum = 17629309;BA.debugLine="tf.Update";
_tf._update /*String*/ (null);
RDebugUtils.currentLine=17629310;
 //BA.debugLineNum = 17629310;BA.debugLine="If tf.lblClear.IsInitialized Then tf.lblClear.T";
if (_tf._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
_tf._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._textcolor /*int*/ );};
RDebugUtils.currentLine=17629311;
 //BA.debugLineNum = 17629311;BA.debugLine="If tf.lblV.IsInitialized Then tf.lblV.TextColor";
if (_tf._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
_tf._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._textcolor /*int*/ );};
 };
 };
RDebugUtils.currentLine=17629314;
 //BA.debugLineNum = 17629314;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=17629315;
 //BA.debugLineNum = 17629315;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Private Sub CreateTimeItem (PrefItem As B4XPrefIte";
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="p.Height = 60dip";
_p.setHeight(__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="Dim is24 As Boolean = PrefItem.Extra.GetDefault(\"";
_is24 = BA.ObjectToBoolean(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("24"),(Object)(__c.False)));
RDebugUtils.currentLine=17760259;
 //BA.debugLineNum = 17760259;BA.debugLine="If is24 Then";
if (_is24) { 
RDebugUtils.currentLine=17760260;
 //BA.debugLineNum = 17760260;BA.debugLine="p.LoadLayout(\"timeitem24\")";
_p.LoadLayout("timeitem24",ba);
 }else {
RDebugUtils.currentLine=17760262;
 //BA.debugLineNum = 17760262;BA.debugLine="p.LoadLayout(\"timeitem\")";
_p.LoadLayout("timeitem",ba);
 };
RDebugUtils.currentLine=17760264;
 //BA.debugLineNum = 17760264;BA.debugLine="Dim pmHours As B4XPlusMinus = p.GetView(0).Tag";
_pmhours = (b4j.example.b4xplusminus)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=17760265;
 //BA.debugLineNum = 17760265;BA.debugLine="pmHours.RapidPeriod2 = 100";
_pmhours._rapidperiod2 /*int*/  = (int) (100);
RDebugUtils.currentLine=17760266;
 //BA.debugLineNum = 17760266;BA.debugLine="Dim pmMinutes As B4XPlusMinus = p.GetView(1).Tag";
_pmminutes = (b4j.example.b4xplusminus)(_p.GetView((int) (1)).getTag());
RDebugUtils.currentLine=17760267;
 //BA.debugLineNum = 17760267;BA.debugLine="Dim pmAMPM As B4XPlusMinus = p.GetView(2).Tag";
_pmampm = (b4j.example.b4xplusminus)(_p.GetView((int) (2)).getTag());
RDebugUtils.currentLine=17760268;
 //BA.debugLineNum = 17760268;BA.debugLine="If xui.IsB4J = False Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()==__c.False) { 
RDebugUtils.currentLine=17760269;
 //BA.debugLineNum = 17760269;BA.debugLine="Dim clr As Int = CustomListView1.sv.ScrollViewIn";
_clr = __ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewInnerPanel().getColor();
RDebugUtils.currentLine=17760270;
 //BA.debugLineNum = 17760270;BA.debugLine="pmHours.mBase.SetColorAndBorder(xui.Color_Transp";
_pmhours._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (1)),_clr,0);
RDebugUtils.currentLine=17760271;
 //BA.debugLineNum = 17760271;BA.debugLine="pmMinutes.mBase.SetColorAndBorder(xui.Color_Tran";
_pmminutes._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (1)),_clr,0);
RDebugUtils.currentLine=17760272;
 //BA.debugLineNum = 17760272;BA.debugLine="pmAMPM.mBase.SetColorAndBorder(xui.Color_Transpa";
_pmampm._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (1)),_clr,0);
 };
RDebugUtils.currentLine=17760275;
 //BA.debugLineNum = 17760275;BA.debugLine="If is24 Then";
if (_is24) { 
RDebugUtils.currentLine=17760276;
 //BA.debugLineNum = 17760276;BA.debugLine="pmHours.SetNumericRange(0, 23, 1)";
_pmhours._setnumericrange /*String*/ (null,0,23,1);
 }else {
RDebugUtils.currentLine=17760278;
 //BA.debugLineNum = 17760278;BA.debugLine="pmHours.SetNumericRange(1, 12, 1)";
_pmhours._setnumericrange /*String*/ (null,1,12,1);
 };
RDebugUtils.currentLine=17760280;
 //BA.debugLineNum = 17760280;BA.debugLine="pmMinutes.SetNumericRange(0, 59, 1)";
_pmminutes._setnumericrange /*String*/ (null,0,59,1);
RDebugUtils.currentLine=17760281;
 //BA.debugLineNum = 17760281;BA.debugLine="pmMinutes.Formatter.GetDefaultFormat.MinimumInteg";
_pmminutes._formatter /*b4j.example.b4xformatter*/ ._getdefaultformat /*b4j.example.b4xformatter._b4xformatdata*/ (null).MinimumIntegers /*int*/  = (int) (2);
RDebugUtils.currentLine=17760283;
 //BA.debugLineNum = 17760283;BA.debugLine="pmAMPM.SetStringItems(Array(\"am\", \"pm\"))";
_pmampm._setstringitems /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("am"),(Object)("pm")}));
RDebugUtils.currentLine=17760284;
 //BA.debugLineNum = 17760284;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetVie";
__ref._dialog /*b4j.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_p.GetView((int) (3)),_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=17760285;
 //BA.debugLineNum = 17760285;BA.debugLine="For Each v As B4XView In p.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group27 = _p.GetAllViewsRecursive();
final int groupLen27 = group27.getSize()
;int index27 = 0;
;
for (; index27 < groupLen27;index27++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group27.Get(index27)));
RDebugUtils.currentLine=17760286;
 //BA.debugLineNum = 17760286;BA.debugLine="If v Is Label Then v.TextColor = TextColor";
if (_v.getObjectOrNull() instanceof javafx.scene.control.Label) { 
_v.setTextColor(__ref._textcolor /*int*/ );};
 }
};
RDebugUtils.currentLine=17760288;
 //BA.debugLineNum = 17760288;BA.debugLine="End Sub";
return "";
}
public String  _createnumericrangeitem(b4j.example.preferencesdialog __ref,b4j.example.preferencesdialog._b4xprefitem _prefitem,anywheresoftware.b4a.objects.B4XViewWrapper _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "createnumericrangeitem", true))
	 {return ((String) Debug.delegate(ba, "createnumericrangeitem", new Object[] {_prefitem,_p}));}
b4j.example.b4xplusminus _pm = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Private Sub CreateNumericRangeItem (PrefItem As B4";
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="p.LoadLayout(\"numericrange\")";
_p.LoadLayout("numericrange",ba);
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="Dim pm As B4XPlusMinus = p.GetView(0).Tag";
_pm = (b4j.example.b4xplusminus)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=17694723;
 //BA.debugLineNum = 17694723;BA.debugLine="pm.SetNumericRange(PrefItem.Extra.Get(\"start\"), P";
_pm._setnumericrange /*String*/ (null,(double)(BA.ObjectToNumber(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("start")))),(double)(BA.ObjectToNumber(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("end")))),(double)(BA.ObjectToNumber(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("interval")))));
RDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="pm.Formatter.GetDefaultFormat.MaximumFractions =";
_pm._formatter /*b4j.example.b4xformatter*/ ._getdefaultformat /*b4j.example.b4xformatter._b4xformatdata*/ (null).MaximumFractions /*int*/  = (int) (2);
RDebugUtils.currentLine=17694725;
 //BA.debugLineNum = 17694725;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetVie";
__ref._dialog /*b4j.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_p.GetView((int) (1)),_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=17694726;
 //BA.debugLineNum = 17694726;BA.debugLine="For Each v As B4XView In p.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group6 = _p.GetAllViewsRecursive();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group6.Get(index6)));
RDebugUtils.currentLine=17694727;
 //BA.debugLineNum = 17694727;BA.debugLine="If v Is Label Then v.TextColor = TextColor";
if (_v.getObjectOrNull() instanceof javafx.scene.control.Label) { 
_v.setTextColor(__ref._textcolor /*int*/ );};
 }
};
RDebugUtils.currentLine=17694729;
 //BA.debugLineNum = 17694729;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Private Sub TwoLabelsLayout (EventName As String,";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="Dim lblTitle As B4XView = CreateLabel(EventName)";
_lbltitle = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbltitle = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_eventname);
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="lblTitle.SetTextAlignment(\"CENTER\", \"LEFT\")";
_lbltitle.SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=18022403;
 //BA.debugLineNum = 18022403;BA.debugLine="lblTitle.TextColor = TextColor";
_lbltitle.setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=18022404;
 //BA.debugLineNum = 18022404;BA.debugLine="Dim fnt As B4XFont = xui.CreateDefaultBoldFont(16";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_fnt = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (16));
RDebugUtils.currentLine=18022405;
 //BA.debugLineNum = 18022405;BA.debugLine="lblTitle.Font = fnt";
_lbltitle.setFont(_fnt);
RDebugUtils.currentLine=18022406;
 //BA.debugLineNum = 18022406;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(lblTitle";
__ref._dialog /*b4j.example.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_lbltitle,_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=18022407;
 //BA.debugLineNum = 18022407;BA.debugLine="p.AddView(lblTitle, 10dip, 10dip, p.Width - 110di";
_p.AddView((javafx.scene.Node)(_lbltitle.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)),_p.getWidth()-__c.DipToCurrent((int) (110)),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=18022408;
 //BA.debugLineNum = 18022408;BA.debugLine="Dim lblDate As B4XView = CreateLabel(EventName)";
_lbldate = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbldate = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_eventname);
RDebugUtils.currentLine=18022409;
 //BA.debugLineNum = 18022409;BA.debugLine="lblDate.TextColor = TextColor";
_lbldate.setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=18022410;
 //BA.debugLineNum = 18022410;BA.debugLine="lblDate.SetTextAlignment(\"CENTER\", \"RIGHT\")";
_lbldate.SetTextAlignment("CENTER","RIGHT");
RDebugUtils.currentLine=18022411;
 //BA.debugLineNum = 18022411;BA.debugLine="lblDate.Font = fnt";
_lbldate.setFont(_fnt);
RDebugUtils.currentLine=18022412;
 //BA.debugLineNum = 18022412;BA.debugLine="p.AddView(lblDate, p.Width - 108dip, 10dip, 98dip";
_p.AddView((javafx.scene.Node)(_lbldate.getObject()),_p.getWidth()-__c.DipToCurrent((int) (108)),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (98)),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=18022413;
 //BA.debugLineNum = 18022413;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(b4j.example.preferencesdialog __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17301504;
 //BA.debugLineNum = 17301504;BA.debugLine="Private Sub FillData (Data As Map)";
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = __ref._customlistview1 /*b4j.example.customlistview*/ ._getrawlistitem(_i);
RDebugUtils.currentLine=17301507;
 //BA.debugLineNum = 17301507;BA.debugLine="If (Item.Value Is B4XPrefItem) = False Then Exit";
if ((_item.Value instanceof b4j.example.preferencesdialog._b4xprefitem)==__c.False) { 
if (true) break;};
RDebugUtils.currentLine=17301508;
 //BA.debugLineNum = 17301508;BA.debugLine="Dim PrefItem As B4XPrefItem = Item.Value";
_prefitem = (b4j.example.preferencesdialog._b4xprefitem)(_item.Value);
RDebugUtils.currentLine=17301509;
 //BA.debugLineNum = 17301509;BA.debugLine="Dim ItemPanel As B4XView = Item.Panel.GetView(0)";
_itempanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_itempanel = _item.Panel.GetView((int) (0));
RDebugUtils.currentLine=17301510;
 //BA.debugLineNum = 17301510;BA.debugLine="Select PrefItem.ItemType";
switch (BA.switchObjectToInt(_prefitem.ItemType /*int*/ ,__ref._type_boolean /*int*/ ,__ref._type_text /*int*/ ,__ref._type_password /*int*/ ,__ref._type_number /*int*/ ,__ref._type_decimalnumber /*int*/ ,__ref._type_multilinetext /*int*/ ,__ref._type_date /*int*/ ,__ref._type_options /*int*/ ,__ref._type_shortoptions /*int*/ ,__ref._type_color /*int*/ ,__ref._type_time /*int*/ ,__ref._type_separator /*int*/ ,__ref._type_explanation /*int*/ ,__ref._type_numericrange /*int*/ )) {
case 0: {
RDebugUtils.currentLine=17301512;
 //BA.debugLineNum = 17301512;BA.debugLine="Dim switch As B4XSwitch = ItemPanel.GetView(1)";
_switch = (b4j.example.b4xswitch)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=17301513;
 //BA.debugLineNum = 17301513;BA.debugLine="switch.Value = GetPrefItemValue(PrefItem, Fals";
_switch._setvalue /*boolean*/ (null,BA.ObjectToBoolean(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(__c.False),_data)));
 break; }
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
RDebugUtils.currentLine=17301515;
 //BA.debugLineNum = 17301515;BA.debugLine="Dim ft As B4XFloatTextField = ItemPanel.GetVie";
_ft = (b4j.example.b4xfloattextfield)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=17301516;
 //BA.debugLineNum = 17301516;BA.debugLine="ft.Text = GetPrefItemValue(PrefItem, \"\", Data)";
_ft._settext /*String*/ (null,BA.ObjectToString(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(""),_data)));
 break; }
case 6: {
RDebugUtils.currentLine=17301518;
 //BA.debugLineNum = 17301518;BA.debugLine="ItemPanel.GetView(1).Text = DateTime.Date(GetP";
_itempanel.GetView((int) (1)).setText(__c.DateTime.Date(BA.ObjectToLongNumber(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(__c.DateTime.getNow()),_data))));
 break; }
case 7: {
RDebugUtils.currentLine=17301520;
 //BA.debugLineNum = 17301520;BA.debugLine="ItemPanel.GetView(1).Text = GetPrefItemValue(P";
_itempanel.GetView((int) (1)).setText(BA.ObjectToString(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(""),_data)));
 break; }
case 8: {
RDebugUtils.currentLine=17301522;
 //BA.debugLineNum = 17301522;BA.debugLine="Dim cmb As B4XComboBox = ItemPanel.GetView(1).";
_cmb = (b4j.example.b4xcombobox)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=17301523;
 //BA.debugLineNum = 17301523;BA.debugLine="Dim options As List = PrefItem.Extra.Get(\"opti";
_options = new anywheresoftware.b4a.objects.collections.List();
_options = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("options"))));
RDebugUtils.currentLine=17301524;
 //BA.debugLineNum = 17301524;BA.debugLine="cmb.SelectedIndex = Max(0, options.IndexOf(Get";
_cmb._setselectedindex /*int*/ (null,(int) (__c.Max(0,_options.IndexOf(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(""),_data)))));
 break; }
case 9: {
RDebugUtils.currentLine=17301526;
 //BA.debugLineNum = 17301526;BA.debugLine="SetLabelColor(ItemPanel.GetView(1), GetPrefIte";
__ref._setlabelcolor /*String*/ (null,_itempanel.GetView((int) (1)),(int)(BA.ObjectToNumber(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red),_data))));
RDebugUtils.currentLine=17301527;
 //BA.debugLineNum = 17301527;BA.debugLine="ItemPanel.GetView(2).Text = \"Pick\"";
_itempanel.GetView((int) (2)).setText("Pick");
 break; }
case 10: {
RDebugUtils.currentLine=17301529;
 //BA.debugLineNum = 17301529;BA.debugLine="Dim pmHours As B4XPlusMinus = ItemPanel.GetVie";
_pmhours = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=17301530;
 //BA.debugLineNum = 17301530;BA.debugLine="Dim pmMinutes As B4XPlusMinus = ItemPanel.GetV";
_pmminutes = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=17301531;
 //BA.debugLineNum = 17301531;BA.debugLine="Dim pmAMPM As B4XPlusMinus = ItemPanel.GetView";
_pmampm = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (2)).getTag());
RDebugUtils.currentLine=17301532;
 //BA.debugLineNum = 17301532;BA.debugLine="Dim p As Period";
_p = new b4j.example.dateutils._period();
RDebugUtils.currentLine=17301533;
 //BA.debugLineNum = 17301533;BA.debugLine="p = GetPrefItemValue(PrefItem, p, Data)";
_p = (b4j.example.dateutils._period)(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(_p),_data));
RDebugUtils.currentLine=17301534;
 //BA.debugLineNum = 17301534;BA.debugLine="Dim hour As Int = p.Hours";
_hour = _p.Hours;
RDebugUtils.currentLine=17301535;
 //BA.debugLineNum = 17301535;BA.debugLine="Dim m As String";
_m = "";
RDebugUtils.currentLine=17301536;
 //BA.debugLineNum = 17301536;BA.debugLine="If PrefItem.Extra.GetDefault(\"24\", False) = Fa";
if ((_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("24"),(Object)(__c.False))).equals((Object)(__c.False))) { 
RDebugUtils.currentLine=17301537;
 //BA.debugLineNum = 17301537;BA.debugLine="If hour <= 11 Then";
if (_hour<=11) { 
RDebugUtils.currentLine=17301538;
 //BA.debugLineNum = 17301538;BA.debugLine="m = \"am\"";
_m = "am";
 }else {
RDebugUtils.currentLine=17301540;
 //BA.debugLineNum = 17301540;BA.debugLine="m = \"pm\"";
_m = "pm";
RDebugUtils.currentLine=17301541;
 //BA.debugLineNum = 17301541;BA.debugLine="hour = hour - 12";
_hour = (int) (_hour-12);
 };
RDebugUtils.currentLine=17301543;
 //BA.debugLineNum = 17301543;BA.debugLine="If hour = 0 Then hour = 12";
if (_hour==0) { 
_hour = (int) (12);};
 };
RDebugUtils.currentLine=17301545;
 //BA.debugLineNum = 17301545;BA.debugLine="pmHours.SelectedValue = hour";
_pmhours._setselectedvalue /*Object*/ (null,(Object)(_hour));
RDebugUtils.currentLine=17301546;
 //BA.debugLineNum = 17301546;BA.debugLine="pmMinutes.SelectedValue = p.Minutes";
_pmminutes._setselectedvalue /*Object*/ (null,(Object)(_p.Minutes));
RDebugUtils.currentLine=17301547;
 //BA.debugLineNum = 17301547;BA.debugLine="pmAMPM.SelectedValue = m";
_pmampm._setselectedvalue /*Object*/ (null,(Object)(_m));
 break; }
case 11: 
case 12: {
 break; }
case 13: {
RDebugUtils.currentLine=17301550;
 //BA.debugLineNum = 17301550;BA.debugLine="Dim pm As B4XPlusMinus = ItemPanel.GetView(0).";
_pm = (b4j.example.b4xplusminus)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=17301551;
 //BA.debugLineNum = 17301551;BA.debugLine="pm.SelectedValue = GetPrefItemValue(PrefItem,";
_pm._setselectedvalue /*Object*/ (null,__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(0),_data));
 break; }
default: {
RDebugUtils.currentLine=17301553;
 //BA.debugLineNum = 17301553;BA.debugLine="Log(\"Unknown type: \" & PrefItem.ItemType)";
__c.LogImpl("917301553","Unknown type: "+BA.NumberToString(_prefitem.ItemType /*int*/ ),0);
 break; }
}
;
 }
};
RDebugUtils.currentLine=17301556;
 //BA.debugLineNum = 17301556;BA.debugLine="End Sub";
return "";
}
public Object  _getprefitemvalue(b4j.example.preferencesdialog __ref,b4j.example.preferencesdialog._b4xprefitem _prefitem,Object _defaultvalue,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "getprefitemvalue", true))
	 {return ((Object) Debug.delegate(ba, "getprefitemvalue", new Object[] {_prefitem,_defaultvalue,_data}));}
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Private Sub GetPrefItemValue (PrefItem As B4XPrefI";
RDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="Return Data.GetDefault(PrefItem.Key, DefaultValue";
if (true) return _data.GetDefault((Object)(_prefitem.Key /*String*/ ),_defaultvalue);
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="End Sub";
return null;
}
public String  _setlabelcolor(b4j.example.preferencesdialog __ref,anywheresoftware.b4a.objects.B4XViewWrapper _lbl,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "setlabelcolor", true))
	 {return ((String) Debug.delegate(ba, "setlabelcolor", new Object[] {_lbl,_clr}));}
b4j.example.b4xfloattextfield _ft = null;
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Private Sub SetLabelColor(lbl As B4XView, clr As I";
RDebugUtils.currentLine=17367041;
 //BA.debugLineNum = 17367041;BA.debugLine="Dim ft As B4XFloatTextField = lbl.Parent.GetView(";
_ft = (b4j.example.b4xfloattextfield)(_lbl.getParent().GetView((int) (0)).getTag());
RDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="ft.Text = ColorToHex(clr)";
_ft._settext /*String*/ (null,__ref._colortohex /*String*/ (null,_clr));
RDebugUtils.currentLine=17367043;
 //BA.debugLineNum = 17367043;BA.debugLine="lbl.SetColorAndBorder(clr, 1dip, Dialog.BorderCol";
_lbl.SetColorAndBorder(_clr,__c.DipToCurrent((int) (1)),__ref._dialog /*b4j.example.b4xdialog*/ ._bordercolor /*int*/ ,__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=17367044;
 //BA.debugLineNum = 17367044;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.example.preferencesdialog __ref,b4j.example.b4xdialog _dialog1) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog1}));}
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Public Sub GetPanel (Dialog1 As B4XDialog) As B4XV";
RDebugUtils.currentLine=17104897;
 //BA.debugLineNum = 17104897;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="End Sub";
return null;
}
public b4j.example.preferencesdialog._b4xprefitem  _getprefitem(b4j.example.preferencesdialog __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "getprefitem", true))
	 {return ((b4j.example.preferencesdialog._b4xprefitem) Debug.delegate(ba, "getprefitem", new Object[] {_key}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Public Sub GetPrefItem (Key As String) As B4XPrefI";
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="For Each pi As B4XPrefItem In PrefItems";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_pi = (b4j.example.preferencesdialog._b4xprefitem)(group1.Get(index1));
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="If pi.Key = Key Then Return pi";
if ((_pi.Key /*String*/ ).equals(_key)) { 
if (true) return _pi;};
 }
};
RDebugUtils.currentLine=18546692;
 //BA.debugLineNum = 18546692;BA.debugLine="Return Null";
if (true) return (b4j.example.preferencesdialog._b4xprefitem)(__c.Null);
RDebugUtils.currentLine=18546693;
 //BA.debugLineNum = 18546693;BA.debugLine="End Sub";
return null;
}
public int  _gettheme(b4j.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "gettheme", true))
	 {return ((Integer) Debug.delegate(ba, "gettheme", null));}
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Public Sub getTheme As Int";
RDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="Return mTheme";
if (true) return __ref._mtheme /*int*/ ;
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="End Sub";
return 0;
}
public Object  _gettitle(b4j.example.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "gettitle", true))
	 {return ((Object) Debug.delegate(ba, "gettitle", null));}
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Public Sub getTitle As Object";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="Return mTitle";
if (true) return __ref._mtitle /*Object*/ ;
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Private Sub HexToColor(Hex As String) As Int()";
RDebugUtils.currentLine=18939905;
 //BA.debugLineNum = 18939905;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="Hex = Hex.ToLowerCase";
_hex = _hex.toLowerCase();
RDebugUtils.currentLine=18939907;
 //BA.debugLineNum = 18939907;BA.debugLine="If Hex.StartsWith(\"#\") Then";
if (_hex.startsWith("#")) { 
RDebugUtils.currentLine=18939908;
 //BA.debugLineNum = 18939908;BA.debugLine="Hex = Hex.SubString(1)";
_hex = _hex.substring((int) (1));
 }else 
{RDebugUtils.currentLine=18939909;
 //BA.debugLineNum = 18939909;BA.debugLine="Else If Hex.StartsWith(\"0x\") Then";
if (_hex.startsWith("0x")) { 
RDebugUtils.currentLine=18939910;
 //BA.debugLineNum = 18939910;BA.debugLine="Hex = Hex.SubString(2)";
_hex = _hex.substring((int) (2));
 }}
;
RDebugUtils.currentLine=18939912;
 //BA.debugLineNum = 18939912;BA.debugLine="If Hex.Length = 6 Then Hex = \"ff\" & Hex";
if (_hex.length()==6) { 
_hex = "ff"+_hex;};
RDebugUtils.currentLine=18939914;
 //BA.debugLineNum = 18939914;BA.debugLine="Dim res() As Int";
_res = new int[(int) (0)];
;
RDebugUtils.currentLine=18939915;
 //BA.debugLineNum = 18939915;BA.debugLine="If Regex.IsMatch(\"[0-9a-f]{8}\", Hex) = False Then";
if (__c.Regex.IsMatch("[0-9a-f]{8}",_hex)==__c.False) { 
if (true) return _res;};
RDebugUtils.currentLine=18939916;
 //BA.debugLineNum = 18939916;BA.debugLine="Dim ints() As Int = bc.IntsFromBytes(bc.HexToByte";
_ints = _bc.IntsFromBytes(_bc.HexToBytes(_hex));
RDebugUtils.currentLine=18939917;
 //BA.debugLineNum = 18939917;BA.debugLine="Return ints";
if (true) return _ints;
RDebugUtils.currentLine=18939918;
 //BA.debugLineNum = 18939918;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.preferencesdialog __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent,Object _title,int _width,int _height) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent,_title,_width,_height}));}
anywheresoftware.b4j.objects.ScrollPaneWrapper _sv = null;
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Public Sub Initialize (Parent As B4XView, Title As";
RDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="Dialog.Initialize(Parent)";
__ref._dialog /*b4j.example.b4xdialog*/ ._initialize /*String*/ (null,ba,_parent);
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="Dialog.VisibleAnimationDuration = 0";
__ref._dialog /*b4j.example.b4xdialog*/ ._visibleanimationduration /*int*/  = (int) (0);
RDebugUtils.currentLine=15532035;
 //BA.debugLineNum = 15532035;BA.debugLine="mTitle = Title";
__ref._mtitle /*Object*/  = _title;
RDebugUtils.currentLine=15532036;
 //BA.debugLineNum = 15532036;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=15532037;
 //BA.debugLineNum = 15532037;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=15532038;
 //BA.debugLineNum = 15532038;BA.debugLine="mBase.LoadLayout(\"ListTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("ListTemplate",ba);
RDebugUtils.currentLine=15532039;
 //BA.debugLineNum = 15532039;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=15532040;
 //BA.debugLineNum = 15532040;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=15532041;
 //BA.debugLineNum = 15532041;BA.debugLine="CustomListView1.PressedColor = xui.Color_Transpar";
__ref._customlistview1 /*b4j.example.customlistview*/ ._pressedcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=15532042;
 //BA.debugLineNum = 15532042;BA.debugLine="PrefItems.Initialize";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=15532043;
 //BA.debugLineNum = 15532043;BA.debugLine="SearchTemplate.Initialize";
__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15532044;
 //BA.debugLineNum = 15532044;BA.debugLine="DateTemplate.Initialize";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15532045;
 //BA.debugLineNum = 15532045;BA.debugLine="LongTextTemplate.Initialize";
__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15532046;
 //BA.debugLineNum = 15532046;BA.debugLine="LongTextTemplate.CustomListView1.PressedColor = 0";
__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ ._customlistview1 /*b4j.example.customlistview*/ ._pressedcolor = (int) (0);
RDebugUtils.currentLine=15532047;
 //BA.debugLineNum = 15532047;BA.debugLine="Dialog.OverlayColor = xui.Color_Transparent";
__ref._dialog /*b4j.example.b4xdialog*/ ._overlaycolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=15532049;
 //BA.debugLineNum = 15532049;BA.debugLine="Dim sv As ScrollPane = CustomListView1.sv";
_sv = new anywheresoftware.b4j.objects.ScrollPaneWrapper();
_sv = (anywheresoftware.b4j.objects.ScrollPaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ScrollPaneWrapper(), (javafx.scene.control.ScrollPane)(__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getObject()));
RDebugUtils.currentLine=15532050;
 //BA.debugLineNum = 15532050;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
_sv.getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=15532051;
 //BA.debugLineNum = 15532051;BA.debugLine="sv.InnerNode.StyleClasses.Add(\"b4xdialog\")";
_sv.getInnerNode().getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=15532056;
 //BA.debugLineNum = 15532056;BA.debugLine="DefaultHintFont = xui.CreateDefaultBoldFont(16)";
__ref._defaulthintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (16));
RDebugUtils.currentLine=15532058;
 //BA.debugLineNum = 15532058;BA.debugLine="DefaultHintLargeSize = 16";
__ref._defaulthintlargesize /*int*/  = (int) (16);
RDebugUtils.currentLine=15532059;
 //BA.debugLineNum = 15532059;BA.debugLine="setTheme(THEME_DARK)";
__ref._settheme /*String*/ (null,__ref._theme_dark /*int*/ );
RDebugUtils.currentLine=15532061;
 //BA.debugLineNum = 15532061;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17563648;
 //BA.debugLineNum = 17563648;BA.debugLine="Public Sub setTheme (t As Int)";
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="If t <> mTheme Then";
if (_t!=__ref._mtheme /*int*/ ) { 
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="mTheme = t";
__ref._mtheme /*int*/  = _t;
RDebugUtils.currentLine=17563651;
 //BA.debugLineNum = 17563651;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=17563652;
 //BA.debugLineNum = 17563652;BA.debugLine="Dim DividerColor As Int";
_dividercolor = 0;
RDebugUtils.currentLine=17563653;
 //BA.debugLineNum = 17563653;BA.debugLine="Select mTheme";
switch (BA.switchObjectToInt(__ref._mtheme /*int*/ ,__ref._theme_dark /*int*/ ,__ref._theme_light /*int*/ )) {
case 0: {
RDebugUtils.currentLine=17563655;
 //BA.debugLineNum = 17563655;BA.debugLine="ItemsBackgroundColor = 0xFF626262";
__ref._itemsbackgroundcolor /*int*/  = ((int)0xff626262);
RDebugUtils.currentLine=17563656;
 //BA.debugLineNum = 17563656;BA.debugLine="SeparatorBackgroundColor = 0xFFC0C0C0";
__ref._separatorbackgroundcolor /*int*/  = ((int)0xffc0c0c0);
RDebugUtils.currentLine=17563657;
 //BA.debugLineNum = 17563657;BA.debugLine="SeparatorTextColor = xui.Color_Black";
__ref._separatortextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=17563658;
 //BA.debugLineNum = 17563658;BA.debugLine="TextColor = xui.Color_White";
__ref._textcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=17563659;
 //BA.debugLineNum = 17563659;BA.debugLine="DividerColor = 0xFF464646";
_dividercolor = ((int)0xff464646);
RDebugUtils.currentLine=17563660;
 //BA.debugLineNum = 17563660;BA.debugLine="Dialog.BackgroundColor = 0xFF555555";
__ref._dialog /*b4j.example.b4xdialog*/ ._backgroundcolor /*int*/  = ((int)0xff555555);
RDebugUtils.currentLine=17563661;
 //BA.debugLineNum = 17563661;BA.debugLine="Dialog.ButtonsColor = 0xFF555555";
__ref._dialog /*b4j.example.b4xdialog*/ ._buttonscolor /*int*/  = ((int)0xff555555);
RDebugUtils.currentLine=17563662;
 //BA.debugLineNum = 17563662;BA.debugLine="Dialog.BorderColor = 0xff000000";
__ref._dialog /*b4j.example.b4xdialog*/ ._bordercolor /*int*/  = ((int)0xff000000);
RDebugUtils.currentLine=17563663;
 //BA.debugLineNum = 17563663;BA.debugLine="Dialog.ButtonsTextColor = 0xFF89D5FF";
__ref._dialog /*b4j.example.b4xdialog*/ ._buttonstextcolor /*int*/  = ((int)0xff89d5ff);
RDebugUtils.currentLine=17563664;
 //BA.debugLineNum = 17563664;BA.debugLine="DateTemplate.DaysInWeekColor = xui.Color_Gray";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._daysinweekcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray;
RDebugUtils.currentLine=17563665;
 //BA.debugLineNum = 17563665;BA.debugLine="DateTemplate.SelectedColor = 0xFF0BA29B";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._selectedcolor /*int*/  = ((int)0xff0ba29b);
 break; }
case 1: {
RDebugUtils.currentLine=17563667;
 //BA.debugLineNum = 17563667;BA.debugLine="ItemsBackgroundColor = xui.Color_White";
__ref._itemsbackgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=17563668;
 //BA.debugLineNum = 17563668;BA.debugLine="SeparatorBackgroundColor = 0xFFD0D0D0";
__ref._separatorbackgroundcolor /*int*/  = ((int)0xffd0d0d0);
RDebugUtils.currentLine=17563669;
 //BA.debugLineNum = 17563669;BA.debugLine="SeparatorTextColor = 0xFF4E4F50";
__ref._separatortextcolor /*int*/  = ((int)0xff4e4f50);
RDebugUtils.currentLine=17563670;
 //BA.debugLineNum = 17563670;BA.debugLine="TextColor = 0xFF5B5B5B";
__ref._textcolor /*int*/  = ((int)0xff5b5b5b);
RDebugUtils.currentLine=17563671;
 //BA.debugLineNum = 17563671;BA.debugLine="DividerColor = 0xFFDFDFDF";
_dividercolor = ((int)0xffdfdfdf);
RDebugUtils.currentLine=17563672;
 //BA.debugLineNum = 17563672;BA.debugLine="Dialog.BackgroundColor = xui.Color_White";
__ref._dialog /*b4j.example.b4xdialog*/ ._backgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=17563673;
 //BA.debugLineNum = 17563673;BA.debugLine="Dialog.ButtonsColor = xui.Color_White";
__ref._dialog /*b4j.example.b4xdialog*/ ._buttonscolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=17563674;
 //BA.debugLineNum = 17563674;BA.debugLine="Dialog.BorderColor = xui.Color_Gray";
__ref._dialog /*b4j.example.b4xdialog*/ ._bordercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray;
RDebugUtils.currentLine=17563675;
 //BA.debugLineNum = 17563675;BA.debugLine="Dialog.ButtonsTextColor = 0xFF007DC3";
__ref._dialog /*b4j.example.b4xdialog*/ ._buttonstextcolor /*int*/  = ((int)0xff007dc3);
RDebugUtils.currentLine=17563676;
 //BA.debugLineNum = 17563676;BA.debugLine="DateTemplate.DaysInWeekColor = xui.Color_Black";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._daysinweekcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=17563677;
 //BA.debugLineNum = 17563677;BA.debugLine="DateTemplate.SelectedColor = 0xFF39D7CE";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._selectedcolor /*int*/  = ((int)0xff39d7ce);
 break; }
}
;
RDebugUtils.currentLine=17563680;
 //BA.debugLineNum = 17563680;BA.debugLine="SearchTemplate.SearchField.TextField.TextColor =";
__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._searchfield /*b4j.example.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=17563681;
 //BA.debugLineNum = 17563681;BA.debugLine="SearchTemplate.SearchField.NonFocusedHintColor =";
__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._searchfield /*b4j.example.b4xfloattextfield*/ ._nonfocusedhintcolor /*int*/  = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=17563682;
 //BA.debugLineNum = 17563682;BA.debugLine="Dialog.BorderCornersRadius = 0";
__ref._dialog /*b4j.example.b4xdialog*/ ._bordercornersradius /*int*/  = (int) (0);
RDebugUtils.currentLine=17563683;
 //BA.debugLineNum = 17563683;BA.debugLine="Dialog.BorderWidth = 1dip";
__ref._dialog /*b4j.example.b4xdialog*/ ._borderwidth /*int*/  = __c.DipToCurrent((int) (1));
RDebugUtils.currentLine=17563684;
 //BA.debugLineNum = 17563684;BA.debugLine="DateTemplate.HighlightedColor = 0xFF00CEFF";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._highlightedcolor /*int*/  = ((int)0xff00ceff);
RDebugUtils.currentLine=17563685;
 //BA.debugLineNum = 17563685;BA.debugLine="DateTemplate.DaysInMonthColor = TextColor";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._daysinmonthcolor /*int*/  = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=17563686;
 //BA.debugLineNum = 17563686;BA.debugLine="DateTemplate.lblMonth.TextColor = TextColor";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._lblmonth /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=17563687;
 //BA.debugLineNum = 17563687;BA.debugLine="DateTemplate.lblYear.TextColor = TextColor";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=17563688;
 //BA.debugLineNum = 17563688;BA.debugLine="For Each clv As CustomListView In Array(CustomLi";
{
final Object[] group39 = new Object[]{(Object)(__ref._customlistview1 /*b4j.example.customlistview*/ ),(Object)(__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._customlistview1 /*b4j.example.customlistview*/ ),(Object)(__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ ._customlistview1 /*b4j.example.customlistview*/ )};
final int groupLen39 = group39.length
;int index39 = 0;
;
for (; index39 < groupLen39;index39++){
_clv = (b4j.example.customlistview)(group39[index39]);
RDebugUtils.currentLine=17563689;
 //BA.debugLineNum = 17563689;BA.debugLine="clv.sv.ScrollViewInnerPanel.Color = DividerColo";
_clv._sv.getScrollViewInnerPanel().setColor(_dividercolor);
RDebugUtils.currentLine=17563690;
 //BA.debugLineNum = 17563690;BA.debugLine="clv.sv.Color = Dialog.BackgroundColor";
_clv._sv.setColor(__ref._dialog /*b4j.example.b4xdialog*/ ._backgroundcolor /*int*/ );
RDebugUtils.currentLine=17563691;
 //BA.debugLineNum = 17563691;BA.debugLine="clv.DefaultTextBackgroundColor = ItemsBackgroun";
_clv._defaulttextbackgroundcolor = __ref._itemsbackgroundcolor /*int*/ ;
RDebugUtils.currentLine=17563692;
 //BA.debugLineNum = 17563692;BA.debugLine="clv.DefaultTextColor = TextColor";
_clv._defaulttextcolor = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=17563694;
 //BA.debugLineNum = 17563694;BA.debugLine="Dim sv As Node = clv.sv";
_sv = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
_sv = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_clv._sv.getObject()));
RDebugUtils.currentLine=17563695;
 //BA.debugLineNum = 17563695;BA.debugLine="sv.StyleClasses.Clear";
_sv.getStyleClasses().Clear();
RDebugUtils.currentLine=17563696;
 //BA.debugLineNum = 17563696;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
_sv.getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=17563697;
 //BA.debugLineNum = 17563697;BA.debugLine="If mTheme = THEME_LIGHT Then sv.StyleClasses.Ad";
if (__ref._mtheme /*int*/ ==__ref._theme_light /*int*/ ) { 
_sv.getStyleClasses().Add((Object)("b4xdialoglight"));};
 }
};
RDebugUtils.currentLine=17563700;
 //BA.debugLineNum = 17563700;BA.debugLine="For Each b As B4XView In Array(DateTemplate.btnM";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final Object[] group49 = new Object[]{(Object)(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._btnmonthleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._btnmonthright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._btnyearleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._btnyearright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject())};
final int groupLen49 = group49.length
;int index49 = 0;
;
for (; index49 < groupLen49;index49++){
_b = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group49[index49]));
RDebugUtils.currentLine=17563701;
 //BA.debugLineNum = 17563701;BA.debugLine="b.Color = xui.Color_Transparent";
_b.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=17563702;
 //BA.debugLineNum = 17563702;BA.debugLine="b.TextColor = TextColor";
_b.setTextColor(__ref._textcolor /*int*/ );
 }
};
 };
RDebugUtils.currentLine=17563709;
 //BA.debugLineNum = 17563709;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Public Sub KeyboardHeightChanged (Height As Int)";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="If Dialog.Visible Then";
if (__ref._dialog /*b4j.example.b4xdialog*/ ._getvisible /*boolean*/ (null)) { 
RDebugUtils.currentLine=15794185;
 //BA.debugLineNum = 15794185;BA.debugLine="CustomListView1.sv.Height = Min(CustomListView1.A";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.setHeight(__c.Min(__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().getHeight(),_height-__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().getParent().getTop()-__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().getParent().getParent().getTop()));
RDebugUtils.currentLine=15794188;
 //BA.debugLineNum = 15794188;BA.debugLine="For Each v As B4XView In CustomListView1.AsView.";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._customlistview1 /*b4j.example.customlistview*/ ._asview().GetAllViewsRecursive();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group3.Get(index3)));
RDebugUtils.currentLine=15794189;
 //BA.debugLineNum = 15794189;BA.debugLine="If v.Tag Is B4XFloatTextField Then";
if (_v.getTag() instanceof b4j.example.b4xfloattextfield) { 
RDebugUtils.currentLine=15794190;
 //BA.debugLineNum = 15794190;BA.debugLine="Dim f As B4XFloatTextField = v.Tag";
_f = (b4j.example.b4xfloattextfield)(_v.getTag());
RDebugUtils.currentLine=15794191;
 //BA.debugLineNum = 15794191;BA.debugLine="If f.Focused Then";
if (_f._focused /*boolean*/ ) { 
RDebugUtils.currentLine=15794192;
 //BA.debugLineNum = 15794192;BA.debugLine="Dim index As Int = CustomListView1.GetItemFro";
_index = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview(_f._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=15794193;
 //BA.debugLineNum = 15794193;BA.debugLine="CustomListView1.ScrollToItem(index)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._scrolltoitem(_index);
 };
 };
 }
};
 };
RDebugUtils.currentLine=15794198;
 //BA.debugLineNum = 15794198;BA.debugLine="End Sub";
return "";
}
public String  _lblcolors_mouseclicked(b4j.example.preferencesdialog __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "lblcolors_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lblcolors_mouseclicked", new Object[] {_eventdata}));}
b4j.example.preferencesdialog._b4xprefitem _pref = null;
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Private Sub lblColors_MouseClicked (EventData As M";
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=18219013;
 //BA.debugLineNum = 18219013;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
__ref._nesteddialogitemindex /*int*/  = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=18219014;
 //BA.debugLineNum = 18219014;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
_pref = (b4j.example.preferencesdialog._b4xprefitem)(__ref._customlistview1 /*b4j.example.customlistview*/ ._getvalue(__ref._nesteddialogitemindex /*int*/ ));
RDebugUtils.currentLine=18219015;
 //BA.debugLineNum = 18219015;BA.debugLine="Dialog.Title = pref.Title";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = _pref.Title /*Object*/ ;
RDebugUtils.currentLine=18219016;
 //BA.debugLineNum = 18219016;BA.debugLine="ColorTemplate.SelectedColor = CustomListView1.Get";
__ref._colortemplate /*b4j.example.b4xcolortemplate*/ ._setselectedcolor /*int*/ (null,__ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(__ref._nesteddialogitemindex /*int*/ ).GetView((int) (1)).getColor());
RDebugUtils.currentLine=18219017;
 //BA.debugLineNum = 18219017;BA.debugLine="Template = ColorTemplate";
__ref._template /*Object*/  = (Object)(__ref._colortemplate /*b4j.example.b4xcolortemplate*/ );
RDebugUtils.currentLine=18219018;
 //BA.debugLineNum = 18219018;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
__ref._dialog /*b4j.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._result_showing_nested_dialog /*int*/ );
RDebugUtils.currentLine=18219019;
 //BA.debugLineNum = 18219019;BA.debugLine="End Sub";
return "";
}
public String  _lbldate_mouseclicked(b4j.example.preferencesdialog __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "lbldate_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lbldate_mouseclicked", new Object[] {_eventdata}));}
b4j.example.preferencesdialog._b4xprefitem _pref = null;
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Private Sub lblDate_MouseClicked (EventData As Mou";
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=18153477;
 //BA.debugLineNum = 18153477;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
__ref._nesteddialogitemindex /*int*/  = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=18153478;
 //BA.debugLineNum = 18153478;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
_pref = (b4j.example.preferencesdialog._b4xprefitem)(__ref._customlistview1 /*b4j.example.customlistview*/ ._getvalue(__ref._nesteddialogitemindex /*int*/ ));
RDebugUtils.currentLine=18153479;
 //BA.debugLineNum = 18153479;BA.debugLine="Dialog.Title = pref.Title";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = _pref.Title /*Object*/ ;
RDebugUtils.currentLine=18153480;
 //BA.debugLineNum = 18153480;BA.debugLine="DateTemplate.Date = DateTime.DateParse(CustomList";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._setdate /*long*/ (null,__c.DateTime.DateParse(__ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(__ref._nesteddialogitemindex /*int*/ ).GetView((int) (1)).getText()));
RDebugUtils.currentLine=18153481;
 //BA.debugLineNum = 18153481;BA.debugLine="Template = DateTemplate";
__ref._template /*Object*/  = (Object)(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ );
RDebugUtils.currentLine=18153482;
 //BA.debugLineNum = 18153482;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
__ref._dialog /*b4j.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._result_showing_nested_dialog /*int*/ );
RDebugUtils.currentLine=18153483;
 //BA.debugLineNum = 18153483;BA.debugLine="End Sub";
return "";
}
public String  _lblexplanation_mouseclicked(b4j.example.preferencesdialog __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "lblexplanation_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lblexplanation_mouseclicked", new Object[] {_eventdata}));}
b4j.example.preferencesdialog._b4xprefitem _pref = null;
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Private Sub lblExplanation_MouseClicked (EventData";
RDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=18284549;
 //BA.debugLineNum = 18284549;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
__ref._nesteddialogitemindex /*int*/  = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=18284550;
 //BA.debugLineNum = 18284550;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
_pref = (b4j.example.preferencesdialog._b4xprefitem)(__ref._customlistview1 /*b4j.example.customlistview*/ ._getvalue(__ref._nesteddialogitemindex /*int*/ ));
RDebugUtils.currentLine=18284551;
 //BA.debugLineNum = 18284551;BA.debugLine="Dialog.Title = pref.Title";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = _pref.Title /*Object*/ ;
RDebugUtils.currentLine=18284552;
 //BA.debugLineNum = 18284552;BA.debugLine="LongTextTemplate.Text = pref.Extra.Get(\"text\")";
__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ ._text /*Object*/  = _pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("text"));
RDebugUtils.currentLine=18284553;
 //BA.debugLineNum = 18284553;BA.debugLine="Template = LongTextTemplate";
__ref._template /*Object*/  = (Object)(__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ );
RDebugUtils.currentLine=18284554;
 //BA.debugLineNum = 18284554;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
__ref._dialog /*b4j.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._result_showing_nested_dialog /*int*/ );
RDebugUtils.currentLine=18284555;
 //BA.debugLineNum = 18284555;BA.debugLine="End Sub";
return "";
}
public String  _lbloptions_mouseclicked(b4j.example.preferencesdialog __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "lbloptions_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lbloptions_mouseclicked", new Object[] {_eventdata}));}
b4j.example.preferencesdialog._b4xprefitem _pref = null;
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Private Sub lblOptions_MouseClicked (EventData As";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=18087941;
 //BA.debugLineNum = 18087941;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
__ref._nesteddialogitemindex /*int*/  = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=18087942;
 //BA.debugLineNum = 18087942;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
_pref = (b4j.example.preferencesdialog._b4xprefitem)(__ref._customlistview1 /*b4j.example.customlistview*/ ._getvalue(__ref._nesteddialogitemindex /*int*/ ));
RDebugUtils.currentLine=18087943;
 //BA.debugLineNum = 18087943;BA.debugLine="Dialog.Title = pref.Title";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = _pref.Title /*Object*/ ;
RDebugUtils.currentLine=18087944;
 //BA.debugLineNum = 18087944;BA.debugLine="If pref.Extra.ContainsKey(\"index\") Then";
if (_pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("index"))) { 
RDebugUtils.currentLine=18087945;
 //BA.debugLineNum = 18087945;BA.debugLine="SearchTemplate.SetIndex(pref.Extra.Get(\"index\"))";
__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._setindex /*String*/ (null,_pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("index")));
 }else {
RDebugUtils.currentLine=18087947;
 //BA.debugLineNum = 18087947;BA.debugLine="pref.Extra.Put(\"index\", SearchTemplate.SetItems(";
_pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("index"),__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._setitems /*Object*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("options"))))));
 };
RDebugUtils.currentLine=18087949;
 //BA.debugLineNum = 18087949;BA.debugLine="SearchTemplate.SelectedItem = CustomListView1.Get";
__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._selecteditem /*String*/  = __ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(__ref._nesteddialogitemindex /*int*/ ).GetView((int) (1)).getText();
RDebugUtils.currentLine=18087950;
 //BA.debugLineNum = 18087950;BA.debugLine="Template = SearchTemplate";
__ref._template /*Object*/  = (Object)(__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ );
RDebugUtils.currentLine=18087951;
 //BA.debugLineNum = 18087951;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
__ref._dialog /*b4j.example.b4xdialog*/ ._close /*boolean*/ (null,__ref._result_showing_nested_dialog /*int*/ );
RDebugUtils.currentLine=18087952;
 //BA.debugLineNum = 18087952;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Public Sub LoadFromJson (Json As String)";
RDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="Dim p As JSONParser";
_p = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="p.Initialize(Json)";
_p.Initialize(_json);
RDebugUtils.currentLine=15925251;
 //BA.debugLineNum = 15925251;BA.debugLine="Dim m As Map = p.NextObject";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _p.NextObject();
RDebugUtils.currentLine=15925252;
 //BA.debugLineNum = 15925252;BA.debugLine="Dim theme As String = m.GetDefault(\"Theme\", \"Dark";
_theme = BA.ObjectToString(_m.GetDefault((Object)("Theme"),(Object)("Dark Theme")));
RDebugUtils.currentLine=15925253;
 //BA.debugLineNum = 15925253;BA.debugLine="Select theme";
switch (BA.switchObjectToInt(_theme,"Dark Theme","Light Theme")) {
case 0: {
RDebugUtils.currentLine=15925255;
 //BA.debugLineNum = 15925255;BA.debugLine="setTheme(THEME_DARK)";
__ref._settheme /*String*/ (null,__ref._theme_dark /*int*/ );
 break; }
case 1: {
RDebugUtils.currentLine=15925257;
 //BA.debugLineNum = 15925257;BA.debugLine="setTheme(THEME_LIGHT)";
__ref._settheme /*String*/ (null,__ref._theme_light /*int*/ );
 break; }
}
;
RDebugUtils.currentLine=15925259;
 //BA.debugLineNum = 15925259;BA.debugLine="Dim items As List = m.Get(\"Items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.Get((Object)("Items"))));
RDebugUtils.currentLine=15925260;
 //BA.debugLineNum = 15925260;BA.debugLine="For Each item As Map In items";
_item = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group12 = _items;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group12.Get(index12)));
RDebugUtils.currentLine=15925261;
 //BA.debugLineNum = 15925261;BA.debugLine="Dim key As String = item.Get(\"key\")";
_key = BA.ObjectToString(_item.Get((Object)("key")));
RDebugUtils.currentLine=15925262;
 //BA.debugLineNum = 15925262;BA.debugLine="Dim title As String = item.Get(\"title\")";
_title = BA.ObjectToString(_item.Get((Object)("title")));
RDebugUtils.currentLine=15925263;
 //BA.debugLineNum = 15925263;BA.debugLine="Dim required As Boolean = item.Get(\"required\")";
_required = BA.ObjectToBoolean(_item.Get((Object)("required")));
RDebugUtils.currentLine=15925264;
 //BA.debugLineNum = 15925264;BA.debugLine="Dim itemType As String = item.Get(\"type\")";
_itemtype = BA.ObjectToString(_item.Get((Object)("type")));
RDebugUtils.currentLine=15925265;
 //BA.debugLineNum = 15925265;BA.debugLine="Select itemType";
switch (BA.switchObjectToInt(_itemtype,"Separator","Boolean","Text","Date","Short Options","Color","Number","Password","Options","Decimal Number","Multiline Text","Time","Numeric Range","Explanation")) {
case 0: {
RDebugUtils.currentLine=15925267;
 //BA.debugLineNum = 15925267;BA.debugLine="AddSeparator(title)";
__ref._addseparator /*String*/ (null,(Object)(_title));
 break; }
case 1: {
RDebugUtils.currentLine=15925269;
 //BA.debugLineNum = 15925269;BA.debugLine="AddBooleanItem(key, title)";
__ref._addbooleanitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 2: {
RDebugUtils.currentLine=15925271;
 //BA.debugLineNum = 15925271;BA.debugLine="AddTextItem(key, title)";
__ref._addtextitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 3: {
RDebugUtils.currentLine=15925273;
 //BA.debugLineNum = 15925273;BA.debugLine="AddDateItem(key, title)";
__ref._adddateitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 4: {
RDebugUtils.currentLine=15925275;
 //BA.debugLineNum = 15925275;BA.debugLine="AddShortOptionsItem(key, title, item.Get(\"opti";
__ref._addshortoptionsitem /*String*/ (null,_key,(Object)(_title),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options")))));
 break; }
case 5: {
RDebugUtils.currentLine=15925277;
 //BA.debugLineNum = 15925277;BA.debugLine="AddColorItem(key, title)";
__ref._addcoloritem /*String*/ (null,_key,(Object)(_title));
 break; }
case 6: {
RDebugUtils.currentLine=15925279;
 //BA.debugLineNum = 15925279;BA.debugLine="AddNumberItem(key, title)";
__ref._addnumberitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 7: {
RDebugUtils.currentLine=15925281;
 //BA.debugLineNum = 15925281;BA.debugLine="AddPasswordItem(key, title)";
__ref._addpassworditem /*String*/ (null,_key,(Object)(_title));
 break; }
case 8: {
RDebugUtils.currentLine=15925283;
 //BA.debugLineNum = 15925283;BA.debugLine="AddOptionsItem(key, title, item.Get(\"options\")";
__ref._addoptionsitem /*String*/ (null,_key,(Object)(_title),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options")))));
 break; }
case 9: {
RDebugUtils.currentLine=15925285;
 //BA.debugLineNum = 15925285;BA.debugLine="AddDecimalNumberItem(key, title)";
__ref._adddecimalnumberitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 10: {
RDebugUtils.currentLine=15925287;
 //BA.debugLineNum = 15925287;BA.debugLine="Dim l As List = item.Get(\"options\")";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options"))));
RDebugUtils.currentLine=15925288;
 //BA.debugLineNum = 15925288;BA.debugLine="If l.IsInitialized = False Or l.Size = 0 Or Is";
if (_l.IsInitialized()==__c.False || _l.getSize()==0 || __c.IsNumber(BA.ObjectToString(_l.Get((int) (0))))==__c.False) { 
RDebugUtils.currentLine=15925289;
 //BA.debugLineNum = 15925289;BA.debugLine="AddMultilineTextItem(key, title, 100dip)";
__ref._addmultilinetextitem /*String*/ (null,_key,(Object)(_title),__c.DipToCurrent((int) (100)));
 }else {
RDebugUtils.currentLine=15925291;
 //BA.debugLineNum = 15925291;BA.debugLine="AddMultilineTextItem(key, title, DipToCurrent";
__ref._addmultilinetextitem /*String*/ (null,_key,(Object)(_title),__c.DipToCurrent((int)(BA.ObjectToNumber(_l.Get((int) (0))))));
 };
 break; }
case 11: {
RDebugUtils.currentLine=15925294;
 //BA.debugLineNum = 15925294;BA.debugLine="AddTimeItem(key, title)";
__ref._addtimeitem /*String*/ (null,_key,(Object)(_title));
RDebugUtils.currentLine=15925295;
 //BA.debugLineNum = 15925295;BA.debugLine="Dim l As List = item.Get(\"options\")";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options"))));
RDebugUtils.currentLine=15925296;
 //BA.debugLineNum = 15925296;BA.debugLine="If l.IsInitialized And l.Size > 0 Then";
if (_l.IsInitialized() && _l.getSize()>0) { 
RDebugUtils.currentLine=15925297;
 //BA.debugLineNum = 15925297;BA.debugLine="Dim pi As B4XPrefItem = PrefItems.Get(PrefIte";
_pi = (b4j.example.preferencesdialog._b4xprefitem)(__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=15925298;
 //BA.debugLineNum = 15925298;BA.debugLine="pi.Extra.Put(\"24\", l.Get(0) = \"24\")";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("24"),(Object)((_l.Get((int) (0))).equals((Object)("24"))));
 };
 break; }
case 12: {
RDebugUtils.currentLine=15925302;
 //BA.debugLineNum = 15925302;BA.debugLine="Dim l As List = item.Get(\"options\")";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options"))));
RDebugUtils.currentLine=15925303;
 //BA.debugLineNum = 15925303;BA.debugLine="If l.IsInitialized = False Or l.Size < 3 Or Is";
if (_l.IsInitialized()==__c.False || _l.getSize()<3 || __c.IsNumber(BA.ObjectToString(_l.Get((int) (0))))==__c.False || __c.IsNumber(BA.ObjectToString(_l.Get((int) (1))))==__c.False || __c.IsNumber(BA.ObjectToString(_l.Get((int) (2))))==__c.False) { 
RDebugUtils.currentLine=15925304;
 //BA.debugLineNum = 15925304;BA.debugLine="AddNumericRangeItem(key, title, 0, 100, 1)";
__ref._addnumericrangeitem /*String*/ (null,_key,(Object)(_title),0,100,1);
 }else {
RDebugUtils.currentLine=15925306;
 //BA.debugLineNum = 15925306;BA.debugLine="AddNumericRangeItem(key, title, l.Get(0), l.G";
__ref._addnumericrangeitem /*String*/ (null,_key,(Object)(_title),(double)(BA.ObjectToNumber(_l.Get((int) (0)))),(double)(BA.ObjectToNumber(_l.Get((int) (1)))),(double)(BA.ObjectToNumber(_l.Get((int) (2)))));
 };
 break; }
case 13: {
RDebugUtils.currentLine=15925309;
 //BA.debugLineNum = 15925309;BA.debugLine="Dim l As List = item.Get(\"options\")";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options"))));
RDebugUtils.currentLine=15925310;
 //BA.debugLineNum = 15925310;BA.debugLine="Dim text As String";
_text = "";
RDebugUtils.currentLine=15925311;
 //BA.debugLineNum = 15925311;BA.debugLine="If l.IsInitialized Then";
if (_l.IsInitialized()) { 
RDebugUtils.currentLine=15925312;
 //BA.debugLineNum = 15925312;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=15925313;
 //BA.debugLineNum = 15925313;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=15925314;
 //BA.debugLineNum = 15925314;BA.debugLine="For i = 0 To l.Size - 1";
{
final int step65 = 1;
final int limit65 = (int) (_l.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit65 ;_i = _i + step65 ) {
RDebugUtils.currentLine=15925315;
 //BA.debugLineNum = 15925315;BA.debugLine="If i > 0 Then sb.Append(CRLF)";
if (_i>0) { 
_sb.Append(__c.CRLF);};
RDebugUtils.currentLine=15925316;
 //BA.debugLineNum = 15925316;BA.debugLine="sb.Append(l.Get(i))";
_sb.Append(BA.ObjectToString(_l.Get(_i)));
 }
};
RDebugUtils.currentLine=15925318;
 //BA.debugLineNum = 15925318;BA.debugLine="text = sb.ToString";
_text = _sb.ToString();
 };
RDebugUtils.currentLine=15925320;
 //BA.debugLineNum = 15925320;BA.debugLine="AddExplanationItem(key, title, text)";
__ref._addexplanationitem /*String*/ (null,_key,(Object)(_title),(Object)(_text));
 break; }
}
;
RDebugUtils.currentLine=15925322;
 //BA.debugLineNum = 15925322;BA.debugLine="Dim pi As B4XPrefItem = PrefItems.Get(PrefItems.";
_pi = (b4j.example.preferencesdialog._b4xprefitem)(__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=15925323;
 //BA.debugLineNum = 15925323;BA.debugLine="pi.Required = required";
_pi.Required /*boolean*/  = _required;
 }
};
RDebugUtils.currentLine=15925325;
 //BA.debugLineNum = 15925325;BA.debugLine="End Sub";
return "";
}
public String  _raisebeforedialogdisplayed(b4j.example.preferencesdialog __ref,Object _temp) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "raisebeforedialogdisplayed", true))
	 {return ((String) Debug.delegate(ba, "raisebeforedialogdisplayed", new Object[] {_temp}));}
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Private Sub RaiseBeforeDialogDisplayed (Temp As Ob";
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="If mEventName <> \"\" And  xui.SubExists(mCallback,";
if ((__ref._meventname /*String*/ ).equals("") == false && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_BeforeDialogDisplayed",(int) (1))) { 
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="CallSub2(mCallback, mEventName & \"_BeforeDialogD";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_BeforeDialogDisplayed",_temp);
 };
RDebugUtils.currentLine=17039364;
 //BA.debugLineNum = 17039364;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Public Sub ScrollToItemWithError (key As String)";
RDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = __ref._customlistview1 /*b4j.example.customlistview*/ ._getrawlistitem(_i);
RDebugUtils.currentLine=17891331;
 //BA.debugLineNum = 17891331;BA.debugLine="Dim PrefItem As B4XPrefItem = Item.Value";
_prefitem = (b4j.example.preferencesdialog._b4xprefitem)(_item.Value);
RDebugUtils.currentLine=17891332;
 //BA.debugLineNum = 17891332;BA.debugLine="If PrefItem.Key = key Then";
if ((_prefitem.Key /*String*/ ).equals(_key)) { 
RDebugUtils.currentLine=17891333;
 //BA.debugLineNum = 17891333;BA.debugLine="GoToItem(i)";
__ref._gotoitem /*void*/ (null,_i);
RDebugUtils.currentLine=17891334;
 //BA.debugLineNum = 17891334;BA.debugLine="Return";
if (true) return "";
 };
 }
};
RDebugUtils.currentLine=17891337;
 //BA.debugLineNum = 17891337;BA.debugLine="End Sub";
return "";
}
public String  _seteventslistener(b4j.example.preferencesdialog __ref,Object _callback,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "seteventslistener", true))
	 {return ((String) Debug.delegate(ba, "seteventslistener", new Object[] {_callback,_eventname}));}
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Public Sub SetEventsListener(Callback As Object, E";
RDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="mCallback = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=15597571;
 //BA.debugLineNum = 15597571;BA.debugLine="End Sub";
return "";
}
public String  _setexplanation(b4j.example.preferencesdialog __ref,String _key,Object _explanation) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "setexplanation", true))
	 {return ((String) Debug.delegate(ba, "setexplanation", new Object[] {_key,_explanation}));}
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Public Sub SetExplanation (Key As String, Explanat";
RDebugUtils.currentLine=18481153;
 //BA.debugLineNum = 18481153;BA.debugLine="GetPrefItem(Key).Extra.Put(\"text\", Explanation)";
__ref._getprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_key).Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("text"),_explanation);
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="End Sub";
return "";
}
public String  _setoptions(b4j.example.preferencesdialog __ref,String _key,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "setoptions", true))
	 {return ((String) Debug.delegate(ba, "setoptions", new Object[] {_key,_options}));}
b4j.example.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Public Sub SetOptions (Key As String, Options As L";
RDebugUtils.currentLine=18415617;
 //BA.debugLineNum = 18415617;BA.debugLine="Dim pi As B4XPrefItem = GetPrefItem(Key)";
_pi = __ref._getprefitem /*b4j.example.preferencesdialog._b4xprefitem*/ (null,_key);
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="If pi.Extra.IsInitialized = False Then";
if (_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=18415619;
 //BA.debugLineNum = 18415619;BA.debugLine="pi.Extra.Initialize";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=18415621;
 //BA.debugLineNum = 18415621;BA.debugLine="pi.Extra.Put(\"options\", Options)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("options"),(Object)(_options.getObject()));
RDebugUtils.currentLine=18415622;
 //BA.debugLineNum = 18415622;BA.debugLine="End Sub";
return "";
}
public String  _settitle(b4j.example.preferencesdialog __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((String) Debug.delegate(ba, "settitle", new Object[] {_o}));}
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Public Sub setTitle(o As Object)";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="mTitle = o";
__ref._mtitle /*Object*/  = _o;
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="End Sub";
return "";
}
public String  _show(b4j.example.preferencesdialog __ref,b4j.example.b4xdialog _dialog1) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_dialog1}));}
RDebugUtils.currentLine=17170432;
 //BA.debugLineNum = 17170432;BA.debugLine="Private Sub Show (Dialog1 As B4XDialog) 'ignore";
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="If CustomListView1.Size = 0 Then";
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
RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="Dim LastTextField As B4XFloatTextField";
_lasttextfield = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=16973827;
 //BA.debugLineNum = 16973827;BA.debugLine="For Each pi As B4XPrefItem In PrefItems";
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
RDebugUtils.currentLine=16973828;
 //BA.debugLineNum = 16973828;BA.debugLine="Dim pnl As B4XView = CreateLayouts(pi)";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._createlayouts /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_pi);
RDebugUtils.currentLine=16973829;
 //BA.debugLineNum = 16973829;BA.debugLine="CustomListView1.Add (pnl, pi)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._add(_pnl,(Object)(_pi));
RDebugUtils.currentLine=16973830;
 //BA.debugLineNum = 16973830;BA.debugLine="If pnl.GetView(0).Tag Is B4XFloatTextField Then";
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
RDebugUtils.currentLine=16973831;
 //BA.debugLineNum = 16973831;BA.debugLine="Dim tf As B4XFloatTextField = pnl.GetView(0).T";
_tf = (b4j.example.b4xfloattextfield)(_pnl.GetView((int) (0)).getTag());
RDebugUtils.currentLine=16973832;
 //BA.debugLineNum = 16973832;BA.debugLine="If LastTextField.IsInitialized Then";
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
RDebugUtils.currentLine=16973833;
 //BA.debugLineNum = 16973833;BA.debugLine="LastTextField.NextField = tf";
_lasttextfield._setnextfield /*b4j.example.b4xfloattextfield*/ (null,_tf);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=16973835;
 //BA.debugLineNum = 16973835;BA.debugLine="LastTextField = tf";
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
RDebugUtils.currentLine=16973843;
 //BA.debugLineNum = 16973843;BA.debugLine="Dialog.InternalAddStubToCLVIfNeeded(CustomListVi";
__ref._dialog /*b4j.example.b4xdialog*/ ._internaladdstubtoclvifneeded /*String*/ (null,__ref._customlistview1 /*b4j.example.customlistview*/ ,__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor);
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=16973845;
 //BA.debugLineNum = 16973845;BA.debugLine="FillData (Data)";
__ref._filldata /*String*/ (null,_data);
RDebugUtils.currentLine=16973846;
 //BA.debugLineNum = 16973846;BA.debugLine="Dim ScrollViewOffset As Int 'ignore";
_scrollviewoffset = 0;
RDebugUtils.currentLine=16973847;
 //BA.debugLineNum = 16973847;BA.debugLine="Do While True";
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
RDebugUtils.currentLine=16973848;
 //BA.debugLineNum = 16973848;BA.debugLine="Dialog.Title = mTitle";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = __ref._mtitle /*Object*/ ;
RDebugUtils.currentLine=16973849;
 //BA.debugLineNum = 16973849;BA.debugLine="Dialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._dialog /*b4j.example.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=16973850;
 //BA.debugLineNum = 16973850;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(Me, Yes,";
_rs = __ref._dialog /*b4j.example.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent,_yes,(Object)(""),_cancel);
RDebugUtils.currentLine=16973858;
 //BA.debugLineNum = 16973858;BA.debugLine="RaiseBeforeDialogDisplayed(Me)";
__ref._raisebeforedialogdisplayed /*String*/ (null,parent);
RDebugUtils.currentLine=16973859;
 //BA.debugLineNum = 16973859;BA.debugLine="Wait For (rs) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preferencesdialog", "showdialog"), _rs);
this.state = 57;
return;
case 57:
//C
this.state = 20;
_result = (int) result[1];
;
RDebugUtils.currentLine=16973860;
 //BA.debugLineNum = 16973860;BA.debugLine="ScrollViewOffset = CustomListView1.sv.ScrollView";
_scrollviewoffset = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewOffsetY());
RDebugUtils.currentLine=16973861;
 //BA.debugLineNum = 16973861;BA.debugLine="If Result <> RESULT_SHOWING_NESTED_DIALOG Then";
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
RDebugUtils.currentLine=16973862;
 //BA.debugLineNum = 16973862;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=16973863;
 //BA.debugLineNum = 16973863;BA.debugLine="If CommitChanges(Data) = False Then";
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
RDebugUtils.currentLine=16973864;
 //BA.debugLineNum = 16973864;BA.debugLine="ScrollViewOffset = 0";
_scrollviewoffset = (int) (0);
RDebugUtils.currentLine=16973865;
 //BA.debugLineNum = 16973865;BA.debugLine="Continue";
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
RDebugUtils.currentLine=16973868;
 //BA.debugLineNum = 16973868;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=16973870;
 //BA.debugLineNum = 16973870;BA.debugLine="Dim y As Object";
_y = new Object();
RDebugUtils.currentLine=16973871;
 //BA.debugLineNum = 16973871;BA.debugLine="Dim c As Object = Cancel";
_c = _cancel;
RDebugUtils.currentLine=16973872;
 //BA.debugLineNum = 16973872;BA.debugLine="If Template = ColorTemplate Then";
if (true) break;

case 33:
//if
this.state = 40;
if ((__ref._template /*Object*/ ).equals((Object)(__ref._colortemplate /*b4j.example.b4xcolortemplate*/ ))) { 
this.state = 35;
}else 
{RDebugUtils.currentLine=16973874;
 //BA.debugLineNum = 16973874;BA.debugLine="Else If Template = LongTextTemplate Then";
if ((__ref._template /*Object*/ ).equals((Object)(__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ ))) { 
this.state = 37;
}else {
this.state = 39;
}}
if (true) break;

case 35:
//C
this.state = 40;
RDebugUtils.currentLine=16973873;
 //BA.debugLineNum = 16973873;BA.debugLine="y = Yes";
_y = _yes;
 if (true) break;

case 37:
//C
this.state = 40;
RDebugUtils.currentLine=16973875;
 //BA.debugLineNum = 16973875;BA.debugLine="y = Yes";
_y = _yes;
RDebugUtils.currentLine=16973876;
 //BA.debugLineNum = 16973876;BA.debugLine="c = \"\"";
_c = (Object)("");
 if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=16973878;
 //BA.debugLineNum = 16973878;BA.debugLine="y = \"\"";
_y = (Object)("");
 if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=16973880;
 //BA.debugLineNum = 16973880;BA.debugLine="Dialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._dialog /*b4j.example.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=16973881;
 //BA.debugLineNum = 16973881;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(Template";
_rs = __ref._dialog /*b4j.example.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._template /*Object*/ ,_y,(Object)(""),_c);
RDebugUtils.currentLine=16973882;
 //BA.debugLineNum = 16973882;BA.debugLine="RaiseBeforeDialogDisplayed(Template)";
__ref._raisebeforedialogdisplayed /*String*/ (null,__ref._template /*Object*/ );
RDebugUtils.currentLine=16973883;
 //BA.debugLineNum = 16973883;BA.debugLine="Wait For (rs) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preferencesdialog", "showdialog"), _rs);
this.state = 58;
return;
case 58:
//C
this.state = 41;
_result = (int) result[1];
;
RDebugUtils.currentLine=16973884;
 //BA.debugLineNum = 16973884;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=16973885;
 //BA.debugLineNum = 16973885;BA.debugLine="Dim lbl As B4XView = CustomListView1.GetPanel(";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(__ref._nesteddialogitemindex /*int*/ ).GetView((int) (1));
RDebugUtils.currentLine=16973886;
 //BA.debugLineNum = 16973886;BA.debugLine="Dim value As String";
_value = "";
RDebugUtils.currentLine=16973887;
 //BA.debugLineNum = 16973887;BA.debugLine="If Template = DateTemplate Then";
if (true) break;

case 44:
//if
this.state = 51;
if ((__ref._template /*Object*/ ).equals((Object)(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ))) { 
this.state = 46;
}else 
{RDebugUtils.currentLine=16973890;
 //BA.debugLineNum = 16973890;BA.debugLine="Else if Template = SearchTemplate Then";
if ((__ref._template /*Object*/ ).equals((Object)(__ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ))) { 
this.state = 48;
}else 
{RDebugUtils.currentLine=16973893;
 //BA.debugLineNum = 16973893;BA.debugLine="Else If Template = ColorTemplate Then";
if ((__ref._template /*Object*/ ).equals((Object)(__ref._colortemplate /*b4j.example.b4xcolortemplate*/ ))) { 
this.state = 50;
}}}
if (true) break;

case 46:
//C
this.state = 51;
RDebugUtils.currentLine=16973888;
 //BA.debugLineNum = 16973888;BA.debugLine="value = DateTime.Date(DateTemplate.Date)";
_value = parent.__c.DateTime.Date(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._getdate /*long*/ (null));
RDebugUtils.currentLine=16973889;
 //BA.debugLineNum = 16973889;BA.debugLine="lbl.Text = value";
_lbl.setText(_value);
 if (true) break;

case 48:
//C
this.state = 51;
RDebugUtils.currentLine=16973891;
 //BA.debugLineNum = 16973891;BA.debugLine="value = SearchTemplate.SelectedItem";
_value = __ref._searchtemplate /*b4j.example.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=16973892;
 //BA.debugLineNum = 16973892;BA.debugLine="lbl.Text = value";
_lbl.setText(_value);
 if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=16973894;
 //BA.debugLineNum = 16973894;BA.debugLine="value = ColorTemplate.SelectedColor";
_value = BA.NumberToString(__ref._colortemplate /*b4j.example.b4xcolortemplate*/ ._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=16973895;
 //BA.debugLineNum = 16973895;BA.debugLine="SetLabelColor(lbl, value)";
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
RDebugUtils.currentLine=16973900;
 //BA.debugLineNum = 16973900;BA.debugLine="Return -1 'never happens";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(-1));return;};
RDebugUtils.currentLine=16973901;
 //BA.debugLineNum = 16973901;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Private Sub tfColorCode_EnterPressed";
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="Dim ft As B4XFloatTextField = Sender";
_ft = (b4j.example.b4xfloattextfield)(__c.Sender(ba));
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="Dim clr() As Int = HexToColor(ft.Text)";
_clr = __ref._hextocolor /*int[]*/ (null,_ft._gettext /*String*/ (null));
RDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="Dim index As Int = CustomListView1.GetItemFromVie";
_index = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview(_ft._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=18808836;
 //BA.debugLineNum = 18808836;BA.debugLine="Dim lbl As B4XView = CustomListView1.GetPanel(ind";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(_index).GetView((int) (1));
RDebugUtils.currentLine=18808837;
 //BA.debugLineNum = 18808837;BA.debugLine="If clr.Length = 1 Then";
if (_clr.length==1) { 
RDebugUtils.currentLine=18808838;
 //BA.debugLineNum = 18808838;BA.debugLine="SetLabelColor(lbl, clr(0))";
__ref._setlabelcolor /*String*/ (null,_lbl,_clr[(int) (0)]);
 }else {
RDebugUtils.currentLine=18808840;
 //BA.debugLineNum = 18808840;BA.debugLine="ft.Text = ColorToHex(lbl.Color)";
_ft._settext /*String*/ (null,__ref._colortohex /*String*/ (null,_lbl.getColor()));
 };
RDebugUtils.currentLine=18808842;
 //BA.debugLineNum = 18808842;BA.debugLine="End Sub";
return "";
}
}