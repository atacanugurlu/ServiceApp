package com.example.serviceapp.ui.authentication.driver

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.serviceapp.R
import com.example.serviceapp.databinding.DriverMainFragmentBinding
import com.example.serviceapp.ui.authentication.parent.ParentMainViewModel
import javax.inject.Inject

class DriverMainFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: DriverMainViewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[DriverMainViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DriverMainFragmentBinding.inflate(inflater)


        return binding.root
    }

}