plugins {
    id("com.github.ben-manes.versions") version "0.53.0"
    application
    id("org.sonarqube") version "7.2.3.7755"
    checkstyle
}
sonar {
    properties {
        property("sonar.projectKey", "Rimadorio_java-project-61")
        property("sonar.organization", "rimadorio")
    }
}
application {
    mainClass.set("hexlet.code.App")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}


