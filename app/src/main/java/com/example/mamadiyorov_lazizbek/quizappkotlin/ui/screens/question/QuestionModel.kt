package com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.question

import com.example.mamadiyorov_lazizbek.quizappkotlin.data.CategoryEnum
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.QuestionData
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.UserQuestionData
import com.example.mamadiyorov_lazizbek.quizappkotlin.domain.AppRepository

class QuestionModel : QuestionCategory.Model{
    private val repository = AppRepository()
    override fun getQuestions(categoryEnum: CategoryEnum): List<QuestionData>  = repository.loadQuestionByCategory(categoryEnum)

    override fun fanNomi(): String =repository.fanNomi()
    override fun insertUserByIndex(userQuestionData: UserQuestionData, index: Int) = repository.insertUserByIndex(userQuestionData, index)
    override fun getUserQuestionDataBYIndex(index: Int): UserQuestionData  = repository.getUserQuestion(index)
    override fun setQuestionList(list: List<QuestionData>) {
        repository.setConsQuestionList(list)
    }

    override fun setUserListCons(list: List<UserQuestionData>) {
        repository.setUserConsQuestionList(list)
    }

    override fun getUserListRepo(): List<UserQuestionData> {
      return  repository.getAllUserQuestion()
    }
}