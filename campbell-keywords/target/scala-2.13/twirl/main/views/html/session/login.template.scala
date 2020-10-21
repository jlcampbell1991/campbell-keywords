
package views.html.session

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
/*1.2*/import campbell.keywords.{Session, User}

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/views/*3.7*/.html.layouts.application("Login")/*3.41*/ {_display_(Seq[Any](format.raw/*3.43*/("""
"""),format.raw/*4.1*/("""<h1 class="formTitle">Login</h1><span><a href=""""),_display_(/*4.49*/User/*4.53*/.addUrl),format.raw/*4.60*/("""">or signup</a></span>
<form action=""""),_display_(/*5.16*/Session/*5.23*/.loginUrl),format.raw/*5.32*/("""" method="post" id="userForm">
  Username: <input type="text" name="name"></input><br>
  Password: <input type="password" name="password"></input><br>
  <input type="submit" value="Submit" id="formButton">
</form>
""")))}),format.raw/*10.2*/("""
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
                  DATE: 2020-10-21T14:06:17.568
                  SOURCE: /Users/JCamp1991/dev/campbell-keywords/campbell-keywords/src/main/twirl/views/session/login.scala.html
                  HASH: c367473b001b893a5c0ce25821771436d4764128
                  MATRIX: 277->1|704->44|716->49|758->83|797->85|824->86|898->134|910->138|937->145|1001->183|1016->190|1045->199|1290->414
                  LINES: 10->1|20->3|20->3|20->3|20->3|21->4|21->4|21->4|21->4|22->5|22->5|22->5|27->10
                  -- GENERATED --
              */
          