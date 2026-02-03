package com.example.myapplication.domain.usecase

import com.example.myapplication.domain.model.UserName
import com.example.myapplication.domain.repository.UserRepository

class AddUserUseCase(
    private val repository: UserRepository
) {

    fun execute(name: String): Result<Unit> {
        if (name.isBlank()) {
            return Result.failure(
                IllegalArgumentException("فیلد نمی تواند خالی باشد")
            )
        }
        repository.addUser(UserName(name))
        return Result.success(Unit)
    }


}