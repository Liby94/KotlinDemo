package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/28 9:54
 *工程名：KotlinDemo
 *描述：
 */
fun main(args: Array<String>) {
    //查找索引
    val set = mutableSetOf(1, 2, 3, 4, 5)
    var index = set.indexOf(5)//正向索引
    println(index)
    //反向索引
    val lastIndexOf = set.lastIndexOf(4)
    println(lastIndexOf)
    println("长度:${set.size}")
    println("长度:${set.count()}")
}

private fun method3() {
    //查找元素
    val list = mutableSetOf(1, 1, 2, 3, 4, 5)
    //获取指定位置元素,通过elmentAt
    var at = list.elementAt(1)
    println("第二个元素:${at}")
    at = list.elementAtOrNull(1)!!
    println(at)
}

private fun method2() {
    var set = mutableSetOf(1, 2, 3, 4, 5, 6, 7, 8)
    //删除指定元素
    var isSuccess = set.remove(8)
    println(isSuccess)
    println(set)
    //批量删除
    val all = set.removeAll(listOf(2, 3))
    println(all)
    println(set)
    //批量删除,传递数组
    set.removeAll(arrayOf(4, 5))
    println(set)
    //不支持修改元素
}

private fun method1() {
    var set = hashSetOf(1, 2, 3)
    // 追加元素
    var isSuccess = set.add(4)
    println(isSuccess)
    println(set)
    //批量添加一个集合
    set.addAll(listOf(11, 233))
    println(set)

    set.addAll(arrayOf(111, 222))
    println(set)
}