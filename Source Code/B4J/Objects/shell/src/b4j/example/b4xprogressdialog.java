
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xprogressdialog {
    public static RemoteObject myClass;
	public b4xprogressdialog() {
	}
    public static PCBA staticBA = new PCBA(null, b4xprogressdialog.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mtext = RemoteObject.declareNull("Object");
public static RemoteObject _loadingindicator = RemoteObject.declareNull("b4j.example.b4xloadingindicator");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mdialog = RemoteObject.declareNull("b4j.example.b4xdialog");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"Label1",_ref.getField(false, "_label1"),"LoadingIndicator",_ref.getField(false, "_loadingindicator"),"mBase",_ref.getField(false, "_mbase"),"mDialog",_ref.getField(false, "_mdialog"),"mText",_ref.getField(false, "_mtext"),"xui",_ref.getField(false, "_xui")};
}
}