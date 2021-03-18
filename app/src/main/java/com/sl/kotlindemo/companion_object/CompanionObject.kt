package com.sl.kotlindemo.companion_object

/**
 * 定义单例
 */
object SingleTon{
    var name = "songlin"
}

fun main() {
    var v1 = SingleTon
    var v2 = SingleTon
    var v3 = SingleTon

    //com.sl.kotlindemo.companion_object.SingleTon@6d6f6e28
    //com.sl.kotlindemo.companion_object.SingleTon@6d6f6e28
    //com.sl.kotlindemo.companion_object.SingleTon@6d6f6e28
    println(v1)
    println(v1)
    println(v1)

    println(CompanionObject.TAG)
}

class CompanionObject {
    companion object{
        val TAG = "CompanionObject"
    }
}