package com.example.mvvmsample.activities.oneWayBinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mvvmsample.R
import com.example.mvvmsample.databinding.ActivityDataBindingBinding

class DataBindingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDataBindingBinding
    private lateinit var viewModel: DataBindingAndTwoWayDataBindingActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding)
        viewModel = DataBindingAndTwoWayDataBindingActivityViewModel()
        binding.viewmodel = viewModel

        binding.button.setOnClickListener {
            viewModel.changeUser()
        }
    }
}