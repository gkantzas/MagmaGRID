package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class preferencesdialog_subs_0 {


public static RemoteObject  _addbooleanitem(RemoteObject __ref,RemoteObject _key,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("AddBooleanItem (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,205);
if (RapidSub.canDelegate("addbooleanitem")) { return __ref.runUserSub(false, "preferencesdialog","addbooleanitem", __ref, _key, _title);}
Debug.locals.put("Key", _key);
Debug.locals.put("Title", _title);
 BA.debugLineNum = 205;BA.debugLine="Public Sub AddBooleanItem (Key As String, Title As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 206;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_BOOLEAN,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefitems" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.preferencesdialog.class, "_createprefitem" /*RemoteObject*/ ,(Object)(_title),(Object)(__ref.getField(true,"_type_boolean" /*RemoteObject*/ )),(Object)(_key)))));
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcoloritem(RemoteObject __ref,RemoteObject _key,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("AddColorItem (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,248);
if (RapidSub.canDelegate("addcoloritem")) { return __ref.runUserSub(false, "preferencesdialog","addcoloritem", __ref, _key, _title);}
Debug.locals.put("Key", _key);
Debug.locals.put("Title", _title);
 BA.debugLineNum = 248;BA.debugLine="Public Sub AddColorItem(Key As String, Title As Ob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 249;BA.debugLine="If ColorTemplate.IsInitialized = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_colortemplate" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ),preferencesdialog.__c.getField(true,"False"))) { 
 BA.debugLineNum = 250;BA.debugLine="ColorTemplate.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colortemplate" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xcolortemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 };
 BA.debugLineNum = 252;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_COLOR, K";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefitems" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.preferencesdialog.class, "_createprefitem" /*RemoteObject*/ ,(Object)(_title),(Object)(__ref.getField(true,"_type_color" /*RemoteObject*/ )),(Object)(_key)))));
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
public static RemoteObject  _adddateitem(RemoteObject __ref,RemoteObject _key,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("AddDateItem (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,244);
if (RapidSub.canDelegate("adddateitem")) { return __ref.runUserSub(false, "preferencesdialog","adddateitem", __ref, _key, _title);}
Debug.locals.put("Key", _key);
Debug.locals.put("Title", _title);
 BA.debugLineNum = 244;BA.debugLine="Public Sub AddDateItem (Key As String, Title As Ob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 245;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_DATE, Ke";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefitems" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.preferencesdialog.class, "_createprefitem" /*RemoteObject*/ ,(Object)(_title),(Object)(__ref.getField(true,"_type_date" /*RemoteObject*/ )),(Object)(_key)))));
 BA.debugLineNum = 246;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _adddecimalnumberitem(RemoteObject __ref,RemoteObject _key,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("AddDecimalNumberItem (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("adddecimalnumberitem")) { return __ref.runUserSub(false, "preferencesdialog","adddecimalnumberitem", __ref, _key, _title);}
Debug.locals.put("Key", _key);
Debug.locals.put("Title", _title);
 BA.debugLineNum = 217;BA.debugLine="Public Sub AddDecimalNumberItem (Key As String, Ti";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 218;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_DECIMALN";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefitems" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.preferencesdialog.class, "_createprefitem" /*RemoteObject*/ ,(Object)(_title),(Object)(__ref.getField(true,"_type_decimalnumber" /*RemoteObject*/ )),(Object)(_key)))));
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addexplanationitem(RemoteObject __ref,RemoteObject _key,RemoteObject _title,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("AddExplanationItem (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("addexplanationitem")) { return __ref.runUserSub(false, "preferencesdialog","addexplanationitem", __ref, _key, _title, _text);}
RemoteObject _pi = RemoteObject.declareNull("b4j.example.preferencesdialog._b4xprefitem");
Debug.locals.put("Key", _key);
Debug.locals.put("Title", _title);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 256;BA.debugLine="Public Sub AddExplanationItem (Key As String, Titl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 257;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (b4j.example.preferencesdialog.class, "_createprefitem" /*RemoteObject*/ ,(Object)(_title),(Object)(__ref.getField(true,"_type_explanation" /*RemoteObject*/ )),(Object)(_key));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 258;BA.debugLine="pi.Extra = CreateMap(\"text\": Text)";
Debug.JustUpdateDeviceLine();
_pi.setField ("Extra" /*RemoteObject*/ ,preferencesdialog.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("text")),_text})));
 BA.debugLineNum = 259;BA.debugLine="PrefItems.Add(pi)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefitems" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_pi)));
 BA.debugLineNum = 260;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addmultilinetextitem(RemoteObject __ref,RemoteObject _key,RemoteObject _title,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("AddMultilineTextItem (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,221);
if (RapidSub.canDelegate("addmultilinetextitem")) { return __ref.runUserSub(false, "preferencesdialog","addmultilinetextitem", __ref, _key, _title, _height);}
RemoteObject _pi = RemoteObject.declareNull("b4j.example.preferencesdialog._b4xprefitem");
Debug.locals.put("Key", _key);
Debug.locals.put("Title", _title);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 221;BA.debugLine="Public Sub AddMultilineTextItem (Key As String, Ti";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 222;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (b4j.example.preferencesdialog.class, "_createprefitem" /*RemoteObject*/ ,(Object)(_title),(Object)(__ref.getField(true,"_type_multilinetext" /*RemoteObject*/ )),(Object)(_key));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 223;BA.debugLine="pi.Extra = CreateMap(\"height\": Height)";
Debug.JustUpdateDeviceLine();
_pi.setField ("Extra" /*RemoteObject*/ ,preferencesdialog.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("height")),(_height)})));
 BA.debugLineNum = 224;BA.debugLine="PrefItems.Add(pi)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefitems" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_pi)));
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addnumberitem(RemoteObject __ref,RemoteObject _key,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("AddNumberItem (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,213);
if (RapidSub.canDelegate("addnumberitem")) { return __ref.runUserSub(false, "preferencesdialog","addnumberitem", __ref, _key, _title);}
Debug.locals.put("Key", _key);
Debug.locals.put("Title", _title);
 BA.debugLineNum = 213;BA.debugLine="Public Sub AddNumberItem (Key As String, Title As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 214;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_NUMBER,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefitems" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.preferencesdialog.class, "_createprefitem" /*RemoteObject*/ ,(Object)(_title),(Object)(__ref.getField(true,"_type_number" /*RemoteObject*/ )),(Object)(_key)))));
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
public static RemoteObject  _addnumericrangeitem(RemoteObject __ref,RemoteObject _key,RemoteObject _title,RemoteObject _rangestart,RemoteObject _rangeend,RemoteObject _interval) throws Exception{
try {
		Debug.PushSubsStack("AddNumericRangeItem (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,228);
if (RapidSub.canDelegate("addnumericrangeitem")) { return __ref.runUserSub(false, "preferencesdialog","addnumericrangeitem", __ref, _key, _title, _rangestart, _rangeend, _interval);}
RemoteObject _pi = RemoteObject.declareNull("b4j.example.preferencesdialog._b4xprefitem");
Debug.locals.put("Key", _key);
Debug.locals.put("Title", _title);
Debug.locals.put("RangeStart", _rangestart);
Debug.locals.put("RangeEnd", _rangeend);
Debug.locals.put("Interval", _interval);
 BA.debugLineNum = 228;BA.debugLine="Public Sub AddNumericRangeItem (Key As String, Tit";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 229;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (b4j.example.preferencesdialog.class, "_createprefitem" /*RemoteObject*/ ,(Object)(_title),(Object)(__ref.getField(true,"_type_numericrange" /*RemoteObject*/ )),(Object)(_key));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 230;BA.debugLine="pi.Extra = CreateMap(\"start\": RangeStart, \"end\":";
Debug.JustUpdateDeviceLine();
_pi.setField ("Extra" /*RemoteObject*/ ,preferencesdialog.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("start")),(_rangestart),RemoteObject.createImmutable(("end")),(_rangeend),RemoteObject.createImmutable(("interval")),(_interval)})));
 BA.debugLineNum = 231;BA.debugLine="PrefItems.Add(pi)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefitems" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_pi)));
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addoptionsitem(RemoteObject __ref,RemoteObject _key,RemoteObject _title,RemoteObject _options) throws Exception{
try {
		Debug.PushSubsStack("AddOptionsItem (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("addoptionsitem")) { return __ref.runUserSub(false, "preferencesdialog","addoptionsitem", __ref, _key, _title, _options);}
RemoteObject _pi = RemoteObject.declareNull("b4j.example.preferencesdialog._b4xprefitem");
Debug.locals.put("Key", _key);
Debug.locals.put("Title", _title);
Debug.locals.put("Options", _options);
 BA.debugLineNum = 188;BA.debugLine="Public Sub AddOptionsItem (Key As String, Title As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 190;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (b4j.example.preferencesdialog.class, "_createprefitem" /*RemoteObject*/ ,(Object)(_title),(Object)(__ref.getField(true,"_type_options" /*RemoteObject*/ )),(Object)(_key));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 191;BA.debugLine="If Options.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_options.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 192;BA.debugLine="pi.Extra = CreateMap(\"options\": Options)";
Debug.JustUpdateDeviceLine();
_pi.setField ("Extra" /*RemoteObject*/ ,preferencesdialog.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("options")),(_options.getObject())})));
 };
 BA.debugLineNum = 194;BA.debugLine="PrefItems.Add(pi)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefitems" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_pi)));
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addpassworditem(RemoteObject __ref,RemoteObject _key,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("AddPasswordItem (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,240);
if (RapidSub.canDelegate("addpassworditem")) { return __ref.runUserSub(false, "preferencesdialog","addpassworditem", __ref, _key, _title);}
Debug.locals.put("Key", _key);
Debug.locals.put("Title", _title);
 BA.debugLineNum = 240;BA.debugLine="Public Sub AddPasswordItem (Key As String, Title A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 241;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_PASSWORD";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefitems" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.preferencesdialog.class, "_createprefitem" /*RemoteObject*/ ,(Object)(_title),(Object)(__ref.getField(true,"_type_password" /*RemoteObject*/ )),(Object)(_key)))));
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addseparator(RemoteObject __ref,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("AddSeparator (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,262);
if (RapidSub.canDelegate("addseparator")) { return __ref.runUserSub(false, "preferencesdialog","addseparator", __ref, _title);}
Debug.locals.put("Title", _title);
 BA.debugLineNum = 262;BA.debugLine="Public Sub AddSeparator (Title As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 263;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_SEPARATO";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefitems" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.preferencesdialog.class, "_createprefitem" /*RemoteObject*/ ,(Object)(_title),(Object)(__ref.getField(true,"_type_separator" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 264;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addshortoptionsitem(RemoteObject __ref,RemoteObject _key,RemoteObject _title,RemoteObject _options) throws Exception{
try {
		Debug.PushSubsStack("AddShortOptionsItem (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("addshortoptionsitem")) { return __ref.runUserSub(false, "preferencesdialog","addshortoptionsitem", __ref, _key, _title, _options);}
RemoteObject _pi = RemoteObject.declareNull("b4j.example.preferencesdialog._b4xprefitem");
Debug.locals.put("Key", _key);
Debug.locals.put("Title", _title);
Debug.locals.put("Options", _options);
 BA.debugLineNum = 197;BA.debugLine="Public Sub AddShortOptionsItem (Key As String, Tit";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 198;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (b4j.example.preferencesdialog.class, "_createprefitem" /*RemoteObject*/ ,(Object)(_title),(Object)(__ref.getField(true,"_type_shortoptions" /*RemoteObject*/ )),(Object)(_key));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 199;BA.debugLine="If Options.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_options.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 200;BA.debugLine="pi.Extra = CreateMap(\"options\": Options)";
Debug.JustUpdateDeviceLine();
_pi.setField ("Extra" /*RemoteObject*/ ,preferencesdialog.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("options")),(_options.getObject())})));
 };
 BA.debugLineNum = 202;BA.debugLine="PrefItems.Add(pi)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefitems" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_pi)));
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtextitem(RemoteObject __ref,RemoteObject _key,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("AddTextItem (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,209);
if (RapidSub.canDelegate("addtextitem")) { return __ref.runUserSub(false, "preferencesdialog","addtextitem", __ref, _key, _title);}
Debug.locals.put("Key", _key);
Debug.locals.put("Title", _title);
 BA.debugLineNum = 209;BA.debugLine="Public Sub AddTextItem (Key As String, Title As Ob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 210;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_TEXT, Ke";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefitems" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.preferencesdialog.class, "_createprefitem" /*RemoteObject*/ ,(Object)(_title),(Object)(__ref.getField(true,"_type_text" /*RemoteObject*/ )),(Object)(_key)))));
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtimeitem(RemoteObject __ref,RemoteObject _key,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("AddTimeItem (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("addtimeitem")) { return __ref.runUserSub(false, "preferencesdialog","addtimeitem", __ref, _key, _title);}
RemoteObject _pi = RemoteObject.declareNull("b4j.example.preferencesdialog._b4xprefitem");
Debug.locals.put("Key", _key);
Debug.locals.put("Title", _title);
 BA.debugLineNum = 234;BA.debugLine="Public Sub AddTimeItem (Key As String, Title As Ob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 235;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (b4j.example.preferencesdialog.class, "_createprefitem" /*RemoteObject*/ ,(Object)(_title),(Object)(__ref.getField(true,"_type_time" /*RemoteObject*/ )),(Object)(_key));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 236;BA.debugLine="pi.Extra = CreateMap(\"24\": False)";
Debug.JustUpdateDeviceLine();
_pi.setField ("Extra" /*RemoteObject*/ ,preferencesdialog.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("24")),(preferencesdialog.__c.getField(true,"False"))})));
 BA.debugLineNum = 237;BA.debugLine="PrefItems.Add(pi)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefitems" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_pi)));
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xcombobox1_selectedindexchanged(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("B4XComboBox1_SelectedIndexChanged (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,913);
if (RapidSub.canDelegate("b4xcombobox1_selectedindexchanged")) { return __ref.runUserSub(false, "preferencesdialog","b4xcombobox1_selectedindexchanged", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 913;BA.debugLine="Private Sub B4XComboBox1_SelectedIndexChanged (Ind";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 915;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xswitch1_valuechanged(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("B4XSwitch1_ValueChanged (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,909);
if (RapidSub.canDelegate("b4xswitch1_valuechanged")) { return __ref.runUserSub(false, "preferencesdialog","b4xswitch1_valuechanged", __ref, _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 909;BA.debugLine="Private Sub B4XSwitch1_ValueChanged (Value As Bool";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 911;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _backkeypressed(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BackKeyPressed (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("backkeypressed")) { return __ref.runUserSub(false, "preferencesdialog","backkeypressed", __ref);}
 BA.debugLineNum = 101;BA.debugLine="Public Sub BackKeyPressed As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 102;BA.debugLine="If Dialog.Visible Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_getvisible" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 103;BA.debugLine="Dialog.Close(xui.DialogResponse_Cancel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_close" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));
 BA.debugLineNum = 104;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return preferencesdialog.__c.getField(true,"True");
 };
 BA.debugLineNum = 106;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return preferencesdialog.__c.getField(true,"False");
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
preferencesdialog._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",preferencesdialog._xui);
 //BA.debugLineNum = 5;BA.debugLine="Public mBase As B4XView";
preferencesdialog._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",preferencesdialog._mbase);
 //BA.debugLineNum = 6;BA.debugLine="Public CustomListView1 As CustomListView";
preferencesdialog._customlistview1 = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_customlistview1",preferencesdialog._customlistview1);
 //BA.debugLineNum = 7;BA.debugLine="Type B4XPrefItem (Title As Object, ItemType As In";
;
 //BA.debugLineNum = 8;BA.debugLine="Public PrefItems As List";
preferencesdialog._prefitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_prefitems",preferencesdialog._prefitems);
 //BA.debugLineNum = 9;BA.debugLine="Public TYPE_BOOLEAN = 1, TYPE_TEXT = 2, TYPE_DATE";
preferencesdialog._type_boolean = BA.numberCast(int.class, 1);__ref.setField("_type_boolean",preferencesdialog._type_boolean);
preferencesdialog._type_text = BA.numberCast(int.class, 2);__ref.setField("_type_text",preferencesdialog._type_text);
preferencesdialog._type_date = BA.numberCast(int.class, 3);__ref.setField("_type_date",preferencesdialog._type_date);
preferencesdialog._type_options = BA.numberCast(int.class, 4);__ref.setField("_type_options",preferencesdialog._type_options);
preferencesdialog._type_color = BA.numberCast(int.class, 5);__ref.setField("_type_color",preferencesdialog._type_color);
preferencesdialog._type_separator = BA.numberCast(int.class, 6);__ref.setField("_type_separator",preferencesdialog._type_separator);
preferencesdialog._type_number = BA.numberCast(int.class, 7);__ref.setField("_type_number",preferencesdialog._type_number);
preferencesdialog._type_password = BA.numberCast(int.class, 8);__ref.setField("_type_password",preferencesdialog._type_password);
preferencesdialog._type_shortoptions = BA.numberCast(int.class, 9);__ref.setField("_type_shortoptions",preferencesdialog._type_shortoptions);
preferencesdialog._type_decimalnumber = BA.numberCast(int.class, 10);__ref.setField("_type_decimalnumber",preferencesdialog._type_decimalnumber);
preferencesdialog._type_multilinetext = BA.numberCast(int.class, 11);__ref.setField("_type_multilinetext",preferencesdialog._type_multilinetext);
preferencesdialog._type_time = BA.numberCast(int.class, 12);__ref.setField("_type_time",preferencesdialog._type_time);
preferencesdialog._type_numericrange = BA.numberCast(int.class, 13);__ref.setField("_type_numericrange",preferencesdialog._type_numericrange);
preferencesdialog._type_explanation = BA.numberCast(int.class, 14);__ref.setField("_type_explanation",preferencesdialog._type_explanation);
 //BA.debugLineNum = 12;BA.debugLine="Public DateTemplate As B4XDateTemplate";
preferencesdialog._datetemplate = RemoteObject.createNew ("b4j.example.b4xdatetemplate");__ref.setField("_datetemplate",preferencesdialog._datetemplate);
 //BA.debugLineNum = 13;BA.debugLine="Public LongTextTemplate As B4XLongTextTemplate";
preferencesdialog._longtexttemplate = RemoteObject.createNew ("b4j.example.b4xlongtexttemplate");__ref.setField("_longtexttemplate",preferencesdialog._longtexttemplate);
 //BA.debugLineNum = 14;BA.debugLine="Public Dialog As B4XDialog";
preferencesdialog._dialog = RemoteObject.createNew ("b4j.example.b4xdialog");__ref.setField("_dialog",preferencesdialog._dialog);
 //BA.debugLineNum = 15;BA.debugLine="Private RESULT_SHOWING_NESTED_DIALOG As Int = 100";
preferencesdialog._result_showing_nested_dialog = BA.numberCast(int.class, 100);__ref.setField("_result_showing_nested_dialog",preferencesdialog._result_showing_nested_dialog);
 //BA.debugLineNum = 16;BA.debugLine="Private NestedDialogItemIndex As Int";
preferencesdialog._nesteddialogitemindex = RemoteObject.createImmutable(0);__ref.setField("_nesteddialogitemindex",preferencesdialog._nesteddialogitemindex);
 //BA.debugLineNum = 17;BA.debugLine="Private mTitle As Object";
preferencesdialog._mtitle = RemoteObject.createNew ("Object");__ref.setField("_mtitle",preferencesdialog._mtitle);
 //BA.debugLineNum = 18;BA.debugLine="Public SearchTemplate As B4XSearchTemplate";
preferencesdialog._searchtemplate = RemoteObject.createNew ("b4j.example.b4xsearchtemplate");__ref.setField("_searchtemplate",preferencesdialog._searchtemplate);
 //BA.debugLineNum = 19;BA.debugLine="Private Template As Object";
preferencesdialog._template = RemoteObject.createNew ("Object");__ref.setField("_template",preferencesdialog._template);
 //BA.debugLineNum = 20;BA.debugLine="Public ColorTemplate As B4XColorTemplate";
preferencesdialog._colortemplate = RemoteObject.createNew ("b4j.example.b4xcolortemplate");__ref.setField("_colortemplate",preferencesdialog._colortemplate);
 //BA.debugLineNum = 21;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
preferencesdialog._b4xcombobox1 = RemoteObject.createNew ("b4j.example.b4xcombobox");__ref.setField("_b4xcombobox1",preferencesdialog._b4xcombobox1);
 //BA.debugLineNum = 22;BA.debugLine="Public const THEME_DARK = 1, THEME_LIGHT = 2 As I";
preferencesdialog._theme_dark = BA.numberCast(int.class, 1);__ref.setField("_theme_dark",preferencesdialog._theme_dark);
preferencesdialog._theme_light = BA.numberCast(int.class, 2);__ref.setField("_theme_light",preferencesdialog._theme_light);
 //BA.debugLineNum = 23;BA.debugLine="Private mTheme As Int";
preferencesdialog._mtheme = RemoteObject.createImmutable(0);__ref.setField("_mtheme",preferencesdialog._mtheme);
 //BA.debugLineNum = 24;BA.debugLine="Public ItemsBackgroundColor As Int";
preferencesdialog._itemsbackgroundcolor = RemoteObject.createImmutable(0);__ref.setField("_itemsbackgroundcolor",preferencesdialog._itemsbackgroundcolor);
 //BA.debugLineNum = 25;BA.debugLine="Public TextColor As Int";
preferencesdialog._textcolor = RemoteObject.createImmutable(0);__ref.setField("_textcolor",preferencesdialog._textcolor);
 //BA.debugLineNum = 26;BA.debugLine="Public SeparatorBackgroundColor, SeparatorTextCol";
preferencesdialog._separatorbackgroundcolor = RemoteObject.createImmutable(0);__ref.setField("_separatorbackgroundcolor",preferencesdialog._separatorbackgroundcolor);
preferencesdialog._separatortextcolor = RemoteObject.createImmutable(0);__ref.setField("_separatortextcolor",preferencesdialog._separatortextcolor);
 //BA.debugLineNum = 27;BA.debugLine="Private mCallback As Object";
preferencesdialog._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",preferencesdialog._mcallback);
 //BA.debugLineNum = 28;BA.debugLine="Private mEventName As String";
preferencesdialog._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",preferencesdialog._meventname);
 //BA.debugLineNum = 29;BA.debugLine="Public DefaultHintFont As B4XFont";
preferencesdialog._defaulthintfont = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");__ref.setField("_defaulthintfont",preferencesdialog._defaulthintfont);
 //BA.debugLineNum = 30;BA.debugLine="Public DefaultHintLargeSize As Int";
preferencesdialog._defaulthintlargesize = RemoteObject.createImmutable(0);__ref.setField("_defaulthintlargesize",preferencesdialog._defaulthintlargesize);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,375);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "preferencesdialog","clear", __ref);}
 BA.debugLineNum = 375;BA.debugLine="Public Sub Clear";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 376;BA.debugLine="CustomListView1.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 377;BA.debugLine="PrefItems.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefitems" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 378;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _colortohex(RemoteObject __ref,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("ColorToHex (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,943);
if (RapidSub.canDelegate("colortohex")) { return __ref.runUserSub(false, "preferencesdialog","colortohex", __ref, _clr);}
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 943;BA.debugLine="Private Sub ColorToHex(clr As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 944;BA.debugLine="Dim bc As ByteConverter";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 945;BA.debugLine="Return bc.HexFromBytes(bc.IntsToBytes(Array As In";
Debug.JustUpdateDeviceLine();
if (true) return _bc.runMethod(true,"HexFromBytes",(Object)(_bc.runMethod(false,"IntsToBytes",(Object)(RemoteObject.createNewArray("int",new int[] {1},new Object[] {_clr})))));
 BA.debugLineNum = 946;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _commitchanges(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("CommitChanges (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,691);
if (RapidSub.canDelegate("commitchanges")) { return __ref.runUserSub(false, "preferencesdialog","commitchanges", __ref, _data);}
RemoteObject _temp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("b4j.example.customlistview._clvitem");
RemoteObject _prefitem = RemoteObject.declareNull("b4j.example.preferencesdialog._b4xprefitem");
RemoteObject _itempanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _required = RemoteObject.createImmutable(false);
RemoteObject _value = RemoteObject.declareNull("Object");
RemoteObject _switch = RemoteObject.declareNull("b4j.example.b4xswitch");
RemoteObject _ft = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
RemoteObject _n = RemoteObject.createImmutable(0);
RemoteObject _n2 = RemoteObject.createImmutable(0);
RemoteObject _pmhours = RemoteObject.declareNull("b4j.example.b4xplusminus");
RemoteObject _pmminutes = RemoteObject.declareNull("b4j.example.b4xplusminus");
RemoteObject _pmampm = RemoteObject.declareNull("b4j.example.b4xplusminus");
RemoteObject _p = RemoteObject.declareNull("b4j.example.dateutils._period");
RemoteObject _pm = RemoteObject.declareNull("b4j.example.b4xplusminus");
RemoteObject _cmb = RemoteObject.declareNull("b4j.example.b4xcombobox");
RemoteObject _valid = RemoteObject.createImmutable(false);
RemoteObject _key = RemoteObject.createImmutable("");
Debug.locals.put("Data", _data);
 BA.debugLineNum = 691;BA.debugLine="Private Sub CommitChanges (Data As Map) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 692;BA.debugLine="Dim Temp As Map";
Debug.JustUpdateDeviceLine();
_temp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Temp", _temp);
 BA.debugLineNum = 693;BA.debugLine="Temp.Initialize";
Debug.JustUpdateDeviceLine();
_temp.runVoidMethod ("Initialize");
 BA.debugLineNum = 694;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 695;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
Debug.JustUpdateDeviceLine();
_item = __ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getrawlistitem",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 696;BA.debugLine="If (Item.Value Is B4XPrefItem) = False Then Exit";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_item.getField(false,"Value"), RemoteObject.createImmutable("b4j.example.preferencesdialog._b4xprefitem")))),preferencesdialog.__c.getField(true,"False"))) { 
if (true) break;};
 BA.debugLineNum = 697;BA.debugLine="Dim PrefItem As B4XPrefItem = Item.Value";
Debug.JustUpdateDeviceLine();
_prefitem = (_item.getField(false,"Value"));Debug.locals.put("PrefItem", _prefitem);Debug.locals.put("PrefItem", _prefitem);
 BA.debugLineNum = 698;BA.debugLine="Dim ItemPanel As B4XView = Item.Panel.GetView(0)";
Debug.JustUpdateDeviceLine();
_itempanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_itempanel = _item.getField(false,"Panel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("ItemPanel", _itempanel);Debug.locals.put("ItemPanel", _itempanel);
 BA.debugLineNum = 699;BA.debugLine="Dim Required As Boolean = PrefItem.Required";
Debug.JustUpdateDeviceLine();
_required = _prefitem.getField(true,"Required" /*RemoteObject*/ );Debug.locals.put("Required", _required);Debug.locals.put("Required", _required);
 BA.debugLineNum = 700;BA.debugLine="Dim Value As Object";
Debug.JustUpdateDeviceLine();
_value = RemoteObject.createNew ("Object");Debug.locals.put("Value", _value);
 BA.debugLineNum = 701;BA.debugLine="Select PrefItem.ItemType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_prefitem.getField(true,"ItemType" /*RemoteObject*/ ),__ref.getField(true,"_type_boolean" /*RemoteObject*/ ),__ref.getField(true,"_type_text" /*RemoteObject*/ ),__ref.getField(true,"_type_password" /*RemoteObject*/ ),__ref.getField(true,"_type_multilinetext" /*RemoteObject*/ ),__ref.getField(true,"_type_number" /*RemoteObject*/ ),__ref.getField(true,"_type_decimalnumber" /*RemoteObject*/ ),__ref.getField(true,"_type_date" /*RemoteObject*/ ),__ref.getField(true,"_type_time" /*RemoteObject*/ ),__ref.getField(true,"_type_numericrange" /*RemoteObject*/ ),__ref.getField(true,"_type_options" /*RemoteObject*/ ),__ref.getField(true,"_type_shortoptions" /*RemoteObject*/ ),__ref.getField(true,"_type_color" /*RemoteObject*/ ),__ref.getField(true,"_type_separator" /*RemoteObject*/ ),__ref.getField(true,"_type_explanation" /*RemoteObject*/ ))) {
case 0: {
 BA.debugLineNum = 703;BA.debugLine="Dim switch As B4XSwitch = ItemPanel.GetView(1)";
Debug.JustUpdateDeviceLine();
_switch = (_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(false,"getTag"));Debug.locals.put("switch", _switch);Debug.locals.put("switch", _switch);
 BA.debugLineNum = 704;BA.debugLine="Value = switch.Value";
Debug.JustUpdateDeviceLine();
_value = (_switch.runClassMethod (b4j.example.b4xswitch.class, "_getvalue" /*RemoteObject*/ ));Debug.locals.put("Value", _value);
 break; }
case 1: 
case 2: 
case 3: {
 BA.debugLineNum = 706;BA.debugLine="Dim ft As B4XFloatTextField = ItemPanel.GetVie";
Debug.JustUpdateDeviceLine();
_ft = (_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag"));Debug.locals.put("ft", _ft);Debug.locals.put("ft", _ft);
 BA.debugLineNum = 707;BA.debugLine="Value = ft.Text";
Debug.JustUpdateDeviceLine();
_value = (_ft.runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));Debug.locals.put("Value", _value);
 break; }
case 4: 
case 5: {
 BA.debugLineNum = 710;BA.debugLine="Dim ft As B4XFloatTextField = ItemPanel.GetVie";
Debug.JustUpdateDeviceLine();
_ft = (_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag"));Debug.locals.put("ft", _ft);Debug.locals.put("ft", _ft);
 BA.debugLineNum = 711;BA.debugLine="Dim n As Double";
Debug.JustUpdateDeviceLine();
_n = RemoteObject.createImmutable(0);Debug.locals.put("n", _n);
 BA.debugLineNum = 712;BA.debugLine="If ft.Text <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_ft.runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 713;BA.debugLine="If IsNumber(ft.Text) Then";
Debug.JustUpdateDeviceLine();
if (preferencesdialog.__c.runMethod(true,"IsNumber",(Object)(_ft.runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 714;BA.debugLine="n = ft.Text";
Debug.JustUpdateDeviceLine();
_n = BA.numberCast(double.class, _ft.runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));Debug.locals.put("n", _n);
 BA.debugLineNum = 715;BA.debugLine="If PrefItem.ItemType = TYPE_NUMBER Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_prefitem.getField(true,"ItemType" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_type_number" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 716;BA.debugLine="Dim n2 As Int = n";
Debug.JustUpdateDeviceLine();
_n2 = BA.numberCast(int.class, _n);Debug.locals.put("n2", _n2);Debug.locals.put("n2", _n2);
 BA.debugLineNum = 717;BA.debugLine="Value = n2";
Debug.JustUpdateDeviceLine();
_value = (_n2);Debug.locals.put("Value", _value);
 }else {
 BA.debugLineNum = 719;BA.debugLine="Value = n";
Debug.JustUpdateDeviceLine();
_value = (_n);Debug.locals.put("Value", _value);
 };
 }else {
 BA.debugLineNum = 722;BA.debugLine="GoToItem(i)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_gotoitem" /*void*/ ,(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 723;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return preferencesdialog.__c.getField(true,"False");
 };
 }else {
 BA.debugLineNum = 726;BA.debugLine="Value = \"\"";
Debug.JustUpdateDeviceLine();
_value = RemoteObject.createImmutable((""));Debug.locals.put("Value", _value);
 };
 break; }
case 6: {
 BA.debugLineNum = 729;BA.debugLine="Value = DateTime.DateParse(ItemPanel.GetView(1";
Debug.JustUpdateDeviceLine();
_value = (preferencesdialog.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"getText"))));Debug.locals.put("Value", _value);
 break; }
case 7: {
 BA.debugLineNum = 731;BA.debugLine="Dim pmHours As B4XPlusMinus = ItemPanel.GetVie";
Debug.JustUpdateDeviceLine();
_pmhours = (_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag"));Debug.locals.put("pmHours", _pmhours);Debug.locals.put("pmHours", _pmhours);
 BA.debugLineNum = 732;BA.debugLine="Dim pmMinutes As B4XPlusMinus = ItemPanel.GetV";
Debug.JustUpdateDeviceLine();
_pmminutes = (_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(false,"getTag"));Debug.locals.put("pmMinutes", _pmminutes);Debug.locals.put("pmMinutes", _pmminutes);
 BA.debugLineNum = 733;BA.debugLine="Dim pmAMPM As B4XPlusMinus = ItemPanel.GetView";
Debug.JustUpdateDeviceLine();
_pmampm = (_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag"));Debug.locals.put("pmAMPM", _pmampm);Debug.locals.put("pmAMPM", _pmampm);
 BA.debugLineNum = 734;BA.debugLine="Dim p As Period";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("b4j.example.dateutils._period");Debug.locals.put("p", _p);
 BA.debugLineNum = 735;BA.debugLine="p.Initialize";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("Initialize");
 BA.debugLineNum = 736;BA.debugLine="p.Hours = pmHours.SelectedValue";
Debug.JustUpdateDeviceLine();
_p.setField ("Hours",BA.numberCast(int.class, _pmhours.runClassMethod (b4j.example.b4xplusminus.class, "_getselectedvalue" /*RemoteObject*/ )));
 BA.debugLineNum = 737;BA.debugLine="If PrefItem.Extra.GetDefault(\"24\", False) = Fa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_prefitem.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("24"))),(Object)((preferencesdialog.__c.getField(true,"False")))),(preferencesdialog.__c.getField(true,"False")))) { 
 BA.debugLineNum = 738;BA.debugLine="If p.Hours = 12 Then p.Hours = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_p.getField(true,"Hours"),BA.numberCast(double.class, 12))) { 
_p.setField ("Hours",BA.numberCast(int.class, 0));};
 BA.debugLineNum = 739;BA.debugLine="If pmAMPM.SelectedValue = \"pm\" Then p.Hours =";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_pmampm.runClassMethod (b4j.example.b4xplusminus.class, "_getselectedvalue" /*RemoteObject*/ ),RemoteObject.createImmutable(("pm")))) { 
_p.setField ("Hours",RemoteObject.solve(new RemoteObject[] {_p.getField(true,"Hours"),RemoteObject.createImmutable(12)}, "+",1, 1));};
 };
 BA.debugLineNum = 741;BA.debugLine="p.Minutes = pmMinutes.SelectedValue";
Debug.JustUpdateDeviceLine();
_p.setField ("Minutes",BA.numberCast(int.class, _pmminutes.runClassMethod (b4j.example.b4xplusminus.class, "_getselectedvalue" /*RemoteObject*/ )));
 BA.debugLineNum = 742;BA.debugLine="Value = p";
Debug.JustUpdateDeviceLine();
_value = (_p);Debug.locals.put("Value", _value);
 break; }
case 8: {
 BA.debugLineNum = 744;BA.debugLine="Dim pm As B4XPlusMinus = ItemPanel.GetView(0).";
Debug.JustUpdateDeviceLine();
_pm = (_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag"));Debug.locals.put("pm", _pm);Debug.locals.put("pm", _pm);
 BA.debugLineNum = 745;BA.debugLine="Value = pm.SelectedValue";
Debug.JustUpdateDeviceLine();
_value = _pm.runClassMethod (b4j.example.b4xplusminus.class, "_getselectedvalue" /*RemoteObject*/ );Debug.locals.put("Value", _value);
 break; }
case 9: {
 BA.debugLineNum = 747;BA.debugLine="Value = ItemPanel.GetView(1).Text";
Debug.JustUpdateDeviceLine();
_value = (_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"getText"));Debug.locals.put("Value", _value);
 break; }
case 10: {
 BA.debugLineNum = 749;BA.debugLine="Dim cmb As B4XComboBox = ItemPanel.GetView(1).";
Debug.JustUpdateDeviceLine();
_cmb = (_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(false,"getTag"));Debug.locals.put("cmb", _cmb);Debug.locals.put("cmb", _cmb);
 BA.debugLineNum = 750;BA.debugLine="If cmb.SelectedIndex > -1 Then Value = cmb.Get";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_cmb.runClassMethod (b4j.example.b4xcombobox.class, "_getselectedindex" /*RemoteObject*/ ),BA.numberCast(double.class, -(double) (0 + 1)))) { 
_value = (_cmb.runClassMethod (b4j.example.b4xcombobox.class, "_getitem" /*RemoteObject*/ ,(Object)(_cmb.runClassMethod (b4j.example.b4xcombobox.class, "_getselectedindex" /*RemoteObject*/ ))));Debug.locals.put("Value", _value);}
else {
_value = RemoteObject.createImmutable((""));Debug.locals.put("Value", _value);};
 break; }
case 11: {
 BA.debugLineNum = 752;BA.debugLine="Value = ItemPanel.GetView(1).Color";
Debug.JustUpdateDeviceLine();
_value = (_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"getColor"));Debug.locals.put("Value", _value);
 break; }
case 12: 
case 13: {
 BA.debugLineNum = 754;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
if (true) continue;
 break; }
}
;
 BA.debugLineNum = 756;BA.debugLine="If Value = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 757;BA.debugLine="If Required Then";
Debug.JustUpdateDeviceLine();
if (_required.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 758;BA.debugLine="GoToItem(i)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_gotoitem" /*void*/ ,(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 759;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return preferencesdialog.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 761;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
if (true) continue;
 };
 };
 BA.debugLineNum = 764;BA.debugLine="Temp.Put(PrefItem.Key, Value)";
Debug.JustUpdateDeviceLine();
_temp.runVoidMethod ("Put",(Object)((_prefitem.getField(true,"Key" /*RemoteObject*/ ))),(Object)(_value));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 766;BA.debugLine="If mEventName <> \"\" And xui.SubExists(mCallback,";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_meventname" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_IsValid"))),(Object)(BA.numberCast(int.class, 1))))) { 
 BA.debugLineNum = 767;BA.debugLine="Dim Valid As Boolean = CallSub2(mCallback, mEven";
Debug.JustUpdateDeviceLine();
_valid = BA.ObjectToBoolean(preferencesdialog.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_IsValid"))),(Object)((_temp))));Debug.locals.put("Valid", _valid);Debug.locals.put("Valid", _valid);
 BA.debugLineNum = 768;BA.debugLine="If Valid = False Then Return False";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_valid,preferencesdialog.__c.getField(true,"False"))) { 
if (true) return preferencesdialog.__c.getField(true,"False");};
 };
 BA.debugLineNum = 770;BA.debugLine="For Each key As String In Temp.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group78 = _temp.runMethod(false,"Keys");
