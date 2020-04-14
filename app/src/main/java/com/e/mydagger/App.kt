package com.e.mydagger

import android.app.Application
import com.e.mydagger.dagger.component.AppComponent
import com.e.mydagger.dagger.module.AppModule
import com.e.mydagger.dagger.component.DaggerAppComponent
import com.e.mydagger.dagger.data.AppObject
import com.e.mydagger.dagger.data.Warrior
import javax.inject.Inject

class App : Application() {

    val component: AppComponent by lazy {
        DaggerAppComponent
            .builder()
            .appModule(AppModule(this))
            .build()
    }

    @Inject
    lateinit var appObject: AppObject

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}
