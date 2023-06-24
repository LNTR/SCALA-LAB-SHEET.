object Q1 extends App{
    var k,i,j:Int=2
    var m,n:Int=5
    var f:Float=12.0f
    var g:Float=4.0f
    var c:Char='X'

    println(s" k + 12 * m = ${ k+12*m }")
    println(s" m / j = ${ m/j }")
    println(s" n % j = ${ n%j }")
    println(s" m / j * j = ${ m/j*j }")
    println(s" f + 10*5 +g = ${ f+10*5+g }")
    i+=1
    print(s" ++i * n = ${ i*n }")
}

object Q2 extends App{
    var a:Int=2
    var b:Int=3
    var c:Int=4
    var d:Int=5
    var g:Float=4.0f
    var k:Float=4.3f

    b-=1
    println(s"--b*a+c*d-- = ${ b*a+c*d }")
    d-=1
    a+=1
    println(s"a++ = ${a}")
    println (s"c=c++ = ${c}")
    a+=1
    c=c*a
    println (s"c=++c*a++ = ${c*a}")
    println(s"-2*(g-k) +c = ${-2*(g-k) +c}")

}

object Q3 extends App{
    def getOTHourseSalary(oTHours:Int):Double=85.00*oTHours
    def getWorkingHoursSalary(workingHours:Int):Double=250.00*workingHours
    def getSalary(workingHours:Int,oTHours:Int):Double=getOTHourseSalary(oTHours)+getWorkingHoursSalary(workingHours)
    def getTaxReducedSalary(salary:Double):Double=(1.0-0.12)*salary
    println(s"Salary is : ${getTaxReducedSalary(getSalary(40,30))}")
}

object Q4 extends App{
    def getProfit(ticketPrice:Int):Double=(ticketPrice-3)*(120-(4*(ticketPrice-15)))-500
    def getBestTicketPrice(profitList:List[Double])=profitList.indexOf(profitList.max)*5
    // def getProfitArray(start:Int,end:Int)

    var profitList:List[Double]=List()
    var i:Int=0
    for (i <- 0 to 6) profitList:+=getProfit(5*i)
    
    println(s"Best price ${ getBestTicketPrice(profitList) }")
}

