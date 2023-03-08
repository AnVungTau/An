import jdk.internal.org.objectweb.asm.tree.analysis.Value

class cat(
    name: String,
    weight: String,
    var color: String

): Animal(name, weight){

    override fun printInfo() {
        super.printInfo()
        println("Cat printInfo")
    }

    override var weight: String = ""
        get() = "Cat $weight"
        set(value) {
            field = "Cat $value"
        }
}
