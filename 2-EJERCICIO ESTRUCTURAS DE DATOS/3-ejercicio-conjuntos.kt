// Ejercicio conjuntos


fun main() {
    
val conjunto = setOf("Celular", "Tv", "Computador")

if (conjunto.contains("Aipad")){
    println("El conjunto contiene Aipad")
}else{
    println("El conjunto no contiene Aipad \n")
}

for (i in conjunto) {
    println(i)
}

}