object Q1 extends App{
    val celciusList:List[Double]=List(0, 10, 20, 30)
    val calculateAvarage=(celciusList:List[Double])=>celciusList
    .map(celciusValue=>((celciusValue*(9.0/5.0))+32))
    .reduce((farrenHeit1,farrenHeit2)=>farrenHeit1+farrenHeit2)/celciusList.length
    
    println(calculateAvarage(celciusList))

}

object  Q2 extends  App{
    val letterList:List[String]=List("apple", "banana", "cherry", "date")
    val countLetterOccurrences=(stringList:List[String])=>stringList
    .map(string=>(string.length))
    .reduce((length1,length2)=>length1+length2)

    println(countLetterOccurrences(letterList))
}