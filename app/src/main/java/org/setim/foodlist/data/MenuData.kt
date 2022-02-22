package org.setim.foodlist.data

import org.setim.foodlist.R

object MenuData {
    private val menuName = arrayOf(
        "Cream Sweet Pie",
        "DoubleJumbo Pie",
        "Fruit Small Pie"
    )

    private val menuDescription = arrayOf(
        "Cream Sweet Pie is a pie made from real honey and combined with cream on top of the pie",
        "DoubleJumbo Pie is a pie made from real honey and combined with cream on top of the pie",
        "Fruit Small Pie is a pie made from real honey and combined with cream on top of the pie"
    )

    private val menuPrice = arrayOf(
        59999,
        69999,
        79999
    )

    private val menuRating = arrayOf(
        "4.5",
        "4.8",
        "4.6"
    )

    private val menuImage = intArrayOf(
        R.drawable.item_menu_1,
        R.drawable.item_menu_1,
        R.drawable.item_menu_1
    )

    val listMenu : ArrayList<Menu>
        get(){
            val list = arrayListOf<Menu>()
            for (position in menuName.indices) {
                val menu = Menu()
                menu.name = menuName[position]
                menu.description = menuDescription[position]
                menu.price = menuPrice[position]
                menu.rating = menuRating[position]
                menu.image = menuImage[position]
                list.add(menu)
            }
            return list
        }
}