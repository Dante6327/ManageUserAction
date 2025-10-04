package org.portfolio.usermanagement.service

import jakarta.transaction.Transactional
import org.portfolio.usermanagement.domain.Client
import org.portfolio.usermanagement.dto.ClientInfo
import org.portfolio.usermanagement.dto.Regist
import org.portfolio.usermanagement.exception.DuplicateBusinessRegistrationCertificateException
import org.portfolio.usermanagement.repository.ClientRepository
import org.springframework.http.ResponseEntity
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service
import java.util.UUID

@Service
@Transactional
class ClientService(
    val clientRepository: ClientRepository
) {
    private val passwordEncoder = BCryptPasswordEncoder()

    fun registClient(regist: Regist): ClientInfo {
        println(regist)
        val registrationNumber = regist.businessRegistrationCertificate
        if(clientRepository.existsByBusinessRegistrationCertificate(registrationNumber)) {
            throw DuplicateBusinessRegistrationCertificateException(registrationNumber)
        }
        // API Key 생성
        val apiKey = UUID.randomUUID().toString()

        // Client 엔티티 생성 및 저장
        val client = Client(
            companyName = regist.clientName,
            apiKey = apiKey,
            businessRegistrationCertificate = registrationNumber
        )
        val savedClient = clientRepository.save(client)
        println(savedClient)
        return ClientInfo(
            id = savedClient.id,
            companyName = savedClient.companyName,
            businessRegistrationCertificate = savedClient.businessRegistrationCertificate
        )
    }
}