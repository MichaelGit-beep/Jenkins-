def text = """
team1 project1
team2 project2
team3 project1
"""

def matches = text =~ /(team\d project\d)/
def recombined = [:]

for (def i in matches.findAll()) {
    def tmp = i[0].split()
    def team = tmp[0]
    def proj = tmp[1]
    
}

println(recombined)