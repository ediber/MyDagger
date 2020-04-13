package com.e.mydagger.dagger

import com.e.mydagger.App
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(app: App)

    fun plus(mainModule: MainModule): MainComponent
}