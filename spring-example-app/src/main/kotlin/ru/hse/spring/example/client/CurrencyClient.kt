package ru.hse.spring.example.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping


@FeignClient("currenciesClient")
interface CurrencyClient {

    @GetMapping
    fun getCurrencies(): String
}