final int groupLen78 = group78.runMethod(true,"getSize").<Integer>get()
;int index78 = 0;
;
for (; index78 < groupLen78;index78++){
_key = BA.ObjectToString(group78.runMethod(false,"Get",index78));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 771;BA.debugLine="Data.Put(key, Temp.Get(key))";
Debug.JustUpdateDeviceLine();
_data.runVoidMethod ("Put",(Object)((_key)),(Object)(_temp.runMethod(false,"Get",(Object)((_key)))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 773;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return preferencesdialog.__c.getField(true,"True");
 BA.debugLineNum = 774;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlabel(RemoteObject __ref,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,877);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "preferencesdialog","createlabel", __ref, _eventname);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 877;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 878;BA.debugLine="Dim lbl As Label";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 879;BA.debugLine="lbl.Initialize(EventName)";
Debug.JustUpdateDeviceLine();
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_eventname));
 BA.debugLineNum = 880;BA.debugLine="Return lbl";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());
 BA.debugLineNum = 881;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlayouts(RemoteObject __ref,RemoteObject _prefitem) throws Exception{
try {
		Debug.PushSubsStack("CreateLayouts (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,512);
if (RapidSub.canDelegate("createlayouts")) { return __ref.runUserSub(false, "preferencesdialog","createlayouts", __ref, _prefitem);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _ft = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
RemoteObject _original = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tf = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rlbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
Debug.locals.put("PrefItem", _prefitem);
 BA.debugLineNum = 512;BA.debugLine="Private Sub CreateLayouts (PrefItem As B4XPrefItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 513;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 514;BA.debugLine="p.Width = CustomListView1.sv.ScrollViewContentWid";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setWidth",__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewContentWidth"));
 BA.debugLineNum = 515;BA.debugLine="p.Height = 50dip";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setHeight",BA.numberCast(double.class, preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 516;BA.debugLine="Select PrefItem.ItemType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_prefitem.getField(true,"ItemType" /*RemoteObject*/ ),__ref.getField(true,"_type_boolean" /*RemoteObject*/ ),__ref.getField(true,"_type_multilinetext" /*RemoteObject*/ ),__ref.getField(true,"_type_time" /*RemoteObject*/ ),__ref.getField(true,"_type_numericrange" /*RemoteObject*/ ),__ref.getField(true,"_type_text" /*RemoteObject*/ ),__ref.getField(true,"_type_password" /*RemoteObject*/ ),__ref.getField(true,"_type_number" /*RemoteObject*/ ),__ref.getField(true,"_type_decimalnumber" /*RemoteObject*/ ),__ref.getField(true,"_type_date" /*RemoteObject*/ ),__ref.getField(true,"_type_options" /*RemoteObject*/ ),__ref.getField(true,"_type_shortoptions" /*RemoteObject*/ ),__ref.getField(true,"_type_color" /*RemoteObject*/ ),__ref.getField(true,"_type_explanation" /*RemoteObject*/ ),__ref.getField(true,"_type_separator" /*RemoteObject*/ ))) {
case 0: {
 BA.debugLineNum = 518;BA.debugLine="p.LoadLayout(\"booleanitem\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("booleanitem")),__ref.getField(false, "ba"));
 BA.debugLineNum = 519;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetV";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_internalsettextorcsbuildertolabel" /*RemoteObject*/ ,(Object)(_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)))),(Object)(_prefitem.getField(false,"Title" /*RemoteObject*/ )));
 BA.debugLineNum = 520;BA.debugLine="p.GetView(0).TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setTextColor",__ref.getField(true,"_textcolor" /*RemoteObject*/ ));
 break; }
