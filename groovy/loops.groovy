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