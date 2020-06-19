package com.example.domain

import java.util.*
import javax.persistence.*

@Entity
data class User(
        @Id
        @GeneratedValue(generator = "UUID")
        var uuid: UUID?,
        var name: String = "",
        var email: String = "",
        var password: String = ""
)