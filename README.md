### Minimum reproducible project for dagger-android KSP build error

dagger-android using KSP fails to build when a `@ContributesAndroidInjector` references a dagger module with an 
`internal` `@ContributesAndroidInjector` method from another gradle module. This same code compiles successfully using 
KAPT.

```agsl
e: [ksp] ComponentProcessingStep was unable to process 'com.example.daggerandroid.ExampleModule_ContributeAppClass$app_debug.AppClassSubcomponent' because '<error>' could not be resolved.

Dependency trace:
    => element (CLASS): com.example.mylibrary.LibraryModule_ContributeLibraryClass$mylibrary_debug
    => annotation type: dagger.Module
    => annotation: @dagger.Module(includes={}, subcomponents={<error>})
    => annotation value (TYPE_ARRAY): subcomponents={<error>}
    => annotation value (TYPE): subcomponents=<error>

If type '<error>' is a generated type, check above for compilation errors that may have prevented the type from being generated. Otherwise, ensure that type '<error>' is on your classpath.
e: Error occurred in KSP, check log for detail

```

To reproduce: 

* run `./gradlew  :app:assembleDebug` and note the build fails
* comment out KSP usages in both `app` and `mylibrary` modules and uncomment KAPT usages
* run `./gradlew  :app:assembleDebug` and note the build succeeds