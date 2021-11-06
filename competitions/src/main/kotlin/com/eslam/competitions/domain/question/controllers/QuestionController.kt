package com.eslam.competitions.domain.question.controllers

import com.eslam.competitions.domain.question.entity.Question
import com.eslam.competitions.domain.question.service.QuestionService
import org.springframework.web.bind.annotation.*

@RestController
class QuestionController(
    private val questionService: QuestionService
) {

    @GetMapping("/questions")
    fun getAllCategories(): List<Question> {
        return questionService.getAllQuestions()
    }

    @GetMapping("/questions/{id}")
    fun getCategoryById(@PathVariable("id") id: Int): Question {
        return questionService.getQuestionById(id).get()
    }

    @PostMapping("/questions")
    fun saveCategory(@RequestBody category: Question): Question {
        return questionService.createQuestion(category)
    }
}