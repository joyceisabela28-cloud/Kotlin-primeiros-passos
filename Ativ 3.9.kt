fun main() {

    var numero: Int
    var dentro: Int = 0
    var fora: Int = 0

    for (i in 1..10) {

        println("Digite um número $i: ")
        numero = readln().toInt()

        if (numero >= 24 && numero <= 42) {
            dentro++
        } else {
            fora++
        }
    }
    println("Os números que estão dentro: $dentro, os $fora não contam")
}