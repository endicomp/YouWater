package ru.iwater.youwater.domain

data class TypeProduct(
    val category: String,
    val company_id: String,
    val id: Int,
    val image: String,
    val priority: Int,
    val visible_app: Int
)