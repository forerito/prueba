// 4. Haga un algoritmo que solicite el ingreso de un número e indique el dia correspondiente, valide si el código no existe.
// (Condicionales múltiples con when)


fun main(){
var dayNum=8
when (dayNum) {
1 -> println("Lunes")
2 -> println("Martes")
3 -> println("Miércoles")
4 -> println("Jueves")
5 -> println("Viernes")
6 -> println("Sábado")
7 -> println("Domingo")
else -> println("Día inválido")
}
}