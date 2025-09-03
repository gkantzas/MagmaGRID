B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.8
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private mParent As Object
	'Private sendk As AWTRobot
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize ( Parent As Object )
	mParent = Parent
End Sub

Public Sub Enter2TAB(ctl As Object)
	'allow Escape key to exit signin screen
	Log(ctl)
	Dim r As Reflector
	r.Target = ctl
	r.AddEventFilter("keypressed","javafx.scene.input.KeyEvent.KEY_PRESSED")
End Sub

Private Sub KeyPressed_Filter (e As Event)
	Dim jo As JavaObject = e
	Dim keycode As String = jo.RunMethod("getCode", Null)
	'Log(keycode)
	If keycode = "ENTER" Then
		'e.Consume
		'sendk.RobotSpecialKeyPress("TAB")
	End If
End Sub

public Sub stop(Parent As Object)
	'Dim r As Reflector
	
	'r.AddEventFilter("keypressed","")
	'r.AddEventFilter("keypressed","javafx.scene.input.KeyEvent.KEY_PRESSED")
End Sub