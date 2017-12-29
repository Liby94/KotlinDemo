package kotli.isoftstone.com

import java.util.TreeSet

/**
 *创建者：liby
 *创建时间：2017/12/28 9:21
 *工程名：KotlinDemo
 *描述：set集合上
 */
fun main(args: Array<String>) {
    //set集合的遍历
    var set = setOf(1,1,2,2,3,45,5,6322,1,121,1)
    //普通for循环
    for (s in set)
    {
        println("set集合:{$s}")
    }
    //  for循环 withIndex
    for (s in set.withIndex())
    {
        println("${s.index} -> ${s.value}")
    }
    println("-----循环解析-----")
    //      for 循环 解析结构
    for ((index,value) in set.withIndex())
    {
        println("${index} -> ${value}")
    }
}

private fun method2() {
    //TreeSet内部存储按照自然顺序排序,元素取出时无序
    //LinkedHashSet内部存储的时候也会根据元素的hashcode排序,使用链表存储,元素取出顺序和存入顺序一致

    //内部使用HashSet,无序
    var set1 = hashSetOf("B测试数据", "A测试数据", "P测试数据", "S测试数据", "W测试数据", "M测试数据")
    println(set1)
    //内部使用LinkedHashSet,存储按照hashCode输出按照输入顺序
    var set2 = setOf("T测试数据", "K测试数据", "L测试数据", "P测试数据", "L测试数")
    println(set2)
    //内部使用LinkedHashSet,存储按照hashCode输出按照输入顺序
    var set3 = mutableSetOf("T测试数据", "K测试数据", "L测试数据", "P测试数据", "L测试数")
    println(set3)

    //TreeSet,自然顺序
    var set4 = TreeSet<String>()
    set4.add("T测试数据")
    set4.add("K测试数据")
    set4.add("X测试数据")
    set4.add("L测试数据")
    set4.add("P测试数据")
    set4.add("L测数据")
    println("set4:{$set4}")
}

private fun method1() {
    //set集合数据不可重复
    var set = setOf(1, 1, 2, 2, null, null)
    println(set)//输出 [1, 2, null]
}

private fun method() {
    var set1 = setOf("a", "b", "c")
    println(set1)

    var set2 = hashSetOf(1, 2, 3)
    println(set2)

    var set3 = mutableSetOf("a", "b", 3)
    println(set3)

    var set4 = TreeSet<String>()
    set4.add("a")
    set4.add("b")
    set4.add("c")
    println(set4)

    set1.toMutableSet().add("1")
    println(set1)
}