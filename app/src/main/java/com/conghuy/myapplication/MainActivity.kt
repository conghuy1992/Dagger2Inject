package com.conghuy.myapplication

import android.os.Bundle
import android.util.Log
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.conghuy.myapplication.dagger.DataManager
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private var TAG = "MainActivity"
    @Inject
    lateinit var dataManager: DataManager
    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as MyApplication)._ApplicationComponent.inject(this)
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
//        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

//        (applicationContext as MyApplication).dataManager._DBHelper.getAll()
//        Log.d(TAG,"pref:${(applicationContext as MyApplication).dataManager._PrefManager.hasData()}")

        dataManager._DBHelper.getAll()
        Log.d(TAG,"pref:${dataManager._PrefManager.hasData()}")
    }

}