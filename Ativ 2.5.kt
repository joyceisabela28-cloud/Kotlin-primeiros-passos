fun main () {

    println("Digite o primeiro  número: ")
    val num1 = readln().toDouble() // variável declarada

    println("Digite o segundo  valor: ")
    val num2 = readln().toDouble() // variável declarada

    println("Digite o terceiro  valor: ")
    val num3 = readln().toDouble() // variável declarada

    println("Digite o quarto  valor: ")
    val num4 = readln().toDouble() // variável declarada

    println("Digite o quinto  valor: ")
    val num5 = readln().toDouble() // variável declarada

    println("Digite o sexto  valor: ")
    val num6 = readln().toDouble() // variável declarada


    var soma = num1 + num2 + num3 + num4 + num5 + num6

    val media = soma / 6


    println("A soma de todos os números é: $soma")
    println("A soma aritmética é $media")
}