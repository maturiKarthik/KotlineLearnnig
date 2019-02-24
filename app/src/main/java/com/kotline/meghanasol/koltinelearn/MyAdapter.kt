package com.kotline.meghanasol.koltinelearn

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.kotline.meghanasol.koltinelearn.presentation.RecyclerviewContract

class MyAdapter(private val myDataset: Array<String>, val index: Index) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view)


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyAdapter.MyViewHolder {
        // create a new view
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.my_text_view, parent, false)


        return MyViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        //holder.textView.text = myDataset[position]
        val text: TextView = holder.view.findViewById<TextView>(R.id.text)
        text.text = myDataset[position]

        text.setOnClickListener {
            index.onItemSelected(position.toString())
        }


    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size


}