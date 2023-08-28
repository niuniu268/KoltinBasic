fun main() {

    1..10
    for (c in 'a'..'z' step 2) {
        println(c)
    }


    (1..10).forEach() {
        it
        println(it)
    }

    val list : List<Int> = (1..10).toList()
    println(list.listIterator().next())
    println(list.listIterator().hasNext())

    for (i : IndexedValue<Int> in list.withIndex()) {
        println(i)
    }

    var a = 0
    do {
        a++
        println(a)
    } while (a < 10)

    (1..20).forEach {
        it
        if (it == 2) {
            return@forEach
        }
        println(it)
    }

    run b@{
        (1..20).forEach {
            it
            if (it == 2) {
                return@b
            }
            println(it)
        }
    }

    sum(1 , 2)

    println(5 sum2 4)

    println(sum3(2))

    val arr = arrayOf("a" , "b" , "c")
    sum4(*arr)

    val aa = A()
    B(2)
    C1(1 , 3)

}

fun sum(a : Int , b : Int) : Int = a + b

infix fun Int.sum2(b : Int) = this + b

fun sum3(a : Int , b : Int = 2) {
    b + a
}

fun sum4(vararg list : String) {
    list.forEach {
        println(it)
    }
}

class A() {
    var a = 1
        get() = 4
        set(value) {
            field = value + 1
        }


    fun print() {
        println("hello$a")
    }
}

class B constructor(val b : Int) {
    fun print() {
        println("hello $b")
    }
}

class C1(a : Int , var b : Int) {
    val e : Int

    init {
        e = a
    }

    fun print() {
        println("$b")
    }


}


class C2(a : Int , b : Int) {
    val e : Int

    init {
        e = a
    }

    fun print() {
        println("$e")
    }
}

