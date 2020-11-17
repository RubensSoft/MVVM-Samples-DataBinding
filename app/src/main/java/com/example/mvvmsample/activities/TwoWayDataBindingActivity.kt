package com.example.mvvmsample.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mvvmsample.R
import com.example.mvvmsample.ViewModel
import com.example.mvvmsample.databinding.ActivityTwoWayDataBindingBinding

class TwoWayDataBindingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityTwoWayDataBindingBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_two_way_data_binding
        )

        binding.viewmodel = ViewModel()
    }
}