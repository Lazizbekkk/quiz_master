package com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.analysis_result

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.graphics.Insets
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.mamadiyorov_lazizbek.quizappkotlin.R
import com.example.mamadiyorov_lazizbek.quizappkotlin.databinding.ActivityQuestionResBinding
import com.example.mamadiyorov_lazizbek.quizappkotlin.ui.adapters.PageAdapter

class AnalysisResScreen: AppCompatActivity(R.layout.activity_question_res), AnalysisResContract.View {
    private lateinit var binding: ActivityQuestionResBinding
    private lateinit var presenter: AnalysisResContract.Presenter
    private lateinit var adapter: PageAdapter
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionResBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(binding.rootAnalisRes) { v, insets ->
            val systemBars: Insets = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_FULLSCREEN
                        or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                )

        WindowInsetsControllerCompat(window, window.decorView).apply {
            hide(WindowInsetsCompat.Type.systemBars())
            systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }


        presenter = AnalysisResPresenter(this)
        adapter = PageAdapter()
        showAnalyseResult()
        binding.pagersResult.adapter = adapter

        binding.pagersResult.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                // Update current question index
                binding.tvCurrentIndexQuestion.text = (position + 1).toString()
            }
        })

        binding.tvQuestionsCount.text = 25.toString()

        binding.btnBack.setOnClickListener {
            finish()
        }


    }


    override fun openLastScreen() {
        finish()
    }

    override fun showAnalyseResult() {
       adapter.submitList(presenter.getAllUserList())
        Log.d("LLLLLL", presenter.getAllUserList().toString())
    }
}