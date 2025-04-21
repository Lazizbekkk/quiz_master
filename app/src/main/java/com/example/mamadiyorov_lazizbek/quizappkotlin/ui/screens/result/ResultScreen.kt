package com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.result

import android.annotation.SuppressLint
import android.content.Intent
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
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.CategoryEnum
import com.example.mamadiyorov_lazizbek.quizappkotlin.databinding.ActivityResultBinding
import com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.analysis_result.AnalysisResScreen
import com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.question.QuestionView
import com.example.mamadiyorov_lazizbek.quizappkotlin.utils.Constants.CORRECT_ANSWER
import com.example.mamadiyorov_lazizbek.quizappkotlin.utils.Constants.MISSED_ANSWER
import com.example.mamadiyorov_lazizbek.quizappkotlin.utils.Constants.WRONG_ANSWER


class ResultScreen : AppCompatActivity(), ResultContract.View {

    private lateinit var binding: ActivityResultBinding
    private lateinit var presenter: ResultContract.Presenter
    private var categoryEnum: CategoryEnum? = null

    private var fan: String? = null
    private var wrong = 0
    private var missed = 0
    private var correct = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(binding.rootResult2) { v, insets ->
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

        categoryEnum = intent.getSerializableExtra("AAAAA") as? CategoryEnum
        wrong = intent.getIntExtra(WRONG_ANSWER, 0)
        missed = intent.getIntExtra(MISSED_ANSWER, 0)
        correct = intent.getIntExtra(CORRECT_ANSWER, 0)
        fan = intent.getStringExtra("FAN_NOMI2")

        Log.d("JLKJLK", " --------------------------")
        Log.d("JLKJLK", "wrong:  $wrong")
        Log.d("JLKJLK", "missed:  $missed")
        Log.d("JLKJLK", "correct:  $correct")
        val result = (correct.toDouble() / 25)
        Log.d("JLKJLK", "result:  $result")

        presenter = ResultPresenter(this)
        presenter.onResultsReceived(correct, wrong, missed, fanNomi = fan.toString(), result)
        presenter.displayResults()

        binding.btnBack.setOnClickListener {
            presenter.clearUserList()
            finish()
        }
        binding.replayQuestion.setOnClickListener {
            val intent = Intent(this@ResultScreen, QuestionView::class.java)
            intent.putExtra("AAAAA", categoryEnum)
            intent.putExtra("FAN_NOMI", fan)
            startActivity(intent)
            finish()
        }
        binding.anaylsQuestion.setOnClickListener {
            startActivity(Intent(this@ResultScreen, AnalysisResScreen::class.java))
        }
    }

    override fun onBackPressed() {
        presenter.clearUserList()
        finish()

    }



    @SuppressLint("SetTextI18n")
    override fun setResult(correctAnswer: Int, wrongAnswer: Int, missedAnswer: Int, fanNomi: String, present: Double) {
        binding.apply {
            wrongAns.text = "$wrongAnswer"
            correctAns.text = "$correctAnswer"
            missedAns.text = "$missedAnswer"
            Log.d("JLKJLK", "ReSULT KELDI PRESENTER   setRESULT:  $present")
            binding.result.text = present.toString()

          // fanNomiRes.text = fan
        }    }
}
