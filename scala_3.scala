import scala.io.StdIn._

object numbers {
    // to Benny all uppercase
    def toUppper(name: String): String = {
        val upper = name.map {
            char =>
            char.toUpper
        }
        return upper
    }
    //saman
    def toLower(name: String): String = {
        val lower = name.map {
            char =>
            char.toLower
        }
        return lower
    }
    // NIroshan
    def towupper(name: String): String= {
        val firstTwoChars = name.substring(0, 2).toUpperCase
        val lastchars = name.substring(2).toLowerCase
        return firstTwoChars + lastchars

    }
    //KumarA
    def midLow(name: String): String={
        val length = name.length
        val firstLeter = name.substring(0, 1).toUpperCase
        val mid = name.substring(1, length - 2).toLowerCase
        val last = name.substring(length - 2, length - 1).toUpperCase
        return firstLeter + mid + last
    }


    def main(args: Array[String]): Unit = {
        val name = Array("Benny", "Niroshan", "Saman", "Kumara" )
        // to Benny all uppercase
        println(toUppper(name(0)))
        // NIroshan
        println(towupper(name(1)))
        // saman
        println(toLower(name(2)))
        //KumarA
        println(midLow(name(3)))

        // println(name(0))
    }  
}