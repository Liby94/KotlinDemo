package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/18 23:46
 *工程名：KotlinDemo
 *描述：
 */
fun main(args: Array<String>) {
    var man: Man = Man()
    var woman: WoMan = WoMan()
    println(man.xingwei())
    println(woman.xingwei())
}

open class Human
{
    //如果允许子类重写的话，需要加上open关键字
    open var hair: String = "头发"
    open fun xingwei(): String
    {
        return ""
    }
}

//继承关系
class Man: Human()
{
    //如果重写了父类的属性或方法，需要通过override标记
    override var hair: String
        get() = "短头发"
        set(value) {}
    override fun xingwei(): String {
        return "抽烟"+hair
    }
}
class WoMan: Human()
{
    override var hair: String
        get() = "长头发"
        set(value) {}
    override fun xingwei(): String {
        return "化状"+hair
    }
}