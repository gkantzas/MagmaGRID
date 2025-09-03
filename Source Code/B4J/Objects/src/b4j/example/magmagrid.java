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
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Public Sub Initialize(parent As B4XView)";
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="parent.LoadLayout(\"magmagrid\")";
_parent.LoadLayout("magmagrid",ba);
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="xtra.Initialize";
__ref._xtra /*b4j.example.b4xmagmafuncs*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="MyList.Initialize";
__ref._mylist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="MyColumns.Initialize";
__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="HorizontalPraxisList.Initialize";
__ref._horizontalpraxislist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="SelectedColumn.Initialize";
__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Initialize();
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="PrevColumn.Initialize";
__ref._prevcolumn /*b4j.example.magmagrid._mycol*/ .Initialize();
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="Lists.Initialize";
__ref._lists /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="ie.Initialize(useB4XTable, Me, \"ie\")";
__ref._ie /*b4j.example.inlineediting*/ ._initialize /*String*/ (null,ba,__ref._useb4xtable /*b4j.example.b4xtable*/ ,this,"ie");
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="thistable.Initialize(useB4XTable)";
__ref._thistable /*b4j.example.b4xtableselections*/ ._initialize /*String*/ (null,ba,__ref._useb4xtable /*b4j.example.b4xtable*/ );
RDebugUtils.currentLine=589843;
 //BA.debugLineNum = 589843;BA.debugLine="thistable.Mode = thistable.MODE_SINGLE_LINE_PERMA";
__ref._thistable /*b4j.example.b4xtableselections*/ ._setmode /*int*/ (null,__ref._thistable /*b4j.example.b4xtableselections*/ ._mode_single_line_permanent /*int*/ );
RDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="thistable.SelectedTextColor = xui.Color_White";
__ref._thistable /*b4j.example.b4xtableselections*/ ._selectedtextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="thistable.SelectionColor = xui.Color_ARGB(255, 0,";
__ref._thistable /*b4j.example.b4xtableselections*/ ._selectioncolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (0),(int) (148),(int) (255));
RDebugUtils.currentLine=589846;
 //BA.debugLineNum = 589846;BA.debugLine="thistable.AutoRemoveInvisibleSelections = True";
__ref._thistable /*b4j.example.b4xtableselections*/ ._autoremoveinvisibleselections /*boolean*/  = __c.True;
RDebugUtils.currentLine=589848;
 //BA.debugLineNum = 589848;BA.debugLine="myroot=parent.Parent";
__ref._myroot /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent.getParent();
RDebugUtils.currentLine=589849;
 //BA.debugLineNum = 589849;BA.debugLine="MyTextField.Initialize(\"myTextField\")";
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .Initialize(ba,"myTextField");
RDebugUtils.currentLine=589850;
 //BA.debugLineNum = 589850;BA.debugLine="MyNumField.Initialize(\"MyNumField\")";
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .Initialize(ba,"MyNumField");
RDebugUtils.currentLine=589851;
 //BA.debugLineNum = 589851;BA.debugLine="MyComboField.Initialize(\"MyComboField\")";
__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .Initialize(ba,"MyComboField");
RDebugUtils.currentLine=589852;
 //BA.debugLineNum = 589852;BA.debugLine="myroot.AddView(MyTextField,0,0,100,10)";
__ref._myroot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()),0,0,100,10);
RDebugUtils.currentLine=589853;
 //BA.debugLineNum = 589853;BA.debugLine="myroot.AddView(MyNumField,0,0,100,10)";
__ref._myroot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()),0,0,100,10);
RDebugUtils.currentLine=589854;
 //BA.debugLineNum = 589854;BA.debugLine="myroot.AddView(MyComboField,0,0,100,10)";
__ref._myroot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getObject()),0,0,100,10);
RDebugUtils.currentLine=589855;
 //BA.debugLineNum = 589855;BA.debugLine="MyComboField.RemoveNodeFromParent";
__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .RemoveNodeFromParent();
RDebugUtils.currentLine=589856;
 //BA.debugLineNum = 589856;BA.debugLine="MyTextField.RemoveNodeFromParent";
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .RemoveNodeFromParent();
RDebugUtils.currentLine=589857;
 //BA.debugLineNum = 589857;BA.debugLine="MyNumField.RemoveNodeFromParent";
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .RemoveNodeFromParent();
RDebugUtils.currentLine=589859;
 //BA.debugLineNum = 589859;BA.debugLine="useB4XTable.RowHeight=50dip";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._rowheight /*int*/  = __c.DipToCurrent((int) (50));
RDebugUtils.currentLine=589861;
 //BA.debugLineNum = 589861;BA.debugLine="ie.TableResized";
__ref._ie /*b4j.example.inlineediting*/ ._tableresized /*String*/ (null);
RDebugUtils.currentLine=589863;
 //BA.debugLineNum = 589863;BA.debugLine="AddKeyPressedListener";
__ref._addkeypressedlistener /*String*/ (null);
RDebugUtils.currentLine=589866;
 //BA.debugLineNum = 589866;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=589867;
 //BA.debugLineNum = 589867;BA.debugLine="jo.RunMethod(\"RemoveWarning\", Null)";
_jo.RunMethod("RemoveWarning",(Object[])(__c.Null));
RDebugUtils.currentLine=589870;
 //BA.debugLineNum = 589870;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub AddColumn(Name As String, Hidden As Boo";
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="Dim MyColumn As mycol";
_mycolumn = new b4j.example.magmagrid._mycol();
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="MyColumn.Initialize";
_mycolumn.Initialize();
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="MyColumn.Name=Name";
_mycolumn.Name /*String*/  = _name;
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="MyColumn.Hidden=Hidden";
_mycolumn.Hidden /*boolean*/  = _hidden;
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="MyColumn.Locked=Locked";
_mycolumn.Locked /*boolean*/  = _locked;
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="MyColumn.Sortable=Sortable";
_mycolumn.Sortable /*boolean*/  = _sortable;
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="MyColumn.Width1=Width1";
_mycolumn.Width1 /*int*/  = _width1;
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="MyColumn.Controltype=Controltype";
_mycolumn.Controltype /*String*/  = _controltype;
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="MyColumn.Defaultvalue=Defaultvalue";
_mycolumn.Defaultvalue /*String*/  = _defaultvalue;
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="MyColumn.UseList=UseList";
_mycolumn.UseList /*anywheresoftware.b4a.objects.collections.List*/  = _uselist;
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="If Controltype.Trim.ToUpperCase.Contains(\"NUMERIC";
if (_controltype.trim().toUpperCase().contains("NUMERIC") && _maxlength==0) { 
RDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="MaxLength=15";
_maxlength = (int) (15);
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="MyColumn.MaxLength=MaxLength";
_mycolumn.MaxLength /*int*/  = _maxlength;
 };
RDebugUtils.currentLine=1048595;
 //BA.debugLineNum = 1048595;BA.debugLine="MyColumn.MaxLength=MaxLength";
_mycolumn.MaxLength /*int*/  = _maxlength;
RDebugUtils.currentLine=1048597;
 //BA.debugLineNum = 1048597;BA.debugLine="MyColumn.MinValue=MinValue";
_mycolumn.MinValue /*double*/  = _minvalue;
RDebugUtils.currentLine=1048598;
 //BA.debugLineNum = 1048598;BA.debugLine="MyColumn.MaxValue=MaxValue";
_mycolumn.MaxValue /*double*/  = _maxvalue;
RDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="If MinIntegers=0 And MinFractions=0 And MaxFracti";
if (_minintegers==0 && _minfractions==0 && _maxfractions==0) { 
RDebugUtils.currentLine=1048601;
 //BA.debugLineNum = 1048601;BA.debugLine="MinIntegers=1";
_minintegers = (int) (1);
RDebugUtils.currentLine=1048602;
 //BA.debugLineNum = 1048602;BA.debugLine="MinFractions=0";
_minfractions = (int) (0);
RDebugUtils.currentLine=1048603;
 //BA.debugLineNum = 1048603;BA.debugLine="MaxFractions=5";
_maxfractions = (int) (5);
 };
RDebugUtils.currentLine=1048605;
 //BA.debugLineNum = 1048605;BA.debugLine="MyColumn.MinIntegers=MinIntegers";
_mycolumn.MinIntegers /*int*/  = _minintegers;
RDebugUtils.currentLine=1048606;
 //BA.debugLineNum = 1048606;BA.debugLine="MyColumn.MinFractions=MinFractions";
_mycolumn.MinFractions /*int*/  = _minfractions;
RDebugUtils.currentLine=1048607;
 //BA.debugLineNum = 1048607;BA.debugLine="MyColumn.MaxFractions=MaxFractions";
_mycolumn.MaxFractions /*int*/  = _maxfractions;
RDebugUtils.currentLine=1048609;
 //BA.debugLineNum = 1048609;BA.debugLine="MyColumn.Grouping=Grouping";
_mycolumn.Grouping /*boolean*/  = _grouping;
RDebugUtils.currentLine=1048612;
 //BA.debugLineNum = 1048612;BA.debugLine="Dim myb4xformat As B4XFormatter";
_myb4xformat = new b4j.example.b4xformatter();
RDebugUtils.currentLine=1048613;
 //BA.debugLineNum = 1048613;BA.debugLine="myb4xformat.Initialize";
_myb4xformat._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1048614;
 //BA.debugLineNum = 1048614;BA.debugLine="If Grouping=False Then";
if (_grouping==__c.False) { 
RDebugUtils.currentLine=1048615;
 //BA.debugLineNum = 1048615;BA.debugLine="myb4xformat.GetDefaultFormat.GroupingCharacter=\"";
_myb4xformat._getdefaultformat /*b4j.example.b4xformatter._b4xformatdata*/ (null).GroupingCharacter /*String*/  = "";
 }else {
RDebugUtils.currentLine=1048617;
 //BA.debugLineNum = 1048617;BA.debugLine="If DecimalSeparator=\".\" Then";
if ((__ref._decimalseparator /*String*/ ).equals(".")) { 
RDebugUtils.currentLine=1048618;
 //BA.debugLineNum = 1048618;BA.debugLine="myb4xformat.GetDefaultFormat.GroupingCharacter=";
_myb4xformat._getdefaultformat /*b4j.example.b4xformatter._b4xformatdata*/ (null).GroupingCharacter /*String*/  = ",";
 }else {
RDebugUtils.currentLine=1048620;
 //BA.debugLineNum = 1048620;BA.debugLine="myb4xformat.GetDefaultFormat.GroupingCharacter=";
_myb4xformat._getdefaultformat /*b4j.example.b4xformatter._b4xformatdata*/ (null).GroupingCharacter /*String*/  = ".";
 };
 };
RDebugUtils.currentLine=1048623;
 //BA.debugLineNum = 1048623;BA.debugLine="myb4xformat.GetDefaultFormat.MinimumIntegers=MinI";
_myb4xformat._getdefaultformat /*b4j.example.b4xformatter._b4xformatdata*/ (null).MinimumIntegers /*int*/  = _minintegers;
RDebugUtils.currentLine=1048624;
 //BA.debugLineNum = 1048624;BA.debugLine="myb4xformat.GetDefaultFormat.minimumFractions=Min";
_myb4xformat._getdefaultformat /*b4j.example.b4xformatter._b4xformatdata*/ (null).MinimumFractions /*int*/  = _minfractions;
RDebugUtils.currentLine=1048625;
 //BA.debugLineNum = 1048625;BA.debugLine="myb4xformat.GetDefaultFormat.MaximumFractions=Max";
_myb4xformat._getdefaultformat /*b4j.example.b4xformatter._b4xformatdata*/ (null).MaximumFractions /*int*/  = _maxfractions;
RDebugUtils.currentLine=1048628;
 //BA.debugLineNum = 1048628;BA.debugLine="MyColumn.Alignment=Alignment";
_mycolumn.Alignment /*String*/  = _alignment;
RDebugUtils.currentLine=1048630;
 //BA.debugLineNum = 1048630;BA.debugLine="MyColumns.Add(MyColumn)";
__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_mycolumn));
RDebugUtils.currentLine=1048632;
 //BA.debugLineNum = 1048632;BA.debugLine="Select Case Controltype";
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
RDebugUtils.currentLine=1048634;
 //BA.debugLineNum = 1048634;BA.debugLine="useB4XTable.AddColumn(Name,useB4XTable.COLUMN_T";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,_name,__ref._useb4xtable /*b4j.example.b4xtable*/ ._column_type_text /*int*/ );
 break; }
case 10: {
RDebugUtils.currentLine=1048637;
 //BA.debugLineNum = 1048637;BA.debugLine="useB4XTable.AddColumn(Name,useB4XTable.COLUMN_T";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,_name,__ref._useb4xtable /*b4j.example.b4xtable*/ ._column_type_numbers /*int*/ );
 break; }
case 11: {
RDebugUtils.currentLine=1048640;
 //BA.debugLineNum = 1048640;BA.debugLine="useB4XTable.AddColumn(Name,useB4XTable.COLUMN_T";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,_name,__ref._useb4xtable /*b4j.example.b4xtable*/ ._column_type_date /*int*/ );
 break; }
case 12: {
RDebugUtils.currentLine=1048643;
 //BA.debugLineNum = 1048643;BA.debugLine="useB4XTable.AddColumn(Name,useB4XTable.COLUMN_T";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._addcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,_name,__ref._useb4xtable /*b4j.example.b4xtable*/ ._column_type_void /*int*/ );
 break; }
}
;
RDebugUtils.currentLine=1048648;
 //BA.debugLineNum = 1048648;BA.debugLine="Dim thisColumn As B4XTableColumn=useB4XTable.Get";
