package com.e.mydagger.dagger.component

import com.e.mydagger.MainActivity
import com.e.mydagger.dagger.module.MainModule
import dagger.Subcomponent

//@MainActivityScope
@Subcomponent(modules = arrayOf(MainModule::class))
//odules = arrayOf( DogModule:class, BoneModule:class, MainModule::class))
public interface  MainComponent {
    fun inject(activity: MainActivity)


}