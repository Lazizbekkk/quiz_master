package com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.analysis_result

import com.example.mamadiyorov_lazizbek.quizappkotlin.data.UserQuestionData

interface AnalysisResContract {
    interface Model{
        fun getAllUserList(): List<UserQuestionData>
    }
    interface View{
        fun openLastScreen()
        fun showAnalyseResult()
    }
    interface Presenter{
        fun clickedBackButton()
        fun getAllUserList(): List<UserQuestionData>
    }
}