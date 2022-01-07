package lesson_3

fun buildAquarium() {
    var myAquarium = Aquarium()
    // default param
    myAquarium.printSize()

    // mutable
    myAquarium.width = 600
    println("\nAfter change: ")
    myAquarium.printSize()

    // default width
    println("\n")
    myAquarium = Aquarium(height = 200, length = 600)
    println("Default width:")
    myAquarium.printSize()

    // with fish
    println("\n")
    myAquarium = Aquarium(numberOfFish = 29)
    myAquarium.printSize()

    // set volume
    println("\nChange volume:")
    myAquarium.volume = 70
    myAquarium.printSize()
}

fun main() {
    buildAquarium()
}