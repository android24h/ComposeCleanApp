package com.example.myapplication.domain.repository

import com.example.myapplication.domain.model.UserName

interface UserRepository {
    fun addUser(item:UserName)
    fun showAllUser():List<UserName>
}