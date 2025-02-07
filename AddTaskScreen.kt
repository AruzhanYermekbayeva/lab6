package com.example.todoapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AddTaskScreen(onTaskAdded: (String) -> Unit, onDismiss: () -> Unit) {
    var taskText by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        TextField(value = taskText, onValueChange = { taskText = it }, label = { Text("Enter Task") })

        Button(
            onClick = {
                if (taskText.isNotEmpty()) {
                    onTaskAdded(taskText)
                    onDismiss()
                }
            },
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text("Save")
        }
    }
}
