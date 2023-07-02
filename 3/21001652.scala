object Q1 extends App{
    def getReverse(inputString:String):String= {
        if(inputString=="") "" 
        else inputString.last.toString()+getReverse(inputString.slice(0,inputString.length()-1))

    }
    println(getReverse("alphabet"))


    def getStringsListLargerThan5(stringList:List[String])={
        var stringListLargerThanFive:List[String]=List()
        stringList.foreach(elem=>{
            if (isLengthLargerThan5(elem)){
                stringListLargerThanFive= stringListLargerThanFive :+elem
            }
        })
        stringListLargerThanFive
    }
    
    def isLengthLargerThan5(elem:String)=elem.length()>5;

    println(getStringsListLargerThan5(List("12345678","12","12345","123456789")))

    def getAvarage(num1:Int,num2:Int):Float=(num1+num2).toFloat/2
    println(f"${getAvarage(5,6)}%.2f")

}
