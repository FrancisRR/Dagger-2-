package com.example.dagger2ex.kotlin

import dagger.Component


@Component
open interface ComponentDagg {

    fun inject(activity: MainActivity)
}