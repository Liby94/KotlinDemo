package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/18 20:56
 *工程名：KotlinDemo
 *描述：类的构造函数之主构函数
 */
fun main(args: Array<String>) {
    var person = Person("测试数据",12)
    person.printInfo()
    var per = Person1("测试数据",123)
    per.printInfo()

    var pers:Person2 = Person2()
    pers.printInfo()
    println("~~~~~~~~~~~~~~~~~")
    var pers1 = Person2("ab")
    pers1.printInfo()
    println("~~~~~~~~~~~~~~~~~")
    var pers2 = Person2(age = 13)
    pers2.printInfo()
    println("~~~~~~~~~~~~~~~~~")
    var pers3 = Person2("cc",age = 13)
    pers3.printInfo()
}

class Person2(var name: String = "abc",var age: Int = 12)
{
    fun printInfo()
    {
        println("我是${name},我今年${age}")
    }
}

//在主构造函数上加一个变量，这样表示为该类定义了一个对应的成员属性，免去了在类中定义成员属性
class Person1(var name: String,var age: Int)
{
    //成员方法
    fun printInfo():Unit
    {
        println("我是$name,我今年$age")
    }
}

class Person(name: String,age: Int)
{
    var name = name;
    var age = age;

    fun printInfo():Unit
    {
        println("我是$name,我今年${age}")
    }
}