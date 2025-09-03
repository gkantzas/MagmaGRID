package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xeval extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xeval", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xeval.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _parsednode{
public boolean IsInitialized;
public String Operator;
public b4j.example.b4xeval._parsednode Left;
public b4j.example.b4xeval._parsednode Right;
public int NodeType;
public double Value;
public void Initialize() {
IsInitialized = true;
Operator = "";
Left = new b4j.example.b4xeval._parsednode();
Right = new b4j.example.b4xeval._parsednode();
NodeType = 0;
Value = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _orderdata{
public boolean IsInitialized;
public int Index;
public int Level;
public int Added;
public void Initialize() {
IsInitialized = true;
Index = 0;
Level = 0;
Added = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public int _number_type = 0;
public int _operator_type = 0;
public b4j.example.b4xeval._parsednode _root = null;
public int _parseindex = 0;
public anywheresoftware.b4a.objects.collections.List _nodes = null;
public anywheresoftware.b4a.objects.collections.Map _operatorlevel = null;
public boolean _error = false;
public Object _mcallback = null;
public String _meventname = "";
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4j.example.b4xeval __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xeval";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="mCallback = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="OperatorLevel = CreateMap(\"+\": 1, \"-\": 1, \"*\":2,";
__ref._operatorlevel /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("+"),(Object)(1),(Object)("-"),(Object)(1),(Object)("*"),(Object)(2),(Object)("/"),(Object)(2)});
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="End Sub";
return "";
}
public double  _eval(b4j.example.b4xeval __ref,String _expression) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xeval";
if (Debug.shouldDelegate(ba, "eval", false))
	 {return ((Double) Debug.delegate(ba, "eval", new Object[] {_expression}));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Public Sub Eval(Expression As String) As Double";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Error = False";
__ref._error /*boolean*/  = __c.False;
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="Expression = Expression.Replace(\" \", \"\").ToLowerC";
_expression = _expression.replace(" ","").toLowerCase().replace("-(","-1*(");
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="Return EvalHelper(Expression)";
if (true) return __ref._evalhelper /*double*/ (null,_expression);
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="End Sub";
return 0;
}
public b4j.example.b4xeval._parsednode  _buildtree(b4j.example.b4xeval __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xeval";
if (Debug.shouldDelegate(ba, "buildtree", false))
	 {return ((b4j.example.b4xeval._parsednode) Debug.delegate(ba, "buildtree", null));}
b4j.example.b4xeval._parsednode _rt = null;
b4j.example.b4xeval._parsednode _pn = null;
boolean _built = false;
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="private Sub BuildTree As ParsedNode";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Dim rt As ParsedNode";
_rt = new b4j.example.b4xeval._parsednode();
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Do While ParseIndex < Nodes.Size";
while (__ref._parseindex /*int*/ <__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) {
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="Dim pn As ParsedNode = TakeNextNode";
_pn = __ref._takenextnode /*b4j.example.b4xeval._parsednode*/ (null);
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="Dim built As Boolean";
_built = false;
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="If pn.Operator = \")\" Then";
if ((_pn.Operator /*String*/ ).equals(")")) { 
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="Exit";
if (true) break;
 }else 
{RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="Else If pn.Operator = \"(\" Then";
if ((_pn.Operator /*String*/ ).equals("(")) { 
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="pn = BuildTree";
_pn = __ref._buildtree /*b4j.example.b4xeval._parsednode*/ (null);
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="built = True";
_built = __c.True;
 }}
;
RDebugUtils.currentLine=3670027;
 //BA.debugLineNum = 3670027;BA.debugLine="If pn.NodeType = NUMBER_TYPE Or built Then";
if (_pn.NodeType /*int*/ ==__ref._number_type /*int*/  || _built) { 
RDebugUtils.currentLine=3670028;
 //BA.debugLineNum = 3670028;BA.debugLine="If rt.IsInitialized Then";
if (_rt.IsInitialized /*boolean*/ ) { 
RDebugUtils.currentLine=3670029;
 //BA.debugLineNum = 3670029;BA.debugLine="rt.Right = pn";
_rt.Right /*b4j.example.b4xeval._parsednode*/  = _pn;
 }else {
RDebugUtils.currentLine=3670031;
 //BA.debugLineNum = 3670031;BA.debugLine="rt = pn";
_rt = _pn;
 };
 }else 
{RDebugUtils.currentLine=3670033;
 //BA.debugLineNum = 3670033;BA.debugLine="Else if pn.NodeType = OPERATOR_TYPE Then";
if (_pn.NodeType /*int*/ ==__ref._operator_type /*int*/ ) { 
RDebugUtils.currentLine=3670034;
 //BA.debugLineNum = 3670034;BA.debugLine="pn.Left = rt";
_pn.Left /*b4j.example.b4xeval._parsednode*/  = _rt;
RDebugUtils.currentLine=3670035;
 //BA.debugLineNum = 3670035;BA.debugLine="rt = pn";
_rt = _pn;
 }}
;
 }
;
RDebugUtils.currentLine=3670038;
 //BA.debugLineNum = 3670038;BA.debugLine="If rt.IsInitialized = False Then rt = pn";
if (_rt.IsInitialized /*boolean*/ ==__c.False) { 
_rt = _pn;};
RDebugUtils.currentLine=3670039;
 //BA.debugLineNum = 3670039;BA.debugLine="Return rt";
if (true) return _rt;
RDebugUtils.currentLine=3670040;
 //BA.debugLineNum = 3670040;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xeval._parsednode  _takenextnode(b4j.example.b4xeval __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xeval";
if (Debug.shouldDelegate(ba, "takenextnode", false))
	 {return ((b4j.example.b4xeval._parsednode) Debug.delegate(ba, "takenextnode", null));}
b4j.example.b4xeval._parsednode _pn = null;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="private Sub TakeNextNode As ParsedNode";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Dim pn As ParsedNode = Nodes.Get(ParseIndex)";
_pn = (b4j.example.b4xeval._parsednode)(__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._parseindex /*int*/ ));
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="ParseIndex = ParseIndex + 1";
__ref._parseindex /*int*/  = (int) (__ref._parseindex /*int*/ +1);
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="Return pn";
if (true) return _pn;
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="End Sub";
return null;
}
public double  _calcsubexpression(b4j.example.b4xeval __ref,String _expr) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xeval";
if (Debug.shouldDelegate(ba, "calcsubexpression", false))
	 {return ((Double) Debug.delegate(ba, "calcsubexpression", new Object[] {_expr}));}
