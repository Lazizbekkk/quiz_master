package com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.result

import com.example.mamadiyorov_lazizbek.quizappkotlin.domain.AppRepository

class ResultModel : ResultContract.Model {
    private val repository = AppRepository()

    override fun clearUserList() {
        repository.clearUserList()
        repository.setUserConsQuestionList(ArrayList())
    }
}