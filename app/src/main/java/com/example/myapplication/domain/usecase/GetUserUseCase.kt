package com.example.myapplication.domain.usecase

import com.example.myapplication.domain.repository.UserRepository

class GetUserUseCase(
    val repository: UserRepository
){
    fun execute()=repository.showAllUser()

}