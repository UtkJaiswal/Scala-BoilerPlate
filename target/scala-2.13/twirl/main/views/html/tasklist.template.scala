
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

object tasklist extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Seq[String],AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tasks:Seq[String])(implicit assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""
"""),_display_(/*2.2*/main("Tasklist")/*2.18*/{_display_(Seq[Any](format.raw/*2.19*/("""
    """),format.raw/*3.5*/("""<div class="container">
        <ul>
            """),_display_(/*5.14*/for(task<-tasks) yield /*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""
                """),format.raw/*6.17*/("""<li>"""),_display_(/*6.22*/task),format.raw/*6.26*/("""</li>
            """)))}),format.raw/*7.14*/("""
        """),format.raw/*8.9*/("""</ul>
    </div>
""")))}))
      }
    }
  }

  def render(tasks:Seq[String],assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(tasks)(assetsFinder)

  def f:((Seq[String]) => (AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (tasks) => (assetsFinder) => apply(tasks)(assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/tasklist.scala.html
                  HASH: 2297af8cde93103b62a001aa98f82e12c5fc88de
                  MATRIX: 750->1|901->57|929->60|953->76|991->77|1023->83|1101->135|1132->151|1171->153|1216->171|1247->176|1271->180|1321->200|1357->210
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|30->5|30->5|30->5|31->6|31->6|31->6|32->7|33->8
                  -- GENERATED --
              */
          