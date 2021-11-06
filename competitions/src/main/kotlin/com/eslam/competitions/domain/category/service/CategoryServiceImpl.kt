package com.eslam.competitions.domain.category.service

import com.eslam.competitions.domain.category.entity.Category
import com.eslam.competitions.domain.category.repository.CategoryRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class CategoryServiceImpl(private val repository: CategoryRepository) : CategoryService {

    override fun getAllCategories(): List<Category> {
        return repository.findAll() as List<Category>
    }

    override fun getCategoryById(id: Int): Optional<Category> {
        return repository.findById(id)
    }

    override fun createCategory(category: Category): Category {
        return repository.save(category)
    }
}