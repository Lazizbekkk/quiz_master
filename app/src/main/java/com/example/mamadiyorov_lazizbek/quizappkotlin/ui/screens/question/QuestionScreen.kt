package com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.question

//noinspection SuspiciousImport
import android.R
import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.CategoryEnum
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.QuestionData
import com.example.mamadiyorov_lazizbek.quizappkotlin.databinding.ActivityQuestion2Binding
import com.example.mamadiyorov_lazizbek.quizappkotlin.ui.dialogs.QuizExitDialog
import com.example.mamadiyorov_lazizbek.quizappkotlin.ui.dialogs.QuizFinishDialog
import com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.result.ResultScreen
import com.example.mamadiyorov_lazizbek.quizappkotlin.utils.Constants.CORRECT_ANSWER
import com.example.mamadiyorov_lazizbek.quizappkotlin.utils.Constants.MISSED_ANSWER
import com.example.mamadiyorov_lazizbek.quizappkotlin.utils.Constants.WRONG_ANSWER


class QuestionView : AppCompatActivity(), QuestionCategory.View {

    private lateinit var binding: ActivityQuestion2Binding
    private lateinit var presenter: QuestionCategory.Presenter
    private var categoryEnum: CategoryEnum? = null

    private lateinit var dialogQuizExitDialog: QuizExitDialog
    private lateinit var diaQuizFinishDialog: QuizFinishDialog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //EdgeToEdge.enable(this)

        binding = ActivityQuestion2Binding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        ViewCompat.setOnApplyWindowInsetsListener(binding.rootQuestion2) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_FULLSCREEN
                        or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                )

        window.setDecorFitsSystemWindows(false)
        WindowInsetsControllerCompat(window, window.decorView).apply {
            hide(WindowInsetsCompat.Type.systemBars())
            systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }

        dialogQuizExitDialog = QuizExitDialog(this)
        diaQuizFinishDialog = QuizFinishDialog(this)


        loadViews()
        addClickEvent()

        categoryEnum = intent.getSerializableExtra("AAAAA") as? CategoryEnum
        presenter = QuestionPresenter(this)
        presenter.loadQuestion(categoryEnum = categoryEnum!!)
        presenter.displayResultsFanNomi()

        dialogQuizExitDialog.setYesBtnClicked {
            finish()
            dialogQuizExitDialog.dismiss()
        }

        binding.btnBack.setOnClickListener {
            dialogQuizExitDialog.show()

        }
        diaQuizFinishDialog.setYesBtnClicked {
            presenter.clickFinishBtn()
            val intent = Intent(this, ResultScreen::class.java).apply {
                putExtra(CORRECT_ANSWER, presenter.correctAnswer())
                putExtra(WRONG_ANSWER, presenter.wrongAnswer())
                putExtra(MISSED_ANSWER, presenter.missedAnswer())
                putExtra("FAN_NOMI2", binding.fanNomi.text.toString())
                putExtra("AAAAA", categoryEnum)
            }
            presenter.setQuestionList()
            presenter.setUserListCons()
            startActivity(intent)
            finish()
            diaQuizFinishDialog.dismiss()
        }
    }

    override fun nextBtnState(state: Int) {
        binding.btnNext.visibility = state
    }

    override fun prevBtnState(state: Int) {

        binding.btnPrev.visibility = state
    }

    override fun showQuestion(questionData: QuestionData) {
        binding.tvTextQuestion.text = questionData.question

        binding.variant1.text = questionData.variant1
        binding.variant2.text = questionData.variant2
        binding.variant3.text = questionData.variant3
        binding.variant4.text = questionData.variant4
    }

    override fun showSelectVariants(index: Int) {
        clearOldState()
        when (index) {
            0 -> {
                binding.radio1.isChecked = true
                setColorRadioBtn(binding.radio1)
            }

            1 -> {
                binding.radio2.isChecked = true
                setColorRadioBtn(binding.radio2)
            }

            2 -> {
                binding.radio3.isChecked = true
                setColorRadioBtn(binding.radio3)
            }

            3 -> {
                binding.radio4.isChecked = true
                setColorRadioBtn(binding.radio4)
            }
        }
    }

    override fun clearOldState() {
        binding.radio1.isChecked = false
        binding.radio2.isChecked = false
        binding.radio3.isChecked = false
        binding.radio4.isChecked = false
        setColorRadioBtn(binding.radio1)
        setColorRadioBtn(binding.radio2)
        setColorRadioBtn(binding.radio3)
        setColorRadioBtn(binding.radio4)
    }

    override fun setTextCurrentIndex(index: String, totalQuestionsCount: String) {
        binding.tvCurrentIndexQuestion.text = index
        binding.tvQuestionsCount.text = totalQuestionsCount
    }

    override fun setTextFanNomi(fanNomi: String) {
        binding.fanNomi.text = fanNomi
    }

    private fun loadViews() {
        // Shu yerda binding bilan barcha viewlarni boshlab o'rnatishimiz kerak emas, ViewBinding avtomatik ishlaydi.
    }

    private fun addClickEvent() {
        binding.line1.setOnClickListener { presenter.selectVariantIndex(0) }
        binding.line2.setOnClickListener { presenter.selectVariantIndex(1) }
        binding.line3.setOnClickListener { presenter.selectVariantIndex(2) }
        binding.line4.setOnClickListener { presenter.selectVariantIndex(3) }

        binding.tvFinish.setOnClickListener {
            diaQuizFinishDialog.show()
        }

        binding.btnPrev.setOnClickListener { presenter.clickPrevBtn() }
        binding.btnNext.setOnClickListener { presenter.clickNextBtn() }
    }

    @SuppressLint("ObsoleteSdkInt")
    private fun setColorRadioBtn(radioButton: RadioButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            val colorStateList = ColorStateList(
                arrayOf(
                    intArrayOf(-R.attr.state_enabled),  // Disabled
                    intArrayOf(R.attr.state_enabled) // Enabled
                ), intArrayOf(
                    Color.rgb(252, 192, 0), Color.rgb(252, 192, 0)
                )
            )

            radioButton.setButtonTintList(colorStateList) // set the color tint list
            radioButton.invalidate() // Could not be necessary
        }
    }
}
