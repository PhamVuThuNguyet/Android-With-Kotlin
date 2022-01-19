package lesson_3

abstract class AquariumFish: FishAction {
    abstract var color: String
    override fun eat() {
        println("Fish is eating...")
    }
}

class Shark(override var color: String) : AquariumFish(), FishAction {
    override fun eat() {
        println("Shark is eating...")
    }
}

class Plecostomus : AquariumFish(), FishAction {
    override var color: String
        get() = "gold"
        set(value) {}

    override fun eat() {
        println("Plecos is eating...")
    }
}