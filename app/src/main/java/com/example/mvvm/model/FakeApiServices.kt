package com.example.mvvm.model

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import java.util.concurrent.Flow

class FakeApiServices {
    private val wisdomList = listOf<String>(
        "The fool doth think he is wise, but the wise man knows himself to be a fool",
        "It is better to remain silent at the risk of being thought a fool, than to talk and remove all doubt of it",
        "It is better to remain silent at the risk of being thought a fool, than to talk and remove all doubt of it",
        "When someone loves you, the way they talk about you is different. You feel safe and comfortable",
        "Knowing yourself is the beginning of all wisdom",
        "The only true wisdom is in knowing you know nothing"
        )

    suspend fun getRandomWisdom(): kotlinx.coroutines.flow.Flow<Any> {
        val random=(Math.random() * wisdomList.size).toInt()
        delay(5000)
        return flow<String> {  emit(wisdomList[random])}
    }
}