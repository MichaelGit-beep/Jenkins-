interface Car {
    def startEngine()
    def stopEngine()
}


class Toyota implements Car {
    def startEngine() {
        println("Starting the Toyota engine...")
    }

    def stopEngine() {
        println("Stopping the Toyota engine")
    }
}

Toyota prius = new Toyota()
prius.startEngine()