case 1: {
 BA.debugLineNum = 522;BA.debugLine="p.Height = PrefItem.Extra.Get(\"height\")";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setHeight",BA.numberCast(double.class, _prefitem.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("height"))))));
 BA.debugLineNum = 523;BA.debugLine="p.LoadLayout(\"textitemmulti\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("textitemmulti")),__ref.getField(false, "ba"));
 BA.debugLineNum = 524;BA.debugLine="Dim ft As B4XFloatTextField = p.GetView(0).Tag";
Debug.JustUpdateDeviceLine();
_ft = (_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag"));Debug.locals.put("ft", _ft);Debug.locals.put("ft", _ft);
 BA.debugLineNum = 525;BA.debugLine="ft.HintText = PrefItem.Title";
Debug.JustUpdateDeviceLine();
_ft.setField ("_hinttext" /*RemoteObject*/ ,BA.ObjectToString(_prefitem.getField(false,"Title" /*RemoteObject*/ )));
 BA.debugLineNum = 526;BA.debugLine="ft.HintFont = DefaultHintFont";
Debug.JustUpdateDeviceLine();
_ft.setField ("_hintfont" /*RemoteObject*/ ,__ref.getField(false,"_defaulthintfont" /*RemoteObject*/ ));
 BA.debugLineNum = 527;BA.debugLine="ft.LargeLabelTextSize = DefaultHintLargeSize";
Debug.JustUpdateDeviceLine();
_ft.setField ("_largelabeltextsize" /*RemoteObject*/ ,BA.numberCast(float.class, __ref.getField(true,"_defaulthintlargesize" /*RemoteObject*/ )));
 BA.debugLineNum = 528;BA.debugLine="ft.Update";
Debug.JustUpdateDeviceLine();
_ft.runClassMethod (b4j.example.b4xfloattextfield.class, "_update" /*RemoteObject*/ );
 break; }
case 2: {
 BA.debugLineNum = 530;BA.debugLine="CreateTimeItem(PrefItem, p)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_createtimeitem" /*RemoteObject*/ ,(Object)(_prefitem),(Object)(_p));
 break; }
case 3: {
 BA.debugLineNum = 532;BA.debugLine="CreateNumericRangeItem(PrefItem, p)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_createnumericrangeitem" /*RemoteObject*/ ,(Object)(_prefitem),(Object)(_p));
 break; }
case 4: 
case 5: 
case 6: 
case 7: {
 BA.debugLineNum = 534;BA.debugLine="p.Height = 60dip";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setHeight",BA.numberCast(double.class, preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 535;BA.debugLine="If PrefItem.ItemType = TYPE_PASSWORD Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_prefitem.getField(true,"ItemType" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_type_password" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 536;BA.debugLine="p.LoadLayout(\"passworditem\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("passworditem")),__ref.getField(false, "ba"));
 }else {
 BA.debugLineNum = 538;BA.debugLine="p.LoadLayout(\"textitem\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("textitem")),__ref.getField(false, "ba"));
 BA.debugLineNum = 539;BA.debugLine="Dim ft As B4XFloatTextField = p.GetView(0).Tag";
Debug.JustUpdateDeviceLine();
_ft = (_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag"));Debug.locals.put("ft", _ft);Debug.locals.put("ft", _ft);
 BA.debugLineNum = 540;BA.debugLine="If PrefItem.ItemType = TYPE_NUMBER Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_prefitem.getField(true,"ItemType" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_type_number" /*RemoteObject*/ )))) { 
 }else 
{ BA.debugLineNum = 548;BA.debugLine="Else If PrefItem.ItemType = TYPE_DECIMALNUMBER";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_prefitem.getField(true,"ItemType" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_type_decimalnumber" /*RemoteObject*/ )))) { 
 }}
;
 };
 BA.debugLineNum = 559;BA.debugLine="Dim ft As B4XFloatTextField = p.GetView(0).Tag";
Debug.JustUpdateDeviceLine();
_ft = (_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag"));Debug.locals.put("ft", _ft);Debug.locals.put("ft", _ft);
 BA.debugLineNum = 560;BA.debugLine="ft.HintText = PrefItem.Title";
Debug.JustUpdateDeviceLine();
_ft.setField ("_hinttext" /*RemoteObject*/ ,BA.ObjectToString(_prefitem.getField(false,"Title" /*RemoteObject*/ )));
 BA.debugLineNum = 561;BA.debugLine="ft.HintFont = DefaultHintFont";
Debug.JustUpdateDeviceLine();
_ft.setField ("_hintfont" /*RemoteObject*/ ,__ref.getField(false,"_defaulthintfont" /*RemoteObject*/ ));
 BA.debugLineNum = 562;BA.debugLine="ft.LargeLabelTextSize = DefaultHintLargeSize";
Debug.JustUpdateDeviceLine();
_ft.setField ("_largelabeltextsize" /*RemoteObject*/ ,BA.numberCast(float.class, __ref.getField(true,"_defaulthintlargesize" /*RemoteObject*/ )));
 BA.debugLineNum = 563;BA.debugLine="ft.Update";
Debug.JustUpdateDeviceLine();
_ft.runClassMethod (b4j.example.b4xfloattextfield.class, "_update" /*RemoteObject*/ );
 break; }
case 8: {
 BA.debugLineNum = 565;BA.debugLine="TwoLabelsLayout(\"lblDate\", p, PrefItem)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_twolabelslayout" /*RemoteObject*/ ,(Object)(BA.ObjectToString("lblDate")),(Object)(_p),(Object)(_prefitem));
 break; }
case 9: {
 BA.debugLineNum = 567;BA.debugLine="TwoLabelsLayout(\"lblOptions\", p, PrefItem)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_twolabelslayout" /*RemoteObject*/ ,(Object)(BA.ObjectToString("lblOptions")),(Object)(_p),(Object)(_prefitem));
 break; }
case 10: {
 BA.debugLineNum = 569;BA.debugLine="p.LoadLayout(\"shortoptions\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("shortoptions")),__ref.getField(false, "ba"));
 BA.debugLineNum = 570;BA.debugLine="p.GetView(0).TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setTextColor",__ref.getField(true,"_textcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 571;BA.debugLine="Dim original As List = PrefItem.Extra.Get(\"opti";
Debug.JustUpdateDeviceLine();
_original = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_original = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _prefitem.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("options")))));Debug.locals.put("original", _original);Debug.locals.put("original", _original);
 BA.debugLineNum = 591;BA.debugLine="B4XComboBox1.SetItems(original)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_b4xcombobox1" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xcombobox.class, "_setitems" /*RemoteObject*/ ,(Object)(_original));
 BA.debugLineNum = 593;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetV";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_internalsettextorcsbuildertolabel" /*RemoteObject*/ ,(Object)(_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)))),(Object)(_prefitem.getField(false,"Title" /*RemoteObject*/ )));
 break; }
case 11: {
 BA.debugLineNum = 595;BA.debugLine="p.Height = 60dip";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setHeight",BA.numberCast(double.class, preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 596;BA.debugLine="p.LoadLayout(\"coloritem\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("coloritem")),__ref.getField(false, "ba"));
 BA.debugLineNum = 597;BA.debugLine="Dim tf As B4XFloatTextField = p.GetView(0).Tag";
Debug.JustUpdateDeviceLine();
_tf = (_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag"));Debug.locals.put("tf", _tf);Debug.locals.put("tf", _tf);
 BA.debugLineNum = 598;BA.debugLine="tf.HintFont = DefaultHintFont";
Debug.JustUpdateDeviceLine();
_tf.setField ("_hintfont" /*RemoteObject*/ ,__ref.getField(false,"_defaulthintfont" /*RemoteObject*/ ));
 BA.debugLineNum = 599;BA.debugLine="tf.LargeLabelTextSize = DefaultHintLargeSize";
Debug.JustUpdateDeviceLine();
_tf.setField ("_largelabeltextsize" /*RemoteObject*/ ,BA.numberCast(float.class, __ref.getField(true,"_defaulthintlargesize" /*RemoteObject*/ )));
 BA.debugLineNum = 600;BA.debugLine="tf.HintText = PrefItem.Title";
Debug.JustUpdateDeviceLine();
_tf.setField ("_hinttext" /*RemoteObject*/ ,BA.ObjectToString(_prefitem.getField(false,"Title" /*RemoteObject*/ )));
 BA.debugLineNum = 601;BA.debugLine="tf.Update";
Debug.JustUpdateDeviceLine();
_tf.runClassMethod (b4j.example.b4xfloattextfield.class, "_update" /*RemoteObject*/ );
 break; }
case 12: {
 BA.debugLineNum = 607;BA.debugLine="TwoLabelsLayout(\"lblExplanation\", p, PrefItem)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_twolabelslayout" /*RemoteObject*/ ,(Object)(BA.ObjectToString("lblExplanation")),(Object)(_p),(Object)(_prefitem));
 break; }
case 13: {
 BA.debugLineNum = 609;BA.debugLine="Dim lbl As Label";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 610;BA.debugLine="lbl.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 611;BA.debugLine="Dim xlbl As B4XView = lbl";
Debug.JustUpdateDeviceLine();
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("xlbl", _xlbl);Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 612;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.JustUpdateDeviceLine();
_xlbl.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 613;BA.debugLine="xlbl.TextColor = SeparatorTextColor";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setTextColor",__ref.getField(true,"_separatortextcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 614;BA.debugLine="xlbl.Font = xui.CreateDefaultBoldFont(14)";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, 14))));
 BA.debugLineNum = 615;BA.debugLine="xlbl.Color = SeparatorBackgroundColor";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setColor",__ref.getField(true,"_separatorbackgroundcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 616;BA.debugLine="p.Height = 30dip";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setHeight",BA.numberCast(double.class, preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))));
 BA.debugLineNum = 617;BA.debugLine="p.AddView(xlbl, 0, 0, p.Width, p.Height)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("AddView",(Object)((_xlbl.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_p.runMethod(true,"getWidth")),(Object)(_p.runMethod(true,"getHeight")));
 BA.debugLineNum = 618;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(xlbl,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_internalsettextorcsbuildertolabel" /*RemoteObject*/ ,(Object)(_xlbl),(Object)(_prefitem.getField(false,"Title" /*RemoteObject*/ )));
 BA.debugLineNum = 619;BA.debugLine="PrefItem.Required = False";
Debug.JustUpdateDeviceLine();
_prefitem.setField ("Required" /*RemoteObject*/ ,preferencesdialog.__c.getField(true,"False"));
 break; }
}
;
 BA.debugLineNum = 621;BA.debugLine="If PrefItem.Required Then";
Debug.JustUpdateDeviceLine();
if (_prefitem.getField(true,"Required" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 622;BA.debugLine="Dim rlbl As Label";
Debug.JustUpdateDeviceLine();
_rlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("rlbl", _rlbl);
 BA.debugLineNum = 623;BA.debugLine="rlbl.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_rlbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 624;BA.debugLine="Dim xlbl As B4XView = rlbl";
Debug.JustUpdateDeviceLine();
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _rlbl.getObject());Debug.locals.put("xlbl", _xlbl);Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 625;BA.debugLine="xlbl.Text = \"*\"";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setText",BA.ObjectToString("*"));
 BA.debugLineNum = 626;BA.debugLine="xlbl.TextColor = xui.Color_Red";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 BA.debugLineNum = 627;BA.debugLine="xlbl.TextSize = 11";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, 11));
 BA.debugLineNum = 628;BA.debugLine="xlbl.SetTextAlignment(\"TOP\", \"LEFT\")";
Debug.JustUpdateDeviceLine();
_xlbl.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("TOP")),(Object)(RemoteObject.createImmutable("LEFT")));
 BA.debugLineNum = 629;BA.debugLine="p.AddView(xlbl, 01dip, 0dip, 10dip, 10dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("AddView",(Object)((_xlbl.getObject())),(Object)(BA.numberCast(double.class, preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 01))))),(Object)(BA.numberCast(double.class, preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(double.class, preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))))),(Object)(BA.numberCast(double.class, preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))))));
 };
 BA.debugLineNum = 631;BA.debugLine="p.Color = ItemsBackgroundColor";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setColor",__ref.getField(true,"_itemsbackgroundcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 632;BA.debugLine="If mTheme <> THEME_DARK Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mtheme" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_theme_dark" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 633;BA.debugLine="If p.GetView(0).Tag Is B4XFloatTextField Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("i",_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag"), RemoteObject.createImmutable("b4j.example.b4xfloattextfield"))) { 
 BA.debugLineNum = 634;BA.debugLine="Dim tf As B4XFloatTextField = p.GetView(0).Tag";
Debug.JustUpdateDeviceLine();
_tf = (_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag"));Debug.locals.put("tf", _tf);Debug.locals.put("tf", _tf);
 BA.debugLineNum = 635;BA.debugLine="tf.TextField.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_tf.runClassMethod (b4j.example.b4xfloattextfield.class, "_gettextfield" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_textcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 636;BA.debugLine="tf.NonFocusedHintColor = TextColor";
Debug.JustUpdateDeviceLine();
_tf.setField ("_nonfocusedhintcolor" /*RemoteObject*/ ,__ref.getField(true,"_textcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 637;BA.debugLine="tf.Update";
Debug.JustUpdateDeviceLine();
_tf.runClassMethod (b4j.example.b4xfloattextfield.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 638;BA.debugLine="If tf.lblClear.IsInitialized Then tf.lblClear.T";
Debug.JustUpdateDeviceLine();
if (_tf.getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_tf.getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_textcolor" /*RemoteObject*/ ));};
 BA.debugLineNum = 639;BA.debugLine="If tf.lblV.IsInitialized Then tf.lblV.TextColor";
Debug.JustUpdateDeviceLine();
if (_tf.getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_tf.getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_textcolor" /*RemoteObject*/ ));};
 };
 };
 BA.debugLineNum = 642;BA.debugLine="Return p";
Debug.JustUpdateDeviceLine();
if (true) return _p;
 BA.debugLineNum = 643;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createnumericrangeitem(RemoteObject __ref,RemoteObject _prefitem,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("CreateNumericRangeItem (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,645);
if (RapidSub.canDelegate("createnumericrangeitem")) { return __ref.runUserSub(false, "preferencesdialog","createnumericrangeitem", __ref, _prefitem, _p);}
RemoteObject _pm = RemoteObject.declareNull("b4j.example.b4xplusminus");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("PrefItem", _prefitem);
Debug.locals.put("p", _p);
 BA.debugLineNum = 645;BA.debugLine="Private Sub CreateNumericRangeItem (PrefItem As B4";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 646;BA.debugLine="p.LoadLayout(\"numericrange\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("numericrange")),__ref.getField(false, "ba"));
 BA.debugLineNum = 647;BA.debugLine="Dim pm As B4XPlusMinus = p.GetView(0).Tag";
Debug.JustUpdateDeviceLine();
_pm = (_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag"));Debug.locals.put("pm", _pm);Debug.locals.put("pm", _pm);
 BA.debugLineNum = 648;BA.debugLine="pm.SetNumericRange(PrefItem.Extra.Get(\"start\"), P";
Debug.JustUpdateDeviceLine();
_pm.runClassMethod (b4j.example.b4xplusminus.class, "_setnumericrange" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, _prefitem.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("start")))))),(Object)(BA.numberCast(double.class, _prefitem.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("end")))))),(Object)(BA.numberCast(double.class, _prefitem.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("interval")))))));
 BA.debugLineNum = 649;BA.debugLine="pm.Formatter.GetDefaultFormat.MaximumFractions =";
