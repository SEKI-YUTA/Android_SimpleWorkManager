package com.example.simpleworkmanager

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.simpleworkmanager.data.DemoRepository
import com.example.simpleworkmanager.data.DemoRepository_Impl

class MainViewModel(private val demoRepository: DemoRepository): ViewModel() {
    fun demoFunc() {
        demoRepository.demoFunc()
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val demoRepository = (this[APPLICATION_KEY] as DemoApplication).container.demoRepository
                MainViewModel(demoRepository = demoRepository)
            }
        }
    }
}