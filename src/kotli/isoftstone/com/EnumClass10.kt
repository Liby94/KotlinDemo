package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/18 23:21
 *工程名：KotlinDemo
 *描述：枚举类    印章类
 */
fun main(args: Array<String>) {
    printInfo(Week.D)
}

enum class Week(i: Int) {
    A(1),B(2),C(3),D(3)
}

fun printInfo(c: Week)
{
    Week.D.name
    if(c == Week.C || c == Week.D)
    {
        println("今天是星期天")
    }
    else
    {
        println("今天是工作日")
    }

    var temp: Int = 10
    //按alt + enter 可以将 if else 转换成 when 表达式，简洁了好多
    when (temp) {
        1 -> println("1")
        2 -> println("2")
        3 -> println("3")
        4 -> println("4")
        else -> println("other")
    }

}

//印章类
sealed class Operation
{
    class Add(val num1: Int,val num2: Int): Operation()
}
