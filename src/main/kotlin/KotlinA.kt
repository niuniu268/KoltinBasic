class KotlinA(a : Int , b : Int) : KotlinB(a , b) {

    override var c : Int
        get() = super.c
        set(value) {}


    override fun printB() {
        println("$b")
        super.printB()
    }
}