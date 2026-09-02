fun main(){

   println("Digite o ano de nascimento: ")
      val anodenascimento = readln().toInt()

    val anoatual = 2026
    val idade = anoatual - anodenascimento

if (idade >= 16) {
     println("Sua idade é  $idade, Você pode votar")

    }else
        println("Sua idade é  $idade, você ainda não pode votar!")



}