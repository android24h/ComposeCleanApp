package com.example.myapplication.presentation

import androidx.lifecycle.ViewModel
import com.example.myapplication.domain.usecase.AddUserUseCase
import com.example.myapplication.domain.usecase.GetUserUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class UserViewModel(
    private val addUsersUseCase:AddUserUseCase,
    private val getUserUseCase: GetUserUseCase
):ViewModel() {
    private val _users=MutableStateFlow(listOf<String>())
    val users: StateFlow<List<String>> = _users

    private val _errorMessage=MutableStateFlow("")
    val error: StateFlow<String> = _errorMessage

    fun addUsers(name:String){
        val result= addUsersUseCase.execute(name)

        if (result.isFailure){
            _errorMessage.value=result.exceptionOrNull() ?.message ?:""
        }else{
            _errorMessage.value=""
            _users.value=getUserUseCase.execute().map { it.name }
        }

    }

}