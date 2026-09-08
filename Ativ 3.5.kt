fun main () {

    var nota1: Double // Números decimais
    var nota2: Double

    var media: Double

    var aprovados: Int = 0 // Números inteiros
    var respostas : String = "S" //texto

    while (respostas == "S") {
        println("Digite a  primeira nota: ")
        nota1 = readln().toDouble()  // conectar a variavél com o número digitado

        println("Digite a segunda nota: ")
        nota2 = readln().toDouble()

        media = (nota1 + nota2) / 2 // somar o que está nos () e depois dividir


        if (media >= 9.5) {
            println("Sua nota foi: $media. Você passou no teste ")
            aprovados++

        } else {
            println("Sua nota foi: $media. Você foi reprovado ")
        }

        println("Calcular média de outro aluno? S/N")
        respostas = readln().uppercase()
    }

    println(" Quantidade total de alunos aprovados: $aprovados")


}