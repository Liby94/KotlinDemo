package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/18 23:59
 *工程名：KotlinDemo
 *描述：抽角类
 */
fun main(args: Array<String>) {
    var fish: Animal = Fish()
    var tigger:Animal = Tigger()
    fish.eat()
    tigger.eat()

}

open abstract class Animal
{
    //抽象类中必须可以包含抽角的属性，但是这个抽象属性不能被实例化
    abstract var temp: String
    open abstract fun eat()
}

class Fish: Animal()
{
    override var temp: String = "fish"

    override fun eat() {
        println("用嘴")
    }
}

class Tigger: Animal()
{
    override var temp: String = "tigger"
    override fun eat() {
        println("用爪")
    }

}