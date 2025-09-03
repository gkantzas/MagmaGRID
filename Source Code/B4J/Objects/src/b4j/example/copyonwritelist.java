package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class copyonwritelist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.copyonwritelist", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.copyonwritelist.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _internallist = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _add(b4j.example.copyonwritelist __ref,Object _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "add", true))
	 {return ((String) Debug.delegate(ba, "add", new Object[] {_item}));}
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Public Sub Add (Item As Object)";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="InternalList.Add(Item)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Add(_item);
RDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="End Sub";
return "";
}
public String  _makecopy(b4j.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "makecopy", true))
	 {return ((String) Debug.delegate(ba, "makecopy", null));}
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Private Sub MakeCopy";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="InternalList = B4XCollections.CreateList(Internal";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/  = _b4xcollections._createlist /*anywheresoftware.b4a.objects.collections.List*/ (__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="End Sub";
return "";
}
public String  _addall(b4j.example.copyonwritelist __ref,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "addall", true))
	 {return ((String) Debug.delegate(ba, "addall", new Object[] {_items}));}
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Public Sub AddAll (Items As List)";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="InternalList.AddAll(Items)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(_items);
RDebugUtils.currentLine=12976131;
 //BA.debugLineNum = 12976131;BA.debugLine="End Sub";
return "";
}
public String  _addallat(b4j.example.copyonwritelist __ref,int _index,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "addallat", true))
	 {return ((String) Debug.delegate(ba, "addallat", new Object[] {_index,_items}));}
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Public Sub AddAllAt (Index As Int, Items As List)";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="InternalList.AddAllAt(Index, Items)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .AddAllAt(_index,_items);
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="Private InternalList As List";
_internallist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="Dim InternalList As List";
_internallist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="InternalList.Initialize";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="End Sub";
return "";
}
public boolean  _get(b4j.example.copyonwritelist __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Boolean) Debug.delegate(ba, "get", new Object[] {_index}));}
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Public Sub Get (Index As Int) As Boolean";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="Return InternalList.Get(Index)";
if (true) return BA.ObjectToBoolean(__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index));
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.List  _getlist(b4j.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "getlist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getlist", null));}
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Public Sub GetList As List";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="Return InternalList";
if (true) return __ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="End Sub";
return null;
}
public int  _getsize(b4j.example.copyonwritelist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="Return InternalList.Size";
if (true) return __ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="End Sub";
return 0;
}
public int  _indexof(b4j.example.copyonwritelist __ref,Object _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "indexof", true))
	 {return ((Integer) Debug.delegate(ba, "indexof", new Object[] {_item}));}
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Public Sub IndexOf (Item As Object) As Int";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="Return InternalList.IndexOf(Item)";
if (true) return __ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_item);
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4j.example.copyonwritelist __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _initialitems) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_initialitems}));}
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Public Sub Initialize (InitialItems As List)";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="InternalList = B4XCollections.CreateList(InitialI";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/  = _b4xcollections._createlist /*anywheresoftware.b4a.objects.collections.List*/ (_initialitems);
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="End Sub";
return "";
}
public String  _insertat(b4j.example.copyonwritelist __ref,int _index,Object _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "insertat", true))
	 {return ((String) Debug.delegate(ba, "insertat", new Object[] {_index,_item}));}
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Public Sub InsertAt (Index As Int, Item As Object)";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="InternalList.InsertAt(Index, Item)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_index,_item);
RDebugUtils.currentLine=12910595;
 //BA.debugLineNum = 12910595;BA.debugLine="End Sub";
return "";
}
public String  _removeat(b4j.example.copyonwritelist __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "removeat", true))
	 {return ((String) Debug.delegate(ba, "removeat", new Object[] {_index}));}
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Public Sub RemoveAt (Index As Int)";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="InternalList.RemoveAt(Index)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="End Sub";
return "";
}
public String  _set(b4j.example.copyonwritelist __ref,int _index,Object _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "set", true))
	 {return ((String) Debug.delegate(ba, "set", new Object[] {_index,_item}));}
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Public Sub Set (Index As Int, Item As Object)";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="InternalList.Set(Index, Item)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Set(_index,_item);
RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="End Sub";
return "";
}
public String  _sort(b4j.example.copyonwritelist __ref,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "sort", true))
	 {return ((String) Debug.delegate(ba, "sort", new Object[] {_ascending}));}
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Public Sub Sort (Ascending As Boolean)";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="InternalList.Sort(Ascending)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .Sort(_ascending);
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="End Sub";
return "";
}
public String  _sortcaseinsensitive(b4j.example.copyonwritelist __ref,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "sortcaseinsensitive", true))
	 {return ((String) Debug.delegate(ba, "sortcaseinsensitive", new Object[] {_ascending}));}
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Public Sub SortCaseInsensitive (Ascending As Boole";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="InternalList.SortCaseInsensitive(Ascending)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .SortCaseInsensitive(_ascending);
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="End Sub";
return "";
}
public String  _sorttype(b4j.example.copyonwritelist __ref,String _fieldname,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "sorttype", true))
	 {return ((String) Debug.delegate(ba, "sorttype", new Object[] {_fieldname,_ascending}));}
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Public Sub SortType (FieldName As String, Ascendin";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="InternalList.SortType(FieldName, Ascending)";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .SortType(_fieldname,_ascending);
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="End Sub";
return "";
}
public String  _sorttypecaseinsensitive(b4j.example.copyonwritelist __ref,String _fieldname,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="copyonwritelist";
if (Debug.shouldDelegate(ba, "sorttypecaseinsensitive", true))
	 {return ((String) Debug.delegate(ba, "sorttypecaseinsensitive", new Object[] {_fieldname,_ascending}));}
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Public Sub SortTypeCaseInsensitive (FieldName As S";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="MakeCopy";
__ref._makecopy /*String*/ (null);
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="InternalList.SortTypeCaseInsensitive(FieldName, A";
__ref._internallist /*anywheresoftware.b4a.objects.collections.List*/ .SortTypeCaseInsensitive(_fieldname,_ascending);
RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="End Sub";
return "";
}
}