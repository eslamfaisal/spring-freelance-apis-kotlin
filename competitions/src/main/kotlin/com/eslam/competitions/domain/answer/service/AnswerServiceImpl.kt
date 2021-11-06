package com.eslam.competitions.domain.answer.service

import com.eslam.competitions.domain.answer.entity.Answer
import com.eslam.competitions.domain.answer.repository.AnswerRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class AnswerServiceImpl(private val repository: AnswerRepository) : AnswerService {

    override fun getAllAnswers(): List<Answer> {
        return repository.findAll() as List<Answer>
    }

    override fun getAnswerById(id: Int): Optional<Answer> {
        return repository.findById(id)
    }

    override fun createAnswer(answer: Answer): Answer {
        return repository.save(answer)
    }
}