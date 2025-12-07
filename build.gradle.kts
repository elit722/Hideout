plugins {  kotlin("jvm") version "1.8.0"  id("fabric-loom") version "1.1-SNAPSHOT"}

repositories {  mavenCentral()  maven("https://maven.fabricmc.net/")  maven("https://cursemaven.com")  maven("https://jitpack.io")  maven("https://repo.spongepowered.org/maven")}

dependencies {  modCompile("net.fabricmc:fabric-loader:0.14.10")  modCompile("net.fabricmc:fabric-api:0.76.0+1.21.1")  modCompile("me.jellysquid.mods:create:1.21.1-0.5.3")}

tasks {  val remapJar by tasks.named("remapJar")  val shadowJar by tasks.named("shadowJar")}

// The following are examples of tasks you can define:
//tasks.test {  // Do your testing code here
//}

//tasks.processResources {  // Update your resources here
//}
