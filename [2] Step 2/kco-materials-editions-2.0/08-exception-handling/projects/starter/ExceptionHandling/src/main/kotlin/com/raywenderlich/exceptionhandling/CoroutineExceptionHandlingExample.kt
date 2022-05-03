package com.raywenderlich.exceptionhandling

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
  val asyncJob = GlobalScope.launch {
    println("1. Exception created via launch coroutine")
    // Will be printed to the console by
    // Thread.defaultUncaughtExceptionHandler
    throw IndexOutOfBoundsException()
  }
  val deferred = GlobalScope.async {
    println("3. Exception created via async coroutine")
    // Nothing is printed, relying on user to call await
    throw ArithmeticException()
  }
  println("Start------0")
  asyncJob.join()
  println("2. Joined failed job")
  try {
    println("Start------1")
    deferred.await()
    println("4. Unreachable, this statement is never executed")
  } catch (e: Exception) {
    println("5. Caught ${e.javaClass.simpleName}")
  }
}
