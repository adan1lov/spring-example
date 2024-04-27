package ru.hse.spring.example.job

import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import ru.hse.spring.example.service.CurrencyService

@Component
class EnrichDataBaseJob(
    val currencyService: CurrencyService
) : Job {

    companion object {
        val log = LoggerFactory.getLogger(EnrichDataBaseJob::class.java)
    }

    @Scheduled(cron = "*/10 * * * * *")
    override fun execute() {
        currencyService.enrichData()
        log.info("Data was enriched")
    }
}