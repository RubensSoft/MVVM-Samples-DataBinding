package com.example.mvvmsample.activities.liveData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.mvvmsample.R
import com.example.mvvmsample.databinding.ActivityTwoWayLiveDataBinding

class TwoWayLiveDataActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTwoWayLiveDataBinding
    private lateinit var viewModel: TwoWayLiveDataActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_two_way_live_data)
        viewModel =
            TwoWayLiveDataActivityViewModel()

        binding.viewModel = viewModel

        viewModel.getUserLiveData().observe(this, Observer {
            binding.viewModel = viewModel
        })

        binding.button.setOnClickListener {
            viewModel.changeUser()
        }
    }
}