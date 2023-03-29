fun quickSort(list: List<Int>): List<Int> { 
    if (list.size <= 1) return list
    val pivot = list[list.size / 2]   
    val less = list.filter { it < pivot }   
    val greater = list.filter { it > pivot }  
    return quickSort(less) + pivot + quickSort(greater)
} 

fun main(args: Array<String>) = println(quickSort(listOf(12, 5, 10, 2, 3))) 
