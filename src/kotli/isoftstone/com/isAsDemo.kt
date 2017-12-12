package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/11 6:33
 *工程名：KotlinDemo
 *描述：is、!is、as、as?运算符
 */
fun main(args: Array<String>) {
    //在java中是用instanceOf关键字来检测对象是否是特定类的一个实例
    //在kotlin中可以使用is运算符和!is运算符来检测对象是否是特定类的一个实例
    var demo1 :Demo1 = Demo1()
    var demo2 :Demo2 = Demo2()

    var isInstanceOf = demo1 is Demo1
    var isIstan = demo2 !is Demo2
    println(isInstanceOf)
    println(isIstan)
    //多态
    demo1 = demo2
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    var str = 1
    //var temp1 = str as String // as 强制转换 如果转换不成功ide抛出类型异常   提示：This cast can never succeed  ide提示转换不会成功
    var temp = str as? String   //  as? 安全的类型转换运算符，如果转换异常，则返回null
    print(temp ?.length)
}

open class Demo1
{

}

class Demo2 : Demo1()
{

}