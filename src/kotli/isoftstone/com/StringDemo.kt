package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/11 5:21
 *工程名：KotlinDemo
 *描述：字符串的常见操作
 * 在Kotlin中，Kotlin不能在包名出现不然编译不过
 */
fun main(args: Array<String>) {
   var str = "  空格  "
    println("${str.trim()}")
    println("${str.trimStart()}")
    println("${str.trimEnd()}")
    var str1 = """ |内容| " +
            " |内容| " +
            " |内容| " +
            " |内容| """
    println("${str1.trimMargin("|")}")
    /**
    trimMargin()方法去除每行最前面的空格
    内容| " +
                " |内容| " +
                " |内容| " +
                " |内容|
     */
}

private fun subMethod3() {
    var str = "分分.txt"
    println("${str.substringBeforeLast(".")}")
    println("${str.substringAfterLast(".")}")
}

private fun subMethod2() {
    var str = "D:/Base C Video/第1天"
    //如果没有匹配项就返回本身
    var s = str.substringBeforeLast("/")
    println(s)
    println("${str.substringBeforeLast("/")}")  //D:/Base C Video
    println("${str.substringAfterLast("/")}")   //第1天
}

//截取方法1
private fun subMethod1() {
    var string = "hello kotlin"
    println("subString演示：${string.substring(0, 5)}")
    println(string.substring(0, 5))
}

//字符串的切割
private fun method() {
    var str = "hello.world_hi"
    //这里面传的不是正则，而是匹配字符,并且kotlin允许传入多个折分符
    val list = str.split(".", "_")
    for (l in list) {
        println(l)
    }
}

private fun method2() {
    var str = "hello.world_hi"
    //如果需要用正则，可以调用toRegex方法
    val list = str.split("\\.".toRegex())
    for (l in list) {
        println(l)
    }
}