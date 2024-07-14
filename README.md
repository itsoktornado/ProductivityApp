# Simple Note Taking App with Clean Architechure technique

This is a simple note-taking application built with Jetpack Compose, utilizing Model–view–viewmodel architectural pattern.

## Features

- **Create Notes**
- **View Notes**
- **Edit Notes**
- **Delete Notes**
- **Filter Notes**

### Note

Make sure to change `"compose_version"` to be compatible with Kotlin in `build.gradle.kts (Project: ProductivityApp)`
```
buildscript {
    extra.apply{
        set("compose_version", "1.5.2")
    }
}
```
Consult [here](https://developer.android.com/jetpack/androidx/releases/compose-kotlin) for the Compose to Kotlin compatibility.

### Dependencies used
- **Viewmodel Lifecycle Compose**

in `build.gradle.kts (Module :app)`:
```
dependencies {
  implementation(libs.androidx.lifecycle.viewmodel.compose)
  implementation(libs.androidx.navigation.compose)
  implementation(libs.androidx.material.icons.extended)
  implementation(libs.androidx.hilt.navigation.compose)
}
```
in `libs.versions.toml`:
```
[versions]
hiltNavigationCompose = "1.2.0"
lifecycleRuntimeKtx = "2.8.3"
materialIconsExtended = "1.6.8"
navigationCompose = "2.7.7"

[libraries]
androidx-hilt-navigation-compose = { module = "androidx.hilt:hilt-navigation-compose", version.ref = "hiltNavigationCompose" }
androidx-lifecycle-viewmodel-compose = { module = "androidx.lifecycle:lifecycle-viewmodel-compose", version.ref = "lifecycleRuntimeKtx" }
androidx-material-icons-extended = { module = "androidx.compose.material:material-icons-extended", version.ref = "materialIconsExtended" }
androidx-navigation-compose = { module = "androidx.navigation:navigation-compose", version.ref = "navigationCompose" }
```

- **Coroutines**

in `build.gradle.kts (Module :app)`:
```
dependencies {
  implementation(libs.kotlinx.coroutines.core)
  implementation(libs.kotlinx.coroutines.android)
)
```

in `libs.versions.toml`:
```
[versions]
kotlinxCoroutinesAndroid = "1.7.3"
kotlinxCoroutinesCore = "1.5.0"

[libraries]
kotlinx-coroutines-android = { module = "org.jetbrains.kotlinx:kotlinx-coroutines-android", version.ref = "kotlinxCoroutinesAndroid" }
kotlinx-coroutines-core = { module = "org.jetbrains.kotlinx:kotlinx-coroutines-core", version.ref = "kotlinxCoroutinesCore" }
```

- **Dagger - Hilt**
  
in `build.gradle.kts (Module :app)`:
```
dependencies {
  implementation(libs.hilt.android)
  kapt(libs.hilt.android.compiler)
)
```

in `libs.versions.toml`:
```
[versions]
hiltAndroidCompiler = "2.51.1"
hiltAndroidGradlePlugin = "2.51.1"

[libraries]
hilt-android = { module = "com.google.dagger:hilt-android", version.ref = "hiltAndroidGradlePlugin" }
hilt-android-compiler = { module = "com.google.dagger:hilt-android-compiler", version.ref = "hiltAndroidCompiler" }
```

- **Room**
  
in `build.gradle.kts (Module :app)`:
```
dependencies {
  implementation(libs.androidx.room.runtime)
  kapt(libs.androidx.room.compiler)
)
```

in `libs.versions.toml`:
```
[versions]
roomRuntime = "2.6.1"

[libraries]
androidx-room-runtime = { module = "androidx.room:room-runtime", version.ref = "roomRuntime" }
androidx-room-compiler = { module = "androidx.room:room-compiler", version.ref = "roomRuntime" }
```

- **Extension**
  
in `build.gradle.kts (Module :app)`:
```
dependencies {
  implementation(libs.androidx.room.ktx)
)
```

in `libs.versions.toml`:
```
[versions]
roomRuntime = "2.6.1"

[libraries]
androidx-room-ktx = { module = "androidx.room:room-ktx", version.ref = "roomRuntime" }
```
