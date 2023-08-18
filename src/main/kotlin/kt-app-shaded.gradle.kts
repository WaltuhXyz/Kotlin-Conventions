import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.gradle.jvm.tasks.Jar

plugins {
    id("kt-app")
    id("com.github.johnrengelman.shadow")
}

val jarTask = tasks.getByName<Jar>("jar")
configure<ShadowJar> {
    mustRunAfter(jarTask)
}

configure<Jar> {
    enabled = false
}
