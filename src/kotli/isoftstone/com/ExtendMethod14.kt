package kotli.isoftstone.com

import sun.security.util.Length

/**
 *创建者：liby
 *创建时间：2017/12/19 0:24
 *工程名：KotlinDemo
 *描述：扩展函数和扩展属性
 */
fun main(args: Array<String>) {
//    println("hello world".getLastChar())
    var c = A()
    //扩展函数和成员函数重名时，成员函数优先
    c.printInfo()
    println("Kotlin".lastchar)
}

//自定义扩展属性，没看懂
val String.lastchar: Char
    get() = get(length - 1)


//-------------------------------------------------------------------------//

class A
{
    fun printInfo()
    {
        println("成员函数...")
    }
}

fun A.printInfo()
{
    println("扩展函数...")
}



//如何定义扩展函数

//AnyClass：任意类
//functionName：拓展函数的函数名
//params：拓展函数的参数
//receiverType：拓展函数的返回值
//method body：拓展函数的方法体

//fun anyClass.functionName(params):  receiverType
//{
//    method body
//}

//For Example
fun String.getLastChar(): String
{
    return this.substring(this.length - 1,this.length);
}