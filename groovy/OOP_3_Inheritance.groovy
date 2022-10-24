class Animal {
    
    String type = "XXX"
    String origin = "XXX"

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


class Pet extends Animal {}

def an1 = new Pet(type: "Dog")
an1.whoami()
an1.whereifrom()