// define closure
def myClosure1 = { println("Closure1") }
// Call 
myClosure1.call()
myClosure1()

// Closure with parameters and global variables
def gVar = "Global"
def paramsClosure1 = { name -> println("paramsClosure1 Param: ${name}, global var: ${gVar}") }
paramsClosure1("haha")

// Closure with multiple parameters 
def multiParamClosure1 = { 
    p1,p2,p3 -> 
    println("Param1: ${p1} Param2: ${p2} Param3: ${p3}") 
}
multiParamClosure1("1", [b: 123, c: 234], true)


// Pass closure as method parameter
def myMethod(clos) { 
    clos.call("Groovy")
}

def costumClosure = { message -> println("costumClosure ${message}")}

myMethod(costumClosure)

// each and eachWithIndex are methods to iterate over collections.
// each have it(default iterator) and eachWithIndex have it,index(default iterator, default index).
def list1 = [1, 2, 3, 4, 999]

list1.eachWithIndex { val, index ->
    print("Index: ")
    println(index)
    print("Val: ")
    println(val)
}

print("Trying to find an item 999 within the list")
println(list1.find { item -> 
    item == 999
})

// Maps
def map1 = [
    city: "ny",
    population: 65535,
]
// Access to map keys and values with each method: $it.key = Color Name: $it.value"
// By default there will be "it" object available with key and value properties, 
// but you can override this with "key, value ->" or any other work pait
map1.each {
    print("key: ")
    println(it.key)
    print("value: ")
    println(it.value)
}