package kotli.isoftstone.com

import kotlin.math.min

/**
 *创建者：liby
 *创建时间：2017/12/28 10:49
 *工程名：KotlinDemo
 *描述：map集合的变换操作
 */
fun main(args: Array<String>) {
    var map = mapOf(
            "a" to 1,
            "b" to 2
    )
    val plus = map.plus((Pair("c", 3)))
    println(plus)
    val minus = map.minus("a")
    println(minus)
}