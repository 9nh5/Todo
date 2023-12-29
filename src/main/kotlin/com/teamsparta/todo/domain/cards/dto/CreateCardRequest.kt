package com.teamsparta.todo.domain.cards.dto

import java.time.LocalDateTime


data class CreateCardRequest (
    val id: String,
    val title: String,
    var date: LocalDateTime,
    val content: String
)