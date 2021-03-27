package com.sl.kotlindemo.delegate

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("name init") {
            prop, old, new ->
        println("${prop.name}:$old -> $new")
    }
}

/**
 * public final class User$$special$$inlined$observable$1 extends ObservableProperty {
// $FF: synthetic field
final Object $initialValue;

public User$$special$$inlined$observable$1(Object $captured_local_variable$1, Object $super_call_param$2) {
super($super_call_param$2);
this.$initialValue = $captured_local_variable$1;
}

protected void afterChange(@NotNull KProperty property, Object oldValue, Object newValue) {
Intrinsics.checkNotNullParameter(property, "property");
String var4 = (String)newValue;
String old = (String)oldValue;
int var7 = false;
String var8 = property.getName() + ':' + old + " -> " + var4;
boolean var9 = false;
System.out.println(var8);
}
}
 */

fun main() {
    val user = User()
    user.name = "first"
    user.name = "second"
}