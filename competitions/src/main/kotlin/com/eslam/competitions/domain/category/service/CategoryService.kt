package com.eslam.competitions.domain.category.service

import com.eslam.competitions.domain.category.entity.Category
import java.util.*

interface CategoryService {
    fun getAllCategories(): List<Category>
    fun getCategoryById(id: Int): Optional<Category>
    fun createCategory(category: Category): Category
}