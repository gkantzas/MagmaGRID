B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.8
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Dim translated As Map
	Public SelectedLang As String="EN" 'EN,GR..
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	translated.Initialize
End Sub

public Sub SetLanguage(lang As String)
	translated.Clear
	SelectedLang=lang
	If SelectedLang<>"EN" Then
		Try
		Dim a As List=File.ReadList(Main.mydir,lang & ".lang")
		For k=0 To a.Size-1
			Dim aa() As String=Regex.split(",",a.Get(k).As(String))
			translated.Put(aa(0),aa(1))
		Next
		Catch
			Log(LastException.Message)
		End Try
	End If
	
End Sub

public Sub L(std As String) As String
	If SelectedLang="EN" Then
		Return std
	Else
		If translated.ContainsKey(std) Then
			Return translated.Get(std)
		Else
			Return std
		End If
	End If
End Sub


Public Sub IsValidDate(DateStr As String) As Boolean
	Try
		DateTime.DateFormat = "dd/MM/yyyy"
		Dim dtTicks As Long = DateTime.DateParse(DateStr) ' Parse σε ticks
		Dim reconstructed As String = DateTime.Date(dtTicks) ' Μετατροπή πίσω σε string
		' Ελέγχουμε αν η ανακατασκευή συμφωνεί με το αρχικό
		Return reconstructed = DateStr
	Catch
		Return False
	End Try
End Sub

Sub IsComboBoxFocused(cb As ComboBox) As Boolean
	Dim jo As JavaObject = cb
	Return jo.RunMethod("isFocused", Null)
End Sub