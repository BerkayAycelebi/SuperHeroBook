package com.example.superherobook

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.recycle_ro.view.*

class RecycleAdapter(val heroList: ArrayList<String>,val heroPicture: ArrayList<Bitmap>):RecyclerView.Adapter<RecycleAdapter.SuperHeroVH>() {
    class SuperHeroVH(itemView: View):RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroVH {
       val itemView=LayoutInflater.from(parent.context).inflate(R.layout.recycle_ro,parent,false)
        return SuperHeroVH(itemView)

    }

    override fun onBindViewHolder(holder: SuperHeroVH, position: Int) {
       holder.itemView.recyclerViewTextView.text=heroList.get(position)
        holder.itemView.setOnClickListener {
            val intent=Intent(holder.itemView.context,Introduction::class.java)
            intent.putExtra("superHeroName",heroList.get(position))
            val singleton=SingletonClass.selectedHero
            singleton.picture= heroPicture.get(position)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return heroList.size
    }
}