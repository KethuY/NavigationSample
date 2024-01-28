package com.example.sampleapplication.di

import com.example.sampleapplication.landing.FirstViewModel
import com.example.sampleapplication.landing.SecondViewModel
import com.example.sampleapplication.landing.ThirdViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { FirstViewModel() }
    viewModel { SecondViewModel() }
    viewModel { ThirdViewModel() }
}