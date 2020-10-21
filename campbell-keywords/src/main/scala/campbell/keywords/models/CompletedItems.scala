package campbell.keywords

import cats.effect.Sync
import cats.implicits._
import org.http4s._
import org.http4s.{Headers, ResponseCookie, UrlForm}
import doobie._
import doobie.implicits._
import com.github.t3hnar.bcrypt._
import org.reactormonk.{CryptoBits, PrivateKey}
import java.time._

final case class Keywords(value: String) extends AnyVal

final case class CompletedItems(keywords: Keywords)

object CompletedItems {
  def call[F[_]: Sync]: F[String] = {}
}
