object Q1 extends App{
    val filterEvenNumbers=(numberList:List[Int])=>{
        numberList.filter(number=>{ (number%2)==0 }   
        )
    }
    println(filterEvenNumbers(List(1,2,3,4,5,6)));
}

object Q2 extends App{
    val calculateSquare=(numberList:List[Int])=>{numberList.map(number=>{
        number*number}
        )
    }
    println(calculateSquare(List(1,2,3,4,5,6)));

}

object Q3 extends App{
    
    val filterPrime=(numberList:List[Int])=>{numberList.filter(number=>{

        def isPrime(i:Int,number:Int):Boolean=number match{
            case 2=>true
            case 1|0=>false
            case number if (number%2==0)=>false
            case number if (number==i) =>true
            case number=> isPrime(i+1,number)

        }

        isPrime(1,number)
    }

    )
    }
    println(filterPrime(List(0,1,2,3,4,5,6,7,8,9,10,11)));

}