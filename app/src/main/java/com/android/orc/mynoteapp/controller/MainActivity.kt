package com.android.orc.mynoteapp.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.android.orc.mynoteapp.R
import com.android.orc.mynoteapp.adapter.NoteListAdapter
import com.android.orc.mynoteapp.dataservice.DataService
import com.android.orc.mynoteapp.model.Note
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var adapter: NoteListAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        adapter = NoteListAdapter(DataService.stories)
        recyclerView = findViewById(R.id.recycler_view_list)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = adapter

    }
}
