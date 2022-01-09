// Plugins -----------------------------------------------------------------------------------------

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

plugins {
    id("de.fayard.refreshVersions") version "0.30.2"
}

refreshVersions {
    rejectVersionIf {
        candidate.stabilityLevel.isLessStableThan(current.stabilityLevel)
    }
}

// Dependencies ------------------------------------------------------------------------------------

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

// Projects ----------------------------------------------------------------------------------------

rootProject.name = "[[appname]]"
include(
    ":[[appname]]-shared",
    ":[[appname]]-android-app",
)