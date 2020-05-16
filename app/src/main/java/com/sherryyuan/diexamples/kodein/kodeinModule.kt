package com.sherryyuan.diexamples.kodein

import com.sherryyuan.diexamples.Door
import com.sherryyuan.diexamples.DoorImpl
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.provider

val kodeinModule = Kodein.Module(name = "kodeinModule") {

    bind<KodeinHouse>() with provider { KodeinHouse() }

    bind<Door>() with provider { DoorImpl() }
}