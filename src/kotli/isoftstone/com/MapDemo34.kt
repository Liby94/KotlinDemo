package kotli.isoftstone.com

import java.util.*

/**
 *创建者：liby
 *创建时间：2017/12/29 19:50
 *工程名：KotlinDemo
 *描述：map集合的4种方式
 *  hashMapOf()方法       返回值:HashMap      是否可写:是
 *  MapOf()方法       返回值:Map      是否可写:否
 *  MapOf()方法       返回值:Map      是否可写:否
 *  mutableMapOf()方法       返回值:MutableMap      是否可写:是
 *  TreeMap()构造方法       返回值:TreeMap      是否可写:是
 */
fun main(args: Array<String>) {
    var map = mutableMapOf(
            "a" to 1,
            "b" to 2,
            "c" to 3
    )
    var values: MutableCollection<Int> = map.values
    var keys: MutableCollection<String> = map.keys
    val array = values.toTypedArray()
    println(array.toList())
}

private fun method() {
    //通过Pair方法构建
    var map1 = mapOf<String, Int>(
            Pair("a", 1),
            Pair("b", 2),
            Pair("c", 3),
            Pair("d", 4)
    )
    println("map1:${map1}")
    var map2 = hashMapOf<String, Int>(
            Pair("a", 1),
            Pair("b", 2),
            Pair("c", 3),
            Pair("d", 4)
    )
    println("map2:${map2}")

    //通过to方法构建
    var map3 = hashMapOf(
            "1" to 1,
            "2" to 1,
            "3" to 1,
            "11" to 1
    )
    println(map3)

    var list = List(3, { it * 2 })
    println(list)

    val listOf = listOf("a", "b", "c")
    println(listOf)
}