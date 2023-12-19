package com.example.daggerandroid

import dagger.Module
import dagger.Provides

@Module
class ExampleModule {

    @Provides
    internal fun provideString(): String {
        return "Hello World!"
    }
}