package com.sl.kotlindemo.basic

fun testFun(x: Int):Int{
    return x +1
}

fun testVarArg(name:String, vararg x:Int, y:Float): Unit {
    println("name = $name, x= $x, y = $y")
}

//fun main(){
//    //The floating-point literal does not conform to the expected type Int
//    testVarArg("sl", 1,2,3,4,5,1.0f)
//}