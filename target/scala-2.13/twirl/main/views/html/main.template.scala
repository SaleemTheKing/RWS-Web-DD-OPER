
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
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <script src="https://code.jquery.com/jquery-1.9.1.min.js"></script>
    <script>
    $( document ).ready(function() """),format.raw/*7.36*/("""{"""),format.raw/*7.37*/("""
        """),format.raw/*8.9*/("""menuOpen = JSON.parse(localStorage.getItem('isMenuOpen'));

        if (menuOpen) """),format.raw/*10.23*/("""{"""),format.raw/*10.24*/("""
            """),format.raw/*11.13*/("""menuBtn.classList.add('open');
            menu.classList.add('menu-open');

            menuItems.forEach(item => """),format.raw/*14.39*/("""{"""),format.raw/*14.40*/("""
                """),format.raw/*15.17*/("""item.classList.add('menu-open__text');
            """),format.raw/*16.13*/("""}"""),format.raw/*16.14*/(""");
        """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/("""
    """),format.raw/*18.5*/("""}"""),format.raw/*18.6*/(""");
    </script>

    <head>
        <title>"""),_display_(/*22.17*/title),format.raw/*22.22*/("""</title>
        <link rel="shortcut icon" type="image/png" href='"""),_display_(/*23.59*/routes/*23.65*/.Assets.versioned("images/favicon.png")),format.raw/*23.104*/("""'>
        <link rel="stylesheet" href=""""),_display_(/*24.39*/routes/*24.45*/.Assets.versioned("stylesheets/main.css")),format.raw/*24.86*/("""">
    </head>

    <div class="header">
        <div class="burger">
            <span></span>
            <span></span>
            <span></span>
        </div>
        <h1>Rijkswaterstaat DD-OPER</h1>
    </div>

    <div style="display: flex">
        <div class="menu">
            <ul>
                <li>
                    <a href=""""),_display_(/*40.31*/routes/*40.37*/.HomeController.index()),format.raw/*40.60*/("""">
                        <img class="menu-icon" src=""""),_display_(/*41.54*/routes/*41.60*/.Assets.versioned("images/favicon.png")),format.raw/*41.99*/("""" alt="Grafieken">
                        <p>Grafieken</p>
                    </a>
                </li>
                <li>
                    <a href=""""),_display_(/*46.31*/routes/*46.37*/.HomeController.start()),format.raw/*46.60*/("""">
                        <img class="menu-icon" src=""""),_display_(/*47.54*/routes/*47.60*/.Assets.versioned("images/favicon.png")),format.raw/*47.99*/("""" alt="Grafieken">
                        <p>Bookmarks</p>
                    </a>
                </li>
                <li>
                    <a href=""""),_display_(/*52.31*/routes/*52.37*/.HomeController.index()),format.raw/*52.60*/("""">
                        <img class="menu-icon" src=""""),_display_(/*53.54*/routes/*53.60*/.Assets.versioned("images/favicon.png")),format.raw/*53.99*/("""" alt="Grafieken">
                        <p>Instellingen</p>
                    </a>
                </li>
            </ul>
        </div>

        <div id="main" class="sidebar-open">
        """),_display_(/*61.10*/content),format.raw/*61.17*/("""
        """),format.raw/*62.9*/("""</div>
    </div>

    <script src=""""),_display_(/*65.19*/routes/*65.25*/.Assets.versioned("javascripts/main.js")),format.raw/*65.65*/(""""></script>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-01T17:12:22.814
                  SOURCE: D:/IdeaProjects/RWS-web-DD-OPER/app/views/main.scala.html
                  HASH: 5953a2a70da7a8764e1eeb4c8994cb846ab9056f
                  MATRIX: 911->1|1035->32|1062->33|1242->186|1270->187|1305->196|1415->278|1444->279|1485->292|1628->407|1657->408|1702->425|1781->476|1810->477|1848->488|1877->489|1909->494|1937->495|2009->540|2035->545|2129->612|2144->618|2205->657|2273->698|2288->704|2350->745|2720->1088|2735->1094|2779->1117|2862->1173|2877->1179|2937->1218|3122->1376|3137->1382|3181->1405|3264->1461|3279->1467|3339->1506|3524->1664|3539->1670|3583->1693|3666->1749|3681->1755|3741->1794|3966->1992|3994->1999|4030->2008|4094->2045|4109->2051|4170->2091
                  LINES: 27->1|32->2|33->3|37->7|37->7|38->8|40->10|40->10|41->11|44->14|44->14|45->15|46->16|46->16|47->17|47->17|48->18|48->18|52->22|52->22|53->23|53->23|53->23|54->24|54->24|54->24|70->40|70->40|70->40|71->41|71->41|71->41|76->46|76->46|76->46|77->47|77->47|77->47|82->52|82->52|82->52|83->53|83->53|83->53|91->61|91->61|92->62|95->65|95->65|95->65
                  -- GENERATED --
              */
          