package com.example.demo.controllers

import com.example.demo.models.User
import com.example.demo.services.UsersService
import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UsersController(private val objectMapper: ObjectMapper, private val usersService: UsersService) {

    @GetMapping()
    fun findAll(): ResponseEntity<List<User>>{
        var allTheUsers = usersService.findAll()
        return ResponseEntity.ok(allTheUsers)
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int): ResponseEntity<User>{
        var myOnlyUser = usersService.findById(id)
        return ResponseEntity.ok(myOnlyUser)
    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Int){
        usersService.deleteById(id)
    }

    @PutMapping("/save")
    fun save(@RequestBody user: User){
        usersService.save(user)
    }

}
//    @GetMapping()
//    fun findAll(): String{
//        val allTheUsers = usersService.findAll()
//
//        println(allTheUsers)
//
//        val myJsonResponse: String = objectMapper.writeValueAsString(allTheUsers)
//
//        println(myJsonResponse)
//
//        return myJsonResponse
//    }
