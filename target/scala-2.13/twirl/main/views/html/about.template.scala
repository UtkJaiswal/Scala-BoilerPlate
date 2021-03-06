
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[AssetsFinder,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit assetsFinder: AssetsFinder,flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.53*/("""
"""),_display_(/*2.2*/main("About")/*2.15*/{_display_(Seq[Any](format.raw/*2.16*/("""
"""),format.raw/*3.1*/("""<div class="container">
    <h1>This is the About page</h1>
</div>
""")))}))
      }
    }
  }

  def render(assetsFinder:AssetsFinder,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply()(assetsFinder,flash)

  def f:(() => (AssetsFinder,Flash) => play.twirl.api.HtmlFormat.Appendable) = () => (assetsFinder,flash) => apply()(assetsFinder,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/about.scala.html
                  HASH: 115be5efb8a16452b1a83bb7e7f2a7918b886bea
                  MATRIX: 741->1|887->52|915->55|936->68|974->69|1002->71
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3
                  -- GENERATED --
              */
          