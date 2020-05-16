package com.sherryyuan.diexamples.koin

import com.sherryyuan.diexamples.Door
import org.koin.core.KoinComponent
import org.koin.core.inject

class KoinHouse : KoinComponent {

    val door by inject<Door>()
}