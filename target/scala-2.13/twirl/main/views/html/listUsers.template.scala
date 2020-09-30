
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

object listUsers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[User],Form[UserForm.UserData],Call,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(users: Seq[User], form: Form[UserForm.UserData], postUrl: Call)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Users Form")/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""

"""),format.raw/*6.1*/("""<h1>--Users--</h1>

"""),format.raw/*8.43*/("""
"""),_display_(/*9.2*/request/*9.9*/.flash.data.map/*9.24*/{ case (name, value) =>_display_(Seq[Any](format.raw/*9.47*/("""
"""),format.raw/*10.1*/("""<div>"""),_display_(/*10.7*/name),format.raw/*10.11*/(""": """),_display_(/*10.14*/value),format.raw/*10.19*/("""</div>
""")))}),format.raw/*11.2*/("""

"""),format.raw/*13.1*/("""<table>
    <thead>
    <tr><th>User|</th><th>|Age|</th><th>|@Email|</th><th>|Sex|</th>
    </thead>
    <tbody>
    """),_display_(/*18.6*/for(u <- users) yield /*18.21*/ {_display_(Seq[Any](format.raw/*18.23*/("""
    """),format.raw/*19.5*/("""<tr><td>"""),_display_(/*19.14*/u/*19.15*/.name),format.raw/*19.20*/("""</td><td>"""),_display_(/*19.30*/u/*19.31*/.age),format.raw/*19.35*/("""</td><td>"""),_display_(/*19.45*/u/*19.46*/.email),format.raw/*19.52*/("""</td><td>"""),_display_(/*19.62*/u/*19.63*/.sex),format.raw/*19.67*/("""</td></tr>
    """)))}),format.raw/*20.6*/("""
    """),format.raw/*21.5*/("""</tbody>
</table>

<hr/>

"""),format.raw/*26.83*/("""

"""),_display_(/*28.2*/if(form.hasGlobalErrors)/*28.26*/ {_display_(Seq[Any](format.raw/*28.28*/("""
"""),_display_(/*29.2*/form/*29.6*/.globalErrors.map/*29.23*/ { error: FormError =>_display_(Seq[Any](format.raw/*29.45*/("""
"""),format.raw/*30.1*/("""<div>
    """),_display_(/*31.6*/error/*31.11*/.key),format.raw/*31.15*/(""": """),_display_(/*31.18*/error/*31.23*/.message),format.raw/*31.31*/("""
"""),format.raw/*32.1*/("""</div>
""")))}),format.raw/*33.2*/("""
""")))}),format.raw/*34.2*/("""

"""),_display_(/*36.2*/helper/*36.8*/.form(postUrl)/*36.22*/ {_display_(Seq[Any](format.raw/*36.24*/("""
"""),_display_(/*37.2*/helper/*37.8*/.CSRF.formField),format.raw/*37.23*/("""

"""),_display_(/*39.2*/helper/*39.8*/.inputText(form("name"))),format.raw/*39.32*/("""

"""),_display_(/*41.2*/helper/*41.8*/.inputText(form("age"))),format.raw/*41.31*/("""

"""),_display_(/*43.2*/helper/*43.8*/.inputText(form("email"))),format.raw/*43.33*/("""

"""),_display_(/*45.2*/helper/*45.8*/.inputText(form("sex"))),format.raw/*45.31*/("""

"""),format.raw/*47.1*/("""<button>click to Create User</button>
""")))}),format.raw/*48.2*/("""
""")))}),format.raw/*49.2*/("""
"""))
      }
    }
  }

  def render(users:Seq[User],form:Form[UserForm.UserData],postUrl:Call,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(users,form,postUrl)(request)

  def f:((Seq[User],Form[UserForm.UserData],Call) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (users,form,postUrl) => (request) => apply(users,form,postUrl)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-09-30T19:35:38.015
                  SOURCE: /home/hdpu00/play-samples-play-scala-forms-example/app/views/listUsers.scala.html
                  HASH: 70fa558429693eabbdd50f35a91c74b644dfe500
                  MATRIX: 787->2|986->108|1013->110|1039->128|1078->130|1106->132|1153->194|1180->196|1194->203|1217->218|1277->241|1305->242|1337->248|1362->252|1392->255|1418->260|1456->268|1485->270|1629->389|1660->404|1700->406|1732->411|1768->420|1778->421|1804->426|1841->436|1851->437|1876->441|1913->451|1923->452|1950->458|1987->468|1997->469|2022->473|2068->489|2100->494|2154->602|2183->605|2216->629|2256->631|2284->633|2296->637|2322->654|2382->676|2410->677|2447->688|2461->693|2486->697|2516->700|2530->705|2559->713|2587->714|2625->722|2657->724|2686->727|2700->733|2723->747|2763->749|2791->751|2805->757|2841->772|2870->775|2884->781|2929->805|2958->808|2972->814|3016->837|3045->840|3059->846|3105->871|3134->874|3148->880|3192->903|3221->905|3290->944|3322->946
                  LINES: 21->2|26->3|27->4|27->4|27->4|29->6|31->8|32->9|32->9|32->9|32->9|33->10|33->10|33->10|33->10|33->10|34->11|36->13|41->18|41->18|41->18|42->19|42->19|42->19|42->19|42->19|42->19|42->19|42->19|42->19|42->19|42->19|42->19|42->19|43->20|44->21|49->26|51->28|51->28|51->28|52->29|52->29|52->29|52->29|53->30|54->31|54->31|54->31|54->31|54->31|54->31|55->32|56->33|57->34|59->36|59->36|59->36|59->36|60->37|60->37|60->37|62->39|62->39|62->39|64->41|64->41|64->41|66->43|66->43|66->43|68->45|68->45|68->45|70->47|71->48|72->49
                  -- GENERATED --
              */
          