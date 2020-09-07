package com.example.firestoretut

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.DocumentReference
import org.w3c.dom.Text

class innerRecyclerAdapter(val refrences:ArrayList<DocumentReference>,val context:Context): RecyclerView.Adapter<innerRecyclerAdapter.innerviewholder>() {
    class innerviewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val testNo=itemView.findViewById<TextView>(R.id.innertextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): innerviewholder {
        return innerviewholder(LayoutInflater.from(parent.context).inflate(R.layout.single_text_bar_for_inner_recycler,parent,false))
    }

    override fun getItemCount(): Int {
        return refrences.size
    }

    override fun onBindViewHolder(holder: innerviewholder, position: Int) {
        holder.testNo.text="Quiz ${position+1}"
        holder.testNo.setOnClickListener(){
            context.startActivity(Intent(context,mainQuiz::class.java).putExtra("quizid",refrences[position].path))
        }
    }
}