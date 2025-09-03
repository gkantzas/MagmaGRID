
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xeval {
    public static RemoteObject myClass;
	public b4xeval() {
	}
    public static PCBA staticBA = new PCBA(null, b4xeval.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _number_type = RemoteObject.createImmutable(0);
public static RemoteObject _operator_type = RemoteObject.createImmutable(0);
public static RemoteObject _root = RemoteObject.declareNull("b4j.example.b4xeval._parsednode");
public static RemoteObject _parseindex = RemoteObject.createImmutable(0);
public static RemoteObject _nodes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _operatorlevel = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _error = RemoteObject.createImmutable(false);
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"Error",_ref.getField(false, "_error"),"mCallback",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"Nodes",_ref.getField(false, "_nodes"),"NUMBER_TYPE",_ref.getField(false, "_number_type"),"OPERATOR_TYPE",_ref.getField(false, "_operator_type"),"OperatorLevel",_ref.getField(false, "_operatorlevel"),"ParseIndex",_ref.getField(false, "_parseindex"),"root",_ref.getField(false, "_root")};
}
}