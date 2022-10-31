package arrays.shuffle

fun main(args: Array<String>){
    val intNums: IntArray =  intArrayOf(2, 3, 4, 5)
    val result = shuffle(intNums, 2)

    println(result.joinToString(", "))
}

fun shuffle(nums: IntArray, n: Int): IntArray {
    val temp = IntArray(2 * n)

    for(i in 0 until n){
        temp[2 * i]=nums[i]
        temp[2 * i + 1]=nums[i+n]
    }

    return temp

}