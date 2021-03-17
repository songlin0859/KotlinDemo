package com.sl.kotlindemo.basic

fun main(){
    val usr = "user"
    //类型判断
//    if (usr is User){
//
//    }

    //类型转换 直接用as 类型不对时会直接报错 java.lang.ClassCastException
    //var user: User = usr as User

    //用as? 如果类型不对 就会给null
    var user: User? = usr as? User
    //输出null
    println(user)
}