package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        val fomattedDate = DateTimeFormatter.ofPattern("dd.MM.yyyy")
        if (blockA.isNotEmpty()) {
            return when (blockB) {
                Int::class -> {
                    blockA.filterIsInstance<Int>().sum()
                }

                String::class -> {
                    blockA.filterIsInstance<String>().joinToString("")
                }

                LocalDate::class -> {
                    blockA.filterIsInstance<LocalDate>().sorted().last().format(fomattedDate)
                }
                else -> "Doesn't recognize input data"
            }
        }else{
            return "Input data is empty"
        }
    }
}
