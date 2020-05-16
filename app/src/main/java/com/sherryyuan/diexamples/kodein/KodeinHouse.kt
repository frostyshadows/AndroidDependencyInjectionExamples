package com.sherryyuan.diexamples.kodein

import com.sherryyuan.diexamples.Door
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.instance

class KodeinHouse : KodeinAware {

    override val kodein = Kodein {
        import(kodeinModule)
    }

    val door by instance<Door>()
}