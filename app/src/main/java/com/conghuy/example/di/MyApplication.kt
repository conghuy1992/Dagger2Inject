package com.conghuy.example.di

import android.app.Application

class MyApplication : Application() {
    // Reference to the application graph that is used across the whole app
    val appComponent = DaggerApplicationComponent.create()
}