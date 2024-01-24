### Minimum reproducible project for KSP failure with kotlin 1.9.21 and KSP hanging with kotlin 1.9.22


I have attempted to use KSP `1.9.22-1.0.17` which addresses this issue: https://github.com/google/ksp/issues/1671. 
Unfortunately, the KSP task hangs indefinitely when using kotlin `1.9.22` and KSP `1.9.22-1.0.17`. This does not occur 
with `1.9.21`


To reproduce: 

* run `./gradlew  :app:assembleDebug --rerun-tasks` and note that it never completes
* downgrade versions in /gradle/libs.versions.toml: kotlin to 1.9.21, ksp to 1.9.21-1.0.16
* run `./gradlew  :app:assembleDebug --rerun-tasks` and note that it fails due to the above issue