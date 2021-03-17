package com.sl.kotlindemo.basic

class User(var name: String) {
    override fun equals(other: Any?): Boolean {
        return (other is User) && name == other.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}

fun main(){
    val user = User("sl")
    println(user.name)
}