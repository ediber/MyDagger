package com.e.mydagger.dagger.component

import com.e.mydagger.Bone
import com.e.mydagger.Dog
import com.e.mydagger.MainActivity
import com.e.mydagger.dagger.module.MainModule
import dagger.Provides
import dagger.Subcomponent
import javax.inject.Singleton

//@MainActivityScope
@Subcomponent(modules = arrayOf(MainModule::class))
//odules = arrayOf( DogModule:class, BoneModule:class, MainModule::class))
public interface  MainComponent {
    fun inject(actiity: MainActivity)


}