package uz.itschool.myapplication.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import uz.itschool.myapplication.R

class Food_adapter {
    class MyHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var item_name=itemView.findViewById<TextView>(R.id.item_name)
        var img=itemView.findViewById<ImageView>(R.id.item_img)

    }
}