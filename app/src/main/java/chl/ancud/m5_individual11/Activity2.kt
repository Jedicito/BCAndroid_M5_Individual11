package chl.ancud.m5_individual11

// Parte C
fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    println()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
    // Fill in code
        var referido: String
        if(this.referrer?.name.isNullOrBlank()) {
            referido = "Doesn't have a referrer"
        } else {
            referido = "Has a referrer named ${this.referrer?.name}, who likes to ${this.referrer?.hobby}."
        }
        println("Name: ${this.name}")
        println("Age: ${this.age}")
        println("Likes to $referido. ")
    }
}
