package HWScala
object scalaCollections extends App {
  val Age: Int = 20

  val weight: Double = 70.5

  val name: String = "Ivan"

  var isStudent: Boolean = true

  println(s"Age: $Age")
  println(s"Weight: $weight")
  println(s"Name: $name")
  println(s"Is student: $isStudent")

  def Add(a: Int, b: Int): Int = {
    a + b
  }

  println(Add(7, 9))

  def CheckAge(age: Int): String ={
    if age < 30 then "Молодой"
    else "Взрослый"
  }

  println(CheckAge(53))

  for (i <- 1 to 10) {
    println(i)
  }

  val Students = List("Маша", "Даша", "Ваня", "Даня", "Влад", "Игнат")
  Students.foreach(st => println(st))

  println("Введите Ваше имя: ")
  val stName = scala.io.StdIn.readLine()
  println("Введите Ваш возраст: ")
  val stAge = scala.io.StdIn.readInt()
  println("Вы студент? (Да/Нет)")
  val stStatus = scala.io.StdIn.readLine()
  if stStatus == "Да" then isStudent = true
  else isStudent = false

  println(s"Name: $stName")
  println(s"Is student: $isStudent")
  println(s"Age: $stAge")
  println(CheckAge(stAge))

  val numbers = for (i <- 1 to 10) yield i
  println(numbers)

  val qnumbers = for (el <- numbers) yield el * el
  println(qnumbers)

  val oddnumbers = for (el <- numbers if el % 2 == 0) yield el
  println(oddnumbers)

}