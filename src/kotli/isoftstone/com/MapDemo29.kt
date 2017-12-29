package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/28 10:33
 *工程名：KotlinDemo
 *描述：
 */
fun main(args: Array<String>) {
    val map = mutableMapOf(
            "a" to 1,
            "b" to 2,
            "c" to 3,
            "d" to 4
    )
    map.put("e",5)
    println(map)
    //批量添加一个map
    map.putAll(mapOf("e" to 6))
    println(map)
    //批量添加一个array
    map.putAll(listOf(Pair("f",7)))
    println(map)
    //删除成功返回对应key的value,反之返回null
    val remove = map.remove("f")
    println(remove)
    //修改指定位置的元素
    map.set("a",11)
    println(map)
    println(map.getOrDefault( "s",0))
}