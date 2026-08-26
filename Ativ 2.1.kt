fun main (){

    println("Digite o primeiro número: ")
    val num1 = readln().toInt()

    println("Digite o segundo número:" )
    val num2 = readln().toInt()

    if(num1>num2) {
        println("O maior número é: $num1")

    } else if (num2 > num1) {
        println("O maior nuúmero é: $num2")

    }else {
        println("Os dois números são iguais. ")
    }
}