package com.teamsparta.todo.domain.cards.controller

import com.teamsparta.todo.domain.cards.dto.CardResponse
import com.teamsparta.todo.domain.cards.dto.CreateCardRequest
import com.teamsparta.todo.domain.cards.dto.UpdateCardRequest
import com.teamsparta.todo.domain.cards.service.CardService
import com.teamsparta.todo.domain.exception.ModelNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/cards")
@RestController
class CardController (
    private val cardService: CardService
)
{

    @GetMapping()
    fun getCardList(): ResponseEntity<List<CardResponse>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(cardService.getAllCardList())
    }

    @GetMapping("/{cardId}")
    fun getCardId(@PathVariable cardId: String): ResponseEntity<CardResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(cardService.getCardById(cardId))
    }

    @PostMapping
    fun createCard(@RequestBody createCardRequest: CreateCardRequest): ResponseEntity<CardResponse> {
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(cardService.createCard(createCardRequest))
    }

    @PutMapping("/{cardId}")
    fun upadateCard(@PathVariable cardId: String, @RequestBody upadateCardRequest: UpdateCardRequest): ResponseEntity<CardResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(cardService.upadateCard(cardId, upadateCardRequest))
    }

    @DeleteMapping("/{cardId}")
    fun deleteCard(@PathVariable cardId: String): ResponseEntity<Unit> {
        cardService.deleteCard(cardId)
        return ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .build()
    }


}