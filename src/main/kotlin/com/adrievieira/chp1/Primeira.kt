package com.adrievieira.chp1


/*
*  Um exemplo logo de cara no livro pra dar aquele tapa na cara da sociedade.
* */


// Primeiro define uma classe de usuário.
 data class User (val firstName: String, val lastName: String)

// Depois define uma função principal
fun main(){
    val adriel = User("Adriel", "Vieira")  // variavel obtendo instancia da classe User
    val kauena = User("Kauena", "Vieira") // variavel obtendo instancia da classe User

    // Criação de uma lista participantes preenchida com os dois usuário recém-criados
    val attendees: MutableList<User> = mutableListOf(adriel, kauena)

    // Por último é feito esse loop pala lista
    attendees.forEach {
        user ->
        println("$user is attending!")
    }
}