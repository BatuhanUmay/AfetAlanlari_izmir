package com.afet.afetveacildurumtoplanmaalanlar_izmir.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.afet.afetveacildurumtoplanmaalanlar_izmir.R
import com.afet.afetveacildurumtoplanmaalanlar_izmir.adapter.AlanlarListAdapter
import kotlinx.android.synthetic.main.activity_alan.*

class alanActivity : AppCompatActivity() {

    var alanAdapter = AlanlarListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alan)

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