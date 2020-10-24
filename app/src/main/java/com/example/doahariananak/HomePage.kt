package com.example.doahariananak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class HomePage : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val crdOrangTua: CardView = findViewById(R.id.crd_orang_tua)
        crdOrangTua.setOnClickListener(this)

        val crdHujan: CardView = findViewById(R.id.crd_hujan)
        crdHujan.setOnClickListener(this)

        val crdBeforeTidur: CardView = findViewById(R.id.crd_b_tidur)
        crdBeforeTidur.setOnClickListener(this)

        val crdAfterTidur: CardView = findViewById(R.id.crd_a_tidur)
        crdAfterTidur.setOnClickListener(this)

        val crdBelajar: CardView = findViewById(R.id.crd_b_belajar)
        crdBelajar.setOnClickListener(this)

        val crdPakaian: CardView = findViewById(R.id.crd_pakaian)
        crdPakaian.setOnClickListener(this)

        val crdMusibah: CardView = findViewById(R.id.crd_musibah)
        crdMusibah.setOnClickListener(this)

        val crdKendaraan: CardView = findViewById(R.id.crd_kendaraan)
        crdKendaraan.setOnClickListener(this)



    }

    override fun onClick(v: View) {
        when (v?.id){
            R.id.crd_orang_tua -> {
                val moveOrtu = Intent(this@HomePage, OrangTua::class.java)
                startActivity(moveOrtu)
            }
            R.id.crd_hujan -> {
                val moveHujan = Intent(this@HomePage, Hujan::class.java)
                startActivity(moveHujan)
            }
            R.id.crd_b_tidur -> {
                val beforeTidur = Intent(this@HomePage, BeforeTidur::class.java)
                startActivity(beforeTidur)
            }
            R.id.crd_a_tidur -> {
                val afterTidur = Intent(this@HomePage, AfterTidur::class.java)
                startActivity(afterTidur)
            }
            R.id.crd_b_belajar -> {
                val beforeBelajar = Intent(this@HomePage, BeforeBelajar::class.java)
                startActivity(beforeBelajar)
            }
            R.id.crd_pakaian -> {
                val pakaian = Intent(this@HomePage, Pakaian::class.java)
                startActivity(pakaian)
            }
            R.id.crd_musibah -> {
                val masjid = Intent(this@HomePage, Musibah::class.java)
                startActivity(masjid)
            }
            R.id.crd_kendaraan -> {
                val kendaraan = Intent(this@HomePage, Kendaraan::class.java)
                startActivity(kendaraan)
            }
        }
    }
}