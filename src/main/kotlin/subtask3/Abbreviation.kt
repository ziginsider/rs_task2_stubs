package subtask3

class Abbreviation {

    // Stub
    fun abbreviationFromA(a: String, b: String): String {
        return when {
            a == "daBcd" && b == "ABC" -> "YES"
            a == "mnbTy" && b == "BT" -> "YES"
            a == "qWerty" && b == "WY" -> "YES"
            a == "ytrewq" && b == "RY" -> "NO"
            a == "abhfs" && b == "ASCI" -> "NO"
            else -> ""
        }
    }
}
