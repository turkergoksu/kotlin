abstract class Animal(val age: Int, val name: String, val weight: Double)

class Dog(age: Int, name: String, weight: Double) : Animal(age, name, weight)

class Cat(age: Int, name: String, weight: Double) : Animal(age, name, weight)

val animalsInShelter = listOf(
    Dog(6, "Bobby", 10.2),
    Dog(2, "Doug", 3.7),
    Cat(2, "Cutie", 2.3),
    Dog(5, "Hugo", 3.1),
    Dog(1, "Bark", 1.4),
    Cat(4, "Cuddly Paws", 5.0),
    Dog(2, "The Count", 1.2),
    Cat(3, "Black Eyes", 1.8),
    Cat(2, "Meow", 3.2),
    Cat(8, "Cloudy", 4.1),
)

fun main() {
    // You can write some code here to test if below functions work
}

fun allDogs() {
    TODO("implement")
}

fun allCats() {
    TODO("implement")
}

fun allDogsInSortedInAlphabeticalOrder(): List<Dog> {
    TODO("implement")
}

fun allCatsInSortedInReverseAlphabeticalOrder(): List<Cat> {
    TODO("implement")
}

fun animalsWhoWeighsLessThanFour(): List<Animal> {
    TODO("implement")
}

fun catsSortedByTheirAgesInAscendingOrder(): List<Cat> {
    TODO("implement")
}

fun dogSortedByTheirAgesInDescendingOrder(): List<Dog> {
    TODO("implement")
}

fun animalsWhoHasSpaceCharacterInTheirName(): List<Animal> {
    TODO("implement")
}

fun numberOfAnimalsWhichAreOlderThanThree(): Int {
    TODO("implement")
}

fun sumOfWeightsOfAllCats(): Double {
    TODO("implement")
}

fun catWithMaximumAge(): Cat {
    TODO("implement")
}

fun dogWithLongestName(): Dog {
    TODO("implement")
}

fun animalsWhoAreYoungerThanFourAndHeavierThanTwo(): List<Animal> {
    TODO("implement")
}

fun areAllCatsHeavierThanAllDogs(): Boolean {
    TODO("implement")
}

fun areThereMoreCatsThanTheDogs(): Boolean {
    TODO("implement")
}

fun isThereAnyAnimalWhichHasLetterCInTheirName(): Boolean {
    TODO("implement")
}

fun findTheAnimalWithNameHugo(): Animal {
    TODO("implement")
}