_thiscolumn = __ref._useb4xtable /*b4j.example.b4xtable*/ ._getcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,_name);
RDebugUtils.currentLine=1048649;
 //BA.debugLineNum = 1048649;BA.debugLine="thisColumn.Sortable=Sortable";
_thiscolumn.Sortable /*boolean*/  = _sortable;
RDebugUtils.currentLine=1048652;
 //BA.debugLineNum = 1048652;BA.debugLine="If Controltype.Contains(\"NUMERIC\") Then thisColu";
if (_controltype.contains("NUMERIC")) { 
_thiscolumn.Formatter /*b4j.example.b4xformatter*/  = _myb4xformat;};
RDebugUtils.currentLine=1048653;
 //BA.debugLineNum = 1048653;BA.debugLine="If Hidden=False Then";
if (_hidden==__c.False) { 
RDebugUtils.currentLine=1048654;
 //BA.debugLineNum = 1048654;BA.debugLine="thisColumn.Width=Width1";
_thiscolumn.Width /*int*/  = _width1;
 }else {
RDebugUtils.currentLine=1048656;
 //BA.debugLineNum = 1048656;BA.debugLine="thisColumn.Width=1";
_thiscolumn.Width /*int*/  = (int) (1);
 };
RDebugUtils.currentLine=1048660;
 //BA.debugLineNum = 1048660;BA.debugLine="If Alignment.trim=\"\" Then";
if ((_alignment.trim()).equals("")) { 
RDebugUtils.currentLine=1048661;
 //BA.debugLineNum = 1048661;BA.debugLine="Select Case Controltype";
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
RDebugUtils.currentLine=1048664;
 //BA.debugLineNum = 1048664;BA.debugLine="If Controltype=\"TEXTFIELD_NUMERIC\" Then";
if ((_controltype).equals("TEXTFIELD_NUMERIC")) { 
RDebugUtils.currentLine=1048665;
 //BA.debugLineNum = 1048665;BA.debugLine="SetColumnAlignment(useB4XTable,Name,\"LEFT\")";
__ref._setcolumnalignment /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ,_name,"LEFT");
 }else {
RDebugUtils.currentLine=1048667;
 //BA.debugLineNum = 1048667;BA.debugLine="SetColumnAlignment(useB4XTable,Name,\"RIGHT\")";
__ref._setcolumnalignment /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ,_name,"RIGHT");
 };
 break; }
case 10: {
RDebugUtils.currentLine=1048671;
 //BA.debugLineNum = 1048671;BA.debugLine="SetColumnAlignment(useB4XTable,Name,\"CENTER\")";
__ref._setcolumnalignment /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ,_name,"CENTER");
 break; }
case 11: {
RDebugUtils.currentLine=1048674;
 //BA.debugLineNum = 1048674;BA.debugLine="SetColumnAlignment(useB4XTable,Name,\"CENTER\")";
__ref._setcolumnalignment /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ,_name,"CENTER");
 break; }
}
;
 }else {
RDebugUtils.currentLine=1048677;
 //BA.debugLineNum = 1048677;BA.debugLine="SetColumnAlignment(useB4XTable,Name,Alignment)";
__ref._setcolumnalignment /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ,_name,_alignment);
 };
RDebugUtils.currentLine=1048681;
 //BA.debugLineNum = 1048681;BA.debugLine="If UseList = Null Or UseList.IsInitialized = Fals";
if (_uselist== null || _uselist.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=1048682;
 //BA.debugLineNum = 1048682;BA.debugLine="Dim tmp As List";
_tmp = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1048683;
 //BA.debugLineNum = 1048683;BA.debugLine="tmp.Initialize";
_tmp.Initialize();
RDebugUtils.currentLine=1048684;
 //BA.debugLineNum = 1048684;BA.debugLine="UseList = tmp";
_uselist = _tmp;
 };
RDebugUtils.currentLine=1048686;
 //BA.debugLineNum = 1048686;BA.debugLine="Lists.add(UseList)";
__ref._lists /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_uselist.getObject()));
RDebugUtils.currentLine=1048689;
 //BA.debugLineNum = 1048689;BA.debugLine="End Sub";
return "";
}
public String  _addhorizontalpraxis(b4j.example.magmagrid __ref,String _apraxis) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "addhorizontalpraxis", false))
	 {return ((String) Debug.delegate(ba, "addhorizontalpraxis", new Object[] {_apraxis}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="public Sub AddHorizontalPraxis(apraxis As String)";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="HorizontalPraxisList.Add(apraxis)";
__ref._horizontalpraxislist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_apraxis));
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub AlignAllCols";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="useB4XTable.MaximumRowsPerPage = 20";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._maximumrowsperpage /*int*/  = (int) (20);
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="useB4XTable.BuildLayoutsCache(useB4XTable.Maximum";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._buildlayoutscache /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ._maximumrowsperpage /*int*/ );
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="If xui.IsB4J Then useB4XTable.HighlightSearchResu";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
__ref._useb4xtable /*b4j.example.b4xtable*/ ._highlightsearchresults /*boolean*/  = __c.False;};
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="For k=0 To MyColumns.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_k = (int) (0) ;
for (;_k <= limit4 ;_k = _k + step4 ) {
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="Dim myc As mycol=MyColumns.Get(k)";
_myc = (b4j.example.magmagrid._mycol)(__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k));
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="Dim alignment As String=myc.Alignment";
_alignment = _myc.Alignment /*String*/ ;
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="If alignment.trim=\"\" Then";
if ((_alignment.trim()).equals("")) { 
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="Select Case myc.Controltype";
switch (BA.switchObjectToInt(_myc.Controltype /*String*/ ,"TEXTFIELD","TEXTAREA","COMBO","COMBO","COMBOEDIT","COMBOFIELD","COMBOEDITFIELD","PICTURE","EDITCONTROLS","DATE")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: 
case 7: {
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="If myc.Controltype=\"TEXTFIELD_NUMERIC\" Then";
if ((_myc.Controltype /*String*/ ).equals("TEXTFIELD_NUMERIC")) { 
RDebugUtils.currentLine=1245199;
 //BA.debugLineNum = 1245199;BA.debugLine="SetColumnAlignment(useB4XTable,myc.Name,\"LEF";
__ref._setcolumnalignment /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ,_myc.Name /*String*/ ,"LEFT");
 }else {
RDebugUtils.currentLine=1245201;
 //BA.debugLineNum = 1245201;BA.debugLine="SetColumnAlignment(useB4XTable,myc.Name,\"RIG";
__ref._setcolumnalignment /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ,_myc.Name /*String*/ ,"RIGHT");
 };
 break; }
case 8: {
RDebugUtils.currentLine=1245205;
 //BA.debugLineNum = 1245205;BA.debugLine="SetColumnAlignment(useB4XTable,myc.Name,\"CENT";
__ref._setcolumnalignment /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ,_myc.Name /*String*/ ,"CENTER");
 break; }
case 9: {
RDebugUtils.currentLine=1245208;
 //BA.debugLineNum = 1245208;BA.debugLine="SetColumnAlignment(useB4XTable,myc.Name,\"CENT";
__ref._setcolumnalignment /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ,_myc.Name /*String*/ ,"CENTER");
 break; }
}
;
 }else {
RDebugUtils.currentLine=1245211;
 //BA.debugLineNum = 1245211;BA.debugLine="SetColumnAlignment(useB4XTable,myc.Name,alignme";
__ref._setcolumnalignment /*String*/ (null,__ref._useb4xtable /*b4j.example.b4xtable*/ ,_myc.Name /*String*/ ,_alignment);
 };
 }
};
RDebugUtils.currentLine=1245216;
 //BA.debugLineNum = 1245216;BA.debugLine="useB4XTable.Refresh";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._refresh /*String*/ (null);
RDebugUtils.currentLine=1245219;
 //BA.debugLineNum = 1245219;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="wait for (useB4XTable.SetData(mylist1)) complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "setdata"), __ref._useb4xtable /*b4j.example.b4xtable*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_mylist1));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="MyList=mylist1";
__ref._mylist /*anywheresoftware.b4a.objects.collections.List*/  = _mylist1;
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="CalcAll";
__ref._calcall /*String*/ (null);
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "setdata"),(int) (0));
this.state = 12;
return;
case 12:
//C
this.state = 1;
;
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="Dim previousColumnWidths(useB4XTable.Columns.Size";
parent._previouscolumnwidths = new int[__ref._useb4xtable /*b4j.example.b4xtable*/ ._columns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
;
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="removableGuidelines.Initialize";
__ref._removableguidelines /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="For colIndex = 0 To useB4XTable.visibleColumns.Si";
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
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="Dim tableCol As B4XTableColumn = useB4XTable.vis";
_tablecol = (b4j.example.b4xtable._b4xtablecolumn)(__ref._useb4xtable /*b4j.example.b4xtable*/ ._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_colindex));
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="previousColumnWidths(colIndex) = tableCol.Width";
__ref._previouscolumnwidths /*int[]*/ [_colindex] = _tablecol.Width /*int*/ ;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=786447;
 //BA.debugLineNum = 786447;BA.debugLine="If allowColumnResize = True Then";

case 4:
//if
this.state = 7;
if (__ref._allowcolumnresize /*boolean*/ ==parent.__c.True) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=786448;
 //BA.debugLineNum = 786448;BA.debugLine="resizeTimer.Initialize(\"ResizeTimer\", 100)";
__ref._resizetimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"ResizeTimer",(long) (100));
RDebugUtils.currentLine=786449;
 //BA.debugLineNum = 786449;BA.debugLine="resizeTimer.Enabled = True";
__ref._resizetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.True);
 if (true) break;
;
RDebugUtils.currentLine=786451;
 //BA.debugLineNum = 786451;BA.debugLine="If guidelinePanel.IsInitialized Then";

case 7:
//if
this.state = 10;
if (__ref._guidelinepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=786452;
 //BA.debugLineNum = 786452;BA.debugLine="EnableResizeGuidelines";
__ref._enableresizeguidelines /*String*/ (null);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=786456;
 //BA.debugLineNum = 786456;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="public Sub SumRows(ColumnID As String, sqlstring A";
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="If sqlstring.Trim.Length=0 Then";
if (_sqlstring.trim().length()==0) { 
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="Dim c As B4XTableColumn = useB4XTable.GetColumn(";
_c = __ref._useb4xtable /*b4j.example.b4xtable*/ ._getcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,_columnid);
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="Dim rs As ResultSet=useB4XTable.sql1.ExecQuery(\"";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._useb4xtable /*b4j.example.b4xtable*/ ._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT SUM("+_c.SQLID /*String*/ .trim()+") AS Total_sum FROM data;");
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="Return rs.GetDouble2(0)";
if (true) return _rs.GetDouble2((int) (0));
 }else {
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="For k=0 To MyColumns.Size-1";
{
final int step8 = 1;
final int limit8 = (int) (__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_k = (int) (0) ;
for (;_k <= limit8 ;_k = _k + step8 ) {
RDebugUtils.currentLine=2621452;
 //BA.debugLineNum = 2621452;BA.debugLine="Private myc As mycol=MyColumns.Get(k)";
_myc = (b4j.example.magmagrid._mycol)(__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k));
RDebugUtils.currentLine=2621453;
 //BA.debugLineNum = 2621453;BA.debugLine="Dim c As B4XTableColumn = useB4XTable.GetColumn";
_c = __ref._useb4xtable /*b4j.example.b4xtable*/ ._getcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,_myc.Name /*String*/ );
RDebugUtils.currentLine=2621454;
 //BA.debugLineNum = 2621454;BA.debugLine="sqlstring=sqlstring.Replace(\"[\" & myc.Name & \"]";
_sqlstring = _sqlstring.replace("["+_myc.Name /*String*/ +"]",_c.SQLID /*String*/ );
 }
};
RDebugUtils.currentLine=2621456;
 //BA.debugLineNum = 2621456;BA.debugLine="Dim rs As ResultSet=useB4XTable.sql1.ExecQuery(s";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._useb4xtable /*b4j.example.b4xtable*/ ._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(_sqlstring);
RDebugUtils.currentLine=2621457;
 //BA.debugLineNum = 2621457;BA.debugLine="Return rs.GetDouble2(0)";
if (true) return _rs.GetDouble2((int) (0));
 };
RDebugUtils.currentLine=2621460;
 //BA.debugLineNum = 2621460;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="public Sub GetData As List";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Dim list1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="list1.Initialize";
_list1.Initialize();
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="Dim rs As ResultSet = useB4XTable.SQL1.ExecQuery(";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._useb4xtable /*b4j.example.b4xtable*/ ._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT * FROM data");
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="Dim colCount As Int = rs.ColumnCount";
_colcount = _rs.getColumnCount();
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="Dim rowArray(colCount) As Object";
_rowarray = new Object[_colcount];
{
int d0 = _rowarray.length;
for (int i0 = 0;i0 < d0;i0++) {
_rowarray[i0] = new Object();
}
}
;
RDebugUtils.currentLine=2686987;
 //BA.debugLineNum = 2686987;BA.debugLine="For i = 0 To colCount - 1";
{
final int step7 = 1;
final int limit7 = (int) (_colcount-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=2686988;
 //BA.debugLineNum = 2686988;BA.debugLine="rowArray(i) = rs.GetString2(i)";
_rowarray[_i] = (Object)(_rs.GetString2(_i));
 }
};
RDebugUtils.currentLine=2686991;
 //BA.debugLineNum = 2686991;BA.debugLine="list1.Add(rowArray)";
