package kotli.isoftstone.com


/**
 *创建者：liby
 *创建时间：2017/12/13 0:33
 *工程名：KotlinDemo
 *描述：kotlin函数2
 * 相对于java
 *      可以有顶层函数
 *      可以有嵌套函数
 *      可以有中缀函数
 *可变参数：vararg关键字
 */
fun main(args: Array<String>) {
    var method :MiddleMethod = MiddleMethod()
    method method null
    method method2 null
}

//调用方法
// var method :MiddleMethod = MiddleMethod()
//   method method null
//中缀函数
//一个函数为成员函数或者拓展函数，并且只有一个参数，并且使用infix修饰。在进行函数调用的时候可以使用中缀方式调用
class MiddleMethod
{
    //成员函数
    infix fun method(str :String?)
    {
        println("中缀函数中的成员函数")
    }
}

//调用方法
// var method :MiddleMethod = MiddleMethod()
//  method method2 null
//拓展方法，此方法前必须用一个引用型类型，调用如下：
infix fun MiddleMethod.method2(str :String?)
{
    println("中缀函数的拓展方法")
}


//方法嵌套方法
fun save(str :String?)
{
    fun save2()
    {
        println("方法嵌套")
    }
    save2()
}

/**
 * 顶层函数也可以称为包级别函数，就是一个函数，可以直接放到某一个包里面，
 * 而不用一定需要放到某一个类里面。在Java里面一个方法，必须属于一个类，
 * 在Kotlin中，方法可以独立存在。其实我们之前写的很多函数都是顶层函数，
 * 比如我们的main方法
 */


//myfun(3,"a","a","a","a","a")
//可变参数用 vararg来修饰，一定要放在参数的最后一个
fun myfun(x :Int,vararg y :String)
{
    println(x)
    println("y size:"+y.size)
    println("~~~~~~~~~~~~~~~~")
    for (s in y)
    {
        println(s)
    }
}

