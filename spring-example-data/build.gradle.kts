plugins{
    kotlin("plugin.spring")
}

dependencies {
    implementation(kotlin("reflect"))
    implementation("org.postgresql:postgresql")
    implementation("org.liquibase:liquibase-core")
    api("org.springframework.boot:spring-boot-starter-data-jdbc")
}