package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/19 23:06
 *工程名：KotlinDemo
 *描述：数组遍历
 */
fun main(args: Array<String>) {
    var arr = arrayOf(1,2,3)
    println("第一种遍历方式")
    //第一种遍历方式
    for (a in arr)
    {
        println(a)
    }
    //第二种遍历方式
    println("第二种遍历方式")
    for (index in arr.indices)
    {
        println("${index} -> ${arr[index]}")
    }
    println("第三种遍历方式")
    //第三种遍历方式
    for(a in arr.withIndex())
    {
        println("${a.index} -> ${a.value}")
    }
    println("第四种遍历方式")
    for((index,value) in arr.withIndex())
    {
        println("${index} -> ${value}")
    }
}

private fun method1() {
    var arr = Array<Int>(5) { 2 * it }
    for (a in arr) {
        println(a)
    }
    println(arr.size)
}

private fun method() {
    //int类型的数组
    var intArray = arrayOf(1, 2, 3)
    //String类型的数组
    var strArr = arrayOf("a", "b", "c")
    //对象数组
    var studentArr = arrayOf(Student("测试数据1", 12), Student("测试数据2", 2))
    //any数组
    var anyArr = arrayOf(1, 2, 3, "a", "b", "c")

    //打印长度
    println("对象数组的长度:" + studentArr.size)
    println("长度:" + anyArr.size)
}

class Student(var name: String,var age: Int)
