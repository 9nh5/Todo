package com.teamsparta.todo.domain.cards.repository

import com.teamsparta.todo.domain.cards.model.Card
import com.teamsparta.todo.domain.cards.model.QCard
import com.teamsparta.todo.infra.swagger.querydsl.QueryDslSupport
import org.springframework.stereotype.Repository

@Repository
class QueryDslcardRepository: QueryDslSupport() {
    private val card = QCard.card

//    fun findAllCardList(): List<Card> {
//        return queryFactory.select(card)
//            .from(card)
//            .where(card.title.contains("title"))
//            .orderBy(card.createdAt.desc())
//            .fetch()
//
//    }
}