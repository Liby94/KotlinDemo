package kotli.isoftstone.com

import kotlin.properties.Delegates

/**
 *创建者：liby
 *创建时间：2017/12/19 1:03
 *工程名：KotlinDemo
 *描述：kotlin 5大内置委托  这个挺重要的，需要完全的回顾一下    TODO 2017-12-19 1:31:45 @author liby
 * 延迟加载(Lazy)
 * 可观察属性(Observable)
 * Vetoable
 * notNull
 * 将多个属性保存在一个map内
 */
fun main(args: Array<String>) {
//    println(lazyValue)
//    println(lazyValue)

//    println("userName的初始化:${ userName}")
//    userName = "测试数据A"
//    userName = "测试数据B"

//    println(userToken)
//    userToken = "abctest"
//    userToken = "abc"
//    println(userToken)

    var map: MutableMap<String,Any?> = mutableMapOf(
            "name" to "user1",
                    "age" to 25
    )
    var user = User(map)
    println(user.name)
    println(user.age)

    println("------------------")
    map.put("name","green dao")
    map.put("age",30)

    println(user.name)
    println(user.age)

}

//将多个属性保存在一个map内
//val/var 变量: 变量类型by 实现Map接口的对象
/*
提示：
    针对下面代码用到的MutableMap，也可以改为其他map，但是如果要想修改map集合里面的值，必须使用MutableMap接口对象。
 */
class User(val map: MutableMap<String,Any?>)
{
    val name: String by map;
    val age: Int by map;
}


//notNull
/*
    格式
        var 变量：变量类型 by Delegates.notNull<变量类型>()
        还可以使用lateinit关键字
        lateinit var 变量: 变量类型
 */
//编译器允许后续赋值，使用时一定要赋值
var userSeison: String by Delegates.notNull<String>()

//Vetoable
/*
    格式：
        var 变量: 变量类型 by Delegates.vetoable(初始化值)
        {
            prop,old,new ->
            dosomething()
            true/flase
        }

        Lambda 返回true：变量会被修改

        Lambda返回false：变量不会被修改
 */
var userToken: String by Delegates.vetoable("usertest")
{
    prop,old,new->
    println("属性变化的响应器被触发")
    println("属性的name:${prop.name}")
    println("属性的old:${old}")
    println("属性的new:${new}")
    new.contains("test")
}

//可观察属性(Observable)
/*
   格式
        var/val 变量: 变量类型 by observable(参数初始化值)
        {
            prop,old,new ->
            dosomething()
        }
        其中Lambda表达式（变化事件的响应器）会在变量的setter()被调用的时候触发。

        Lambda里面可以获取三个参数：

        prop-被赋值的属性；

        old-赋值前的旧属性值；

        new-赋值后的新属性值；
 */
var userName:String by Delegates.observable("测试数据")
{
    prop,old,new ->
    println("属性值变化事件")
    println("属性的名字:${prop.name}")
    println("属性的旧值:${old}")
    println("属性的新值:${new}")
}


//延迟加载(Lazy)
//格式
/**
    val/var 变量: 变量类型 by lazy{
        变量初始化代码
    }
    延迟属性只有在访问的时候才会被初始化。

    延迟属性只会初始化一次

 */
//上面的左括号不能换行，格式固定
val lazyValue: String by lazy{
    println("延迟加载")
    "kotlin"
}

