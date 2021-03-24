package com.conghuy.myapplication.dagger

import android.content.Context
import android.content.SharedPreferences
import com.conghuy.myapplication.MyApplication
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(val _MyApplication: MyApplication) {
    @Provides
    @ApplicationContext
    fun provideApplicationContext(): Context {
        return _MyApplication
    }

    @Provides
    fun _SharedPreferences(): SharedPreferences {
        return _MyApplication.getSharedPreferences("PREF_NAME", 0)
    }

    @Provides
    @DatabaseInfo
    fun dbName(): String {
        return "database_name.db"
    }

    @Provides
    @DatabaseInfo
    fun version(): Int {
        return 1
    }
}