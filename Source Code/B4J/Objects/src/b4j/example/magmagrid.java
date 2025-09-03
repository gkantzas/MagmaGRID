package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class magmagrid extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.magmagrid", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.magmagrid.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _mycol{
public boolean IsInitialized;
public String Name;
public boolean Hidden;
public boolean Locked;
public boolean Sortable;
public int Width1;
public String Controltype;
public String Defaultvalue;
public anywheresoftware.b4a.objects.collections.List UseList;
public int MaxLength;
public double MinValue;
public double MaxValue;
public String Alignment;
public int MinIntegers;
public int MinFractions;
public int MaxFractions;
public boolean Grouping;
public void Initialize() {
IsInitialized = true;
Name = "";
Hidden = false;
Locked = false;
Sortable = false;
Width1 = 0;
Controltype = "";
Defaultvalue = "";
UseList = new anywheresoftware.b4a.objects.collections.List();
MaxLength = 0;
MinValue = 0;
MaxValue = 0;
Alignment = "";
MinIntegers = 0;
MinFractions = 0;
MaxFractions = 0;
Grouping = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4j.example.b4xtable _useb4xtable = null;
public anywheresoftware.b4a.objects.collections.List _mylist = null;
public anywheresoftware.b4a.objects.collections.List _mycolumns = null;
public anywheresoftware.b4a.objects.collections.List _horizontalpraxislist = null;
public anywheresoftware.b4a.objects.collections.List _lists = null;
public b4j.example.inlineediting _ie = null;
public b4j.example.b4xtableselections _thistable = null;
public int _theindexcol = 0;
public String _id = "";
public String _decimalseparator = "";
public b4j.example.magmagrid._mycol _prevcolumn = null;
public b4j.example.magmagrid._mycol _selectedcolumn = null;
public long _selectedrow = 0L;
public anywheresoftware.b4a.objects.B4XViewWrapper _myroot = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _mytextfield = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _mynumfield = null;
public anywheresoftware.b4j.objects.ComboBoxWrapper _mycombofield = null;
public int _myprevcomboindex = 0;
public boolean _noedit = false;
public b4j.example.b4xmagmafuncs _xtra = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _guidelinepanel = null;
public boolean _isresizing = false;
public anywheresoftware.b4a.objects.collections.List _removableguidelines = null;
public anywheresoftware.b4a.objects.Timer _resizetimer = null;
public int[] _previouscolumnwidths = null;
public boolean _allowcolumnresize = false;
public int _cumulativedelta = 0;
public int _startcolumnwidth = 0;
public b4j.example.b4xtable._b4xtablecolumn _currentcolumn = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _currentpanel = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4j.example.magmagrid __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub Initialize(parent As B4XView)";
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="parent.LoadLayout(\"magmagrid\")";
_parent.LoadLayout("magmagrid",ba);
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="xtra.Initialize";
__ref._xtra /*b4j.example.b4xmagmafuncs*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="MyList.Initialize";
__ref._mylist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="MyColumns.Initialize";
__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="HorizontalPraxisList.Initialize";
__ref._horizontalpraxislist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="SelectedColumn.Initialize";
__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Initialize();
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="PrevColumn.Initialize";
__ref._prevcolumn /*b4j.example.magmagrid._mycol*/ .Initialize();
RDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="Lists.Initialize";
__ref._lists /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=851985;
 //BA.debugLineNum = 851985;BA.debugLine="ie.Initialize(useB4XTable, Me, \"ie\")";
__ref._ie /*b4j.example.inlineediting*/ ._initialize /*String*/ (null,ba,__ref._useb4xtable /*b4j.example.b4xtable*/ ,this,"ie");
RDebugUtils.currentLine=851986;
 //BA.debugLineNum = 851986;BA.debugLine="thistable.Initialize(useB4XTable)";
__ref._thistable /*b4j.example.b4xtableselections*/ ._initialize /*String*/ (null,ba,__ref._useb4xtable /*b4j.example.b4xtable*/ );
RDebugUtils.currentLine=851987;
 //BA.debugLineNum = 851987;BA.debugLine="thistable.Mode = thistable.MODE_SINGLE_LINE_PERMA";
__ref._thistable /*b4j.example.b4xtableselections*/ ._setmode /*int*/ (null,__ref._thistable /*b4j.example.b4xtableselections*/ ._mode_single_line_permanent /*int*/ );
RDebugUtils.currentLine=851988;
 //BA.debugLineNum = 851988;BA.debugLine="thistable.SelectedTextColor = xui.Color_White";
__ref._thistable /*b4j.example.b4xtableselections*/ ._selectedtextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=851989;
 //BA.debugLineNum = 851989;BA.debugLine="thistable.SelectionColor = xui.Color_ARGB(255, 0,";
__ref._thistable /*b4j.example.b4xtableselections*/ ._selectioncolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (0),(int) (148),(int) (255));
RDebugUtils.currentLine=851990;
 //BA.debugLineNum = 851990;BA.debugLine="thistable.AutoRemoveInvisibleSelections = True";
__ref._thistable /*b4j.example.b4xtableselections*/ ._autoremoveinvisibleselections /*boolean*/  = __c.True;
RDebugUtils.currentLine=851992;
 //BA.debugLineNum = 851992;BA.debugLine="myroot=parent.Parent";
__ref._myroot /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent.getParent();
RDebugUtils.currentLine=851993;
 //BA.debugLineNum = 851993;BA.debugLine="MyTextField.Initialize(\"myTextField\")";
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .Initialize(ba,"myTextField");
RDebugUtils.currentLine=851994;
 //BA.debugLineNum = 851994;BA.debugLine="MyNumField.Initialize(\"MyNumField\")";
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .Initialize(ba,"MyNumField");
RDebugUtils.currentLine=851995;
 //BA.debugLineNum = 851995;BA.debugLine="MyComboField.Initialize(\"MyComboField\")";
__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .Initialize(ba,"MyComboField");
RDebugUtils.currentLine=851996;
 //BA.debugLineNum = 851996;BA.debugLine="myroot.AddView(MyTextField,0,0,100,10)";
__ref._myroot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()),0,0,100,10);
RDebugUtils.currentLine=851997;
 //BA.debugLineNum = 851997;BA.debugLine="myroot.AddView(MyNumField,0,0,100,10)";
__ref._myroot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()),0,0,100,10);
RDebugUtils.currentLine=851998;
 //BA.debugLineNum = 851998;BA.debugLine="myroot.AddView(MyComboField,0,0,100,10)";
__ref._myroot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getObject()),0,0,100,10);
RDebugUtils.currentLine=851999;
 //BA.debugLineNum = 851999;BA.debugLine="MyComboField.RemoveNodeFromParent";
__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .RemoveNodeFromParent();
RDebugUtils.currentLine=852000;
 //BA.debugLineNum = 852000;BA.debugLine="MyTextField.RemoveNodeFromParent";
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .RemoveNodeFromParent();
RDebugUtils.currentLine=852001;
 //BA.debugLineNum = 852001;BA.debugLine="MyNumField.RemoveNodeFromParent";
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .RemoveNodeFromParent();
RDebugUtils.currentLine=852003;
 //BA.debugLineNum = 852003;BA.debugLine="useB4XTable.RowHeight=50dip";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._rowheight /*int*/  = __c.DipToCurrent((int) (50));
RDebugUtils.currentLine=852005;
 //BA.debugLineNum = 852005;BA.debugLine="ie.TableResized";
__ref._ie /*b4j.example.inlineediting*/ ._tableresized /*String*/ (null);
RDebugUtils.currentLine=852007;
 //BA.debugLineNum = 852007;BA.debugLine="AddKeyPressedListener";
__ref._addkeypressedlistener /*String*/ (null);
RDebugUtils.currentLine=852010;
 //BA.debugLineNum = 852010;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=852011;
 //BA.debugLineNum = 852011;BA.debugLine="jo.RunMethod(\"RemoveWarning\", Null)";
_jo.RunMethod("RemoveWarning",(Object[])(__c.Null));
RDebugUtils.currentLine=852014;
 //BA.debugLineNum = 852014;BA.debugLine="End Sub";
return "";
}
public String  _addcolumn(b4j.example.magmagrid __ref,String _name,boolean _hidden,boolean _locked,boolean _sortable,int _width1,String _controltype,String _defaultvalue,anywheresoftware.b4a.objects.collections.List _uselist,int _maxlength,double _minvalue,double _maxvalue,String _alignment,int _minintegers,int _minfractions,int _maxfractions,boolean _grouping) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "addcolumn", false))
	 {return ((String) Debug.delegate(ba, "addcolumn", new Object[] {_name,_hidden,_locked,_sortable,_width1,_controltype,_defaultvalue,_uselist,_maxlength,_minvalue,_maxvalue,_alignment,_minintegers,_minfractions,_maxfractions,_grouping}));}
b4j.example.magmagrid._mycol _mycolumn = null;
b4j.example.b4xformatter _myb4xformat = null;
b4j.example.b4xtable._b4xtablecolumn _thiscolumn = null;
anywheresoftware.b4a.objects.collections.List _tmp = null;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub AddColumn(Name As String, Hidden As Boo";
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="Dim MyColumn As mycol";
_mycolumn = new b4j.example.magmagrid._mycol();
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="MyColumn.Initialize";
_mycolumn.Initialize();
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="MyColumn.Name=Name";
_mycolumn.Name /*String*/  = _name;
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="MyColumn.Hidden=Hidden";
_mycolumn.Hidden /*boolean*/  = _hidden;
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="MyColumn.Locked=Locked";
_mycolumn.Locked /*boolean*/  = _locked;
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="MyColumn.Sortable=Sortable";
_mycolumn.Sortable /*boolean*/  = _sortable;
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="MyColumn.Width1=Width1";
_mycolumn.Width1 /*int*/  = _width1;
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="MyColumn.Controltype=Controltype";
_mycolumn.Controltype /*String*/  = _controltype;
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="MyColumn.Defaultvalue=Defaultvalue";
_mycolumn.Defaultvalue /*String*/  = _defaultvalue;
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="MyColumn.UseList=UseList";
_mycolumn.UseList /*anywheresoftware.b4a.objects.collections.List*/  = _uselist;
RDebugUtils.currentLine=1310735;
 //BA.debugLineNum = 1310735;BA.debugLine="If Controltype.Trim.ToUpperCase.Contains(\"NUMERIC";
if (_controltype.trim().toUpperCase().contains("NUMERIC") && _maxlength==0) { 
RDebugUtils.currentLine=1310736;
 //BA.debugLineNum = 1310736;BA.debugLine="MaxLength=15";
_maxlength = (int) (15);
RDebugUtils.currentLine=1310737;
 //BA.debugLineNum = 1310737;BA.debugLine="MyColumn.MaxLength=MaxLength";
_mycolumn.MaxLength /*int*/  = _maxlength;
 };
RDebugUtils.currentLine=1310739;
 //BA.debugLineNum = 1310739;BA.debugLine="MyColumn.MaxLength=MaxLength";
_mycolumn.MaxLength /*int*/  = _maxlength;
RDebugUtils.currentLine=1310741;
 //BA.debugLineNum = 1310741;BA.debugLine="MyColumn.MinValue=MinValue";
_mycolumn.MinValue /*double*/  = _minvalue;
RDebugUtils.currentLine=1310742;
 //BA.debugLineNum = 1310742;BA.debugLine="MyColumn.MaxValue=MaxValue";
_mycolumn.MaxValue /*double*/  = _maxvalue;
RDebugUtils.currentLine=1310744;
 //BA.debugLineNum = 1310744;BA.debugLine="If MinIntegers=0 And MinFractions=0 And MaxFracti";
if (_minintegers==0 && _minfractions==0 && _maxfractions==0) { 
RDebugUtils.currentLine=1310745;
 //BA.debugLineNum = 1310745;BA.debugLine="MinIntegers=1";
_minintegers = (int) (1);
RDebugUtils.currentLine=1310746;
 //BA.debugLineNum = 1310746;BA.debugLine="MinFractions=0";
_minfractions = (int) (0);
RDebugUtils.currentLine=1310747;
 //BA.debugLineNum = 1310747;BA.debugLine="MaxFractions=5";
_maxfractions = (int) (5);
 };
RDebugUtils.currentLine=1310749;
 //BA.debugLineNum = 1310749;BA.debugLine="MyColumn.MinIntegers=MinIntegers";
_mycolumn.MinIntegers /*int*/  = _minintegers;
RDebugUtils.currentLine=1310750;
 //BA.debugLineNum = 1310750;BA.debugLine="MyColumn.MinFractions=MinFractions";
_mycolumn.MinFractions /*int*/  = _minfractions;
RDebugUtils.currentLine=1310751;
 //BA.debugLineNum = 1310751;BA.debugLine="MyColumn.MaxFractions=MaxFractions";
_mycolumn.MaxFractions /*int*/  = _maxfractions;
RDebugUtils.currentLine=1310753;
 //BA.debugLineNum = 1310753;BA.debugLine="MyColumn.Grouping=Grouping";
_mycolumn.Grouping /*boolean*/  = _grouping;
RDebugUtils.currentLine=1310756;
 //BA.debugLineNum = 1310756;BA.debugLine="Dim myb4xformat As B4XFormatter";
_myb4xformat = new b4j.example.b4xformatter();
RDebugUtils.currentLine=1310757;
 //BA.debugLineNum = 1310757;BA.debugLine="myb4xformat.Initialize";
_myb4xformat._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1310758;
 //BA.debugLineNum = 1310758;BA.debugLine="If Grouping=False Then";
if (_grouping==__c.False) { 
RDebugUtils.currentLine=1310759;
 //BA.debugLineNum = 1310759;BA.debugLine="myb4xformat.GetDefaultFormat.GroupingCharacter=\"";
_myb4xformat._getdefaultformat /*b4j.example.b4xformatter._b4xformatdata*/ (null).GroupingCharacter /*String*/  = "";
 }else {
RDebugUtils.currentLine=1310761;
 //BA.debugLineNum = 1310761;BA.debugLine="If DecimalSeparator=\".\" Then";
if ((__ref._decimalseparator /*String*/ ).equals(".")) { 
RDebugUtils.currentLine=1310762;
 //BA.debugLineNum = 1310762;BA.debugLine="myb4xformat.GetDefaultFormat.GroupingCharacter=";
_myb4xformat._getdefaultformat /*b4j.example.b4xformatter._b4xformatdata*/ (null).GroupingCharacter /*String*/  = ",";
 }else {
RDebugUtils.currentLine=1310764;
 //BA.debugLineNum = 1310764;BA.debugLine="myb4xformat.GetDefaultFormat.GroupingCharacter=";
_myb4xformat._getdefaultformat /*b4j.example.b4xformatter._b4xformatdata*/ (null).GroupingCharacter /*String*/  = ".";
 };
 };
RDebugUtils.currentLine=1310767;
 //BA.debugLineNum = 1310767;BA.debugLine="myb4xformat.GetDefaultFormat.MinimumIntegers=MinI";
_myb4xformat._getdefaultformat /*b4j.example.b4xformatter._b4xformatdata*/ (null).MinimumIntegers /*int*/  = _minintegers;
RDebugUtils.currentLine=1310768;
 //BA.debugLineNum = 1310768;BA.debugLine="myb4xformat.GetDefaultFormat.minimumFractions=Min";
_myb4xformat._getdefaultformat /*b4j.example.b4xformatter._b4xformatdata*/ (null).MinimumFractions /*int*/  = _minfractions;
RDebugUtils.currentLine=1310769;
 //BA.debugLineNum = 1310769;BA.debugLine="myb4xformat.GetDefaultFormat.MaximumFractions=Max";
_myb4xformat._getdefaultformat /*b4j.example.b4xformatter._b4xformatdata*/ (null).MaximumFractions /*int*/  = _maxfractions;
RDebugUtils.currentLine=1310772;
 //BA.debugLineNum = 1310772;BA.debugLine="MyColumn.Alignment=Alignment";
_mycolumn.Alignment /*String*/  = _alignment;
RDebugUtils.currentLine=1310774;
 //BA.debugLineNum = 1310774;BA.debugLine="MyColumns.Add(MyColumn)";
__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_mycolumn));
RDebugUtils.currentLine=1310776;
 //BA.debugLineNum = 1310776;BA.debugLine="Select Case Controltype";
