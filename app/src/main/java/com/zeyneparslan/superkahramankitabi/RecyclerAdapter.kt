package com.zeyneparslan.superkahramankitabi

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*
//Normalde bir alt satırda Int yazann yerde Bitmap yazıyordu o verimsiz tanımalama ile yaptığımız ileydi başta sonra verimli yaptık
class RecyclerAdapter (val restoranListesi : ArrayList<String>,val restoranGorselleri : ArrayList<Int>) : RecyclerView.Adapter<RecyclerAdapter.RestoranVH>() {
    class RestoranVH(itemView : View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestoranVH {
        //Inflater, LayoutInflater, MenuInflater
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return RestoranVH(itemView)
    }

    override fun onBindViewHolder(holder: RestoranVH, position: Int) {
        holder.itemView.recyclerViewTextView.text = restoranListesi.get(position)
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,TanitimActivity::class.java)
            intent.putExtra("restoranIsmi",restoranListesi.get(position))
            intent.putExtra("restoranGorseli",restoranGorselleri.get(position))


            /*
            val singleton =SingletonClass.SecilenRestoran
            singleton.gorsel= restoranGorselleri.get(position)
             */
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return restoranListesi.size
    }
}