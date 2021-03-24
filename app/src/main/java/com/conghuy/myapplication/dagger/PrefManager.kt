package com.conghuy.myapplication.dagger

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PrefManager @Inject constructor(
    @ApplicationContext context: Context,
    val pref: SharedPreferences
) {
    private var editor: Editor = pref.edit()
    private val hasData = "hasData"
    fun clearData() {
        editor.clear()
        editor.commit()
    }

    fun hasData(): Boolean {
        return pref.getBoolean(hasData, false)
    }

    fun setHasData(a: Boolean) {
        editor.putBoolean(hasData, a)
        editor.commit()
    }

}