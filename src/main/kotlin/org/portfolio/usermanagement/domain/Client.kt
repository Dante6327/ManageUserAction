package org.portfolio.usermanagement.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

// SDK를 설치하는 서비스사를 구분하는 엔티티
// API Key로 구분
@Entity
@Table(name = "client")
class Client (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    val companyName: String,

    @Column(nullable = false)
    val apiKey: String, //api key - 추후 해시 알고리즘으로 단방향 암호화 하여 DB 저장

    @Column(nullable = false, unique = true)
    val businessRegistrationCertificate: String, // 사업자등록번호
): BaseEntity() {
}