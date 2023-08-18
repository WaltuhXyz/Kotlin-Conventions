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

    plugins.all {
        displayName = name
        description = "Convention plugin for the Kotlin JVM projects"
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
