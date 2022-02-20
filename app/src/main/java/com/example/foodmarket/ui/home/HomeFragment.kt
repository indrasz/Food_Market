package com.example.foodmarket.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodmarket.R
import com.example.foodmarket.model.dummy.HomeModel
import com.example.foodmarket.ui.detail.DetailActivity
import kotlinx.android.synthetic.main.fragment_home.*

@Suppress("DEPRECATION")
class HomeFragment : Fragment(), HomeAdapter.ItemAdapterCallback{

    private var foodList : ArrayList<HomeModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        val adapter = HomeAdapter(foodList,this)
        val layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
        rv_list.layoutManager = layoutManager
        rv_list.adapter = adapter

        val sectionPagerAdapter = SectionPagerAdapater(childFragmentManager)

        view_pager.adapter = sectionPagerAdapter
        tabLayout.setupWithViewPager(view_pager)

    }

    private fun initDataDummy() {
        foodList = ArrayList()
        foodList.add(HomeModel("Cherry Halty","", 5f))
        foodList.add(HomeModel("Burger Tamayo","", 4f))
        foodList.add(HomeModel("Bakwan Cihuy","", 4.5f))

    }

    override fun onClick(v: View, data: HomeModel) {
        val intent = Intent(activity, DetailActivity::class.java)
        startActivity(intent)
    }
}