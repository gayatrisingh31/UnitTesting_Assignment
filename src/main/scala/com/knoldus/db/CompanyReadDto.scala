package com.knoldus.db

import com.knoldus.models.Company

import scala.collection.immutable.HashMap

class CompanyReadDto {

  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val phillipsCompany: Company = Company("phillips", "infoL&T@gmail.com", "Noida")
  val companies: HashMap[String, Company] = HashMap("Knoldus" -> knoldusCompany, "phillips" -> phillipsCompany)

  def getCompanyByName(name: String): Option[Company] = companies.get(name)

}
