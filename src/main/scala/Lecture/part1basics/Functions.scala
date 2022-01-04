package Lecture.part1basics

object Functions extends App {

  def aFunction(a: String,b: Int): String = {
    a + " " + b
  }

  println(aFunction("Hello", 3))

  def aParameterlessFunction() : Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n==1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("Hello", 3))

//  when u need loop, use recursion


  def aFunctionsideeffect(aString: String): Unit = println(aString)

  def aBigfunction(n: Int): Int = {
    def aSmallfunction(a: Int, b: Int): Int = a + b

    aSmallfunction(n, n-1)
  }
//Exercise 1 :
  def greeting(aName: String,age: Int): String =
    "Hi, My name is " + aName + " and i am " + age + " Years old"
  println(greeting("Sonali", 25))

//  Exercise 2 :
  def factorial(n: Int): Int =
    if (n<=0) 1
    else n * factorial(n-1)
    println(factorial(5))

// Exercise 3:
  def fibonacci(n: Int): Int =
    if (n<=2) 1
    else fibonacci(n-1) + fibonacci(n-2)
    println(fibonacci(8))


}
