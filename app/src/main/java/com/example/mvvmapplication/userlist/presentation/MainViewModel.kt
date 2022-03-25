package com.example.mvvmapplication.userlist.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmapplication.userlist.domain.model.User
import com.example.mvvmapplication.userlist.domain.repository.UserRepository

class MainViewModel(repository: UserRepository): ViewModel() {

    private val _userList = MutableLiveData<List<User>>()
    val userList: LiveData<List<User>> = _userList

    init {
        _userList.value = repository.getUser()
    }

}