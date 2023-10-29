package com.example.amangeldi_abdibaitov_mo3_hw_six

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

private lateinit var recyclerView: RecyclerView
private lateinit var dataList: ArrayList<DataClass>
lateinit var imageList: Array<Int>
lateinit var titleList: Array<String>

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageList = arrayOf(
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground
        )
        titleList = arrayOf(
            "ListView",
            "CheckBox"
        )
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager =LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf<DataClass>()
        getData()
    }

    private fun getData() {
        for (i in imageList.indices) {
            val dataClass = DataClass(imageList[i], titleList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = AdapterClass(dataList)
    }
}