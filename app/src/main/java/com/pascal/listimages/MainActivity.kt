package com.pascal.listimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //data
        val p1 = Product("Computer", 34000.0, 15, R.drawable.img1)
        val p2 = Product("Dog", 10000.0, 7, R.drawable.img2)
        val p3 = Product("Phone", 20000.0, 39, R.drawable.img3)
        val p4 = Product("Dispenser", 126000.0, 5, R.drawable.img4)
        val p5 = Product("Book", 4000.0, 10, R.drawable.img5)
        val p6 = Product("Chair", 5000.0, 23, R.drawable.img6)
        val p7 = Product("Camera", 11000.0, 5, R.drawable.img7)
        val p8 = Product("Padlock", 2000.0, 35, R.drawable.img8)
        val p9 = Product("Curtain", 12.0, 34, R.drawable.img9)
        val p10 = Product("Headphone", 2340.0, 3, R.drawable.img10)

        val products = arrayListOf<Product>(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)

        val productsRecyclerView:RecyclerView=findViewById(R.id.recyclerViewProducts)
        productsRecyclerView.layoutManager=LinearLayoutManager(this)

        val adapter= CustomAdapter(products)
        productsRecyclerView.adapter=adapter
    }
}