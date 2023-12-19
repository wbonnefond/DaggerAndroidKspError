package com.example.daggerandroid

import dagger.Module
import com.example.mylibrary.LibraryModule
import dagger.android.ContributesAndroidInjector

@Module
abstract class ExampleModule {

    /**
     * If this method is marked `internal` then the generated code will fail to compile using KSP.
     */
    @ContributesAndroidInjector(modules = [LibraryModule::class])
    internal abstract fun contributeAppClass(): AppClass
}