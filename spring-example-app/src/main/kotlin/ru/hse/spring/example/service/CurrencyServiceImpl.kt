package ru.hse.spring.example.service

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.stereotype.Service
import ru.hse.spring.example.client.CurrencyClient
import ru.hse.spring.example.client.dto.CurrencyDto
import ru.hse.spring.example.data.model.Currency
import ru.hse.spring.example.data.repository.CurrencyRepository

@Service
class CurrencyServiceImpl(
    val objectMapper: ObjectMapper,
    val currencyClient: CurrencyClient,
    val currencyRepository: CurrencyRepository
) : CurrencyService {
    override fun getByName(currencyName: String) = currencyRepository.findByName(currencyName).value

    override fun enrichData() {
        val currencyDto = objectMapper.readValue(currencyClient.getCurrencies(), CurrencyDto::class.java)

        val currencyList = currencyRepository.findAll()


        currencyDto.rates.forEach { (k, v) ->
            var currency = currencyList.find { it.name == k }

            if (currency == null) {
                currencyRepository.save(
                    Currency(
                        name = k,
                        value = v
                    )
                )
            } else{
                currency.value = v

                currencyRepository.save(currency)
            }
        }
    }
}