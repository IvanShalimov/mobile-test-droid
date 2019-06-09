package com.example.testapplication.first_screen.list

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testapplication.R
import kotlinx.android.synthetic.main.list_item.view.*

class ListAdapter : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    var items: List<String> = listOf()

    fun updateList(items: List<String>) {
        this.items = items
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ListViewHolder {
        return ListViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.list_item, p0, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: ListViewHolder, p1: Int) {
        p0.drawView(p1)
    }

    inner class ListViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        fun drawView(position:Int){
            view.label.text = items[position]
        }
    }
}