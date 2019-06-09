package com.example.testapplication.first_screen


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.*
import com.example.testapplication.first_screen.list.ListAdapter
import android.support.v7.widget.SearchView


class FirstScreenFragment : Fragment() {

    lateinit var toolbar: Toolbar
    lateinit var adapter:ListAdapter
    lateinit var root:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(com.example.testapplication.R.layout.first_screen_layout, container, false)
        toolbar = root.findViewById(com.example.testapplication.R.id.toolbar)
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        adapter = ListAdapter()
        root.findViewById<RecyclerView>(com.example.testapplication.R.id.list).layoutManager = LinearLayoutManager(activity as Context)
        root.findViewById<RecyclerView>(com.example.testapplication.R.id.list).adapter = adapter
        adapter.updateList(resources.getStringArray(com.example.testapplication.R.array.months_array).toList())
        return root
    }



    companion object {
        fun newInstance(): Fragment {
            return FirstScreenFragment()
        }
    }
}