Debug.JustUpdateDeviceLine();
_pm.getField(false,"_formatter" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("MaximumFractions" /*RemoteObject*/ ,BA.numberCast(int.class, 2));
 BA.debugLineNum = 650;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetVie";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_internalsettextorcsbuildertolabel" /*RemoteObject*/ ,(Object)(_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1)))),(Object)(_prefitem.getField(false,"Title" /*RemoteObject*/ )));
 BA.debugLineNum = 651;BA.debugLine="For Each v As B4XView In p.GetAllViewsRecursive";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group6 = _p.runMethod(false,"GetAllViewsRecursive");
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group6.runMethod(false,"Get",index6));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 652;BA.debugLine="If v Is Label Then v.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("i",_v.getObjectOrNull(), RemoteObject.createImmutable("javafx.scene.control.Label"))) { 
_v.runMethod(true,"setTextColor",__ref.getField(true,"_textcolor" /*RemoteObject*/ ));};
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 654;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createprefitem(RemoteObject __ref,RemoteObject _title,RemoteObject _itemtype,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("CreatePrefItem (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,266);
if (RapidSub.canDelegate("createprefitem")) { return __ref.runUserSub(false, "preferencesdialog","createprefitem", __ref, _title, _itemtype, _key);}
RemoteObject _pi = RemoteObject.declareNull("b4j.example.preferencesdialog._b4xprefitem");
Debug.locals.put("Title", _title);
Debug.locals.put("ItemType", _itemtype);
Debug.locals.put("Key", _key);
 BA.debugLineNum = 266;BA.debugLine="Private Sub CreatePrefItem(Title As Object, ItemTy";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 267;BA.debugLine="Dim pi As B4XPrefItem";
Debug.JustUpdateDeviceLine();
_pi = RemoteObject.createNew ("b4j.example.preferencesdialog._b4xprefitem");Debug.locals.put("pi", _pi);
 BA.debugLineNum = 268;BA.debugLine="pi.Initialize";
Debug.JustUpdateDeviceLine();
_pi.runVoidMethod ("Initialize");
 BA.debugLineNum = 269;BA.debugLine="pi.Title = Title";
Debug.JustUpdateDeviceLine();
_pi.setField ("Title" /*RemoteObject*/ ,_title);
 BA.debugLineNum = 270;BA.debugLine="pi.ItemType = ItemType";
Debug.JustUpdateDeviceLine();
_pi.setField ("ItemType" /*RemoteObject*/ ,_itemtype);
 BA.debugLineNum = 271;BA.debugLine="pi.Key = Key";
Debug.JustUpdateDeviceLine();
_pi.setField ("Key" /*RemoteObject*/ ,_key);
 BA.debugLineNum = 272;BA.debugLine="Return pi";
Debug.JustUpdateDeviceLine();
if (true) return _pi;
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtimeitem(RemoteObject __ref,RemoteObject _prefitem,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("CreateTimeItem (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,656);
if (RapidSub.canDelegate("createtimeitem")) { return __ref.runUserSub(false, "preferencesdialog","createtimeitem", __ref, _prefitem, _p);}
RemoteObject _is24 = RemoteObject.createImmutable(false);
RemoteObject _pmhours = RemoteObject.declareNull("b4j.example.b4xplusminus");
RemoteObject _pmminutes = RemoteObject.declareNull("b4j.example.b4xplusminus");
RemoteObject _pmampm = RemoteObject.declareNull("b4j.example.b4xplusminus");
RemoteObject _clr = RemoteObject.createImmutable(0);
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("PrefItem", _prefitem);
Debug.locals.put("p", _p);
 BA.debugLineNum = 656;BA.debugLine="Private Sub CreateTimeItem (PrefItem As B4XPrefIte";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 657;BA.debugLine="p.Height = 60dip";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setHeight",BA.numberCast(double.class, preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 658;BA.debugLine="Dim is24 As Boolean = PrefItem.Extra.GetDefault(\"";
Debug.JustUpdateDeviceLine();
_is24 = BA.ObjectToBoolean(_prefitem.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("24"))),(Object)((preferencesdialog.__c.getField(true,"False")))));Debug.locals.put("is24", _is24);Debug.locals.put("is24", _is24);
 BA.debugLineNum = 659;BA.debugLine="If is24 Then";
Debug.JustUpdateDeviceLine();
if (_is24.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 660;BA.debugLine="p.LoadLayout(\"timeitem24\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("timeitem24")),__ref.getField(false, "ba"));
 }else {
 BA.debugLineNum = 662;BA.debugLine="p.LoadLayout(\"timeitem\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("timeitem")),__ref.getField(false, "ba"));
 };
 BA.debugLineNum = 664;BA.debugLine="Dim pmHours As B4XPlusMinus = p.GetView(0).Tag";
Debug.JustUpdateDeviceLine();
_pmhours = (_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag"));Debug.locals.put("pmHours", _pmhours);Debug.locals.put("pmHours", _pmhours);
 BA.debugLineNum = 665;BA.debugLine="pmHours.RapidPeriod2 = 100";
Debug.JustUpdateDeviceLine();
_pmhours.setField ("_rapidperiod2" /*RemoteObject*/ ,BA.numberCast(int.class, 100));
 BA.debugLineNum = 666;BA.debugLine="Dim pmMinutes As B4XPlusMinus = p.GetView(1).Tag";
Debug.JustUpdateDeviceLine();
_pmminutes = (_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(false,"getTag"));Debug.locals.put("pmMinutes", _pmminutes);Debug.locals.put("pmMinutes", _pmminutes);
 BA.debugLineNum = 667;BA.debugLine="Dim pmAMPM As B4XPlusMinus = p.GetView(2).Tag";
Debug.JustUpdateDeviceLine();
_pmampm = (_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag"));Debug.locals.put("pmAMPM", _pmampm);Debug.locals.put("pmAMPM", _pmampm);
 BA.debugLineNum = 668;BA.debugLine="If xui.IsB4J = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J"),preferencesdialog.__c.getField(true,"False"))) { 
 BA.debugLineNum = 669;BA.debugLine="Dim clr As Int = CustomListView1.sv.ScrollViewIn";
Debug.JustUpdateDeviceLine();
_clr = __ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"getColor");Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 670;BA.debugLine="pmHours.mBase.SetColorAndBorder(xui.Color_Transp";
Debug.JustUpdateDeviceLine();
_pmhours.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(_clr),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 671;BA.debugLine="pmMinutes.mBase.SetColorAndBorder(xui.Color_Tran";
Debug.JustUpdateDeviceLine();
_pmminutes.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(_clr),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 672;BA.debugLine="pmAMPM.mBase.SetColorAndBorder(xui.Color_Transpa";
Debug.JustUpdateDeviceLine();
_pmampm.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(_clr),(Object)(BA.numberCast(double.class, 0)));
 };
 BA.debugLineNum = 675;BA.debugLine="If is24 Then";
Debug.JustUpdateDeviceLine();
if (_is24.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 676;BA.debugLine="pmHours.SetNumericRange(0, 23, 1)";
Debug.JustUpdateDeviceLine();
_pmhours.runClassMethod (b4j.example.b4xplusminus.class, "_setnumericrange" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 23)),(Object)(BA.numberCast(double.class, 1)));
 }else {
 BA.debugLineNum = 678;BA.debugLine="pmHours.SetNumericRange(1, 12, 1)";
Debug.JustUpdateDeviceLine();
_pmhours.runClassMethod (b4j.example.b4xplusminus.class, "_setnumericrange" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, 1)),(Object)(BA.numberCast(double.class, 12)),(Object)(BA.numberCast(double.class, 1)));
 };
 BA.debugLineNum = 680;BA.debugLine="pmMinutes.SetNumericRange(0, 59, 1)";
Debug.JustUpdateDeviceLine();
_pmminutes.runClassMethod (b4j.example.b4xplusminus.class, "_setnumericrange" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 59)),(Object)(BA.numberCast(double.class, 1)));
 BA.debugLineNum = 681;BA.debugLine="pmMinutes.Formatter.GetDefaultFormat.MinimumInteg";
Debug.JustUpdateDeviceLine();
_pmminutes.getField(false,"_formatter" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("MinimumIntegers" /*RemoteObject*/ ,BA.numberCast(int.class, 2));
 BA.debugLineNum = 683;BA.debugLine="pmAMPM.SetStringItems(Array(\"am\", \"pm\"))";
Debug.JustUpdateDeviceLine();
_pmampm.runClassMethod (b4j.example.b4xplusminus.class, "_setstringitems" /*RemoteObject*/ ,(Object)(preferencesdialog.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("am")),(RemoteObject.createImmutable("pm"))})))));
 BA.debugLineNum = 684;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetVie";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_internalsettextorcsbuildertolabel" /*RemoteObject*/ ,(Object)(_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3)))),(Object)(_prefitem.getField(false,"Title" /*RemoteObject*/ )));
 BA.debugLineNum = 685;BA.debugLine="For Each v As B4XView In p.GetAllViewsRecursive";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group27 = _p.runMethod(false,"GetAllViewsRecursive");
final int groupLen27 = group27.runMethod(true,"getSize").<Integer>get()
;int index27 = 0;
;
for (; index27 < groupLen27;index27++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group27.runMethod(false,"Get",index27));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 686;BA.debugLine="If v Is Label Then v.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("i",_v.getObjectOrNull(), RemoteObject.createImmutable("javafx.scene.control.Label"))) { 
_v.runMethod(true,"setTextColor",__ref.getField(true,"_textcolor" /*RemoteObject*/ ));};
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 688;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dialogclosed(RemoteObject __ref,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("DialogClosed (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,904);
if (RapidSub.canDelegate("dialogclosed")) { return __ref.runUserSub(false, "preferencesdialog","dialogclosed", __ref, _result);}
Debug.locals.put("Result", _result);
 BA.debugLineNum = 904;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 906;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _filldata(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("FillData (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,381);
if (RapidSub.canDelegate("filldata")) { return __ref.runUserSub(false, "preferencesdialog","filldata", __ref, _data);}
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("b4j.example.customlistview._clvitem");
RemoteObject _prefitem = RemoteObject.declareNull("b4j.example.preferencesdialog._b4xprefitem");
RemoteObject _itempanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _switch = RemoteObject.declareNull("b4j.example.b4xswitch");
RemoteObject _ft = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
RemoteObject _cmb = RemoteObject.declareNull("b4j.example.b4xcombobox");
RemoteObject _options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _pmhours = RemoteObject.declareNull("b4j.example.b4xplusminus");
RemoteObject _pmminutes = RemoteObject.declareNull("b4j.example.b4xplusminus");
RemoteObject _pmampm = RemoteObject.declareNull("b4j.example.b4xplusminus");
RemoteObject _p = RemoteObject.declareNull("b4j.example.dateutils._period");
RemoteObject _hour = RemoteObject.createImmutable(0);
RemoteObject _m = RemoteObject.createImmutable("");
RemoteObject _pm = RemoteObject.declareNull("b4j.example.b4xplusminus");
Debug.locals.put("Data", _data);
 BA.debugLineNum = 381;BA.debugLine="Private Sub FillData (Data As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 382;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 383;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
Debug.JustUpdateDeviceLine();
_item = __ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getrawlistitem",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 384;BA.debugLine="If (Item.Value Is B4XPrefItem) = False Then Exit";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_item.getField(false,"Value"), RemoteObject.createImmutable("b4j.example.preferencesdialog._b4xprefitem")))),preferencesdialog.__c.getField(true,"False"))) { 
if (true) break;};
 BA.debugLineNum = 385;BA.debugLine="Dim PrefItem As B4XPrefItem = Item.Value";
Debug.JustUpdateDeviceLine();
_prefitem = (_item.getField(false,"Value"));Debug.locals.put("PrefItem", _prefitem);Debug.locals.put("PrefItem", _prefitem);
 BA.debugLineNum = 386;BA.debugLine="Dim ItemPanel As B4XView = Item.Panel.GetView(0)";
Debug.JustUpdateDeviceLine();
_itempanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_itempanel = _item.getField(false,"Panel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("ItemPanel", _itempanel);Debug.locals.put("ItemPanel", _itempanel);
 BA.debugLineNum = 387;BA.debugLine="Select PrefItem.ItemType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_prefitem.getField(true,"ItemType" /*RemoteObject*/ ),__ref.getField(true,"_type_boolean" /*RemoteObject*/ ),__ref.getField(true,"_type_text" /*RemoteObject*/ ),__ref.getField(true,"_type_password" /*RemoteObject*/ ),__ref.getField(true,"_type_number" /*RemoteObject*/ ),__ref.getField(true,"_type_decimalnumber" /*RemoteObject*/ ),__ref.getField(true,"_type_multilinetext" /*RemoteObject*/ ),__ref.getField(true,"_type_date" /*RemoteObject*/ ),__ref.getField(true,"_type_options" /*RemoteObject*/ ),__ref.getField(true,"_type_shortoptions" /*RemoteObject*/ ),__ref.getField(true,"_type_color" /*RemoteObject*/ ),__ref.getField(true,"_type_time" /*RemoteObject*/ ),__ref.getField(true,"_type_separator" /*RemoteObject*/ ),__ref.getField(true,"_type_explanation" /*RemoteObject*/ ),__ref.getField(true,"_type_numericrange" /*RemoteObject*/ ))) {
case 0: {
 BA.debugLineNum = 389;BA.debugLine="Dim switch As B4XSwitch = ItemPanel.GetView(1)";
Debug.JustUpdateDeviceLine();
_switch = (_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(false,"getTag"));Debug.locals.put("switch", _switch);Debug.locals.put("switch", _switch);
 BA.debugLineNum = 390;BA.debugLine="switch.Value = GetPrefItemValue(PrefItem, Fals";
Debug.JustUpdateDeviceLine();
_switch.runClassMethod (b4j.example.b4xswitch.class, "_setvalue" /*RemoteObject*/ ,BA.ObjectToBoolean(__ref.runClassMethod (b4j.example.preferencesdialog.class, "_getprefitemvalue" /*RemoteObject*/ ,(Object)(_prefitem),(Object)((preferencesdialog.__c.getField(true,"False"))),(Object)(_data))));
 break; }
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
 BA.debugLineNum = 392;BA.debugLine="Dim ft As B4XFloatTextField = ItemPanel.GetVie";
Debug.JustUpdateDeviceLine();
_ft = (_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag"));Debug.locals.put("ft", _ft);Debug.locals.put("ft", _ft);
 BA.debugLineNum = 393;BA.debugLine="ft.Text = GetPrefItemValue(PrefItem, \"\", Data)";
Debug.JustUpdateDeviceLine();
_ft.runClassMethod (b4j.example.b4xfloattextfield.class, "_settext" /*RemoteObject*/ ,BA.ObjectToString(__ref.runClassMethod (b4j.example.preferencesdialog.class, "_getprefitemvalue" /*RemoteObject*/ ,(Object)(_prefitem),(Object)(RemoteObject.createImmutable((""))),(Object)(_data))));
 break; }
case 6: {
 BA.debugLineNum = 395;BA.debugLine="ItemPanel.GetView(1).Text = DateTime.Date(GetP";
Debug.JustUpdateDeviceLine();
_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"setText",preferencesdialog.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, __ref.runClassMethod (b4j.example.preferencesdialog.class, "_getprefitemvalue" /*RemoteObject*/ ,(Object)(_prefitem),(Object)((preferencesdialog.__c.getField(false,"DateTime").runMethod(true,"getNow"))),(Object)(_data))))));
 break; }
case 7: {
 BA.debugLineNum = 397;BA.debugLine="ItemPanel.GetView(1).Text = GetPrefItemValue(P";
Debug.JustUpdateDeviceLine();
_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"setText",BA.ObjectToString(__ref.runClassMethod (b4j.example.preferencesdialog.class, "_getprefitemvalue" /*RemoteObject*/ ,(Object)(_prefitem),(Object)(RemoteObject.createImmutable((""))),(Object)(_data))));
 break; }
case 8: {
 BA.debugLineNum = 399;BA.debugLine="Dim cmb As B4XComboBox = ItemPanel.GetView(1).";
Debug.JustUpdateDeviceLine();
_cmb = (_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(false,"getTag"));Debug.locals.put("cmb", _cmb);Debug.locals.put("cmb", _cmb);
 BA.debugLineNum = 400;BA.debugLine="Dim options As List = PrefItem.Extra.Get(\"opti";
Debug.JustUpdateDeviceLine();
_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_options = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _prefitem.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("options")))));Debug.locals.put("options", _options);Debug.locals.put("options", _options);
 BA.debugLineNum = 401;BA.debugLine="cmb.SelectedIndex = Max(0, options.IndexOf(Get";
Debug.JustUpdateDeviceLine();
_cmb.runClassMethod (b4j.example.b4xcombobox.class, "_setselectedindex" /*RemoteObject*/ ,BA.numberCast(int.class, preferencesdialog.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _options.runMethod(true,"IndexOf",(Object)(__ref.runClassMethod (b4j.example.preferencesdialog.class, "_getprefitemvalue" /*RemoteObject*/ ,(Object)(_prefitem),(Object)(RemoteObject.createImmutable((""))),(Object)(_data)))))))));
 break; }
