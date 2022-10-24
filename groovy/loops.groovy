/* groovylint-disable NoDef, VariableTypeRequired */
def i = 0
while (i < 5) {
    i++
    if (i % 2 == 0) {
        continue
    }
    println(i)
}

def d = [11, 12, 13, "14"]
println("Size: ${d.size()}")

for (def n in d) {
    println("n element in d array is : ${i}")
}

switch(i) {
    case 0:
    println("i is 0")
    case 4:
    println("i is 4")
    default:
    println("default")
}

Map abcd = [
    "a": 255,
    "b": 65535,
    "c": 16777215,
    "d": 4294967295
]

abcd.each {  
    println("key: $it.key value: $it.value")
    if (it.key == "a") {
        println("a")
    } else if (it.key == "b") {
        println("a")
    } else if (it.key == "c") {
        println("c")
    } else {
        println("else")
    }
}