switch (BA.switchObjectToInt(_controltype,"TEXTFIELD","TEXTAREA","COMBO","COMBO","COMBOEDIT","COMBOFIELD","COMBOEDITFIELD","PICTURE","CHECKBOX","CHECK","TEXTFIELD_NUMERIC","DATE","EDITCONTROLS")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: 
case 7: 
case 8: 
case 9: {
RDebugUtils.currentLine=1310778;
 //BA.debugLineNum = 1310778;BA.debugLine="useB4XTable.AddColumn(Name,useB4XTable.COLUMN_T";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,_name,__ref._useb4xtable /*b4j.example.b4xtable*/ ._column_type_text /*int*/ );
 break; }
case 10: {
RDebugUtils.currentLine=1310781;
 //BA.debugLineNum = 1310781;BA.debugLine="useB4XTable.AddColumn(Name,useB4XTable.COLUMN_T";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,_name,__ref._useb4xtable /*b4j.example.b4xtable*/ ._column_type_numbers /*int*/ );
 break; }
case 11: {
RDebugUtils.currentLine=1310784;
 //BA.debugLineNum = 1310784;BA.debugLine="useB4XTable.AddColumn(Name,useB4XTable.COLUMN_T";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,_name,__ref._useb4xtable /*b4j.example.b4xtable*/ ._column_type_date /*int*/ );
 break; }
case 12: {
RDebugUtils.currentLine=1310787;
 //BA.debugLineNum = 1310787;BA.debugLine="useB4XTable.AddColumn(Name,useB4XTable.COLUMN_T";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,_name,__ref._useb4xtable /*b4j.example.b4xtable*/ ._column_type_void /*int*/ );
 break; }
}
;
RDebugUtils.currentLine=1310792;
 //BA.debugLineNum = 1310792;BA.debugLine="Dim thisColumn As B4XTableColumn=useB4XTable.Get";
_thiscolumn = __ref._useb4xtable /*b4j.example.b4xtable*/ ._getcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,_name);
RDebugUtils.currentLine=1310793;
 //BA.debugLineNum = 1310793;BA.debugLine="thisColumn.Sortable=Sortable";
_thiscolumn.Sortable /*boolean*/  = _sortable;
RDebugUtils.currentLine=1310796;
 //BA.debugLineNum = 1310796;BA.debugLine="If Controltype.Contains(\"NUMERIC\") Then thisColu";
if (_controltype.contains("NUMERIC")) { 
_thiscolumn.Formatter /*b4j.example.b4xformatter*/  = _myb4xformat;};
RDebugUtils.currentLine=1310797;
 //BA.debugLineNum = 1310797;BA.debugLine="If Hidden=False Then";
if (_hidden==__c.False) { 
RDebugUtils.currentLine=1310798;
 //BA.debugLineNum = 1310798;BA.debugLine="thisColumn.Width=Width1";
_thiscolumn.Width /*int*/  = _width1;
 }else {
RDebugUtils.currentLine=1310800;
 //BA.debugLineNum = 1310800;BA.debugLine="thisColumn.Width=1";
_thiscolumn.Width /*int*/  = (int) (1);
 };
RDebugUtils.currentLine=1310804;
 //BA.debugLineNum = 1310804;BA.debugLine="If Alignment.trim=\"\" Then";
if ((_alignment.trim()).equals("")) { 
RDebugUtils.currentLine=1310805;
 //BA.debugLineNum = 1310805;BA.debugLine="Select Case Controltype";
switch (BA.switchObjectToInt(_controltype,"TEXTFIELD","TEXTAREA","COMBO","COMBO","COMBOEDIT","COMBOFIELD","COMBOEDITFIELD","PICTURE","CHECKBOX","CHECK","EDITCONTROLS","DATE")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: 
case 7: 
case 8: 
case 9: {
RDebugUtils.currentLine=1310808;
 //BA.debugLineNum = 1310808;BA.debugLine="If Controltype=\"TEXTFIELD_NUMERIC\" Then";
if ((_controltype).equals("TEXTFIELD_NUMERIC")) { 
RDebugUtils.currentLine=1310809;
 //BA.debugLineNum = 1310809;BA.debugLine="SetColumnAlignment(useB4XTable,Name,\"LEFT\")";
__ref._setcolumnalignment /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ,_name,"LEFT");
 }else {
RDebugUtils.currentLine=1310811;
 //BA.debugLineNum = 1310811;BA.debugLine="SetColumnAlignment(useB4XTable,Name,\"RIGHT\")";
__ref._setcolumnalignment /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ,_name,"RIGHT");
 };
 break; }
case 10: {
RDebugUtils.currentLine=1310815;
 //BA.debugLineNum = 1310815;BA.debugLine="SetColumnAlignment(useB4XTable,Name,\"CENTER\")";
__ref._setcolumnalignment /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ,_name,"CENTER");
 break; }
case 11: {
RDebugUtils.currentLine=1310818;
 //BA.debugLineNum = 1310818;BA.debugLine="SetColumnAlignment(useB4XTable,Name,\"CENTER\")";
__ref._setcolumnalignment /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ,_name,"CENTER");
 break; }
}
;
 }else {
RDebugUtils.currentLine=1310821;
 //BA.debugLineNum = 1310821;BA.debugLine="SetColumnAlignment(useB4XTable,Name,Alignment)";
__ref._setcolumnalignment /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ,_name,_alignment);
 };
RDebugUtils.currentLine=1310825;
 //BA.debugLineNum = 1310825;BA.debugLine="If UseList = Null Or UseList.IsInitialized = Fals";
if (_uselist== null || _uselist.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=1310826;
 //BA.debugLineNum = 1310826;BA.debugLine="Dim tmp As List";
_tmp = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1310827;
 //BA.debugLineNum = 1310827;BA.debugLine="tmp.Initialize";
_tmp.Initialize();
RDebugUtils.currentLine=1310828;
 //BA.debugLineNum = 1310828;BA.debugLine="UseList = tmp";
_uselist = _tmp;
 };
RDebugUtils.currentLine=1310830;
 //BA.debugLineNum = 1310830;BA.debugLine="Lists.add(UseList)";
__ref._lists /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_uselist.getObject()));
RDebugUtils.currentLine=1310833;
 //BA.debugLineNum = 1310833;BA.debugLine="End Sub";
return "";
}
public String  _addhorizontalpraxis(b4j.example.magmagrid __ref,String _apraxis) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "addhorizontalpraxis", false))
	 {return ((String) Debug.delegate(ba, "addhorizontalpraxis", new Object[] {_apraxis}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="public Sub AddHorizontalPraxis(apraxis As String)";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="HorizontalPraxisList.Add(apraxis)";
__ref._horizontalpraxislist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_apraxis));
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return "";
}
public String  _alignallcols(b4j.example.magmagrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "alignallcols", false))
	 {return ((String) Debug.delegate(ba, "alignallcols", null));}
int _k = 0;
b4j.example.magmagrid._mycol _myc = null;
String _alignment = "";
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub AlignAllCols";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="useB4XTable.MaximumRowsPerPage = 20";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._maximumrowsperpage /*int*/  = (int) (20);
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="useB4XTable.BuildLayoutsCache(useB4XTable.Maximum";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._buildlayoutscache /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ._maximumrowsperpage /*int*/ );
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="If xui.IsB4J Then useB4XTable.HighlightSearchResu";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
__ref._useb4xtable /*b4j.example.b4xtable*/ ._highlightsearchresults /*boolean*/  = __c.False;};
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="For k=0 To MyColumns.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_k = (int) (0) ;
for (;_k <= limit4 ;_k = _k + step4 ) {
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="Dim myc As mycol=MyColumns.Get(k)";
_myc = (b4j.example.magmagrid._mycol)(__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k));
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="Dim alignment As String=myc.Alignment";
_alignment = _myc.Alignment /*String*/ ;
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="If alignment.trim=\"\" Then";
if ((_alignment.trim()).equals("")) { 
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="Select Case myc.Controltype";
switch (BA.switchObjectToInt(_myc.Controltype /*String*/ ,"TEXTFIELD","TEXTAREA","COMBO","COMBO","COMBOEDIT","COMBOFIELD","COMBOEDITFIELD","PICTURE","EDITCONTROLS","DATE")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: 
case 7: {
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="If myc.Controltype=\"TEXTFIELD_NUMERIC\" Then";
if ((_myc.Controltype /*String*/ ).equals("TEXTFIELD_NUMERIC")) { 
RDebugUtils.currentLine=1507343;
 //BA.debugLineNum = 1507343;BA.debugLine="SetColumnAlignment(useB4XTable,myc.Name,\"LEF";
__ref._setcolumnalignment /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ,_myc.Name /*String*/ ,"LEFT");
 }else {
RDebugUtils.currentLine=1507345;
 //BA.debugLineNum = 1507345;BA.debugLine="SetColumnAlignment(useB4XTable,myc.Name,\"RIG";
__ref._setcolumnalignment /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ,_myc.Name /*String*/ ,"RIGHT");
 };
 break; }
case 8: {
RDebugUtils.currentLine=1507349;
 //BA.debugLineNum = 1507349;BA.debugLine="SetColumnAlignment(useB4XTable,myc.Name,\"CENT";
__ref._setcolumnalignment /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ,_myc.Name /*String*/ ,"CENTER");
 break; }
case 9: {
RDebugUtils.currentLine=1507352;
 //BA.debugLineNum = 1507352;BA.debugLine="SetColumnAlignment(useB4XTable,myc.Name,\"CENT";
__ref._setcolumnalignment /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ,_myc.Name /*String*/ ,"CENTER");
 break; }
}
;
 }else {
RDebugUtils.currentLine=1507355;
 //BA.debugLineNum = 1507355;BA.debugLine="SetColumnAlignment(useB4XTable,myc.Name,alignme";
__ref._setcolumnalignment /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ,_myc.Name /*String*/ ,_alignment);
 };
 }
};
RDebugUtils.currentLine=1507360;
 //BA.debugLineNum = 1507360;BA.debugLine="useB4XTable.Refresh";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._refresh /*String*/ (null);
RDebugUtils.currentLine=1507363;
 //BA.debugLineNum = 1507363;BA.debugLine="End Sub";
return "";
}
public void  _setdata(b4j.example.magmagrid __ref,anywheresoftware.b4a.objects.collections.List _mylist1) throws Exception{
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "setdata", false))
	 {Debug.delegate(ba, "setdata", new Object[] {_mylist1}); return;}
ResumableSub_SetData rsub = new ResumableSub_SetData(this,__ref,_mylist1);
rsub.resume(ba, null);
}
public static class ResumableSub_SetData extends BA.ResumableSub {
public ResumableSub_SetData(b4j.example.magmagrid parent,b4j.example.magmagrid __ref,anywheresoftware.b4a.objects.collections.List _mylist1) {
this.parent = parent;
this.__ref = __ref;
this._mylist1 = _mylist1;
this.__ref = parent;
}
b4j.example.magmagrid __ref;
b4j.example.magmagrid parent;
anywheresoftware.b4a.objects.collections.List _mylist1;
boolean _unused = false;
int _colindex = 0;
b4j.example.b4xtable._b4xtablecolumn _tablecol = null;
int step7;
int limit7;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="magmagrid";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="wait for (useB4XTable.SetData(mylist1)) complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "setdata"), __ref._useb4xtable /*b4j.example.b4xtable*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_mylist1));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="MyList=mylist1";
__ref._mylist /*anywheresoftware.b4a.objects.collections.List*/  = _mylist1;
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="CalcAll";
__ref._calcall /*String*/ (null);
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "setdata"),(int) (0));
this.state = 12;
return;
case 12:
//C
this.state = 1;
;
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="Dim previousColumnWidths(useB4XTable.Columns.Size";
parent._previouscolumnwidths = new int[__ref._useb4xtable /*b4j.example.b4xtable*/ ._columns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
;
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="removableGuidelines.Initialize";
__ref._removableguidelines /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="For colIndex = 0 To useB4XTable.visibleColumns.Si";
if (true) break;

case 1:
//for
this.state = 4;
step7 = 1;
limit7 = (int) (__ref._useb4xtable /*b4j.example.b4xtable*/ ._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_colindex = (int) (0) ;
this.state = 13;
if (true) break;

case 13:
//C
this.state = 4;
if ((step7 > 0 && _colindex <= limit7) || (step7 < 0 && _colindex >= limit7)) this.state = 3;
if (true) break;

case 14:
//C
this.state = 13;
_colindex = ((int)(0 + _colindex + step7)) ;
if (true) break;

case 3:
//C
this.state = 14;
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="Dim tableCol As B4XTableColumn = useB4XTable.vis";
_tablecol = (b4j.example.b4xtable._b4xtablecolumn)(__ref._useb4xtable /*b4j.example.b4xtable*/ ._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_colindex));
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="previousColumnWidths(colIndex) = tableCol.Width";
__ref._previouscolumnwidths /*int[]*/ [_colindex] = _tablecol.Width /*int*/ ;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="If allowColumnResize = True Then";

case 4:
//if
this.state = 7;
if (__ref._allowcolumnresize /*boolean*/ ==parent.__c.True) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="resizeTimer.Initialize(\"ResizeTimer\", 100)";
__ref._resizetimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"ResizeTimer",(long) (100));
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="resizeTimer.Enabled = True";
__ref._resizetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.True);
 if (true) break;
;
RDebugUtils.currentLine=1048595;
 //BA.debugLineNum = 1048595;BA.debugLine="If guidelinePanel.IsInitialized Then";

case 7:
//if
this.state = 10;
if (__ref._guidelinepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=1048596;
 //BA.debugLineNum = 1048596;BA.debugLine="EnableResizeGuidelines";
__ref._enableresizeguidelines /*String*/ (null);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public double  _sumrows(b4j.example.magmagrid __ref,String _columnid,String _sqlstring) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "sumrows", false))
	 {return ((Double) Debug.delegate(ba, "sumrows", new Object[] {_columnid,_sqlstring}));}
b4j.example.b4xtable._b4xtablecolumn _c = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
int _k = 0;
b4j.example.magmagrid._mycol _myc = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="public Sub SumRows(ColumnID As String, sqlstring A";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="If sqlstring.Trim.Length=0 Then";
if (_sqlstring.trim().length()==0) { 
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="Dim c As B4XTableColumn = useB4XTable.GetColumn(";
_c = __ref._useb4xtable /*b4j.example.b4xtable*/ ._getcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,_columnid);
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="Dim rs As ResultSet=useB4XTable.sql1.ExecQuery(\"";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._useb4xtable /*b4j.example.b4xtable*/ ._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT SUM("+_c.SQLID /*String*/ .trim()+") AS Total_sum FROM data;");
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="Return rs.GetDouble2(0)";
if (true) return _rs.GetDouble2((int) (0));
 }else {
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="For k=0 To MyColumns.Size-1";
{
final int step8 = 1;
final int limit8 = (int) (__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_k = (int) (0) ;
for (;_k <= limit8 ;_k = _k + step8 ) {
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="Private myc As mycol=MyColumns.Get(k)";
_myc = (b4j.example.magmagrid._mycol)(__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k));
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="Dim c As B4XTableColumn = useB4XTable.GetColumn";
_c = __ref._useb4xtable /*b4j.example.b4xtable*/ ._getcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,_myc.Name /*String*/ );
RDebugUtils.currentLine=2883598;
 //BA.debugLineNum = 2883598;BA.debugLine="sqlstring=sqlstring.Replace(\"[\" & myc.Name & \"]";
_sqlstring = _sqlstring.replace("["+_myc.Name /*String*/ +"]",_c.SQLID /*String*/ );
 }
};
RDebugUtils.currentLine=2883600;
 //BA.debugLineNum = 2883600;BA.debugLine="Dim rs As ResultSet=useB4XTable.sql1.ExecQuery(s";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._useb4xtable /*b4j.example.b4xtable*/ ._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(_sqlstring);
