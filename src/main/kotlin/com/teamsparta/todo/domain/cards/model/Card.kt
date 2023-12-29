package com.teamsparta.todo.domain.cards.model

import com.teamsparta.todo.domain.cards.dto.CardResponse
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "card")
class Card(

    @Column(name = "title")
    var title: String,

    @Column(name = "content")
    var content: String,

    @Column(name = "date")
    var date: LocalDateTime,

    @Id
    @Column(name = "id")
    var id: String
) {
}

fun Card.toResponse(): CardResponse {
    return CardResponse(
        id = id,
        title = title,
        content = content,
        date = date
    )
}
