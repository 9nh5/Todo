package com.teamsparta.todo.domain.cards.dto

data class CardResponse (
    val id: String,
    val title: String,
    val date: String,
    val content: String
)