fun main() {

    val comecoNum = 15
    val fimNum = 100

    var soma = 0
    var qtdElementos = 0

    for (i in comecoNum..fimNum) {
        soma = soma + i
        qtdElementos = qtdElementos + 1
    }

    val media = soma.toDouble() / qtdElementos

    println("A Média aritmética de 15 até 100 é: $media")

}