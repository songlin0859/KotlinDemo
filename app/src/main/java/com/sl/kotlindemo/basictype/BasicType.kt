package com.sl.kotlindemo.basictype

fun main() {
    var int: Int = 0
    var float: Float = 1.0f
    var long: Long = 1L
    var double: Double = 0.2
    var btye: Byte = 1
    var short: Short = 1

    //都继承自 Number 没有自动类型转换
    //比如不能给Long赋值一个Int类型
    //long = int
    // 不过都有toXXX方法
    long = int.toLong()

    var char: Char = 'c'
    var string: String = "str"

    var boolean: Boolean = true

    var array: Array<Int> = arrayOf(1,2,3)
    array.forEach {
        print(it)
    }

}