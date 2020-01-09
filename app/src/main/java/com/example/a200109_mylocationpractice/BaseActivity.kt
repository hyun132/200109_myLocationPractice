package com.example.a200109_mylocationpractice

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity:AppCompatActivity() {
    var mContext = this

    abstract fun setValues()
    abstract fun setupEvents()
}