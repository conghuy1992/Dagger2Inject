package com.conghuy.example;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MyApplicationModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeActivityInjector();
    @ContributesAndroidInjector
    abstract MyActivity contributeMyActivityInjector();
    @ContributesAndroidInjector
    abstract MainFragment contributeMainFragmentInjector();
}
