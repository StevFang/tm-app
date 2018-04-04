package com.qs.tm.kotlin

/**
 * Created by fbin on 2018/4/3.
 */
import java.lang.Integer.parseInt
import java.sql.DriverManager.println

// define sum function
fun sum(a:Int, b:Int): Int{
    return a+b
}

fun sum2(a:Int, b:Int) = a + b

// return Unit
fun printSum(a:Int, b:Int): Unit{
    println("a + b = ${a+b}")
}

fun printSum2(a:Int, b:Int){
    println("a + b is ${a+b}")
}

// define local variable readonly
fun localVar(){
    val a: Int = 1  // 立刻赋值
    val b = 2   // `Int` 类型是自推导的
    // 经验证报错
    val c: Int  // 没有初始化器时要指定类型
    c = 3       // 推导型赋值

    // writable
    var x = 10
    x += 1
}

// comments
/*
    comments
 */

// string model
fun localVar2(){
    var a = 1
    // simple name in template:
    val s1 = "a is $a"

    a = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a"
}

// condition expression
fun maxOf(a: Int, b:Int): Int{
    if(a > b){
        return a;
    }else{
        return b;
    }
}

fun maxOf2(a:Int,b:Int) = if(a>b) a else b

// null able return
fun nullAble(str:String): Int?{
    return str.toIntOrNull();
}

fun printProduct(x:String,y:String){
    var a = parseInt(x)
    var b = parseInt(y)
    if(a == null){
        println("Wrong number format in arg1: '${x}'")
        return
    }
    if(b == null){
        println("Wrong number format in arg1: '${y}'")
        return
    }
    // x and y are automatically cast to non-nullable after null check
    println(a * b)
}

// 使用值检查以及自动转换
fun getStringLength(obj: Any):Int?{
    if(obj is String){
        return obj.length
    }
    return null
}
fun getStringLength2(obj: Any):Int?{
    if(obj !is String) return null
    return obj.length
}
fun getStringLength3(obj: Any):Int?{
    if(obj is String && obj.length > 0){
        return obj.length
    }
    return null
}

// for循环
fun forTest(){
    var items = listOf<String>("111", "222", "333")
    for(item in items){
        println(item)
    }

    var items2 = listOf("111","222","333")
    for(index in items.indices){
        println("item value is ${items[index]}")
    }
}

// 使用 while 循环
fun whileTest(){
    var items = listOf("111", "222", "333")
    var index = 0
    while(index < items.size){
        println("item value is ${items[index]}")
        index++
    }
}

// when expression
fun describe(obj: Any): String= when(obj){
    "1" -> "one"
    "Hello"    -> "Greeting"
    is Long    -> "Long"
    !is String -> "Not a string"
    else       -> "Unknown"
}

// 使用range
fun testRange(){
    var x = 10
    var y = 9
    if(x in 1..y+1){
        println("fits in range")
    }

    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too")
    }

    for (x in 1..5) {
        print(x)
    }

    for (x in 1..10 step 2) {
        print(x)
    }

    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}


// 使用集合

// 对一个集合进行迭代
fun testList(){
    var items = listOf("222", "333", "orange", "app")
    for (item in items) {
        println(item)
    }
    // 使用 in 操作符检查集合中是否包含某个对象
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
    // 使用lambda表达式过滤和映射集合：
    var fruits = listOf("orange", "app", "pear")
    fruits.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}
















