package com.example.serviceapp.ui.authentication.parent

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.serviceapp.R
import com.example.serviceapp.databinding.ParentMainFragmentBinding
import com.example.serviceapp.ui.authentication.teacher.TeacherMainViewModel
import javax.inject.Inject

class ParentMainFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: ParentMainViewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[ParentMainViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = ParentMainFragmentBinding.inflate(inflater)


        return binding.root
    }

}