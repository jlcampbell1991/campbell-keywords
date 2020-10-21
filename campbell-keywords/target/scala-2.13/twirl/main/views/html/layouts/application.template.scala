
package views.html.layouts

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml

object application extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,play.twirl.api.Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(body: play.twirl.api.Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>campbell-keywords - """),_display_(/*7.37*/title),format.raw/*7.42*/("""</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="/javascripts/application.js"></script>
        <link rel="stylesheet" type="text/css" href="/stylesheets/application.css" />
    </head>
    <body>
        """),_display_(/*13.10*/views/*13.15*/.html.layouts.menu()),format.raw/*13.35*/("""
        """),_display_(/*14.10*/body),format.raw/*14.14*/("""
    """),format.raw/*15.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,body:play.twirl.api.Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(body)

  def f:((String) => (play.twirl.api.Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (body) => apply(title)(body)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-10-21T14:06:17.398
                  SOURCE: /Users/JCamp1991/dev/campbell-keywords/campbell-keywords/src/main/twirl/views/layouts/application.scala.html
                  HASH: 3d09b607805a18d716650c14cb45f6d709d4dd9f
                  MATRIX: 600->1|736->44|763->45|860->116|885->121|1196->405|1210->410|1251->430|1288->440|1313->444|1345->449
                  LINES: 14->1|19->2|20->3|24->7|24->7|30->13|30->13|30->13|31->14|31->14|32->15
                  -- GENERATED --
              */
          