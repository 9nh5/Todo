package com.teamsparta.todo.domain.cards.dto

data class UpdateCardRequest(
    val id: String,
    val title: String,
    val date: String,
    val content: String
)
