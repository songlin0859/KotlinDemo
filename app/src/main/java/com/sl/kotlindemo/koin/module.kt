package com.sl.kotlindemo.koin

import org.koin.dsl.module.module

val myModule = module {
    factory {
        User()
    }
}