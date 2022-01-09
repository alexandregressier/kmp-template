import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

// Properties --------------------------------------------------------------------------------------

val version[[AppName]]Android by extra("0.1.0")
val versionCode[[AppName]]Android by extra(1)
val version[[AppName]]Shared by extra("0.1.0")

val versionGradle by extra("7.3.3")
val versionJava by extra(JavaVersion.VERSION_11)
val versionAndroidApi by extra(32)
val versionMinAndroidApi by extra(26)
val versionMinIos by extra("15.0")

// Plugins -----------------------------------------------------------------------------------------

plugins {
    id("com.osacky.doctor")
    kotlin("android") apply false
    id("com.android.application") apply false
}

buildscript {
    dependencies {
        classpath(Google.dagger.hilt.android.gradlePlugin)
    }
}

doctor {
    disallowCleanTaskDependencies.set(false)
}

// Projects ----------------------------------------------------------------------------------------

subprojects {
    afterEvaluate {
        project.extensions.findByType<KotlinMultiplatformExtension>()?.let { ext ->
            ext.sourceSets.removeAll { sourceSet ->
                setOf(
                    "androidAndroidTestRelease",
                    "androidTestFixtures",
                    "androidTestFixturesDebug",
                    "androidTestFixturesRelease",
                ).contains(sourceSet.name)
            }
        }
    }
}

// Tasks -------------------------------------------------------------------------------------------

tasks {
    wrapper {
        gradleVersion = versionGradle
    }
    register<Delete>("clean") {
        delete(rootProject.buildDir)
    }
}