
package org.setim.foodlist.homepage.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import org.setim.foodlist.R
import org.setim.foodlist.data.Menu
import org.setim.foodlist.data.MenuData
import org.setim.foodlist.databinding.FragmentHomeBinding
import org.setim.foodlist.utils.MenuAdapter

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var menuAdapter: MenuAdapter

    private var list : ArrayList<Menu> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        itemViews()
        return binding.root
    }

    @SuppressLint("Recycle")
    private fun itemViews(){

        list.addAll(MenuData.listMenu)

        menuAdapter = MenuAdapter(list){
            binding.root
        }
        with(binding.rvPopularMenu) {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(this.context,2)
            adapter = menuAdapter
        }
    }
}