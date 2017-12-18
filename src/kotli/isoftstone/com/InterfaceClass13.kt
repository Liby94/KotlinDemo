package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/19 0:10
 *工程名：KotlinDemo
 *描述：接口
 */
fun main(args: Array<String>) {
    Button().click()
    Button().print()
}

interface Clickable
{
    fun click()

    //接口中可以带有普通方法
    fun print()
    {
        println("clickable")
    }
}

//实现接口
class Button: Clickable
{
    override fun click() {
        println("点击事件")
    }
}

//如果不实现方法就变成抽象类
abstract class View: Clickable{}

//接口多实现
interface AInterface
{
    fun show()
    {
        println("A")
    }
}
interface BInterface
{
    fun show()
    {
        println("B")
    }
}

class CClass: AInterface,BInterface{
    //如果两个接口中有同名的方法，那么实现其的子类必须重写该方法
    override fun show() {
        println("CLASS")
    }


}