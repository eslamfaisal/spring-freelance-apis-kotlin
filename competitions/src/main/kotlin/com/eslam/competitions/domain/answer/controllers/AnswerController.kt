package com.eslam.competitions.domain.answer.controllers

import com.eslam.competitions.domain.answer.entity.Answer
import com.eslam.competitions.domain.answer.service.AnswerService
import org.springframework.web.bind.annotation.*

@RestController
class AnswerController(
    private val answerService: AnswerService
) {

    @GetMapping( "/answers")
    fun getAllAnswers(): List<Answer> {
        return answerService.getAllAnswers()
    }

    @GetMapping( "/answers/{id}")
    fun getAnswerById(@PathVariable("id") id: Int): Answer {
        return answerService.getAnswerById(id).get()
    }

    @PostMapping( "/answers")
    fun saveAnswer(@RequestBody answer: Answer): Answer {
        return answerService.createAnswer(answer)
    }
}