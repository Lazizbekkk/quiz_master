package com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.category

import android.util.Log
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.CategoryData
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.CategoryEnum

class CategoryPresenter(private val view: CategoryContract.View): CategoryContract.Presenter {
    private val model : CategoryContract.Model = CategoryModel()
    override fun itemCategoryClicked(itemPosition: Int) {
        var itemName = ""
        val categoryEnum: CategoryEnum

        Log.d("Pos", "itemPosition: $itemPosition")

        when(itemPosition){
            0 -> {
                itemName = "Matematika"
                categoryEnum = CategoryEnum.MATEMATIKA
            }
            1 -> {
                itemName = "Ona - tili"
                categoryEnum = CategoryEnum.ONA_TILI
            }
            2 ->{
                itemName = "Fizika"
                categoryEnum = CategoryEnum.FIZIKA
            }
            3 ->{
                itemName = "Biologiya"
                categoryEnum = CategoryEnum.BIOLOGY
            }
            4 ->{
                itemName = "Kimyo"
                categoryEnum = CategoryEnum.KIMYO
            }
            5 ->{
                itemName = "Tarix Uzb"
                categoryEnum = CategoryEnum.TARIX_UZB
            }
            6 ->{
                itemName = "Geografiya"
                categoryEnum = CategoryEnum.GEOGRAFIYA
            }
            7 ->{
                itemName = "Rus tili"
                categoryEnum = CategoryEnum.RUS_TILI
            }
            8 ->{
                itemName = "Englis tili"
                categoryEnum = CategoryEnum.ENG_TILI
            }
            else ->{
                itemName = "Englis tili"
                categoryEnum = CategoryEnum.ENG_TILI
            }

        }
        view.openQuestionScreen(itemName, categoryEnum)
    }

    override fun getAllCategory(): List<CategoryData>  = model.getAllCategory()

}