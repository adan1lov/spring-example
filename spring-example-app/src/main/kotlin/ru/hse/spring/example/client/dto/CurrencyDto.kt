package ru.hse.spring.example.client.dto

data class CurrencyDto(
    val rates: Map<String, Double>
)