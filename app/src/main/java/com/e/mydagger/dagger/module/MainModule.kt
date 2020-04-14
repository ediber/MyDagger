package com.e.mydagger.dagger.module

import com.e.mydagger.MainActivity
import com.e.mydagger.dagger.data.Horse
import com.e.mydagger.dagger.data.Warrior
import com.e.mydagger.dagger.data.Warrior2
import dagger.Module
import dagger.Provides

@Module
class MainModule(val activity: MainActivity) {

    @Provides
   // @MainActivityScope
    fun provideWarrior(): Warrior =
        Warrior("Hercules", "Sword")

    @Provides
    fun provideHorse(): Horse =
        Horse("itsik")

    @Provides
    fun provideWarrior2(horse: Horse): Warrior2 =
        Warrior2("Hercules", "Sword", horse)
}