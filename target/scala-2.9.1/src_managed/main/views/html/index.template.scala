
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

  <h2>"""),_display_(Seq[Any](/*5.8*/Wine/*5.12*/.count())),format.raw/*5.20*/(""" Wines</h2>

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
                    DATE: Tue Aug 14 01:33:26 ART 2012
                    SOURCE: /home/sas/Ubuntu One/apps/backbone/winews/app/views/index.scala.html
                    HASH: 425063f1e7d33f04435a1390251a4351f7025161
                    MATRIX: 578->1|613->28|652->30|735->79|747->83|776->91|849->129|863->135|897->148|956->172|970->178|1004->191|1074->225|1089->231|1125->245|1186->270|1201->276|1237->290|1311->328|1326->334|1364->350|1427->377|1442->383|1480->399
                    LINES: 22->1|22->1|22->1|26->5|26->5|26->5|29->8|29->8|29->8|30->9|30->9|30->9|32->11|32->11|32->11|33->12|33->12|33->12|35->14|35->14|35->14|36->15|36->15|36->15
                    -- GENERATED --
                */
            