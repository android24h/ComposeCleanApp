package com.example.myapplication.data

import com.example.myapplication.domain.model.UserName
import com.example.myapplication.domain.repository.UserRepository

class UserRepositoryImpl : UserRepository {
    private val users = mutableListOf<UserName>()
    override fun addUser(item: UserName) {
      users.add(item)
    }

    override fun showAllUser(): List<UserName> {
       return users
    }
}