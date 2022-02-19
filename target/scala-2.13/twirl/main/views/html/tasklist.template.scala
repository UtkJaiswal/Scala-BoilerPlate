
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
        <h2>TaskList</h2>
        <ul>
            """),_display_(/*6.14*/for(task<-tasks) yield /*6.30*/ {_display_(Seq[Any](format.raw/*6.32*/("""
                """),format.raw/*7.17*/("""<li>"""),_display_(/*7.22*/task),format.raw/*7.26*/("""</li>
            """)))}),format.raw/*8.14*/("""
        """),format.raw/*9.9*/("""</ul>
        <div><a href=""""),_display_(/*10.24*/routes/*10.30*/.HomeController.logout),format.raw/*10.52*/("""">Logout</a></div>
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
                  HASH: 1997774b66f942ef40a979cc7bb848061f7d74c3
                  MATRIX: 750->1|901->57|929->60|953->76|991->77|1023->83|1128->162|1159->178|1198->180|1243->198|1274->203|1298->207|1348->227|1384->237|1441->267|1456->273|1499->295
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|31->6|31->6|31->6|32->7|32->7|32->7|33->8|34->9|35->10|35->10|35->10
                  -- GENERATED --
              */
          