package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/28 10:53
 *工程名：KotlinDemo
 *描述：条件语句
 */
fun main(args: Array<String>) {
    //判断区间
    var range = 1..8
    var list = listOf(1,2,3,4,5,6)
    var x = 5
    if(x in range)
    {
        println("在区间内")
    }
}

private fun method2() {
    var a = 10
    var b = 11
    var max = 0
    if (a > b) max = a else max = b
    println("${max}")
    //或者
    max = if (a > b) a else b
    println("max:${max}")
}

private fun method() {
    var a = true
    var b = false
    var c = "kotlin"
    var d = 2
    if (a) {
        println("条件语句")
    }
    //如果只有一条语句,也可以不加括号
    if (!b)
        println("条件语句")
}