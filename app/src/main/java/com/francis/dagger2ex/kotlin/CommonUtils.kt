package com.francis.dagger2ex.kotlin

import javax.inject.Inject

class CommonUtils @Inject constructor() {

    val name: String
        get() = "CommonUtils"

}