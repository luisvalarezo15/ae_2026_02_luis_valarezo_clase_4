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
//data class Student (
    val id : Long,
    val name : String,
    val emal : String,
    val grade : int
    val isActive : Boolean 
//fun main() {
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
//}
///ejercicio 6
data class Student(
    val id: Long,
    val name: String,
    val email: String,
    val grade: Int,
    val isActive: Boolean
)

fun main() {

    val student1 = Student(
        id = 1,
        name = "Luis",
        email = "luisval@gmail.com",
        grade = 8,
        isActive = true
    )

    val student2 = Student(
        id = 2,
        name = "Luisa",
        email = "luisaval@gmail.com",
        grade = 9,
        isActive = true
    )

    val student3 = Student(
        id = 3,
        name = "Carlos",
        email = "Carlosval@gmail.com",
        grade = 4,
        isActive = false
    )

    val students = listOf(student1, student2, student3)

    println(students)

    for (miVariable in students) {
        println("${miVariable.name} - ${miVariable.grade}")
    }
}








































