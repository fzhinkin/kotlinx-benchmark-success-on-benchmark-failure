plugins {
    kotlin("multiplatform") version "1.9.22"
    id("org.jetbrains.kotlinx.benchmark") version "0.4.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

kotlin {
    jvmToolchain(8)

    sourceSets {
        commonMain {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-benchmark-runtime:0.4.10")
            }
        }
    }

    jvm()
    js(IR) {
        nodejs()
    }
    macosArm64()
    macosX64()
    linuxX64()
}

benchmark {
    targets {
        register("jvm")
        register("js")
        register("macosArm64")
        register("macosX64")
        register("linuxX64")
    }
}
