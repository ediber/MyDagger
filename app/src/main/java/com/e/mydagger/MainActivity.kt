package com.e.mydagger

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.e.mydagger.dagger.data.Warrior
import com.e.mydagger.dagger.data.Warrior2
import com.e.mydagger.dagger.module.MainModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var app: App
    val component by lazy {
        app.component.plus(
            MainModule(
                this
            )
        )
    }

//    @Inject
//    var dog: Dog? = null

    @Inject
    lateinit var warrior: Warrior

    @Inject
    lateinit var warrior2: Warrior2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        app = application as App
        component.inject(this)

//        Toast.makeText(applicationContext, warrior.name, Toast.LENGTH_LONG).show()

        Toast.makeText(applicationContext, warrior2.horse.name, Toast.LENGTH_LONG).show()



    }
}
