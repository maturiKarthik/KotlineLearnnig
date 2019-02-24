package com.kotline.meghanasol.koltinelearn

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() ,Callback<List<Repo>>{

    lateinit var email: EditText
    lateinit var name: EditText
    lateinit var msignIn: Button
    lateinit var  retrofit : Button
    private val baseUrl = "https://jsonplaceholder.typicode.com"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.email)
        name = findViewById(R.id.name)
        msignIn = findViewById(R.id.sign)
        retrofit = findViewById(R.id.retrofit)


        msignIn.setOnClickListener {
            var status = validateString(email.text.toString(), name.text.toString())

            if (status.equals("ok"))
                Toast.makeText(this, "Hurray", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "ERROR FILLED ERROR", Toast.LENGTH_SHORT).show()
            /**
             * Starting An intent
             */

            val intent = Intent(this, Index::class.java)
            startActivity(intent)
        }

        retrofit.setOnClickListener {

            // RetroFit Class Generates an GithubSerices Infr


            //val gson :Gson = GsonBuilder().setLenient().create()

            val retrofitApi = Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create()).build()
            val githubServices = retrofitApi.create(GithubServices::class.java)
            val data : Call<List<Repo>> =githubServices.listRepo("comments")
            data.enqueue(this)




        }

    }

    override fun onFailure(call: Call<List<Repo>>?, t: Throwable) {
        t.printStackTrace()

    }

    override fun onResponse(call: Call<List<Repo>>?, response: Response<List<Repo>>) {
        if (response.isSuccessful){

            var changeList:List<Repo> = response.body()
           for (rep :Repo in changeList){
               Log.d("TAG",rep.id+"-->"+rep.title)
           }
        }else{
            //  Log.w("TAG",response.errorBody())
        }
    }



    fun validateString(str: String, str2: String): String {

        if (str != "" && str2 != "") {
            return "ok"
        }
        return "ko"
    }
}
