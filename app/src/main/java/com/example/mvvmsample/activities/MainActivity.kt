package com.example.mvvmsample.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import com.example.mvvmsample.MainActivityViewModel
import com.example.mvvmsample.R

class MainActivity : AppCompatActivity() {
    private val viewModel = MainActivityViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateUIWithViewModelData()

        findViewById<CheckBox>(R.id.checkBox).setOnClickListener {
            viewModel.setRememberMe()
        }

        findViewById<Button>(R.id.button).setOnClickListener {
            viewModel.changeUser()
            updateUIWithViewModelData()
        }
    }

    private fun updateUIWithViewModelData() {
        findViewById<TextView>(R.id.textName).apply {
            text = viewModel.getName()
        }

        findViewById<TextView>(R.id.textAge).apply {
            text = viewModel.getAge()
        }

        findViewById<CheckBox>(R.id.checkBox).apply {
            isChecked = viewModel.getRememberMe()
        }
    }
}