
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * three arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page and an `AssetFinder`
 * to define to reverse route static assets.
 */
  def apply/*8.2*/(title: String)(content: Html)(implicit assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
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
        """),_display_(/*51.10*/content),format.raw/*51.17*/("""
    """),format.raw/*52.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(assetsFinder)

  def f:((String) => (Html) => (AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (assetsFinder) => apply(title)(content)(assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: 88830c4c5cd2ecba1ab6b09702fb684b4eeed125
                  MATRIX: 1067->327|1228->395|1256->396|1336->501|1372->510|1407->518|1433->523|2165->1232|2186->1244|2236->1273|2324->1334|2345->1346|2393->1373|2445->1398|2466->1410|2516->1439|2765->1661|2780->1667|2822->1688|3418->2257|3433->2263|3476->2284|3625->2406|3640->2412|3682->2433|3832->2556|3847->2562|3889->2583|4039->2706|4054->2712|4097->2734|4266->2965|4303->2975|4331->2982|4363->2987
                  LINES: 27->8|32->9|33->10|36->13|37->14|37->14|37->14|41->18|41->18|41->18|42->19|42->19|42->19|43->20|43->20|43->20|49->26|49->26|49->26|56->33|56->33|56->33|59->36|59->36|59->36|62->39|62->39|62->39|65->42|65->42|65->42|72->50|73->51|73->51|74->52
                  -- GENERATED --
              */
          