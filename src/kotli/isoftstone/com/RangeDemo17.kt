package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/19 22:30
 *工程名：KotlinDemo
 *描述：区间的
 */
fun main(args: Array<String>) {



}

private fun method1() {
    var range1 = IntRange(1, 9)
    var range2 = 1.rangeTo(9)
    var range3 = 1..9
    var range4 = 1 until 10

    println(range1.toList())
    println(range2.toList())
    println(range3.toList())
    println(range4.toList())
}

private fun method() {
    //开区间
    var range1 = IntRange(2, 9)
    var range2 = 2.rangeTo(9)
    var range3 = 2..9
    var range4 = 2 until 10
    println(range1.toList())
    println(range2.toList())
    println(range3.toList())
    println(range4.toList())
}