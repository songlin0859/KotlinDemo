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
