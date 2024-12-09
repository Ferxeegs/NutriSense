package com.example.nutrisense.data.resource.retrofit


import com.example.nutrisense.data.resource.request.RegisterRequest
import com.example.nutrisense.data.resource.response.success.LoginResponse
import com.example.nutrisense.data.resource.response.success.RegisterResponse
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Headers
import retrofit2.http.POST


interface ApiService {
    @Headers("Content-Type: application/json")
    @POST("register")
    suspend fun register(
        @Body registerRequest: RegisterRequest
    ): RegisterResponse

    @FormUrlEncoded
    @POST("login")
    suspend fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ): LoginResponse
}