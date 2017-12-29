package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/19 22:59
 *工程名：KotlinDemo
 *描述：区间遍历
 */
fun main(args: Array<String>) {
    var charRange = 'a' .. 'd'
    var first = charRange.first
    var step: Int = charRange.step
    var last = charRange.last
    var start = charRange.start
    var endInclusive = charRange.endInclusive

    println(first)
    println(start)
    println(step)
    println(last)
    println(endInclusive)
    if(step is Int)
    {
        println("int")
    }
    if(charRange.contains('a'))
    {
        println("包含a")
    }
}