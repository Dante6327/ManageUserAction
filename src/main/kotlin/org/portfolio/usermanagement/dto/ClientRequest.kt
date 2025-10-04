package org.portfolio.usermanagement.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Pattern

data class Regist (
    @field:NotBlank
    val clientName: String,

    @field:NotBlank
    @field:Pattern(regexp = "^\\d{10}$") // 사업자 등록 번호 양식 '-' 없이 10자리
    val businessRegistrationCertificate: String,
)

