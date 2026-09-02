fun main() {

    println("Digite o primeiro número: ")
    val num1 = readln().toDouble()

    println("Digite o segundo número: ")
    val num2 = readln().toDouble()

    println("Digite o terceiro número: ")
    val num3 = readln().toDouble()


    println("Digite o quarto número: ")
    val num4 = readln().toDouble()


    val maior = if (num1 >= num2 && num1 >= num3 && num1 >= num4) {
        num1
    } else if (num2 >= num1 && num2 >= num3 && num2 >= num4) {
        num2
    } else if (num3 >= num1 && num3 >= num2 && num3 >= num4) {
        num3
    } else {
        num4
    }

    println("O primeiro número digitado foi: $num1, o último número digitado foi: $num4 e o maior é: $maior ")

}
