package campbell.keywords

import cats.effect.Sync
import cats.implicits._
import fs2.Stream
import org.http4s._
import org.http4s.client._
import org.http4s.{Headers, Method, Request, Uri}
import org.http4s.Method._
import org.http4s.circe._

import org.http4s.EntityEncoder
// import doobie._
// import doobie.implicits._
// import com.github.t3hnar.bcrypt._
// import org.reactormonk.{CryptoBits, PrivateKey}
// import java.time._

final case class Keywords(value: String) extends AnyVal

final case class CompletedItems(keywords: Keywords)

object CompletedItems {
  def call[F[_]: Sync](implicit client: Client[F]): F[String] = {
    implicit val stringEncoder: EntityEncoder[F, String] = EntityEncoder.stringEncoder

    client.expect[String](
      Request(
        method = Method.POST,
        uri = Uri(path = "https://svcs.ebay.com/services/search/FindingService/v1"),
        headers = Headers.of(
          Header("X-EBAY-SOA-SECURITY-APPNAME", "JoshuaCa-Campbell-PRD-0e64ea37b-4c713be1"),
          Header("X-EBAY-SOA-OPERATION-NAME", "findCompletedItems")
        )
      ).withEntity(
        """<?xml version="1.0" encoding="UTF-8"?>
<findCompletedItemsRequest xmlns="http://www.ebay.com/marketplace/search/v1/services">
   <keywords>chair slipcover</keywords>
   <itemFilter>
      <name>SoldItemsOnly</name>
      <value>true</value>
   </itemFilter>
   <sortOrder>EndTimeSoonest</sortOrder>
   <paginationInput>
      <entriesPerPage>100</entriesPerPage>
      <pageNumber>100</pageNumber>
   </paginationInput>
</findCompletedItemsRequest>"""
      )
    )
  }
}