case 9: {
 BA.debugLineNum = 403;BA.debugLine="SetLabelColor(ItemPanel.GetView(1), GetPrefIte";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_setlabelcolor" /*RemoteObject*/ ,(Object)(_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1)))),(Object)(BA.numberCast(int.class, __ref.runClassMethod (b4j.example.preferencesdialog.class, "_getprefitemvalue" /*RemoteObject*/ ,(Object)(_prefitem),(Object)((__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"))),(Object)(_data)))));
 BA.debugLineNum = 404;BA.debugLine="ItemPanel.GetView(2).Text = \"Pick\"";
Debug.JustUpdateDeviceLine();
_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"setText",BA.ObjectToString("Pick"));
 break; }
case 10: {
 BA.debugLineNum = 406;BA.debugLine="Dim pmHours As B4XPlusMinus = ItemPanel.GetVie";
Debug.JustUpdateDeviceLine();
_pmhours = (_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag"));Debug.locals.put("pmHours", _pmhours);Debug.locals.put("pmHours", _pmhours);
 BA.debugLineNum = 407;BA.debugLine="Dim pmMinutes As B4XPlusMinus = ItemPanel.GetV";
Debug.JustUpdateDeviceLine();
_pmminutes = (_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(false,"getTag"));Debug.locals.put("pmMinutes", _pmminutes);Debug.locals.put("pmMinutes", _pmminutes);
 BA.debugLineNum = 408;BA.debugLine="Dim pmAMPM As B4XPlusMinus = ItemPanel.GetView";
Debug.JustUpdateDeviceLine();
_pmampm = (_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"getTag"));Debug.locals.put("pmAMPM", _pmampm);Debug.locals.put("pmAMPM", _pmampm);
 BA.debugLineNum = 409;BA.debugLine="Dim p As Period";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("b4j.example.dateutils._period");Debug.locals.put("p", _p);
 BA.debugLineNum = 410;BA.debugLine="p = GetPrefItemValue(PrefItem, p, Data)";
Debug.JustUpdateDeviceLine();
_p = (__ref.runClassMethod (b4j.example.preferencesdialog.class, "_getprefitemvalue" /*RemoteObject*/ ,(Object)(_prefitem),(Object)((_p)),(Object)(_data)));Debug.locals.put("p", _p);
 BA.debugLineNum = 411;BA.debugLine="Dim hour As Int = p.Hours";
Debug.JustUpdateDeviceLine();
_hour = _p.getField(true,"Hours");Debug.locals.put("hour", _hour);Debug.locals.put("hour", _hour);
 BA.debugLineNum = 412;BA.debugLine="Dim m As String";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createImmutable("");Debug.locals.put("m", _m);
 BA.debugLineNum = 413;BA.debugLine="If PrefItem.Extra.GetDefault(\"24\", False) = Fa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_prefitem.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("24"))),(Object)((preferencesdialog.__c.getField(true,"False")))),(preferencesdialog.__c.getField(true,"False")))) { 
 BA.debugLineNum = 414;BA.debugLine="If hour <= 11 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_hour,BA.numberCast(double.class, 11))) { 
 BA.debugLineNum = 415;BA.debugLine="m = \"am\"";
Debug.JustUpdateDeviceLine();
_m = BA.ObjectToString("am");Debug.locals.put("m", _m);
 }else {
 BA.debugLineNum = 417;BA.debugLine="m = \"pm\"";
Debug.JustUpdateDeviceLine();
_m = BA.ObjectToString("pm");Debug.locals.put("m", _m);
 BA.debugLineNum = 418;BA.debugLine="hour = hour - 12";
Debug.JustUpdateDeviceLine();
_hour = RemoteObject.solve(new RemoteObject[] {_hour,RemoteObject.createImmutable(12)}, "-",1, 1);Debug.locals.put("hour", _hour);
 };
 BA.debugLineNum = 420;BA.debugLine="If hour = 0 Then hour = 12";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_hour,BA.numberCast(double.class, 0))) { 
_hour = BA.numberCast(int.class, 12);Debug.locals.put("hour", _hour);};
 };
 BA.debugLineNum = 422;BA.debugLine="pmHours.SelectedValue = hour";
Debug.JustUpdateDeviceLine();
_pmhours.runClassMethod (b4j.example.b4xplusminus.class, "_setselectedvalue" /*RemoteObject*/ ,(_hour));
 BA.debugLineNum = 423;BA.debugLine="pmMinutes.SelectedValue = p.Minutes";
Debug.JustUpdateDeviceLine();
_pmminutes.runClassMethod (b4j.example.b4xplusminus.class, "_setselectedvalue" /*RemoteObject*/ ,(_p.getField(true,"Minutes")));
 BA.debugLineNum = 424;BA.debugLine="pmAMPM.SelectedValue = m";
Debug.JustUpdateDeviceLine();
_pmampm.runClassMethod (b4j.example.b4xplusminus.class, "_setselectedvalue" /*RemoteObject*/ ,(_m));
 break; }
case 11: 
case 12: {
 break; }
case 13: {
 BA.debugLineNum = 427;BA.debugLine="Dim pm As B4XPlusMinus = ItemPanel.GetView(0).";
Debug.JustUpdateDeviceLine();
_pm = (_itempanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag"));Debug.locals.put("pm", _pm);Debug.locals.put("pm", _pm);
 BA.debugLineNum = 428;BA.debugLine="pm.SelectedValue = GetPrefItemValue(PrefItem,";
Debug.JustUpdateDeviceLine();
_pm.runClassMethod (b4j.example.b4xplusminus.class, "_setselectedvalue" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.preferencesdialog.class, "_getprefitemvalue" /*RemoteObject*/ ,(Object)(_prefitem),(Object)(RemoteObject.createImmutable((0))),(Object)(_data)));
 break; }
default: {
 BA.debugLineNum = 430;BA.debugLine="Log(\"Unknown type: \" & PrefItem.ItemType)";
Debug.JustUpdateDeviceLine();
preferencesdialog.__c.runVoidMethod ("LogImpl","917301553",RemoteObject.concat(RemoteObject.createImmutable("Unknown type: "),_prefitem.getField(true,"ItemType" /*RemoteObject*/ )),0);
 break; }
}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 433;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref,RemoteObject _dialog1) throws Exception{
try {
		Debug.PushSubsStack("GetPanel (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,367);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "preferencesdialog","getpanel", __ref, _dialog1);}
Debug.locals.put("Dialog1", _dialog1);
 BA.debugLineNum = 367;BA.debugLine="Public Sub GetPanel (Dialog1 As B4XDialog) As B4XV";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 368;BA.debugLine="Return mBase";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 369;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getprefitem(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("GetPrefItem (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,897);
if (RapidSub.canDelegate("getprefitem")) { return __ref.runUserSub(false, "preferencesdialog","getprefitem", __ref, _key);}
RemoteObject _pi = RemoteObject.declareNull("b4j.example.preferencesdialog._b4xprefitem");
Debug.locals.put("Key", _key);
 BA.debugLineNum = 897;BA.debugLine="Public Sub GetPrefItem (Key As String) As B4XPrefI";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 898;BA.debugLine="For Each pi As B4XPrefItem In PrefItems";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_prefitems" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_pi = (group1.runMethod(false,"Get",index1));Debug.locals.put("pi", _pi);
Debug.locals.put("pi", _pi);
 BA.debugLineNum = 899;BA.debugLine="If pi.Key = Key Then Return pi";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_pi.getField(true,"Key" /*RemoteObject*/ ),_key)) { 
if (true) return _pi;};
 }
}Debug.locals.put("pi", _pi);
;
 BA.debugLineNum = 901;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) return (preferencesdialog.__c.getField(false,"Null"));
 BA.debugLineNum = 902;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getprefitemvalue(RemoteObject __ref,RemoteObject _prefitem,RemoteObject _defaultvalue,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("GetPrefItemValue (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,441);
if (RapidSub.canDelegate("getprefitemvalue")) { return __ref.runUserSub(false, "preferencesdialog","getprefitemvalue", __ref, _prefitem, _defaultvalue, _data);}
Debug.locals.put("PrefItem", _prefitem);
Debug.locals.put("DefaultValue", _defaultvalue);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 441;BA.debugLine="Private Sub GetPrefItemValue (PrefItem As B4XPrefI";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 442;BA.debugLine="Return Data.GetDefault(PrefItem.Key, DefaultValue";
Debug.JustUpdateDeviceLine();
if (true) return _data.runMethod(false,"GetDefault",(Object)((_prefitem.getField(true,"Key" /*RemoteObject*/ ))),(Object)(_defaultvalue));
 BA.debugLineNum = 443;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettheme(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTheme (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,445);
if (RapidSub.canDelegate("gettheme")) { return __ref.runUserSub(false, "preferencesdialog","gettheme", __ref);}
 BA.debugLineNum = 445;BA.debugLine="Public Sub getTheme As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 446;BA.debugLine="Return mTheme";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mtheme" /*RemoteObject*/ );
 BA.debugLineNum = 447;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettitle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTitle (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("gettitle")) { return __ref.runUserSub(false, "preferencesdialog","gettitle", __ref);}
 BA.debugLineNum = 69;BA.debugLine="Public Sub getTitle As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 70;BA.debugLine="Return mTitle";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mtitle" /*RemoteObject*/ );
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _gotoitem(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("GoToItem (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,788);
if (RapidSub.canDelegate("gotoitem")) { __ref.runUserSub(false, "preferencesdialog","gotoitem", __ref, _i); return;}
ResumableSub_GoToItem rsub = new ResumableSub_GoToItem(null,__ref,_i);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GoToItem extends BA.ResumableSub {
public ResumableSub_GoToItem(b4j.example.preferencesdialog parent,RemoteObject __ref,RemoteObject _i) {
this.parent = parent;
this.__ref = __ref;
this._i = _i;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.preferencesdialog parent;
RemoteObject _i;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _duration = RemoteObject.createImmutable(0);
int step3;
int limit3;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GoToItem (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,788);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("i", _i);
 BA.debugLineNum = 789;BA.debugLine="CustomListView1.JumpToItem(i)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_jumptoitem",(Object)(_i));
 BA.debugLineNum = 790;BA.debugLine="Dim p As B4XView = CustomListView1.GetPanel(i)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_i));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 791;BA.debugLine="For i = 0 To 3";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//for
this.state = 4;
step3 = 1;
limit3 = 3;
_i = BA.numberCast(int.class, 0) ;
Debug.locals.put("i", _i);
this.state = 5;
if (true) break;

case 5:
//C
this.state = 4;
if ((step3 > 0 && _i.<Integer>get().intValue() <= limit3) || (step3 < 0 && _i.<Integer>get().intValue() >= limit3)) this.state = 3;
if (true) break;

case 6:
//C
this.state = 5;
_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step3)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 792;BA.debugLine="Dim duration As Int = 100 - i * 20";
Debug.JustUpdateDeviceLine();
_duration = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),_i,RemoteObject.createImmutable(20)}, "-*",1, 1);Debug.locals.put("duration", _duration);Debug.locals.put("duration", _duration);
 BA.debugLineNum = 793;BA.debugLine="p.SetLayoutAnimated(duration, -10dip, 0, p.Width";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(_duration),(Object)(BA.numberCast(double.class, -(double) (0 + parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))).<Integer>get().intValue()))),(Object)(BA.numberCast(double.class, 0)),(Object)(_p.runMethod(true,"getWidth")),(Object)(_p.runMethod(true,"getHeight")));
 BA.debugLineNum = 794;BA.debugLine="Sleep(duration)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "preferencesdialog", "gotoitem"),_duration);
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 BA.debugLineNum = 795;BA.debugLine="p.SetLayoutAnimated(duration, 10dip, 0, p.Width,";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(_duration),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))))),(Object)(BA.numberCast(double.class, 0)),(Object)(_p.runMethod(true,"getWidth")),(Object)(_p.runMethod(true,"getHeight")));
 BA.debugLineNum = 796;BA.debugLine="Sleep(duration)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "preferencesdialog", "gotoitem"),_duration);
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
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 798;BA.debugLine="p.SetLayoutAnimated(50, 0, 0, p.Width, p.Height)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 50)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_p.runMethod(true,"getWidth")),(Object)(_p.runMethod(true,"getHeight")));
 BA.debugLineNum = 799;BA.debugLine="End Sub";
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
public static RemoteObject  _hextocolor(RemoteObject __ref,RemoteObject _hex) throws Exception{
try {
		Debug.PushSubsStack("HexToColor (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,948);
if (RapidSub.canDelegate("hextocolor")) { return __ref.runUserSub(false, "preferencesdialog","hextocolor", __ref, _hex);}
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
RemoteObject _res = null;
RemoteObject _ints = null;
Debug.locals.put("Hex", _hex);
 BA.debugLineNum = 948;BA.debugLine="Private Sub HexToColor(Hex As String) As Int()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 949;BA.debugLine="Dim bc As ByteConverter";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 950;BA.debugLine="Hex = Hex.ToLowerCase";
Debug.JustUpdateDeviceLine();
_hex = _hex.runMethod(true,"toLowerCase");Debug.locals.put("Hex", _hex);
 BA.debugLineNum = 951;BA.debugLine="If Hex.StartsWith(\"#\") Then";
Debug.JustUpdateDeviceLine();
if (_hex.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("#"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 952;BA.debugLine="Hex = Hex.SubString(1)";
Debug.JustUpdateDeviceLine();
_hex = _hex.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Hex", _hex);
 }else 
{ BA.debugLineNum = 953;BA.debugLine="Else If Hex.StartsWith(\"0x\") Then";
Debug.JustUpdateDeviceLine();
if (_hex.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0x"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 954;BA.debugLine="Hex = Hex.SubString(2)";
Debug.JustUpdateDeviceLine();
_hex = _hex.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Hex", _hex);
 }}
;
 BA.debugLineNum = 956;BA.debugLine="If Hex.Length = 6 Then Hex = \"ff\" & Hex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_hex.runMethod(true,"length"),BA.numberCast(double.class, 6))) { 
_hex = RemoteObject.concat(RemoteObject.createImmutable("ff"),_hex);Debug.locals.put("Hex", _hex);};
 BA.debugLineNum = 958;BA.debugLine="Dim res() As Int";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});Debug.locals.put("res", _res);
 BA.debugLineNum = 959;BA.debugLine="If Regex.IsMatch(\"[0-9a-f]{8}\", Hex) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",preferencesdialog.__c.getField(false,"Regex").runMethod(true,"IsMatch",(Object)(BA.ObjectToString("[0-9a-f]{8}")),(Object)(_hex)),preferencesdialog.__c.getField(true,"False"))) { 
if (true) return _res;};
 BA.debugLineNum = 960;BA.debugLine="Dim ints() As Int = bc.IntsFromBytes(bc.HexToByte";
Debug.JustUpdateDeviceLine();
_ints = _bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(_hex))));Debug.locals.put("ints", _ints);Debug.locals.put("ints", _ints);
 BA.debugLineNum = 961;BA.debugLine="Return ints";
Debug.JustUpdateDeviceLine();
if (true) return _ints;
 BA.debugLineNum = 962;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _parent,RemoteObject _title,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Initialize (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "preferencesdialog","initialize", __ref, _ba, _parent, _title, _width, _height);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _sv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ScrollPaneWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("Parent", _parent);
Debug.locals.put("Title", _title);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 33;BA.debugLine="Public Sub Initialize (Parent As B4XView, Title As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="Dialog.Initialize(Parent)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_parent));
 BA.debugLineNum = 35;BA.debugLine="Dialog.VisibleAnimationDuration = 0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_visibleanimationduration" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 36;BA.debugLine="mTitle = Title";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtitle" /*RemoteObject*/ ,_title);
 BA.debugLineNum = 37;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mbase" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mBase"))));
 BA.debugLineNum = 38;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, _height)));
 BA.debugLineNum = 39;BA.debugLine="mBase.LoadLayout(\"ListTemplate\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ListTemplate")),__ref.getField(false, "ba"));
 BA.debugLineNum = 40;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 41;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 42;BA.debugLine="CustomListView1.PressedColor = xui.Color_Transpar";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_pressedcolor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 43;BA.debugLine="PrefItems.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefitems" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 44;BA.debugLine="SearchTemplate.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_searchtemplate" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 45;BA.debugLine="DateTemplate.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdatetemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 46;BA.debugLine="LongTextTemplate.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_longtexttemplate" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xlongtexttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 47;BA.debugLine="LongTextTemplate.CustomListView1.PressedColor = 0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_longtexttemplate" /*RemoteObject*/ ).getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_pressedcolor",BA.numberCast(int.class, 0));
 BA.debugLineNum = 48;BA.debugLine="Dialog.OverlayColor = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_overlaycolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 50;BA.debugLine="Dim sv As ScrollPane = CustomListView1.sv";
Debug.JustUpdateDeviceLine();
_sv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ScrollPaneWrapper");
_sv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ScrollPaneWrapper"), __ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").getObject());Debug.locals.put("sv", _sv);Debug.locals.put("sv", _sv);
 BA.debugLineNum = 51;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
Debug.JustUpdateDeviceLine();
_sv.runMethod(false,"getStyleClasses").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("b4xdialog"))));
 BA.debugLineNum = 52;BA.debugLine="sv.InnerNode.StyleClasses.Add(\"b4xdialog\")";
Debug.JustUpdateDeviceLine();
_sv.runMethod(false,"getInnerNode").runMethod(false,"getStyleClasses").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("b4xdialog"))));
 BA.debugLineNum = 57;BA.debugLine="DefaultHintFont = xui.CreateDefaultBoldFont(16)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_defaulthintfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, 16))));
 BA.debugLineNum = 59;BA.debugLine="DefaultHintLargeSize = 16";
