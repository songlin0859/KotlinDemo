package com.sl.kotlindemo.delegate

fun example(computeFoo: () -> String) {
    val memoizedFoo by lazy(computeFoo)
    println(memoizedFoo)
}

fun main() {
    example{
        "Chen"
    }
}