package db

import models.Course

val departmentMap = mapOf(
    "CSE" to listOf(
        Course(courseName = "Linear Algebra", courseCredit = 2.0),
        Course(courseName = "Software Engineering", courseCredit = 4.0),
        Course(courseName = "App Development", courseCredit = 3.0),
    ),
    "BBA" to listOf(
        Course(courseName = "Accounting", courseCredit = 2.0),
        Course(courseName = "Finance", courseCredit = 4.0),
        Course(courseName = "Marketing", courseCredit = 3.0),
    ),
    "EEE" to listOf(
        Course(courseName = "Energy Conversion", courseCredit = 3.0),
        Course(courseName = "Electronics", courseCredit = 3.0),
        Course(courseName = "Circuit 2", courseCredit = 3.0),
    ),

)