package com.adrievieira.chp1


 // Adicionando um construro em um objeto.
// Porém pode se tirar a palavra-chave  (constructor)
class PessoaConstrutor constructor(firstName: String, lastName: String) {
}



fun main(){
    val adriel = PessoaConstrutor("Adriel", "Vieira")
    println(adriel.toString())  // aqui usando o método toString()



}