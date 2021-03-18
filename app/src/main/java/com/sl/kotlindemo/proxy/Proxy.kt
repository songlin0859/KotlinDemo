package com.sl.kotlindemo.proxy

interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() {
        println("x = $x")
    }
}

class Derived(b: Base) : Base by b {
}

fun main() {
    val b = BaseImpl(10)
    val derived = Derived(b)
    derived.print()
}