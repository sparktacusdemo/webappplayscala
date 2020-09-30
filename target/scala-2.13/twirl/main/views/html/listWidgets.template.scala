
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object listWidgets extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[Widget],Form[WidgetForm.Data],Call,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /*** DEFINING THE FORM *******/
  def apply/*3.2*/(widgets: Seq[Widget], form: Form[WidgetForm.Data], postUrl: Call)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""
  """),_display_(/*5.4*/main("Widgets Form")/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""

    """),format.raw/*7.5*/("""<h1>--Widgets--</h1>

    """),format.raw/*9.47*/("""
    """),_display_(/*10.6*/request/*10.13*/.flash.data.map/*10.28*/{ case (name, value) =>_display_(Seq[Any](format.raw/*10.51*/("""
      """),format.raw/*11.7*/("""<div>"""),_display_(/*11.13*/name),format.raw/*11.17*/(""": """),_display_(/*11.20*/value),format.raw/*11.25*/("""</div>
    """)))}),format.raw/*12.6*/("""

    """),format.raw/*14.5*/("""<table>
      <thead>
        <tr><th>WidgetName|</th><th>|Price</th>
      </thead>
      <tbody>
      """),_display_(/*19.8*/for(w <- widgets) yield /*19.25*/ {_display_(Seq[Any](format.raw/*19.27*/("""
        """),format.raw/*20.9*/("""<tr><td>"""),_display_(/*20.18*/w/*20.19*/.name),format.raw/*20.24*/("""</td><td>"""),_display_(/*20.34*/w/*20.35*/.price),format.raw/*20.41*/("""</td></tr>
      """)))}),format.raw/*21.8*/("""
      """),format.raw/*22.7*/("""</tbody>
    </table>

    <hr/>

    """),format.raw/*27.87*/("""

    """),_display_(/*29.6*/if(form.hasGlobalErrors)/*29.30*/ {_display_(Seq[Any](format.raw/*29.32*/("""
      """),_display_(/*30.8*/form/*30.12*/.globalErrors.map/*30.29*/ { error: FormError =>_display_(Seq[Any](format.raw/*30.51*/("""
        """),format.raw/*31.9*/("""<div>
          """),_display_(/*32.12*/error/*32.17*/.key),format.raw/*32.21*/(""": """),_display_(/*32.24*/error/*32.29*/.message),format.raw/*32.37*/("""
        """),format.raw/*33.9*/("""</div>
      """)))}),format.raw/*34.8*/("""
    """)))}),format.raw/*35.6*/("""

    """),_display_(/*37.6*/helper/*37.12*/.form(postUrl)/*37.26*/ {_display_(Seq[Any](format.raw/*37.28*/("""
      """),_display_(/*38.8*/helper/*38.14*/.CSRF.formField),format.raw/*38.29*/("""

      """),_display_(/*40.8*/helper/*40.14*/.inputText(form("name"))),format.raw/*40.38*/("""

      """),_display_(/*42.8*/helper/*42.14*/.inputText(form("price"))),format.raw/*42.39*/("""

      """),format.raw/*44.7*/("""<button>Create widget</button>
    """)))}),format.raw/*45.6*/("""
  """)))}),format.raw/*46.4*/("""
"""))
      }
    }
  }

  def render(widgets:Seq[Widget],form:Form[WidgetForm.Data],postUrl:Call,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(widgets,form,postUrl)(request)

  def f:((Seq[Widget],Form[WidgetForm.Data],Call) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (widgets,form,postUrl) => (request) => apply(widgets,form,postUrl)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-09-30T18:04:25.181
                  SOURCE: /home/hdpu00/play-samples-play-scala-forms-example/app/views/listWidgets.scala.html
                  HASH: 98b5ece3af483cb0503096789bf131f3e25ad661
                  MATRIX: 816->34|1017->142|1046->146|1074->166|1113->168|1145->174|1198->242|1230->248|1246->255|1270->270|1331->293|1365->300|1398->306|1423->310|1453->313|1479->318|1521->330|1554->336|1686->442|1719->459|1759->461|1795->470|1831->479|1841->480|1867->485|1904->495|1914->496|1941->502|1989->520|2023->527|2089->647|2122->654|2155->678|2195->680|2229->688|2242->692|2268->709|2328->731|2364->740|2408->757|2422->762|2447->766|2477->769|2491->774|2520->782|2556->791|2600->805|2636->811|2669->818|2684->824|2707->838|2747->840|2781->848|2796->854|2832->869|2867->878|2882->884|2927->908|2962->917|2977->923|3023->948|3058->956|3124->992|3158->996
                  LINES: 21->3|26->4|27->5|27->5|27->5|29->7|31->9|32->10|32->10|32->10|32->10|33->11|33->11|33->11|33->11|33->11|34->12|36->14|41->19|41->19|41->19|42->20|42->20|42->20|42->20|42->20|42->20|42->20|43->21|44->22|49->27|51->29|51->29|51->29|52->30|52->30|52->30|52->30|53->31|54->32|54->32|54->32|54->32|54->32|54->32|55->33|56->34|57->35|59->37|59->37|59->37|59->37|60->38|60->38|60->38|62->40|62->40|62->40|64->42|64->42|64->42|66->44|67->45|68->46
                  -- GENERATED --
              */
          