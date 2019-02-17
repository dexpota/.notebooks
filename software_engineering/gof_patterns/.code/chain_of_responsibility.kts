#!/usr/bin/env kotlinc -script
import kotlin.random.Random

abstract class Handler(val handler: Handler?) {
    abstract fun handle(value: Int)
}

class NegativeHandler(handler: Handler?) : Handler(handler) {
    override fun handle(value: Int) {
        if (value < 0) {
            println("Negative value handled $value")
        }else {
            handler?.handle(value)
        }
    }
}

class PositiveHandler(handler: Handler?) : Handler(handler) {
    override fun handle(value: Int) {
        if (value > 0) {
            println("Positive value handled $value")
        }else {
            handler?.handle(value)
        }

    }
}

class ZeroHandler(handler: Handler?) : Handler(handler) {
    override fun handle(value: Int) {
        if (value == 0) {
            println("Zero value handled $value")
        }else {
            handler?.handle(value)
        }
    }
}

val firstHandler = PositiveHandler(null)
val secondHandler = NegativeHandler(firstHandler)
val thirdHandler = ZeroHandler(secondHandler)

val randomValues = List(10) { Random.nextInt(-10, 10) }

for(value: Int in randomValues) {
    thirdHandler.handle(value)
}