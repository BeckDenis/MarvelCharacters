// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.1.0-alpha02")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.20")

        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.3.5")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}