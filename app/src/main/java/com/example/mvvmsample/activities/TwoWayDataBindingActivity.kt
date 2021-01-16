package com.example.mvvmsample.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mvvmsample.DataBindingAndTwoWayDataBindingActivityViewModel
import com.example.mvvmsample.R
import com.example.mvvmsample.databinding.ActivityTwoWayDataBindingBinding

class TwoWayDataBindingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTwoWayDataBindingBinding
    private lateinit var viewModel: DataBindingAndTwoWayDataBindingActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_two_way_data_binding)
        viewModel = DataBindingAndTwoWayDataBindingActivityViewModel()

        binding.viewModel = viewModel

        binding.button.setOnClickListener {
            viewModel.setRememberMe()
        }

        binding.checkBox.setOnClickListener {
            viewModel.setRememberMe()
        }
    }
}