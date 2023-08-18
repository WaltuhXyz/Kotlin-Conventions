import org.gradle.kotlin.dsl.`java-library`
import org.jetbrains.dokka.gradle.DokkaTask

plugins {
    id("xyz.waltuh.gradle.kt-base")
    `java-library`

    id("org.jetbrains.dokka")
}

val dokkaTask = tasks.getByName<DokkaTask>("dokkaJavadoc")
tasks {
    create<Jar>("javadocJar") {
        dependsOn(dokkaTask)
        from(dokkaTask)
        archiveClassifier.set("javadoc")
    }
}
