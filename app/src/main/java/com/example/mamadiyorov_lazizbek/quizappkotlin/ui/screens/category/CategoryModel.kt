package com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.category

import android.util.Log
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.CategoryData
import com.example.mamadiyorov_lazizbek.quizappkotlin.domain.AppRepository

class CategoryModel : CategoryContract.Model{
    override fun getAllCategory(): List<CategoryData> {

        Log.d("LLLLLLLL", "list AppRepo:  ${AppRepository().getAllCategoryList().toString()}")
        return AppRepository().getAllCategoryList()
    }
}