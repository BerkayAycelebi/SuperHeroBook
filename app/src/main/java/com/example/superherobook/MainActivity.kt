package com.example.superherobook

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var SuperHeroNames=ArrayList<String>()
        SuperHeroNames.add("Batman")
        SuperHeroNames.add("Superman")
        SuperHeroNames.add("Ironman")
        SuperHeroNames.add("Aquaman")
        SuperHeroNames.add("Spiderman")

        val batmanBitmap =BitmapFactory.decodeResource(application.resources,R.drawable.batman)
        val supermanBitmap =BitmapFactory.decodeResource(application.resources,R.drawable.supeman)
        val ironmanBitmap =BitmapFactory.decodeResource(application.resources,R.drawable.ironman)
        val aquamanBitmap =BitmapFactory.decodeResource(application.resources,R.drawable.aquaman)
        val spidermanBitmap =BitmapFactory.decodeResource(application.resources,R.drawable.spiderman)

        var SuperHeroPicture=ArrayList<Bitmap>()
        SuperHeroPicture.add(batmanBitmap)
        SuperHeroPicture.add(supermanBitmap)
        SuperHeroPicture.add(ironmanBitmap)
        SuperHeroPicture.add(aquamanBitmap)
        SuperHeroPicture.add(spidermanBitmap)
    }
}