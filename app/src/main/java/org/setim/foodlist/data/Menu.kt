package org.setim.foodlist.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Menu(
    var name: String = "",
    var description: String = "",
    var price: Int = 0,
    var rating: String = "",
    var image: Int = 0
) : Parcelable
