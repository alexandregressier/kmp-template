import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// Properties --------------------------------------------------------------------------------------

val version[[AppName]]Android: String by rootProject.extra
val versionCode[[AppName]]Android: Int by rootProject.extra
val version[[AppName]]Shared: String by rootProject.extra

val versionJava: JavaVersion by rootProject.extra
val versionAndroidApi: Int by rootProject.extra
val versionMinAndroidApi: Int by rootProject.extra
val versionMinIos: String by rootProject.extra

// Plugins -----------------------------------------------------------------------------------------

plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
    id("io.kotest.multiplatform")
}

version = version[[AppName]]Shared

kotlin {
    android()
    ios()

    sourceSets {
        // Common ----------------------------------------------------------------------------------

        val commonMain by getting {
            dependencies {

            }
        }
        val commonTest by getting {
            dependencies {
                implementation("io.kotest:kotest-framework-engine:_")
                implementation(Testing.kotest.assertions.core)
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        // Android ---------------------------------------------------------------------------------

        val androidMain by getting {
            dependencies {

            }
        }
        val androidTest by getting {
            dependencies {
                implementation(Testing.kotest.runner.junit5)
            }
        }

        // iOS -------------------------------------------------------------------------------------

        val iosMain by getting {
            dependencies {

            }
        }
        val iosTest by getting {
            dependencies {

            }
        }
    }

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "https://[[domain]].[[tld]]"
        ios.deploymentTarget = versionMinIos
        podfile = project.file("../[[appname]]-ios-app/Podfile")
        framework {
            baseName = "[[AppName]]Shared"
        }
    }
}

android {
    compileSdk = versionAndroidApi
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")

    defaultConfig {
        minSdk = versionMinAndroidApi
        targetSdk = versionAndroidApi
    }
    compileOptions {
        sourceCompatibility = versionJava
        targetCompatibility = sourceCompatibility
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

// Tasks -------------------------------------------------------------------------------------------

tasks {
    withType<KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = "$versionJava"
        }
    }
    withType<Test>().configureEach {
        useJUnitPlatform()
        filter {
            isFailOnNoMatchingTests = false
        }
        testLogging {
            showExceptions = true
            showStandardStreams = true
            events = setOf(TestLogEvent.PASSED, TestLogEvent.FAILED)
            exceptionFormat = TestExceptionFormat.SHORT
        }
    }
}