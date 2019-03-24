package com.francis.dagger2ex.kotlin

import android.app.Application

class AppController : Application() {


    override fun onCreate() {
        super.onCreate()
        instance = this
    }


    companion object {
        lateinit var instance: AppController
        val DaggerInjector = DaggerComponentDagg.builder().utilsModule(UtilsModule()).build()
    }


}