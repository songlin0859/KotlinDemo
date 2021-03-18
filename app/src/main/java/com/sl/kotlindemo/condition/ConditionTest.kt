package com.sl.kotlindemo.condition

fun main() {
    var score = 90
//    var level:String
//    if (score > 80){
//        level = "dalao"
//    } else {
//        level = "caiji"
//    }

    var level = if (score > 80){
        "dalao"
    } else {
        "caiji"
    }

    println(level)

    when(score){
        //case
        90 -> println("is a dalao")
        //default
        else -> {
            println("is a caiji")
        }
    }
}