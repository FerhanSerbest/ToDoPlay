
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Task],Form[Task],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(tasks: List[Task], taskForm: Form[Task]):play.api.templates.Html = {
        _display_ {import helper.twitterBootstrap._


Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Todo list")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""

	<h1>To Do</h1>
    
    </br>
    
   
    
    
    """),_display_(Seq[Any](/*14.6*/helper/*14.12*/.form(routes.Application.newTask())/*14.47*/ {_display_(Seq[Any](format.raw/*14.49*/("""
        
        """),_display_(Seq[Any](/*16.10*/helper/*16.16*/.inputText(taskForm("label")))),format.raw/*16.45*/("""
        
        <input type="submit" class="btn btn-primary" value="Create">
        
    """)))})),format.raw/*20.6*/("""
    
    
    <hr>
    
    <h2>"""),_display_(Seq[Any](/*25.10*/tasks/*25.15*/.size())),format.raw/*25.22*/(""" task(s)</h2>
    
    <ul>
        """),_display_(Seq[Any](/*28.10*/for(task <- tasks) yield /*28.28*/ {_display_(Seq[Any](format.raw/*28.30*/("""
        	
            	<li>
            		<div class="alert alert-info">
            	    """),_display_(Seq[Any](/*32.19*/task/*32.23*/.label)),format.raw/*32.29*/("""
            	    </div>
            	    
            	    """),_display_(Seq[Any](/*35.19*/helper/*35.25*/.form(routes.Application.deleteTask(task.id))/*35.70*/ {_display_(Seq[Any](format.raw/*35.72*/("""
            	        <input type="submit" class="btn btn-primary" value="Delete">
            	    """)))})),format.raw/*37.19*/("""
            </li>
            </div>
        """)))})),format.raw/*40.10*/("""
    </ul>
    
""")))})))}
    }
    
    def render(tasks:List[Task],taskForm:Form[Task]): play.api.templates.Html = apply(tasks,taskForm)
    
    def f:((List[Task],Form[Task]) => play.api.templates.Html) = (tasks,taskForm) => apply(tasks,taskForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 24 15:25:01 PDT 2013
                    SOURCE: C:/Play/TodoPlay/app/views/index.scala.html
                    HASH: a587ad86a7816d7766278837f89a26567058c6ec
                    MATRIX: 738->1|889->42|917->78|953->80|978->97|1017->99|1109->156|1124->162|1168->197|1208->199|1263->218|1278->224|1329->253|1453->346|1523->380|1537->385|1566->392|1639->429|1673->447|1713->449|1841->541|1854->545|1882->551|1979->612|1994->618|2048->663|2088->665|2221->766|2300->813
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|42->14|42->14|42->14|42->14|44->16|44->16|44->16|48->20|53->25|53->25|53->25|56->28|56->28|56->28|60->32|60->32|60->32|63->35|63->35|63->35|63->35|65->37|68->40
                    -- GENERATED --
                */
            