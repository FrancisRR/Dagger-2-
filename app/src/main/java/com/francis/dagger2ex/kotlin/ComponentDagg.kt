package com.francis.dagger2ex.kotlin

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UtilsModule::class])
interface ComponentDagg {
    fun inject(activity: MainActivity)
}