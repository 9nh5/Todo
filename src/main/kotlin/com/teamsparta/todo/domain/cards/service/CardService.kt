package com.teamsparta.todo.domain.cards.service

import com.teamsparta.todo.domain.cards.dto.CardResponse
import com.teamsparta.todo.domain.cards.dto.CreateCardRequest
import com.teamsparta.todo.domain.cards.dto.UpdateCardRequest

interface CardService {

    fun getAllCardList(): List<CardResponse>

    fun getCardById(cardId: String): CardResponse

    fun createCard(request: CreateCardRequest): CardResponse

    fun upadateCard(cardId: String, request: UpdateCardRequest): CardResponse

    fun deleteCard(cardId: String)
}