fun main(){
oddDigits()
    println(names(arrayOf("mary","jane","tanya","sabdio","wambo")))
    robot(3)
    robot(13)
    robot(6)
    num()
}
fun oddDigits(){
    for (number in 1..100){
        if (number % 2 !==0){
            println(number)
        }
    }
}
fun names(letters:Array<String>):Int{
    var words= 0
   letters.forEach{ z->
        if (z.length >5){
        words++
       }
   }
return words
}
fun robot(drink:Int){
    if (drink<6){
        println("milk")
    }
    else if(drink<15&& drink>6){
        println("fanta Orange")
    }
    else{
println("cocacola")
    }
}
fun num(){
for (w in 1 ..100){
    if(w%3==0) {
        println("Fizz")}
        else if (w % 5 == 0) {
            println("Buzz")
        }
        if (w % 3 == 0 && w % 5 == 0) {
            println("FizzBuzz")
        }
    }
    }
