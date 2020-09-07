package com.example.firestoretut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.firebase.firestore.FirebaseFirestore

class quizlistActivity : AppCompatActivity() {

    val rootref=FirebaseFirestore.getInstance()
    private lateinit var myrecyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizlist)
        myrecyclerView=findViewById(R.id.myrecyclerView)
        myrecyclerView.layoutManager=LinearLayoutManager(this)
        val option:FirestoreRecyclerOptions<YearWizeQuizList> = FirestoreRecyclerOptions.Builder<YearWizeQuizList>().setQuery(
            FirebaseFirestore.getInstance().collection("maths"),YearWizeQuizList::class.java
        ).build()
        val adapter = YearQuizListAdapter(this,option)
        myrecyclerView.adapter=adapter
        adapter.startListening()
    }
}