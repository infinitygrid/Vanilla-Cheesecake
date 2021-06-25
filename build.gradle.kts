plugins {
    java
    kotlin("jvm") version "1.5.20"
}

group = "net.infinitygrid.vanillacheesecake"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://repo.pl3x.net/")
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    compileOnly("net.pl3x.purpur", "purpur-api", "1.17-R0.1-SNAPSHOT")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}