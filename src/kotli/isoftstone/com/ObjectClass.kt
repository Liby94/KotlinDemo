package kotli.isoftstone.com

import java.util.*

/**
 *创建者：liby
 *创建时间：2017/12/19 1:51
 *工程名：KotlinDemo
 *描述：Object关键字
 */
fun main(args: Array<String>) {

//    var sig1 = SingleObject
//    var sig2 = SingleObject
//    println(sig1 == sig2)
//    println(sig1)
//    println(sig2)

    //匿名内部类1
//    var button: Buttn = Buttn()
    //在Kotlin中匿名内部类的实现方式
//    button.setOnClickListener(object : OnClickListener{
//        override fun onClick() {
//
//        }
//    })

    //匿名内部类2
//    val gougou = object : Animial("猫猫")
//    {
//        override fun eat() {
//            println("eat fish")
//        }
//    }
//    gougou.eat()

    //匿名内部类3
//    val test = object {
//        var name = "abc"
//        var age = 18
//    }
//    println(test.name)
//    println(test.age)

    //伴生对象的两种调用方式
    AAA.b
    AAA.BBB.b()


}

/*
    伴生对象可以有自己的方法和属性，甚至可以实现接口，继承类。
    伴生对象内的方法访问可以有【外部类.内部类.方法()】的形式以及【外部类.方法()】。
    伴生对象内的属性访问可以有【外部类.内部类.属性】的形式以及【外部类.属性】
 */
interface ITest

open class CCC
class AAA
{
    var a = 1
    fun a():Unit
    {
        println("a...")
    }

    companion object BBB: ITest,CCC(){
        var b: Int = 2
        fun b(): Unit
        {
            println("b = ${b}")
        }
    }
}


class Test(var name: String,var age: Int)

open class Animial(var name: String)
{
    open fun eat()
    {
        println("eat...eat...eat")
    }
}

//Kotlin中的单例,那个类要单例，就在那个类的前面加上object关键字
object SingleObject

//在Kotlin中，没有匿名内部类，但是可以通过Object来完成
interface OnClickListener
{
    fun onClick()
}

class Buttn
{
    fun setOnClickListener(listener: OnClickListener): Unit
    {
        listener.onClick()
    }
}

