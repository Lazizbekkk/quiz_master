package com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.result

class ResultPresenter(private val view: ResultContract.View) : ResultContract.Presenter {

    private val model: ResultContract.Model = ResultModel()
    private var correctAnswer = 0
    private var wrongAnswer = 0
    private var missedAnswer = 0
    private var fanNomi: String? = null
    private var result : Double = 0.0


    override fun onResultsReceived(correctAnswer: Int, wrongAnswer: Int, missedAnswer: Int, fanNomi: String, present: Double) {
        this.correctAnswer = correctAnswer
        this.wrongAnswer = wrongAnswer
        this.missedAnswer = missedAnswer
        this.fanNomi = fanNomi

        result = present * 100
    }

    override fun displayResults() {
        view.setResult(correctAnswer, wrongAnswer, missedAnswer, fanNomi ?: "", result)
    }

    override fun clearUserList() {
        model.clearUserList()
    }
}
