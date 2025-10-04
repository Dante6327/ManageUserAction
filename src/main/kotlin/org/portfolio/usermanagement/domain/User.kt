package org.portfolio.usermanagement.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "users")
class User (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long = 0,

    @Column
    val clientId : String? = null,

    @Column
    val userId : String? = null,

    @Column
    val anonymousId : String? = null,
) :BaseEntity() {
}