package com.e.mydagger.dagger

import com.e.mydagger.MainActivity
import dagger.Subcomponent
import javax.inject.Singleton

@Singleton
@Subcomponent(modules = arrayOf(MainModule::class))
public interface  MainComponent {
    fun inject(actiity: MainActivity)


}