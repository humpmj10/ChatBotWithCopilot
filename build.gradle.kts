plugins {
    kotlin("jvm") version "1.5.0" // Update this to your desired Kotlin version
    id("com.github.johnrengelman.shadow") version "7.0.0" // or latest version
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("io.github.dragneelfps:telegram-bot.kt-jvm:1.0.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.1.0")
}

tasks {
    jar {
        manifest {
            attributes["Main-Class"] = "com.kotlinWithCopilot.ChatBotKt"
        }
    }
    shadowJar {
        manifest {
            attributes["Main-Class"] = "com.kotlinWithCopilot.ChatBotKt"
        }
    }
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}