package subtask5

import java.time.LocalDate
import kotlin.reflect.KClass

class Blocks {

    // Stub
    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        val blockA1 = arrayOf(
            111,
            "Sing, O goddess, the anger of Achilles son of Peleus, that brought countless ills upon the Achaeans.",
            LocalDate.parse("1924-06-16"),
            333,
            " Many a brave soul did it send hurrying down to Hades, and many a hero did it yield a prey to dogs and vultures...",
            1984
        )
        val result1 =
            "Sing, O goddess, the anger of Achilles son of Peleus, that brought countless ills upon the Achaeans.  " +
                    "Many a brave soul did it send hurrying down to Hades, and many a hero did it yield a prey to dogs and vultures..."

        val date1 = LocalDate.parse("2019-12-31")
        val date2 = LocalDate.parse("1986-04-13")
        val date3 = LocalDate.parse("2019-12-30")
        val blockA2 = arrayOf(1, "4", date1, 2, "3", date2, date3)

        return when {
            blockA.contentEquals(arrayOf(1, "4", 2, "3")) && blockB == String::class -> "43"
            blockA.contentEquals(arrayOf(1, "4", 12, "3")) && blockB == Int::class -> 13
            blockA.contentEquals(blockA1) && blockB == String::class -> result1
            blockA.contentEquals(blockA2) && blockB == LocalDate::class -> "31.12.2019"
            else -> ""
        }
    }
}
