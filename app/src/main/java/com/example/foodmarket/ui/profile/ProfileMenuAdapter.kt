package com.example.foodmarket.ui.profile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodmarket.R
import com.example.foodmarket.model.dummy.ProfileMenuModel
import com.example.foodmarket.ui.profile.account.ProfileAccountFragment
import kotlinx.android.synthetic.main.item_menu_profile.view.*

class ProfileMenuAdapter(
    private val listData: List<ProfileMenuModel>,
    private val itemAdapterCallBack: ProfileAccountFragment,
) : RecyclerView.Adapter<ProfileMenuAdapter.ViewHolder>()   {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_menu_profile, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallBack)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    interface ItemAdapterCallback {
        fun onClick(v: View, data: ProfileMenuModel)
    }


    class ViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bind(data: ProfileMenuModel, itemAdapterCallBack: ItemAdapterCallback){
            itemView.apply {
                tv_tittle.text = data.tittle
                itemView.setOnClickListener{ itemAdapterCallBack.onClick(it, data) }
            }
        }
    }
}