_list1.Add((Object)(_rowarray));
 }
;
RDebugUtils.currentLine=2686994;
 //BA.debugLineNum = 2686994;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=2686996;
 //BA.debugLineNum = 2686996;BA.debugLine="Return list1";
if (true) return _list1;
RDebugUtils.currentLine=2686998;
 //BA.debugLineNum = 2686998;BA.debugLine="End Sub";
return null;
}
public String  _calcall(b4j.example.magmagrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "calcall", false))
	 {return ((String) Debug.delegate(ba, "calcall", null));}
long _prevsel = 0L;
int _k = 0;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub CalcAll";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Dim prevsel As Long=SelectedRow";
_prevsel = __ref._selectedrow /*long*/ ;
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="For k=1 To MyList.Size";
{
final int step2 = 1;
final int limit2 = __ref._mylist /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
_k = (int) (1) ;
for (;_k <= limit2 ;_k = _k + step2 ) {
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="SelectedRow=k";
__ref._selectedrow /*long*/  = (long) (_k);
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="RowCalcPraxis";
__ref._rowcalcpraxis /*String*/ (null);
 }
};
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="SelectedRow=prevsel";
__ref._selectedrow /*long*/  = _prevsel;
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="private Sub SetColumnAlignment(tableName As B4XTab";
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Dim column As B4XTableColumn = tableName.GetColum";
_column = _tablename._getcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,_columnid);
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="For i = 1 To column.CellsLayouts.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_column.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (1) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="Dim pnl As B4XView = column.CellsLayouts.Get(i)";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_column.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="pnl.GetView(0).SetTextAlignment(\"CENTER\", alignm";
_pnl.GetView((int) (0)).SetTextAlignment("CENTER",_alignment.toUpperCase());
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="Dim lbl As Label = pnl.GetView(0)";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_pnl.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="lbl.Style=\"-fx-padding: 5;\"";
_lbl.setStyle("-fx-padding: 5;");
 }
};
RDebugUtils.currentLine=1376271;
 //BA.debugLineNum = 1376271;BA.debugLine="End Sub";
return "";
}
public String  _addkeypressedlistener(b4j.example.magmagrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "addkeypressedlistener", false))
	 {return ((String) Debug.delegate(ba, "addkeypressedlistener", null));}
anywheresoftware.b4j.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub AddKeyPressedListener";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="r.Target = myroot'B4XPages.GetNativeParent(Root)";
_r.Target = (Object)(__ref._myroot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject());
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="r.AddEventFilter(\"keypressed\", \"javafx.scene.inpu";
_r.AddEventFilter(ba,"keypressed","javafx.scene.input.KeyEvent.ANY");
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="End Sub";
return "";
}
public String  _b4xtable1_dataupdated(b4j.example.magmagrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "b4xtable1_dataupdated", false))
	 {return ((String) Debug.delegate(ba, "b4xtable1_dataupdated", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub B4XTable1_DataUpdated";
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="public Sub RowCalcPraxis";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Private HeaderValues(MyColumns.Size) As String";
_headervalues = new String[__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
java.util.Arrays.fill(_headervalues,"");
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="For k=0 To MyColumns.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_k = (int) (0) ;
for (;_k <= limit2 ;_k = _k + step2 ) {
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Private myc As mycol=MyColumns.Get(k)";
_myc = (b4j.example.magmagrid._mycol)(__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k));
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="HeaderValues(k)= myc.Name";
_headervalues[_k] = _myc.Name /*String*/ ;
 }
};
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="For k=0 To HorizontalPraxisList.Size-1";
{
final int step6 = 1;
final int limit6 = (int) (__ref._horizontalpraxislist /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_k = (int) (0) ;
for (;_k <= limit6 ;_k = _k + step6 ) {
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="Private MapValues As Map = useB4XTable.GetRow(Se";
_mapvalues = new anywheresoftware.b4a.objects.collections.Map();
_mapvalues = __ref._useb4xtable /*b4j.example.b4xtable*/ ._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._selectedrow /*long*/ );
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="Dim myinput As String=HorizontalPraxisList.Get(k";
_myinput = BA.ObjectToString(__ref._horizontalpraxislist /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k));
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="Dim parts() As String = Regex.Split(\"=\", myinput";
_parts = __c.Regex.Split("=",_myinput);
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="Dim tocolumn As String=parts(0).Replace(\"[\",\"\").";
_tocolumn = _parts[(int) (0)].replace("[","").replace("]","");
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="Dim apraxis As String=parts(1)";
_apraxis = _parts[(int) (1)];
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="For c=0 To HeaderValues.Length-1";
{
final int step12 = 1;
final int limit12 = (int) (_headervalues.length-1);
_c = (int) (0) ;
for (;_c <= limit12 ;_c = _c + step12 ) {
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="apraxis = apraxis.Replace(\"[\" & HeaderValues(c)";
_apraxis = _apraxis.replace("["+_headervalues[_c]+"]",BA.ObjectToString(_mapvalues.GetValueAt(_c)));
 }
};
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="Dim eeval As B4XEval";
_eeval = new b4j.example.b4xeval();
RDebugUtils.currentLine=983058;
 //BA.debugLineNum = 983058;BA.debugLine="eeval.Initialize(Me, \"Eval\")";
_eeval._initialize /*String*/ (null,ba,this,"Eval");
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="Dim DDtotal As Double=eeval.Eval(apraxis)";
_ddtotal = _eeval._eval /*double*/ (null,_apraxis);
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="SetValue(SelectedRow, tocolumn, DDtotal)";
__ref._setvalue /*String*/ (null,__ref._selectedrow /*long*/ ,_tocolumn,(Object)(_ddtotal));
 }
};
RDebugUtils.currentLine=983063;
 //BA.debugLineNum = 983063;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.magmagrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="Public useB4XTable As B4XTable";
_useb4xtable = new b4j.example.b4xtable();
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="Type mycol(Name As String, Hidden As Boolean, Loc";
;
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="Public MyList As List";
_mylist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="Public MyColumns As List";
_mycolumns = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="Public HorizontalPraxisList As List";
_horizontalpraxislist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="Private Lists As List";
_lists = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="Private ie As InlineEditing";
_ie = new b4j.example.inlineediting();
RDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="Private thistable As B4XTableSelections";
_thistable = new b4j.example.b4xtableselections();
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="Private TheIndexCol As Int = 0	'Where is the valu";
_theindexcol = (int) (0);
RDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="Private ID As String";
_id = "";
RDebugUtils.currentLine=524307;
 //BA.debugLineNum = 524307;BA.debugLine="Private DecimalSeparator As String = \".\"";
_decimalseparator = ".";
RDebugUtils.currentLine=524309;
 //BA.debugLineNum = 524309;BA.debugLine="Private PrevColumn As mycol";
_prevcolumn = new b4j.example.magmagrid._mycol();
RDebugUtils.currentLine=524310;
 //BA.debugLineNum = 524310;BA.debugLine="Public SelectedColumn As mycol";
_selectedcolumn = new b4j.example.magmagrid._mycol();
RDebugUtils.currentLine=524311;
 //BA.debugLineNum = 524311;BA.debugLine="Public SelectedRow As Long";
_selectedrow = 0L;
RDebugUtils.currentLine=524313;
 //BA.debugLineNum = 524313;BA.debugLine="Private myroot As B4XView";
_myroot = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=524316;
 //BA.debugLineNum = 524316;BA.debugLine="Private MyTextField As TextField";
_mytextfield = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=524317;
 //BA.debugLineNum = 524317;BA.debugLine="Private MyNumField As TextField";
_mynumfield = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=524318;
 //BA.debugLineNum = 524318;BA.debugLine="Private MyComboField As ComboBox";
_mycombofield = new anywheresoftware.b4j.objects.ComboBoxWrapper();
RDebugUtils.currentLine=524319;
 //BA.debugLineNum = 524319;BA.debugLine="Private MyPrevComboIndex As Int = -1";
_myprevcomboindex = (int) (-1);
RDebugUtils.currentLine=524320;
 //BA.debugLineNum = 524320;BA.debugLine="Private noEdit As Boolean = False";
_noedit = __c.False;
RDebugUtils.currentLine=524322;
 //BA.debugLineNum = 524322;BA.debugLine="Private xtra As B4XMagmaFuncs";
_xtra = new b4j.example.b4xmagmafuncs();
RDebugUtils.currentLine=524326;
 //BA.debugLineNum = 524326;BA.debugLine="Private guidelinePanel As B4XView           ' Tem";
_guidelinepanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=524327;
 //BA.debugLineNum = 524327;BA.debugLine="Private isResizing As Boolean = False       ' Tra";
_isresizing = __c.False;
RDebugUtils.currentLine=524328;
 //BA.debugLineNum = 524328;BA.debugLine="Private removableGuidelines As List         ' Lis";
_removableguidelines = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=524329;
 //BA.debugLineNum = 524329;BA.debugLine="Private resizeTimer As Timer                ' Tim";
_resizetimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=524330;
 //BA.debugLineNum = 524330;BA.debugLine="Private previousColumnWidths() As Int       ' Col";
_previouscolumnwidths = new int[(int) (0)];
;
RDebugUtils.currentLine=524331;
 //BA.debugLineNum = 524331;BA.debugLine="Public allowColumnResize As Boolean=True";
_allowcolumnresize = __c.True;
RDebugUtils.currentLine=524332;
 //BA.debugLineNum = 524332;BA.debugLine="Private cumulativeDelta As Int";
_cumulativedelta = 0;
RDebugUtils.currentLine=524333;
 //BA.debugLineNum = 524333;BA.debugLine="Private startColumnWidth As Int";
_startcolumnwidth = 0;
RDebugUtils.currentLine=524334;
 //BA.debugLineNum = 524334;BA.debugLine="Private currentColumn As B4XTableColumn";
_currentcolumn = new b4j.example.b4xtable._b4xtablecolumn();
RDebugUtils.currentLine=524335;
 //BA.debugLineNum = 524335;BA.debugLine="Private currentPanel As B4XView";
_currentpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=524339;
 //BA.debugLineNum = 524339;BA.debugLine="End Sub";
return "";
}
public String  _deleterow(b4j.example.magmagrid __ref,long _rowid) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "deleterow", false))
	 {return ((String) Debug.delegate(ba, "deleterow", new Object[] {_rowid}));}
RDebugUtils.currentLine=48365568;
 //BA.debugLineNum = 48365568;BA.debugLine="Public Sub DeleteRow(rowid As Long)";
RDebugUtils.currentLine=48365570;
 //BA.debugLineNum = 48365570;BA.debugLine="useB4XTable.sql1.ExecnonQuery(\"DELETE FROM data W";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("DELETE FROM data WHERE rowid="+BA.NumberToString(_rowid)+";");
RDebugUtils.currentLine=48365571;
 //BA.debugLineNum = 48365571;BA.debugLine="useB4XTable.Refresh";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._refresh /*String*/ (null);
RDebugUtils.currentLine=48365573;
 //BA.debugLineNum = 48365573;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub EnableResizeGuidelines";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="If isResizing = False Then";
if (__ref._isresizing /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="resizeTimer.Enabled = False";
__ref._resizetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="isResizing = True";
__ref._isresizing /*boolean*/  = __c.True;
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="If removableGuidelines.IsInitialized Then";
if (__ref._removableguidelines /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="For Each pnl As B4XView In removableGuidelines";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._removableguidelines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_pnl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group5.Get(index5)));
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="pnl.RemoveViewFromParent";
_pnl.RemoveViewFromParent();
 }
};
 };
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="Dim clv As CustomListView = useB4XTable.clvData";
_clv = __ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=2818060;
 //BA.debugLineNum = 2818060;BA.debugLine="Dim scrollX As Int = clv.sv.ScrollViewOffsetX";
_scrollx = (int) (_clv._sv.getScrollViewOffsetX());
RDebugUtils.currentLine=2818061;
 //BA.debugLineNum = 2818061;BA.debugLine="Dim baseX As Int = useB4XTable.mBase.Left + clv.";
_basex = (int) (__ref._useb4xtable /*b4j.example.b4xtable*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+_clv._getbase().getLeft()-_scrollx+__ref._useb4xtable /*b4j.example.b4xtable*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().getLeft());
RDebugUtils.currentLine=2818063;
 //BA.debugLineNum = 2818063;BA.debugLine="removableGuidelines.Clear";
__ref._removableguidelines /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=2818064;
 //BA.debugLineNum = 2818064;BA.debugLine="Dim colX As Int = baseX";
_colx = _basex;
RDebugUtils.currentLine=2818065;
 //BA.debugLineNum = 2818065;BA.debugLine="For col = 0 To useB4XTable.visibleColumns.Size -";
{
final int step14 = 1;
final int limit14 = (int) (__ref._useb4xtable /*b4j.example.b4xtable*/ ._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_col = (int) (0) ;
for (;_col <= limit14 ;_col = _col + step14 ) {
RDebugUtils.currentLine=2818066;
 //BA.debugLineNum = 2818066;BA.debugLine="Dim tableCol As B4XTableColumn = useB4XTable.vi";
_tablecol = (b4j.example.b4xtable._b4xtablecolumn)(__ref._useb4xtable /*b4j.example.b4xtable*/ ._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_col));
RDebugUtils.currentLine=2818067;
 //BA.debugLineNum = 2818067;BA.debugLine="colX = colX + tableCol.Width";
_colx = (int) (_colx+_tablecol.Width /*int*/ );
RDebugUtils.currentLine=2818069;
 //BA.debugLineNum = 2818069;BA.debugLine="Dim guidelinePanel As B4XView = xui.CreatePanel";
_guidelinepanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_guidelinepanel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"GuidelinePanel");
RDebugUtils.currentLine=2818070;
 //BA.debugLineNum = 2818070;BA.debugLine="guidelinePanel.Tag = col";
