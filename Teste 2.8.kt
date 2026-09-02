fun main()
{

    var numeros = DoubleArray(6) // Declarou a variável com um vetor, são quatros valores/ DoubleArray
    var media : Double = 0.0

    println("Informe 6 números: ")
    for( i in 0 until 6) //until para i 0 começo, e vai até o quatro
    {
        numeros[i] = readln().toDouble()

        while (numeros[i] <= 0 || numeros[i] >= 10) // condição
        {
            println("O número precisa ser maior que 0 e menor que 10")
            numeros[i] = readln().toDouble()  // laço de repetição
        }
    } // abrir depois do for, e fechar só depois que declarar o i

    media = (numeros[0] + numeros[1] + numeros[2] + numeros[3])/4 // 0 é posição, o usuário digita e a soma é a partir

    if (media > 5 )
    {
        print("Parabéns! Você passou no teste!")
    }
    else if  ( media <= 5 )
    {
        print("Tente novamente...\n")
    }
    println("A sua média foi : $media")

}