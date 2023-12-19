package com.example.daggerandroid

import dagger.Module
import dagger.Provides

@Module
class ExampleModule {

    /**
     * If this method is marked `internal` then the generated code will fail to compile using KSP.
     */
    @Provides
    internal fun provideString(): String {
        return "Hello World!"
    }
}