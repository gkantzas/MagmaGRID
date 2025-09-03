package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xeval_subs_0 {


public static RemoteObject  _buildtree(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildTree (b4xeval) ","b4xeval",3,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("buildtree")) { return __ref.runUserSub(false, "b4xeval","buildtree", __ref);}
RemoteObject _rt = RemoteObject.declareNull("b4j.example.b4xeval._parsednode");
RemoteObject _pn = RemoteObject.declareNull("b4j.example.b4xeval._parsednode");
RemoteObject _built = RemoteObject.createImmutable(false);
 BA.debugLineNum = 136;BA.debugLine="private Sub BuildTree As ParsedNode";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="Dim rt As ParsedNode";
Debug.ShouldStop(256);
_rt = RemoteObject.createNew ("b4j.example.b4xeval._parsednode");Debug.locals.put("rt", _rt);
 BA.debugLineNum = 138;BA.debugLine="Do While ParseIndex < Nodes.Size";
Debug.ShouldStop(512);
while (RemoteObject.solveBoolean("<",__ref.getField(true,"_parseindex" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_nodes" /*RemoteObject*/ ).runMethod(true,"getSize")))) {
 BA.debugLineNum = 139;BA.debugLine="Dim pn As ParsedNode = TakeNextNode";
Debug.ShouldStop(1024);
_pn = __ref.runClassMethod (b4j.example.b4xeval.class, "_takenextnode" /*RemoteObject*/ );Debug.locals.put("pn", _pn);Debug.locals.put("pn", _pn);
 BA.debugLineNum = 140;BA.debugLine="Dim built As Boolean";
Debug.ShouldStop(2048);
_built = RemoteObject.createImmutable(false);Debug.locals.put("built", _built);
 BA.debugLineNum = 141;BA.debugLine="If pn.Operator = \")\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_pn.getField(true,"Operator" /*RemoteObject*/ ),BA.ObjectToString(")"))) { 
 BA.debugLineNum = 142;BA.debugLine="Exit";
Debug.ShouldStop(8192);
if (true) break;
 }else 
{ BA.debugLineNum = 143;BA.debugLine="Else If pn.Operator = \"(\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_pn.getField(true,"Operator" /*RemoteObject*/ ),BA.ObjectToString("("))) { 
 BA.debugLineNum = 144;BA.debugLine="pn = BuildTree";
Debug.ShouldStop(32768);
_pn = __ref.runClassMethod (b4j.example.b4xeval.class, "_buildtree" /*RemoteObject*/ );Debug.locals.put("pn", _pn);
 BA.debugLineNum = 145;BA.debugLine="built = True";
Debug.ShouldStop(65536);
_built = b4xeval.__c.getField(true,"True");Debug.locals.put("built", _built);
 }}
;
 BA.debugLineNum = 147;BA.debugLine="If pn.NodeType = NUMBER_TYPE Or built Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_pn.getField(true,"NodeType" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_number_type" /*RemoteObject*/ ))) || RemoteObject.solveBoolean(".",_built)) { 
 BA.debugLineNum = 148;BA.debugLine="If rt.IsInitialized Then";
Debug.ShouldStop(524288);
if (_rt.getField(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 149;BA.debugLine="rt.Right = pn";
Debug.ShouldStop(1048576);
_rt.setField ("Right" /*RemoteObject*/ ,_pn);
 }else {
 BA.debugLineNum = 151;BA.debugLine="rt = pn";
Debug.ShouldStop(4194304);
_rt = _pn;Debug.locals.put("rt", _rt);
 };
 }else 
{ BA.debugLineNum = 153;BA.debugLine="Else if pn.NodeType = OPERATOR_TYPE Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_pn.getField(true,"NodeType" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_operator_type" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 154;BA.debugLine="pn.Left = rt";
Debug.ShouldStop(33554432);
_pn.setField ("Left" /*RemoteObject*/ ,_rt);
 BA.debugLineNum = 155;BA.debugLine="rt = pn";
Debug.ShouldStop(67108864);
_rt = _pn;Debug.locals.put("rt", _rt);
 }}
;
 }
;
 BA.debugLineNum = 158;BA.debugLine="If rt.IsInitialized = False Then rt = pn";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_rt.getField(true,"IsInitialized" /*RemoteObject*/ ),b4xeval.__c.getField(true,"False"))) { 
_rt = _pn;Debug.locals.put("rt", _rt);};
 BA.debugLineNum = 159;BA.debugLine="Return rt";
