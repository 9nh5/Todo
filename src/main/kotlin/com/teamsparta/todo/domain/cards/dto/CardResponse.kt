package com.teamsparta.todo.domain.cards.dto


import java.time.ZonedDateTime


data class CardResponse (
    val id: Long,
    val title: String? = null,
    val createdAt: ZonedDateTime? = null,
    val userName: String? = null,
    val content: String? = null
)