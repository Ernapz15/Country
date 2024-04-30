package com.example.country.Halaman

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.country.R

class ListCountryAdapter(private val listDestination: ArrayList<Country> ): RecyclerView.Adapter<ListCountryAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
//        TODO("Not yet implemented")
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_country, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
//        TODO("Not yet implemented")
        val (name, detail, photo) = listDestination[position]
        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)
        holder.tvName.text = name
        holder.tvDetail.text = detail

        val mContext = holder.itemView.context
        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, Detail::class.java)
            moveDetail.putExtra(Detail.EXTRA_NAME, name)
            moveDetail.putExtra(Detail.EXTRA_DETAIL, detail)
            moveDetail.putExtra(Detail.EXTRA_IMAGE, photo)
            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
//        TODO("Not yet implemented")
        return listDestination.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}