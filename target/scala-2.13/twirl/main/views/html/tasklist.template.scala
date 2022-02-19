
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

object tasklist extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[String],AssetsFinder,RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tasks:Seq[String])(implicit assetsFinder: AssetsFinder,request:RequestHeader,flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.92*/("""
"""),_display_(/*2.2*/main("Tasklist")/*2.18*/{_display_(Seq[Any](format.raw/*2.19*/("""
    """),format.raw/*3.5*/("""<div class="container">
        <h2>TaskList</h2>
        <ul>
            """),_display_(/*6.14*/for(task<-tasks) yield /*6.30*/ {_display_(Seq[Any](format.raw/*6.32*/("""
                """),format.raw/*7.17*/("""<li>"""),_display_(/*7.22*/task),format.raw/*7.26*/("""</li>
            """)))}),format.raw/*8.14*/("""
        """),format.raw/*9.9*/("""</ul>
        <form method="post" action=""""),_display_(/*10.38*/routes/*10.44*/.HomeController.addTask),format.raw/*10.67*/("""">
            """),_display_(/*11.14*/helper/*11.20*/.CSRF.formField),format.raw/*11.35*/("""
            """),format.raw/*12.13*/("""<input  type="text" name="newTask">
            <input  type="submit">
        </form>
        <div><a href=""""),_display_(/*15.24*/routes/*15.30*/.HomeController.logout),format.raw/*15.52*/("""">Logout</a></div>
    </div>
""")))}))
      }
    }
  }

  def render(tasks:Seq[String],assetsFinder:AssetsFinder,request:RequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(tasks)(assetsFinder,request,flash)

  def f:((Seq[String]) => (AssetsFinder,RequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (tasks) => (assetsFinder,request,flash) => apply(tasks)(assetsFinder,request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/tasklist.scala.html
                  HASH: 83470a47b653d3ff570b8cc4f0c79ebe89814d9b
                  MATRIX: 770->1|955->91|983->94|1007->110|1045->111|1077->117|1182->196|1213->212|1252->214|1297->232|1328->237|1352->241|1402->261|1438->271|1509->315|1524->321|1568->344|1612->361|1627->367|1663->382|1705->396|1845->509|1860->515|1903->537
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|31->6|31->6|31->6|32->7|32->7|32->7|33->8|34->9|35->10|35->10|35->10|36->11|36->11|36->11|37->12|40->15|40->15|40->15
                  -- GENERATED --
              */
          