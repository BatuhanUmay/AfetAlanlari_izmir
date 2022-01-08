package com.afet.afetveacildurumtoplanmaalanlar_izmir.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.afet.afetveacildurumtoplanmaalanlar_izmir.R
import com.afet.afetveacildurumtoplanmaalanlar_izmir.model.AlanlarListResponse
import kotlinx.android.synthetic.main.alanlar_list_item_layout.view.*

class AlanlarListAdapter : RecyclerView.Adapter<AlanlarListAdapter.AlanlarListHolder>() {

    var alanlarList : ArrayList<String> = arrayListOf()

    //tasarımı verecek kısım
    //tekrar edeceğim tasarım ne
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlanlarListAdapter.AlanlarListHolder =
         AlanlarListHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.alanlar_list_item_layout, parent, false)
        )

    //datayı vericek kısım
    //tekrar ediceğim veriler nereden geliyor, nerede
    override fun onBindViewHolder(holder: AlanlarListAdapter.AlanlarListHolder, position: Int) {
        holder.bind(alanlarList[position])
    }

    //tekrar etme kaç defa olucak
    override fun getItemCount(): Int = alanlarList.size

    //datayı manipüle ettiğimiz kısım
    inner class AlanlarListHolder(view : View) : RecyclerView.ViewHolder(view) {
        fun bind(s: String) {
            itemView.tv_alan_name.text = s
        }
    }

    fun getData(alanlarResponse : ArrayList<String>) {
        alanlarList.addAll(alanlarResponse)
        notifyDataSetChanged() //sayfayı refresh ediyor
    }



//    var alanlarList : ArrayList<AlanlarListResponse.Onemliyer> = arrayListOf()
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlanlarListAdapter.AlanlarListHolder =
//        AlanlarListHolder(
//            LayoutInflater.from(parent.context)
//                .inflate(R.layout.alanlar_list_item_layout, parent, false)
//        )
//
//    override fun onBindViewHolder(holder: AlanlarListAdapter.AlanlarListHolder, position: Int) {
//        holder.bind(alanlarList[position])
//    }
//
//    override fun getItemCount(): Int = alanlarList.size
//
//    inner class AlanlarListHolder(view : View) : RecyclerView.ViewHolder(view) {
//        fun bind(s: AlanlarListResponse.Onemliyer) {
//            itemView.tv_alan_name.text = s.aDI
//        }
//    }
//
//    fun getData(alanlarResponse : ArrayList<AlanlarListResponse.Onemliyer>) {
//        alanlarList.addAll(alanlarResponse)
//        notifyDataSetChanged()
//    }

}