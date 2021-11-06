package com.eslam.competitions.domain.question.service

import com.eslam.competitions.domain.question.entity.Question
import java.util.*

interface QuestionService {
    fun getAllQuestions(): List<Question>
    fun getQuestionById(id: Int): Optional<Question>
    fun createQuestion(question: Question): Question
}