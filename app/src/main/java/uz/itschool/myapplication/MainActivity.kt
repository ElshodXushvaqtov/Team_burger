package uz.itschool.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.itschool.myapplication.Adapter.Food_adapter
import uz.itschool.myapplication.Food.Food
import uz.itschool.myapplication.Food.Ingridient
import uz.itschool.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val images = ArrayList<Food>()
        images.add(
            Food(
                "Burger",
                "4.99$",
                mutableListOf(),
                R.drawable.burger,
                Color.parseColor("#556CFF")
            )
        )
        images.add(
            Food(
                "Donut",
                "3.99",
                mutableListOf(),
                R.drawable.donut,
                Color.parseColor("#F5CAC3")
            )
        )
        images.add(
            Food(
                "Coffee",
                "4.11$",
                mutableListOf(),
                R.drawable.cofee,
                Color.parseColor("#B6D7CF")
            )
        )
        images.add(
            Food(
                "Fries",
                "2.99$",
                mutableListOf(),
                R.drawable.fries,
                Color.parseColor("#F28482")
            )
        )
        images.add(
            Food(
                "Frenchdog", "1.99", mutableListOf(), R.drawable.frenchdog,
                Color.parseColor("#ED51B4")
            )
        )
        images.add(
            Food(
                "Desert", "0.99$", mutableListOf(), R.drawable.desert,
                Color.parseColor("#61FA88")
            )
        )
        val adapter = Food_adapter(images)
        binding.menuRv.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        binding.menuRv.adapter = adapter
    }
}