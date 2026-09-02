fun main() {

    println("Digite o primeiro número: ")
    val num1 = readln().toDouble()

    println("Digite o segundo número: ")
    val num2 = readln().toDouble()

    println("Digite o terceiro número: ")
    val num3 = readln().toDouble()

    println("Digite o quarto número: ")
    val num4 = readln().toDouble()

    println("Digite o quinto número: ")
    val num5 = readln().toDouble()

    println("Digite o sexto número: ")
    val num6 = readln().toDouble()

    // Variavel = somar
    var soma = 0.0

    // Verificar o primeiro número
    if (num1 < 72) {
        soma = soma + num1
        println("-> Valor armazenado (menor que 72): $num1")
    } else {
        println("-> Valor ignorado (maior ou igual a 72).")
    }

    // Verificar o segundo número
    if (num2 < 72) {
        soma = soma + num2
        println("-> Valor armazenado (menor que 72): $num2")
    } else {
        println("-> Valor ignorado (maior ou igual a 72).")
    }

    // Verificar o terceiro número
    if (num3 < 72) {
        soma = soma + num3
        println("-> Valor armazenado (menor que 72): $num3")
    } else {
        println("-> Valor ignorado (maior ou igual a 72).")
    }

    // Verificar o quarto número
    if (num4 < 72) {
        soma = soma + num4
        println("-> Valor armazenado (menor que 72): $num4")
    } else {
        println("-> Valor ignorado (maior ou igual a 72).")
    }

    // Verificar o quinto número
    if (num5 < 72) {
        soma = soma + num5
        println("-> Valor armazenado (menor que 72): $num5")
    } else {
        println("-> Valor ignorado (maior ou igual a 72).")
    }

    // Verificar o sexto número
    if (num6 < 72) {
        soma = soma + num6
        println("-> Valor armazenado (menor que 72): $num6")
    } else {
        println("-> Valor ignorado (maior ou igual a 72).")
    }

    // Resultado da soma se for menor que 72

    println("\nA soma dos valores menores que 72 é: $soma")
}
