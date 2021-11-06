package com.eslam.competitions.domain.answer.service

import com.eslam.competitions.domain.answer.entity.Answer
import java.util.*

interface AnswerService {
    fun getAllAnswers(): List<Answer>
    fun getAnswerById(id: Int): Optional<Answer>
    fun createAnswer(answer: Answer): Answer
}