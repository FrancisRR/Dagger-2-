package com.example.dagger2ex.kotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger2ex.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var uiUtils: UiUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerComponentDagg.create().inject(this)


        Log.e("Message", uiUtils?.getString())
    }
}
