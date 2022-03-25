package com.example.mvvmapplication.userlist.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmapplication.databinding.LayoutListItemBinding
import com.example.mvvmapplication.userlist.domain.model.User

class UserAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val mDiffer = AsyncListDiffer(this, DIFF_UTIL)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return UserViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user = mDiffer.currentList[position]

        when (holder) {
            is UserViewHolder -> {
                holder.bind(user)
            }
        }

    }

    fun submitList(list: List<User>) {
        mDiffer.submitList(list)
    }

    override fun getItemCount(): Int {
        return mDiffer.currentList.size
    }

    class UserViewHolder(private val binding: LayoutListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(user: User) {
            binding.user = user
            binding.executePendingBindings()
        }

        companion object {

            fun from(parent: ViewGroup): RecyclerView.ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = LayoutListItemBinding.inflate(layoutInflater, parent, false)
                return UserViewHolder(binding)
            }
        }

    }


    companion object {
        val DIFF_UTIL: DiffUtil.ItemCallback<User> = object : DiffUtil.ItemCallback<User>() {
            override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
                return oldItem == newItem
            }

            override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
                return oldItem.firstName == newItem.firstName
            }
        }

    }

}

