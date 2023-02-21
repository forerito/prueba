// Ejercicio listas


// fun main() {
    
// val lista = mutableListOf("Celular", "Tv", "Computador", "Tablet")

// lista[1] = "Aipad"

// for (i in lista) {
//     println(i)
// }

// }


fun main() {
    
val lista = mutableListOf(5, 6, 2, 8)

 var suma = 0
    for (elemento in lista) {
       suma += elemento
   }
   println("$suma")

}