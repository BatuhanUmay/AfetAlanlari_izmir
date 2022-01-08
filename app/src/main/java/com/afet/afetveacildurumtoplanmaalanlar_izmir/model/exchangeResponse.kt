package com.afet.afetveacildurumtoplanmaalanlar_izmir.model
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class exchangeResponse(

    @SerializedName("sayfadaki_kayitsayisi") @Expose var sayfadaki_kayitsayisi : Int,
    @SerializedName("kayit_sayisi") @Expose var kayit_sayisi : Int,
    @SerializedName("sayfa_numarasi") @Expose var sayfa_numarasi : Int,
    @SerializedName("onemliyer") @Expose var onemliyerler: List<OnemliYer>,
)
