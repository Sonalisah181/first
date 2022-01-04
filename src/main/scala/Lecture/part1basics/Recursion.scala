package Lecture.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n - 1)

// 2nd way of factorial and even its valid for very large number
//  :: Tail recursion : USE recusive call as the LAST expression
  def anotherFactorial(n: Int): Int = {
  @tailrec
    def factHelper (x: Int, accumulator: Int): Int =
      if (x <= 1) accumulator
      else factHelper(x-1, x * accumulator)

      factHelper(n,1)
    }
  println(anotherFactorial(8))

//  Exercise 1:: Concatenate String and Time using tail recursion
  @tailrec
  def concatenateTailrec(aString: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatenateTailrec(aString, n-1, aString + accumulator)

  println(concatenateTailrec("Hello", 4, ""))


//Exercise 2:: Isprime function tail reursive

  def IsPrime(n: Int): Boolean = {
  @tailrec
    def isprimetailrec(t: Int, isStillprime: Boolean): Boolean =
      if (!isStillprime) false
      else if (t <= 1) true
      else isprimetailrec(t-1, n%t != 0 && isStillprime)

      isprimetailrec(n/2, true)
    }
    println(IsPrime(2003))
    println(IsPrime(629))


//  Exercise 2:: Fibonacci series tail recursion
  def fibonacci(n: Int): Int = {
    @tailrec
    def fibonacciTailrec(i: Int, last: Int, secLast: Int): Int =
      if (i >= n) last
      else fibonacciTailrec(i+1, last + secLast, last)

    if (n <= 2) 1
    else fibonacciTailrec(2,1,1)

  }
  println(fibonacci(8))
}