///ejercicio 1
//fun main (){
    val name = "jorge"
    println ("Hola $name")
//}
///ejercicio 2
//fun main() {
    val student = Student (
    id = 1,
    name = "Luis",
    emanil = "luisval@gmail.com"    
        
    )
    println(student)
//}
//data class Student (
   // val id : Long,
    //val name : String,
    //val emal : String,
    //val grade : int,
    //val isActive : Boolean
//)
///ejercicio 3
//fun main() {
    //val student = Student (
    //id = 1,
    //name = "Luis",
    //emanil = "luisval@gmail.com"    
    //grade = 8,
    //isActive = true    
    //)
    //println(student)
    //if (Student.isActive){
        println("El estudiante ${student.name} esta activo")
    //}
    else{
        println("El estudiante ${student.name} no esta activo")
    }
//}
//data class Student (
    val id : Long,
    val name : String,
    val emal : String
//)
///ejrcicio 4
//fun main() {
    val student = Student (
    id = 1,
    name = "Luis",
    emanil = "luisval@gmail.com"    
    grade = 8,
    isActive = true    
    )
    println(student)
    if (Student.isActive){
        println("El estudiante ${student.name} esta activo")
    }
    else{
        println("El estudiante ${student.name} no esta activo")
    }
    val status : String = if (student.isActive){
        "Activo"
    }
    else{
        "Inactivo"
    }
//}
//data class Student (
    val id : Long,
    val name : String,
    val emal : String,
    val grade : int
    val isActive : Boolean
///ejercicio 5  
data class Student (
    val id : Long,
    val name : String,
    val emal : String,
    val grade : int
    val isActive : Boolean 
fun main() {
    val student = Student (
    id = 1,
    name = "Luis",
    emanil = "luisval@gmail.com"    
    grade = 8,
    isActive = true    
    )
    val student = Student (
    id = 2,
    name = "Luisa",
    emanil = "luisaval@gmail.com"    
    grade = 9,
    isActive = true    
    )
    val student = Student (
    id = 3,
    name = "Carlos",
    emanil = "Carlosval@gmail.com"    
    grade = 4,
    isActive = false    
    )
    println(student)
    if (Student.isActive){
        println("El estudiante ${student.name} esta activo")
    }
    else{
        println("El estudiante ${student.name} no esta activo")
    }
    val status : String = if (student.isActive){
        "Activo"
    }
    else{
        "Inactivo"
    }
}








