b4j.example.b4xeval _be = null;
double _d = 0;
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Private Sub CalcSubExpression (expr As String) As";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Dim be As B4XEval";
_be = new b4j.example.b4xeval();
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="be.Initialize (mCallback, mEventName)";
_be._initialize /*String*/ (null,ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ );
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="Dim d As Double = be.EvalHelper(expr)";
_d = _be._evalhelper /*double*/ (null,_expr);
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="If be.Error Then";
if (_be._error /*boolean*/ ) { 
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="Error = True";
__ref._error /*boolean*/  = __c.True;
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="Return 0";
if (true) return 0;
 };
RDebugUtils.currentLine=3538952;
 //BA.debugLineNum = 3538952;BA.debugLine="Return d";
if (true) return _d;
RDebugUtils.currentLine=3538953;
 //BA.debugLineNum = 3538953;BA.debugLine="End Sub";
return 0;
}
public double  _evalhelper(b4j.example.b4xeval __ref,String _expr) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xeval";
if (Debug.shouldDelegate(ba, "evalhelper", false))
	 {return ((Double) Debug.delegate(ba, "evalhelper", new Object[] {_expr}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
int _lastindex = 0;
b4j.example.b4xeval._orderdata _currentorderdata = null;
String _operator = "";
String _rawnumber = "";
b4j.example.b4xeval._parsednode _lastnode = null;
int _level = 0;
double _d = 0;
int _i = 0;
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Private Sub EvalHelper (expr As String) As Double";
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="ParseIndex = 0";
__ref._parseindex /*int*/  = (int) (0);
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="Dim root As ParsedNode";
_root = new b4j.example.b4xeval._parsednode();
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="root.Initialize";
__ref._root /*b4j.example.b4xeval._parsednode*/ .Initialize();
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="expr = PrepareExpression(expr)";
_expr = __ref._prepareexpression /*String*/ (null,_expr);
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="If Error Then Return 0";
if (__ref._error /*boolean*/ ) { 
if (true) return 0;};
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"[\\.\\d]+\", expr)";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = __c.Regex.Matcher("[\\.\\d]+",_expr);
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="Nodes.Initialize";
__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=3604489;
 //BA.debugLineNum = 3604489;BA.debugLine="Dim lastIndex As Int = 0";
_lastindex = (int) (0);
RDebugUtils.currentLine=3604490;
 //BA.debugLineNum = 3604490;BA.debugLine="Dim currentOrderData As OrderData";
_currentorderdata = new b4j.example.b4xeval._orderdata();
RDebugUtils.currentLine=3604491;
 //BA.debugLineNum = 3604491;BA.debugLine="currentOrderData.Initialize";
_currentorderdata.Initialize();
RDebugUtils.currentLine=3604492;
 //BA.debugLineNum = 3604492;BA.debugLine="Nodes.Add(CreateOperatorNode(\"(\"))";
__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createoperatornode /*b4j.example.b4xeval._parsednode*/ (null,"(")));
RDebugUtils.currentLine=3604493;
 //BA.debugLineNum = 3604493;BA.debugLine="Do While m.Find";
while (_m.Find()) {
RDebugUtils.currentLine=3604494;
 //BA.debugLineNum = 3604494;BA.debugLine="Dim Operator As String = expr.SubString2(lastInd";
_operator = _expr.substring(_lastindex,_m.GetStart((int) (0)));
RDebugUtils.currentLine=3604495;
 //BA.debugLineNum = 3604495;BA.debugLine="Dim rawNumber As String = m.Match";
_rawnumber = _m.getMatch();
RDebugUtils.currentLine=3604496;
 //BA.debugLineNum = 3604496;BA.debugLine="If Operator.EndsWith(\"-\") Then";
if (_operator.endsWith("-")) { 
RDebugUtils.currentLine=3604497;
 //BA.debugLineNum = 3604497;BA.debugLine="Dim lastNode As ParsedNode = Nodes.Get(Nodes.Si";
_lastnode = (b4j.example.b4xeval._parsednode)(__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=3604498;
 //BA.debugLineNum = 3604498;BA.debugLine="If lastNode.Operator = \"(\" Or Operator.Length >";
if ((_lastnode.Operator /*String*/ ).equals("(") || _operator.length()>1) { 
RDebugUtils.currentLine=3604500;
 //BA.debugLineNum = 3604500;BA.debugLine="Operator = Operator.SubString2(0, Operator.Len";
_operator = _operator.substring((int) (0),(int) (_operator.length()-1));
RDebugUtils.currentLine=3604501;
 //BA.debugLineNum = 3604501;BA.debugLine="rawNumber = \"-\" & rawNumber";
_rawnumber = "-"+_rawnumber;
 };
 };
RDebugUtils.currentLine=3604504;
 //BA.debugLineNum = 3604504;BA.debugLine="lastIndex = m.GetEnd(0)";
_lastindex = _m.GetEnd((int) (0));
RDebugUtils.currentLine=3604505;
 //BA.debugLineNum = 3604505;BA.debugLine="If Operator.Length > 0 Then";
if (_operator.length()>0) { 
RDebugUtils.currentLine=3604506;
 //BA.debugLineNum = 3604506;BA.debugLine="Dim level As Int = OperatorLevel.Get(Operator)";
_level = (int)(BA.ObjectToNumber(__ref._operatorlevel /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_operator))));
RDebugUtils.currentLine=3604507;
 //BA.debugLineNum = 3604507;BA.debugLine="If currentOrderData.Level > 0 Then";
if (_currentorderdata.Level /*int*/ >0) { 
RDebugUtils.currentLine=3604508;
 //BA.debugLineNum = 3604508;BA.debugLine="If currentOrderData.Level < level Then";
if (_currentorderdata.Level /*int*/ <_level) { 
RDebugUtils.currentLine=3604509;
 //BA.debugLineNum = 3604509;BA.debugLine="Nodes.InsertAt(currentOrderData.Index, Create";
__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_currentorderdata.Index /*int*/ ,(Object)(__ref._createoperatornode /*b4j.example.b4xeval._parsednode*/ (null,"(")));
RDebugUtils.currentLine=3604510;
 //BA.debugLineNum = 3604510;BA.debugLine="currentOrderData.Added = currentOrderData.Add";
_currentorderdata.Added /*int*/  = (int) (_currentorderdata.Added /*int*/ +1);
 }else 
{RDebugUtils.currentLine=3604511;
 //BA.debugLineNum = 3604511;BA.debugLine="Else if currentOrderData.Level > level Then";
if (_currentorderdata.Level /*int*/ >_level) { 
RDebugUtils.currentLine=3604512;
 //BA.debugLineNum = 3604512;BA.debugLine="If currentOrderData.Added > 0 Then";
if (_currentorderdata.Added /*int*/ >0) { 
RDebugUtils.currentLine=3604513;
 //BA.debugLineNum = 3604513;BA.debugLine="Nodes.Add(CreateOperatorNode(\")\"))";
__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createoperatornode /*b4j.example.b4xeval._parsednode*/ (null,")")));
RDebugUtils.currentLine=3604514;
 //BA.debugLineNum = 3604514;BA.debugLine="currentOrderData.Added = currentOrderData.Ad";
_currentorderdata.Added /*int*/  = (int) (_currentorderdata.Added /*int*/ -1);
 };
 }}
