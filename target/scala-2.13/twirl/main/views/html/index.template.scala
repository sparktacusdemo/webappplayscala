
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
  """),_display_(/*3.4*/main("Welcome to Play - tutorial Play Forms")/*3.49*/ {_display_(Seq[Any](format.raw/*3.51*/("""
    """),format.raw/*4.5*/("""<div>
      <ul>
        <li>Hi, please go to <a href=""""),_display_(/*6.40*/routes/*6.46*/.WidgetController.listWidgets),format.raw/*6.75*/("""">"""),_display_(/*6.78*/routes/*6.84*/.WidgetController.listWidgets),format.raw/*6.113*/("""</a></li>
        <p>add some widgets (name and price). this is an example of Play Scala form : how to build and handle data.</p>
      </ul>
        <img src="https://thumbs.gfycat.com/ActiveCourteousAmericanindianhorse-small.gif" >
    </div>
  """)))}),format.raw/*11.4*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-09-30T01:01:56.900
                  SOURCE: /home/hdpu00/play-samples-play-scala-forms-example/app/views/index.scala.html
                  HASH: 2f80d82d46de6658ab89d314c5ab94585d315a58
                  MATRIX: 722->1|818->4|847->8|900->53|939->55|970->60|1052->116|1066->122|1115->151|1144->154|1158->160|1208->189|1486->437
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|30->6|30->6|30->6|30->6|30->6|30->6|35->11
                  -- GENERATED --
              */
          