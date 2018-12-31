 package com.example.omaralsaedi.store.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.omaralsaedi.store.Adapter.CategoryAdapter
import com.example.omaralsaedi.store.Model.Category
import com.example.omaralsaedi.store.R
import com.example.omaralsaedi.store.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)

        categoryListView.adapter = adapter
    }
}
