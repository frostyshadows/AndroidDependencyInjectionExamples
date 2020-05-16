package com.sherryyuan.diexamples.dagger

import com.sherryyuan.diexamples.Door
import com.sherryyuan.diexamples.DoorImpl
import dagger.Module
import dagger.Provides

@Module
class DaggerModule {

    @Provides
    fun providesHouse(door: Door): DaggerHouse = DaggerHouse(door)

    @Provides
    fun providesDoor() : Door = DoorImpl()
}