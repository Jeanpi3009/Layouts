package com.example.layouttipos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun abrirLinearLayoutHorizontal(view : View){
        val intent= Intent(this, LinearLayoutHorizontal::class.java).apply {}
        startActivity(intent)
    }
    fun abrirLinearLayoutVertical(view : View){
        val intent= Intent(this, LinearLayoutVertical::class.java).apply {}
        startActivity(intent)
    }
    fun abrirFrameLayout(view : View){
        val intent= Intent(this, FrameLayout::class.java).apply {}
        startActivity(intent)
    }
    fun abrirTableLayout(view : View){
        val intent= Intent(this, TableLayout::class.java).apply {}
        startActivity(intent)
    }
    fun abrirTableRow(view : View){
        val intent= Intent(this, TableRow::class.java).apply {}
        startActivity(intent)
    }
}