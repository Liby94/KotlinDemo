package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/26 15:09
 *工程名：KotlinDemo
 *描述：
 */
fun main(args: Array<String>) {

}

private fun method2() {

}

private fun method3() {
    val list = List(3, { it * 2 })
    //第一种方式     以下不可写
    for (l in list) {
        println(l)
    }
    //第二种方式
    val listOf = listOf("a", "b", "c")
    println(listOf)
    //第三种方式     以下可写
    val arrayList = arrayListOf(1, 2, 3)
    println(arrayList)
    val mutableList = mutableListOf("a", "b", 3)
    println(mutableList)

    val of = listOf("a", "b", "c")
    of.toMutableList().add("d")


}