package com.example.yzy.imageartist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Editor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editor)
        this.setTitle("编辑图片")
    }
}