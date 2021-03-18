package com.sl.kotlindemo.data_sealed

/**
 * data
 */
data class User(var name:String, var age: Int)

fun main() {
    var user = User("SL", 30)
    //解构 componentN()
    val (name, age) = user
    //name = SL, age = 30
    println("name = $name, age = $age")
}
/**
 * 密封类用来表示受限的类继承结构：
 * 当一个值为有限几种的类型, 而不能有任何其他类型时。在某种意义上，他们是枚举类的扩展：
 * 枚举类型的值集合 也是受限的，但每个枚举常量只存在一个实例，
 * 而密封类 的一个子类可以有可包含状态的多个实例。
 */

// TODO: 2021/3/18

/**
 * 枚举
 */
enum class Color{
    RED,BLACK,BLUE,GREEN,WHITE
}