package com.example.mikawadikar.Adapter

import android.content.Context
import android.graphics.ColorSpace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mikawadikar.Model.Menu
import com.example.mikawadikar.R
import kotlinx.android.synthetic.main.list_item.view.*

class MenuAdapter (val context : Context, val menu : List<Menu>) : RecyclerView.Adapter<MenuAdapter.MyViewHolder>(){


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){


        var currentmenu : Menu? =null
        var curreentpos : Int = 0

        init{
            itemView.setOnClickListener{
                Toast.makeText(context,currentmenu!!.title + "Clicked",Toast.LENGTH_SHORT).show()
            }

            itemView.imgShare.setOnClickListener{
                Toast.makeText(context, curreentpos.toString(), Toast.LENGTH_SHORT).show()
            }

        }
            fun setData(menus : Menu?,pos : Int){
                itemView.txvTitle.text = menus!!.title
                this.currentmenu = menus
                this.curreentpos = pos
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val menus = menu[position]
        holder.setData(menus,position)
    }

    override fun getItemCount(): Int {
        return menu.size
    }
}