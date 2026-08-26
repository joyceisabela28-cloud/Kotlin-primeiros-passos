fun main (){

    println("Digite o primeiro  valor: ")
    var valor1 = readln().toInt() // variável declarada

    println("Digite o segundo  valor: ")
    var valor2 = readln().toInt() // variável declarada

    println("Digite o terceiro  valor: ")
    var valor3 = readln().toInt() // variável declarada



    if (valor1 > valor2 && valor1 > valor3){
        println("Número $valor1 é o  maior")

    } else if ( valor2 > valor1 && valor2 > valor3) {
        println("Número $valor2 é o  maior")

    }else if (valor3 > valor2 && valor3 > valor1){
        println("Número $valor3 é o maior")

    }else
        println("Todos os valores são iguais")

}
