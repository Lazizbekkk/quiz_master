package com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.question

import android.util.Log
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.CategoryEnum
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.QuestionData
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.UserQuestionData


class QuestionPresenter(private val view: QuestionCategory.View) : QuestionCategory.Presenter {


    private val model: QuestionCategory.Model = QuestionModel()
    private var currentIndex = 0
    private var totalQuestionsCount = 0

    private lateinit var questionDataList: List<QuestionData>
    private lateinit var userSpecifiedAnswersList: MutableList<Int>

    private var correctAnswer = 0
    private var wrongAnswer = 0
    private var missedAnswer = 0
    private var categoryEnum = CategoryEnum.ONA_TILI




    override fun loadQuestion(categoryEnum: CategoryEnum) {
        this.categoryEnum = categoryEnum
        questionDataList = model.getQuestions(categoryEnum)
        totalQuestionsCount = questionDataList.size
        view.setTextCurrentIndex((currentIndex + 1).toString(), totalQuestionsCount.toString())
        initUserSpecifiedAnswersList()
        showQuestionToView()
    }

    override fun selectVariantIndex(index: Int) {
        Log.d("LLLL", "selectVariantIndex : index keldi ->  $index")
        view.clearOldState()
        view.showSelectVariants(index)
        var userQuestionData = model.getUserQuestionDataBYIndex(currentIndex)
        userQuestionData.userAnswer = index
        model.insertUserByIndex(userQuestionData, currentIndex)


        userSpecifiedAnswersList[currentIndex] = index
        Log.d(
            "LLLL",
            "selectVariantIndex : userList ->  ${userSpecifiedAnswersList.joinToString()}"
        )
    }

    override fun clickNextBtn() {
        currentIndex++

        showQuestionToView()
        if (userSpecifiedAnswersList[currentIndex] != -1) {
            view.showSelectVariants(userSpecifiedAnswersList[currentIndex])
        }
        if (currentIndex == totalQuestionsCount - 1) {
            view.nextBtnState(4)
            view.prevBtnState(0)
            view.setTextCurrentIndex((currentIndex + 1).toString(), totalQuestionsCount.toString())

            return
        }


        view.setTextCurrentIndex((currentIndex + 1).toString(), totalQuestionsCount.toString())
        view.prevBtnState(0)
    }

    override fun clickPrevBtn() {
        currentIndex--
        showQuestionToView()
        if (currentIndex >= 0 && userSpecifiedAnswersList[currentIndex] != -1) {
            view.showSelectVariants(userSpecifiedAnswersList[currentIndex])
        }

        if (currentIndex == 0) {
            view.prevBtnState(4)
            view.nextBtnState(0)
            view.setTextCurrentIndex((currentIndex + 1).toString(), totalQuestionsCount.toString())
            return
        }

        view.setTextCurrentIndex((currentIndex + 1).toString(), totalQuestionsCount.toString())
        view.nextBtnState(0)
    }

    override fun clickFinishBtn() {
        Log.d("SIZE", "userSpecifiedAnswersList_SIZE: ${userSpecifiedAnswersList.size}")
        for (i in userSpecifiedAnswersList.indices) {
            when (userSpecifiedAnswersList[i]) {
                -1 -> missedAnswer++
                0 -> if (questionDataList[i].variant1 == questionDataList[i].answer) correctAnswer++
                1 -> if (questionDataList[i].variant2 == questionDataList[i].answer) correctAnswer++
                2 -> if (questionDataList[i].variant3 == questionDataList[i].answer) correctAnswer++
                3 -> if (questionDataList[i].variant4 == questionDataList[i].answer) correctAnswer++
            }
        }
        wrongAnswer = userSpecifiedAnswersList.size - correctAnswer - missedAnswer
    }

    override fun correctAnswer(): Int = correctAnswer
    override fun wrongAnswer(): Int = wrongAnswer

    override fun missedAnswer(): Int = missedAnswer


    override fun displayResultsFanNomi() {
        view.setTextFanNomi(model.fanNomi())
    }

    override fun insertUserByIndex(userQuestionData: UserQuestionData, index: Int) {
        model.insertUserByIndex(userQuestionData, index)
    }

    override fun getUserQuestionDataBYIndex(index: Int): UserQuestionData  = model.getUserQuestionDataBYIndex(index)
    override fun setQuestionList() {
        model.setQuestionList(model.getQuestions(categoryEnum))
    }

    override fun setUserListCons() {
        model.setUserListCons(model.getUserListRepo())
    }

    private fun showQuestionToView() {
        view.clearOldState()
        view.showQuestion(questionDataList[currentIndex])
    }

    private fun initUserSpecifiedAnswersList() {
        userSpecifiedAnswersList = MutableList(totalQuestionsCount) { -1 }
        Log.d("SIZE2", "size_user : ${userSpecifiedAnswersList.size}")
    }
}

