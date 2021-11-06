package com.eslam.competitions.domain.question.service
import com.eslam.competitions.domain.question.entity.Question
import com.eslam.competitions.domain.question.repository.QuestionRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class QuestionServiceImpl(private val repository: QuestionRepository) : QuestionService {

    override fun getAllQuestions(): List<Question> {
        return repository.findAll() as List<Question>
    }

    override fun getQuestionById(id: Int): Optional<Question> {
        return repository.findById(id)
    }

    override fun createQuestion(question: Question): Question {
        return repository.save(question)
    }
}