Debug.JustUpdateDeviceLine();
__ref.setField ("_defaulthintlargesize" /*RemoteObject*/ ,BA.numberCast(int.class, 16));
 BA.debugLineNum = 60;BA.debugLine="setTheme(THEME_DARK)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_settheme" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_theme_dark" /*RemoteObject*/ )));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _keyboardheightchanged(RemoteObject __ref,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("KeyboardHeightChanged (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("keyboardheightchanged")) { return __ref.runUserSub(false, "preferencesdialog","keyboardheightchanged", __ref, _height);}
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _f = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
RemoteObject _index = RemoteObject.createImmutable(0);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 77;BA.debugLine="Public Sub KeyboardHeightChanged (Height As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 78;BA.debugLine="If Dialog.Visible Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_getvisible" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 86;BA.debugLine="CustomListView1.sv.Height = Min(CustomListView1.A";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setHeight",preferencesdialog.__c.runMethod(true,"Min",(Object)(__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getHeight")),(Object)(RemoteObject.solve(new RemoteObject[] {_height,__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(false,"getParent").runMethod(true,"getTop"),__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(false,"getParent").runMethod(false,"getParent").runMethod(true,"getTop")}, "--",2, 0))));
 BA.debugLineNum = 89;BA.debugLine="For Each v As B4XView In CustomListView1.AsView.";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group3 = __ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(false,"GetAllViewsRecursive");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group3.runMethod(false,"Get",index3));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 90;BA.debugLine="If v.Tag Is B4XFloatTextField Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("i",_v.runMethod(false,"getTag"), RemoteObject.createImmutable("b4j.example.b4xfloattextfield"))) { 
 BA.debugLineNum = 91;BA.debugLine="Dim f As B4XFloatTextField = v.Tag";
Debug.JustUpdateDeviceLine();
_f = (_v.runMethod(false,"getTag"));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 92;BA.debugLine="If f.Focused Then";
Debug.JustUpdateDeviceLine();
if (_f.getField(true,"_focused" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 93;BA.debugLine="Dim index As Int = CustomListView1.GetItemFro";
Debug.JustUpdateDeviceLine();
_index = __ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",(Object)(_f.getField(false,"_mbase" /*RemoteObject*/ )));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 94;BA.debugLine="CustomListView1.ScrollToItem(index)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_scrolltoitem",(Object)(_index));
 };
 };
 }
}Debug.locals.put("v", _v);
;
 };
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblcolors_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblColors_MouseClicked (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,850);
if (RapidSub.canDelegate("lblcolors_mouseclicked")) { return __ref.runUserSub(false, "preferencesdialog","lblcolors_mouseclicked", __ref, _eventdata);}
RemoteObject _pref = RemoteObject.declareNull("b4j.example.preferencesdialog._b4xprefitem");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 850;BA.debugLine="Private Sub lblColors_MouseClicked (EventData As M";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 851;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 855;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
Debug.JustUpdateDeviceLine();
__ref.setField ("_nesteddialogitemindex" /*RemoteObject*/ ,__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), preferencesdialog.__c.runMethod(false,"Sender",__ref.getField(false, "ba")))));
 BA.debugLineNum = 856;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
Debug.JustUpdateDeviceLine();
_pref = (__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(__ref.getField(true,"_nesteddialogitemindex" /*RemoteObject*/ ))));Debug.locals.put("pref", _pref);Debug.locals.put("pref", _pref);
 BA.debugLineNum = 857;BA.debugLine="Dialog.Title = pref.Title";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,_pref.getField(false,"Title" /*RemoteObject*/ ));
 BA.debugLineNum = 858;BA.debugLine="ColorTemplate.SelectedColor = CustomListView1.Get";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colortemplate" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xcolortemplate.class, "_setselectedcolor" /*RemoteObject*/ ,__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(__ref.getField(true,"_nesteddialogitemindex" /*RemoteObject*/ ))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"getColor"));
 BA.debugLineNum = 859;BA.debugLine="Template = ColorTemplate";
Debug.JustUpdateDeviceLine();
__ref.setField ("_template" /*RemoteObject*/ ,(__ref.getField(false,"_colortemplate" /*RemoteObject*/ )));
 BA.debugLineNum = 860;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_close" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_result_showing_nested_dialog" /*RemoteObject*/ )));
 BA.debugLineNum = 861;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbldate_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblDate_MouseClicked (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,836);
if (RapidSub.canDelegate("lbldate_mouseclicked")) { return __ref.runUserSub(false, "preferencesdialog","lbldate_mouseclicked", __ref, _eventdata);}
RemoteObject _pref = RemoteObject.declareNull("b4j.example.preferencesdialog._b4xprefitem");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 836;BA.debugLine="Private Sub lblDate_MouseClicked (EventData As Mou";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 837;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 841;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
Debug.JustUpdateDeviceLine();
__ref.setField ("_nesteddialogitemindex" /*RemoteObject*/ ,__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), preferencesdialog.__c.runMethod(false,"Sender",__ref.getField(false, "ba")))));
 BA.debugLineNum = 842;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
Debug.JustUpdateDeviceLine();
_pref = (__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(__ref.getField(true,"_nesteddialogitemindex" /*RemoteObject*/ ))));Debug.locals.put("pref", _pref);Debug.locals.put("pref", _pref);
 BA.debugLineNum = 843;BA.debugLine="Dialog.Title = pref.Title";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,_pref.getField(false,"Title" /*RemoteObject*/ ));
 BA.debugLineNum = 844;BA.debugLine="DateTemplate.Date = DateTime.DateParse(CustomList";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,preferencesdialog.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(__ref.getField(true,"_nesteddialogitemindex" /*RemoteObject*/ ))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"getText"))));
 BA.debugLineNum = 845;BA.debugLine="Template = DateTemplate";
Debug.JustUpdateDeviceLine();
__ref.setField ("_template" /*RemoteObject*/ ,(__ref.getField(false,"_datetemplate" /*RemoteObject*/ )));
 BA.debugLineNum = 846;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_close" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_result_showing_nested_dialog" /*RemoteObject*/ )));
 BA.debugLineNum = 847;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblexplanation_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblExplanation_MouseClicked (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,864);
if (RapidSub.canDelegate("lblexplanation_mouseclicked")) { return __ref.runUserSub(false, "preferencesdialog","lblexplanation_mouseclicked", __ref, _eventdata);}
RemoteObject _pref = RemoteObject.declareNull("b4j.example.preferencesdialog._b4xprefitem");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 864;BA.debugLine="Private Sub lblExplanation_MouseClicked (EventData";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 865;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 869;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
Debug.JustUpdateDeviceLine();
__ref.setField ("_nesteddialogitemindex" /*RemoteObject*/ ,__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), preferencesdialog.__c.runMethod(false,"Sender",__ref.getField(false, "ba")))));
 BA.debugLineNum = 870;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
Debug.JustUpdateDeviceLine();
_pref = (__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(__ref.getField(true,"_nesteddialogitemindex" /*RemoteObject*/ ))));Debug.locals.put("pref", _pref);Debug.locals.put("pref", _pref);
 BA.debugLineNum = 871;BA.debugLine="Dialog.Title = pref.Title";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,_pref.getField(false,"Title" /*RemoteObject*/ ));
 BA.debugLineNum = 872;BA.debugLine="LongTextTemplate.Text = pref.Extra.Get(\"text\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_longtexttemplate" /*RemoteObject*/ ).setField ("_text" /*RemoteObject*/ ,_pref.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("text")))));
 BA.debugLineNum = 873;BA.debugLine="Template = LongTextTemplate";
Debug.JustUpdateDeviceLine();
__ref.setField ("_template" /*RemoteObject*/ ,(__ref.getField(false,"_longtexttemplate" /*RemoteObject*/ )));
 BA.debugLineNum = 874;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_close" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_result_showing_nested_dialog" /*RemoteObject*/ )));
 BA.debugLineNum = 875;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbloptions_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblOptions_MouseClicked (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,817);
if (RapidSub.canDelegate("lbloptions_mouseclicked")) { return __ref.runUserSub(false, "preferencesdialog","lbloptions_mouseclicked", __ref, _eventdata);}
RemoteObject _pref = RemoteObject.declareNull("b4j.example.preferencesdialog._b4xprefitem");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 817;BA.debugLine="Private Sub lblOptions_MouseClicked (EventData As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 818;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 822;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
Debug.JustUpdateDeviceLine();
__ref.setField ("_nesteddialogitemindex" /*RemoteObject*/ ,__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), preferencesdialog.__c.runMethod(false,"Sender",__ref.getField(false, "ba")))));
 BA.debugLineNum = 823;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
Debug.JustUpdateDeviceLine();
_pref = (__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(__ref.getField(true,"_nesteddialogitemindex" /*RemoteObject*/ ))));Debug.locals.put("pref", _pref);Debug.locals.put("pref", _pref);
 BA.debugLineNum = 824;BA.debugLine="Dialog.Title = pref.Title";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,_pref.getField(false,"Title" /*RemoteObject*/ ));
 BA.debugLineNum = 825;BA.debugLine="If pref.Extra.ContainsKey(\"index\") Then";
Debug.JustUpdateDeviceLine();
if (_pref.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("index")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 826;BA.debugLine="SearchTemplate.SetIndex(pref.Extra.Get(\"index\"))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_searchtemplate" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xsearchtemplate.class, "_setindex" /*RemoteObject*/ ,(Object)(_pref.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("index"))))));
 }else {
 BA.debugLineNum = 828;BA.debugLine="pref.Extra.Put(\"index\", SearchTemplate.SetItems(";
Debug.JustUpdateDeviceLine();
_pref.getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("index"))),(Object)(__ref.getField(false,"_searchtemplate" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _pref.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("options"))))))));
 };
 BA.debugLineNum = 830;BA.debugLine="SearchTemplate.SelectedItem = CustomListView1.Get";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_searchtemplate" /*RemoteObject*/ ).setField ("_selecteditem" /*RemoteObject*/ ,__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(__ref.getField(true,"_nesteddialogitemindex" /*RemoteObject*/ ))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runMethod(true,"getText"));
 BA.debugLineNum = 831;BA.debugLine="Template = SearchTemplate";
Debug.JustUpdateDeviceLine();
__ref.setField ("_template" /*RemoteObject*/ ,(__ref.getField(false,"_searchtemplate" /*RemoteObject*/ )));
 BA.debugLineNum = 832;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_close" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_result_showing_nested_dialog" /*RemoteObject*/ )));
 BA.debugLineNum = 833;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadfromjson(RemoteObject __ref,RemoteObject _json) throws Exception{
try {
		Debug.PushSubsStack("LoadFromJson (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("loadfromjson")) { return __ref.runUserSub(false, "preferencesdialog","loadfromjson", __ref, _json);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _theme = RemoteObject.createImmutable("");
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _required = RemoteObject.createImmutable(false);
RemoteObject _itemtype = RemoteObject.createImmutable("");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _pi = RemoteObject.declareNull("b4j.example.preferencesdialog._b4xprefitem");
RemoteObject _text = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
Debug.locals.put("Json", _json);
 BA.debugLineNum = 109;BA.debugLine="Public Sub LoadFromJson (Json As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 110;BA.debugLine="Dim p As JSONParser";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("p", _p);
 BA.debugLineNum = 111;BA.debugLine="p.Initialize(Json)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 112;BA.debugLine="Dim m As Map = p.NextObject";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = _p.runMethod(false,"NextObject");Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 113;BA.debugLine="Dim theme As String = m.GetDefault(\"Theme\", \"Dark";
Debug.JustUpdateDeviceLine();
_theme = BA.ObjectToString(_m.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("Theme"))),(Object)((RemoteObject.createImmutable("Dark Theme")))));Debug.locals.put("theme", _theme);Debug.locals.put("theme", _theme);
 BA.debugLineNum = 114;BA.debugLine="Select theme";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_theme,BA.ObjectToString("Dark Theme"),BA.ObjectToString("Light Theme"))) {
case 0: {
 BA.debugLineNum = 116;BA.debugLine="setTheme(THEME_DARK)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_settheme" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_theme_dark" /*RemoteObject*/ )));
 break; }
case 1: {
 BA.debugLineNum = 118;BA.debugLine="setTheme(THEME_LIGHT)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_settheme" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_theme_light" /*RemoteObject*/ )));
 break; }
}
;
 BA.debugLineNum = 120;BA.debugLine="Dim items As List = m.Get(\"Items\")";
Debug.JustUpdateDeviceLine();
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Items")))));Debug.locals.put("items", _items);Debug.locals.put("items", _items);
 BA.debugLineNum = 121;BA.debugLine="For Each item As Map In items";
Debug.JustUpdateDeviceLine();
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group12 = _items;
final int groupLen12 = group12.runMethod(true,"getSize").<Integer>get()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group12.runMethod(false,"Get",index12));Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 122;BA.debugLine="Dim key As String = item.Get(\"key\")";
Debug.JustUpdateDeviceLine();
_key = BA.ObjectToString(_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("key")))));Debug.locals.put("key", _key);Debug.locals.put("key", _key);
 BA.debugLineNum = 123;BA.debugLine="Dim title As String = item.Get(\"title\")";
Debug.JustUpdateDeviceLine();
_title = BA.ObjectToString(_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 124;BA.debugLine="Dim required As Boolean = item.Get(\"required\")";
Debug.JustUpdateDeviceLine();
_required = BA.ObjectToBoolean(_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("required")))));Debug.locals.put("required", _required);Debug.locals.put("required", _required);
 BA.debugLineNum = 125;BA.debugLine="Dim itemType As String = item.Get(\"type\")";
Debug.JustUpdateDeviceLine();
_itemtype = BA.ObjectToString(_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));Debug.locals.put("itemType", _itemtype);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 126;BA.debugLine="Select itemType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_itemtype,BA.ObjectToString("Separator"),BA.ObjectToString("Boolean"),BA.ObjectToString("Text"),BA.ObjectToString("Date"),BA.ObjectToString("Short Options"),BA.ObjectToString("Color"),BA.ObjectToString("Number"),BA.ObjectToString("Password"),BA.ObjectToString("Options"),BA.ObjectToString("Decimal Number"),BA.ObjectToString("Multiline Text"),BA.ObjectToString("Time"),BA.ObjectToString("Numeric Range"),BA.ObjectToString("Explanation"))) {
case 0: {
 BA.debugLineNum = 128;BA.debugLine="AddSeparator(title)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_addseparator" /*RemoteObject*/ ,(Object)((_title)));
 break; }
case 1: {
 BA.debugLineNum = 130;BA.debugLine="AddBooleanItem(key, title)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_addbooleanitem" /*RemoteObject*/ ,(Object)(_key),(Object)((_title)));
 break; }
case 2: {
 BA.debugLineNum = 132;BA.debugLine="AddTextItem(key, title)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_addtextitem" /*RemoteObject*/ ,(Object)(_key),(Object)((_title)));
 break; }
case 3: {
 BA.debugLineNum = 134;BA.debugLine="AddDateItem(key, title)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_adddateitem" /*RemoteObject*/ ,(Object)(_key),(Object)((_title)));
 break; }
case 4: {
 BA.debugLineNum = 136;BA.debugLine="AddShortOptionsItem(key, title, item.Get(\"opti";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_addshortoptionsitem" /*RemoteObject*/ ,(Object)(_key),(Object)((_title)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("options"))))));
 break; }
case 5: {
 BA.debugLineNum = 138;BA.debugLine="AddColorItem(key, title)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_addcoloritem" /*RemoteObject*/ ,(Object)(_key),(Object)((_title)));
 break; }
case 6: {
 BA.debugLineNum = 140;BA.debugLine="AddNumberItem(key, title)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_addnumberitem" /*RemoteObject*/ ,(Object)(_key),(Object)((_title)));
 break; }
case 7: {
 BA.debugLineNum = 142;BA.debugLine="AddPasswordItem(key, title)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_addpassworditem" /*RemoteObject*/ ,(Object)(_key),(Object)((_title)));
 break; }
case 8: {
 BA.debugLineNum = 144;BA.debugLine="AddOptionsItem(key, title, item.Get(\"options\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_addoptionsitem" /*RemoteObject*/ ,(Object)(_key),(Object)((_title)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("options"))))));
 break; }
case 9: {
 BA.debugLineNum = 146;BA.debugLine="AddDecimalNumberItem(key, title)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_adddecimalnumberitem" /*RemoteObject*/ ,(Object)(_key),(Object)((_title)));
 break; }
case 10: {
 BA.debugLineNum = 148;BA.debugLine="Dim l As List = item.Get(\"options\")";
Debug.JustUpdateDeviceLine();
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("options")))));Debug.locals.put("l", _l);Debug.locals.put("l", _l);
 BA.debugLineNum = 149;BA.debugLine="If l.IsInitialized = False Or l.Size = 0 Or Is";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_l.runMethod(true,"IsInitialized"),preferencesdialog.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",_l.runMethod(true,"getSize"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",preferencesdialog.__c.runMethod(true,"IsNumber",(Object)(BA.ObjectToString(_l.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))))),preferencesdialog.__c.getField(true,"False"))) { 
 BA.debugLineNum = 150;BA.debugLine="AddMultilineTextItem(key, title, 100dip)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_addmultilinetextitem" /*RemoteObject*/ ,(Object)(_key),(Object)((_title)),(Object)(preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 }else {
 BA.debugLineNum = 152;BA.debugLine="AddMultilineTextItem(key, title, DipToCurrent";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_addmultilinetextitem" /*RemoteObject*/ ,(Object)(_key),(Object)((_title)),(Object)(preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _l.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))))));
 };
 break; }
case 11: {
 BA.debugLineNum = 155;BA.debugLine="AddTimeItem(key, title)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_addtimeitem" /*RemoteObject*/ ,(Object)(_key),(Object)((_title)));
 BA.debugLineNum = 156;BA.debugLine="Dim l As List = item.Get(\"options\")";
Debug.JustUpdateDeviceLine();
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("options")))));Debug.locals.put("l", _l);Debug.locals.put("l", _l);
 BA.debugLineNum = 157;BA.debugLine="If l.IsInitialized And l.Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_l.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",_l.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 158;BA.debugLine="Dim pi As B4XPrefItem = PrefItems.Get(PrefIte";
Debug.JustUpdateDeviceLine();
_pi = (__ref.getField(false,"_prefitems" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_prefitems" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 159;BA.debugLine="pi.Extra.Put(\"24\", l.Get(0) = \"24\")";
Debug.JustUpdateDeviceLine();
_pi.getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("24"))),(Object)(RemoteObject.createImmutable((RemoteObject.solveBoolean("=",_l.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),(RemoteObject.createImmutable("24")))))));
 };
 break; }
case 12: {
 BA.debugLineNum = 163;BA.debugLine="Dim l As List = item.Get(\"options\")";
Debug.JustUpdateDeviceLine();
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("options")))));Debug.locals.put("l", _l);Debug.locals.put("l", _l);
 BA.debugLineNum = 164;BA.debugLine="If l.IsInitialized = False Or l.Size < 3 Or Is";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_l.runMethod(true,"IsInitialized"),preferencesdialog.__c.getField(true,"False")) || RemoteObject.solveBoolean("<",_l.runMethod(true,"getSize"),BA.numberCast(double.class, 3)) || RemoteObject.solveBoolean("=",preferencesdialog.__c.runMethod(true,"IsNumber",(Object)(BA.ObjectToString(_l.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))))),preferencesdialog.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",preferencesdialog.__c.runMethod(true,"IsNumber",(Object)(BA.ObjectToString(_l.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))))),preferencesdialog.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",preferencesdialog.__c.runMethod(true,"IsNumber",(Object)(BA.ObjectToString(_l.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2)))))),preferencesdialog.__c.getField(true,"False"))) { 
 BA.debugLineNum = 165;BA.debugLine="AddNumericRangeItem(key, title, 0, 100, 1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_addnumericrangeitem" /*RemoteObject*/ ,(Object)(_key),(Object)((_title)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 100)),(Object)(BA.numberCast(double.class, 1)));
 }else {
 BA.debugLineNum = 167;BA.debugLine="AddNumericRangeItem(key, title, l.Get(0), l.G";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_addnumericrangeitem" /*RemoteObject*/ ,(Object)(_key),(Object)((_title)),(Object)(BA.numberCast(double.class, _l.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(double.class, _l.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, _l.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))))));
 };
 break; }
