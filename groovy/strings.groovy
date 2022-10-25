def vm_name = "Nam_e#O@!fMachineWerryLongName"
def lengthNeeded = "NameOfMachine".length()
def newName = vm_name.substring(0, Math.min(lengthNeeded, 10))

def replacedName = newName.replaceAll('[_!@#]', "")

