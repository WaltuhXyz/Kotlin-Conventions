import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

plugins {
    checkstyle

    kotlin("jvm")
}

configure<KotlinProjectExtension> {
    jvmToolchain {
        version = JavaLanguageVersion.of(17)
    }
}
