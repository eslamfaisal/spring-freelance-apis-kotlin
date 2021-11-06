package com.eslam.competitions.domain.answer.entity

import javax.persistence.*

@Entity
@Table(name = "answer")
class Answer(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int? = null,
    val number: Int? = null,
    val answer: String? = null,

    val question_id: Int? = null,
)