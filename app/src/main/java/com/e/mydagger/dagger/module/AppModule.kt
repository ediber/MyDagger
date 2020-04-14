package com.e.mydagger.dagger.module

import android.content.Context
import com.e.mydagger.App
import com.e.mydagger.dagger.data.AppObject
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val app: App) {
    @Provides
    @Singleton
    fun provideApp() = app

    @Provides
    fun provideAppObject(): AppObject = // some object to test dagger
        AppObject("typ0")
}