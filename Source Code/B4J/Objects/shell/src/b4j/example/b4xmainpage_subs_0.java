package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
RemoteObject _vatlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mapitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _envfees = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mapitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 23;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Root = Root1";
Debug.ShouldStop(8388608);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 25;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 26;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
Debug.ShouldStop(33554432);
b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 29;BA.debugLine="Main.scene =B4XPages.GetNativeParent(Me).As(JavaO";
Debug.ShouldStop(268435456);
b4xmainpage._main._scene /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), (RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), b4xmainpage._b4xpages.runMethod(false,"_getnativeparent" /*RemoteObject*/ ,(Object)(__ref)))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("scene"))));
 BA.debugLineNum = 34;BA.debugLine="Dim vatlist As List";
Debug.ShouldStop(2);
_vatlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("vatlist", _vatlist);
 BA.debugLineNum = 35;BA.debugLine="vatlist.Initialize";
Debug.ShouldStop(4);
_vatlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 36;BA.debugLine="Dim mapitem As Map";
Debug.ShouldStop(8);
_mapitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapitem", _mapitem);
 BA.debugLineNum = 37;BA.debugLine="mapitem.Initialize";
Debug.ShouldStop(16);
_mapitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 38;BA.debugLine="mapitem.Put(\"Vat%\",\"0.00\")";
Debug.ShouldStop(32);
_mapitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Vat%"))),(Object)((RemoteObject.createImmutable("0.00"))));
 BA.debugLineNum = 39;BA.debugLine="vatlist.Add(mapitem)";
Debug.ShouldStop(64);
_vatlist.runVoidMethod ("Add",(Object)((_mapitem.getObject())));
 BA.debugLineNum = 41;BA.debugLine="Dim mapitem As Map";
Debug.ShouldStop(256);
_mapitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapitem", _mapitem);
 BA.debugLineNum = 42;BA.debugLine="mapitem.Initialize";
Debug.ShouldStop(512);
_mapitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 43;BA.debugLine="mapitem.Put(\"Vat%\",\"6.00\")";
Debug.ShouldStop(1024);
_mapitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Vat%"))),(Object)((RemoteObject.createImmutable("6.00"))));
 BA.debugLineNum = 44;BA.debugLine="vatlist.Add(mapitem)";
Debug.ShouldStop(2048);
_vatlist.runVoidMethod ("Add",(Object)((_mapitem.getObject())));
 BA.debugLineNum = 46;BA.debugLine="Dim mapitem As Map";
Debug.ShouldStop(8192);
_mapitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapitem", _mapitem);
 BA.debugLineNum = 47;BA.debugLine="mapitem.Initialize";
Debug.ShouldStop(16384);
_mapitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 48;BA.debugLine="mapitem.Put(\"Vat%\",\"13.00\")";
Debug.ShouldStop(32768);
_mapitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Vat%"))),(Object)((RemoteObject.createImmutable("13.00"))));
 BA.debugLineNum = 49;BA.debugLine="vatlist.Add(mapitem)";
Debug.ShouldStop(65536);
_vatlist.runVoidMethod ("Add",(Object)((_mapitem.getObject())));
 BA.debugLineNum = 51;BA.debugLine="Dim mapitem As Map";
Debug.ShouldStop(262144);
_mapitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapitem", _mapitem);
 BA.debugLineNum = 52;BA.debugLine="mapitem.Initialize";
Debug.ShouldStop(524288);
_mapitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 53;BA.debugLine="mapitem.Put(\"Vat%\",\"24.00\")";
Debug.ShouldStop(1048576);
_mapitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Vat%"))),(Object)((RemoteObject.createImmutable("24.00"))));
 BA.debugLineNum = 54;BA.debugLine="vatlist.Add(mapitem)";
Debug.ShouldStop(2097152);
_vatlist.runVoidMethod ("Add",(Object)((_mapitem.getObject())));
 BA.debugLineNum = 57;BA.debugLine="Dim envfees As List";
Debug.ShouldStop(16777216);
_envfees = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("envfees", _envfees);
 BA.debugLineNum = 58;BA.debugLine="envfees.Initialize";
