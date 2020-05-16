package com.sherryyuan.diexamples

import android.util.Log

private const val TAG = "DoorImpl"

interface Door {
    fun open()
}

class DoorImpl : Door {

    override fun open() {
        Log.d(TAG, "Opening door")
    }
}