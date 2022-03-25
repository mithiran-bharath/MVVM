package com.example.mvvmapplication.userlist.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmapplication.R
import com.example.mvvmapplication.databinding.ActivityMainBinding
import com.example.mvvmapplication.userlist.data.fakedatasource.FakeUserRepositoryImpl
import com.example.mvvmapplication.userlist.presentation.utils.UserViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter: UserAdapter by lazy {
        UserAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val userViewModelFactory = UserViewModelFactory(FakeUserRepositoryImpl())

        val viewModel = ViewModelProvider(this, userViewModelFactory).get(MainViewModel::class.java)
        binding.rvUserList.adapter = adapter
        binding.lifecycleOwner = this

        viewModel.userList.observe(this) {
            it.let {
                adapter.submitList(it)
            }
        }
    }




}