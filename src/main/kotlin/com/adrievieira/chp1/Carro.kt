package com.adrievieira.chp1


//criando outro objeto para teste

 /*
 *  aqui o construtor ignora caso não adicionamos o val
 * se ele ignora ele não aceita como valores de propriedades
 * e ai não usa o método subtituido po toString() e consequentimente não mostra os dados de saida
 * você precisa usar a palavra-chave val antes de cada parte dos dados
 * para transformar esses dados em valores de propriedades.
 * ACHO QUE É ISSO! PELO QUE ENTENDI
 * */
class Carro constructor(val cor: String, val qtdAcento: String, val modelCarro: String) {

    override fun toString(): String {
        return "$cor $qtdAcento $modelCarro"
    }
}

fun main() {
    val carrou = Carro("verde", "4", "ford")  // aqui eu consigo acessar essas variaveis

    println(carrou)


}