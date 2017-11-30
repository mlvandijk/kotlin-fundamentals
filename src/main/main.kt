package main


fun main(args: Array<String>){
    println("Hello World!")

    val person = Person("Bart") // val cannot change value

    println("My name is ${person.Name}")

    person.Name = "Benjamin"

    println("My name is ${person.Name}")

    person.display()

    person.displayWithLambda(::printName)

}

fun printName(name: String){
    println(name)
}