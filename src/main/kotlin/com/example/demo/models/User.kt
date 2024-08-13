package com.example.demo.models

import jakarta.persistence.*

@Entity
@Table(name = "users")
data class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long,

    @Column(name = "first_name")
    private var firstName: String,

    @Column(name = "second_name")
    private var secondName: String,

    @Column(name = "email", unique = true)
    private var email: String,

    @Column(name = "password")
    private var password: String
){
    fun getFirstName(): String{
        return firstName;
    }

    fun getSecondName(): String{
        return secondName;
    }

    fun getId(): Long{
        return id;
    }

    fun getEmail(): String{
        return email;
    }
    fun getPassword(): String{
        return password;
    }
}
