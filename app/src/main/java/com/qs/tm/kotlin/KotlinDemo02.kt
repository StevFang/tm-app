package com.qs.tm.kotlin

import java.io.File
import java.lang.Integer.parseInt
import java.nio.file.Files
import java.nio.file.Paths
import java.text.NumberFormat

/**
 * Created by fbin on 2018/4/3.
 */
// 创建DTOs(POJOs/POCOs) 数据类
data class Customer(val name: String, val email: String)

// 函数 默认参数
fun foo(a:Int=0,b:String=""){

}

// 过滤 list
fun filterList(){
    var items = listOf(111,222,333)
    //items.filter { x -> x>0 }
    items.filter{it>0}
}

// 字符串插值
fun strInsert(str: String){
    println("string is $str")
}

// 实例检查
fun implCheck(obj: Any){
    var result = when(obj){
        is Number -> 1
        is String -> "1"
        else -> "I don't no what is this"
    }
    println(result.toString())
}

// 遍历map/list 键值对
fun forEachMap(map: Map<String, Integer>){
    for((k, v) in map){
        println("$k -> $v")
    }
}

// 使用range
fun useRange(){
    var x = 0
    for (i in 1..100) {  }  // 闭区间: 包括100
    for (i in 1 until 100) {  } // 半开区间: 不包括100
    for (x in 2..10 step 2) {  }
    for (x in 10 downTo 1) {  }
    if (x in 1..10) {  }
}

// 只读 list
val list = listOf("a", "b", "c")
// 只读map
val map = mapOf("a" to 1, "b" to 2, "c" to 3)

// 访问 map
fun accessMap(value: Integer){
    var map2 = linkedMapOf<String, Integer>("key" to Integer(1), "kkk" to Integer(2))
    println(map2["key"])
    map2["key"] = value
}

// 延迟加载
//var p:String by lazy{

//}

// 扩展函数
fun String.spcaceToCamelCase() {  }
fun test1(){
    "Convert this to camelcase".spcaceToCamelCase()
}

// 单例模式
object Resource{
    val name = "Name"
}

// 如果不为空则... 的简写
fun testIfNotNullThen(){
    val files = File("Test").listFiles()
    println(files?.size)
}

// 如果不为空...否则... 的简写
fun testIfNotNullThenElse(){
    val files = File("test").listFiles()
    println(files?.size ?: "empty")
}

// 如果声明为空执行某操作
fun defineNullThen(){
    var data = null
    data?.let{
        //如果不为空执行该语句块
    }
}

var defaultValueIfDataIsNull = null
// 如果不空则映射(Map nullable value if not null)
fun notNullThenMap(){
    val data = null
    val mapped = data?.let { transformData(it) } ?: defaultValueIfDataIsNull
}
fun transformData(map: Map<String, Object>){
    for((k, v) in map){
        println("$k -> $v")
    }
}

// 返回 when 判断
fun transform(color: String): Int {
    return when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value")
    }
}

// try catch expression
fun test2(){
    val result = try {
        count()
    }catch (e: ArithmeticException){
        throw IllegalStateException(e)
    }
    // operate result
}
fun count(): Int {
    return parseInt("sss")
}

// if expression
fun test3(param: Int){
    var result = if (param == 1){
        println(param)
    }else if(param == 2){
        println(param)
    }else{
        println(param)
    }
}

// 使用生成器模式返回 Unit
fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}

// 单表达式函数
fun theAnswer() = 42
// 与下面的语句是等效的
fun theAnswer2(): Int {
    return 42
}
fun transform2(color: String): Int = when (color) {
    "Red" -> 0
    "Green" -> 1
    "Blue" -> 2
    else -> throw IllegalArgumentException("Invalid color param value")
}

// 利用 with 调用一个对象实例的多个方法
class Turtle {
    fun penDown(){}
    fun penUp(){}
    fun turn(degrees: Double){}
    fun forward(pixels: Double){}
}
fun test4(){
    val myTurtle = Turtle()
    with(myTurtle) { //draw a 100 pix square
        penDown()
        for(i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
}

// Java 7’s try with resources
fun test5(){
    val stream = Files.newInputStream(Paths.get("/some/file.txt"))
    stream.buffered().reader().use { reader ->
        println(reader.readText())
    }
}

// 需要泛型类型信息的泛型函数的简便形式
//final class Gson {
    //     ...
    // public <T> T fromJson(JsonElement json, Class<T> classOfT) throws JsonSyntaxException {
    //     ...
    //inline fun <reified T : Any> Gson.fromJson(json): T = this.fromJson(json, T::class.java)
//}

// 消费一个可能为空的布尔值
var a1: Int = 1
var a2: Int = 3
var b: Boolean? = a1> a2
fun test6() {
    if (b == true) {
        // right
    }else{
        // ...
    }
}






























