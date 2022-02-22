import kotlin.math.pow

class Calculos {
    fun calcForcaPeso(massa: Float, gravidade: Float): Float {
        return massa * gravidade
    }

    fun calcForcaCentripeta(velocidade: Float, raio: Float, massa: Float): Float {
        return (velocidade * velocidade) / raio * massa

    }

    fun calcImpulso(tempInicial: Float, tempFinal: Float, moviInicial: Float, movFinal: Float): Float {
        return (tempInicial - tempFinal) * (moviInicial - movFinal)
    }

    fun calcForcaElastica(k: Float, x: Float): Float {
        return k * x
    }

    fun calVelocidadeDeMedida(posicaoFinal: Float, posicaoInicial: Float, tempoFinal: Float, tempoInicial: Float): Float {
        return (posicaoFinal - posicaoInicial) / (tempoFinal - tempoInicial)
    }

    fun calMRU(pontoInicial: Float, velocidade: Float, tempoFinal: Float, tempoInicial: Float): Float {
        return (pontoInicial + velocidade) * (tempoFinal - tempoInicial)
    }
    fun calcMRUV(pontoInicial: Float, velocidade: Float, tempo:Float, aceleracao:Float, tempo2:Float):Float{
        return (pontoInicial + velocidade) * (tempo + aceleracao * tempo2.pow(2)/2)
    }
}