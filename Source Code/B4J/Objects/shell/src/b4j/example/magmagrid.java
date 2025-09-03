
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class magmagrid {
    public static RemoteObject myClass;
	public magmagrid() {
	}
    public static PCBA staticBA = new PCBA(null, magmagrid.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _useb4xtable = RemoteObject.declareNull("b4j.example.b4xtable");
public static RemoteObject _mylist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mycolumns = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _horizontalpraxislist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lists = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _ie = RemoteObject.declareNull("b4j.example.inlineediting");
public static RemoteObject _thistable = RemoteObject.declareNull("b4j.example.b4xtableselections");
public static RemoteObject _theindexcol = RemoteObject.createImmutable(0);
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _decimalseparator = RemoteObject.createImmutable("");
public static RemoteObject _prevcolumn = RemoteObject.declareNull("b4j.example.magmagrid._mycol");
public static RemoteObject _selectedcolumn = RemoteObject.declareNull("b4j.example.magmagrid._mycol");
public static RemoteObject _selectedrow = RemoteObject.createImmutable(0L);
public static RemoteObject _myroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mytextfield = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _mynumfield = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _mycombofield = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
public static RemoteObject _myprevcomboindex = RemoteObject.createImmutable(0);
public static RemoteObject _noedit = RemoteObject.createImmutable(false);
public static RemoteObject _xtra = RemoteObject.declareNull("b4j.example.b4xmagmafuncs");
public static RemoteObject _guidelinepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _isresizing = RemoteObject.createImmutable(false);
public static RemoteObject _removableguidelines = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _resizetimer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _previouscolumnwidths = null;
public static RemoteObject _allowcolumnresize = RemoteObject.createImmutable(false);
public static RemoteObject _cumulativedelta = RemoteObject.createImmutable(0);
public static RemoteObject _startcolumnwidth = RemoteObject.createImmutable(0);
public static RemoteObject _currentcolumn = RemoteObject.declareNull("b4j.example.b4xtable._b4xtablecolumn");
public static RemoteObject _currentpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"allowColumnResize",_ref.getField(false, "_allowcolumnresize"),"CSSUtils",_ref.getField(false, "_cssutils"),"cumulativeDelta",_ref.getField(false, "_cumulativedelta"),"currentColumn",_ref.getField(false, "_currentcolumn"),"currentPanel",_ref.getField(false, "_currentpanel"),"DateUtils",_ref.getField(false, "_dateutils"),"DecimalSeparator",_ref.getField(false, "_decimalseparator"),"fx",_ref.getField(false, "_fx"),"guidelinePanel",_ref.getField(false, "_guidelinepanel"),"HorizontalPraxisList",_ref.getField(false, "_horizontalpraxislist"),"ID",_ref.getField(false, "_id"),"ie",_ref.getField(false, "_ie"),"isResizing",_ref.getField(false, "_isresizing"),"Lists",_ref.getField(false, "_lists"),"MyColumns",_ref.getField(false, "_mycolumns"),"MyComboField",_ref.getField(false, "_mycombofield"),"MyList",_ref.getField(false, "_mylist"),"MyNumField",_ref.getField(false, "_mynumfield"),"MyPrevComboIndex",_ref.getField(false, "_myprevcomboindex"),"myroot",_ref.getField(false, "_myroot"),"MyTextField",_ref.getField(false, "_mytextfield"),"noEdit",_ref.getField(false, "_noedit"),"PrevColumn",_ref.getField(false, "_prevcolumn"),"previousColumnWidths",_ref.getField(false, "_previouscolumnwidths"),"removableGuidelines",_ref.getField(false, "_removableguidelines"),"resizeTimer",_ref.getField(false, "_resizetimer"),"SelectedColumn",_ref.getField(false, "_selectedcolumn"),"SelectedRow",_ref.getField(false, "_selectedrow"),"startColumnWidth",_ref.getField(false, "_startcolumnwidth"),"TheIndexCol",_ref.getField(false, "_theindexcol"),"thistable",_ref.getField(false, "_thistable"),"useB4XTable",_ref.getField(false, "_useb4xtable"),"xtra",_ref.getField(false, "_xtra"),"xui",_ref.getField(false, "_xui")};
}
}