pluginManagement{
    plugins{
        val kotlinVersion: String by settings
        val springBootVersion: String by settings
        val dependencyManagementVersion: String by settings

        kotlin("jvm") version kotlinVersion
        kotlin("plugin.spring") version kotlinVersion
        id("org.springframework.boot") version springBootVersion
        id("io.spring.dependency-management") version dependencyManagementVersion
    }
}

rootProject.name = "spring-example"
include(":spring-example-api", ":spring-example-app", ":spring-example-data")