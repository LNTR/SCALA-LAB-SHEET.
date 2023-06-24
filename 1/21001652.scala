object Main extends App{
    //1
    def area(r:Double):Double=math.Pi*r*r
    //2
    def farenhite(celcius:Double):Double=celcius*1.8+32
    //3
    def volume(r:Double):Double=(4.0/3.0)*r*r*r*math.Pi
    //4
    def getPrice(quantity:Int):Double=quantity*24.95*0.6
    def getShippingFees(quantity:Int):Double=(50*3.0)+(quantity-50)*0.75
    //5
    def easy(distance:Int):Int=8*distance
    def tempo(distance:Int):Int=7*distance
    
    println(s"1) ${area(10)}")
    println(s"2) ${farenhite(35)}")
    println(s"3) ${volume(5)}")
    println(s"4) ${getPrice(60)+getShippingFees(60)}")
    println(s"5) ${easy(2)+tempo(3)+easy(2)}")
}