package kotli.isoftstone.com

/**
 *创建者：liby
 *创建时间：2017/12/11 7:02
 *工程名：KotlinDemo
 *描述：?和?. 和!! 和?:
 * Kotlin=引入了Null机制,null机制总结起来，依靠就是把变量分为了可空类型和不可空类型
 * 可空类型和不可空类型在变量赋值和调用方面有了各自的限制
 * ?（可空类型变量）
 * ?. 安全调用符
 * ?:( Elvis操作符)
 */
fun main(a: Array<String>) {
    var price :String
    //可空类型变量
    var age :String? = null
    //  ?: 指定返回值     如果age的对象为空，则指定返回的值为 -1
    var a = age?.toInt()?: age?.toInt();
    println(a)
}

private fun method1() {
    //可空类型变量
    var age: String? = null
    //  ?. 安全调用符        如果对象为空则返回值为null，如果对象不为空，则执行
    val int = age?.toInt()
    print(int)
    //  !!. 非空断言
    val toInt = age!!.toInt()
    print(toInt)
}

private fun method() {
    //非空类型变量
    var price: String
    //? 可空类型变量    这种类型的可以赋值为null
    var age: String? = null

    if (null != age)     //Kotlin约定“如果一个变量，进行了非空判断，该变量的类型就变成了非空类型
    {
        age.toInt()
    }
}