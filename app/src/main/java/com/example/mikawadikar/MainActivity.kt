package com.example.mikawadikar


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mikawadikar.Adapter.MenuAdapter
import com.example.mikawadikar.Model.MenuHome
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = GridLayoutManager(this,2)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        rv_home.layoutManager = layoutManager

        val adapter = MenuAdapter(this, MenuHome.menu)
        rv_home.adapter = adapter
    }
}