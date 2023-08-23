# Kotlin Conventions (Gradle)

Gradle isn't a hierarchy-based system like Maven. You can still use the `subprojects` or `allprojects` closures, but as the Gradle manual
said, this is a bad practice. You should consider using convention plugins for sharing the build logic between the modules.

This repo reduces the boilerplate of these convention plugins by separating the basic Kotlin configuration to the standalone plugin,
that can be applied in pair with Your own plugins.

---------------------

## Table of Contents

* [Features](#features)
* [Quickstart](#quickstart)
* [Contributing](#contributing)
* [Licensing](#licensing)

---------------------

## Features

Kotlin Conventions comes with a plenty of the basic features that You'll probably need in any project.

* Base Kotlin plugin that configures a bunch of default plugins
* * checkstyle
* * Kotlin (JVM, latest version available)
* * Kt-Lint (Latest version available)
* Library plugin with built-in Dokka javadoc & html support
* Application plugins that configures the built-in `application` gradle plugin
* * Raw application plugin that only supports `zip` and `tar` based distributions
* * Fat JAR application plugin based on the Shadow gradle plugin that supports `all-in-one` JARs

## Quickstart

All plugins are available on the Gradle Plugins Portal, so You do not need any additional steps other than
applying the plugin to the project.

```kts
plugins {
  id("xyz.waltuh.gradle.kt-<subproject name>") version "<version>"
}
```

You can also use "+" as the version. Gradle will resolve this notation to the latest version
of the plugin available at the moment.

Example of adding the kt-app plugin.

```kts
plugins {
  id("xyz.waltuh.gradle.kt-app") version "+"
}
```

There are more examples on the plugin portal site, feel free to [CHECK IT OUT](https://plugins.gradle.org/u/WaltuhXyz).

## Contributing

You can contribute this project by opening PRs and issues.

## Licensing

Project is licensed under the MIT license.
