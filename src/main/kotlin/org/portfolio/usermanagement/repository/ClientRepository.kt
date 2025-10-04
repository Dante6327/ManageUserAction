package org.portfolio.usermanagement.repository

import org.portfolio.usermanagement.domain.Client
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository: JpaRepository<Client, Int> {
    fun existsByBusinessRegistrationCertificate(businessRegistrationCertificate: String):Boolean
}