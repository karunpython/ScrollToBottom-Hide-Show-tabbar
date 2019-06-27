package com.market.myrecyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_mains.*
import java.util.*
import android.support.v7.widget.LinearSmoothScroller
import android.support.v7.widget.RecyclerView



class MainActivity : AppCompatActivity() {
    private lateinit var mLangAdapter: MyAdapter
    private var list = getLanData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mains)
        setupViews()


        button.setOnClickListener {
            recyclerView.smoothSnapToPosition(4)
        }
    }

    private fun RecyclerView.smoothSnapToPosition(position: Int, snapMode: Int = LinearSmoothScroller.SNAP_TO_START) {
        val smoothScroller = object: LinearSmoothScroller(this.context) {
            override fun getVerticalSnapPreference(): Int {
                return snapMode
            }

            override fun getHorizontalSnapPreference(): Int {
                return snapMode
            }
        }
        smoothScroller.targetPosition = position
        layoutManager?.startSmoothScroll(smoothScroller)
    }

    private fun setupViews() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        mLangAdapter = MyAdapter(list)
        recyclerView.adapter = mLangAdapter
    }



    private fun getLanData(): ArrayList<Model> {
        val listData = ArrayList<Model>()
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.aa))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.ak))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.aa))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.m2))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.ak))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.m4))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.veg))
        listData.add(Model(R.drawable.m3))
        listData.add(Model(R.drawable.ak))
        return listData
    }
}
