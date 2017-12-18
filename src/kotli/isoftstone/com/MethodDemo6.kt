package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/13 1:08
 *工程名：KotlinDemo
 *描述：kotlin函数3
 * 相比于java
 *      tailrec关键字
 *      支持对尾递归函数的优化，提高代码性能
 *      这个数学不好，没看太懂啊,尾递归和递归的区别是？
 */
fun main(args: Array<String>) {
//    println(getCount(1000000))
//    println(getCount2(10000000))

}

//如果方法是尾递归，可以使用tailrec关键字修饰，可以避免栈溢出
var count2 = 1;
tailrec fun getCount2(num :Int,total :Int = 0) :Int
{
    println("第"+ ++count2 +"次计算")
    return if(num == 1)
    {
        return 1 + total
    }
    else
    {
        getCount2(num - 1,num + total)
    }
}



//普通递归
var count = 0;
fun getCount(number: Int) :Int
{
    println("第" + ++count + "次计算")
    if(number == 1)
    {
        return 1;
    }
    else
    {
       return number + getCount(number - 1)
    }
}