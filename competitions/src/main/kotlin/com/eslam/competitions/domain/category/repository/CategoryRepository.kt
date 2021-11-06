package com.eslam.competitions.domain.category.repository

import com.eslam.competitions.domain.category.entity.Category
import org.springframework.data.repository.CrudRepository

interface CategoryRepository : CrudRepository<Category, Int>{
}