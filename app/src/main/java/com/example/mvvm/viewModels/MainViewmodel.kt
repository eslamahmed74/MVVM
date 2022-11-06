package com.example.mvvm.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.mvvm.model.FakeApiServices
import com.example.mvvm.model.FakeDatabase
import com.example.mvvm.model.JokeResponce
import com.example.mvvm.model.MyColors
import com.example.mvvm.network.API
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainViewmodel : ViewModel() {

    val joke=MutableLiveData<JokeResponce>()

    init{
        getRandomJoke()
    }

    private fun getRandomJoke() {
        viewModelScope.launch {
            withContext(Dispatchers.IO){
            val result=API.apiServecie.getRandomJoke()
            joke.postValue(result)
            }
        }
    }
}