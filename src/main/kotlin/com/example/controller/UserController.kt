package com.example.controller

import com.example.domain.User
import com.example.repository.UserRepository
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import java.util.*
import javax.inject.Inject

@Controller("/api")
class UserController {
    @Inject
    lateinit var repository: UserRepository

    @Post("/")
    fun saveUser(@Body user: User): User {
        return repository.save(user)
    }

    @Get("/{name}")
    fun getByName(name: String): User = repository.findByName(name)
}