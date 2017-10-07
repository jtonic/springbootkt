import org.junit.jupiter.api.Test

class RangesTest {

    @Test
    fun `test ranges`() {
        (1..5).forEach { print(it) }

        (1 until 5).forEach { print(it) }

        (0..10 step 2).forEach { print(it) }

        (10 downTo 0 step 3).forEach { print(it) }


        for (i in 1..10) {
            print(i)
        }
    }

    @Test
    fun `test if in range`() {
        when (3) {
            in 1..5 -> println("it is included")
            else -> println("it is not included")
        }
    }
}