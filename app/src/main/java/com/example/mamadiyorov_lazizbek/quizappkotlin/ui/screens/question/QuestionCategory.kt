package com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.question

import com.example.mamadiyorov_lazizbek.quizappkotlin.data.CategoryData
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.CategoryEnum
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.QuestionData
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.UserQuestionData

interface QuestionCategory {
    interface Model {
        fun getQuestions(categoryEnum: CategoryEnum): List<QuestionData>
        fun fanNomi(): String
        fun insertUserByIndex(userQuestionData: UserQuestionData, index: Int)


        fun getUserQuestionDataBYIndex(index: Int): UserQuestionData
        fun setQuestionList(list: List<QuestionData>)

        fun setUserListCons(list: List<UserQuestionData>)
        fun getUserListRepo(): List<UserQuestionData>

    }

    interface View {
        fun nextBtnState(integer: Int)
        fun prevBtnState(integer: Int)
        fun showQuestion(questionData: QuestionData)
        fun showSelectVariants(index: Int)
        fun clearOldState()
        fun setTextCurrentIndex(index: String, totalQuestionsCount: String)
        fun setTextFanNomi(fanNomi: String)
    }

    interface Presenter {
        fun loadQuestion(categoryEnum: CategoryEnum)
        fun selectVariantIndex(index: Int)
        fun clickNextBtn()
        fun clickPrevBtn()
        fun clickFinishBtn()
        fun correctAnswer(): Int
        fun wrongAnswer(): Int
        fun missedAnswer(): Int
        fun displayResultsFanNomi()
        fun insertUserByIndex(userQuestionData: UserQuestionData, index: Int)
        fun getUserQuestionDataBYIndex(index: Int): UserQuestionData
        fun setQuestionList()

        fun setUserListCons()
    }
}