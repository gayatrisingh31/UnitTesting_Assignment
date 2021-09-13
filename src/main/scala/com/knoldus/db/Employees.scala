package com.knoldus.db
import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class Employees {
  val emp : Employee = Employee("Gayatri","Singh",23,15000,"Intern","Knoldus","gayatri.singh@knoldus.com")
  val emp1 : Employee = Employee("sonali","kumari",23,15000,"Intern","Knoldus","sonali.kumari@knoldus.com")
  val totalEmp : HashMap[String,Employee] = HashMap("emp1"->emp,"emp2"->emp1)
}