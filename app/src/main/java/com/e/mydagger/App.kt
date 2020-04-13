package com.e.mydagger

import android.app.Application
import com.e.mydagger.dagger.AppComponent
import com.e.mydagger.dagger.AppModule
import com.e.mydagger.dagger.DaggerAppComponent

class App : Application() {

    val component: AppComponent by lazy {
        DaggerAppComponent
            .builder()
            .appModule(AppModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}
