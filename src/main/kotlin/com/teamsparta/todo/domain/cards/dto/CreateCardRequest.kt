package com.teamsparta.todo.domain.cards.dto

import java.time.LocalDateTime


data class CreateCardRequest (
    val title: String? = null,
    val userName: String? = null,
    val content: String? = null
)