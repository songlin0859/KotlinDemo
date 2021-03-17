package com.sl.kotlindemo.helloworld

///**
// * main 无参也可
// */
//fun main(){
//    println("hello world !")
//}

/**
 * 有参main方法
 */
fun main(array: Array<String>) {
    println("hello world !")
    println("-------------")
    println("array's size = ${array.size}")
    array.forEach {
        println(it)
    }
    println("-------------")
}