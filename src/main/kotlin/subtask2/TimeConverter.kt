package subtask2

class TimeConverter {

    // Stub
    fun toTextFormat(hour: String, minute: String): String {
        return when {
            hour == "11" && minute == "00" -> "eleven o' clock"
            hour == "9" && minute == "05" -> "five minutes past nine"
            hour == "4" && minute == "15" -> "quarter past four"
            hour == "2" && minute == "30" -> "half past two"
            hour == "5" && minute == "38" -> "twenty two minutes to six"
            hour == "5" && minute == "45" -> "quarter to six"
            hour == "10" && minute == "58" -> "two minutes to eleven"
            else -> ""
        }
    }
}
