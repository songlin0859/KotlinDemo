package com.sl.kotlindemo.koin

import org.koin.dsl.module.module
import org.koin.experimental.builder.scope

val myModule = module {
    factory {
        User()
    }
}

val singleModlue = module {
    single {
        Address()
    }
}

val scopeModule = module {
    scope("myScope"){
        ScopeData()
    }
}