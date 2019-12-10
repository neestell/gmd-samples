plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {

    buildToolsVersion(BuildConfig.buildTools)
    compileSdkVersion(BuildConfig.compileSdk)

    defaultConfig {
        minSdkVersion(BuildConfig.minSdk)
        targetSdkVersion(BuildConfig.targetSdk)
        versionCode = BuildConfig.versionCode
        versionName = BuildConfig.versionName
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Libs.kotlin)
    implementation(Libs.androidX.appCompat)
    implementation(Libs.androidX.constraintLayout)
    implementation(Libs.androidX.ktx)

    testImplementation(TestLibs.junit.lib)
    androidTestImplementation(TestLibs.junit.extension)
    androidTestImplementation(TestLibs.espresso)
}
