enum class Sorted {
    MAX,
    MIN
}

fun ArrayList<Int>.findMax(): Int {
    var array = this[0]
    var index = 0
    for(i in indices) {
        if (this[i] > array) {
            array = this[i]
            index = i
        }
    }
    return index
}

fun ArrayList<Int>.findMin(): Int {
    var array = this[0]
    var index = 0
    for(i in indices) {
        if (this[i] < array) {
            array = this[i]
            index = i
        }
    }
    return index
}

fun ArrayList<Int>.sortArray(sorted: Sorted): ArrayList<Int>? {
    if (isEmpty()) return null
    val array = arrayListOf<Int>()
    when (sorted) {
        Sorted.MAX -> {
            for(i in indices) {
                val index = findMax()
                array.add(
                    this[index]
                )
                removeAt(index)
            }
        }
        Sorted.MIN -> {
            for(i in indices) {
                val index = findMin()
                array.add(
                    this[index]
                )
                removeAt(index)
            }
        }
    }
    return array
}

val sortedArray = arrayListOf(333, 22, 12, 22, 11111, 1433, 15, 1022)


fun main(args: Array<String>) {
    print(sortedArray.sortArray(Sorted.MAX))
}
