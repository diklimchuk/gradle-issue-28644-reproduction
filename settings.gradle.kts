pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode = RepositoriesMode.FAIL_ON_PROJECT_REPOS
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "VKID"
include(":vkid")
project(":vkid").projectDir = File("sdk/core/vkid")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")