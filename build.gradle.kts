plugins {
    id("java-library")
    id("maven-publish")
}

group = "no.fintlabs"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://repo.fintlabs.no/releases")
    mavenCentral()
}

dependencies {
    implementation("no.fintlabs:fint-model-core:0.4.1")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.15.2")

    compileOnly("org.projectlombok:lombok:1.18.28")
    annotationProcessor("org.projectlombok:lombok:1.18.28")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}