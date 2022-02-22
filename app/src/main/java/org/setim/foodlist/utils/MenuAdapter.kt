package org.setim.foodlist.utils

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.setim.foodlist.R
import org.setim.foodlist.data.Menu
import org.setim.foodlist.databinding.ItemMenuBinding
import org.setim.foodlist.detail.DetailActivity

class MenuAdapter (private var items : ArrayList<Menu>, var handler : (Menu) -> Unit) :

    RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MenuViewHolder(
        ItemMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) = with(holder) {
        val click = items[position]
        bind(click)
        this.binding.root.setOnClickListener { handler(items[position]) }
    }

    override fun getItemCount() = items.size

    class MenuViewHolder (var binding : ItemMenuBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(menu: Menu) = with(binding) {
            Glide.with(this.root)
                .load(menu.image)
                .into(imgItemPhoto)
            tvName.text = menu.name
            tvRating.text = menu.rating



        }
        fun setData(menu : Menu){
            val imgPhoto : ImageView = binding.root.findViewById(R.id.img_item_photo)
            imgPhoto.rootView.setOnClickListener{
                val intent = Intent(binding.root.context, DetailActivity::class.java)
                intent.putExtra("image",menu.image)
                intent.putExtra("name",menu.name)
                intent.putExtra("description",menu.description)
                intent.putExtra("price",menu.price)
                intent.putExtra("rating",menu.rating)
                binding.root.context.startActivity(intent)
            }
        }
    }
}