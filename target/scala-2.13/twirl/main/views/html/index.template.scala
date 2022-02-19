
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,AssetsFinder,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a two arguments, a String containing a
 * message to display and an AssetsFinder to locate static assets.
 */
  def apply/*5.2*/(message: String)(implicit assetsFinder: AssetsFinder,flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.1*/("""
"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Scala")/*12.15*/ {_display_(Seq[Any](format.raw/*12.17*/("""

    """),format.raw/*17.8*/("""
    """),_display_(/*18.6*/welcome(message, style = "scala")),format.raw/*18.39*/("""

""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(message:String,assetsFinder:AssetsFinder,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(message)(assetsFinder,flash)

  def f:((String) => (AssetsFinder,Flash) => play.twirl.api.HtmlFormat.Appendable) = (message) => (assetsFinder,flash) => apply(message)(assetsFinder,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: e500a213d4a14ac4176fd44a5424f94de72a91a0
                  MATRIX: 879->137|1039->204|1067->399|1095->401|1117->414|1157->416|1190->545|1222->551|1276->584|1309->587
                  LINES: 24->5|29->6|30->11|31->12|31->12|31->12|33->17|34->18|34->18|36->20
                  -- GENERATED --
              */
          