package com.sherryyuan.diexamples.dagger

import com.sherryyuan.diexamples.Door
import javax.inject.Inject

class DaggerHouse @Inject constructor(val door: Door)