__ref._guidelinepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)(_col));
RDebugUtils.currentLine=2818071;
 //BA.debugLineNum = 2818071;BA.debugLine="guidelinePanel.SetColorAndBorder(xui.Color_Tran";
__ref._guidelinepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,2,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0);
RDebugUtils.currentLine=2818073;
 //BA.debugLineNum = 2818073;BA.debugLine="myroot.AddView(guidelinePanel, colX - 1, useB4";
__ref._myroot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._guidelinepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),_colx-1,__ref._useb4xtable /*b4j.example.b4xtable*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()+_clv._getbase().getTop()+__ref._useb4xtable /*b4j.example.b4xtable*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().getTop()+1,2,_clv._sv.getScrollViewContentHeight());
RDebugUtils.currentLine=2818075;
 //BA.debugLineNum = 2818075;BA.debugLine="removableGuidelines.Add(guidelinePanel)";
__ref._removableguidelines /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._guidelinepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
 }
};
RDebugUtils.currentLine=2818078;
 //BA.debugLineNum = 2818078;BA.debugLine="isResizing = False";
__ref._isresizing /*boolean*/  = __c.False;
RDebugUtils.currentLine=2818079;
 //BA.debugLineNum = 2818079;BA.debugLine="resizeTimer.Enabled = True";
__ref._resizetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=2818081;
 //BA.debugLineNum = 2818081;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub FirstColforEdit As String";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim foredit As String";
_foredit = "";
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="For k=0 To MyColumns.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_k = (int) (0) ;
for (;_k <= limit2 ;_k = _k + step2 ) {
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Dim myc As mycol=MyColumns.Get(k)";
_myc = (b4j.example.magmagrid._mycol)(__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k));
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="foredit=myc.name";
_foredit = _myc.Name /*String*/ ;
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="If myc.Locked=False And myc.Hidden=False Then";
if (_myc.Locked /*boolean*/ ==__c.False && _myc.Hidden /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="Return foredit";
if (true) return _foredit;
 };
 }
};
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="Return foredit";
if (true) return _foredit;
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="public Sub GetValue(rowid As Long, columnid As Str";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Private MapValues As Map = useB4XTable.GetRow(row";
_mapvalues = new anywheresoftware.b4a.objects.collections.Map();
_mapvalues = __ref._useb4xtable /*b4j.example.b4xtable*/ ._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rowid);
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="For k=0 To MyColumns.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_k = (int) (0) ;
for (;_k <= limit2 ;_k = _k + step2 ) {
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="Dim myc As mycol=MyColumns.Get(k)";
_myc = (b4j.example.magmagrid._mycol)(__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k));
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="If myc.Name=columnid Then";
if ((_myc.Name /*String*/ ).equals(_columnid)) { 
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="Dim value As String = MapValues.Getvalueat(k)";
_value = BA.ObjectToString(_mapvalues.GetValueAt(_k));
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="Return value";
if (true) return _value;
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="If rowindex > 0 Then";
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
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="Dim pageNum As Int = Ceil(rowindex  / useB4XTabl";
_pagenum = (int) (parent.__c.Ceil(_rowindex/(double)__ref._useb4xtable /*b4j.example.b4xtable*/ ._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="useB4XTable.CurrentPage = pageNum";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._setcurrentpage /*int*/ (null,_pagenum);
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "goatrowandclick"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="useB4XTable.UpdateTableCounters";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._updatetablecounters /*String*/ (null);
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "goatrowandclick"),(int) (0));
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="useB4XTable_CellClicked(FirstColforEdit,rowindex";
__ref._useb4xtable_cellclicked /*void*/ (null,__ref._firstcolforedit /*String*/ (null),_rowindex);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=1179664;
 //BA.debugLineNum = 1179664;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="If noEdit=True Then";
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
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="noEdit=False";
__ref._noedit /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="RowCalcPraxis";
__ref._rowcalcpraxis /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=1572875;
 //BA.debugLineNum = 1572875;BA.debugLine="thistable.CellClicked(ColumnId, RowId)";
__ref._thistable /*b4j.example.b4xtableselections*/ ._cellclicked /*String*/ (null,_columnid,_rowid);
RDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="SelectedRow=RowId";
__ref._selectedrow /*long*/  = _rowid;
RDebugUtils.currentLine=1572881;
 //BA.debugLineNum = 1572881;BA.debugLine="wait for (SelColumn(ColumnId)) complete (unused A";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "useb4xtable_cellclicked"), __ref._selcolumn /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_columnid));
this.state = 23;
return;
case 23:
//C
this.state = 5;
_unused = (boolean) result[1];
;
RDebugUtils.currentLine=1572882;
 //BA.debugLineNum = 1572882;BA.debugLine="If SelectedColumn.Locked=True Then Return";
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
RDebugUtils.currentLine=1572884;
 //BA.debugLineNum = 1572884;BA.debugLine="If SelectedColumn.Controltype.Contains(\"CHECK\") T";
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
RDebugUtils.currentLine=1572886;
 //BA.debugLineNum = 1572886;BA.debugLine="If GetValue(RowId,ColumnId)=Chr(9746) Then";
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
RDebugUtils.currentLine=1572887;
 //BA.debugLineNum = 1572887;BA.debugLine="SetValue(RowId,ColumnId,Chr(9744))";
__ref._setvalue /*String*/ (null,_rowid,_columnid,(Object)(parent.__c.Chr((int) (9744))));
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=1572889;
 //BA.debugLineNum = 1572889;BA.debugLine="SetValue(RowId,ColumnId,Chr(9746))";
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
RDebugUtils.currentLine=1572893;
 //BA.debugLineNum = 1572893;BA.debugLine="ie.CellClicked(ColumnId, RowId)";
__ref._ie /*b4j.example.inlineediting*/ ._cellclicked /*String*/ (null,_columnid,_rowid);
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=1572898;
 //BA.debugLineNum = 1572898;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Private Sub GuidelinePanel_MouseDragged (EventData";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="If isResizing Then";
if (__ref._isresizing /*boolean*/ ) { 
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="If currentPanel.IsInitialized Then";
if (__ref._currentpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="cumulativeDelta = cumulativeDelta + EventData.X";
__ref._cumulativedelta /*int*/  = (int) (__ref._cumulativedelta /*int*/ +_eventdata.getX());
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="Dim tableLeft As Int = useB4XTable.mBase.Left";
_tableleft = (int) (__ref._useb4xtable /*b4j.example.b4xtable*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft());
RDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="tableLeft = tableLeft + useB4XTable.mBase.Parent";
_tableleft = (int) (_tableleft+__ref._useb4xtable /*b4j.example.b4xtable*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().getLeft());
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="tableLeft = tableLeft + useB4XTable.clvData.GetB";
_tableleft = (int) (_tableleft+__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._getbase().getLeft());
RDebugUtils.currentLine=3080205;
 //BA.debugLineNum = 3080205;BA.debugLine="Dim visibleRight As Int = tableLeft + useB4XTabl";
_visibleright = (int) (_tableleft+__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.getWidth());
RDebugUtils.currentLine=3080208;
 //BA.debugLineNum = 3080208;BA.debugLine="Dim tentativeLeft As Int = currentPanel.Left + E";
_tentativeleft = (int) (__ref._currentpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+_eventdata.getX());
RDebugUtils.currentLine=3080211;
 //BA.debugLineNum = 3080211;BA.debugLine="If tentativeLeft < tableLeft Then";
if (_tentativeleft<_tableleft) { 
RDebugUtils.currentLine=3080212;
 //BA.debugLineNum = 3080212;BA.debugLine="cumulativeDelta = cumulativeDelta - (tableLeft";
__ref._cumulativedelta /*int*/  = (int) (__ref._cumulativedelta /*int*/ -(_tableleft-__ref._currentpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()));
RDebugUtils.currentLine=3080213;
 //BA.debugLineNum = 3080213;BA.debugLine="tentativeLeft = tableLeft";
_tentativeleft = _tableleft;
 };
RDebugUtils.currentLine=3080216;
 //BA.debugLineNum = 3080216;BA.debugLine="If tentativeLeft > visibleRight Then";
if (_tentativeleft>_visibleright) { 
RDebugUtils.currentLine=3080217;
 //BA.debugLineNum = 3080217;BA.debugLine="cumulativeDelta = cumulativeDelta - (tentativeL";
__ref._cumulativedelta /*int*/  = (int) (__ref._cumulativedelta /*int*/ -(_tentativeleft-_visibleright));
RDebugUtils.currentLine=3080218;
 //BA.debugLineNum = 3080218;BA.debugLine="tentativeLeft = visibleRight";
_tentativeleft = _visibleright;
 };
RDebugUtils.currentLine=3080222;
 //BA.debugLineNum = 3080222;BA.debugLine="currentPanel.Left = tentativeLeft";
__ref._currentpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(_tentativeleft);
RDebugUtils.currentLine=3080225;
 //BA.debugLineNum = 3080225;BA.debugLine="Dim newSize As Int = startColumnWidth + cumulati";
_newsize = (int) (__ref._startcolumnwidth /*int*/ +__ref._cumulativedelta /*int*/ );
RDebugUtils.currentLine=3080226;
 //BA.debugLineNum = 3080226;BA.debugLine="If newSize < 20 Then newSize = 20";
if (_newsize<20) { 
_newsize = (int) (20);};
RDebugUtils.currentLine=3080227;
 //BA.debugLineNum = 3080227;BA.debugLine="currentColumn.Width = newSize";
__ref._currentcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ .Width /*int*/  = _newsize;
 };
 };
RDebugUtils.currentLine=3080235;
 //BA.debugLineNum = 3080235;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Private Sub GuidelinePanel_MouseEntered (EventData";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="If noEdit Then Return";
if (__ref._noedit /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Dim pnl As B4XView = Sender";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="If pnl.IsInitialized Then";
if (_pnl.IsInitialized()) { 
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="Dim tableLeft As Int = useB4XTable.mBase.Left + u";
_tableleft = (int) (__ref._useb4xtable /*b4j.example.b4xtable*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._getbase().getLeft()+__ref._useb4xtable /*b4j.example.b4xtable*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().getLeft());
RDebugUtils.currentLine=2883594;
 //BA.debugLineNum = 2883594;BA.debugLine="Dim visibleRight As Int = tableLeft + useB4XTable";
_visibleright = (int) (_tableleft+__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.getWidth());
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="If pnl.Left >= tableLeft And pnl.Left <= visibleR";
if (_pnl.getLeft()>=_tableleft && _pnl.getLeft()<=_visibleright) { 
RDebugUtils.currentLine=2883598;
 //BA.debugLineNum = 2883598;BA.debugLine="pnl.SetColorAndBorder(xui.Color_Transparent, 2,";
_pnl.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,2,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Green,0);
RDebugUtils.currentLine=2883600;
 //BA.debugLineNum = 2883600;BA.debugLine="Dim cursor As JavaObject";
_cursor = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=2883601;
 //BA.debugLineNum = 2883601;BA.debugLine="cursor.InitializeStatic(\"javafx.scene.Cursor\")";
_cursor.InitializeStatic("javafx.scene.Cursor");
RDebugUtils.currentLine=2883602;
 //BA.debugLineNum = 2883602;BA.debugLine="Dim joPnl As JavaObject = pnl";
_jopnl = new anywheresoftware.b4j.object.JavaObject();
_jopnl = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnl.getObject()));
RDebugUtils.currentLine=2883603;
 //BA.debugLineNum = 2883603;BA.debugLine="joPnl.RunMethod(\"setCursor\", Array(cursor.GetFie";
_jopnl.RunMethod("setCursor",new Object[]{_cursor.GetField("E_RESIZE")});
 };
 };
RDebugUtils.currentLine=2883607;
 //BA.debugLineNum = 2883607;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Private Sub GuidelinePanel_MouseExited (EventData";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Dim pnl As B4XView = Sender";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="If pnl.IsInitialized Then";
if (_pnl.IsInitialized()) { 
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="pnl.SetColorAndBorder(xui.Color_Transparent, 2, x";
_pnl.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,2,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0);
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="Dim cursor As JavaObject";
_cursor = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="cursor.InitializeStatic(\"javafx.scene.Cursor\")";
_cursor.InitializeStatic("javafx.scene.Cursor");
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="Dim joPnl As JavaObject = pnl";
_jopnl = new anywheresoftware.b4j.object.JavaObject();
_jopnl = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnl.getObject()));
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="joPnl.RunMethod(\"setCursor\", Array(cursor.GetFiel";
_jopnl.RunMethod("setCursor",new Object[]{_cursor.GetField("DEFAULT")});
 };
RDebugUtils.currentLine=2949132;
 //BA.debugLineNum = 2949132;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="If noEdit Then Return";
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
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="If EventData.ClickCount = 2 Then";
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
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="Dim panel As B4XView = Sender";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="If panel.IsInitialized Then";
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
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="Dim colIndex As Int = panel.Tag";
_colindex = (int)(BA.ObjectToNumber(_panel.getTag()));
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="Dim col As B4XTableColumn = useB4XTable.visible";
_col = (b4j.example.b4xtable._b4xtablecolumn)(__ref._useb4xtable /*b4j.example.b4xtable*/ ._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_colindex));
RDebugUtils.currentLine=3014668;
 //BA.debugLineNum = 3014668;BA.debugLine="If col.Width > 1 Then";
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
RDebugUtils.currentLine=3014670;
 //BA.debugLineNum = 3014670;BA.debugLine="previousColumnWidths(colIndex) = col.Width";
__ref._previouscolumnwidths /*int[]*/ [_colindex] = _col.Width /*int*/ ;
RDebugUtils.currentLine=3014671;
 //BA.debugLineNum = 3014671;BA.debugLine="col.Width = 1";
_col.Width /*int*/  = (int) (1);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=3014674;
 //BA.debugLineNum = 3014674;BA.debugLine="Dim restoredWidth As Int = previousColumnWidth";
_restoredwidth = __ref._previouscolumnwidths /*int[]*/ [_colindex];
RDebugUtils.currentLine=3014675;
 //BA.debugLineNum = 3014675;BA.debugLine="If restoredWidth <= 1 Then";
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
RDebugUtils.currentLine=3014676;
 //BA.debugLineNum = 3014676;BA.debugLine="restoredWidth = 100dip";
_restoredwidth = parent.__c.DipToCurrent((int) (100));
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=3014678;
 //BA.debugLineNum = 3014678;BA.debugLine="col.Width = restoredWidth";
_col.Width /*int*/  = _restoredwidth;
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=3014681;
 //BA.debugLineNum = 3014681;BA.debugLine="useB4XTable.Refresh";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._refresh /*String*/ (null);
RDebugUtils.currentLine=3014682;
 //BA.debugLineNum = 3014682;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "guidelinepanel_mousepressed"),(int) (0));
this.state = 29;
return;
case 29:
//C
this.state = 23;
;
RDebugUtils.currentLine=3014683;
 //BA.debugLineNum = 3014683;BA.debugLine="EnableResizeGuidelines";
__ref._enableresizeguidelines /*String*/ (null);
RDebugUtils.currentLine=3014684;
 //BA.debugLineNum = 3014684;BA.debugLine="resizeTimer.Enabled = True";
__ref._resizetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.True);
 if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=3014686;
 //BA.debugLineNum = 3014686;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=3014689;
 //BA.debugLineNum = 3014689;BA.debugLine="currentPanel = Sender";
__ref._currentpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=3014690;
 //BA.debugLineNum = 3014690;BA.debugLine="If currentPanel.IsInitialized Then";
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
RDebugUtils.currentLine=3014691;
 //BA.debugLineNum = 3014691;BA.debugLine="currentColumn = useB4XTable.visibleColumns.Get(cu";
__ref._currentcolumn /*b4j.example.b4xtable._b4xtablecolumn*/  = (b4j.example.b4xtable._b4xtablecolumn)(__ref._useb4xtable /*b4j.example.b4xtable*/ ._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get((int)(BA.ObjectToNumber(__ref._currentpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()))));
RDebugUtils.currentLine=3014692;
 //BA.debugLineNum = 3014692;BA.debugLine="startColumnWidth = currentColumn.Width";
__ref._startcolumnwidth /*int*/  = __ref._currentcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ .Width /*int*/ ;
RDebugUtils.currentLine=3014693;
 //BA.debugLineNum = 3014693;BA.debugLine="cumulativeDelta = 0";
__ref._cumulativedelta /*int*/  = (int) (0);
RDebugUtils.currentLine=3014694;
 //BA.debugLineNum = 3014694;BA.debugLine="isResizing = True";
__ref._isresizing /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=3014695;
 //BA.debugLineNum = 3014695;BA.debugLine="resizeTimer.Enabled = False";
__ref._resizetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=3014696;
 //BA.debugLineNum = 3014696;BA.debugLine="currentPanel.SetColorAndBorder(xui.Color_Transpar";
__ref._currentpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,2,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Green,0);
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=3014698;
 //BA.debugLineNum = 3014698;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub GuidelinePanel_MouseReleased (EventDat";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="If isResizing Then";
