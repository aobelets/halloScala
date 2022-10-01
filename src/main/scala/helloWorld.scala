
  import java.time.LocalDateTime
  import scala.io.StdIn

  object helloWorld extends App {
    //def main(args: Array[String]): Unit = {
    val d = LocalDateTime.now().getDayOfWeek
    val c = LocalDateTime.now().getYear
    val name = StdIn.readLine("Enter your name:")
    println(s"Hello, $name! Today is $d")
    println(s"Now is $c year")
  }

