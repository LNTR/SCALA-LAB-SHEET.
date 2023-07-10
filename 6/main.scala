object Q1 extends App{
    def isPrime(number:Int,i:Int=2):Boolean=i match{
        case i if (i==number) =>true
        case i if(gcd(i,number)==1)=> isPrime(number,i+1) 
        case _=> false
    }

    def gcd(a:Int,b:Int):Int={
        if (a==b) return a
        else if(b>a) gcd(a,b-a)
        else gcd(a-b,b)
    }
    println(isPrime(11))
}

object Q2 extends App{
    def isPrime(number:Int,i:Int=2):Boolean=i match{
        case i if (i==number) =>true
        case i if(gcd(i,number)==1)=> isPrime(number,i+1) 
        case _=> false
    }

    def gcd(a:Int,b:Int):Int={
        if (a==b) return a
        else if(b>a) gcd(a,b-a)
        else gcd(a-b,b)
    }

    def primeSeq(n:Int):Unit={
        if ((n>=2)&&isPrime(n)){
            print(f"${n},")
        }
        if (n>0){
            primeSeq(n-1)
        }
    }
    primeSeq(9)
}

object Q3 extends App{
    def sum(n:Int):Int=if (n==0) 0 else sum(n-1)+n
    println(sum(5))
}

object Q4 extends App{
    def isOdd(n:Int):Boolean=if (n==1) true else !isOdd(n-1)
    def isOddOrEven(n:Int):Unit={
        if (n==0) println("Not a number")
        else if (isOdd(n)) println("Odd")
        else println("Even")
    }
}

object Q5 extends App{
    def isEven(n:Int):Boolean=n match {
        case n if (n%2==1)=> false
        case n if (n%2==0)=> true
    }
    def sumEven(n:Int)=if (n==0) 0 else if (isEven(n)) n+sumEven(n-1) else sumEven(n-1)
}


object Q5 extends App{
    def fib(n:Int)=n match{
        case 0 => 0
        case 1 => 1
        case _: Int =>  fib(n-1)+fib(n-2)
    }
    
}