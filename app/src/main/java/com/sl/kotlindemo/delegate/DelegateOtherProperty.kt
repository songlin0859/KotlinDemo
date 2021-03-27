package com.sl.kotlindemo.delegate

class MyClass {
    var newName: Int = 0
    @Deprecated("Use 'newName' instead", ReplaceWith("newName"))

    /**
     * oldName 通过 newName代理
     */
    var oldName: Int by this::newName
}

//final class MyClass$oldName$2 extends MutablePropertyReference0Impl {
//    MyClass$oldName$2(MyClass var1) {
//        super(var1, MyClass.class, "newName", "getNewName()I", 0);
//    }
//
//    @Nullable
//    public Object get() {
//        return ((MyClass)this.receiver).getNewName();
//    }
//
//    public void set(@Nullable Object value) {
//        ((MyClass)this.receiver).setNewName(((Number)value).intValue());
//    }
//}

//public final class MyClass {
//    private int newName;
//    /** @deprecated */
//    @NotNull
//    private final MyClass$oldName$2 oldName$delegate = new MyClass$oldName$2((MyClass)this);
//
//    public final int getNewName() {
//        return this.newName;
//    }
//
//    public final void setNewName(int var1) {
//        this.newName = var1;
//    }
//
//
//    /** @deprecated */
//    public final int getOldName() {
//        KProperty0 var1 = (KProperty0)this.oldName$delegate;
//        return ((Number)var1.get()).intValue();
//    }
//
//    /** @deprecated */
//    public final void setOldName(int var1) {
//        KMutableProperty0 var2 = this.oldName$delegate;
//        var2.set(var5);
//    }
//}

fun main() {
    val myClass = MyClass()
    println(myClass.newName) // 42
    // 通知：'oldName: Int' is deprecated.
    // Use 'newName' instead
    myClass.oldName = 42
    println(myClass.newName) // 42
}