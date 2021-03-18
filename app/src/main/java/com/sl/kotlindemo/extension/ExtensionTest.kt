package com.sl.kotlindemo.extension

/**
 * fun receiverType.functionName(params){
 *   body
 *  }
 */
fun String.sl(name: String) {
    println("this is $this, sl name=>$name")
}

fun main() {
    var name = "Songlin"
    //this is Songlin, sl name=>====
    name.sl("====")
}