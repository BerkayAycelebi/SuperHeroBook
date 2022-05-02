package com.example.superherobook

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

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
/*
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
        */

        val batmanDrawableID=R.drawable.batman
        val supermanDrawableID=R.drawable.supeman
        val ironmanDrawableID=R.drawable.ironman
        val aquamanDrawableID=R.drawable.aquaman
        val spidermanDrawableID=R.drawable.spiderman
        var superHeroDrawableList=ArrayList<Int>()
        superHeroDrawableList.add(batmanDrawableID)
        superHeroDrawableList.add(supermanDrawableID)
        superHeroDrawableList.add(ironmanDrawableID)
        superHeroDrawableList.add(aquamanDrawableID)
        superHeroDrawableList.add(spidermanDrawableID)



        val layoutManager=LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager
        val adapter=RecycleAdapter(SuperHeroNames,superHeroDrawableList)
        recyclerView.adapter=adapter
    }
}