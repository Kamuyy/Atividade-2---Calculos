fun main(args: Array<String>) {
    val calculos = Calculos()

    val calcForcaPeso = calculos.calcForcaPeso(5f, 6f)
    println("O resultado da Força Peso é: ${calcForcaPeso}")

    val calcForcaCentripeta = calculos.calcForcaCentripeta(20f,100f, 800f )
    println("O resultado da Força Centripetaé: $calcForcaCentripeta")

    val calcImpulso = calculos.calcImpulso(0f, 10f, 0f, 20f)
    println("O resultado do Impulso é: $calcImpulso")

    val calForcaElastica = calculos.calcForcaElastica(150f, 100f)
    println("O resultado da Força Elastica é: $calForcaElastica")

    val calVelocidadeDaMedida = calculos.calVelocidadeDeMedida(50f, 0f , 60f, 0f)
    println("O resultado da Velocidade de Medida é: $calVelocidadeDaMedida")

    val calMRU = calculos.calMRU(5f, 10f, 15f, 5f,)
    println("O resultado do MRU é: $calMRU")

    val calMRUV = calculos.calcMRUV(5f, 50f, 10f, 20f, 15f,)
    println("O resultado do MRUV é: $calMRUV")
}