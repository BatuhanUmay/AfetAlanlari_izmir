package com.afet.afetveacildurumtoplanmaalanlar_izmir.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.afet.afetveacildurumtoplanmaalanlar_izmir.R
import com.afet.afetveacildurumtoplanmaalanlar_izmir.adapter.AlanlarListAdapter
import com.afet.afetveacildurumtoplanmaalanlar_izmir.viewmodel.AlanlarListViewModel
import kotlinx.android.synthetic.main.activity_alan.*

class alanActivity : AppCompatActivity() {

    private var alanListViewModel = AlanlarListViewModel()

    var alanAdapter = AlanlarListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alan)

        alanListViewModel = ViewModelProvider(this).get(AlanlarListViewModel::class.java)

        alanListViewModel.getAlanList()

        alanListViewModel.gameListLiveData.observe(this, Observer { cevap->
//            Toast.makeText(applicationContext, cevap.kayitSayisi.toString() ,Toast.LENGTH_LONG).show() // obje için
            Log.i("Text: ",cevap.kayitSayisi.toString())

            //Toast.makeText(applicationContext, cevap[1].tur_ad, Toast.LENGTH_LONG).show() // api si list olanlar için

        })

        var alanList : ArrayList<String> = arrayListOf()
        alanList.add("Poyrazköy")
        alanList.add("Bostanlı")
        alanList.add("Karşıyaka")
        alanList.add("Buca")
        alanList.add("Alaçatı")

        rv_alan_list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false) //context -> bulunduğum yer
        rv_alan_list.adapter = alanAdapter

        alanAdapter.getData(alanList)

    }



}