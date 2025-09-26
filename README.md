# MagmaGRID
 An extender for B4XTable

**What is MAGMAGRID?** 🧩

MAGMAGRID is the Next Generation B4XTable... The code for the start is only available to licensed members of the forum.


What can it do? 🔧
**Features:**

    Column Resizing ↔
    Hiding/Showing 👁️
    Easy Add Column at Creation ➕
    Easy Inline Editing ✏️
    Easy Moving ⬍
    Easy Column Calculation and Sum of Rows ∑
    Easy Extract Data to List 📋
    Even if at runtime the window resizes — and B4XTable has different visible rows/columns — it works fine when moving through lines and fields


For now, works only in B4J... but should be easy for B4A too (I think even easier with IME keyboard) 📱


What I expect from all users of Forum:
Add new features and post here their versions or fixes... to create a solid class 💪
Why I didn’t make it a B4XLib... I don’t think B4XTable needs an extra lib with the same features...


But we need to understand how it works and how it can be better 🔍

Uses: B4XTable, InlineEditing, B4XTableSelections, B4XEval

**Some Explanation - How it works**

I will try to explain some things - how it works... Generally, I am sure that all can understand how it works from example...

But I will give some guides:

If you click at first column and first row cell... will select the row - you can move with up - down arrow, you can press enter to select first editable column (enable inline editing) - If you are at a column and already editing and press enter - then goes selecting next editable column and enable inline editing there too... but if you press escape you can continue using arrows to move at rows, page-up page-dn keys also works...

If you are not into inline editing (just selecting) and press SPACE BAR you can check uncheck (CHECKBOX)

I am thinking adding also keyfilter of DEL - for deleting rows of list.

There are the following types of Column Types / Inline Editing:

**TEXTFIELD**

**TEXTFIELD_NUMERIC**

**COMBOEDIT**

**COMBO**

**CHECKBOX**

**DATE**

so using the following:

**AddColumn**(Name As String, Hidden As Boolean, Locked As Boolean, Sortable As Boolean, _
Width1 As Int, Controltype As String, Defaultvalue As String, UseList As List, MaxLength As Int, _
MinValue As Double, MaxValue As Double, Alignment As String, _
MinIntegers As Int, MinFractions As Int, MaxFractions As Int, Grouping As Boolean)

**Name** - Gives a Title at Column

**Hidden** - Gives width of 1 pixel - so if you go at guideline of the column and press double click will show...

**Locked** - Cant use inline editing for specific field

**Sortable** - You can sort By Column

**Width1** - You can set the default width of Column

**DefaultValue** - You can set the default value of column if you give a null "" text at the inline editing

**UseList** - You can use any list with items as map (useful for COMBO, COMBOEDIT)

**MaxLength** - You can set the Maximum Length for TextFields (even if is a numeric)

**MinValue** - You can set the minimum value for numeric values (in date you can the long ticks number)

**MaxValue** - You can set the maximum value for numeric values (in date you can the long ticks number)

**Alignment** - You can set it "RIGHT", "LEFT", "CENTER"

**MinIntegers**, **MinFractions**, **MaxFractions**, **Grouping** - Are only for numeric values for formatting them right


Explaining UseList example:
**B4X CODE:**

    Dim vatlist As List
    vatlist.Initialize
    Dim mapitem As Map
    mapitem.Initialize
    mapitem.Put("Vat%","0.00")
    vatlist.Add(mapitem)
 
    Dim mapitem As Map
    mapitem.Initialize
    mapitem.Put("Vat%","6.00")
    vatlist.Add(mapitem)
 
    Dim mapitem As Map
    mapitem.Initialize
    mapitem.Put("Vat%","13.00")
    vatlist.Add(mapitem)
 
    Dim mapitem As Map
    mapitem.Initialize
    mapitem.Put("Vat%","24.00")
    vatlist.Add(mapitem)


What exactly can do the this... is just a simple list...
AddColumn using this list has the name of "Vat%" also in map there is only one key with name "Vat%" - so in combo will display all rows values of Vat% List.

but at the following example:
**B4X CODE:**

    Dim envfees As List
    envfees.Initialize
    Dim mapitems As Map
    mapitems.Initialize
    mapitems.put("Enviromental Fee","")
    mapitems.put("Env.Fee","0.00")
    envfees.Add(mapitems)

    mapitems.Initialize
    mapitems.put("Enviromental Fee","Plastic")
    mapitems.put("Env.Fee","0.08")
    envfees.Add(mapitems)

    mapitems.Initialize
    mapitems.put("Enviromental Fee","Glass")
    mapitems.put("Env.Fee","0.11")
    envfees.Add(mapitems)


Is a list that Join / Mix the table - We have a Map with two Keys... one Key is using always at our B4XTable with AddColumn COMBO/COMBOEDIT, and specifically for the example the "Enviromental Fee" the other one used for othe Column will show up if select the specific index - for this reason using MAP, with this way you can have many columns can be affected by one :)

**AddHorizontalPraxis**("[ColumnName1]=[ColumnName2]+[ColumnName3]")

I think this the most useful thing for making calculations at Grid, using B4XEval Class (Erel's)
You can use all mathematical symbols and any calculation. You can add as many calculations you want... but have in mind the order/series of calculations...


**SumRows**(ColumnID As String, sqlstring As String) As Double

You can SUM vertical (columns) or you can make any Calculation as an SQLITE query string without limit!


**GetData** As List
This returns your Data at a List... You can easily add them to any Database you want afterwards... This means that you can work without affecting the db the same time of changes but when you really want it...
 

**You can always Donate me / Send me money using PayPal at cyberd@mmpc.gr**
