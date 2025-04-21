package com.example.mamadiyorov_lazizbek.quizappkotlin.ui.dialogs

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.ViewGroup
import com.example.mamadiyorov_lazizbek.quizappkotlin.databinding.DialogFinishAppBinding

class FinishAllDialog(context: Context): Dialog(context) {
    private var yesBtnClicked: (() -> Unit) ?= null

    private lateinit var binding: DialogFinishAppBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogFinishAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.noBtn.setOnClickListener {
            dismiss()
        }

        binding.yesBtn.setOnClickListener {
            yesBtnClicked?.invoke()
        }


        window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT , ViewGroup.LayoutParams.MATCH_PARENT)
        window?.setBackgroundDrawableResource(android.R.color.transparent)


    }

    fun setYesBtnClicked(block: (() -> Unit)){
        yesBtnClicked = block
    }
}