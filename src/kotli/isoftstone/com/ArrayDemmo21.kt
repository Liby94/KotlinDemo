package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/20 11:14
 *工程名：KotlinDemo
 *描述：数组变化
 */
fun main(args: Array<String>) {
    //数组下标越界
    var intArr = arrayOf(1,2,3)
    println(intArr[-1])
}

private fun method2() {
    //分割
    var intArr = arrayOf(1, 2, 3, 4, 5, 6)
    //取数组[0-3]对应的元素
    var sliceArray = intArr.sliceArray(0..3)//拷贝
    println(sliceArray.toList())
}

private fun method1() {
    var intArr = arrayOf(1, 2, 3, 4)
    var newArr = intArr.drop(1)//这里的是指删除前几个元素，不是指角标也不是元素值
    println(newArr.toList())
}

private fun method() {
    //一个数组的长度是固定的，没有办法添加元素，在Kotlin中plusElement()方法可以对原集合添加元素，变成一个新集合
    var intArr = arrayOf(1, 2, 3);
    //追加元素
    var newArr = intArr.plusElement(4)
    //打印集合
    println(newArr.toList())
}