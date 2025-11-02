import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    var n=arr.size
    var sumPos=0
    var sumNeg=0
    var sumNet=0
    
    for (i in 0 until n){
        if (arr[i]>0){
            sumPos++
        }
        else if(arr[i]==0){
            sumNet++
        }
        else{
            sumNeg++
        }
    }
    var resultPos=sumPos.toDouble()/n
    var resultNet=sumNet.toDouble()/n
    var resultNeg=sumNeg.toDouble()/n
    
    println(resultPos)
    println(resultNeg)
    println(resultNet)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
