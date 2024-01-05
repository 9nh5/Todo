package com.teamsparta.todo.domain.comment.controller

import com.teamsparta.todo.domain.cards.service.CardService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/cards/{cardId)/comments")
@RestController
class CommentController(
    private val cardService: CardService
) {


}