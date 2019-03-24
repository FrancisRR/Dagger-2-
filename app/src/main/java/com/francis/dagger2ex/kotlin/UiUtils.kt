package com.francis.dagger2ex.kotlin

import android.util.Log
import javax.inject.Inject


class UiUtils @Inject constructor() {


    fun getString() = "Francis"

    @Inject
    fun printString() {
        Log.e("Print string", "hai")
    }

}