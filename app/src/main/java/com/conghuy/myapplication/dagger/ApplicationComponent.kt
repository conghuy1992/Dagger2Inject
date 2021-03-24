package com.conghuy.myapplication.dagger

import com.conghuy.myapplication.MainActivity
import com.conghuy.myapplication.MyApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(_MyApplication: MyApplication)
    fun inject(_MainActivity: MainActivity)
}