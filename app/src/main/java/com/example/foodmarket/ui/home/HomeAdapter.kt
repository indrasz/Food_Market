package com.example.foodmarket.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.foodmarket.R
import com.example.foodmarket.model.dummy.HomeModel
import kotlinx.android.synthetic.main.item_home_horizontal.view.*

class HomeAdapter (
    private val listData : List<HomeModel>,
    private val itemAdapterCallBack : ItemAdapterCallback,
) : RecyclerView.Adapter<HomeAdapter.ViewHolder>()   {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_home_horizontal, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallBack)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    interface ItemAdapterCallback {
        fun onClick(v: View, data: HomeModel)
    }


    class ViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bind(data : HomeModel, itemAdapaterCallBack: ItemAdapterCallback){
            itemView.apply {
                tv_tittle.text = data.tittle
                rb_food.rating = data.rating
//
//                Glide.with(context)
//                    .load(data.src)
//                    .into(iv_menu)

                itemView.setOnClickListener{ itemAdapaterCallBack.onClick(it, data) }
            }
        }
    }
}