RDebugUtils.currentLine=2883601;
 //BA.debugLineNum = 2883601;BA.debugLine="Return rs.GetDouble2(0)";
if (true) return _rs.GetDouble2((int) (0));
 };
RDebugUtils.currentLine=2883604;
 //BA.debugLineNum = 2883604;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getdata(b4j.example.magmagrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "getdata", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getdata", null));}
anywheresoftware.b4a.objects.collections.List _list1 = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
int _colcount = 0;
Object[] _rowarray = null;
int _i = 0;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="public Sub GetData As List";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Dim list1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="list1.Initialize";
_list1.Initialize();
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="Dim rs As ResultSet = useB4XTable.SQL1.ExecQuery(";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._useb4xtable /*b4j.example.b4xtable*/ ._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT * FROM data");
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="Dim colCount As Int = rs.ColumnCount";
_colcount = _rs.getColumnCount();
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="Dim rowArray(colCount) As Object";
_rowarray = new Object[_colcount];
{
int d0 = _rowarray.length;
for (int i0 = 0;i0 < d0;i0++) {
_rowarray[i0] = new Object();
}
}
;
RDebugUtils.currentLine=2949131;
 //BA.debugLineNum = 2949131;BA.debugLine="For i = 0 To colCount - 1";
{
final int step7 = 1;
final int limit7 = (int) (_colcount-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=2949132;
 //BA.debugLineNum = 2949132;BA.debugLine="rowArray(i) = rs.GetString2(i)";
_rowarray[_i] = (Object)(_rs.GetString2(_i));
 }
};
RDebugUtils.currentLine=2949135;
 //BA.debugLineNum = 2949135;BA.debugLine="list1.Add(rowArray)";
_list1.Add((Object)(_rowarray));
 }
;
RDebugUtils.currentLine=2949138;
 //BA.debugLineNum = 2949138;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=2949140;
 //BA.debugLineNum = 2949140;BA.debugLine="Return list1";
if (true) return _list1;
RDebugUtils.currentLine=2949142;
 //BA.debugLineNum = 2949142;BA.debugLine="End Sub";
return null;
}
public String  _calcall(b4j.example.magmagrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "calcall", false))
	 {return ((String) Debug.delegate(ba, "calcall", null));}
long _prevsel = 0L;
int _k = 0;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub CalcAll";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Dim prevsel As Long=SelectedRow";
_prevsel = __ref._selectedrow /*long*/ ;
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="For k=1 To MyList.Size";
{
final int step2 = 1;
final int limit2 = __ref._mylist /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
_k = (int) (1) ;
for (;_k <= limit2 ;_k = _k + step2 ) {
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="SelectedRow=k";
__ref._selectedrow /*long*/  = (long) (_k);
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="RowCalcPraxis";
__ref._rowcalcpraxis /*String*/ (null);
 }
};
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="SelectedRow=prevsel";
__ref._selectedrow /*long*/  = _prevsel;
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="End Sub";
return "";
}
public String  _setcolumnalignment(b4j.example.magmagrid __ref,b4j.example.b4xtable _tablename,String _columnid,String _alignment) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "setcolumnalignment", false))
	 {return ((String) Debug.delegate(ba, "setcolumnalignment", new Object[] {_tablename,_columnid,_alignment}));}
b4j.example.b4xtable._b4xtablecolumn _column = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="private Sub SetColumnAlignment(tableName As B4XTab";
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Dim column As B4XTableColumn = tableName.GetColum";
_column = _tablename._getcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,_columnid);
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="For i = 1 To column.CellsLayouts.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_column.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (1) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Dim pnl As B4XView = column.CellsLayouts.Get(i)";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_column.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="pnl.GetView(0).SetTextAlignment(\"CENTER\", alignm";
_pnl.GetView((int) (0)).SetTextAlignment("CENTER",_alignment.toUpperCase());
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="Dim lbl As Label = pnl.GetView(0)";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_pnl.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="lbl.Style=\"-fx-padding: 5;\"";
_lbl.setStyle("-fx-padding: 5;");
 }
};
RDebugUtils.currentLine=1638415;
 //BA.debugLineNum = 1638415;BA.debugLine="End Sub";
return "";
}
public String  _addkeypressedlistener(b4j.example.magmagrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "addkeypressedlistener", false))
	 {return ((String) Debug.delegate(ba, "addkeypressedlistener", null));}
anywheresoftware.b4j.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub AddKeyPressedListener";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="r.Target = myroot'B4XPages.GetNativeParent(Root)";
_r.Target = (Object)(__ref._myroot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject());
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="r.AddEventFilter(\"keypressed\", \"javafx.scene.inpu";
_r.AddEventFilter(ba,"keypressed","javafx.scene.input.KeyEvent.ANY");
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="End Sub";
return "";
}
public String  _b4xtable1_dataupdated(b4j.example.magmagrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "b4xtable1_dataupdated", false))
	 {return ((String) Debug.delegate(ba, "b4xtable1_dataupdated", null));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Private Sub B4XTable1_DataUpdated";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return "";
}
public String  _rowcalcpraxis(b4j.example.magmagrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "rowcalcpraxis", false))
	 {return ((String) Debug.delegate(ba, "rowcalcpraxis", null));}
String[] _headervalues = null;
int _k = 0;
b4j.example.magmagrid._mycol _myc = null;
anywheresoftware.b4a.objects.collections.Map _mapvalues = null;
String _myinput = "";
String[] _parts = null;
String _tocolumn = "";
String _apraxis = "";
int _c = 0;
b4j.example.b4xeval _eeval = null;
double _ddtotal = 0;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="public Sub RowCalcPraxis";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Private HeaderValues(MyColumns.Size) As String";
_headervalues = new String[__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
java.util.Arrays.fill(_headervalues,"");
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="For k=0 To MyColumns.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_k = (int) (0) ;
for (;_k <= limit2 ;_k = _k + step2 ) {
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Private myc As mycol=MyColumns.Get(k)";
_myc = (b4j.example.magmagrid._mycol)(__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k));
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="HeaderValues(k)= myc.Name";
_headervalues[_k] = _myc.Name /*String*/ ;
 }
};
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="For k=0 To HorizontalPraxisList.Size-1";
{
final int step6 = 1;
final int limit6 = (int) (__ref._horizontalpraxislist /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_k = (int) (0) ;
for (;_k <= limit6 ;_k = _k + step6 ) {
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="Private MapValues As Map = useB4XTable.GetRow(Se";
_mapvalues = new anywheresoftware.b4a.objects.collections.Map();
_mapvalues = __ref._useb4xtable /*b4j.example.b4xtable*/ ._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._selectedrow /*long*/ );
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="Dim myinput As String=HorizontalPraxisList.Get(k";
_myinput = BA.ObjectToString(__ref._horizontalpraxislist /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k));
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="Dim parts() As String = Regex.Split(\"=\", myinput";
_parts = __c.Regex.Split("=",_myinput);
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="Dim tocolumn As String=parts(0).Replace(\"[\",\"\").";
_tocolumn = _parts[(int) (0)].replace("[","").replace("]","");
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="Dim apraxis As String=parts(1)";
_apraxis = _parts[(int) (1)];
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="For c=0 To HeaderValues.Length-1";
{
final int step12 = 1;
final int limit12 = (int) (_headervalues.length-1);
_c = (int) (0) ;
for (;_c <= limit12 ;_c = _c + step12 ) {
RDebugUtils.currentLine=1245199;
 //BA.debugLineNum = 1245199;BA.debugLine="apraxis = apraxis.Replace(\"[\" & HeaderValues(c)";
_apraxis = _apraxis.replace("["+_headervalues[_c]+"]",BA.ObjectToString(_mapvalues.GetValueAt(_c)));
 }
};
RDebugUtils.currentLine=1245201;
 //BA.debugLineNum = 1245201;BA.debugLine="Dim eeval As B4XEval";
_eeval = new b4j.example.b4xeval();
RDebugUtils.currentLine=1245202;
 //BA.debugLineNum = 1245202;BA.debugLine="eeval.Initialize(Me, \"Eval\")";
_eeval._initialize /*String*/ (null,ba,this,"Eval");
RDebugUtils.currentLine=1245203;
 //BA.debugLineNum = 1245203;BA.debugLine="Dim DDtotal As Double=eeval.Eval(apraxis)";
_ddtotal = _eeval._eval /*double*/ (null,_apraxis);
RDebugUtils.currentLine=1245204;
 //BA.debugLineNum = 1245204;BA.debugLine="SetValue(SelectedRow, tocolumn, DDtotal)";
__ref._setvalue /*String*/ (null,__ref._selectedrow /*long*/ ,_tocolumn,(Object)(_ddtotal));
 }
};
RDebugUtils.currentLine=1245207;
 //BA.debugLineNum = 1245207;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.magmagrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Public useB4XTable As B4XTable";
_useb4xtable = new b4j.example.b4xtable();
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Type mycol(Name As String, Hidden As Boolean, Loc";
;
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="Public MyList As List";
_mylist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="Public MyColumns As List";
_mycolumns = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="Public HorizontalPraxisList As List";
_horizontalpraxislist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="Private Lists As List";
_lists = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="Private ie As InlineEditing";
_ie = new b4j.example.inlineediting();
RDebugUtils.currentLine=786446;
 //BA.debugLineNum = 786446;BA.debugLine="Private thistable As B4XTableSelections";
_thistable = new b4j.example.b4xtableselections();
RDebugUtils.currentLine=786448;
 //BA.debugLineNum = 786448;BA.debugLine="Private TheIndexCol As Int = 0	'Where is the valu";
_theindexcol = (int) (0);
RDebugUtils.currentLine=786449;
 //BA.debugLineNum = 786449;BA.debugLine="Private ID As String";
_id = "";
RDebugUtils.currentLine=786451;
 //BA.debugLineNum = 786451;BA.debugLine="Private DecimalSeparator As String = \".\"";
_decimalseparator = ".";
RDebugUtils.currentLine=786453;
 //BA.debugLineNum = 786453;BA.debugLine="Private PrevColumn As mycol";
_prevcolumn = new b4j.example.magmagrid._mycol();
RDebugUtils.currentLine=786454;
 //BA.debugLineNum = 786454;BA.debugLine="Private SelectedColumn As mycol";
_selectedcolumn = new b4j.example.magmagrid._mycol();
RDebugUtils.currentLine=786455;
 //BA.debugLineNum = 786455;BA.debugLine="Private SelectedRow As Long";
_selectedrow = 0L;
RDebugUtils.currentLine=786457;
 //BA.debugLineNum = 786457;BA.debugLine="Private myroot As B4XView";
_myroot = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786460;
 //BA.debugLineNum = 786460;BA.debugLine="Private MyTextField As TextField";
_mytextfield = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=786461;
 //BA.debugLineNum = 786461;BA.debugLine="Private MyNumField As TextField";
_mynumfield = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=786462;
 //BA.debugLineNum = 786462;BA.debugLine="Private MyComboField As ComboBox";
_mycombofield = new anywheresoftware.b4j.objects.ComboBoxWrapper();
RDebugUtils.currentLine=786463;
 //BA.debugLineNum = 786463;BA.debugLine="Private MyPrevComboIndex As Int = -1";
_myprevcomboindex = (int) (-1);
RDebugUtils.currentLine=786464;
 //BA.debugLineNum = 786464;BA.debugLine="Private noEdit As Boolean = False";
_noedit = __c.False;
RDebugUtils.currentLine=786466;
 //BA.debugLineNum = 786466;BA.debugLine="Private xtra As B4XMagmaFuncs";
_xtra = new b4j.example.b4xmagmafuncs();
RDebugUtils.currentLine=786470;
 //BA.debugLineNum = 786470;BA.debugLine="Private guidelinePanel As B4XView           ' Tem";
_guidelinepanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786471;
 //BA.debugLineNum = 786471;BA.debugLine="Private isResizing As Boolean = False       ' Tra";
_isresizing = __c.False;
RDebugUtils.currentLine=786472;
 //BA.debugLineNum = 786472;BA.debugLine="Private removableGuidelines As List         ' Lis";
_removableguidelines = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=786473;
 //BA.debugLineNum = 786473;BA.debugLine="Private resizeTimer As Timer                ' Tim";
_resizetimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=786474;
 //BA.debugLineNum = 786474;BA.debugLine="Private previousColumnWidths() As Int       ' Col";
_previouscolumnwidths = new int[(int) (0)];
;
RDebugUtils.currentLine=786475;
 //BA.debugLineNum = 786475;BA.debugLine="Public allowColumnResize As Boolean=True";
_allowcolumnresize = __c.True;
RDebugUtils.currentLine=786476;
 //BA.debugLineNum = 786476;BA.debugLine="Private cumulativeDelta As Int";
_cumulativedelta = 0;
RDebugUtils.currentLine=786477;
 //BA.debugLineNum = 786477;BA.debugLine="Private startColumnWidth As Int";
_startcolumnwidth = 0;
RDebugUtils.currentLine=786478;
 //BA.debugLineNum = 786478;BA.debugLine="Private currentColumn As B4XTableColumn";
_currentcolumn = new b4j.example.b4xtable._b4xtablecolumn();
RDebugUtils.currentLine=786479;
 //BA.debugLineNum = 786479;BA.debugLine="Private currentPanel As B4XView";
_currentpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=786483;
 //BA.debugLineNum = 786483;BA.debugLine="End Sub";
return "";
}
public String  _enableresizeguidelines(b4j.example.magmagrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "enableresizeguidelines", false))
	 {return ((String) Debug.delegate(ba, "enableresizeguidelines", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
b4j.example.customlistview _clv = null;
int _scrollx = 0;
int _basex = 0;
int _colx = 0;
int _col = 0;
b4j.example.b4xtable._b4xtablecolumn _tablecol = null;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub EnableResizeGuidelines";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="If isResizing = False Then";
if (__ref._isresizing /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="resizeTimer.Enabled = False";
__ref._resizetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="isResizing = True";
__ref._isresizing /*boolean*/  = __c.True;
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="If removableGuidelines.IsInitialized Then";
if (__ref._removableguidelines /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="For Each pnl As B4XView In removableGuidelines";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._removableguidelines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_pnl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group5.Get(index5)));
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="pnl.RemoveViewFromParent";
_pnl.RemoveViewFromParent();
 }
};
 };
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="Dim clv As CustomListView = useB4XTable.clvData";
_clv = __ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=3080204;
 //BA.debugLineNum = 3080204;BA.debugLine="Dim scrollX As Int = clv.sv.ScrollViewOffsetX";
_scrollx = (int) (_clv._sv.getScrollViewOffsetX());
RDebugUtils.currentLine=3080205;
 //BA.debugLineNum = 3080205;BA.debugLine="Dim baseX As Int = useB4XTable.mBase.Left + clv.";
