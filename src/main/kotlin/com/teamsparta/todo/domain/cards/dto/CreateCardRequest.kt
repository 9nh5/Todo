package com.teamsparta.todo.domain.cards.dto

import java.time.LocalDateTime


data class CreateCardRequest (
    val id: String,
    val title: String,
    val content: String
)