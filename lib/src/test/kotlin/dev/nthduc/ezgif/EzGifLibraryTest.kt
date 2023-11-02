/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package dev.nthduc.ezgif

import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertTrue

class EzGifLibraryTest {
    @Test
     fun someLibraryMethodReturnsTrue() = runBlocking {
        val classUnderTest = EzGifLibrary()
        assertTrue(classUnderTest.webp2gif("https://images-ng.pixai.art/images/orig/eadd7d20-1079-4b6a-9c56-7a2767b929ba").length > 15, "someLibraryMethod should return 'true'")
    }
}
