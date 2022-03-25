package com.example.mvvmapplication.userlist.domain.repository

import com.example.mvvmapplication.userlist.domain.model.User

interface UserRepository {

    fun getUser(): List<User>

}