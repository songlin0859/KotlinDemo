package com.sl.kotlindemo.delegate

val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}

/**
 * public actual fun <T> lazy(initializer: () -> T): Lazy<T> = SynchronizedLazyImpl(initializer)
 *
 * 接收一个 initializer: () -> T类型的lambda表达式 返回值是Lazy<T> 其实就是SynchronizedLazyImpl(initializer)
 *
 *
 * private class SynchronizedLazyImpl<out T>(initializer: () -> T, lock: Any? = null) : Lazy<T>, Serializable {
    private var initializer: (() -> T)? = initializer
    @Volatile private var _value: Any? = UNINITIALIZED_VALUE
    private val lock = lock ?: this

    override val value: T
    get() {
        val _v1 = _value
        if (_v1 !== UNINITIALIZED_VALUE) {
        @Suppress("UNCHECKED_CAST")
        return _v1 as T
    }

    return synchronized(lock) {
        val _v2 = _value
        if (_v2 !== UNINITIALIZED_VALUE) {
            @Suppress("UNCHECKED_CAST") (_v2 as T)
            } else {
            // --------------------------
            val typedValue = initializer!!()
            _value = typedValue
            initializer = null
            typedValue
            }
        }
    }
 */

fun main() {
    println(lazyValue)
    println(lazyValue)
}

//class User {
//    var name: String by Delegates.observable("<no name>") {
//            prop, old, new ->
//        println("${prop.name}:$old -> $new")
//    }
//}
//
//fun main() {
//    val user = User()
//    user.name = "first"
//    user.name = "second"
//}


//class MyClass {
//    var newName: Int = 0
//    @Deprecated("Use 'newName' instead", ReplaceWith("newName"))
//    var oldName: Int by this::newName
//}
//
//fun main() {
//    val myClass = MyClass()
//    println(myClass.newName) // 42
//    // 通知：'oldName: Int' is deprecated.
//    // Use 'newName' instead
//    myClass.oldName = 42
//    println(myClass.newName) // 42
//}


//class User(val map: Map<String, Any?>) {
//    val name: String by map
//    val age: Int     by map
//}
//
//fun main() {
//    val user = User(mapOf(
//        "name" to "John Doe",
//        "age"  to 25
//    ))
//    println(user.name) // Prints "John Doe"
//    println(user.age)  // Prints 25
//}


//fun example(computeFoo: () -> String) {
//    val memoizedFoo by lazy(computeFoo)
//    println(memoizedFoo)
//}
//
//fun main() {
//    example{
//        "Chen"
//    }
//}