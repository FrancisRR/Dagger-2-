package com.francis.dagger2ex.kotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.francis.dagger2ex.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var uiUtils: UiUtils
    @Inject
    lateinit var commonUtils: CommonUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppController.DaggerInjector.inject(this)



        Log.e("Message", uiUtils.getString())
        Log.e("Message", commonUtils.name)
    }
}
