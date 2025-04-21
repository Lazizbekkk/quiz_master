package com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.result

interface ResultContract {
    interface Model{
      fun clearUserList()

    }

    interface View {
        fun setResult(correctAnswer: Int, wrongAnswer: Int, missedAnswer: Int, fanNomi: String, present: Double)
    }

    interface Presenter {
        fun onResultsReceived(correctAnswer: Int, wrongAnswer: Int, missedAnswer: Int, fanNomi: String, present: Double)
        fun displayResults()
        fun clearUserList()
    }

}