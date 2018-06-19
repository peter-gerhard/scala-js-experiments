package jsonExample

object Main {

  def main(args: Array[String]): Unit = {
//    parseTest.run
    decoderEncoderTest.run
  }

  object decoderEncoderTest {
    import io.circe.{Decoder, Encoder, _}
    import io.circe.generic.semiauto._
    import io.circe.parser._
    import io.circe.syntax._

    case class User(username: String, password: String)

    object User {
      implicit val userDecoder: Decoder[User] = deriveDecoder
      implicit val userEncoder: Encoder[User] = deriveEncoder
    }

    def run: Unit = {
      val json =
        """{
          |  "username": "Henriette.Hand29",
          |  "password": "7FvtXLmNPaVFVbl"
          |}""".stripMargin

      val user = new User("Henriette.Hand29", "7FvtXLmNPaVFVbl")
      val decoded = decode[User](json)

      println(user.asJson)
      println(decoded)
    }
  }

  object parseTest {
    import io.circe.parser._
    val rawJson: String =
      """
      {
        "foo": "bar",
        "baz": 123,
        "list of stuff": [ 4, 5, 6 ]
      }
      """

    def run: Unit = parse(rawJson) match {
      case Left(failure) => println("Invalid JSON :(")
      case Right(json) => println("Yay, got some JSON!")
    }
  }

}
