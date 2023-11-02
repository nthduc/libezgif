## Install
```kts
repositories {
    mavenCentral()
    maven {
        url = uri("https://s01.oss.sonatype.org/content/repositories/releases/")
    }
}
dependencies {
    implementation("io.github.nthduc:ezgif:0.0.6")
}
```
OR Github GPR KEY

```kts
dependencies {
    implementation("dev.nthduc.ezgif:lib:1.0")
}
publishing {
    publications {
        create<MavenPublication>("gpr") {
            from(components["java"])
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/nthduc/libezgif")
            credentials {
                username = project.findProperty("gpr.user") as String
                password = project.findProperty("gpr.key") as String
            }
        }
    }
}
```