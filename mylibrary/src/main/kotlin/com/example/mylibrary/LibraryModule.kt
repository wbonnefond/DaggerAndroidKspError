package com.example.mylibrary

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class LibraryModule {

    @ContributesAndroidInjector
    internal abstract fun contributeLibraryClass(): LibraryClass
}