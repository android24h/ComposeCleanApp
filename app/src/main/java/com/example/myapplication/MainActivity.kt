package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.myapplication.data.UserRepositoryImpl
import com.example.myapplication.domain.usecase.AddUserUseCase
import com.example.myapplication.domain.usecase.GetUserUseCase
import com.example.myapplication.presentation.UserViewModel

class MainActivity : ComponentActivity() {

    val repository = UserRepositoryImpl()
    val addUserUseCase = AddUserUseCase(repository)
    val getUsersUseCase = GetUserUseCase(repository)

    val viewModel = UserViewModel(
        addUserUseCase,
        getUsersUseCase
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Screen(viewModel=viewModel)


        }
    }
}