if (__ref._isresizing /*boolean*/ ) { 
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="isResizing = False";
__ref._isresizing /*boolean*/  = __c.False;
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="currentPanel.SetColorAndBorder(xui.Color_Transpa";
__ref._currentpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,2,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0);
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="useB4XTable.Refresh 'Refresh here is safer than";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._refresh /*String*/ (null);
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="EnableResizeGuidelines";
__ref._enableresizeguidelines /*String*/ (null);
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="resizeTimer.Enabled = True";
__ref._resizetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=3145743;
 //BA.debugLineNum = 3145743;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub IE_EnterEditMode (FC As FocusedCell)";
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="If SelectedColumn.Controltype.Trim.ToUpperCase.";
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Controltype /*String*/ .trim().toUpperCase().contains("NUMERIC")) { 
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="MyNumField.Text=FC.PrevValue";
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_fc.PrevValue /*Object*/ ));
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="FC.View=MyNumField";
_fc.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
 }else {
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="Select Case SelectedColumn.Controltype";
switch (BA.switchObjectToInt(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Controltype /*String*/ ,"TEXTFIELD","TEXTAREA","COMBO","COMBOFIELD","COMBOEDIT","COMBOEDITFIELD","DATE")) {
case 0: 
case 1: {
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="MyTextField.Text=FC.PrevValue";
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_fc.PrevValue /*Object*/ ));
RDebugUtils.currentLine=1441805;
 //BA.debugLineNum = 1441805;BA.debugLine="FC.View=MyTextField";
_fc.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
 break; }
case 2: 
case 3: 
case 4: 
case 5: {
RDebugUtils.currentLine=1441807;
 //BA.debugLineNum = 1441807;BA.debugLine="If SelectedColumn.Controltype.Contains(\"EDI";
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Controltype /*String*/ .contains("EDIT")) { 
RDebugUtils.currentLine=1441808;
 //BA.debugLineNum = 1441808;BA.debugLine="MyComboField.Editable=True";
__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setEditable(__c.True);
 }else {
RDebugUtils.currentLine=1441810;
 //BA.debugLineNum = 1441810;BA.debugLine="MyComboField.Editable=False";
__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setEditable(__c.False);
 };
RDebugUtils.currentLine=1441812;
 //BA.debugLineNum = 1441812;BA.debugLine="noEdit=True";
__ref._noedit /*boolean*/  = __c.True;
RDebugUtils.currentLine=1441813;
 //BA.debugLineNum = 1441813;BA.debugLine="MyComboField.Items.Clear";
__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Clear();
RDebugUtils.currentLine=1441814;
 //BA.debugLineNum = 1441814;BA.debugLine="For k=0 To SelectedColumn.UseList.Size-1";
{
final int step17 = 1;
final int limit17 = (int) (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .UseList /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_k = (int) (0) ;
for (;_k <= limit17 ;_k = _k + step17 ) {
RDebugUtils.currentLine=1441815;
 //BA.debugLineNum = 1441815;BA.debugLine="Private map1 As Map=SelectedColumn.UseList";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
_map1 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .UseList /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k)));
RDebugUtils.currentLine=1441816;
 //BA.debugLineNum = 1441816;BA.debugLine="MyComboField.Items.Add(map1.Get(SelectedCo";
__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Add(_map1.Get((Object)(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Name /*String*/ )));
RDebugUtils.currentLine=1441817;
 //BA.debugLineNum = 1441817;BA.debugLine="If FC.PrevValue=map1.Get(SelectedColumn.Na";
if ((_fc.PrevValue /*Object*/ ).equals(_map1.Get((Object)(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Name /*String*/ )))) { 
RDebugUtils.currentLine=1441818;
 //BA.debugLineNum = 1441818;BA.debugLine="MyComboField.SelectedIndex=k";
__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setSelectedIndex(_k);
RDebugUtils.currentLine=1441819;
 //BA.debugLineNum = 1441819;BA.debugLine="MyPrevComboIndex=k";
__ref._myprevcomboindex /*int*/  = _k;
RDebugUtils.currentLine=1441820;
 //BA.debugLineNum = 1441820;BA.debugLine="For Each afield As String In map1.Keys";
{
final anywheresoftware.b4a.BA.IterableList group23 = _map1.Keys();
final int groupLen23 = group23.getSize()
;int index23 = 0;
;
for (; index23 < groupLen23;index23++){
_afield = BA.ObjectToString(group23.Get(index23));
RDebugUtils.currentLine=1441821;
 //BA.debugLineNum = 1441821;BA.debugLine="SetValue(SelectedRow,afield,map1.Get(afi";
__ref._setvalue /*String*/ (null,__ref._selectedrow /*long*/ ,_afield,_map1.Get((Object)(_afield)));
 }
};
 };
 }
};
RDebugUtils.currentLine=1441826;
 //BA.debugLineNum = 1441826;BA.debugLine="If MyComboField.Editable=True And k=Selecte";
if (__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getEditable()==__c.True && _k==__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .UseList /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=1441827;
 //BA.debugLineNum = 1441827;BA.debugLine="MyComboField.Value=FC.PrevValue";
__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue(_fc.PrevValue /*Object*/ );
 }else {
RDebugUtils.currentLine=1441829;
 //BA.debugLineNum = 1441829;BA.debugLine="MyComboField.SelectedIndex=MyPrevComboInde";
__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setSelectedIndex(__ref._myprevcomboindex /*int*/ );
 };
RDebugUtils.currentLine=1441832;
 //BA.debugLineNum = 1441832;BA.debugLine="FC.View=MyComboField";
_fc.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getObject()));
 break; }
case 6: {
RDebugUtils.currentLine=1441835;
 //BA.debugLineNum = 1441835;BA.debugLine="MyTextField.Text=DateTime.Date(FC.PrevValue";
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date(BA.ObjectToLongNumber(_fc.PrevValue /*Object*/ )));
RDebugUtils.currentLine=1441836;
 //BA.debugLineNum = 1441836;BA.debugLine="FC.View=MyTextField";
_fc.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
 break; }
}
;
 };
RDebugUtils.currentLine=1441842;
 //BA.debugLineNum = 1441842;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="public Sub SetValue(rowid As Long, columnid As Str";
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Private MapValues As Map = useB4XTable.GetRow(row";
_mapvalues = new anywheresoftware.b4a.objects.collections.Map();
_mapvalues = __ref._useb4xtable /*b4j.example.b4xtable*/ ._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rowid);
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Dim Query As StringBuilder";
_query = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="Dim params As List";
_params = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="Query.Initialize";
_query.Initialize();
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="Query.Append (\"UPDATE data SET \")";
_query.Append("UPDATE data SET ");
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="For k=0 To MyColumns.Size-1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_k = (int) (0) ;
for (;_k <= limit7 ;_k = _k + step7 ) {
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="Private myc As mycol = MyColumns.Get(k)";
_myc = (b4j.example.magmagrid._mycol)(__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k));
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="If myc.Controltype.Contains(\"EDITCONTROLS\") Then";
if (_myc.Controltype /*String*/ .contains("EDITCONTROLS")) { 
 }else {
RDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="If columnid=myc.Name Then";
if ((_columnid).equals(_myc.Name /*String*/ )) { 
RDebugUtils.currentLine=720910;
 //BA.debugLineNum = 720910;BA.debugLine="If myc.Controltype.Contains(\"NUMERIC\") Then";
if (_myc.Controltype /*String*/ .contains("NUMERIC")) { 
RDebugUtils.currentLine=720911;
 //BA.debugLineNum = 720911;BA.debugLine="Dim newvalue1 As Double=newvalue";
_newvalue1 = (double)(BA.ObjectToNumber(_newvalue));
RDebugUtils.currentLine=720912;
 //BA.debugLineNum = 720912;BA.debugLine="params.Add(NumberFormat2(newvalue1,myc.MinInt";
_params.Add((Object)(__c.NumberFormat2(_newvalue1,_myc.MinIntegers /*int*/ ,_myc.MinFractions /*int*/ ,_myc.MaxFractions /*int*/ ,_myc.Grouping /*boolean*/ )));
 }else {
RDebugUtils.currentLine=720914;
 //BA.debugLineNum = 720914;BA.debugLine="params.Add(newvalue)";
_params.Add(_newvalue);
 };
 }else {
RDebugUtils.currentLine=720917;
 //BA.debugLineNum = 720917;BA.debugLine="params.Add(MapValues.GetValueAt(k))";
_params.Add(_mapvalues.GetValueAt(_k));
 };
RDebugUtils.currentLine=720919;
 //BA.debugLineNum = 720919;BA.debugLine="Dim c As B4XTableColumn = useB4XTable.GetColumn";
_c = __ref._useb4xtable /*b4j.example.b4xtable*/ ._getcolumn /*b4j.example.b4xtable._b4xtablecolumn*/ (null,_myc.Name /*String*/ );
RDebugUtils.currentLine=720920;
 //BA.debugLineNum = 720920;BA.debugLine="Query.Append (c.SQLID.Trim & \" = ?\")";
_query.Append(_c.SQLID /*String*/ .trim()+" = ?");
RDebugUtils.currentLine=720921;
 //BA.debugLineNum = 720921;BA.debugLine="If k<MyColumns.Size-1 Then";
if (_k<__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) { 
RDebugUtils.currentLine=720922;
 //BA.debugLineNum = 720922;BA.debugLine="Query.Append (\",\")";
_query.Append(",");
 };
 };
 }
};
RDebugUtils.currentLine=720926;
 //BA.debugLineNum = 720926;BA.debugLine="Query.Append (\"WHERE rowid = ?\")";
