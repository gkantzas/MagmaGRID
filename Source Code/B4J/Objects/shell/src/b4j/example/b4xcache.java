
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xcache {
    public static RemoteObject myClass;
	public b4xcache() {
	}
    public static PCBA staticBA = new PCBA(null, b4xcache.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _data = RemoteObject.declareNull("b4j.example.b4xorderedmap");
public static RemoteObject _mmaxsize = RemoteObject.createImmutable(0);
public static RemoteObject _removethreshold = RemoteObject.createImmutable(0f);
public static RemoteObject _eternalcounts = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"Data",_ref.getField(false, "_data"),"DateUtils",_ref.getField(false, "_dateutils"),"EternalCounts",_ref.getField(false, "_eternalcounts"),"mMaxSize",_ref.getField(false, "_mmaxsize"),"RemoveThreshold",_ref.getField(false, "_removethreshold")};
}
}