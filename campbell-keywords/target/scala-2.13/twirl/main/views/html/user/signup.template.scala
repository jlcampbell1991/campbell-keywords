
package views.html.user

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
/*1.2*/import campbell.keywords.User

object signup extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/views/*3.7*/.html.layouts.application("Login")/*3.41*/ {_display_(Seq[Any](format.raw/*3.43*/("""
"""),format.raw/*4.1*/("""<h1 class="formTitle">Signup!</h1>
<form action=""""),_display_(/*5.16*/User/*5.20*/.addUrl),format.raw/*5.27*/("""" method="post" id="userForm">
  Username: <input type="text" name="name" value=""></input><br>
  Password: <input type="password" name="password" value=""></input><br>
  Confirm Password: <input type="password" name="passwordConfirmation"></input><br>
  <input type="submit" value="Submit" id="formButton">
</form>
""")))}),format.raw/*11.2*/("""
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
                  DATE: 2020-10-21T14:06:17.609
                  SOURCE: /Users/JCamp1991/dev/campbell-keywords/campbell-keywords/src/main/twirl/views/user/signup.scala.html
                  HASH: 688cc7c1c62ef49ce98d9699ae681e47279021e1
                  MATRIX: 274->1|691->33|703->38|745->72|784->74|811->75|887->125|899->129|926->136|1273->453
                  LINES: 10->1|20->3|20->3|20->3|20->3|21->4|22->5|22->5|22->5|28->11
                  -- GENERATED --
              */
          