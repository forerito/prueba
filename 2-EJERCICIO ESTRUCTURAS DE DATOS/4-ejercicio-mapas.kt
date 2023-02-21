// Ejercicio mapas


fun main() {
       
val mapa = hashMapOf("A" to 1, "B" to 2, "C" to 3, "D" to 4, "E" to 5)

for ((key, value) in mapa.entries) {
    println("$key = $value")
}

}