;
 };
RDebugUtils.currentLine=3604518;
 //BA.debugLineNum = 3604518;BA.debugLine="currentOrderData.Level = level";
_currentorderdata.Level /*int*/  = _level;
RDebugUtils.currentLine=3604519;
 //BA.debugLineNum = 3604519;BA.debugLine="currentOrderData.Index = Nodes.Size + 1";
_currentorderdata.Index /*int*/  = (int) (__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()+1);
RDebugUtils.currentLine=3604520;
 //BA.debugLineNum = 3604520;BA.debugLine="Nodes.Add(CreateOperatorNode(Operator))";
__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createoperatornode /*b4j.example.b4xeval._parsednode*/ (null,_operator)));
 };
RDebugUtils.currentLine=3604522;
 //BA.debugLineNum = 3604522;BA.debugLine="Dim d As Double = rawNumber";
_d = (double)(Double.parseDouble(_rawnumber));
RDebugUtils.currentLine=3604523;
 //BA.debugLineNum = 3604523;BA.debugLine="Nodes.Add(CreateNumberNode(d))";
__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createnumbernode /*b4j.example.b4xeval._parsednode*/ (null,_d)));
 }
;
RDebugUtils.currentLine=3604525;
 //BA.debugLineNum = 3604525;BA.debugLine="For i = 1 To currentOrderData.Added";
{
final int step43 = 1;
final int limit43 = _currentorderdata.Added /*int*/ ;
_i = (int) (1) ;
for (;_i <= limit43 ;_i = _i + step43 ) {
RDebugUtils.currentLine=3604526;
 //BA.debugLineNum = 3604526;BA.debugLine="Nodes.Add(CreateOperatorNode(\")\"))";
__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createoperatornode /*b4j.example.b4xeval._parsednode*/ (null,")")));
 }
};
RDebugUtils.currentLine=3604528;
 //BA.debugLineNum = 3604528;BA.debugLine="Nodes.Add(CreateOperatorNode(\")\"))";
