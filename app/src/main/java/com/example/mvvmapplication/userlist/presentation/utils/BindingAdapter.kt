package com.example.mvvmapplication.userlist.presentation.utils


import androidx.appcompat.widget.AppCompatImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.mvvmapplication.R

@BindingAdapter("imageUrl")
fun setImageUrl(imgView: AppCompatImageView, imgUrl: String?) {

    imgUrl?.let {
        val imgUri = it.toUri().buildUpon().scheme("https").build()
        Glide.with(imgView.context)
            .load(imgUri)
            .apply(
                RequestOptions()
                    .placeholder(R.drawable.ic_baseline_add_reaction_24)
                    .error(R.drawable.ic_launcher_foreground)
            )
            .circleCrop()
            .into(imgView)
    }
}