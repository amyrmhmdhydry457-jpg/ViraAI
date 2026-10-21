plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

kotlin {
    jvmToolchain(17)


android {
    namespace = "com.viraai.editor"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.viraai.editor"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
