def execute(Closure body, def a,b,c) {
    body(a, b, c)
}


def step = { 
    a, b, c ->
    println(a)
    println(b)
    println(c)
}

execute(step, 1,2,3) 