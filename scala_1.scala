/* Online Scala Compiler */
import scala.io.StdIn._

object HelloWorld {
    
    
    def printlist(quantity: Array[Int], itam: Array[String]): Unit = {
        var x = 0
       println( "itam \t quantity " )
       for (elyment <- quantity ){
           println( itam(x) + " \t = " + elyment )
           x = x+1
       }
    }
    // update  item  (part of enter item )
    def updateQuantity(itam: Int, quantity: Array[Int], quantityR: Int): Unit = {
        println("Previous quantity is : " + quantity(itam))
        
        quantity(itam) = quantity(itam) + quantityR
        println("now quantity is : " + quantity(itam) )

    }
    //enter intem 
    def sum(quantity: Array[Int], itam: Array[String]): Unit = {
        
        val itamR = readLine("Enter restockItem Itam name = ")
        if(itamR == "banana" || itamR == "apple" || itamR == "orange"){
            println(" Enter quantity = ")
            var quantityR = readInt()
        
        
            if(itamR == "banana"){
                updateQuantity(0, quantity, quantityR)
            }else if(itamR == "apple"){
                updateQuantity(1, quantity, quantityR)
            }else if(itamR == "orange"){
                updateQuantity(2, quantity, quantityR)
            }
        }else{
            println("There is no such merchandise")
            sum(quantity, itam )
            }
    }

    // sale 
    def sale(quantity: Array[Int]): Unit = {
        val saleItam = readLine("Enter sele item : ")
        if(saleItam == "banana" || saleItam == "apple" || saleItam == "orange"){
            println("enter quantity" )
            val saleQuantity = readInt()
                var x = 0
                if(saleItam == "banana" ){
                    x = 0
                }else if(saleItam == "apple"){
                    x = 1
                }else if(saleItam == "orange"){
                    x = 2
                }
                if(saleQuantity<=quantity(x)){
                    quantity(x) = quantity(x) - saleQuantity
                }else{
                    println("Not a stok")
                }
            
        }else{
            println("incarrect item")
            sale(quantity)
        }
    }
    
    // main funtion
   def main(args: Array[String]) {
        var quantity = Array(1, 2, 5)
        var itam = Array("banana", "apple", "Orange")
        //display itam
        printlist(quantity, itam)
        //re stor item
        sum(quantity, itam )
        // dispaly after re stor
        printlist(quantity, itam)
        // sale item
        sale(quantity)
        // dislay after sale
        println("after sell")
        printlist(quantity, itam)

   }
}