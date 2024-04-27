package ru.hse.spring.example.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import ru.hse.spring.example.api.SpringExampleApi
import ru.hse.spring.example.service.CurrencyService

@RestController
class CurrencyController(
    val currencyService: CurrencyService
) : SpringExampleApi {

    @GetMapping("/currency/{currencyCode}")
    override fun getValue(@PathVariable currencyCode: String) = currencyService.getByName(currencyCode)
}