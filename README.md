### Minimum reproduicble project for dagger-android KSP build error

dagger-android using KAPT produces compiling code when run on a module with an `internal` @Provides method. This same 
code with KSP produces a compilation error.

```agsl
> Task :app:compileDebugJavaWithJavac FAILED
/../DaggerAndroid/app/build/generated/ksp/debug/java/com/example/daggerandroid
/ExampleModule_ProvideString$app_debug_kspFactory.java:40: error: cannot find symbol
    return Preconditions.checkNotNullFromProvides(instance.provideString$app_debug_ksp());
                                                          ^
  symbol:   method provideString$app_debug_ksp()
  location: variable instance of type ExampleModule
1 error

```

To reproduce: run `./gradlew  :app:assembleDebug`