_basex = (int) (__ref._useb4xtable /*b4j.example.b4xtable*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+_clv._getbase().getLeft()-_scrollx+__ref._useb4xtable /*b4j.example.b4xtable*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().getLeft());
RDebugUtils.currentLine=3080207;
 //BA.debugLineNum = 3080207;BA.debugLine="removableGuidelines.Clear";
__ref._removableguidelines /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=3080208;
 //BA.debugLineNum = 3080208;BA.debugLine="Dim colX As Int = baseX";
_colx = _basex;
RDebugUtils.currentLine=3080209;
 //BA.debugLineNum = 3080209;BA.debugLine="For col = 0 To useB4XTable.visibleColumns.Size -";
{
final int step14 = 1;
final int limit14 = (int) (__ref._useb4xtable /*b4j.example.b4xtable*/ ._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_col = (int) (0) ;
for (;_col <= limit14 ;_col = _col + step14 ) {
RDebugUtils.currentLine=3080210;
 //BA.debugLineNum = 3080210;BA.debugLine="Dim tableCol As B4XTableColumn = useB4XTable.vi";
_tablecol = (b4j.example.b4xtable._b4xtablecolumn)(__ref._useb4xtable /*b4j.example.b4xtable*/ ._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_col));
RDebugUtils.currentLine=3080211;
 //BA.debugLineNum = 3080211;BA.debugLine="colX = colX + tableCol.Width";
_colx = (int) (_colx+_tablecol.Width /*int*/ );
RDebugUtils.currentLine=3080213;
 //BA.debugLineNum = 3080213;BA.debugLine="Dim guidelinePanel As B4XView = xui.CreatePanel";
_guidelinepanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_guidelinepanel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"GuidelinePanel");
RDebugUtils.currentLine=3080214;
 //BA.debugLineNum = 3080214;BA.debugLine="guidelinePanel.Tag = col";
__ref._guidelinepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)(_col));
RDebugUtils.currentLine=3080215;
 //BA.debugLineNum = 3080215;BA.debugLine="guidelinePanel.SetColorAndBorder(xui.Color_Tran";
__ref._guidelinepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,2,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0);
RDebugUtils.currentLine=3080217;
 //BA.debugLineNum = 3080217;BA.debugLine="myroot.AddView(guidelinePanel, colX - 1, useB4";
__ref._myroot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._guidelinepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),_colx-1,__ref._useb4xtable /*b4j.example.b4xtable*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()+_clv._getbase().getTop()+__ref._useb4xtable /*b4j.example.b4xtable*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().getTop()+1,2,_clv._sv.getScrollViewContentHeight());
RDebugUtils.currentLine=3080219;
 //BA.debugLineNum = 3080219;BA.debugLine="removableGuidelines.Add(guidelinePanel)";
__ref._removableguidelines /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._guidelinepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
 }
};
RDebugUtils.currentLine=3080222;
 //BA.debugLineNum = 3080222;BA.debugLine="isResizing = False";
__ref._isresizing /*boolean*/  = __c.False;
RDebugUtils.currentLine=3080223;
 //BA.debugLineNum = 3080223;BA.debugLine="resizeTimer.Enabled = True";
__ref._resizetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=3080225;
 //BA.debugLineNum = 3080225;BA.debugLine="End Sub";
return "";
}
public String  _firstcolforedit(b4j.example.magmagrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "firstcolforedit", false))
	 {return ((String) Debug.delegate(ba, "firstcolforedit", null));}
String _foredit = "";
int _k = 0;
b4j.example.magmagrid._mycol _myc = null;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Private Sub FirstColforEdit As String";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Dim foredit As String";
_foredit = "";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="For k=0 To MyColumns.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_k = (int) (0) ;
for (;_k <= limit2 ;_k = _k + step2 ) {
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="Dim myc As mycol=MyColumns.Get(k)";
_myc = (b4j.example.magmagrid._mycol)(__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k));
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="foredit=myc.name";
_foredit = _myc.Name /*String*/ ;
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="If myc.Locked=False And myc.Hidden=False Then";
if (_myc.Locked /*boolean*/ ==__c.False && _myc.Hidden /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="Return foredit";
if (true) return _foredit;
 };
 }
};
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="Return foredit";
if (true) return _foredit;
RDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="End Sub";
return "";
}
public String  _getvalue(b4j.example.magmagrid __ref,long _rowid,String _columnid) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "getvalue", false))
	 {return ((String) Debug.delegate(ba, "getvalue", new Object[] {_rowid,_columnid}));}
anywheresoftware.b4a.objects.collections.Map _mapvalues = null;
int _k = 0;
b4j.example.magmagrid._mycol _myc = null;
String _value = "";
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="public Sub GetValue(rowid As Long, columnid As Str";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Private MapValues As Map = useB4XTable.GetRow(row";
_mapvalues = new anywheresoftware.b4a.objects.collections.Map();
_mapvalues = __ref._useb4xtable /*b4j.example.b4xtable*/ ._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rowid);
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="For k=0 To MyColumns.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_k = (int) (0) ;
for (;_k <= limit2 ;_k = _k + step2 ) {
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Dim myc As mycol=MyColumns.Get(k)";
_myc = (b4j.example.magmagrid._mycol)(__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k));
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="If myc.Name=columnid Then";
if ((_myc.Name /*String*/ ).equals(_columnid)) { 
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="Dim value As String = MapValues.Getvalueat(k)";
_value = BA.ObjectToString(_mapvalues.GetValueAt(_k));
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _goatrowandclick(b4j.example.magmagrid __ref,long _rowindex) throws Exception{
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "goatrowandclick", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "goatrowandclick", new Object[] {_rowindex}));}
ResumableSub_GoAtRowAndClick rsub = new ResumableSub_GoAtRowAndClick(this,__ref,_rowindex);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GoAtRowAndClick extends BA.ResumableSub {
public ResumableSub_GoAtRowAndClick(b4j.example.magmagrid parent,b4j.example.magmagrid __ref,long _rowindex) {
this.parent = parent;
this.__ref = __ref;
this._rowindex = _rowindex;
this.__ref = parent;
}
b4j.example.magmagrid __ref;
b4j.example.magmagrid parent;
long _rowindex;
int _pagenum = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="magmagrid";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="If rowindex > 0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_rowindex>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="Dim pageNum As Int = Ceil(rowindex  / useB4XTabl";
_pagenum = (int) (parent.__c.Ceil(_rowindex/(double)__ref._useb4xtable /*b4j.example.b4xtable*/ ._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="useB4XTable.CurrentPage = pageNum";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._setcurrentpage /*int*/ (null,_pagenum);
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "goatrowandclick"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="useB4XTable.UpdateTableCounters";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._updatetablecounters /*String*/ (null);
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "goatrowandclick"),(int) (0));
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="useB4XTable_CellClicked(FirstColforEdit,rowindex";
__ref._useb4xtable_cellclicked /*void*/ (null,__ref._firstcolforedit /*String*/ (null),_rowindex);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=1441806;
 //BA.debugLineNum = 1441806;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=1441808;
 //BA.debugLineNum = 1441808;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _useb4xtable_cellclicked(b4j.example.magmagrid __ref,String _columnid,long _rowid) throws Exception{
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "useb4xtable_cellclicked", false))
	 {Debug.delegate(ba, "useb4xtable_cellclicked", new Object[] {_columnid,_rowid}); return;}
ResumableSub_useB4XTable_CellClicked rsub = new ResumableSub_useB4XTable_CellClicked(this,__ref,_columnid,_rowid);
rsub.resume(ba, null);
}
public static class ResumableSub_useB4XTable_CellClicked extends BA.ResumableSub {
public ResumableSub_useB4XTable_CellClicked(b4j.example.magmagrid parent,b4j.example.magmagrid __ref,String _columnid,long _rowid) {
this.parent = parent;
this.__ref = __ref;
this._columnid = _columnid;
this._rowid = _rowid;
this.__ref = parent;
}
b4j.example.magmagrid __ref;
b4j.example.magmagrid parent;
String _columnid;
long _rowid;
boolean _unused = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="magmagrid";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="If noEdit=True Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._noedit /*boolean*/ ==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="noEdit=False";
__ref._noedit /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="RowCalcPraxis";
__ref._rowcalcpraxis /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="thistable.CellClicked(ColumnId, RowId)";
__ref._thistable /*b4j.example.b4xtableselections*/ ._cellclicked /*String*/ (null,_columnid,_rowid);
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="SelectedRow=RowId";
__ref._selectedrow /*long*/  = _rowid;
RDebugUtils.currentLine=1835025;
 //BA.debugLineNum = 1835025;BA.debugLine="wait for (SelColumn(ColumnId)) complete (unused A";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "useb4xtable_cellclicked"), __ref._selcolumn /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_columnid));
this.state = 23;
return;
case 23:
//C
this.state = 5;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=1835026;
 //BA.debugLineNum = 1835026;BA.debugLine="If SelectedColumn.Locked=True Then Return";
if (true) break;

case 5:
//if
this.state = 10;
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Locked /*boolean*/ ==parent.__c.True) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
if (true) return ;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=1835028;
 //BA.debugLineNum = 1835028;BA.debugLine="If SelectedColumn.Controltype.Contains(\"CHECK\") T";
if (true) break;

