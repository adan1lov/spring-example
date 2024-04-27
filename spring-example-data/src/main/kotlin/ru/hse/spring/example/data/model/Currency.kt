package ru.hse.spring.example.data.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("currency")
data class Currency(
    @Id
    val id: Long? = null,
    val name: String,
    var value: Double
)
