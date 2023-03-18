package com.example.layouttipos

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TableRow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.table_row)
    }
    fun abrirInicio(view : View){
        val intent= Intent(this, MainActivity::class.java).apply {}
        startActivity(intent)
    }
}