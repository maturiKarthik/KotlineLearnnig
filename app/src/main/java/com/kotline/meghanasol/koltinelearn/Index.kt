package com.kotline.meghanasol.koltinelearn

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.Toast
import com.kotline.meghanasol.koltinelearn.model.Data
import com.kotline.meghanasol.koltinelearn.presentation.RecyclerviewContract

class Index : AppCompatActivity(),RecyclerviewContract {



    lateinit var mList: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.course_list)

        val index = this

        mList = findViewById(R.id.list_item)
        mList.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = MyAdapter(Data.courseList,index)
        }


    }

    override fun onItemSelected(string: String) {
        Log.w("TAG","recieved Callback = $string")
        Toast.makeText(applicationContext,"recieved Callback = $string",Toast.LENGTH_SHORT).show()
    }
}