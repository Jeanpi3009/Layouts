package com.example.layouttipos

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TableLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.table_layout)
    }
    fun abrirInicio(view : View){
        val intent= Intent(this, MainActivity::class.java).apply {}
        startActivity(intent)
    }
}