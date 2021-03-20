### KotlinDemo
> 网络不好 直接Android Studio开搞

[kotlincn](http://www.kotlincn.net/docs/reference/)

### HelloWorld
```kotlin
///**
// * main 无参也可
// */
//fun main(){
//    println("hello world !")
//}

/**
 * 有参main方法
 */
fun main(array: Array<String>) {
    println("hello world !")
    println("-------------")
    println("array's size = ${array.size}")
    array.forEach {
        println(it)
    }
    println("-------------")
}
```

### 基础语法
1. 包声明 `package com.sl.kotlindemo.helloworld` 放在文件的开头
    和java不同 包名可以和文件路基不一样(Java过来的还是喜欢搞一样)

2. 函数定义
fun 函数名(参数1: 参数类型1, ...): 函数返回值（没有就算Unit，Unit可以省略）{ 函数体 } 
```kotlin
fun testFun(x: Int):Int{
    return x +1
}
```
*vararg* 可变参数 *vararg*最好是放是函数的最后一个参数 不然后面的参数没法传
```kotlin
fun testVarArg(name:String, vararg x:Int, y:Float): Unit {
    println("name = $name, x= $x, y = $y")
}

fun main(){
    //1.0f 报错
    //The floating-point literal does not conform to the expected type Int
    testVarArg("sl", 1,2,3,4,5,1.0f)
}
```
函数可以有默认参数
```kotlin
fun f(name:String = "sl", age:Int = 33){
    println("name is $name, age is $age")
}

fun main(){
    f()
    f(age = 3)
    f(name = "csl")
    f(name = "dfas", age = 54564)
}
```
3. 语句不需要以分号结尾 新建一个对象不需要用`new`关键字
```kotlin
class User(var name: String) {
}

fun main(){
    val user = User("sl");
    println(user.name)
}
```
4. 变量定义
`var/val 变量名: 变量类型 = 变量值`
如果是可以为空的类型 在变量类型后面加问号（`?`）
```kotlin
//可以类型推断
    var name = "sl"
    val age = 30
    val user: User? = null
```
如果不想初始赋值null 但是后面自己可能会在使用之前就会赋值的 用`lateinit var`
```kotlin
lateinit var lateInitUser: User
```
5. 注释
```kotlin
    //注释
    /*注释*/
    /**
     * 注释
     */
```
6. 字符串模板
```kotlin
val name = "sl"
val desc = "my name is $name"
val desc1 = "my name is ${name.toUpperCase}"
```
7. NULL检查机制
如果一个变量的类型后面没有问好（`?`）则不能赋null值 否则会报错
`?:` 相当于Java中的三目运算
```kotlin
fun main(){
    //报错
    //var age: Int = null
    //ok
    var size: Int? = null
    //下面代码输出 0 100
    println(size ?: 0)
    size = 100
    println(size ?: 0)
}
```
8. 类型转换 `as`
```kotlin
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
```
9. `==` `===`
== 相当与Java中的equals === 相当与Java中的==
```kotlin
class User(var name: String) {
    override fun equals(other: Any?): Boolean {
        return (other is User) && name == other.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}

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
```
输出内容
```
user1 == user2 true
user1 === user2 false
---------------
user1 == user3 true
user1 === user3 true
---------------
user2 == user3 true
user2 === user3 false
```


### 基本数据类型
```kotlin
fun main() {
    var int: Int = 0
    var float: Float = 1.0f
    var long: Long = 1L
    var double: Double = 0.2
    var btye: Byte = 1
    var short: Short = 1

    //都继承自 Number 没有自动类型转换
    //比如不能给Long赋值一个Int类型
    //long = int
    // 不过都有toXXX方法
    long = int.toLong()

    var char: Char = 'c'
    var string: String = "str"

    var boolean: Boolean = true

    var array: Array<Int> = arrayOf(1,2,3)
    array.forEach {
        print(it)
    }

}
```
### 循环/条件

### 类和对象

### 扩展

### 委托

### 携程

### 契约

### 反射

### infix fun 中缀函数
```kotlin
package com.sl.kotlindemo

class InfixFun(var size: String) {
    infix fun plus(size: String): String {
        return this.size + size
    }
}

fun main() {
    var infixFun = InfixFun("Chen")
    var result = infixFun plus "SL"
    //ChenSL
    println(result)
}
```

### koin Kotlin Inject