package com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.analysis_result

import com.example.mamadiyorov_lazizbek.quizappkotlin.data.UserQuestionData
import com.example.mamadiyorov_lazizbek.quizappkotlin.domain.AppRepository

class AnalysisResModel : AnalysisResContract.Model {
    private val repository = AppRepository()
    override fun getAllUserList(): List<UserQuestionData>  = repository.getUserConsQuestionList()
}