Debug.ShouldStop(33554432);
_envfees.runVoidMethod ("Initialize");
 BA.debugLineNum = 59;BA.debugLine="Dim mapitems As Map";
Debug.ShouldStop(67108864);
_mapitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapitems", _mapitems);
 BA.debugLineNum = 60;BA.debugLine="mapitems.Initialize";
Debug.ShouldStop(134217728);
_mapitems.runVoidMethod ("Initialize");
 BA.debugLineNum = 61;BA.debugLine="mapitems.put(\"Enviromental Fee\",\"\")";
Debug.ShouldStop(268435456);
_mapitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Enviromental Fee"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 62;BA.debugLine="mapitems.put(\"Env.Fee\",\"0.00\")";
Debug.ShouldStop(536870912);
_mapitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Env.Fee"))),(Object)((RemoteObject.createImmutable("0.00"))));
 BA.debugLineNum = 63;BA.debugLine="envfees.Add(mapitems)";
Debug.ShouldStop(1073741824);
_envfees.runVoidMethod ("Add",(Object)((_mapitems.getObject())));
 BA.debugLineNum = 65;BA.debugLine="mapitems.Initialize";
Debug.ShouldStop(1);
_mapitems.runVoidMethod ("Initialize");
 BA.debugLineNum = 66;BA.debugLine="mapitems.put(\"Enviromental Fee\",\"Plastic\")";
Debug.ShouldStop(2);
_mapitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Enviromental Fee"))),(Object)((RemoteObject.createImmutable("Plastic"))));
 BA.debugLineNum = 67;BA.debugLine="mapitems.put(\"Env.Fee\",\"0.08\")";
Debug.ShouldStop(4);
_mapitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Env.Fee"))),(Object)((RemoteObject.createImmutable("0.08"))));
 BA.debugLineNum = 68;BA.debugLine="envfees.Add(mapitems)";
Debug.ShouldStop(8);
_envfees.runVoidMethod ("Add",(Object)((_mapitems.getObject())));
 BA.debugLineNum = 70;BA.debugLine="mapitems.Initialize";
Debug.ShouldStop(32);
_mapitems.runVoidMethod ("Initialize");
 BA.debugLineNum = 71;BA.debugLine="mapitems.put(\"Enviromental Fee\",\"Glass\")";
Debug.ShouldStop(64);
_mapitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Enviromental Fee"))),(Object)((RemoteObject.createImmutable("Glass"))));
 BA.debugLineNum = 72;BA.debugLine="mapitems.put(\"Env.Fee\",\"0.11\")";
Debug.ShouldStop(128);
_mapitems.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Env.Fee"))),(Object)((RemoteObject.createImmutable("0.11"))));
 BA.debugLineNum = 73;BA.debugLine="envfees.Add(mapitems)";
Debug.ShouldStop(256);
_envfees.runVoidMethod ("Add",(Object)((_mapitems.getObject())));
 BA.debugLineNum = 76;BA.debugLine="mg.Initialize(Pane1)";
Debug.ShouldStop(2048);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_pane1" /*RemoteObject*/ )));
 BA.debugLineNum = 78;BA.debugLine="mg.AddColumn(\"ID\",False,True,True,70,\"TEXTFIELD_N";
Debug.ShouldStop(8192);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ID")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"True")),(Object)(b4xmainpage.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 70)),(Object)(BA.ObjectToString("TEXTFIELD_NUMERIC")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), b4xmainpage.__c.getField(false,"Null")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.ObjectToString("CENTER")),(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 79;BA.debugLine="mg.AddColumn(\"Item Desc\", False,False,True,215,\"T";
Debug.ShouldStop(16384);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Item Desc")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 215)),(Object)(BA.ObjectToString("TEXTFIELD")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), b4xmainpage.__c.getField(false,"Null")),(Object)(BA.numberCast(int.class, 40)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.ObjectToString("LEFT")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 80;BA.debugLine="mg.AddColumn(\"Enviromental Fee\", False,False,True";
Debug.ShouldStop(32768);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Enviromental Fee")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 180)),(Object)(BA.ObjectToString("COMBOEDIT")),(Object)(BA.ObjectToString("")),(Object)(_envfees),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.ObjectToString("LEFT")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 81;BA.debugLine="mg.AddColumn(\"Prod.Date\", False,False,True,115,\"D";
Debug.ShouldStop(65536);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Prod.Date")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 115)),(Object)(BA.ObjectToString("DATE")),(Object)(BA.NumberToString(b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"getNow"))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), b4xmainpage.__c.getField(false,"Null")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.ObjectToString("CENTER")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 82;BA.debugLine="mg.AddColumn(\"Price\", False,False,True,80,\"TEXTFI";
Debug.ShouldStop(131072);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Price")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 80)),(Object)(BA.ObjectToString("TEXTFIELD_NUMERIC")),(Object)(BA.ObjectToString("0")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), b4xmainpage.__c.getField(false,"Null")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.ObjectToString("RIGHT")),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 83;BA.debugLine="mg.AddColumn(\"Env.Fee\", True, False,True,50,\"TEXT";
Debug.ShouldStop(262144);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Env.Fee")),(Object)(b4xmainpage.__c.getField(true,"True")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 50)),(Object)(BA.ObjectToString("TEXTFIELD_NUMERIC")),(Object)(BA.ObjectToString("0.00")),(Object)(_envfees),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.ObjectToString("RIGHT")),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 84;BA.debugLine="mg.AddColumn(\"Qty\", False,False,True,50,\"TEXTFIEL";
Debug.ShouldStop(524288);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Qty")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 50)),(Object)(BA.ObjectToString("TEXTFIELD_NUMERIC")),(Object)(BA.ObjectToString("1.00")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), b4xmainpage.__c.getField(false,"Null")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.ObjectToString("CENTER")),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 85;BA.debugLine="mg.AddColumn(\"Vat%\", False,False,False,90,\"COMBO\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Vat%")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(BA.numberCast(int.class, 90)),(Object)(BA.ObjectToString("COMBO")),(Object)(BA.ObjectToString("")),(Object)(_vatlist),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 99.99)),(Object)(BA.ObjectToString("RIGHT")),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 86;BA.debugLine="mg.AddColumn(\"Tot.Price wo VAT\", False,True,False";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Tot.Price wo VAT")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"True")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(BA.numberCast(int.class, 90)),(Object)(BA.ObjectToString("TEXTFIELD_NUMERIC")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), b4xmainpage.__c.getField(false,"Null")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.ObjectToString("RIGHT")),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 87;BA.debugLine="mg.AddColumn(\"VAT\", False,True,False,90,\"TEXTFIEL";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VAT")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"True")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(BA.numberCast(int.class, 90)),(Object)(BA.ObjectToString("TEXTFIELD_NUMERIC")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), b4xmainpage.__c.getField(false,"Null")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.ObjectToString("RIGHT")),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 88;BA.debugLine="mg.AddColumn(\"Tot.Price w VAT\", False,True,False,";
Debug.ShouldStop(8388608);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Tot.Price w VAT")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"True")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(BA.numberCast(int.class, 90)),(Object)(BA.ObjectToString("TEXTFIELD_NUMERIC")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), b4xmainpage.__c.getField(false,"Null")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.ObjectToString("RIGHT")),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 89;BA.debugLine="mg.AddColumn(\"Check\", False,False,False,50,\"CHECK";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Check")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(b4xmainpage.__c.getField(true,"False")),(Object)(BA.numberCast(int.class, 50)),(Object)(BA.ObjectToString("CHECKBOX")),(Object)(BA.ObjectToString(b4xmainpage.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 9744))))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), b4xmainpage.__c.getField(false,"Null")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.ObjectToString("CENTER")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xmainpage.__c.getField(true,"False")));
 BA.debugLineNum = 92;BA.debugLine="mg.AddHorizontalPraxis(\"[Tot.Price wo VAT]=(([Pri";
Debug.ShouldStop(134217728);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_addhorizontalpraxis" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("[Tot.Price wo VAT]=(([Price]+[Env.Fee])*[Qty])")));
 BA.debugLineNum = 93;BA.debugLine="mg.AddHorizontalPraxis(\"[VAT]=[Tot.Price wo VAT]*";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_addhorizontalpraxis" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("[VAT]=[Tot.Price wo VAT]*([Vat%]/100)")));
 BA.debugLineNum = 94;BA.debugLine="mg.AddHorizontalPraxis(\"[Tot.Price w VAT]=[Tot.Pr";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_addhorizontalpraxis" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("[Tot.Price w VAT]=[Tot.Price wo VAT]+[VAT]")));
 BA.debugLineNum = 100;BA.debugLine="list1.Initialize";
Debug.ShouldStop(8);
__ref.getField(false,"_list1" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 101;BA.debugLine="list1.Add(Array As String(\"1\",\"Tzatziki 200gr\",\"P";
Debug.ShouldStop(16);
__ref.getField(false,"_list1" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("1"),BA.ObjectToString("Tzatziki 200gr"),BA.ObjectToString("Plastic"),BA.NumberToString(b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"getNow")),BA.ObjectToString("3.30"),BA.ObjectToString("0.08"),BA.ObjectToString("3.00"),BA.ObjectToString("13.00"),BA.ObjectToString(""),BA.ObjectToString(""),BA.ObjectToString(""),BA.ObjectToString(b4xmainpage.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 9744))))}))));
 BA.debugLineNum = 102;BA.debugLine="list1.Add(Array As String(\"2\",\"Taramosalata 100gr";
Debug.ShouldStop(32);
__ref.getField(false,"_list1" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("2"),BA.ObjectToString("Taramosalata 100gr"),BA.ObjectToString("Plastic"),BA.NumberToString(b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"getNow")),BA.ObjectToString("3.90"),BA.ObjectToString("0.08"),BA.ObjectToString("1.00"),BA.ObjectToString("13.00"),BA.ObjectToString(""),BA.ObjectToString(""),BA.ObjectToString(""),BA.ObjectToString(b4xmainpage.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 9746))))}))));
 BA.debugLineNum = 103;BA.debugLine="list1.Add(Array As String(\"3\",\"Red Wine 750ml\",\"G";
