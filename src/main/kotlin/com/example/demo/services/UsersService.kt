package com.example.demo.services

import com.example.demo.models.User
import com.example.demo.repositories.UsersRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsersService(private val usersRepository: UsersRepository) {

    fun findAll(): List<User>{
        return usersRepository.findAll().toList();
    }

    fun findById(id: Int): User {
        return usersRepository.findById(id).orElse(null)
    }

    fun save(user: User){
        usersRepository.save(user)
    }

    fun deleteById(id: Int){
        usersRepository.deleteById(id)
    }
}