case 13: {
 BA.debugLineNum = 170;BA.debugLine="Dim l As List = item.Get(\"options\")";
Debug.JustUpdateDeviceLine();
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("options")))));Debug.locals.put("l", _l);Debug.locals.put("l", _l);
 BA.debugLineNum = 171;BA.debugLine="Dim text As String";
Debug.JustUpdateDeviceLine();
_text = RemoteObject.createImmutable("");Debug.locals.put("text", _text);
 BA.debugLineNum = 172;BA.debugLine="If l.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_l.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 173;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 174;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 175;BA.debugLine="For i = 0 To l.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step65 = 1;
final int limit65 = RemoteObject.solve(new RemoteObject[] {_l.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step65 > 0 && _i <= limit65) || (step65 < 0 && _i >= limit65) ;_i = ((int)(0 + _i + step65))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 176;BA.debugLine="If i > 0 Then sb.Append(CRLF)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(preferencesdialog.__c.getField(true,"CRLF")));};
 BA.debugLineNum = 177;BA.debugLine="sb.Append(l.Get(i))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_l.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 179;BA.debugLine="text = sb.ToString";
Debug.JustUpdateDeviceLine();
_text = _sb.runMethod(true,"ToString");Debug.locals.put("text", _text);
 };
 BA.debugLineNum = 181;BA.debugLine="AddExplanationItem(key, title, text)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_addexplanationitem" /*RemoteObject*/ ,(Object)(_key),(Object)((_title)),(Object)((_text)));
 break; }
}
;
 BA.debugLineNum = 183;BA.debugLine="Dim pi As B4XPrefItem = PrefItems.Get(PrefItems.";
Debug.JustUpdateDeviceLine();
_pi = (__ref.getField(false,"_prefitems" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_prefitems" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 184;BA.debugLine="pi.Required = required";
Debug.JustUpdateDeviceLine();
_pi.setField ("Required" /*RemoteObject*/ ,_required);
 }
}Debug.locals.put("item", _item);
;
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _raisebeforedialogdisplayed(RemoteObject __ref,RemoteObject _temp) throws Exception{
try {
		Debug.PushSubsStack("RaiseBeforeDialogDisplayed (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,360);
if (RapidSub.canDelegate("raisebeforedialogdisplayed")) { return __ref.runUserSub(false, "preferencesdialog","raisebeforedialogdisplayed", __ref, _temp);}
Debug.locals.put("Temp", _temp);
 BA.debugLineNum = 360;BA.debugLine="Private Sub RaiseBeforeDialogDisplayed (Temp As Ob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 361;BA.debugLine="If mEventName <> \"\" And  xui.SubExists(mCallback,";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_meventname" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_BeforeDialogDisplayed"))),(Object)(BA.numberCast(int.class, 1))))) { 
 BA.debugLineNum = 362;BA.debugLine="CallSub2(mCallback, mEventName & \"_BeforeDialogD";
Debug.JustUpdateDeviceLine();
preferencesdialog.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_BeforeDialogDisplayed"))),(Object)(_temp));
 };
 BA.debugLineNum = 364;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scrolltoitemwitherror(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("ScrollToItemWithError (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,777);
if (RapidSub.canDelegate("scrolltoitemwitherror")) { return __ref.runUserSub(false, "preferencesdialog","scrolltoitemwitherror", __ref, _key);}
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("b4j.example.customlistview._clvitem");
RemoteObject _prefitem = RemoteObject.declareNull("b4j.example.preferencesdialog._b4xprefitem");
Debug.locals.put("key", _key);
 BA.debugLineNum = 777;BA.debugLine="Public Sub ScrollToItemWithError (key As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 778;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 779;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
Debug.JustUpdateDeviceLine();
_item = __ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getrawlistitem",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("Item", _item);Debug.locals.put("Item", _item);
 BA.debugLineNum = 780;BA.debugLine="Dim PrefItem As B4XPrefItem = Item.Value";
Debug.JustUpdateDeviceLine();
_prefitem = (_item.getField(false,"Value"));Debug.locals.put("PrefItem", _prefitem);Debug.locals.put("PrefItem", _prefitem);
 BA.debugLineNum = 781;BA.debugLine="If PrefItem.Key = key Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_prefitem.getField(true,"Key" /*RemoteObject*/ ),_key)) { 
 BA.debugLineNum = 782;BA.debugLine="GoToItem(i)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_gotoitem" /*void*/ ,(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 783;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 786;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seteventslistener(RemoteObject __ref,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("SetEventsListener (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("seteventslistener")) { return __ref.runUserSub(false, "preferencesdialog","seteventslistener", __ref, _callback, _eventname);}
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 64;BA.debugLine="Public Sub SetEventsListener(Callback As Object, E";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 65;BA.debugLine="mCallback = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 66;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setexplanation(RemoteObject __ref,RemoteObject _key,RemoteObject _explanation) throws Exception{
try {
		Debug.PushSubsStack("SetExplanation (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,892);
if (RapidSub.canDelegate("setexplanation")) { return __ref.runUserSub(false, "preferencesdialog","setexplanation", __ref, _key, _explanation);}
Debug.locals.put("Key", _key);
Debug.locals.put("Explanation", _explanation);
 BA.debugLineNum = 892;BA.debugLine="Public Sub SetExplanation (Key As String, Explanat";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 893;BA.debugLine="GetPrefItem(Key).Extra.Put(\"text\", Explanation)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_getprefitem" /*RemoteObject*/ ,(Object)(_key)).getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("text"))),(Object)(_explanation));
 BA.debugLineNum = 894;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlabelcolor(RemoteObject __ref,RemoteObject _lbl,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("SetLabelColor (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,435);
if (RapidSub.canDelegate("setlabelcolor")) { return __ref.runUserSub(false, "preferencesdialog","setlabelcolor", __ref, _lbl, _clr);}
RemoteObject _ft = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
Debug.locals.put("lbl", _lbl);
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 435;BA.debugLine="Private Sub SetLabelColor(lbl As B4XView, clr As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 436;BA.debugLine="Dim ft As B4XFloatTextField = lbl.Parent.GetView(";
Debug.JustUpdateDeviceLine();
_ft = (_lbl.runMethod(false,"getParent").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag"));Debug.locals.put("ft", _ft);Debug.locals.put("ft", _ft);
 BA.debugLineNum = 437;BA.debugLine="ft.Text = ColorToHex(clr)";
Debug.JustUpdateDeviceLine();
_ft.runClassMethod (b4j.example.b4xfloattextfield.class, "_settext" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.preferencesdialog.class, "_colortohex" /*RemoteObject*/ ,(Object)(_clr)));
 BA.debugLineNum = 438;BA.debugLine="lbl.SetColorAndBorder(clr, 1dip, Dialog.BorderCol";
Debug.JustUpdateDeviceLine();
_lbl.runVoidMethod ("SetColorAndBorder",(Object)(_clr),(Object)(BA.numberCast(double.class, preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(true,"_bordercolor" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))));
 BA.debugLineNum = 439;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setoptions(RemoteObject __ref,RemoteObject _key,RemoteObject _options) throws Exception{
try {
		Debug.PushSubsStack("SetOptions (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,884);
if (RapidSub.canDelegate("setoptions")) { return __ref.runUserSub(false, "preferencesdialog","setoptions", __ref, _key, _options);}
RemoteObject _pi = RemoteObject.declareNull("b4j.example.preferencesdialog._b4xprefitem");
Debug.locals.put("Key", _key);
Debug.locals.put("Options", _options);
 BA.debugLineNum = 884;BA.debugLine="Public Sub SetOptions (Key As String, Options As L";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 885;BA.debugLine="Dim pi As B4XPrefItem = GetPrefItem(Key)";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (b4j.example.preferencesdialog.class, "_getprefitem" /*RemoteObject*/ ,(Object)(_key));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 886;BA.debugLine="If pi.Extra.IsInitialized = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_pi.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),preferencesdialog.__c.getField(true,"False"))) { 
 BA.debugLineNum = 887;BA.debugLine="pi.Extra.Initialize";
Debug.JustUpdateDeviceLine();
_pi.getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 889;BA.debugLine="pi.Extra.Put(\"options\", Options)";
Debug.JustUpdateDeviceLine();
_pi.getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("options"))),(Object)((_options.getObject())));
 BA.debugLineNum = 890;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settheme(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("setTheme (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,449);
if (RapidSub.canDelegate("settheme")) { return __ref.runUserSub(false, "preferencesdialog","settheme", __ref, _t);}
RemoteObject _dividercolor = RemoteObject.createImmutable(0);
RemoteObject _clv = RemoteObject.declareNull("b4j.example.customlistview");
RemoteObject _sv = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("t", _t);
 BA.debugLineNum = 449;BA.debugLine="Public Sub setTheme (t As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 450;BA.debugLine="If t <> mTheme Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_t,BA.numberCast(double.class, __ref.getField(true,"_mtheme" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 451;BA.debugLine="mTheme = t";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtheme" /*RemoteObject*/ ,_t);
 BA.debugLineNum = 452;BA.debugLine="CustomListView1.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 453;BA.debugLine="Dim DividerColor As Int";
Debug.JustUpdateDeviceLine();
_dividercolor = RemoteObject.createImmutable(0);Debug.locals.put("DividerColor", _dividercolor);
 BA.debugLineNum = 454;BA.debugLine="Select mTheme";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(__ref.getField(true,"_mtheme" /*RemoteObject*/ ),__ref.getField(true,"_theme_dark" /*RemoteObject*/ ),__ref.getField(true,"_theme_light" /*RemoteObject*/ ))) {
case 0: {
 BA.debugLineNum = 456;BA.debugLine="ItemsBackgroundColor = 0xFF626262";
Debug.JustUpdateDeviceLine();
__ref.setField ("_itemsbackgroundcolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff626262)));
 BA.debugLineNum = 457;BA.debugLine="SeparatorBackgroundColor = 0xFFC0C0C0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_separatorbackgroundcolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xffc0c0c0)));
 BA.debugLineNum = 458;BA.debugLine="SeparatorTextColor = xui.Color_Black";
Debug.JustUpdateDeviceLine();
__ref.setField ("_separatortextcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 459;BA.debugLine="TextColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
__ref.setField ("_textcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 460;BA.debugLine="DividerColor = 0xFF464646";
Debug.JustUpdateDeviceLine();
_dividercolor = BA.numberCast(int.class, ((int)0xff464646));Debug.locals.put("DividerColor", _dividercolor);
 BA.debugLineNum = 461;BA.debugLine="Dialog.BackgroundColor = 0xFF555555";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_backgroundcolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff555555)));
 BA.debugLineNum = 462;BA.debugLine="Dialog.ButtonsColor = 0xFF555555";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonscolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff555555)));
 BA.debugLineNum = 463;BA.debugLine="Dialog.BorderColor = 0xff000000";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_bordercolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff000000)));
 BA.debugLineNum = 464;BA.debugLine="Dialog.ButtonsTextColor = 0xFF89D5FF";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonstextcolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff89d5ff)));
 BA.debugLineNum = 465;BA.debugLine="DateTemplate.DaysInWeekColor = xui.Color_Gray";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).setField ("_daysinweekcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Gray"));
 BA.debugLineNum = 466;BA.debugLine="DateTemplate.SelectedColor = 0xFF0BA29B";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).setField ("_selectedcolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff0ba29b)));
 break; }
case 1: {
 BA.debugLineNum = 468;BA.debugLine="ItemsBackgroundColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
__ref.setField ("_itemsbackgroundcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 469;BA.debugLine="SeparatorBackgroundColor = 0xFFD0D0D0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_separatorbackgroundcolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xffd0d0d0)));
 BA.debugLineNum = 470;BA.debugLine="SeparatorTextColor = 0xFF4E4F50";
Debug.JustUpdateDeviceLine();
__ref.setField ("_separatortextcolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff4e4f50)));
 BA.debugLineNum = 471;BA.debugLine="TextColor = 0xFF5B5B5B";
Debug.JustUpdateDeviceLine();
__ref.setField ("_textcolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff5b5b5b)));
 BA.debugLineNum = 472;BA.debugLine="DividerColor = 0xFFDFDFDF";
Debug.JustUpdateDeviceLine();
_dividercolor = BA.numberCast(int.class, ((int)0xffdfdfdf));Debug.locals.put("DividerColor", _dividercolor);
 BA.debugLineNum = 473;BA.debugLine="Dialog.BackgroundColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_backgroundcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 474;BA.debugLine="Dialog.ButtonsColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonscolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 475;BA.debugLine="Dialog.BorderColor = xui.Color_Gray";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_bordercolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Gray"));
 BA.debugLineNum = 476;BA.debugLine="Dialog.ButtonsTextColor = 0xFF007DC3";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonstextcolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff007dc3)));
 BA.debugLineNum = 477;BA.debugLine="DateTemplate.DaysInWeekColor = xui.Color_Black";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).setField ("_daysinweekcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 478;BA.debugLine="DateTemplate.SelectedColor = 0xFF39D7CE";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).setField ("_selectedcolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff39d7ce)));
 break; }
}
;
 BA.debugLineNum = 481;BA.debugLine="SearchTemplate.SearchField.TextField.TextColor =";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_searchtemplate" /*RemoteObject*/ ).getField(false,"_searchfield" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettextfield" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_textcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 482;BA.debugLine="SearchTemplate.SearchField.NonFocusedHintColor =";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_searchtemplate" /*RemoteObject*/ ).getField(false,"_searchfield" /*RemoteObject*/ ).setField ("_nonfocusedhintcolor" /*RemoteObject*/ ,__ref.getField(true,"_textcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 483;BA.debugLine="Dialog.BorderCornersRadius = 0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_bordercornersradius" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 484;BA.debugLine="Dialog.BorderWidth = 1dip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_borderwidth" /*RemoteObject*/ ,preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 485;BA.debugLine="DateTemplate.HighlightedColor = 0xFF00CEFF";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).setField ("_highlightedcolor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff00ceff)));
 BA.debugLineNum = 486;BA.debugLine="DateTemplate.DaysInMonthColor = TextColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).setField ("_daysinmonthcolor" /*RemoteObject*/ ,__ref.getField(true,"_textcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 487;BA.debugLine="DateTemplate.lblMonth.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).getField(false,"_lblmonth" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_textcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 488;BA.debugLine="DateTemplate.lblYear.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).getField(false,"_lblyear" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_textcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 489;BA.debugLine="For Each clv As CustomListView In Array(CustomLi";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group39 = RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(__ref.getField(false,"_customlistview1" /*RemoteObject*/ )),(__ref.getField(false,"_searchtemplate" /*RemoteObject*/ ).getField(false,"_customlistview1" /*RemoteObject*/ )),(__ref.getField(false,"_longtexttemplate" /*RemoteObject*/ ).getField(false,"_customlistview1" /*RemoteObject*/ ))});
final int groupLen39 = group39.getField(true,"length").<Integer>get()
;int index39 = 0;
;
for (; index39 < groupLen39;index39++){
_clv = (group39.getArrayElement(false,RemoteObject.createImmutable(index39)));Debug.locals.put("clv", _clv);
Debug.locals.put("clv", _clv);
 BA.debugLineNum = 490;BA.debugLine="clv.sv.ScrollViewInnerPanel.Color = DividerColo";
Debug.JustUpdateDeviceLine();
_clv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",_dividercolor);
 BA.debugLineNum = 491;BA.debugLine="clv.sv.Color = Dialog.BackgroundColor";
Debug.JustUpdateDeviceLine();
_clv.getField(false,"_sv").runMethod(true,"setColor",__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(true,"_backgroundcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 492;BA.debugLine="clv.DefaultTextBackgroundColor = ItemsBackgroun";
Debug.JustUpdateDeviceLine();
_clv.setField ("_defaulttextbackgroundcolor",__ref.getField(true,"_itemsbackgroundcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 493;BA.debugLine="clv.DefaultTextColor = TextColor";
Debug.JustUpdateDeviceLine();
_clv.setField ("_defaulttextcolor",__ref.getField(true,"_textcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 495;BA.debugLine="Dim sv As Node = clv.sv";
Debug.JustUpdateDeviceLine();
_sv = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
_sv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _clv.getField(false,"_sv").getObject());Debug.locals.put("sv", _sv);Debug.locals.put("sv", _sv);
 BA.debugLineNum = 496;BA.debugLine="sv.StyleClasses.Clear";
Debug.JustUpdateDeviceLine();
_sv.runMethod(false,"getStyleClasses").runVoidMethod ("Clear");
 BA.debugLineNum = 497;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
Debug.JustUpdateDeviceLine();
_sv.runMethod(false,"getStyleClasses").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("b4xdialog"))));
 BA.debugLineNum = 498;BA.debugLine="If mTheme = THEME_LIGHT Then sv.StyleClasses.Ad";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mtheme" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_theme_light" /*RemoteObject*/ )))) { 
_sv.runMethod(false,"getStyleClasses").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("b4xdialoglight"))));};
 }
}Debug.locals.put("clv", _clv);
;
 BA.debugLineNum = 501;BA.debugLine="For Each b As B4XView In Array(DateTemplate.btnM";
