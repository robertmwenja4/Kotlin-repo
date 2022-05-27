fun main(args: Array<String>) {
    var name = "Robert"
    var personObj = Person()
    println(personObj.displayName(name))
    var obj = AnotherPerson()
    obj.anotherName = "Wambo"
    println(obj.display(obj.name, obj.anotherName))
}

class Person {
    fun displayName(name: String){
        println("The name is: " + name)
    }
}
class AnotherPerson{
    var name = "Beaty"
    var anotherName: String = ""
    fun display(name: String, anotherName: String){
        println(name + anotherName)
        println()
    }
}