_query.Append("WHERE rowid = ?");
RDebugUtils.currentLine=720927;
 //BA.debugLineNum = 720927;BA.debugLine="params.Add(rowid)";
_params.Add((Object)(_rowid));
RDebugUtils.currentLine=720928;
 //BA.debugLineNum = 720928;BA.debugLine="useB4XTable.sql1.ExecNonQuery2(Query, params)";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(BA.ObjectToString(_query),_params);
RDebugUtils.currentLine=720929;
 //BA.debugLineNum = 720929;BA.debugLine="useB4XTable.Refresh";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._refresh /*String*/ (null);
RDebugUtils.currentLine=720931;
 //BA.debugLineNum = 720931;BA.debugLine="End Sub";
return "";
}
public Object  _ie_getupdatedvalue(b4j.example.magmagrid __ref,b4j.example.inlineediting._focusedcell _fc) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "ie_getupdatedvalue", false))
	 {return ((Object) Debug.delegate(ba, "ie_getupdatedvalue", new Object[] {_fc}));}
anywheresoftware.b4a.objects.collections.Map _map1 = null;
String _afield = "";
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Private Sub IE_GetUpdatedValue (FC As FocusedCell)";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="If SelectedColumn.Controltype.Trim.ToUpperCase.Co";
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Controltype /*String*/ .trim().toUpperCase().contains("NUMERIC")) { 
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="RowCalcPraxis";
__ref._rowcalcpraxis /*String*/ (null);
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="If SelectedColumn.MaxValue>0 Then";
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxValue /*double*/ >0) { 
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="If MyNumField.Text.As(Double)>SelectedColumn.Ma";
if (((double)(Double.parseDouble(__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())))>__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxValue /*double*/ ) { 
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxValue /*double*/ ));};
 };
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="If SelectedColumn.MinValue>0 Then";
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MinValue /*double*/ >0) { 
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="If MyNumField.Text.As(Double)<SelectedColumn.Mi";
if (((double)(Double.parseDouble(__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())))<__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MinValue /*double*/ ) { 
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MinValue /*double*/ ));};
 };
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="If MyNumField.Text.Trim.Length=0 Then MyNumField";
if (__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().trim().length()==0) { 
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Defaultvalue /*String*/ );};
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="Return MyNumField.Text";
if (true) return (Object)(__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
 }else {
RDebugUtils.currentLine=1507343;
 //BA.debugLineNum = 1507343;BA.debugLine="Select Case SelectedColumn.Controltype";
switch (BA.switchObjectToInt(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Controltype /*String*/ ,"TEXTFIELD","TEXTAREA","COMBO","COMBOFIELD","COMBOEDIT","COMBOEDITFIELD","DATE")) {
case 0: 
case 1: {
RDebugUtils.currentLine=1507345;
 //BA.debugLineNum = 1507345;BA.debugLine="If MyTextField.Text.Trim.Length=0 Then MyTextF";
if (__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().trim().length()==0) { 
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Defaultvalue /*String*/ );};
RDebugUtils.currentLine=1507346;
 //BA.debugLineNum = 1507346;BA.debugLine="Return MyTextField.Text";
if (true) return (Object)(__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
 break; }
case 2: 
case 3: 
case 4: 
case 5: {
RDebugUtils.currentLine=1507351;
 //BA.debugLineNum = 1507351;BA.debugLine="If MyComboField.SelectedIndex>-1 Then";
if (__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getSelectedIndex()>-1) { 
RDebugUtils.currentLine=1507352;
 //BA.debugLineNum = 1507352;BA.debugLine="Private map1 As Map=SelectedColumn.UseList.G";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
_map1 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .UseList /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getSelectedIndex())));
RDebugUtils.currentLine=1507354;
 //BA.debugLineNum = 1507354;BA.debugLine="For Each afield As String In map1.Keys";
{
final anywheresoftware.b4a.BA.IterableList group19 = _map1.Keys();
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_afield = BA.ObjectToString(group19.Get(index19));
RDebugUtils.currentLine=1507355;
 //BA.debugLineNum = 1507355;BA.debugLine="SetValue(SelectedRow,afield,map1.Get(afield";
__ref._setvalue /*String*/ (null,__ref._selectedrow /*long*/ ,_afield,_map1.Get((Object)(_afield)));
 }
};
RDebugUtils.currentLine=1507358;
 //BA.debugLineNum = 1507358;BA.debugLine="Return map1.Get(SelectedColumn.Name)";
if (true) return _map1.Get((Object)(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Name /*String*/ ));
 }else {
RDebugUtils.currentLine=1507360;
 //BA.debugLineNum = 1507360;BA.debugLine="If MyComboField.Editable=True Then";
if (__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getEditable()==__c.True) { 
RDebugUtils.currentLine=1507361;
 //BA.debugLineNum = 1507361;BA.debugLine="Return MyComboField.Value";
if (true) return __ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue();
 }else {
RDebugUtils.currentLine=1507364;
 //BA.debugLineNum = 1507364;BA.debugLine="If SelectedColumn.Defaultvalue.Trim.Length>0";
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Defaultvalue /*String*/ .trim().length()>0) { 
RDebugUtils.currentLine=1507365;
 //BA.debugLineNum = 1507365;BA.debugLine="Return SelectedColumn.Defaultvalue";
if (true) return (Object)(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Defaultvalue /*String*/ );
 };
 };
 };
 break; }
case 6: {
RDebugUtils.currentLine=1507374;
 //BA.debugLineNum = 1507374;BA.debugLine="If xtra.IsValidDate(MyTextField.Text)=False Th";
if (__ref._xtra /*b4j.example.b4xmagmafuncs*/ ._isvaliddate /*boolean*/ (null,__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())==__c.False) { 
RDebugUtils.currentLine=1507375;
 //BA.debugLineNum = 1507375;BA.debugLine="If SelectedColumn.Defaultvalue>0 Then";
if ((double)(Double.parseDouble(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Defaultvalue /*String*/ ))>0) { 
RDebugUtils.currentLine=1507376;
 //BA.debugLineNum = 1507376;BA.debugLine="MyTextField.Text=DateTime.Date(SelectedColum";
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date((long)(Double.parseDouble(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Defaultvalue /*String*/ ))));
 }else {
RDebugUtils.currentLine=1507378;
 //BA.debugLineNum = 1507378;BA.debugLine="MyTextField.Text=DateTime.Date(DateTime.Now)";
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date(__c.DateTime.getNow()));
 };
 };
RDebugUtils.currentLine=1507381;
 //BA.debugLineNum = 1507381;BA.debugLine="If SelectedColumn.MaxValue>0 Then";
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxValue /*double*/ >0) { 
RDebugUtils.currentLine=1507382;
 //BA.debugLineNum = 1507382;BA.debugLine="If DateTime.DateParse(MyTextField.Text)>Selec";
if (__c.DateTime.DateParse(__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())>__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxValue /*double*/ ) { 
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date((long) (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxValue /*double*/ )));};
 };
RDebugUtils.currentLine=1507384;
 //BA.debugLineNum = 1507384;BA.debugLine="If SelectedColumn.MinValue>0 Then";
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MinValue /*double*/ >0) { 
RDebugUtils.currentLine=1507385;
 //BA.debugLineNum = 1507385;BA.debugLine="If DateTime.DateParse(MyTextField.Text)<Selec";
if (__c.DateTime.DateParse(__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())<__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MinValue /*double*/ ) { 
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date((long) (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MinValue /*double*/ )));};
 };
RDebugUtils.currentLine=1507387;
 //BA.debugLineNum = 1507387;BA.debugLine="Return DateTime.DateParse(MyTextField.Text)";
if (true) return (Object)(__c.DateTime.DateParse(__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
 break; }
}
;
 };
RDebugUtils.currentLine=1507392;
 //BA.debugLineNum = 1507392;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=1507393;
 //BA.debugLineNum = 1507393;BA.debugLine="End Sub";
return null;
}
public boolean  _istablefocused(b4j.example.magmagrid __ref,b4j.example.b4xtable _table) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "istablefocused", false))
	 {return ((Boolean) Debug.delegate(ba, "istablefocused", new Object[] {_table}));}
anywheresoftware.b4a.objects.B4XViewWrapper _focusednode = null;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub IsTableFocused (Table As B4XTable) As";
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Dim FocusedNode As B4XView = Main.scene.RunMethod";
_focusednode = new anywheresoftware.b4a.objects.B4XViewWrapper();
_focusednode = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_main._scene /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("focusOwnerProperty",(Object[])(__c.Null)).RunMethod("get",(Object[])(__c.Null))));
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="Do While FocusedNode.IsInitialized";
while (_focusednode.IsInitialized()) {
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="If FocusedNode = Table.clvData.AsView Then Retur";
if ((_focusednode).equals(_table._clvdata /*b4j.example.customlistview*/ ._asview())) { 
if (true) return __c.True;};
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="FocusedNode = FocusedNode.Parent";
_focusednode = _focusednode.getParent();
 }
;
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim table As B4XTable = useB4XTable";
_table = __ref._useb4xtable /*b4j.example.b4xtable*/ ;
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="If noEdit=False And IsTableFocused(table) And tab";
if (true) break;

case 1:
//if
this.state = 69;
if (__ref._noedit /*boolean*/ ==parent.__c.False && __ref._istablefocused /*boolean*/ (null,_table) && (double)(BA.ObjectToNumber(_table._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))))>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Dim jo As JavaObject = e";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_e.getObject()));
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="Dim EventType As String = jo.RunMethodJO(\"getEve";
_eventtype = BA.ObjectToString(_jo.RunMethodJO("getEventType",(Object[])(parent.__c.Null)).RunMethod("getName",(Object[])(parent.__c.Null)));
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="If EventType = \"KEY_PRESSED\" Then";
if (true) break;

case 4:
//if
this.state = 68;
if ((_eventtype).equals("KEY_PRESSED")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="Dim keycode As String = jo.RunMethod(\"getCode\",";
_keycode = BA.ObjectToString(_jo.RunMethod("getCode",(Object[])(parent.__c.Null)));
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="Dim col As String = 1'thistable.FirstSelectedCo";
_col = BA.NumberToString(1);
RDebugUtils.currentLine=2490381;
 //BA.debugLineNum = 2490381;BA.debugLine="Dim row As Long = thistable.FirstSelectedRowId";
_row = __ref._thistable /*b4j.example.b4xtableselections*/ ._firstselectedrowid /*long*/ (null);
RDebugUtils.currentLine=2490384;
 //BA.debugLineNum = 2490384;BA.debugLine="Dim RowSize As Int = table.VisibleRowIds.Size";
_rowsize = _table._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=2490385;
 //BA.debugLineNum = 2490385;BA.debugLine="Select keycode";
if (true) break;

case 7:
//select
this.state = 62;
switch (BA.switchObjectToInt(_keycode,"UP","DOWN","PAGE_UP","PAGE_DOWN","SPACE","DELETE","ENTER")) {
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
case 6: {
this.state = 55;
if (true) break;
}
default: {
this.state = 61;
if (true) break;
}
}
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=2490393;
 //BA.debugLineNum = 2490393;BA.debugLine="row = table.VisibleRowIds.Get((table.VisibleR";
_row = BA.ObjectToLongNumber(_table._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) ((_table._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row))-1+_rowsize)%_rowsize)));
RDebugUtils.currentLine=2490394;
 //BA.debugLineNum = 2490394;BA.debugLine="If row = 0 Then";
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
RDebugUtils.currentLine=2490395;
 //BA.debugLineNum = 2490395;BA.debugLine="For i = table.VisibleRowIds.Size - 1 To 0 St";
if (true) break;

case 13:
//for
this.state = 22;
step14 = -1;
limit14 = (int) (0);
_i = (int) (_table._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) ;
this.state = 99;
if (true) break;

case 99:
//C
this.state = 22;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 15;
if (true) break;

case 100:
//C
this.state = 99;
_i = ((int)(0 + _i + step14)) ;
if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=2490396;
 //BA.debugLineNum = 2490396;BA.debugLine="row = table.VisibleRowIds.Get(i)";
_row = BA.ObjectToLongNumber(_table._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=2490397;
 //BA.debugLineNum = 2490397;BA.debugLine="If row <> 0 Then Exit";
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
this.state = 100;
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
this.state = 62;
;
RDebugUtils.currentLine=2490400;
 //BA.debugLineNum = 2490400;BA.debugLine="SelectedRow=row";
__ref._selectedrow /*long*/  = _row;
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=2490402;
 //BA.debugLineNum = 2490402;BA.debugLine="row = table.VisibleRowIds.Get((table.VisibleR";
_row = BA.ObjectToLongNumber(_table._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) ((_table._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row))+1+_rowsize)%_rowsize)));
RDebugUtils.currentLine=2490403;
 //BA.debugLineNum = 2490403;BA.debugLine="If row = 0 Then row = table.VisibleRowIds.Get";
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
this.state = 62;
;
RDebugUtils.currentLine=2490404;
 //BA.debugLineNum = 2490404;BA.debugLine="SelectedRow=row";
__ref._selectedrow /*long*/  = _row;
 if (true) break;

case 33:
//C
this.state = 62;
RDebugUtils.currentLine=2490406;
 //BA.debugLineNum = 2490406;BA.debugLine="row=1";
_row = (long) (1);
RDebugUtils.currentLine=2490407;
 //BA.debugLineNum = 2490407;BA.debugLine="table.CurrentPage=table.CurrentPage-1";
