package main

// class is public by default
class Person(var Name: String) { // var can change value
    fun display() { // public by default
        println("Display: $Name")
    }

    // higher order function
    fun displayWithLambda(func: (s:String) -> Unit){ // Unit is void
        func(Name) // call the function with the name set in the constructor
    }
}