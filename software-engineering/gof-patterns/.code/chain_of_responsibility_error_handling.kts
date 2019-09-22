#!/usr/bin/env kotlinc -script
import kotlin.random.Random

abstract class ExceptionHandler(private val handler: ExceptionHandler?) {
    fun handle(e: Exception): Boolean {
        if(handleException(e)) {
            return true
        }else if(handler != null) {
            return handler.handle(e)
        }else {
            return false
        }
    }

    protected abstract fun handleException(e: Exception): Boolean
}

class LogException(handler: ExceptionHandler?) : ExceptionHandler(handler) {
    protected override fun handleException(e: Exception): Boolean {
        println("Logging exception $e to remote server ...")
        return false
    }
}

class NothingException(handler: ExceptionHandler?) : ExceptionHandler(handler) {
    protected override fun handleException(e: Exception): Boolean {
        println("I am not doing anything with $e")
        return false
    }
}

class DoSomething(handler: ExceptionHandler?) : ExceptionHandler(handler) {
    protected override fun handleException(e: Exception): Boolean {
        println("I succesfully recover from the error.")
        return true
    }
}

val doSomething = DoSomething(null)
val nothingHandler = NothingException(doSomething)
val logException = LogException(nothingHandler)

logException.handle(Exception())
