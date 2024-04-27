package ru.hse.spring.example.data.repository

import org.springframework.data.repository.CrudRepository
import ru.hse.spring.example.data.model.Currency

interface CurrencyRepository: CrudRepository<Currency, Long> {

    fun findByName(name: String): Currency

    override fun findAll(): List<Currency>
}