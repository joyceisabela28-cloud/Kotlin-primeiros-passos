data class ListadaPureza (
    var nome:  String,
    var frequencia: Double,
    var participacao: Int,
    var coracaoleve: Boolean // Não tem virgula por ser o ultimo

)
    fun main() {
        var aluno1 = ListadaPureza(
        nome = "Milly",
        frequencia = 98.0,
        participacao = 100,
        coracaoleve = true,
        )

        var aluno2 = ListadaPureza(
        nome = "Maxximmus",
        frequencia = 90.3,
        participacao = 98,
        coracaoleve = true
        )

        var aluno3 = ListadaPureza(
        nome = "Alegria",
        frequencia = 99.0,
        participacao = 90,
        coracaoleve = true
        )

        var listadaPurezafeitacomOpenOption = mutableListOf<ListadaPureza>(
            aluno1

        )






    }

