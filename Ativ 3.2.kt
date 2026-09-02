fun main(){

    println("Digite o primeiro número: ")
    val n1 = readln().toDouble()

    println("Digite o segundo número: ")
    var n2 = readln().toDouble()

    while ( n2 <= 0){
        println("Informe um número maior que 0: ")
        n2 = readln().toDouble()
    }

    var divisão = n1 / n2
        println("O resultado da divisão é: $divisão")

}

