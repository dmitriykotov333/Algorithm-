fun List<Int>.binarySearch(item: Int): Int? {
    var min = 0
    var max = lastIndex
    
    while(min <= max) {
         val mid = (min + max) / 2
         val guess = this[mid]
        
        if (guess == item) return mid
        if (guess > item) {
            max = mid - 1
        } else {
            min = mid + 1
        }
    }
    return null
}
 

val sortedArray = listOf(12, 15, 22, 1022, 1433, 11111) 


fun main(args: Array<String>) {
    print(sortedArray.binarySearch(22))
}
