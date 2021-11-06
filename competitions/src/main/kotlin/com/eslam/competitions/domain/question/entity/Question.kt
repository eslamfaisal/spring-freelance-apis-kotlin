package com.eslam.competitions.domain.question.entity

import com.eslam.competitions.domain.answer.entity.Answer
import com.eslam.competitions.domain.category.entity.Category
import javax.persistence.*

@Entity
@Table(name = "questions")
class Question(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int? = null,

    val question: String? = null,

    @Column(name = "right_answer")
    val rightAnswer: Int? = null,

    @Column(name = "user_answer", nullable = true, columnDefinition = "integer default 0")
    val userAnswer: Int? = null,

    @Column(name = "answered", nullable = true, columnDefinition = "boolean default false")
    val answered: Boolean = false,

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    val category: Category? = null,

    @OneToMany
    @JoinColumn(name = "question_id")
    val answers: List<Answer>? = null
)