package org.portfolio.usermanagement.controller

import com.fasterxml.jackson.databind.util.JSONPObject
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
@RequestMapping("/health")
class HealthCheckController {

    @GetMapping("")
    fun healthCheck(): ResponseEntity<Map<String, Any>> {
        val body = mapOf("status" to "UP", "timestamp" to LocalDateTime.now())
        return ResponseEntity.ok(body)
    }
}