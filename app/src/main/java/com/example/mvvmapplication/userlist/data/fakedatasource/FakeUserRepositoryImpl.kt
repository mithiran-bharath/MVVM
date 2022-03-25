package com.example.mvvmapplication.userlist.data.fakedatasource

import com.example.mvvmapplication.userlist.domain.model.User
import com.example.mvvmapplication.userlist.domain.repository.UserRepository

class FakeUserRepositoryImpl: UserRepository {

    override fun getUser(): List<User> {
        return FakeDataSource.list
    }
}