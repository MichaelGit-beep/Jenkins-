class Animal {
    
    String type = ""
    String origin = ""

    def whoami() {
        if (type == "") {
            println("I stil no one")
            return
        }
        println("I am a ${type}")
    }

    def whereifrom() {
        if (type == "") {
            println("I have no home")
            return
        }
        println("I am from ${origin}")
    }
}


class Pet extends Animal {
        def whoami() {
        println("Ta-da Polymorphism")
    }
}

def an1 = new Pet()
an1.whoami()