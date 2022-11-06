package com.example.mvvm

import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.example.mvvm.model.MyColors

@BindingAdapter(value = ["newColor"])
fun changeColor(view: View, colors: MyColors?) {
    when (colors) {
        MyColors.RED -> view.setBackgroundColor(ContextCompat.getColor(view.context, R.color.black))
        MyColors.YELLOW -> view.setBackgroundColor(
            ContextCompat.getColor(
                view.context,
                R.color.purple_500
            )
        )

        MyColors.BLUE -> view.setBackgroundColor(
            ContextCompat.getColor(
                view.context,
                R.color.teal_700
            )
        )

        else -> {

        }
    }
}


@BindingAdapter(value = ["setvisibilty"])
fun isShow(view:View,flag:Boolean){
    if (flag){
        view.visibility=View.VISIBLE
    }else
    {
        view.visibility=View.GONE
    }
}