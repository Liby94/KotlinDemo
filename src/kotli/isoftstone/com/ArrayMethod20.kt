package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/19 23:22
 *工程名：KotlinDemo
 *描述：数组的常见方法
 */
fun main(args: Array<String>) {
    var intArr = arrayOf(1,2,3)
    println(intArr.contains(1))//判断是否包含
    println("获取元素的索引:${intArr.indexOf(2)}")
    println("获取元素的索引:${intArr.indexOf(4)}")
    intArr.reverse()
    println("反转元素:${intArr.toList()}")
    println("获取数组长度:${intArr.size}")
    println("获取数组长度:${intArr.count()}")
}

private fun method(intArr: Array<Int>) {
    println("通过intArr[]方式获取:" + intArr[0])
    println("通过get方式获取:" + intArr.get(1))
    println("通过getOrNull方式获取:" + intArr.getOrNull(2))
    println("通过getOrNull方式获取:" + intArr.getOrNull(4))//返回null
    println("通过elementAt方式获取:" + intArr.elementAt(1))
    println("通过first方式获取:" + intArr.first())
    println("通过last方式获取:" + intArr.last())
}
