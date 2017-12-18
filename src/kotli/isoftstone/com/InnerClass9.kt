package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/18 23:02
 *工程名：KotlinDemo
 *描述：嵌套类和数据类
 */
fun main(args: Array<String>) {
    //创建内部类对象
    var inner: Outer.Inner = Outer.Inner()
    inner.innerFun()

    var inn: Outer1.Inner1 = Outer1().Inner1()
    inn.innerFun()

    println("~~~~~~~~~~~~~~~数据类~~~~~~~~~~~~~~~~")
    var humman1: Humman = Humman("ab",23)
    var humman2: Humman = Humman("cd",23)
    println(humman1)//封装了toString方法
    println(humman2)
    println("humman1 == humman2: ${humman1 == humman2}")//封装了hashcode和equals方法
    val humman3 = humman1.copy()//copy对象
    println(humman3.toString())
    var (name,age) = humman1
    var (name1,age1) = humman2

    println("name:$name1,age:$age1")
}

class Outer
{
    class Inner
    {
        fun innerFun(): Unit
        {
            println("Inner")
        }
    }
}

class Outer1
{
    var temp = 10
    //如果需要访问外部类成员变量，需要在内部类加上inner关键字
    inner class Inner1
    {
        fun innerFun()
        {
            println("inner ${temp}")
        }
    }
}

//数据类 用data修饰
data class Humman(var name: String,var age: Int)