package com.conghuy.example.di

import com.conghuy.example.MainActivity
import com.conghuy.example.MainFragment
import dagger.Component

@Component
interface ApplicationComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: MainFragment)
}