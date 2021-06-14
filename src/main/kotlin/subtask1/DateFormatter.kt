package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    private val dateFmt = DateTimeFormatter.ofPattern("d MMMM, EEEE", Locale("ru", "RU"))

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {

        val result = try {
            LocalDate.of(year.toInt(), month.toInt(), day.toInt()).format(dateFmt)
        } catch(e: DateTimeException) { "Такого дня не существует" }

        return result
    }
}