Debug.ShouldStop(64);
__ref.getField(false,"_list1" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("3"),BA.ObjectToString("Red Wine 750ml"),BA.ObjectToString("Glass"),BA.NumberToString(b4xmainpage.__c.getField(false,"DateTime").runMethod(true,"getNow")),BA.ObjectToString("9.90"),BA.ObjectToString("0.11"),BA.ObjectToString("1.00"),BA.ObjectToString("24.00"),BA.ObjectToString(""),BA.ObjectToString(""),BA.ObjectToString(""),BA.ObjectToString(b4xmainpage.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 9744))))}))));
 BA.debugLineNum = 106;BA.debugLine="mg.AlignAllCols";
Debug.ShouldStop(512);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_alignallcols" /*RemoteObject*/ );
 BA.debugLineNum = 108;BA.debugLine="mg.SetData(list1)";
Debug.ShouldStop(2048);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_setdata" /*void*/ ,(Object)(__ref.getField(false,"_list1" /*RemoteObject*/ )));
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
RemoteObject _newlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 117;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 123;BA.debugLine="Log(\"Total without VAT: \" & mg.SumRows(\"Tot.Price";
Debug.ShouldStop(67108864);
b4xmainpage.__c.runVoidMethod ("LogImpl","7655366",RemoteObject.concat(RemoteObject.createImmutable("Total without VAT: "),__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_sumrows" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Tot.Price wo VAT")),(Object)(RemoteObject.createImmutable("")))),0);
 BA.debugLineNum = 126;BA.debugLine="Log(\"Total with VAT: \" & mg.SumRows(\"Tot.Price w";
