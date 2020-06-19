package com.example.repository

import com.example.domain.User
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import java.util.*

@Repository
interface UserRepository: CrudRepository<User,Long> {
    fun findByName(name: String): User
}