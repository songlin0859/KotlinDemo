package com.sl.kotlindemo.infixfun

class InfixFun(var size: String) {
    infix fun plus(size: String): String {
        return this.size + size
    }
}

fun main() {
    var infixFun = InfixFun("Chen")
    var result = infixFun plus "SL"
    //ChenSL
    println(result)
}