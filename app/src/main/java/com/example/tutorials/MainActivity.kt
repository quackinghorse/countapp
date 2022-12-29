package com.example.tutorials

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
var count=0
btncount.setOnClickListener{
count++
    tvcount.text="tap button to count: $count"
}
        btnreset.setOnClickListener {
            count=0
            tvcount.text="tap button to count :$count"
            if (count==0)
            {
                tvcount.text="tap button to count :$count"
            }
        }


    }
}


