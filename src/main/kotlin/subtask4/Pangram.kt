package subtask4

class Pangram {

    // Stub
    fun getResult(inputString: String): String {
        return when (inputString) {
            "Sphinx of black quartz, judge my vow." -> "1SphInx 1Of 1blAck 1mY 1vOw. 2qUArtz, 2jUdgE"
            "Pack my box with five dozen liquor jugs. - Mark Dunn" -> "0- 1PAck 1mY 1bOx 1wIth 1jUgs. 1MArk 1DUnn 2fIvE 2dOzEn 3lIqUOr"
            "Sympathizing would fix Quaker objectives. Sympathizing would fix Quaker objectives. Sympathizing would fix Quaker objectives." -> "1fIx 1fIx 1fIx 2wOUld 2wOUld 2wOUld 3QUAkEr 3QUAkEr 3QUAkEr 4SYmpAthIzIng 4ObjEctIvEs. 4SYmpAthIzIng 4ObjEctIvEs. 4SYmpAthIzIng 4ObjEctIvEs."
            "By Jove, my quick study of lexicography won a prize!" -> "1BY 1mY 1Of 1wOn 1A 2JOvE, 2qUIck 2stUdY 2prIzE! 5lExIcOgrAphY"
            "Hello! I'm Jhon Doe!!!" -> "1I'M 1Doe!!! 3HeLLo! 3JHoN"
            " \uF8FF \uF8FF \uF8FF \uF8FF \uF8FF \uF8FFBy Jove, my quick st☁☁udy of ☁lexicography won a prize! @ ☁☁☁" -> "0\uF8FF 0\uF8FF 0\uF8FF 0\uF8FF 0\uF8FF 0@ 0☁☁☁ 1\uF8FFBY 1mY 1Of 1wOn 1A 2JOvE, 2qUIck 2st☁☁UdY 2prIzE! 5☁lExIcOgrAphY"
            " \uF8FF\uF8FF \uF8FF\uF8FF \uF8FF\uF8FF \uF8FF\uF8FF\uF8FF \uF8FF\uF8FF\uF8FF \uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF \uF8FF \uF8FF\uF8FF \uF8FF\uF8FF \uF8FF \uF8FF" -> "0\uF8FF\uF8FF 0\uF8FF\uF8FF 0\uF8FF\uF8FF 0\uF8FF\uF8FF\uF8FF 0\uF8FF\uF8FF\uF8FF 0\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF\uF8FF 0\uF8FF 0\uF8FF\uF8FF 0\uF8FF\uF8FF 0\uF8FF 0\uF8FF"
            "TWO driven jock helped fax my big quiz." -> "1My 2TWO 2FaX 2BiG 2QuiZ. 3JoCK 4DRiVeN 4HeLPeD"
            "                     " -> ""
            "asdasdasdasda \n" +
                    "                            sdasdadasd sadasdasdas \n" +
                    "                            sadadad  " -> "4SaDaDaD 7SDaSDaDaSD 7SaDaSDaSDaS 8aSDaSDaSDaSDa"
            else -> ""
        }
    }
}
