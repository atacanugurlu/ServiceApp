package com.example.serviceapp.ui.authentication.teacher

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.serviceapp.R
import com.example.serviceapp.databinding.LoginFragmentBinding
import com.example.serviceapp.databinding.TeacherMainFragmentBinding
import com.example.serviceapp.ui.authentication.login.LoginViewModel
import javax.inject.Inject

class TeacherMainFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: TeacherMainViewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[TeacherMainViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = TeacherMainFragmentBinding.inflate(inflater)


        return binding.root
    }
}