
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon3.png")),format.raw/*9.105*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*10.70*/("""" type="text/javascript"></script>
    </head>
    <body>
        <section id="top">
            <div class="wrapper">
                <img class="resize" src="assets/images/favicon3.png" alt="logo" />
                <h1>TITANEX*TECH</h1>
            </div>
        </section>
        """),_display_(/*19.10*/content),format.raw/*19.17*/("""
    """),format.raw/*20.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-09-30T19:57:23.765
                  SOURCE: /home/hdpu00/play-samples-play-scala-forms-example/app/views/main.scala.html
                  HASH: badc0df787af4a0cccdc68f75d66ef2acccade34
                  MATRIX: 733->1|857->32|884->33|971->94|996->99|1084->161|1098->167|1160->208|1247->269|1261->275|1322->315|1374->340|1389->346|1451->387|1765->674|1793->681|1825->686
                  LINES: 21->1|26->2|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|43->19|43->19|44->20
                  -- GENERATED --
              */
          