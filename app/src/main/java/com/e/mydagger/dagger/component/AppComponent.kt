package com.e.mydagger.dagger.component

import android.app.Application
import com.e.mydagger.App
import com.e.mydagger.dagger.module.AppModule
import com.e.mydagger.dagger.module.MainModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
//@Component(modules = [AndroidSupportInjectionModule::class])
interface AppComponent {

/*    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }*/

    fun inject(app: App)

    fun plus(mainModule: MainModule): MainComponent
}