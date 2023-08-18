import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

plugins {
    checkstyle

    kotlin("jvm")
    id("org.jlleitschuh.gradle.ktlint")
}

configure<KotlinProjectExtension> {
    jvmToolchain {
        version = JavaLanguageVersion.of(17)
    }
}
