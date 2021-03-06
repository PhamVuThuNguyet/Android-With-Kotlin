package lesson_3

import kotlin.math.roundToInt

open class Aquarium(open var width: Int = 100, open var height: Int = 40, open var length: Int = 20) {
    // class should have many init blocks
    // They are executed in the order in which they appear in the class definition
    // and all of them are executed when the constructor is called.
    init {
        println("Aquarium is initializing...")
        // init block should have many statements
    }

    // Every secondary constructor must call the primary constructor first
    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1

        // calculate the height needed
        height = (tank / (length * width)).toInt()
    }

    // If you want a property that your code can read or write, but outside code can only read
    // you can leave the property and its getter as public and declare the setter private.
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape = "rectangle"
    open var water: Double = volume * 0.9

    fun printSize() {
        println(
            "Width: $width cm\nHeight: $height cm\nLength: $length cm\nVolume: $volume\n" +
                    "Water: $water liters (${water / volume * 100.0}% full)"
        )
    }
}