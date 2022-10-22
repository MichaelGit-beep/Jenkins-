// public: Public declared items can be accessed everywhere.

// protected: Protected limits access to inherited and parent classes (and to the class that defines the item).

// private: Private limits visibility only to the class that defines the item.

// static: A static variable exists only in a local function scope, but it does not lose its value when program execution leaves this scope.

// final: Final keywords prevents child classes from overriding a method by prefixing the definition with final. If the class itself is being defined final then it cannot be extended.

def summ(int a, int b, int c = 20) {
    return a + b + c
}

class Method2 {

    def x = 1;
    def y = 3;

    def myMethod() {
        println("Inside method x is ${x} y is ${y}")
    }

    def incX(int a) {
        x += a
    }
}


def a = Method2.newInstance()
def b = new Method2()

a.myMethod()
a.incX(20)
a.incX(20)
a.myMethod()
b.myMethod()

IP = "222\n\n\n\n"
println(IP.trim())