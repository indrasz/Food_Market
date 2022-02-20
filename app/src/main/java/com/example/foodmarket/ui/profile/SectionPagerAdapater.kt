@file:Suppress("DEPRECATION")

package com.example.foodmarket.ui.profile

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.foodmarket.ui.profile.account.ProfileAccountFragment
import com.example.foodmarket.ui.profile.foodmarket.ProfileFoodMarketFragment

@Suppress("DEPRECATION")
class SectionPagerAdapater (fm:FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence {
        return when(position){
            0 -> "Account"
            1 -> "FoodMarket"
            else -> "New Taste"
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        val fragment : Fragment
        return when (position){
            0 -> {
                fragment = ProfileAccountFragment()
                fragment
            }
            1 -> {
                fragment = ProfileFoodMarketFragment()
                fragment
            }
            else -> {
                fragment = ProfileAccountFragment()
                fragment
            }
        }
    }
}