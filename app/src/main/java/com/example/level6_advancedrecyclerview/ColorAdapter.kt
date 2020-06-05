package com.example.level6_advancedrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_color.view.*

/*
* In Kotlin it’s possible to pass methods as variables to other methods. The Unit type
* corresponds to the void type in Java. This means we have added a parameter in the
* constructor which is a method that has a ColorItem parameter. Essentially we have to
* pass the following method when constructing the ColorAdapter:
*
* fun onClick(colorItem: ColorItem) {}
* */

class ColorAdapter(private val colors: List<ColorItem>, private val onClick: (ColorItem) -> Unit)
    :RecyclerView.Adapter<ColorAdapter.ViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorAdapter.ViewHolder {
        context = parent.context

        return ViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.item_color,
                    parent,
                    false)
        )
    }

    override fun getItemCount(): Int {
        return colors.size;
    }

    override fun onBindViewHolder(holder: ColorAdapter.ViewHolder, position: Int) {
        return holder.bind(colors[position]);
    }

    /*USE Glide to load the image into the ImageView named ivColor*/
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        /*
        * When a ViewHolder is initialized we have defined an OnClickListener to the itemView.
        * This means that the OnClickListener is bound to the entire item. If you have multiple
        * buttons in an Item then you should be setting the OnClickListener to these buttons of
        * the item. When the item has been clicked then the onClick(colorItem: ColorItem)
        * is invoked with the ColorItem of the colors list using the adapterPosition.
        */

        init {
            itemView.setOnClickListener { onClick(colors[adapterPosition]) }
        }


        fun bind(colorItem: ColorItem) {

            //Using Glide.with(context) the methods of Glide can be accessed
            //Using the load(colorItem.getImageUrl()) Glide is being told to load this image.
            //Using into(itemView.ivColor)
            Glide.with(context).load(colorItem.getImageUrl()).into(itemView.ivColor)
        }
    }

}