Debug.ShouldStop(1073741824);
if (true) return _rt;
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calcsubexpression(RemoteObject __ref,RemoteObject _expr) throws Exception{
try {
		Debug.PushSubsStack("CalcSubExpression (b4xeval) ","b4xeval",3,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("calcsubexpression")) { return __ref.runUserSub(false, "b4xeval","calcsubexpression", __ref, _expr);}
RemoteObject _be = RemoteObject.declareNull("b4j.example.b4xeval");
RemoteObject _d = RemoteObject.createImmutable(0);
Debug.locals.put("expr", _expr);
 BA.debugLineNum = 71;BA.debugLine="Private Sub CalcSubExpression (expr As String) As";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Dim be As B4XEval";
Debug.ShouldStop(128);
_be = RemoteObject.createNew ("b4j.example.b4xeval");Debug.locals.put("be", _be);
 BA.debugLineNum = 73;BA.debugLine="be.Initialize (mCallback, mEventName)";
Debug.ShouldStop(256);
_be.runClassMethod (b4j.example.b4xeval.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_meventname" /*RemoteObject*/ )));
 BA.debugLineNum = 74;BA.debugLine="Dim d As Double = be.EvalHelper(expr)";
Debug.ShouldStop(512);
_d = _be.runClassMethod (b4j.example.b4xeval.class, "_evalhelper" /*RemoteObject*/ ,(Object)(_expr));Debug.locals.put("d", _d);Debug.locals.put("d", _d);
 BA.debugLineNum = 75;BA.debugLine="If be.Error Then";
Debug.ShouldStop(1024);
if (_be.getField(true,"_error" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 76;BA.debugLine="Error = True";
Debug.ShouldStop(2048);
__ref.setField ("_error" /*RemoteObject*/ ,b4xeval.__c.getField(true,"True"));
 BA.debugLineNum = 77;BA.debugLine="Return 0";
Debug.ShouldStop(4096);
if (true) return BA.numberCast(double.class, 0);
 };
 BA.debugLineNum = 79;BA.debugLine="Return d";
Debug.ShouldStop(16384);
if (true) return _d;
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private Const NUMBER_TYPE = 1, OPERATOR_TYPE = 2";
b4xeval._number_type = BA.numberCast(int.class, 1);__ref.setField("_number_type",b4xeval._number_type);
b4xeval._operator_type = BA.numberCast(int.class, 2);__ref.setField("_operator_type",b4xeval._operator_type);
 //BA.debugLineNum = 5;BA.debugLine="Type ParsedNode (Operator As String, Left As Pars";
;
 //BA.debugLineNum = 7;BA.debugLine="Type OrderData (Index As Int, Level As Int, Added";
;
 //BA.debugLineNum = 8;BA.debugLine="Private root As ParsedNode";
b4xeval._root = RemoteObject.createNew ("b4j.example.b4xeval._parsednode");__ref.setField("_root",b4xeval._root);
 //BA.debugLineNum = 9;BA.debugLine="Private ParseIndex As Int";
b4xeval._parseindex = RemoteObject.createImmutable(0);__ref.setField("_parseindex",b4xeval._parseindex);
 //BA.debugLineNum = 10;BA.debugLine="Private Nodes As List";
b4xeval._nodes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_nodes",b4xeval._nodes);
 //BA.debugLineNum = 11;BA.debugLine="Private OperatorLevel As Map";
b4xeval._operatorlevel = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_operatorlevel",b4xeval._operatorlevel);
 //BA.debugLineNum = 12;BA.debugLine="Public Error As Boolean";
b4xeval._error = RemoteObject.createImmutable(false);__ref.setField("_error",b4xeval._error);
 //BA.debugLineNum = 13;BA.debugLine="Private mCallback As Object";
b4xeval._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",b4xeval._mcallback);
 //BA.debugLineNum = 14;BA.debugLine="Private mEventName As String";
b4xeval._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4xeval._meventname);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createnumbernode(RemoteObject __ref,RemoteObject _d) throws Exception{
try {
		Debug.PushSubsStack("CreateNumberNode (b4xeval) ","b4xeval",3,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("createnumbernode")) { return __ref.runUserSub(false, "b4xeval","createnumbernode", __ref, _d);}
RemoteObject _pn = RemoteObject.declareNull("b4j.example.b4xeval._parsednode");
Debug.locals.put("d", _d);
 BA.debugLineNum = 196;BA.debugLine="Private Sub CreateNumberNode (d As Double) As Pars";
Debug.ShouldStop(8);
 BA.debugLineNum = 197;BA.debugLine="Dim pn As ParsedNode";
Debug.ShouldStop(16);
_pn = RemoteObject.createNew ("b4j.example.b4xeval._parsednode");Debug.locals.put("pn", _pn);
 BA.debugLineNum = 198;BA.debugLine="pn.Initialize";
Debug.ShouldStop(32);
_pn.runVoidMethod ("Initialize");
 BA.debugLineNum = 199;BA.debugLine="pn.NodeType = NUMBER_TYPE";
Debug.ShouldStop(64);
_pn.setField ("NodeType" /*RemoteObject*/ ,__ref.getField(true,"_number_type" /*RemoteObject*/ ));
 BA.debugLineNum = 200;BA.debugLine="pn.Value = d";
Debug.ShouldStop(128);
_pn.setField ("Value" /*RemoteObject*/ ,_d);
 BA.debugLineNum = 201;BA.debugLine="Return pn";
Debug.ShouldStop(256);
if (true) return _pn;
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createoperatornode(RemoteObject __ref,RemoteObject _operator) throws Exception{
try {
		Debug.PushSubsStack("CreateOperatorNode (b4xeval) ","b4xeval",3,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("createoperatornode")) { return __ref.runUserSub(false, "b4xeval","createoperatornode", __ref, _operator);}
RemoteObject _pn = RemoteObject.declareNull("b4j.example.b4xeval._parsednode");
Debug.locals.put("operator", _operator);
 BA.debugLineNum = 188;BA.debugLine="Private Sub CreateOperatorNode(operator As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 189;BA.debugLine="Dim pn As ParsedNode";
Debug.ShouldStop(268435456);
_pn = RemoteObject.createNew ("b4j.example.b4xeval._parsednode");Debug.locals.put("pn", _pn);
 BA.debugLineNum = 190;BA.debugLine="pn.Initialize";
Debug.ShouldStop(536870912);
_pn.runVoidMethod ("Initialize");
 BA.debugLineNum = 191;BA.debugLine="pn.NodeType = OPERATOR_TYPE";
Debug.ShouldStop(1073741824);
_pn.setField ("NodeType" /*RemoteObject*/ ,__ref.getField(true,"_operator_type" /*RemoteObject*/ ));
 BA.debugLineNum = 192;BA.debugLine="pn.Operator = operator";
Debug.ShouldStop(-2147483648);
_pn.setField ("Operator" /*RemoteObject*/ ,_operator);
 BA.debugLineNum = 193;BA.debugLine="Return pn";
Debug.ShouldStop(1);
if (true) return _pn;
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _eval(RemoteObject __ref,RemoteObject _expression) throws Exception{
try {
		Debug.PushSubsStack("Eval (b4xeval) ","b4xeval",3,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("eval")) { return __ref.runUserSub(false, "b4xeval","eval", __ref, _expression);}
Debug.locals.put("Expression", _expression);
 BA.debugLineNum = 23;BA.debugLine="Public Sub Eval(Expression As String) As Double";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Error = False";
Debug.ShouldStop(8388608);
__ref.setField ("_error" /*RemoteObject*/ ,b4xeval.__c.getField(true,"False"));
 BA.debugLineNum = 25;BA.debugLine="Expression = Expression.Replace(\" \", \"\").ToLowerC";
Debug.ShouldStop(16777216);
_expression = _expression.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"toLowerCase").runMethod(true,"replace",(Object)(BA.ObjectToString("-(")),(Object)(RemoteObject.createImmutable("-1*(")));Debug.locals.put("Expression", _expression);
 BA.debugLineNum = 26;BA.debugLine="Return EvalHelper(Expression)";
Debug.ShouldStop(33554432);
if (true) return __ref.runClassMethod (b4j.example.b4xeval.class, "_evalhelper" /*RemoteObject*/ ,(Object)(_expression));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _evalhelper(RemoteObject __ref,RemoteObject _expr) throws Exception{
try {
		Debug.PushSubsStack("EvalHelper (b4xeval) ","b4xeval",3,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("evalhelper")) { return __ref.runUserSub(false, "b4xeval","evalhelper", __ref, _expr);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
RemoteObject _lastindex = RemoteObject.createImmutable(0);
RemoteObject _currentorderdata = RemoteObject.declareNull("b4j.example.b4xeval._orderdata");
RemoteObject _operator = RemoteObject.createImmutable("");
RemoteObject _rawnumber = RemoteObject.createImmutable("");
RemoteObject _lastnode = RemoteObject.declareNull("b4j.example.b4xeval._parsednode");
RemoteObject _level = RemoteObject.createImmutable(0);
RemoteObject _d = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("expr", _expr);
 BA.debugLineNum = 83;BA.debugLine="Private Sub EvalHelper (expr As String) As Double";
Debug.ShouldStop(262144);
 BA.debugLineNum = 85;BA.debugLine="ParseIndex = 0";
Debug.ShouldStop(1048576);
__ref.setField ("_parseindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 86;BA.debugLine="Dim root As ParsedNode";
Debug.ShouldStop(2097152);
b4xeval._root = RemoteObject.createNew ("b4j.example.b4xeval._parsednode");__ref.setField("_root",b4xeval._root);
 BA.debugLineNum = 87;BA.debugLine="root.Initialize";
Debug.ShouldStop(4194304);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 88;BA.debugLine="expr = PrepareExpression(expr)";
Debug.ShouldStop(8388608);
_expr = __ref.runClassMethod (b4j.example.b4xeval.class, "_prepareexpression" /*RemoteObject*/ ,(Object)(_expr));Debug.locals.put("expr", _expr);
 BA.debugLineNum = 89;BA.debugLine="If Error Then Return 0";
Debug.ShouldStop(16777216);
if (__ref.getField(true,"_error" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return BA.numberCast(double.class, 0);};
 BA.debugLineNum = 90;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"[\\.\\d]+\", expr)";
Debug.ShouldStop(33554432);
_m = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_m = b4xeval.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("[\\.\\d]+")),(Object)(_expr));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 91;BA.debugLine="Nodes.Initialize";
Debug.ShouldStop(67108864);
__ref.getField(false,"_nodes" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 92;BA.debugLine="Dim lastIndex As Int = 0";
Debug.ShouldStop(134217728);
_lastindex = BA.numberCast(int.class, 0);Debug.locals.put("lastIndex", _lastindex);Debug.locals.put("lastIndex", _lastindex);
 BA.debugLineNum = 93;BA.debugLine="Dim currentOrderData As OrderData";
Debug.ShouldStop(268435456);
_currentorderdata = RemoteObject.createNew ("b4j.example.b4xeval._orderdata");Debug.locals.put("currentOrderData", _currentorderdata);
 BA.debugLineNum = 94;BA.debugLine="currentOrderData.Initialize";
Debug.ShouldStop(536870912);
_currentorderdata.runVoidMethod ("Initialize");
 BA.debugLineNum = 95;BA.debugLine="Nodes.Add(CreateOperatorNode(\"(\"))";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_nodes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.b4xeval.class, "_createoperatornode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("("))))));
 BA.debugLineNum = 96;BA.debugLine="Do While m.Find";
Debug.ShouldStop(-2147483648);
while (_m.runMethod(true,"Find").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 97;BA.debugLine="Dim Operator As String = expr.SubString2(lastInd";
Debug.ShouldStop(1);
_operator = _expr.runMethod(true,"substring",(Object)(_lastindex),(Object)(_m.runMethod(true,"GetStart",(Object)(BA.numberCast(int.class, 0)))));Debug.locals.put("Operator", _operator);Debug.locals.put("Operator", _operator);
 BA.debugLineNum = 98;BA.debugLine="Dim rawNumber As String = m.Match";
Debug.ShouldStop(2);
_rawnumber = _m.runMethod(true,"getMatch");Debug.locals.put("rawNumber", _rawnumber);Debug.locals.put("rawNumber", _rawnumber);
 BA.debugLineNum = 99;BA.debugLine="If Operator.EndsWith(\"-\") Then";
Debug.ShouldStop(4);
if (_operator.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("-"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 100;BA.debugLine="Dim lastNode As ParsedNode = Nodes.Get(Nodes.Si";
Debug.ShouldStop(8);
_lastnode = (__ref.getField(false,"_nodes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_nodes" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("lastNode", _lastnode);Debug.locals.put("lastNode", _lastnode);
 BA.debugLineNum = 101;BA.debugLine="If lastNode.Operator = \"(\" Or Operator.Length >";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_lastnode.getField(true,"Operator" /*RemoteObject*/ ),BA.ObjectToString("(")) || RemoteObject.solveBoolean(">",_operator.runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 103;BA.debugLine="Operator = Operator.SubString2(0, Operator.Len";
Debug.ShouldStop(64);
_operator = _operator.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_operator.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("Operator", _operator);
 BA.debugLineNum = 104;BA.debugLine="rawNumber = \"-\" & rawNumber";
Debug.ShouldStop(128);
_rawnumber = RemoteObject.concat(RemoteObject.createImmutable("-"),_rawnumber);Debug.locals.put("rawNumber", _rawnumber);
 };
 };
 BA.debugLineNum = 107;BA.debugLine="lastIndex = m.GetEnd(0)";
Debug.ShouldStop(1024);
_lastindex = _m.runMethod(true,"GetEnd",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("lastIndex", _lastindex);
 BA.debugLineNum = 108;BA.debugLine="If Operator.Length > 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",_operator.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 109;BA.debugLine="Dim level As Int = OperatorLevel.Get(Operator)";
Debug.ShouldStop(4096);
_level = BA.numberCast(int.class, __ref.getField(false,"_operatorlevel" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_operator))));Debug.locals.put("level", _level);Debug.locals.put("level", _level);
 BA.debugLineNum = 110;BA.debugLine="If currentOrderData.Level > 0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_currentorderdata.getField(true,"Level" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 111;BA.debugLine="If currentOrderData.Level < level Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("<",_currentorderdata.getField(true,"Level" /*RemoteObject*/ ),BA.numberCast(double.class, _level))) { 
 BA.debugLineNum = 112;BA.debugLine="Nodes.InsertAt(currentOrderData.Index, Create";
Debug.ShouldStop(32768);
__ref.getField(false,"_nodes" /*RemoteObject*/ ).runVoidMethod ("InsertAt",(Object)(_currentorderdata.getField(true,"Index" /*RemoteObject*/ )),(Object)((__ref.runClassMethod (b4j.example.b4xeval.class, "_createoperatornode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("("))))));
 BA.debugLineNum = 113;BA.debugLine="currentOrderData.Added = currentOrderData.Add";
Debug.ShouldStop(65536);
_currentorderdata.setField ("Added" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_currentorderdata.getField(true,"Added" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 }else 
{ BA.debugLineNum = 114;BA.debugLine="Else if currentOrderData.Level > level Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_currentorderdata.getField(true,"Level" /*RemoteObject*/ ),BA.numberCast(double.class, _level))) { 
 BA.debugLineNum = 115;BA.debugLine="If currentOrderData.Added > 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_currentorderdata.getField(true,"Added" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 116;BA.debugLine="Nodes.Add(CreateOperatorNode(\")\"))";
Debug.ShouldStop(524288);
__ref.getField(false,"_nodes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.b4xeval.class, "_createoperatornode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(")"))))));
 BA.debugLineNum = 117;BA.debugLine="currentOrderData.Added = currentOrderData.Ad";
Debug.ShouldStop(1048576);
_currentorderdata.setField ("Added" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_currentorderdata.getField(true,"Added" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 };
 }}
;
 };
 BA.debugLineNum = 121;BA.debugLine="currentOrderData.Level = level";
Debug.ShouldStop(16777216);
_currentorderdata.setField ("Level" /*RemoteObject*/ ,_level);
 BA.debugLineNum = 122;BA.debugLine="currentOrderData.Index = Nodes.Size + 1";
Debug.ShouldStop(33554432);
_currentorderdata.setField ("Index" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_nodes" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 123;BA.debugLine="Nodes.Add(CreateOperatorNode(Operator))";
Debug.ShouldStop(67108864);
__ref.getField(false,"_nodes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.b4xeval.class, "_createoperatornode" /*RemoteObject*/ ,(Object)(_operator)))));
 };
 BA.debugLineNum = 125;BA.debugLine="Dim d As Double = rawNumber";
Debug.ShouldStop(268435456);
_d = BA.numberCast(double.class, _rawnumber);Debug.locals.put("d", _d);Debug.locals.put("d", _d);
 BA.debugLineNum = 126;BA.debugLine="Nodes.Add(CreateNumberNode(d))";
Debug.ShouldStop(536870912);
__ref.getField(false,"_nodes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.b4xeval.class, "_createnumbernode" /*RemoteObject*/ ,(Object)(_d)))));
 }
;
 BA.debugLineNum = 128;BA.debugLine="For i = 1 To currentOrderData.Added";
Debug.ShouldStop(-2147483648);
{
final int step43 = 1;
final int limit43 = _currentorderdata.getField(true,"Added" /*RemoteObject*/ ).<Integer>get().intValue();
_i = 1 ;
for (;(step43 > 0 && _i <= limit43) || (step43 < 0 && _i >= limit43) ;_i = ((int)(0 + _i + step43))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 129;BA.debugLine="Nodes.Add(CreateOperatorNode(\")\"))";
Debug.ShouldStop(1);
__ref.getField(false,"_nodes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.b4xeval.class, "_createoperatornode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(")"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 131;BA.debugLine="Nodes.Add(CreateOperatorNode(\")\"))";
Debug.ShouldStop(4);
__ref.getField(false,"_nodes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.b4xeval.class, "_createoperatornode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(")"))))));
 BA.debugLineNum = 132;BA.debugLine="root = BuildTree";
Debug.ShouldStop(8);
__ref.setField ("_root" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xeval.class, "_buildtree" /*RemoteObject*/ ));
 BA.debugLineNum = 133;BA.debugLine="Return EvalNode(root)";
Debug.ShouldStop(16);
if (true) return __ref.runClassMethod (b4j.example.b4xeval.class, "_evalnode" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _evalnode(RemoteObject __ref,RemoteObject _pn) throws Exception{
try {
		Debug.PushSubsStack("EvalNode (b4xeval) ","b4xeval",3,__ref.getField(false, "ba"),__ref,162);
if (RapidSub.canDelegate("evalnode")) { return __ref.runUserSub(false, "b4xeval","evalnode", __ref, _pn);}
RemoteObject _left = RemoteObject.createImmutable(0);
RemoteObject _right = RemoteObject.createImmutable(0);
Debug.locals.put("pn", _pn);
 BA.debugLineNum = 162;BA.debugLine="Private Sub EvalNode (pn As ParsedNode) As Double";
Debug.ShouldStop(2);
 BA.debugLineNum = 164;BA.debugLine="If pn.NodeType = NUMBER_TYPE Then Return pn.Value";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_pn.getField(true,"NodeType" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_number_type" /*RemoteObject*/ )))) { 
if (true) return _pn.getField(true,"Value" /*RemoteObject*/ );};
 BA.debugLineNum = 165;BA.debugLine="Dim left As Double = EvalNode(pn.Left)";
Debug.ShouldStop(16);
_left = __ref.runClassMethod (b4j.example.b4xeval.class, "_evalnode" /*RemoteObject*/ ,(Object)(_pn.getField(false,"Left" /*RemoteObject*/ )));Debug.locals.put("left", _left);Debug.locals.put("left", _left);
 BA.debugLineNum = 166;BA.debugLine="Dim right As Double = EvalNode(pn.Right)";
Debug.ShouldStop(32);
_right = __ref.runClassMethod (b4j.example.b4xeval.class, "_evalnode" /*RemoteObject*/ ,(Object)(_pn.getField(false,"Right" /*RemoteObject*/ )));Debug.locals.put("right", _right);Debug.locals.put("right", _right);
 BA.debugLineNum = 167;BA.debugLine="Select pn.Operator";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(_pn.getField(true,"Operator" /*RemoteObject*/ ),BA.ObjectToString("+"),BA.ObjectToString("-"),BA.ObjectToString("*"),BA.ObjectToString("/"))) {
case 0: {
 BA.debugLineNum = 169;BA.debugLine="Return left + right";
Debug.ShouldStop(256);
if (true) return RemoteObject.solve(new RemoteObject[] {_left,_right}, "+",1, 0);
 break; }
case 1: {
 BA.debugLineNum = 171;BA.debugLine="Return left - right";
Debug.ShouldStop(1024);
if (true) return RemoteObject.solve(new RemoteObject[] {_left,_right}, "-",1, 0);
 break; }
case 2: {
 BA.debugLineNum = 173;BA.debugLine="Return left * right";
Debug.ShouldStop(4096);
if (true) return RemoteObject.solve(new RemoteObject[] {_left,_right}, "*",0, 0);
 break; }
case 3: {
 BA.debugLineNum = 175;BA.debugLine="Return left / right";
Debug.ShouldStop(16384);
if (true) return RemoteObject.solve(new RemoteObject[] {_left,_right}, "/",0, 0);
 break; }
default: {
 BA.debugLineNum = 177;BA.debugLine="Log(\"Syntax error: \" & pn.Operator)";
Debug.ShouldStop(65536);
b4xeval.__c.runVoidMethod ("LogImpl","03735567",RemoteObject.concat(RemoteObject.createImmutable("Syntax error: "),_pn.getField(true,"Operator" /*RemoteObject*/ )),0);
 BA.debugLineNum = 178;BA.debugLine="Return \"error\"";
Debug.ShouldStop(131072);
if (true) return BA.numberCast(double.class, "error");
 break; }
}
;
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xeval) ","b4xeval",3,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xeval","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="mCallback = Callback";
Debug.ShouldStop(131072);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 19;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(262144);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 20;BA.debugLine="OperatorLevel = CreateMap(\"+\": 1, \"-\": 1, \"*\":2,";
Debug.ShouldStop(524288);
__ref.setField ("_operatorlevel" /*RemoteObject*/ ,b4xeval.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("+")),RemoteObject.createImmutable((1)),RemoteObject.createImmutable(("-")),RemoteObject.createImmutable((1)),RemoteObject.createImmutable(("*")),RemoteObject.createImmutable((2)),RemoteObject.createImmutable(("/")),RemoteObject.createImmutable((2))})));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prepareexpression(RemoteObject __ref,RemoteObject _expr) throws Exception{
try {
		Debug.PushSubsStack("PrepareExpression (b4xeval) ","b4xeval",3,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("prepareexpression")) { return __ref.runUserSub(false, "b4xeval","prepareexpression", __ref, _expr);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _lastmatchend = RemoteObject.createImmutable(0);
RemoteObject _currentstart = RemoteObject.createImmutable(0);
RemoteObject _functioncall = RemoteObject.createImmutable(false);
RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _level = RemoteObject.createImmutable(0);
RemoteObject _start = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _d = RemoteObject.createImmutable(0);
Debug.locals.put("expr", _expr);
 BA.debugLineNum = 29;BA.debugLine="Private Sub PrepareExpression(expr As String) As S";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"(\\w*)\\(\", expr)";
Debug.ShouldStop(536870912);
_m = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_m = b4xeval.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("(\\w*)\\(")),(Object)(_expr));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 31;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(1073741824);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 32;BA.debugLine="sb.Initialize";
Debug.ShouldStop(-2147483648);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 33;BA.debugLine="Dim lastMatchEnd As Int = 0";
Debug.ShouldStop(1);
_lastmatchend = BA.numberCast(int.class, 0);Debug.locals.put("lastMatchEnd", _lastmatchend);Debug.locals.put("lastMatchEnd", _lastmatchend);
 BA.debugLineNum = 34;BA.debugLine="Do While m.Find";
Debug.ShouldStop(2);
while (_m.runMethod(true,"Find").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 35;BA.debugLine="Dim currentStart As Int = m.GetStart(0)";
Debug.ShouldStop(4);
_currentstart = _m.runMethod(true,"GetStart",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("currentStart", _currentstart);Debug.locals.put("currentStart", _currentstart);
 BA.debugLineNum = 36;BA.debugLine="If currentStart < lastMatchEnd Then Continue";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("<",_currentstart,BA.numberCast(double.class, _lastmatchend))) { 
if (true) continue;};
 BA.debugLineNum = 37;BA.debugLine="sb.Append(expr.SubString2(lastMatchEnd, currentS";
Debug.ShouldStop(16);
_sb.runVoidMethod ("Append",(Object)(_expr.runMethod(true,"substring",(Object)(_lastmatchend),(Object)(_currentstart))));
 BA.debugLineNum = 38;BA.debugLine="Dim functionCall As Boolean";
Debug.ShouldStop(32);
_functioncall = RemoteObject.createImmutable(false);Debug.locals.put("functionCall", _functioncall);
 BA.debugLineNum = 39;BA.debugLine="Dim args As List";
Debug.ShouldStop(64);
_args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("args", _args);
 BA.debugLineNum = 40;BA.debugLine="If m.Match.Length > 1 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_m.runMethod(true,"getMatch").runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 41;BA.debugLine="args.Initialize";
Debug.ShouldStop(256);
_args.runVoidMethod ("Initialize");
 BA.debugLineNum = 42;BA.debugLine="functionCall = True";
Debug.ShouldStop(512);
_functioncall = b4xeval.__c.getField(true,"True");Debug.locals.put("functionCall", _functioncall);
 };
 BA.debugLineNum = 44;BA.debugLine="Dim level As Int";
Debug.ShouldStop(2048);
_level = RemoteObject.createImmutable(0);Debug.locals.put("level", _level);
 BA.debugLineNum = 45;BA.debugLine="Dim start As Int = m.GetEnd(0)";
Debug.ShouldStop(4096);
_start = _m.runMethod(true,"GetEnd",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("start", _start);Debug.locals.put("start", _start);
 BA.debugLineNum = 46;BA.debugLine="For i = start To expr.Length - 1";
Debug.ShouldStop(8192);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {_expr.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = _start.<Integer>get().intValue() ;
for (;(step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17) ;_i = ((int)(0 + _i + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 47;BA.debugLine="If expr.CharAt(i) = \"(\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_expr.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToChar("("))) { 
 BA.debugLineNum = 48;BA.debugLine="level = level + 1";
Debug.ShouldStop(32768);
_level = RemoteObject.solve(new RemoteObject[] {_level,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("level", _level);
 }else 
{ BA.debugLineNum = 49;BA.debugLine="Else if expr.CharAt(i) = \",\" And level = 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_expr.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToChar(",")) && RemoteObject.solveBoolean("=",_level,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 50;BA.debugLine="args.Add(CalcSubExpression(expr.SubString2(sta";
Debug.ShouldStop(131072);
_args.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4j.example.b4xeval.class, "_calcsubexpression" /*RemoteObject*/ ,(Object)(_expr.runMethod(true,"substring",(Object)(_start),(Object)(BA.numberCast(int.class, _i))))))));
 BA.debugLineNum = 51;BA.debugLine="start = i + 1";
Debug.ShouldStop(262144);
_start = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("start", _start);
 }else 
{ BA.debugLineNum = 52;BA.debugLine="Else if expr.CharAt(i) = \")\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_expr.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _i))),BA.ObjectToChar(")"))) { 
 BA.debugLineNum = 53;BA.debugLine="level = level - 1";
Debug.ShouldStop(1048576);
_level = RemoteObject.solve(new RemoteObject[] {_level,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("level", _level);
 BA.debugLineNum = 54;BA.debugLine="If level = -1 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_level,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 55;BA.debugLine="Dim d As Double = CalcSubExpression(expr.SubS";
Debug.ShouldStop(4194304);
_d = __ref.runClassMethod (b4j.example.b4xeval.class, "_calcsubexpression" /*RemoteObject*/ ,(Object)(_expr.runMethod(true,"substring",(Object)(_start),(Object)(BA.numberCast(int.class, _i)))));Debug.locals.put("d", _d);Debug.locals.put("d", _d);
 BA.debugLineNum = 56;BA.debugLine="If functionCall Then";
Debug.ShouldStop(8388608);
if (_functioncall.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 57;BA.debugLine="args.Add(d)";
Debug.ShouldStop(16777216);
_args.runVoidMethod ("Add",(Object)((_d)));
 BA.debugLineNum = 58;BA.debugLine="d = CallSub3(mCallback, mEventName & \"_Funct";
Debug.ShouldStop(33554432);
_d = BA.numberCast(double.class, b4xeval.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Function"))),(Object)((_m.runMethod(true,"getMatch").runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_m.runMethod(true,"getMatch").runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))))),(Object)((_args))));Debug.locals.put("d", _d);
 };
 BA.debugLineNum = 60;BA.debugLine="sb.Append(NumberFormat2(d, 1, 15, 0, False))";
Debug.ShouldStop(134217728);
_sb.runVoidMethod ("Append",(Object)(b4xeval.__c.runMethod(true,"NumberFormat2",(Object)(_d),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 15)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xeval.__c.getField(true,"False")))));
 BA.debugLineNum = 61;BA.debugLine="lastMatchEnd = i + 1";
Debug.ShouldStop(268435456);
_lastmatchend = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("lastMatchEnd", _lastmatchend);
 BA.debugLineNum = 62;BA.debugLine="Exit";
Debug.ShouldStop(536870912);
if (true) break;
 };
 }}}
;
 }
}Debug.locals.put("i", _i);
;
 }
;
 BA.debugLineNum = 67;BA.debugLine="If lastMatchEnd < expr.Length Then sb.Append(expr";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("<",_lastmatchend,BA.numberCast(double.class, _expr.runMethod(true,"length")))) { 
_sb.runVoidMethod ("Append",(Object)(_expr.runMethod(true,"substring",(Object)(_lastmatchend))));};
 BA.debugLineNum = 68;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(8);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _takenextnode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TakeNextNode (b4xeval) ","b4xeval",3,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("takenextnode")) { return __ref.runUserSub(false, "b4xeval","takenextnode", __ref);}
RemoteObject _pn = RemoteObject.declareNull("b4j.example.b4xeval._parsednode");
 BA.debugLineNum = 182;BA.debugLine="private Sub TakeNextNode As ParsedNode";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="Dim pn As ParsedNode = Nodes.Get(ParseIndex)";
Debug.ShouldStop(4194304);
_pn = (__ref.getField(false,"_nodes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(__ref.getField(true,"_parseindex" /*RemoteObject*/ ))));Debug.locals.put("pn", _pn);Debug.locals.put("pn", _pn);
 BA.debugLineNum = 184;BA.debugLine="ParseIndex = ParseIndex + 1";
Debug.ShouldStop(8388608);
__ref.setField ("_parseindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_parseindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 185;BA.debugLine="Return pn";
Debug.ShouldStop(16777216);
if (true) return _pn;
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}