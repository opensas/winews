
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Welcome to Play 2.0")/*1.29*/ {_display_(Seq[Any](format.raw/*1.31*/("""
    
  <h1>Welcome to smx backend!</h1>

  <h2>"""),_display_(Seq[Any](/*5.8*/Wine/*5.12*/.count)),format.raw/*5.18*/(""" Wines</h2>

  <ul>
    <li><a href=""""),_display_(Seq[Any](/*8.19*/routes/*8.25*/.Wines.list())),format.raw/*8.38*/("""">
      Wines.list() ("""),_display_(Seq[Any](/*9.22*/routes/*9.28*/.Wines.list())),format.raw/*9.41*/(""")
    </a></li>
    <li><a href=""""),_display_(Seq[Any](/*11.19*/routes/*11.25*/.Wines.show(1))),format.raw/*11.39*/("""">
      Wines.show(1) ("""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Wines.show(1))),format.raw/*12.43*/(""")
    </a></li>    
    <li><a href=""""),_display_(Seq[Any](/*14.19*/routes/*14.25*/.Wines.show(999))),format.raw/*14.41*/("""">
      Wines.show(999) ("""),_display_(Seq[Any](/*15.25*/routes/*15.31*/.Wines.show(999))),format.raw/*15.47*/(""" - not found)
    </a></li>    
  </ul>

<hr />
  
""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Aug 06 13:01:20 ART 2012
                    SOURCE: /home/sas/dev/apps/backbone/winews/app/views/index.scala.html
                    HASH: e8115d994ed70cf6af00d8006a591b4582e289be
                    MATRIX: 578->1|613->28|652->30|735->79|747->83|774->89|847->127|861->133|895->146|954->170|968->176|1002->189|1072->223|1087->229|1123->243|1184->268|1199->274|1235->288|1309->326|1324->332|1362->348|1425->375|1440->381|1478->397
                    LINES: 22->1|22->1|22->1|26->5|26->5|26->5|29->8|29->8|29->8|30->9|30->9|30->9|32->11|32->11|32->11|33->12|33->12|33->12|35->14|35->14|35->14|36->15|36->15|36->15
                    -- GENERATED --
                */
            