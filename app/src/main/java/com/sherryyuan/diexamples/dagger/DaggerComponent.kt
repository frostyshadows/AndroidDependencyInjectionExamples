package com.sherryyuan.diexamples.dagger

import com.sherryyuan.diexamples.Door
import com.sherryyuan.diexamples.MainApplication
import dagger.Component

@Component(modules = [DaggerModule::class])
interface DaggerComponent {

    fun house(): DaggerHouse

    fun door(): Door

    fun inject(mainApplication: MainApplication)
}