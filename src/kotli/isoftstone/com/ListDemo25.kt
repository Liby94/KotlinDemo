package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/28 9:02
 *工程名：KotlinDemo
 *描述：list集合下
 */
fun main(args: Array<String>) {
    var list = mutableListOf(1,2,3,4,5)
    //截取
    var newlist: List<Int>? = null
    newlist = list.slice(0 .. 1)
    println(newlist)
    //截取
    newlist = list.slice(0 until 3)
    println(newlist)

    newlist = list.subList(0,3)
    println(newlist)

    //正向删除3个元素
    val drop = list.drop(3)
    println("===:"+drop)
    //反向删除3个元素
    val dropLast = list.dropLast(3)
    println(dropLast)
    val get = list.get(100)
    println(get)
}