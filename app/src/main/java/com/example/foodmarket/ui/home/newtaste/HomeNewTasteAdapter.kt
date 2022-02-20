package com.example.foodmarket.ui.home.newtaste

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.foodmarket.R
import com.example.foodmarket.model.dummy.HomeVerticalModel
import com.example.foodmarket.utils.Helpers.formatPrice
import kotlinx.android.synthetic.main.item_home_vertical.view.*

class HomeNewTasteAdapter (
    private val listData : List<HomeVerticalModel>,
    private val itemAdapterCallBack : ItemAdapterCallback,
) : RecyclerView.Adapter<HomeNewTasteAdapter.ViewHolder>()   {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_home_vertical, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallBack)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    interface ItemAdapterCallback {
        fun onClick(v: View, data: HomeVerticalModel)
    }


    class ViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bind(data : HomeVerticalModel, itemAdapterCallBack: ItemAdapterCallback){
            itemView.apply {
                tv_tittle.text = data.tittle
                tv_price.formatPrice(data.price)
                rb_food.rating = data.rating
//
//                Glide.with(context)
//                    .load(data.src)
//                    .into(iv_menu)

                itemView.setOnClickListener{ itemAdapterCallBack.onClick(it, data) }
            }
        }
    }
}


