package com.zaglab.harness

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.Unbinder

class MainActivity : AppCompatActivity() {

    @BindView(R.id.iv_test)
    lateinit var testImageView: ImageView

    lateinit var unbinder: Unbinder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        unbinder = ButterKnife.bind(this)
    }

    @Harness
    fun test() {
        println("Hello world")
    }
}
