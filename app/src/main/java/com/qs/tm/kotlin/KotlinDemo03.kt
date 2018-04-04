package com.qs.tm.kotlin

/**
 * Created by fbin on 2018/4/3.
 */
var temp: Int = 11
var t1: Int? = temp
var t2: Int? = temp
fun test7(){
    println(t1===t2)
    println(t1==t2)
}

// 创建一个 Array<String>  内容为 ["0", "1", "4", "9", "16"]
val asc = Array(5, {i -> (i * i).toString() })

// main方法
fun main(args: Array<String>){
    test7()
}