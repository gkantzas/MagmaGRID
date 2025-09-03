
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class preferencesdialog {
    public static RemoteObject myClass;
	public preferencesdialog() {
	}
    public static PCBA staticBA = new PCBA(null, preferencesdialog.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _customlistview1 = RemoteObject.declareNull("b4j.example.customlistview");
public static RemoteObject _prefitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _type_boolean = RemoteObject.createImmutable(0);
public static RemoteObject _type_text = RemoteObject.createImmutable(0);
public static RemoteObject _type_date = RemoteObject.createImmutable(0);
public static RemoteObject _type_options = RemoteObject.createImmutable(0);
public static RemoteObject _type_color = RemoteObject.createImmutable(0);
public static RemoteObject _type_separator = RemoteObject.createImmutable(0);
public static RemoteObject _type_number = RemoteObject.createImmutable(0);
public static RemoteObject _type_password = RemoteObject.createImmutable(0);
public static RemoteObject _type_shortoptions = RemoteObject.createImmutable(0);
public static RemoteObject _type_decimalnumber = RemoteObject.createImmutable(0);
public static RemoteObject _type_multilinetext = RemoteObject.createImmutable(0);
public static RemoteObject _type_time = RemoteObject.createImmutable(0);
public static RemoteObject _type_numericrange = RemoteObject.createImmutable(0);
public static RemoteObject _type_explanation = RemoteObject.createImmutable(0);
public static RemoteObject _datetemplate = RemoteObject.declareNull("b4j.example.b4xdatetemplate");
public static RemoteObject _longtexttemplate = RemoteObject.declareNull("b4j.example.b4xlongtexttemplate");
public static RemoteObject _dialog = RemoteObject.declareNull("b4j.example.b4xdialog");
public static RemoteObject _result_showing_nested_dialog = RemoteObject.createImmutable(0);
public static RemoteObject _nesteddialogitemindex = RemoteObject.createImmutable(0);
public static RemoteObject _mtitle = RemoteObject.declareNull("Object");
public static RemoteObject _searchtemplate = RemoteObject.declareNull("b4j.example.b4xsearchtemplate");
public static RemoteObject _template = RemoteObject.declareNull("Object");
public static RemoteObject _colortemplate = RemoteObject.declareNull("b4j.example.b4xcolortemplate");
public static RemoteObject _b4xcombobox1 = RemoteObject.declareNull("b4j.example.b4xcombobox");
public static RemoteObject _theme_dark = RemoteObject.createImmutable(0);
public static RemoteObject _theme_light = RemoteObject.createImmutable(0);
public static RemoteObject _mtheme = RemoteObject.createImmutable(0);
public static RemoteObject _itemsbackgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _textcolor = RemoteObject.createImmutable(0);
public static RemoteObject _separatorbackgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _separatortextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _defaulthintfont = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
public static RemoteObject _defaulthintlargesize = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"B4XComboBox1",_ref.getField(false, "_b4xcombobox1"),"ColorTemplate",_ref.getField(false, "_colortemplate"),"CSSUtils",_ref.getField(false, "_cssutils"),"CustomListView1",_ref.getField(false, "_customlistview1"),"DateTemplate",_ref.getField(false, "_datetemplate"),"DateUtils",_ref.getField(false, "_dateutils"),"DefaultHintFont",_ref.getField(false, "_defaulthintfont"),"DefaultHintLargeSize",_ref.getField(false, "_defaulthintlargesize"),"Dialog",_ref.getField(false, "_dialog"),"ItemsBackgroundColor",_ref.getField(false, "_itemsbackgroundcolor"),"LongTextTemplate",_ref.getField(false, "_longtexttemplate"),"mBase",_ref.getField(false, "_mbase"),"mCallback",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"mTheme",_ref.getField(false, "_mtheme"),"mTitle",_ref.getField(false, "_mtitle"),"NestedDialogItemIndex",_ref.getField(false, "_nesteddialogitemindex"),"PrefItems",_ref.getField(false, "_prefitems"),"RESULT_SHOWING_NESTED_DIALOG",_ref.getField(false, "_result_showing_nested_dialog"),"SearchTemplate",_ref.getField(false, "_searchtemplate"),"SeparatorBackgroundColor",_ref.getField(false, "_separatorbackgroundcolor"),"SeparatorTextColor",_ref.getField(false, "_separatortextcolor"),"Template",_ref.getField(false, "_template"),"TextColor",_ref.getField(false, "_textcolor"),"THEME_DARK",_ref.getField(false, "_theme_dark"),"THEME_LIGHT",_ref.getField(false, "_theme_light"),"TYPE_BOOLEAN",_ref.getField(false, "_type_boolean"),"TYPE_COLOR",_ref.getField(false, "_type_color"),"TYPE_DATE",_ref.getField(false, "_type_date"),"TYPE_DECIMALNUMBER",_ref.getField(false, "_type_decimalnumber"),"TYPE_EXPLANATION",_ref.getField(false, "_type_explanation"),"TYPE_MULTILINETEXT",_ref.getField(false, "_type_multilinetext"),"TYPE_NUMBER",_ref.getField(false, "_type_number"),"TYPE_NUMERICRANGE",_ref.getField(false, "_type_numericrange"),"TYPE_OPTIONS",_ref.getField(false, "_type_options"),"TYPE_PASSWORD",_ref.getField(false, "_type_password"),"TYPE_SEPARATOR",_ref.getField(false, "_type_separator"),"TYPE_SHORTOPTIONS",_ref.getField(false, "_type_shortoptions"),"TYPE_TEXT",_ref.getField(false, "_type_text"),"TYPE_TIME",_ref.getField(false, "_type_time"),"xui",_ref.getField(false, "_xui")};
}
}