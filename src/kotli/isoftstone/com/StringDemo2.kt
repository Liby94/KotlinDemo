package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/11 6:04
 *工程名：KotlinDemo
 *描述：字符串操作2
 *Kotlin中新增一种做法，字符串可以由三重引导"""分割，直接包含任意的特殊的字符
 */
fun main(args: Array<String>) {
    println("${ method3("输入")}")
    //输出下面的值:
    //输入
    //kotlin.Unit

    var s = "${ method3("输入")}" //如果调用方法没有返回值，则返回kotlin.Unit
    println(s)

    var s1 = "${method4("测试数据")}"   //如果有返回值，则返回方法的返回值
    println(s1)

    var s2 = "a is 1"
    println("${s2.replace("is","replace")}")    //
}

private fun method4(s: String) : String
{
    return s;
}

private fun method3(s: String)
{
    println(s)
}

private fun method2() {
    var str = "1"
    var a = 1
    //引用一个变量，格式:${变量名}
    //在字符串中进行输出，可以省去大括号，但是有时候不可以的
    var str1 = "a is $a"
    println(str1)
}


private fun method() {
    //单行字符串使用转义字符，
    var str = "ccc\naaa"
    println(str)
    //使用三重引号可以原格式输出
    var str1 = """123
        什么格式都可以
            什么格式都可以
什么格式都可以
                            什么格式都可以
        """
    println(str1)
}