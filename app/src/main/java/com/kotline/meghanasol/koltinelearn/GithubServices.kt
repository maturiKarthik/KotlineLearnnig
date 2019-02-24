package com.kotline.meghanasol.koltinelearn

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubServices{

    @GET("/{user}")
     fun listRepo(@Path("user") user : String):Call<List<Repo>>


}