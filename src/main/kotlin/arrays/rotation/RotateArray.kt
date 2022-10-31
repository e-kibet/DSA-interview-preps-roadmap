package arrays.rotation


/**
 * QUESTION
 * Given an array of integers arr[] of size N and an integer, the task is to rotate the array elements to the left by d positions.
 */
fun main(args: Array<String>){
    val arraysE = intArrayOf(1, 2, 3, 4, 5, 6, 71, 2, 3, 4, 5, 6, 7)
    val result = arrayRotateElements(arraysE, 2)
    val result2 = arrayRotateElementsTempArray(arraysE, 2)
    println("result=>  ${result.toCollection(ArrayList())}")

    println("result2=>  ${result2.toCollection(ArrayList())}")
}


// BRUTE FORCE SOUTION BY EVANS
fun arrayRotateElements(arrayElements: IntArray, index: Int ): IntArray{
    val tempArray = IntArray(arrayElements.size )

    for(i in arrayElements.indices){
        if(i < index){
            tempArray[arrayElements.size - 1 - i] = arrayElements[i]
            println("${arrayElements.size - i} -> ${arrayElements[i]}")
        }else{
            tempArray[i - index] = arrayElements[i]
            println("${i - index} -> ${arrayElements[i]}")
        }
    }
    return tempArray
}

// SOLUTION BY USE OF THE TEMP ARRAY
fun arrayRotateElementsTempArray(arrayElements: IntArray, index: Int): IntArray{
    val temp = IntArray(arrayElements.size)

    var k = 0
    for(i in index until arrayElements.size  ){
        temp[k] = arrayElements[i]
        k++;
    }

    for(i in 0 until index){
        temp[k] = arrayElements[i]
        k++;
    }

    for (i in arrayElements.indices){
        arrayElements[i] = temp[i]
    }

    return arrayElements
}