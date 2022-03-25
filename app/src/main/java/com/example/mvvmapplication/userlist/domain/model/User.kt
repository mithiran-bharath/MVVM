package com.example.mvvmapplication.userlist.domain.model



data class User(
    val firstName: String,
    val lastName: String,
    val designation: String,
    val email: String,
    val profile : String
)