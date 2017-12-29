package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/20 11:41
 *工程名：KotlinDemo
 *描述：集合之List
 *  存储有序可重复的
 *  list接口常用的实现类有 ArrayList    LinkedList      MutableList
 */
fun main(args: Array<String>) {


}

private fun method1() {
    var list = mutableListOf(1, 2, 3, 4)
    println("--------普通for循环------")
    for (c in list) {

        println(c)
    }

    println("--------for循环------")
    for (c in list.withIndex()) {
        println("${c.index} -> ${c.value}")
    }

    println("-------for循环解析析构-------")
    for ((index, value) in list.withIndex()) {
        println("${index} -> ${value}")
    }
}

private fun method() {
    //List集合的4种创建方式
    //通过构造方法        返回值     List        不可写
    //listOf()方法        返回值     List        不可写
    //arrayListOf()方法   返回值     ArrayList   可写
    //mutableListOf()方法 返回值     MutableList 可写

    var list1 = List(3, { it * 2 })
    println(list1)
    list1.toMutableList().add(1)//可以通过这种方式来添加数
    var list2 = listOf("a", "b", "c")
    println(list2)

    var list3 = arrayListOf(1, 2, 3)

    var list4 = mutableListOf("a", "b", 3)
}