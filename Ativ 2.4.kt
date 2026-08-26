fun main (){

    println("Digite o primeiro  número: ")
    val num1 = readln().toDouble() // variável declarada

    println("Digite o segundo  valor: ")
    val num2 = readln().toDouble() // variável declarada

    println("Digite o terceiro  valor: ")
    val num3 = readln().toDouble() // variável declarada

    var soma: Double = 0.0

// Armazenar números em uma lista, para que eu possa somar todos de acordo

    if (num1 < num2 && num1< num3 ){
        soma = num2 + num3

    } else if ( num2 < num1 && num2 < num3 ) {
        soma = num1 + num3


    }else {
        soma = num1 + num2
    }

    println("Resultado é $soma")

}
