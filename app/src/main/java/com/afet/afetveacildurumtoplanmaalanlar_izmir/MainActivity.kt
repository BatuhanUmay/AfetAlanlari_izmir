package com.afet.afetveacildurumtoplanmaalanlar_izmir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.afet.afetveacildurumtoplanmaalanlar_izmir.view.alanActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buton_kayit.setOnClickListener{
            val intent = Intent(this, alanActivity::class.java)
            startActivity(intent)
        }
    }
}