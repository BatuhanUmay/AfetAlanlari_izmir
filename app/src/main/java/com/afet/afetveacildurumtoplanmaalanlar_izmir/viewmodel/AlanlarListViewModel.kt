package com.afet.afetveacildurumtoplanmaalanlar_izmir.viewmodel

import android.annotation.SuppressLint
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.afet.afetveacildurumtoplanmaalanlar_izmir.model.AlanlarListResponse
import com.afet.afetveacildurumtoplanmaalanlar_izmir.service.ToplanmaAlanlariAPIService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class AlanlarListViewModel : ViewModel() {

    private var alanAPIService = ToplanmaAlanlariAPIService()

    val gameListLiveData : MutableLiveData<AlanlarListResponse> = MutableLiveData<AlanlarListResponse>()

    @SuppressLint("CheckResult")
    fun getAlanList() {
        alanAPIService.getAlanlarList().subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableSingleObserver<AlanlarListResponse>() {
                override fun onSuccess(response: AlanlarListResponse) {
                    gameListLiveData.value = response
                }

                override fun onError(e: Throwable) {
                    e.printStackTrace()
                }
            })
    }


}
