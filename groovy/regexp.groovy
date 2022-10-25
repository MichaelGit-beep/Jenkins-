// ~string (pattern operator)
// =~ (find operator)
// ==~ (exact match operator)

def text = "Lorem ipsum dolor sit amet"
// Find all
def match = text =~ /\w+t\b/

if (match) {
    for (def word in match) {
        println(word)
    }
}
// Find all matches on matcher object
println(match.findAll())
println([1,2,3, false, null].findAll())
println(null.findAll())


println("Fersion increment")

def version = "v3.5.23"
def patern = /^v(\d{1,2})\.(\d{1,2})\.(\d{1,2})$/
def newVersion = version.replaceFirst(patern) { full, major, minor, build -> "${full[0]}${major}.${(minor as int) + 1}.0" }
println(newVersion)