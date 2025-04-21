package com.example.mamadiyorov_lazizbek.quizappkotlin.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mamadiyorov_lazizbek.quizappkotlin.R
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.UserQuestionData
import com.example.mamadiyorov_lazizbek.quizappkotlin.databinding.PageResultBinding
import java.util.ArrayList

class PageAdapter: RecyclerView.Adapter<PageAdapter.PagerVH>() {
    private val pageLists = ArrayList<UserQuestionData>()
    fun submitList(list: List<UserQuestionData>){
        pageLists.clear()
        pageLists.addAll(list)
        notifyDataSetChanged()
    }
    inner class PagerVH(private val binding: PageResultBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind() {

            binding.radio1.setImageResource(R.drawable.ic_unselect_quiz)
            binding.radio2.setImageResource(R.drawable.ic_unselect_quiz)
            binding.radio3.setImageResource(R.drawable.ic_unselect_quiz)
            binding.radio4.setImageResource(R.drawable.ic_unselect_quiz)



            val currentItem = pageLists[adapterPosition]


            val correctAnswerIndex = when (currentItem.answer) {
                currentItem.variant2 -> 1
                currentItem.variant3 -> 2
                currentItem.variant4 -> 3
                else -> 0
            }


            val userAnswerIndex = currentItem.userAnswer


            if (userAnswerIndex != -1) {

                if (userAnswerIndex == correctAnswerIndex) {
                    when (correctAnswerIndex) {
                        0 -> binding.radio1.setImageResource(R.drawable.ic_correct_res)
                        1 -> binding.radio2.setImageResource(R.drawable.ic_correct_res)
                        2 -> binding.radio3.setImageResource(R.drawable.ic_correct_res)
                        3 -> binding.radio4.setImageResource(R.drawable.ic_correct_res)
                    }
                } else {

                    when (userAnswerIndex) {
                        0 -> binding.radio1.setImageResource(R.drawable.ic_my_wrong)
                        1 -> binding.radio2.setImageResource(R.drawable.ic_my_wrong)
                        2 -> binding.radio3.setImageResource(R.drawable.ic_my_wrong)
                        3 -> binding.radio4.setImageResource(R.drawable.ic_my_wrong)
                    }

                    when (correctAnswerIndex) {
                        0 -> binding.radio1.setImageResource(R.drawable.ic_correct_res)
                        1 -> binding.radio2.setImageResource(R.drawable.ic_correct_res)
                        2 -> binding.radio3.setImageResource(R.drawable.ic_correct_res)
                        3 -> binding.radio4.setImageResource(R.drawable.ic_correct_res)
                    }
                }
            }


            binding.variant1.text = currentItem.variant1
            binding.variant2.text = currentItem.variant2
            binding.variant3.text = currentItem.variant3
            binding.variant4.text = currentItem.variant4
            binding.tvTextQuestion.text = currentItem.question
            binding.fanNomi.text = "Savol"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH =
        PagerVH(PageResultBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun getItemCount(): Int  = pageLists.size

    override fun onBindViewHolder(holder: PagerVH, position: Int) {
        holder.bind()
    }
}