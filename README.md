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

TODO

## Contributing

You can contribute this project by opening PRs and issues.

## Licensing

Project is licensed under the MIT license.
