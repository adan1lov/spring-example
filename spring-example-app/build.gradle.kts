plugins{
    kotlin("plugin.spring")
    id("org.springframework.boot")
}

dependencies {
    implementation(project(":spring-example-api"))
    implementation(project(":spring-example-data"))
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign")
}