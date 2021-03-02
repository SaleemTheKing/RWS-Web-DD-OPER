
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<link rel="shortcut icon" type="image/png" href='"""),_display_(/*2.51*/routes/*2.57*/.Assets.versioned("images/favicon.png")),format.raw/*2.96*/("""'>
<link rel="stylesheet" href=""""),_display_(/*3.31*/routes/*3.37*/.Assets.versioned("stylesheets/material.min.css")),format.raw/*3.86*/("""" />
<link rel="stylesheet" href=""""),_display_(/*4.31*/routes/*4.37*/.Assets.versioned("stylesheets/login.css")),format.raw/*4.79*/("""" />
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">

<html lang="en">
    <head>
        <title>Login</title>
    </head>

    <body>
        <div class="container">
            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label input">
                <input class="mdl-textfield__input" type="email" id="input_email">
                <label class="mdl-textfield__label" for="input_email">Email</label>
            </div>
            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label input">
                <input class="mdl-textfield__input" type="password" id="input_password">
                <label class="mdl-textfield__label" for="input_password">Wachtwoord</label>
            </div>
            <div class="center">
                <div>
                    <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="keep-credentials">
                        <input type="checkbox" id="keep-credentials" class="mdl-checkbox__input">
                        <span class="mdl-checkbox__label">Ingelogd blijven</span>
                    </label>
                </div>
            </div>
            <div id="spinner" class="mdl-spinner mdl-spinner--single-color mdl-js-spinner center"></div>
            <div class="buttons">
                <button class="mdl-button mdl-js-button"
                onclick="window.location.href = '"""),_display_(/*33.51*/routes/*33.57*/.HomeController.start()),format.raw/*33.80*/("""'">Overslaan</button>
                <button class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-color--yellow"
                onclick="loading()">Aanmelden</button>
            </div>
        </div>
    </body>
</html>

<script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
<script src=""""),_display_(/*42.15*/routes/*42.21*/.Assets.versioned("javascripts/login.js")),format.raw/*42.62*/(""""></script>
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
                  DATE: 2021-03-02T13:42:46.223
                  SOURCE: D:/IdeaProjects/RWS-web-DD-OPER/app/views/login.scala.html
                  HASH: 0d983fd3234fd78d7b65a0e6d1e65ae38f7ee7f5
                  MATRIX: 989->0|1081->66|1095->72|1154->111|1213->144|1227->150|1296->199|1357->234|1371->240|1433->282|2899->1721|2914->1727|2958->1750|3321->2086|3336->2092|3398->2133
                  LINES: 32->1|33->2|33->2|33->2|34->3|34->3|34->3|35->4|35->4|35->4|64->33|64->33|64->33|73->42|73->42|73->42
                  -- GENERATED --
              */
          