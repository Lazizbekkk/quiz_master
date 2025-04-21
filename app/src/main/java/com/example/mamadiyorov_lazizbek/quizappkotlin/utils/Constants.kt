package com.example.mamadiyorov_lazizbek.quizappkotlin.utils

import com.example.mamadiyorov_lazizbek.quizappkotlin.data.QuestionData
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.UserQuestionData

object Constants {
    const val CORRECT_ANSWER: String = "CORRECT_ANSWER"
    const val WRONG_ANSWER: String = "WRONG_ANSWER"
    const val MISSED_ANSWER: String = "MISSED_ANSWER"
    const val MATH: String = "MATH"
    const val ONA_TILI: String = "ona_tili"

    var questionsListConstants = ArrayList<QuestionData>()
    var userQuestionsUserListConstants = ArrayList<UserQuestionData>()
}