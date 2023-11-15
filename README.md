# EzGifLibrary

EzGifLibrary is a Kotlin library that allows you to convert between different image and video formats using the online service ezgif.com.

## Features

The library provides the following methods:

- `webp2gif(source: String)`: Converts an image from WebP format to GIF.
- `jpg2webp(source: String)`: Converts an image from JPG format to WebP.
- `png2webp(source: String)`: Converts an image from PNG format to WebP.
- `gif2webp(source: String)`: Converts an image from GIF format to WebP.
- `webp2png(source: String)`: Converts an image from WebP format to PNG.
- `video2gif(source: String)`: Converts a video to GIF format.
- `video2webp(source: String)`: Converts a video to WebP format.

## Usage

First, instantiate an `EzGifLibrary` object:

```kotlin
val ezGif = EzGifLibrary()
val gifUrl = ezGif.webp2gif("https://example.com/image.webp")
```

## Install
```kts
repositories {
    mavenCentral()
    maven {
        url = uri("https://s01.oss.sonatype.org/content/repositories/releases/")
    }
}
dependencies {
    implementation("io.github.nthduc:ezgif:0.0.7")
}
```
