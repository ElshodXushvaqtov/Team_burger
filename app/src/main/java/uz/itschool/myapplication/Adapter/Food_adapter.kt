package uz.itschool.myapplication.Adapter

import android.content.ClipData.Item
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import uz.itschool.myapplication.Food.Food
import uz.itschool.myapplication.R

class Food_adapter(var menu_items: ArrayList<Food>) :
    RecyclerView.Adapter<Food_adapter.MyHolder>() {
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var item_name = itemView.findViewById<TextView>(R.id.item_name)
        var img = itemView.findViewById<ImageView>(R.id.item_img)
        var cardView = itemView.findViewById<CardView>(R.id.menu_item_bg)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.menu_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
       val index=menu_items[position]
        holder.item_name.text=index.name
        holder.img.setImageResource(index.photo)
        holder.cardView.setCardBackgroundColor(index.colorBg)
    }

    override fun getItemCount(): Int {
return menu_items.size
    }
}