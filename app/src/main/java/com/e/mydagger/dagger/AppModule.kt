package com.e.mydagger.dagger

import android.content.Context
import com.e.mydagger.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val app: App) {
    @Provides
    @Singleton
    fun provideApp() = app
}