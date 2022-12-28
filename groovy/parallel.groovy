def tasks = [
    a : { 
            node("dslave") {
                sh "echo 123"
            } 
    },
    b : {
            node("dslave") {
                sh "echo 232"
            } 
    }
]

tasks << [
    c: {
        node("dslave") {
            sh "echo 333"
        } 
    } 
]
tasks.d = {
        node("dslave") {
            sh "echo 4444"
        } 
}

tasks["e"] = {
        node("dslave") {
            sh "echo 4444"
        } 
}


parallel(tasks)
