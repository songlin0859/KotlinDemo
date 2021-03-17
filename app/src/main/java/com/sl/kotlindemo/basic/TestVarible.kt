package com.sl.kotlindemo.basic

fun main() {
//    var name:String = "sl"
//    val age:Int = 30

    //可以类型推断
    var name = "sl"
    val age = 30
    var user: User? = null
    lateInitUser = User("lateInitUser")

    println("name = $name, age = $age")

    //注释
    /*注释*/
    /**
     * 注释
     */
}

lateinit var lateInitUser: User