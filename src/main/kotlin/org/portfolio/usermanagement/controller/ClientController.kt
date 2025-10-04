package org.portfolio.usermanagement.controller

import org.portfolio.usermanagement.dto.ApiResponse
import org.portfolio.usermanagement.dto.ClientInfo
import org.portfolio.usermanagement.dto.Regist
import org.portfolio.usermanagement.dto.ResponseUtil
import org.portfolio.usermanagement.service.ClientService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/client")
class ClientController(
    private val clientService: ClientService
) {
    @PostMapping("/regist")
    fun registClient(@RequestBody regist: Regist): ResponseEntity<ApiResponse<String>> {
        println("enter")
        clientService.registClient(regist)
        return ResponseEntity.ok(ResponseUtil.success("클라이언트 등록에 성공했습니다."))
    }
}