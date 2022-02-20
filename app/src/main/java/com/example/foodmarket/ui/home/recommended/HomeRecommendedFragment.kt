package com.example.foodmarket.ui.home.recommended

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodmarket.R
import com.example.foodmarket.model.dummy.HomeVerticalModel
import com.example.foodmarket.ui.home.newtaste.HomeNewTasteAdapter
import kotlinx.android.synthetic.main.fragment_home_new_taste.*

@Suppress("DEPRECATION")
class HomeRecommendedFragment : Fragment(), HomeNewTasteAdapter.ItemAdapterCallback{

    private var foodList : ArrayList<HomeVerticalModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_new_taste, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        val adapter = HomeNewTasteAdapter(foodList,this)
        val layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(activity)
        rv_List.layoutManager = layoutManager
        rv_List.adapter = adapter


    }

    private fun initDataDummy() {
        foodList = ArrayList()
        foodList.add(HomeVerticalModel("Cherry Halty","10000","", 5f))
        foodList.add(HomeVerticalModel("Burger Tamayo","70000","", 4f))
        foodList.add(HomeVerticalModel("Bakwan Cihuy","50000", "",4.5f))
        foodList.add(HomeVerticalModel("Bakwan Bakso","23000", "",4.5f))
        foodList.add(HomeVerticalModel("Mie Cihuy","12000", "",4.5f))
        foodList.add(HomeVerticalModel("Pie Ipe","21000", "",4.5f))
        foodList.add(HomeVerticalModel("Pie Ipe","21000", "",4.5f))
        foodList.add(HomeVerticalModel("Pie Ipe","21000", "",4.5f))

    }

    override fun onClick(v: View, data: HomeVerticalModel) {
        Toast.makeText(context,"Percobaan click", Toast.LENGTH_SHORT).show()
    }


}