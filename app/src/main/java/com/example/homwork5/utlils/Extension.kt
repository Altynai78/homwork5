package com.example.homwork5.utlils

import android.widget.ImageView

fun ImageView.loadImage(url: String){
    Glide.with(this).load(url).into(this)
}