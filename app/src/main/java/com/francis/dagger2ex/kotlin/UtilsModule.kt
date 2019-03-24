package com.francis.dagger2ex.kotlin

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UtilsModule {

    @Provides
    @Singleton
    fun uiUtils() = UiUtils()

    @Provides
    @Singleton
    fun commonUtils() = CommonUtils()

}