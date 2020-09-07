package com.example.firestoretut

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import com.firebase.ui.firestore.FirestoreRecyclerOptions

class YearQuizListAdapter(val context: Context,options: FirestoreRecyclerOptions<YearWizeQuizList>) :
    FirestoreRecyclerAdapter<YearWizeQuizList, YearQuizListAdapter.QuizitemViewHolder>(options) {
    class QuizitemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val year=itemView.findViewById<TextView>(R.id.listYear)
        val innerRecycler=itemView.findViewById<RecyclerView>(R.id.listRecyclerView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizitemViewHolder {
        return QuizitemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.quiz_list_item,parent,false))
    }

    override fun onBindViewHolder(
        holder: QuizitemViewHolder,
        position: Int,
        model: YearWizeQuizList
    ) {
        holder.year.text="Year "+model.id
        holder.innerRecycler.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        val inneradapter=innerRecyclerAdapter(model.Test1!!,context)
        holder.innerRecycler.adapter=inneradapter
    }
}