case 11:
//if
this.state = 22;
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Controltype /*String*/ .contains("CHECK")) { 
this.state = 13;
}else {
this.state = 21;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=1835030;
 //BA.debugLineNum = 1835030;BA.debugLine="If GetValue(RowId,ColumnId)=Chr(9746) Then";
if (true) break;

case 14:
//if
this.state = 19;
if ((__ref._getvalue /*String*/ (null,_rowid,_columnid)).equals(BA.ObjectToString(parent.__c.Chr((int) (9746))))) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=1835031;
 //BA.debugLineNum = 1835031;BA.debugLine="SetValue(RowId,ColumnId,Chr(9744))";
__ref._setvalue /*String*/ (null,_rowid,_columnid,(Object)(parent.__c.Chr((int) (9744))));
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=1835033;
 //BA.debugLineNum = 1835033;BA.debugLine="SetValue(RowId,ColumnId,Chr(9746))";
__ref._setvalue /*String*/ (null,_rowid,_columnid,(Object)(parent.__c.Chr((int) (9746))));
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=1835037;
 //BA.debugLineNum = 1835037;BA.debugLine="ie.CellClicked(ColumnId, RowId)";
__ref._ie /*b4j.example.inlineediting*/ ._cellclicked /*String*/ (null,_columnid,_rowid);
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=1835042;
 //BA.debugLineNum = 1835042;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _guidelinepanel_mousedragged(b4j.example.magmagrid __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "guidelinepanel_mousedragged", false))
	 {return ((String) Debug.delegate(ba, "guidelinepanel_mousedragged", new Object[] {_eventdata}));}
int _tableleft = 0;
int _visibleright = 0;
int _tentativeleft = 0;
int _newsize = 0;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Private Sub GuidelinePanel_MouseDragged (EventData";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="If isResizing Then";
if (__ref._isresizing /*boolean*/ ) { 
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="If currentPanel.IsInitialized Then";
if (__ref._currentpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="cumulativeDelta = cumulativeDelta + EventData.X";
__ref._cumulativedelta /*int*/  = (int) (__ref._cumulativedelta /*int*/ +_eventdata.getX());
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="Dim tableLeft As Int = useB4XTable.mBase.Left";
_tableleft = (int) (__ref._useb4xtable /*b4j.example.b4xtable*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft());
RDebugUtils.currentLine=3342345;
 //BA.debugLineNum = 3342345;BA.debugLine="tableLeft = tableLeft + useB4XTable.mBase.Parent";
_tableleft = (int) (_tableleft+__ref._useb4xtable /*b4j.example.b4xtable*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().getLeft());
RDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="tableLeft = tableLeft + useB4XTable.clvData.GetB";
_tableleft = (int) (_tableleft+__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._getbase().getLeft());
RDebugUtils.currentLine=3342349;
 //BA.debugLineNum = 3342349;BA.debugLine="Dim visibleRight As Int = tableLeft + useB4XTabl";
_visibleright = (int) (_tableleft+__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.getWidth());
RDebugUtils.currentLine=3342352;
 //BA.debugLineNum = 3342352;BA.debugLine="Dim tentativeLeft As Int = currentPanel.Left + E";
_tentativeleft = (int) (__ref._currentpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+_eventdata.getX());
RDebugUtils.currentLine=3342355;
 //BA.debugLineNum = 3342355;BA.debugLine="If tentativeLeft < tableLeft Then";
if (_tentativeleft<_tableleft) { 
RDebugUtils.currentLine=3342356;
 //BA.debugLineNum = 3342356;BA.debugLine="cumulativeDelta = cumulativeDelta - (tableLeft";
__ref._cumulativedelta /*int*/  = (int) (__ref._cumulativedelta /*int*/ -(_tableleft-__ref._currentpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()));
RDebugUtils.currentLine=3342357;
 //BA.debugLineNum = 3342357;BA.debugLine="tentativeLeft = tableLeft";
_tentativeleft = _tableleft;
 };
RDebugUtils.currentLine=3342360;
 //BA.debugLineNum = 3342360;BA.debugLine="If tentativeLeft > visibleRight Then";
if (_tentativeleft>_visibleright) { 
RDebugUtils.currentLine=3342361;
 //BA.debugLineNum = 3342361;BA.debugLine="cumulativeDelta = cumulativeDelta - (tentativeL";
__ref._cumulativedelta /*int*/  = (int) (__ref._cumulativedelta /*int*/ -(_tentativeleft-_visibleright));
RDebugUtils.currentLine=3342362;
 //BA.debugLineNum = 3342362;BA.debugLine="tentativeLeft = visibleRight";
_tentativeleft = _visibleright;
 };
RDebugUtils.currentLine=3342366;
 //BA.debugLineNum = 3342366;BA.debugLine="currentPanel.Left = tentativeLeft";
__ref._currentpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(_tentativeleft);
RDebugUtils.currentLine=3342369;
 //BA.debugLineNum = 3342369;BA.debugLine="Dim newSize As Int = startColumnWidth + cumulati";
_newsize = (int) (__ref._startcolumnwidth /*int*/ +__ref._cumulativedelta /*int*/ );
RDebugUtils.currentLine=3342370;
 //BA.debugLineNum = 3342370;BA.debugLine="If newSize < 20 Then newSize = 20";
if (_newsize<20) { 
_newsize = (int) (20);};
RDebugUtils.currentLine=3342371;
 //BA.debugLineNum = 3342371;BA.debugLine="currentColumn.Width = newSize";
__ref._currentcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ .Width /*int*/  = _newsize;
 };
 };
RDebugUtils.currentLine=3342379;
 //BA.debugLineNum = 3342379;BA.debugLine="End Sub";
return "";
}
public String  _guidelinepanel_mouseentered(b4j.example.magmagrid __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "guidelinepanel_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "guidelinepanel_mouseentered", new Object[] {_eventdata}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
int _tableleft = 0;
int _visibleright = 0;
anywheresoftware.b4j.object.JavaObject _cursor = null;
anywheresoftware.b4j.object.JavaObject _jopnl = null;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub GuidelinePanel_MouseEntered (EventData";
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="If noEdit Then Return";
if (__ref._noedit /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="Dim pnl As B4XView = Sender";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="If pnl.IsInitialized Then";
if (_pnl.IsInitialized()) { 
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="Dim tableLeft As Int = useB4XTable.mBase.Left + u";
_tableleft = (int) (__ref._useb4xtable /*b4j.example.b4xtable*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._getbase().getLeft()+__ref._useb4xtable /*b4j.example.b4xtable*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().getLeft());
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="Dim visibleRight As Int = tableLeft + useB4XTable";
_visibleright = (int) (_tableleft+__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.getWidth());
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="If pnl.Left >= tableLeft And pnl.Left <= visibleR";
if (_pnl.getLeft()>=_tableleft && _pnl.getLeft()<=_visibleright) { 
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="pnl.SetColorAndBorder(xui.Color_Transparent, 2,";
_pnl.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,2,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Green,0);
RDebugUtils.currentLine=3145744;
 //BA.debugLineNum = 3145744;BA.debugLine="Dim cursor As JavaObject";
_cursor = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=3145745;
 //BA.debugLineNum = 3145745;BA.debugLine="cursor.InitializeStatic(\"javafx.scene.Cursor\")";
_cursor.InitializeStatic("javafx.scene.Cursor");
RDebugUtils.currentLine=3145746;
 //BA.debugLineNum = 3145746;BA.debugLine="Dim joPnl As JavaObject = pnl";
_jopnl = new anywheresoftware.b4j.object.JavaObject();
_jopnl = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnl.getObject()));
RDebugUtils.currentLine=3145747;
 //BA.debugLineNum = 3145747;BA.debugLine="joPnl.RunMethod(\"setCursor\", Array(cursor.GetFie";
_jopnl.RunMethod("setCursor",new Object[]{_cursor.GetField("E_RESIZE")});
 };
 };
RDebugUtils.currentLine=3145751;
 //BA.debugLineNum = 3145751;BA.debugLine="End Sub";
return "";
}
public String  _guidelinepanel_mouseexited(b4j.example.magmagrid __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "guidelinepanel_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "guidelinepanel_mouseexited", new Object[] {_eventdata}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4j.object.JavaObject _cursor = null;
anywheresoftware.b4j.object.JavaObject _jopnl = null;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub GuidelinePanel_MouseExited (EventData";
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Dim pnl As B4XView = Sender";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="If pnl.IsInitialized Then";
if (_pnl.IsInitialized()) { 
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="pnl.SetColorAndBorder(xui.Color_Transparent, 2, x";
_pnl.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,2,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0);
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="Dim cursor As JavaObject";
_cursor = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="cursor.InitializeStatic(\"javafx.scene.Cursor\")";
_cursor.InitializeStatic("javafx.scene.Cursor");
RDebugUtils.currentLine=3211273;
 //BA.debugLineNum = 3211273;BA.debugLine="Dim joPnl As JavaObject = pnl";
_jopnl = new anywheresoftware.b4j.object.JavaObject();
_jopnl = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnl.getObject()));
RDebugUtils.currentLine=3211274;
 //BA.debugLineNum = 3211274;BA.debugLine="joPnl.RunMethod(\"setCursor\", Array(cursor.GetFiel";
_jopnl.RunMethod("setCursor",new Object[]{_cursor.GetField("DEFAULT")});
 };
RDebugUtils.currentLine=3211276;
 //BA.debugLineNum = 3211276;BA.debugLine="End Sub";
return "";
}
public void  _guidelinepanel_mousepressed(b4j.example.magmagrid __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "guidelinepanel_mousepressed", false))
	 {Debug.delegate(ba, "guidelinepanel_mousepressed", new Object[] {_eventdata}); return;}
ResumableSub_GuidelinePanel_MousePressed rsub = new ResumableSub_GuidelinePanel_MousePressed(this,__ref,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_GuidelinePanel_MousePressed extends BA.ResumableSub {
public ResumableSub_GuidelinePanel_MousePressed(b4j.example.magmagrid parent,b4j.example.magmagrid __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
this.__ref = parent;
}
b4j.example.magmagrid __ref;
b4j.example.magmagrid parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
int _colindex = 0;
b4j.example.b4xtable._b4xtablecolumn _col = null;
int _restoredwidth = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="magmagrid";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="If noEdit Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._noedit /*boolean*/ ) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="If EventData.ClickCount = 2 Then";
if (true) break;

case 7:
//if
this.state = 24;
if (_eventdata.getClickCount()==2) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="Dim panel As B4XView = Sender";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="If panel.IsInitialized Then";
if (true) break;

case 10:
//if
this.state = 23;
if (_panel.IsInitialized()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="Dim colIndex As Int = panel.Tag";
_colindex = (int)(BA.ObjectToNumber(_panel.getTag()));
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="Dim col As B4XTableColumn = useB4XTable.visible";
_col = (b4j.example.b4xtable._b4xtablecolumn)(__ref._useb4xtable /*b4j.example.b4xtable*/ ._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_colindex));
RDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="If col.Width > 1 Then";
if (true) break;

case 13:
//if
this.state = 22;
if (_col.Width /*int*/ >1) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 22;
RDebugUtils.currentLine=3276814;
 //BA.debugLineNum = 3276814;BA.debugLine="previousColumnWidths(colIndex) = col.Width";
__ref._previouscolumnwidths /*int[]*/ [_colindex] = _col.Width /*int*/ ;
RDebugUtils.currentLine=3276815;
 //BA.debugLineNum = 3276815;BA.debugLine="col.Width = 1";
_col.Width /*int*/  = (int) (1);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=3276818;
 //BA.debugLineNum = 3276818;BA.debugLine="Dim restoredWidth As Int = previousColumnWidth";
_restoredwidth = __ref._previouscolumnwidths /*int[]*/ [_colindex];
RDebugUtils.currentLine=3276819;
 //BA.debugLineNum = 3276819;BA.debugLine="If restoredWidth <= 1 Then";
if (true) break;

case 18:
//if
this.state = 21;
if (_restoredwidth<=1) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=3276820;
 //BA.debugLineNum = 3276820;BA.debugLine="restoredWidth = 100dip";
_restoredwidth = parent.__c.DipToCurrent((int) (100));
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=3276822;
 //BA.debugLineNum = 3276822;BA.debugLine="col.Width = restoredWidth";
_col.Width /*int*/  = _restoredwidth;
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=3276825;
 //BA.debugLineNum = 3276825;BA.debugLine="useB4XTable.Refresh";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._refresh /*String*/ (null);
RDebugUtils.currentLine=3276826;
 //BA.debugLineNum = 3276826;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "guidelinepanel_mousepressed"),(int) (0));
this.state = 29;
return;
case 29:
//C
this.state = 23;
;
RDebugUtils.currentLine=3276827;
 //BA.debugLineNum = 3276827;BA.debugLine="EnableResizeGuidelines";
__ref._enableresizeguidelines /*String*/ (null);
RDebugUtils.currentLine=3276828;
 //BA.debugLineNum = 3276828;BA.debugLine="resizeTimer.Enabled = True";
__ref._resizetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.True);
 if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=3276830;
 //BA.debugLineNum = 3276830;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=3276833;
 //BA.debugLineNum = 3276833;BA.debugLine="currentPanel = Sender";
__ref._currentpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=3276834;
 //BA.debugLineNum = 3276834;BA.debugLine="If currentPanel.IsInitialized Then";
if (true) break;

case 25:
//if
this.state = 28;
if (__ref._currentpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=3276835;
 //BA.debugLineNum = 3276835;BA.debugLine="currentColumn = useB4XTable.visibleColumns.Get(cu";
__ref._currentcolumn /*b4j.example.b4xtable._b4xtablecolumn*/  = (b4j.example.b4xtable._b4xtablecolumn)(__ref._useb4xtable /*b4j.example.b4xtable*/ ._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get((int)(BA.ObjectToNumber(__ref._currentpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()))));
RDebugUtils.currentLine=3276836;
 //BA.debugLineNum = 3276836;BA.debugLine="startColumnWidth = currentColumn.Width";
__ref._startcolumnwidth /*int*/  = __ref._currentcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ .Width /*int*/ ;
RDebugUtils.currentLine=3276837;
 //BA.debugLineNum = 3276837;BA.debugLine="cumulativeDelta = 0";
__ref._cumulativedelta /*int*/  = (int) (0);
RDebugUtils.currentLine=3276838;
 //BA.debugLineNum = 3276838;BA.debugLine="isResizing = True";
__ref._isresizing /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=3276839;
 //BA.debugLineNum = 3276839;BA.debugLine="resizeTimer.Enabled = False";
__ref._resizetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=3276840;
 //BA.debugLineNum = 3276840;BA.debugLine="currentPanel.SetColorAndBorder(xui.Color_Transpar";
__ref._currentpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,2,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Green,0);
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=3276842;
 //BA.debugLineNum = 3276842;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _guidelinepanel_mousereleased(b4j.example.magmagrid __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "guidelinepanel_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "guidelinepanel_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub GuidelinePanel_MouseReleased (EventDat";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="If isResizing Then";
if (__ref._isresizing /*boolean*/ ) { 
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="isResizing = False";
__ref._isresizing /*boolean*/  = __c.False;
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="currentPanel.SetColorAndBorder(xui.Color_Transpa";
__ref._currentpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,2,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0);
RDebugUtils.currentLine=3407882;
 //BA.debugLineNum = 3407882;BA.debugLine="useB4XTable.Refresh 'Refresh here is safer than";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._refresh /*String*/ (null);
RDebugUtils.currentLine=3407884;
 //BA.debugLineNum = 3407884;BA.debugLine="EnableResizeGuidelines";
__ref._enableresizeguidelines /*String*/ (null);
RDebugUtils.currentLine=3407885;
 //BA.debugLineNum = 3407885;BA.debugLine="resizeTimer.Enabled = True";
__ref._resizetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=3407887;
 //BA.debugLineNum = 3407887;BA.debugLine="End Sub";
return "";
}
public String  _ie_entereditmode(b4j.example.magmagrid __ref,b4j.example.inlineediting._focusedcell _fc) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "ie_entereditmode", false))
	 {return ((String) Debug.delegate(ba, "ie_entereditmode", new Object[] {_fc}));}
int _k = 0;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
String _afield = "";
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Private Sub IE_EnterEditMode (FC As FocusedCell)";
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="If SelectedColumn.Controltype.Trim.ToUpperCase.";
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Controltype /*String*/ .trim().toUpperCase().contains("NUMERIC")) { 
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="MyNumField.Text=FC.PrevValue";
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_fc.PrevValue /*Object*/ ));
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="FC.View=MyNumField";
_fc.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
 }else {
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="Select Case SelectedColumn.Controltype";
switch (BA.switchObjectToInt(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Controltype /*String*/ ,"TEXTFIELD","TEXTAREA","COMBO","COMBOFIELD","COMBOEDIT","COMBOEDITFIELD","DATE")) {
case 0: 
case 1: {
RDebugUtils.currentLine=1703948;
 //BA.debugLineNum = 1703948;BA.debugLine="MyTextField.Text=FC.PrevValue";
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_fc.PrevValue /*Object*/ ));
RDebugUtils.currentLine=1703949;
 //BA.debugLineNum = 1703949;BA.debugLine="FC.View=MyTextField";
_fc.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
 break; }
case 2: 
case 3: 
case 4: 
case 5: {
RDebugUtils.currentLine=1703951;
 //BA.debugLineNum = 1703951;BA.debugLine="If SelectedColumn.Controltype.Contains(\"EDI";
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Controltype /*String*/ .contains("EDIT")) { 
RDebugUtils.currentLine=1703952;
 //BA.debugLineNum = 1703952;BA.debugLine="MyComboField.Editable=True";
__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setEditable(__c.True);
 }else {
RDebugUtils.currentLine=1703954;
 //BA.debugLineNum = 1703954;BA.debugLine="MyComboField.Editable=False";
__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setEditable(__c.False);
 };
RDebugUtils.currentLine=1703956;
 //BA.debugLineNum = 1703956;BA.debugLine="noEdit=True";
__ref._noedit /*boolean*/  = __c.True;
RDebugUtils.currentLine=1703957;
 //BA.debugLineNum = 1703957;BA.debugLine="MyComboField.Items.Clear";
__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Clear();
RDebugUtils.currentLine=1703958;
 //BA.debugLineNum = 1703958;BA.debugLine="For k=0 To SelectedColumn.UseList.Size-1";
{
final int step17 = 1;
final int limit17 = (int) (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .UseList /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_k = (int) (0) ;
for (;_k <= limit17 ;_k = _k + step17 ) {
RDebugUtils.currentLine=1703959;
 //BA.debugLineNum = 1703959;BA.debugLine="Private map1 As Map=SelectedColumn.UseList";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
_map1 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .UseList /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k)));
RDebugUtils.currentLine=1703960;
 //BA.debugLineNum = 1703960;BA.debugLine="MyComboField.Items.Add(map1.Get(SelectedCo";
__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Add(_map1.Get((Object)(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Name /*String*/ )));
RDebugUtils.currentLine=1703961;
 //BA.debugLineNum = 1703961;BA.debugLine="If FC.PrevValue=map1.Get(SelectedColumn.Na";
if ((_fc.PrevValue /*Object*/ ).equals(_map1.Get((Object)(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Name /*String*/ )))) { 
RDebugUtils.currentLine=1703962;
 //BA.debugLineNum = 1703962;BA.debugLine="MyComboField.SelectedIndex=k";
__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setSelectedIndex(_k);
RDebugUtils.currentLine=1703963;
 //BA.debugLineNum = 1703963;BA.debugLine="MyPrevComboIndex=k";
__ref._myprevcomboindex /*int*/  = _k;
RDebugUtils.currentLine=1703964;
 //BA.debugLineNum = 1703964;BA.debugLine="For Each afield As String In map1.Keys";
{
final anywheresoftware.b4a.BA.IterableList group23 = _map1.Keys();
final int groupLen23 = group23.getSize()
;int index23 = 0;
;
for (; index23 < groupLen23;index23++){
_afield = BA.ObjectToString(group23.Get(index23));
RDebugUtils.currentLine=1703965;
 //BA.debugLineNum = 1703965;BA.debugLine="SetValue(SelectedRow,afield,map1.Get(afi";
__ref._setvalue /*String*/ (null,__ref._selectedrow /*long*/ ,_afield,_map1.Get((Object)(_afield)));
 }
};
 };
 }
};
RDebugUtils.currentLine=1703970;
 //BA.debugLineNum = 1703970;BA.debugLine="If MyComboField.Editable=True And k=Selecte";
if (__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getEditable()==__c.True && _k==__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .UseList /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=1703971;
 //BA.debugLineNum = 1703971;BA.debugLine="MyComboField.Value=FC.PrevValue";
__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue(_fc.PrevValue /*Object*/ );
 }else {
RDebugUtils.currentLine=1703973;
 //BA.debugLineNum = 1703973;BA.debugLine="MyComboField.SelectedIndex=MyPrevComboInde";
__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setSelectedIndex(__ref._myprevcomboindex /*int*/ );
 };
RDebugUtils.currentLine=1703976;
 //BA.debugLineNum = 1703976;BA.debugLine="FC.View=MyComboField";
_fc.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getObject()));
 break; }
case 6: {
RDebugUtils.currentLine=1703979;
 //BA.debugLineNum = 1703979;BA.debugLine="MyTextField.Text=DateTime.Date(FC.PrevValue";
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date(BA.ObjectToLongNumber(_fc.PrevValue /*Object*/ )));
RDebugUtils.currentLine=1703980;
 //BA.debugLineNum = 1703980;BA.debugLine="FC.View=MyTextField";
_fc.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
 break; }
}
;
 };
RDebugUtils.currentLine=1703986;
 //BA.debugLineNum = 1703986;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4j.example.magmagrid __ref,long _rowid,String _columnid,Object _newvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "setvalue", false))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_rowid,_columnid,_newvalue}));}
