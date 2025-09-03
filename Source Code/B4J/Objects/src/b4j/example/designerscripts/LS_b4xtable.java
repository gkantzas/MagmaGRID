package b4j.example.designerscripts;
import anywheresoftware.b4a.BA;


public class LS_b4xtable{

public static void LS_general(anywheresoftware.b4a.BA ba, javafx.scene.Node parent, anywheresoftware.b4j.objects.LayoutValues lv,
anywheresoftware.b4j.objects.LayoutBuilder.LayoutData views, int width, int height, float scale)  throws Exception  {
;
//BA.debugLineNum = 2;BA.debugLine="If pnlHeader.Width < 450dip Then"[B4XTable/General script]
if (((views.get("pnlheader").getPrefWidth())<(450d * scale))) { 
;
//BA.debugLineNum = 3;BA.debugLine="lblFromTo.Visible = False"[B4XTable/General script]
views.get("lblfromto").setVisible(BA.parseBoolean("false"));
//BA.debugLineNum = 4;BA.debugLine="pnlPages.Left = 2dip"[B4XTable/General script]
views.get("pnlpages").setLeft((int)((2d * scale)));
//BA.debugLineNum = 5;BA.debugLine="SearchField.Left = pnlPages.Right + 2dip"[B4XTable/General script]
views.get("searchfield").setLeft((int)((views.get("pnlpages").getLeft() + views.get("pnlpages").getPrefWidth())+(2d * scale)));
//BA.debugLineNum = 6;BA.debugLine="Else"[B4XTable/General script]
;}else{ 
;
//BA.debugLineNum = 7;BA.debugLine="lblFromTo.Visible = True"[B4XTable/General script]
views.get("lblfromto").setVisible(BA.parseBoolean("true"));
//BA.debugLineNum = 8;BA.debugLine="End If"[B4XTable/General script]
;};

}
}