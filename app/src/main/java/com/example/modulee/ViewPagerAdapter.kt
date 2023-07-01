package com.example.modulee

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    private val fragment_list: ArrayList<Fragment>,
    fragment_manager: FragmentManager,
    life_cycle: Lifecycle
) : FragmentStateAdapter(fragment_manager, life_cycle) {

    override fun getItemCount() = fragment_list.size


    override fun createFragment(position: Int): Fragment {
        return fragment_list[position]
    }
}