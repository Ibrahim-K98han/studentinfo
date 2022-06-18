package models

class Student(
    val name:String = "",
    val id:String = "",
    val department: Department,
    val courseList:List<Course>


) {
    override fun toString(): String {
        return "Student(name='$name', id='$id', department=$department, courseList=$courseList)"
    }
}

class Department(val departmentName:String, val departmentHead:String){
    override fun toString(): String {
        return "Department(departmentName='$departmentName', departmentHead='$departmentHead')"
    }
}

class Course(val courseName:String, val courseCredit:Double){
    override fun toString(): String {
        return "Course(courseName='$courseName', courseCredit=$courseCredit)"
    }
}