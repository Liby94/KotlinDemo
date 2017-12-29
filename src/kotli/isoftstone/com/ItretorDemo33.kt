package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/28 11:09
 *工程名：KotlinDemo
 *描述：循环语句
 */
fun main(args: Array<String>) {
    var range = 1 .. 100
    loop1@ for (c in range step 2)
    {
        loop2@ for (d in range)
        {
            if(d == 1)
            {

                break@loop2
            }
        }
        println(c)
    }
}