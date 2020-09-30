
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

object indexuser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("HOME PAGE")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
"""),format.raw/*4.1*/("""<div>
    <ul>
        <li>Page <a href=""""),_display_(/*6.28*/routes/*6.34*/.UserController.listUsers),format.raw/*6.59*/("""">"""),_display_(/*6.62*/routes/*6.68*/.UserController.listUsers),format.raw/*6.93*/("""</a></li>

        <li>Page <a href=""""),_display_(/*8.28*/routes/*8.34*/.WidgetController.listWidgets),format.raw/*8.63*/("""">"""),_display_(/*8.66*/routes/*8.72*/.WidgetController.listWidgets),format.raw/*8.101*/("""</a></li>

        <p>foo 2020</p>
    </ul>
    <img src="https://phoneky.co.uk/thumbs/screensavers/down/technology/robot_yohhsz1u.gif" >
</div>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-09-30T17:59:54.420
                  SOURCE: /home/hdpu00/play-samples-play-scala-forms-example/app/views/indexuser.scala.html
                  HASH: bf0ef6a0b161d1a049ff0fa92fb44cb59dff6206
                  MATRIX: 726->1|822->4|849->6|874->23|913->25|940->26|1008->68|1022->74|1067->99|1096->102|1110->108|1155->133|1219->171|1233->177|1282->206|1311->209|1325->215|1375->244
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|30->6|30->6|30->6|30->6|30->6|30->6|32->8|32->8|32->8|32->8|32->8|32->8
                  -- GENERATED --
              */
          