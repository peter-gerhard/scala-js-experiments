//package httpCallExample
//
//import fr.hmil.roshttp.HttpRequest
//import fr.hmil.roshttp.response.SimpleHttpResponse
//import monix.execution.Scheduler.Implicits.global
//
//import scala.util.{Failure, Success}
//
//object Main {
//
//
//  def main(args: Array[String]): Unit = {
//    val request = HttpRequest("http://api.escemo.com")
//
//    request.send().onComplete({
//      case res: Success[SimpleHttpResponse] => println(res.get.body)
//      case e: Failure[SimpleHttpResponse] => println("Houston, we got a problem!")
//    })
//  }
//}
