package org.portfolio.usermanagement.dto

import java.time.LocalDateTime

// 공통 API 응답 클래스 정의
data class ApiResponse<T>(
    val success: Boolean,
    val message: String,
    val data: T? = null,
    val timestamp: String = LocalDateTime.now().toString()
)

object ResponseUtil {
    fun <T> success(data: T, message: String = "성공"): ApiResponse<T> {
        return ApiResponse(success = true, data = data, message = message)
    }

    fun <T> success(message: String = "성공"): ApiResponse<T> {
        return ApiResponse(success = true, message = message)
    }

    fun <T> error(message: String): ApiResponse<T> {
        return ApiResponse(success = false, message = message)
    }
}