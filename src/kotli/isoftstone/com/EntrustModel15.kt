package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/19 0:56
 *工程名：KotlinDemo
 *描述：委托模式
 */
fun main(args: Array<String>) {
    var bigson: BigSon = BigSon()
    var smallFather: SmallFather = SmallFather(bigson)
    println("be careful")
    smallFather.wash()
    println("check")
}

interface IWash
{
    fun wash()
}

class BigSon: IWash
{
    override fun wash() {
        println("洗碗....")
    }
}

//委托模式
class SmallFather(var iwash: IWash): IWash by iwash



