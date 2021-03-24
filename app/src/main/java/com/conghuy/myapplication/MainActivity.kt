package com.conghuy.myapplication

import android.os.Bundle
import android.util.Log
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.conghuy.myapplication.dagger.DBHelper
import com.conghuy.myapplication.dagger.PrefManager
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private var TAG = "MainActivity"

    @Inject
    lateinit var _PrefManager: PrefManager

    @Inject
    lateinit var _DBHelper: DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as MyApplication)._ApplicationComponent.inject(this)
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
//        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

//        dataManager._DBHelper.getAll()
//        Log.d(TAG, "pref:${dataManager._PrefManager.hasData()}")

        _DBHelper.getAll()
        Log.d(TAG, "pref:${_PrefManager.hasData()}")
    }

}