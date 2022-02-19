
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

object signup extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[AssetsFinder,RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit assetsFinder: AssetsFinder,request:RequestHeader,flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.75*/("""
"""),_display_(/*2.2*/main("Signup")/*2.16*/{_display_(Seq[Any](format.raw/*2.17*/("""
"""),format.raw/*3.1*/("""<div class="container">
    <h1>Welcome to Signup page</h1>
    <form method="post" action=""""),_display_(/*5.34*/routes/*5.40*/.HomeController.createUser),format.raw/*5.66*/("""">
        """),_display_(/*6.10*/helper/*6.16*/.CSRF.formField),format.raw/*6.31*/("""
        """),format.raw/*7.9*/("""<div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Email address</label>
        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email">
        
        </div>
        <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label">Password</label>
        <input type="password" class="form-control" id="exampleInputPassword1" name="password">
        </div>

        <!-- <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Confirm Password</label>
            <input type="password" class="form-control" id="exampleInputPassword1">
            </div>
         -->
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
                  SOURCE: app/views/signup.scala.html
                  HASH: 070124de4b22eb5d1f740f9e1ac0136e3c105d74
                  MATRIX: 756->1|924->74|952->77|974->91|1012->92|1040->94|1161->189|1175->195|1221->221|1260->234|1274->240|1309->255|1345->265
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|30->5|30->5|30->5|31->6|31->6|31->6|32->7
                  -- GENERATED --
              */
          