Debug.JustUpdateDeviceLine();
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group49 = RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).getField(false,"_btnmonthleft" /*RemoteObject*/ ).getObject()),(__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).getField(false,"_btnmonthright" /*RemoteObject*/ ).getObject()),(__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).getField(false,"_btnyearleft" /*RemoteObject*/ ).getObject()),(__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).getField(false,"_btnyearright" /*RemoteObject*/ ).getObject())});
final int groupLen49 = group49.getField(true,"length").<Integer>get()
;int index49 = 0;
;
for (; index49 < groupLen49;index49++){
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group49.getArrayElement(false,RemoteObject.createImmutable(index49)));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 502;BA.debugLine="b.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
_b.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 503;BA.debugLine="b.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_b.runMethod(true,"setTextColor",__ref.getField(true,"_textcolor" /*RemoteObject*/ ));
 }
}Debug.locals.put("b", _b);
;
 };
 BA.debugLineNum = 510;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settitle(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("setTitle (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("settitle")) { return __ref.runUserSub(false, "preferencesdialog","settitle", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 73;BA.debugLine="Public Sub setTitle(o As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 74;BA.debugLine="mTitle = o";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtitle" /*RemoteObject*/ ,_o);
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _dialog1) throws Exception{
try {
		Debug.PushSubsStack("Show (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,371);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "preferencesdialog","show", __ref, _dialog1);}
Debug.locals.put("Dialog1", _dialog1);
 BA.debugLineNum = 371;BA.debugLine="Private Sub Show (Dialog1 As B4XDialog) 'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 373;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showdialog(RemoteObject __ref,RemoteObject _data,RemoteObject _yes,RemoteObject _cancel) throws Exception{
try {
		Debug.PushSubsStack("ShowDialog (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,281);
if (RapidSub.canDelegate("showdialog")) { return __ref.runUserSub(false, "preferencesdialog","showdialog", __ref, _data, _yes, _cancel);}
ResumableSub_ShowDialog rsub = new ResumableSub_ShowDialog(null,__ref,_data,_yes,_cancel);
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
public static class ResumableSub_ShowDialog extends BA.ResumableSub {
public ResumableSub_ShowDialog(b4j.example.preferencesdialog parent,RemoteObject __ref,RemoteObject _data,RemoteObject _yes,RemoteObject _cancel) {
this.parent = parent;
this.__ref = __ref;
this._data = _data;
this._yes = _yes;
this._cancel = _cancel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.preferencesdialog parent;
RemoteObject _data;
RemoteObject _yes;
RemoteObject _cancel;
RemoteObject _lasttextfield = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
RemoteObject _pi = RemoteObject.declareNull("b4j.example.preferencesdialog._b4xprefitem");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _tf = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
RemoteObject _scrollviewoffset = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _y = RemoteObject.declareNull("Object");
RemoteObject _c = RemoteObject.declareNull("Object");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject group3;
int index3;
int groupLen3;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ShowDialog (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,281);
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
Debug.locals.put("Data", _data);
Debug.locals.put("Yes", _yes);
Debug.locals.put("Cancel", _cancel);
 BA.debugLineNum = 282;BA.debugLine="If CustomListView1.Size = 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(true,"_getsize"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 283;BA.debugLine="Dim LastTextField As B4XFloatTextField";
Debug.JustUpdateDeviceLine();
_lasttextfield = RemoteObject.createNew ("b4j.example.b4xfloattextfield");Debug.locals.put("LastTextField", _lasttextfield);
 BA.debugLineNum = 284;BA.debugLine="For Each pi As B4XPrefItem In PrefItems";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//for
this.state = 15;
group3 = __ref.getField(false,"_prefitems" /*RemoteObject*/ );
index3 = 0;
groupLen3 = group3.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("pi", _pi);
this.state = 55;
if (true) break;

case 55:
//C
this.state = 15;
if (index3 < groupLen3) {
this.state = 6;
_pi = (group3.runMethod(false,"Get",index3));Debug.locals.put("pi", _pi);}
if (true) break;

case 56:
//C
this.state = 55;
index3++;
Debug.locals.put("pi", _pi);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 285;BA.debugLine="Dim pnl As B4XView = CreateLayouts(pi)";
Debug.JustUpdateDeviceLine();
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = __ref.runClassMethod (b4j.example.preferencesdialog.class, "_createlayouts" /*RemoteObject*/ ,(Object)(_pi));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 286;BA.debugLine="CustomListView1.Add (pnl, pi)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(_pnl),(Object)((_pi)));
 BA.debugLineNum = 287;BA.debugLine="If pnl.GetView(0).Tag Is B4XFloatTextField Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 14;
if (RemoteObject.solveBoolean("i",_pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag"), RemoteObject.createImmutable("b4j.example.b4xfloattextfield"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 288;BA.debugLine="Dim tf As B4XFloatTextField = pnl.GetView(0).T";
Debug.JustUpdateDeviceLine();
_tf = (_pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag"));Debug.locals.put("tf", _tf);Debug.locals.put("tf", _tf);
 BA.debugLineNum = 289;BA.debugLine="If LastTextField.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 13;
if (_lasttextfield.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 290;BA.debugLine="LastTextField.NextField = tf";
Debug.JustUpdateDeviceLine();
_lasttextfield.runClassMethod (b4j.example.b4xfloattextfield.class, "_setnextfield" /*RemoteObject*/ ,_tf);
 if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 292;BA.debugLine="LastTextField = tf";
Debug.JustUpdateDeviceLine();
_lasttextfield = _tf;Debug.locals.put("LastTextField", _lasttextfield);
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
Debug.locals.put("pi", _pi);
;
 BA.debugLineNum = 300;BA.debugLine="Dialog.InternalAddStubToCLVIfNeeded(CustomListVi";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_internaladdstubtoclvifneeded" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_customlistview1" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(true,"_defaulttextbackgroundcolor")));
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 302;BA.debugLine="FillData (Data)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_filldata" /*RemoteObject*/ ,(Object)(_data));
 BA.debugLineNum = 303;BA.debugLine="Dim ScrollViewOffset As Int 'ignore";
Debug.JustUpdateDeviceLine();
_scrollviewoffset = RemoteObject.createImmutable(0);Debug.locals.put("ScrollViewOffset", _scrollviewoffset);
 BA.debugLineNum = 304;BA.debugLine="Do While True";
Debug.JustUpdateDeviceLine();
if (true) break;

case 17:
//do while
this.state = 54;
while (parent.__c.getField(true,"True").<Boolean>get().booleanValue()) {
this.state = 19;
if (true) break;
}
if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 305;BA.debugLine="Dialog.Title = mTitle";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,__ref.getField(false,"_mtitle" /*RemoteObject*/ ));
 BA.debugLineNum = 306;BA.debugLine="Dialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_putattop" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A")) || RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i"))));
 BA.debugLineNum = 307;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(Me, Yes,";
Debug.JustUpdateDeviceLine();
_rs = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)(__ref),(Object)(_yes),(Object)(RemoteObject.createImmutable((""))),(Object)(_cancel));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 315;BA.debugLine="RaiseBeforeDialogDisplayed(Me)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_raisebeforedialogdisplayed" /*RemoteObject*/ ,(Object)(__ref));
 BA.debugLineNum = 316;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "preferencesdialog", "showdialog"), _rs);
this.state = 57;
return;
case 57:
//C
this.state = 20;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 317;BA.debugLine="ScrollViewOffset = CustomListView1.sv.ScrollView";
Debug.JustUpdateDeviceLine();
_scrollviewoffset = BA.numberCast(int.class, __ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewOffsetY"));Debug.locals.put("ScrollViewOffset", _scrollviewoffset);
 BA.debugLineNum = 318;BA.debugLine="If Result <> RESULT_SHOWING_NESTED_DIALOG Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 20:
//if
this.state = 53;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(true,"_result_showing_nested_dialog" /*RemoteObject*/ )))) { 
this.state = 22;
}else {
this.state = 32;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 319;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 23:
//if
this.state = 30;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 320;BA.debugLine="If CommitChanges(Data) = False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 26:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.preferencesdialog.class, "_commitchanges" /*RemoteObject*/ ,(Object)(_data)),parent.__c.getField(true,"False"))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 321;BA.debugLine="ScrollViewOffset = 0";
Debug.JustUpdateDeviceLine();
_scrollviewoffset = BA.numberCast(int.class, 0);Debug.locals.put("ScrollViewOffset", _scrollviewoffset);
 BA.debugLineNum = 322;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
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
 BA.debugLineNum = 325;BA.debugLine="Return Result";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_result));return;};
 if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 327;BA.debugLine="Dim y As Object";
Debug.JustUpdateDeviceLine();
_y = RemoteObject.createNew ("Object");Debug.locals.put("y", _y);
 BA.debugLineNum = 328;BA.debugLine="Dim c As Object = Cancel";
Debug.JustUpdateDeviceLine();
_c = _cancel;Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 329;BA.debugLine="If Template = ColorTemplate Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 33:
//if
this.state = 40;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_template" /*RemoteObject*/ ),(__ref.getField(false,"_colortemplate" /*RemoteObject*/ )))) { 
this.state = 35;
}else 
{ BA.debugLineNum = 331;BA.debugLine="Else If Template = LongTextTemplate Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_template" /*RemoteObject*/ ),(__ref.getField(false,"_longtexttemplate" /*RemoteObject*/ )))) { 
this.state = 37;
}else {
this.state = 39;
}}
if (true) break;

case 35:
//C
this.state = 40;
 BA.debugLineNum = 330;BA.debugLine="y = Yes";
Debug.JustUpdateDeviceLine();
_y = _yes;Debug.locals.put("y", _y);
 if (true) break;

case 37:
//C
this.state = 40;
 BA.debugLineNum = 332;BA.debugLine="y = Yes";
Debug.JustUpdateDeviceLine();
_y = _yes;Debug.locals.put("y", _y);
 BA.debugLineNum = 333;BA.debugLine="c = \"\"";
Debug.JustUpdateDeviceLine();
_c = RemoteObject.createImmutable((""));Debug.locals.put("c", _c);
 if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 335;BA.debugLine="y = \"\"";
Debug.JustUpdateDeviceLine();
_y = RemoteObject.createImmutable((""));Debug.locals.put("y", _y);
 if (true) break;

case 40:
//C
this.state = 41;
;
 BA.debugLineNum = 337;BA.debugLine="Dialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_putattop" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A")) || RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i"))));
 BA.debugLineNum = 338;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(Template";
Debug.JustUpdateDeviceLine();
_rs = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_template" /*RemoteObject*/ )),(Object)(_y),(Object)(RemoteObject.createImmutable((""))),(Object)(_c));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 339;BA.debugLine="RaiseBeforeDialogDisplayed(Template)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_raisebeforedialogdisplayed" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_template" /*RemoteObject*/ )));
 BA.debugLineNum = 340;BA.debugLine="Wait For (rs) Complete (Result As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "preferencesdialog", "showdialog"), _rs);
this.state = 58;
return;
case 58:
//C
this.state = 41;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 341;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 41:
//if
this.state = 52;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 342;BA.debugLine="Dim lbl As B4XView = CustomListView1.GetPanel(";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = __ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(__ref.getField(true,"_nesteddialogitemindex" /*RemoteObject*/ ))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 343;BA.debugLine="Dim value As String";
Debug.JustUpdateDeviceLine();
_value = RemoteObject.createImmutable("");Debug.locals.put("value", _value);
 BA.debugLineNum = 344;BA.debugLine="If Template = DateTemplate Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 44:
//if
this.state = 51;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_template" /*RemoteObject*/ ),(__ref.getField(false,"_datetemplate" /*RemoteObject*/ )))) { 
this.state = 46;
}else 
{ BA.debugLineNum = 347;BA.debugLine="Else if Template = SearchTemplate Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_template" /*RemoteObject*/ ),(__ref.getField(false,"_searchtemplate" /*RemoteObject*/ )))) { 
this.state = 48;
}else 
{ BA.debugLineNum = 350;BA.debugLine="Else If Template = ColorTemplate Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_template" /*RemoteObject*/ ),(__ref.getField(false,"_colortemplate" /*RemoteObject*/ )))) { 
this.state = 50;
}}}
if (true) break;

case 46:
//C
this.state = 51;
 BA.debugLineNum = 345;BA.debugLine="value = DateTime.Date(DateTemplate.Date)";
Debug.JustUpdateDeviceLine();
_value = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ )));Debug.locals.put("value", _value);
 BA.debugLineNum = 346;BA.debugLine="lbl.Text = value";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(true,"setText",_value);
 if (true) break;

case 48:
//C
this.state = 51;
 BA.debugLineNum = 348;BA.debugLine="value = SearchTemplate.SelectedItem";
Debug.JustUpdateDeviceLine();
_value = __ref.getField(false,"_searchtemplate" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("value", _value);
 BA.debugLineNum = 349;BA.debugLine="lbl.Text = value";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(true,"setText",_value);
 if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 351;BA.debugLine="value = ColorTemplate.SelectedColor";
Debug.JustUpdateDeviceLine();
_value = BA.NumberToString(__ref.getField(false,"_colortemplate" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xcolortemplate.class, "_getselectedcolor" /*RemoteObject*/ ));Debug.locals.put("value", _value);
 BA.debugLineNum = 352;BA.debugLine="SetLabelColor(lbl, value)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_setlabelcolor" /*RemoteObject*/ ,(Object)(_lbl),(Object)(BA.numberCast(int.class, _value)));
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
 BA.debugLineNum = 357;BA.debugLine="Return -1 'never happens";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((-(double) (0 + 1))));return;};
 BA.debugLineNum = 358;BA.debugLine="End Sub";
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
public static RemoteObject  _tfcolorcode_enterpressed(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("tfColorCode_EnterPressed (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,931);
if (RapidSub.canDelegate("tfcolorcode_enterpressed")) { return __ref.runUserSub(false, "preferencesdialog","tfcolorcode_enterpressed", __ref);}
RemoteObject _ft = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
RemoteObject _clr = null;
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 931;BA.debugLine="Private Sub tfColorCode_EnterPressed";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 932;BA.debugLine="Dim ft As B4XFloatTextField = Sender";
Debug.JustUpdateDeviceLine();
_ft = (preferencesdialog.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("ft", _ft);Debug.locals.put("ft", _ft);
 BA.debugLineNum = 933;BA.debugLine="Dim clr() As Int = HexToColor(ft.Text)";
Debug.JustUpdateDeviceLine();
_clr = __ref.runClassMethod (b4j.example.preferencesdialog.class, "_hextocolor" /*RemoteObject*/ ,(Object)(_ft.runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ )));Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 934;BA.debugLine="Dim index As Int = CustomListView1.GetItemFromVie";
Debug.JustUpdateDeviceLine();
_index = __ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",(Object)(_ft.getField(false,"_mbase" /*RemoteObject*/ )));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 935;BA.debugLine="Dim lbl As B4XView = CustomListView1.GetPanel(ind";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = __ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_index)).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 936;BA.debugLine="If clr.Length = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_clr.getField(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 937;BA.debugLine="SetLabelColor(lbl, clr(0))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.preferencesdialog.class, "_setlabelcolor" /*RemoteObject*/ ,(Object)(_lbl),(Object)(_clr.getArrayElement(true,BA.numberCast(int.class, 0))));
 }else {
 BA.debugLineNum = 939;BA.debugLine="ft.Text = ColorToHex(lbl.Color)";
Debug.JustUpdateDeviceLine();
_ft.runClassMethod (b4j.example.b4xfloattextfield.class, "_settext" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.preferencesdialog.class, "_colortohex" /*RemoteObject*/ ,(Object)(_lbl.runMethod(true,"getColor"))));
 };
 BA.debugLineNum = 941;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _twolabelslayout(RemoteObject __ref,RemoteObject _eventname,RemoteObject _p,RemoteObject _prefitem) throws Exception{
try {
		Debug.PushSubsStack("TwoLabelsLayout (preferencesdialog) ","preferencesdialog",20,__ref.getField(false, "ba"),__ref,801);
if (RapidSub.canDelegate("twolabelslayout")) { return __ref.runUserSub(false, "preferencesdialog","twolabelslayout", __ref, _eventname, _p, _prefitem);}
RemoteObject _lbltitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _fnt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _lbldate = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("EventName", _eventname);
Debug.locals.put("p", _p);
Debug.locals.put("PrefItem", _prefitem);
 BA.debugLineNum = 801;BA.debugLine="Private Sub TwoLabelsLayout (EventName As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 802;BA.debugLine="Dim lblTitle As B4XView = CreateLabel(EventName)";
Debug.JustUpdateDeviceLine();
_lbltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbltitle = __ref.runClassMethod (b4j.example.preferencesdialog.class, "_createlabel" /*RemoteObject*/ ,(Object)(_eventname));Debug.locals.put("lblTitle", _lbltitle);Debug.locals.put("lblTitle", _lbltitle);
 BA.debugLineNum = 803;BA.debugLine="lblTitle.SetTextAlignment(\"CENTER\", \"LEFT\")";
Debug.JustUpdateDeviceLine();
_lbltitle.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("LEFT")));
 BA.debugLineNum = 804;BA.debugLine="lblTitle.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_lbltitle.runMethod(true,"setTextColor",__ref.getField(true,"_textcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 805;BA.debugLine="Dim fnt As B4XFont = xui.CreateDefaultBoldFont(16";
Debug.JustUpdateDeviceLine();
_fnt = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
_fnt = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, 16)));Debug.locals.put("fnt", _fnt);Debug.locals.put("fnt", _fnt);
 BA.debugLineNum = 806;BA.debugLine="lblTitle.Font = fnt";
Debug.JustUpdateDeviceLine();
_lbltitle.runMethod(false,"setFont",_fnt);
 BA.debugLineNum = 807;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(lblTitle";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_internalsettextorcsbuildertolabel" /*RemoteObject*/ ,(Object)(_lbltitle),(Object)(_prefitem.getField(false,"Title" /*RemoteObject*/ )));
 BA.debugLineNum = 808;BA.debugLine="p.AddView(lblTitle, 10dip, 10dip, p.Width - 110di";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("AddView",(Object)((_lbltitle.getObject())),(Object)(BA.numberCast(double.class, preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))))),(Object)(BA.numberCast(double.class, preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))))),(Object)(RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getWidth"),preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 110)))}, "-",1, 0)),(Object)(BA.numberCast(double.class, preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))))));
 BA.debugLineNum = 809;BA.debugLine="Dim lblDate As B4XView = CreateLabel(EventName)";
Debug.JustUpdateDeviceLine();
_lbldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbldate = __ref.runClassMethod (b4j.example.preferencesdialog.class, "_createlabel" /*RemoteObject*/ ,(Object)(_eventname));Debug.locals.put("lblDate", _lbldate);Debug.locals.put("lblDate", _lbldate);
 BA.debugLineNum = 810;BA.debugLine="lblDate.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_lbldate.runMethod(true,"setTextColor",__ref.getField(true,"_textcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 811;BA.debugLine="lblDate.SetTextAlignment(\"CENTER\", \"RIGHT\")";
Debug.JustUpdateDeviceLine();
_lbldate.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("RIGHT")));
 BA.debugLineNum = 812;BA.debugLine="lblDate.Font = fnt";
Debug.JustUpdateDeviceLine();
_lbldate.runMethod(false,"setFont",_fnt);
 BA.debugLineNum = 813;BA.debugLine="p.AddView(lblDate, p.Width - 108dip, 10dip, 98dip";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("AddView",(Object)((_lbldate.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getWidth"),preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 108)))}, "-",1, 0)),(Object)(BA.numberCast(double.class, preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))))),(Object)(BA.numberCast(double.class, preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 98))))),(Object)(BA.numberCast(double.class, preferencesdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))))));
 BA.debugLineNum = 814;BA.debugLine="End Sub";
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