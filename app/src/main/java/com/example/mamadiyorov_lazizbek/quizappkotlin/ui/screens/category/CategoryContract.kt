package com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.category

import com.example.mamadiyorov_lazizbek.quizappkotlin.data.CategoryData
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.CategoryEnum

interface CategoryContract {
    interface Model{
       fun getAllCategory(): List<CategoryData>
    }
    interface View{
      fun openQuestionScreen(string: String, categoryEnum: CategoryEnum)
    }
    interface Presenter{
      fun itemCategoryClicked(itemPosition: Int)
      fun getAllCategory(): List<CategoryData>
    }
}