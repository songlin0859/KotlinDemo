package com.sl.kotlindemo.delegate

/**
 * 接口
 */
interface Person {
    val desc: String
    fun say()
}

/**
 * 接口的实现类
 */
class Student : Person {
    override val desc: String = "student"

    override fun say() {
        println("say $desc")
    }

}

/**
 * 代理类  代理类也和 by 后的实例 继承子相同的接口
 */
//class DelegateClz : Person by Student(){
//    override val desc: String
//        get() = "DelegateClz"
//
//    override fun say() {
//        println("DelegateClz say")
//    }
//}

/**
 * public final class DelegateClz implements Person {
    // $FF: synthetic field
    private final Student $$delegate_0 = new Student();

    @NotNull
    public String getDesc() {
    return "DelegateClz";
    }

    public void say() {
    String var1 = "DelegateClz say";
    boolean var2 = false;
    System.out.println(var1);
    }
    }
 */

class DelegateClz : Person by Student()

/**
 * 如果代理类复写了接口的方法 那就使用复写的方法 否则使用代理实现类的方法
 *
 * public final class DelegateClz implements Person {
    // $FF: synthetic field
    private final Student $$delegate_0 = new Student();

    @NotNull
    public String getDesc() {
    return this.$$delegate_0.getDesc();
    }

    public void say() {
    this.$$delegate_0.say();
    }
    }
 */


fun main() {
    val  delegateClz = DelegateClz()
    println(delegateClz.desc)
    delegateClz.say()
}