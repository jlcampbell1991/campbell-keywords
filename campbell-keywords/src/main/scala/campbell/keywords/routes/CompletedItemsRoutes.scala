package campbell.keywords

import cats.implicits._
import cats.effect.Sync
import org.http4s.client._
import org.http4s.dsl.Http4sDsl
import org.http4s._
import org.http4s.twirl._
import doobie._

object CompletedItemsRoutes extends Routes {
  def publicRoutes[F[_]: Sync: Transactor](implicit dsl: Http4sDsl[F], client: Client[F]): HttpRoutes[F] = {
    import dsl._

    HttpRoutes.of {
      case GET -> Root / "completed-items" => Ok(CompletedItems.call)
    }
  }
}
