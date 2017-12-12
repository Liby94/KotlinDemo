package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/12 23:57
 *工程名：KotlinDemo
 *描述：kotlin函数
 * Kotlin相对于java，
 * 相对于java：
 *     1.表达式可以去掉方法大括号，代码更清爽
 *     2.命名参数，提高代码可读性
 *     3.默认参数，形参定义上带上参数值
 *     4.命名参数+默认参数，取代繁锁的重载
 */
fun main(args: Array<String>)
{
    //可以使用这种方式来提高代码的可读性
    method(what = "a",where = "",why = "2")
    //也可以用这种
    method("","","")
    //不能如下混合使用,会报错
//    method(what = "","","")

    //调用method2方法的多种形式
    method2()
    method2("a")
    method2("a",false)
    method2("a",false,4)
    //注意：不能跳过参数去调用，如第二个参数为boolean类型,如下调用会报错的
//    method2(false)
    //但是可以这样传递指定位置的参数
    method2(args1 = false)
}

//这里不加private报错，why?
//在Kotlin中没有protect修饰符
//另一种声明方法的方式,写Demo时用的吧
private fun method2(args :String = "",args1 :Boolean = true,args2 :Int = 3)
{

}


//这里不加private报错，不能使用method来做为方法名或者包含method
private fun method(what :String,where :String ,why :String)
{

}

fun noParmas() = print("无参无返回值")

fun noParmas(str :String)
{
    print("有参无返回值")
}

//这种写法只适合于javabean写法，如果里面的代码不是直接return object，则不能这样缩写
//如果方法体不止一行，就没法转换为表达式函数体,
    //针对函数体只有一行代码的情况，多了一种表达形式。
    //针对函数体只有一行代码的情况，代码显得更加清爽，没有了大括号。
    //表达式函数体支持返回类型自动推断。显得比较智能
fun noReturnParmas(str :String) :String
        = //    print("有参无返回值")
        str

fun hasParmas(str :String)
{
    print("有参无返回值")
}

//如该方法里面不止一行，则不能转换
fun hasReturnParmas(str :String) :String
{
    print("有参有返回值")
    return str;
}
