package com.android.orc.mynoteapp.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.android.orc.mynoteapp.R
import com.android.orc.mynoteapp.holder.NoteViewHolder
import com.android.orc.mynoteapp.model.Note

/**
 * Created by j.poobest on 15/2/2018 AD.
 */
class NoteListAdapter( val note: List<Note>) : RecyclerView.Adapter<NoteViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): NoteViewHolder {
        val view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.page_item, parent, false)
        return NoteViewHolder(view)

    }

    override fun getItemCount(): Int {
        return note.count()
    }

    override fun onBindViewHolder(holder: NoteViewHolder?, position: Int) {
        holder?.bindNote(note[position])
    }
}