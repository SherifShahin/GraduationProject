package com.graduationproject.ViewModelFactory

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.graduationproject.ViewModel.DoctorHomeViewModel

class DoctorHomeViewModelFactory (private val application: Application): ViewModelProvider.NewInstanceFactory()
{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return DoctorHomeViewModel(application) as T
    }
}