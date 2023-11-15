# EzGifLibrary

EzGifLibrary là một thư viện Kotlin giúp chuyển đổi các định dạng hình ảnh và video thông qua dịch vụ trực tuyến ezgif.com.

## Các chức năng

Thư viện cung cấp các phương thức sau:

- `webp2gif(source: String)`: Chuyển đổi hình ảnh từ định dạng WebP sang GIF.
- `jpg2webp(source: String)`: Chuyển đổi hình ảnh từ định dạng JPG sang WebP.
- `png2webp(source: String)`: Chuyển đổi hình ảnh từ định dạng PNG sang WebP.
- `gif2webp(source: String)`: Chuyển đổi hình ảnh từ định dạng GIF sang WebP.
- `webp2png(source: String)`: Chuyển đổi hình ảnh từ định dạng WebP sang PNG.
- `video2gif(source: String)`: Chuyển đổi video sang định dạng GIF.
- `video2webp(source: String)`: Chuyển đổi video sang định dạng WebP.

## Cách sử dụng

Đầu tiên, khởi tạo một đối tượng `EzGifLibrary`:

```kotlin
val ezGif = EzGifLibrary()
val gifUrl = ezGif.webp2gif("https://example.com/image.webp")
```
## Cài đặt
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