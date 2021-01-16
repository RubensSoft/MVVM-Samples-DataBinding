package com.example.mvvmsample.activities.twoWayDataBindingBaseObservable

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mvvmsample.R
import com.example.mvvmsample.databinding.ActivityTwoWayDataBindingWithBaseObservableBinding

class TwoWayDataBindingWithBaseObservableActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTwoWayDataBindingWithBaseObservableBinding
    private lateinit var viewModel: ViewModelWithBaseObservable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_two_way_data_binding_with_base_observable)
        viewModel =
            ViewModelWithBaseObservable()

        binding.viewModel = viewModel

        binding.button.setOnClickListener {
            viewModel.changeRememberMe()
        }
    }
}