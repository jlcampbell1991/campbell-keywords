package campbell.keywords

import doobie._
import doobie.implicits._

object UserTable extends Table {
  def initialize: Update0 = sql"""
    DROP TABLE IF EXISTS campbell_keywords_user;
    CREATE TABLE campbell_keywords_user(
      name VARCHAR UNIQUE,
      password VARCHAR,
      id VARCHAR PRIMARY KEY
    )""".update

  def update: Update0 =
    sql"""DROP TABLE IF EXISTS campbell_keywords_user""".update
}
