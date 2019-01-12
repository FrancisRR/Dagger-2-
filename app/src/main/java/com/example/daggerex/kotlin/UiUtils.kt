package com.example.daggerex.kotlin

import android.util.Log
import javax.inject.Inject


open class UiUtils @Inject constructor() {


    fun getString() = "Francis"

    @Inject
    fun printString() {
        Log.e("Print string", "hai")
    }

}