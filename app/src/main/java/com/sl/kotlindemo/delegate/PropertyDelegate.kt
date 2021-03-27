package com.sl.kotlindemo.delegate

import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()
}

/**
 * public final class Example {
    //拿到Example中p字段的属性
    // $FF: synthetic field
    static final KProperty[] $$delegatedProperties = new KProperty[]{
        (KProperty)Reflection.mutableProperty1(new MutablePropertyReference1Impl(Example.class, "p", "getP()Ljava/lang/String;", 0))};
    //p字段的实现代理
    @NotNull
    private final Delegate p$delegate = new Delegate();

    @NotNull
    public final String getP() {
        return this.p$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final void setP(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.p$delegate.setValue(this, $$delegatedProperties[0], var1);
    }
    }
 */

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

fun main() {
    var example = Example()
    println(example.p)
    example.p = "fdasgs"
}

