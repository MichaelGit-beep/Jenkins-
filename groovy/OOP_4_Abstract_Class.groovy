// Create abstract class
// 1. Can't be instanciated
// 2. Can be inherited. Provides a template for further specific classes
// 
abstract class Car {
    String name
    int model

    // concrete method
    def startEngine() {
        println("Starting engine for ${name}")
    }
    
    // abstract method
    abstract def topSpeed()
}


class Toyota extends Car {
    int speed
    // Implementing super class abstract method
    def topSpeed() {
        println("Top speed is $speed")
    }
}

println("123")