package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/28 11:03
 *工程名：KotlinDemo
 *描述：分支语句   When
 */
fun main(args: Array<String>) {
    var score = 100
    when(score)
    {
        in 85 .. 100 -> println("评级:优")
        in 70 until 85 -> println("评级:良")
        in 10 until 70 -> println("评级:中")
        in 0 .. 10 -> println("评级:差")
    }


}