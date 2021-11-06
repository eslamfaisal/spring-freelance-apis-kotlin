package com.eslam.competitions.domain.answer.repository

import com.eslam.competitions.domain.answer.entity.Answer
import org.springframework.data.repository.CrudRepository

interface AnswerRepository : CrudRepository<Answer, Int>