package com.zeyneparslan.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recycler_row.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Veri Hazırlığı

        var restoranIsimleri = ArrayList<String>()
        restoranIsimleri.add("Birinci Restoran")
        restoranIsimleri.add("İkinci Restoran")
        restoranIsimleri.add("Üçüncü Restoran")
        restoranIsimleri.add("Dördüncü Restoran")
        restoranIsimleri.add("Beşinci Restoran")
        restoranIsimleri.add("Altıncı Restoran")
        restoranIsimleri.add("Yedinci Restoran")
        restoranIsimleri.add("Sekizinci Restoran")
        restoranIsimleri.add("Dokuzuncu Restoran")
        restoranIsimleri.add("Onuncu Restoran")
        restoranIsimleri.add("On Birinci Restoran")
        restoranIsimleri.add("On İkinci Restoran")

        //Verimsiz Tanımlama
        /*
        val birinciBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.restoran1)
        val ikinciBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.restoran2)
        val ucuncuBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.restoran3)
        val dorduncuBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.restoran4)
        val besinciBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.restoran5)
        val altinciBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.restoran6)
        val yedinciBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.restoran7)
        val sekizinciBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.restoran8)
        val dokuzuncuBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.restoran9)
        val onuncuBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.restoran10)
        val onBirinciBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.restoran11)
        val onIkinciBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.restoran12)

        var restoranGorselleri =ArrayList<Bitmap>()
        restoranGorselleri.add(birinciBitmap)
        restoranGorselleri.add(ikinciBitmap)
        restoranGorselleri.add(ucuncuBitmap)
        restoranGorselleri.add(dorduncuBitmap)
        restoranGorselleri.add(besinciBitmap)
        restoranGorselleri.add(altinciBitmap)
        restoranGorselleri.add(yedinciBitmap)
        restoranGorselleri.add(sekizinciBitmap)
        restoranGorselleri.add(dokuzuncuBitmap)
        restoranGorselleri.add(onuncuBitmap)
        restoranGorselleri.add(onBirinciBitmap)
        restoranGorselleri.add(onIkinciBitmap)
        */

        //Verimli tanımlamalar

        val restoran1DrawbleId = R.drawable.restoran1
        val restoran2DrawbleId = R.drawable.restoran2
        val restoran3DrawbleId = R.drawable.restoran3
        val restoran4DrawbleId = R.drawable.restoran4
        val restoran5DrawbleId = R.drawable.restoran5
        val restoran6DrawbleId = R.drawable.restoran6
        val restoran7DrawbleId = R.drawable.restoran7
        val restoran8DrawbleId = R.drawable.restoran8
        val restoran9DrawbleId = R.drawable.restoran9
        val restoran10DrawbleId = R.drawable.restoran10
        val restoran11DrawbleId = R.drawable.restoran11
        val restoran12DrawbleId = R.drawable.restoran12

        var restoranDrawableListesi = ArrayList<Int>()
        restoranDrawableListesi.add(restoran1DrawbleId)
        restoranDrawableListesi.add(restoran2DrawbleId)
        restoranDrawableListesi.add(restoran3DrawbleId)
        restoranDrawableListesi.add(restoran4DrawbleId)
        restoranDrawableListesi.add(restoran5DrawbleId)
        restoranDrawableListesi.add(restoran6DrawbleId)
        restoranDrawableListesi.add(restoran7DrawbleId)
        restoranDrawableListesi.add(restoran8DrawbleId)
        restoranDrawableListesi.add(restoran9DrawbleId)
        restoranDrawableListesi.add(restoran10DrawbleId)
        restoranDrawableListesi.add(restoran11DrawbleId)
        restoranDrawableListesi.add(restoran12DrawbleId)



        //Adapter

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager

        val adapter = RecyclerAdapter(restoranIsimleri,restoranDrawableListesi)
        recyclerView.adapter = adapter

    }
}