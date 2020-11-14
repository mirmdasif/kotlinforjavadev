package net.asifhossain.kotlinforjavadev.week2

open class Parent
class Child: Parent()

fun Parent.foo() = "parent"
fun Child.foo() = "child"

fun String.get(index: Int): Char = '*'

fun main(args: Array<String>) {
    val parent: Parent = Child()
    println(parent.foo())

    println("abc".get(1))
}

