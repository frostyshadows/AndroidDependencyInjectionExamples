package com.sherryyuan.diexamples

import android.app.Application
import com.sherryyuan.diexamples.dagger.DaggerDaggerComponent
import com.sherryyuan.diexamples.dagger.DaggerHouse
import com.sherryyuan.diexamples.kodein.KodeinHouse
import com.sherryyuan.diexamples.kodein.kodeinModule
import com.sherryyuan.diexamples.koin.KoinHouse
import com.sherryyuan.diexamples.koin.koinModule
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.instance
import org.koin.core.KoinComponent
import org.koin.core.context.startKoin
import org.koin.core.inject
import javax.inject.Inject

class MainApplication : Application(), KoinComponent, KodeinAware {

    override val kodein = Kodein {
        import(kodeinModule)
    }

    lateinit var house: House

    @Inject
    lateinit var daggerHouse: DaggerHouse

    val koinHouse by inject<KoinHouse>()

    val kodeinHouse by instance<KodeinHouse>()

    override fun onCreate() {
        super.onCreate()

        house = House()
        house.door.open()

        DaggerDaggerComponent.create().inject(this)
        daggerHouse.door.open()

        startKoin {
            modules(koinModule)
        }
        koinHouse.door.open()

        kodeinHouse.door.open()
    }
}
