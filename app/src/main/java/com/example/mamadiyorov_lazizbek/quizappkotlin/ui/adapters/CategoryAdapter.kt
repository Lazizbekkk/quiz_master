package com.example.mamadiyorov_lazizbek.quizappkotlin.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mamadiyorov_lazizbek.quizappkotlin.data.CategoryData
import com.example.mamadiyorov_lazizbek.quizappkotlin.databinding.ItemScienceBinding

class CategoryAdapter: RecyclerView.Adapter<CategoryAdapter.CategoryVH>() {
    private val categoryList = ArrayList<CategoryData>()
    private var itemClickedCategory : ((Int) -> Unit) ?= null
    fun submitList(list: List<CategoryData>){
        categoryList.clear()
        categoryList.addAll(list)
        notifyDataSetChanged()
    }
    inner class CategoryVH(private val binding: ItemScienceBinding): RecyclerView.ViewHolder(binding.root){
        init {
            binding.root.setOnClickListener {
                itemClickedCategory?.invoke(adapterPosition)
            }
        }
        fun bind(){
            binding.tvCategoryName.text = categoryList[adapterPosition].categoryName
            binding.ivCategoryImg.setImageResource(categoryList[adapterPosition].categoryImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryVH  =
        CategoryVH(ItemScienceBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun getItemCount(): Int = 9

    override fun onBindViewHolder(holder: CategoryVH, position: Int) {
        holder.bind()
    }
    fun setItemClickedCategory(block: ((Int) -> Unit)){
        itemClickedCategory = block
    }
}