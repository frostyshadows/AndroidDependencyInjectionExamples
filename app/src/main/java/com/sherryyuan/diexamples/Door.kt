package com.sherryyuan.diexamples

import android.util.Log

interface Door {
    fun open()
}

class DoorImpl : Door {

    override fun open() {
        Log.println(Log.VERBOSE, null, "Opening door")
    }
}