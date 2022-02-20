package com.example.foodmarket.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.foodmarket.R
import kotlinx.android.synthetic.main.fragment_profile.*

@Suppress("DEPRECATION")
class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val sectionPagerAdapter = SectionPagerAdapater(childFragmentManager)

        view_pager.adapter = sectionPagerAdapter
        tabLayout.setupWithViewPager(view_pager)

    }
}