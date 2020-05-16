package com.sherryyuan.diexamples.koin

import com.sherryyuan.diexamples.Door
import com.sherryyuan.diexamples.DoorImpl
import org.koin.dsl.module

val koinModule = module {

    factory { KoinHouse() }

    factory { DoorImpl() as Door }
}