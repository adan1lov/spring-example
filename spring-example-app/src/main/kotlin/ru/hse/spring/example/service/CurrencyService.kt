package ru.hse.spring.example.service

interface CurrencyService {

    fun getByName(currencyName: String): Double

    fun enrichData()
}