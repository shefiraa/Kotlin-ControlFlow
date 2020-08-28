fun main() {
    val ranges = 1.rangeTo(23) step 1
    ranges.forEachIndexed { index, _ ->
        println("Index $index")
    }
}