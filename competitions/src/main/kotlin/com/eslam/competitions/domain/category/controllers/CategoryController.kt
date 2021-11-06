package com.eslam.competitions.domain.category.controllers

import com.eslam.competitions.domain.category.entity.Category
import com.eslam.competitions.domain.category.service.CategoryService
import org.springframework.web.bind.annotation.*

@RestController
class CategoryController(
    private val categoryService: CategoryService
) {

    @GetMapping( "/categories")
    fun getAllCategories(): List<Category> {
        return categoryService.getAllCategories()
    }

    @GetMapping( "/categories/{id}")
    fun getCategoryById(@PathVariable("id") id: Int): Category {
        return categoryService.getCategoryById(id).get()
    }

    @PostMapping( "/categories")
    fun saveCategory(@RequestBody category: Category): Category {
        return categoryService.createCategory(category)
    }
}