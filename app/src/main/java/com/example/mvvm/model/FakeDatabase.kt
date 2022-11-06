package com.example.mvvm.model

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FakeDatabase {
    fun getCurrentUser() = flow<String> {  emit("Islam")}
}