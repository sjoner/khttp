package com.sjoner.http

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface IServer {
    @GET
    fun get(@Url url: String, @QueryMap params: Map<String,String> = HashMap(), @HeaderMap headerMap: Map<String, String> = HashMap()): Call<ResponseBody>
    @POST
    fun post(@Url url: String,@Body body: Any = Any(),@HeaderMap headerMap: Map<String, String> = HashMap()): Call<ResponseBody>
}