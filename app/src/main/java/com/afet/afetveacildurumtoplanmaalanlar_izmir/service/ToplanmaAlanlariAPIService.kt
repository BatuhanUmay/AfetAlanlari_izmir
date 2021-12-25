package com.afet.afetveacildurumtoplanmaalanlar_izmir.service

import com.afet.afetveacildurumtoplanmaalanlar_izmir.model.AlanlarListResponse
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ToplanmaAlanlariAPIService {

    val baseUrl = "https://openapi.izmir.bel.tr/api/"

    var retrofitApi = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(ToplanmaAlanlariApi::class.java)

    fun getAlanlarList(): Single<AlanlarListResponse> {
        return retrofitApi.getAlanList()
    }

}