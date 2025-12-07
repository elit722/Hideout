// settings.gradle.kts

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven { url = uri("https://plugins.gradle.org/m2/") }
        // Add other repositories if needed
    }
}

task("hello") {
    doLast { 
        println("Hello from Hideout mod!")
    }
}
