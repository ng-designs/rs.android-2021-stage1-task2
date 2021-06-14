package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var count = 0
        var startPos = 0

        b.onEach { it -> run {
            startPos = a.indexOf(it, startPos, true)
            if ( startPos != -1) {
                count++
                return@onEach
                }else{
                    startPos = 0
                }
            }
        }

        return if(count == b.length){
            "YES"
        }else{
            "NO"
        }
    }
}
