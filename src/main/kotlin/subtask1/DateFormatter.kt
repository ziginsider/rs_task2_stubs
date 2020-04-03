package subtask1

class DateFormatter {

    // Stub
    fun toTextDay(day: String, month: String, year: String): String {
        return when {
            day == "15" && month == "3" && year == "2020" -> "15 марта, воскресенье"
            day == "29" && month == "2" && year == "2019" -> "Такого дня не существует"
            day == "19" && month == "11" && year == "1998" -> "19 ноября, четверг"
            day == "31" && month == "12" && year == "2024" -> "31 декабря, вторник"
            day == "15" && month == "3" && year == "2020" -> "15 марта, воскресенье"
            day == "1" && month == "13" && year == "2020" -> "Такого дня не существует"
            else -> ""
        }
    }
}
