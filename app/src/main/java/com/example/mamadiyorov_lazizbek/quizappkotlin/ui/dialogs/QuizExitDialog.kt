package com.example.mamadiyorov_lazizbek.quizappkotlin.ui.dialogs

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.ViewGroup
import com.example.mamadiyorov_lazizbek.quizappkotlin.databinding.DialogFinishAppBinding
import com.example.mamadiyorov_lazizbek.quizappkotlin.databinding.DialogQuizExitBinding

class QuizExitDialog(context: Context): Dialog(context) {
    private var yesBtnClicked: (() -> Unit) ?= null

    private lateinit var binding: DialogQuizExitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogQuizExitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.yesBtn.setOnClickListener {
            yesBtnClicked?.invoke()
        }

        binding.noBtn.setOnClickListener {
            dismiss()
        }


        window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT , ViewGroup.LayoutParams.MATCH_PARENT)
        window?.setBackgroundDrawableResource(android.R.color.transparent)


    }

    fun setYesBtnClicked(block: (() -> Unit)){
        yesBtnClicked = block
    }
}