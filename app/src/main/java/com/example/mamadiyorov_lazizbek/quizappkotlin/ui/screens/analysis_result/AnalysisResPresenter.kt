package com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.analysis_result

import com.example.mamadiyorov_lazizbek.quizappkotlin.data.UserQuestionData

class AnalysisResPresenter(private val view: AnalysisResContract.View): AnalysisResContract.Presenter {
    private val model : AnalysisResContract.Model = AnalysisResModel()
    override fun clickedBackButton() {
       view.openLastScreen()
    }


    override fun getAllUserList(): List<UserQuestionData>  = model.getAllUserList()


}