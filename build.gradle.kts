plugins {
    `kotlin-dsl`
    `maven-publish`
}

group = "xyz.waltuh.gradle"
version = "0.0.1"

repositories {
    gradlePluginPortal()
}

publishing {
    publications {
        create<MavenPublication>("mavenKotlin") {
            from(components["kotlin"])
        }
    }
    repositories {
        maven {
            name = "GithubPackages"
            url = uri("https://maven.pkg.github.com/WaltuhXyz/Kotlin-Conventions")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
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
}
