package com.kwang0.stickyscrollview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_dummy_recycler.view.*

class DummyRecyclerHolder(private val v: View): RecyclerView.ViewHolder(v) {
    fun bind(item: String) {
        v.dummy_text.text = item
    }
}
