package com.sl.kotlindemo.koans

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

class MyClass {
    private var name = "xiao"
    private var age = 18

    internal fun getRandom(): Int{
        return Random.nextInt(0,10)
    }

    override fun toString(): String {
        return "name = $name, age = $age"
    }
}

fun main() {
    //var kClass = MyClass::class.java
    //var constructors = kClass.constructors

    //var myClz = kClass.newInstance()
    var myClz = ::MyClass.invoke()

    println(myClz)

    var getRandom = MyClass::getRandom
    println(getRandom)

    var invoke = getRandom.invoke(myClz)
    println(invoke)

}