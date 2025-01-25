fun main() {
    val grade = 72
    if (grade in 90..100) {
        println("A+")
    } else if (grade in 75..89) {
        println("B")
    } else if (grade in 50..74) {
        println("D+")
    } else {
        println("D")
    }
}