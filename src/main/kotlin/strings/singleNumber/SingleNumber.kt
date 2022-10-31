package strings.singleNumber

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 */
fun main(args: Array<String>){
    val nums = intArrayOf(2,2,1)
    val data = singleNumber(nums)
    println(data)
}


/**
 * We need to check if the other elements are present in array
 */
fun singleNumber(nums: IntArray): Int {
    val elements = nums.toList()
    val frequency = elements.groupBy { it }.values
    for(i in frequency.indices){
        println(frequency.stream().count())
    }
    return frequency.size
}