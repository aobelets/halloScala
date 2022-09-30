object helloWorld {
  import java.time.LocalDateTime
  import scala.io.StdIn

  object Main extends App {
    //def main(args: Array[String]): Unit = {
    val d = LocalDateTime.now().getDayOfWeek
    val name = StdIn.readLine("Enter your name:")
    println(s"Hello, $name! Today is $d")
  }
}
