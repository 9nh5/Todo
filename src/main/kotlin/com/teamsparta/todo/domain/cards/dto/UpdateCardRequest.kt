package com.teamsparta.todo.domain.cards.dto

import java.time.LocalDateTime

data class UpdateCardRequest(
    val id: String,
    val title: String,
    val content: String
)
