package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/28 7:49
 *工程名：KotlinDemo
 *描述：list集合Demo中
 */
fun main(args: Array<String>) {
//    var list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8)
    //获取元素的索引
    val mutableListOf = mutableListOf(1, 2, 3, 4)
    //正向索引
    val indexOf = mutableListOf.indexOf(4)
    println(indexOf)
    //反向索引
    val lastIndexOf = mutableListOf.lastIndexOf(3)
    println("反向索引:$lastIndexOf")

}

private fun method4() {
    var list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8)
    //是否包含元素
    val contains: Boolean = list.contains(1)
    println(contains)
    //是否包含集合
    val containsAll = list.containsAll(listOf(1, 3, 5))
    println(containsAll)
    val all = list.containsAll(listOf(1, 9))
    println(all)
}

private fun method3() {
    //修改指定位置的元素值
    var list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8)
    var element = list.set(0, 2)
    println(element)
    println(list)
    val getZero = list.get(0)
    println(getZero)

    //获取失败则返回null
    val orNull = list.getOrNull(99)
    println(orNull)
}

private fun method2() {
    var list = mutableListOf(1, 2, 3, 4, 5, 6)
    //删除指定元素
    println(list.remove(2))
    println(list)
    //删除集合
    println(list.removeAll(listOf(3, 8)))
    println(list)
    //批量删除,删除数组
    println(list.removeAll(arrayOf(4, 5)))
    println(list)
}

private fun method() {
    val listOf = mutableListOf(1, 2, 3)
    val add = listOf.add(4)
    println(listOf)
    println(add)
    //添加到指定位置
    listOf.add(0, 5)
    println(listOf)
    //批量添加一个集合
    listOf.addAll(listOf(11, 22))
    println(listOf)

    //添加一个数组
    listOf.addAll(arrayOf(1, 2))
    println(listOf)

    //在指定位置添加一个集合
    listOf.addAll(0, listOf(111, 222))
    println(listOf)
}

