import scala.io.StdIn.readLine

object Q1 extends App{
    def getInterestAmount(depositAmount:Double):Double=depositAmount match {
        case depositAmount if depositAmount<=0 => 0.0
        case depositAmount if depositAmount<20_000 => depositAmount*0.02
        case depositAmount if depositAmount<200_000 => depositAmount*0.04
        case depositAmount if depositAmount<2_000_000 => depositAmount*0.035
        case depositAmount if depositAmount>=2_000_000 => depositAmount*0.065
        case _ =>0.0 
    }
    println(getInterestAmount(1_000_000.00))
}


object  Q2 extends App{
    def getMatchingPattern(number:Int):String=number match{
        case number if number<=0 => "Negative/Zero"
        case number if (number%2)==0 => "Even number"
        case number if (number%2)==1 => "Odd number"
        case _ =>""; 
    }
    val number:Int=readLine().toInt
    println(getMatchingPattern(number))
}

object  Q3 extends App{
    def toUpper(string:String)=string.toUpperCase()
    def toLower(string:String)=string.toLowerCase()
    def formatNames(name:String,function:String=>String):String=function(name)
    
    println(formatNames("Niroshan",toUpper))
    println(formatNames("Benny",toLower))
    println(formatNames("Saman",toUpper))
    println(formatNames("Kumara",toLower))

}