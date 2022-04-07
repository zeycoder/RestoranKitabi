package com.zeyneparslan.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tanitim.*

class TanitimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)

        val intent = intent
        val secilenRestoranIsmi = intent.getStringExtra("restoranIsmi")
        textView.text = secilenRestoranIsmi

        val secilenRestoranGorseli = intent.getIntExtra("restoranGorseli",0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,secilenRestoranGorseli)
        imageView.setImageBitmap(bitmap)
        /*
        val secilenRestoran =SingletonClass.SecilenRestoran
        val secilenGorsel = secilenRestoran.gorsel
        imageView.setImageBitmap(secilenGorsel)
        */
    }
}