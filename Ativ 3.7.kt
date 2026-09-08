fun main() {

    var N: Int

    N = readln().toInt()

    while (N < 1) {
        println("Seu número precisa ser maior que 0")
        N = readln().toInt()
    }

    for (i in 1..N) {
        println(i)
    }
}