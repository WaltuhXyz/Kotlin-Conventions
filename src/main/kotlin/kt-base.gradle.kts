import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

plugins {
    checkstyle

    kotlin("jvm")
    id("org.jetbrains.dokka")
}

configure<KotlinProjectExtension> {
    jvmToolchain {
        version = JavaLanguageVersion.of(17)
    }
}

val dokkaTask = tasks.getByName<DokkaTask>("dokkaJavadoc")
tasks {
    create<Jar>("javadocJar") {
        dependsOn(dokkaTask)
        from(dokkaTask)
        archiveClassifier.set("javadoc")
    }
}
