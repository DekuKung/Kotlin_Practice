class Account() {
    fun login(username: String, password: String): Boolean {
        if (username == "admin" && password == "qwerty") {
            return true
        } else {
            return false
        }
    }
}
    fun main(args: Array<String>) {
        val acc = Account()
        if (acc.login("admin","qwerty")==true){
            println("success")
        }else{
            println("failed")
        }
//    println("Hello Kotlin App")

//    // Operator
//    var num1 = 55
//    var num2 = 23
//    // Addition Operator
//    println(num1+num2)
//
//    // Subtraction Operator
//    println(num1-num2)
//
//    // Multiplication Operator
//    println(num1*num2)
//
//    // Division Operator
//    println(num1 / num2)
//    println(num1.toFloat() / num2.toFloat())
//
//    // Modulus Operator
//    println(num1 % num2)

        // Arrays Int
//    val _intarr = arrayOf(1,2,3,4,5)
//    for (item in _intarr){
//        println(item)
//    }
        // Arrays String (Immutable)
//    val _strarr = arrayOf("dog","cat","fish","bird","duck")
//    for (item in _strarr){
//        println(item)
//    }
        // Arrays String (Mutable)
//    val _lsarr = ArrayList<String>()
//    _lsarr.add("Coffee")
//    _lsarr.add("Milk")
//    _lsarr.add("Strawberry Cheese Cake")
//    _lsarr.add("Tea")
//    for (item in _lsarr){
//        println(item)
//    }
// var number = 4
//    var numberProvided = when(number) {
//        1 -> "One"
//        2 -> "Two"
//        3 -> "Three"
//        4 -> "Four"
//        else -> "Invalid number"
//    }
//    println("You provide $numberProvided")
    }