// 5. Haga un algoritmo que solicite n cantidad de números hasta que el usuario ingrese el número 10.
// (Ciclo do while)


fun main() {
var numero = 0
do {
print("Ingrese un número: ")
numero = readLine()!!.toInt()
} while (numero != 10)
println("Ha ingresado el número 10.")
}