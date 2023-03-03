import java.util.Scanner
import scala.io.StdIn
object FindProduct {
  def main (args:Array[String]): Unit = {
    var firstnumber = StdIn.readInt()
    val input = new Scanner(System.in)
    var secondnumber = input.nextInt()
    println("First Number :"+firstnumber)
    println("Second number :"+secondnumber)
    println("Product of two numbers: "+firstnumber*secondnumber)

  }
}
