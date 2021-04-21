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
//    allDogs()
//    allCats()
//    allDogsInSortedInAlphabeticalOrder()
//    allCatsInSortedInReverseAlphabeticalOrder()
//    animalsWhoWeighsLessThanFour()
//    catsSortedByTheirAgesInAscendingOrder()
//    dogSortedByTheirAgesInDescendingOrder()
//    animalsWhoHasSpaceCharacterInTheirName()
//    numberOfAnimalsWhichAreOlderThanThree()
//    sumOfWeightsOfAllCats()
//    catWithMaximumAge()
//    dogWithLongestName()
//    animalsWhoAreYoungerThanFourAndHeavierThanTwo()
//    areAllCatsHeavierThanAllDogs()
//    areThereMoreCatsThanTheDogs()
//    isThereAnyAnimalWhichHasLetterCInTheirName()
    findTheAnimalWithNameHugo()
}

fun allDogs() {
    println(animalsInShelter.filterIsInstance<Dog>())
}

fun allCats() {
    println(animalsInShelter.filterIsInstance<Cat>())
}

fun allDogsInSortedInAlphabeticalOrder(): List<Dog> {
    animalsInShelter.filterIsInstance<Dog>().sortedBy { it.name }.forEach {
        println(it.name)
    }
    return animalsInShelter.filterIsInstance<Dog>().sortedBy { it.name }
}

fun allCatsInSortedInReverseAlphabeticalOrder(): List<Cat> {
    animalsInShelter.filterIsInstance(Cat::class.java).sortedByDescending { it.name }.forEach {
        println(it.name)
    }
    return animalsInShelter.filterIsInstance(Cat::class.java).sortedByDescending { it.name }
}

fun animalsWhoWeighsLessThanFour(): List<Animal> {
    animalsInShelter.filter { it.weight < 4 }.forEach { println("${it.name} ${it.weight}") }
    return animalsInShelter.filter { it.weight < 4 }
}

fun catsSortedByTheirAgesInAscendingOrder(): List<Cat> {
    animalsInShelter.filterIsInstance<Cat>().sortedBy { it.age }.forEach { println("${it.name} ${it.age}") }
    return animalsInShelter.filterIsInstance<Cat>().sortedBy { it.age }
}

fun dogSortedByTheirAgesInDescendingOrder(): List<Dog> {
    animalsInShelter.filterIsInstance<Dog>().sortedByDescending { it.age }.forEach { println("${it.name} ${it.age}") }
    return animalsInShelter.filterIsInstance<Dog>().sortedByDescending { it.age }
}

fun animalsWhoHasSpaceCharacterInTheirName(): List<Animal> {
    animalsInShelter.filter { it.name.any { char -> char == ' ' } }.forEach { println("${it.name}") }
    return animalsInShelter.filter { it.name.any { char -> char == ' ' } }
}

fun numberOfAnimalsWhichAreOlderThanThree(): Int {
    println(animalsInShelter.count { it.age > 3 })
    return animalsInShelter.count { it.age > 3 }
}

fun sumOfWeightsOfAllCats(): Double {
    println(animalsInShelter.filterIsInstance<Cat>().sumByDouble { it.weight })
    return animalsInShelter.filterIsInstance<Cat>().sumByDouble { it.weight }
}

fun catWithMaximumAge(): Cat {
    println(animalsInShelter.filterIsInstance<Cat>().maxByOrNull { it.age }?.name)
    return animalsInShelter.filterIsInstance<Cat>().maxByOrNull { it.age }!!
}

fun dogWithLongestName(): Dog {
    println(animalsInShelter.filterIsInstance<Dog>().maxByOrNull { it.name.length }?.name)
    return animalsInShelter.filterIsInstance<Dog>().maxByOrNull { it.name.length }!!
}

fun animalsWhoAreYoungerThanFourAndHeavierThanTwo(): List<Animal> {
    animalsInShelter.filter { it.age < 4 && it.weight > 2 }.forEach { println("${it.name} ${it.age} ${it.weight}") }
    return animalsInShelter.filter { it.age < 4 && it.weight > 2 }
}

fun areAllCatsHeavierThanAllDogs(): Boolean {
    println(
        "%s %s".format(
            animalsInShelter.filterIsInstance<Cat>().sumByDouble { it.weight },
            animalsInShelter.filterIsInstance<Dog>().sumByDouble { it.weight })
    )
    println(
        animalsInShelter.filterIsInstance<Cat>().sumByDouble { it.weight } > animalsInShelter.filterIsInstance<Dog>()
            .sumByDouble { it.weight })
    return animalsInShelter.filterIsInstance<Cat>().sumByDouble { it.weight } > animalsInShelter.filterIsInstance<Dog>()
        .sumByDouble { it.weight }
}

fun areThereMoreCatsThanTheDogs(): Boolean {
    println(animalsInShelter.filterIsInstance<Cat>().size > animalsInShelter.filterIsInstance<Dog>().size)
    return animalsInShelter.filterIsInstance<Cat>().size > animalsInShelter.filterIsInstance<Dog>().size
}

fun isThereAnyAnimalWhichHasLetterCInTheirName(): Boolean {
    println(animalsInShelter.any { it.name.any { char -> char == 'C' } })
    return animalsInShelter.any { it.name.any { char -> char == 'C' } }
}

fun findTheAnimalWithNameHugo(): Animal {
    val hugo = animalsInShelter.find { it.name == "Hugo" }
    println("name: ${hugo?.name} age: ${hugo?.age} weight: ${hugo?.weight}")
    return animalsInShelter.find { it.name == "Hugo" }!!
}
