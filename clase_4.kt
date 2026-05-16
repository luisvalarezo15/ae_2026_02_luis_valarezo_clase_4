//fun main (){
    val name = "jorge"
    println ("Hola $name")
//}
fun main() {
    val student = Student (
    id = 1,
    name = "Luis",
    emanil = "luisval@gmail.com"    
        
    )
    println(student)
}
data class Student (
    val id : Long,
    val name : String,
    val emal : String,
    val grade : int,
    val isActive : Boolean
)