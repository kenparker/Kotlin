import org.junit.Assert.*
import org.junit.Test

class KotlinTest {

    @Test
    fun testOK() {
        assertEquals("OK", start())
    }

    @Test
    fun testJoin() {
        val collectionOfStrings: List<String> = listOf("a","b","c")
        val joinOptions = joinOptions(collectionOfStrings)
        assertEquals("[a, b, c]",joinOptions)

    }
}