package com.conghuy.myapplication.dagger

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataManager @Inject constructor(
    val _DBHelper: DBHelper,
    val _PrefManager: PrefManager
) {
    fun hasData(): Boolean {
        return _PrefManager.hasData()
    }

    fun getAll() {
        _DBHelper.getAll()
    }
}