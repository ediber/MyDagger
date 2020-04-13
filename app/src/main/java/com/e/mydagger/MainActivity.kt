package com.e.mydagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.e.mydagger.dagger.MainModule

class MainActivity : AppCompatActivity() {

    val app = application as App
    val component by lazy { app.component.plus(MainModule(this)) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        component.inject(this)

    }
}
