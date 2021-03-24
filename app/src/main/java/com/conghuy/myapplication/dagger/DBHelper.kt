package com.conghuy.myapplication.dagger

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DBHelper @Inject constructor(
    @ApplicationContext context: Context,
    @DatabaseInfo dbName: String,
    @DatabaseInfo version: Int
) : SQLiteOpenHelper(context, dbName, null, version!!) {
    private var TAG: String = this.javaClass.simpleName
    override fun onCreate(db: SQLiteDatabase) {}
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {}
    fun getAll() {
        Log.d(TAG, "getAll")
    }

    fun add() {}
    fun update() {}
    fun delete() {}
}