import scala.io.StdIn._

object numbers {
    // chake even odd
    def evenOdd(num: Int){
        if((num%2) == 0){
            println(" input is a Even")
        }else{
            println(" input is a Odd")
        }
    }
    // chaek -, 0, +
    def chaeck(num: Int){
        if(num == 0){
            println("input is Zero ")
        }else if(num < 0){
            println("input is Negative ")
        }else{
            evenOdd(num)
        }
    }

    // main funtion
    def main(args: Array[String]): Unit = {
        println("Enter any number :")
        val num = readInt()
        chaeck(num)

    }

}