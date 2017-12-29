package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/19 22:44
 *工程名：KotlinDemo
 *描述：区间遍历
 */
fun main(args: Array<String>) {


}

private fun method4() {
    var charRange = 'a'..'d'
    charRange.forEach()
    {
        println(it)
    }

    println("-----------------------")

    charRange.forEachIndexed { index, c -> println("$index -> $c") }
}

private fun method3() {
    /** 输出
    0 -> a
    1 -> b
    2 -> c
    3 -> d
     */
    var charRange = 'a'..'d'
    for ((index, value) in charRange.withIndex()) {
        println("${index} -> ${value}")
    }
}

private fun method2() {
    /** 输出
    0 -> a
    1 -> b
    2 -> c
    3 -> d
     */
    var charRange = 'a'..'d'
    for (c in charRange.withIndex()) {
        println("${c.index} -> ${c.value}")
    }
}

private fun method1() {
    var charRange = 'a'..'e'
    for (c in charRange step 4) {
        println(c)
    }
}

//区间遍历
private fun method() {
    var charRange = 'a'..'x'
    for (c in charRange) {
        println(c)
    }
}