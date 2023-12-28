package com.teamsparta.todo.domain.cards.service

import com.teamsparta.todo.domain.cards.dto.CardResponse
import com.teamsparta.todo.domain.cards.dto.CreateCardRequest
import com.teamsparta.todo.domain.cards.dto.UpdateCardRequest
import com.teamsparta.todo.domain.cards.model.Card
import com.teamsparta.todo.domain.cards.repository.CardRepository
import com.teamsparta.todo.domain.exception.ModelNotFoundException
import com.teamsparta.todo.domain.cards.model.toResponse
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CardServiceImpl(
    private val cardRepository: CardRepository
): CardService
    {
    override fun getAllCardList(): List<CardResponse> {
        //TODO: DB에서 모든 할 일 Card 목록 조회하여, CardResponse 목록으로 변환 후 반환
        return cardRepository.findAll().map {it.toResponse()}
    }

    override fun getCardById(cardId: String): CardResponse {
        //TODO: cardId에 해당하는 Card가 없다면 throw ModelNotFoundException
        //TODO: DB에서 ID기반으로 Card 조회하고 가져와서, CardResponse로 변환 후 반환
        //TODO("Not yet implemented")
        val card = cardRepository.findByIdOrNull(cardId)?:
        throw ModelNotFoundException("Card", cardId)
        return card.toResponse()
    }

    @Transactional
    override fun createCard(request: CreateCardRequest): CardResponse {
        //TODO: request를 Card로 변환 후 DB에 저장
        return cardRepository.save<Card?>(
            Card(
                id = request.id,
                title = request.title,
                content = request.content,
                date = request.date
            )
        ).toResponse()
    }

    @Transactional
    override fun upadateCard(cardId: String, request: UpdateCardRequest): CardResponse {
        //TODO: cardId에 해당하는 Card가 없다면 throw ModelNotFoundException
        //TODO: DB에서 cardId에 해당하는 Card를 가져와서 request 기반으로 업데이트 후 DB에 저장, 결과를 CardResponse로 변환 후 반환
        val card = cardRepository.findByIdOrNull(cardId)?: throw ModelNotFoundException("Card", cardId)
        val (id, title, content, date) = request

        card.id = id
        card.title = title
        card.content = content
        card.date = date.toString()

        return cardRepository.save(card).toResponse()
    }

    @Transactional
    override fun deleteCard(cardId: String) {
        //TODO: cardId에 해당하는 Card가 없다면 throw ModelNotFoundException
        //TODO: DB에서 cardId에 해당하는 Card를 삭제
        val card = cardRepository.findByIdOrNull(cardId)?: throw ModelNotFoundException("Card", cardId)
        cardRepository.delete(card)
    }
}