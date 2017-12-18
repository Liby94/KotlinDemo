package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/18 21:11
 *工程名：KotlinDemo
 *描述：类的构造函数之次构函数
 */
fun main(args: Array<String>) {
    var people:People = People("a",12)
    people.printInfo()
    println("~~~~~~~~~~~~~~~~~~~")
    var peo1:People2 = People2()
    var peo2:People2 = People2()


}

//次构函数
class People
{
    var name: String = ""
    var age: Int = 0


    constructor(name: String,age: Int)
    {
        this.name = name;
        this.age = age;
    }

    fun printInfo(): Unit
    {
        println("我是${name},我今年${age}")
    }

}

class People1(name: String)
//这种写法也是可以的
//class People1(var name: String)
{
    var age: Int = 0
//    次构函数不支持加上var或val来修饰
//    constructor(val name: String,age: Int): this(name)
    constructor(name: String,age: Int): this(name)
    {
        this.age = age
    }
}

//初始化
class People2
{
    //相当于代码块，给所有对象初始化用的
    init {
        println("初始化方法")
    }

}

