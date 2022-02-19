
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Html,AssetsFinder,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * three arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page and an `AssetFinder`
 * to define to reverse route static assets.
 */
  def apply/*8.2*/(title: String)(content: Html)(implicit assetsFinder: AssetsFinder,flash:Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.1*/("""
"""),format.raw/*10.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*13.62*/("""
        """),format.raw/*14.9*/("""<title>"""),_display_(/*14.17*/title),format.raw/*14.22*/("""</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*18.54*/assetsFinder/*18.66*/.path("stylesheets/main.css")),format.raw/*18.95*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*19.59*/assetsFinder/*19.71*/.path("images/favicon.png")),format.raw/*19.98*/("""">
        <script src=""""),_display_(/*20.23*/assetsFinder/*20.35*/.path("javascripts/hello.js")),format.raw/*20.64*/("""" type="text/javascript"></script>
    </head>
    <body>
        
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
              <a class="navbar-brand" href=""""),_display_(/*26.46*/routes/*26.52*/.HomeController.index),format.raw/*26.73*/("""">Scala</a>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                  <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href=""""),_display_(/*33.75*/routes/*33.81*/.HomeController.index),format.raw/*33.102*/("""">Home</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*36.48*/routes/*36.54*/.HomeController.about),format.raw/*36.75*/("""">About</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*39.48*/routes/*39.54*/.HomeController.login),format.raw/*39.75*/("""">Login</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link" href=""""),_display_(/*42.48*/routes/*42.54*/.HomeController.signup),format.raw/*42.76*/("""">Signup</a>
                  </li>
                </ul>
                
              </div>
            </div>
          </nav>
        """),format.raw/*50.32*/("""
        """),format.raw/*51.9*/("""<h3>"""),_display_(/*51.14*/flash/*51.19*/.get("error")),format.raw/*51.32*/("""</h3>
        <h3>"""),_display_(/*52.14*/flash/*52.19*/.get("success")),format.raw/*52.34*/("""</h3>
        """),_display_(/*53.10*/content),format.raw/*53.17*/("""
    """),format.raw/*54.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,assetsFinder:AssetsFinder,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(assetsFinder,flash)

  def f:((String) => (Html) => (AssetsFinder,Flash) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (assetsFinder,flash) => apply(title)(content)(assetsFinder,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: 59acf190bf61dd227e2f005fec07beb89aa4bde4
                  MATRIX: 1073->327|1246->407|1274->408|1354->513|1390->522|1425->530|1451->535|2183->1244|2204->1256|2254->1285|2342->1346|2363->1358|2411->1385|2463->1410|2484->1422|2534->1451|2783->1673|2798->1679|2840->1700|3436->2269|3451->2275|3494->2296|3643->2418|3658->2424|3700->2445|3850->2568|3865->2574|3907->2595|4057->2718|4072->2724|4115->2746|4284->2977|4320->2986|4352->2991|4366->2996|4400->3009|4446->3028|4460->3033|4496->3048|4538->3063|4566->3070|4598->3075
                  LINES: 27->8|32->9|33->10|36->13|37->14|37->14|37->14|41->18|41->18|41->18|42->19|42->19|42->19|43->20|43->20|43->20|49->26|49->26|49->26|56->33|56->33|56->33|59->36|59->36|59->36|62->39|62->39|62->39|65->42|65->42|65->42|72->50|73->51|73->51|73->51|73->51|74->52|74->52|74->52|75->53|75->53|76->54
                  -- GENERATED --
              */
          