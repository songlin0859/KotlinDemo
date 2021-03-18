package com.sl.kotlindemo.loop

fun main() {
    var sum = 0
    for (i in 1..100 step 1){
        sum += i
    }
    println("sum = $sum")

    var sum1 = 0
    var max = 100
    while (max > 0){
        sum1 += max
        max --
    }
    println("sum1 = $sum1")

    do {
        println("do while")
    }while (false)

    //return
    //break
    //continue
}