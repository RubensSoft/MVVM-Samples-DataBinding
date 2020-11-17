//package com.example.mvvmsample.activities
//
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import androidx.databinding.DataBindingUtil
//import com.example.mvvmsample.R
//import com.example.mvvmsample.ViewModelWithBaseObservable
//import com.example.mvvmsample.databinding.ActivityTwoWayDataBindingWithBaseObservableBinding
//
//class TwoWayDataBindingWithBaseObservableActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        val binding: ActivityTwoWayDataBindingWithBaseObservableBinding = DataBindingUtil.setContentView(
//            this, R.layout.activity_two_way_data_binding_with_base_observable
//        )
//
//        binding.viewmodel = ViewModelWithBaseObservable()
//    }
//}