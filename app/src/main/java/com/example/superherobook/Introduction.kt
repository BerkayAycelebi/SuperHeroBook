package com.example.superherobook

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_introduction.*

class Introduction : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduction)

        val intent= intent
        val selectedName=intent.getStringExtra("superHeroName")
        textView.text=selectedName

        val selectedHeroPicture=intent.getIntExtra("heroPicture",0)
        var bitmap=BitmapFactory.decodeResource(applicationContext.resources,selectedHeroPicture)
        imageView.setImageBitmap(bitmap)
/*
        var selectedHero=SingletonClass.selectedHero
        var selectedPicture=SingletonClass.picture
        imageView.setImageBitmap(selectedPicture)
*/
    }
}