_table._setcurrentpage /*int*/ (null,(int) (_table._getcurrentpage /*int*/ (null)-1));
 if (true) break;

case 35:
//C
this.state = 62;
RDebugUtils.currentLine=2490409;
 //BA.debugLineNum = 2490409;BA.debugLine="row=1";
_row = (long) (1);
RDebugUtils.currentLine=2490410;
 //BA.debugLineNum = 2490410;BA.debugLine="table.CurrentPage=table.CurrentPage+1";
_table._setcurrentpage /*int*/ (null,(int) (_table._getcurrentpage /*int*/ (null)+1));
 if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=2490412;
 //BA.debugLineNum = 2490412;BA.debugLine="For k=0 To MyColumns.Size-1";
if (true) break;

case 38:
//for
this.state = 51;
step31 = 1;
limit31 = (int) (__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_k = (int) (0) ;
this.state = 101;
if (true) break;

case 101:
//C
this.state = 51;
if ((step31 > 0 && _k <= limit31) || (step31 < 0 && _k >= limit31)) this.state = 40;
if (true) break;

case 102:
//C
this.state = 101;
_k = ((int)(0 + _k + step31)) ;
if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=2490413;
 //BA.debugLineNum = 2490413;BA.debugLine="Dim myc As mycol=MyColumns.Get(k)";
_myc = (b4j.example.magmagrid._mycol)(__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k));
RDebugUtils.currentLine=2490414;
 //BA.debugLineNum = 2490414;BA.debugLine="If myc.Controltype.Contains(\"CHECK\") Then";
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
RDebugUtils.currentLine=2490416;
 //BA.debugLineNum = 2490416;BA.debugLine="If GetValue(SelectedRow,myc.Name)=Chr(9746)";
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
RDebugUtils.currentLine=2490417;
 //BA.debugLineNum = 2490417;BA.debugLine="SetValue(SelectedRow,myc.Name,Chr(9744))";
__ref._setvalue /*String*/ (null,__ref._selectedrow /*long*/ ,_myc.Name /*String*/ ,(Object)(parent.__c.Chr((int) (9744))));
 if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=2490419;
 //BA.debugLineNum = 2490419;BA.debugLine="SetValue(SelectedRow,myc.Name,Chr(9746))";
__ref._setvalue /*String*/ (null,__ref._selectedrow /*long*/ ,_myc.Name /*String*/ ,(Object)(parent.__c.Chr((int) (9746))));
 if (true) break;

case 49:
//C
this.state = 50;
;
 if (true) break;

case 50:
//C
this.state = 102;
;
 if (true) break;
if (true) break;

case 51:
//C
this.state = 62;
;
 if (true) break;

case 53:
//C
this.state = 62;
RDebugUtils.currentLine=2490424;
 //BA.debugLineNum = 2490424;BA.debugLine="SelectedRow=row";
__ref._selectedrow /*long*/  = _row;
RDebugUtils.currentLine=2490425;
 //BA.debugLineNum = 2490425;BA.debugLine="DeleteRow(SelectedRow)";
__ref._deleterow /*String*/ (null,__ref._selectedrow /*long*/ );
RDebugUtils.currentLine=2490426;
 //BA.debugLineNum = 2490426;BA.debugLine="row = table.VisibleRowIds.Get(0)";
_row = BA.ObjectToLongNumber(_table._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=2490427;
 //BA.debugLineNum = 2490427;BA.debugLine="SelectedRow=row";
__ref._selectedrow /*long*/  = _row;
 if (true) break;

case 55:
//C
this.state = 56;
RDebugUtils.currentLine=2490429;
 //BA.debugLineNum = 2490429;BA.debugLine="If noEdit=False Then";
if (true) break;

case 56:
//if
this.state = 59;
if (__ref._noedit /*boolean*/ ==parent.__c.False) { 
this.state = 58;
}if (true) break;

case 58:
//C
this.state = 59;
RDebugUtils.currentLine=2490430;
 //BA.debugLineNum = 2490430;BA.debugLine="SelectedRow=row";
__ref._selectedrow /*long*/  = _row;
RDebugUtils.currentLine=2490431;
 //BA.debugLineNum = 2490431;BA.debugLine="Dim myc As mycol=MyColumns.Get(0)";
_myc = (b4j.example.magmagrid._mycol)(__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=2490432;
 //BA.debugLineNum = 2490432;BA.debugLine="SelColumn(myc.Name)";
__ref._selcolumn /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_myc.Name /*String*/ );
RDebugUtils.currentLine=2490433;
 //BA.debugLineNum = 2490433;BA.debugLine="NextEditableColumn";
__ref._nexteditablecolumn /*void*/ (null);
RDebugUtils.currentLine=2490434;
 //BA.debugLineNum = 2490434;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 59:
//C
this.state = 62;
;
 if (true) break;

case 61:
//C
this.state = 62;
 if (true) break;
;
RDebugUtils.currentLine=2490440;
 //BA.debugLineNum = 2490440;BA.debugLine="If row<1 Then row=1";

case 62:
//if
this.state = 67;
if (_row<1) { 
this.state = 64;
;}if (true) break;

case 64:
//C
this.state = 67;
_row = (long) (1);
if (true) break;

case 67:
//C
this.state = 68;
;
RDebugUtils.currentLine=2490442;
 //BA.debugLineNum = 2490442;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
RDebugUtils.currentLine=2490443;
 //BA.debugLineNum = 2490443;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "keypressed_filter"),(int) (0));
this.state = 103;
return;
case 103:
//C
this.state = 68;
;
RDebugUtils.currentLine=2490444;
 //BA.debugLineNum = 2490444;BA.debugLine="thistable.CellClicked(col, row)";
__ref._thistable /*b4j.example.b4xtableselections*/ ._cellclicked /*String*/ (null,_col,_row);
 if (true) break;

case 68:
//C
this.state = 69;
;
 if (true) break;
;
RDebugUtils.currentLine=2490450;
 //BA.debugLineNum = 2490450;BA.debugLine="If noEdit=True Then";

case 69:
//if
this.state = 98;
if (__ref._noedit /*boolean*/ ==parent.__c.True) { 
this.state = 71;
}if (true) break;

case 71:
//C
this.state = 72;
RDebugUtils.currentLine=2490451;
 //BA.debugLineNum = 2490451;BA.debugLine="Dim jo As JavaObject = e";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_e.getObject()));
RDebugUtils.currentLine=2490452;
 //BA.debugLineNum = 2490452;BA.debugLine="Dim EventType As String = jo.RunMethodJO(\"getEve";
_eventtype = BA.ObjectToString(_jo.RunMethodJO("getEventType",(Object[])(parent.__c.Null)).RunMethod("getName",(Object[])(parent.__c.Null)));
RDebugUtils.currentLine=2490453;
 //BA.debugLineNum = 2490453;BA.debugLine="If EventType = \"KEY_PRESSED\" Then";
if (true) break;

case 72:
//if
this.state = 97;
if ((_eventtype).equals("KEY_PRESSED")) { 
this.state = 74;
}if (true) break;

case 74:
//C
this.state = 75;
RDebugUtils.currentLine=2490454;
 //BA.debugLineNum = 2490454;BA.debugLine="Dim keycode As String = jo.RunMethod(\"getCode\",";
_keycode = BA.ObjectToString(_jo.RunMethod("getCode",(Object[])(parent.__c.Null)));
RDebugUtils.currentLine=2490455;
 //BA.debugLineNum = 2490455;BA.debugLine="If keycode = \"ESCAPE\" Then";
if (true) break;

case 75:
//if
this.state = 78;
if ((_keycode).equals("ESCAPE")) { 
this.state = 77;
}if (true) break;

case 77:
//C
this.state = 78;
RDebugUtils.currentLine=2490456;
 //BA.debugLineNum = 2490456;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=2490457;
 //BA.debugLineNum = 2490457;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
 if (true) break;
;
RDebugUtils.currentLine=2490459;
 //BA.debugLineNum = 2490459;BA.debugLine="If keycode=\"TAB\" And xtra.IsComboBoxFocused(MyC";

case 78:
//if
this.state = 87;
if ((_keycode).equals("TAB") && __ref._xtra /*b4j.example.b4xmagmafuncs*/ ._iscomboboxfocused /*boolean*/ (null,__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ )==parent.__c.False) { 
this.state = 80;
}if (true) break;

case 80:
//C
this.state = 81;
RDebugUtils.currentLine=2490460;
 //BA.debugLineNum = 2490460;BA.debugLine="If SelectedColumn.Controltype.Contains(\"NUMERI";
if (true) break;

case 81:
//if
this.state = 86;
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Controltype /*String*/ .contains("NUMERIC")) { 
this.state = 83;
}else {
this.state = 85;
}if (true) break;

case 83:
//C
this.state = 86;
RDebugUtils.currentLine=2490461;
 //BA.debugLineNum = 2490461;BA.debugLine="mynumfield_Action";
__ref._mynumfield_action /*String*/ (null);
 if (true) break;

case 85:
//C
this.state = 86;
RDebugUtils.currentLine=2490463;
 //BA.debugLineNum = 2490463;BA.debugLine="mytextfield_Action";
__ref._mytextfield_action /*String*/ (null);
 if (true) break;

case 86:
//C
this.state = 87;
;
 if (true) break;
;
RDebugUtils.currentLine=2490466;
 //BA.debugLineNum = 2490466;BA.debugLine="If xtra.IsComboBoxFocused(MyComboField) And (ke";

case 87:
//if
this.state = 96;
if (__ref._xtra /*b4j.example.b4xmagmafuncs*/ ._iscomboboxfocused /*boolean*/ (null,__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ ) && ((_keycode).equals("ENTER") || (_keycode).equals("TAB"))) { 
this.state = 89;
}if (true) break;

case 89:
//C
this.state = 90;
RDebugUtils.currentLine=2490469;
 //BA.debugLineNum = 2490469;BA.debugLine="If MyComboField.Editable=True Then";
if (true) break;

case 90:
//if
this.state = 95;
if (__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getEditable()==parent.__c.True) { 
this.state = 92;
}else {
this.state = 94;
}if (true) break;

case 92:
//C
this.state = 95;
RDebugUtils.currentLine=2490470;
 //BA.debugLineNum = 2490470;BA.debugLine="Dim tmp As String=MyComboField.Value  'here";
_tmp = BA.ObjectToString(__ref._mycombofield /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
RDebugUtils.currentLine=2490471;
 //BA.debugLineNum = 2490471;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "keypressed_filter"),(int) (0));
this.state = 104;
return;
case 104:
//C
this.state = 95;
;
RDebugUtils.currentLine=2490472;
 //BA.debugLineNum = 2490472;BA.debugLine="SetValue(SelectedRow,SelectedColumn.Name,tmp";
__ref._setvalue /*String*/ (null,__ref._selectedrow /*long*/ ,__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Name /*String*/ ,(Object)(_tmp));
 if (true) break;

case 94:
//C
this.state = 95;
RDebugUtils.currentLine=2490474;
 //BA.debugLineNum = 2490474;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
 if (true) break;

case 95:
//C
this.state = 96;
;
RDebugUtils.currentLine=2490476;
 //BA.debugLineNum = 2490476;BA.debugLine="NextEditableColumn";
__ref._nexteditablecolumn /*void*/ (null);
RDebugUtils.currentLine=2490478;
 //BA.debugLineNum = 2490478;BA.debugLine="noEdit=False";
__ref._noedit /*boolean*/  = parent.__c.False;
 if (true) break;

case 96:
//C
this.state = 97;
;
 if (true) break;

case 97:
//C
this.state = 98;
;
 if (true) break;

case 98:
//C
this.state = -1;
;
RDebugUtils.currentLine=2490510;
 //BA.debugLineNum = 2490510;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="For k=0 To MyColumns.size-1";
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
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="Dim MyColumn As mycol=MyColumns.Get(k)";
_mycolumn = (b4j.example.magmagrid._mycol)(__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k));
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="If MyColumn.Name.Trim=ID1 Then Exit";
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
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="TheIndexCol=k";
__ref._theindexcol /*int*/  = _k;
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="SelectedColumn=MyColumn";
__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/  = _mycolumn;
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=1638412;
 //BA.debugLineNum = 1638412;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="useB4XTable.UpdateTableCounters";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._updatetablecounters /*String*/ (null);
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="For k=TheIndexCol+1 To MyColumns.Size-1";
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
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="Dim myc As mycol=MyColumns.Get(k)";
_myc = (b4j.example.magmagrid._mycol)(__ref._mycolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_k));
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="If myc.Locked=False And myc.Hidden=False And Not";
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
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="useB4XTable_CellClicked(myc.Name,SelectedRow)";
__ref._useb4xtable_cellclicked /*void*/ (null,_myc.Name /*String*/ ,__ref._selectedrow /*long*/ );
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 15;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="If SelectedRow < MyList.Size Then";

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
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="SelectedRow=SelectedRow+1";
__ref._selectedrow /*long*/  = (long) (__ref._selectedrow /*long*/ +1);
RDebugUtils.currentLine=1114129;
 //BA.debugLineNum = 1114129;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "nexteditablecolumn"),(int) (0));
this.state = 16;
return;
case 16:
//C
this.state = 13;
;
RDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="wait for (GoAtRowAndClick(SelectedRow)) complet";
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
RDebugUtils.currentLine=1114134;
 //BA.debugLineNum = 1114134;BA.debugLine="SelectedRow=1";
