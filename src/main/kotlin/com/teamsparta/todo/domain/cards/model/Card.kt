package com.teamsparta.todo.domain.cards.model

import com.teamsparta.todo.domain.cards.dto.CardResponse
import com.teamsparta.todo.domain.exception.ModelNotFoundException
import jakarta.persistence.*
import java.time.ZonedDateTime

@Entity
@Table(name = "card")
class Card(

    @Column(name = "title")
    var title: String? = null,

    @Column(name = "username")//대문자 넣으면 에러남 이거 찾는데 3일 걸림 기억하자. 소문자만 넣는다. 구글에서 영어로된거 번역돌려서라도 찾아보자.
    var userName: String? = null,

    @Column(name = "content")
    var content: String? = null,

    ) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//identity = 유일한 id로 스스로 db에서 생성함 -> 과제 1차에서 피드백 받은 부분
    val id: Long? = null
}

fun Card.toResponse(): CardResponse {
    return CardResponse(
        id = id!!,
        title = title,
        userName = userName,
        content = content,
        createdAt = ZonedDateTime.now()
    )
}
