import db.departmentMap
import models.Course
import models.Department
import models.Student
import java.util.Scanner

fun main (){
    var isRepeat = true
    val studentList = mutableListOf<Student>()
    val scanner = Scanner(System.`in`)

    while (isRepeat){
        println("Student Registration form")
        println("---------------------------")
        println("Enter Student Name : ")
        val name = scanner.nextLine()
        println()
        println("Enter student ID : ")
        val id = scanner.nextLine()
        println()
        println("Select Department : ")
        println("---------------------------")
        print("1. CSE \t2. BBA \t3. EEE")
        println()
        val choice = scanner.nextInt()
        var deptName:String = ""
        when (choice){
            1 -> {
                deptName = "CSE"
            }
            2 -> {
                deptName = "BBA"
            }
            3 -> {
                deptName = "EEE"
            }
        }
        var courseList = departmentMap[deptName]!!
        val student = Student(
            name = name,
            id = id,
            department = Department(
                departmentName = deptName,
                departmentHead = "Ibrahim"
            ),
            courseList = courseList)
        studentList.add(student)
        println("Add another student? Y/N")
        val yn = scanner.nextLine()
        isRepeat = yn.lowercase() == "y"
    }
    studentList.forEach {
        println(it)
    }
}


