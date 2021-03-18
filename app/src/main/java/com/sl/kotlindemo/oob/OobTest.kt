package com.sl.kotlindemo.oob

//定义一个类
open class Person

//This type is final, so it cannot be inherited from
//类默认是final的 要可以被继承则要用open关键字
class Student(var score: Int) : Person()

class Teacher() : Person() {
    var salary: Float = 3000.0f
        //get
        //get() = field + 300
        get() {
            return field + 1
        }
        //private set
        //set(value) {
        //    field = value + 1
        //}
}

interface IStudy{
    fun study():Unit

    fun desc(){
        println("stu")
    }
}

class Xxx : IStudy{
    override fun study() {
        println("study")
    }

}