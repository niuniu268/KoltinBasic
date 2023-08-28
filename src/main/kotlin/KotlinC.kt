fun main()
{
}


abstract class KotlinC
{
    abstract fun a()
}

class KotlinD : KotlinC()
{
    override fun a()
    {
        TODO("Not yet implemented")
    }
}

class Parent: FaceA{

    override fun testInterface()
    {
        super.testInterface()
    }
    override val a = 1

    inner class Child{
        fun test(){
            println(this@Parent.a)
        }
    }
    class Child2{
        fun test(){

        }
    }
}

interface FaceA {
    val a:Int
    fun testInterface(){
        println("$a")
    }
}