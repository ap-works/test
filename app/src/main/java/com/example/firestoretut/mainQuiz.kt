package com.example.firestoretut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class mainQuiz : AppCompatActivity() {
    private lateinit var refrencetext:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_quiz)
        refrencetext=findViewById(R.id.refrencetext)
//        "quizid"
        val data=intent.getStringExtra("quizid")
        refrencetext.text=data
    }
}