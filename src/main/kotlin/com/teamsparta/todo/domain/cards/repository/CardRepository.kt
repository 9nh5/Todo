package com.teamsparta.todo.domain.cards.repository

import com.teamsparta.todo.domain.cards.model.Card
import org.springframework.data.jpa.repository.JpaRepository


interface CardRepository: JpaRepository<Card, String> {

}