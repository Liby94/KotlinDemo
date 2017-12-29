package kotli.isoftstone.com

import java.util.TreeSet

/**
 *创建者：liby
 *创建时间：2017/12/28 10:19
 *工程名：KotlinDemo
 *描述：set集合--下
 */
fun main(args: Array<String>) {
    val set = setOf(1, 2, 3)
    set.elementAt(-1)
    println(set)
}

private fun method2() {
    var treeSet = TreeSet<Int>()
    treeSet.add(0)
    treeSet.add(1)
    treeSet.add(2)
    treeSet.add(3)
    treeSet.add(4)
    //3之前的元素
    val set = treeSet.headSet(3)
    println(set)
    //3到5之间的元素
    var subSet = treeSet.subSet(3, 5)
    println("subSet:${subSet}")
    //3之后的元素
    val tailSet = treeSet.tailSet(3)
    println(tailSet)
}

private fun method() {
    val set = setOf(1, 2, 3)
    var newlist: List<Int>? = null
    //删除三个元素
    newlist = set.drop(1)
    println("删除:${newlist}")
}
