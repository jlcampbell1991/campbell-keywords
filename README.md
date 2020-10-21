# Campbell Keywords
An http4s web app for interacting with the eBay Finding API

## How to run
## Running locally
* [Install sbt](http://www.scala-sbt.org/1.0/docs/Setup.html)
* Set port in `/inventory-tracker/src/main/scala/me/josh/campbell/inventory/tracker/SetupServer.scala` line 19-20

## Deploying to Heroku
* [Install sbt](http://www.scala-sbt.org/1.0/docs/Setup.html)
* Set port to `.bindHttp(System.getenv("PORT").toInt, "0.0.0.0")` in `/inventory-tracker/src/main/scala/me/josh/campbell/inventory/tracker/SetupServer.scala` line 19-20
* In your terminal, `docker-machine start`
* Followed by `eval $(docker-machine env default)`
* Then `sbt docker:publishLocal`
* Commit changes to git
* `heroku git:remote -a [YOUR_HEROKU_APP]`
* `heroku stack:set container`
* `git push heroku main`
