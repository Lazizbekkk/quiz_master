package com.example.mamadiyorov_lazizbek.quizappkotlin.data

data class QuestionData(
    var question: String,

    val variant1: String,

    val variant2: String,

    val variant3: String,

    val variant4: String,

    val answer: String
    )