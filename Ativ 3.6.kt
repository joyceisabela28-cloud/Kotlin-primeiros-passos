fun main(){

    var media : Double
    var n1 :Double
    var n2 : Double
    var n3 : Double
    var n4 : Double
    var n5 : Double
    var n6 : Double

    println("Digite a primeira nota: ")
    n1 = readln().toDouble()

    while (n1 < 0 || n1 > 10) {
        println("Nota inválida! Digite uma nota entre 0 e 10:")
        n1 = readln().toDouble()
    }

    println("Digite a segunda nota: ")
    n2 = readln().toDouble()

    while (n2 < 0 || n2 > 10) {
        println("Nota inválida! Digite uma nota entre 0 e 10:")
        n2 = readln().toDouble()
    }


    println("Digite a terceira nota: ")
    n3 = readln().toDouble()

    while (n3 < 0 || n3 > 10) {
        println("Nota inválida! Digite uma nota entre 0 e 10:")
        n3 = readln().toDouble()
    }


    println("Digite a quarta nota: ")
    n4 = readln().toDouble()

    while (n4 < 0 || n4 > 10) {
        println("Nota inválida! Digite uma nota entre 0 e 10:")
        n4 = readln().toDouble()
    }


    println("Digite a quinta nota: ")
    n5 = readln().toDouble()

    while (n5 < 0 || n5 > 10) {
        println("Nota inválida! Digite uma nota entre 0 e 10:")
        n5 = readln().toDouble()
    }


    println("Digite a sexta nota: ")
    n6 = readln().toDouble()

    while (n6 < 0 || n6 > 10) {
        println("Nota inválida! Digite uma nota entre 0 e 10:")
        n6 = readln().toDouble()
    }

    media = (n1 + n2 + n3 + n4 + n5 + n6)/6

     println("Sua média simples é: $media")



} // Programa while usado para repetir a função