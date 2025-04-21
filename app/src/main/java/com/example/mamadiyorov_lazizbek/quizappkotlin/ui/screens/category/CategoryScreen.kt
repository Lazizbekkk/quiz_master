package com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.category

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.mamadiyorov_lazizbek.quizappkotlin.R
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.CategoryEnum
import com.example.mamadiyorov_lazizbek.quizappkotlin.databinding.ActivityQuestionCategoryBinding
import com.example.mamadiyorov_lazizbek.quizappkotlin.ui.adapters.CategoryAdapter
import com.example.mamadiyorov_lazizbek.quizappkotlin.ui.dialogs.FinishAllDialog
import com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.info.InfoActivity
import com.example.mamadiyorov_lazizbek.quizappkotlin.ui.screens.question.QuestionView

class CategoryScreen : AppCompatActivity(R.layout.activity_question_category),
    CategoryContract.View {
    private lateinit var binding: ActivityQuestionCategoryBinding
    private lateinit var presenter: CategoryContract.Presenter
    private lateinit var dialog: FinishAllDialog

    private lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuestionCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
            enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(binding.rootCategory) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
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

        dialog = FinishAllDialog(this)


        presenter = CategoryPresenter(this)

        adapter = CategoryAdapter()
        adapter.submitList(presenter.getAllCategory())
        binding.rvCategory.adapter = adapter
        binding.rvCategory.layoutManager = GridLayoutManager(this,3)

        binding.lottieAnimationInfo.setOnClickListener {
           startActivity(Intent(this@CategoryScreen, InfoActivity()::class.java))

        }
        adapter.setItemClickedCategory { itemPosition ->
            presenter.itemCategoryClicked(itemPosition)
        }


        dialog.setYesBtnClicked {
            finishAffinity()
            dialog.dismiss()
        }

    }

    override fun onBackPressed() {
        dialog.show()
    }

    override fun openQuestionScreen(string: String, categoryEnum: CategoryEnum) {
        val intent = Intent(this@CategoryScreen, QuestionView::class.java)
        intent.putExtra("AAAAA", categoryEnum)
        intent.putExtra("FAN_NOMI", string)
        startActivity(intent)
    }
}