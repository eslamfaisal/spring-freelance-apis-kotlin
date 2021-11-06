package com.eslam.competitions.domain.question.repository

import com.eslam.competitions.domain.category.entity.Category
import com.eslam.competitions.domain.question.entity.Question
import org.springframework.data.repository.CrudRepository

interface QuestionRepository : CrudRepository<Question, Int>{
}