anywheresoftware.b4a.objects.collections.Map _mapvalues = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _query = null;
anywheresoftware.b4a.objects.collections.List _params = null;
int _k = 0;
b4j.example.magmagrid._mycol _myc = null;
double _newvalue1 = 0;
b4j.example.b4xtable._b4xtablecolumn _c = null;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="public Sub SetValue(rowid As Long, columnid As Str";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Private MapValues As Map = useB4XTable.GetRow(row";
_mapvalues = new anywheresoftware.b4a.objects.collections.Map();
_mapvalues = __ref._useb4xtable /*b4j.example.b4xtable*/ ._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rowid);
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Dim Query As StringBuilder";
_query = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Dim params As List";
_params = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="Query.Initialize";
_query.Initialize();
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="Query.Append (\"UPDATE data SET \")";
_query.Append("UPDATE data SET ");
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="For k=0 To MyColumns.Size-1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_k = (int) (0) ;
for (;_k <= limit7 ;_k = _k + step7 ) {
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="Private myc As mycol = MyColumns.Get(k)";
_myc = (b4j.example.magmagrid._mycol)(__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k));
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="If myc.Controltype.Contains(\"EDITCONTROLS\") Then";
if (_myc.Controltype /*String*/ .contains("EDITCONTROLS")) { 
 }else {
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="If columnid=myc.Name Then";
if ((_columnid).equals(_myc.Name /*String*/ )) { 
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="If myc.Controltype.Contains(\"NUMERIC\") Then";
if (_myc.Controltype /*String*/ .contains("NUMERIC")) { 
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="Dim newvalue1 As Double=newvalue";
_newvalue1 = (double)(BA.ObjectToNumber(_newvalue));
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="params.Add(NumberFormat2(newvalue1,myc.MinInt";
_params.Add((Object)(__c.NumberFormat2(_newvalue1,_myc.MinIntegers /*int*/ ,_myc.MinFractions /*int*/ ,_myc.MaxFractions /*int*/ ,_myc.Grouping /*boolean*/ )));
 }else {
RDebugUtils.currentLine=983058;
 //BA.debugLineNum = 983058;BA.debugLine="params.Add(newvalue)";
_params.Add(_newvalue);
 };
 }else {
RDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="params.Add(MapValues.GetValueAt(k))";
_params.Add(_mapvalues.GetValueAt(_k));
 };
RDebugUtils.currentLine=983063;
 //BA.debugLineNum = 983063;BA.debugLine="Dim c As B4XTableColumn = useB4XTable.GetColumn";
_c = __ref._useb4xtable /*b4j.example.b4xtable*/ ._getcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,_myc.Name /*String*/ );
RDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="Query.Append (c.SQLID.Trim & \" = ?\")";
_query.Append(_c.SQLID /*String*/ .trim()+" = ?");
RDebugUtils.currentLine=983065;
 //BA.debugLineNum = 983065;BA.debugLine="If k<MyColumns.Size-1 Then";
if (_k<__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) { 
RDebugUtils.currentLine=983066;
 //BA.debugLineNum = 983066;BA.debugLine="Query.Append (\",\")";
_query.Append(",");
 };
 };
 }
};
RDebugUtils.currentLine=983070;
 //BA.debugLineNum = 983070;BA.debugLine="Query.Append (\"WHERE rowid = ?\")";
_query.Append("WHERE rowid = ?");
RDebugUtils.currentLine=983071;
 //BA.debugLineNum = 983071;BA.debugLine="params.Add(rowid)";
_params.Add((Object)(_rowid));
RDebugUtils.currentLine=983072;
 //BA.debugLineNum = 983072;BA.debugLine="useB4XTable.sql1.ExecNonQuery2(Query, params)";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(BA.ObjectToString(_query),_params);
RDebugUtils.currentLine=983073;
 //BA.debugLineNum = 983073;BA.debugLine="useB4XTable.Refresh";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._refresh /*String*/ (null);
RDebugUtils.currentLine=983075;
 //BA.debugLineNum = 983075;BA.debugLine="End Sub";
return "";
}
public Object  _ie_getupdatedvalue(b4j.example.magmagrid __ref,b4j.example.inlineediting._focusedcell _fc) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "ie_getupdatedvalue", false))
	 {return ((Object) Debug.delegate(ba, "ie_getupdatedvalue", new Object[] {_fc}));}
anywheresoftware.b4a.objects.collections.Map _map1 = null;
String _afield = "";
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub IE_GetUpdatedValue (FC As FocusedCell)";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="If SelectedColumn.Controltype.Trim.ToUpperCase.Co";
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Controltype /*String*/ .trim().toUpperCase().contains("NUMERIC")) { 
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="RowCalcPraxis";
__ref._rowcalcpraxis /*String*/ (null);
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="If SelectedColumn.MaxValue>0 Then";
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxValue /*double*/ >0) { 
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="If MyNumField.Text.As(Double)>SelectedColumn.Ma";
if (((double)(Double.parseDouble(__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())))>__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxValue /*double*/ ) { 
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxValue /*double*/ ));};
 };
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="If SelectedColumn.MinValue>0 Then";
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MinValue /*double*/ >0) { 
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="If MyNumField.Text.As(Double)<SelectedColumn.Mi";
if (((double)(Double.parseDouble(__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())))<__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MinValue /*double*/ ) { 
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MinValue /*double*/ ));};
 };
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="If MyNumField.Text.Trim.Length=0 Then MyNumField";
if (__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().trim().length()==0) { 
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Defaultvalue /*String*/ );};
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="Return MyNumField.Text";
if (true) return (Object)(__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
 }else {
RDebugUtils.currentLine=1769487;
 //BA.debugLineNum = 1769487;BA.debugLine="Select Case SelectedColumn.Controltype";
switch (BA.switchObjectToInt(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Controltype /*String*/ ,"TEXTFIELD","TEXTAREA","COMBO","COMBOFIELD","COMBOEDIT","COMBOEDITFIELD","DATE")) {
case 0: 
case 1: {
RDebugUtils.currentLine=1769489;
 //BA.debugLineNum = 1769489;BA.debugLine="If MyTextField.Text.Trim.Length=0 Then MyTextF";
if (__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().trim().length()==0) { 
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Defaultvalue /*String*/ );};
RDebugUtils.currentLine=1769490;
 //BA.debugLineNum = 1769490;BA.debugLine="Return MyTextField.Text";
if (true) return (Object)(__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
 break; }
case 2: 
case 3: 
case 4: 
case 5: {
RDebugUtils.currentLine=1769495;
 //BA.debugLineNum = 1769495;BA.debugLine="If MyComboField.SelectedIndex>-1 Then";
if (__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getSelectedIndex()>-1) { 
RDebugUtils.currentLine=1769496;
 //BA.debugLineNum = 1769496;BA.debugLine="Private map1 As Map=SelectedColumn.UseList.G";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
_map1 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .UseList /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getSelectedIndex())));
RDebugUtils.currentLine=1769498;
 //BA.debugLineNum = 1769498;BA.debugLine="For Each afield As String In map1.Keys";
{
final anywheresoftware.b4a.BA.IterableList group19 = _map1.Keys();
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_afield = BA.ObjectToString(group19.Get(index19));
RDebugUtils.currentLine=1769499;
 //BA.debugLineNum = 1769499;BA.debugLine="SetValue(SelectedRow,afield,map1.Get(afield";
__ref._setvalue /*String*/ (null,__ref._selectedrow /*long*/ ,_afield,_map1.Get((Object)(_afield)));
 }
};
RDebugUtils.currentLine=1769502;
 //BA.debugLineNum = 1769502;BA.debugLine="Return map1.Get(SelectedColumn.Name)";
if (true) return _map1.Get((Object)(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Name /*String*/ ));
 }else {
RDebugUtils.currentLine=1769504;
 //BA.debugLineNum = 1769504;BA.debugLine="If MyComboField.Editable=True Then";
if (__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getEditable()==__c.True) { 
RDebugUtils.currentLine=1769505;
 //BA.debugLineNum = 1769505;BA.debugLine="Return MyComboField.Value";
if (true) return __ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue();
 }else {
RDebugUtils.currentLine=1769508;
 //BA.debugLineNum = 1769508;BA.debugLine="If SelectedColumn.Defaultvalue.Trim.Length>0";
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Defaultvalue /*String*/ .trim().length()>0) { 
RDebugUtils.currentLine=1769509;
 //BA.debugLineNum = 1769509;BA.debugLine="Return SelectedColumn.Defaultvalue";
if (true) return (Object)(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Defaultvalue /*String*/ );
 };
 };
 };
 break; }
case 6: {
RDebugUtils.currentLine=1769518;
 //BA.debugLineNum = 1769518;BA.debugLine="If xtra.IsValidDate(MyTextField.Text)=False Th";
if (__ref._xtra /*b4j.example.b4xmagmafuncs*/ ._isvaliddate /*boolean*/ (null,__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())==__c.False) { 
RDebugUtils.currentLine=1769519;
 //BA.debugLineNum = 1769519;BA.debugLine="If SelectedColumn.Defaultvalue>0 Then";
if ((double)(Double.parseDouble(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Defaultvalue /*String*/ ))>0) { 
RDebugUtils.currentLine=1769520;
 //BA.debugLineNum = 1769520;BA.debugLine="MyTextField.Text=DateTime.Date(SelectedColum";
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date((long)(Double.parseDouble(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Defaultvalue /*String*/ ))));
 }else {
RDebugUtils.currentLine=1769522;
 //BA.debugLineNum = 1769522;BA.debugLine="MyTextField.Text=DateTime.Date(DateTime.Now)";
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date(__c.DateTime.getNow()));
 };
 };
RDebugUtils.currentLine=1769525;
 //BA.debugLineNum = 1769525;BA.debugLine="If SelectedColumn.MaxValue>0 Then";
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxValue /*double*/ >0) { 
RDebugUtils.currentLine=1769526;
 //BA.debugLineNum = 1769526;BA.debugLine="If DateTime.DateParse(MyTextField.Text)>Selec";
if (__c.DateTime.DateParse(__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())>__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxValue /*double*/ ) { 
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date((long) (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxValue /*double*/ )));};
 };
RDebugUtils.currentLine=1769528;
 //BA.debugLineNum = 1769528;BA.debugLine="If SelectedColumn.MinValue>0 Then";
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MinValue /*double*/ >0) { 
RDebugUtils.currentLine=1769529;
 //BA.debugLineNum = 1769529;BA.debugLine="If DateTime.DateParse(MyTextField.Text)<Selec";
if (__c.DateTime.DateParse(__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())<__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MinValue /*double*/ ) { 
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date((long) (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MinValue /*double*/ )));};
 };
RDebugUtils.currentLine=1769531;
 //BA.debugLineNum = 1769531;BA.debugLine="Return DateTime.DateParse(MyTextField.Text)";
if (true) return (Object)(__c.DateTime.DateParse(__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
 break; }
}
;
 };
RDebugUtils.currentLine=1769536;
 //BA.debugLineNum = 1769536;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=1769537;
 //BA.debugLineNum = 1769537;BA.debugLine="End Sub";
return null;
}
public boolean  _istablefocused(b4j.example.magmagrid __ref,b4j.example.b4xtable _table) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "istablefocused", false))
	 {return ((Boolean) Debug.delegate(ba, "istablefocused", new Object[] {_table}));}
anywheresoftware.b4a.objects.B4XViewWrapper _focusednode = null;
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub IsTableFocused (Table As B4XTable) As";
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Dim FocusedNode As B4XView = Main.scene.RunMethod";
_focusednode = new anywheresoftware.b4a.objects.B4XViewWrapper();
_focusednode = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_main._scene /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("focusOwnerProperty",(Object[])(__c.Null)).RunMethod("get",(Object[])(__c.Null))));
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="Do While FocusedNode.IsInitialized";
while (_focusednode.IsInitialized()) {
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="If FocusedNode = Table.clvData.AsView Then Retur";
if ((_focusednode).equals(_table._clvdata /*b4j.example.customlistview*/ ._asview())) { 
if (true) return __c.True;};
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="FocusedNode = FocusedNode.Parent";
_focusednode = _focusednode.getParent();
 }
;
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="End Sub";
return false;
}
public void  _keypressed_filter(b4j.example.magmagrid __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "keypressed_filter", false))
	 {Debug.delegate(ba, "keypressed_filter", new Object[] {_e}); return;}
ResumableSub_KeyPressed_Filter rsub = new ResumableSub_KeyPressed_Filter(this,__ref,_e);
rsub.resume(ba, null);
}
public static class ResumableSub_KeyPressed_Filter extends BA.ResumableSub {
public ResumableSub_KeyPressed_Filter(b4j.example.magmagrid parent,b4j.example.magmagrid __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) {
this.parent = parent;
this.__ref = __ref;
this._e = _e;
this.__ref = parent;
}
b4j.example.magmagrid __ref;
b4j.example.magmagrid parent;
anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e;
b4j.example.b4xtable _table = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
String _eventtype = "";
String _keycode = "";
String _col = "";
long _row = 0L;
int _rowsize = 0;
int _i = 0;
int _k = 0;
b4j.example.magmagrid._mycol _myc = null;
String _tmp = "";
int step14;
int limit14;
int step31;
int limit31;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="magmagrid";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim table As B4XTable = useB4XTable";
_table = __ref._useb4xtable /*b4j.example.b4xtable*/ ;
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="If noEdit=False And IsTableFocused(table) And tab";
if (true) break;

case 1:
//if
this.state = 67;
if (__ref._noedit /*boolean*/ ==parent.__c.False && __ref._istablefocused /*boolean*/ (null,_table) && (double)(BA.ObjectToNumber(_table._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))))>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Dim jo As JavaObject = e";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_e.getObject()));
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="Dim EventType As String = jo.RunMethodJO(\"getEve";
_eventtype = BA.ObjectToString(_jo.RunMethodJO("getEventType",(Object[])(parent.__c.Null)).RunMethod("getName",(Object[])(parent.__c.Null)));
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="If EventType = \"KEY_PRESSED\" Then";
if (true) break;

case 4:
//if
this.state = 66;
if ((_eventtype).equals("KEY_PRESSED")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="Dim keycode As String = jo.RunMethod(\"getCode\",";
_keycode = BA.ObjectToString(_jo.RunMethod("getCode",(Object[])(parent.__c.Null)));
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="Dim col As String = 1'thistable.FirstSelectedCo";
_col = BA.NumberToString(1);
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="Dim row As Long = thistable.FirstSelectedRowId";
_row = __ref._thistable /*b4j.example.b4xtableselections*/ ._firstselectedrowid /*long*/ (null);
RDebugUtils.currentLine=2752528;
 //BA.debugLineNum = 2752528;BA.debugLine="Dim RowSize As Int = table.VisibleRowIds.Size";
_rowsize = _table._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=2752529;
 //BA.debugLineNum = 2752529;BA.debugLine="Select keycode";
if (true) break;

case 7:
//select
this.state = 60;
switch (BA.switchObjectToInt(_keycode,"UP","DOWN","PAGE_UP","PAGE_DOWN","SPACE","ENTER")) {
case 0: {
this.state = 9;
if (true) break;
}
case 1: {
this.state = 25;
if (true) break;
}
case 2: {
this.state = 33;
if (true) break;
}
case 3: {
this.state = 35;
if (true) break;
}
case 4: {
this.state = 37;
if (true) break;
}
case 5: {
this.state = 53;
if (true) break;
}
default: {
this.state = 59;
if (true) break;
}
}
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=2752537;
 //BA.debugLineNum = 2752537;BA.debugLine="row = table.VisibleRowIds.Get((table.VisibleR";
_row = BA.ObjectToLongNumber(_table._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) ((_table._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row))-1+_rowsize)%_rowsize)));
RDebugUtils.currentLine=2752538;
 //BA.debugLineNum = 2752538;BA.debugLine="If row = 0 Then";
if (true) break;

case 10:
//if
this.state = 23;
if (_row==0) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=2752539;
 //BA.debugLineNum = 2752539;BA.debugLine="For i = table.VisibleRowIds.Size - 1 To 0 St";
if (true) break;

case 13:
//for
this.state = 22;
step14 = -1;
limit14 = (int) (0);
_i = (int) (_table._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) ;
this.state = 97;
if (true) break;

case 97:
//C
this.state = 22;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 15;
if (true) break;

case 98:
//C
this.state = 97;
_i = ((int)(0 + _i + step14)) ;
if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=2752540;
 //BA.debugLineNum = 2752540;BA.debugLine="row = table.VisibleRowIds.Get(i)";
