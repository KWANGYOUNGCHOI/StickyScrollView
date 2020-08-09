package com.kwang0.stickyscrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.simpleName.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sticky_scroll_view.run {
            header = header_view
            stickListener = { _ ->
                Log.d(TAG, "stickListener")
            }
            freeListener = { _ ->
                Log.d(TAG, "freeListener")
            }
        }
    }
}
