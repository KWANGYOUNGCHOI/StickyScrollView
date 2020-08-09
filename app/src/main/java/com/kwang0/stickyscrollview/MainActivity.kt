package com.kwang0.stickyscrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.simpleName.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = DummyRecyclerAdapter(arrayListOf("1", "2", "3", "4", "5", "6", "7"))
        recycler_view.apply {
            this.adapter = adapter
            this.isNestedScrollingEnabled = false
        }

        sticky_scroll_view.also {
            it.header = header_view
            it.stickListener = { _ ->
                Log.d(TAG, "stickListener")
            }
            it.freeListener = { _ ->
                Log.d(TAG, "freeListener")
            }
        }
    }
}
