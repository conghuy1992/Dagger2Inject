package com.conghuy.myapplication

import android.app.Application
import com.conghuy.myapplication.dagger.ApplicationComponent
import com.conghuy.myapplication.dagger.ApplicationModule
import com.conghuy.myapplication.dagger.DaggerApplicationComponent
import com.conghuy.myapplication.dagger.DataManager
import javax.inject.Inject


class MyApplication : Application() {
    lateinit var _ApplicationComponent: ApplicationComponent

    @Inject
    lateinit var dataManager: DataManager

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