__ref._selectedrow /*long*/  = (long) (1);
RDebugUtils.currentLine=1114135;
 //BA.debugLineNum = 1114135;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "magmagrid", "nexteditablecolumn"),(int) (0));
this.state = 18;
return;
case 18:
//C
this.state = 13;
;
RDebugUtils.currentLine=1114136;
 //BA.debugLineNum = 1114136;BA.debugLine="wait for (GoAtRowAndClick(SelectedRow)) complet";
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
RDebugUtils.currentLine=1114140;
 //BA.debugLineNum = 1114140;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub mynumfield_Action";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="If MyNumField.Text.Trim.Length=0 Then";
if (__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().trim().length()==0) { 
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="MyNumField.Text=SelectedColumn.Defaultvalue";
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Defaultvalue /*String*/ );
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="RowCalcPraxis";
__ref._rowcalcpraxis /*String*/ (null);
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="NextEditableColumn";
__ref._nexteditablecolumn /*void*/ (null);
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="If MyNumField.Text <> \"\" And IsNumber(MyNumField.";
if ((__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false && __c.IsNumber(__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())) { 
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="MyNumField.Text = NumberFormat2(MyNumField.Text,";
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.NumberFormat2((double)(Double.parseDouble(__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())),__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MinIntegers /*int*/ ,__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MinFractions /*int*/ ,__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxFractions /*int*/ ,__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Grouping /*boolean*/ ));
 };
RDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="RowCalcPraxis";
__ref._rowcalcpraxis /*String*/ (null);
RDebugUtils.currentLine=1835022;
 //BA.debugLineNum = 1835022;BA.debugLine="NextEditableColumn";
__ref._nexteditablecolumn /*void*/ (null);
RDebugUtils.currentLine=1835023;
 //BA.debugLineNum = 1835023;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
RDebugUtils.currentLine=1835024;
 //BA.debugLineNum = 1835024;BA.debugLine="End Sub";
return "";
}
public String  _mytextfield_action(b4j.example.magmagrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "mytextfield_action", false))
	 {return ((String) Debug.delegate(ba, "mytextfield_action", null));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub mytextfield_Action";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="If MyTextField.Text.Trim.Length=0 Then";
if (__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().trim().length()==0) { 
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="MyTextField.Text=SelectedColumn.Defaultvalue";
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Defaultvalue /*String*/ );
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="NextEditableColumn";
__ref._nexteditablecolumn /*void*/ (null);
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
RDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="NextEditableColumn";
__ref._nexteditablecolumn /*void*/ (null);
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="End Sub";
return "";
}
public String  _mycheckbox_checkedchange(b4j.example.magmagrid __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "mycheckbox_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "mycheckbox_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Private Sub MyCheckBox_CheckedChange(Checked As Bo";
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return "";
}
public String  _mycombofield_selectedindexchanged(b4j.example.magmagrid __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "mycombofield_selectedindexchanged", false))
	 {return ((String) Debug.delegate(ba, "mycombofield_selectedindexchanged", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.collections.Map _map1 = null;
String _afield = "";
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub MyComboField_SelectedIndexChanged(Inde";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="If Index>-1 Then";
if (_index>-1) { 
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="If Index<>MyPrevComboIndex Then";
if (_index!=__ref._myprevcomboindex /*int*/ ) { 
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Private map1 As Map=SelectedColumn.UseList.Get(";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
_map1 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .UseList /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index)));
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="For Each afield As String In map1.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _map1.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_afield = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="If SelectedColumn.Name<>afield Then";
if ((__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Name /*String*/ ).equals(_afield) == false) { 
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="SetValue(SelectedRow,afield,map1.Get(afield))";
__ref._setvalue /*String*/ (null,__ref._selectedrow /*long*/ ,_afield,_map1.Get((Object)(_afield)));
 }else {
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="SetValue(SelectedRow,afield,Value)";
__ref._setvalue /*String*/ (null,__ref._selectedrow /*long*/ ,_afield,_value);
 };
 }
};
RDebugUtils.currentLine=2228235;
 //BA.debugLineNum = 2228235;BA.debugLine="MyPrevComboIndex=Index";
__ref._myprevcomboindex /*int*/  = _index;
RDebugUtils.currentLine=2228236;
 //BA.debugLineNum = 2228236;BA.debugLine="RowCalcPraxis";
__ref._rowcalcpraxis /*String*/ (null);
 };
 };
RDebugUtils.currentLine=2228239;
 //BA.debugLineNum = 2228239;BA.debugLine="End Sub";
return "";
}
public String  _mycombofield_valuechanged(b4j.example.magmagrid __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "mycombofield_valuechanged", false))
	 {return ((String) Debug.delegate(ba, "mycombofield_valuechanged", new Object[] {_value}));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Private Sub MyComboField_ValueChanged (Value As Ob";
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return "";
}
public String  _mynumfield_focuschanged(b4j.example.magmagrid __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "mynumfield_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "mynumfield_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub mynumfield_FocusChanged (HasFocus As B";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="noEdit=HasFocus";
__ref._noedit /*boolean*/  = _hasfocus;
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="If HasFocus=True Then";
if (_hasfocus==__c.True) { 
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="PrevColumn=SelectedColumn";
__ref._prevcolumn /*b4j.example.magmagrid._mycol*/  = __ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ ;
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="RowCalcPraxis";
__ref._rowcalcpraxis /*String*/ (null);
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="If HasFocus = False And MyNumField.Text <> \"\" And";
if (_hasfocus==__c.False && (__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false && __c.IsNumber(__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())) { 
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="MyNumField.Text = NumberFormat2(MyNumField.Text,";
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.NumberFormat2((double)(Double.parseDouble(__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())),__ref._prevcolumn /*b4j.example.magmagrid._mycol*/ .MinIntegers /*int*/ ,__ref._prevcolumn /*b4j.example.magmagrid._mycol*/ .MinFractions /*int*/ ,__ref._prevcolumn /*b4j.example.magmagrid._mycol*/ .MaxFractions /*int*/ ,__ref._prevcolumn /*b4j.example.magmagrid._mycol*/ .Grouping /*boolean*/ ));
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=1900555;
 //BA.debugLineNum = 1900555;BA.debugLine="RowCalcPraxis";
__ref._rowcalcpraxis /*String*/ (null);
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1900559;
 //BA.debugLineNum = 1900559;BA.debugLine="If HasFocus=False And MyNumField.Text.Trim.Length";
if (_hasfocus==__c.False && __ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().trim().length()==0) { 
RDebugUtils.currentLine=1900560;
 //BA.debugLineNum = 1900560;BA.debugLine="MyNumField.Text=SelectedColumn.Defaultvalue";
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Defaultvalue /*String*/ );
RDebugUtils.currentLine=1900561;
 //BA.debugLineNum = 1900561;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=1900562;
 //BA.debugLineNum = 1900562;BA.debugLine="RowCalcPraxis";
__ref._rowcalcpraxis /*String*/ (null);
RDebugUtils.currentLine=1900563;
 //BA.debugLineNum = 1900563;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
RDebugUtils.currentLine=1900564;
 //BA.debugLineNum = 1900564;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1900566;
 //BA.debugLineNum = 1900566;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub mynumfield_TextChanged (Old As String, New As";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Dim update As Boolean";
_update = false;
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="Try";
try {RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="Dim text As String= Regex.Replace(\"[^0-9.]\", New";
_text = __c.Regex.Replace("[^0-9.]",_new,"");
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="Dim firstDot As Int = text.IndexOf(\".\")";
_firstdot = _text.indexOf(".");
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="If firstDot > -1 Then";
if (_firstdot>-1) { 
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="Dim before As String = text.SubString2(0, first";
_before = _text.substring((int) (0),(int) (_firstdot+1));
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="Dim after As String = Regex.Replace(\"[.]\", text";
_after = __c.Regex.Replace("[.]",_text.substring((int) (_firstdot+1)),"");
RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="text = before & after";
_text = _before+_after;
 };
RDebugUtils.currentLine=1769488;
 //BA.debugLineNum = 1769488;BA.debugLine="If New <> text Then update = True";
if ((_new).equals(_text) == false) { 
_update = __c.True;};
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=1769490;
 //BA.debugLineNum = 1769490;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("21769490",__c.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=1769495;
 //BA.debugLineNum = 1769495;BA.debugLine="If text.Length > SelectedColumn.MaxLength  Then";
if (_text.length()>__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxLength /*int*/ ) { 
RDebugUtils.currentLine=1769496;
 //BA.debugLineNum = 1769496;BA.debugLine="text = text.SubString2(0, SelectedColumn.MaxLeng";
_text = _text.substring((int) (0),__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxLength /*int*/ );
RDebugUtils.currentLine=1769497;
 //BA.debugLineNum = 1769497;BA.debugLine="update = True";
_update = __c.True;
 };
RDebugUtils.currentLine=1769500;
 //BA.debugLineNum = 1769500;BA.debugLine="If text.Trim.Length=0 Then";
if (_text.trim().length()==0) { 
RDebugUtils.currentLine=1769501;
 //BA.debugLineNum = 1769501;BA.debugLine="update=True";
_update = __c.True;
 };
RDebugUtils.currentLine=1769506;
 //BA.debugLineNum = 1769506;BA.debugLine="If update Then";
if (_update) { 
RDebugUtils.currentLine=1769507;
 //BA.debugLineNum = 1769507;BA.debugLine="MyNumField.Text = text";
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_text);
RDebugUtils.currentLine=1769508;
 //BA.debugLineNum = 1769508;BA.debugLine="MyNumField.SetSelection(text.Length, text.Length";
__ref._mynumfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .SetSelection(_text.length(),_text.length());
 };
RDebugUtils.currentLine=1769512;
 //BA.debugLineNum = 1769512;BA.debugLine="End Sub";
return "";
}
public String  _mytextfield_focuschanged(b4j.example.magmagrid __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "mytextfield_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "mytextfield_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub mytextfield_FocusChanged (HasFocus As";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="noEdit=HasFocus";
__ref._noedit /*boolean*/  = _hasfocus;
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="If HasFocus=False And MyTextField.Text.Trim.Lengt";
if (_hasfocus==__c.False && __ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().trim().length()==0) { 
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="MyTextField.Text=SelectedColumn.Defaultvalue";
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .Defaultvalue /*String*/ );
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="If HasFocus=False Then";
if (_hasfocus==__c.False) { 
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="ie.ExitEditMode";
__ref._ie /*b4j.example.inlineediting*/ ._exiteditmode /*String*/ (null);
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="useB4XTable.clvData.sv.RequestFocus";
__ref._useb4xtable /*b4j.example.b4xtable*/ ._clvdata /*b4j.example.customlistview*/ ._sv.RequestFocus();
 };
RDebugUtils.currentLine=2097167;
 //BA.debugLineNum = 2097167;BA.debugLine="End Sub";
return "";
}
public String  _mytextfield_textchanged(b4j.example.magmagrid __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "mytextfield_textchanged", false))
	 {return ((String) Debug.delegate(ba, "mytextfield_textchanged", new Object[] {_old,_new}));}
boolean _update = false;
String _text = "";
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub mytextfield_TextChanged (Old As String, New As";
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Dim update As Boolean";
_update = false;
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="Dim text As String=New";
_text = _new;
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="If SelectedColumn.MaxLength>0 Then";
if (__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxLength /*int*/ >0) { 
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="If text.Length > SelectedColumn.MaxLength Then";
if (_text.length()>__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxLength /*int*/ ) { 
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="text = text.SubString2(0, SelectedColumn.MaxLeng";
_text = _text.substring((int) (0),__ref._selectedcolumn /*b4j.example.magmagrid._mycol*/ .MaxLength /*int*/ );
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="update = True";
_update = __c.True;
 };
 };
RDebugUtils.currentLine=1966096;
 //BA.debugLineNum = 1966096;BA.debugLine="If text.Trim.Length=0 Then";
if (_text.trim().length()==0) { 
RDebugUtils.currentLine=1966097;
 //BA.debugLineNum = 1966097;BA.debugLine="update=True";
_update = __c.True;
 };
RDebugUtils.currentLine=1966101;
 //BA.debugLineNum = 1966101;BA.debugLine="If update Then";
if (_update) { 
RDebugUtils.currentLine=1966102;
 //BA.debugLineNum = 1966102;BA.debugLine="MyTextField.Text = text";
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_text);
RDebugUtils.currentLine=1966103;
 //BA.debugLineNum = 1966103;BA.debugLine="MyTextField.SetSelection(text.Length, text.Lengt";
__ref._mytextfield /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .SetSelection(_text.length(),_text.length());
 };
RDebugUtils.currentLine=1966107;
 //BA.debugLineNum = 1966107;BA.debugLine="End Sub";
return "";
}
public String  _resizetimer_tick(b4j.example.magmagrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "resizetimer_tick", false))
	 {return ((String) Debug.delegate(ba, "resizetimer_tick", null));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub ResizeTimer_Tick";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="resizeTimer.Enabled = False";
__ref._resizetimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="EnableResizeGuidelines";
__ref._enableresizeguidelines /*String*/ (null);
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="End Sub";
return "";
}
public String  _useb4xtable_dataupdated(b4j.example.magmagrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="magmagrid";
if (Debug.shouldDelegate(ba, "useb4xtable_dataupdated", false))
	 {return ((String) Debug.delegate(ba, "useb4xtable_dataupdated", null));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub useB4XTable_DataUpdated";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="ie.DataUpdated";
__ref._ie /*b4j.example.inlineediting*/ ._dataupdated /*String*/ (null);
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
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