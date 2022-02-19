
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[AssetsFinder,RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit assetsFinder: AssetsFinder,request:RequestHeader,flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.75*/("""
"""),_display_(/*2.2*/main("Login")/*2.15*/{_display_(Seq[Any](format.raw/*2.16*/("""
"""),format.raw/*3.1*/("""<div class="container">
    <h1>Welcome to login page</h1>
    <form method="post" action=""""),_display_(/*5.34*/routes/*5.40*/.HomeController.userlogin),format.raw/*5.65*/("""">
        """),format.raw/*6.72*/("""
        """),_display_(/*7.10*/helper/*7.16*/.CSRF.formField),format.raw/*7.31*/("""
        """),format.raw/*8.9*/("""<div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Email address</label>
        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email">
        
        </div>
        <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label">Password</label>
        <input type="password" class="form-control" id="exampleInputPassword1" name="password">
        </div>
        
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
""")))}))
      }
    }
  }

  def render(assetsFinder:AssetsFinder,request:RequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply()(assetsFinder,request,flash)

  def f:(() => (AssetsFinder,RequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = () => (assetsFinder,request,flash) => apply()(assetsFinder,request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/login.scala.html
                  HASH: 2c1c976687e92711dd8deaeaa1521ddd72160d76
                  MATRIX: 755->1|923->74|951->77|972->90|1010->91|1038->93|1158->187|1172->193|1217->218|1256->293|1293->304|1307->310|1342->325|1378->335
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|30->5|30->5|30->5|31->6|32->7|32->7|32->7|33->8
                  -- GENERATED --
              */
          