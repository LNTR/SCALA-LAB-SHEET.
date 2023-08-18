import scala.io.StdIn.readLine

object Q1 extends App{
    val interestAmount=(depositAmount:Int)=>depositAmount match{
        case x if (x<=20_000)=>x*0.02
        case x if (x<=200_000)=>x*0.04
        case x if (x<=2_000_000)=>x*0.035
        case x if (x>2_000_000)=>x*0.065
    }
    println(interestAmount(10000000));
    
}

object  Q2 extends App{
    val getMatchingPattern=(number:Int)=>number match{
        case number if number<=0 => "Negative/Zero"
        case number if (number%2)==0 => "Even number"
        case number if (number%2)==1 => "Odd number"
        case _ =>""; 
    }
    val number:Int=readLine().toInt
    println(getMatchingPattern(number))

}

object  Q3 extends App{
    val formatNames=(name:String,function:String=>String)=>function(name)

    val toLower=(string:String)=>string.toLowerCase()
    val toUpper=(string:String)=>string.toUpperCase()
 
    println(formatNames("Niroshan",toLower))
    println(formatNames("Benny",toUpper))
    println(formatNames("Saman",toLower))
    println(formatNames("Kumara",toUpper))

}