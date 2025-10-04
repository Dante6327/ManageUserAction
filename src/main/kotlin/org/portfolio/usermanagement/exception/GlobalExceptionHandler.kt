package org.portfolio.usermanagement.exception

import org.portfolio.usermanagement.dto.ApiResponse
import org.portfolio.usermanagement.dto.ResponseUtil
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.ErrorResponse
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(DuplicateBusinessRegistrationCertificateException::class)
    fun handleDuplicateBusinessRegistrationCertificateException(ex: DuplicateBusinessRegistrationCertificateException): ResponseEntity<ApiResponse<Unit>> {
        return ResponseEntity.status(HttpStatus.CONFLICT)
            .body(ResponseUtil.error(ex.message?: "중복된 사업자등록번호입니다."))
    }
}