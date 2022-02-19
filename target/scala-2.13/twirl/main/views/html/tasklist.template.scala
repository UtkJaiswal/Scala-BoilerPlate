
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
            """),_display_(/*6.14*/for((task,i)<-tasks.zipWithIndex) yield /*6.47*/ {_display_(Seq[Any](format.raw/*6.49*/("""
                """),format.raw/*7.17*/("""<li>"""),_display_(/*7.22*/task),format.raw/*7.26*/("""</li>
                <form method="POST" action=""""),_display_(/*8.46*/routes/*8.52*/.HomeController.deleteTask),format.raw/*8.78*/("""">
                    """),_display_(/*9.22*/helper/*9.28*/.CSRF.formField),format.raw/*9.43*/("""
                    """),format.raw/*10.21*/("""<input type="hidden" value=""""),_display_(/*10.50*/i),format.raw/*10.51*/("""" name="index">
                    <input type="submit" value="Delete">
                </form>
            """)))}),format.raw/*13.14*/("""
        """),format.raw/*14.9*/("""</ul>
        <form method="post" action=""""),_display_(/*15.38*/routes/*15.44*/.HomeController.addTask),format.raw/*15.67*/("""">
            """),_display_(/*16.14*/helper/*16.20*/.CSRF.formField),format.raw/*16.35*/("""
            """),format.raw/*17.13*/("""<input  type="text" name="newTask">
            <input  type="submit">
        </form>
        <div><a href=""""),_display_(/*20.24*/routes/*20.30*/.HomeController.logout),format.raw/*20.52*/("""">Logout</a></div>
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
                  HASH: f005eb607793c44e41330516cf55fac551835775
                  MATRIX: 770->1|955->91|983->94|1007->110|1045->111|1077->117|1182->196|1230->229|1269->231|1314->249|1345->254|1369->258|1447->310|1461->316|1507->342|1558->367|1572->373|1607->388|1657->410|1713->439|1735->440|1879->553|1916->563|1987->607|2002->613|2046->636|2090->653|2105->659|2141->674|2183->688|2323->801|2338->807|2381->829
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|35->10|35->10|35->10|38->13|39->14|40->15|40->15|40->15|41->16|41->16|41->16|42->17|45->20|45->20|45->20
                  -- GENERATED --
              */
          