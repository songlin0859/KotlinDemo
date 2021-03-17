package com.sl.kotlindemo.basic

fun main(){
    //报错
    //var age: Int = null
    //ok
    var size: Int? = null

    println(size ?: 0)
    size = 100
    println(size ?: 0)
}