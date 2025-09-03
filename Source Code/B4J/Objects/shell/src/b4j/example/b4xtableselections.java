
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xtableselections {
    public static RemoteObject myClass;
	public b4xtableselections() {
	}
    public static PCBA staticBA = new PCBA(null, b4xtableselections.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mode_single_cell_temp = RemoteObject.createImmutable(0);
public static RemoteObject _mode_single_cell_permanent = RemoteObject.createImmutable(0);
public static RemoteObject _mode_single_line_permanent = RemoteObject.createImmutable(0);
public static RemoteObject _mode_multiple_cells = RemoteObject.createImmutable(0);
public static RemoteObject _mode_multiple_lines = RemoteObject.createImmutable(0);
public static RemoteObject _linemode = RemoteObject.createImmutable(false);
public static RemoteObject _singlemode = RemoteObject.createImmutable(false);
public static RemoteObject _mcurrentmode = RemoteObject.createImmutable(0);
public static RemoteObject _selectedlines = RemoteObject.declareNull("b4j.example.b4xorderedmap");
public static RemoteObject _selectioncolor = RemoteObject.createImmutable(0);
public static RemoteObject _mtable = RemoteObject.declareNull("b4j.example.b4xtable");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _autoremoveinvisibleselections = RemoteObject.createImmutable(false);
public static RemoteObject _selectedtextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AutoRemoveInvisibleSelections",_ref.getField(false, "_autoremoveinvisibleselections"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"LineMode",_ref.getField(false, "_linemode"),"mCurrentMode",_ref.getField(false, "_mcurrentmode"),"MODE_MULTIPLE_CELLS",_ref.getField(false, "_mode_multiple_cells"),"MODE_MULTIPLE_LINES",_ref.getField(false, "_mode_multiple_lines"),"MODE_SINGLE_CELL_PERMANENT",_ref.getField(false, "_mode_single_cell_permanent"),"MODE_SINGLE_CELL_TEMP",_ref.getField(false, "_mode_single_cell_temp"),"MODE_SINGLE_LINE_PERMANENT",_ref.getField(false, "_mode_single_line_permanent"),"mTable",_ref.getField(false, "_mtable"),"SelectedLines",_ref.getField(false, "_selectedlines"),"SelectedTextColor",_ref.getField(false, "_selectedtextcolor"),"SelectionColor",_ref.getField(false, "_selectioncolor"),"SingleMode",_ref.getField(false, "_singlemode"),"xui",_ref.getField(false, "_xui")};
}
}