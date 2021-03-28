import com.sl.kotlindemo.delegate.User
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

//package com.sl.kotlindemo.flow
//
//import kotlinx.coroutines.GlobalScope
//import kotlinx.coroutines.delay
//import kotlinx.coroutines.launch
//
//fun main() {
//    println("start...")
//    GlobalScope.launch { // 在后台启动一个新的协程并继续
//        delay(1000L) // 非阻塞的等待 1 秒钟（默认时间单位是毫秒）
//        println("World!") // 在延迟后打印输出
//    }
//    println("Hello,") // 协程已在等待时主线程还在继续
//    Thread.sleep(2000L) // 阻塞主线程 2 秒钟来保证 JVM 存活
//    println("end...")
//}

//import kotlinx.coroutines.*
//
//fun main() = runBlocking { // this: CoroutineScope
//    launch { // 在 runBlocking 作用域中启动一个新协程
//        delay(1000L)
//        println("World!")
//    }
//    println("Hello,")
//}

fun main() = runBlocking<Unit> {
    println("1111${Thread.currentThread().name}")
    val time = measureTimeMillis {
        val one = async { doSomethingUsefulOne() }
        val two = async { doSomethingUsefulTwo() }
        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")
}

suspend fun doSomethingUsefulOne(): Int {
    println("2222${Thread.currentThread().name}")
    delay(1000L) // 假设我们在这里做了些有用的事
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    println("3333${Thread.currentThread().name}")
    delay(1000L) // 假设我们在这里也做了一些有用的事
    return 29
}

//fun main() = runBlocking<Unit> {
//    println("0 ${Thread.currentThread().name}")
//    GlobalScope.launch {
//        println("1 ${Thread.currentThread().name}")
//        val xxx = withContext(Dispatchers.IO) {
//            println("2 ${Thread.currentThread().name}")
//            User()
//        }
//
//        withContext(Dispatchers.IO) {
//            println("4 ${Thread.currentThread().name}")
//            println(xxx.name)
//        }
//    }
//
//    delay(5000)
//}