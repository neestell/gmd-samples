object BuildConfig {
    const val versionCode = 1
    const val versionName = "1.0.0"

    const val buildTools = "29.0.2"

    const val compileSdk = 29
    const val minSdk = 21
    const val targetSdk = 29
}

object Versions {
    const val gradle = "3.5.3"
    const val kotlin = "1.3.61"
    const val junit = "4.12"
    const val androidX = "1.1.0"
}

object ProductionConstants {
    const val url = "\"https://yandex.com\""
}

object DevelopmentConstants {
    const val url = "\"https://ya.com\""
}

object Libs {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val androidX = AndroiX()

    class AndroiX(version: String = Versions.androidX) {
         val appCompat = "androidx.appcompat:appcompat:$version"
         val ktx = "androidx.core:core-ktx:${version}"
         val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
    }

}

object TestLibs {
    val junit = JUnit()
    const val espresso = "androidx.test.espresso:espresso-core:3.1.1"

    class JUnit() {
         val lib = "junit:junit:${Versions.junit}"
         val extension = "androidx.test.ext:junit:${Versions.androidX}"
    }
}