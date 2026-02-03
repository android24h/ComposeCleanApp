package com.example.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.presentation.UserViewModel

@Composable
fun Screen(viewModel: UserViewModel) {
    var txtUser by remember {
        mutableStateOf("")
    }

    val users by viewModel.users.collectAsState()
    val error by viewModel.error.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Sample Code for Clean Architecture",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 30.sp
        )
        TextField(
            value = txtUser,
            onValueChange = { txtUser = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            isError = error.isNotEmpty()
        )
        if (error.isNotEmpty()){
            Text(text = error, color = Color.Red, modifier = Modifier.fillMaxWidth().padding(top = 4.dp), textAlign = TextAlign.Center)
        }
        Row (
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
        ){
            Button(onClick = {
               viewModel.addUsers(txtUser)
                txtUser=""

            }) {
                Text(text = "Add")
            }
            
        }
        
        LazyColumn(contentPadding = PaddingValues(12.dp)){
            items(users){item->
                Text(text = item, fontSize = 20.sp)
                


        }


    }


}}