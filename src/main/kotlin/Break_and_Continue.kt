fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (s in listOfInt) {
        if (s == null) continue
        print(s)
    }
}