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
    plugins {
        create("kt-base") {
            id = "xyz.waltuh.gradle.kt-base"
            displayName = "Kotlin Base"
            description = "Common conventions for all the Kotlin JVM projects"
            tags.set(setOf("kotlin", "jvm", "convention"))
        }
        create("kt-lib") {
            id = "xyz.waltuh.gradle.kt-lib"
            displayName = "Kotlin Library"
            description = "Common conventions for all the Kotlin JVM libraries"
            tags.set(setOf("kotlin", "jvm", "convention", "library"))
        }
        create("kt-app") {
            id = "xyz.waltuh.gradle.kt-app"
            displayName = "Kotlin Application"
            description = "Common conventions for all the Kotlin JVM applications"
            tags.set(setOf("kotlin", "jvm", "convention", "application"))
        }
        create("kt-app-shaded") {
            id = "xyz.waltuh.gradle.kt-app"
            displayName = "Kotlin Fat-Jar Application"
            description = "Common conventions for all the Kotlin JVM applications that shade their dependencies"
            tags.set(setOf("kotlin", "jvm", "convention", "application", "shadow"))
        }
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