_row = BA.ObjectToLongNumber(_table._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=2752541;
 //BA.debugLineNum = 2752541;BA.debugLine="If row <> 0 Then Exit";
if (true) break;

case 16:
//if
this.state = 21;
if (_row!=0) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
this.state = 22;
if (true) break;
if (true) break;

case 21:
//C
this.state = 98;
;
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;

case 23:
//C
this.state = 60;
;
RDebugUtils.currentLine=2752544;
 //BA.debugLineNum = 2752544;BA.debugLine="SelectedRow=row";
__ref._selectedrow /*long*/  = _row;
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=2752546;
 //BA.debugLineNum = 2752546;BA.debugLine="row = table.VisibleRowIds.Get((table.VisibleR";
_row = BA.ObjectToLongNumber(_table._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) ((_table._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row))+1+_rowsize)%_rowsize)));
RDebugUtils.currentLine=2752547;
 //BA.debugLineNum = 2752547;BA.debugLine="If row = 0 Then row = table.VisibleRowIds.Get";
if (true) break;

case 26:
//if
this.state = 31;
if (_row==0) { 
this.state = 28;
;}if (true) break;

case 28:
//C
this.state = 31;
_row = BA.ObjectToLongNumber(_table._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
if (true) break;

case 31:
//C
this.state = 60;
;
RDebugUtils.currentLine=2752548;
 //BA.debugLineNum = 2752548;BA.debugLine="SelectedRow=row";
__ref._selectedrow /*long*/  = _row;
 if (true) break;

case 33:
//C
this.state = 60;
RDebugUtils.currentLine=2752550;
 //BA.debugLineNum = 2752550;BA.debugLine="row=1";
_row = (long) (1);
RDebugUtils.currentLine=2752551;
 //BA.debugLineNum = 2752551;BA.debugLine="table.CurrentPage=table.CurrentPage-1";
_table._setcurrentpage /*int*/ (null,(int) (_table._getcurrentpage /*int*/ (null)-1));
 if (true) break;

case 35:
//C
this.state = 60;
RDebugUtils.currentLine=2752553;
 //BA.debugLineNum = 2752553;BA.debugLine="row=1";
_row = (long) (1);
RDebugUtils.currentLine=2752554;
 //BA.debugLineNum = 2752554;BA.debugLine="table.CurrentPage=table.CurrentPage+1";
_table._setcurrentpage /*int*/ (null,(int) (_table._getcurrentpage /*int*/ (null)+1));
 if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=2752556;
 //BA.debugLineNum = 2752556;BA.debugLine="For k=0 To MyColumns.Size-1";
if (true) break;

case 38:
//for
this.state = 51;
step31 = 1;
limit31 = (int) (__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_k = (int) (0) ;
this.state = 99;
if (true) break;

case 99:
//C
this.state = 51;
if ((step31 > 0 && _k <= limit31) || (step31 < 0 && _k >= limit31)) this.state = 40;
if (true) break;

case 100:
//C
this.state = 99;
_k = ((int)(0 + _k + step31)) ;
if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=2752557;
 //BA.debugLineNum = 2752557;BA.debugLine="Dim myc As mycol=MyColumns.Get(k)";
_myc = (b4j.example.magmagrid._mycol)(__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k));
RDebugUtils.currentLine=2752558;
 //BA.debugLineNum = 2752558;BA.debugLine="If myc.Controltype.Contains(\"CHECK\") Then";
if (true) break;

case 41:
//if
this.state = 50;
if (_myc.Controltype /*String*/ .contains("CHECK")) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=2752560;
 //BA.debugLineNum = 2752560;BA.debugLine="If GetValue(SelectedRow,myc.Name)=Chr(9746)";
if (true) break;

case 44:
//if
this.state = 49;
if ((__ref._getvalue /*String*/ (null,__ref._selectedrow /*long*/ ,_myc.Name /*String*/ )).equals(BA.ObjectToString(parent.__c.Chr((int) (9746))))) { 
this.state = 46;
}else {
this.state = 48;
}if (true) break;

case 46:
//C
this.state = 49;
RDebugUtils.currentLine=2752561;
 //BA.debugLineNum = 2752561;BA.debugLine="SetValue(SelectedRow,myc.Name,Chr(9744))";
__ref._setvalue /*String*/ (null,__ref._selectedrow /*long*/ ,_myc.Name /*String*/ ,(Object)(parent.__c.Chr((int) (9744))));
 if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=2752563;
 //BA.debugLineNum = 2752563;BA.debugLine="SetValue(SelectedRow,myc.Name,Chr(9746))";
__ref._setvalue /*String*/ (null,__ref._selectedrow /*long*/ ,_myc.Name /*String*/ ,(Object)(parent.__c.Chr((int) (9746))));
 if (true) break;

case 49:
//C
this.state = 50;
;
 if (true) break;

case 50:
//C
this.state = 100;
;
 if (true) break;
if (true) break;

case 51:
//C
this.state = 60;
;
 if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=2752569;
 //BA.debugLineNum = 2752569;BA.debugLine="If noEdit=False Then";
if (true) break;

case 54:
//if
this.state = 57;
if (__ref._noedit /*boolean*/ ==parent.__c.False) { 
this.state = 56;
}if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=2752570;
 //BA.debugLineNum = 2752570;BA.debugLine="SelectedRow=row";
__ref._selectedrow /*long*/  = _row;
RDebugUtils.currentLine=2752571;
 //BA.debugLineNum = 2752571;BA.debugLine="Dim myc As mycol=MyColumns.Get(0)";
_myc = (b4j.example.magmagrid._mycol)(__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=2752572;
 //BA.debugLineNum = 2752572;BA.debugLine="SelColumn(myc.Name)";
__ref._selcolumn /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_myc.Name /*String*/ );
RDebugUtils.currentLine=2752573;
 //BA.debugLineNum = 2752573;BA.debugLine="NextEditableColumn";
__ref._nexteditablecolumn /*void*/ (null);
RDebugUtils.currentLine=2752574;
 //BA.debugLineNum = 2752574;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 57:
//C
this.state = 60;
;
 if (true) break;

case 59:
//C
this.state = 60;
 if (true) break;
;
RDebugUtils.currentLine=2752580;
 //BA.debugLineNum = 2752580;BA.debugLine="If row<1 Then row=1";

case 60:
//if
this.state = 65;
if (_row<1) { 
this.state = 62;
;}if (true) break;

case 62:
//C
this.state = 65;
_row = (long) (1);
if (true) break;

case 65:
//C
this.state = 66;
;
RDebugUtils.currentLine=2752582;
 //BA.debugLineNum = 2752582;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
RDebugUtils.currentLine=2752583;
 //BA.debugLineNum = 2752583;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "keypressed_filter"),(int) (0));
this.state = 101;
return;
case 101:
//C
this.state = 66;
;
RDebugUtils.currentLine=2752584;
 //BA.debugLineNum = 2752584;BA.debugLine="thistable.CellClicked(col, row)";
__ref._thistable /*b4j.example.b4xtableselections*/ ._cellclicked /*String*/ (null,_col,_row);
 if (true) break;

case 66:
//C
this.state = 67;
;
 if (true) break;
;
RDebugUtils.currentLine=2752590;
 //BA.debugLineNum = 2752590;BA.debugLine="If noEdit=True Then";

case 67:
//if
this.state = 96;
if (__ref._noedit /*boolean*/ ==parent.__c.True) { 
this.state = 69;
}if (true) break;

case 69:
//C
this.state = 70;
RDebugUtils.currentLine=2752591;
 //BA.debugLineNum = 2752591;BA.debugLine="Dim jo As JavaObject = e";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_e.getObject()));
RDebugUtils.currentLine=2752592;
 //BA.debugLineNum = 2752592;BA.debugLine="Dim EventType As String = jo.RunMethodJO(\"getEve";
_eventtype = BA.ObjectToString(_jo.RunMethodJO("getEventType",(Object[])(parent.__c.Null)).RunMethod("getName",(Object[])(parent.__c.Null)));
RDebugUtils.currentLine=2752593;
 //BA.debugLineNum = 2752593;BA.debugLine="If EventType = \"KEY_PRESSED\" Then";
if (true) break;

case 70:
//if
this.state = 95;
if ((_eventtype).equals("KEY_PRESSED")) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
RDebugUtils.currentLine=2752594;
 //BA.debugLineNum = 2752594;BA.debugLine="Dim keycode As String = jo.RunMethod(\"getCode\",";
_keycode = BA.ObjectToString(_jo.RunMethod("getCode",(Object[])(parent.__c.Null)));
RDebugUtils.currentLine=2752595;
 //BA.debugLineNum = 2752595;BA.debugLine="If keycode = \"ESCAPE\" Then";
if (true) break;

case 73:
//if
this.state = 76;
if ((_keycode).equals("ESCAPE")) { 
this.state = 75;
}if (true) break;

case 75:
//C
this.state = 76;
RDebugUtils.currentLine=2752596;
 //BA.debugLineNum = 2752596;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=2752597;
 //BA.debugLineNum = 2752597;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
 if (true) break;
;
RDebugUtils.currentLine=2752599;
 //BA.debugLineNum = 2752599;BA.debugLine="If keycode=\"TAB\" And xtra.IsComboBoxFocused(MyC";

case 76:
//if
this.state = 85;
if ((_keycode).equals("TAB") && __ref._xtra /*b4j.example.b4xmagmafuncs*/ ._iscomboboxfocused /*boolean*/ (null,__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ )==parent.__c.False) { 
this.state = 78;
}if (true) break;

case 78:
//C
this.state = 79;
RDebugUtils.currentLine=2752600;
 //BA.debugLineNum = 2752600;BA.debugLine="If SelectedColumn.Controltype.Contains(\"NUMERI";
if (true) break;

case 79:
//if
this.state = 84;
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Controltype /*String*/ .contains("NUMERIC")) { 
this.state = 81;
}else {
this.state = 83;
}if (true) break;

case 81:
//C
this.state = 84;
RDebugUtils.currentLine=2752601;
 //BA.debugLineNum = 2752601;BA.debugLine="mynumfield_Action";
__ref._mynumfield_action /*String*/ (null);
 if (true) break;

case 83:
//C
this.state = 84;
RDebugUtils.currentLine=2752603;
 //BA.debugLineNum = 2752603;BA.debugLine="mytextfield_Action";
__ref._mytextfield_action /*String*/ (null);
 if (true) break;

case 84:
//C
this.state = 85;
;
 if (true) break;
;
RDebugUtils.currentLine=2752606;
 //BA.debugLineNum = 2752606;BA.debugLine="If xtra.IsComboBoxFocused(MyComboField) And (ke";

case 85:
//if
this.state = 94;
if (__ref._xtra /*b4j.example.b4xmagmafuncs*/ ._iscomboboxfocused /*boolean*/ (null,__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ ) && ((_keycode).equals("ENTER") || (_keycode).equals("TAB"))) { 
this.state = 87;
}if (true) break;

case 87:
//C
this.state = 88;
RDebugUtils.currentLine=2752609;
 //BA.debugLineNum = 2752609;BA.debugLine="If MyComboField.Editable=True Then";
if (true) break;

case 88:
//if
this.state = 93;
if (__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getEditable()==parent.__c.True) { 
this.state = 90;
}else {
this.state = 92;
}if (true) break;

case 90:
//C
this.state = 93;
RDebugUtils.currentLine=2752610;
 //BA.debugLineNum = 2752610;BA.debugLine="Dim tmp As String=MyComboField.Value  'here";
_tmp = BA.ObjectToString(__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
RDebugUtils.currentLine=2752611;
 //BA.debugLineNum = 2752611;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "keypressed_filter"),(int) (0));
this.state = 102;
return;
case 102:
//C
this.state = 93;
;
RDebugUtils.currentLine=2752612;
 //BA.debugLineNum = 2752612;BA.debugLine="SetValue(SelectedRow,SelectedColumn.Name,tmp";
__ref._setvalue /*String*/ (null,__ref._selectedrow /*long*/ ,__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Name /*String*/ ,(Object)(_tmp));
 if (true) break;

case 92:
//C
this.state = 93;
RDebugUtils.currentLine=2752614;
 //BA.debugLineNum = 2752614;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
 if (true) break;

case 93:
//C
this.state = 94;
;
RDebugUtils.currentLine=2752616;
 //BA.debugLineNum = 2752616;BA.debugLine="NextEditableColumn";
__ref._nexteditablecolumn /*void*/ (null);
RDebugUtils.currentLine=2752618;
 //BA.debugLineNum = 2752618;BA.debugLine="noEdit=False";
__ref._noedit /*boolean*/  = parent.__c.False;
 if (true) break;

case 94:
//C
this.state = 95;
;
 if (true) break;

case 95:
//C
this.state = 96;
;
 if (true) break;

case 96:
//C
this.state = -1;
;
RDebugUtils.currentLine=2752650;
 //BA.debugLineNum = 2752650;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _selcolumn(b4j.example.magmagrid __ref,String _id1) throws Exception{
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "selcolumn", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "selcolumn", new Object[] {_id1}));}
ResumableSub_SelColumn rsub = new ResumableSub_SelColumn(this,__ref,_id1);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SelColumn extends BA.ResumableSub {
public ResumableSub_SelColumn(b4j.example.magmagrid parent,b4j.example.magmagrid __ref,String _id1) {
this.parent = parent;
this.__ref = __ref;
this._id1 = _id1;
this.__ref = parent;
}
b4j.example.magmagrid __ref;
b4j.example.magmagrid parent;
String _id1;
int _k = 0;
b4j.example.magmagrid._mycol _mycolumn = null;
int step1;
int limit1;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="magmagrid";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="For k=0 To MyColumns.size-1";
if (true) break;

case 1:
//for
this.state = 10;
step1 = 1;
limit1 = (int) (__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_k = (int) (0) ;
this.state = 11;
if (true) break;

case 11:
//C
this.state = 10;
if ((step1 > 0 && _k <= limit1) || (step1 < 0 && _k >= limit1)) this.state = 3;
if (true) break;

case 12:
//C
this.state = 11;
_k = ((int)(0 + _k + step1)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Dim MyColumn As mycol=MyColumns.Get(k)";
_mycolumn = (b4j.example.magmagrid._mycol)(__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k));
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="If MyColumn.Name.Trim=ID1 Then Exit";
if (true) break;

case 4:
//if
this.state = 9;
if ((_mycolumn.Name /*String*/ .trim()).equals(_id1)) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
this.state = 10;
if (true) break;
if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="TheIndexCol=k";
__ref._theindexcol /*int*/  = _k;
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="SelectedColumn=MyColumn";
__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/  = _mycolumn;
RDebugUtils.currentLine=1900555;
 //BA.debugLineNum = 1900555;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _nexteditablecolumn(b4j.example.magmagrid __ref) throws Exception{
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "nexteditablecolumn", false))
	 {Debug.delegate(ba, "nexteditablecolumn", null); return;}
