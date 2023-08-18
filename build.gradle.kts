plugins {
    `kotlin-dsl`
    id("com.gradle.plugin-publish") version "+"
}

group = "xyz.waltuh.gradle"
version = "0.0.1"

repositories {
    gradlePluginPortal()
    mavenCentral()
}

gradlePlugin {
    website.set("https://github.com/WaltuhXyz/Kotlin-Conventions")
    vcsUrl.set("https://github.com/WaltuhXyz/Kotlin-Conventions")

    plugins.clear()
    plugins {
        create("xyz.waltuh.gradle.kt-base") {
            id = "xyz.waltuh.gradle.kt-base"
            displayName = "kotlinBase"
            description = "Convention plugin for the Kotlin JVM projects"
            implementationClass = "Xyz_waltuh_gradle_ktBasePlugin"
        }
        create("xyz.waltuh.gradle.kt-lib") {
            id = "xyz.waltuh.gradle.kt-lib"
            displayName = "kotlinLibrary"
            description = "Convention plugin for the Kotlin JVM libraries"
            implementationClass = "Xyz_waltuh_gradle_ktLibPlugin"
        }
        create("xyz.waltuh.gradle.kt-app") {
            id = "xyz.waltuh.gradle.kt-app"
            displayName = "kotlinApplication"
            description = "Convention plugin for the Kotlin JVM applications"
            implementationClass = "Xyz_waltuh_gradle_ktAppPlugin"
        }
        create("xyz.waltuh.gradle.kt-app-shaded") {
            id = "xyz.waltuh.gradle.kt-app-shaded"
            displayName = "kotlinApplicationShaded"
            description = "Convention plugin for the Kotlin JVM shaded applications"
            implementationClass = "Xyz_waltuh_gradle_ktAppShadedPlugin"
        }
    }

    plugins.all {
        tags.set(setOf("kotlin", "jvm", "convention"))
    }
}

dependencies {
    // Kotlin
    implementation(kotlin("gradle-plugin", "+"))?.because("Provides 'Kotlin' gradle plugin")

    // Dokka
    implementation("org.jetbrains.dokka:dokka-core:+") {
        because("Provides 'JetBrains Dokka' documentation engine for Kotlin")
    }
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:+") {
        because("Provides 'JetBrains Dokka' gradle plugin")
    }

    // Shading
    implementation("com.github.johnrengelman:shadow:+") {
        because("Provides 'Shadow' gradle plugin")
    }

    // KtLint
    implementation("org.jlleitschuh.gradle:ktlint-gradle:+") {
        because("Provides 'KtLint' gradle plugin")
    }
}
