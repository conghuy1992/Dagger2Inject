package com.conghuy.myapplication

import android.app.Application
import com.conghuy.myapplication.dagger.ApplicationComponent
import com.conghuy.myapplication.dagger.ApplicationModule
import com.conghuy.myapplication.dagger.DaggerApplicationComponent


class MyApplication : Application() {
    lateinit var _ApplicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        initApplicationModule()
    }

    private fun initApplicationModule() {
        _ApplicationComponent =
            DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
        _ApplicationComponent.inject(this)

    }
}