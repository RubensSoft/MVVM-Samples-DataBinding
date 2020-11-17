package com.example.mvvmsample.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mvvmsample.R
import com.example.mvvmsample.ViewModel

class MainActivity : AppCompatActivity() {
    private val viewModel = ViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.textName).apply {
            text = viewModel.getName()
        }

        findViewById<TextView>(R.id.textAge).apply {
            text = viewModel.getAge()
        }
    }
}