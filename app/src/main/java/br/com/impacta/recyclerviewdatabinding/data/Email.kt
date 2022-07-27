package br.com.impacta.recyclerviewdatabinding.data

data class Email (
    val sender: String,
    val subject: String,
    val message: String,
    val time: String
        ) {
    fun getFirstLetterFromSender(): String = sender.first().toString()
}