package net.torora.jtam.droidswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import net.torora.jtam.droidswag.Adapters.CategoryAdapter
import net.torora.jtam.droidswag.Model.Category
import net.torora.jtam.droidswag.R
import net.torora.jtam.droidswag.Services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,DataService.categories)
        categoryListView.adapter = adapter
    }
}
