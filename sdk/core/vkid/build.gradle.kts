import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
//    id("vkid.android.library.compose")
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.vk.id"
    compileSdk = 34

    defaultConfig {
        minSdk = 21

        buildFeatures.buildConfig = true
    }

    compileOptions {
        // Up to Java 11 APIs are available through desugaring
        // https://developer.android.com/studio/write/java11-minimal-support-table
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    defaultConfig.targetSdk = 34
    resourcePrefix("vkid_")
}
// Use withType to workaround https://youtrack.jetbrains.com/issue/KT-55947
tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        // Set JVM target to 11
        jvmTarget = JavaVersion.VERSION_11.toString()
        // Treat all Kotlin warnings as errors (disabled by default)
        // Override by setting warningsAsErrors=true in your ~/.gradle/gradle.properties
        val warningsAsErrors: String? by project
        allWarningsAsErrors = warningsAsErrors.toBoolean()
    }
}
