
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

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Hello")/*1.15*/ {_display_(Seq[Any](format.raw/*1.17*/("""
    """),format.raw/*2.5*/("""<section id="content">
        <div class="wrapper doc">
            <article>
                <h1>Hello World</h1>
            </article>
            <aside>
            """),_display_(/*8.14*/commonSidebar()),format.raw/*8.29*/("""
            """),format.raw/*9.13*/("""</aside>
        </div>
    </section>
""")))}),format.raw/*12.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-01T09:57:24.784
                  SOURCE: D:/IdeaProjects/play-samples-play-java-hello-world-tutorial/app/views/hello.scala.html
                  HASH: bfe1114d8920370638158f5b12a5b3e3d4dd7549
                  MATRIX: 989->1|1010->14|1049->16|1081->22|1285->200|1320->215|1361->229|1434->272
                  LINES: 32->1|32->1|32->1|33->2|39->8|39->8|40->9|43->12
                  -- GENERATED --
              */
          