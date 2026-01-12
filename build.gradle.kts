plugins {
  kotlin("jvm") version "2.2.21"
}

group = "org.alonalbert"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")}

kotlin {
  jvmToolchain(21)
  compilerOptions {
    freeCompilerArgs.add("-Xuse-inline-scopes-numbers")
  }
}

tasks.test {
  useJUnitPlatform()
}