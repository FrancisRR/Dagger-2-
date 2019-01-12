package com.example.daggerex.kotlin

import dagger.Component


@Component
open interface ComponentDagg {

    fun inject(activity: MainActivity)
}