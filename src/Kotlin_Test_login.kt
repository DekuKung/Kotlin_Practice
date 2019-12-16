import java.util.*

//class Accountlogin(val rUsername:String, val rPassword:String){
//    fun login(username:String, password:String) : Boolean {
//        if (username == rUsername && password == rPassword){
//            return true
//        }else{
//            return false
//        }
//    }
//}

fun main(args: Array<String>){
    val scanuser = Scanner(System.`in`)
    println("Enter a Username : ")
    var username = scanuser.nextLine()
    val scanpass = Scanner(System.`in`)
    println("Enter a Password : ")
    var password = scanpass.nextLine()
    println("Your Username is $username")
    println("Your Password is $password")


}