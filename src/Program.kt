fun main() {
    val a: String? = "Test"
    val b: String? = null
    println(a?.length)
    println(b!!.length)
    println(a?.length ?: -1) // elvis ex

}