__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createoperatornode /*b4j.example.b4xeval._parsednode*/ (null,")")));
RDebugUtils.currentLine=3604529;
 //BA.debugLineNum = 3604529;BA.debugLine="root = BuildTree";
__ref._root /*b4j.example.b4xeval._parsednode*/  = __ref._buildtree /*b4j.example.b4xeval._parsednode*/ (null);
RDebugUtils.currentLine=3604530;
 //BA.debugLineNum = 3604530;BA.debugLine="Return EvalNode(root)";
if (true) return __ref._evalnode /*double*/ (null,__ref._root /*b4j.example.b4xeval._parsednode*/ );
RDebugUtils.currentLine=3604531;
 //BA.debugLineNum = 3604531;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4j.example.b4xeval __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xeval";
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Private Const NUMBER_TYPE = 1, OPERATOR_TYPE = 2";
_number_type = (int) (1);
_operator_type = (int) (2);
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Type ParsedNode (Operator As String, Left As Pars";
;
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="Type OrderData (Index As Int, Level As Int, Added";
;
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="Private root As ParsedNode";
_root = new b4j.example.b4xeval._parsednode();
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="Private ParseIndex As Int";
_parseindex = 0;
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="Private Nodes As List";
_nodes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="Private OperatorLevel As Map";
_operatorlevel = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3276809;
 //BA.debugLineNum = 3276809;BA.debugLine="Public Error As Boolean";
_error = false;
RDebugUtils.currentLine=3276810;
 //BA.debugLineNum = 3276810;BA.debugLine="Private mCallback As Object";
_mcallback = new Object();
RDebugUtils.currentLine=3276811;
 //BA.debugLineNum = 3276811;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4xeval._parsednode  _createnumbernode(b4j.example.b4xeval __ref,double _d) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xeval";
if (Debug.shouldDelegate(ba, "createnumbernode", false))
	 {return ((b4j.example.b4xeval._parsednode) Debug.delegate(ba, "createnumbernode", new Object[] {_d}));}
b4j.example.b4xeval._parsednode _pn = null;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Private Sub CreateNumberNode (d As Double) As Pars";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Dim pn As ParsedNode";
_pn = new b4j.example.b4xeval._parsednode();
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="pn.Initialize";
_pn.Initialize();
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="pn.NodeType = NUMBER_TYPE";
_pn.NodeType /*int*/  = __ref._number_type /*int*/ ;
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="pn.Value = d";
_pn.Value /*double*/  = _d;
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="Return pn";
if (true) return _pn;
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4xeval._parsednode  _createoperatornode(b4j.example.b4xeval __ref,String _operator) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xeval";
if (Debug.shouldDelegate(ba, "createoperatornode", false))
	 {return ((b4j.example.b4xeval._parsednode) Debug.delegate(ba, "createoperatornode", new Object[] {_operator}));}
b4j.example.b4xeval._parsednode _pn = null;
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Private Sub CreateOperatorNode(operator As String)";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="Dim pn As ParsedNode";
_pn = new b4j.example.b4xeval._parsednode();
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="pn.Initialize";
_pn.Initialize();
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="pn.NodeType = OPERATOR_TYPE";
_pn.NodeType /*int*/  = __ref._operator_type /*int*/ ;
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="pn.Operator = operator";
_pn.Operator /*String*/  = _operator;
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="Return pn";
if (true) return _pn;
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="End Sub";
return null;
}
public String  _prepareexpression(b4j.example.b4xeval __ref,String _expr) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xeval";
if (Debug.shouldDelegate(ba, "prepareexpression", false))
	 {return ((String) Debug.delegate(ba, "prepareexpression", new Object[] {_expr}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _lastmatchend = 0;
int _currentstart = 0;
boolean _functioncall = false;
anywheresoftware.b4a.objects.collections.List _args = null;
int _level = 0;
int _start = 0;
int _i = 0;
double _d = 0;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub PrepareExpression(expr As String) As S";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"(\\w*)\\(\", expr)";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = __c.Regex.Matcher("(\\w*)\\(",_expr);
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="Dim lastMatchEnd As Int = 0";
_lastmatchend = (int) (0);
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="Do While m.Find";
while (_m.Find()) {
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="Dim currentStart As Int = m.GetStart(0)";
_currentstart = _m.GetStart((int) (0));
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="If currentStart < lastMatchEnd Then Continue";
if (_currentstart<_lastmatchend) { 
if (true) continue;};
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="sb.Append(expr.SubString2(lastMatchEnd, currentS";
_sb.Append(_expr.substring(_lastmatchend,_currentstart));
RDebugUtils.currentLine=3473417;
 //BA.debugLineNum = 3473417;BA.debugLine="Dim functionCall As Boolean";
_functioncall = false;
RDebugUtils.currentLine=3473418;
 //BA.debugLineNum = 3473418;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3473419;
 //BA.debugLineNum = 3473419;BA.debugLine="If m.Match.Length > 1 Then";
if (_m.getMatch().length()>1) { 
RDebugUtils.currentLine=3473420;
 //BA.debugLineNum = 3473420;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=3473421;
 //BA.debugLineNum = 3473421;BA.debugLine="functionCall = True";
_functioncall = __c.True;
 };
RDebugUtils.currentLine=3473423;
 //BA.debugLineNum = 3473423;BA.debugLine="Dim level As Int";
_level = 0;
RDebugUtils.currentLine=3473424;
 //BA.debugLineNum = 3473424;BA.debugLine="Dim start As Int = m.GetEnd(0)";
_start = _m.GetEnd((int) (0));
RDebugUtils.currentLine=3473425;
 //BA.debugLineNum = 3473425;BA.debugLine="For i = start To expr.Length - 1";
{
final int step17 = 1;
final int limit17 = (int) (_expr.length()-1);
_i = _start ;
for (;_i <= limit17 ;_i = _i + step17 ) {
RDebugUtils.currentLine=3473426;
 //BA.debugLineNum = 3473426;BA.debugLine="If expr.CharAt(i) = \"(\" Then";
if (_expr.charAt(_i)==BA.ObjectToChar("(")) { 
RDebugUtils.currentLine=3473427;
 //BA.debugLineNum = 3473427;BA.debugLine="level = level + 1";
_level = (int) (_level+1);
 }else 
{RDebugUtils.currentLine=3473428;
 //BA.debugLineNum = 3473428;BA.debugLine="Else if expr.CharAt(i) = \",\" And level = 0 Then";
if (_expr.charAt(_i)==BA.ObjectToChar(",") && _level==0) { 
RDebugUtils.currentLine=3473429;
 //BA.debugLineNum = 3473429;BA.debugLine="args.Add(CalcSubExpression(expr.SubString2(sta";
_args.Add((Object)(__ref._calcsubexpression /*double*/ (null,_expr.substring(_start,_i))));
RDebugUtils.currentLine=3473430;
 //BA.debugLineNum = 3473430;BA.debugLine="start = i + 1";
_start = (int) (_i+1);
 }else 
{RDebugUtils.currentLine=3473431;
 //BA.debugLineNum = 3473431;BA.debugLine="Else if expr.CharAt(i) = \")\" Then";
if (_expr.charAt(_i)==BA.ObjectToChar(")")) { 
RDebugUtils.currentLine=3473432;
 //BA.debugLineNum = 3473432;BA.debugLine="level = level - 1";
_level = (int) (_level-1);
RDebugUtils.currentLine=3473433;
 //BA.debugLineNum = 3473433;BA.debugLine="If level = -1 Then";
if (_level==-1) { 
RDebugUtils.currentLine=3473434;
 //BA.debugLineNum = 3473434;BA.debugLine="Dim d As Double = CalcSubExpression(expr.SubS";
_d = __ref._calcsubexpression /*double*/ (null,_expr.substring(_start,_i));
RDebugUtils.currentLine=3473435;
 //BA.debugLineNum = 3473435;BA.debugLine="If functionCall Then";
if (_functioncall) { 
RDebugUtils.currentLine=3473436;
 //BA.debugLineNum = 3473436;BA.debugLine="args.Add(d)";
_args.Add((Object)(_d));
RDebugUtils.currentLine=3473437;
 //BA.debugLineNum = 3473437;BA.debugLine="d = CallSub3(mCallback, mEventName & \"_Funct";
_d = (double)(BA.ObjectToNumber(__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Function",(Object)(_m.getMatch().substring((int) (0),(int) (_m.getMatch().length()-1))),(Object)(_args))));
 };
RDebugUtils.currentLine=3473439;
 //BA.debugLineNum = 3473439;BA.debugLine="sb.Append(NumberFormat2(d, 1, 15, 0, False))";
_sb.Append(__c.NumberFormat2(_d,(int) (1),(int) (15),(int) (0),__c.False));
RDebugUtils.currentLine=3473440;
 //BA.debugLineNum = 3473440;BA.debugLine="lastMatchEnd = i + 1";
_lastmatchend = (int) (_i+1);
RDebugUtils.currentLine=3473441;
 //BA.debugLineNum = 3473441;BA.debugLine="Exit";
if (true) break;
 };
 }}}
;
 }
};
 }
;
RDebugUtils.currentLine=3473446;
 //BA.debugLineNum = 3473446;BA.debugLine="If lastMatchEnd < expr.Length Then sb.Append(expr";
if (_lastmatchend<_expr.length()) { 
_sb.Append(_expr.substring(_lastmatchend));};
RDebugUtils.currentLine=3473447;
 //BA.debugLineNum = 3473447;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=3473448;
 //BA.debugLineNum = 3473448;BA.debugLine="End Sub";
return "";
}
public double  _evalnode(b4j.example.b4xeval __ref,b4j.example.b4xeval._parsednode _pn) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xeval";
if (Debug.shouldDelegate(ba, "evalnode", false))
	 {return ((Double) Debug.delegate(ba, "evalnode", new Object[] {_pn}));}
double _left = 0;
double _right = 0;
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Private Sub EvalNode (pn As ParsedNode) As Double";
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="If pn.NodeType = NUMBER_TYPE Then Return pn.Value";
if (_pn.NodeType /*int*/ ==__ref._number_type /*int*/ ) { 
if (true) return _pn.Value /*double*/ ;};
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="Dim left As Double = EvalNode(pn.Left)";
_left = __ref._evalnode /*double*/ (null,_pn.Left /*b4j.example.b4xeval._parsednode*/ );
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="Dim right As Double = EvalNode(pn.Right)";
_right = __ref._evalnode /*double*/ (null,_pn.Right /*b4j.example.b4xeval._parsednode*/ );
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="Select pn.Operator";
switch (BA.switchObjectToInt(_pn.Operator /*String*/ ,"+","-","*","/")) {
case 0: {
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="Return left + right";
if (true) return _left+_right;
 break; }
case 1: {
RDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="Return left - right";
if (true) return _left-_right;
 break; }
case 2: {
RDebugUtils.currentLine=3735563;
 //BA.debugLineNum = 3735563;BA.debugLine="Return left * right";
if (true) return _left*_right;
 break; }
case 3: {
RDebugUtils.currentLine=3735565;
 //BA.debugLineNum = 3735565;BA.debugLine="Return left / right";
if (true) return _left/(double)_right;
 break; }
default: {
RDebugUtils.currentLine=3735567;
 //BA.debugLineNum = 3735567;BA.debugLine="Log(\"Syntax error: \" & pn.Operator)";
__c.LogImpl("03735567","Syntax error: "+_pn.Operator /*String*/ ,0);
RDebugUtils.currentLine=3735568;
 //BA.debugLineNum = 3735568;BA.debugLine="Return \"error\"";
if (true) return (double)(Double.parseDouble("error"));
 break; }
}
;
RDebugUtils.currentLine=3735570;
 //BA.debugLineNum = 3735570;BA.debugLine="End Sub";
return 0;
}
}