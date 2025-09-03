
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class inlineediting {
    public static RemoteObject myClass;
	public inlineediting() {
	}
    public static PCBA staticBA = new PCBA(null, inlineediting.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _currentlyfocusedcell = RemoteObject.declareNull("b4j.example.inlineediting._focusedcell");
public static RemoteObject _mtable = RemoteObject.declareNull("b4j.example.b4xtable");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"CurrentlyFocusedCell",_ref.getField(false, "_currentlyfocusedcell"),"DateUtils",_ref.getField(false, "_dateutils"),"mCallback",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"mTable",_ref.getField(false, "_mtable")};
}
}