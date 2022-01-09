import de.fayard.refreshVersions.core.versionFor

// Properties --------------------------------------------------------------------------------------

val version[[AppName]]Android: String by rootProject.extra
val versionCode[[AppName]]Android: Int by rootProject.extra

val versionJava: JavaVersion by rootProject.extra
val versionAndroidApi: Int by rootProject.extra
val versionMinAndroidApi: Int by rootProject.extra

// Plugins -----------------------------------------------------------------------------------------

plugins {
    kotlin("android")
    id("com.android.application")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = versionAndroidApi

    defaultConfig {
        applicationId = "[[tld]].[[domain]]"
        minSdk = versionMinAndroidApi
        targetSdk = versionAndroidApi
        versionCode = versionCode[[AppName]]Android
        versionName = version[[AppName]]Android
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }
    compileOptions {
        sourceCompatibility = versionJava
        targetCompatibility = sourceCompatibility
    }
    kotlinOptions {
        jvmTarget = "${compileOptions.sourceCompatibility}"
//        freeCompilerArgs = freeCompilerArgs + listOf(
//            "-Xopt-in=${
//                listOf(
//                ).joinToString(",")
//            }"
//        )
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = versionFor(AndroidX.compose.ui)
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

// Dependencies ------------------------------------------------------------------------------------

dependencies {
    implementation(project(":[[appname]]-shared"))

    // Core
    implementation(AndroidX.core.ktx)

    // Compose
    implementation(AndroidX.compose.ui)
    implementation(AndroidX.compose.ui.toolingPreview)

    // Material
    implementation(AndroidX.compose.material)

    // Lifecycle
    implementation(AndroidX.lifecycle.runtimeKtx)

    // Activity
    implementation(AndroidX.activity.compose)

    // Hilt
    implementation(Google.dagger.hilt.android)
    kapt(Google.dagger.hilt.compiler)

    // Navigation
    implementation(AndroidX.navigation.compose)
    implementation(AndroidX.hilt.navigationCompose)

    // Accompanist
    implementation(Google.Accompanist.systemuicontroller)

    // Debugging
    debugImplementation(Square.LeakCanary.android)
}