package com.android.orc.mynoteapp.holder

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.android.orc.mynoteapp.R
import com.android.orc.mynoteapp.model.Note

/**
 * Created by j.poobest on 15/2/2018 AD.
 */
class NoteViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    val noteTitle = itemView?.findViewById<TextView>(R.id.tv_title)
    val noteDescription = itemView?.findViewById<TextView>(R.id.tv_description)


    fun bindNote(note: Note ){

        noteTitle?.text = note.titles
        noteDescription?.text = note.description
    }
}