Debug.ShouldStop(536870912);
b4xmainpage.__c.runVoidMethod ("LogImpl","7655369",RemoteObject.concat(RemoteObject.createImmutable("Total with VAT: "),__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_sumrows" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Tot.Price w VAT")),(Object)(RemoteObject.createImmutable("")))),0);
 BA.debugLineNum = 129;BA.debugLine="Log(\"only VAT 13%: \" & mg.SumRows(\"VAT\",\"SELECT";
Debug.ShouldStop(1);
b4xmainpage.__c.runVoidMethod ("LogImpl","7655372",RemoteObject.concat(RemoteObject.createImmutable("only VAT 13%: "),__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_sumrows" /*RemoteObject*/ ,(Object)(BA.ObjectToString("VAT")),(Object)(RemoteObject.createImmutable("SELECT  SUM([VAT]) as myvalue FROM data WHERE [Vat%]='13.00';")))),0);
 BA.debugLineNum = 132;BA.debugLine="Dim newlist As List=mg.GetData";
Debug.ShouldStop(8);
_newlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_newlist = __ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_getdata" /*RemoteObject*/ );Debug.locals.put("newlist", _newlist);Debug.locals.put("newlist", _newlist);
 BA.debugLineNum = 135;BA.debugLine="mg.SetData(newlist)";
Debug.ShouldStop(64);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_setdata" /*void*/ ,(Object)(_newlist));
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _button2_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("button2_click")) { __ref.runUserSub(false, "b4xmainpage","button2_click", __ref); return;}
ResumableSub_Button2_Click rsub = new ResumableSub_Button2_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Button2_Click extends BA.ResumableSub {
public ResumableSub_Button2_Click(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _newlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _maxrow = null;
RemoteObject _newid = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,138);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 140;BA.debugLine="Dim newlist As List = mg.GetData";
Debug.ShouldStop(2048);
_newlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_newlist = __ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_getdata" /*RemoteObject*/ );Debug.locals.put("newlist", _newlist);Debug.locals.put("newlist", _newlist);
 BA.debugLineNum = 141;BA.debugLine="Dim maxRow() As Object = newlist.Get(newlist.Size";
Debug.ShouldStop(4096);
_maxrow = (_newlist.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_newlist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("maxRow", _maxrow);Debug.locals.put("maxRow", _maxrow);
 BA.debugLineNum = 142;BA.debugLine="Dim newID As Int = maxRow(0) + 1";
Debug.ShouldStop(8192);
_newid = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _maxrow.getArrayElement(false,BA.numberCast(int.class, 0))),RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("newID", _newid);Debug.locals.put("newID", _newid);
 BA.debugLineNum = 143;BA.debugLine="newlist.Add(Array As String(newID,\"\",\"\",DateTime.";
Debug.ShouldStop(16384);
_newlist.runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {8},new Object[] {BA.NumberToString(_newid),BA.ObjectToString(""),BA.ObjectToString(""),BA.NumberToString(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")),BA.ObjectToString("0.00"),BA.ObjectToString("0.00"),BA.ObjectToString("1.00"),RemoteObject.createImmutable("24.00")}))));
 BA.debugLineNum = 144;BA.debugLine="mg.SetData(newlist)";
Debug.ShouldStop(32768);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_setdata" /*void*/ ,(Object)(_newlist));
 BA.debugLineNum = 145;BA.debugLine="Sleep(0)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "button2_click"),BA.numberCast(int.class, 0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 146;BA.debugLine="mg.CalcAll";
Debug.ShouldStop(131072);
__ref.getField(false,"_mg" /*RemoteObject*/ ).runClassMethod (b4j.example.magmagrid.class, "_calcall" /*RemoteObject*/ );
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 10;BA.debugLine="Private Pane1 As B4XView";
b4xmainpage._pane1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pane1",b4xmainpage._pane1);
 //BA.debugLineNum = 11;BA.debugLine="Dim mg As MagmaGrid";
b4xmainpage._mg = RemoteObject.createNew ("b4j.example.magmagrid");__ref.setField("_mg",b4xmainpage._mg);
 //BA.debugLineNum = 12;BA.debugLine="Private Button1 As Button";
b4xmainpage._button1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_button1",b4xmainpage._button1);
 //BA.debugLineNum = 13;BA.debugLine="Private Button2 As Button";
b4xmainpage._button2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_button2",b4xmainpage._button2);
 //BA.debugLineNum = 15;BA.debugLine="Dim list1 As List";
b4xmainpage._list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_list1",b4xmainpage._list1);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(131072);
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}