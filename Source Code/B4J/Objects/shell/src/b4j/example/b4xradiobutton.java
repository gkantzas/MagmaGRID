
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xradiobutton {
    public static RemoteObject myClass;
	public b4xradiobutton() {
	}
    public static PCBA staticBA = new PCBA(null, b4xradiobutton.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _oncolor = RemoteObject.createImmutable(0);
public static RemoteObject _offcolor = RemoteObject.createImmutable(0);
public static RemoteObject _bc = RemoteObject.declareNull("b4j.example.bitmapcreator");
public static RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mvalue = RemoteObject.createImmutable(false);
public static RemoteObject _transparent = RemoteObject.declareNull("b4j.example.bcpath._bcbrush");
public static RemoteObject _loopindex = RemoteObject.createImmutable(0);
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _onbrush = RemoteObject.declareNull("b4j.example.bcpath._bcbrush");
public static RemoteObject _offbrush = RemoteObject.declareNull("b4j.example.bcpath._bcbrush");
public static RemoteObject _menabled = RemoteObject.createImmutable(false);
public static RemoteObject _mhaptic = RemoteObject.createImmutable(false);
public static RemoteObject _size = RemoteObject.createImmutable(0);
public static RemoteObject _mlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _scale = RemoteObject.createImmutable(0f);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"bc",_ref.getField(false, "_bc"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"iv",_ref.getField(false, "_iv"),"LoopIndex",_ref.getField(false, "_loopindex"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEnabled",_ref.getField(false, "_menabled"),"mEventName",_ref.getField(false, "_meventname"),"mHaptic",_ref.getField(false, "_mhaptic"),"mLabel",_ref.getField(false, "_mlabel"),"mValue",_ref.getField(false, "_mvalue"),"OffBrush",_ref.getField(false, "_offbrush"),"OffColor",_ref.getField(false, "_offcolor"),"OnBrush",_ref.getField(false, "_onbrush"),"OnColor",_ref.getField(false, "_oncolor"),"pnl",_ref.getField(false, "_pnl"),"Scale",_ref.getField(false, "_scale"),"Size",_ref.getField(false, "_size"),"Tag",_ref.getField(false, "_tag"),"transparent",_ref.getField(false, "_transparent"),"xui",_ref.getField(false, "_xui")};
}
}