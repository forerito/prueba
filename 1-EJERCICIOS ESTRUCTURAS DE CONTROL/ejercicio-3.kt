// 3. Haga un algoritmo que solicite el ingreso de 2 números, valide cual es mayor o si son iguales.
// (Condicionales anidadas)


fun main() {
println("Ingrese el primer número:")
val num1 = readLine()!!.toInt()
println("Ingrese el segundo número:")
val num2 = readLine()!!.toInt()
if (num1 > num2) {
println("$num1 es mayor que $num2")
} else {
if (num2 > num1) {
println("$num2 es mayor que $num1")
} else {
println("$num1 y $num2 son iguales")
}
}
println("\n\nTerminó la estructura")
}