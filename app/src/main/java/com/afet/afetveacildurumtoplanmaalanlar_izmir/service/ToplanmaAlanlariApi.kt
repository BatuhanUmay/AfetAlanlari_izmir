package com.afet.afetveacildurumtoplanmaalanlar_izmir.service

import com.afet.afetveacildurumtoplanmaalanlar_izmir.model.AlanlarListResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ToplanmaAlanlariApi {

    companion object{
        const val AFETALANLARI = "ibb/cbs/afetaciltoplanmaalani"
        //const val AFETALANLARI = "ibb/cbs/afetaciltoplanmaalani/{id}"
    }

    //gameType/1    ->Path
    //gameType?=1   ->Query
    //{
    // gameType: 1  ->Body
    // }

    //model -> servisten gelen datayı karşılayan taraf
    //view -> kullancıyı ilgilendiren sayfa mainactivity gibi
    //viewmodel -> bizim için servis isteklerini atan livedata

    @GET(AFETALANLARI)
    fun getAlanList() : Single<AlanlarListResponse>

//    fun getAlanList(@Path("id") typeId : Int) : Single<AlanlarListResponse> {
//
//    }
}