ResumableSub_NextEditableColumn rsub = new ResumableSub_NextEditableColumn(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_NextEditableColumn extends BA.ResumableSub {
public ResumableSub_NextEditableColumn(b4j.example.magmagrid parent,b4j.example.magmagrid __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.magmagrid __ref;
b4j.example.magmagrid parent;
int _k = 0;
b4j.example.magmagrid._mycol _myc = null;
boolean _unused = false;
int step3;
int limit3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="magmagrid";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="useB4XTable.UpdateTableCounters";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._updatetablecounters /*String*/ (null);
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="For k=TheIndexCol+1 To MyColumns.Size-1";
if (true) break;

case 1:
//for
this.state = 8;
step3 = 1;
limit3 = (int) (__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_k = (int) (__ref._theindexcol /*int*/ +1) ;
this.state = 14;
if (true) break;

case 14:
//C
this.state = 8;
if ((step3 > 0 && _k <= limit3) || (step3 < 0 && _k >= limit3)) this.state = 3;
if (true) break;

case 15:
//C
this.state = 14;
_k = ((int)(0 + _k + step3)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="Dim myc As mycol=MyColumns.Get(k)";
_myc = (b4j.example.magmagrid._mycol)(__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k));
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="If myc.Locked=False And myc.Hidden=False And Not";
if (true) break;

case 4:
//if
this.state = 7;
if (_myc.Locked /*boolean*/ ==parent.__c.False && _myc.Hidden /*boolean*/ ==parent.__c.False && parent.__c.Not((_myc.Controltype /*String*/ ).equals("CHECKBOX") || (_myc.Controltype /*String*/ ).equals("CHECK"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="useB4XTable_CellClicked(myc.Name,SelectedRow)";
__ref._useb4xtable_cellclicked /*void*/ (null,_myc.Name /*String*/ ,__ref._selectedrow /*long*/ );
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 15;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=1376270;
 //BA.debugLineNum = 1376270;BA.debugLine="If SelectedRow < MyList.Size Then";

case 8:
//if
this.state = 13;
if (__ref._selectedrow /*long*/ <__ref._mylist /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
RDebugUtils.currentLine=1376272;
 //BA.debugLineNum = 1376272;BA.debugLine="SelectedRow=SelectedRow+1";
__ref._selectedrow /*long*/  = (long) (__ref._selectedrow /*long*/ +1);
RDebugUtils.currentLine=1376273;
 //BA.debugLineNum = 1376273;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "nexteditablecolumn"),(int) (0));
this.state = 16;
return;
case 16:
//C
this.state = 13;
;
RDebugUtils.currentLine=1376274;
 //BA.debugLineNum = 1376274;BA.debugLine="wait for (GoAtRowAndClick(SelectedRow)) complet";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "nexteditablecolumn"), __ref._goatrowandclick /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._selectedrow /*long*/ ));
this.state = 17;
return;
case 17:
//C
this.state = 13;
_unused = (boolean) result[1];
;
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=1376278;
 //BA.debugLineNum = 1376278;BA.debugLine="SelectedRow=1";
__ref._selectedrow /*long*/  = (long) (1);
RDebugUtils.currentLine=1376279;
 //BA.debugLineNum = 1376279;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "nexteditablecolumn"),(int) (0));
this.state = 18;
return;
case 18:
//C
this.state = 13;
;
RDebugUtils.currentLine=1376280;
 //BA.debugLineNum = 1376280;BA.debugLine="wait for (GoAtRowAndClick(SelectedRow)) complet";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "nexteditablecolumn"), __ref._goatrowandclick /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._selectedrow /*long*/ ));
this.state = 19;
return;
case 19:
//C
this.state = 13;
_unused = (boolean) result[1];
;
 if (true) break;

case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=1376284;
 //BA.debugLineNum = 1376284;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _mynumfield_action(b4j.example.magmagrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "mynumfield_action", false))
	 {return ((String) Debug.delegate(ba, "mynumfield_action", null));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub mynumfield_Action";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="If MyNumField.Text.Trim.Length=0 Then";
if (__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().trim().length()==0) { 
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="MyNumField.Text=SelectedColumn.Defaultvalue";
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Defaultvalue /*String*/ );
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="RowCalcPraxis";
__ref._rowcalcpraxis /*String*/ (null);
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="NextEditableColumn";
__ref._nexteditablecolumn /*void*/ (null);
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="If MyNumField.Text <> \"\" And IsNumber(MyNumField.";
if ((__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false && __c.IsNumber(__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())) { 
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="MyNumField.Text = NumberFormat2(MyNumField.Text,";
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.NumberFormat2((double)(Double.parseDouble(__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())),__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MinIntegers /*int*/ ,__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MinFractions /*int*/ ,__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxFractions /*int*/ ,__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Grouping /*boolean*/ ));
 };
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="RowCalcPraxis";
__ref._rowcalcpraxis /*String*/ (null);
RDebugUtils.currentLine=2097166;
 //BA.debugLineNum = 2097166;BA.debugLine="NextEditableColumn";
__ref._nexteditablecolumn /*void*/ (null);
RDebugUtils.currentLine=2097167;
 //BA.debugLineNum = 2097167;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
RDebugUtils.currentLine=2097168;
 //BA.debugLineNum = 2097168;BA.debugLine="End Sub";
return "";
}
public String  _mytextfield_action(b4j.example.magmagrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "mytextfield_action", false))
	 {return ((String) Debug.delegate(ba, "mytextfield_action", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Private Sub mytextfield_Action";
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="If MyTextField.Text.Trim.Length=0 Then";
if (__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().trim().length()==0) { 
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="MyTextField.Text=SelectedColumn.Defaultvalue";
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Defaultvalue /*String*/ );
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="NextEditableColumn";
__ref._nexteditablecolumn /*void*/ (null);
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
RDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="NextEditableColumn";
__ref._nexteditablecolumn /*void*/ (null);
RDebugUtils.currentLine=2293774;
 //BA.debugLineNum = 2293774;BA.debugLine="End Sub";
return "";
}
public String  _mycheckbox_checkedchange(b4j.example.magmagrid __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "mycheckbox_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "mycheckbox_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub MyCheckBox_CheckedChange(Checked As Bo";
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return "";
}
public String  _mycombofield_selectedindexchanged(b4j.example.magmagrid __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "mycombofield_selectedindexchanged", false))
	 {return ((String) Debug.delegate(ba, "mycombofield_selectedindexchanged", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.collections.Map _map1 = null;
String _afield = "";
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub MyComboField_SelectedIndexChanged(Inde";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="If Index>-1 Then";
if (_index>-1) { 
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="If Index<>MyPrevComboIndex Then";
if (_index!=__ref._myprevcomboindex /*int*/ ) { 
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="Private map1 As Map=SelectedColumn.UseList.Get(";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
_map1 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .UseList /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index)));
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="For Each afield As String In map1.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _map1.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_afield = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="If SelectedColumn.Name<>afield Then";
if ((__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Name /*String*/ ).equals(_afield) == false) { 
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="SetValue(SelectedRow,afield,map1.Get(afield))";
__ref._setvalue /*String*/ (null,__ref._selectedrow /*long*/ ,_afield,_map1.Get((Object)(_afield)));
 }else {
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="SetValue(SelectedRow,afield,Value)";
__ref._setvalue /*String*/ (null,__ref._selectedrow /*long*/ ,_afield,_value);
 };
 }
};
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="MyPrevComboIndex=Index";
__ref._myprevcomboindex /*int*/  = _index;
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="RowCalcPraxis";
__ref._rowcalcpraxis /*String*/ (null);
 };
 };
RDebugUtils.currentLine=2490383;
 //BA.debugLineNum = 2490383;BA.debugLine="End Sub";
return "";
}
public String  _mycombofield_valuechanged(b4j.example.magmagrid __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "mycombofield_valuechanged", false))
	 {return ((String) Debug.delegate(ba, "mycombofield_valuechanged", new Object[] {_value}));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Private Sub MyComboField_ValueChanged (Value As Ob";
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="End Sub";
return "";
}
public String  _mynumfield_focuschanged(b4j.example.magmagrid __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "mynumfield_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "mynumfield_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Private Sub mynumfield_FocusChanged (HasFocus As B";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="noEdit=HasFocus";
__ref._noedit /*boolean*/  = _hasfocus;
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="If HasFocus=True Then";
if (_hasfocus==__c.True) { 
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="PrevColumn=SelectedColumn";
__ref._prevcolumn /*b4j.example.magmagrid._mycol*/  = __ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ ;
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="RowCalcPraxis";
__ref._rowcalcpraxis /*String*/ (null);
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="If HasFocus = False And MyNumField.Text <> \"\" And";
if (_hasfocus==__c.False && (__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false && __c.IsNumber(__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())) { 
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="MyNumField.Text = NumberFormat2(MyNumField.Text,";
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.NumberFormat2((double)(Double.parseDouble(__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())),__ref._prevcolumn /*b4j.example.magmagrid._mycol*/ .MinIntegers /*int*/ ,__ref._prevcolumn /*b4j.example.magmagrid._mycol*/ .MinFractions /*int*/ ,__ref._prevcolumn /*b4j.example.magmagrid._mycol*/ .MaxFractions /*int*/ ,__ref._prevcolumn /*b4j.example.magmagrid._mycol*/ .Grouping /*boolean*/ ));
RDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="RowCalcPraxis";
__ref._rowcalcpraxis /*String*/ (null);
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2162703;
 //BA.debugLineNum = 2162703;BA.debugLine="If HasFocus=False And MyNumField.Text.Trim.Length";
if (_hasfocus==__c.False && __ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().trim().length()==0) { 
RDebugUtils.currentLine=2162704;
 //BA.debugLineNum = 2162704;BA.debugLine="MyNumField.Text=SelectedColumn.Defaultvalue";
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Defaultvalue /*String*/ );
RDebugUtils.currentLine=2162705;
 //BA.debugLineNum = 2162705;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=2162706;
 //BA.debugLineNum = 2162706;BA.debugLine="RowCalcPraxis";
__ref._rowcalcpraxis /*String*/ (null);
RDebugUtils.currentLine=2162707;
 //BA.debugLineNum = 2162707;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
RDebugUtils.currentLine=2162708;
 //BA.debugLineNum = 2162708;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2162710;
 //BA.debugLineNum = 2162710;BA.debugLine="End Sub";
return "";
}
public String  _mynumfield_textchanged(b4j.example.magmagrid __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "mynumfield_textchanged", false))
	 {return ((String) Debug.delegate(ba, "mynumfield_textchanged", new Object[] {_old,_new}));}
boolean _update = false;
String _text = "";
int _firstdot = 0;
String _before = "";
String _after = "";
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub mynumfield_TextChanged (Old As String, New As";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Dim update As Boolean";
_update = false;
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Try";
try {RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="Dim text As String= Regex.Replace(\"[^0-9.]\", New";
_text = __c.Regex.Replace("[^0-9.]",_new,"");
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="Dim firstDot As Int = text.IndexOf(\".\")";
_firstdot = _text.indexOf(".");
RDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="If firstDot > -1 Then";
if (_firstdot>-1) { 
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="Dim before As String = text.SubString2(0, first";
_before = _text.substring((int) (0),(int) (_firstdot+1));
RDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="Dim after As String = Regex.Replace(\"[.]\", text";
_after = __c.Regex.Replace("[.]",_text.substring((int) (_firstdot+1)),"");
RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="text = before & after";
_text = _before+_after;
 };
RDebugUtils.currentLine=2031632;
 //BA.debugLineNum = 2031632;BA.debugLine="If New <> text Then update = True";
if ((_new).equals(_text) == false) { 
_update = __c.True;};
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=2031634;
 //BA.debugLineNum = 2031634;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("72031634",__c.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=2031639;
 //BA.debugLineNum = 2031639;BA.debugLine="If text.Length > SelectedColumn.MaxLength  Then";
if (_text.length()>__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxLength /*int*/ ) { 
RDebugUtils.currentLine=2031640;
 //BA.debugLineNum = 2031640;BA.debugLine="text = text.SubString2(0, SelectedColumn.MaxLeng";
_text = _text.substring((int) (0),__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxLength /*int*/ );
RDebugUtils.currentLine=2031641;
 //BA.debugLineNum = 2031641;BA.debugLine="update = True";
_update = __c.True;
 };
RDebugUtils.currentLine=2031644;
 //BA.debugLineNum = 2031644;BA.debugLine="If text.Trim.Length=0 Then";
if (_text.trim().length()==0) { 
RDebugUtils.currentLine=2031645;
 //BA.debugLineNum = 2031645;BA.debugLine="update=True";
_update = __c.True;
 };
RDebugUtils.currentLine=2031650;
 //BA.debugLineNum = 2031650;BA.debugLine="If update Then";
if (_update) { 
RDebugUtils.currentLine=2031651;
 //BA.debugLineNum = 2031651;BA.debugLine="MyNumField.Text = text";
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_text);
RDebugUtils.currentLine=2031652;
 //BA.debugLineNum = 2031652;BA.debugLine="MyNumField.SetSelection(text.Length, text.Length";
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .SetSelection(_text.length(),_text.length());
 };
RDebugUtils.currentLine=2031656;
 //BA.debugLineNum = 2031656;BA.debugLine="End Sub";
return "";
}
public String  _mytextfield_focuschanged(b4j.example.magmagrid __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "mytextfield_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "mytextfield_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub mytextfield_FocusChanged (HasFocus As";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="noEdit=HasFocus";
__ref._noedit /*boolean*/  = _hasfocus;
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="If HasFocus=False And MyTextField.Text.Trim.Lengt";
if (_hasfocus==__c.False && __ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().trim().length()==0) { 
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="MyTextField.Text=SelectedColumn.Defaultvalue";
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Defaultvalue /*String*/ );
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="If HasFocus=False Then";
if (_hasfocus==__c.False) { 
RDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
 };
RDebugUtils.currentLine=2359311;
 //BA.debugLineNum = 2359311;BA.debugLine="End Sub";
return "";
}
public String  _mytextfield_textchanged(b4j.example.magmagrid __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "mytextfield_textchanged", false))
	 {return ((String) Debug.delegate(ba, "mytextfield_textchanged", new Object[] {_old,_new}));}
boolean _update = false;
String _text = "";
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub mytextfield_TextChanged (Old As String, New As";
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Dim update As Boolean";
_update = false;
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Dim text As String=New";
_text = _new;
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="If SelectedColumn.MaxLength>0 Then";
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxLength /*int*/ >0) { 
RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="If text.Length > SelectedColumn.MaxLength Then";
if (_text.length()>__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxLength /*int*/ ) { 
RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="text = text.SubString2(0, SelectedColumn.MaxLeng";
_text = _text.substring((int) (0),__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxLength /*int*/ );
RDebugUtils.currentLine=2228235;
 //BA.debugLineNum = 2228235;BA.debugLine="update = True";
_update = __c.True;
 };
 };
RDebugUtils.currentLine=2228240;
 //BA.debugLineNum = 2228240;BA.debugLine="If text.Trim.Length=0 Then";
if (_text.trim().length()==0) { 
RDebugUtils.currentLine=2228241;
 //BA.debugLineNum = 2228241;BA.debugLine="update=True";
_update = __c.True;
 };
RDebugUtils.currentLine=2228245;
 //BA.debugLineNum = 2228245;BA.debugLine="If update Then";
if (_update) { 
RDebugUtils.currentLine=2228246;
 //BA.debugLineNum = 2228246;BA.debugLine="MyTextField.Text = text";
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_text);
RDebugUtils.currentLine=2228247;
 //BA.debugLineNum = 2228247;BA.debugLine="MyTextField.SetSelection(text.Length, text.Lengt";
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .SetSelection(_text.length(),_text.length());
 };
RDebugUtils.currentLine=2228251;
 //BA.debugLineNum = 2228251;BA.debugLine="End Sub";
return "";
}
public String  _resizetimer_tick(b4j.example.magmagrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "resizetimer_tick", false))
	 {return ((String) Debug.delegate(ba, "resizetimer_tick", null));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub ResizeTimer_Tick";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="resizeTimer.Enabled = False";
__ref._resizetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="EnableResizeGuidelines";
__ref._enableresizeguidelines /*String*/ (null);
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="End Sub";
return "";
}
public String  _useb4xtable_dataupdated(b4j.example.magmagrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "useb4xtable_dataupdated", false))
	 {return ((String) Debug.delegate(ba, "useb4xtable_dataupdated", null));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub useB4XTable_DataUpdated";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="ie.DataUpdated";
__ref._ie /*b4j.example.inlineediting*/ ._dataupdated /*String*/ (null);
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public void RemoveWarning() throws Exception{
    anywheresoftware.b4a.shell.Shell s = anywheresoftware.b4a.shell.Shell.INSTANCE;
    java.lang.reflect.Field f = s.getClass().getDeclaredField("errorMessagesForSyncEvents");
    f.setAccessible(true);
    java.util.HashSet<String> h = (java.util.HashSet<String>)f.get(s);
    if (h == null) {
        h = new java.util.HashSet<String>();
        f.set(s, h);
    }
    h.add("guidelinepanel_mouseexited");
}
}