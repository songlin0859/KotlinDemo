package com.sl.kotlindemo.basic

fun main(){
    val user1 = User("user")
    val user2 = User("user")
    val user3 = user1

    println("user1 == user2 ${user1 == user2}")
    println("user1 === user2 ${user1 === user2}")
    println("---------------")
    println("user1 == user3 ${user1 == user3}")
    println("user1 === user3 ${user1 === user3}")
    println("---------------")
    println("user2 == user3 ${user2 == user3}")
    println("user2 === user3 ${user2 === user3}")
}